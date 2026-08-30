package mh;

import n2.b1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends ec.j implements mc.p {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ float f9699b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ mc.a f9700c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ b1 f9701d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j2, float f8, float f10, mc.a aVar, b1 b1Var, cc.c cVar) {
        super(2, cVar);
        this.Y = j2;
        this.Z = f8;
        this.f9699b0 = f10;
        this.f9700c0 = aVar;
        this.f9701d0 = b1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((t) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new t(this.Y, this.Z, this.f9699b0, this.f9700c0, this.f9701d0, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (d1.d.e(r7, r14.f9699b0, r9, null, r11, r14, 8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (d1.d.e(r3, 0.0f, 0.0f, null, r7, r14, 12) == r0) goto L17;
     */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r15) {
        /*
            r14 = this;
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r14.X
            mc.a r2 = r14.f9700c0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L13
            p7.j.I(r15)
            goto L7d
        L13:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r15)
            r15 = 0
            return r15
        L1a:
            p7.j.I(r15)
            r8 = r14
            goto L50
        L1f:
            p7.j.I(r15)
            long r5 = r14.Y
            float r15 = x4.q.c(r5)
            float r1 = r14.Z
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            n2.b1 r1 = r14.f9701d0
            if (r15 <= 0) goto L54
            float r15 = mh.x.f9704a
            float r7 = r1.g()
            float r9 = x4.q.c(r5)
            mh.s r11 = new mh.s
            r15 = 0
            r11.<init>(r1, r15)
            r14.X = r4
            float r8 = r14.f9699b0
            r10 = 0
            r13 = 8
            r12 = r14
            java.lang.Object r15 = d1.d.e(r7, r8, r9, r10, r11, r12, r13)
            r8 = r12
            if (r15 != r0) goto L50
            goto L7c
        L50:
            r2.b()
            goto L7d
        L54:
            r8 = r14
            float r15 = mh.x.f9704a
            float r15 = r1.g()
            float r5 = r8.f9699b0
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 <= 0) goto L65
            r2.b()
            goto L7d
        L65:
            r15 = r3
            float r3 = r1.g()
            mh.s r7 = new mh.s
            r7.<init>(r1, r4)
            r8.X = r15
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 12
            java.lang.Object r15 = d1.d.e(r3, r4, r5, r6, r7, r8, r9)
            if (r15 != r0) goto L7d
        L7c:
            return r0
        L7d:
            yb.y r15 = yb.y.f14813a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.t.v(java.lang.Object):java.lang.Object");
    }
}
