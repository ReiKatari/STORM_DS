package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n91 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ defpackage.ao2 X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.ao2 d0;
    public final /* synthetic */ java.lang.Object e0;

    public /* synthetic */ n91(int r2, defpackage.eo2 r3, defpackage.zv0 r4, defpackage.eo2 r5, defpackage.wa4 r6, defpackage.eo2 r7, defpackage.fo2 r8, defpackage.x56 r9) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            r1.Y = r6
            r1.Z = r7
            r1.d0 = r8
            r1.e0 = r9
            return
    }

    public /* synthetic */ n91(defpackage.eo2 r2, defpackage.zv0 r3, defpackage.eo2 r4, int r5, defpackage.tt7 r6, defpackage.u56 r7, defpackage.eo2 r8, defpackage.zv0 r9) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.X = r4
            r1.B = r5
            r1.Y = r6
            r1.Z = r7
            r1.d0 = r8
            r1.e0 = r9
            return
    }

    public /* synthetic */ n91(me.magnum.melonds.domain.model.DSiWareTitle r2, defpackage.i91 r3, defpackage.qn2 r4, defpackage.on2 r5, defpackage.on2 r6, defpackage.qn2 r7, defpackage.qn2 r8, int r9) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.X = r4
            r1.d0 = r5
            r1.e0 = r6
            r1.Y = r7
            r1.Z = r8
            r1.B = r9
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r33, java.lang.Object r34) {
            r32 = this;
            r0 = r32
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            int r5 = r0.B
            java.lang.Object r7 = r0.e0
            ao2 r8 = r0.d0
            java.lang.Object r9 = r0.Z
            java.lang.Object r10 = r0.Y
            ao2 r11 = r0.X
            java.lang.Object r12 = r0.R
            java.lang.Object r13 = r0.L
            switch(r1) {
                case 0: goto L3fb;
                case 1: goto L3ad;
                default: goto L19;
            }
        L19:
            eo2 r13 = (defpackage.eo2) r13
            zv0 r12 = (defpackage.zv0) r12
            eo2 r11 = (defpackage.eo2) r11
            tt7 r10 = (defpackage.tt7) r10
            u56 r9 = (defpackage.u56) r9
            eo2 r8 = (defpackage.eo2) r8
            zv0 r7 = (defpackage.zv0) r7
            r0 = r33
            qt6 r0 = (defpackage.qt6) r0
            r1 = r34
            q21 r1 = (defpackage.q21) r1
            float r2 = defpackage.v56.b
            long r14 = r1.a
            int r14 = defpackage.q21.h(r14)
            r16 = r5
            long r4 = r1.a
            int r24 = defpackage.q21.g(r4)
            long r4 = r1.a
            r22 = 0
            r23 = 10
            r19 = 0
            r20 = 0
            r21 = 0
            r17 = r4
            long r4 = defpackage.q21.a(r17, r19, r20, r21, r22, r23)
            w56 r1 = defpackage.w56.TopBar
            java.util.List r1 = r0.v(r13, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r15 = r1.size()
            r13.<init>(r15)
            int r15 = r1.size()
            r6 = 0
            r17 = 1
        L67:
            if (r6 >= r15) goto L7b
            java.lang.Object r18 = r1.get(r6)
            r3 = r18
            x24 r3 = (defpackage.x24) r3
            dx4 r3 = r3.y(r4)
            r13.add(r3)
            int r6 = r6 + 1
            goto L67
        L7b:
            boolean r1 = r13.isEmpty()
            if (r1 == 0) goto L83
            r6 = 0
            goto Lb1
        L83:
            r1 = 0
            java.lang.Object r6 = r13.get(r1)
            r1 = r6
            dx4 r1 = (defpackage.dx4) r1
            int r1 = r1.B
            int r15 = r13.size()
            int r15 = r15 + (-1)
            r3 = r17
            if (r3 > r15) goto Lb1
            r3 = 1
        L98:
            java.lang.Object r18 = r13.get(r3)
            r34 = r6
            r6 = r18
            dx4 r6 = (defpackage.dx4) r6
            int r6 = r6.B
            if (r1 >= r6) goto Laa
            r1 = r6
            r6 = r18
            goto Lac
        Laa:
            r6 = r34
        Lac:
            if (r3 == r15) goto Lb1
            int r3 = r3 + 1
            goto L98
        Lb1:
            dx4 r6 = (defpackage.dx4) r6
            if (r6 == 0) goto Lba
            int r1 = r6.B
            r23 = r1
            goto Lbc
        Lba:
            r23 = 0
        Lbc:
            w56 r1 = defpackage.w56.Snackbar
            java.util.List r1 = r0.v(r12, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = r1.size()
            r3.<init>(r6)
            int r6 = r1.size()
            r12 = 0
        Ld0:
            if (r12 >= r6) goto L10e
            java.lang.Object r15 = r1.get(r12)
            x24 r15 = (defpackage.x24) r15
            r34 = r1
            kk3 r1 = r0.getLayoutDirection()
            int r1 = r10.d(r0, r1)
            r18 = r6
            kk3 r6 = r0.getLayoutDirection()
            int r6 = r10.b(r0, r6)
            r20 = r6
            int r6 = r10.c(r0)
            int r1 = -r1
            int r1 = r1 - r20
            int r6 = -r6
            r21 = r12
            r20 = r13
            long r12 = defpackage.s21.i(r4, r1, r6)
            dx4 r1 = r15.y(r12)
            r3.add(r1)
            int r12 = r21 + 1
            r1 = r34
            r6 = r18
            r13 = r20
            goto Ld0
        L10e:
            r20 = r13
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L11a
            r34 = r3
            r6 = 0
            goto L145
        L11a:
            r1 = 0
            java.lang.Object r6 = r3.get(r1)
            r1 = r6
            dx4 r1 = (defpackage.dx4) r1
            int r1 = r1.B
            int r12 = r3.size()
            r13 = 1
            int r12 = r12 - r13
            if (r13 > r12) goto L143
            r13 = 1
        L12d:
            java.lang.Object r15 = r3.get(r13)
            r34 = r3
            r3 = r15
            dx4 r3 = (defpackage.dx4) r3
            int r3 = r3.B
            if (r1 >= r3) goto L13c
            r1 = r3
            r6 = r15
        L13c:
            if (r13 == r12) goto L145
            int r13 = r13 + 1
            r3 = r34
            goto L12d
        L143:
            r34 = r3
        L145:
            dx4 r6 = (defpackage.dx4) r6
            if (r6 == 0) goto L14c
            int r1 = r6.B
            goto L14d
        L14c:
            r1 = 0
        L14d:
            w56 r3 = defpackage.w56.Fab
            java.util.List r3 = r0.v(r11, r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r11 = r3.size()
            r6.<init>(r11)
            int r11 = r3.size()
            r12 = 0
        L161:
            if (r12 >= r11) goto L19b
            java.lang.Object r13 = r3.get(r12)
            x24 r13 = (defpackage.x24) r13
            kk3 r15 = r0.getLayoutDirection()
            int r15 = r10.d(r0, r15)
            r18 = r1
            kk3 r1 = r0.getLayoutDirection()
            int r1 = r10.b(r0, r1)
            r21 = r1
            int r1 = r10.c(r0)
            int r15 = -r15
            int r15 = r15 - r21
            int r1 = -r1
            r21 = r11
            r22 = r12
            long r11 = defpackage.s21.i(r4, r15, r1)
            dx4 r1 = r13.y(r11)
            r6.add(r1)
            int r12 = r22 + 1
            r1 = r18
            r11 = r21
            goto L161
        L19b:
            r18 = r1
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L255
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L1ab
            r3 = 0
            goto L1d0
        L1ab:
            r1 = 0
            java.lang.Object r3 = r6.get(r1)
            r1 = r3
            dx4 r1 = (defpackage.dx4) r1
            int r1 = r1.A
            int r11 = r6.size()
            r13 = 1
            int r11 = r11 - r13
            if (r13 > r11) goto L1d0
            r12 = 1
        L1be:
            java.lang.Object r13 = r6.get(r12)
            r15 = r13
            dx4 r15 = (defpackage.dx4) r15
            int r15 = r15.A
            if (r1 >= r15) goto L1cb
            r3 = r13
            r1 = r15
        L1cb:
            if (r12 == r11) goto L1d0
            int r12 = r12 + 1
            goto L1be
        L1d0:
            dx4 r3 = (defpackage.dx4) r3
            if (r3 == 0) goto L1d7
            int r1 = r3.A
            goto L1d8
        L1d7:
            r1 = 0
        L1d8:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L1e2
            r21 = r1
            r11 = 0
            goto L20d
        L1e2:
            r3 = 0
            java.lang.Object r11 = r6.get(r3)
            r3 = r11
            dx4 r3 = (defpackage.dx4) r3
            int r3 = r3.B
            int r12 = r6.size()
            r13 = 1
            int r12 = r12 - r13
            if (r13 > r12) goto L20b
            r13 = 1
        L1f5:
            java.lang.Object r15 = r6.get(r13)
            r21 = r1
            r1 = r15
            dx4 r1 = (defpackage.dx4) r1
            int r1 = r1.B
            if (r3 >= r1) goto L204
            r3 = r1
            r11 = r15
        L204:
            if (r13 == r12) goto L20d
            int r13 = r13 + 1
            r1 = r21
            goto L1f5
        L20b:
            r21 = r1
        L20d:
            dx4 r11 = (defpackage.dx4) r11
            if (r11 == 0) goto L214
            int r1 = r11.B
            goto L215
        L214:
            r1 = 0
        L215:
            if (r21 == 0) goto L255
            if (r1 == 0) goto L255
            if (r16 != 0) goto L231
            kk3 r3 = r0.getLayoutDirection()
            kk3 r11 = defpackage.kk3.Ltr
            if (r3 != r11) goto L228
            int r3 = r0.r0(r2)
            goto L24b
        L228:
            int r3 = r0.r0(r2)
        L22c:
            int r3 = r14 - r3
            int r3 = r3 - r21
            goto L24b
        L231:
            r3 = r16
            r15 = 2
            if (r3 != r15) goto L248
            kk3 r3 = r0.getLayoutDirection()
            kk3 r11 = defpackage.kk3.Ltr
            if (r3 != r11) goto L243
            int r3 = r0.r0(r2)
            goto L22c
        L243:
            int r3 = r0.r0(r2)
            goto L24b
        L248:
            int r3 = r14 - r21
            int r3 = r3 / r15
        L24b:
            dy7 r11 = new dy7
            r11.<init>()
            r11.a = r3
            r11.b = r1
            goto L256
        L255:
            r11 = 0
        L256:
            w56 r1 = defpackage.w56.BottomBar
            sa5 r3 = new sa5
            r12 = 7
            r3.<init>(r12, r11, r8)
            zv0 r8 = new zv0
            r12 = -502652347(0xffffffffe20a2245, float:-6.3703E20)
            r13 = 1
            r8.<init>(r12, r13, r3)
            java.util.List r1 = r0.v(r8, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r8 = r1.size()
            r3.<init>(r8)
            int r8 = r1.size()
            r12 = 0
        L279:
            if (r12 >= r8) goto L28b
            java.lang.Object r13 = r1.get(r12)
            x24 r13 = (defpackage.x24) r13
            dx4 r13 = r13.y(r4)
            r3.add(r13)
            int r12 = r12 + 1
            goto L279
        L28b:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L293
            r8 = 0
            goto L2bb
        L293:
            r1 = 0
            java.lang.Object r8 = r3.get(r1)
            r12 = r8
            dx4 r12 = (defpackage.dx4) r12
            int r12 = r12.B
            int r13 = r3.size()
            r15 = 1
            int r13 = r13 - r15
            if (r15 > r13) goto L2bb
            r15 = 1
        L2a6:
            java.lang.Object r16 = r3.get(r15)
            r1 = r16
            dx4 r1 = (defpackage.dx4) r1
            int r1 = r1.B
            if (r12 >= r1) goto L2b5
            r12 = r1
            r8 = r16
        L2b5:
            if (r15 == r13) goto L2bb
            int r15 = r15 + 1
            r1 = 0
            goto L2a6
        L2bb:
            dx4 r8 = (defpackage.dx4) r8
            if (r8 == 0) goto L2c6
            int r1 = r8.B
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L2c7
        L2c6:
            r1 = 0
        L2c7:
            if (r11 == 0) goto L2e8
            int r8 = r11.b
            if (r1 != 0) goto L2d8
            int r2 = r0.r0(r2)
            int r2 = r2 + r8
            int r8 = r10.c(r0)
            int r8 = r8 + r2
            goto L2e3
        L2d8:
            int r12 = r1.intValue()
            int r12 = r12 + r8
            int r2 = r0.r0(r2)
            int r8 = r2 + r12
        L2e3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L2e9
        L2e8:
            r2 = 0
        L2e9:
            if (r18 == 0) goto L300
            if (r2 == 0) goto L2f2
            int r8 = r2.intValue()
            goto L2fd
        L2f2:
            if (r1 == 0) goto L2f9
            int r8 = r1.intValue()
            goto L2fd
        L2f9:
            int r8 = r10.c(r0)
        L2fd:
            int r8 = r18 + r8
            goto L301
        L300:
            r8 = 0
        L301:
            o83 r12 = new o83
            r12.<init>(r10, r0)
            boolean r10 = r20.isEmpty()
            if (r10 == 0) goto L311
            float r10 = r12.d()
            goto L312
        L311:
            r10 = 0
        L312:
            boolean r13 = r3.isEmpty()
            if (r13 != 0) goto L324
            if (r1 != 0) goto L31b
            goto L324
        L31b:
            int r13 = r1.intValue()
            float r13 = r0.Q(r13)
            goto L328
        L324:
            float r13 = r12.a()
        L328:
            kk3 r15 = r0.getLayoutDirection()
            float r15 = defpackage.ge7.r(r12, r15)
            r32 = r1
            kk3 r1 = r0.getLayoutDirection()
            float r1 = defpackage.ge7.q(r12, r1)
            pq4 r12 = new pq4
            r12.<init>(r15, r10, r1, r13)
            vs4 r1 = r9.a
            r1.setValue(r12)
            int r30 = r24 - r23
            w56 r1 = defpackage.w56.MainContent
            sa5 r10 = new sa5
            r12 = 5
            r10.<init>(r12, r7, r9)
            zv0 r7 = new zv0
            r9 = -574531306(0xffffffffddc15916, float:-1.7415239E18)
            r13 = 1
            r7.<init>(r9, r13, r10)
            java.util.List r1 = r0.v(r7, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = r1.size()
            r7.<init>(r9)
            int r9 = r1.size()
            r10 = 0
        L369:
            if (r10 >= r9) goto L38b
            java.lang.Object r12 = r1.get(r10)
            x24 r12 = (defpackage.x24) r12
            r29 = 0
            r31 = 7
            r27 = 0
            r28 = 0
            r25 = r4
            long r4 = defpackage.q21.a(r25, r27, r28, r29, r30, r31)
            dx4 r4 = r12.y(r4)
            r7.add(r4)
            int r10 = r10 + 1
            r4 = r25
            goto L369
        L38b:
            q56 r17 = new q56
            r26 = r32
            r28 = r2
            r21 = r3
            r22 = r6
            r18 = r7
            r25 = r8
            r27 = r11
            r19 = r20
            r20 = r34
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = r17
            r1 = r24
            zt1 r3 = defpackage.zt1.A
            f34 r0 = r0.K(r14, r1, r3, r2)
            return r0
        L3ad:
            r4 = r13
            eo2 r4 = (defpackage.eo2) r4
            r5 = r12
            zv0 r5 = (defpackage.zv0) r5
            eo2 r11 = (defpackage.eo2) r11
            wa4 r10 = (defpackage.wa4) r10
            eo2 r9 = (defpackage.eo2) r9
            fo2 r8 = (defpackage.fo2) r8
            x56 r7 = (defpackage.x56) r7
            r1 = r33
            px0 r1 = (defpackage.px0) r1
            r3 = r34
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6 = r3 & 3
            r15 = 2
            if (r6 == r15) goto L3d2
            r6 = 1
        L3cf:
            r17 = 1
            goto L3d4
        L3d2:
            r6 = 0
            goto L3cf
        L3d4:
            r3 = r3 & 1
            xq2 r1 = (defpackage.xq2) r1
            boolean r3 = r1.S(r3, r6)
            if (r3 == 0) goto L3f6
            sa5 r3 = new sa5
            r6 = 6
            r3.<init>(r6, r8, r7)
            r6 = 545329543(0x20811187, float:2.1865049E-19)
            zv0 r6 = defpackage.n16.I(r6, r3, r1)
            r7 = r11
            r11 = 24576(0x6000, float:3.4438E-41)
            int r3 = r0.B
            r8 = r10
            r10 = r1
            defpackage.v56.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L3fa
        L3f6:
            r10 = r1
            r10.V()
        L3fa:
            return r2
        L3fb:
            r3 = r5
            me.magnum.melonds.domain.model.DSiWareTitle r13 = (me.magnum.melonds.domain.model.DSiWareTitle) r13
            i91 r12 = (defpackage.i91) r12
            qn2 r11 = (defpackage.qn2) r11
            r14 = r8
            on2 r14 = (defpackage.on2) r14
            r15 = r7
            on2 r15 = (defpackage.on2) r15
            r16 = r10
            qn2 r16 = (defpackage.qn2) r16
            qn2 r9 = (defpackage.qn2) r9
            r18 = r33
            px0 r18 = (defpackage.px0) r18
            r0 = r34
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            r17 = 1
            r0 = r3 | 1
            int r19 = defpackage.ii2.a0(r0)
            r17 = r13
            r13 = r11
            r11 = r17
            r17 = r9
            defpackage.ge7.g(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
    }
}
