package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ak  reason: default package */
/* loaded from: classes.dex */
public abstract class ak {
    public static final defpackage.py0 a = null;
    public static final defpackage.py0 b = null;

    static {
            jf r0 = defpackage.jf.f0
            py0 r1 = new py0
            r1.<init>(r0)
            defpackage.ak.a = r1
            jf r0 = defpackage.jf.e0
            py0 r1 = new py0
            r1.<init>(r0)
            defpackage.ak.b = r1
            return
    }

    public static final void a(defpackage.f05 r24, defpackage.on2 r25, defpackage.g05 r26, defpackage.zv0 r27, defpackage.px0 r28, int r29, int r30) {
            r1 = r24
            r9 = r27
            r10 = r29
            r11 = r28
            xq2 r11 = (defpackage.xq2) r11
            r0 = -1772091631(0xffffffff96600711, float:-1.8096806E-25)
            r11.d0(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L1f
            boolean r0 = r11.f(r1)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r10
            goto L20
        L1f:
            r0 = r10
        L20:
            r2 = r30 & 2
            if (r2 == 0) goto L29
            r0 = r0 | 48
        L26:
            r3 = r25
            goto L3b
        L29:
            r3 = r10 & 48
            if (r3 != 0) goto L26
            r3 = r25
            boolean r4 = r11.h(r3)
            if (r4 == 0) goto L38
            r4 = 32
            goto L3a
        L38:
            r4 = 16
        L3a:
            r0 = r0 | r4
        L3b:
            r4 = r10 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L4e
            r4 = r26
            boolean r5 = r11.f(r4)
            if (r5 == 0) goto L4a
            r5 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r5 = 128(0x80, float:1.8E-43)
        L4c:
            r0 = r0 | r5
            goto L50
        L4e:
            r4 = r26
        L50:
            r5 = r10 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L60
            boolean r5 = r11.h(r9)
            if (r5 == 0) goto L5d
            r5 = 2048(0x800, float:2.87E-42)
            goto L5f
        L5d:
            r5 = 1024(0x400, float:1.435E-42)
        L5f:
            r0 = r0 | r5
        L60:
            r5 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r8 = 0
            if (r5 == r6) goto L69
            r5 = 1
            goto L6a
        L69:
            r5 = r8
        L6a:
            r6 = r0 & 1
            boolean r5 = r11.S(r6, r5)
            if (r5 == 0) goto L24f
            if (r2 == 0) goto L77
            r18 = 0
            goto L79
        L77:
            r18 = r3
        L79:
            nq6 r2 = defpackage.kf.f
            java.lang.Object r2 = r11.j(r2)
            android.view.View r2 = (android.view.View) r2
            nq6 r3 = defpackage.ky0.h
            java.lang.Object r3 = r11.j(r3)
            qh1 r3 = (defpackage.qh1) r3
            py0 r6 = defpackage.ak.a
            java.lang.Object r6 = r11.j(r6)
            r20 = r6
            java.lang.String r20 = (java.lang.String) r20
            nq6 r6 = defpackage.ky0.n
            java.lang.Object r6 = r11.j(r6)
            r21 = r6
            kk3 r21 = (defpackage.kk3) r21
            vq2 r6 = defpackage.ge7.T(r11)
            qa4 r12 = defpackage.np2.b0(r9, r11)
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Object r7 = r11.P()
            vs0 r13 = defpackage.ox0.a
            if (r7 != r13) goto Lb4
            jf r7 = defpackage.jf.g0
            r11.l0(r7)
        Lb4:
            on2 r7 = (defpackage.on2) r7
            r8 = 48
            java.lang.Object r5 = defpackage.qo2.I(r5, r7, r11, r8)
            r7 = r5
            java.util.UUID r7 = (java.util.UUID) r7
            py0 r5 = defpackage.ak.b
            java.lang.Object r5 = r11.j(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r8 = r5.booleanValue()
            java.lang.Object r5 = r11.P()
            if (r5 != r13) goto Lfe
            r22 = r0
            c05 r0 = new c05
            r5 = r4
            r4 = r2
            r2 = r5
            r5 = r3
            r23 = r6
            r3 = r20
            r14 = r22
            r15 = 1
            r6 = r1
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r6
            zj r2 = new zj
            r2.<init>(r0, r12, r15)
            zv0 r4 = new zv0
            r5 = -297523940(0xffffffffee44251c, float:-1.5175981E28)
            r4.<init>(r5, r15, r2)
            r2 = r23
            r0.m(r2, r4)
            r11.l0(r0)
            r5 = r0
            goto L102
        Lfe:
            r14 = r0
            r3 = r20
            r15 = 1
        L102:
            c05 r5 = (defpackage.c05) r5
            boolean r0 = r11.h(r5)
            r2 = r14 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r2 != r4) goto L110
            r7 = r15
            goto L111
        L110:
            r7 = 0
        L111:
            r0 = r0 | r7
            r4 = r14 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r4 != r6) goto L11a
            r7 = r15
            goto L11b
        L11a:
            r7 = 0
        L11b:
            r0 = r0 | r7
            boolean r6 = r11.f(r3)
            r0 = r0 | r6
            int r6 = r21.ordinal()
            boolean r6 = r11.d(r6)
            r0 = r0 | r6
            java.lang.Object r6 = r11.P()
            if (r0 != 0) goto L132
            if (r6 != r13) goto L142
        L132:
            tj r16 = new tj
            r19 = r26
            r20 = r3
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            r6 = r16
            r11.l0(r6)
        L142:
            qn2 r6 = (defpackage.qn2) r6
            defpackage.mb3.d(r5, r6, r11)
            boolean r0 = r11.h(r5)
            r6 = 32
            if (r2 != r6) goto L151
            r7 = r15
            goto L152
        L151:
            r7 = 0
        L152:
            r0 = r0 | r7
            r6 = 256(0x100, float:3.59E-43)
            if (r4 != r6) goto L159
            r7 = r15
            goto L15a
        L159:
            r7 = 0
        L15a:
            r0 = r0 | r7
            boolean r2 = r11.f(r3)
            r0 = r0 | r2
            int r2 = r21.ordinal()
            boolean r2 = r11.d(r2)
            r0 = r0 | r2
            java.lang.Object r2 = r11.P()
            if (r0 != 0) goto L175
            if (r2 != r13) goto L172
            goto L175
        L172:
            r6 = r21
            goto L187
        L175:
            uj r16 = new uj
            r19 = r26
            r20 = r3
            r17 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            r2 = r16
            r6 = r21
            r11.l0(r2)
        L187:
            on2 r2 = (defpackage.on2) r2
            defpackage.mb3.n(r2, r11)
            boolean r0 = r11.h(r5)
            r2 = r14 & 14
            r3 = 4
            if (r2 != r3) goto L197
            r7 = r15
            goto L198
        L197:
            r7 = 0
        L198:
            r0 = r0 | r7
            java.lang.Object r2 = r11.P()
            if (r0 != 0) goto L1a1
            if (r2 != r13) goto L1aa
        L1a1:
            qj r2 = new qj
            r0 = 2
            r2.<init>(r0, r5, r1)
            r11.l0(r2)
        L1aa:
            qn2 r2 = (defpackage.qn2) r2
            defpackage.mb3.d(r1, r2, r11)
            boolean r0 = r11.h(r5)
            java.lang.Object r2 = r11.P()
            if (r0 != 0) goto L1bb
            if (r2 != r13) goto L1c5
        L1bb:
            z r2 = new z
            r0 = 5
            r3 = 0
            r2.<init>(r5, r3, r0)
            r11.l0(r2)
        L1c5:
            eo2 r2 = (defpackage.eo2) r2
            defpackage.mb3.i(r11, r2, r5)
            boolean r0 = r11.h(r5)
            java.lang.Object r2 = r11.P()
            if (r0 != 0) goto L1d9
            if (r2 != r13) goto L1d7
            goto L1d9
        L1d7:
            r0 = 0
            goto L1e2
        L1d9:
            wj r2 = new wj
            r0 = 0
            r2.<init>(r5, r0)
            r11.l0(r2)
        L1e2:
            qn2 r2 = (defpackage.qn2) r2
            x64 r3 = defpackage.x64.a
            a74 r2 = defpackage.u24.z(r3, r2)
            boolean r3 = r11.h(r5)
            int r4 = r6.ordinal()
            boolean r4 = r11.d(r4)
            r3 = r3 | r4
            java.lang.Object r4 = r11.P()
            if (r3 != 0) goto L1ff
            if (r4 != r13) goto L207
        L1ff:
            xj r4 = new xj
            r4.<init>(r0, r5, r6)
            r11.l0(r4)
        L207:
            e34 r4 = (defpackage.e34) r4
            long r5 = r11.T
            int r0 = java.lang.Long.hashCode(r5)
            xv4 r3 = r11.l()
            a74 r2 = defpackage.l.E(r11, r2)
            ix0 r5 = defpackage.jx0.i
            r5.getClass()
            iy0 r5 = defpackage.ix0.b
            r11.f0()
            boolean r6 = r11.S
            if (r6 == 0) goto L229
            r11.k(r5)
            goto L22c
        L229:
            r11.o0()
        L22c:
            pn r5 = defpackage.ix0.f
            defpackage.yh2.K(r11, r5, r4)
            pn r4 = defpackage.ix0.e
            defpackage.yh2.K(r11, r4, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            pn r3 = defpackage.ix0.g
            defpackage.yh2.K(r11, r3, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r11, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r11, r0, r2)
            r11.p(r15)
            r2 = r18
            goto L253
        L24f:
            r11.V()
            r2 = r3
        L253:
            cf5 r7 = r11.t()
            if (r7 == 0) goto L266
            yj r0 = new yj
            r3 = r26
            r6 = r30
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L266:
            return
    }

    public static final boolean b(android.view.View r1) {
            android.view.View r1 = r1.getRootView()
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof android.view.WindowManager.LayoutParams
            if (r0 == 0) goto Lf
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1
            goto L10
        Lf:
            r1 = 0
        L10:
            r0 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.flags
            r1 = r1 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            return r0
    }
}
