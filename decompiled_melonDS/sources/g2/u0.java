package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends ec.j implements mc.p {
    public int X;
    public final /* synthetic */ d1.c Y;
    public final /* synthetic */ float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ boolean f5416b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ v0 f5417c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ j1.h f5418d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(d1.c cVar, float f8, boolean z10, v0 v0Var, j1.h hVar, cc.c cVar2) {
        super(2, cVar2);
        this.Y = cVar;
        this.Z = f8;
        this.f5416b0 = z10;
        this.f5417c0 = v0Var;
        this.f5418d0 = hVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((u0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new u0(this.Y, this.Z, this.f5416b0, this.f5417c0, this.f5418d0, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r8.f(r7, r1) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (g2.n1.a(r8, r4, r1, r7.f5418d0, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r8) {
        /*
            r7 = this;
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r7.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L14:
            p7.j.I(r8)
            goto L85
        L18:
            p7.j.I(r8)
            d1.c r8 = r7.Y
            n2.f1 r1 = r8.f3527e
            java.lang.Object r1 = r1.getValue()
            x4.f r1 = (x4.f) r1
            float r1 = r1.A
            float r4 = r7.Z
            boolean r1 = x4.f.b(r1, r4)
            if (r1 != 0) goto L85
            boolean r1 = r7.f5416b0
            if (r1 != 0) goto L41
            x4.f r1 = new x4.f
            r1.<init>(r4)
            r7.X = r3
            java.lang.Object r8 = r8.f(r7, r1)
            if (r8 != r0) goto L85
            goto L84
        L41:
            n2.f1 r1 = r8.f3527e
            java.lang.Object r1 = r1.getValue()
            x4.f r1 = (x4.f) r1
            float r1 = r1.A
            g2.v0 r3 = r7.f5417c0
            float r5 = r3.f5429b
            boolean r5 = x4.f.b(r1, r5)
            if (r5 == 0) goto L5d
            j1.k r1 = new j1.k
            r5 = 0
            r1.<init>(r5)
            goto L7a
        L5d:
            float r5 = r3.f5431d
            boolean r5 = x4.f.b(r1, r5)
            if (r5 == 0) goto L6b
            j1.f r1 = new j1.f
            r1.<init>()
            goto L7a
        L6b:
            float r3 = r3.f5432e
            boolean r1 = x4.f.b(r1, r3)
            if (r1 == 0) goto L79
            j1.d r1 = new j1.d
            r1.<init>()
            goto L7a
        L79:
            r1 = 0
        L7a:
            r7.X = r2
            j1.h r2 = r7.f5418d0
            java.lang.Object r8 = g2.n1.a(r8, r4, r1, r2, r7)
            if (r8 != r0) goto L85
        L84:
            return r0
        L85:
            yb.y r8 = yb.y.f14813a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.u0.v(java.lang.Object):java.lang.Object");
    }
}
