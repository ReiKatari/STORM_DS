package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cg5  reason: default package */
/* loaded from: classes.dex */
public abstract class cg5 {
    public uf5 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(wg5 wg5Var) {
        RecyclerView recyclerView;
        int i = wg5Var.j;
        if (!wg5Var.f() && (i & 4) == 0 && (recyclerView = wg5Var.r) != null) {
            recyclerView.K(wg5Var);
        }
    }

    public abstract boolean a(wg5 wg5Var, wg5 wg5Var2, dy7 dy7Var, dy7 dy7Var2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(wg5 wg5Var) {
        uf5 uf5Var = this.a;
        if (uf5Var != null) {
            RecyclerView recyclerView = uf5Var.A;
            boolean z = true;
            wg5Var.n(true);
            View view = wg5Var.a;
            if (wg5Var.h != null && wg5Var.i == null) {
                wg5Var.h = null;
            }
            wg5Var.i = null;
            if ((wg5Var.j & 16) == 0) {
                mg5 mg5Var = recyclerView.L;
                recyclerView.l0();
                dk0 dk0Var = recyclerView.e0;
                kk kkVar = (kk) dk0Var.X;
                uf5 uf5Var2 = (uf5) dk0Var.R;
                int i = dk0Var.L;
                if (i == 1) {
                    if (((View) dk0Var.Y) != view) {
                        i.m("Cannot call removeViewIfHidden within removeView(At) for a different view");
                        return;
                    }
                } else if (i != 2) {
                    try {
                        dk0Var.L = 2;
                        int indexOfChild = uf5Var2.A.indexOfChild(view);
                        if (indexOfChild == -1) {
                            dk0Var.z(view);
                        } else if (kkVar.d(indexOfChild)) {
                            kkVar.h(indexOfChild);
                            dk0Var.z(view);
                            uf5Var2.j(indexOfChild);
                        }
                        if (z) {
                            wg5 N = RecyclerView.N(view);
                            mg5Var.p(N);
                            mg5Var.m(N);
                            if (RecyclerView.z1) {
                                Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                            }
                        }
                        recyclerView.n0(!z);
                        if (z && wg5Var.j()) {
                            recyclerView.removeDetachedView(view, false);
                            return;
                        }
                    } finally {
                        dk0Var.L = 0;
                    }
                } else {
                    i.m("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                z = false;
                if (z) {
                }
                recyclerView.n0(!z);
                if (z) {
                }
            }
        }
    }

    public abstract void d(wg5 wg5Var);

    public abstract void e();

    public abstract boolean f();
}
