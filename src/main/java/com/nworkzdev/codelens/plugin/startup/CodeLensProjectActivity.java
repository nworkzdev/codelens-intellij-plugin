package com.nworkzdev.codelens.plugin.startup;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.ProjectActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CodeLensProjectActivity implements ProjectActivity {

    private static final Logger LOG = Logger.getInstance(CodeLensProjectActivity.class);

    @Nullable
    @Override
    public Object execute(@NotNull Project project, @NotNull Continuation<? super Unit> continuation) {
        LOG.info("CodeLensProjectActivity executing for project: " + project.getName());

        return Unit.INSTANCE;
    }
}