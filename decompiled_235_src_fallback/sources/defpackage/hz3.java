package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz3  reason: default package */
/* loaded from: classes.dex */
public final class hz3 implements java.lang.Cloneable {
    public /* synthetic */ boolean A;
    public /* synthetic */ long[] B;
    public /* synthetic */ java.lang.Object[] L;
    public /* synthetic */ int R;

    public hz3(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Le
            long[] r3 = defpackage.g04.h
            r2.B = r3
            java.lang.Object[] r3 = defpackage.g04.i
            r2.L = r3
            return
        Le:
            int r3 = r3 * 8
            r0 = 4
        L11:
            r1 = 32
            if (r0 >= r1) goto L20
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r3 > r1) goto L1d
            r3 = r1
            goto L20
        L1d:
            int r0 = r0 + 1
            goto L11
        L20:
            int r3 = r3 / 8
            long[] r0 = new long[r3]
            r2.B = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.L = r3
            return
    }

    public /* synthetic */ hz3(java.lang.Object r1) {
            r0 = this;
            r1 = 10
            r0.<init>(r1)
            return
    }

    public final void a() {
            r5 = this;
            int r0 = r5.R
            java.lang.Object[] r1 = r5.L
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.R = r2
            r5.A = r2
            return
    }

    public final java.lang.Object b(long r3) {
            r2 = this;
            long[] r0 = r2.B
            int r1 = r2.R
            int r3 = defpackage.g04.w(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r2 = r2.L
            r2 = r2[r3]
            java.lang.Object r3 = defpackage.hv.h
            if (r2 != r3) goto L13
            goto L14
        L13:
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final int c(long r10) {
            r9 = this;
            boolean r0 = r9.A
            if (r0 == 0) goto L29
            int r0 = r9.R
            long[] r1 = r9.B
            java.lang.Object[] r2 = r9.L
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r0) goto L25
            r6 = r2[r4]
            java.lang.Object r7 = defpackage.hv.h
            if (r6 == r7) goto L22
            if (r4 == r5) goto L20
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L20:
            int r5 = r5 + 1
        L22:
            int r4 = r4 + 1
            goto Ld
        L25:
            r9.A = r3
            r9.R = r5
        L29:
            long[] r0 = r9.B
            int r9 = r9.R
            int r9 = defpackage.g04.w(r0, r9, r10)
            return r9
    }

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            r0.getClass()
            hz3 r0 = (defpackage.hz3) r0
            long[] r1 = r2.B
            java.lang.Object r1 = r1.clone()
            long[] r1 = (long[]) r1
            r0.B = r1
            java.lang.Object[] r2 = r2.L
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.L = r2
            return r0
    }

    public final boolean d() {
            r0 = this;
            int r0 = r0.i()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final long e(int r10) {
            r9 = this;
            if (r10 < 0) goto L32
            int r0 = r9.R
            if (r10 >= r0) goto L32
            boolean r1 = r9.A
            if (r1 == 0) goto L2d
            long[] r1 = r9.B
            java.lang.Object[] r2 = r9.L
            r3 = 0
            r4 = r3
            r5 = r4
        L11:
            if (r4 >= r0) goto L29
            r6 = r2[r4]
            java.lang.Object r7 = defpackage.hv.h
            if (r6 == r7) goto L26
            if (r4 == r5) goto L24
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L24:
            int r5 = r5 + 1
        L26:
            int r4 = r4 + 1
            goto L11
        L29:
            r9.A = r3
            r9.R = r5
        L2d:
            long[] r9 = r9.B
            r0 = r9[r10]
            return r0
        L32:
            java.lang.String r9 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r9 = defpackage.lb1.g(r10, r9)
            defpackage.i.h(r9)
            r9 = 0
            return r9
    }

    public final void f(long r11, java.lang.Object r13) {
            r10 = this;
            java.lang.Object r0 = defpackage.hv.h
            long[] r1 = r10.B
            int r2 = r10.R
            int r1 = defpackage.g04.w(r1, r2, r11)
            if (r1 < 0) goto L11
            java.lang.Object[] r10 = r10.L
            r10[r1] = r13
            return
        L11:
            int r1 = ~r1
            int r2 = r10.R
            if (r1 >= r2) goto L23
            java.lang.Object[] r3 = r10.L
            r4 = r3[r1]
            if (r4 != r0) goto L23
            long[] r10 = r10.B
            r10[r1] = r11
            r3[r1] = r13
            return
        L23:
            boolean r3 = r10.A
            if (r3 == 0) goto L52
            long[] r3 = r10.B
            int r4 = r3.length
            if (r2 < r4) goto L52
            java.lang.Object[] r1 = r10.L
            r4 = 0
            r5 = r4
            r6 = r5
        L31:
            if (r5 >= r2) goto L47
            r7 = r1[r5]
            if (r7 == r0) goto L44
            if (r5 == r6) goto L42
            r8 = r3[r5]
            r3[r6] = r8
            r1[r6] = r7
            r7 = 0
            r1[r5] = r7
        L42:
            int r6 = r6 + 1
        L44:
            int r5 = r5 + 1
            goto L31
        L47:
            r10.A = r4
            r10.R = r6
            long[] r0 = r10.B
            int r0 = defpackage.g04.w(r0, r6, r11)
            int r1 = ~r0
        L52:
            int r0 = r10.R
            long[] r2 = r10.B
            int r2 = r2.length
            r3 = 1
            if (r0 < r2) goto L7f
            int r0 = r0 + r3
            int r0 = r0 * 8
            r2 = 4
        L5e:
            r4 = 32
            if (r2 >= r4) goto L6d
            int r4 = r3 << r2
            int r4 = r4 + (-12)
            if (r0 > r4) goto L6a
            r0 = r4
            goto L6d
        L6a:
            int r2 = r2 + 1
            goto L5e
        L6d:
            int r0 = r0 / 8
            long[] r2 = r10.B
            long[] r2 = java.util.Arrays.copyOf(r2, r0)
            r10.B = r2
            java.lang.Object[] r2 = r10.L
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.L = r0
        L7f:
            int r0 = r10.R
            int r2 = r0 - r1
            if (r2 == 0) goto L93
            long[] r2 = r10.B
            int r4 = r1 + 1
            defpackage.fv.s0(r2, r2, r4, r1, r0)
            java.lang.Object[] r0 = r10.L
            int r2 = r10.R
            defpackage.fv.t0(r0, r0, r4, r1, r2)
        L93:
            long[] r0 = r10.B
            r0[r1] = r11
            java.lang.Object[] r11 = r10.L
            r11[r1] = r13
            int r11 = r10.R
            int r11 = r11 + r3
            r10.R = r11
            return
    }

    public final void g(long r3) {
            r2 = this;
            long[] r0 = r2.B
            int r1 = r2.R
            int r3 = defpackage.g04.w(r0, r1, r3)
            if (r3 < 0) goto L17
            java.lang.Object[] r4 = r2.L
            r0 = r4[r3]
            java.lang.Object r1 = defpackage.hv.h
            if (r0 == r1) goto L17
            r4[r3] = r1
            r3 = 1
            r2.A = r3
        L17:
            return
    }

    public final int i() {
            r9 = this;
            boolean r0 = r9.A
            if (r0 == 0) goto L29
            int r0 = r9.R
            long[] r1 = r9.B
            java.lang.Object[] r2 = r9.L
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r0) goto L25
            r6 = r2[r4]
            java.lang.Object r7 = defpackage.hv.h
            if (r6 == r7) goto L22
            if (r4 == r5) goto L20
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L20:
            int r5 = r5 + 1
        L22:
            int r4 = r4 + 1
            goto Ld
        L25:
            r9.A = r3
            r9.R = r5
        L29:
            int r9 = r9.R
            return r9
    }

    public final java.lang.Object j(int r11) {
            r10 = this;
            r0 = 0
            if (r11 < 0) goto L32
            int r1 = r10.R
            if (r11 >= r1) goto L32
            boolean r2 = r10.A
            if (r2 == 0) goto L2d
            long[] r2 = r10.B
            java.lang.Object[] r3 = r10.L
            r4 = 0
            r5 = r4
            r6 = r5
        L12:
            if (r5 >= r1) goto L29
            r7 = r3[r5]
            java.lang.Object r8 = defpackage.hv.h
            if (r7 == r8) goto L26
            if (r5 == r6) goto L24
            r8 = r2[r5]
            r2[r6] = r8
            r3[r6] = r7
            r3[r5] = r0
        L24:
            int r6 = r6 + 1
        L26:
            int r5 = r5 + 1
            goto L12
        L29:
            r10.A = r4
            r10.R = r6
        L2d:
            java.lang.Object[] r10 = r10.L
            r10 = r10[r11]
            return r10
        L32:
            java.lang.String r10 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r10 = defpackage.lb1.g(r11, r10)
            defpackage.i.h(r10)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.i()
            if (r0 > 0) goto L9
            java.lang.String r5 = "{}"
            return r5
        L9:
            int r0 = r5.R
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.R
            r2 = 0
        L1a:
            if (r2 >= r0) goto L41
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            long r3 = r5.e(r2)
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.j(r2)
            if (r3 == r1) goto L39
            r1.append(r3)
            goto L3e
        L39:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3e:
            int r2 = r2 + 1
            goto L1a
        L41:
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }
}
