package q;

import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i2, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i10, i11, i12);
    }

    public static void c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
