package bd;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d extends nc.i implements mc.q {

    /* renamed from: b0  reason: collision with root package name */
    public static final d f2163b0 = new nc.i(3, h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        p pVar;
        h hVar = (h) obj;
        hd.e eVar = (hd.e) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.B;
        hVar.getClass();
        p pVar2 = (p) h.Z.get(hVar);
        while (true) {
            if (hVar.x()) {
                eVar.X = j.f2180l;
                break;
            }
            long andIncrement = h.L.getAndIncrement(hVar);
            long j2 = j.f2170b;
            long j10 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (pVar2.L != j10) {
                p q10 = hVar.q(j10, pVar2);
                if (q10 == null) {
                    continue;
                } else {
                    pVar = q10;
                }
            } else {
                pVar = pVar2;
            }
            Object I = hVar.I(pVar, i2, andIncrement, eVar);
            p pVar3 = pVar;
            if (I == j.m) {
                if (eVar == null) {
                    eVar = null;
                }
                if (eVar != null) {
                    eVar.L = pVar3;
                    eVar.R = i2;
                }
            } else if (I == j.f2182o) {
                if (andIncrement < hVar.u()) {
                    pVar3.b();
                }
                pVar2 = pVar3;
            } else if (I != j.f2181n) {
                pVar3.b();
                eVar.X = I;
            } else {
                a0.j.p("unexpected");
                return null;
            }
        }
        return yb.y.f14813a;
    }
}
