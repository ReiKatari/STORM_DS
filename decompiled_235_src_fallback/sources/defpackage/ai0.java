package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai0  reason: default package */
/* loaded from: classes.dex */
public final class ai0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;

    public /* synthetic */ ai0(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ai0 r2 = (defpackage.ai0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r41 r4 = (defpackage.r41) r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r41 r2 = r2.q(r4, r3)
            ai0 r2 = (defpackage.ai0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ai0 r2 = (defpackage.ai0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r2 = r2.X
            switch(r2) {
                case 0: goto L1d;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            ai0 r2 = new ai0
            r4 = 2
            r0 = 2
            r2.<init>(r4, r3, r0)
            return r2
        Ld:
            ai0 r2 = new ai0
            r0 = 2
            r1 = 1
            r2.<init>(r0, r3, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r4.intValue()
            r2.Y = r3
            return r2
        L1d:
            ai0 r2 = new ai0
            r4 = 2
            r0 = 0
            r2.<init>(r4, r3, r0)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.X
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L2e;
                default: goto L9;
            }
        L9:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r5.Y
            if (r4 == 0) goto L16
            if (r4 != r3) goto L12
            goto L16
        L12:
            defpackage.i.m(r2)
            goto L2d
        L16:
            defpackage.oi2.Y(r6)
        L19:
            boolean r6 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            boolean r6 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            if (r6 != 0) goto L2b
            r5.Y = r3
            r1 = 50
            java.lang.Object r6 = defpackage.q60.t(r1, r5)
            if (r6 != r0) goto L19
            r1 = r0
            goto L2d
        L2b:
            jg7 r1 = defpackage.jg7.a
        L2d:
            return r1
        L2e:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            int r5 = r5.Y
            if (r5 <= 0) goto L38
            goto L39
        L38:
            r3 = 0
        L39:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L3e:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r5.Y
            if (r4 == 0) goto L4e
            if (r4 != r3) goto L4a
            defpackage.oi2.Y(r6)
            goto L5d
        L4a:
            defpackage.i.m(r2)
            goto L5f
        L4e:
            defpackage.oi2.Y(r6)
            r5.Y = r3
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r5 = defpackage.q60.t(r1, r5)
            if (r5 != r0) goto L5d
            r1 = r0
            goto L5f
        L5d:
            jg7 r1 = defpackage.jg7.a
        L5f:
            return r1
    }
}
