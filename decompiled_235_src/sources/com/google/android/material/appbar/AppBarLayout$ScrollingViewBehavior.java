package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends cp7 {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.x);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void w(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
        }
    }

    @Override // defpackage.e51
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int q;
        if (((h51) view2.getLayoutParams()).a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.b;
            if (i == 0) {
                q = 0;
            } else {
                q = ej2.q((int) (RecyclerView.B1 * i), 0, i);
            }
            int i2 = bottom - q;
            WeakHashMap weakHashMap = ao7.a;
            view.offsetTopAndBottom(i2);
        }
        return false;
    }

    @Override // defpackage.e51
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 == -1 || i4 == -2) {
            w(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // defpackage.e51
    public final void p(CoordinatorLayout coordinatorLayout, View view) {
        w(coordinatorLayout.j(view));
    }

    @Override // defpackage.cp7
    public final void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    @Override // defpackage.e51
    public final void f(View view) {
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }
}
