package k7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends ec.j implements mc.p {
    public j[] X;
    public m0 Y;
    public c0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8034b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8035c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f8036d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f8037e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ j[] f8038f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ m0 f8039g0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ c0 f8040h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j[] jVarArr, m0 m0Var, c0 c0Var, cc.c cVar) {
        super(2, cVar);
        this.f8038f0 = jVarArr;
        this.f8039g0 = m0Var;
        this.f8040h0 = c0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((l0) t((cc.c) obj2, (m7.k) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new l0(this.f8038f0, this.f8039g0, this.f8040h0, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (k7.m0.d(r7, r6, r12, r11) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (k7.m0.c(r7, r6, r12, r11) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005b -> B:21:0x005c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:27:0x0078). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            r11 = this;
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r11.f8037e0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L1c
        Lc:
            int r1 = r11.f8036d0
            int r4 = r11.f8035c0
            int r5 = r11.f8034b0
            k7.c0 r6 = r11.Z
            k7.m0 r7 = r11.Y
            k7.j[] r8 = r11.X
            p7.j.I(r12)
            goto L5c
        L1c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r12)
        L21:
            r12 = 0
            return r12
        L23:
            p7.j.I(r12)
            k7.j[] r12 = r11.f8038f0
            int r1 = r12.length
            r4 = 0
            k7.m0 r5 = r11.f8039g0
            k7.c0 r6 = r11.f8040h0
            r8 = r12
            r12 = r4
            r7 = r5
        L31:
            if (r4 >= r1) goto L7a
            r5 = r8[r4]
            int r9 = r12 + 1
            int[] r10 = k7.k0.f8033a
            int r5 = r5.ordinal()
            r5 = r10[r5]
            if (r5 == r3) goto L77
            if (r5 == r2) goto L62
            r10 = 3
            if (r5 != r10) goto L5e
            r11.X = r8
            r11.Y = r7
            r11.Z = r6
            r11.f8034b0 = r9
            r11.f8035c0 = r4
            r11.f8036d0 = r1
            r11.f8037e0 = r2
            java.lang.Object r12 = k7.m0.d(r7, r6, r12, r11)
            if (r12 != r0) goto L5b
            goto L76
        L5b:
            r5 = r9
        L5c:
            r12 = r5
            goto L78
        L5e:
            m9.o.o()
            goto L21
        L62:
            r11.X = r8
            r11.Y = r7
            r11.Z = r6
            r11.f8034b0 = r9
            r11.f8035c0 = r4
            r11.f8036d0 = r1
            r11.f8037e0 = r3
            java.lang.Object r12 = k7.m0.c(r7, r6, r12, r11)
            if (r12 != r0) goto L5b
        L76:
            return r0
        L77:
            r12 = r9
        L78:
            int r4 = r4 + r3
            goto L31
        L7a:
            yb.y r12 = yb.y.f14813a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.l0.v(java.lang.Object):java.lang.Object");
    }
}
