package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nj2  reason: default package */
/* loaded from: classes.dex */
public abstract class nj2 {
    public static defpackage.zh a;
    public static defpackage.wd b;
    public static defpackage.zj0 c;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static defpackage.e33 g;
    public static defpackage.e33 h;

    public static final int B(int r1, java.lang.String r2) {
            char r0 = r2.charAt(r1)
            int r1 = r1 + 1
            char r1 = r2.charAt(r1)
            int r2 = r0 << 7
            int r2 = r2 + r1
            return r2
    }

    public static final defpackage.p46 C(defpackage.px0 r5) {
            xq2 r5 = (defpackage.xq2) r5
            r0 = 1967007413(0x753e26b5, float:2.4104528E32)
            r5.b0(r0)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r2 = r5.P()
            vs0 r3 = defpackage.ox0.a
            if (r2 != r3) goto L1c
            kt5 r2 = new kt5
            r3 = 3
            r2.<init>(r3)
            r5.l0(r2)
        L1c:
            on2 r2 = (defpackage.on2) r2
            r3 = 384(0x180, float:5.38E-43)
            ap3 r4 = defpackage.p46.X
            java.lang.Object r1 = defpackage.qo2.J(r1, r4, r2, r5, r3)
            p46 r1 = (defpackage.p46) r1
            nq6 r2 = defpackage.s46.a
            java.lang.Object r2 = r5.j(r2)
            q46 r2 = (defpackage.q46) r2
            r1.L = r2
            r5.p(r0)
            return r1
    }

    public static void D(java.lang.Runnable r2) {
            boolean r0 = x()
            if (r0 == 0) goto La
            r2.run()
            return
        La:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            boolean r2 = r0.post(r2)
            java.lang.String r0 = "Unable to post to main thread"
            defpackage.np2.A(r0, r2)
            return
    }

    public static defpackage.a74 E(defpackage.a74 r9, float r10, defpackage.ke6 r11, boolean r12, long r13, int r15) {
            r1 = r15 & 4
            r3 = 0
            if (r1 == 0) goto L10
            int r1 = defpackage.om1.a(r10, r3)
            if (r1 <= 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            r4 = r1
            goto L11
        L10:
            r4 = r12
        L11:
            long r5 = defpackage.yt2.a
            r1 = r15 & 16
            if (r1 == 0) goto L19
            r7 = r5
            goto L1a
        L19:
            r7 = r13
        L1a:
            int r1 = defpackage.om1.a(r10, r3)
            if (r1 > 0) goto L24
            if (r4 == 0) goto L23
            goto L24
        L23:
            return r9
        L24:
            he6 r1 = new he6
            r2 = r10
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r7)
            a74 r0 = r9.d(r1)
            return r0
    }

