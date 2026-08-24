package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka4  reason: default package */
/* loaded from: classes.dex */
public final class ka4 {
    public long[] a;
    public java.lang.Object[] b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ ka4() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public ka4(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            r1.a = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.b = r0
            if (r2 < 0) goto L15
            int r2 = defpackage.b66.d(r2)
            r1.f(r2)
            return
        L15:
            java.lang.String r1 = "Capacity must be a positive value."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public final boolean a(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.d
            int r1 = r3.d(r4)
            java.lang.Object[] r2 = r3.b
            r2[r1] = r4
            int r3 = r3.d
            if (r3 == r0) goto L10
            r3 = 1
            return r3
        L10:
            r3 = 0
            return r3
    }

    public final void b() {
            r10 = this;
            r0 = 0
            r10.d = r0
            long[] r1 = r10.a
            long[] r2 = defpackage.b66.a
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            defpackage.fv.A0(r1, r2)
            long[] r1 = r10.a
            int r2 = r10.c
            int r3 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r4 = r1[r3]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r2
            long r8 = ~r6
            long r4 = r4 & r8
            long r4 = r4 | r6
            r1[r3] = r4
        L25:
            java.lang.Object[] r1 = r10.b
            r2 = 0
            int r3 = r10.c
            defpackage.fv.z0(r0, r3, r2, r1)
            int r0 = r10.c
            int r0 = defpackage.b66.a(r0)
            int r1 = r10.d
            int r0 = r0 - r1
            r10.e = r0
            return
    }

    public final boolean c(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.nb3.k(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    public final int d(java.lang.Object r35) {
            r34 = this;
            r0 = r34
            r1 = r35
            if (r1 == 0) goto Lb
            int r3 = r1.hashCode()
            goto Lc
        Lb:
            r3 = 0
        Lc:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.c
            r7 = r5 & r6
            r8 = 0
        L1c:
            long[] r9 = r0.a
            int r10 = r7 >> 3
            r11 = r7 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r14
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r11 * r13
            r19 = r3
            r15 = 0
            long r2 = r9 ^ r17
            long r13 = r2 - r13
            long r2 = ~r2
            long r2 = r2 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r13
        L4f:
            r17 = 0
            int r20 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r20 == 0) goto L75
            int r17 = java.lang.Long.numberOfTrailingZeros(r2)
            int r17 = r17 >> 3
            int r17 = r7 + r17
            r17 = r17 & r6
            r20 = r4
            java.lang.Object[] r4 = r0.b
            r4 = r4[r17]
            boolean r4 = defpackage.nb3.k(r4, r1)
            if (r4 == 0) goto L6c
            return r17
        L6c:
            r17 = 1
            long r17 = r2 - r17
            long r2 = r2 & r17
            r4 = r20
            goto L4f
        L75:
            r20 = r4
            long r2 = ~r9
            r4 = 6
            long r2 = r2 << r4
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L293
            int r1 = r0.e(r5)
            int r2 = r0.e
            r8 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto La0
            long[] r2 = r0.a
            int r10 = r1 >> 3
            r17 = r2[r10]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r17 = r17 >> r2
            long r17 = r17 & r8
            r21 = 254(0xfe, double:1.255E-321)
            int r2 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r2 != 0) goto Laa
        La0:
            r27 = r8
            r25 = r11
            r35 = 7
            r23 = 128(0x80, double:6.3E-322)
            goto L25e
        Laa:
            int r1 = r0.c
            if (r1 <= r3) goto L1eb
            int r2 = r0.d
            r10 = r3
            r35 = 7
            long r3 = (long) r2
            r17 = 32
            long r3 = r3 * r17
            long r1 = (long) r1
            r17 = 25
            long r1 = r1 * r17
            r17 = -9223372036854775808
            long r3 = r3 ^ r17
            long r1 = r1 ^ r17
            int r1 = java.lang.Long.compare(r3, r1)
            if (r1 > 0) goto L1e4
            long[] r1 = r0.a
            int r2 = r0.c
            java.lang.Object[] r3 = r0.b
            int r4 = r2 + 7
            int r4 = r4 >> 3
            r6 = r15
            r23 = 128(0x80, double:6.3E-322)
        Ld6:
            if (r6 >= r4) goto Lf5
            r25 = r1[r6]
            r27 = r8
            long r8 = r25 & r13
            r25 = r11
            r12 = r10
            long r10 = ~r8
            long r7 = r8 >>> r35
            long r10 = r10 + r7
            r7 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r7 = r7 & r10
            r1[r6] = r7
            int r6 = r6 + 1
            r10 = r12
            r11 = r25
            r8 = r27
            goto Ld6
        Lf5:
            r27 = r8
            r25 = r11
            r12 = r10
            int r4 = defpackage.fv.H0(r1)
            int r6 = r4 + (-1)
            r7 = r1[r6]
            r9 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r7 = r7 & r9
            r13 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r7 = r7 | r13
            r1[r6] = r7
            r6 = r1[r15]
            r1[r4] = r6
            r4 = r15
        L112:
            if (r4 == r2) goto L1d7
            int r6 = r4 >> 3
            r7 = r1[r6]
            r11 = r4 & 7
            int r11 = r11 << 3
            long r7 = r7 >> r11
            long r7 = r7 & r27
            int r13 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r13 != 0) goto L126
        L123:
            int r4 = r4 + 1
            goto L112
        L126:
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L12b
            goto L123
        L12b:
            r7 = r3[r4]
            if (r7 == 0) goto L134
            int r7 = r7.hashCode()
            goto L135
        L134:
            r7 = r15
        L135:
            int r7 = r7 * r20
            int r8 = r7 << 16
            r7 = r7 ^ r8
            int r8 = r7 >>> 7
            int r13 = r0.e(r8)
            r8 = r8 & r2
            int r14 = r13 - r8
            r14 = r14 & r2
            int r14 = r14 / r12
            int r8 = r4 - r8
            r8 = r8 & r2
            int r8 = r8 / r12
            if (r14 != r8) goto L16a
            r7 = r7 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            r13 = r1[r6]
            r29 = r9
            long r9 = r27 << r11
            long r9 = ~r9
            long r9 = r9 & r13
            long r7 = r7 << r11
            long r7 = r7 | r9
            r1[r6] = r7
            int r6 = r1.length
            int r6 = r6 + (-1)
            r7 = r1[r15]
            long r7 = r7 & r29
            long r7 = r7 | r17
            r1[r6] = r7
            int r4 = r4 + 1
            r9 = r29
            goto L112
        L16a:
            r29 = r9
            int r8 = r13 >> 3
            r9 = r1[r8]
            r14 = r13 & 7
            int r14 = r14 << 3
            long r31 = r9 >> r14
            long r31 = r31 & r27
            int r19 = (r31 > r23 ? 1 : (r31 == r23 ? 0 : -1))
            if (r19 != 0) goto L1a3
            r7 = r7 & 127(0x7f, float:1.78E-43)
            r31 = r12
            r19 = r13
            long r12 = (long) r7
            r32 = r2
            r33 = r3
            long r2 = r27 << r14
            long r2 = ~r2
            long r2 = r2 & r9
            long r9 = r12 << r14
            long r2 = r2 | r9
            r1[r8] = r2
            r2 = r1[r6]
            long r7 = r27 << r11
            long r7 = ~r7
            long r2 = r2 & r7
            long r7 = r23 << r11
            long r2 = r2 | r7
            r1[r6] = r2
            r2 = r33[r4]
            r33[r19] = r2
            r2 = 0
            r33[r4] = r2
            goto L1c0
        L1a3:
            r32 = r2
            r33 = r3
            r31 = r12
            r19 = r13
            r2 = r7 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            long r6 = r27 << r14
            long r6 = ~r6
            long r6 = r6 & r9
            long r2 = r2 << r14
            long r2 = r2 | r6
            r1[r8] = r2
            r2 = r33[r19]
            r3 = r33[r4]
            r33[r19] = r3
            r33[r4] = r2
            int r4 = r4 + (-1)
        L1c0:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r6 = r1[r15]
            long r6 = r6 & r29
            long r6 = r6 | r17
            r1[r2] = r6
            int r4 = r4 + 1
            r9 = r29
            r12 = r31
            r2 = r32
            r3 = r33
            goto L112
        L1d7:
            int r1 = r0.c
            int r1 = defpackage.b66.a(r1)
            int r2 = r0.d
            int r1 = r1 - r2
            r0.e = r1
            goto L25a
        L1e4:
            r27 = r8
            r25 = r11
            r23 = 128(0x80, double:6.3E-322)
            goto L1ee
        L1eb:
            r35 = 7
            goto L1e4
        L1ee:
            int r1 = r0.c
            int r1 = defpackage.b66.b(r1)
            long[] r2 = r0.a
            java.lang.Object[] r3 = r0.b
            int r4 = r0.c
            r0.f(r1)
            long[] r1 = r0.a
            java.lang.Object[] r6 = r0.b
            int r7 = r0.c
            r8 = r15
        L204:
            if (r8 >= r4) goto L25a
            int r9 = r8 >> 3
            r9 = r2[r9]
            r11 = r8 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            long r9 = r9 & r27
            int r9 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r9 >= 0) goto L24f
            r9 = r3[r8]
            if (r9 == 0) goto L21e
            int r10 = r9.hashCode()
            goto L21f
        L21e:
            r10 = r15
        L21f:
            int r10 = r10 * r20
            int r11 = r10 << 16
            r10 = r10 ^ r11
            int r11 = r10 >>> 7
            int r11 = r0.e(r11)
            r10 = r10 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r10
            int r10 = r11 >> 3
            r14 = r11 & 7
            int r14 = r14 << 3
            r17 = r1[r10]
            r21 = r1
            r19 = r2
            long r1 = r27 << r14
            long r1 = ~r1
            long r1 = r17 & r1
            long r12 = r12 << r14
            long r1 = r1 | r12
            r21[r10] = r1
            int r10 = r11 + (-7)
            r10 = r10 & r7
            r12 = r7 & 7
            int r10 = r10 + r12
            int r10 = r10 >> 3
            r21[r10] = r1
            r6[r11] = r9
            goto L253
        L24f:
            r21 = r1
            r19 = r2
        L253:
            int r8 = r8 + 1
            r2 = r19
            r1 = r21
            goto L204
        L25a:
            int r1 = r0.e(r5)
        L25e:
            int r2 = r0.d
            int r2 = r2 + 1
            r0.d = r2
            int r2 = r0.e
            long[] r3 = r0.a
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r27
            int r8 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r8 != 0) goto L27a
            r15 = r16
        L27a:
            int r2 = r2 - r15
            r0.e = r2
            int r0 = r0.c
            long r8 = r27 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r25 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r2 = r1 + (-7)
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r3[r0] = r5
            return r1
        L293:
            r31 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    public final int e(int r10) {
            r9 = this;
            int r0 = r9.c
            r10 = r10 & r0
            r1 = 0
        L4:
            long[] r2 = r9.a
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r2[r3]
            long r5 = r5 >>> r4
            int r3 = r3 + 1
            r7 = r2[r3]
            int r2 = 64 - r4
            long r2 = r7 << r2
            long r7 = (long) r4
            long r7 = -r7
            r4 = 63
            long r7 = r7 >> r4
            long r2 = r2 & r7
            long r2 = r2 | r5
            long r4 = ~r2
            r6 = 7
            long r4 = r4 << r6
            long r2 = r2 & r4
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r4
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L38
            int r9 = java.lang.Long.numberOfTrailingZeros(r2)
            int r9 = r9 >> 3
            int r10 = r10 + r9
            r9 = r10 & r0
            return r9
        L38:
            int r1 = r1 + 8
            int r10 = r10 + r1
            r10 = r10 & r0
            goto L4
    }

    public final boolean equals(java.lang.Object r15) {
            r14 = this;
            r0 = 1
            if (r15 != r14) goto L4
            return r0
        L4:
            boolean r1 = r15 instanceof defpackage.ka4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ka4 r15 = (defpackage.ka4) r15
            int r1 = r15.d
            int r3 = r14.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Object[] r1 = r14.b
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L59
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r10 = r15.c(r10)
            if (r10 != 0) goto L4e
            return r2
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r3) goto L59
            int r4 = r4 + 1
            goto L1d
        L59:
            return r0
    }

    public final void f(int r10) {
            r9 = this;
            r0 = 0
            if (r10 <= 0) goto Ld
            int r10 = defpackage.b66.c(r10)
            r1 = 7
            int r10 = java.lang.Math.max(r1, r10)
            goto Le
        Ld:
            r10 = r0
        Le:
            r9.c = r10
            if (r10 != 0) goto L15
            long[] r0 = defpackage.b66.a
            goto L26
        L15:
            int r1 = r10 + 15
            r1 = r1 & (-8)
            int r1 = r1 >> 3
            long[] r2 = new long[r1]
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.util.Arrays.fill(r2, r0, r1, r3)
            r0 = r2
        L26:
            r9.a = r0
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r2
            long r7 = ~r5
            long r2 = r3 & r7
            long r2 = r2 | r5
            r0[r1] = r2
            int r0 = r9.c
            int r0 = defpackage.b66.a(r0)
            int r1 = r9.d
            int r0 = r0 - r1
            r9.e = r0
            if (r10 != 0) goto L49
            java.lang.Object[] r10 = defpackage.g04.i
            goto L4b
        L49:
            java.lang.Object[] r10 = new java.lang.Object[r10]
        L4b:
            r9.b = r10
            return
    }

    public final boolean g() {
            r0 = this;
            int r0 = r0.d
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean h() {
            r0 = this;
            int r0 = r0.d
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r15 = this;
            int r0 = r15.c
            int r0 = r0 * 31
            int r1 = r15.d
            int r0 = r0 + r1
            java.lang.Object[] r1 = r15.b
            long[] r2 = r15.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = 0
            r5 = r4
        L12:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L4f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            boolean r12 = defpackage.nb3.k(r11, r15)
            if (r12 != 0) goto L4b
            if (r11 == 0) goto L49
            int r11 = r11.hashCode()
            goto L4a
        L49:
            r11 = r4
        L4a:
            int r0 = r0 + r11
        L4b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L4f:
            if (r8 != r9) goto L52
            goto L53
        L52:
            return r0
        L53:
            if (r5 == r3) goto L58
            int r5 = r5 + 1
            goto L12
        L58:
            return r0
    }

    public final void i(java.lang.Object r14) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.nb3.k(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    public final void j(defpackage.ka4 r14) {
            r13 = this;
            r14.getClass()
            java.lang.Object[] r0 = r14.b
            long[] r14 = r14.a
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L46
            r2 = 0
            r3 = r2
        Le:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L41
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L28:
            if (r8 >= r6) goto L3f
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3b
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r13.k(r9)
        L3b:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L28
        L3f:
            if (r6 != r7) goto L46
        L41:
            if (r3 == r1) goto L46
            int r3 = r3 + 1
            goto Le
        L46:
            return
    }

    public final void k(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.d(r2)
            java.lang.Object[] r1 = r1.b
            r1[r0] = r2
            return
    }

    public final boolean l(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.nb3.k(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
    }

    public final void m(int r9) {
            r8 = this;
            int r0 = r8.d
            int r0 = r0 + (-1)
            r8.d = r0
            long[] r0 = r8.a
            int r1 = r8.c
            int r2 = r9 >> 3
            r3 = r9 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r9 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r8 = r8.b
            r0 = 0
            r8[r9] = r0
            return
    }

    public final java.lang.String toString() {
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            java.lang.Object[] r2 = r0.b
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6b
            r5 = 0
            r6 = r5
            r7 = r6
        L18:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L66
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L32:
            if (r12 >= r10) goto L64
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L60
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r0 = "..."
            r1.append(r0)
            goto L70
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            if (r13 != r0) goto L57
            java.lang.String r13 = "(this)"
            goto L5b
        L57:
            java.lang.String r13 = java.lang.String.valueOf(r13)
        L5b:
            r1.append(r13)
            int r7 = r7 + 1
        L60:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L64:
            if (r10 != r11) goto L6b
        L66:
            if (r6 == r4) goto L6b
            int r6 = r6 + 1
            goto L18
        L6b:
            java.lang.String r0 = "]"
            r1.append(r0)
        L70:
            java.lang.String r0 = r1.toString()
            return r0
    }
}
