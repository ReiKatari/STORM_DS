package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 implements cd.h {
    public final /* synthetic */ int A;
    public final /* synthetic */ m7.j B;

    public /* synthetic */ o1(m7.j jVar, int i2) {
        this.A = i2;
        this.B = jVar;
    }

    @Override // cd.h
    public final Object c(cd.i iVar, cc.c cVar) {
        switch (this.A) {
            case 0:
                Object c4 = this.B.c(new a9.h(iVar, 16), cVar);
                if (c4 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c4;
            default:
                Object c10 = this.B.c(new a9.h(iVar, 24), cVar);
                if (c10 != dc.a.COROUTINE_SUSPENDED) {
                    return yb.y.f14813a;
                }
                return c10;
        }
    }
}