    public static java.lang.String F(long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerId(value="
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final defpackage.qo7 G(defpackage.ar0 r0, defpackage.bp7 r1, defpackage.m9 r2, defpackage.j71 r3, defpackage.px0 r4) {
            if (r2 == 0) goto L12
            ap7 r1 = r1.getViewModelStore()
            r1.getClass()
            r3.getClass()
            os0 r4 = new os0
            r4.<init>(r1, r2, r3)
            goto L35
        L12:
            boolean r2 = r1 instanceof defpackage.mw2
            if (r2 == 0) goto L2f
            ap7 r2 = r1.getViewModelStore()
            mw2 r1 = (defpackage.mw2) r1
            yo7 r1 = r1.getDefaultViewModelProviderFactory()
            r2.getClass()
            r1.getClass()
            r3.getClass()
            os0 r4 = new os0
            r4.<init>(r2, r1, r3)
            goto L35
        L2f:
            r2 = 0
            r3 = 6
            os0 r4 = defpackage.xo7.a(r1, r2, r3)
        L35:
            qo7 r0 = r4.Z(r0)
            return r0
    }

    public static final void a(defpackage.b37 r28, java.lang.String r29, defpackage.eo2 r30, defpackage.wq7 r31, defpackage.eo2 r32, defpackage.eo2 r33, boolean r34, boolean r35, boolean r36, defpackage.r94 r37, defpackage.lq4 r38, defpackage.ke6 r39, defpackage.i17 r40, defpackage.zv0 r41, defpackage.px0 r42, int r43, int r44) {
            r2 = r29
            r4 = r31
            r5 = r32
            r8 = r35
            r9 = r36
            r10 = r37
            r13 = r40
            r0 = r43
            r1 = r44
            r3 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7 = r42
            xq2 r7 = (defpackage.xq2) r7
            r11 = 418608794(0x18f3769a, float:6.2933785E-24)
            r7.d0(r11)
            r11 = r0 & 6
            if (r11 != 0) goto L34
            int r11 = r28.ordinal()
            boolean r11 = r7.d(r11)
            if (r11 == 0) goto L31
            r11 = 4
            goto L32
        L31:
            r11 = 2
        L32:
            r11 = r11 | r0
            goto L35
        L34:
            r11 = r0
        L35:
            r15 = r0 & 48
            r16 = 16
            if (r15 != 0) goto L47
            boolean r15 = r7.f(r2)
            if (r15 == 0) goto L44
            r15 = 32
            goto L46
        L44:
            r15 = r16
        L46:
            r11 = r11 | r15
        L47:
            r15 = r0 & 384(0x180, float:5.38E-43)
            r17 = 128(0x80, float:1.8E-43)
            r18 = 256(0x100, float:3.59E-43)
            if (r15 != 0) goto L5f
            r15 = r30
            boolean r19 = r7.h(r15)
            if (r19 == 0) goto L5a
            r19 = r18
            goto L5c
        L5a:
            r19 = r17
        L5c:
            r11 = r11 | r19
            goto L61
        L5f:
            r15 = r30
        L61:
            r14 = r0 & 3072(0xc00, float:4.305E-42)
            r20 = 1024(0x400, float:1.435E-42)
            if (r14 != 0) goto L73
            boolean r14 = r7.f(r4)
            if (r14 == 0) goto L70
            r14 = 2048(0x800, float:2.87E-42)
            goto L72
        L70:
            r14 = r20
        L72:
            r11 = r11 | r14
        L73:
            r14 = r0 & 24576(0x6000, float:3.4438E-41)
            r21 = 8192(0x2000, float:1.148E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r14 != 0) goto L87
            boolean r14 = r7.h(r5)
            if (r14 == 0) goto L84
            r14 = r22
            goto L86
        L84:
            r14 = r21
        L86:
            r11 = r11 | r14
        L87:
            r14 = 196608(0x30000, float:2.75506E-40)
            r23 = r0 & r14
            r24 = 65536(0x10000, float:9.1835E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            if (r23 != 0) goto La3
            r23 = r14
            r14 = r33
            boolean r26 = r7.h(r14)
            if (r26 == 0) goto L9e
            r26 = r25
            goto La0
        L9e:
            r26 = r24
        La0:
            r11 = r11 | r26
            goto La7
        La3:
            r23 = r14
            r14 = r33
        La7:
            r26 = 1572864(0x180000, float:2.204052E-39)
            r26 = r0 & r26
            r3 = 0
            if (r26 != 0) goto Lbb
            boolean r26 = r7.h(r3)
            if (r26 == 0) goto Lb7
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto Lb9
        Lb7:
            r26 = 524288(0x80000, float:7.34684E-40)
        Lb9:
            r11 = r11 | r26
        Lbb:
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r26 = r0 & r26
            if (r26 != 0) goto Lcd
            boolean r3 = r7.h(r3)
            if (r3 == 0) goto Lca
            r3 = 8388608(0x800000, float:1.1754944E-38)
            goto Lcc
        Lca:
            r3 = 4194304(0x400000, float:5.877472E-39)
        Lcc:
            r11 = r11 | r3
        Lcd:
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 & r0
            if (r3 != 0) goto Le2
            r3 = r34
            boolean r26 = r7.g(r3)
            if (r26 == 0) goto Ldd
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto Ldf
        Ldd:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        Ldf:
            r11 = r11 | r26
            goto Le4
        Le2:
            r3 = r34
        Le4:
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r26 = r0 & r26
            if (r26 != 0) goto Lf7
            boolean r26 = r7.g(r8)
            if (r26 == 0) goto Lf3
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lf5
        Lf3:
            r26 = 268435456(0x10000000, float:2.524355E-29)
        Lf5:
            r11 = r11 | r26
        Lf7:
            r26 = r1 & 6
            if (r26 != 0) goto L109
            boolean r26 = r7.g(r9)
            if (r26 == 0) goto L104
            r19 = 4
            goto L106
        L104:
            r19 = 2
        L106:
            r19 = r1 | r19
            goto L10b
        L109:
            r19 = r1
        L10b:
            r26 = r1 & 48
            if (r26 != 0) goto L119
            boolean r26 = r7.f(r10)
            if (r26 == 0) goto L117
            r16 = 32
        L117:
            r19 = r19 | r16
        L119:
            r12 = r1 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L12a
            r12 = r38
            boolean r16 = r7.f(r12)
            if (r16 == 0) goto L127
            r17 = r18
        L127:
            r19 = r19 | r17
            goto L12c
        L12a:
            r12 = r38
        L12c:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L13d
            r0 = r39
            boolean r16 = r7.f(r0)
            if (r16 == 0) goto L13a
            r20 = 2048(0x800, float:2.87E-42)
        L13a:
            r19 = r19 | r20
            goto L13f
        L13d:
            r0 = r39
        L13f:
            r0 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L14d
            boolean r0 = r7.f(r13)
            if (r0 == 0) goto L14b
            r21 = r22
        L14b:
            r19 = r19 | r21
        L14d:
            r0 = r1 & r23
            if (r0 != 0) goto L15e
            r0 = r41
            boolean r16 = r7.h(r0)
            if (r16 == 0) goto L15b
            r24 = r25
        L15b:
            r19 = r19 | r24
            goto L160
        L15e:
            r0 = r41
        L160:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r11 & r16
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = 1
            if (r0 != r1) goto L179
            r0 = 74899(0x12493, float:1.04956E-40)
            r0 = r19 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r0 == r1) goto L177
            goto L179
        L177:
            r0 = 0
            goto L17b
        L179:
            r0 = r16
        L17b:
            r1 = r11 & 1
            boolean r0 = r7.S(r1, r0)
            if (r0 == 0) goto L2d6
            r0 = r11 & 112(0x70, float:1.57E-43)
            r1 = 32
            if (r0 != r1) goto L18c
            r0 = r16
            goto L18d
        L18c:
            r0 = 0
        L18d:
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            r11 = 2048(0x800, float:2.87E-42)
            if (r1 != r11) goto L196
            r1 = r16
            goto L197
        L196:
            r1 = 0
        L197:
            r0 = r0 | r1
            java.lang.Object r1 = r7.P()
            if (r0 != 0) goto L1a2
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto L1ae
        L1a2:
            fp r0 = new fp
            r0.<init>(r2)
            p97 r1 = r4.a(r0)
            r7.l0(r1)
        L1ae:
            p97 r1 = (defpackage.p97) r1
            fp r0 = r1.a
            java.lang.String r0 = r0.B
            int r1 = r19 >> 3
            r1 = r1 & 14
            qa4 r1 = defpackage.bw7.a(r10, r7, r1)
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1cb
            z63 r1 = defpackage.z63.Focused
            goto L1d6
        L1cb:
            int r1 = r0.length()
            if (r1 != 0) goto L1d4
            z63 r1 = defpackage.z63.UnfocusedEmpty
            goto L1d6
        L1d4:
            z63 r1 = defpackage.z63.UnfocusedNotEmpty
        L1d6:
            t17 r11 = new t17
            r11.<init>(r13, r8, r9, r10)
            r17 = r0
            nq6 r0 = defpackage.ye7.b
            java.lang.Object r18 = r7.j(r0)
            r2 = r18
            xe7 r2 = (defpackage.xe7) r2
            s47 r3 = r2.g
            s47 r2 = r2.l
            r19 = r2
            r18 = r3
            long r2 = r18.b()
            long r4 = defpackage.kt0.h
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 == 0) goto L205
            long r2 = r19.b()
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 == 0) goto L219
        L205:
            long r2 = r18.b()
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 != 0) goto L21c
            long r2 = r19.b()
            boolean r2 = defpackage.kt0.d(r2, r4)
            if (r2 == 0) goto L21c
        L219:
            r18 = r16
            goto L21e
        L21c:
            r18 = 0
        L21e:
            vs0 r2 = defpackage.vs0.x0
            r3 = -1443813555(0xffffffffa9f1274d, float:-1.07093676E-13)
            r7.b0(r3)
            java.lang.Object r3 = r7.j(r0)
            xe7 r3 = (defpackage.xe7) r3
            s47 r3 = r3.l
            long r3 = r3.b()
            r19 = 16
            if (r18 == 0) goto L251
            r5 = -887928539(0xffffffffcb134925, float:-9652517.0)
            r7.b0(r5)
            int r5 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r5 == 0) goto L242
        L240:
            r5 = 0
            goto L24b
        L242:
            java.lang.Object r3 = r11.e(r1, r7, r6)
            kt0 r3 = (defpackage.kt0) r3
            long r3 = r3.a
            goto L240
        L24b:
            r7.p(r5)
            r42 = r2
            goto L25d
        L251:
            r42 = r2
            r5 = 0
            r2 = 1218284988(0x489d8dbc, float:322669.88)
            r7.b0(r2)
            r7.p(r5)
        L25d:
            r7.p(r5)
            r2 = -1443806289(0xffffffffa9f143af, float:-1.0714291E-13)
            r7.b0(r2)
            java.lang.Object r0 = r7.j(r0)
            xe7 r0 = (defpackage.xe7) r0
            s47 r0 = r0.g
            long r21 = r0.b()
            if (r18 == 0) goto L28f
            r0 = -1026713946(0xffffffffc2cd96a6, float:-102.794235)
            r7.b0(r0)
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 == 0) goto L280
        L27e:
            r5 = 0
            goto L28b
        L280:
            java.lang.Object r0 = r11.e(r1, r7, r6)
            kt0 r0 = (defpackage.kt0) r0
            long r5 = r0.a
            r21 = r5
            goto L27e
        L28b:
            r7.p(r5)
            goto L299
        L28f:
            r5 = 0
            r0 = 798166043(0x2f930c1b, float:2.6747746E-10)
            r7.b0(r0)
            r7.p(r5)
        L299:
            r7.p(r5)
            if (r32 == 0) goto L2a1
            r0 = r16
            goto L2a2
        L2a1:
            r0 = r5
        L2a2:
            s17 r5 = new s17
            r2 = r10
            r10 = r8
            r8 = r17
            r17 = r12
            r12 = r2
            r6 = r32
            r16 = r34
            r19 = r41
            r2 = r7
            r20 = r11
            r7 = r14
            r14 = r28
            r11 = r9
            r9 = r13
            r13 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6 = 33336375(0x1fcac37, float:9.2817296E-38)
            zv0 r15 = defpackage.n16.I(r6, r5, r2)
            r17 = 1769472(0x1b0000, float:2.479558E-39)
            r7 = r42
            r14 = r0
            r8 = r1
            r16 = r2
            r9 = r3
            r13 = r20
            r11 = r21
            r7.m(r8, r9, r11, r13, r14, r15, r16, r17)
            goto L2db
        L2d6:
            r16 = r7
            r16.V()
        L2db:
            cf5 r0 = r16.t()
            if (r0 == 0) goto L30d
            r1 = r0
            m17 r0 = new m17
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r43
            r16 = r44
            r27 = r1
            r1 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r27
            r1.d = r0
        L30d:
            return
    }

    public static final void b(long r8, defpackage.s47 r10, defpackage.eo2 r11, defpackage.px0 r12, int r13, int r14) {
            r0 = r12
            xq2 r0 = (defpackage.xq2) r0
            r1 = 2064632657(0x7b0fcb51, float:7.466222E35)
            r0.d0(r1)
            boolean r1 = r0.e(r8)
            if (r1 == 0) goto L11
            r1 = 4
            goto L12
        L11:
            r1 = 2
        L12:
            r1 = r1 | r13
            r2 = r14 & 2
            if (r2 == 0) goto L1a
            r1 = r1 | 48
            goto L26
        L1a:
            boolean r3 = r0.f(r10)
            if (r3 == 0) goto L23
            r3 = 32
            goto L25
        L23:
            r3 = 16
        L25:
            r1 = r1 | r3
        L26:
            r3 = r14 & 4
            r4 = 0
            if (r3 == 0) goto L2e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L3e
        L2e:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L3e
            boolean r3 = r0.f(r4)
            if (r3 == 0) goto L3b
            r3 = 256(0x100, float:3.59E-43)
            goto L3d
        L3b:
            r3 = 128(0x80, float:1.8E-43)
        L3d:
            r1 = r1 | r3
        L3e:
            boolean r3 = r0.h(r11)
            if (r3 == 0) goto L47
            r3 = 2048(0x800, float:2.87E-42)
            goto L49
        L47:
            r3 = 1024(0x400, float:1.435E-42)
        L49:
            r1 = r1 | r3
            r3 = r1 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r7 = 0
            if (r3 == r6) goto L53
            r3 = 1
            goto L54
        L53:
            r3 = r7
        L54:
            r6 = r1 & 1
            boolean r3 = r0.S(r6, r3)
            if (r3 == 0) goto L91
            if (r2 == 0) goto L5f
            r10 = r4
        L5f:
            n17 r2 = new n17
            r2.<init>(r8, r4, r11)
            r3 = -650790565(0xffffffffd935b95b, float:-3.1969232E15)
            zv0 r2 = defpackage.n16.I(r3, r2, r0)
            if (r10 == 0) goto L80
            r3 = -162880673(0xfffffffff64aa35f, float:-1.0274976E33)
            r0.b0(r3)
            int r1 = r1 >> 3
            r1 = r1 & 14
            r1 = r1 | 48
            defpackage.x37.a(r10, r2, r0, r1)
        L7c:
            r0.p(r7)
            goto L8f
        L80:
            r1 = -162879037(0xfffffffff64aa9c3, float:-1.0276242E33)
            r0.b0(r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.o(r0, r1)
            goto L7c
        L8f:
            r3 = r10
            goto L95
        L91:
            r0.V()
            goto L8f
        L95:
            cf5 r10 = r0.t()
            if (r10 == 0) goto La6
            o17 r0 = new o17
            r1 = r8
            r4 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r3, r4, r5, r6)
            r10.d = r0
        La6:
            return
    }

    public static defpackage.cj c(java.lang.String r7, defpackage.s47 r8, long r9, defpackage.qh1 r11, defpackage.ki2 r12, int r13, int r14) {
            r1 = r7
            cj r7 = new cj
            gj r0 = new gj
            yt1 r3 = defpackage.yt1.A
            r4 = r3
            r2 = r8
            r6 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11 = r9
            r8 = r0
            r10 = 1
            r9 = r13
            r7.<init>(r8, r9, r10, r11)
            return r7
    }

    public static final void d(defpackage.lb5 r49, defpackage.px0 r50, int r51) {
            r0 = r49
            r7 = r50
            xq2 r7 = (defpackage.xq2) r7
            r2 = -713521460(0xffffffffd57886cc, float:-1.7078614E13)
            r7.d0(r2)
            boolean r2 = r7.h(r0)
            r3 = 2
            if (r2 == 0) goto L15
            r2 = 4
            goto L16
        L15:
            r2 = r3
        L16:
            r2 = r51 | r2
            r4 = r2 & 3
            r10 = 0
            r11 = 1
            if (r4 == r3) goto L20
            r3 = r11
            goto L21
        L20:
            r3 = r10
        L21:
            r2 = r2 & r11
            boolean r2 = r7.S(r2, r3)
            if (r2 == 0) goto L37c
            es7 r12 = defpackage.bl2.F(r7)
            r2 = 1097859072(0x41700000, float:15.0)
            y16 r2 = defpackage.z16.b(r2)
            java.text.NumberFormat r13 = java.text.NumberFormat.getIntegerInstance()
            r3 = 1098907648(0x41800000, float:16.0)
            r4 = 1090519040(0x41000000, float:8.0)
            x64 r14 = defpackage.x64.a
            a74 r3 = defpackage.ge7.P(r14, r3, r4)
            a74 r3 = defpackage.u24.g(r3, r2)
            long r4 = r12.d
            jy2 r6 = defpackage.u24.m
            a74 r3 = defpackage.vy7.L(r3, r4, r6)
            long r4 = defpackage.es7.p
            r8 = 1051931443(0x3eb33333, float:0.35)
            long r8 = defpackage.kt0.c(r8, r4)
            r15 = 1065353216(0x3f800000, float:1.0)
            a74 r2 = defpackage.ak7.I(r3, r15, r8, r2)
            e40 r15 = defpackage.d90.L
            e34 r3 = defpackage.h70.d(r15, r10)
            long r8 = r7.T
            int r8 = java.lang.Long.hashCode(r8)
            xv4 r9 = r7.l()
            a74 r2 = defpackage.l.E(r7, r2)
            ix0 r16 = defpackage.jx0.i
            r16.getClass()
            r50 = r12
            iy0 r12 = defpackage.ix0.b
            r7.f0()
            boolean r10 = r7.S
            if (r10 == 0) goto L83
            r7.k(r12)
            goto L86
        L83:
            r7.o0()
        L86:
            pn r10 = defpackage.ix0.f
            defpackage.yh2.K(r7, r10, r3)
            pn r3 = defpackage.ix0.e
            defpackage.yh2.K(r7, r3, r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            pn r9 = defpackage.ix0.g
            defpackage.yh2.K(r7, r9, r8)
            ne r8 = defpackage.ix0.h
            defpackage.yh2.F(r7, r8)
            r21 = r13
            pn r13 = defpackage.ix0.d
            defpackage.yh2.K(r7, r13, r2)
            r2 = 1096810496(0x41600000, float:14.0)
            a74 r2 = defpackage.ge7.O(r14, r2)
            r16 = r15
            d40 r15 = defpackage.d90.i0
            du r11 = defpackage.ju.a
            r1 = 48
            r17 = r6
            l26 r6 = defpackage.k26.a(r11, r15, r7, r1)
            r18 = r2
            long r1 = r7.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r7.l()
            r19 = r15
            r15 = r18
            a74 r15 = defpackage.l.E(r7, r15)
            r7.f0()
            r23 = r11
            boolean r11 = r7.S
            if (r11 == 0) goto Lda
            r7.k(r12)
            goto Ldd
        Lda:
            r7.o0()
        Ldd:
            defpackage.yh2.K(r7, r10, r6)
            defpackage.yh2.K(r7, r3, r2)
            defpackage.i61.w(r1, r7, r9, r7, r8)
            defpackage.yh2.K(r7, r13, r15)
            x23 r1 = new x23
            nq6 r2 = defpackage.kf.b
            java.lang.Object r2 = r7.j(r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            java.lang.String r2 = r0.a
            java.lang.String r6 = "https://media.retroachievements.org/UserPic/"
            java.lang.String r11 = ".png"
            java.lang.String r2 = defpackage.lb1.A(r6, r2, r11)
            r1.c = r2
            r11 = 1
            r1.b(r11)
            z23 r2 = r1.a()
            r1 = 1110966272(0x42380000, float:46.0)
            a74 r1 = defpackage.dj6.i(r14, r1)
            y16 r6 = defpackage.z16.a
            a74 r1 = defpackage.u24.g(r1, r6)
            r6 = 1043878380(0x3e3851ec, float:0.18)
            r22 = r12
            long r11 = defpackage.kt0.c(r6, r4)
            r6 = r17
            a74 r1 = defpackage.vy7.L(r1, r11, r6)
            r6 = r8
            r8 = 48
            r11 = r9
            r9 = 4088(0xff8, float:5.729E-42)
            r12 = r3
            r3 = 0
            r17 = r4
            r5 = 0
            r4 = r6
            r6 = 0
            r15 = r4
            r4 = r1
            r1 = r12
            r12 = r15
            r15 = r11
            r25 = r17
            defpackage.gi2.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r18 = 0
            r2 = r19
            r19 = 14
            r15 = 1095761920(0x41500000, float:13.0)
            r3 = r16
            r16 = 0
            r17 = 0
            r48 = r3
            r3 = r2
            r2 = r11
            r11 = r48
            a74 r4 = defpackage.ge7.S(r14, r15, r16, r17, r18, r19)
            eu r5 = defpackage.ju.c
            c40 r6 = defpackage.d90.k0
            r15 = 0
            yt0 r5 = defpackage.wt0.a(r5, r6, r7, r15)
            long r8 = r7.T
            int r6 = java.lang.Long.hashCode(r8)
            xv4 r8 = r7.l()
            a74 r4 = defpackage.l.E(r7, r4)
            r7.f0()
            boolean r9 = r7.S
            if (r9 == 0) goto L178
            r9 = r22
            r7.k(r9)
            goto L17d
        L178:
            r9 = r22
            r7.o0()
        L17d:
            defpackage.yh2.K(r7, r10, r5)
            defpackage.yh2.K(r7, r1, r8)
            defpackage.i61.w(r6, r7, r2, r7, r12)
            defpackage.yh2.K(r7, r13, r4)
            r5 = r23
            r4 = 48
            l26 r6 = defpackage.k26.a(r5, r3, r7, r4)
            r19 = r3
            long r3 = r7.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r7.l()
            a74 r8 = defpackage.l.E(r7, r14)
            r7.f0()
            boolean r15 = r7.S
            if (r15 == 0) goto L1ac
            r7.k(r9)
            goto L1af
        L1ac:
            r7.o0()
        L1af:
            defpackage.yh2.K(r7, r10, r6)
            defpackage.yh2.K(r7, r1, r4)
            defpackage.i61.w(r3, r7, r2, r7, r12)
            defpackage.yh2.K(r7, r13, r8)
            r15 = r2
            e33 r2 = defpackage.q60.F()
            r3 = 1094713344(0x41400000, float:12.0)
            a74 r4 = defpackage.dj6.i(r14, r3)
            r8 = 3504(0xdb0, float:4.91E-42)
            r22 = r9
            r9 = 0
            r3 = 0
            r23 = r5
            r27 = r19
            r5 = r25
            defpackage.i13.a(r2, r3, r4, r5, r7, r8, r9)
            r4 = r5
            r2 = 2131952420(0x7f130324, float:1.9541282E38)
            java.lang.String r2 = defpackage.yh2.O(r7, r2)
            sr2 r9 = defpackage.qs7.c
            r3 = 9
            long r25 = defpackage.hi2.E(r3)
            oj2 r8 = defpackage.oj2.e0
            r16 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            long r28 = defpackage.hi2.D(r16)
            r18 = 0
            r19 = 14
            r3 = r15
            r15 = 1084227584(0x40a00000, float:5.0)
            r16 = 0
            r17 = 0
            r20 = 0
            a74 r6 = defpackage.ge7.S(r14, r15, r16, r17, r18, r19)
            r30 = r14
            r14 = r23
            r23 = 0
            r15 = 1
            r24 = 130832(0x1ff10, float:1.83335E-40)
            r16 = r12
            r12 = 0
            r17 = r13
            r18 = r14
            r13 = 0
            r19 = r15
            r15 = 0
            r31 = r16
            r16 = 0
            r32 = r17
            r17 = 0
            r33 = r18
            r18 = 0
            r34 = r19
            r19 = 0
            r35 = r20
            r20 = 0
            r36 = r22
            r22 = 14355888(0xdb0db0, float:2.0116884E-38)
            r37 = r1
            r42 = r3
            r3 = r6
            r41 = r10
            r39 = r11
            r38 = r21
            r10 = r28
            r43 = r31
            r44 = r32
            r45 = r33
            r1 = r34
            r40 = r36
            r21 = r7
            r6 = r25
            defpackage.x37.b(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = r21
            r7.p(r1)
            java.lang.String r2 = r0.a
            r3 = r50
            r25 = r4
            long r4 = r3.g
            pi2 r9 = defpackage.qs7.a
            r6 = 16
            long r10 = defpackage.hi2.E(r6)
            oj2 r8 = defpackage.oj2.d0
            r18 = 0
            r19 = 13
            r15 = 0
            r16 = 1073741824(0x40000000, float:2.0)
            r17 = 0
            r14 = r30
            a74 r6 = defpackage.ge7.S(r14, r15, r16, r17, r18, r19)
            r23 = 3120(0xc30, float:4.372E-42)
            r24 = 120720(0x1d790, float:1.69165E-40)
            r12 = r3
            r3 = r6
            r6 = r10
            r10 = 0
            r13 = r12
            r12 = 0
            r15 = r13
            r13 = 0
            r16 = r15
            r15 = 2
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 1
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r28 = r22
            r22 = 1772592(0x1b0c30, float:2.48393E-39)
            r46 = r25
            r1 = r28
            defpackage.x37.b(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = r21
            r18 = 0
            r19 = 13
            r15 = 0
            r16 = 1086324736(0x40c00000, float:6.0)
            r17 = 0
            r14 = r30
            a74 r2 = defpackage.ge7.S(r14, r15, r16, r17, r18, r19)
            r15 = r16
            r3 = r27
            r5 = r45
            r4 = 48
            l26 r3 = defpackage.k26.a(r5, r3, r7, r4)
            long r4 = r7.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r7.l()
            a74 r2 = defpackage.l.E(r7, r2)
            r7.f0()
            boolean r6 = r7.S
            if (r6 == 0) goto L2e0
            r9 = r40
            r7.k(r9)
        L2dd:
            r6 = r41
            goto L2e6
        L2e0:
            r9 = r40
            r7.o0()
            goto L2dd
        L2e6:
            defpackage.yh2.K(r7, r6, r3)
            r12 = r37
            defpackage.yh2.K(r7, r12, r5)
            r3 = r42
            r5 = r43
            defpackage.i61.w(r4, r7, r3, r7, r5)
            r4 = r44
            defpackage.yh2.K(r7, r4, r2)
            long r10 = r0.b
            r2 = r38
            java.lang.String r8 = r2.format(r10)
            r8.getClass()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r10 = 2131952417(0x7f130321, float:1.9541276E38)
            java.lang.String r8 = defpackage.yh2.N(r10, r8, r7)
            r10 = r46
            r13 = 48
            e(r8, r10, r7, r13)
            r18 = 0
            r19 = 14
            r16 = 0
            r17 = 0
            a74 r8 = defpackage.ge7.S(r14, r15, r16, r17, r18, r19)
            r11 = r39
            r15 = 0
            e34 r10 = defpackage.h70.d(r11, r15)
            long r13 = r7.T
            int r11 = java.lang.Long.hashCode(r13)
            xv4 r13 = r7.l()
            a74 r8 = defpackage.l.E(r7, r8)
            r7.f0()
            boolean r14 = r7.S
            if (r14 == 0) goto L343
            r7.k(r9)
            goto L346
        L343:
            r7.o0()
        L346:
            defpackage.yh2.K(r7, r6, r10)
            defpackage.yh2.K(r7, r12, r13)
            defpackage.i61.w(r11, r7, r3, r7, r5)
            defpackage.yh2.K(r7, r4, r8)
            long r3 = r0.c
            java.lang.String r2 = r2.format(r3)
            r2.getClass()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131952416(0x7f130320, float:1.9541274E38)
            java.lang.String r2 = defpackage.yh2.N(r3, r2, r7)
            long r3 = r1.l
            e(r2, r3, r7, r15)
            r15 = 1
            r7.p(r15)
            r7.p(r15)
            r7.p(r15)
            r7.p(r15)
            r7.p(r15)
            goto L37f
        L37c:
            r7.V()
        L37f:
            cf5 r1 = r7.t()
            if (r1 == 0) goto L390
            z5 r2 = new z5
            r3 = 24
            r4 = r51
            r2.<init>(r0, r4, r3)
            r1.d = r2
        L390:
            return
    }

    public static final void e(java.lang.String r23, long r24, defpackage.px0 r26, int r27) {
            r0 = r23
            r2 = r24
            r1 = r26
            xq2 r1 = (defpackage.xq2) r1
            r4 = -47713197(0xfffffffffd27f453, float:-1.3953105E37)
            r1.d0(r4)
            boolean r4 = r1.f(r0)
            if (r4 == 0) goto L16
            r4 = 4
            goto L17
        L16:
            r4 = 2
        L17:
            r4 = r27 | r4
            r5 = r27 & 48
            if (r5 != 0) goto L29
            boolean r5 = r1.e(r2)
            if (r5 == 0) goto L26
            r5 = 32
            goto L28
        L26:
            r5 = 16
        L28:
            r4 = r4 | r5
        L29:
            r5 = r4 & 19
            r6 = 18
            if (r5 == r6) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            r6 = r4 & 1
            boolean r5 = r1.S(r6, r5)
            if (r5 == 0) goto L95
            pi2 r7 = defpackage.qs7.b
            r5 = 10
            long r5 = defpackage.hi2.E(r5)
            r8 = r4
            r4 = r5
            oj2 r6 = defpackage.oj2.d0
            r9 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            long r9 = defpackage.hi2.D(r9)
            r11 = 1086324736(0x40c00000, float:6.0)
            y16 r11 = defpackage.z16.b(r11)
            x64 r12 = defpackage.x64.a
            a74 r11 = defpackage.u24.g(r12, r11)
            r12 = 1041194025(0x3e0f5c29, float:0.14)
            long r12 = defpackage.kt0.c(r12, r2)
            jy2 r14 = defpackage.u24.m
            a74 r11 = defpackage.vy7.L(r11, r12, r14)
            r12 = 1088421888(0x40e00000, float:7.0)
            r13 = 1077936128(0x40400000, float:3.0)
            a74 r11 = defpackage.ge7.P(r11, r12, r13)
            r12 = r8 & 14
            r13 = 14355456(0xdb0c00, float:2.0116278E-38)
            r12 = r12 | r13
            int r8 = r8 << 3
            r8 = r8 & 896(0x380, float:1.256E-42)
            r20 = r12 | r8
            r21 = 0
            r22 = 130832(0x1ff10, float:1.83335E-40)
            r8 = r9
            r10 = 0
            r19 = r1
            r1 = r11
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            defpackage.x37.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L9a
        L95:
            r19 = r1
            r19.V()
        L9a:
            cf5 r1 = r19.t()
            if (r1 == 0) goto La9
            on5 r4 = new on5
            r5 = r27
            r4.<init>(r0, r5, r2)
            r1.d = r4
        La9:
            return
    }

    public static final boolean f(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L13
            float r1 = java.lang.Math.abs(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 >= 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public static final java.util.List g(defpackage.cq3 r11, defpackage.mq3 r12, defpackage.p70 r13) {
            ua4 r0 = r13.a
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            if (r1 != 0) goto L18
            mm6 r1 = r12.A
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L18
            yt1 r11 = defpackage.yt1.A
            return r11
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ua4 r13 = r13.a
            int r13 = r13.L
            if (r13 == 0) goto L7b
            l93 r13 = new l93
            int r4 = r0.L
            r5 = 0
            java.lang.String r6 = "MutableVector is empty."
            if (r4 == 0) goto L77
            java.lang.Object[] r7 = r0.A
            r8 = r7[r2]
            np3 r8 = (defpackage.np3) r8
            int r8 = r8.a
            r9 = r2
        L35:
            if (r9 >= r4) goto L43
            r10 = r7[r9]
            np3 r10 = (defpackage.np3) r10
            int r10 = r10.a
            if (r10 >= r8) goto L40
            r8 = r10
        L40:
            int r9 = r9 + 1
            goto L35
        L43:
            if (r8 < 0) goto L46
            goto L4b
        L46:
            java.lang.String r4 = "negative minIndex"
            defpackage.s53.a(r4)
        L4b:
            int r4 = r0.L
            if (r4 == 0) goto L73
            java.lang.Object[] r0 = r0.A
            r5 = r0[r2]
            np3 r5 = (defpackage.np3) r5
            int r5 = r5.b
            r6 = r2
        L58:
            if (r6 >= r4) goto L66
            r7 = r0[r6]
            np3 r7 = (defpackage.np3) r7
            int r7 = r7.b
            if (r7 <= r5) goto L63
            r5 = r7
        L63:
            int r6 = r6 + 1
            goto L58
        L66:
            int r0 = r11.a()
            int r0 = r0 - r3
            int r0 = java.lang.Math.min(r5, r0)
            r13.<init>(r8, r0, r3)
            goto L7d
        L73:
            defpackage.fa6.e(r6)
            return r5
        L77:
            defpackage.fa6.e(r6)
            return r5
        L7b:
            l93 r13 = defpackage.l93.R
        L7d:
            mm6 r0 = r12.A
            int r0 = r0.size()
        L83:
            if (r2 >= r0) goto Lae
            java.lang.Object r3 = r12.get(r2)
            lq3 r3 = (defpackage.lq3) r3
            java.lang.Object r4 = r3.a
            int r3 = r3.c
            int r3 = defpackage.bl2.y(r3, r11, r4)
            int r4 = r13.A
            int r5 = r13.B
            if (r3 > r5) goto L9c
            if (r4 > r3) goto L9c
            goto Lab
        L9c:
            if (r3 < 0) goto Lab
            int r4 = r11.a()
            if (r3 >= r4) goto Lab
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
        Lab:
            int r2 = r2 + 1
            goto L83
        Lae:
            int r11 = r13.A
            int r12 = r13.B
            if (r11 > r12) goto Lc0
        Lb4:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r1.add(r13)
            if (r11 == r12) goto Lc0
            int r11 = r11 + 1
            goto Lb4
        Lc0:
            return r1
    }

    public static void h() {
            boolean r0 = x()
            java.lang.String r1 = "Not in application's main thread"
            defpackage.np2.A(r1, r0)
            return
    }

    public static defpackage.rf1 i(long r19, long r21, long r23, long r25, defpackage.px0 r27, int r28) {
            r0 = r28 & 1
            if (r0 == 0) goto L1c
            nq6 r0 = defpackage.vt0.a
            r1 = r27
            xq2 r1 = (defpackage.xq2) r1
            java.lang.Object r0 = r1.j(r0)
            ut0 r0 = (defpackage.ut0) r0
            vs4 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            kt0 r0 = (defpackage.kt0) r0
            long r0 = r0.a
            r3 = r0
            goto L1e
        L1c:
            r3 = r19
        L1e:
            r0 = r28 & 2
            if (r0 == 0) goto L24
            r0 = r3
            goto L26
        L24:
            r0 = r21
        L26:
            r2 = r28 & 8
            if (r2 == 0) goto L3c
            nq6 r2 = defpackage.vt0.a
            r5 = r27
            xq2 r5 = (defpackage.xq2) r5
            java.lang.Object r2 = r5.j(r2)
            ut0 r2 = (defpackage.ut0) r2
            long r5 = r2.j()
            r7 = r5
            goto L3e
        L3c:
            r7 = r23
        L3e:
            r2 = r28 & 16
            if (r2 == 0) goto L53
            nq6 r2 = defpackage.vt0.a
            r5 = r27
            xq2 r5 = (defpackage.xq2) r5
            java.lang.Object r2 = r5.j(r2)
            ut0 r2 = (defpackage.ut0) r2
            long r5 = r2.f()
            goto L55
        L53:
            r5 = r25
        L55:
            py0 r2 = defpackage.j31.a
            r9 = r27
            xq2 r9 = (defpackage.xq2) r9
            java.lang.Object r10 = r9.j(r2)
            kt0 r10 = (defpackage.kt0) r10
            long r10 = r10.a
            nq6 r12 = defpackage.vt0.a
            java.lang.Object r13 = r9.j(r12)
            ut0 r13 = (defpackage.ut0) r13
            boolean r13 = r13.k()
            if (r13 == 0) goto L75
            defpackage.hv.N(r10)
            goto L78
        L75:
            defpackage.hv.N(r10)
        L78:
            r10 = 1052938076(0x3ec28f5c, float:0.38)
            long r13 = defpackage.kt0.c(r10, r3)
            java.lang.Object r9 = r9.j(r12)
            ut0 r9 = (defpackage.ut0) r9
            long r10 = r9.j()
            long r9 = defpackage.hv.l(r13, r10)
            r11 = r27
            xq2 r11 = (defpackage.xq2) r11
            java.lang.Object r13 = r11.j(r2)
            kt0 r13 = (defpackage.kt0) r13
            long r13 = r13.a
            java.lang.Object r15 = r11.j(r12)
            ut0 r15 = (defpackage.ut0) r15
            boolean r15 = r15.k()
            if (r15 == 0) goto Lac
            defpackage.hv.N(r13)
        La8:
            r13 = 1052938076(0x3ec28f5c, float:0.38)
            goto Lb0
        Lac:
            defpackage.hv.N(r13)
            goto La8
        Lb0:
            long r14 = defpackage.kt0.c(r13, r0)
            java.lang.Object r11 = r11.j(r12)
            ut0 r11 = (defpackage.ut0) r11
            r16 = r3
            long r3 = r11.j()
            long r3 = defpackage.hv.l(r14, r3)
            r11 = r27
            xq2 r11 = (defpackage.xq2) r11
            java.lang.Object r13 = r11.j(r2)
            kt0 r13 = (defpackage.kt0) r13
            long r13 = r13.a
            java.lang.Object r15 = r11.j(r12)
            ut0 r15 = (defpackage.ut0) r15
            boolean r15 = r15.k()
            if (r15 == 0) goto Le3
            defpackage.hv.N(r13)
        Ldf:
            r13 = 1052938076(0x3ec28f5c, float:0.38)
            goto Le7
        Le3:
            defpackage.hv.N(r13)
            goto Ldf
        Le7:
            long r14 = defpackage.kt0.c(r13, r7)
            java.lang.Object r11 = r11.j(r12)
            ut0 r11 = (defpackage.ut0) r11
            r20 = r7
            long r7 = r11.j()
            long r7 = defpackage.hv.l(r14, r7)
            r11 = r27
            xq2 r11 = (defpackage.xq2) r11
            java.lang.Object r2 = r11.j(r2)
            kt0 r2 = (defpackage.kt0) r2
            long r13 = r2.a
            java.lang.Object r2 = r11.j(r12)
            ut0 r2 = (defpackage.ut0) r2
            boolean r2 = r2.k()
            if (r2 == 0) goto L11a
            defpackage.hv.N(r13)
        L116:
            r13 = 1052938076(0x3ec28f5c, float:0.38)
            goto L11e
        L11a:
            defpackage.hv.N(r13)
            goto L116
        L11e:
            long r14 = defpackage.kt0.c(r13, r5)
            java.lang.Object r2 = r11.j(r12)
            ut0 r2 = (defpackage.ut0) r2
            long r11 = r2.j()
            long r11 = defpackage.hv.l(r14, r11)
            rf1 r2 = new rf1
            r14 = 1057635697(0x3f0a3d71, float:0.54)
            long r0 = defpackage.kt0.c(r14, r0)
            long r5 = defpackage.kt0.c(r13, r5)
            long r3 = defpackage.kt0.c(r14, r3)
            long r11 = defpackage.kt0.c(r13, r11)
            r13 = r3
            r3 = r16
            r15 = r7
            r17 = r11
            r7 = r20
            r11 = r9
            r9 = r5
            r5 = r0
            r2.<init>(r3, r5, r7, r9, r11, r13, r15, r17)
            return r2
    }

    public static final boolean j(defpackage.of5 r2, float r3, float r4) {
            float r0 = r2.a
            float r1 = r2.c
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L1a
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L1a
            float r3 = r2.b
            float r2 = r2.d
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L1a
            int r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r2 > 0) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public static defpackage.qo7 k(java.lang.Class r4) {
            java.lang.String r0 = "Cannot create an instance of "
            r1 = 0
            java.lang.reflect.Constructor r2 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L2b
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isPublic(r3)
            if (r3 == 0) goto L27
            java.lang.Object r2 = r2.newInstance(r1)     // Catch: java.lang.IllegalAccessException -> L1b java.lang.InstantiationException -> L1d
            r2.getClass()     // Catch: java.lang.IllegalAccessException -> L1b java.lang.InstantiationException -> L1d
            qo7 r2 = (defpackage.qo7) r2     // Catch: java.lang.IllegalAccessException -> L1b java.lang.InstantiationException -> L1d
            return r2
        L1b:
            r2 = move-exception
            goto L1f
        L1d:
            r2 = move-exception
            goto L23
        L1f:
            defpackage.u34.o(r0, r4, r2)
            return r1
        L23:
            defpackage.u34.o(r0, r4, r2)
            return r1
        L27:
            defpackage.e41.p(r4, r0)
            return r1
        L2b:
            r2 = move-exception
            defpackage.u34.o(r0, r4, r2)
            return r1
    }

    public static void l(java.lang.String r1, java.lang.String r2, java.lang.Object r3) {
            java.lang.String r0 = "TransportRuntime."
            java.lang.String r1 = r0.concat(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            android.util.Log.d(r1, r2)
            return
    }

    public static final boolean o(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static defpackage.oj2 p() {
            oj2 r0 = defpackage.oj2.e0
            return r0
    }

    public static defpackage.hh5 q(java.util.List r1) {
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto Ld
            hh5 r1 = defpackage.hh5.ALLOW
            return r1
        Ld:
            java.lang.ClassCastException r1 = defpackage.i61.j(r1)
            throw r1
    }

    public static final java.lang.Object r(defpackage.x24 r2) {
            java.lang.Object r2 = r2.B()
            boolean r0 = r2 instanceof defpackage.cm3
            r1 = 0
            if (r0 == 0) goto Lc
            cm3 r2 = (defpackage.cm3) r2
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 == 0) goto L12
            java.lang.String r2 = r2.k0
            return r2
        L12:
            return r1
    }

    public static final int s(int r1, int r2, int r3) {
            if (r3 <= 0) goto L18
            if (r1 < r2) goto L5
            goto L1c
        L5:
            int r0 = r2 % r3
            if (r0 < 0) goto La
            goto Lb
        La:
            int r0 = r0 + r3
        Lb:
            int r1 = r1 % r3
            if (r1 < 0) goto Lf
            goto L10
        Lf:
            int r1 = r1 + r3
        L10:
            int r0 = r0 - r1
            int r0 = r0 % r3
            if (r0 < 0) goto L15
            goto L16
        L15:
            int r0 = r0 + r3
        L16:
            int r2 = r2 - r0
            return r2
        L18:
            if (r3 >= 0) goto L31
            if (r1 > r2) goto L1d
        L1c:
            return r2
        L1d:
            int r3 = -r3
            int r1 = r1 % r3
            if (r1 < 0) goto L22
            goto L23
        L22:
            int r1 = r1 + r3
        L23:
            int r0 = r2 % r3
            if (r0 < 0) goto L28
            goto L29
        L28:
            int r0 = r0 + r3
        L29:
            int r1 = r1 - r0
            int r1 = r1 % r3
            if (r1 < 0) goto L2e
            goto L2f
        L2e:
            int r1 = r1 + r3
        L2f:
            int r1 = r1 + r2
            return r1
        L31:
            java.lang.String r1 = "Step is zero."
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    public static defpackage.oj2 t() {
            oj2 r0 = defpackage.oj2.d0
            return r0
    }

    public static final defpackage.jl5 u(defpackage.a47 r4, int r5) {
            z37 r0 = r4.a
            v84 r1 = r4.b
            fp r2 = r0.a
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            if (r2 != 0) goto Lf
            goto L35
        Lf:
            int r2 = r1.d(r5)
            if (r5 == 0) goto L1d
            int r3 = r5 + (-1)
            int r3 = r1.d(r3)
            if (r2 == r3) goto L30
        L1d:
            fp r0 = r0.a
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            if (r5 == r0) goto L35
            int r0 = r5 + 1
            int r0 = r1.d(r0)
            if (r2 == r0) goto L30
            goto L35
        L30:
            jl5 r4 = r4.a(r5)
            return r4
        L35:
            jl5 r4 = r4.h(r5)
            return r4
    }

    public static final defpackage.e33 v() {
            e33 r0 = defpackage.nj2.h
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Tv"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r4 = new ww2
            r2 = 1
            r3 = 0
            r4.<init>(r2, r3)
            r2 = 1101529088(0x41a80000, float:21.0)
            r11 = 1077936128(0x40400000, float:3.0)
            r4.o(r2, r11)
            r4.m(r11, r11)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r10 = 1073741824(0x40000000, float:2.0)
            r5 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r6 = 0
            r7 = -1073741824(0xffffffffc0000000, float:-2.0)
            r8 = 1063675494(0x3f666666, float:0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r12 = 1094713344(0x41400000, float:12.0)
            r4.u(r12)
            r9 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            r7 = 1063675494(0x3f666666, float:0.9)
            r8 = 1073741824(0x40000000, float:2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r13 = 1084227584(0x40a00000, float:5.0)
            r4.l(r13)
            r5 = 1073741824(0x40000000, float:2.0)
            r4.u(r5)
            r5 = 1090519040(0x41000000, float:8.0)
            r4.l(r5)
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.u(r5)
            r4.l(r13)
            r9 = 1073657938(0x3ffeb852, float:1.99)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r6 = 0
            r7 = 1073657938(0x3ffeb852, float:1.99)
            r8 = -1083808154(0xffffffffbf666666, float:-0.9)
            r4.i(r5, r6, r7, r8, r9, r10)
            r5 = 1102577664(0x41b80000, float:23.0)
            r4.m(r5, r13)
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r5 = 0
            r6 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r7 = -1083808154(0xffffffffbf666666, float:-0.9)
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.g()
            r5 = 1099431936(0x41880000, float:17.0)
            r4.o(r2, r5)
            r4.m(r11, r5)
            r4.m(r11, r13)
            r2 = 1099956224(0x41900000, float:18.0)
            r4.l(r2)
            r4.u(r12)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.nj2.h = r0
            return r0
    }

    public static final boolean w(float[] r5) {
            int r0 = r5.length
            r1 = 16
            r2 = 0
            if (r0 >= r1) goto L7
            return r2
        L7:
            r0 = r5[r2]
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L82
            r0 = 1
            r3 = r5[r0]
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 2
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 3
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 4
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 5
            r3 = r5[r3]
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 6
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 7
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 8
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 9
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 10
            r3 = r5[r3]
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 11
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 12
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 13
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 14
            r3 = r5[r3]
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L82
            r3 = 15
            r5 = r5[r3]
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L82
            return r0
        L82:
            return r2
    }

    public static boolean x() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public static final boolean y(java.lang.Throwable r3) {
            boolean r0 = r3 instanceof defpackage.kh7
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kh7 r3 = (defpackage.kh7) r3
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = "Unpromoted_achievements_cannot_be_unlocked"
            r2 = 1
            boolean r0 = defpackage.qs6.j0(r3, r0, r2)
            if (r0 != 0) goto L2a
            java.lang.String r0 = "\"Code\":\"invalid_state\""
            boolean r0 = defpackage.qs6.j0(r3, r0, r2)
            if (r0 == 0) goto L29
            java.lang.String r0 = "Unpromoted"
            boolean r3 = defpackage.qs6.j0(r3, r0, r2)
            if (r3 == 0) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            return r2
    }

    public abstract int A(byte[] r1, int r2, int r3);

    public abstract java.lang.String m(byte[] r1, int r2, int r3);

    public abstract int n(java.lang.String r1, byte[] r2, int r3, int r4);

    public boolean z(byte[] r1, int r2, int r3) {
            r0 = this;
            int r0 = r0.A(r1, r2, r3)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
