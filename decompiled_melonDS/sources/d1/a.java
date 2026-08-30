package d1;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ec.j implements mc.l {
    public k X;
    public nc.p Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ c f3506b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f3507c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ h1 f3508d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ long f3509e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ mc.l f3510f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Object obj, h1 h1Var, long j2, mc.l lVar, cc.c cVar2) {
        super(1, cVar2);
        this.f3506b0 = cVar;
        this.f3507c0 = obj;
        this.f3508d0 = h1Var;
        this.f3509e0 = j2;
        this.f3510f0 = lVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        long j2 = this.f3509e0;
        mc.l lVar = this.f3510f0;
        return new a(this.f3506b0, this.f3507c0, this.f3508d0, j2, lVar, (cc.c) obj).v(yb.y.f14813a);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [nc.p, java.lang.Object] */
    @Override // ec.a
    public final Object v(Object obj) {
        k kVar;
        nc.p pVar;
        g gVar;
        h1 h1Var = this.f3508d0;
        c cVar = this.f3506b0;
        k kVar2 = cVar.f3525c;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.Z;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    pVar = this.Y;
                    kVar = this.X;
                    p7.j.I(obj);
                } else {
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                p7.j.I(obj);
                kVar2.L = (p) cVar.f3523a.f3690a.k(this.f3507c0);
                cVar.f3527e.setValue(h1Var.f3577c);
                cVar.f3526d.setValue(Boolean.TRUE);
                k kVar3 = new k(kVar2.A, kVar2.B.getValue(), d.k(kVar2.L), kVar2.R, Long.MIN_VALUE, kVar2.Y);
                ?? obj2 = new Object();
                long j2 = this.f3509e0;
                ai.x0 x0Var = new ai.x0((Object) cVar, (Object) kVar3, this.f3510f0, (Object) obj2, 1);
                this.X = kVar3;
                this.Y = obj2;
                this.Z = 1;
                if (d.d(kVar3, h1Var, j2, x0Var, this) == aVar) {
                    return aVar;
                }
                kVar = kVar3;
                pVar = obj2;
            }
            if (pVar.A) {
                gVar = g.BoundReached;
            } else {
                gVar = g.Finished;
            }
            c.b(cVar);
            return new h(kVar, gVar);
        } catch (CancellationException e6) {
            c.b(cVar);
            throw e6;
        }
    }
}
