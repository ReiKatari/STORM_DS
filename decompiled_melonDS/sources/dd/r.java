package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends ed.q {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(cc.g gVar, cc.c cVar, int i2) {
        super(cVar, gVar);
        this.X = i2;
    }

    @Override // zc.f1
    public final boolean C(Throwable th2) {
        switch (this.X) {
            case 0:
                if (th2 instanceof m) {
                    return true;
                }
                return u(th2);
            default:
                return false;
        }
    }
}
