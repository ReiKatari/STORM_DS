package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x94  reason: default package */
/* loaded from: classes.dex */
public final class x94 {
    public long[] a;
    public java.lang.Object[] b;
    public float[] c;
    public int d;
    public int e;
    public int f;

    public x94(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            r1.a = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.b = r0
            float[] r0 = defpackage.ce2.a
            r1.c = r0
            if (r2 < 0) goto L19
            int r2 = defpackage.b66.d(r2)
            r1.c(r2)
            return
        L19:
            java.lang.String r1 = "Capacity must be a positive value."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public final int a(int r10) {
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

    public final int b(java.lang.Object r14) {
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

    public final void c(int r10) {
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
            float[] r10 = new float[r10]
            r9.c = r10
            return
    }

    public final void d(java.lang.String r38, float r39) {
            r37 = this;
            r0 = r37
            r1 = r38
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
            if (r20 == 0) goto L78
            int r17 = java.lang.Long.numberOfTrailingZeros(r2)
            int r17 = r17 >> 3
            int r17 = r7 + r17
            r17 = r17 & r6
            r20 = r4
            java.lang.Object[] r4 = r0.b
            r4 = r4[r17]
            boolean r4 = defpackage.nb3.k(r4, r1)
            if (r4 == 0) goto L6f
            r1 = r17
            goto L2b6
        L6f:
            r17 = 1
            long r17 = r2 - r17
            long r2 = r2 & r17
            r4 = r20
            goto L4f
        L78:
            r20 = r4
            long r2 = ~r9
            r4 = 6
            long r2 = r2 << r4
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L2c2
            int r2 = r0.a(r5)
            int r4 = r0.f
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto La3
            long[] r4 = r0.a
            int r17 = r2 >> 3
            r17 = r4[r17]
            r4 = r2 & 7
            int r4 = r4 << 3
            long r17 = r17 >> r4
            long r17 = r17 & r8
            r21 = 254(0xfe, double:1.255E-321)
            int r4 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r4 != 0) goto Lad
        La3:
            r25 = r8
            r29 = r11
            r18 = 128(0x80, double:6.3E-322)
            r31 = 7
            goto L281
        Lad:
            int r2 = r0.d
            if (r2 <= r3) goto L205
            int r4 = r0.e
            r17 = r3
            long r3 = (long) r4
            r18 = 32
            long r3 = r3 * r18
            r18 = 128(0x80, double:6.3E-322)
            long r6 = (long) r2
            r23 = 25
            long r6 = r6 * r23
            r23 = -9223372036854775808
            long r2 = r3 ^ r23
            long r6 = r6 ^ r23
            int r2 = java.lang.Long.compare(r2, r6)
            if (r2 > 0) goto L1fe
            long[] r2 = r0.a
            int r3 = r0.d
            java.lang.Object[] r4 = r0.b
            float[] r6 = r0.c
            int r7 = r3 + 7
            int r7 = r7 >> 3
            r25 = r8
            r8 = r15
        Ldc:
            if (r8 >= r7) goto Lfa
            r27 = r2[r8]
            r29 = r11
            r9 = 7
            long r10 = r27 & r13
            long r13 = ~r10
            long r10 = r10 >>> r9
            long r13 = r13 + r10
            r10 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r10 = r10 & r13
            r2[r8] = r10
            int r8 = r8 + 1
            r11 = r29
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto Ldc
        Lfa:
            r29 = r11
            r9 = 7
            int r7 = defpackage.fv.H0(r2)
            int r8 = r7 + (-1)
            r10 = r2[r8]
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r10 = r10 & r12
            r27 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r10 = r10 | r27
            r2[r8] = r10
            r10 = r2[r15]
            r2[r7] = r10
            r7 = r15
        L116:
            if (r7 == r3) goto L1ef
            int r8 = r7 >> 3
            r10 = r2[r8]
            r14 = r7 & 7
            int r14 = r14 << 3
            long r10 = r10 >> r14
            long r10 = r10 & r25
            int r27 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r27 != 0) goto L12a
        L127:
            int r7 = r7 + 1
            goto L116
        L12a:
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 == 0) goto L12f
            goto L127
        L12f:
            r10 = r4[r7]
            if (r10 == 0) goto L138
            int r10 = r10.hashCode()
            goto L139
        L138:
            r10 = r15
        L139:
            int r10 = r10 * r20
            int r11 = r10 << 16
            r10 = r10 ^ r11
            int r11 = r10 >>> 7
            int r27 = r0.a(r11)
            r11 = r11 & r3
            int r28 = r27 - r11
            r28 = r28 & r3
            r31 = r9
            int r9 = r28 / 8
            int r11 = r7 - r11
            r11 = r11 & r3
            int r11 = r11 / 8
            if (r9 != r11) goto L176
            r9 = r10 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r27 = r2[r8]
            r32 = r12
            long r12 = r25 << r14
            long r11 = ~r12
            long r11 = r27 & r11
            long r9 = r9 << r14
            long r9 = r9 | r11
            r2[r8] = r9
            int r8 = r2.length
            int r8 = r8 + (-1)
            r9 = r2[r15]
            long r9 = r9 & r32
            long r9 = r9 | r23
            r2[r8] = r9
            int r7 = r7 + 1
            r9 = r31
            r12 = r32
            goto L116
        L176:
            r32 = r12
            int r9 = r27 >> 3
            r11 = r2[r9]
            r13 = r27 & 7
            int r13 = r13 << 3
            long r34 = r11 >> r13
            long r34 = r34 & r25
            int r28 = (r34 > r18 ? 1 : (r34 == r18 ? 0 : -1))
            if (r28 != 0) goto L1b4
            r10 = r10 & 127(0x7f, float:1.78E-43)
            r28 = r3
            r34 = r4
            long r3 = (long) r10
            r35 = r3
            long r3 = r25 << r13
            long r3 = ~r3
            long r3 = r3 & r11
            long r10 = r35 << r13
            long r3 = r3 | r10
            r2[r9] = r3
            r3 = r2[r8]
            long r9 = r25 << r14
            long r9 = ~r9
            long r3 = r3 & r9
            long r9 = r18 << r14
            long r3 = r3 | r9
            r2[r8] = r3
            r3 = r34[r7]
            r34[r27] = r3
            r3 = 0
            r34[r7] = r3
            r3 = r6[r7]
            r6[r27] = r3
            r3 = 0
            r6[r7] = r3
            goto L1d8
        L1b4:
            r28 = r3
            r34 = r4
            r3 = r10 & 127(0x7f, float:1.78E-43)
            long r3 = (long) r3
            r35 = r3
            long r3 = r25 << r13
            long r3 = ~r3
            long r3 = r3 & r11
            long r10 = r35 << r13
            long r3 = r3 | r10
            r2[r9] = r3
            r3 = r34[r27]
            r4 = r34[r7]
            r34[r27] = r4
            r34[r7] = r3
            r3 = r6[r27]
            r4 = r6[r7]
            r6[r27] = r4
            r6[r7] = r3
            int r7 = r7 + (-1)
        L1d8:
            int r3 = r2.length
            int r3 = r3 + (-1)
            r8 = r2[r15]
            long r8 = r8 & r32
            long r8 = r8 | r23
            r2[r3] = r8
            int r7 = r7 + 1
            r3 = r28
            r9 = r31
            r12 = r32
            r4 = r34
            goto L116
        L1ef:
            r31 = r9
            int r2 = r0.d
            int r2 = defpackage.b66.a(r2)
            int r3 = r0.e
            int r2 = r2 - r3
            r0.f = r2
            goto L27d
        L1fe:
            r25 = r8
            r29 = r11
            r31 = 7
            goto L208
        L205:
            r18 = 128(0x80, double:6.3E-322)
            goto L1fe
        L208:
            int r2 = r0.d
            int r2 = defpackage.b66.b(r2)
            long[] r3 = r0.a
            java.lang.Object[] r4 = r0.b
            float[] r6 = r0.c
            int r7 = r0.d
            r0.c(r2)
            long[] r2 = r0.a
            java.lang.Object[] r8 = r0.b
            float[] r9 = r0.c
            int r10 = r0.d
            r11 = r15
        L222:
            if (r11 >= r7) goto L27d
            int r12 = r11 >> 3
            r12 = r3[r12]
            r14 = r11 & 7
            int r14 = r14 << 3
            long r12 = r12 >> r14
            long r12 = r12 & r25
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 >= 0) goto L274
            r12 = r4[r11]
            if (r12 == 0) goto L23c
            int r13 = r12.hashCode()
            goto L23d
        L23c:
            r13 = r15
        L23d:
            int r13 = r13 * r20
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.a(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r17 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r21 = r14 & 7
            int r21 = r21 << 3
            r22 = r17[r13]
            r27 = r1
            long r1 = r25 << r21
            long r1 = ~r1
            long r1 = r22 & r1
            long r21 = r27 << r21
            long r1 = r1 | r21
            r17[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r10
            r21 = r10 & 7
            int r13 = r13 + r21
            int r13 = r13 >> 3
            r17[r13] = r1
            r8[r14] = r12
            r1 = r6[r11]
            r9[r14] = r1
            goto L276
        L274:
            r17 = r2
        L276:
            int r11 = r11 + 1
            r1 = r38
            r2 = r17
            goto L222
        L27d:
            int r2 = r0.a(r5)
        L281:
            int r1 = r0.e
            int r1 = r1 + 1
            r0.e = r1
            int r1 = r0.f
            long[] r3 = r0.a
            int r4 = r2 >> 3
            r5 = r3[r4]
            r7 = r2 & 7
            int r7 = r7 << 3
            long r8 = r5 >> r7
            long r8 = r8 & r25
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 != 0) goto L29d
            r15 = r16
        L29d:
            int r1 = r1 - r15
            r0.f = r1
            int r1 = r0.d
            long r8 = r25 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r29 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r4 = r2 + (-7)
            r4 = r4 & r1
            r1 = r1 & 7
            int r4 = r4 + r1
            int r1 = r4 >> 3
            r3[r1] = r5
            int r1 = ~r2
        L2b6:
            if (r1 >= 0) goto L2b9
            int r1 = ~r1
        L2b9:
            java.lang.Object[] r2 = r0.b
            r2[r1] = r38
            float[] r0 = r0.c
            r0[r1] = r39
            return
        L2c2:
            r17 = r3
            int r8 = r8 + 8
            int r7 = r7 + r8
            r7 = r7 & r6
            r1 = r38
            r3 = r19
            r4 = r20
            goto L1c
    }

    public final boolean equals(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.x94
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x94 r1 = (defpackage.x94) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.b
            float[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L6a
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
            if (r10 == 0) goto L65
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r14 = r1.b(r14)
            if (r14 < 0) goto L5e
            float[] r15 = r1.c
            r14 = r15[r14]
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L5e
            goto L5f
        L5e:
            return r4
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r6) goto L6a
            int r7 = r7 + 1
            goto L23
        L6a:
            return r2
    }

    public final int hashCode() {
            r15 = this;
            java.lang.Object[] r0 = r15.b
            float[] r1 = r15.c
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
            int r11 = java.lang.Float.hashCode(r11)
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
            float[] r3 = r0.c
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
