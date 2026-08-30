package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wd6  reason: default package */
/* loaded from: classes.dex */
public final class wd6 extends nk6 implements bj2 {
    public int X;
    public /* synthetic */ w92 Y;
    public /* synthetic */ int Z;
    public final /* synthetic */ xd6 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd6(xd6 xd6Var, j11 j11Var) {
        super(3, j11Var);
        this.c0 = xd6Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        wd6 wd6Var = new wd6(this.c0, (j11) obj3);
        wd6Var.Y = (w92) obj;
        wd6Var.Z = intValue;
        return wd6Var.v(o27.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r13.b(r0, r12) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r0.b(r13, r12) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (defpackage.dk7.q(r1, r12) == r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r0.b(r13, r12) == r3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r13) {
        /*
            r12 = this;
            xd6 r0 = r12.c0
            long r1 = r0.B
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r12.X
            r5 = 0
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L37
            if (r4 == r10) goto L33
            if (r4 == r9) goto L2d
            if (r4 == r8) goto L27
            if (r4 == r7) goto L21
            if (r4 != r6) goto L1b
            goto L33
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r5
        L21:
            w92 r0 = r12.Y
            defpackage.me2.a0(r13)
            goto L77
        L27:
            w92 r0 = r12.Y
            defpackage.me2.a0(r13)
            goto L6c
        L2d:
            w92 r0 = r12.Y
            defpackage.me2.a0(r13)
            goto L59
        L33:
            defpackage.me2.a0(r13)
            goto L84
        L37:
            defpackage.me2.a0(r13)
            w92 r13 = r12.Y
            int r4 = r12.Z
            if (r4 <= 0) goto L4b
            p56 r0 = defpackage.p56.START
            r12.X = r10
            java.lang.Object r12 = r13.b(r0, r12)
            if (r12 != r3) goto L84
            goto L83
        L4b:
            long r10 = r0.A
            r12.Y = r13
            r12.X = r9
            java.lang.Object r0 = defpackage.dk7.q(r10, r12)
            if (r0 != r3) goto L58
            goto L83
        L58:
            r0 = r13
        L59:
            r9 = 0
            int r13 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r13 <= 0) goto L77
            p56 r13 = defpackage.p56.STOP
            r12.Y = r0
            r12.X = r8
            java.lang.Object r13 = r0.b(r13, r12)
            if (r13 != r3) goto L6c
            goto L83
        L6c:
            r12.Y = r0
            r12.X = r7
            java.lang.Object r13 = defpackage.dk7.q(r1, r12)
            if (r13 != r3) goto L77
            goto L83
        L77:
            p56 r13 = defpackage.p56.STOP_AND_RESET_REPLAY_CACHE
            r12.Y = r5
            r12.X = r6
            java.lang.Object r12 = r0.b(r13, r12)
            if (r12 != r3) goto L84
        L83:
            return r3
        L84:
            o27 r12 = defpackage.o27.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd6.v(java.lang.Object):java.lang.Object");
    }
}
