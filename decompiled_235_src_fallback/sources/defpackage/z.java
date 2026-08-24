package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z  reason: default package */
/* loaded from: classes.dex */
public final class z extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ z(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ z(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    public z(defpackage.r41 r2, defpackage.qn2 r3, defpackage.m16 r4) {
            r1 = this;
            r0 = 28
            r1.X = r0
            r1.Z = r4
            r1.d0 = r3
            r3 = 2
            r1.<init>(r3, r2)
            return
    }

    private final java.lang.Object v(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.d0
            c81 r0 = (defpackage.c81) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r11.Y
            r3 = 0
            r4 = 500(0x1f4, double:2.47E-321)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r2 == 0) goto L34
            if (r2 == r10) goto L30
            if (r2 == r9) goto L2c
            if (r2 == r8) goto L28
            if (r2 != r7) goto L21
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L1f
            goto L75
        L1f:
            r11 = move-exception
            goto L7b
        L21:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L28:
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L1f
            goto L67
        L2c:
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L1f
            goto L58
        L30:
            defpackage.oi2.Y(r12)
            goto L46
        L34:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.Z
            rc3 r12 = (defpackage.rc3) r12
            if (r12 == 0) goto L46
            r11.Y = r10
            java.lang.Object r12 = defpackage.yh2.n(r12, r11)
            if (r12 != r1) goto L46
            goto L74
        L46:
            rs4 r12 = r0.c     // Catch: java.lang.Throwable -> L1f
            r12.i(r6)     // Catch: java.lang.Throwable -> L1f
            boolean r12 = r0.a     // Catch: java.lang.Throwable -> L1f
            if (r12 != 0) goto L5e
            r11.Y = r9     // Catch: java.lang.Throwable -> L1f
            x61 r11 = defpackage.q60.j(r11)     // Catch: java.lang.Throwable -> L1f
            if (r11 != r1) goto L58
            goto L74
        L58:
            ug r11 = new ug     // Catch: java.lang.Throwable -> L1f
            r11.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r11     // Catch: java.lang.Throwable -> L1f
        L5e:
            r11.Y = r8     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r12 = defpackage.q60.t(r4, r11)     // Catch: java.lang.Throwable -> L1f
            if (r12 != r1) goto L67
            goto L74
        L67:
            rs4 r12 = r0.c     // Catch: java.lang.Throwable -> L1f
            r12.i(r3)     // Catch: java.lang.Throwable -> L1f
            r11.Y = r7     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r12 = defpackage.q60.t(r4, r11)     // Catch: java.lang.Throwable -> L1f
            if (r12 != r1) goto L75
        L74:
            return r1
        L75:
            rs4 r12 = r0.c     // Catch: java.lang.Throwable -> L1f
            r12.i(r6)     // Catch: java.lang.Throwable -> L1f
            goto L5e
        L7b:
            rs4 r12 = r0.c
            r12.i(r3)
            throw r11
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
            pq5 r3 = (defpackage.pq5) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L52:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L61:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L70:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L7f:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L8e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L9d:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lac:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lbb:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lca:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Ld9:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Le8:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lf7:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L106:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L115:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L124:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L133:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L142:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L151:
            z23 r3 = (defpackage.z23) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L160:
            android.net.Uri r3 = (android.net.Uri) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16f:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L17e:
            v63 r3 = (defpackage.v63) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L18d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L19c:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1ab:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L1ba:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            z r2 = (defpackage.z) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            java.lang.Object r1 = r2.d0
            switch(r0) {
                case 0: goto L176;
                case 1: goto L169;
                case 2: goto L15c;
                case 3: goto L14f;
                case 4: goto L144;
                case 5: goto L139;
                case 6: goto L12e;
                case 7: goto L123;
                case 8: goto L117;
                case 9: goto L109;
                case 10: goto Lfd;
                case 11: goto Lf1;
                case 12: goto Le5;
                case 13: goto Ld9;
                case 14: goto Lcd;
                case 15: goto Lbf;
                case 16: goto Lb1;
                case 17: goto La3;
                case 18: goto L97;
                case 19: goto L8b;
                case 20: goto L7d;
                case 21: goto L6f;
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
            z r2 = new z
            xa1 r1 = (defpackage.xa1) r1
            r0 = 29
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L13:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            m16 r2 = (defpackage.m16) r2
            qn2 r1 = (defpackage.qn2) r1
            r4.<init>(r3, r1, r2)
            return r4
        L1f:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            rc3 r2 = (defpackage.rc3) r2
            c81 r1 = (defpackage.c81) r1
            r0 = 27
            r4.<init>(r2, r1, r3, r0)
            return r4
        L2d:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            zy4 r2 = (defpackage.zy4) r2
            p27 r1 = (defpackage.p27) r1
            r0 = 26
            r4.<init>(r2, r1, r3, r0)
            return r4
        L3b:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            eo2 r2 = (defpackage.eo2) r2
            dh5 r1 = (defpackage.dh5) r1
            r0 = 25
            r4.<init>(r2, r1, r3, r0)
            return r4
        L49:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            eo2 r2 = (defpackage.eo2) r2
            rz4 r1 = (defpackage.rz4) r1
            r0 = 24
            r4.<init>(r2, r1, r3, r0)
            return r4
        L57:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            dx0 r2 = (defpackage.dx0) r2
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 23
            r4.<init>(r2, r1, r3, r0)
            return r4
        L65:
            z r2 = new z
            ax0 r1 = (defpackage.ax0) r1
            r4 = 22
            r2.<init>(r1, r3, r4)
            return r2
        L6f:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            aq0 r2 = (defpackage.aq0) r2
            me.magnum.melonds.domain.model.Cheat r1 = (me.magnum.melonds.domain.model.Cheat) r1
            r0 = 21
            r4.<init>(r2, r1, r3, r0)
            return r4
        L7d:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            aq0 r2 = (defpackage.aq0) r2
            jh1 r1 = (defpackage.jh1) r1
            r0 = 20
            r4.<init>(r2, r1, r3, r0)
            return r4
        L8b:
            z r2 = new z
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0 = 19
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L97:
            z r2 = new z
            aq0 r1 = (defpackage.aq0) r1
            r0 = 18
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        La3:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            me.magnum.melonds.common.workers.CheatImportWorker r2 = (me.magnum.melonds.common.workers.CheatImportWorker) r2
            cp2 r1 = (defpackage.cp2) r1
            r0 = 17
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lb1:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            me.magnum.melonds.common.workers.CheatImportWorker r2 = (me.magnum.melonds.common.workers.CheatImportWorker) r2
            java.lang.String r1 = (java.lang.String) r1
            r0 = 16
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lbf:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            le2 r2 = (defpackage.le2) r2
            pb6 r1 = (defpackage.pb6) r1
            r0 = 15
            r4.<init>(r2, r1, r3, r0)
            return r4
        Lcd:
            z r2 = new z
            xl0 r1 = (defpackage.xl0) r1
            r0 = 14
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        Ld9:
            z r2 = new z
            wl0 r1 = (defpackage.wl0) r1
            r0 = 13
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        Le5:
            z r2 = new z
            ed0 r1 = (defpackage.ed0) r1
            r0 = 12
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        Lf1:
            z r2 = new z
            sc0 r1 = (defpackage.sc0) r1
            r0 = 11
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        Lfd:
            z r2 = new z
            eb r1 = (defpackage.eb) r1
            r0 = 10
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L109:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            w70 r2 = (defpackage.w70) r2
            u6 r1 = (defpackage.u6) r1
            r0 = 9
            r4.<init>(r2, r1, r3, r0)
            return r4
        L117:
            z r2 = new z
            c20 r1 = (defpackage.c20) r1
            r0 = 8
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L123:
            z r2 = new z
            lw r1 = (defpackage.lw) r1
            r0 = 7
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L12e:
            z r2 = new z
            ft r1 = (defpackage.ft) r1
            r0 = 6
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L139:
            z r2 = new z
            c05 r1 = (defpackage.c05) r1
            r0 = 5
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L144:
            z r2 = new z
            rj r1 = (defpackage.rj) r1
            r0 = 4
            r2.<init>(r1, r3, r0)
            r2.Z = r4
            return r2
        L14f:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            ki r2 = (defpackage.ki) r2
            u63 r1 = (defpackage.u63) r1
            r0 = 3
            r4.<init>(r2, r1, r3, r0)
            return r4
        L15c:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            le2 r2 = (defpackage.le2) r2
            w6 r1 = (defpackage.w6) r1
            r0 = 2
            r4.<init>(r2, r1, r3, r0)
            return r4
        L169:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            r94 r2 = (defpackage.r94) r2
            py2 r1 = (defpackage.py2) r1
            r0 = 1
            r4.<init>(r2, r1, r3, r0)
            return r4
        L176:
            z r4 = new z
            java.lang.Object r2 = r2.Z
            r94 r2 = (defpackage.r94) r2
            oy2 r1 = (defpackage.oy2) r1
            r0 = 0
            r4.<init>(r2, r1, r3, r0)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r26) {
            r25 = this;
            r0 = r25
            int r1 = r0.X
            r2 = 10
            r3 = 28
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            switch(r1) {
                case 0: goto L9d4;
                case 1: goto L9a9;
                case 2: goto L978;
                case 3: goto L914;
                case 4: goto L8bc;
                case 5: goto L84a;
                case 6: goto L62a;
                case 7: goto L561;
                case 8: goto L4bb;
                case 9: goto L491;
                case 10: goto L430;
                case 11: goto L3e2;
                case 12: goto L373;
                case 13: goto L349;
                case 14: goto L31f;
                case 15: goto L2f5;
                case 16: goto L2b5;
                case 17: goto L287;
                case 18: goto L226;
                case 19: goto L1f1;
                case 20: goto L1bf;
                case 21: goto L191;
                case 22: goto L138;
                case 23: goto Lf5;
                case 24: goto Lcb;
                case 25: goto L9f;
                case 26: goto L6f;
                case 27: goto L6a;
                case 28: goto L3b;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r1 = r0.Z
            pq5 r1 = (defpackage.pq5) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L28
            if (r3 != r6) goto L21
            defpackage.oi2.Y(r26)
            r0 = r26
            goto L3a
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r7
            goto L3a
        L28:
            defpackage.oi2.Y(r26)
            java.lang.Object r3 = r0.d0
            xa1 r3 = (defpackage.xa1) r3
            r0.Z = r7
            r0.Y = r6
            java.lang.Object r0 = r3.e(r1, r0)
            if (r0 != r2) goto L3a
            r0 = r2
        L3a:
            return r0
        L3b:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L50
            if (r2 != r6) goto L49
            defpackage.oi2.Y(r26)
            r0 = r26
            goto L69
        L49:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r7
            goto L69
        L50:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            m16 r2 = (defpackage.m16) r2
            x81 r3 = new x81
            java.lang.Object r5 = r0.d0
            qn2 r5 = (defpackage.qn2) r5
            r3.<init>(r2, r7, r5, r6)
            r0.Y = r6
            java.lang.Object r0 = r2.q(r4, r3, r0)
            if (r0 != r1) goto L69
            r0 = r1
        L69:
            return r0
        L6a:
            java.lang.Object r0 = r25.v(r26)
            return r0
        L6f:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L81
            if (r2 != r6) goto L7b
            defpackage.oi2.Y(r26)
            goto L9c
        L7b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L9e
        L81:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            zy4 r2 = (defpackage.zy4) r2
            java.lang.Object r3 = r0.d0
            p27 r3 = (defpackage.p27) r3
            s51 r4 = new s51
            r4.<init>(r3, r6)
            r0.Y = r6
            r3 = 7
            java.lang.Object r0 = defpackage.hz6.d(r2, r7, r4, r0, r3)
            if (r0 != r1) goto L9c
            r7 = r1
            goto L9e
        L9c:
            jg7 r7 = defpackage.jg7.a
        L9e:
            return r7
        L9f:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto Lb4
            if (r2 != r6) goto Lad
            defpackage.oi2.Y(r26)
            r0 = r26
            goto Lca
        Lad:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r7
            goto Lca
        Lb4:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            eo2 r2 = (defpackage.eo2) r2
            java.lang.Object r3 = r0.d0
            dh5 r3 = (defpackage.dh5) r3
            java.lang.Object r3 = r3.A
            r0.Y = r6
            java.lang.Object r0 = r2.o(r3, r0)
            if (r0 != r1) goto Lca
            r0 = r1
        Lca:
            return r0
        Lcb:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto Le0
            if (r2 != r6) goto Ld9
            defpackage.oi2.Y(r26)
            r0 = r26
            goto Lf4
        Ld9:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r7
            goto Lf4
        Le0:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            eo2 r2 = (defpackage.eo2) r2
            java.lang.Object r3 = r0.d0
            rz4 r3 = (defpackage.rz4) r3
            r0.Y = r6
            java.lang.Object r0 = r2.o(r3, r0)
            if (r0 != r1) goto Lf4
            r0 = r1
        Lf4:
            return r0
        Lf5:
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r0.Z
            dx0 r2 = (defpackage.dx0) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            if (r4 == 0) goto L10d
            if (r4 != r6) goto L107
            defpackage.oi2.Y(r26)
            goto L124
        L107:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L137
        L10d:
            defpackage.oi2.Y(r26)
            fy2 r4 = r2.f
            r0.Y = r6
            float r5 = r4.b
            r6 = 0
            float r6 = r6 - r5
            java.lang.Object r4 = r4.b(r6, r0)
            if (r4 != r3) goto L11f
            goto L120
        L11f:
            r4 = r1
        L120:
            if (r4 != r3) goto L124
            r7 = r3
            goto L137
        L124:
            s35 r2 = r2.c
            java.lang.Object r2 = r2.A
            vs4 r2 = (defpackage.vs4) r2
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.setValue(r3)
            java.lang.Object r0 = r0.d0
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            r7 = r1
        L137:
            return r7
        L138:
            java.lang.Object r1 = r0.d0
            ax0 r1 = (defpackage.ax0) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L152
            if (r3 != r6) goto L14c
            java.lang.Object r0 = r0.Z
            zg5 r0 = (defpackage.zg5) r0
            defpackage.oi2.Y(r26)
            goto L183
        L14c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L190
        L152:
            defpackage.oi2.Y(r26)
            boolean r3 = r1.k()
            if (r3 == 0) goto L18e
            zg5 r3 = new zg5
            r3.<init>()
            eo2 r5 = r1.d
            v80 r1 = r1.e
            r1.getClass()
            vl0 r8 = new vl0
            r8.<init>(r1, r6)
            zw0 r1 = new zw0
            r1.<init>(r3, r7, r4)
            af2 r4 = new af2
            r4.<init>(r8, r1)
            r0.Z = r3
            r0.Y = r6
            java.lang.Object r0 = r5.o(r4, r0)
            if (r0 != r2) goto L182
            r7 = r2
            goto L190
        L182:
            r0 = r3
        L183:
            boolean r0 = r0.A
            if (r0 == 0) goto L188
            goto L18e
        L188:
            java.lang.String r0 = "You must collect the progress flow"
            defpackage.i.m(r0)
            goto L190
        L18e:
            jg7 r7 = defpackage.jg7.a
        L190:
            return r7
        L191:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L1a3
            if (r2 != r6) goto L19d
            defpackage.oi2.Y(r26)
            goto L1bc
        L19d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L1be
        L1a3:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            aq0 r2 = (defpackage.aq0) r2
            hp0 r2 = r2.b
            java.lang.Object r3 = r0.d0
            me.magnum.melonds.domain.model.Cheat r3 = (me.magnum.melonds.domain.model.Cheat) r3
            r0.Y = r6
            h16 r2 = (defpackage.h16) r2
            java.lang.Object r0 = r2.m(r3, r0)
            if (r0 != r1) goto L1bc
            r7 = r1
            goto L1be
        L1bc:
            jg7 r7 = defpackage.jg7.a
        L1be:
            return r7
        L1bf:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L1d1
            if (r2 != r6) goto L1cb
            defpackage.oi2.Y(r26)
            goto L1ee
        L1cb:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L1f0
        L1d1:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            aq0 r2 = (defpackage.aq0) r2
            hp0 r2 = r2.b
            java.lang.Object r3 = r0.d0
            jh1 r3 = (defpackage.jh1) r3
            an0 r4 = r3.b
            me.magnum.melonds.domain.model.Cheat r3 = r3.a
            r0.Y = r6
            h16 r2 = (defpackage.h16) r2
            java.lang.Object r0 = r2.a(r4, r3, r0)
            if (r0 != r1) goto L1ee
            r7 = r1
            goto L1f0
        L1ee:
            jg7 r7 = defpackage.jg7.a
        L1f0:
            return r7
        L1f1:
            java.lang.Object r1 = r0.Z
            ne2 r1 = (defpackage.ne2) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L207
            if (r3 != r6) goto L201
            defpackage.oi2.Y(r26)
            goto L223
        L201:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L225
        L207:
            defpackage.oi2.Y(r26)
            qp0 r3 = new qp0
            java.lang.Object r4 = r0.d0
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.List r4 = defpackage.gt0.k1(r4)
            r3.<init>(r4)
            r0.Z = r7
            r0.Y = r6
            java.lang.Object r0 = r1.a(r3, r0)
            if (r0 != r2) goto L223
            r7 = r2
            goto L225
        L223:
            jg7 r7 = defpackage.jg7.a
        L225:
            return r7
        L226:
            java.lang.Object r1 = r0.Z
            ne2 r1 = (defpackage.ne2) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            r4 = 3
            if (r3 == 0) goto L24b
            if (r3 == r6) goto L247
            if (r3 == r5) goto L241
            if (r3 != r4) goto L23b
            defpackage.oi2.Y(r26)
            goto L284
        L23b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L286
        L241:
            defpackage.oi2.Y(r26)
            r3 = r26
            goto L271
        L247:
            defpackage.oi2.Y(r26)
            goto L25e
        L24b:
            defpackage.oi2.Y(r26)
            pp0 r3 = new pp0
            r3.<init>()
            r0.Z = r1
            r0.Y = r6
            java.lang.Object r3 = r1.a(r3, r0)
            if (r3 != r2) goto L25e
            goto L282
        L25e:
            java.lang.Object r3 = r0.d0
            aq0 r3 = (defpackage.aq0) r3
            hp0 r3 = r3.b
            r0.Z = r1
            r0.Y = r5
            h16 r3 = (defpackage.h16) r3
            java.io.Serializable r3 = r3.j(r0)
            if (r3 != r2) goto L271
            goto L282
        L271:
            java.util.List r3 = (java.util.List) r3
            qp0 r5 = new qp0
            r5.<init>(r3)
            r0.Z = r7
            r0.Y = r4
            java.lang.Object r0 = r1.a(r5, r0)
            if (r0 != r2) goto L284
        L282:
            r7 = r2
            goto L286
        L284:
            jg7 r7 = defpackage.jg7.a
        L286:
            return r7
        L287:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L299
            if (r2 != r6) goto L293
            defpackage.oi2.Y(r26)
            goto L2b2
        L293:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L2b4
        L299:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            me.magnum.melonds.common.workers.CheatImportWorker r2 = (me.magnum.melonds.common.workers.CheatImportWorker) r2
            hp0 r2 = r2.g
            java.lang.Object r3 = r0.d0
            cp2 r3 = (defpackage.cp2) r3
            r0.Y = r6
            h16 r2 = (defpackage.h16) r2
            java.lang.Object r0 = r2.e(r3, r0)
            if (r0 != r1) goto L2b2
            r7 = r1
            goto L2b4
        L2b2:
            jg7 r7 = defpackage.jg7.a
        L2b4:
            return r7
        L2b5:
            java.lang.Object r1 = r0.d0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.Z
            me.magnum.melonds.common.workers.CheatImportWorker r2 = (me.magnum.melonds.common.workers.CheatImportWorker) r2
            hp0 r2 = r2.g
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r0.Y
            if (r4 == 0) goto L2da
            if (r4 == r6) goto L2d6
            if (r4 != r5) goto L2cf
            defpackage.oi2.Y(r26)
            r0 = r26
            goto L2f4
        L2cf:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = r7
            goto L2f4
        L2d6:
            defpackage.oi2.Y(r26)
            goto L2e9
        L2da:
            defpackage.oi2.Y(r26)
            r0.Y = r6
            r4 = r2
            h16 r4 = (defpackage.h16) r4
            java.lang.Object r4 = r4.g(r1, r0)
            if (r4 != r3) goto L2e9
            goto L2f3
        L2e9:
            r0.Y = r5
            h16 r2 = (defpackage.h16) r2
            java.lang.Object r0 = r2.b(r1, r0)
            if (r0 != r3) goto L2f4
        L2f3:
            r0 = r3
        L2f4:
            return r0
        L2f5:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L307
            if (r2 != r6) goto L301
            defpackage.oi2.Y(r26)
            goto L31c
        L301:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L31e
        L307:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            le2 r2 = (defpackage.le2) r2
            java.lang.Object r3 = r0.d0
            pb6 r3 = (defpackage.pb6) r3
            r0.Y = r6
            java.lang.Object r0 = r2.b(r3, r0)
            if (r0 != r1) goto L31c
            r7 = r1
            goto L31e
        L31c:
            jg7 r7 = defpackage.jg7.a
        L31e:
            return r7
        L31f:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L331
            if (r2 != r6) goto L32b
            defpackage.oi2.Y(r26)
            goto L346
        L32b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L348
        L331:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            ne2 r2 = (defpackage.ne2) r2
            java.lang.Object r3 = r0.d0
            xl0 r3 = (defpackage.xl0) r3
            r0.Y = r6
            java.lang.Object r0 = r3.j(r2, r0)
            if (r0 != r1) goto L346
            r7 = r1
            goto L348
        L346:
            jg7 r7 = defpackage.jg7.a
        L348:
            return r7
        L349:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L35b
            if (r2 != r6) goto L355
            defpackage.oi2.Y(r26)
            goto L370
        L355:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L372
        L35b:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            r35 r2 = (defpackage.r35) r2
            java.lang.Object r3 = r0.d0
            wl0 r3 = (defpackage.wl0) r3
            r0.Y = r6
            java.lang.Object r0 = r3.e(r2, r0)
            if (r0 != r1) goto L370
            r7 = r1
            goto L372
        L370:
            jg7 r7 = defpackage.jg7.a
        L372:
            return r7
        L373:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L385
            if (r2 != r6) goto L37f
            defpackage.oi2.Y(r26)
            goto L3dc
        L37f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L3de
        L385:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            r35 r2 = (defpackage.r35) r2
            rc0 r3 = new rc0
            java.lang.Object r4 = r0.d0
            ed0 r4 = (defpackage.ed0) r4
            r3.<init>(r4, r2)
            java.lang.Object r4 = r0.d0
            ed0 r4 = (defpackage.ed0) r4
            n55 r4 = r4.a
            java.lang.Object r4 = r4.get()
            android.hardware.camera2.CameraManager r4 = (android.hardware.camera2.CameraManager) r4
            java.lang.Object r5 = r0.d0
            ed0 r5 = (defpackage.ed0) r5
            t57 r5 = r5.b
            android.os.Handler r5 = r5.a()
            r4.registerAvailabilityCallback(r3, r5)
            java.lang.Object r5 = r0.d0
            ed0 r5 = (defpackage.ed0) r5
            java.lang.Object r7 = r5.f
            monitor-enter(r7)
            java.util.ArrayList r5 = r5.g     // Catch: java.lang.Throwable -> L3df
            monitor-exit(r7)
            java.lang.Object r7 = r0.d0
            ed0 r7 = (defpackage.ed0) r7
            if (r5 == 0) goto L3c2
            defpackage.ed0.e(r2, r5)
            goto L3cb
        L3c2:
            java.util.ArrayList r5 = r7.d()
            if (r5 == 0) goto L3cb
            defpackage.ed0.e(r2, r5)
        L3cb:
            q6 r5 = new q6
            r7 = 15
            r5.<init>(r7, r4, r3)
            r0.Y = r6
            java.lang.Object r0 = defpackage.kj2.q(r2, r5, r0)
            if (r0 != r1) goto L3dc
            r7 = r1
            goto L3de
        L3dc:
            jg7 r7 = defpackage.jg7.a
        L3de:
            return r7
        L3df:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L3e2:
            java.lang.Object r1 = r0.d0
            sc0 r1 = (defpackage.sc0) r1
            t57 r2 = r1.A
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r0.Y
            if (r5 == 0) goto L3fa
            if (r5 != r6) goto L3f4
            defpackage.oi2.Y(r26)
            goto L42d
        L3f4:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L42f
        L3fa:
            defpackage.oi2.Y(r26)
            java.lang.Object r5 = r0.Z
            r35 r5 = (defpackage.r35) r5
            rc0 r7 = new rc0
            r7.<init>(r5, r1)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.hardware.camera2.CameraManager r9 = r1.L
            if (r8 < r3) goto L415
            r9.getClass()
            java.util.concurrent.Executor r2 = r2.g
            defpackage.j2.o(r9, r2, r7)
            goto L41c
        L415:
            android.os.Handler r2 = r2.a()
            r9.registerAvailabilityCallback(r7, r2)
        L41c:
            q6 r2 = new q6
            r3 = 14
            r2.<init>(r3, r1, r7)
            r0.Y = r6
            java.lang.Object r0 = defpackage.kj2.q(r5, r2, r0)
            if (r0 != r4) goto L42d
            r7 = r4
            goto L42f
        L42d:
            jg7 r7 = defpackage.jg7.a
        L42f:
            return r7
        L430:
            java.lang.Object r1 = r0.d0
            eb r1 = (defpackage.eb) r1
            java.lang.Object r2 = r1.L
            t57 r2 = (defpackage.t57) r2
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r0.Y
            if (r5 == 0) goto L44a
            if (r5 != r6) goto L444
            defpackage.oi2.Y(r26)
            goto L48e
        L444:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L490
        L44a:
            defpackage.oi2.Y(r26)
            java.lang.Object r5 = r0.Z
            r35 r5 = (defpackage.r35) r5
            yb0 r7 = new yb0
            r7.<init>(r5)
            java.lang.Object r1 = r1.B
            n55 r1 = (defpackage.n55) r1
            java.lang.Object r1 = r1.get()
            android.hardware.camera2.CameraManager r1 = (android.hardware.camera2.CameraManager) r1
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto L476
            r1.getClass()
            ex6 r2 = r2.j
            java.lang.Object r2 = r2.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r2.getClass()
            defpackage.j2.o(r1, r2, r7)
            goto L47d
        L476:
            android.os.Handler r2 = r2.a()
            r1.registerAvailabilityCallback(r7, r2)
        L47d:
            q6 r2 = new q6
            r3 = 13
            r2.<init>(r3, r1, r7)
            r0.Y = r6
            java.lang.Object r0 = defpackage.kj2.q(r5, r2, r0)
            if (r0 != r4) goto L48e
            r7 = r4
            goto L490
        L48e:
            jg7 r7 = defpackage.jg7.a
        L490:
            return r7
        L491:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L4a3
            if (r2 != r6) goto L49d
            defpackage.oi2.Y(r26)
            goto L4b8
        L49d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L4ba
        L4a3:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            w70 r2 = (defpackage.w70) r2
            java.lang.Object r3 = r0.d0
            u6 r3 = (defpackage.u6) r3
            r0.Y = r6
            java.lang.Object r0 = defpackage.l.j(r2, r3, r0)
            if (r0 != r1) goto L4b8
            r7 = r1
            goto L4ba
        L4b8:
            jg7 r7 = defpackage.jg7.a
        L4ba:
            return r7
        L4bb:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L4cf
            if (r3 != r6) goto L4c8
            defpackage.oi2.Y(r26)
            goto L55c
        L4c8:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L55e
        L4cf:
            defpackage.oi2.Y(r26)
            java.lang.Object r3 = r0.Z
            r35 r3 = (defpackage.r35) r3
            b20 r4 = new b20
            java.lang.Object r5 = r0.d0
            c20 r5 = (defpackage.c20) r5
            r4.<init>(r5, r3)
            a21 r7 = r5.a
            r7.getClass()
            java.lang.Object r8 = r7.d
            monitor-enter(r8)
            java.lang.Object r9 = r7.f     // Catch: java.lang.Throwable -> L52c
            java.util.LinkedHashSet r9 = (java.util.LinkedHashSet) r9     // Catch: java.lang.Throwable -> L52c
            boolean r9 = r9.add(r4)     // Catch: java.lang.Throwable -> L52c
            if (r9 == 0) goto L548
            java.lang.Object r9 = r7.f     // Catch: java.lang.Throwable -> L52c
            java.util.LinkedHashSet r9 = (java.util.LinkedHashSet) r9     // Catch: java.lang.Throwable -> L52c
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L52c
            if (r9 != r6) goto L52e
            java.lang.Object r9 = r7.d()     // Catch: java.lang.Throwable -> L52c
            r7.e = r9     // Catch: java.lang.Throwable -> L52c
            ga0 r9 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L52c
            java.lang.String r10 = defpackage.b21.a     // Catch: java.lang.Throwable -> L52c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52c
            r11.<init>()     // Catch: java.lang.Throwable -> L52c
            java.lang.Class r12 = r7.getClass()     // Catch: java.lang.Throwable -> L52c
            java.lang.String r12 = r12.getSimpleName()     // Catch: java.lang.Throwable -> L52c
            r11.append(r12)     // Catch: java.lang.Throwable -> L52c
            java.lang.String r12 = ": initial state = "
            r11.append(r12)     // Catch: java.lang.Throwable -> L52c
            java.lang.Object r12 = r7.e     // Catch: java.lang.Throwable -> L52c
            r11.append(r12)     // Catch: java.lang.Throwable -> L52c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L52c
            r9.b(r10, r11)     // Catch: java.lang.Throwable -> L52c
            r7.g()     // Catch: java.lang.Throwable -> L52c
            goto L52e
        L52c:
            r0 = move-exception
            goto L55f
        L52e:
            java.lang.Object r7 = r7.e     // Catch: java.lang.Throwable -> L52c
            boolean r7 = r5.e(r7)     // Catch: java.lang.Throwable -> L52c
            if (r7 == 0) goto L540
            w21 r7 = new w21     // Catch: java.lang.Throwable -> L52c
            int r5 = r5.d()     // Catch: java.lang.Throwable -> L52c
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L52c
            goto L542
        L540:
            v21 r7 = defpackage.v21.a     // Catch: java.lang.Throwable -> L52c
        L542:
            r3.getClass()     // Catch: java.lang.Throwable -> L52c
            r3.c(r7)     // Catch: java.lang.Throwable -> L52c
        L548:
            monitor-exit(r8)
            java.lang.Object r5 = r0.d0
            c20 r5 = (defpackage.c20) r5
            q6 r7 = new q6
            r7.<init>(r2, r5, r4)
            r0.Y = r6
            java.lang.Object r0 = defpackage.kj2.q(r3, r7, r0)
            if (r0 != r1) goto L55c
            r7 = r1
            goto L55e
        L55c:
            jg7 r7 = defpackage.jg7.a
        L55e:
            return r7
        L55f:
            monitor-exit(r8)
            throw r0
        L561:
            java.lang.Object r1 = r0.d0
            lw r1 = (defpackage.lw) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L580
            if (r3 != r6) goto L579
            java.lang.Object r0 = r0.Z
            r1 = r0
            lw r1 = (defpackage.lw) r1
            defpackage.oi2.Y(r26)
            r0 = r26
            goto L5fb
        L579:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L629
        L580:
            defpackage.oi2.Y(r26)
            java.lang.Object r3 = r0.Z
            z23 r3 = (defpackage.z23) r3
            vs4 r4 = r1.o0
            java.lang.Object r4 = r4.getValue()
            pe5 r4 = (defpackage.pe5) r4
            x23 r5 = defpackage.z23.a(r3)
            jw r8 = new jw
            r8.<init>(r1)
            r5.d = r8
            r5.t = r7
            r5.u = r7
            r5.v = r7
            rg1 r3 = r3.A
            fj6 r8 = r3.a
            if (r8 != 0) goto L5b3
            jw r8 = new jw
            r8.<init>(r1)
            r5.r = r8
            r5.t = r7
            r5.u = r7
            r5.v = r7
        L5b3:
            y56 r8 = r3.b
            if (r8 != 0) goto L5d3
            z31 r8 = r1.j0
            ve5 r9 = defpackage.dk7.b
            w31 r9 = defpackage.y31.b
            boolean r9 = defpackage.nb3.k(r8, r9)
            if (r9 != 0) goto L5cf
            x31 r9 = defpackage.y31.d
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L5cc
            goto L5cf
        L5cc:
            y56 r8 = defpackage.y56.FILL
            goto L5d1
        L5cf:
            y56 r8 = defpackage.y56.FIT
        L5d1:
            r5.s = r8
        L5d3:
            n05 r3 = r3.d
            n05 r8 = defpackage.n05.EXACT
            if (r3 == r8) goto L5dd
            n05 r3 = defpackage.n05.INEXACT
            r5.g = r3
        L5dd:
            z23 r3 = r5.a()
            r0.Z = r1
            r0.Y = r6
            r4.getClass()
            xe1 r5 = defpackage.xk1.a
            jv2 r5 = defpackage.e04.a
            jv2 r5 = r5.Y
            ne5 r8 = new ne5
            r8.<init>(r4, r3, r7, r6)
            java.lang.Object r0 = defpackage.hv.d0(r5, r8, r0)
            if (r0 != r2) goto L5fb
        L5f9:
            r7 = r2
            goto L629
        L5fb:
            a33 r0 = (defpackage.a33) r0
            r1.getClass()
            boolean r2 = r0 instanceof defpackage.bu6
            if (r2 == 0) goto L612
            gw r7 = new gw
            bu6 r0 = (defpackage.bu6) r0
            android.graphics.drawable.Drawable r2 = r0.a
            sr4 r1 = r1.j(r2)
            r7.<init>(r1, r0)
            goto L629
        L612:
            boolean r2 = r0 instanceof defpackage.b62
            if (r2 == 0) goto L626
            ew r2 = new ew
            b62 r0 = (defpackage.b62) r0
            android.graphics.drawable.Drawable r3 = r0.a
            if (r3 == 0) goto L622
            sr4 r7 = r1.j(r3)
        L622:
            r2.<init>(r7, r0)
            goto L5f9
        L626:
            defpackage.i.d()
        L629:
            return r7
        L62a:
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r3 = r0.Z
            android.net.Uri r3 = (android.net.Uri) r3
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r0.Y
            if (r8 == 0) goto L645
            if (r8 != r6) goto L63e
            defpackage.oi2.Y(r26)
        L63b:
            r0 = r1
            goto L848
        L63e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L849
        L645:
            defpackage.oi2.Y(r26)
            if (r3 == 0) goto L63b
            java.lang.Object r8 = r0.d0
            ft r8 = (defpackage.ft) r8
            r0.Z = r7
            r0.Y = r6
            java.lang.String r7 = "melonDualLog.log"
            java.lang.String r9 = "AppLogFileRecorder"
            java.lang.String r10 = "--pid="
            java.lang.String r11 = "directory="
            java.lang.String r12 = "pid="
            java.lang.String r13 = "started="
            android.content.Context r8 = r8.a
            qi6 r14 = defpackage.zl1.h(r8, r3)
            android.content.Context r15 = r14.b
            android.net.Uri r6 = r14.c
            int r17 = r15.checkCallingOrSelfUriPermission(r6, r5)
            if (r17 == 0) goto L672
            r18 = r1
            goto L831
        L672:
            r17 = r5
            java.lang.String r5 = "mime_type"
            java.lang.String r5 = defpackage.hv.U(r15, r6, r5)
            java.lang.String r2 = "flags"
            r18 = r1
            r0 = 0
            long r0 = defpackage.hv.T(r15, r6, r2, r0)
            int r0 = (int) r0
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L68d
            goto L831
        L68d:
            r1 = r0 & 4
            if (r1 == 0) goto L692
            goto L6a9
        L692:
            java.lang.String r1 = "vnd.android.document/directory"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L69f
            r1 = r0 & 8
            if (r1 == 0) goto L69f
            goto L6a9
        L69f:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L831
            r0 = r0 & 2
            if (r0 == 0) goto L831
        L6a9:
            zl1 r0 = r14.f(r7)
            if (r0 != 0) goto L6b5
            java.lang.String r0 = "text/plain"
            zl1 r0 = r14.c(r0, r7)
        L6b5:
            if (r0 != 0) goto L6cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not create app log file in ROM directory: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r9, r0)
        L6c8:
            r0 = r18
            goto L844
        L6cc:
            android.content.ContentResolver r1 = r8.getContentResolver()
            android.net.Uri r2 = r0.j()
            java.lang.String r5 = "wa"
            java.io.OutputStream r1 = r1.openOutputStream(r2, r5)
            if (r1 == 0) goto L816
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L7ec
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L7ec
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7ec
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7ec
            r0 = 10
            r2.append(r0)     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r5 = "melonDualDS app log"
            java.lang.Appendable r5 = r2.append(r5)     // Catch: java.lang.Throwable -> L7ef
            r5.append(r0)     // Catch: java.lang.Throwable -> L7ef
            java.text.SimpleDateFormat r0 = defpackage.ft.d     // Catch: java.lang.Throwable -> L7ef
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Throwable -> L7ef
            r5.<init>()     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r0 = r0.format(r5)     // Catch: java.lang.Throwable -> L7ef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7ef
            r5.<init>(r13)     // Catch: java.lang.Throwable -> L7ef
            r5.append(r0)     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L7ef
            java.lang.Appendable r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L7ef
            r5 = 10
            r0.append(r5)     // Catch: java.lang.Throwable -> L7ef
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L7ef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7ef
            r5.<init>(r12)     // Catch: java.lang.Throwable -> L7ef
            r5.append(r0)     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L7ef
            java.lang.Appendable r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L7ef
            r5 = 10
            r0.append(r5)     // Catch: java.lang.Throwable -> L7ef
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7ef
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L7ef
            r0.append(r3)     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7ef
            java.lang.Appendable r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L7ef
            r5 = 10
            r0.append(r5)     // Catch: java.lang.Throwable -> L7ef
            r2.append(r5)     // Catch: java.lang.Throwable -> L7ef
            r2.flush()     // Catch: java.lang.Throwable -> L7ef
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r19 = "logcat"
            java.lang.String r20 = "-v"
            java.lang.String r21 = "threadtime"
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L7ef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7ef
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L7ef
            r5.append(r3)     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r22 = r5.toString()     // Catch: java.lang.Throwable -> L7ef
            java.lang.String r23 = "-T"
            java.lang.String r24 = "1"
            java.lang.String[] r3 = new java.lang.String[]{r19, r20, r21, r22, r23, r24}     // Catch: java.lang.Throwable -> L7ef
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L7ef
            r3 = 1
            java.lang.ProcessBuilder r0 = r0.redirectErrorStream(r3)     // Catch: java.lang.Throwable -> L7ef
            java.lang.Process r3 = r0.start()     // Catch: java.lang.Throwable -> L7ef
            r0 = r25
            l61 r0 = r0.B     // Catch: java.lang.Throwable -> L7ef
            r0.getClass()     // Catch: java.lang.Throwable -> L7ef
            rc3 r5 = defpackage.yh2.u(r0)     // Catch: java.lang.Throwable -> L7ef
            k0 r6 = new k0     // Catch: java.lang.Throwable -> L7ef
            r7 = 11
            r6.<init>(r3, r7)     // Catch: java.lang.Throwable -> L7ef
            il1 r5 = r5.a0(r6)     // Catch: java.lang.Throwable -> L7ef
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L7f2
            r6.getClass()     // Catch: java.lang.Throwable -> L7f2
            java.nio.charset.Charset r7 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L7f2
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L7f2
            r8.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7f2
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7f2
            r7 = 8192(0x2000, float:1.148E-41)
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L7f2
            ev r7 = new ev     // Catch: java.lang.Throwable -> L7cf
            r8 = r17
            r7.<init>(r6, r8)     // Catch: java.lang.Throwable -> L7cf
            f11 r8 = new f11     // Catch: java.lang.Throwable -> L7cf
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L7cf
            java.util.Iterator r7 = r8.iterator()     // Catch: java.lang.Throwable -> L7cf
        L7af:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L7cf
            if (r8 == 0) goto L7d2
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L7cf
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L7cf
            boolean r9 = defpackage.yh2.z(r0)     // Catch: java.lang.Throwable -> L7cf
            if (r9 != 0) goto L7c2
            goto L7d2
        L7c2:
            java.lang.Appendable r8 = r2.append(r8)     // Catch: java.lang.Throwable -> L7cf
            r9 = 10
            r8.append(r9)     // Catch: java.lang.Throwable -> L7cf
            r2.flush()     // Catch: java.lang.Throwable -> L7cf
            goto L7af
        L7cf:
            r0 = move-exception
            r4 = r0
            goto L7f4
        L7d2:
            r6.close()     // Catch: java.lang.Throwable -> L7f2
            r3.destroy()     // Catch: java.lang.Throwable -> L7ef
            int r0 = r3.waitFor()     // Catch: java.lang.Throwable -> L7e1
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Throwable -> L7e1
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7e1
        L7e1:
            r5.dispose()     // Catch: java.lang.Throwable -> L7ef
            r2.close()     // Catch: java.lang.Throwable -> L7ec
            r1.close()
            goto L6c8
        L7ec:
            r0 = move-exception
            r2 = r0
            goto L810
        L7ef:
            r0 = move-exception
            r3 = r0
            goto L80a
        L7f2:
            r0 = move-exception
            goto L7fa
        L7f4:
            throw r4     // Catch: java.lang.Throwable -> L7f5
        L7f5:
            r0 = move-exception
            defpackage.ge7.t(r6, r4)     // Catch: java.lang.Throwable -> L7f2
            throw r0     // Catch: java.lang.Throwable -> L7f2
        L7fa:
            r3.destroy()     // Catch: java.lang.Throwable -> L7ef
            int r3 = r3.waitFor()     // Catch: java.lang.Throwable -> L806
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L806
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L806
        L806:
            r5.dispose()     // Catch: java.lang.Throwable -> L7ef
            throw r0     // Catch: java.lang.Throwable -> L7ef
        L80a:
            throw r3     // Catch: java.lang.Throwable -> L80b
        L80b:
            r0 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Throwable -> L7ec
            throw r0     // Catch: java.lang.Throwable -> L7ec
        L810:
            throw r2     // Catch: java.lang.Throwable -> L811
        L811:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)
            throw r0
        L816:
            android.net.Uri r0 = r0.j()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not open app log file for writing: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r0 = android.util.Log.w(r9, r0)
            defpackage.vy7.P(r0)
            goto L6c8
        L831:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "App log file requested but ROM directory is not writable: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r9, r0)
            goto L6c8
        L844:
            if (r0 != r4) goto L848
            r7 = r4
            goto L849
        L848:
            r7 = r0
        L849:
            return r7
        L84a:
            l61 r1 = r0.B
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Y
            if (r3 == 0) goto L863
            r5 = 1
            if (r3 != r5) goto L85d
            java.lang.Object r3 = r0.Z
            w61 r3 = (defpackage.w61) r3
            defpackage.oi2.Y(r26)
            goto L891
        L85d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L8bb
        L863:
            defpackage.oi2.Y(r26)
            java.lang.Object r3 = r0.Z
            w61 r3 = (defpackage.w61) r3
        L86a:
            boolean r5 = defpackage.g04.H(r3)
            if (r5 == 0) goto L8b9
            ne r5 = defpackage.ne.d0
            r0.Z = r3
            r6 = 1
            r0.Y = r6
            r1.getClass()
            d90 r6 = defpackage.d90.u0
            j61 r6 = r1.Z(r6)
            if (r6 != 0) goto L8b5
            r1.getClass()
            um r6 = defpackage.ii2.x(r1)
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r2) goto L891
            r7 = r2
            goto L8bb
        L891:
            java.lang.Object r5 = r0.d0
            c05 r5 = (defpackage.c05) r5
            int[] r6 = r5.B0
            boolean r8 = r5.isAttachedToWindow()
            if (r8 != 0) goto L89e
            goto L86a
        L89e:
            r8 = r6[r4]
            r16 = 1
            r9 = r6[r16]
            android.view.View r10 = r5.l0
            r10.getLocationOnScreen(r6)
            r10 = r6[r4]
            if (r8 != r10) goto L8b1
            r6 = r6[r16]
            if (r9 == r6) goto L86a
        L8b1:
            r5.o()
            goto L86a
        L8b5:
            defpackage.u34.a()
            goto L8bb
        L8b9:
            jg7 r7 = defpackage.jg7.a
        L8bb:
            return r7
        L8bc:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L8d3
            r3 = 1
            if (r2 == r3) goto L8cb
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L913
        L8cb:
            java.lang.Object r0 = r0.Z
            v63 r0 = (defpackage.v63) r0
            defpackage.oi2.Y(r26)
            goto L910
        L8d3:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            v63 r2 = (defpackage.v63) r2
            java.lang.Object r3 = r0.d0
            rj r3 = (defpackage.rj) r3
            r0.Z = r2
            r5 = 1
            r0.Y = r5
            rj0 r4 = new rj0
            r41 r0 = defpackage.np2.V(r0)
            r4.<init>(r5, r0)
            r4.v()
            o37 r0 = r3.B
            gy4 r6 = r0.a
            r6.a()
            t37 r8 = new t37
            r8.<init>(r0, r6)
            java.util.concurrent.atomic.AtomicReference r0 = r0.b
            r0.set(r8)
            qj r0 = new qj
            r0.<init>(r5, r2, r3)
            r4.z(r0)
            java.lang.Object r0 = r4.s()
            if (r0 != r1) goto L910
            r7 = r1
            goto L913
        L910:
            defpackage.e41.c()
        L913:
            return r7
        L914:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L92e
            r3 = 1
            if (r2 == r3) goto L92a
            r8 = 2
            if (r2 == r8) goto L926
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L977
        L926:
            defpackage.oi2.Y(r26)
            goto L971
        L92a:
            defpackage.oi2.Y(r26)
            goto L950
        L92e:
            defpackage.oi2.Y(r26)
            v83 r2 = new v83
            r3 = 23
            r2.<init>(r3)
            r3 = 1
            r0.Y = r3
            l61 r4 = r0.B
            r4.getClass()
            um r4 = defpackage.ii2.x(r4)
            ns2 r5 = new ns2
            r5.<init>(r3, r2)
            java.lang.Object r2 = r4.a(r5, r0)
            if (r2 != r1) goto L950
            goto L96f
        L950:
            java.lang.Object r2 = r0.Z
            ki r2 = (defpackage.ki) r2
            na4 r2 = r2.i()
            if (r2 == 0) goto L975
            y6 r3 = new y6
            java.lang.Object r4 = r0.d0
            u63 r4 = (defpackage.u63) r4
            r5 = 1
            r3.<init>(r4, r5)
            r8 = 2
            r0.Y = r8
            of6 r2 = (defpackage.of6) r2
            x61 r0 = defpackage.of6.m(r2, r3, r0)
            if (r0 != r1) goto L971
        L96f:
            r7 = r1
            goto L977
        L971:
            defpackage.e41.c()
            goto L977
        L975:
            jg7 r7 = defpackage.jg7.a
        L977:
            return r7
        L978:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L98b
            r3 = 1
            if (r2 != r3) goto L985
            defpackage.oi2.Y(r26)
            goto L9a6
        L985:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L9a8
        L98b:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            le2 r2 = (defpackage.le2) r2
            y6 r3 = new y6
            java.lang.Object r5 = r0.d0
            w6 r5 = (defpackage.w6) r5
            r3.<init>(r5, r4)
            r5 = 1
            r0.Y = r5
            java.lang.Object r0 = r2.b(r3, r0)
            if (r0 != r1) goto L9a6
            r7 = r1
            goto L9a8
        L9a6:
            jg7 r7 = defpackage.jg7.a
        L9a8:
            return r7
        L9a9:
            r5 = r6
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L9bc
            if (r2 != r5) goto L9b6
            defpackage.oi2.Y(r26)
            goto L9d1
        L9b6:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L9d3
        L9bc:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            r94 r2 = (defpackage.r94) r2
            java.lang.Object r3 = r0.d0
            py2 r3 = (defpackage.py2) r3
            r0.Y = r5
            java.lang.Object r0 = r2.a(r3, r0)
            if (r0 != r1) goto L9d1
            r7 = r1
            goto L9d3
        L9d1:
            jg7 r7 = defpackage.jg7.a
        L9d3:
            return r7
        L9d4:
            r5 = r6
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L9e7
            if (r2 != r5) goto L9e1
            defpackage.oi2.Y(r26)
            goto L9fc
        L9e1:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L9fe
        L9e7:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.Z
            r94 r2 = (defpackage.r94) r2
            java.lang.Object r3 = r0.d0
            oy2 r3 = (defpackage.oy2) r3
            r0.Y = r5
            java.lang.Object r0 = r2.a(r3, r0)
            if (r0 != r1) goto L9fc
            r7 = r1
            goto L9fe
        L9fc:
            jg7 r7 = defpackage.jg7.a
        L9fe:
            return r7
    }
}
