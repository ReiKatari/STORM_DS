package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public static final cc.c[] f4035a = new cc.c[0];

    /* renamed from: b */
    public static final a0.c f4036b = new a0.c("NULL", 1);

    /* renamed from: c */
    public static final a0.c f4037c = new a0.c("UNINITIALIZED", 1);

    /* renamed from: d */
    public static final a0.c f4038d = new a0.c("DONE", 1);

    public static final Object a(cc.c cVar, cd.i iVar, mc.a aVar, mc.q qVar, cd.h[] hVarArr) {
        p pVar = new p(null, iVar, aVar, qVar, hVarArr);
        r rVar = new r(cVar.g(), cVar, 0);
        Object W = a.a.W(rVar, true, rVar, pVar);
        if (W == dc.a.COROUTINE_SUSPENDED) {
            return W;
        }
        return yb.y.f14813a;
    }

    public static /* synthetic */ cd.h b(s sVar, cc.g gVar, int i2, bd.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            gVar = cc.h.A;
        }
        if ((i10 & 2) != 0) {
            i2 = -3;
        }
        if ((i10 & 4) != 0) {
            aVar = bd.a.SUSPEND;
        }
        return sVar.b(gVar, i2, aVar);
    }

    public static final Object c(cc.g gVar, Object obj, Object obj2, mc.p pVar, cc.c cVar) {
        Object j2;
        Object n10 = ed.b.n(gVar, obj2);
        try {
            z zVar = new z(cVar, gVar);
            if (pVar == null) {
                j2 = pc.a.Q(pVar, obj, zVar);
            } else {
                nc.w.b(2, pVar);
                j2 = pVar.j(obj, zVar);
            }
            ed.b.g(gVar, n10);
            if (j2 == dc.a.COROUTINE_SUSPENDED) {
                cVar.getClass();
            }
            return j2;
        } catch (Throwable th2) {
            ed.b.g(gVar, n10);
            throw th2;
        }
    }
}
