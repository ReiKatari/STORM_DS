package defpackage;

import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ei4  reason: default package */
/* loaded from: classes.dex */
public final class ei4 extends s65 {
    public RecyclerView a;
    public final fa6 b = new fa6(this);
    public kf4 c;
    public kf4 d;

    public static int b(View view, io1 io1Var) {
        return ((io1Var.e(view) / 2) + io1Var.g(view)) - ((io1Var.n() / 2) + io1Var.m());
    }

    public static View c(q65 q65Var, io1 io1Var) {
        int v = q65Var.v();
        View view = null;
        if (v == 0) {
            return null;
        }
        int n = (io1Var.n() / 2) + io1Var.m();
        int i = Preference.DEFAULT_ORDER;
        for (int i2 = 0; i2 < v; i2++) {
            View u = q65Var.u(i2);
            int abs = Math.abs(((io1Var.e(u) / 2) + io1Var.g(u)) - n);
            if (abs < i) {
                view = u;
                i = abs;
            }
        }
        return view;
    }

    public final int[] a(q65 q65Var, View view) {
        int[] iArr = new int[2];
        if (q65Var.d()) {
            iArr[0] = b(view, d(q65Var));
        } else {
            iArr[0] = 0;
        }
        if (q65Var.e()) {
            iArr[1] = b(view, e(q65Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final io1 d(q65 q65Var) {
        kf4 kf4Var = this.d;
        if (kf4Var == null || ((q65) kf4Var.b) != q65Var) {
            this.d = new kf4(q65Var, 0);
        }
        return this.d;
    }

    public final io1 e(q65 q65Var) {
        kf4 kf4Var = this.c;
        if (kf4Var == null || ((q65) kf4Var.b) != q65Var) {
            this.c = new kf4(q65Var, 1);
        }
        return this.c;
    }

    public final void f() {
        q65 layoutManager;
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
