package com.nworkzdev.codelens.plugin.toolwindow;

import com.esotericsoftware.kryo.kryo5.minlog.Log;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.components.JBLabel;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.jcef.JBCefApp;
import com.intellij.ui.jcef.JBCefBrowser;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class CodeLensToolWindowFactory implements ToolWindowFactory {

    private static final Logger LOG = Logger.getInstance(CodeLensToolWindowFactory.class);
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        Log.info("Creating CodeLens tool window content");

        JComponent windowContent;

        if (!JBCefApp.isSupported()){
            Log.warn("JCEF runtime is not available. Displaying fallback content.");

            windowContent = new JBLabel("JCEF Browser is not supported.", SwingConstants.CENTER);
        } else{
            Log.info("JCEF runtime is avaiable. Creating JBCefBrowser.");

            try {
                JBCefBrowser jbCefBrowser = new JBCefBrowser();

                windowContent = jbCefBrowser.getComponent();

                jbCefBrowser.loadURL("https://www.google.com");

            }catch (Exception e){
                Log.error("Error creating JBCefBrowser", e);
                windowContent = new JBLabel("Error creating JBCefBrowser", SwingConstants.CENTER);
            }
        }

        JPanel contentPanel = new JPanel(new BorderLayout()); // Use BorderLayout
        contentPanel.add(windowContent, BorderLayout.CENTER); // Add component to the center

        ContentFactory contentFactory = ContentFactory.getInstance();
        Content content = contentFactory.createContent(contentPanel, "", false);

        toolWindow.getContentManager().addContent(content);
        LOG.info("CodeLens tool window content created successfully.");
    }

    @Override
    public boolean shouldBeAvailable(@NotNull Project project) {
        return true;
    }

    @Override
    public void init(@NotNull ToolWindow toolWindow) {
        LOG.info("Initializing CodeLens tool window");
    }
}
