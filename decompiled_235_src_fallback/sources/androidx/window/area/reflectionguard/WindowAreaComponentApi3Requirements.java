package androidx.window.area.reflectionguard;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> r1);

    void addRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r1);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    android.util.DisplayMetrics getRearDisplayMetrics();

    androidx.window.extensions.area.ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> r1);

    void removeRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r1);

    void startRearDisplayPresentationSession(android.app.Activity r1, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r2);

    void startRearDisplaySession(android.app.Activity r1, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r2);
}
