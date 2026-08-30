package h1;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ec.j implements mc.p {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ j Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ f3 f5911b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ d f5912c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ long f5913d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, f3 f3Var, d dVar, long j2, cc.c cVar) {
        super(2, cVar);
        this.Z = jVar;
        this.f5911b0 = f3Var;
        this.f5912c0 = dVar;
        this.f5913d0 = j2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((i) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        i iVar = new i(this.Z, this.f5911b0, this.f5912c0, this.f5913d0, cVar);
        iVar.Y = obj;
        return iVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        j jVar = this.Z;
        a aVar = jVar.f5919n0;
        dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.X;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    zc.y0 o5 = zc.x.o(((zc.u) this.Y).v());
                    jVar.f5921q0 = true;
                    p2 p2Var = jVar.f5915j0;
                    f1.f1 f1Var = f1.f1.Default;
                    f2.y0 y0Var = new f2.y0(this.f5911b0, jVar, this.f5912c0, this.f5913d0, o5, null);
                    this.X = 1;
                    if (p2Var.f(f1Var, y0Var, this) == aVar2) {
                        return aVar2;
                    }
                }
                aVar.b();
                jVar.f5921q0 = false;
                aVar.a(null);
                jVar.f5920o0 = false;
                return yb.y.f14813a;
            } catch (CancellationException e6) {
                throw e6;
            }
        } catch (Throwable th2) {
            jVar.f5921q0 = false;
            aVar.a(null);
            jVar.f5920o0 = false;
            throw th2;
        }
    }
}
