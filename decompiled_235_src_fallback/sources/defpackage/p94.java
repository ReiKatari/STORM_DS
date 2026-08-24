package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p94  reason: default package */
/* loaded from: classes.dex */
public final class p94 extends defpackage.g93 {
    public int f;

    public /* synthetic */ p94() {
            r1 = this;
            r0 = 6
            r1.<init>(r0)
            return
    }

    public p94(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            r1.a = r0
            int[] r0 = defpackage.p93.a
            r1.b = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.c = r0
            if (r2 < 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L1e
            int r2 = defpackage.b66.d(r2)
            r1.f(r2)
            return
        L1e:
            java.lang.String r1 = "Capacity must be a positive value."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public final void c() {
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
            java.lang.Object[] r1 = r10.c
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

    public final int d(int r36) {
            r35 = this;
            r0 = r35
            int r1 = java.lang.Integer.hashCode(r36)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0.d
            r5 = r3 & r4
            r7 = 0
        L16:
            long[] r8 = r0.a
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r1
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r10 * r14
            r18 = r7
            r12 = 0
            long r6 = r8 ^ r16
            long r14 = r6 - r14
            long r6 = ~r6
            long r6 = r6 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r14
        L47:
            r16 = 0
            int r19 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r19 == 0) goto L6f
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            r19 = r2
            int[] r2 = r0.b
            r2 = r2[r16]
            r20 = r12
            r12 = r36
            if (r2 != r12) goto L64
            return r16
        L64:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            r2 = r19
            r12 = r20
            goto L47
        L6f:
            r19 = r2
            r20 = r12
            r12 = r36
            long r6 = ~r8
            r2 = 6
            long r6 = r6 << r2
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r6 = 8
            if (r2 == 0) goto L2ae
            int r1 = r0.e(r3)
            int r2 = r0.f
            r7 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L9e
            long[] r2 = r0.a
            int r12 = r1 >> 3
            r16 = r2[r12]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r16 = r16 >> r2
            long r16 = r16 & r7
            r21 = 254(0xfe, double:1.255E-321)
            int r2 = (r16 > r21 ? 1 : (r16 == r21 ? 0 : -1))
            if (r2 != 0) goto Laa
        L9e:
            r28 = r7
            r26 = r10
            r32 = r13
            r36 = 7
            r16 = 128(0x80, double:6.3E-322)
            goto L277
        Laa:
            int r1 = r0.d
            if (r1 <= r6) goto L1fe
            int r2 = r0.e
            r16 = 128(0x80, double:6.3E-322)
            long r4 = (long) r2
            r23 = 32
            long r4 = r4 * r23
            long r1 = (long) r1
            r23 = 25
            long r1 = r1 * r23
            r23 = -9223372036854775808
            long r4 = r4 ^ r23
            long r1 = r1 ^ r23
            int r1 = java.lang.Long.compare(r4, r1)
            if (r1 > 0) goto L1f5
            long[] r1 = r0.a
            int r2 = r0.d
            int[] r4 = r0.b
            java.lang.Object[] r5 = r0.c
            int r12 = r2 + 7
            int r12 = r12 >> 3
            r25 = r6
            r6 = r20
        Ld8:
            if (r6 >= r12) goto Lf7
            r26 = r1[r6]
            r28 = r7
            long r7 = r26 & r14
            r26 = r10
            r36 = 7
            long r9 = ~r7
            long r7 = r7 >>> r36
            long r9 = r9 + r7
            r7 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r7 = r7 & r9
            r1[r6] = r7
            int r6 = r6 + 1
            r10 = r26
            r7 = r28
            goto Ld8
        Lf7:
            r28 = r7
            r26 = r10
            r36 = 7
            int r6 = defpackage.fv.H0(r1)
            int r7 = r6 + (-1)
            r8 = r1[r7]
            r10 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r8 = r8 & r10
            r14 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r8 | r14
            r1[r7] = r8
            r7 = r1[r20]
            r1[r6] = r7
            r6 = r20
        L116:
            if (r6 == r2) goto L1e6
            int r7 = r6 >> 3
            r8 = r1[r7]
            r12 = r6 & 7
            int r12 = r12 << 3
            long r8 = r8 >> r12
            long r8 = r8 & r28
            int r14 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r14 != 0) goto L12a
        L127:
            int r6 = r6 + 1
            goto L116
        L12a:
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L12f
            goto L127
        L12f:
            r8 = r4[r6]
            int r8 = java.lang.Integer.hashCode(r8)
            int r8 = r8 * r19
            int r9 = r8 << 16
            r8 = r8 ^ r9
            int r9 = r8 >>> 7
            int r14 = r0.e(r9)
            r9 = r9 & r2
            int r15 = r14 - r9
            r15 = r15 & r2
            int r15 = r15 / 8
            int r9 = r6 - r9
            r9 = r9 & r2
            int r9 = r9 / 8
            if (r15 != r9) goto L16b
            r8 = r8 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r14 = r1[r7]
            r30 = r10
            long r10 = r28 << r12
            long r10 = ~r10
            long r10 = r10 & r14
            long r8 = r8 << r12
            long r8 = r8 | r10
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 - r13
            r8 = r1[r20]
            long r8 = r8 & r30
            long r8 = r8 | r23
            r1[r7] = r8
            int r6 = r6 + 1
            r10 = r30
            goto L116
        L16b:
            r30 = r10
            int r9 = r14 >> 3
            r10 = r1[r9]
            r15 = r14 & 7
            int r15 = r15 << 3
            long r32 = r10 >> r15
            long r32 = r32 & r28
            int r18 = (r32 > r16 ? 1 : (r32 == r16 ? 0 : -1))
            if (r18 != 0) goto L1aa
            r8 = r8 & 127(0x7f, float:1.78E-43)
            r32 = r13
            r18 = r14
            long r13 = (long) r8
            r33 = r4
            r34 = r5
            long r4 = r28 << r15
            long r4 = ~r4
            long r4 = r4 & r10
            long r10 = r13 << r15
            long r4 = r4 | r10
            r1[r9] = r4
            r4 = r1[r7]
            long r8 = r28 << r12
            long r8 = ~r8
            long r4 = r4 & r8
            long r8 = r16 << r12
            long r4 = r4 | r8
            r1[r7] = r4
            r4 = r33[r6]
            r33[r18] = r4
            r33[r6] = r20
            r4 = r34[r6]
            r34[r18] = r4
            r4 = 0
            r34[r6] = r4
            goto L1cf
        L1aa:
            r33 = r4
            r34 = r5
            r32 = r13
            r18 = r14
            r4 = r8 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r7 = r28 << r15
            long r7 = ~r7
            long r7 = r7 & r10
            long r4 = r4 << r15
            long r4 = r4 | r7
            r1[r9] = r4
            r4 = r33[r18]
            r5 = r33[r6]
            r33[r18] = r5
            r33[r6] = r4
            r4 = r34[r18]
            r5 = r34[r6]
            r34[r18] = r5
            r34[r6] = r4
            int r6 = r6 + (-1)
        L1cf:
            int r4 = r1.length
            int r4 = r4 + (-1)
            r7 = r1[r20]
            long r7 = r7 & r30
            long r7 = r7 | r23
            r1[r4] = r7
            int r6 = r6 + 1
            r10 = r30
            r13 = r32
            r4 = r33
            r5 = r34
            goto L116
        L1e6:
            r32 = r13
            int r1 = r0.d
            int r1 = defpackage.b66.a(r1)
            int r2 = r0.e
            int r1 = r1 - r2
            r0.f = r1
            goto L273
        L1f5:
            r28 = r7
            r26 = r10
            r32 = r13
            r36 = 7
            goto L201
        L1fe:
            r16 = 128(0x80, double:6.3E-322)
            goto L1f5
        L201:
            int r1 = r0.d
            int r1 = defpackage.b66.b(r1)
            long[] r2 = r0.a
            int[] r4 = r0.b
            java.lang.Object[] r5 = r0.c
            int r6 = r0.d
            r0.f(r1)
            long[] r1 = r0.a
            int[] r7 = r0.b
            java.lang.Object[] r8 = r0.c
            int r9 = r0.d
            r10 = r20
        L21c:
            if (r10 >= r6) goto L273
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r28
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L268
            r11 = r4[r10]
            int r12 = java.lang.Integer.hashCode(r11)
            int r12 = r12 * r19
            int r13 = r12 << 16
            r12 = r12 ^ r13
            int r13 = r12 >>> 7
            int r13 = r0.e(r13)
            r12 = r12 & 127(0x7f, float:1.78E-43)
            long r14 = (long) r12
            int r12 = r13 >> 3
            r18 = r13 & 7
            int r18 = r18 << 3
            r21 = r1[r12]
            r24 = r1
            r23 = r2
            long r1 = r28 << r18
            long r1 = ~r1
            long r1 = r21 & r1
            long r14 = r14 << r18
            long r1 = r1 | r14
            r24[r12] = r1
            int r12 = r13 + (-7)
            r12 = r12 & r9
            r14 = r9 & 7
            int r12 = r12 + r14
            int r12 = r12 >> 3
            r24[r12] = r1
            r7[r13] = r11
            r1 = r5[r10]
            r8[r13] = r1
            goto L26c
        L268:
            r24 = r1
            r23 = r2
        L26c:
            int r10 = r10 + 1
            r2 = r23
            r1 = r24
            goto L21c
        L273:
            int r1 = r0.e(r3)
        L277:
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
            long r8 = r8 & r28
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 != 0) goto L292
            goto L294
        L292:
            r32 = r20
        L294:
            int r2 = r2 - r32
            r0.f = r2
            int r0 = r0.d
            long r8 = r28 << r7
            long r8 = ~r8
            long r5 = r5 & r8
            long r7 = r26 << r7
            long r5 = r5 | r7
            r3[r4] = r5
            int r2 = r1 + (-7)
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r3[r0] = r5
            return r1
        L2ae:
            r25 = r6
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = r19
            goto L16
    }

    public final int e(int r10) {
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
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r9.c = r10
            return
    }

    public final java.lang.Object g(int r14) {
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
            goto L64
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
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r13 = r13.h(r10)
            return r13
        L6b:
            r13 = 0
            return r13
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }

    public final java.lang.Object h(int r9) {
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
            java.lang.Object[] r8 = r8.c
            r0 = r8[r9]
            r1 = 0
            r8[r9] = r1
            return r0
    }

    public final void i(int r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.d(r3)
            int[] r1 = r2.b
            r1[r0] = r3
            java.lang.Object[] r2 = r2.c
            r2[r0] = r4
            return
    }
}
