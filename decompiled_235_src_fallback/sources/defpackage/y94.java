package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y94  reason: default package */
/* loaded from: classes.dex */
public final class y94 {
    public long[] a;
    public java.lang.Object[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public /* synthetic */ y94() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public y94(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            r1.a = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.b = r0
            int[] r0 = defpackage.p93.a
            r1.c = r0
            if (r2 < 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L1e
            int r2 = defpackage.b66.d(r2)
            r1.e(r2)
            return
        L1e:
            java.lang.String r1 = "Capacity must be a positive value."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public final void a() {
            r10 = this;
            r0 = 0
            r10.e = r0
            long[] r1 = r10.a
            long[] r2 = defpackage.b66.a
            if (r1 == r2) goto L25
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            defpackage.fv.A0(r1, r2)
            long[] r1 = r10.a
            int r2 = r10.d
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
            int r3 = r10.d
            defpackage.fv.z0(r0, r3, r2, r1)
            int r0 = r10.d
            int r0 = defpackage.b66.a(r0)
            int r1 = r10.e
            int r0 = r0 - r1
            r10.f = r0
            return
    }

    public final int b(int r10) {
            r9 = this;
            int r0 = r9.d
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

    public final int c(java.lang.Object r36) {
            r35 = this;
            r0 = r35
            r1 = r36
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
            int r6 = r0.d
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
            if (r2 == 0) goto L2b0
            int r1 = r0.b(r5)
            int r2 = r0.f
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
            r36 = 7
            r23 = 128(0x80, double:6.3E-322)
            goto L27a
        Laa:
            int r1 = r0.d
            if (r1 <= r3) goto L1fd
            int r2 = r0.e
            r10 = r3
            r36 = 7
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
            if (r1 > 0) goto L1f6
            long[] r1 = r0.a
            int r2 = r0.d
            java.lang.Object[] r3 = r0.b
            int[] r4 = r0.c
            int r19 = r2 + 7
            r23 = 128(0x80, double:6.3E-322)
            int r6 = r19 >> 3
            r7 = r15
        Ld8:
            if (r7 >= r6) goto Lf7
            r25 = r1[r7]
            r27 = r8
            long r8 = r25 & r13
            r25 = r11
            r12 = r10
            long r10 = ~r8
            long r8 = r8 >>> r36
            long r10 = r10 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r10
            r1[r7] = r8
            int r7 = r7 + 1
            r10 = r12
            r11 = r25
            r8 = r27
            goto Ld8
        Lf7:
            r27 = r8
            r25 = r11
            r12 = r10
            int r6 = defpackage.fv.H0(r1)
            int r7 = r6 + (-1)
            r8 = r1[r7]
            r10 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r8 = r8 & r10
            r13 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r8 | r13
            r1[r7] = r8
            r7 = r1[r15]
            r1[r6] = r7
            r6 = r15
        L114:
            if (r6 == r2) goto L1e9
            int r7 = r6 >> 3
            r8 = r1[r7]
            r13 = r6 & 7
            int r13 = r13 << 3
            long r8 = r8 >> r13
            long r8 = r8 & r27
            int r14 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r14 != 0) goto L128
        L125:
            int r6 = r6 + 1
            goto L114
        L128:
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L12d
            goto L125
        L12d:
            r8 = r3[r6]
            if (r8 == 0) goto L136
            int r8 = r8.hashCode()
            goto L137
        L136:
            r8 = r15
        L137:
            int r8 = r8 * r20
            int r9 = r8 << 16
            r8 = r8 ^ r9
            int r9 = r8 >>> 7
            int r14 = r0.b(r9)
            r9 = r9 & r2
            int r19 = r14 - r9
            r19 = r19 & r2
            r29 = r10
            int r10 = r19 / 8
            int r9 = r6 - r9
            r9 = r9 & r2
            int r9 = r9 / r12
            if (r10 != r9) goto L175
            r8 = r8 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r10 = r1[r7]
            r31 = r12
            r19 = r13
            long r12 = r27 << r19
            long r12 = ~r12
            long r10 = r10 & r12
            long r8 = r8 << r19
            long r8 = r8 | r10
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 + (-1)
            r8 = r1[r15]
            long r8 = r8 & r29
            long r8 = r8 | r17
            r1[r7] = r8
            int r6 = r6 + 1
            r10 = r29
            r12 = r31
            goto L114
        L175:
            r31 = r12
            r19 = r13
            int r9 = r14 >> 3
            r10 = r1[r9]
            r12 = r14 & 7
            int r12 = r12 << 3
            long r32 = r10 >> r12
            long r32 = r32 & r27
            int r13 = (r32 > r23 ? 1 : (r32 == r23 ? 0 : -1))
            if (r13 != 0) goto L1b3
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r13 = r2
            r32 = r3
            long r2 = (long) r8
            r33 = r2
            long r2 = r27 << r12
            long r2 = ~r2
            long r2 = r2 & r10
            long r10 = r33 << r12
            long r2 = r2 | r10
            r1[r9] = r2
            r2 = r1[r7]
            long r8 = r27 << r19
            long r8 = ~r8
            long r2 = r2 & r8
            long r8 = r23 << r19
            long r2 = r2 | r8
            r1[r7] = r2
            r2 = r32[r6]
            r32[r14] = r2
            r2 = 0
            r32[r6] = r2
            r2 = r4[r6]
            r4[r14] = r2
            r4[r6] = r15
            goto L1d3
        L1b3:
            r13 = r2
            r32 = r3
            r2 = r8 & 127(0x7f, float:1.78E-43)
            long r2 = (long) r2
            long r7 = r27 << r12
            long r7 = ~r7
            long r7 = r7 & r10
            long r2 = r2 << r12
            long r2 = r2 | r7
            r1[r9] = r2
            r2 = r32[r14]
            r3 = r32[r6]
            r32[r14] = r3
            r32[r6] = r2
            r2 = r4[r14]
            r3 = r4[r6]
            r4[r14] = r3
            r4[r6] = r2
            int r6 = r6 + (-1)
        L1d3:
            int r2 = r1.length
            int r2 = r2 + (-1)
            r7 = r1[r15]
            long r7 = r7 & r29
            long r7 = r7 | r17
            r1[r2] = r7
            int r6 = r6 + 1
            r2 = r13
            r10 = r29
            r12 = r31
            r3 = r32
            goto L114
        L1e9:
            int r1 = r0.d
            int r1 = defpackage.b66.a(r1)
            int r2 = r0.e
            int r1 = r1 - r2
            r0.f = r1
            goto L276
        L1f6:
            r27 = r8
            r25 = r11
            r23 = 128(0x80, double:6.3E-322)
            goto L200
        L1fd:
            r36 = 7
            goto L1f6
        L200:
            int r1 = r0.d
            int r1 = defpackage.b66.b(r1)
            long[] r2 = r0.a
            java.lang.Object[] r3 = r0.b
            int[] r4 = r0.c
            int r6 = r0.d
            r0.e(r1)
            long[] r1 = r0.a
            java.lang.Object[] r7 = r0.b
            int[] r8 = r0.c
            int r9 = r0.d
            r10 = r15
        L21a:
            if (r10 >= r6) goto L276
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r27
            int r11 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r11 >= 0) goto L26d
            r11 = r3[r10]
            if (r11 == 0) goto L234
            int r12 = r11.hashCode()
            goto L235
        L234:
            r12 = r15
        L235:
            int r12 = r12 * r20
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r13 = r0.b(r13)
            r12 = r12 & 127(0x7f, float:1.78E-43)
            r17 = r1
            r14 = r2
            long r1 = (long) r12
            int r12 = r13 >> 3
            r18 = r13 & 7
            int r18 = r18 << 3
            r21 = r17[r12]
            r29 = r1
            long r1 = r27 << r18
            long r1 = ~r1
            long r1 = r21 & r1
            long r18 = r29 << r18
            long r1 = r1 | r18
            r17[r12] = r1
            int r12 = r13 + (-7)
            r12 = r12 & r9
            r18 = r9 & 7
            int r12 = r12 + r18
            int r12 = r12 >> 3
            r17[r12] = r1
            r7[r13] = r11
            r1 = r4[r10]
            r8[r13] = r1
            goto L270
        L26d:
            r17 = r1
            r14 = r2
        L270:
            int r10 = r10 + 1
            r2 = r14
            r1 = r17
            goto L21a
        L276:
            int r1 = r0.b(r5)
        L27a:
            int r2 = r0.e
            int r2 = r2 + 1
            r0.e = r2
            int r2 = r0.f
            long[] r3 = r0.a
            int r4 = r1 >> 3
            r5 = r3[r4]
            r7 = r1 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r27
            int r8 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r8 != 0) goto L296
            r15 = r16
        L296:
            int r2 = r2 - r15
            r0.f = r2
            int r0 = r0.d
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
            int r0 = ~r1
            return r0
        L2b0:
            r31 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r3 = r19
            r4 = r20
            goto L1c
    }

    public final int d(java.lang.Object r14) {
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
            int r3 = r13.d
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
            return r10
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
            if (r4 == 0) goto L6d
            r13 = -1
            return r13
        L6d:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
    }

    public final void e(int r10) {
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
            r9.d = r10
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
            int r0 = r9.d
            int r0 = defpackage.b66.a(r0)
            int r1 = r9.e
            int r0 = r0 - r1
            r9.f = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r9.b = r0
            int[] r10 = new int[r10]
            r9.c = r10
            return
    }

    public final boolean equals(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.y94
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            y94 r1 = (defpackage.y94) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
            int[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L67
            r7 = r4
        L23:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r14 = r1.d(r14)
            if (r14 < 0) goto L5b
            int[] r15 = r1.c
            r14 = r15[r14]
            if (r13 == r14) goto L5c
        L5b:
            return r4
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r6) goto L67
            int r7 = r7 + 1
            goto L23
        L67:
            return r2
    }

    public final void f(int r9) {
            r8 = this;
            int r0 = r8.e
            int r0 = r0 + (-1)
            r8.e = r0
            long[] r0 = r8.a
            int r1 = r8.d
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

    public final void g(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.c(r4)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            java.lang.Object[] r1 = r2.b
            r1[r0] = r4
            int[] r2 = r2.c
            r2[r0] = r3
            return
    }

    public final int hashCode() {
            r15 = this;
            java.lang.Object[] r0 = r15.b
            int[] r1 = r15.c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L56
            r4 = r3
            r5 = r4
        Le:
            r6 = r15[r4]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L50
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L28:
            if (r10 >= r8) goto L4c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L48
            int r11 = r4 << 3
            int r11 = r11 + r10
            r12 = r0[r11]
            r11 = r1[r11]
            if (r12 == 0) goto L41
            int r12 = r12.hashCode()
            goto L42
        L41:
            r12 = r3
        L42:
            int r11 = java.lang.Integer.hashCode(r11)
            r11 = r11 ^ r12
            int r5 = r5 + r11
        L48:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L28
        L4c:
            if (r8 != r9) goto L4f
            goto L50
        L4f:
            return r5
        L50:
            if (r4 == r2) goto L55
            int r4 = r4 + 1
            goto Le
        L55:
            return r5
        L56:
            return r3
    }

    public final java.lang.String toString() {
            r18 = this;
            r0 = r18
            int r1 = r0.e
            if (r1 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.b
            int[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
