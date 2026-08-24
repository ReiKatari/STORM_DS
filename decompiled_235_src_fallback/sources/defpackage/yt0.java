package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt0  reason: default package */
/* loaded from: classes.dex */
public final class yt0 implements defpackage.e34, defpackage.i26 {
    public final defpackage.iu a;
    public final defpackage.c40 b;

    public yt0(defpackage.iu r1, defpackage.c40 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e34
    public final int a(defpackage.eb3 r10, java.util.List r11, int r12) {
            r9 = this;
            iu r9 = r9.a
            float r9 = r9.a()
            int r9 = r10.r0(r9)
            boolean r10 = r11.isEmpty()
            r0 = 0
            if (r10 == 0) goto L12
            return r0
        L12:
            int r10 = r11.size()
            int r10 = r10 + (-1)
            int r10 = r10 * r9
            int r9 = java.lang.Math.min(r10, r12)
            int r10 = r11.size()
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L25:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r10) goto L5c
            java.lang.Object r6 = r11.get(r2)
            x24 r6 = (defpackage.x24) r6
            j26 r7 = defpackage.jx2.t(r6)
            float r7 = defpackage.jx2.v(r7)
            int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r8 != 0) goto L54
            if (r12 != r5) goto L40
            r7 = r5
            goto L42
        L40:
            int r7 = r12 - r9
        L42:
            int r5 = r6.c(r5)
            int r5 = java.lang.Math.min(r5, r7)
            int r9 = r9 + r5
            int r5 = r6.u(r5)
            int r4 = java.lang.Math.max(r4, r5)
            goto L59
        L54:
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L59
            float r3 = r3 + r7
        L59:
            int r2 = r2 + 1
            goto L25
        L5c:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 != 0) goto L62
            r9 = r0
            goto L71
        L62:
            if (r12 != r5) goto L66
            r9 = r5
            goto L71
        L66:
            int r12 = r12 - r9
            int r9 = java.lang.Math.max(r12, r0)
            float r9 = (float) r9
            float r9 = r9 / r3
            int r9 = java.lang.Math.round(r9)
        L71:
            int r10 = r11.size()
        L75:
            if (r0 >= r10) goto L9f
            java.lang.Object r12 = r11.get(r0)
            x24 r12 = (defpackage.x24) r12
            j26 r2 = defpackage.jx2.t(r12)
            float r2 = defpackage.jx2.v(r2)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L9c
            if (r9 == r5) goto L92
            float r3 = (float) r9
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            goto L93
        L92:
            r2 = r5
        L93:
            int r12 = r12.u(r2)
            int r12 = java.lang.Math.max(r4, r12)
            r4 = r12
        L9c:
            int r0 = r0 + 1
            goto L75
        L9f:
            return r4
    }

    @Override // defpackage.i26
    public final void b(int r1, int[] r2, int[] r3, defpackage.g34 r4) {
            r0 = this;
            iu r0 = r0.a
            r0.g(r4, r1, r2, r3)
            return
    }

    @Override // defpackage.i26
    public final long c(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0 = 0
            if (r4 != 0) goto L8
            long r0 = defpackage.s21.a(r0, r3, r1, r2)
            return r0
        L8:
            long r0 = defpackage.nb3.s(r0, r3, r1, r2)
            return r0
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r14, java.util.List r15, long r16) {
            r13 = this;
            int r1 = defpackage.q21.i(r16)
            int r2 = defpackage.q21.j(r16)
            int r3 = defpackage.q21.g(r16)
            int r4 = defpackage.q21.h(r16)
            iu r0 = r13.a
            float r0 = r0.a()
            int r5 = r14.r0(r0)
            int r0 = r15.size()
            dx4[] r8 = new defpackage.dx4[r0]
            int r10 = r15.size()
            r9 = 0
            r12 = 0
            r11 = 0
            r0 = r13
            r6 = r14
            r7 = r15
            f34 r13 = defpackage.yh2.C(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    @Override // defpackage.e34
    public final int e(defpackage.eb3 r10, java.util.List r11, int r12) {
            r9 = this;
            iu r9 = r9.a
            float r9 = r9.a()
            int r9 = r10.r0(r9)
            boolean r10 = r11.isEmpty()
            r0 = 0
            if (r10 == 0) goto L12
            return r0
        L12:
            int r10 = r11.size()
            int r10 = r10 + (-1)
            int r10 = r10 * r9
            int r9 = java.lang.Math.min(r10, r12)
            int r10 = r11.size()
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L25:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r10) goto L5c
            java.lang.Object r6 = r11.get(r2)
            x24 r6 = (defpackage.x24) r6
            j26 r7 = defpackage.jx2.t(r6)
            float r7 = defpackage.jx2.v(r7)
            int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r8 != 0) goto L54
            if (r12 != r5) goto L40
            r7 = r5
            goto L42
        L40:
            int r7 = r12 - r9
        L42:
            int r5 = r6.c(r5)
            int r5 = java.lang.Math.min(r5, r7)
            int r9 = r9 + r5
            int r5 = r6.n(r5)
            int r4 = java.lang.Math.max(r4, r5)
            goto L59
        L54:
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L59
            float r3 = r3 + r7
        L59:
            int r2 = r2 + 1
            goto L25
        L5c:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 != 0) goto L62
            r9 = r0
            goto L71
        L62:
            if (r12 != r5) goto L66
            r9 = r5
            goto L71
        L66:
            int r12 = r12 - r9
            int r9 = java.lang.Math.max(r12, r0)
            float r9 = (float) r9
            float r9 = r9 / r3
            int r9 = java.lang.Math.round(r9)
        L71:
            int r10 = r11.size()
        L75:
            if (r0 >= r10) goto L9f
            java.lang.Object r12 = r11.get(r0)
            x24 r12 = (defpackage.x24) r12
            j26 r2 = defpackage.jx2.t(r12)
            float r2 = defpackage.jx2.v(r2)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L9c
            if (r9 == r5) goto L92
            float r3 = (float) r9
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            goto L93
        L92:
            r2 = r5
        L93:
            int r12 = r12.n(r2)
            int r12 = java.lang.Math.max(r4, r12)
            r4 = r12
        L9c:
            int r0 = r0 + 1
            goto L75
        L9f:
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.yt0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            yt0 r3 = (defpackage.yt0) r3
            iu r0 = r2.a
            iu r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            c40 r2 = r2.b
            c40 r3 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    @Override // defpackage.i26
    public final defpackage.f34 f(defpackage.dx4[] r7, defpackage.g34 r8, int[] r9, int r10, int r11, int[] r12, int r13, int r14, int r15) {
            r6 = this;
            xt0 r0 = new xt0
            r2 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            zt1 r6 = defpackage.zt1.A
            f34 r6 = r4.K(r3, r10, r6, r0)
            return r6
    }

    @Override // defpackage.e34
    public final int g(defpackage.eb3 r9, java.util.List r10, int r11) {
            r8 = this;
            iu r8 = r8.a
            float r8 = r8.a()
            int r8 = r9.r0(r8)
            boolean r9 = r10.isEmpty()
            r0 = 0
            if (r9 == 0) goto L12
            return r0
        L12:
            int r9 = r10.size()
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r1
        L1a:
            if (r0 >= r9) goto L46
            java.lang.Object r5 = r10.get(r0)
            x24 r5 = (defpackage.x24) r5
            j26 r6 = defpackage.jx2.t(r5)
            float r6 = defpackage.jx2.v(r6)
            int r5 = r5.c(r11)
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 != 0) goto L34
            int r3 = r3 + r5
            goto L43
        L34:
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 <= 0) goto L43
            float r4 = r4 + r6
            float r5 = (float) r5
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)
            int r2 = java.lang.Math.max(r2, r5)
        L43:
            int r0 = r0 + 1
            goto L1a
        L46:
            float r9 = (float) r2
            float r9 = r9 * r4
            int r9 = java.lang.Math.round(r9)
            int r9 = r9 + r3
            int r10 = r10.size()
            int r10 = r10 + (-1)
            int r10 = r10 * r8
            int r10 = r10 + r9
            return r10
    }

    @Override // defpackage.i26
    public final int h(defpackage.dx4 r1) {
            r0 = this;
            int r0 = r1.A
            return r0
    }

    public final int hashCode() {
            r1 = this;
            iu r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            c40 r1 = r1.b
            float r1 = r1.a
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.e34
    public final int i(defpackage.eb3 r9, java.util.List r10, int r11) {
            r8 = this;
            iu r8 = r8.a
            float r8 = r8.a()
            int r8 = r9.r0(r8)
            boolean r9 = r10.isEmpty()
            r0 = 0
            if (r9 == 0) goto L12
            return r0
        L12:
            int r9 = r10.size()
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r1
        L1a:
            if (r0 >= r9) goto L46
            java.lang.Object r5 = r10.get(r0)
            x24 r5 = (defpackage.x24) r5
            j26 r6 = defpackage.jx2.t(r5)
            float r6 = defpackage.jx2.v(r6)
            int r5 = r5.V(r11)
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 != 0) goto L34
            int r3 = r3 + r5
            goto L43
        L34:
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 <= 0) goto L43
            float r4 = r4 + r6
            float r5 = (float) r5
            float r5 = r5 / r6
            int r5 = java.lang.Math.round(r5)
            int r2 = java.lang.Math.max(r2, r5)
        L43:
            int r0 = r0 + 1
            goto L1a
        L46:
            float r9 = (float) r2
            float r9 = r9 * r4
            int r9 = java.lang.Math.round(r9)
            int r9 = r9 + r3
            int r10 = r10.size()
            int r10 = r10 + (-1)
            int r10 = r10 * r8
            int r10 = r10 + r9
            return r10
    }

    @Override // defpackage.i26
    public final int j(defpackage.dx4 r1) {
            r0 = this;
            int r0 = r1.B
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ColumnMeasurePolicy(verticalArrangement="
            r0.<init>(r1)
            iu r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", horizontalAlignment="
            r0.append(r1)
            c40 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
