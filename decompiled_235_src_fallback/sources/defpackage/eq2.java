package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eq2  reason: default package */
/* loaded from: classes.dex */
public final class eq2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.hq2 Z;

    public /* synthetic */ eq2(defpackage.hq2 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L37;
                case 1: goto L2c;
                case 2: goto L21;
                case 3: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            eq2 r2 = (defpackage.eq2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            eq2 r2 = (defpackage.eq2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            eq2 r2 = (defpackage.eq2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            eq2 r2 = (defpackage.eq2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            eq2 r2 = (defpackage.eq2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            hq2 r1 = r1.Z
            switch(r3) {
                case 0: goto L23;
                case 1: goto L1c;
                case 2: goto L15;
                case 3: goto Le;
                default: goto L7;
            }
        L7:
            eq2 r3 = new eq2
            r0 = 4
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            eq2 r3 = new eq2
            r0 = 3
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            eq2 r3 = new eq2
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        L1c:
            eq2 r3 = new eq2
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L23:
            eq2 r3 = new eq2
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.X
            r1 = 2
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto Lb1;
                case 1: goto L81;
                case 2: goto L5f;
                case 3: goto L2f;
                default: goto La;
            }
        La:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L16
            defpackage.oi2.Y(r7)
            goto L2b
        L16:
            defpackage.i.m(r2)
            goto L2e
        L1a:
            defpackage.oi2.Y(r7)
            hq2 r7 = r6.Z
            wc0 r7 = r7.c
            r6.Y = r3
            java.lang.Object r7 = r7.g(r6)
            if (r7 != r0) goto L2b
            r4 = r0
            goto L2e
        L2b:
            r4 = r7
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
        L2e:
            return r4
        L2f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L40
            if (r5 != r3) goto L3b
            defpackage.oi2.Y(r7)
            goto L5e
        L3b:
            defpackage.i.m(r2)
            r7 = r4
            goto L5e
        L40:
            defpackage.oi2.Y(r7)
            hq2 r7 = r6.Z
            ci r7 = r7.i
            r6.Y = r3
            r7.getClass()
            boolean r7 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            xe1 r7 = defpackage.xk1.a
            de1 r7 = defpackage.de1.L
            s66 r2 = new s66
            r2.<init>(r1, r4)
            java.lang.Object r7 = defpackage.hv.d0(r7, r2, r6)
            if (r7 != r0) goto L5e
            r7 = r0
        L5e:
            return r7
        L5f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            if (r1 == 0) goto L70
            if (r1 != r3) goto L6b
            defpackage.oi2.Y(r7)
            goto L80
        L6b:
            defpackage.i.m(r2)
            r7 = r4
            goto L80
        L70:
            defpackage.oi2.Y(r7)
            hq2 r7 = r6.Z
            wc0 r7 = r7.c
            r6.Y = r3
            java.lang.Object r7 = r7.g(r6)
            if (r7 != r0) goto L80
            r7 = r0
        L80:
            return r7
        L81:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto L92
            if (r5 != r3) goto L8d
            defpackage.oi2.Y(r7)
            goto Lb0
        L8d:
            defpackage.i.m(r2)
            r7 = r4
            goto Lb0
        L92:
            defpackage.oi2.Y(r7)
            hq2 r7 = r6.Z
            ci r7 = r7.i
            r6.Y = r3
            r7.getClass()
            boolean r7 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            xe1 r7 = defpackage.xk1.a
            de1 r7 = defpackage.de1.L
            s66 r2 = new s66
            r2.<init>(r1, r4)
            java.lang.Object r7 = defpackage.hv.d0(r7, r2, r6)
            if (r7 != r0) goto Lb0
            r7 = r0
        Lb0:
            return r7
        Lb1:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r6.Y
            if (r5 == 0) goto Lc7
            if (r5 == r3) goto Lc3
            if (r5 != r1) goto Lbf
            defpackage.oi2.Y(r7)
            goto Le6
        Lbf:
            defpackage.i.m(r2)
            goto Lee
        Lc3:
            defpackage.oi2.Y(r7)
            goto Lda
        Lc7:
            defpackage.oi2.Y(r7)
            ai0 r7 = new ai0
            r7.<init>(r1, r4, r1)
            r6.Y = r3
            r2 = 2500(0x9c4, double:1.235E-320)
            java.lang.Object r7 = defpackage.xk2.N(r2, r7, r6)
            if (r7 != r0) goto Lda
            goto Le4
        Lda:
            r6.Y = r1
            r1 = 150(0x96, double:7.4E-322)
            java.lang.Object r7 = defpackage.q60.t(r1, r6)
            if (r7 != r0) goto Le6
        Le4:
            r4 = r0
            goto Lee
        Le6:
            hq2 r6 = r6.Z
            r7 = 0
            r6.j(r7)
            jg7 r4 = defpackage.jg7.a
        Lee:
            return r4
    }
}
