package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ks  reason: default package */
/* loaded from: classes.dex */
public abstract class ks {
    public static int a(android.widget.TextView r0) {
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
    }

    public static void b(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
            r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
            return
    }

    public static void c(android.widget.TextView r0, int[] r1, int r2) {
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
            return
    }

    public static boolean d(android.widget.TextView r0, java.lang.String r1) {
            boolean r0 = r0.setFontVariationSettings(r1)
            return r0
    }
}
