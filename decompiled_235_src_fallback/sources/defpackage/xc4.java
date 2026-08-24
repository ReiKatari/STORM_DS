package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc4  reason: default package */
/* loaded from: classes.dex */
public final class xc4 implements defpackage.go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ xc4(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
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

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
            r23 = this;
            r0 = r23
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r0.Y
            r4 = 0
            java.lang.Object r5 = r0.R
            java.lang.Object r6 = r0.L
            java.lang.Object r7 = r0.B
            java.lang.Object r0 = r0.X
            r8 = 0
            switch(r1) {
                case 0: goto L10e;
                default: goto L15;
            }
        L15:
            r1 = r24
            lp3 r1 = (defpackage.lp3) r1
            r9 = r25
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10 = r26
            px0 r10 = (defpackage.px0) r10
            r11 = r27
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            qn2 r0 = (defpackage.qn2) r0
            r12 = r11 & 6
            if (r12 != 0) goto L41
            r12 = r10
            xq2 r12 = (defpackage.xq2) r12
            boolean r1 = r12.f(r1)
            if (r1 == 0) goto L3e
            r1 = 4
            goto L3f
        L3e:
            r1 = 2
        L3f:
            r1 = r1 | r11
            goto L42
        L41:
            r1 = r11
        L42:
            r11 = r11 & 48
            if (r11 != 0) goto L55
            r11 = r10
            xq2 r11 = (defpackage.xq2) r11
            boolean r11 = r11.d(r9)
            if (r11 == 0) goto L52
            r11 = 32
            goto L54
        L52:
            r11 = 16
        L54:
            r1 = r1 | r11
        L55:
            r11 = r1 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            r13 = 1
            if (r11 == r12) goto L5e
            r11 = r13
            goto L5f
        L5e:
            r11 = r8
        L5f:
            r1 = r1 & r13
            xq2 r10 = (defpackage.xq2) r10
            boolean r1 = r10.S(r1, r11)
            if (r1 == 0) goto L10a
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r1 = r7.get(r9)
            zq7 r1 = (defpackage.zq7) r1
            r7 = 1307584831(0x4df0293f, float:5.0365437E8)
            r10.b0(r7)
            sr7 r6 = (defpackage.sr7) r6
            sr7 r7 = defpackage.sr7.CUSTOM
            if (r6 != r7) goto L87
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r1.a
            boolean r5 = defpackage.nb3.k(r5, r6)
            if (r5 == 0) goto L87
            goto L88
        L87:
            r13 = r8
        L88:
            x64 r5 = defpackage.x64.a
            r6 = 1065353216(0x3f800000, float:1.0)
            a74 r5 = defpackage.dj6.c(r5, r6)
            boolean r6 = r10.f(r0)
            boolean r7 = r10.f(r1)
            r6 = r6 | r7
            java.lang.Object r7 = r10.P()
            if (r6 != 0) goto La3
            vs0 r6 = defpackage.ox0.a
            if (r7 != r6) goto Lab
        La3:
            lr7 r7 = new lr7
            r7.<init>(r0, r1, r8)
            r10.l0(r7)
        Lab:
            on2 r7 = (defpackage.on2) r7
            r6 = 15
            a74 r14 = defpackage.mb3.u(r5, r8, r4, r7, r6)
            r4 = 1094713344(0x41400000, float:12.0)
            y16 r15 = defpackage.z16.b(r4)
            if (r13 == 0) goto Ld7
            r4 = 319284742(0x1307e606, float:1.7152806E-27)
            r10.b0(r4)
            r10.p(r8)
            r4 = 4278556265(0xff059669, double:2.1138876643E-314)
            long r4 = defpackage.hv.c(r4)
            r6 = 1041865114(0x3e19999a, float:0.15)
            long r4 = defpackage.kt0.c(r6, r4)
        Ld4:
            r16 = r4
            goto Led
        Ld7:
            r4 = 319286714(0x1307edba, float:1.7156604E-27)
            r10.b0(r4)
            nq6 r4 = defpackage.vt0.a
            java.lang.Object r4 = r10.j(r4)
            ut0 r4 = (defpackage.ut0) r4
            long r4 = r4.j()
            r10.p(r8)
            goto Ld4
        Led:
            mr7 r4 = new mr7
            qn2 r3 = (defpackage.qn2) r3
            r4.<init>(r13, r0, r1, r3)
            r0 = -565872080(0xffffffffde457a30, float:-3.5574347E18)
            zv0 r19 = defpackage.n16.I(r0, r4, r10)
            r21 = 1769472(0x1b0000, float:2.479558E-39)
            r22 = 24
            r18 = 1073741824(0x40000000, float:2.0)
            r20 = r10
            defpackage.hf.b(r14, r15, r16, r18, r19, r20, r21, r22)
            r10.p(r8)
            goto L10d
        L10a:
            r10.V()
        L10d:
            return r2
        L10e:
            r1 = r24
            sn r1 = (defpackage.sn) r1
            r9 = r25
            sb4 r9 = (defpackage.sb4) r9
            r10 = r26
            px0 r10 = (defpackage.px0) r10
            r11 = r27
            java.lang.Number r11 = (java.lang.Number) r11
            r11.intValue()
            n96 r7 = (defpackage.n96) r7
            vs4 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            sb4 r6 = (defpackage.sb4) r6
            boolean r6 = defpackage.nb3.k(r7, r6)
            qa4 r0 = (defpackage.qa4) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L167
            if (r6 == 0) goto L140
            goto L167
        L140:
            pp6 r3 = (defpackage.pp6) r3
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            int r3 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r3)
        L150:
            boolean r3 = r0.hasPrevious()
            if (r3 == 0) goto L164
            java.lang.Object r3 = r0.previous()
            r6 = r3
            sb4 r6 = (defpackage.sb4) r6
            boolean r6 = defpackage.nb3.k(r9, r6)
            if (r6 == 0) goto L150
            r4 = r3
        L164:
            r9 = r4
            sb4 r9 = (defpackage.sb4) r9
        L167:
            xq2 r10 = (defpackage.xq2) r10
            if (r9 != 0) goto L175
            r0 = 105930796(0x650602c, float:3.9191108E-35)
            r10.b0(r0)
        L171:
            r10.p(r8)
            goto L18f
        L175:
            r0 = -1520603531(0xffffffffa55d6e75, float:-1.9206119E-16)
            r10.b0(r0)
            o46 r5 = (defpackage.o46) r5
            dj1 r0 = new dj1
            r0.<init>(r9, r1)
            r1 = -1263531443(0xffffffffb4b00a4d, float:-3.279005E-7)
            zv0 r0 = defpackage.n16.I(r1, r0, r10)
            r1 = 384(0x180, float:5.38E-43)
            defpackage.kn2.f(r9, r5, r0, r10, r1)
            goto L171
        L18f:
            return r2
    }
}
