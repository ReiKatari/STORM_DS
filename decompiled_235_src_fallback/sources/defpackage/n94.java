package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n94  reason: default package */
/* loaded from: classes.dex */
public final class n94 {
    public long[] a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    public int f;

    public /* synthetic */ n94() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public n94(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            r1.a = r0
            int[] r0 = defpackage.p93.a
            r1.b = r0
            r1.c = r0
            if (r2 < 0) goto L17
            int r2 = defpackage.b66.d(r2)
            r1.e(r2)
            return
        L17:
            java.lang.String r1 = "Capacity must be a positive value."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public final void a() {
            r9 = this;
            r0 = 0
            r9.e = r0
            long[] r0 = r9.a
            long[] r1 = defpackage.b66.a
            if (r0 == r1) goto L25
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            defpackage.fv.A0(r0, r1)
            long[] r0 = r9.a
            int r1 = r9.d
            int r2 = r1 >> 3
            r1 = r1 & 7
            int r1 = r1 << 3
            r3 = r0[r2]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r1
            long r7 = ~r5
            long r3 = r3 & r7
            long r3 = r3 | r5
            r0[r2] = r3
        L25:
            int r0 = r9.d
            int r0 = defpackage.b66.a(r0)
            int r1 = r9.e
            int r0 = r0 - r1
            r9.f = r0
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

    public final int c(int r14) {
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.a
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            return r10
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L65
            r13 = -1
            return r13
        L65:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }

    public final int d(int r1) {
            r0 = this;
            int r1 = r0.c(r1)
            if (r1 < 0) goto Lb
            int[] r0 = r0.c
            r0 = r0[r1]
            return r0
        Lb:
            r0 = -1
            return r0
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
            int[] r0 = new int[r10]
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
            boolean r3 = r1 instanceof defpackage.n94
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            n94 r1 = (defpackage.n94) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
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
            int r14 = r1.c(r14)
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

    public final void f(int r38, int r39) {
            r37 = this;
            r0 = r37
            r1 = r38
            int r2 = java.lang.Integer.hashCode(r1)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r4 = r2 << 16
            r2 = r2 ^ r4
            int r4 = r2 >>> 7
            r2 = r2 & 127(0x7f, float:1.78E-43)
            int r5 = r0.d
            r6 = r4 & r5
            r8 = 0
        L18:
            long[] r9 = r0.a
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r15 = r9[r10]
            int r9 = 64 - r11
            long r9 = r15 << r9
            r16 = r8
            r15 = 0
            long r7 = (long) r11
            long r7 = -r7
            r11 = 63
            long r7 = r7 >> r11
            long r7 = r7 & r9
            long r7 = r7 | r12
            long r9 = (long) r2
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r17 = r9 * r11
            r19 = r11
            long r11 = r7 ^ r17
            long r17 = r11 - r19
            long r11 = ~r11
            long r11 = r17 & r11
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r17
        L4d:
            r19 = 0
            int r13 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r13 == 0) goto L6e
            int r13 = java.lang.Long.numberOfTrailingZeros(r11)
            int r13 = r13 >> 3
            int r13 = r13 + r6
            r13 = r13 & r5
            r21 = r3
            int[] r3 = r0.b
            r3 = r3[r13]
            if (r3 != r1) goto L65
            goto L2b3
        L65:
            r19 = 1
            long r19 = r11 - r19
            long r11 = r11 & r19
            r3 = r21
            goto L4d
        L6e:
            r21 = r3
            long r11 = ~r7
            r3 = 6
            long r11 = r11 << r3
            long r7 = r7 & r11
            long r7 = r7 & r17
            int r3 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            r7 = 8
            if (r3 == 0) goto L2bf
            int r2 = r0.b(r4)
            int r3 = r0.f
            r11 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto L9a
            long[] r3 = r0.a
            int r13 = r2 >> 3
            r19 = r3[r13]
            r3 = r2 & 7
            int r3 = r3 << 3
            long r19 = r19 >> r3
            long r19 = r19 & r11
            r22 = 254(0xfe, double:1.255E-321)
            int r3 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r3 != 0) goto La8
        L9a:
            r29 = r9
            r27 = r11
            r18 = r14
            r32 = r15
            r19 = 128(0x80, double:6.3E-322)
            r31 = 7
            goto L27d
        La8:
            int r2 = r0.d
            if (r2 <= r7) goto L207
            int r3 = r0.e
            r19 = 128(0x80, double:6.3E-322)
            long r5 = (long) r3
            r24 = 32
            long r5 = r5 * r24
            long r2 = (long) r2
            r24 = 25
            long r2 = r2 * r24
            r24 = -9223372036854775808
            long r5 = r5 ^ r24
            long r2 = r2 ^ r24
            int r2 = java.lang.Long.compare(r5, r2)
            if (r2 > 0) goto L1fc
            long[] r2 = r0.a
            int r3 = r0.d
            int[] r5 = r0.b
            int[] r6 = r0.c
            int r13 = r3 + 7
            int r13 = r13 >> 3
            r26 = r7
            r7 = r15
        Ld5:
            if (r7 >= r13) goto Lf3
            r27 = r2[r7]
            r29 = r9
            r10 = 7
            long r8 = r27 & r17
            r27 = r11
            r12 = r10
            long r10 = ~r8
            long r8 = r8 >>> r12
            long r10 = r10 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r8 = r8 & r10
            r2[r7] = r8
            int r7 = r7 + 1
            r11 = r27
            r9 = r29
            goto Ld5
        Lf3:
            r29 = r9
            r27 = r11
            r12 = 7
            int r7 = defpackage.fv.H0(r2)
            int r8 = r7 + (-1)
            r9 = r2[r8]
            r16 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r9 = r9 & r16
            r31 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r9 = r9 | r31
            r2[r8] = r9
            r8 = r2[r15]
            r2[r7] = r8
            r7 = r15
        L112:
            if (r7 == r3) goto L1e9
            int r8 = r7 >> 3
            r9 = r2[r8]
            r11 = r7 & 7
            int r11 = r11 << 3
            long r9 = r9 >> r11
            long r9 = r9 & r27
            int r13 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r13 != 0) goto L126
        L123:
            int r7 = r7 + 1
            goto L112
        L126:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L12b
            goto L123
        L12b:
            r9 = r5[r7]
            int r9 = java.lang.Integer.hashCode(r9)
            int r9 = r9 * r21
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r13 = r0.b(r10)
            r10 = r10 & r3
            int r18 = r13 - r10
            r18 = r18 & r3
            r31 = r12
            int r12 = r18 / 8
            int r10 = r7 - r10
            r10 = r10 & r3
            int r10 = r10 / 8
            if (r12 != r10) goto L171
            r9 = r9 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r12 = r2[r8]
            r18 = r14
            r32 = r15
            long r14 = r27 << r11
            long r14 = ~r14
            long r12 = r12 & r14
            long r9 = r9 << r11
            long r9 = r9 | r12
            r2[r8] = r9
            int r8 = r2.length
            int r8 = r8 + (-1)
            r9 = r2[r32]
            long r9 = r9 & r16
            long r9 = r9 | r24
            r2[r8] = r9
            int r7 = r7 + 1
            r14 = r18
            r12 = r31
            r15 = r32
            goto L112
        L171:
            r18 = r14
            r32 = r15
            int r10 = r13 >> 3
            r14 = r2[r10]
            r12 = r13 & 7
            int r12 = r12 << 3
            long r33 = r14 >> r12
            long r33 = r33 & r27
            int r33 = (r33 > r19 ? 1 : (r33 == r19 ? 0 : -1))
            if (r33 != 0) goto L1af
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r33 = r5
            r34 = r6
            long r5 = (long) r9
            r35 = r5
            long r5 = r27 << r12
            long r5 = ~r5
            long r5 = r5 & r14
            long r14 = r35 << r12
            long r5 = r5 | r14
            r2[r10] = r5
            r5 = r2[r8]
            long r9 = r27 << r11
            long r9 = ~r9
            long r5 = r5 & r9
            long r9 = r19 << r11
            long r5 = r5 | r9
            r2[r8] = r5
            r5 = r33[r7]
            r33[r13] = r5
            r33[r7] = r32
            r5 = r34[r7]
            r34[r13] = r5
            r34[r7] = r32
            goto L1d0
        L1af:
            r33 = r5
            r34 = r6
            r5 = r9 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            long r8 = r27 << r12
            long r8 = ~r8
            long r8 = r8 & r14
            long r5 = r5 << r12
            long r5 = r5 | r8
            r2[r10] = r5
            r5 = r33[r13]
            r6 = r33[r7]
            r33[r13] = r6
            r33[r7] = r5
            r5 = r34[r13]
            r6 = r34[r7]
            r34[r13] = r6
            r34[r7] = r5
            int r7 = r7 + (-1)
        L1d0:
            int r5 = r2.length
            int r5 = r5 + (-1)
            r8 = r2[r32]
            long r8 = r8 & r16
            long r8 = r8 | r24
            r2[r5] = r8
            int r7 = r7 + 1
            r14 = r18
            r12 = r31
            r15 = r32
            r5 = r33
            r6 = r34
            goto L112
        L1e9:
            r31 = r12
            r18 = r14
            r32 = r15
            int r2 = r0.d
            int r2 = defpackage.b66.a(r2)
            int r3 = r0.e
            int r2 = r2 - r3
            r0.f = r2
            goto L279
        L1fc:
            r29 = r9
            r27 = r11
            r18 = r14
            r32 = r15
            r31 = 7
            goto L20a
        L207:
            r19 = 128(0x80, double:6.3E-322)
            goto L1fc
        L20a:
            int r2 = r0.d
            int r2 = defpackage.b66.b(r2)
            long[] r3 = r0.a
            int[] r5 = r0.b
            int[] r6 = r0.c
            int r7 = r0.d
            r0.e(r2)
            long[] r2 = r0.a
            int[] r8 = r0.b
            int[] r9 = r0.c
            int r10 = r0.d
            r11 = r32
        L225:
            if (r11 >= r7) goto L279
            int r12 = r11 >> 3
            r12 = r3[r12]
            r14 = r11 & 7
            int r14 = r14 << 3
            long r12 = r12 >> r14
            long r12 = r12 & r27
            int r12 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r12 >= 0) goto L272
            r12 = r5[r11]
            int r13 = java.lang.Integer.hashCode(r12)
            int r13 = r13 * r21
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.b(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r15 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r16 = r14 & 7
            int r16 = r16 << 3
            r22 = r15[r13]
            r24 = r1
            long r1 = r27 << r16
            long r1 = ~r1
            long r1 = r22 & r1
            long r16 = r24 << r16
            long r1 = r1 | r16
            r15[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r10
            r16 = r10 & 7
            int r13 = r13 + r16
            int r13 = r13 >> 3
            r15[r13] = r1
            r8[r14] = r12
            r1 = r6[r11]
            r9[r14] = r1
            goto L273
        L272:
            r15 = r2
        L273:
            int r11 = r11 + 1
            r1 = r38
            r2 = r15
            goto L225
        L279:
            int r2 = r0.b(r4)
        L27d:
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
            long r8 = r8 & r27
            int r8 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r8 != 0) goto L299
            r32 = r18
        L299:
            int r1 = r1 - r32
            r0.f = r1
            int r1 = r0.d
            long r8 = r27 << r7
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
            int r13 = ~r2
        L2b3:
            if (r13 >= 0) goto L2b6
            int r13 = ~r13
        L2b6:
            int[] r1 = r0.b
            r1[r13] = r38
            int[] r0 = r0.c
            r0[r13] = r39
            return
        L2bf:
            r26 = r7
            r32 = r15
            int r8 = r16 + 8
            int r6 = r6 + r8
            r6 = r6 & r5
            r1 = r38
            r3 = r21
            goto L18
    }

    public final int hashCode() {
            r15 = this;
            int[] r0 = r15.b
            int[] r1 = r15.c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L52
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
            if (r8 == 0) goto L4c
            int r8 = r4 - r2
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r3
        L28:
            if (r10 >= r8) goto L48
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L44
            int r11 = r4 << 3
            int r11 = r11 + r10
            r12 = r0[r11]
            r11 = r1[r11]
            int r12 = java.lang.Integer.hashCode(r12)
            int r11 = java.lang.Integer.hashCode(r11)
            r11 = r11 ^ r12
            int r5 = r5 + r11
        L44:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L28
        L48:
            if (r8 != r9) goto L4b
            goto L4c
        L4b:
            return r5
        L4c:
            if (r4 == r2) goto L51
            int r4 = r4 + 1
            goto Le
        L51:
            return r5
        L52:
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
            int[] r2 = r0.b
            int[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
