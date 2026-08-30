package kb;

import android.content.Context;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import d.k;
import nc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements mb.b {
    public final k A;
    public final k B;
    public volatile rd.c L;
    public final Object R = new Object();

    public f(k kVar) {
        this.A = kVar;
        this.B = kVar;
    }

    public static c1 a(e1 e1Var, Context context) {
        w6.c cVar;
        jb.e eVar = new jb.e(1, context);
        e1Var.getClass();
        d1 viewModelStore = e1Var.getViewModelStore();
        if (e1Var instanceof androidx.lifecycle.k) {
            cVar = ((androidx.lifecycle.k) e1Var).getDefaultViewModelCreationExtras();
        } else {
            cVar = w6.a.f14160b;
        }
        return new c1(viewModelStore, eVar, cVar);
    }

    @Override // mb.b
    public final Object d() {
        if (this.L == null) {
            synchronized (this.R) {
                try {
                    if (this.L == null) {
                        this.L = ((d) a(this.A, this.B).a(u.a(d.class))).f8131b;
                    }
                } finally {
                }
            }
        }
        return this.L;
    }
}
