package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public c f11206a;

    /* renamed from: b  reason: collision with root package name */
    public zc.m f11207b;

    @Override // a4.j1
    public final b3.o e() {
        return new c(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final /* bridge */ /* synthetic */ void g(b3.o oVar) {
        c cVar = (c) oVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [zc.m, zc.f1] */
    public final Object h(ec.c cVar) {
        zc.m mVar = this.f11207b;
        zc.m mVar2 = mVar;
        if (mVar == null) {
            ?? f1Var = new zc.f1(true);
            f1Var.S(null);
            this.f11207b = f1Var;
            c cVar2 = this.f11206a;
            mVar2 = f1Var;
            if (cVar2 != null) {
                mVar2 = f1Var;
                if (cVar2.f1777h0) {
                    cVar2.O0();
                    mVar2 = f1Var;
                }
            }
        }
        Object r5 = mVar2.r(cVar);
        if (r5 == dc.a.COROUTINE_SUSPENDED) {
            return r5;
        }
        return yb.y.f14813a;
    }

    public final int hashCode() {
        return 234;
    }
}
