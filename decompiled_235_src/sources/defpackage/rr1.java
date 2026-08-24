package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr1  reason: default package */
/* loaded from: classes.dex */
public final class rr1 extends dg5 {
    public final /* synthetic */ int a = 0;

    public rr1(f24 f24Var) {
        uj7.c(null);
        uj7.c(null);
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

    @Override // defpackage.dg5
    public void a(Rect rect, View view, RecyclerView recyclerView, sg5 sg5Var) {
        RecyclerView recyclerView2;
        switch (this.a) {
            case 0:
                rect.getClass();
                view.getClass();
                sg5Var.getClass();
                super.a(rect, view, recyclerView, sg5Var);
                wg5 N = RecyclerView.N(view);
                int i = -1;
                if (N != null && (recyclerView2 = N.r) != null) {
                    i = recyclerView2.K(N);
                }
                if (i == 0) {
                    rect.right = d(view, recyclerView);
                    return;
                } else if (i == sg5Var.b() - 1) {
                    rect.left = d(view, recyclerView);
                    return;
                } else {
                    return;
                }
            default:
                super.a(rect, view, recyclerView, sg5Var);
                return;
        }
    }

    @Override // defpackage.dg5
    public void b(RecyclerView recyclerView) {
        switch (this.a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof hy7) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    hy7 hy7Var = (hy7) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ rr1() {
    }
}
