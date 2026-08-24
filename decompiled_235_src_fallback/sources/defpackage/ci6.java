package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci6  reason: default package */
/* loaded from: classes.dex */
public class ci6 {
    public int[] A;
    public java.lang.Object[] B;
    public int L;

    public ci6(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L8
            int[] r0 = defpackage.g04.g
            goto La
        L8:
            int[] r0 = new int[r2]
        La:
            r1.A = r0
            if (r2 != 0) goto L11
            java.lang.Object[] r2 = defpackage.g04.i
            goto L15
        L11:
            int r2 = r2 << 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
        L15:
            r1.B = r2
            return
    }

    public final int a(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.L
            int r0 = r0 * 2
            java.lang.Object[] r4 = r4.B
            r1 = 1
            if (r5 != 0) goto L16
            r5 = r1
        La:
            if (r5 >= r0) goto L27
            r2 = r4[r5]
            if (r2 != 0) goto L13
            int r4 = r5 >> 1
            return r4
        L13:
            int r5 = r5 + 2
            goto La
        L16:
            r2 = r1
        L17:
            if (r2 >= r0) goto L27
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            int r4 = r2 >> 1
            return r4
        L24:
            int r2 = r2 + 2
            goto L17
        L27:
            r4 = -1
            return r4
    }

    public final void b(int r4) {
            r3 = this;
            int r0 = r3.L
            int[] r1 = r3.A
            int r2 = r1.length
            if (r2 >= r4) goto L17
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
            r3.A = r1
            java.lang.Object[] r1 = r3.B
            int r4 = r4 * 2
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            r3.B = r4
        L17:
            int r3 = r3.L
            if (r3 != r0) goto L1c
            return
        L1c:
            defpackage.i.l()
            return
    }

