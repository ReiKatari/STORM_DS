package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends e {
    public final Object R;

    public l(Iterable iterable, cc.g gVar, int i2, bd.a aVar) {
        super(gVar, i2, aVar);
        this.R = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // dd.e
    public final Object e(bd.v vVar, cc.c cVar) {
        y yVar = new y(vVar);
        for (cd.h hVar : this.R) {
            zc.x.v(vVar, null, null, new a5.o(hVar, yVar, null, 27), 3);
        }
        return yb.y.f14813a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // dd.e
    public final e f(cc.g gVar, int i2, bd.a aVar) {
        return new l(this.R, gVar, i2, aVar);
    }

    @Override // dd.e
    public final bd.l h(zc.u uVar) {
        a5.o oVar = new a5.o(25, null, this);
        bd.a aVar = bd.a.SUSPEND;
        zc.w wVar = zc.w.DEFAULT;
        bd.v vVar = new bd.v(zc.x.w(uVar, this.A), ij.a.s(this.B, 4, aVar));
        wVar.invoke(oVar, vVar, vVar);
        return vVar;
    }
}
