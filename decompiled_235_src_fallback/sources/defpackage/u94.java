package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u94  reason: default package */
/* loaded from: classes.dex */
public final class u94 {
    public long[] a;
    public long[] b;
    public java.lang.Object[] c;
    public int d;
    public int e;
    public int f;

    public u94(int r2) {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            r1.a = r0
            long[] r0 = defpackage.gz3.a
            r1.b = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.c = r0
            if (r2 < 0) goto L19
            int r2 = defpackage.b66.d(r2)
            r1.e(r2)
            return
        L19:
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

    public final boolean b(long r18) {
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
    }

    public final int c(int r10) {
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

    public final java.lang.Object d(long r15) {
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r14 = r14.c
            r14 = r14[r10]
            return r14
        L6d:
            r14 = 0
            return r14
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
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
            long[] r0 = new long[r10]
            r9.b = r0
            java.lang.Object[] r10 = new java.lang.Object[r10]
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
            boolean r3 = r1 instanceof defpackage.u94
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            u94 r1 = (defpackage.u94) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L74
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
            if (r10 == 0) goto L6f
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3d:
            if (r12 >= r10) goto L6d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L69
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L5e
            java.lang.Object r13 = r1.d(r14)
            if (r13 != 0) goto L5d
            boolean r13 = r1.b(r14)
            if (r13 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r14 = r1.d(r14)
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L69
            return r4
        L69:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3d
        L6d:
            if (r10 != r11) goto L74
        L6f:
            if (r7 == r6) goto L74
            int r7 = r7 + 1
            goto L23
        L74:
            return r2
    }

    public final java.lang.Object f(long r15) {
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L99
            r10 = -1
        L66:
            r0 = 0
            if (r10 < 0) goto L98
            int r1 = r14.e
            int r1 = r1 + (-1)
            r14.e = r1
            long[] r1 = r14.a
            int r2 = r14.d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            java.lang.Object[] r14 = r14.c
            r1 = r14[r10]
            r14[r10] = r0
            return r1
        L98:
            return r0
        L99:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
    }

    public final void g(long r39, java.lang.Object r41) {
            r38 = this;
            r0 = r38
            int r1 = java.lang.Long.hashCode(r39)
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
            if (r19 == 0) goto L6c
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            r19 = r2
            long[] r2 = r0.b
            r20 = r2[r16]
            int r2 = (r20 > r39 ? 1 : (r20 == r39 ? 0 : -1))
            if (r2 != 0) goto L63
            goto L2b9
        L63:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            r2 = r19
            goto L47
        L6c:
            r19 = r2
            long r6 = ~r8
            r2 = 6
            long r6 = r6 << r2
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r6 = 8
            if (r2 == 0) goto L2c2
            int r1 = r0.c(r3)
            int r2 = r0.f
            r7 = 255(0xff, double:1.26E-321)
            if (r2 != 0) goto L97
            long[] r2 = r0.a
            int r18 = r1 >> 3
            r20 = r2[r18]
            r2 = r1 & 7
            int r2 = r2 << 3
            long r20 = r20 >> r2
            long r20 = r20 & r7
            r22 = 254(0xfe, double:1.255E-321)
            int r2 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r2 != 0) goto La5
        L97:
            r27 = r7
            r31 = r10
            r29 = r12
            r18 = r13
            r20 = 128(0x80, double:6.3E-322)
            r30 = 7
            goto L282
        La5:
            int r1 = r0.d
            if (r1 <= r6) goto L208
            int r2 = r0.e
            r20 = 128(0x80, double:6.3E-322)
            long r4 = (long) r2
            r24 = 32
            long r4 = r4 * r24
            long r1 = (long) r1
            r24 = 25
            long r1 = r1 * r24
            r24 = -9223372036854775808
            long r4 = r4 ^ r24
            long r1 = r1 ^ r24
            int r1 = java.lang.Long.compare(r4, r1)
            if (r1 > 0) goto L1fd
            long[] r1 = r0.a
            int r2 = r0.d
            long[] r4 = r0.b
            java.lang.Object[] r5 = r0.c
            int r18 = r2 + 7
            r26 = r6
            int r6 = r18 >> 3
            r27 = r7
            r7 = r12
        Ld4:
            if (r7 >= r6) goto Lf3
            r29 = r1[r7]
            r31 = r10
            r8 = 7
            long r9 = r29 & r14
            r29 = r12
            r11 = r13
            long r12 = ~r9
            long r9 = r9 >>> r8
            long r12 = r12 + r9
            r9 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r9 = r9 & r12
            r1[r7] = r9
            int r7 = r7 + 1
            r13 = r11
            r12 = r29
            r10 = r31
            goto Ld4
        Lf3:
            r31 = r10
            r29 = r12
            r11 = r13
            r8 = 7
            int r6 = defpackage.fv.H0(r1)
            int r7 = r6 + (-1)
            r9 = r1[r7]
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r9 = r9 & r12
            r14 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r9 = r9 | r14
            r1[r7] = r9
            r9 = r1[r29]
            r1[r6] = r9
            r6 = r29
        L112:
            if (r6 == r2) goto L1ec
            int r7 = r6 >> 3
            r9 = r1[r7]
            r14 = r6 & 7
            int r14 = r14 << 3
            long r9 = r9 >> r14
            long r9 = r9 & r27
            int r15 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r15 != 0) goto L126
        L123:
            int r6 = r6 + 1
            goto L112
        L126:
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L12b
            goto L123
        L12b:
            r9 = r4[r6]
            int r9 = java.lang.Long.hashCode(r9)
            int r9 = r9 * r19
            int r10 = r9 << 16
            r9 = r9 ^ r10
            int r10 = r9 >>> 7
            int r15 = r0.c(r10)
            r10 = r10 & r2
            int r18 = r15 - r10
            r18 = r18 & r2
            r30 = r8
            int r8 = r18 / 8
            int r10 = r6 - r10
            r10 = r10 & r2
            int r10 = r10 / 8
            if (r8 != r10) goto L16f
            r8 = r9 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            r33 = r1[r7]
            r10 = r11
            r35 = r12
            long r11 = r27 << r14
            long r11 = ~r11
            long r11 = r33 & r11
            long r8 = r8 << r14
            long r8 = r8 | r11
            r1[r7] = r8
            int r7 = r1.length
            int r7 = r7 - r10
            r8 = r1[r29]
            long r8 = r8 & r35
            long r8 = r8 | r24
            r1[r7] = r8
            int r6 = r6 + 1
            r11 = r10
            r8 = r30
            r12 = r35
            goto L112
        L16f:
            r10 = r11
            r35 = r12
            int r8 = r15 >> 3
            r11 = r1[r8]
            r13 = r15 & 7
            int r13 = r13 << 3
            long r33 = r11 >> r13
            long r33 = r33 & r27
            int r18 = (r33 > r20 ? 1 : (r33 == r20 ? 0 : -1))
            if (r18 != 0) goto L1af
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r18 = r10
            r33 = r11
            long r10 = (long) r9
            r12 = r4
            r37 = r5
            long r4 = r27 << r13
            long r4 = ~r4
            long r4 = r33 & r4
            long r9 = r10 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r1[r7]
            long r8 = r27 << r14
            long r8 = ~r8
            long r4 = r4 & r8
            long r8 = r20 << r14
            long r4 = r4 | r8
            r1[r7] = r4
            r4 = r12[r6]
            r12[r15] = r4
            r12[r6] = r16
            r4 = r37[r6]
            r37[r15] = r4
            r4 = 0
            r37[r6] = r4
            goto L1d4
        L1af:
            r37 = r5
            r18 = r10
            r33 = r11
            r12 = r4
            r4 = r9 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r9 = r27 << r13
            long r9 = ~r9
            long r9 = r33 & r9
            long r4 = r4 << r13
            long r4 = r4 | r9
            r1[r8] = r4
            r4 = r12[r15]
            r7 = r12[r6]
            r12[r15] = r7
            r12[r6] = r4
            r4 = r37[r15]
            r5 = r37[r6]
            r37[r15] = r5
            r37[r6] = r4
            int r6 = r6 + (-1)
        L1d4:
            int r4 = r1.length
            int r4 = r4 + (-1)
            r7 = r1[r29]
            long r7 = r7 & r35
            long r7 = r7 | r24
            r1[r4] = r7
            int r6 = r6 + 1
            r4 = r12
            r11 = r18
            r8 = r30
            r12 = r35
            r5 = r37
            goto L112
        L1ec:
            r30 = r8
            r18 = r11
            int r1 = r0.d
            int r1 = defpackage.b66.a(r1)
            int r2 = r0.e
            int r1 = r1 - r2
            r0.f = r1
            goto L27e
        L1fd:
            r27 = r7
            r31 = r10
            r29 = r12
            r18 = r13
            r30 = 7
            goto L20b
        L208:
            r20 = 128(0x80, double:6.3E-322)
            goto L1fd
        L20b:
            int r1 = r0.d
            int r1 = defpackage.b66.b(r1)
            long[] r2 = r0.a
            long[] r4 = r0.b
            java.lang.Object[] r5 = r0.c
            int r6 = r0.d
            r0.e(r1)
            long[] r1 = r0.a
            long[] r7 = r0.b
            java.lang.Object[] r8 = r0.c
            int r9 = r0.d
            r10 = r29
        L226:
            if (r10 >= r6) goto L27e
            int r11 = r10 >> 3
            r11 = r2[r11]
            r13 = r10 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r11 = r11 & r27
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 >= 0) goto L275
            r11 = r4[r10]
            int r13 = java.lang.Long.hashCode(r11)
            int r13 = r13 * r19
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.c(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            r16 = r1
            r15 = r2
            long r1 = (long) r13
            int r13 = r14 >> 3
            r17 = r14 & 7
            int r17 = r17 << 3
            r22 = r16[r13]
            r24 = r1
            long r1 = r27 << r17
            long r1 = ~r1
            long r1 = r22 & r1
            long r22 = r24 << r17
            long r1 = r1 | r22
            r16[r13] = r1
            int r13 = r14 + (-7)
            r13 = r13 & r9
            r17 = r9 & 7
            int r13 = r13 + r17
            int r13 = r13 >> 3
            r16[r13] = r1
            r7[r14] = r11
            r1 = r5[r10]
            r8[r14] = r1
            goto L278
        L275:
            r16 = r1
            r15 = r2
        L278:
            int r10 = r10 + 1
            r2 = r15
            r1 = r16
            goto L226
        L27e:
            int r1 = r0.c(r3)
        L282:
            r16 = r1
            int r1 = r0.e
            int r1 = r1 + 1
            r0.e = r1
            int r1 = r0.f
            long[] r2 = r0.a
            int r3 = r16 >> 3
            r4 = r2[r3]
            r6 = r16 & 7
            int r6 = r6 << 3
            long r7 = r4 >> r6
            long r7 = r7 & r27
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 != 0) goto L2a0
            r29 = r18
        L2a0:
            int r1 = r1 - r29
            r0.f = r1
            int r1 = r0.d
            long r7 = r27 << r6
            long r7 = ~r7
            long r4 = r4 & r7
            long r6 = r31 << r6
            long r4 = r4 | r6
            r2[r3] = r4
            int r3 = r16 + (-7)
            r3 = r3 & r1
            r1 = r1 & 7
            int r3 = r3 + r1
            int r1 = r3 >> 3
            r2[r1] = r4
        L2b9:
            long[] r1 = r0.b
            r1[r16] = r39
            java.lang.Object[] r0 = r0.c
            r0[r16] = r41
            return
        L2c2:
            r26 = r6
            r29 = r12
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = r19
            goto L16
    }

