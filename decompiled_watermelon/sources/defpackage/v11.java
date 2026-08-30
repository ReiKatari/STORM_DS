package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v11  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v11 {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable e(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray) {
        coordinatorLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, R.attr.coordinatorLayoutStyle, 0);
    }

    public static /* bridge */ /* synthetic */ boolean t(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
