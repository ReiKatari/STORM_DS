package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hn1  reason: default package */
/* loaded from: classes.dex */
public final class hn1 extends n65 {
    public final /* synthetic */ int a = 0;

    public hn1(wu3 wu3Var) {
        z57.c(null);
        z57.c(null);
    }

    public static int d(View view, RecyclerView recyclerView) {
        int width;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
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
            i = marginLayoutParams.leftMargin;
        } else {
            i = 0;
        }
        int i3 = width2 - i;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams2 != null) {
            i2 = marginLayoutParams2.rightMargin;
        }
        return (i3 - i2) / 2;
    }

    @Override // defpackage.n65
    public void a(Rect rect, View view, RecyclerView recyclerView, c75 c75Var) {
        RecyclerView recyclerView2;
        switch (this.a) {
            case 0:
                rect.getClass();
                view.getClass();
                c75Var.getClass();
                super.a(rect, view, recyclerView, c75Var);
                g75 N = RecyclerView.N(view);
                int i = -1;
                if (N != null && (recyclerView2 = N.r) != null) {
                    i = recyclerView2.K(N);
                }
                if (i == 0) {
                    rect.right = d(view, recyclerView);
                    return;
                } else if (i == c75Var.b() - 1) {
                    rect.left = d(view, recyclerView);
                    return;
                } else {
                    return;
                }
            default:
                super.a(rect, view, recyclerView, c75Var);
                return;
        }
    }

    @Override // defpackage.n65
    public void b(RecyclerView recyclerView) {
        switch (this.a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof mj7) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    mj7 mj7Var = (mj7) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ hn1() {
    }
}
