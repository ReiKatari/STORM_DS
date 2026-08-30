package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 extends ec.j implements mc.q {
    public int X;
    public /* synthetic */ i Y;
    public /* synthetic */ int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ n1 f2843b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, cc.c cVar) {
        super(3, cVar);
        this.f2843b0 = n1Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        m1 m1Var = new m1(this.f2843b0, (cc.c) obj3);
        m1Var.Y = (i) obj;
        m1Var.Z = intValue;
        return m1Var.v(yb.y.f14813a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r12.a(r0, r11) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r0.a(r12, r11) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (zc.x.h(r1, r11) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r0.a(r12, r11) == r3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            r11 = this;
            cd.n1 r0 = r11.f2843b0
            long r1 = r0.f2846b
            dc.a r3 = dc.a.COROUTINE_SUSPENDED
            int r4 = r11.X
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L37
            if (r4 == r9) goto L33
            if (r4 == r8) goto L2d
            if (r4 == r7) goto L27
            if (r4 == r6) goto L21
            if (r4 != r5) goto L1a
            goto L33
        L1a:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r12)
            r12 = 0
            return r12
        L21:
            cd.i r0 = r11.Y
            p7.j.I(r12)
            goto L77
        L27:
            cd.i r0 = r11.Y
            p7.j.I(r12)
            goto L6c
        L2d:
            cd.i r0 = r11.Y
            p7.j.I(r12)
            goto L59
        L33:
            p7.j.I(r12)
            goto L85
        L37:
            p7.j.I(r12)
            cd.i r12 = r11.Y
            int r4 = r11.Z
            if (r4 <= 0) goto L4b
            cd.g1 r0 = cd.g1.START
            r11.X = r9
            java.lang.Object r12 = r12.a(r0, r11)
            if (r12 != r3) goto L85
            goto L84
        L4b:
            long r9 = r0.f2845a
            r11.Y = r12
            r11.X = r8
            java.lang.Object r0 = zc.x.h(r9, r11)
            if (r0 != r3) goto L58
            goto L84
        L58:
            r0 = r12
        L59:
            r8 = 0
            int r12 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r12 <= 0) goto L77
            cd.g1 r12 = cd.g1.STOP
            r11.Y = r0
            r11.X = r7
            java.lang.Object r12 = r0.a(r12, r11)
            if (r12 != r3) goto L6c
            goto L84
        L6c:
            r11.Y = r0
            r11.X = r6
            java.lang.Object r12 = zc.x.h(r1, r11)
            if (r12 != r3) goto L77
            goto L84
        L77:
            cd.g1 r12 = cd.g1.STOP_AND_RESET_REPLAY_CACHE
            r1 = 0
            r11.Y = r1
            r11.X = r5
            java.lang.Object r12 = r0.a(r12, r11)
            if (r12 != r3) goto L85
        L84:
            return r3
        L85:
            yb.y r12 = yb.y.f14813a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.m1.v(java.lang.Object):java.lang.Object");
    }
}
