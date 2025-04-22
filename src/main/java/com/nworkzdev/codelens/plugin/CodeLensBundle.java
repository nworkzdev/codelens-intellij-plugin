package com.nworkzdev.codelens.plugin;

import com.intellij.DynamicBundle;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.PropertyKey;

import java.util.function.Supplier;

/**
 * Handles retrieving localized strings from the resource bundle.
 */
public final class CodeLensBundle extends DynamicBundle {

    @NonNls
    private static final String BUNDLE_NAME = "messages.CodeLensBundle"; // Base name of the bundle file

    private static final CodeLensBundle INSTANCE = new CodeLensBundle();

    // Private constructor to ensure singleton pattern
    private CodeLensBundle() {
        super(BUNDLE_NAME);
    }

    public static String message(@PropertyKey(resourceBundle = BUNDLE_NAME) String key, Object... params) {
        // DynamicBundle.getMessage is an instance method, so we call it on our singleton INSTANCE
        return INSTANCE.getMessage(key, params);
    }

    public static Supplier<String> messagePointer(@PropertyKey(resourceBundle = BUNDLE_NAME) String key, Object... params) {
        // DynamicBundle.getLazyMessage is an instance method, so we call it on our singleton INSTANCE
        return INSTANCE.getLazyMessage(key, params);
    }
}