package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr4  reason: default package */
/* loaded from: classes.dex */
public final class hr4 extends ig5 {
    public RecyclerView a;
    public final ul6 b = new ul6(this);
    public mo4 c;
    public mo4 d;

    public static int b(View view, ts1 ts1Var) {
        return ((ts1Var.e(view) / 2) + ts1Var.g(view)) - ((ts1Var.n() / 2) + ts1Var.m());
    }

    public static View c(gg5 gg5Var, ts1 ts1Var) {
        int v = gg5Var.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int n = (ts1Var.n() / 2) + ts1Var.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < v; i2++) {
            View u = gg5Var.u(i2);
            int abs = Math.abs(((ts1Var.e(u) / 2) + ts1Var.g(u)) - n);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(gg5 gg5Var, View view) {
        int[] iArr = new int[2];
        if (gg5Var.d()) {
            iArr[0] = b(view, d(gg5Var));
        } else {
            iArr[0] = 0;
        }
        if (gg5Var.e()) {
            iArr[1] = b(view, e(gg5Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final ts1 d(gg5 gg5Var) {
        mo4 mo4Var = this.d;
        if (mo4Var == null || ((gg5) mo4Var.b) != gg5Var) {
            this.d = new mo4(gg5Var, 0);
        }
        return this.d;
    }

    public final ts1 e(gg5 gg5Var) {
        mo4 mo4Var = this.c;
        if (mo4Var == null || ((gg5) mo4Var.b) != gg5Var) {
            this.c = new mo4(gg5Var, 1);
        }
        return this.c;
    }

    public final void f() {
        gg5 layoutManager;
        View view;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a = a(layoutManager, view);
                int i = a[0];
                if (i == 0 && a[1] == 0) {
                    return;
                }
                this.a.j0(i, false, a[1]);
            }
        }
    }
}
