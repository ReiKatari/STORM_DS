package j7;

import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f7569a;

    /* renamed from: b  reason: collision with root package name */
    public final m1 f7570b = new m1(this);

    /* renamed from: c  reason: collision with root package name */
    public d0 f7571c;

    /* renamed from: d  reason: collision with root package name */
    public d0 f7572d;

    public static int b(View view, e0 e0Var) {
        return ((e0Var.e(view) / 2) + e0Var.g(view)) - ((e0Var.n() / 2) + e0Var.m());
    }

    public static View c(u0 u0Var, e0 e0Var) {
        int v10 = u0Var.v();
        View view = null;
        if (v10 == 0) {
            return null;
        }
        int n10 = (e0Var.n() / 2) + e0Var.m();
        int i2 = Preference.DEFAULT_ORDER;
        for (int i10 = 0; i10 < v10; i10++) {
            View u4 = u0Var.u(i10);
            int abs = Math.abs(((e0Var.e(u4) / 2) + e0Var.g(u4)) - n10);
            if (abs < i2) {
                view = u4;
                i2 = abs;
            }
        }
        return view;
    }

    public final int[] a(u0 u0Var, View view) {
        int[] iArr = new int[2];
        if (u0Var.d()) {
            iArr[0] = b(view, d(u0Var));
        } else {
            iArr[0] = 0;
        }
        if (u0Var.e()) {
            iArr[1] = b(view, e(u0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final e0 d(u0 u0Var) {
        d0 d0Var = this.f7572d;
        if (d0Var == null || ((u0) d0Var.f7542b) != u0Var) {
            this.f7572d = new d0(u0Var, 0);
        }
        return this.f7572d;
    }

    public final e0 e(u0 u0Var) {
        d0 d0Var = this.f7571c;
        if (d0Var == null || ((u0) d0Var.f7542b) != u0Var) {
            this.f7571c = new d0(u0Var, 1);
        }
        return this.f7571c;
    }

    public final void f() {
        u0 layoutManager;
        View view;
        RecyclerView recyclerView = this.f7569a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a10 = a(layoutManager, view);
                int i2 = a10[0];
                if (i2 == 0 && a10[1] == 0) {
                    return;
                }
                this.f7569a.j0(i2, false, a10[1]);
            }
        }
    }
}
