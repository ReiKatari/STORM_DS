package f7;

import cd.q1;
import d.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public b9.e f4936a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4937b;

    public final void a() {
        b9.e eVar = this.f4936a;
        if (eVar != null) {
            if (!this.f4937b) {
                eVar.p(this, null);
            }
            g gVar = (g) eVar.L;
            ah.e eVar2 = (ah.e) eVar.B;
            gVar.getClass();
            if (equals(gVar.f4945h) && -1 == gVar.f4944g) {
                d dVar = gVar.f4943f;
                if (dVar == null) {
                    dVar = gVar.c(-1);
                }
                gVar.f4943f = null;
                gVar.f4944g = 0;
                gVar.f4945h = null;
                if (dVar == null) {
                    ((a0) eVar2.B).f3285a.run();
                } else {
                    dVar.b();
                }
                q1 q1Var = gVar.f4938a;
                q1Var.getClass();
                q1Var.k(null, h.f4951e);
            }
            this.f4937b = false;
            return;
        }
        a0.j.p("This input is not added to any dispatcher.");
    }

    public void b(boolean z10) {
    }
}
