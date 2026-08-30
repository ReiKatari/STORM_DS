package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public h1 Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f814b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ h1 f815c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ oe.j0 f816d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(h1 h1Var, oe.j0 j0Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f815c0 = h1Var;
        this.f816d0 = j0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((w0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((w0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new w0(this.f815c0, this.f816d0, cVar, 0);
            default:
                return new w0(this.f815c0, this.f816d0, cVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.w0.v(java.lang.Object):java.lang.Object");
    }
}
