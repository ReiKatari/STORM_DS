package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta6  reason: default package */
/* loaded from: classes.dex */
public final class ta6 implements defpackage.gb6, java.lang.Iterable, defpackage.zf3 {
    public final defpackage.ja4 A;
    public defpackage.b14 B;
    public boolean L;
    public boolean R;

    public ta6() {
            r1 = this;
            r1.<init>()
            long[] r0 = defpackage.b66.a
            ja4 r0 = new ja4
            r0.<init>()
            r1.A = r0
            return
    }

    @Override // defpackage.gb6
    public final void a(defpackage.fb6 r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r5 instanceof defpackage.y1
            ja4 r3 = r3.A
            if (r0 == 0) goto L2c
            boolean r0 = r3.c(r4)
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.g(r4)
            r0.getClass()
            y1 r0 = (defpackage.y1) r0
            y1 r1 = new y1
            y1 r5 = (defpackage.y1) r5
            java.lang.String r2 = r5.a
            if (r2 != 0) goto L1f
            java.lang.String r2 = r0.a
        L1f:
            ao2 r5 = r5.b
            if (r5 != 0) goto L25
            ao2 r5 = r0.b
        L25:
            r1.<init>(r2, r5)
            r3.m(r4, r1)
            goto L2f
        L2c:
            r3.m(r4, r5)
        L2f:
            r4.getClass()
            return
    }

    public final defpackage.ta6 b() {
            r17 = this;
            r0 = r17
            ta6 r1 = new ta6
            r1.<init>()
            boolean r2 = r0.L
            r1.L = r2
            boolean r2 = r0.R
            r1.R = r2
            ja4 r2 = r1.A
            r2.getClass()
            ja4 r0 = r0.A
            r0.getClass()
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L60
            r6 = 0
            r7 = r6
        L26:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5b
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L40:
            if (r12 >= r10) goto L59
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L55
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r2.m(r14, r13)
        L55:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L40
        L59:
            if (r10 != r11) goto L60
        L5b:
            if (r7 == r5) goto L60
            int r7 = r7 + 1
            goto L26
        L60:
            return r1
    }

    public final java.lang.Object c(defpackage.fb6 r2) {
            r1 = this;
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r2)
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.String r1 = "Key not present: "
            java.lang.String r0 = " - consider getOrElse or getOrNull"
            defpackage.e41.o(r2, r0, r1)
            r1 = 0
            return r1
    }

    public final void d(defpackage.ta6 r17) {
            r16 = this;
            r0 = r17
            ja4 r0 = r0.A
            java.lang.Object[] r1 = r0.b
            java.lang.Object[] r2 = r0.c
            long[] r0 = r0.a
            int r3 = r0.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L67
            r5 = 0
        L10:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L60
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = 0
        L2a:
            if (r10 >= r8) goto L5b
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L55
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            fb6 r12 = (defpackage.fb6) r12
            r13 = r16
            ja4 r14 = r13.A
            java.lang.Object r15 = r14.g(r12)
            r12.getClass()
            eo2 r4 = r12.b
            java.lang.Object r4 = r4.o(r15, r11)
            if (r4 == 0) goto L57
            r14.m(r12, r4)
            goto L57
        L55:
            r13 = r16
        L57:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2a
        L5b:
            r13 = r16
            if (r8 != r9) goto L67
            goto L62
        L60:
            r13 = r16
        L62:
            if (r5 == r3) goto L67
            int r5 = r5 + 1
            goto L10
        L67:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof defpackage.ta6
            if (r0 != 0) goto L8
            goto L22
        L8:
            ta6 r3 = (defpackage.ta6) r3
            ja4 r0 = r3.A
            ja4 r1 = r2.A
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L22
        L15:
            boolean r0 = r2.L
            boolean r1 = r3.L
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            boolean r2 = r2.R
            boolean r3 = r3.R
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            ja4 r0 = r3.A
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.L
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.R
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            b14 r0 = r2.B
            if (r0 != 0) goto L11
            ja4 r0 = r2.A
            r0.getClass()
            b14 r1 = new b14
            r1.<init>(r0)
            r2.B = r1
            r0 = r1
        L11:
            java.util.Set r2 = r0.entrySet()
            q52 r2 = (defpackage.q52) r2
            java.util.Iterator r2 = r2.iterator()
            return r2
    }

    public final java.lang.String toString() {
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.L
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.R
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            ja4 r4 = r0.A
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            fb6 r8 = (defpackage.fb6) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = defpackage.ej2.U(r0)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
