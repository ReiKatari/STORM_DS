package a6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i10) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i10);
    }
}
