package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq1  reason: default package */
/* loaded from: classes.dex */
public final class gq1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.gn Z;
    public final /* synthetic */ defpackage.qa4 d0;

    public /* synthetic */ gq1(defpackage.gn r1, defpackage.qa4 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            gq1 r2 = (defpackage.gq1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            gq1 r2 = (defpackage.gq1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            gq1 r4 = new gq1
            qa4 r0 = r2.d0
            r1 = 1
            gn r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            gq1 r4 = new gq1
            qa4 r0 = r2.d0
            r1 = 0
            gn r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.X
            jg7 r6 = defpackage.jg7.a
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r5 = 2
            qa4 r7 = r10.d0
            switch(r0) {
                case 0: goto L75;
                default: goto Le;
            }
        Le:
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r10.Y
            r9 = 3
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L28
            if (r0 == r5) goto L24
            if (r0 != r9) goto L1f
            defpackage.oi2.Y(r11)
            goto L74
        L1f:
            defpackage.i.m(r2)
            r6 = r1
            goto L74
        L24:
            defpackage.oi2.Y(r11)
            goto L58
        L28:
            defpackage.oi2.Y(r11)
            goto L42
        L2c:
            defpackage.oi2.Y(r11)
            jd1 r0 = defpackage.oq1.B
            r0 = 500(0x1f4, float:7.0E-43)
            uq1 r1 = defpackage.uq1.MILLISECONDS
            long r0 = defpackage.n16.L(r0, r1)
            r10.Y = r3
            java.lang.Object r0 = defpackage.q60.u(r0, r10)
            if (r0 != r8) goto L42
            goto L73
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setValue(r0)
            jd1 r0 = defpackage.oq1.B
            uq1 r0 = defpackage.uq1.SECONDS
            long r0 = defpackage.n16.L(r9, r0)
            r10.Y = r5
            java.lang.Object r0 = defpackage.q60.u(r0, r10)
            if (r0 != r8) goto L58
            goto L73
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.setValue(r0)
            java.lang.Float r1 = new java.lang.Float
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r0)
            r10.Y = r9
            gn r0 = r10.Z
            r2 = 0
            r3 = 0
            r5 = 14
            r4 = r10
            java.lang.Object r0 = defpackage.gn.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r8) goto L74
        L73:
            r6 = r8
        L74:
            return r6
        L75:
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r10.Y
            if (r0 == 0) goto L86
            if (r0 != r3) goto L81
            defpackage.oi2.Y(r11)
            goto La9
        L81:
            defpackage.i.m(r2)
            r6 = r1
            goto Lae
        L86:
            defpackage.oi2.Y(r11)
            java.lang.Float r1 = new java.lang.Float
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r0)
            r0 = 0
            v71 r2 = defpackage.ir1.a
            r9 = 820(0x334, float:1.149E-42)
            sc7 r2 = defpackage.ge7.Y(r9, r0, r2, r5)
            r10.Y = r3
            gn r0 = r10.Z
            r3 = 0
            r5 = 12
            r4 = r10
            java.lang.Object r0 = defpackage.gn.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r8) goto La9
            r6 = r8
            goto Lae
        La9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setValue(r0)
        Lae:
            return r6
    }
}
