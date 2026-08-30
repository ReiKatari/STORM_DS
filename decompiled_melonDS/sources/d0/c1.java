package d0;

import j0.w1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 extends j0.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3339a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3340b;

    public c1(v0.g gVar) {
        this.f3340b = new WeakReference(gVar);
    }

    @Override // j0.m
    public final void b(int i2, j0.u uVar) {
        switch (this.f3339a) {
            case 0:
                d1 d1Var = (d1) this.f3340b;
                synchronized (d1Var.A) {
                    try {
                        if (!d1Var.X) {
                            d1Var.f3355c0.put(uVar.c(), new n0.c(uVar));
                            d1Var.k();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                v0.g gVar = (v0.g) ((WeakReference) this.f3340b).get();
                if (gVar != null) {
                    Iterator it = gVar.A.iterator();
                    while (it.hasNext()) {
                        w1 w1Var = ((v1) it.next()).f3480n;
                        for (j0.m mVar : w1Var.f7322g.f7277d) {
                            mVar.b(i2, new v0.h(uVar, w1Var.f7322g.f7279f, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    public c1(d1 d1Var) {
        this.f3340b = d1Var;
    }
}
