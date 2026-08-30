package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements cd.h {
    public final /* synthetic */ cd.h A;
    public final /* synthetic */ k7.t B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ mc.l R;

    public j(cd.h hVar, k7.t tVar, boolean z10, mc.l lVar) {
        this.A = hVar;
        this.B = tVar;
        this.L = z10;
        this.R = lVar;
    }

    @Override // cd.h
    public final Object c(cd.i iVar, cc.c cVar) {
        Object c4 = this.A.c(new i(iVar, this.B, this.L, this.R), cVar);
        if (c4 == dc.a.COROUTINE_SUSPENDED) {
            return c4;
        }
        return yb.y.f14813a;
    }
}
