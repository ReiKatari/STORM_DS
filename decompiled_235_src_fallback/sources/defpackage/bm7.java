package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm7  reason: default package */
/* loaded from: classes.dex */
public final class bm7 implements java.lang.Comparable {
    public static final defpackage.bm7 Z = null;
    public static final defpackage.xh5 d0 = null;
    public static final defpackage.xh5 e0 = null;
    public final defpackage.wl7 A;
    public final int B;
    public final int L;
    public final int R;
    public final int X;
    public final int Y;

    static {
            bm7 r0 = new bm7
            wl7 r1 = defpackage.wl7.NIGHTLY
            r6 = 48
            r7 = 0
            r2 = -1
            r3 = -1
            r4 = -1
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            defpackage.bm7.Z = r0
            xh5 r0 = new xh5
            yh5 r1 = defpackage.yh5.IGNORE_CASE
            java.lang.String r2 = "^v?(\\d+)\\.(\\d+)\\.(\\d+)(?:[-.](alpha|beta|rc)(?:[-.]?(\\d+))?)?(?:[-.]fix(\\d*))?$"
            r0.<init>(r2, r1)
            defpackage.bm7.d0 = r0
            xh5 r0 = new xh5
            java.lang.String r2 = "^(alpha|beta|rc)-v?(\\d+)\\.(\\d+)\\.(\\d+)(?:[-.]?(\\d+))?$"
            r0.<init>(r2, r1)
            defpackage.bm7.e0 = r0
            return
    }

    public bm7(defpackage.wl7 r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            return
    }

    public /* synthetic */ bm7(defpackage.wl7 r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r7 = this;
            r13 = r13 & 16
            if (r13 == 0) goto L5
            r12 = 0
        L5:
            r5 = r12
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static int c(defpackage.wl7 r3) {
            int[] r0 = defpackage.xl7.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L21
            r1 = 3
            r2 = 2
            if (r3 == r2) goto L20
            if (r3 == r1) goto L1e
            r1 = 4
            if (r3 == r1) goto L1d
            r0 = 5
            if (r3 != r0) goto L18
            return r2
        L18:
            defpackage.i.d()
            r3 = 0
            return r3
        L1d:
            return r0
        L1e:
            r3 = 0
            return r3
        L20:
            return r1
        L21:
            r3 = -1
            return r3
    }

    public final int a(defpackage.bm7 r9) {
            r8 = this;
            r9.getClass()
            wl7 r0 = r9.A
            wl7 r1 = defpackage.wl7.NIGHTLY
            r2 = 1
            r3 = 0
            wl7 r4 = r8.A
            if (r4 == r1) goto L6e
            if (r0 != r1) goto L10
            goto L6e
        L10:
            r1 = 3
            qn2[] r5 = new defpackage.qn2[r1]
            yl7 r6 = defpackage.yl7.d0
            r5[r3] = r6
            zl7 r6 = defpackage.zl7.d0
            r5[r2] = r6
            am7 r2 = defpackage.am7.d0
            r6 = 2
            r5[r6] = r2
            r2 = r3
        L21:
            if (r2 >= r1) goto L3c
            r6 = r5[r2]
            java.lang.Object r7 = r6.g(r8)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Object r6 = r6.g(r9)
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r6 = defpackage.g04.z(r7, r6)
            if (r6 == 0) goto L39
            r3 = r6
            goto L3c
        L39:
            int r2 = r2 + 1
            goto L21
        L3c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r3 == 0) goto L43
            goto L44
        L43:
            r1 = 0
        L44:
            if (r1 == 0) goto L4b
            int r8 = r1.intValue()
            return r8
        L4b:
            int r1 = c(r4)
            int r0 = c(r0)
            int r0 = defpackage.nb3.p(r1, r0)
            if (r0 == 0) goto L5a
            return r0
        L5a:
            int r0 = r8.X
            int r1 = r9.X
            int r0 = defpackage.nb3.p(r0, r1)
            if (r0 == 0) goto L65
            return r0
        L65:
            int r8 = r8.Y
            int r9 = r9.Y
            int r8 = defpackage.nb3.p(r8, r9)
            return r8
        L6e:
            if (r4 != r0) goto L71
            return r3
        L71:
            if (r4 != r1) goto L75
            r8 = -1
            return r8
        L75:
            return r2
    }

    public final java.lang.String b(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "-"
            int r1 = r6.R
            int r2 = r6.L
            java.lang.String r3 = "."
            int r4 = r6.X
            int r6 = r6.B
            if (r4 != 0) goto L2d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r0)
            r4.append(r6)
            r4.append(r3)
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            return r6
        L2d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            r5.append(r3)
            r5.append(r2)
            r5.append(r3)
            r5.append(r1)
            r5.append(r0)
            r5.append(r7)
            r5.append(r4)
            java.lang.String r6 = r5.toString()
            return r6
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            bm7 r1 = (defpackage.bm7) r1
            int r0 = r0.a(r1)
            return r0
    }

    public final java.lang.String d() {
            r2 = this;
            int r2 = r2.Y
            if (r2 == 0) goto Lf
            r0 = 1
            java.lang.String r1 = ".fix"
            if (r2 == r0) goto Le
            java.lang.String r2 = defpackage.lb1.g(r2, r1)
            return r2
        Le:
            return r1
        Lf:
            java.lang.String r2 = ""
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.bm7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            bm7 r5 = (defpackage.bm7) r5
            wl7 r1 = r4.A
            wl7 r3 = r5.A
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.B
            int r3 = r5.B
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.L
            int r3 = r5.L
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.R
            int r3 = r5.R
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r4.X
            int r3 = r5.X
            if (r1 == r3) goto L2f
            return r2
        L2f:
            int r4 = r4.Y
            int r5 = r5.Y
            if (r4 == r5) goto L36
            return r2
        L36:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            wl7 r0 = r3.A
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.B
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.L
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.R
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.X
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.Y
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            int[] r0 = defpackage.xl7.a
            wl7 r1 = r6.A
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L87
            r1 = 2
            int r2 = r6.R
            int r3 = r6.L
            int r4 = r6.B
            java.lang.String r5 = "."
            if (r0 == r1) goto L6e
            r1 = 3
            if (r0 == r1) goto L5f
            r1 = 4
            if (r0 == r1) goto L50
            r1 = 5
            if (r0 != r1) goto L4b
            java.lang.String r0 = r6.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r5)
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            java.lang.String r2 = "-rc"
            r1.append(r2)
            int r6 = r6.X
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            return r6
        L4b:
            defpackage.i.d()
            r6 = 0
            return r6
        L50:
            java.lang.String r0 = "beta"
            java.lang.String r0 = r6.b(r0)
            java.lang.String r6 = r6.d()
            java.lang.String r6 = r0.concat(r6)
            return r6
        L5f:
            java.lang.String r0 = "alpha"
            java.lang.String r0 = r6.b(r0)
            java.lang.String r6 = r6.d()
            java.lang.String r6 = r0.concat(r6)
            return r6
        L6e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            r6.append(r3)
            r6.append(r5)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            return r6
        L87:
            java.lang.String r6 = "nightly"
            return r6
    }
}
