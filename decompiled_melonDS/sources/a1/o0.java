package a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends ec.i implements mc.p {
    public k0 L;
    public p0 R;
    public long[] X;
    public int Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f80b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f81c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f82d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f83e0;

    /* renamed from: f0  reason: collision with root package name */
    public /* synthetic */ Object f84f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ p0 f85g0;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k0 f86h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, k0 k0Var, cc.c cVar) {
        super(2, cVar);
        this.f85g0 = p0Var;
        this.f86h0 = k0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((o0) t((cc.c) obj2, (uc.g) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        o0 o0Var = new o0(this.f85g0, this.f86h0, cVar);
        o0Var.f84f0 = obj;
        return o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x00a1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f83e0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2d
            if (r2 != r5) goto L26
            int r2 = r0.f81c0
            int r6 = r0.f80b0
            long r7 = r0.f82d0
            int r9 = r0.Z
            int r10 = r0.Y
            long[] r11 = r0.X
            a1.p0 r12 = r0.R
            a1.k0 r13 = r0.L
            java.lang.Object r14 = r0.f84f0
            uc.g r14 = (uc.g) r14
            p7.j.I(r22)
            goto L96
        L26:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            r1 = 0
            return r1
        L2d:
            p7.j.I(r22)
            java.lang.Object r2 = r0.f84f0
            uc.g r2 = (uc.g) r2
            a1.p0 r6 = r0.f85g0
            a1.n0 r7 = r6.B
            long[] r7 = r7.f74a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            a1.k0 r9 = r0.f86h0
            r10 = 0
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L99
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.B = r15
            a1.n0 r3 = r12.B
            java.lang.Object[] r3 = r3.f75b
            r3 = r3[r15]
            r0.f84f0 = r14
            r0.L = r13
            r0.R = r12
            r0.X = r11
            r0.Y = r10
            r0.Z = r9
            r0.f82d0 = r7
            r0.f80b0 = r6
            r0.f81c0 = r2
            r0.f83e0 = r5
            dc.a r3 = r14.b(r0, r3)
            if (r3 != r1) goto L96
            return r1
        L96:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L65
        L99:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La1:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L42
        La6:
            yb.y r1 = yb.y.f14813a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.o0.v(java.lang.Object):java.lang.Object");
    }
}
