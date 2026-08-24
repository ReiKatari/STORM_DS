package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un6  reason: default package */
/* loaded from: classes.dex */
public final class un6 implements java.lang.Cloneable {
    public /* synthetic */ boolean A;
    public /* synthetic */ int[] B;
    public /* synthetic */ java.lang.Object[] L;
    public /* synthetic */ int R;

    public un6(int r4) {
            r3 = this;
            r3.<init>()
            r4 = 4
            r0 = r4
        L5:
            r1 = 32
            r2 = 40
            if (r0 >= r1) goto L16
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto L13
            r2 = r1
            goto L16
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            int r2 = r2 / r4
            int[] r4 = new int[r2]
            r3.B = r4
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r3.L = r4
            return
    }

    public final void a(int r7, android.content.res.ColorStateList r8) {
            r6 = this;
            int r0 = r6.R
            if (r0 == 0) goto L10
            int[] r1 = r6.B
            int r2 = r0 + (-1)
            r1 = r1[r2]
            if (r7 > r1) goto L10
            r6.e(r7, r8)
            return
        L10:
            boolean r1 = r6.A
            if (r1 == 0) goto L1c
            int[] r1 = r6.B
            int r1 = r1.length
            if (r0 < r1) goto L1c
            defpackage.vy7.I(r6)
        L1c:
            int r0 = r6.R
            int[] r1 = r6.B
            int r1 = r1.length
            r2 = 1
            if (r0 < r1) goto L49
            int r1 = r0 + 1
            r3 = 4
            int r1 = r1 * r3
            r4 = r3
        L29:
            r5 = 32
            if (r4 >= r5) goto L38
            int r5 = r2 << r4
            int r5 = r5 + (-12)
            if (r1 > r5) goto L35
            r1 = r5
            goto L38
        L35:
            int r4 = r4 + 1
            goto L29
        L38:
            int r1 = r1 / r3
            int[] r3 = r6.B
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            r6.B = r3
            java.lang.Object[] r3 = r6.L
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            r6.L = r1
        L49:
            int[] r1 = r6.B
            r1[r0] = r7
            java.lang.Object[] r7 = r6.L
            r7[r0] = r8
            int r0 = r0 + r2
            r6.R = r0
            return
    }

    public final defpackage.un6 b() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            r0.getClass()
            un6 r0 = (defpackage.un6) r0
            int[] r1 = r2.B
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.B = r1
            java.lang.Object[] r2 = r2.L
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.L = r2
            return r0
    }

    public final java.lang.Object c(int r3) {
            r2 = this;
            int[] r0 = r2.B
            int r1 = r2.R
            int r3 = defpackage.g04.v(r1, r3, r0)
            if (r3 < 0) goto L14
            java.lang.Object[] r2 = r2.L
            r2 = r2[r3]
            java.lang.Object r3 = defpackage.vy7.d0
            if (r2 != r3) goto L13
            goto L14
        L13:
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            un6 r0 = r0.b()
            return r0
    }

    public final int d(int r2) {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto L7
            defpackage.vy7.I(r1)
        L7:
            int[] r1 = r1.B
            r1 = r1[r2]
            return r1
    }

    public final void e(int r7, java.lang.Object r8) {
            r6 = this;
            int[] r0 = r6.B
            int r1 = r6.R
            int r0 = defpackage.g04.v(r1, r7, r0)
            if (r0 < 0) goto Lf
            java.lang.Object[] r6 = r6.L
            r6[r0] = r8
            return
        Lf:
            int r0 = ~r0
            int r1 = r6.R
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.L
            r3 = r2[r0]
            java.lang.Object r4 = defpackage.vy7.d0
            if (r3 != r4) goto L23
            int[] r6 = r6.B
            r6[r0] = r7
            r2[r0] = r8
            return
        L23:
            boolean r2 = r6.A
            if (r2 == 0) goto L38
            int[] r2 = r6.B
            int r2 = r2.length
            if (r1 < r2) goto L38
            defpackage.vy7.I(r6)
            int[] r0 = r6.B
            int r1 = r6.R
            int r0 = defpackage.g04.v(r1, r7, r0)
            int r0 = ~r0
        L38:
            int r1 = r6.R
            int[] r2 = r6.B
            int r2 = r2.length
            r3 = 1
            if (r1 < r2) goto L64
            int r1 = r1 + r3
            r2 = 4
            int r1 = r1 * r2
            r4 = r2
        L44:
            r5 = 32
            if (r4 >= r5) goto L53
            int r5 = r3 << r4
            int r5 = r5 + (-12)
            if (r1 > r5) goto L50
            r1 = r5
            goto L53
        L50:
            int r4 = r4 + 1
            goto L44
        L53:
            int r1 = r1 / r2
            int[] r2 = r6.B
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r6.B = r2
            java.lang.Object[] r2 = r6.L
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r6.L = r1
        L64:
            int r1 = r6.R
            int r2 = r1 - r0
            if (r2 == 0) goto L78
            int[] r2 = r6.B
            int r4 = r0 + 1
            defpackage.fv.r0(r4, r0, r1, r2, r2)
            java.lang.Object[] r1 = r6.L
            int r2 = r6.R
            defpackage.fv.t0(r1, r1, r4, r0, r2)
        L78:
            int[] r1 = r6.B
            r1[r0] = r7
            java.lang.Object[] r7 = r6.L
            r7[r0] = r8
            int r7 = r6.R
            int r7 = r7 + r3
            r6.R = r7
            return
    }

    public final int f() {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto L7
            defpackage.vy7.I(r1)
        L7:
            int r1 = r1.R
            return r1
    }

    public final java.lang.Object g(int r2) {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto L7
            defpackage.vy7.I(r1)
        L7:
            java.lang.Object[] r1 = r1.L
            int r0 = r1.length
            if (r2 >= r0) goto Lf
            r1 = r1[r2]
            return r1
        Lf:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            r1.<init>()
            throw r1
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.f()
            if (r0 > 0) goto L9
            java.lang.String r4 = "{}"
            return r4
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.R
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r4.R
            r2 = 0
        L1a:
            if (r2 >= r1) goto L41
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r0.append(r3)
        L23:
            int r3 = r4.d(r2)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r3 = r4.g(r2)
            if (r3 == r4) goto L39
            r0.append(r3)
            goto L3e
        L39:
            java.lang.String r3 = "(this Map)"
            r0.append(r3)
        L3e:
            int r2 = r2 + 1
            goto L1a
        L41:
            r4 = 125(0x7d, float:1.75E-43)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