    public final int c(int r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.L
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.A
            int r1 = defpackage.g04.v(r0, r6, r1)
            if (r1 >= 0) goto Lf
            goto L1b
        Lf:
            java.lang.Object[] r2 = r5.B
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = defpackage.nb3.k(r7, r2)
            if (r2 == 0) goto L1c
        L1b:
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.A
            r3 = r3[r2]
            if (r3 != r6) goto L36
            java.lang.Object[] r3 = r5.B
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = defpackage.nb3.k(r7, r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.A
            r0 = r0[r1]
            if (r0 != r6) goto L50
            java.lang.Object[] r0 = r5.B
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = defpackage.nb3.k(r7, r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r5 = ~r2
            return r5
    }

    public final void clear() {
            r1 = this;
            int r0 = r1.L
            if (r0 <= 0) goto Lf
            int[] r0 = defpackage.g04.g
            r1.A = r0
            java.lang.Object[] r0 = defpackage.g04.i
            r1.B = r0
            r0 = 0
            r1.L = r0
        Lf:
            int r1 = r1.L
            if (r1 > 0) goto L14
            return
        L14:
            defpackage.i.l()
            return
    }

    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.d(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.a(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int d(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r1 = r1.e()
            return r1
        L7:
            int r0 = r2.hashCode()
            int r1 = r1.c(r0, r2)
            return r1
    }

    public final int e() {
            r5 = this;
            int r0 = r5.L
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.A
            r2 = 0
            int r1 = defpackage.g04.v(r0, r2, r1)
            if (r1 >= 0) goto L10
            goto L18
        L10:
            java.lang.Object[] r2 = r5.B
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
        L18:
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.A
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.B
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L45
            int[] r0 = r5.A
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.B
            int r3 = r1 << 1
            r0 = r0[r3]
            if (r0 != 0) goto L42
            return r1
        L42:
            int r1 = r1 + (-1)
            goto L31
        L45:
            int r5 = ~r2
            return r5
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            boolean r2 = r8 instanceof defpackage.ci6     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L3a
            int r2 = r7.L     // Catch: java.lang.Throwable -> L77
            r3 = r8
            ci6 r3 = (defpackage.ci6) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.L     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L13
            return r1
        L13:
            ci6 r8 = (defpackage.ci6) r8     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L16:
            if (r3 >= r2) goto L39
            java.lang.Object r4 = r7.f(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.i(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r8.get(r4)     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L2f
            if (r6 != 0) goto L2e
            boolean r4 = r8.containsKey(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L36
        L2e:
            return r1
        L2f:
            boolean r4 = r5.equals(r6)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L36
            return r1
        L36:
            int r3 = r3 + 1
            goto L16
        L39:
            return r0
        L3a:
            boolean r2 = r8 instanceof java.util.Map     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L77
            int r2 = r7.L     // Catch: java.lang.Throwable -> L77
            r3 = r8
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L4a
            return r1
        L4a:
            int r2 = r7.L     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L4d:
            if (r3 >= r2) goto L76
            java.lang.Object r4 = r7.f(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.i(r3)     // Catch: java.lang.Throwable -> L77
            r6 = r8
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L6c
            if (r6 != 0) goto L6b
            r5 = r8
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L77
            boolean r4 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L73
        L6b:
            return r1
        L6c:
            boolean r4 = r5.equals(r6)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L73
            return r1
        L73:
            int r3 = r3 + 1
            goto L4d
        L76:
            return r0
        L77:
            return r1
    }

    public final java.lang.Object f(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.L
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L11
            java.lang.Object[] r3 = r3.B
            int r4 = r4 << r1
            r3 = r3[r4]
            return r3
        L11:
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r3 = defpackage.lb1.g(r4, r3)
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public final java.lang.Object g(int r11) {
            r10 = this;
            r0 = 0
            if (r11 < 0) goto L84
            int r1 = r10.L
            if (r11 >= r1) goto L84
            java.lang.Object[] r2 = r10.B
            int r3 = r11 << 1
            int r4 = r3 + 1
            r4 = r2[r4]
            r5 = 1
            if (r1 > r5) goto L16
            r10.clear()
            return r4
        L16:
            int r6 = r1 + (-1)
            int[] r7 = r10.A
            int r8 = r7.length
            r9 = 8
            if (r8 <= r9) goto L61
            int r8 = r7.length
            int r8 = r8 / 3
            if (r1 >= r8) goto L61
            if (r1 <= r9) goto L2a
            int r8 = r1 >> 1
            int r9 = r1 + r8
        L2a:
            int[] r8 = java.util.Arrays.copyOf(r7, r9)
            r10.A = r8
            java.lang.Object[] r8 = r10.B
            int r9 = r9 << r5
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            r10.B = r8
            int r8 = r10.L
            if (r1 != r8) goto L5d
            if (r11 <= 0) goto L4a
            int[] r8 = r10.A
            r9 = 0
            defpackage.fv.r0(r9, r9, r11, r7, r8)
            java.lang.Object[] r8 = r10.B
            defpackage.fv.t0(r2, r8, r9, r9, r3)
        L4a:
            if (r11 >= r6) goto L79
            int[] r8 = r10.A
            int r9 = r11 + 1
            defpackage.fv.r0(r11, r9, r1, r7, r8)
            java.lang.Object[] r11 = r10.B
            int r5 = r9 << 1
            int r7 = r1 << 1
            defpackage.fv.t0(r2, r11, r3, r5, r7)
            goto L79
        L5d:
            defpackage.i.l()
            return r0
        L61:
            if (r11 >= r6) goto L70
            int r2 = r11 + 1
            defpackage.fv.r0(r11, r2, r1, r7, r7)
            java.lang.Object[] r11 = r10.B
            int r2 = r2 << r5
            int r7 = r1 << 1
            defpackage.fv.t0(r11, r11, r3, r2, r7)
        L70:
            java.lang.Object[] r11 = r10.B
            int r2 = r6 << 1
            r11[r2] = r0
            int r2 = r2 + r5
            r11[r2] = r0
        L79:
            int r11 = r10.L
            if (r1 != r11) goto L80
            r10.L = r6
            return r4
        L80:
            defpackage.i.l()
            return r0
        L84:
            java.lang.String r10 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r10 = defpackage.lb1.g(r11, r10)
            defpackage.i.h(r10)
            return r0
    }

    public java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.d(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r0 = r0.B
            int r1 = r1 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final java.lang.Object getOrDefault(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.d(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r0 = r0.B
            int r1 = r1 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
        Lf:
            return r2
    }

    public final java.lang.Object h(int r4, java.lang.Object r5) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.L
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L14
            int r4 = r4 << r1
            int r4 = r4 + r1
            java.lang.Object[] r3 = r3.B
            r0 = r3[r4]
            r3[r4] = r5
            return r0
        L14:
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r3 = defpackage.lb1.g(r4, r3)
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r8 = this;
            int[] r0 = r8.A
            java.lang.Object[] r1 = r8.B
            int r8 = r8.L
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
        La:
            if (r4 >= r8) goto L1f
            r6 = r1[r3]
            r7 = r0[r4]
            if (r6 == 0) goto L17
            int r6 = r6.hashCode()
            goto L18
        L17:
            r6 = r2
        L18:
            r6 = r6 ^ r7
            int r5 = r5 + r6
            int r4 = r4 + 1
            int r3 = r3 + 2
            goto La
        L1f:
            return r5
    }

    public final java.lang.Object i(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.L
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L12
            java.lang.Object[] r3 = r3.B
            int r4 = r4 << r1
            int r4 = r4 + r1
            r3 = r3[r4]
            return r3
        L12:
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r3 = defpackage.lb1.g(r4, r3)
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.L
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final java.lang.Object put(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.L
            if (r9 == 0) goto L9
            int r1 = r9.hashCode()
            goto La
        L9:
            r1 = 0
        La:
            if (r9 == 0) goto L11
            int r2 = r8.c(r1, r9)
            goto L15
        L11:
            int r2 = r8.e()
        L15:
            if (r2 < 0) goto L22
            int r9 = r2 << 1
            int r9 = r9 + 1
            java.lang.Object[] r8 = r8.B
            r0 = r8[r9]
            r8[r9] = r10
            return r0
        L22:
            int r2 = ~r2
            int[] r3 = r8.A
            int r4 = r3.length
            r5 = 0
            if (r0 < r4) goto L4f
            r4 = 8
            if (r0 < r4) goto L31
            int r4 = r0 >> 1
            int r4 = r4 + r0
            goto L36
        L31:
            r6 = 4
            if (r0 < r6) goto L35
            goto L36
        L35:
            r4 = r6
        L36:
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r8.A = r3
            java.lang.Object[] r3 = r8.B
            int r4 = r4 << 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r8.B = r3
            int r3 = r8.L
            if (r0 != r3) goto L4b
            goto L4f
        L4b:
            defpackage.i.l()
            return r5
        L4f:
            if (r2 >= r0) goto L65
            int[] r3 = r8.A
            int r4 = r2 + 1
            defpackage.fv.r0(r4, r2, r0, r3, r3)
            java.lang.Object[] r3 = r8.B
            int r4 = r4 << 1
            int r6 = r2 << 1
            int r7 = r8.L
            int r7 = r7 << 1
            defpackage.fv.t0(r3, r3, r4, r6, r7)
        L65:
            int r3 = r8.L
            if (r0 != r3) goto L7f
            int[] r0 = r8.A
            int r4 = r0.length
            if (r2 >= r4) goto L7f
            r0[r2] = r1
            java.lang.Object[] r0 = r8.B
            int r1 = r2 << 1
            r0[r1] = r9
            int r1 = r1 + 1
            r0[r1] = r10
            int r3 = r3 + 1
            r8.L = r3
            return r5
        L7f:
            defpackage.i.l()
            return r5
    }

    public final java.lang.Object putIfAbsent(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Lb
            java.lang.Object r1 = r1.put(r2, r3)
            return r1
        Lb:
            return r0
    }

    public java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.d(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r0 = r0.g(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.d(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.i(r2)
            boolean r3 = defpackage.nb3.k(r3, r0)
            if (r3 == 0) goto L15
            r1.g(r2)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final java.lang.Object replace(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.d(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r0 = r0.h(r1, r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean replace(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r1.d(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.i(r2)
            boolean r3 = defpackage.nb3.k(r3, r0)
            if (r3 == 0) goto L15
            r1.h(r2, r4)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final int size() {
            r0 = this;
            int r0 = r0.L
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r5 = "{}"
            return r5
        L9:
            int r0 = r5.L
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.L
            r2 = 0
        L1a:
            if (r2 >= r0) goto L47
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            java.lang.Object r3 = r5.f(r2)
            java.lang.String r4 = "(this Map)"
            if (r3 == r1) goto L2f
            r1.append(r3)
            goto L32
        L2f:
            r1.append(r4)
        L32:
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.i(r2)
            if (r3 == r1) goto L41
            r1.append(r3)
            goto L44
        L41:
            r1.append(r4)
        L44:
            int r2 = r2 + 1
            goto L1a
        L47:
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }
}
