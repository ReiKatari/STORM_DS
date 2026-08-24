package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp6  reason: default package */
/* loaded from: classes.dex */
public final class lp6 extends defpackage.hw6 implements defpackage.fo2 {
    public int X;
    public /* synthetic */ defpackage.ne2 Y;
    public /* synthetic */ int Z;
    public final /* synthetic */ defpackage.mp6 d0;

    public lp6(defpackage.mp6 r1, defpackage.r41 r2) {
            r0 = this;
            r0.d0 = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            ne2 r2 = (defpackage.ne2) r2
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r41 r4 = (defpackage.r41) r4
            lp6 r0 = new lp6
            mp6 r1 = r1.d0
            r0.<init>(r1, r4)
            r0.Y = r2
            r0.Z = r3
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            mp6 r0 = r12.d0
            long r1 = r0.B
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
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
            defpackage.i.m(r12)
            return r5
        L21:
            ne2 r0 = r12.Y
            defpackage.oi2.Y(r13)
            goto L77
        L27:
            ne2 r0 = r12.Y
            defpackage.oi2.Y(r13)
            goto L6c
        L2d:
            ne2 r0 = r12.Y
            defpackage.oi2.Y(r13)
            goto L59
        L33:
            defpackage.oi2.Y(r13)
            goto L84
        L37:
            defpackage.oi2.Y(r13)
            ne2 r13 = r12.Y
            int r4 = r12.Z
            if (r4 <= 0) goto L4b
            ch6 r0 = defpackage.ch6.START
            r12.X = r10
            java.lang.Object r12 = r13.a(r0, r12)
            if (r12 != r3) goto L84
            goto L83
        L4b:
            long r10 = r0.A
            r12.Y = r13
            r12.X = r9
            java.lang.Object r0 = defpackage.q60.t(r10, r12)
            if (r0 != r3) goto L58
            goto L83
        L58:
            r0 = r13
        L59:
            r9 = 0
            int r13 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r13 <= 0) goto L77
            ch6 r13 = defpackage.ch6.STOP
            r12.Y = r0
            r12.X = r8
            java.lang.Object r13 = r0.a(r13, r12)
            if (r13 != r3) goto L6c
            goto L83
        L6c:
            r12.Y = r0
            r12.X = r7
            java.lang.Object r13 = defpackage.q60.t(r1, r12)
            if (r13 != r3) goto L77
            goto L83
        L77:
            ch6 r13 = defpackage.ch6.STOP_AND_RESET_REPLAY_CACHE
            r12.Y = r5
            r12.X = r6
            java.lang.Object r12 = r0.a(r13, r12)
            if (r12 != r3) goto L84
        L83:
            return r3
        L84:
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}
