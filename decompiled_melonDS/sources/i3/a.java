package i3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ BlendMode A() {
        return BlendMode.OVERLAY;
    }

    public static /* bridge */ /* synthetic */ BlendMode B() {
        return BlendMode.DARKEN;
    }

    public static /* bridge */ /* synthetic */ BlendMode C() {
        return BlendMode.LIGHTEN;
    }

    public static /* bridge */ /* synthetic */ BlendMode D() {
        return BlendMode.COLOR_DODGE;
    }

    public static /* bridge */ /* synthetic */ BlendMode b() {
        return BlendMode.DST_OUT;
    }

    public static /* synthetic */ BlendModeColorFilter c(int i2, BlendMode blendMode) {
        return new BlendModeColorFilter(i2, blendMode);
    }

    public static /* synthetic */ void d() {
    }

    public static /* bridge */ /* synthetic */ void e(Canvas canvas) {
        canvas.enableZ();
    }

    public static /* bridge */ /* synthetic */ void f(Paint paint, BlendMode blendMode) {
        paint.setBlendMode(blendMode);
    }

    public static /* bridge */ /* synthetic */ void m(CoordinatorLayout coordinatorLayout, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray) {
        coordinatorLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, R.attr.coordinatorLayoutStyle, 0);
    }

    public static /* bridge */ /* synthetic */ BlendMode o() {
        return BlendMode.SRC_ATOP;
    }

    public static /* bridge */ /* synthetic */ void p(Canvas canvas) {
        canvas.disableZ();
    }

    public static /* bridge */ /* synthetic */ BlendMode t() {
        return BlendMode.XOR;
    }

    public static /* bridge */ /* synthetic */ BlendMode w() {
        return BlendMode.PLUS;
    }

    public static /* bridge */ /* synthetic */ BlendMode y() {
        return BlendMode.MODULATE;
    }

    public static /* bridge */ /* synthetic */ BlendMode z() {
        return BlendMode.SCREEN;
    }
}
