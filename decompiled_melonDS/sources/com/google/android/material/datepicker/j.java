package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j7.f1;
import j7.j1;
import j7.r0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3034a = 1;

    public j(m mVar) {
        x.c(null);
        x.c(null);
    }

    public static int d(View view, RecyclerView recyclerView) {
        int width;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        int i10 = 0;
        if (view.getWidth() == 0) {
            view.measure(0, 0);
            width = view.getMeasuredWidth();
        } else {
            width = view.getWidth();
        }
        int width2 = recyclerView.getWidth() - width;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.leftMargin;
        } else {
            i2 = 0;
        }
        int i11 = width2 - i2;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams2 != null) {
            i10 = marginLayoutParams2.rightMargin;
        }
        return (i11 - i10) / 2;
    }

    @Override // j7.r0
    public void a(Rect rect, View view, RecyclerView recyclerView, f1 f1Var) {
        RecyclerView recyclerView2;
        switch (this.f3034a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                rect.getClass();
                view.getClass();
                f1Var.getClass();
                super.a(rect, view, recyclerView, f1Var);
                j1 M = RecyclerView.M(view);
                int i2 = -1;
                if (M != null && (recyclerView2 = M.f7610r) != null) {
                    i2 = recyclerView2.J(M);
                }
                if (i2 == 0) {
                    rect.right = d(view, recyclerView);
                    return;
                } else if (i2 == f1Var.b() - 1) {
                    rect.left = d(view, recyclerView);
                    return;
                } else {
                    return;
                }
            default:
                super.a(rect, view, recyclerView, f1Var);
                return;
        }
    }

    @Override // j7.r0
    public void b(Canvas canvas, RecyclerView recyclerView) {
        switch (this.f3034a) {
            case 0:
                if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    z zVar = (z) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ j() {
    }
}
