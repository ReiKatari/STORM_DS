package com.google.mlkit.vision.text;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface TextRecognizerOptionsInterface {
    public static final int CREDIT_CARD = 6;
    public static final int DOCUMENT = 7;
    public static final int LATIN = 1;
    public static final int LATIN_AND_CHINESE = 2;
    public static final int LATIN_AND_DEVANAGARI = 3;
    public static final int LATIN_AND_JAPANESE = 4;
    public static final int LATIN_AND_KOREAN = 5;
    public static final int PIXEL_AI = 8;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface LanguageOption {
    }

    String getConfigLabel();

    Executor getExecutor();

    boolean getIsThickClient();

    String getLanguageHint();

    int getLoggingEventId();

    int getLoggingLanguageOption();

    String getLoggingLibraryName();

    String getLoggingLibraryNameForOptionalModule();

    String getModuleId();
}
