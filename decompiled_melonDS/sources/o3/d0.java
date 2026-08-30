package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ e0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i2) {
        super(1);
        this.B = i2;
        this.L = e0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [nc.l, mc.a] */
    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                c0 c0Var = (c0) obj;
                e0 e0Var = this.L;
                e0Var.f10720d = true;
                e0Var.f10722f.b();
                return yb.y.f14813a;
            default:
                k3.d dVar = (k3.d) obj;
                e0 e0Var2 = this.L;
                c cVar = e0Var2.f10718b;
                float f8 = e0Var2.f10727k;
                float f10 = e0Var2.f10728l;
                a4.n E = dVar.E();
                long t5 = E.t();
                E.p().p();
                try {
                    ((d2.t) E.B).E(f8, f10, 0L);
                    cVar.a(dVar);
                    w.d.y(E, t5);
                    return yb.y.f14813a;
                } catch (Throwable th2) {
                    w.d.y(E, t5);
                    throw th2;
                }
        }
    }
}
