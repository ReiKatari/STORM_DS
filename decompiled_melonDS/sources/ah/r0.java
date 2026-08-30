package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ h1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ ze.a f810b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(h1 h1Var, ze.a aVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = h1Var;
        this.f810b0 = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((r0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((r0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new r0(this.Z, this.f810b0, cVar, 0);
            default:
                return new r0(this.Z, this.f810b0, cVar, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (ah.h1.l(r3, r4, r16) == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
        if (r4 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011c, code lost:
        if (r4 == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return r9;
     */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.r0.v(java.lang.Object):java.lang.Object");
    }
}
