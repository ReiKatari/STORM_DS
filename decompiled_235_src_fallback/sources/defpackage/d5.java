package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ d5(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.A = r6
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r0.<init>()
            return
    }

    public /* synthetic */ d5(defpackage.mu4 r2, defpackage.on2 r3, defpackage.nh2 r4, defpackage.qn2 r5, defpackage.qa4 r6) {
            r1 = this;
            r0 = 7
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.R = r3
            r1.L = r4
            r1.Y = r5
            r1.X = r6
            return
    }

    public /* synthetic */ d5(defpackage.ss3 r2, defpackage.ta5 r3, defpackage.on2 r4, defpackage.qn2 r5, defpackage.on2 r6) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.Y = r5
            r1.X = r6
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r26) {
            r25 = this;
            r0 = r25
            int r1 = r0.A
            r2 = 2
            r6 = 3
            jg7 r7 = defpackage.jg7.a
            r8 = 0
            r9 = 0
            java.lang.Object r10 = r0.Y
            java.lang.Object r11 = r0.X
            java.lang.Object r12 = r0.R
            java.lang.Object r13 = r0.L
            java.lang.Object r0 = r0.B
            r14 = 1
            switch(r1) {
                case 0: goto L329;
                case 1: goto L309;
                case 2: goto L2d3;
                case 3: goto L2a4;
                case 4: goto L22d;
                case 5: goto L1bd;
                case 6: goto L191;
                case 7: goto L13f;
                default: goto L18;
            }
        L18:
            c81 r0 = (defpackage.c81) r0
            mk4 r13 = (defpackage.mk4) r13
            c37 r12 = (defpackage.c37) r12
            jt3 r11 = (defpackage.jt3) r11
            cn6 r10 = (defpackage.cn6) r10
            r1 = r26
            um3 r1 = (defpackage.um3) r1
            r1.b()
            zj0 r15 = r1.A
            rs4 r0 = r0.c
            float r0 = r0.h()
            r16 = 32
            r3 = 0
            int r17 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r17 != 0) goto L3a
            goto L13e
        L3a:
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r12.b
            int r12 = defpackage.k47.c
            long r4 = r4 >> r16
            int r4 = (int) r4
            int r4 = r13.s(r4)
            b47 r5 = r11.d()
            if (r5 == 0) goto L57
            a47 r3 = r5.a
            of5 r3 = r3.c(r4)
            goto L5d
        L57:
            of5 r4 = new of5
            r4.<init>(r3, r3, r3, r3)
            r3 = r4
        L5d:
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r1.e0(r4)
            double r11 = (double) r1
            double r11 = java.lang.Math.floor(r11)
            float r1 = (float) r11
            r5 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r11 >= 0) goto L70
            r1 = r5
        L70:
            float r5 = r3.a
            float r4 = r1 / r4
            float r5 = r5 + r4
            long r11 = r15.e()
            long r11 = r11 >> r16
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 - r4
            int r12 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r12 <= 0) goto L86
            r5 = r11
        L86:
            int r11 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r11 >= 0) goto L8b
            goto L8c
        L8b:
            r4 = r5
        L8c:
            int r5 = (int) r1
            int r5 = r5 % r2
            if (r5 != r14) goto L9a
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r2 = (float) r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r4
            goto La0
        L9a:
            double r4 = (double) r4
            double r4 = java.lang.Math.rint(r4)
            float r2 = (float) r4
        La0:
            float r4 = r3.b
            int r5 = java.lang.Float.floatToRawIntBits(r2)
            long r11 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            long r11 = r11 << r16
            long r4 = r4 & r17
            long r20 = r11 | r4
            float r3 = r3.d
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r4 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            long r4 = r4 << r16
            long r2 = r2 & r17
            long r22 = r4 | r2
            yj0 r2 = r15.A
            xj0 r2 = r2.c
            aj r3 = r15.R
            if (r3 != 0) goto Ld5
            aj r3 = defpackage.nc1.t()
            r3.t(r14)
            r15.R = r3
        Ld5:
            java.lang.Object r4 = r3.L
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            long r11 = r15.e()
            r10.a(r0, r11, r3)
            java.lang.Object r0 = r3.X
            z40 r0 = (defpackage.z40) r0
            boolean r0 = defpackage.nb3.k(r0, r8)
            if (r0 != 0) goto Led
            r3.m(r8)
        Led:
            int r0 = r3.B
            if (r0 != r6) goto Lf2
            goto Lf5
        Lf2:
            r3.k(r6)
        Lf5:
            float r0 = r4.getStrokeWidth()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lfe
            goto L101
        Lfe:
            r3.s(r1)
        L101:
            float r0 = r4.getStrokeMiter()
            r1 = 1082130432(0x40800000, float:4.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L10c
            goto L10f
        L10c:
            r4.setStrokeMiter(r1)
        L10f:
            int r0 = r3.g()
            if (r0 != 0) goto L116
            goto L119
        L116:
            r3.q(r9)
        L119:
            int r0 = r3.h()
            if (r0 != 0) goto L120
            goto L123
        L120:
            r3.r(r9)
        L123:
            boolean r0 = defpackage.nb3.k(r8, r8)
            if (r0 != 0) goto L12c
            r3.o(r8)
        L12c:
            boolean r0 = r4.isFilterBitmap()
            if (r0 != r14) goto L137
        L132:
            r19 = r2
            r24 = r3
            goto L13b
        L137:
            r3.n(r14)
            goto L132
        L13b:
            r19.i(r20, r22, r24)
        L13e:
            return r7
        L13f:
            mu4 r0 = (defpackage.mu4) r0
            on2 r12 = (defpackage.on2) r12
            nh2 r13 = (defpackage.nh2) r13
            qn2 r10 = (defpackage.qn2) r10
            qa4 r11 = (defpackage.qa4) r11
            r1 = r26
            oo3 r1 = (defpackage.oo3) r1
            r1.getClass()
            l4 r2 = new l4
            r3 = 9
            r2.<init>(r3, r12, r13)
            zv0 r3 = new zv0
            r4 = 1050778895(0x3ea19d0f, float:0.3156514)
            r3.<init>(r4, r14, r2)
            r2 = 6
            java.lang.String r4 = "resume"
            defpackage.oo3.g0(r1, r4, r8, r3, r2)
            java.util.List r2 = r0.a
            x84 r3 = new x84
            r4 = 26
            r3.<init>(r4)
            int r4 = r2.size()
            r5 r5 = new r5
            r6 = 18
            r5.<init>(r6, r3, r2)
            j5 r3 = new j5
            r6 = 15
            r3.<init>(r6, r2)
            t5 r6 = new t5
            r6.<init>(r2, r0, r10, r11)
            zv0 r0 = new zv0
            r2 = -1117249557(0xffffffffbd681feb, float:-0.056671064)
            r0.<init>(r2, r14, r6)
            r1.h0(r4, r5, r3, r0)
            return r7
        L191:
            zg5 r0 = (defpackage.zg5) r0
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            bh5 r12 = (defpackage.bh5) r12
            zb4 r11 = (defpackage.zb4) r11
            android.os.Bundle r10 = (android.os.Bundle) r10
            r1 = r26
            sb4 r1 = (defpackage.sb4) r1
            r1.getClass()
            r0.A = r14
            int r0 = r13.indexOf(r1)
            r2 = -1
            if (r0 == r2) goto L1b5
            int r2 = r12.A
            int r0 = r0 + r14
            java.util.List r2 = r13.subList(r2, r0)
            r12.A = r0
            goto L1b7
        L1b5:
            yt1 r2 = defpackage.yt1.A
        L1b7:
            ic4 r0 = r1.B
            r11.a(r0, r10, r1, r2)
            return r7
        L1bd:
            r16 = 32
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            m84 r0 = (defpackage.m84) r0
            dh5 r13 = (defpackage.dh5) r13
            ah5 r12 = (defpackage.ah5) r12
            m86 r11 = (defpackage.m86) r11
            zg5 r10 = (defpackage.zg5) r10
            r1 = r26
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            v80 r2 = r0.g
            i84 r2 = defpackage.m84.g(r2)
            if (r2 == 0) goto L222
            yc1 r0 = r0.e
            long r3 = r2.b
            long r5 = r2.a
            java.lang.Object r7 = r0.A
            rl7 r7 = (defpackage.rl7) r7
            r25 = r14
            long r14 = r5 >> r16
            int r8 = (int) r14
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r7.a(r8, r3)
            java.lang.Object r0 = r0.B
            rl7 r0 = (defpackage.rl7) r0
            long r5 = r5 & r17
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r0.a(r5, r3)
            java.lang.Object r0 = r13.A
            i84 r0 = (defpackage.i84) r0
            i84 r0 = r0.a(r2)
            r13.A = r0
            long r3 = r0.a
            long r3 = r11.e(r3)
            float r0 = r11.i(r3)
            r12.A = r0
            float r0 = r0 - r1
            boolean r0 = defpackage.nj2.f(r0)
            r0 = r0 ^ 1
            r10.A = r0
            goto L224
        L222:
            r25 = r14
        L224:
            if (r2 == 0) goto L228
            r9 = r25
        L228:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
        L22d:
            r25 = r14
            aq0 r0 = (defpackage.aq0) r0
            lq4 r13 = (defpackage.lq4) r13
            w61 r12 = (defpackage.w61) r12
            android.content.res.Resources r11 = (android.content.res.Resources) r11
            gl6 r10 = (defpackage.gl6) r10
            r1 = r26
            nc4 r1 = (defpackage.nc4) r1
            r1.getClass()
            ip0 r3 = new ip0
            r3.<init>(r0, r13, r9)
            zv0 r4 = new zv0
            r5 = 355313283(0x152da683, float:3.5068426E-26)
            r6 = r25
            r4.<init>(r5, r6, r3)
            java.lang.Class<dp0> r3 = defpackage.dp0.class
            ar0 r3 = defpackage.gh5.a(r3)
            zt1 r5 = defpackage.zt1.A
            defpackage.jx2.o(r1, r3, r5, r4)
            ip0 r3 = new ip0
            r3.<init>(r0, r13, r6)
            zv0 r4 = new zv0
            r8 = -198237268(0xfffffffff42f23ac, float:-5.5503873E31)
            r4.<init>(r8, r6, r3)
            java.lang.Class<cp0> r3 = defpackage.cp0.class
            ar0 r3 = defpackage.gh5.a(r3)
            defpackage.jx2.o(r1, r3, r5, r4)
            jp0 r8 = new jp0
            r9 = r13
            r13 = r10
            r10 = r9
            r9 = r12
            r12 = r11
            r11 = r9
            r9 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            zv0 r0 = new zv0
            r3 = 247300043(0xebd7fcb, float:4.6715157E-30)
            r0.<init>(r3, r6, r8)
            java.lang.Class<zo0> r3 = defpackage.zo0.class
            ar0 r3 = defpackage.gh5.a(r3)
            defpackage.jx2.o(r1, r3, r5, r0)
            ip0 r0 = new ip0
            r0.<init>(r9, r10, r2)
            zv0 r2 = new zv0
            r3 = 692837354(0x294bdbea, float:4.52658E-14)
            r2.<init>(r3, r6, r0)
            java.lang.Class<wo0> r0 = defpackage.wo0.class
            ar0 r0 = defpackage.gh5.a(r0)
            defpackage.jx2.o(r1, r0, r5, r2)
            return r7
        L2a4:
            v10 r0 = (defpackage.v10) r0
            r1 = r13
            w61 r1 = (defpackage.w61) r1
            x56 r12 = (defpackage.x56) r12
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r10 = (java.lang.String) r10
            r14 = r26
            n00 r14 = (defpackage.n00) r14
            r14.getClass()
            as0 r2 = defpackage.to7.a(r0)
            u10 r3 = new u10
            r4 = 1
            r3.<init>(r0, r14, r8, r4)
            defpackage.hv.L(r2, r8, r8, r3, r6)
            ji r9 = new ji
            r15 = 0
            r16 = 3
            r13 = r12
            r12 = r10
            r10 = r13
            r13 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            defpackage.hv.L(r1, r8, r8, r9, r6)
            return r7
        L2d3:
            c37 r0 = (defpackage.c37) r0
            ki r13 = (defpackage.ki) r13
            l33 r12 = (defpackage.l33) r12
            t00 r11 = (defpackage.t00) r11
            qn2 r10 = (defpackage.qn2) r10
            r1 = r26
            kt3 r1 = (defpackage.kt3) r1
            et3 r2 = r13.a
            r1.h = r0
            r1.i = r12
            r1.c = r11
            r1.d = r10
            if (r2 == 0) goto L2f0
            jt3 r0 = r2.l0
            goto L2f1
        L2f0:
            r0 = r8
        L2f1:
            r1.e = r0
            if (r2 == 0) goto L2f8
            p27 r0 = r2.m0
            goto L2f9
        L2f8:
            r0 = r8
        L2f9:
            r1.f = r0
            if (r2 == 0) goto L306
            nq6 r0 = defpackage.ky0.t
            java.lang.Object r0 = defpackage.hf.K(r2, r0)
            r8 = r0
            fo7 r8 = (defpackage.fo7) r8
        L306:
            r1.g = r8
            return r7
        L309:
            e9 r0 = (defpackage.e9) r0
            j9 r13 = (defpackage.j9) r13
            java.lang.String r12 = (java.lang.String) r12
            b9 r11 = (defpackage.b9) r11
            qa4 r10 = (defpackage.qa4) r10
            r1 = r26
            gl1 r1 = (defpackage.gl1) r1
            k9 r1 = new k9
            r1.<init>(r10, r9)
            i9 r1 = r13.c(r12, r11, r1)
            r0.a = r1
            z3 r1 = new z3
            r4 = 1
            r1.<init>(r0, r4)
            return r1
        L329:
            ss3 r0 = (defpackage.ss3) r0
            ta5 r13 = (defpackage.ta5) r13
            on2 r12 = (defpackage.on2) r12
            r14 = r10
            qn2 r14 = (defpackage.qn2) r14
            r1 = r11
            on2 r1 = (defpackage.on2) r1
            r2 = r26
            er3 r2 = (defpackage.er3) r2
            r2.getClass()
            dq3 r10 = new dq3
            r15 = 2
            r11 = r13
            r13 = r12
            r12 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            zv0 r0 = new zv0
            r3 = 1529186282(0x5b2587ea, float:4.659281E16)
            r4 = 1
            r0.<init>(r3, r4, r10)
            java.lang.String r3 = "leaderboard-header"
            defpackage.er3.g0(r2, r8, r3, r0, r4)
            qs3 r0 = defpackage.qs3.b
            boolean r0 = defpackage.nb3.k(r12, r0)
            java.lang.String r3 = "leaderboard"
            if (r0 == 0) goto L363
            zv0 r0 = defpackage.f04.d
            defpackage.er3.g0(r2, r8, r3, r0, r4)
            goto L3c4
        L363:
            qs3 r0 = defpackage.qs3.a
            boolean r0 = defpackage.nb3.k(r12, r0)
            if (r0 == 0) goto L37c
            h5 r0 = new h5
            r0.<init>(r9, r1)
            zv0 r1 = new zv0
            r5 = 1507824041(0x59df91a9, float:7.8661344E15)
            r1.<init>(r5, r4, r0)
            defpackage.er3.g0(r2, r8, r3, r1, r4)
            goto L3c4
        L37c:
            boolean r0 = r12 instanceof defpackage.rs3
            if (r0 == 0) goto L3c0
            r0 = r12
            rs3 r0 = (defpackage.rs3) r0
            ya5 r0 = r0.a
            java.util.ArrayList r1 = r0.c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L393
            zv0 r0 = defpackage.f04.f
            defpackage.er3.g0(r2, r8, r3, r0, r4)
            goto L3c4
        L393:
            java.util.ArrayList r0 = r0.c
            k0 r1 = new k0
            r1.<init>(r11, r6)
            k4 r3 = new k4
            r3.<init>(r9)
            int r4 = r0.size()
            r5 r5 = new r5
            r5.<init>(r6, r1, r0)
            r5 r1 = new r5
            r6 = 4
            r1.<init>(r6, r3, r0)
            u5 r3 = new u5
            r3.<init>(r9, r0)
            zv0 r0 = new zv0
            r6 = 802480018(0x2fd4df92, float:3.8721432E-10)
            r8 = 1
            r0.<init>(r6, r8, r3)
            r2.h0(r4, r5, r1, r0)
            goto L3c4
        L3c0:
            defpackage.i.d()
            r7 = r8
        L3c4:
            return r7
    }
}
