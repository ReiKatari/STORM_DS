package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements cc.c, ec.d {
    public final cc.c A;
    public final cc.g B;

    public z(cc.c cVar, cc.g gVar) {
        this.A = cVar;
        this.B = gVar;
    }

    @Override // ec.d
    public final ec.d f() {
        cc.c cVar = this.A;
        if (cVar instanceof ec.d) {
            return (ec.d) cVar;
        }
        return null;
    }

    @Override // cc.c
    public final cc.g g() {
        return this.B;
    }

    @Override // cc.c
    public final void h(Object obj) {
        this.A.h(obj);
    }
}
