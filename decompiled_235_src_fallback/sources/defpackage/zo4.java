package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo4  reason: default package */
/* loaded from: classes.dex */
public abstract class zo4 {
    public static final long a = 0;
    public static final /* synthetic */ int b = 0;

    static {
            r0 = 8
            long r0 = defpackage.hi2.E(r0)
            defpackage.zo4.a = r0
            return
    }

    public static final void a(defpackage.c37 r44, defpackage.qn2 r45, defpackage.a74 r46, boolean r47, defpackage.s47 r48, defpackage.eo2 r49, boolean r50, defpackage.wq7 r51, defpackage.xh3 r52, defpackage.vh3 r53, boolean r54, int r55, int r56, defpackage.ke6 r57, defpackage.i17 r58, defpackage.px0 r59, int r60, int r61, int r62) {
            r3 = r46
            r13 = r58
            r0 = r60
            r1 = r61
            r2 = r62
            r14 = r59
            xq2 r14 = (defpackage.xq2) r14
            r4 = -365650761(0xffffffffea349cb7, float:-5.458668E25)
            r14.d0(r4)
            r4 = r0 & 6
            if (r4 != 0) goto L25
            r4 = r44
            boolean r7 = r14.f(r4)
            if (r7 == 0) goto L22
            r7 = 4
            goto L23
        L22:
            r7 = 2
        L23:
            r7 = r7 | r0
            goto L28
        L25:
            r4 = r44
            r7 = r0
        L28:
            r8 = r0 & 48
            r15 = r45
            if (r8 != 0) goto L3a
            boolean r8 = r14.h(r15)
            if (r8 == 0) goto L37
            r8 = 32
            goto L39
        L37:
            r8 = 16
        L39:
            r7 = r7 | r8
        L3a:
            r8 = r0 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L4a
            boolean r8 = r14.f(r3)
            if (r8 == 0) goto L47
            r8 = 256(0x100, float:3.59E-43)
            goto L49
        L47:
            r8 = 128(0x80, float:1.8E-43)
        L49:
            r7 = r7 | r8
        L4a:
            r8 = r2 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L57
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L54:
            r5 = r47
            goto L6a
        L57:
            r5 = r0 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L54
            r5 = r47
            boolean r18 = r14.g(r5)
            if (r18 == 0) goto L66
            r18 = r17
            goto L68
        L66:
            r18 = r16
        L68:
            r7 = r7 | r18
        L6a:
            r18 = r2 & 16
            r6 = 0
            r20 = 16384(0x4000, float:2.2959E-41)
            r21 = 8192(0x2000, float:1.148E-41)
            if (r18 == 0) goto L76
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L86
        L76:
            r9 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L86
            boolean r9 = r14.g(r6)
            if (r9 == 0) goto L83
            r9 = r20
            goto L85
        L83:
            r9 = r21
        L85:
            r7 = r7 | r9
        L86:
            r22 = 196608(0x30000, float:2.75506E-40)
            r9 = r0 & r22
            r23 = 65536(0x10000, float:9.1835E-41)
            r24 = 131072(0x20000, float:1.83671E-40)
            if (r9 != 0) goto La6
            r9 = r2 & 32
            if (r9 != 0) goto L9f
            r9 = r48
            boolean r25 = r14.f(r9)
            if (r25 == 0) goto La1
            r25 = r24
            goto La3
        L9f:
            r9 = r48
        La1:
            r25 = r23
        La3:
            r7 = r7 | r25
            goto La8
        La6:
            r9 = r48
        La8:
            r25 = r2 & 64
            r26 = 1048576(0x100000, float:1.469368E-39)
            r27 = 1572864(0x180000, float:2.204052E-39)
            r28 = 524288(0x80000, float:7.34684E-40)
            if (r25 == 0) goto Lb7
            r7 = r7 | r27
            r10 = r49
            goto Lca
        Lb7:
            r29 = r0 & r27
            r10 = r49
            if (r29 != 0) goto Lca
            boolean r30 = r14.h(r10)
            if (r30 == 0) goto Lc6
            r30 = r26
            goto Lc8
        Lc6:
            r30 = r28
        Lc8:
            r7 = r7 | r30
        Lca:
            r11 = r2 & 128(0x80, float:1.8E-43)
            r31 = 4194304(0x400000, float:5.877472E-39)
            r32 = 8388608(0x800000, float:1.1754944E-38)
            r12 = 0
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto Ld8
            r7 = r7 | r34
            goto Le8
        Ld8:
            r11 = r0 & r34
            if (r11 != 0) goto Le8
            boolean r11 = r14.h(r12)
            if (r11 == 0) goto Le5
            r11 = r32
            goto Le7
        Le5:
            r11 = r31
        Le7:
            r7 = r7 | r11
        Le8:
            r11 = r2 & 256(0x100, float:3.59E-43)
            r35 = 33554432(0x2000000, float:9.403955E-38)
            r36 = 67108864(0x4000000, float:1.5046328E-36)
            r37 = 100663296(0x6000000, float:2.4074124E-35)
            if (r11 == 0) goto Lf5
            r7 = r7 | r37
            goto L105
        Lf5:
            r11 = r0 & r37
            if (r11 != 0) goto L105
            boolean r11 = r14.h(r12)
            if (r11 == 0) goto L102
            r11 = r36
            goto L104
        L102:
            r11 = r35
        L104:
            r7 = r7 | r11
        L105:
            r11 = r2 & 512(0x200, float:7.17E-43)
            r38 = 268435456(0x10000000, float:2.524355E-29)
            r39 = 536870912(0x20000000, float:1.0842022E-19)
            r40 = 805306368(0x30000000, float:4.656613E-10)
            if (r11 == 0) goto L112
            r7 = r7 | r40
            goto L122
        L112:
            r11 = r0 & r40
            if (r11 != 0) goto L122
            boolean r11 = r14.h(r12)
            if (r11 == 0) goto L11f
            r11 = r39
            goto L121
        L11f:
            r11 = r38
        L121:
            r7 = r7 | r11
        L122:
            r11 = r2 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L12b
            r19 = r1 | 6
            r6 = r50
            goto L141
        L12b:
            r41 = r1 & 6
            r6 = r50
            if (r41 != 0) goto L13f
            boolean r42 = r14.g(r6)
            if (r42 == 0) goto L13a
            r19 = 4
            goto L13c
        L13a:
            r19 = 2
        L13c:
            r19 = r1 | r19
            goto L141
        L13f:
            r19 = r1
        L141:
            r12 = r2 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L14a
            r19 = r19 | 48
            r0 = r51
            goto L15d
        L14a:
            r42 = r1 & 48
            r0 = r51
            if (r42 != 0) goto L15d
            boolean r42 = r14.f(r0)
            if (r42 == 0) goto L159
            r29 = 32
            goto L15b
        L159:
            r29 = 16
        L15b:
            r19 = r19 | r29
        L15d:
            r0 = r1 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L171
            r0 = r52
            boolean r18 = r14.f(r0)
            if (r18 == 0) goto L16c
            r30 = 256(0x100, float:3.59E-43)
            goto L16e
        L16c:
            r30 = 128(0x80, float:1.8E-43)
        L16e:
            r19 = r19 | r30
            goto L173
        L171:
            r0 = r52
        L173:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L18d
            r0 = r2 & 8192(0x2000, float:1.148E-41)
            if (r0 != 0) goto L186
            r0 = r53
            boolean r18 = r14.f(r0)
            if (r18 == 0) goto L188
            r16 = r17
            goto L188
        L186:
            r0 = r53
        L188:
            r19 = r19 | r16
        L18a:
            r0 = r19
            goto L190
        L18d:
            r0 = r53
            goto L18a
        L190:
            r4 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L19b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r16 = r0
        L198:
            r0 = r54
            goto L1ae
        L19b:
            r16 = r0
            r0 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L198
            r0 = r54
            boolean r17 = r14.g(r0)
            if (r17 == 0) goto L1aa
            goto L1ac
        L1aa:
            r20 = r21
        L1ac:
            r16 = r16 | r20
        L1ae:
            r17 = r1 & r22
            r18 = 32768(0x8000, float:4.5918E-41)
            if (r17 != 0) goto L1c9
            r17 = r2 & r18
            r0 = r55
            if (r17 != 0) goto L1c4
            boolean r17 = r14.d(r0)
            if (r17 == 0) goto L1c4
            r17 = r24
            goto L1c6
        L1c4:
            r17 = r23
        L1c6:
            r16 = r16 | r17
            goto L1cb
        L1c9:
            r0 = r55
        L1cb:
            r17 = r2 & r23
            if (r17 == 0) goto L1d4
            r16 = r16 | r27
            r0 = r56
            goto L1e5
        L1d4:
            r19 = r1 & r27
            r0 = r56
            if (r19 != 0) goto L1e5
            boolean r19 = r14.d(r0)
            if (r19 == 0) goto L1e1
            goto L1e3
        L1e1:
            r26 = r28
        L1e3:
            r16 = r16 | r26
        L1e5:
            r19 = r2 & r24
            if (r19 == 0) goto L1ec
            r16 = r16 | r34
            goto L1fb
        L1ec:
            r19 = r1 & r34
            if (r19 != 0) goto L1fb
            r0 = 0
            boolean r19 = r14.f(r0)
            if (r19 == 0) goto L1f9
            r31 = r32
        L1f9:
            r16 = r16 | r31
        L1fb:
            r0 = r1 & r37
            r19 = 262144(0x40000, float:3.67342E-40)
            if (r0 != 0) goto L215
            r0 = r2 & r19
            if (r0 != 0) goto L210
            r0 = r57
            boolean r20 = r14.f(r0)
            if (r20 == 0) goto L212
            r35 = r36
            goto L212
        L210:
            r0 = r57
        L212:
            r16 = r16 | r35
            goto L217
        L215:
            r0 = r57
        L217:
            r20 = r1 & r40
            if (r20 != 0) goto L225
            boolean r20 = r14.f(r13)
            if (r20 == 0) goto L223
            r38 = r39
        L223:
            r16 = r16 | r38
        L225:
            r0 = r16
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r7 & r16
            r20 = r4
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r4) goto L23a
            r1 = r0 & r16
            if (r1 == r4) goto L238
            goto L23a
        L238:
            r1 = 0
            goto L23b
        L23a:
            r1 = 1
        L23b:
            r4 = r7 & 1
            boolean r1 = r14.S(r4, r1)
            if (r1 == 0) goto L444
            r14.X()
            r1 = r60 & 1
            r4 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r1 == 0) goto L288
            boolean r1 = r14.B()
            if (r1 == 0) goto L257
            goto L288
        L257:
            r14.V()
            r1 = r2 & 32
            if (r1 == 0) goto L260
            r7 = r7 & r16
        L260:
            r1 = r2 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L266
            r0 = r0 & (-7169(0xffffffffffffe3ff, float:NaN))
        L266:
            r1 = r2 & r18
            if (r1 == 0) goto L26c
            r0 = r0 & r16
        L26c:
            r1 = r2 & r19
            if (r1 == 0) goto L271
            r0 = r0 & r4
        L271:
            r8 = r51
            r1 = r53
            r16 = r55
            r17 = r56
            r12 = r57
            r18 = r0
            r19 = r7
            r0 = r9
            r11 = r10
            r7 = r54
            r10 = r6
            r6 = r47
            goto L303
        L288:
            if (r8 == 0) goto L28c
            r1 = 1
            goto L28e
        L28c:
            r1 = r47
        L28e:
            r8 = r2 & 32
            if (r8 == 0) goto L29d
            py0 r8 = defpackage.x37.a
            java.lang.Object r8 = r14.j(r8)
            s47 r8 = (defpackage.s47) r8
            r7 = r7 & r16
            goto L29e
        L29d:
            r8 = r9
        L29e:
            if (r25 == 0) goto L2a1
            r10 = 0
        L2a1:
            if (r11 == 0) goto L2a4
            r6 = 0
        L2a4:
            if (r12 == 0) goto L2a9
            fa6 r9 = defpackage.xd5.v0
            goto L2ab
        L2a9:
            r9 = r51
        L2ab:
            r11 = r2 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto L2bc
            vh3 r11 = new vh3
            r12 = 63
            r21 = r4
            r4 = 0
            r11.<init>(r12, r4)
            r0 = r0 & (-7169(0xffffffffffffe3ff, float:NaN))
            goto L2c0
        L2bc:
            r21 = r4
            r11 = r53
        L2c0:
            if (r20 == 0) goto L2c4
            r4 = 0
            goto L2c6
        L2c4:
            r4 = r54
        L2c6:
            r12 = r2 & r18
            if (r12 == 0) goto L2d4
            if (r4 == 0) goto L2ce
            r12 = 1
            goto L2d1
        L2ce:
            r12 = 2147483647(0x7fffffff, float:NaN)
        L2d1:
            r0 = r0 & r16
            goto L2d6
        L2d4:
            r12 = r55
        L2d6:
            if (r17 == 0) goto L2db
            r16 = 1
            goto L2dd
        L2db:
            r16 = r56
        L2dd:
            r17 = r2 & r19
            if (r17 == 0) goto L2ee
            nq6 r5 = defpackage.ze6.a
            java.lang.Object r5 = r14.j(r5)
            ye6 r5 = (defpackage.ye6) r5
            y16 r5 = r5.a
            r0 = r0 & r21
            goto L2f0
        L2ee:
            r5 = r57
        L2f0:
            r17 = r6
            r6 = r1
            r1 = r11
            r11 = r10
            r10 = r17
            r18 = r0
            r19 = r7
            r0 = r8
            r8 = r9
            r17 = r16
            r7 = r4
            r16 = r12
            r12 = r5
        L303:
            r14.q()
            r4 = -1063705564(0xffffffffc0992424, float:-4.7856617)
            r14.b0(r4)
            java.lang.Object r4 = r14.P()
            vs0 r5 = defpackage.ox0.a
            if (r4 != r5) goto L318
            r94 r4 = defpackage.i61.f(r14)
        L318:
            r9 = r4
            r94 r9 = (defpackage.r94) r9
            r4 = 0
            r14.p(r4)
            r4 = 796976005(0x2f80e385, float:2.3444727E-10)
            r14.b0(r4)
            long r20 = r0.b()
            r23 = 16
            int r4 = (r20 > r23 ? 1 : (r20 == r23 ? 0 : -1))
            if (r4 == 0) goto L335
            r47 = r1
            r24 = r20
        L333:
            r4 = 0
            goto L346
        L335:
            qa4 r4 = r13.b(r6, r14)
            java.lang.Object r4 = r4.getValue()
            kt0 r4 = (defpackage.kt0) r4
            r47 = r1
            long r1 = r4.a
            r24 = r1
            goto L333
        L346:
            r14.p(r4)
            s47 r23 = new s47
            r34 = 0
            r36 = 16777214(0xfffffe, float:2.3509884E-38)
            r26 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r23.<init>(r24, r26, r28, r29, r31, r33, r34, r36)
            r1 = r23
            s47 r1 = r0.d(r1)
            nq6 r2 = defpackage.ky0.h
            java.lang.Object r2 = r14.j(r2)
            qh1 r2 = (defpackage.qh1) r2
            x64 r4 = defpackage.x64.a
            if (r11 == 0) goto L3a5
            r48 = r0
            r0 = -1063234302(0xffffffffc0a05502, float:-5.010377)
            r14.b0(r0)
            java.lang.Object r0 = r14.P()
            if (r0 != r5) goto L387
            x84 r0 = new x84
            r5 = 23
            r0.<init>(r5)
            r14.l0(r0)
        L387:
            qn2 r0 = (defpackage.qn2) r0
            r5 = 1
            a74 r23 = defpackage.ua6.a(r4, r5, r0)
            long r4 = defpackage.zo4.a
            float r25 = r2.x(r4)
            r27 = 0
            r28 = 13
            r24 = 0
            r26 = 0
            a74 r4 = defpackage.ge7.S(r23, r24, r25, r26, r27, r28)
            r0 = 0
            r14.p(r0)
            goto L3b1
        L3a5:
            r48 = r0
            r0 = 0
            r2 = -1062848941(0xffffffffc0a63653, float:-5.1941314)
            r14.b0(r2)
            r14.p(r0)
        L3b1:
            a74 r2 = r3.d(r4)
            r4 = 3
            java.lang.String r4 = defpackage.ii2.z(r14, r4)
            if (r10 == 0) goto L3ca
            c70 r5 = new c70
            r49 = r1
            r1 = 17
            r5.<init>(r4, r1)
            a74 r2 = defpackage.ua6.a(r2, r0, r5)
            goto L3cc
        L3ca:
            r49 = r1
        L3cc:
            r0 = 1133248512(0x438c0000, float:280.0)
            r1 = 1113587712(0x42600000, float:56.0)
            a74 r0 = defpackage.dj6.a(r2, r0, r1)
            cn6 r1 = new cn6
            qa4 r2 = r13.c(r10, r14)
            java.lang.Object r2 = r2.getValue()
            kt0 r2 = (defpackage.kt0) r2
            long r4 = r2.a
            r1.<init>(r4)
            wo4 r4 = new wo4
            r5 = r44
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r23 = r10
            r2 = r11
            r24 = r12
            r5 = -1881867558(0xffffffff8fd4fada, float:-2.1001438E-29)
            zv0 r4 = defpackage.n16.I(r5, r4, r14)
            r5 = 64638(0xfc7e, float:9.0577E-41)
            r5 = r19 & r5
            int r10 = r18 << 12
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 234881024(0xe000000, float:1.5777218E-30)
            r11 = r11 & r10
            r5 = r5 | r11
            r11 = 1879048192(0x70000000, float:1.5845633E29)
            r10 = r10 & r11
            r20 = r5 | r10
            int r5 = r18 >> 18
            r5 = r5 & 14
            r5 = r5 | r22
            r10 = r18 & 112(0x70, float:1.57E-43)
            r21 = r5 | r10
            r15 = 0
            r5 = r45
            r10 = r47
            r18 = r4
            r11 = r7
            r19 = r14
            r12 = r16
            r13 = r17
            r4 = r44
            r17 = r1
            r7 = r6
            r14 = r8
            r16 = r9
            r8 = r49
            r9 = r52
            r6 = r0
            defpackage.k30.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6 = r7
            r7 = r11
            r8 = r14
            r5 = r48
            r4 = r6
            r7 = r23
            r14 = r24
            r6 = r2
            goto L45a
        L444:
            r19 = r14
            r19.V()
            r4 = r47
            r8 = r51
            r11 = r54
            r12 = r55
            r13 = r56
            r14 = r57
            r7 = r6
            r5 = r9
            r6 = r10
            r10 = r53
        L45a:
            cf5 r0 = r19.t()
            if (r0 == 0) goto L47a
            r1 = r0
            xo4 r0 = new xo4
            r2 = r45
            r9 = r52
            r15 = r58
            r16 = r60
            r17 = r61
            r18 = r62
            r43 = r1
            r1 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r43
            r1.d = r0
        L47a:
            return
    }

    public static final void b(java.lang.String r35, defpackage.qn2 r36, defpackage.a74 r37, boolean r38, defpackage.s47 r39, defpackage.eo2 r40, defpackage.eo2 r41, boolean r42, defpackage.wq7 r43, defpackage.xh3 r44, defpackage.vh3 r45, boolean r46, int r47, int r48, defpackage.ke6 r49, defpackage.i17 r50, defpackage.px0 r51, int r52, int r53, int r54) {
            r3 = r37
            r0 = r50
            r1 = r52
            r2 = r53
            r4 = r54
            r5 = r51
            xq2 r5 = (defpackage.xq2) r5
            r6 = 801000036(0x2fbe4a64, float:3.4613656E-10)
            r5.d0(r6)
            r6 = r1 & 6
            if (r6 != 0) goto L25
            r6 = r35
            boolean r9 = r5.f(r6)
            if (r9 == 0) goto L22
            r9 = 4
            goto L23
        L22:
            r9 = 2
        L23:
            r9 = r9 | r1
            goto L28
        L25:
            r6 = r35
            r9 = r1
        L28:
            r10 = r1 & 48
            if (r10 != 0) goto L3b
            r10 = r36
            boolean r13 = r5.h(r10)
            if (r13 == 0) goto L37
            r13 = 32
            goto L39
        L37:
            r13 = 16
        L39:
            r9 = r9 | r13
            goto L3d
        L3b:
            r10 = r36
        L3d:
            r13 = r1 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L4d
            boolean r13 = r5.f(r3)
            if (r13 == 0) goto L4a
            r13 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r13 = 128(0x80, float:1.8E-43)
        L4c:
            r9 = r9 | r13
        L4d:
            r13 = r9 | 27648(0x6c00, float:3.8743E-41)
            r16 = 196608(0x30000, float:2.75506E-40)
            r17 = r1 & r16
            if (r17 != 0) goto L59
            r13 = 93184(0x16c00, float:1.30579E-40)
            r13 = r13 | r9
        L59:
            r9 = r4 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L64
            r13 = r13 | r17
            r7 = r40
            goto L77
        L64:
            r17 = r1 & r17
            r7 = r40
            if (r17 != 0) goto L77
            boolean r17 = r5.h(r7)
            if (r17 == 0) goto L73
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L75
        L73:
            r17 = 524288(0x80000, float:7.34684E-40)
        L75:
            r13 = r13 | r17
        L77:
            r8 = r4 & 128(0x80, float:1.8E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 == 0) goto L82
            r13 = r13 | r18
            r11 = r41
            goto L95
        L82:
            r18 = r1 & r18
            r11 = r41
            if (r18 != 0) goto L95
            boolean r19 = r5.h(r11)
            if (r19 == 0) goto L91
            r19 = 8388608(0x800000, float:1.1754944E-38)
            goto L93
        L91:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L93:
            r13 = r13 | r19
        L95:
            r19 = 905969664(0x36000000, float:1.9073486E-6)
            r13 = r13 | r19
            r12 = r4 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto La2
            r17 = r2 | 6
            r14 = r42
            goto Lb8
        La2:
            r20 = r2 & 6
            r14 = r42
            if (r20 != 0) goto Lb6
            boolean r21 = r5.g(r14)
            if (r21 == 0) goto Lb1
            r17 = 4
            goto Lb3
        Lb1:
            r17 = 2
        Lb3:
            r17 = r2 | r17
            goto Lb8
        Lb6:
            r17 = r2
        Lb8:
            r15 = r4 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto Lc1
            r17 = r17 | 48
        Lbe:
            r1 = r17
            goto Ld5
        Lc1:
            r21 = r2 & 48
            r1 = r43
            if (r21 != 0) goto Lbe
            boolean r21 = r5.f(r1)
            if (r21 == 0) goto Ld0
            r18 = 32
            goto Ld2
        Ld0:
            r18 = 16
        Ld2:
            r17 = r17 | r18
            goto Lbe
        Ld5:
            r6 = r4 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto Ldc
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto Lf7
        Ldc:
            r17 = r1
            r1 = r2 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto Lf4
            r1 = r44
            boolean r18 = r5.f(r1)
            if (r18 == 0) goto Led
            r20 = 256(0x100, float:3.59E-43)
            goto Lef
        Led:
            r20 = 128(0x80, float:1.8E-43)
        Lef:
            r17 = r17 | r20
        Lf1:
            r1 = r17
            goto Lf7
        Lf4:
            r1 = r44
            goto Lf1
        Lf7:
            r17 = r6
            r6 = r4 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L100
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L11b
        L100:
            r18 = r1
            r1 = r2 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L118
            r1 = r45
            boolean r19 = r5.f(r1)
            if (r19 == 0) goto L111
            r19 = 2048(0x800, float:2.87E-42)
            goto L113
        L111:
            r19 = 1024(0x400, float:1.435E-42)
        L113:
            r18 = r18 | r19
        L115:
            r1 = r18
            goto L11b
        L118:
            r1 = r45
            goto L115
        L11b:
            r18 = r6
            r6 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L128
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r19 = r1
        L125:
            r1 = r46
            goto L13d
        L128:
            r19 = r1
            r1 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L125
            r1 = r46
            boolean r20 = r5.g(r1)
            if (r20 == 0) goto L139
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L13b
        L139:
            r20 = 8192(0x2000, float:1.148E-41)
        L13b:
            r19 = r19 | r20
        L13d:
            r20 = r2 & r16
            if (r20 != 0) goto L145
            r20 = 65536(0x10000, float:9.1835E-41)
            r19 = r19 | r20
        L145:
            r20 = 14155776(0xd80000, float:1.9836467E-38)
            r20 = r19 | r20
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r21 = r2 & r21
            if (r21 != 0) goto L153
            r20 = 47710208(0x2d80000, float:3.1738347E-37)
            r20 = r19 | r20
        L153:
            r19 = 805306368(0x30000000, float:4.656613E-10)
            r19 = r2 & r19
            if (r19 != 0) goto L166
            boolean r19 = r5.f(r0)
            if (r19 == 0) goto L162
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L164
        L162:
            r19 = 268435456(0x10000000, float:2.524355E-29)
        L164:
            r20 = r20 | r19
        L166:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r13 & r19
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L177
            r1 = r20 & r19
            if (r1 == r2) goto L175
            goto L177
        L175:
            r1 = 0
            goto L178
        L177:
            r1 = 1
        L178:
            r2 = r13 & 1
            boolean r1 = r5.S(r2, r1)
            if (r1 == 0) goto L349
            r5.X()
            r1 = r52 & 1
            r2 = -235339777(0xfffffffff1f8ffff, float:-2.4659764E30)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r1 == 0) goto L1b3
            boolean r1 = r5.B()
            if (r1 == 0) goto L194
            goto L1b3
        L194:
            r5.V()
            r1 = r13 & r19
            r2 = r20 & r2
            r8 = r38
            r15 = r43
            r10 = r44
            r12 = r46
            r13 = r47
            r6 = r49
            r9 = r1
            r17 = r2
            r19 = r11
            r1 = r39
            r11 = r45
            r2 = r48
            goto L203
        L1b3:
            py0 r1 = defpackage.x37.a
            java.lang.Object r1 = r5.j(r1)
            s47 r1 = (defpackage.s47) r1
            r13 = r13 & r19
            r19 = 0
            if (r9 == 0) goto L1c3
            r7 = r19
        L1c3:
            if (r8 == 0) goto L1c6
            goto L1c8
        L1c6:
            r19 = r11
        L1c8:
            if (r12 == 0) goto L1cb
            r14 = 0
        L1cb:
            if (r15 == 0) goto L1d0
            fa6 r8 = defpackage.xd5.v0
            goto L1d2
        L1d0:
            r8 = r43
        L1d2:
            if (r17 == 0) goto L1d7
            xh3 r9 = defpackage.xh3.e
            goto L1d9
        L1d7:
            r9 = r44
        L1d9:
            if (r18 == 0) goto L1de
            vh3 r11 = defpackage.vh3.b
            goto L1e0
        L1de:
            r11 = r45
        L1e0:
            if (r6 == 0) goto L1e4
            r6 = 0
            goto L1e6
        L1e4:
            r6 = r46
        L1e6:
            if (r6 == 0) goto L1ea
            r12 = 1
            goto L1ed
        L1ea:
            r12 = 2147483647(0x7fffffff, float:NaN)
        L1ed:
            nq6 r15 = defpackage.ze6.a
            java.lang.Object r15 = r5.j(r15)
            ye6 r15 = (defpackage.ye6) r15
            y16 r15 = r15.a
            r2 = r20 & r2
            r17 = r2
            r10 = r9
            r9 = r13
            r2 = 1
            r13 = r12
            r12 = r6
            r6 = r15
            r15 = r8
            r8 = 1
        L203:
            r5.q()
            r4 = -245181289(0xfffffffff162d497, float:-1.1232099E30)
            r5.b0(r4)
            java.lang.Object r4 = r5.P()
            r49 = r2
            vs0 r2 = defpackage.ox0.a
            if (r4 != r2) goto L21a
            r94 r4 = defpackage.i61.f(r5)
        L21a:
            r94 r4 = (defpackage.r94) r4
            r43 = r4
            r4 = 0
            r5.p(r4)
            r4 = 961927346(0x3955d8b2, float:2.0393988E-4)
            r5.b0(r4)
            long r20 = r1.b()
            r22 = 16
            int r4 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r4 == 0) goto L23a
            r47 = r6
            r45 = r7
            r21 = r20
        L238:
            r4 = 0
            goto L24d
        L23a:
            qa4 r4 = r0.b(r8, r5)
            java.lang.Object r4 = r4.getValue()
            kt0 r4 = (defpackage.kt0) r4
            r47 = r6
            r45 = r7
            long r6 = r4.a
            r21 = r6
            goto L238
        L24d:
            r5.p(r4)
            s47 r20 = new s47
            r31 = 0
            r33 = 16777214(0xfffffe, float:2.3509884E-38)
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r20.<init>(r21, r23, r25, r26, r28, r30, r31, r33)
            r4 = r20
            s47 r4 = r1.d(r4)
            nq6 r6 = defpackage.ky0.h
            java.lang.Object r6 = r5.j(r6)
            qh1 r6 = (defpackage.qh1) r6
            x64 r7 = defpackage.x64.a
            if (r45 == 0) goto L2ac
            r24 = r1
            r1 = -244710027(0xfffffffff16a0575, float:-1.1588174E30)
            r5.b0(r1)
            java.lang.Object r1 = r5.P()
            if (r1 != r2) goto L28e
            x84 r1 = new x84
            r2 = 23
            r1.<init>(r2)
            r5.l0(r1)
        L28e:
            qn2 r1 = (defpackage.qn2) r1
            r2 = 1
            a74 r25 = defpackage.ua6.a(r7, r2, r1)
            long r1 = defpackage.zo4.a
            float r27 = r6.x(r1)
            r29 = 0
            r30 = 13
            r26 = 0
            r28 = 0
            a74 r7 = defpackage.ge7.S(r25, r26, r27, r28, r29, r30)
            r1 = 0
            r5.p(r1)
            goto L2b8
        L2ac:
            r24 = r1
            r1 = 0
            r2 = -244324666(0xfffffffff16fe6c6, float:-1.1879345E30)
            r5.b0(r2)
            r5.p(r1)
        L2b8:
            a74 r2 = r3.d(r7)
            r6 = 3
            java.lang.String r6 = defpackage.ii2.z(r5, r6)
            if (r14 == 0) goto L2ce
            c70 r7 = new c70
            r3 = 17
            r7.<init>(r6, r3)
            a74 r2 = defpackage.ua6.a(r2, r1, r7)
        L2ce:
            r1 = 1133248512(0x438c0000, float:280.0)
            r3 = 1113587712(0x42600000, float:56.0)
            a74 r7 = defpackage.dj6.a(r2, r1, r3)
            cn6 r1 = new cn6
            qa4 r2 = r0.c(r14, r5)
            java.lang.Object r2 = r2.getValue()
            kt0 r2 = (defpackage.kt0) r2
            long r2 = r2.a
            r1.<init>(r2)
            to4 r2 = new to4
            r39 = r35
            r48 = r0
            r38 = r2
            r40 = r8
            r41 = r12
            r44 = r14
            r42 = r15
            r46 = r19
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r14 = r38
            r3 = r44
            r2 = r46
            r25 = r47
            r6 = r17
            r17 = r43
            r0 = -591103097(0xffffffffdcc47b87, float:-4.4243932E17)
            zv0 r19 = defpackage.n16.I(r0, r14, r5)
            r0 = 64638(0xfc7e, float:9.0577E-41)
            r0 = r0 & r9
            int r9 = r6 << 12
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r9
            r0 = r0 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r9
            r0 = r0 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r14
            r21 = r0 | r9
            int r0 = r6 >> 18
            r0 = r0 & 14
            r0 = r0 | r16
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r0 | r6
            r23 = 4096(0x1000, float:5.74E-42)
            r16 = 0
            r6 = r36
            r14 = r49
            r18 = r1
            r9 = r4
            r20 = r5
            r5 = r35
            defpackage.k30.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = r45
            r7 = r2
            r4 = r8
            r9 = r15
            r5 = r24
            r15 = r25
            r8 = r3
            goto L363
        L349:
            r20 = r5
            r20.V()
            r4 = r38
            r5 = r39
            r9 = r43
            r10 = r44
            r12 = r46
            r13 = r47
            r15 = r49
            r6 = r7
            r7 = r11
            r8 = r14
            r11 = r45
            r14 = r48
        L363:
            cf5 r0 = r20.t()
            if (r0 == 0) goto L385
            r1 = r0
            uo4 r0 = new uo4
            r20 = 0
            r2 = r36
            r3 = r37
            r16 = r50
            r17 = r52
            r18 = r53
            r19 = r54
            r34 = r1
            r1 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r34
            r1.d = r0
        L385:
            return
    }

    public static final void c(defpackage.a74 r25, defpackage.eo2 r26, defpackage.fo2 r27, defpackage.eo2 r28, defpackage.eo2 r29, defpackage.eo2 r30, boolean r31, float r32, defpackage.qn2 r33, defpackage.zv0 r34, defpackage.lq4 r35, defpackage.px0 r36, int r37) {
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r37
            e40 r0 = defpackage.d90.Z
            r13 = r36
            xq2 r13 = (defpackage.xq2) r13
            r14 = 36320288(0x22a3420, float:1.2504587E-37)
            r13.d0(r14)
            r14 = r12 & 6
            if (r14 != 0) goto L33
            boolean r14 = r13.f(r1)
            if (r14 == 0) goto L30
            r14 = 4
            goto L31
        L30:
            r14 = 2
        L31:
            r14 = r14 | r12
            goto L34
        L33:
            r14 = r12
        L34:
            r16 = r12 & 48
            if (r16 != 0) goto L45
            boolean r16 = r13.h(r2)
            if (r16 == 0) goto L41
            r16 = 32
            goto L43
        L41:
            r16 = 16
        L43:
            r14 = r14 | r16
        L45:
            r15 = r12 & 384(0x180, float:5.38E-43)
            if (r15 != 0) goto L55
            boolean r15 = r13.h(r3)
            if (r15 == 0) goto L52
            r15 = 256(0x100, float:3.59E-43)
            goto L54
        L52:
            r15 = 128(0x80, float:1.8E-43)
        L54:
            r14 = r14 | r15
        L55:
            r15 = r12 & 3072(0xc00, float:4.305E-42)
            if (r15 != 0) goto L65
            boolean r15 = r13.h(r4)
            if (r15 == 0) goto L62
            r15 = 2048(0x800, float:2.87E-42)
            goto L64
        L62:
            r15 = 1024(0x400, float:1.435E-42)
        L64:
            r14 = r14 | r15
        L65:
            r15 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L75
            boolean r15 = r13.h(r5)
            if (r15 == 0) goto L72
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L74
        L72:
            r15 = 8192(0x2000, float:1.148E-41)
        L74:
            r14 = r14 | r15
        L75:
            r15 = 196608(0x30000, float:2.75506E-40)
            r15 = r15 & r12
            if (r15 != 0) goto L86
            boolean r15 = r13.h(r6)
            if (r15 == 0) goto L83
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L85
        L83:
            r15 = 65536(0x10000, float:9.1835E-41)
        L85:
            r14 = r14 | r15
        L86:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r12
            if (r15 != 0) goto L97
            boolean r15 = r13.g(r7)
            if (r15 == 0) goto L94
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L96
        L94:
            r15 = 524288(0x80000, float:7.34684E-40)
        L96:
            r14 = r14 | r15
        L97:
            r15 = 12582912(0xc00000, float:1.7632415E-38)
            r15 = r37 & r15
            if (r15 != 0) goto La9
            boolean r15 = r13.c(r8)
            if (r15 == 0) goto La6
            r15 = 8388608(0x800000, float:1.1754944E-38)
            goto La8
        La6:
            r15 = 4194304(0x400000, float:5.877472E-39)
        La8:
            r14 = r14 | r15
        La9:
            r15 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = r37 & r15
            if (r15 != 0) goto Lbb
            boolean r15 = r13.h(r9)
            if (r15 == 0) goto Lb8
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lba
        Lb8:
            r15 = 33554432(0x2000000, float:9.403955E-38)
        Lba:
            r14 = r14 | r15
        Lbb:
            r15 = 805306368(0x30000000, float:4.656613E-10)
            r15 = r37 & r15
            if (r15 != 0) goto Lcd
            boolean r15 = r13.h(r10)
            if (r15 == 0) goto Lca
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lcc
        Lca:
            r15 = 268435456(0x10000000, float:2.524355E-29)
        Lcc:
            r14 = r14 | r15
        Lcd:
            boolean r15 = r13.f(r11)
            if (r15 == 0) goto Ld5
            r15 = 4
            goto Ld6
        Ld5:
            r15 = 2
        Ld6:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r14 & r17
            r17 = r14
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = r15
            if (r12 != r14) goto Lec
            r12 = r18 & 3
            r14 = 2
            if (r12 == r14) goto Lea
            goto Lec
        Lea:
            r12 = 0
            goto Led
        Lec:
            r12 = 1
        Led:
            r14 = r17 & 1
            boolean r12 = r13.S(r14, r12)
            if (r12 == 0) goto L3a1
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r17 & r12
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 != r14) goto Lff
            r12 = 1
            goto L100
        Lff:
            r12 = 0
        L100:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r17 & r14
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != r15) goto L10a
            r14 = 1
            goto L10b
        L10a:
            r14 = 0
        L10b:
            r12 = r12 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r17 & r14
            r15 = 8388608(0x800000, float:1.1754944E-38)
            if (r14 != r15) goto L116
            r14 = 1
            goto L117
        L116:
            r14 = 0
        L117:
            r12 = r12 | r14
            r14 = r18 & 14
            r15 = 4
            if (r14 != r15) goto L11f
            r14 = 1
            goto L120
        L11f:
            r14 = 0
        L120:
            r12 = r12 | r14
            java.lang.Object r14 = r13.P()
            if (r12 != 0) goto L12b
            vs0 r12 = defpackage.ox0.a
            if (r14 != r12) goto L133
        L12b:
            bp4 r14 = new bp4
            r14.<init>(r9, r7, r8, r11)
            r13.l0(r14)
        L133:
            bp4 r14 = (defpackage.bp4) r14
            nq6 r12 = defpackage.ky0.n
            java.lang.Object r12 = r13.j(r12)
            kk3 r12 = (defpackage.kk3) r12
            int r15 = defpackage.ge7.B(r13)
            xv4 r7 = r13.l()
            a74 r8 = defpackage.l.E(r13, r1)
            ix0 r16 = defpackage.jx0.i
            r16.getClass()
            iy0 r1 = defpackage.ix0.b
            r13.f0()
            boolean r9 = r13.S
            if (r9 == 0) goto L15b
            r13.k(r1)
            goto L15e
        L15b:
            r13.o0()
        L15e:
            pn r9 = defpackage.ix0.f
            defpackage.yh2.K(r13, r9, r14)
            pn r14 = defpackage.ix0.e
            defpackage.yh2.K(r13, r14, r7)
            pn r7 = defpackage.ix0.g
            boolean r4 = r13.S
            if (r4 != 0) goto L17c
            java.lang.Object r4 = r13.P()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 != 0) goto L17f
        L17c:
            defpackage.i61.v(r15, r13, r15, r7)
        L17f:
            pn r2 = defpackage.ix0.d
            defpackage.yh2.K(r13, r2, r8)
            int r4 = r17 >> 27
            r4 = r4 & 14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10.o(r13, r4)
            m64 r4 = defpackage.m64.a
            x64 r8 = defpackage.x64.a
            if (r5 == 0) goto L1fa
            r15 = 1336978507(0x4fb0ac4b, float:5.928163E9)
            r13.b0(r15)
            java.lang.String r15 = "Leading"
            a74 r15 = defpackage.lb4.D(r8, r15)
            nq6 r16 = defpackage.u93.a
            a74 r15 = r15.d(r4)
            r10 = 0
            e34 r3 = defpackage.h70.d(r0, r10)
            int r10 = defpackage.ge7.B(r13)
            xv4 r11 = r13.l()
            a74 r15 = defpackage.l.E(r13, r15)
            r13.f0()
            r16 = r12
            boolean r12 = r13.S
            if (r12 == 0) goto L1c5
            r13.k(r1)
            goto L1c8
        L1c5:
            r13.o0()
        L1c8:
            defpackage.yh2.K(r13, r9, r3)
            defpackage.yh2.K(r13, r14, r11)
            boolean r3 = r13.S
            if (r3 != 0) goto L1e0
            java.lang.Object r3 = r13.P()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r3 = defpackage.nb3.k(r3, r11)
            if (r3 != 0) goto L1e3
        L1e0:
            defpackage.i61.v(r10, r13, r10, r7)
        L1e3:
            defpackage.yh2.K(r13, r2, r15)
            int r3 = r17 >> 12
            r3 = r3 & 14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.o(r13, r3)
            r3 = 1
            r13.p(r3)
            r10 = 0
            r13.p(r10)
            goto L206
        L1fa:
            r16 = r12
            r10 = 0
            r3 = 1337224523(0x4fb46d4b, float:6.054123E9)
            r13.b0(r3)
            r13.p(r10)
        L206:
            if (r6 == 0) goto L26e
            r3 = 1337267241(0x4fb51429, float:6.0759946E9)
            r13.b0(r3)
            java.lang.String r3 = "Trailing"
            a74 r3 = defpackage.lb4.D(r8, r3)
            nq6 r11 = defpackage.u93.a
            a74 r3 = r3.d(r4)
            e34 r0 = defpackage.h70.d(r0, r10)
            int r4 = defpackage.ge7.B(r13)
            xv4 r10 = r13.l()
            a74 r3 = defpackage.l.E(r13, r3)
            r13.f0()
            boolean r11 = r13.S
            if (r11 == 0) goto L235
            r13.k(r1)
            goto L238
        L235:
            r13.o0()
        L238:
            defpackage.yh2.K(r13, r9, r0)
            defpackage.yh2.K(r13, r14, r10)
            boolean r0 = r13.S
            if (r0 != 0) goto L250
            java.lang.Object r0 = r13.P()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r0 = defpackage.nb3.k(r0, r10)
            if (r0 != 0) goto L253
        L250:
            defpackage.i61.v(r4, r13, r4, r7)
        L253:
            defpackage.yh2.K(r13, r2, r3)
            int r0 = r17 >> 15
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.o(r13, r0)
            r3 = 1
            r13.p(r3)
            r10 = 0
            r13.p(r10)
        L269:
            r11 = r35
            r12 = r16
            goto L278
        L26e:
            r0 = 1337515179(0x4fb8dcab, float:6.202939E9)
            r13.b0(r0)
            r13.p(r10)
            goto L269
        L278:
            float r0 = defpackage.ge7.r(r11, r12)
            float r3 = defpackage.ge7.q(r11, r12)
            r4 = 0
            r10 = 1094713344(0x41400000, float:12.0)
            if (r5 == 0) goto L28b
            float r0 = r0 - r10
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 >= 0) goto L28b
            r0 = r4
        L28b:
            r20 = r0
            if (r6 == 0) goto L295
            float r3 = r3 - r10
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L295
            r3 = r4
        L295:
            r22 = r3
            r23 = 0
            r24 = 10
            r21 = 0
            r19 = r8
            a74 r0 = defpackage.ge7.S(r19, r20, r21, r22, r23, r24)
            r3 = r19
            if (r27 == 0) goto L2c9
            r4 = 1338367152(0x4fc5dcb0, float:6.639149E9)
            r13.b0(r4)
            java.lang.String r4 = "Hint"
            a74 r4 = defpackage.lb4.D(r3, r4)
            a74 r4 = r4.d(r0)
            int r8 = r17 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = r27
            r10.e(r4, r13, r8)
            r4 = 0
            r13.p(r4)
            goto L2d5
        L2c9:
            r10 = r27
            r4 = 0
            r8 = 1338454603(0x4fc7324b, float:6.683924E9)
            r13.b0(r8)
            r13.p(r4)
        L2d5:
            java.lang.String r4 = "TextField"
            a74 r4 = defpackage.lb4.D(r3, r4)
            a74 r0 = r4.d(r0)
            e40 r4 = defpackage.d90.L
            r8 = 1
            e34 r12 = defpackage.h70.d(r4, r8)
            int r8 = defpackage.ge7.B(r13)
            xv4 r15 = r13.l()
            a74 r0 = defpackage.l.E(r13, r0)
            r13.f0()
            boolean r5 = r13.S
            if (r5 == 0) goto L2fd
            r13.k(r1)
            goto L300
        L2fd:
            r13.o0()
        L300:
            defpackage.yh2.K(r13, r9, r12)
            defpackage.yh2.K(r13, r14, r15)
            boolean r5 = r13.S
            if (r5 != 0) goto L318
            java.lang.Object r5 = r13.P()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r5 = defpackage.nb3.k(r5, r12)
            if (r5 != 0) goto L31b
        L318:
            defpackage.i61.v(r8, r13, r8, r7)
        L31b:
            defpackage.yh2.K(r13, r2, r0)
            int r0 = r17 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r26
            r5.o(r13, r0)
            r8 = 1
            r13.p(r8)
            if (r28 == 0) goto L390
            r0 = 1338685429(0x4fcab7f5, float:6.802107E9)
            r13.b0(r0)
            java.lang.String r0 = "Label"
            a74 r0 = defpackage.lb4.D(r3, r0)
            r3 = 0
            e34 r4 = defpackage.h70.d(r4, r3)
            int r3 = defpackage.ge7.B(r13)
            xv4 r8 = r13.l()
            a74 r0 = defpackage.l.E(r13, r0)
            r13.f0()
            boolean r12 = r13.S
            if (r12 == 0) goto L359
            r13.k(r1)
            goto L35c
        L359:
            r13.o0()
        L35c:
            defpackage.yh2.K(r13, r9, r4)
            defpackage.yh2.K(r13, r14, r8)
            boolean r1 = r13.S
            if (r1 != 0) goto L374
            java.lang.Object r1 = r13.P()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 != 0) goto L377
        L374:
            defpackage.i61.v(r3, r13, r3, r7)
        L377:
            defpackage.yh2.K(r13, r2, r0)
            int r0 = r17 >> 9
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = r28
            r4.o(r13, r0)
            r3 = 1
            r13.p(r3)
            r0 = 0
            r13.p(r0)
            goto L39d
        L390:
            r4 = r28
            r0 = 0
            r3 = 1
            r1 = 1338768075(0x4fcbfacb, float:6.8444216E9)
            r13.b0(r1)
            r13.p(r0)
        L39d:
            r13.p(r3)
            goto L3a6
        L3a1:
            r5 = r2
            r10 = r3
            r13.V()
        L3a6:
            cf5 r13 = r13.t()
            if (r13 == 0) goto L3c3
            so4 r0 = new so4
            r1 = r25
            r7 = r31
            r8 = r32
            r9 = r33
            r12 = r37
            r2 = r5
            r3 = r10
            r5 = r29
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.d = r0
        L3c3:
            return
    }

    public static final int d(int r1, int r2, int r3, int r4, int r5, float r6, long r7, float r9, defpackage.lq4 r10) {
            r0 = 0
            int r0 = defpackage.oi2.M(r6, r4, r0)
            int r5 = java.lang.Math.max(r5, r0)
            int r3 = java.lang.Math.max(r3, r5)
            float r5 = r10.d()
            float r5 = r5 * r9
            float r4 = (float) r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r4 = java.lang.Math.max(r5, r4)
            float r4 = defpackage.oi2.L(r5, r4, r6)
            float r5 = r10.a()
            float r5 = r5 * r9
            float r3 = (float) r3
            float r4 = r4 + r3
            float r4 = r4 + r5
            int r3 = defpackage.u24.E(r4)
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = java.lang.Math.max(r1, r2)
            int r1 = defpackage.s21.f(r1, r7)
            return r1
    }

    public static final int e(int r1, int r2, int r3, int r4, int r5, float r6, long r7, float r9, defpackage.lq4 r10) {
            r0 = 0
            int r0 = defpackage.oi2.M(r6, r4, r0)
            int r5 = java.lang.Math.max(r0, r5)
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = r3 + r1
            int r3 = r3 + r2
            kk3 r1 = defpackage.kk3.Ltr
            float r2 = r10.b(r1)
            float r1 = r10.c(r1)
            float r1 = r1 + r2
            float r1 = r1 * r9
            float r2 = (float) r4
            float r2 = r2 + r1
            float r2 = r2 * r6
            int r1 = defpackage.u24.E(r2)
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = defpackage.s21.g(r1, r7)
            return r1
    }
}
