package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends ec.j implements mc.p {
    public final /* synthetic */ int X = 0;
    public nc.q Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ float f5927b0;

    /* renamed from: c0  reason: collision with root package name */
    public Object f5928c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f5929d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ u1 f5930e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i1.f fVar, float f8, mc.l lVar, u1 u1Var, cc.c cVar) {
        super(2, cVar);
        this.f5928c0 = fVar;
        this.f5927b0 = f8;
        this.f5929d0 = lVar;
        this.f5930e0 = u1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((k) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((k) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new k(this.f5927b0, (l) this.f5929d0, (l2) this.f5930e0, cVar);
            default:
                u1 u1Var = this.f5930e0;
                return new k((i1.f) this.f5928c0, this.f5927b0, (mc.l) this.f5929d0, u1Var, cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0112, code lost:
        if (r1 == r8) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, nc.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, nc.q] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, nc.q] */
    /* JADX WARN: Type inference failed for: r4v12, types: [i1.c] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.k.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(float f8, l lVar, l2 l2Var, cc.c cVar) {
        super(2, cVar);
        this.f5927b0 = f8;
        this.f5929d0 = lVar;
        this.f5930e0 = l2Var;
    }
}
