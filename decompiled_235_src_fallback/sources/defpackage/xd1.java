package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd1  reason: default package */
/* loaded from: classes.dex */
public final class xd1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ xd1(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ xd1(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    private final java.lang.Object A(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.Z
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r4.Y
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            defpackage.oi2.Y(r5)
            goto L2e
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L18:
            defpackage.oi2.Y(r5)
            p06 r5 = r0.c
            java.lang.Object r2 = r4.d0
            pq5 r2 = (defpackage.pq5) r2
            android.net.Uri r2 = r2.d
            r4.Y = r3
            xb2 r5 = (defpackage.xb2) r5
            java.lang.Object r5 = r5.l(r2, r4)
            if (r5 != r1) goto L2e
            return r1
        L2e:
            pq5 r5 = (defpackage.pq5) r5
            jg7 r4 = defpackage.jg7.a
            if (r5 != 0) goto L35
            goto L39
        L35:
            boolean r1 = r0.o
            if (r1 == 0) goto L3a
        L39:
            return r4
        L3a:
            jt5 r1 = r5.f
            u41 r1 = r1.h
            if (r1 != 0) goto L52
            kd6 r1 = r0.b
            ng6 r1 = (defpackage.ng6) r1
            ex6 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            tp6 r1 = (defpackage.tp6) r1
            java.lang.Object r1 = r1.getValue()
            u41 r1 = (defpackage.u41) r1
        L52:
            r0.d = r5
            tp6 r5 = r0.e
            u41 r2 = r1.a()
            java.util.ArrayList r2 = r2.b
            r5.l(r2)
            tp6 r5 = r0.g
            kk6 r0 = r1.a
            r5.l(r0)
            return r4
    }

    private final java.lang.Object B(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = r5.Z
            java.util.UUID r0 = (java.util.UUID) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r5.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            if (r2 != r4) goto L12
            defpackage.oi2.Y(r6)
            return r6
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L18:
            defpackage.oi2.Y(r6)
            java.lang.Object r6 = r5.d0
            me.magnum.melonds.ui.layouteditor.b r6 = (me.magnum.melonds.ui.layouteditor.b) r6
            yl3 r6 = me.magnum.melonds.ui.layouteditor.b.o(r6)
            r5.Z = r3
            r5.Y = r4
            java.lang.Object r5 = r6.g(r0, r5)
            if (r5 != r1) goto L2e
            return r1
        L2e:
            return r5
    }

    private final java.lang.Object C(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.d0
            qn3 r0 = (defpackage.qn3) r0
            java.lang.Object r1 = r9.Z
            wa3 r1 = (defpackage.wa3) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r9.Y
            r4 = 0
            jg7 r5 = defpackage.jg7.a
            r6 = 1
            if (r3 == 0) goto L1e
            if (r3 != r6) goto L18
            defpackage.oi2.Y(r10)
            return r5
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r4
        L1e:
            defpackage.oi2.Y(r10)
            tp6 r10 = r1.f
            ra3 r3 = new ra3
            r7 = 0
            r3.<init>(r1, r4, r7)
            cf2 r8 = new cf2
            r8.<init>(r3, r10)
            pa3 r10 = new pa3
            r10.<init>(r8, r1, r7)
            g21 r3 = new g21
            r7 = 6
            r3.<init>(r10, r7)
            le2 r10 = defpackage.f04.z(r3)
            m5 r3 = new m5
            r7 = 18
            r3.<init>(r0, r4, r7)
            zb0 r4 = new zb0
            r7 = 12
            r4.<init>(r7, r1, r0)
            r9.Y = r6
            zb0 r0 = new zb0
            r1 = 10
            r0.<init>(r1, r4, r3)
            java.lang.Object r9 = r10.b(r0, r9)
            if (r9 != r2) goto L5b
            goto L5c
        L5b:
            r9 = r5
        L5c:
            if (r9 != r2) goto L5f
            return r2
        L5f:
            return r5
    }

    private final java.lang.Object D(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.d0
            eo3 r0 = (defpackage.eo3) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r9.Y
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 1
            if (r2 == 0) goto L1a
            if (r2 != r5) goto L14
            defpackage.oi2.Y(r10)
            return r4
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r3
        L1a:
            defpackage.oi2.Y(r10)
            java.lang.Object r10 = r9.Z
            wa3 r10 = (defpackage.wa3) r10
            tp6 r2 = r10.f
            ra3 r6 = new ra3
            r7 = 0
            r6.<init>(r10, r3, r7)
            cf2 r8 = new cf2
            r8.<init>(r6, r2)
            pa3 r2 = new pa3
            r2.<init>(r8, r10, r7)
            g21 r10 = new g21
            r6 = 6
            r10.<init>(r2, r6)
            le2 r10 = defpackage.f04.z(r10)
            m5 r2 = new m5
            r6 = 19
            r2.<init>(r0, r3, r6)
            tp6 r0 = r0.c
            r9.Y = r5
            zb0 r3 = new zb0
            r5 = 10
            r3.<init>(r5, r0, r2)
            java.lang.Object r9 = r10.b(r3, r9)
            if (r9 != r1) goto L56
            goto L57
        L56:
            r9 = r4
        L57:
            if (r9 != r1) goto L5a
            return r1
        L5a:
            return r4
    }

    private final java.lang.Object E(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            defpackage.oi2.Y(r7)
            goto L2e
        Le:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r2
        L14:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            zy4 r7 = (defpackage.zy4) r7
            kq3 r1 = new kq3
            java.lang.Object r4 = r6.d0
            ue1 r4 = (defpackage.ue1) r4
            r5 = 0
            r1.<init>(r4, r2, r5)
            r6.Y = r3
            java.lang.Object r6 = defpackage.uj2.o(r7, r1, r6)
            if (r6 != r0) goto L2e
            return r0
        L2e:
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    private final java.lang.Object F(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            defpackage.oi2.Y(r7)
            goto L4c
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L17:
            defpackage.oi2.Y(r7)
            goto L31
        L1b:
            defpackage.oi2.Y(r7)
            jd1 r7 = defpackage.oq1.B
            r7 = 500(0x1f4, float:7.0E-43)
            uq1 r1 = defpackage.uq1.MILLISECONDS
            long r4 = defpackage.n16.L(r7, r1)
            r6.Y = r3
            java.lang.Object r7 = defpackage.q60.u(r4, r6)
            if (r7 != r0) goto L31
            goto L4b
        L31:
            java.lang.Object r7 = r6.d0
            qa4 r7 = (defpackage.qa4) r7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.setValue(r1)
            jd1 r7 = defpackage.oq1.B
            r7 = 4
            uq1 r1 = defpackage.uq1.SECONDS
            long r3 = defpackage.n16.L(r7, r1)
            r6.Y = r2
            java.lang.Object r7 = defpackage.q60.u(r3, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            java.lang.Object r6 = r6.Z
            q3 r6 = (defpackage.q3) r6
            bt r6 = r6.i
            r6.E()
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    private final java.lang.Object G(java.lang.Object r5) {
            r4 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r4.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            return r2
        L10:
            defpackage.oi2.Y(r5)
            goto L28
        L14:
            defpackage.oi2.Y(r5)
            java.lang.Object r5 = r4.Z
            et3 r5 = (defpackage.et3) r5
            java.lang.Object r1 = r4.d0
            l5 r1 = (defpackage.l5) r1
            r4.Y = r3
            x61 r4 = defpackage.fy4.a(r5, r1, r4)
            if (r4 != r0) goto L28
            return r0
        L28:
            defpackage.e41.c()
            return r2
    }

    private final java.lang.Object H(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r2
        L10:
            defpackage.oi2.Y(r7)
            goto L2f
        L14:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            rp6 r7 = (defpackage.rp6) r7
            y6 r1 = new y6
            java.lang.Object r4 = r6.d0
            o74 r4 = (defpackage.o74) r4
            r5 = 12
            r1.<init>(r4, r5)
            r6.Y = r3
            java.lang.Object r6 = r7.b(r1, r6)
            if (r6 != r0) goto L2f
            return r0
        L2f:
            defpackage.e41.c()
            return r2
    }

    private final java.lang.Object I(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.d0
            r1 = r0
            m84 r1 = (defpackage.m84) r1
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r11.Y
            r7 = 0
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L2e
            if (r2 == r9) goto L25
            if (r2 != r8) goto L1f
            java.lang.Object r2 = r11.Z
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L1c
            r6 = r11
            r12 = r2
            goto L73
        L1c:
            r0 = move-exception
            r11 = r0
            goto L7a
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r7
        L25:
            java.lang.Object r2 = r11.Z
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L1c
            r10 = r2
            goto L51
        L2e:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.Z
            w61 r12 = (defpackage.w61) r12
        L35:
            l61 r2 = r12.A()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = defpackage.yh2.z(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L75
            v80 r2 = r1.g     // Catch: java.lang.Throwable -> L1c
            r11.Z = r12     // Catch: java.lang.Throwable -> L1c
            r11.Y = r9     // Catch: java.lang.Throwable -> L1c
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = defpackage.v80.L(r2, r11)     // Catch: java.lang.Throwable -> L1c
            if (r2 != r0) goto L4f
            goto L71
        L4f:
            r10 = r12
            r12 = r2
        L51:
            r3 = r12
            i84 r3 = (defpackage.i84) r3     // Catch: java.lang.Throwable -> L1c
            qh1 r12 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1086324736(0x40c00000, float:6.0)
            float r4 = r12.e0(r2)     // Catch: java.lang.Throwable -> L1c
            qh1 r12 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1065353216(0x3f800000, float:1.0)
            float r5 = r12.e0(r2)     // Catch: java.lang.Throwable -> L1c
            m86 r2 = r1.a     // Catch: java.lang.Throwable -> L1c
            r11.Z = r10     // Catch: java.lang.Throwable -> L1c
            r11.Y = r8     // Catch: java.lang.Throwable -> L1c
            r6 = r11
            java.lang.Object r11 = defpackage.m84.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L72
        L71:
            return r0
        L72:
            r12 = r10
        L73:
            r11 = r6
            goto L35
        L75:
            r1.h = r7
            jg7 r11 = defpackage.jg7.a
            return r11
        L7a:
            r1.h = r7
            throw r11
    }

    private final java.lang.Object v(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.Z
            xb2 r0 = (defpackage.xb2) r0
            tp6 r1 = r0.l
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r9.Y
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            jg7 r8 = defpackage.jg7.a
            if (r3 == 0) goto L2a
            if (r3 == r7) goto L26
            if (r3 == r6) goto L22
            if (r3 != r5) goto L1c
            defpackage.oi2.Y(r10)
            return r8
        L1c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r4
        L22:
            defpackage.oi2.Y(r10)
            goto L54
        L26:
            defpackage.oi2.Y(r10)
            goto L37
        L2a:
            defpackage.oi2.Y(r10)
            m06 r10 = defpackage.m06.SCANNING
            r9.Y = r7
            r1.a(r10, r9)
            if (r8 != r2) goto L37
            goto L5d
        L37:
            java.lang.Object r10 = r9.d0
            java.util.Set r10 = (java.util.Set) r10
            wb2 r3 = new wb2
            r3.<init>(r0, r10, r4)
            g21 r10 = new g21
            r4 = 7
            r10.<init>(r3, r4)
            hb2 r3 = new hb2
            r3.<init>(r0, r7)
            r9.Y = r6
            java.lang.Object r10 = r10.b(r3, r9)
            if (r10 != r2) goto L54
            goto L5d
        L54:
            m06 r10 = defpackage.m06.NOT_SCANNING
            r9.Y = r5
            r1.a(r10, r9)
            if (r8 != r2) goto L5e
        L5d:
            return r2
        L5e:
            return r8
    }

    private final java.lang.Object x(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            defpackage.oi2.Y(r7)
            goto L31
        Le:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r2
        L14:
            defpackage.oi2.Y(r7)
            java.lang.Object r7 = r6.Z
            ta7 r7 = (defpackage.ta7) r7
            java.lang.String r1 = r7.a
            java.lang.String r7 = r7.b
            r6.Y = r3
            xe1 r3 = defpackage.xk1.a
            m5 r4 = new m5
            r5 = 16
            r4.<init>(r1, r7, r2, r5)
            java.lang.Object r7 = defpackage.hv.d0(r3, r4, r6)
            if (r7 != r0) goto L31
            return r0
        L31:
            jp2 r7 = (defpackage.jp2) r7
            java.lang.Object r6 = r6.d0
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r6 = (me.magnum.melonds.translator.ui.GameTranslationOverlayView) r6
            r6.B0 = r7
            r6.invalidate()
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    private final java.lang.Object z(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = r7.d0
            hq2 r0 = (defpackage.hq2) r0
            java.lang.Object r1 = r7.Z
            w61 r1 = (defpackage.w61) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r7.Y
            r4 = 1
            if (r3 == 0) goto L1c
            if (r3 != r4) goto L15
            defpackage.oi2.Y(r8)
            goto L32
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L1c:
            defpackage.oi2.Y(r8)
        L1f:
            boolean r8 = defpackage.g04.H(r1)
            if (r8 == 0) goto L49
            r7.Z = r1
            r7.Y = r4
            r5 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r8 = defpackage.q60.t(r5, r7)
            if (r8 != r2) goto L32
            return r2
        L32:
            android.content.SharedPreferences r8 = r0.f
            java.lang.String r3 = "translator_enabled"
            r5 = 0
            boolean r8 = r8.getBoolean(r3, r5)
            if (r8 == 0) goto L1f
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r8 = r0.l
            if (r8 == 0) goto L1f
            boolean r8 = r8.f0
            if (r8 != 0) goto L1f
            r0.j(r4)
            goto L1f
        L49:
            jg7 r7 = defpackage.jg7.a
            return r7
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L1ba;
                case 1: goto L1ab;
                case 2: goto L19c;
                case 3: goto L18d;
                case 4: goto L17e;
                case 5: goto L16f;
                case 6: goto L160;
                case 7: goto L151;
                case 8: goto L142;
                case 9: goto L133;
                case 10: goto L124;
                case 11: goto L115;
                case 12: goto L106;
                case 13: goto Lf7;
                case 14: goto Le8;
                case 15: goto Ld9;
                case 16: goto Lca;
                case 17: goto Lbb;
                case 18: goto Lac;
                case 19: goto L9d;
                case 20: goto L8e;
                case 21: goto L7f;
                case 22: goto L70;
                case 23: goto L61;
                case 24: goto L52;
                case 25: goto L43;
                case 26: goto L34;
                case 27: goto L25;
                case 28: goto L16;
                default: goto L7;
            }
        L7:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L52:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L61:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L70:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L7f:
            java.util.UUID r3 = (java.util.UUID) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L8e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L9d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lac:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lbb:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lca:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Ld9:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Le8:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lf7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L106:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L115:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L124:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L133:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L142:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L151:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L160:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16f:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L17e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L18d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L19c:
            hy1 r3 = (defpackage.hy1) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1ab:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1ba:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            xd1 r2 = (defpackage.xd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            java.lang.Object r1 = r2.d0
            switch(r0) {
                case 0: goto L184;
                case 1: goto L177;
                case 2: goto L16c;
                case 3: goto L15f;
                case 4: goto L156;
                case 5: goto L149;
                case 6: goto L13c;
                case 7: goto L12f;
                case 8: goto L121;
                case 9: goto L113;
                case 10: goto L105;
                case 11: goto Lf7;
                case 12: goto Le9;
                case 13: goto Ldb;
                case 14: goto Lcd;
                case 15: goto Lc1;
                case 16: goto Lb3;
                case 17: goto La7;
                case 18: goto L99;
                case 19: goto L8d;
                case 20: goto L7f;
                case 21: goto L73;
                case 22: goto L65;
                case 23: goto L57;
                case 24: goto L49;
                case 25: goto L3b;
                case 26: goto L2d;
                case 27: goto L1f;
                case 28: goto L13;
                default: goto L7;
            }
        L7:
            xd1 r2 = new xd1
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0 = 29
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L13:
            xd1 r2 = new xd1
            m84 r1 = (defpackage.m84) r1
            r0 = 28
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L1f:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            rp6 r2 = (defpackage.rp6) r2
            o74 r1 = (defpackage.o74) r1
            r0 = 27
            r4.<init>(r2, r1, r3, r0)
            return r4
        L2d:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            et3 r2 = (defpackage.et3) r2
            l5 r1 = (defpackage.l5) r1
            r0 = 26
            r4.<init>(r2, r1, r3, r0)
            return r4
        L3b:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            q3 r2 = (defpackage.q3) r2
            qa4 r1 = (defpackage.qa4) r1
            r0 = 25
            r4.<init>(r2, r1, r3, r0)
            return r4
        L49:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            zy4 r2 = (defpackage.zy4) r2
            ue1 r1 = (defpackage.ue1) r1
            r0 = 24
            r4.<init>(r2, r1, r3, r0)
            return r4
        L57:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            wa3 r2 = (defpackage.wa3) r2
            eo3 r1 = (defpackage.eo3) r1
            r0 = 23
            r4.<init>(r2, r1, r3, r0)
            return r4
        L65:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            wa3 r2 = (defpackage.wa3) r2
            qn3 r1 = (defpackage.qn3) r1
            r0 = 22
            r4.<init>(r2, r1, r3, r0)
            return r4
        L73:
            xd1 r2 = new xd1
            me.magnum.melonds.ui.layouteditor.b r1 = (me.magnum.melonds.ui.layouteditor.b) r1
            r0 = 21
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L7f:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            me.magnum.melonds.ui.inputsetup.b r2 = (me.magnum.melonds.ui.inputsetup.b) r2
            pq5 r1 = (defpackage.pq5) r1
            r0 = 20
            r4.<init>(r2, r1, r3, r0)
            return r4
        L8d:
            xd1 r2 = new xd1
            hq2 r1 = (defpackage.hq2) r1
            r0 = 19
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L99:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            ta7 r2 = (defpackage.ta7) r2
            me.magnum.melonds.translator.ui.GameTranslationOverlayView r1 = (me.magnum.melonds.translator.ui.GameTranslationOverlayView) r1
            r0 = 18
            r4.<init>(r2, r1, r3, r0)
            return r4
        La7:
            xd1 r2 = new xd1
            le2 r1 = (defpackage.le2) r1
            r0 = 17
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        Lb3:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            xb2 r2 = (defpackage.xb2) r2
            java.util.Set r1 = (java.util.Set) r1
            r0 = 16
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lc1:
            xd1 r2 = new xd1
            xb2 r1 = (defpackage.xb2) r1
            r0 = 15
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        Lcd:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            bt r2 = (defpackage.bt) r2
            of0 r1 = (defpackage.of0) r1
            r0 = 14
            r4.<init>(r2, r1, r3, r0)
            return r4
        Ldb:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            sz1 r2 = (defpackage.sz1) r2
            me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r1 = (me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState) r1
            r0 = 13
            r4.<init>(r2, r1, r3, r0)
            return r4
        Le9:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            sz1 r2 = (defpackage.sz1) r2
            lx5 r1 = (defpackage.lx5) r1
            r0 = 12
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lf7:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            sz1 r2 = (defpackage.sz1) r2
            kb5 r1 = (defpackage.kb5) r1
            r0 = 11
            r4.<init>(r2, r1, r3, r0)
            return r4
        L105:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            sz1 r2 = (defpackage.sz1) r2
            java.lang.String r1 = (java.lang.String) r1
            r0 = 10
            r4.<init>(r2, r1, r3, r0)
            return r4
        L113:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            sz1 r2 = (defpackage.sz1) r2
            android.net.Uri r1 = (android.net.Uri) r1
            r0 = 9
            r4.<init>(r2, r1, r3, r0)
            return r4
        L121:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            sz1 r2 = (defpackage.sz1) r2
            me.magnum.melonds.domain.model.ConsoleType r1 = (me.magnum.melonds.domain.model.ConsoleType) r1
            r0 = 8
            r4.<init>(r2, r1, r3, r0)
            return r4
        L12f:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            bt r2 = (defpackage.bt) r2
            android.os.Vibrator r1 = (android.os.Vibrator) r1
            r0 = 7
            r4.<init>(r2, r1, r3, r0)
            return r4
        L13c:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            vw1 r2 = (defpackage.vw1) r2
            pq5 r1 = (defpackage.pq5) r1
            r0 = 6
            r4.<init>(r2, r1, r3, r0)
            return r4
        L149:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            vw1 r2 = (defpackage.vw1) r2
            me.magnum.melonds.domain.model.ConsoleType r1 = (me.magnum.melonds.domain.model.ConsoleType) r1
            r0 = 5
            r4.<init>(r2, r1, r3, r0)
            return r4
        L156:
            xd1 r2 = new xd1
            s9 r1 = (defpackage.s9) r1
            r4 = 4
            r2.<init>(r1, r3, r4)
            return r2
        L15f:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            me.magnum.melonds.ui.emulator.EmulatorActivity r2 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r2
            nx1 r1 = (defpackage.nx1) r1
            r0 = 3
            r4.<init>(r2, r1, r3, r0)
            return r4
        L16c:
            xd1 r2 = new xd1
            me.magnum.melonds.ui.emulator.EmulatorActivity r1 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r1
            r0 = 2
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L177:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            ie2 r2 = (defpackage.ie2) r2
            t93 r1 = (defpackage.t93) r1
            r0 = 1
            r4.<init>(r2, r1, r3, r0)
            return r4
        L184:
            xd1 r4 = new xd1
            java.lang.Object r2 = r2.Z
            ie2 r2 = (defpackage.ie2) r2
            yd1 r1 = (defpackage.yd1) r1
            r0 = 0
            r4.<init>(r2, r1, r3, r0)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.X
            r2 = 8
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 0
            switch(r1) {
                case 0: goto Lba6;
                case 1: goto Lb7b;
                case 2: goto L5c8;
                case 3: goto L584;
                case 4: goto L508;
                case 5: goto L4a9;
                case 6: goto L448;
                case 7: goto L410;
                case 8: goto L3bd;
                case 9: goto L369;
                case 10: goto L31c;
                case 11: goto L287;
                case 12: goto L23c;
                case 13: goto L207;
                case 14: goto Lf5;
                case 15: goto Lb5;
                case 16: goto Lb0;
                case 17: goto L81;
                case 18: goto L7c;
                case 19: goto L77;
                case 20: goto L72;
                case 21: goto L6d;
                case 22: goto L68;
                case 23: goto L63;
                case 24: goto L5e;
                case 25: goto L59;
                case 26: goto L54;
                case 27: goto L4f;
                case 28: goto L4a;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r1 = r0.d0
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.Object r2 = r0.Z
            r35 r2 = (defpackage.r35) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            if (r4 == 0) goto L29
            if (r4 != r7) goto L23
            defpackage.oi2.Y(r20)
            goto L47
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L49
        L29:
            defpackage.oi2.Y(r20)
            c53 r4 = new c53
            r4.<init>(r2, r7)
            r1.registerDefaultNetworkCallback(r4)
            ci2 r5 = new ci2
            r6 = 13
            r5.<init>(r6, r1, r4)
            r0.Z = r8
            r0.Y = r7
            java.lang.Object r0 = defpackage.kj2.q(r2, r5, r0)
            if (r0 != r3) goto L47
            r8 = r3
            goto L49
        L47:
            jg7 r8 = defpackage.jg7.a
        L49:
            return r8
        L4a:
            java.lang.Object r0 = r19.I(r20)
            return r0
        L4f:
            java.lang.Object r0 = r19.H(r20)
            return r0
        L54:
            java.lang.Object r0 = r19.G(r20)
            return r0
        L59:
            java.lang.Object r0 = r19.F(r20)
            return r0
        L5e:
            java.lang.Object r0 = r19.E(r20)
            return r0
        L63:
            java.lang.Object r0 = r19.D(r20)
            return r0
        L68:
            java.lang.Object r0 = r19.C(r20)
            return r0
        L6d:
            java.lang.Object r0 = r19.B(r20)
            return r0
        L72:
            java.lang.Object r0 = r19.A(r20)
            return r0
        L77:
            java.lang.Object r0 = r19.z(r20)
            return r0
        L7c:
            java.lang.Object r0 = r19.x(r20)
            return r0
        L81:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L93
            if (r3 != r7) goto L8d
            defpackage.oi2.Y(r20)
            goto Lad
        L8d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto Laf
        L93:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r0.Z
            r35 r3 = (defpackage.r35) r3
            java.lang.Object r4 = r0.d0
            le2 r4 = (defpackage.le2) r4
            y6 r5 = new y6
            r5.<init>(r3, r2)
            r0.Y = r7
            java.lang.Object r0 = r4.b(r5, r0)
            if (r0 != r1) goto Lad
            r8 = r1
            goto Laf
        Lad:
            jg7 r8 = defpackage.jg7.a
        Laf:
            return r8
        Lb0:
            java.lang.Object r0 = r19.v(r20)
            return r0
        Lb5:
            java.lang.Object r1 = r0.d0
            xb2 r1 = (defpackage.xb2) r1
            java.lang.Object r2 = r0.Z
            ne2 r2 = (defpackage.ne2) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r0.Y
            if (r9 == 0) goto Lcf
            if (r9 != r7) goto Lc9
            defpackage.oi2.Y(r20)
            goto Lf2
        Lc9:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto Lf4
        Lcf:
            defpackage.oi2.Y(r20)
            java.util.concurrent.atomic.AtomicBoolean r9 = r1.n
            boolean r6 = r9.compareAndSet(r6, r7)
            if (r6 == 0) goto Le4
            o41 r6 = r1.h
            ib2 r9 = new ib2
            r9.<init>(r1, r8, r5)
            defpackage.hv.L(r6, r8, r8, r9, r4)
        Le4:
            of6 r1 = r1.k
            r0.Z = r8
            r0.Y = r7
            java.lang.Object r0 = defpackage.f04.A(r2, r1, r0)
            if (r0 != r3) goto Lf2
            r8 = r3
            goto Lf4
        Lf2:
            jg7 r8 = defpackage.jg7.a
        Lf4:
            return r8
        Lf5:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L10a
            if (r2 != r7) goto L103
            defpackage.oi2.Y(r20)
            r2 = r20
            goto L13e
        L103:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L1fa
        L10a:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r0.Z
            bt r2 = (defpackage.bt) r2
            java.lang.Object r2 = r2.L
            tg0 r2 = (defpackage.tg0) r2
            java.lang.Object r3 = r0.d0
            of0 r3 = (defpackage.of0) r3
            kf0 r3 = r3.a
            r0.Y = r7
            java.lang.Object r4 = r2.c
            monitor-enter(r4)
            boolean r9 = r2.d     // Catch: java.lang.Throwable -> L1fb
            if (r9 != 0) goto L1fd
            nb1 r2 = r2.a
            java.lang.Object r2 = r2.v     // Catch: java.lang.Throwable -> L1fb
            m55 r2 = (defpackage.m55) r2     // Catch: java.lang.Throwable -> L1fb
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L1fb
            rd0 r2 = (defpackage.rd0) r2     // Catch: java.lang.Throwable -> L1fb
            xb0 r2 = r2.d     // Catch: java.lang.Throwable -> L1fb
            monitor-exit(r4)
            if (r2 == 0) goto L1f5
            java.lang.Object r2 = r2.a(r3, r0)
            if (r2 != r1) goto L13e
            r8 = r1
            goto L1fa
        L13e:
            java.lang.Object r0 = r0.d0
            of0 r0 = (defpackage.of0) r0
            zy0 r2 = (defpackage.zy0) r2
            int r1 = r2.a
            java.lang.String r3 = "CXCP"
            boolean r3 = defpackage.kj2.F(r3)
            if (r3 == 0) goto L1eb
            java.lang.String r3 = "CXCP"
            kf0 r4 = r0.a
            java.util.List r4 = r4.b
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r10 = defpackage.ht0.v0(r4, r9)
            r8.<init>(r10)
            java.util.Iterator r4 = r4.iterator()
        L163:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L1ba
            java.lang.Object r10 = r4.next()
            ji0 r10 = (defpackage.ji0) r10
            java.util.List r10 = r10.a
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = defpackage.ht0.v0(r10, r9)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L17e:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L1b6
            java.lang.Object r12 = r10.next()
            pp4 r12 = (defpackage.pp4) r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "size="
            r13.<init>(r14)
            android.util.Size r14 = r12.a
            r13.append(r14)
            java.lang.String r14 = ", format="
            r13.append(r14)
            int r14 = r12.b
            java.lang.String r14 = defpackage.fr6.b(r14)
            r13.append(r14)
            java.lang.String r14 = ", dynamicRangeProfile"
            r13.append(r14)
            qp4 r12 = r12.e
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.add(r12)
            goto L17e
        L1b6:
            r8.add(r11)
            goto L163
        L1ba:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "FeatureCombinationQueryImpl#isSupported: result = "
            r4.<init>(r9)
            if (r1 != r7) goto L1c6
            java.lang.String r1 = "SUPPORTED"
            goto L1cd
        L1c6:
            if (r1 != r5) goto L1cb
            java.lang.String r1 = "UNSUPPORTED"
            goto L1cd
        L1cb:
            java.lang.String r1 = "UNKNOWN"
        L1cd:
            r4.append(r1)
            java.lang.String r1 = " for sessionParameters = "
            r4.append(r1)
            kf0 r0 = r0.a
            java.util.Map r0 = r0.g
            r4.append(r0)
            java.lang.String r0 = " and streams = "
            r4.append(r0)
            r4.append(r8)
            java.lang.String r0 = r4.toString()
            android.util.Log.d(r3, r0)
        L1eb:
            int r0 = r2.a
            if (r0 != r7) goto L1f0
            r6 = r7
        L1f0:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            goto L1fa
        L1f5:
            java.lang.String r0 = "Required value was null."
            defpackage.i.m(r0)
        L1fa:
            return r8
        L1fb:
            r0 = move-exception
            goto L205
        L1fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1fb
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1fb
            throw r0     // Catch: java.lang.Throwable -> L1fb
        L205:
            monitor-exit(r4)
            throw r0
        L207:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L219
            if (r2 != r7) goto L213
            defpackage.oi2.Y(r20)
            goto L239
        L213:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L23b
        L219:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r0.Z
            sz1 r2 = (defpackage.sz1) r2
            jh r2 = r2.v
            java.lang.Object r3 = r0.d0
            me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState r3 = (me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState) r3
            r0.Y = r7
            r2.getClass()
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            boolean r0 = r0.loadRewindState(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != r1) goto L239
            r8 = r1
            goto L23b
        L239:
            jg7 r8 = defpackage.jg7.a
        L23b:
            return r8
        L23c:
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r0.Z
            sz1 r2 = (defpackage.sz1) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            if (r4 == 0) goto L25d
            if (r4 == r7) goto L257
            if (r4 != r5) goto L251
            defpackage.oi2.Y(r20)
        L24f:
            r8 = r1
            goto L286
        L251:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L286
        L257:
            defpackage.oi2.Y(r20)
            r4 = r20
            goto L26d
        L25d:
            defpackage.oi2.Y(r20)
            java.lang.Object r4 = r0.d0
            lx5 r4 = (defpackage.lx5) r4
            r0.Y = r7
            java.io.Serializable r4 = defpackage.sz1.w(r2, r4, r0)
            if (r4 != r3) goto L26d
            goto L285
        L26d:
            java.util.List r4 = (java.util.List) r4
            jh r2 = r2.v
            r0.Y = r5
            r2.getClass()
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            me.magnum.melonds.domain.model.Cheat[] r2 = new me.magnum.melonds.domain.model.Cheat[r6]
            java.lang.Object[] r2 = r4.toArray(r2)
            me.magnum.melonds.domain.model.Cheat[] r2 = (me.magnum.melonds.domain.model.Cheat[]) r2
            r0.setupCheats(r2)
            if (r1 != r3) goto L24f
        L285:
            r8 = r3
        L286:
            return r8
        L287:
            jg7 r1 = defpackage.jg7.a
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L29e
            if (r3 != r7) goto L297
            defpackage.oi2.Y(r20)     // Catch: java.lang.Exception -> L294
        L294:
            r8 = r1
            goto L31b
        L297:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L31b
        L29e:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r0.d0     // Catch: java.lang.Exception -> L294
            kb5 r3 = (defpackage.kb5) r3     // Catch: java.lang.Exception -> L294
            kw3 r4 = defpackage.hf.I()     // Catch: java.lang.Exception -> L294
            java.net.URL r5 = r3.c     // Catch: java.lang.Exception -> L294
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L294
            r4.add(r5)     // Catch: java.lang.Exception -> L294
            java.util.ArrayList r3 = r3.e     // Catch: java.lang.Exception -> L294
            int r5 = r3.size()     // Catch: java.lang.Exception -> L294
            r9 = r6
        L2b9:
            if (r9 >= r5) goto L2f4
            java.lang.Object r10 = r3.get(r9)     // Catch: java.lang.Exception -> L294
            int r9 = r9 + 1
            gb5 r10 = (defpackage.gb5) r10     // Catch: java.lang.Exception -> L294
            java.net.URL r11 = r10.e     // Catch: java.lang.Exception -> L294
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L294
            r4.add(r11)     // Catch: java.lang.Exception -> L294
            java.util.ArrayList r10 = r10.f     // Catch: java.lang.Exception -> L294
            int r11 = r10.size()     // Catch: java.lang.Exception -> L294
            r12 = r6
        L2d3:
            if (r12 >= r11) goto L2b9
            java.lang.Object r13 = r10.get(r12)     // Catch: java.lang.Exception -> L294
            int r12 = r12 + 1
            eb5 r13 = (defpackage.eb5) r13     // Catch: java.lang.Exception -> L294
            o75 r14 = r13.a     // Catch: java.lang.Exception -> L294
            java.net.URL r14 = r14.k     // Catch: java.lang.Exception -> L294
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> L294
            r4.add(r14)     // Catch: java.lang.Exception -> L294
            o75 r13 = r13.a     // Catch: java.lang.Exception -> L294
            java.net.URL r13 = r13.j     // Catch: java.lang.Exception -> L294
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L294
            r4.add(r13)     // Catch: java.lang.Exception -> L294
            goto L2d3
        L2f4:
            kw3 r3 = defpackage.hf.A(r4)     // Catch: java.lang.Exception -> L294
            java.lang.Object r4 = r0.Z     // Catch: java.lang.Exception -> L294
            sz1 r4 = (defpackage.sz1) r4     // Catch: java.lang.Exception -> L294
            hn5 r4 = r4.k     // Catch: java.lang.Exception -> L294
            r0.Y = r7     // Catch: java.lang.Exception -> L294
            r4.getClass()     // Catch: java.lang.Exception -> L294
            xe1 r5 = defpackage.xk1.a     // Catch: java.lang.Exception -> L294
            de1 r5 = defpackage.de1.L     // Catch: java.lang.Exception -> L294
            m5 r6 = new m5     // Catch: java.lang.Exception -> L294
            r7 = 24
            r6.<init>(r4, r3, r8, r7)     // Catch: java.lang.Exception -> L294
            java.lang.Object r0 = defpackage.hv.d0(r5, r6, r0)     // Catch: java.lang.Exception -> L294
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED     // Catch: java.lang.Exception -> L294
            if (r0 != r3) goto L317
            goto L318
        L317:
            r0 = r1
        L318:
            if (r0 != r2) goto L294
            r8 = r2
        L31b:
            return r8
        L31c:
            java.lang.Object r1 = r0.d0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.Z
            sz1 r2 = (defpackage.sz1) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            if (r4 == 0) goto L338
            if (r4 != r7) goto L332
            defpackage.oi2.Y(r20)
            r0 = r20
            goto L349
        L332:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L368
        L338:
            defpackage.oi2.Y(r20)
            p06 r4 = r2.e
            r0.Y = r7
            xb2 r4 = (defpackage.xb2) r4
            java.lang.Object r0 = r4.k(r1, r0)
            if (r0 != r3) goto L349
            r8 = r3
            goto L368
        L349:
            pq5 r0 = (defpackage.pq5) r0
            tp6 r2 = r2.p0
            if (r0 == 0) goto L35b
            gy1 r1 = new gy1
            r1.<init>(r0)
            r2.getClass()
            r2.m(r8, r1)
            goto L366
        L35b:
            by1 r0 = new by1
            r0.<init>(r1)
            r2.getClass()
            r2.m(r8, r0)
        L366:
            jg7 r8 = defpackage.jg7.a
        L368:
            return r8
        L369:
            java.lang.Object r1 = r0.d0
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r2 = r0.Z
            sz1 r2 = (defpackage.sz1) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            if (r4 == 0) goto L385
            if (r4 != r7) goto L37f
            defpackage.oi2.Y(r20)
            r0 = r20
            goto L396
        L37f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L3bc
        L385:
            defpackage.oi2.Y(r20)
            p06 r4 = r2.e
            r0.Y = r7
            xb2 r4 = (defpackage.xb2) r4
            java.lang.Object r0 = r4.l(r1, r0)
            if (r0 != r3) goto L396
            r8 = r3
            goto L3bc
        L396:
            pq5 r0 = (defpackage.pq5) r0
            tp6 r2 = r2.p0
            if (r0 == 0) goto L3a8
            gy1 r1 = new gy1
            r1.<init>(r0)
            r2.getClass()
            r2.m(r8, r1)
            goto L3ba
        L3a8:
            by1 r0 = new by1
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r0.<init>(r1)
            r2.getClass()
            r2.m(r8, r0)
        L3ba:
            jg7 r8 = defpackage.jg7.a
        L3bc:
            return r8
        L3bd:
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r0.d0
            me.magnum.melonds.domain.model.ConsoleType r2 = (me.magnum.melonds.domain.model.ConsoleType) r2
            java.lang.Object r3 = r0.Z
            sz1 r3 = (defpackage.sz1) r3
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r0.Y
            if (r9 == 0) goto L3d9
            if (r9 != r7) goto L3d3
            defpackage.oi2.Y(r20)
            goto L404
        L3d3:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L40f
        L3d9:
            defpackage.oi2.Y(r20)
            yx1 r9 = new yx1
            r9.<init>(r8)
            defpackage.sz1.T(r3, r9)
            qx1 r9 = new qx1
            r9.<init>(r2)
            r0.Y = r7
            kd6 r0 = r3.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r7 = "ra_hardcore_enabled"
            r0.getBoolean(r7, r6)
            sx1 r0 = r3.w
            r0.b = r6
            r0.a = r6
            r0.d = r6
            r0.e = r9
            if (r1 != r5) goto L404
            r8 = r5
            goto L40f
        L404:
            o41 r0 = r3.z
            y12 r5 = new y12
            r5.<init>(r3, r2, r8)
            defpackage.hv.L(r0, r8, r8, r5, r4)
            r8 = r1
        L40f:
            return r8
        L410:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L422
            if (r2 == r7) goto L41e
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L447
        L41e:
            defpackage.oi2.Y(r20)
            goto L444
        L422:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r0.Z
            bt r2 = (defpackage.bt) r2
            java.lang.Object r4 = r2.B
            lz0 r4 = (defpackage.lz0) r4
            de5 r4 = r4.d
            zb0 r5 = new zb0
            java.lang.Object r6 = r0.d0
            android.os.Vibrator r6 = (android.os.Vibrator) r6
            r5.<init>(r3, r2, r6)
            r0.Y = r7
            rp6 r2 = r4.A
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L444
            r8 = r1
            goto L447
        L444:
            defpackage.e41.c()
        L447:
            return r8
        L448:
            java.lang.Object r1 = r0.Z
            vw1 r1 = (defpackage.vw1) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L462
            if (r3 != r7) goto L45c
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L45a
            r0 = r20
            goto L475
        L45a:
            r0 = move-exception
            goto L478
        L45c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L4a7
        L462:
            defpackage.oi2.Y(r20)
            s9 r3 = r1.b     // Catch: java.lang.Throwable -> L45a
            java.lang.Object r4 = r0.d0     // Catch: java.lang.Throwable -> L45a
            pq5 r4 = (defpackage.pq5) r4     // Catch: java.lang.Throwable -> L45a
            r0.Y = r7     // Catch: java.lang.Throwable -> L45a
            java.lang.Object r0 = r3.p(r4, r0)     // Catch: java.lang.Throwable -> L45a
            if (r0 != r2) goto L475
            r8 = r2
            goto L4a7
        L475:
            wx5 r0 = (defpackage.wx5) r0     // Catch: java.lang.Throwable -> L45a
            goto L495
        L478:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L4a8
            java.lang.String r2 = "LaunchValidationVM"
            java.lang.String r3 = "ROM launch precondition check failed; blocking launch"
            android.util.Log.e(r2, r3, r0)
            qx5 r0 = new qx5
            me.magnum.melonds.domain.model.ConsoleType r2 = me.magnum.melonds.domain.model.ConsoleType.DS
            dz0 r3 = new dz0
            cz0 r4 = defpackage.cz0.INVALID
            java.lang.String[] r5 = new java.lang.String[r6]
            vr4[] r6 = new defpackage.vr4[r6]
            r3.<init>(r2, r4, r5, r6)
            r0.<init>(r3)
        L495:
            of6 r2 = r1.d
            gj3 r3 = new gj3
            r3.<init>(r0)
            r2.k(r3)
            boolean r0 = r0 instanceof defpackage.vx5
            if (r0 == 0) goto L4a5
            r1.f = r8
        L4a5:
            jg7 r8 = defpackage.jg7.a
        L4a7:
            return r8
        L4a8:
            throw r0
        L4a9:
            java.lang.Object r1 = r0.d0
            me.magnum.melonds.domain.model.ConsoleType r1 = (me.magnum.melonds.domain.model.ConsoleType) r1
            java.lang.Object r2 = r0.Z
            vw1 r2 = (defpackage.vw1) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            if (r4 == 0) goto L4c7
            if (r4 != r7) goto L4c1
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L4bf
            r0 = r20
            goto L4d6
        L4bf:
            r0 = move-exception
            goto L4d9
        L4c1:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L506
        L4c7:
            defpackage.oi2.Y(r20)
            s9 r4 = r2.b     // Catch: java.lang.Throwable -> L4bf
            r0.Y = r7     // Catch: java.lang.Throwable -> L4bf
            java.lang.Object r0 = r4.n(r1, r0)     // Catch: java.lang.Throwable -> L4bf
            if (r0 != r3) goto L4d6
            r8 = r3
            goto L506
        L4d6:
            yc2 r0 = (defpackage.yc2) r0     // Catch: java.lang.Throwable -> L4bf
            goto L4f4
        L4d9:
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L507
            java.lang.String r3 = "LaunchValidationVM"
            java.lang.String r4 = "Firmware launch precondition check failed; blocking launch"
            android.util.Log.e(r3, r4, r0)
            uc2 r0 = new uc2
            dz0 r3 = new dz0
            cz0 r4 = defpackage.cz0.INVALID
            java.lang.String[] r5 = new java.lang.String[r6]
            vr4[] r6 = new defpackage.vr4[r6]
            r3.<init>(r1, r4, r5, r6)
            r0.<init>(r3)
        L4f4:
            of6 r1 = r2.d
            fj3 r3 = new fj3
            r3.<init>(r0)
            r1.k(r3)
            boolean r0 = r0 instanceof defpackage.xc2
            if (r0 == 0) goto L504
            r2.f = r8
        L504:
            jg7 r8 = defpackage.jg7.a
        L506:
            return r8
        L507:
            throw r0
        L508:
            java.lang.Object r1 = r0.d0
            s9 r1 = (defpackage.s9) r1
            java.lang.Object r2 = r1.e
            kd6 r2 = (defpackage.kd6) r2
            me.magnum.melonds.MelonDSAndroidInterface r3 = me.magnum.melonds.MelonDSAndroidInterface.a
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r0.Y
            if (r5 == 0) goto L52b
            if (r5 != r7) goto L525
            java.lang.Object r0 = r0.Z
            yr7 r0 = (defpackage.yr7) r0
            defpackage.oi2.Y(r20)
            r1 = r0
            r0 = r20
            goto L562
        L525:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L583
        L52b:
            defpackage.oi2.Y(r20)
            java.lang.Object r1 = r1.a
            android.content.Context r1 = (android.content.Context) r1
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.nativeLibraryDir
            r1.getClass()
            r5 = r2
            ng6 r5 = (defpackage.ng6) r5
            yq7 r1 = r5.z(r1)
            r3.b(r1)
            yr7 r1 = me.magnum.melonds.domain.model.VulkanPipelineProfile.Companion
            ng6 r2 = (defpackage.ng6) r2
            java.lang.String r5 = "video_vulkan_fastpath_enabled"
            tf6 r6 = new tf6
            r9 = 18
            r6.<init>(r2, r9)
            wp0 r2 = r2.p(r5, r6)
            r0.Z = r1
            r0.Y = r7
            java.lang.Object r0 = defpackage.f04.B(r2, r0)
            if (r0 != r4) goto L562
            r8 = r4
            goto L583
        L562:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.getClass()
            if (r0 == 0) goto L570
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.FASTPATH
            goto L572
        L570:
            me.magnum.melonds.domain.model.VulkanPipelineProfile r0 = me.magnum.melonds.domain.model.VulkanPipelineProfile.COMPATIBILITY
        L572:
            boolean r1 = r3.c()
            if (r1 != 0) goto L57b
            nw1 r8 = defpackage.nw1.UNSUPPORTED
            goto L583
        L57b:
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L583
            nw1 r8 = defpackage.nw1.INIT_FAILED
        L583:
            return r8
        L584:
            jg7 r1 = defpackage.jg7.a
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L599
            if (r3 != r7) goto L593
            defpackage.oi2.Y(r20)
        L591:
            r8 = r1
            goto L5c7
        L593:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L5c7
        L599:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r0.Z
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r3
            int r4 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r3 = r3.W()
            be5 r3 = r3.G0
            xv1 r4 = new xv1
            java.lang.Object r5 = r0.d0
            nx1 r5 = (defpackage.nx1) r5
            r4.<init>(r5, r6)
            r0.Y = r7
            a7 r5 = new a7
            r6 = 11
            r5.<init>(r4, r6)
            kf6 r3 = r3.A
            java.lang.Object r0 = r3.b(r5, r0)
            if (r0 != r2) goto L5c3
            goto L5c4
        L5c3:
            r0 = r1
        L5c4:
            if (r0 != r2) goto L591
            r8 = r2
        L5c7:
            return r8
        L5c8:
            java.lang.String r1 = "emulatorLaunchValidatorDelegate"
            java.lang.String r9 = "binding"
            java.lang.Object r10 = r0.d0
            me.magnum.melonds.ui.emulator.EmulatorActivity r10 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r10
            vs4 r11 = r10.H1
            vs4 r12 = r10.I1
            bt r13 = r10.V1
            vs4 r14 = r10.G1
            java.lang.Object r15 = r0.Z
            hy1 r15 = (defpackage.hy1) r15
            r16 = r5
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            r17 = r6
            int r6 = r0.Y
            if (r6 == 0) goto L5f4
            if (r6 != r7) goto L5ed
            defpackage.oi2.Y(r20)
            goto L929
        L5ed:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto Lb7a
        L5f4:
            defpackage.oi2.Y(r20)
            boolean r6 = r15 instanceof defpackage.ey1
            if (r6 == 0) goto L63e
            s8 r0 = r10.B0
            if (r0 == 0) goto L63a
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r0.m
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto L636
            android.widget.TextView r0 = r0.i
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L632
            android.widget.TextView r0 = r0.j
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L62e
            android.widget.ProgressBar r0 = r0.g
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L62a
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r2)
            goto Lb68
        L62a:
            defpackage.nb3.a0(r9)
            throw r8
        L62e:
            defpackage.nb3.a0(r9)
            throw r8
        L632:
            defpackage.nb3.a0(r9)
            throw r8
        L636:
            defpackage.nb3.a0(r9)
            throw r8
        L63a:
            defpackage.nb3.a0(r9)
            throw r8
        L63e:
            boolean r6 = r15 instanceof defpackage.fy1
            r18 = r7
            r7 = 5
            if (r6 == 0) goto L670
            me.magnum.melonds.ui.emulator.EmulatorActivity.C(r10)
            s9 r0 = r10.Q0
            if (r0 == 0) goto L66c
            fy1 r15 = (defpackage.fy1) r15
            me.magnum.melonds.domain.model.ConsoleType r1 = r15.a
            r1.getClass()
            vw1 r0 = r0.A()
            tw1 r2 = new tw1
            r2.<init>(r1)
            r0.f = r2
            as0 r2 = defpackage.to7.a(r0)
            xd1 r3 = new xd1
            r3.<init>(r0, r1, r8, r7)
            defpackage.hv.L(r2, r8, r8, r3, r4)
            goto Lb68
        L66c:
            defpackage.nb3.a0(r1)
            throw r8
        L670:
            boolean r6 = r15 instanceof defpackage.gy1
            if (r6 == 0) goto L768
            gy1 r15 = (defpackage.gy1) r15
            pq5 r0 = r15.a
            jt5 r2 = r0.f
            java.lang.String r5 = r0.a
            java.lang.String r2 = r2.e
            if (r2 != 0) goto L681
            r2 = r5
        L681:
            r12.setValue(r2)
            vs4 r2 = r10.J1
            r2.setValue(r0)
            vs4 r2 = r10.K1
            r2.setValue(r8)
            boolean r2 = r0.c()
            if (r2 == 0) goto L6e6
            java.lang.Long r2 = r0.l
            if (r2 == 0) goto L69d
            long r6 = r2.longValue()
            goto L69f
        L69d:
            r6 = 0
        L69f:
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r11
            int r2 = (int) r6
            int r6 = r2 >>> 24
            byte r6 = (byte) r6
            int r7 = r2 >>> 16
            byte r7 = (byte) r7
            int r9 = r2 >>> 8
            byte r9 = (byte) r9
            byte r2 = (byte) r2
            byte[] r3 = new byte[r3]
            r3[r17] = r6
            r3[r18] = r7
            r3[r16] = r9
            r3[r4] = r2
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2.getClass()
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r6.length()
            r7 = r17
        L6cf:
            if (r7 >= r3) goto L6e1
            char r9 = r6.charAt(r7)
            boolean r11 = java.lang.Character.isLetterOrDigit(r9)
            if (r11 == 0) goto L6de
            r2.append(r9)
        L6de:
            int r7 = r7 + 1
            goto L6cf
        L6e1:
            java.lang.String r2 = r2.toString()
            goto L70b
        L6e6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r6 = r5.length()
            r7 = r17
        L6f1:
            if (r7 >= r6) goto L703
            char r9 = r5.charAt(r7)
            boolean r11 = java.lang.Character.isLetterOrDigit(r9)
            if (r11 == 0) goto L700
            r2.append(r9)
        L700:
            int r7 = r7 + 1
            goto L6f1
        L703:
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = defpackage.qs6.S0(r3, r2)
        L70b:
            hq2 r3 = r10.V()
            java.lang.String r6 = r0.i
            r3.r = r5
            r3.s = r2
            r3.t = r6
            java.lang.String r7 = "GameTranslatorManager"
            java.lang.String r9 = "Active ROM set: title='"
            java.lang.String r11 = "', code='"
            java.lang.String r12 = "', hash='"
            java.lang.StringBuilder r2 = defpackage.i61.u(r9, r5, r11, r2, r12)
            r2.append(r6)
            java.lang.String r5 = "'"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r7, r2)
            r3.e()
            au3 r2 = defpackage.bl2.C(r10)
            b0 r3 = new b0
            r5 = 26
            r3.<init>(r10, r0, r8, r5)
            defpackage.hv.L(r2, r8, r8, r3, r4)
            me.magnum.melonds.ui.emulator.EmulatorActivity.C(r10)
            s9 r2 = r10.Q0
            if (r2 == 0) goto L764
            vw1 r1 = r2.A()
            uw1 r2 = new uw1
            r2.<init>(r0)
            r1.f = r2
            as0 r2 = defpackage.to7.a(r1)
            xd1 r3 = new xd1
            r5 = 6
            r3.<init>(r1, r0, r8, r5)
            defpackage.hv.L(r2, r8, r8, r3, r4)
            goto Lb68
        L764:
            defpackage.nb3.a0(r1)
            throw r8
        L768:
            boolean r1 = r15 instanceof defpackage.yx1
            if (r1 != 0) goto L9de
            boolean r6 = r15 instanceof defpackage.zx1
            if (r6 == 0) goto L772
            goto L9de
        L772:
            boolean r1 = r15 instanceof defpackage.dy1
            if (r1 != 0) goto L91a
            boolean r1 = r15 instanceof defpackage.cy1
            if (r1 == 0) goto L77c
            goto L91a
        L77c:
            boolean r0 = r15 instanceof defpackage.ay1
            r1 = 2131952357(0x7f1302e5, float:1.9541154E38)
            if (r0 == 0) goto L7fb
            s8 r0 = r10.B0
            if (r0 == 0) goto L7f7
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r0.m
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto L7f3
            android.widget.TextView r0 = r0.i
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L7ef
            android.widget.TextView r0 = r0.j
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L7eb
            android.widget.ProgressBar r0 = r0.g
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L7e7
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.setValue(r0)
            c92 r0 = r10.K0
            if (r0 == 0) goto L7bc
            r0.a(r8)
        L7bc:
            ex1 r0 = defpackage.ex1.ROM_LOAD_ERROR_DIALOG
            r13.z(r0)
            zb r0 = new zb
            r0.<init>(r10)
            java.lang.Object r2 = r0.L
            wb r2 = (defpackage.wb) r2
            r4 = r17
            r2.m = r4
            r2 = 2131951952(0x7f130150, float:1.9540333E38)
            r0.z(r2)
            r2 = 2131951953(0x7f130151, float:1.9540335E38)
            r0.w(r2)
            fu1 r2 = new fu1
            r2.<init>(r10, r3)
            r0.y(r1, r2)
            r0.B()
            goto Lb68
        L7e7:
            defpackage.nb3.a0(r9)
            throw r8
        L7eb:
            defpackage.nb3.a0(r9)
            throw r8
        L7ef:
            defpackage.nb3.a0(r9)
            throw r8
        L7f3:
            defpackage.nb3.a0(r9)
            throw r8
        L7f7:
            defpackage.nb3.a0(r9)
            throw r8
        L7fb:
            boolean r0 = r15 instanceof defpackage.xx1
            if (r0 == 0) goto L889
            s8 r0 = r10.B0
            if (r0 == 0) goto L885
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r0.m
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto L881
            android.widget.TextView r0 = r0.i
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L87d
            android.widget.TextView r0 = r0.j
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L879
            android.widget.ProgressBar r0 = r0.g
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L875
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.setValue(r0)
            c92 r0 = r10.K0
            if (r0 == 0) goto L838
            r0.a(r8)
        L838:
            xx1 r15 = (defpackage.xx1) r15
            ex1 r0 = defpackage.ex1.FIRMWARE_LOAD_ERROR_DIALOG
            r13.z(r0)
            zb r0 = new zb
            r0.<init>(r10)
            java.lang.Object r2 = r0.L
            wb r2 = (defpackage.wb) r2
            r3 = 0
            r2.m = r3
            r3 = 2131951949(0x7f13014d, float:1.9540327E38)
            r0.z(r3)
            android.content.res.Resources r3 = r10.getResources()
            me.magnum.melonds.MelonEmulator$a r5 = r15.a
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = 2131951950(0x7f13014e, float:1.9540329E38)
            java.lang.String r3 = r3.getString(r6, r5)
            r2.f = r3
            fu1 r2 = new fu1
            r2.<init>(r10, r4)
            r0.y(r1, r2)
            r0.B()
            goto Lb68
        L875:
            defpackage.nb3.a0(r9)
            throw r8
        L879:
            defpackage.nb3.a0(r9)
            throw r8
        L87d:
            defpackage.nb3.a0(r9)
            throw r8
        L881:
            defpackage.nb3.a0(r9)
            throw r8
        L885:
            defpackage.nb3.a0(r9)
            throw r8
        L889:
            boolean r0 = r15 instanceof defpackage.by1
            if (r0 == 0) goto L915
            s8 r0 = r10.B0
            if (r0 == 0) goto L911
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r0.m
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto L90d
            android.widget.TextView r0 = r0.i
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L909
            android.widget.TextView r0 = r0.j
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L905
            android.widget.ProgressBar r0 = r0.g
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L901
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.setValue(r0)
            c92 r0 = r10.K0
            if (r0 == 0) goto L8c6
            r0.a(r8)
        L8c6:
            by1 r15 = (defpackage.by1) r15
            java.lang.String r0 = r15.a
            ex1 r2 = defpackage.ex1.ROM_NOT_FOUND_DIALOG
            r13.z(r2)
            zb r2 = new zb
            r2.<init>(r10)
            r3 = 2131951956(0x7f130154, float:1.9540341E38)
            r2.z(r3)
            r3 = 2131951957(0x7f130155, float:1.9540343E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r10.getString(r3, r0)
            java.lang.Object r3 = r2.L
            wb r3 = (defpackage.wb) r3
            r3.f = r0
            fu1 r0 = new fu1
            r5 = r16
            r0.<init>(r10, r5)
            r2.y(r1, r0)
            ku1 r0 = new ku1
            r0.<init>(r10, r4)
            r3.o = r0
            r2.B()
            goto Lb68
        L901:
            defpackage.nb3.a0(r9)
            throw r8
        L905:
            defpackage.nb3.a0(r9)
            throw r8
        L909:
            defpackage.nb3.a0(r9)
            throw r8
        L90d:
            defpackage.nb3.a0(r9)
            throw r8
        L911:
            defpackage.nb3.a0(r9)
            throw r8
        L915:
            defpackage.i.d()
            goto Lb7a
        L91a:
            r0.Z = r15
            r1 = r18
            r0.Y = r1
            java.lang.Object r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.B(r10, r0)
            if (r0 != r5) goto L929
            r8 = r5
            goto Lb7a
        L929:
            boolean r0 = r15 instanceof defpackage.dy1
            if (r0 == 0) goto L930
            dy1 r15 = (defpackage.dy1) r15
            goto L931
        L930:
            r15 = r8
        L931:
            if (r15 == 0) goto L940
            pq5 r0 = r15.a
            jt5 r1 = r0.f
            java.lang.String r1 = r1.e
            if (r1 != 0) goto L93d
            java.lang.String r1 = r0.a
        L93d:
            r12.setValue(r1)
        L940:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.setValue(r0)
            c92 r0 = r10.K0
            if (r0 == 0) goto L951
            r0.a(r8)
        L951:
            r10.r0()
            r10.p0()
            r10.q0()
            s8 r0 = r10.B0
            if (r0 == 0) goto L9da
            android.widget.TextView r0 = r0.j
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L9d6
            android.widget.ProgressBar r0 = r0.g
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L9d2
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto L9ce
            me.magnum.melonds.ui.emulator.EmulatorSurfaceView r0 = r0.h
            r3 = 0
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto L9ca
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r0 = r0.m
            r0.setVisibility(r3)
            d00 r0 = r10.v1
            r1 = 1
            r0.f(r1)
            r10.o0()
            boolean r0 = r13.M()
            if (r0 != 0) goto Lb68
            sz1 r0 = r10.W()
            java.util.concurrent.atomic.AtomicInteger r1 = r0.j0
            int r1 = r1.get()
            if (r1 != 0) goto Lb68
            eb r1 = r0.h0
            java.lang.Object r1 = r1.R
            tp6 r1 = (defpackage.tp6) r1
            java.lang.Object r1 = r1.getValue()
            uc5 r2 = defpackage.uc5.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto Lb68
            s35 r0 = r0.V
            java.lang.Object r0 = r0.A
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.get()
            if (r0 != 0) goto Lb68
            sz1 r0 = r10.W()
            r0.T0()
            goto Lb68
        L9ca:
            defpackage.nb3.a0(r9)
            throw r8
        L9ce:
            defpackage.nb3.a0(r9)
            throw r8
        L9d2:
            defpackage.nb3.a0(r9)
            throw r8
        L9d6:
            defpackage.nb3.a0(r9)
            throw r8
        L9da:
            defpackage.nb3.a0(r9)
            throw r8
        L9de:
            me.magnum.melonds.ui.emulator.EmulatorActivity.C(r10)
            boolean r0 = r15 instanceof defpackage.zx1
            if (r0 == 0) goto L9eb
            r1 = r15
            zx1 r1 = (defpackage.zx1) r1
            xq7 r1 = r1.a
            goto L9f2
        L9eb:
            if (r1 == 0) goto Lb77
            r1 = r15
            yx1 r1 = (defpackage.yx1) r1
            xq7 r1 = r1.a
        L9f2:
            if (r0 == 0) goto L9f7
            zx1 r15 = (defpackage.zx1) r15
            goto L9f8
        L9f7:
            r15 = r8
        L9f8:
            if (r15 == 0) goto L9fd
            in5 r0 = r15.b
            goto L9fe
        L9fd:
            r0 = r8
        L9fe:
            vs4 r5 = r10.M1
            java.lang.Object r6 = r11.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Lb4d
            sz1 r6 = r10.W()
            de5 r6 = r6.q0
            rp6 r6 = r6.A
            java.lang.Object r6 = r6.getValue()
            boolean r6 = r6 instanceof defpackage.dy1
            if (r6 != 0) goto Lb4d
            sz1 r6 = r10.W()
            de5 r6 = r6.q0
            rp6 r6 = r6.A
            java.lang.Object r6 = r6.getValue()
            boolean r6 = r6 instanceof defpackage.cy1
            if (r6 == 0) goto La2e
            goto Lb4d
        La2e:
            in5 r6 = defpackage.in5.FETCHING_LATEST_DATA
            if (r0 != r6) goto La84
            s8 r0 = r10.B0
            if (r0 == 0) goto La80
            android.widget.TextView r0 = r0.j
            r1 = 2131952028(0x7f13019c, float:1.9540487E38)
            r0.setText(r1)
            s8 r0 = r10.B0
            if (r0 == 0) goto La7c
            android.widget.ProgressBar r0 = r0.g
            r3 = 0
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto La78
            android.widget.ProgressBar r0 = r0.g
            r2 = 1
            r0.setIndeterminate(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto La74
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto La70
            android.widget.TextView r0 = r0.k
            r2 = 2131952027(0x7f13019b, float:1.9540485E38)
            r0.setText(r2)
            java.lang.String r0 = r10.getString(r1)
            r5.setValue(r0)
            goto Lb68
        La70:
            defpackage.nb3.a0(r9)
            throw r8
        La74:
            defpackage.nb3.a0(r9)
            throw r8
        La78:
            defpackage.nb3.a0(r9)
            throw r8
        La7c:
            defpackage.nb3.a0(r9)
            throw r8
        La80:
            defpackage.nb3.a0(r9)
            throw r8
        La84:
            if (r1 == 0) goto Lb0c
            int r0 = r1.a
            int r1 = r1.c
            if (r1 > 0) goto La8e
            goto Lb0c
        La8e:
            s8 r1 = r10.B0
            if (r1 == 0) goto Lb08
            android.widget.TextView r1 = r1.j
            r2 = 2131952037(0x7f1301a5, float:1.9540505E38)
            r6 = 2131952029(0x7f13019d, float:1.954049E38)
            if (r0 != r7) goto La9e
            r11 = r6
            goto La9f
        La9e:
            r11 = r2
        La9f:
            r1.setText(r11)
            s8 r1 = r10.B0
            if (r1 == 0) goto Lb04
            android.widget.ProgressBar r1 = r1.g
            r11 = 0
            r1.setVisibility(r11)
            s8 r1 = r10.B0
            if (r1 == 0) goto Lb00
            android.widget.ProgressBar r1 = r1.g
            r12 = 1
            r1.setIndeterminate(r12)
            s8 r1 = r10.B0
            if (r1 == 0) goto Lafc
            android.widget.TextView r1 = r1.k
            r1.setVisibility(r11)
            s8 r1 = r10.B0
            if (r1 == 0) goto Laf8
            android.widget.TextView r1 = r1.k
            r8 = 2131952032(0x7f1301a0, float:1.9540495E38)
            if (r0 == r12) goto Lae3
            r9 = 2
            if (r0 == r9) goto Lae0
            if (r0 == r4) goto Ladc
            if (r0 == r3) goto Lad8
            if (r0 == r7) goto Lad4
            goto Lae3
        Lad4:
            r8 = 2131952035(0x7f1301a3, float:1.9540501E38)
            goto Lae3
        Lad8:
            r8 = 2131952036(0x7f1301a4, float:1.9540503E38)
            goto Lae3
        Ladc:
            r8 = 2131952033(0x7f1301a1, float:1.9540497E38)
            goto Lae3
        Lae0:
            r8 = 2131952034(0x7f1301a2, float:1.95405E38)
        Lae3:
            java.lang.String r3 = r10.getString(r8)
            r3.getClass()
            r1.setText(r3)
            if (r0 != r7) goto Laf0
            r2 = r6
        Laf0:
            java.lang.String r0 = r10.getString(r2)
            r5.setValue(r0)
            goto Lb68
        Laf8:
            defpackage.nb3.a0(r9)
            throw r8
        Lafc:
            defpackage.nb3.a0(r9)
            throw r8
        Lb00:
            defpackage.nb3.a0(r9)
            throw r8
        Lb04:
            defpackage.nb3.a0(r9)
            throw r8
        Lb08:
            defpackage.nb3.a0(r9)
            throw r8
        Lb0c:
            s8 r0 = r10.B0
            if (r0 == 0) goto Lb49
            android.widget.TextView r0 = r0.j
            r1 = 2131952024(0x7f130198, float:1.954048E38)
            r0.setText(r1)
            s8 r0 = r10.B0
            if (r0 == 0) goto Lb45
            android.widget.ProgressBar r0 = r0.g
            r3 = 0
            r0.setVisibility(r3)
            s8 r0 = r10.B0
            if (r0 == 0) goto Lb41
            android.widget.ProgressBar r0 = r0.g
            r12 = 1
            r0.setIndeterminate(r12)
            s8 r0 = r10.B0
            if (r0 == 0) goto Lb3d
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r2)
            java.lang.String r0 = r10.getString(r1)
            r5.setValue(r0)
            goto Lb68
        Lb3d:
            defpackage.nb3.a0(r9)
            throw r8
        Lb41:
            defpackage.nb3.a0(r9)
            throw r8
        Lb45:
            defpackage.nb3.a0(r9)
            throw r8
        Lb49:
            defpackage.nb3.a0(r9)
            throw r8
        Lb4d:
            s8 r0 = r10.B0
            if (r0 == 0) goto Lb73
            android.widget.TextView r0 = r0.j
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto Lb6f
            android.widget.ProgressBar r0 = r0.g
            r0.setVisibility(r2)
            s8 r0 = r10.B0
            if (r0 == 0) goto Lb6b
            android.widget.TextView r0 = r0.k
            r0.setVisibility(r2)
        Lb68:
            jg7 r8 = defpackage.jg7.a
            goto Lb7a
        Lb6b:
            defpackage.nb3.a0(r9)
            throw r8
        Lb6f:
            defpackage.nb3.a0(r9)
            throw r8
        Lb73:
            defpackage.nb3.a0(r9)
            throw r8
        Lb77:
            defpackage.i.d()
        Lb7a:
            return r8
        Lb7b:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r12 = 1
            if (r2 == 0) goto Lb8e
            if (r2 != r12) goto Lb88
            defpackage.oi2.Y(r20)
            goto Lba3
        Lb88:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto Lba5
        Lb8e:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r0.Z
            ie2 r2 = (defpackage.ie2) r2
            java.lang.Object r3 = r0.d0
            t93 r3 = (defpackage.t93) r3
            r0.Y = r12
            java.lang.Object r0 = r2.a(r3, r0)
            if (r0 != r1) goto Lba3
            r8 = r1
            goto Lba5
        Lba3:
            jg7 r8 = defpackage.jg7.a
        Lba5:
            return r8
        Lba6:
            jg7 r1 = defpackage.jg7.a
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            r12 = 1
            if (r3 == 0) goto Lbbc
            if (r3 != r12) goto Lbb6
            defpackage.oi2.Y(r20)
        Lbb4:
            r8 = r1
            goto Lbd3
        Lbb6:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto Lbd3
        Lbbc:
            defpackage.oi2.Y(r20)
            java.lang.Object r3 = r0.Z
            ie2 r3 = (defpackage.ie2) r3
            r0.Y = r12
            r3.getClass()
            java.lang.Object r0 = r3.b(r0)
            if (r0 != r2) goto Lbcf
            goto Lbd0
        Lbcf:
            r0 = r1
        Lbd0:
            if (r0 != r2) goto Lbb4
            r8 = r2
        Lbd3:
            return r8
    }
}
