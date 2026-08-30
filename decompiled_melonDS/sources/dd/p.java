package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends ec.j implements mc.p {
    public bd.l X;
    public byte[] Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f4042b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4043c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f4044d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ cd.h[] f4045e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ mc.a f4046f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ ec.j f4047g0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ cd.i f4048h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cc.c cVar, cd.i iVar, mc.a aVar, mc.q qVar, cd.h[] hVarArr) {
        super(2, cVar);
        this.f4045e0 = hVarArr;
        this.f4046f0 = aVar;
        this.f4047g0 = (ec.j) qVar;
        this.f4048h0 = iVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((p) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ec.j, mc.q] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        p pVar = new p(cVar, this.f4048h0, this.f4046f0, this.f4047g0, this.f4045e0);
        pVar.f4044d0 = obj;
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
        if (r12 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
        if (r14.i(r13, r9, r19) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
        if (r14.i(r13, r12, r19) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[LOOP:0: B:26:0x00a2->B:32:0x00bf, LOOP_START, PHI: r8 r12 
      PHI: (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:23:0x009d, B:32:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v4 zb.t) = (r12v3 zb.t), (r12v15 zb.t) binds: [B:23:0x009d, B:32:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v4, types: [ec.j, mc.q] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c1 -> B:19:0x0082). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e1 -> B:19:0x0082). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f9 -> B:19:0x0082). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.p.v(java.lang.Object):java.lang.Object");
    }
}