    public final int hashCode() {
            r15 = this;
            long[] r0 = r15.b
            java.lang.Object[] r1 = r15.c
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
            int r12 = java.lang.Long.hashCode(r12)
            if (r11 == 0) goto L45
            int r11 = r11.hashCode()
            goto L46
        L45:
            r11 = r3
        L46:
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
            long[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7b
            r7 = 0
            r8 = 0
        L1d:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L75
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L37:
            if (r13 >= r11) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L66
            int r14 = r7 << 3
            int r14 = r14 + r13
            r16 = r7
            r6 = r2[r14]
            r14 = r3[r14]
            r1.append(r6)
            java.lang.String r6 = "="
            r1.append(r6)
            if (r14 != r0) goto L57
            java.lang.String r14 = "(this)"
        L57:
            r1.append(r14)
            int r8 = r8 + 1
            int r6 = r0.e
            if (r8 >= r6) goto L68
            java.lang.String r6 = ", "
            r1.append(r6)
            goto L68
        L66:
            r16 = r7
        L68:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r7 = r16
            goto L37
        L6e:
            r16 = r7
            if (r11 != r12) goto L7b
            r6 = r16
            goto L76
        L75:
            r6 = r7
        L76:
            if (r6 == r5) goto L7b
            int r7 = r6 + 1
            goto L1d
        L7b:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
