package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f47  reason: default package */
/* loaded from: classes.dex */
public final class f47 {
    public final defpackage.vs4 a;
    public defpackage.fp b;
    public final defpackage.mm6 c;

    public f47(defpackage.fp r17) {
            r16 = this;
            r0 = r16
            r0.<init>()
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.a = r1
            h37 r1 = new h37
            r2 = 2
            r1.<init>(r2)
            r17.getClass()
            dp r2 = new dp
            r3 = r17
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.ArrayList r4 = r2.L
            int r5 = r4.size()
            r3.<init>(r5)
            int r5 = r4.size()
            r7 = 0
        L2c:
            if (r7 >= r5) goto L6f
            java.lang.Object r8 = r4.get(r7)
            cp r8 = (defpackage.cp) r8
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            ep r8 = r8.a(r9)
            java.lang.Object r8 = r1.g(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.size()
            r9.<init>(r10)
            int r10 = r8.size()
            r11 = 0
        L4e:
            if (r11 >= r10) goto L69
            java.lang.Object r12 = r8.get(r11)
            ep r12 = (defpackage.ep) r12
            cp r13 = new cp
            java.lang.Object r14 = r12.a
            int r15 = r12.b
            int r6 = r12.c
            java.lang.String r12 = r12.d
            r13.<init>(r14, r15, r6, r12)
            r9.add(r13)
            int r11 = r11 + 1
            goto L4e
        L69:
            defpackage.gt0.A0(r3, r9)
            int r7 = r7 + 1
            goto L2c
        L6f:
            r4.clear()
            r4.addAll(r3)
            fp r1 = r2.f()
            r0.b = r1
            mm6 r1 = new mm6
            r1.<init>()
            r0.c = r1
            return
    }

    public static defpackage.ep c(defpackage.ep r2, defpackage.a47 r3) {
            v84 r3 = r3.b
            int r0 = r3.f
            int r0 = r0 + (-1)
            r1 = 0
            int r3 = r3.c(r0, r1)
            int r0 = r2.b
            r1 = 0
            if (r0 >= r3) goto L1d
            int r0 = r2.c
            int r3 = java.lang.Math.min(r0, r3)
            r0 = 11
            ep r2 = defpackage.ep.a(r2, r1, r3, r0)
            return r2
        L1d:
            return r1
    }

    public final void a(defpackage.px0 r32, int r33) {
            r31 = this;
            r0 = r31
            r1 = r33
            r2 = r32
            xq2 r2 = (defpackage.xq2) r2
            r3 = 1154651354(0x44d294da, float:1684.6516)
            r2.d0(r3)
            boolean r3 = r2.h(r0)
            r5 = 2
            if (r3 == 0) goto L17
            r3 = 4
            goto L18
        L17:
            r3 = r5
        L18:
            r3 = r3 | r1
            r6 = r3 & 3
            r8 = 0
            if (r6 == r5) goto L20
            r6 = 1
            goto L21
        L20:
            r6 = r8
        L21:
            r9 = r3 & 1
            boolean r6 = r2.S(r9, r6)
            if (r6 == 0) goto L1df
            nq6 r6 = defpackage.ky0.s
            java.lang.Object r6 = r2.j(r6)
            vm r6 = (defpackage.vm) r6
            fp r9 = r0.b
            java.lang.String r10 = r9.B
            int r10 = r10.length()
            java.util.List r9 = r9.a(r10)
            int r10 = r9.size()
            r11 = r8
        L42:
            if (r11 >= r10) goto L1e2
            java.lang.Object r12 = r9.get(r11)
            ep r12 = (defpackage.ep) r12
            int r13 = r12.b
            java.lang.Object r14 = r12.a
            int r15 = r12.c
            if (r13 == r15) goto L1c8
            r13 = 725478935(0x2b3dee17, float:6.7476705E-13)
            r2.b0(r13)
            java.lang.Object r13 = r2.P()
            vs0 r15 = defpackage.ox0.a
            if (r13 != r15) goto L64
            r94 r13 = defpackage.i61.f(r2)
        L64:
            r94 r13 = (defpackage.r94) r13
            r32 = 4
            qk4 r4 = new qk4
            r22 = r5
            r5 = 25
            r4.<init>(r5, r0, r12)
            x64 r5 = defpackage.x64.a
            a74 r4 = defpackage.hv.G(r5, r4)
            java.lang.Object r5 = r2.P()
            if (r5 != r15) goto L89
            h37 r5 = new h37
            r23 = 1
            r7 = 3
            r5.<init>(r7)
            r2.l0(r5)
            goto L8b
        L89:
            r23 = 1
        L8b:
            qn2 r5 = (defpackage.qn2) r5
            a74 r4 = defpackage.ua6.a(r4, r8, r5)
            l47 r5 = new l47
            pk0 r7 = new pk0
            r8 = 9
            r7.<init>(r8, r0, r12)
            r5.<init>(r7)
            a74 r4 = r4.d(r5)
            a74 r4 = defpackage.nc1.S(r4, r13)
            xd5 r5 = defpackage.ty4.a
            r5.getClass()
            sj r5 = defpackage.jw2.z
            a74 r16 = defpackage.kj2.S(r4, r5)
            boolean r4 = r2.h(r0)
            boolean r5 = r2.f(r12)
            r4 = r4 | r5
            boolean r5 = r2.h(r6)
            r4 = r4 | r5
            java.lang.Object r5 = r2.P()
            if (r4 != 0) goto Lc6
            if (r5 != r15) goto Lce
        Lc6:
            yu6 r5 = new yu6
            r5.<init>(r0, r12, r6)
            r2.l0(r5)
        Lce:
            r20 = r5
            on2 r20 = (defpackage.on2) r20
            r21 = 508(0x1fc, float:7.12E-43)
            r18 = 0
            r19 = 0
            r17 = r13
            a74 r4 = defpackage.mb3.v(r16, r17, r18, r19, r20, r21)
            r5 = 0
            defpackage.h70.a(r4, r2, r5)
            pv3 r14 = (defpackage.pv3) r14
            g47 r4 = r14.a()
            if (r4 == 0) goto Lfa
            nn6 r5 = r4.a
            if (r5 != 0) goto Lfd
            nn6 r5 = r4.b
            if (r5 != 0) goto Lfd
            nn6 r5 = r4.c
            if (r5 != 0) goto Lfd
            nn6 r4 = r4.d
            if (r4 != 0) goto Lfd
        Lfa:
            r5 = 0
            goto L1bb
        Lfd:
            r4 = 726303039(0x2b4a813f, float:7.194418E-13)
            r2.b0(r4)
            java.lang.Object r4 = r2.P()
            if (r4 != r15) goto L111
            vv3 r4 = new vv3
            r4.<init>(r13)
            r2.l0(r4)
        L111:
            vv3 r4 = (defpackage.vv3) r4
            java.lang.Object r5 = r2.P()
            r7 = 0
            if (r5 != r15) goto L124
            ns3 r5 = new ns3
            r8 = 14
            r5.<init>(r4, r7, r8)
            r2.l0(r5)
        L124:
            eo2 r5 = (defpackage.eo2) r5
            jg7 r8 = defpackage.jg7.a
            defpackage.mb3.i(r2, r5, r8)
            ss4 r5 = r4.b
            ss4 r8 = r4.b
            int r5 = r5.h()
            r5 = r5 & 2
            if (r5 == 0) goto L13a
            r5 = r23
            goto L13b
        L13a:
            r5 = 0
        L13b:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r5)
            int r5 = r8.h()
            r5 = r5 & 1
            if (r5 == 0) goto L14a
            r5 = r23
            goto L14b
        L14a:
            r5 = 0
        L14b:
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r5)
            int r5 = r8.h()
            r5 = r5 & 4
            if (r5 == 0) goto L15a
            r5 = r23
            goto L15b
        L15a:
            r5 = 0
        L15b:
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r5)
            g47 r5 = r14.a()
            if (r5 == 0) goto L16a
            nn6 r5 = r5.a
            r27 = r5
            goto L16c
        L16a:
            r27 = r7
        L16c:
            g47 r5 = r14.a()
            if (r5 == 0) goto L177
            nn6 r5 = r5.b
            r28 = r5
            goto L179
        L177:
            r28 = r7
        L179:
            g47 r5 = r14.a()
            if (r5 == 0) goto L184
            nn6 r5 = r5.c
            r29 = r5
            goto L186
        L184:
            r29 = r7
        L186:
            g47 r5 = r14.a()
            if (r5 == 0) goto L18e
            nn6 r7 = r5.d
        L18e:
            r30 = r7
            java.lang.Object[] r5 = new java.lang.Object[]{r24, r25, r26, r27, r28, r29, r30}
            boolean r7 = r2.h(r0)
            boolean r8 = r2.f(r12)
            r7 = r7 | r8
            java.lang.Object r8 = r2.P()
            if (r7 != 0) goto L1a5
            if (r8 != r15) goto L1ad
        L1a5:
            qk4 r8 = new qk4
            r8.<init>(r0, r12, r4)
            r2.l0(r8)
        L1ad:
            qn2 r8 = (defpackage.qn2) r8
            int r4 = r3 << 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r0.b(r5, r8, r2, r4)
            r5 = 0
            r2.p(r5)
            goto L1c4
        L1bb:
            r4 = 728331710(0x2b6975be, float:8.294163E-13)
            r2.b0(r4)
            r2.p(r5)
        L1c4:
            r2.p(r5)
            goto L1d8
        L1c8:
            r22 = r5
            r5 = r8
            r32 = 4
            r23 = 1
            r4 = 728345598(0x2b69abfe, float:8.3016916E-13)
            r2.b0(r4)
            r2.p(r5)
        L1d8:
            int r11 = r11 + 1
            r8 = r5
            r5 = r22
            goto L42
        L1df:
            r2.V()
        L1e2:
            cf5 r2 = r2.t()
            if (r2 == 0) goto L1f1
            y36 r3 = new y36
            r4 = 11
            r3.<init>(r0, r1, r4)
            r2.d = r3
        L1f1:
            return
    }

    public final void b(java.lang.Object[] r8, defpackage.qn2 r9, defpackage.px0 r10, int r11) {
            r7 = this;
            xq2 r10 = (defpackage.xq2) r10
            r0 = -2083052099(0xffffffff83d725bd, float:-1.2645229E-36)
            r10.d0(r0)
            r0 = r11 & 48
            r1 = 32
            if (r0 != 0) goto L1a
            boolean r0 = r10.h(r9)
            if (r0 == 0) goto L16
            r0 = r1
            goto L18
        L16:
            r0 = 16
        L18:
            r0 = r0 | r11
            goto L1b
        L1a:
            r0 = r11
        L1b:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L2b
            boolean r2 = r10.h(r7)
            if (r2 == 0) goto L28
            r2 = 256(0x100, float:3.59E-43)
            goto L2a
        L28:
            r2 = 128(0x80, float:1.8E-43)
        L2a:
            r0 = r0 | r2
        L2b:
            int r2 = r8.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = -358306546(0xffffffffeaa4ad0e, float:-9.954053E25)
            r10.Z(r3, r2)
            int r2 = r8.length
            boolean r2 = r10.d(r2)
            r3 = 4
            r4 = 0
            if (r2 == 0) goto L41
            r2 = r3
            goto L42
        L41:
            r2 = r4
        L42:
            r0 = r0 | r2
            int r2 = r8.length
            r5 = r4
        L45:
            if (r5 >= r2) goto L56
            r6 = r8[r5]
            boolean r6 = r10.h(r6)
            if (r6 == 0) goto L51
            r6 = r3
            goto L52
        L51:
            r6 = r4
        L52:
            r0 = r0 | r6
            int r5 = r5 + 1
            goto L45
        L56:
            r10.p(r4)
            r2 = r0 & 14
            if (r2 != 0) goto L5f
            r0 = r0 | 2
        L5f:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r5 = 1
            if (r2 == r3) goto L68
            r2 = r5
            goto L69
        L68:
            r2 = r4
        L69:
            r3 = r0 & 1
            boolean r2 = r10.S(r3, r2)
            if (r2 == 0) goto Lac
            ww2 r2 = new ww2
            r3 = 2
            r2.<init>(r3)
            r2.a(r9)
            r2.d(r8)
            java.util.ArrayList r2 = r2.b
            int r3 = r2.size()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            boolean r3 = r10.h(r7)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r1) goto L92
            r4 = r5
        L92:
            r0 = r3 | r4
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto L9e
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto La6
        L9e:
            o30 r1 = new o30
            r1.<init>(r7, r9, r5)
            r10.l0(r1)
        La6:
            qn2 r1 = (defpackage.qn2) r1
            defpackage.mb3.f(r2, r1, r10)
            goto Laf
        Lac:
            r10.V()
        Laf:
            cf5 r10 = r10.t()
            if (r10 == 0) goto Lc2
            rl r0 = new rl
            r5 = 27
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.d = r0
        Lc2:
            return
    }
}
