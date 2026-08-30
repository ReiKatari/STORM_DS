package com.google.android.material.appbar;

import a6.x0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k5.d;
import p7.o;
import v9.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b  reason: collision with root package name */
    public final int f2915b;

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13172x);
        this.f2915b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
        }
    }

    @Override // k5.a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int e6;
        if (((d) view2.getLayoutParams()).f7968a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i2 = this.f2915b;
            if (i2 == 0) {
                e6 = 0;
            } else {
                e6 = o.e((int) (0.0f * i2), 0, i2);
            }
            int i10 = bottom - e6;
            WeakHashMap weakHashMap = x0.f533a;
            view.offsetTopAndBottom(i10);
        }
        return false;
    }

    @Override // k5.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i10, int i11) {
        int i12 = view.getLayoutParams().height;
        if (i12 == -1 || i12 == -2) {
            s(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // k5.a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // v9.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    @Override // k5.a
    public final void b(View view) {
    }
}
