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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends bb7 {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.x);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
        }
    }

    @Override // defpackage.w11
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int k;
        if (((z11) view2.getLayoutParams()).a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.b;
            if (i == 0) {
                k = 0;
            } else {
                k = me2.k((int) (RecyclerView.A1 * i), 0, i);
            }
            int i2 = bottom - k;
            WeakHashMap weakHashMap = aa7.a;
            view.offsetTopAndBottom(i2);
        }
        return false;
    }

    @Override // defpackage.w11
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 == -1 || i4 == -2) {
            s(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // defpackage.w11
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // defpackage.bb7
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    @Override // defpackage.w11
    public final void b(View view) {
    }
}
