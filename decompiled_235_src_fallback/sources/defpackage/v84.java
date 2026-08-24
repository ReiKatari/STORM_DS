package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v84  reason: default package */
/* loaded from: classes.dex */
public final class v84 {
    public final defpackage.s9 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final java.util.ArrayList g;
    public final java.util.ArrayList h;

    public v84(defpackage.s9 r20, long r21, int r23, int r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            r0.<init>()
            r0.a = r1
            r2 = r23
            r0.b = r2
            int r2 = defpackage.q21.j(r21)
            if (r2 != 0) goto L1a
            int r2 = defpackage.q21.i(r21)
            if (r2 != 0) goto L1a
            goto L1f
        L1a:
            java.lang.String r2 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            defpackage.q53.a(r2)
        L1f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r1 = r1.e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            r5 = 0
            r12 = r5
            r5 = 0
            r10 = 0
        L30:
            if (r5 >= r3) goto Laa
            java.lang.Object r6 = r1.get(r5)
            zr4 r6 = (defpackage.zr4) r6
            gj r14 = r6.a
            int r7 = defpackage.q21.h(r21)
            boolean r8 = defpackage.q21.c(r21)
            if (r8 == 0) goto L56
            int r8 = defpackage.q21.g(r21)
            r23 = r5
            double r4 = (double) r12
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            int r8 = r8 - r4
            if (r8 >= 0) goto L5c
            r8 = 0
            goto L5c
        L56:
            r23 = r5
            int r8 = defpackage.q21.g(r21)
        L5c:
            r4 = 5
            r5 = 0
            long r17 = defpackage.s21.b(r5, r7, r5, r8, r4)
            int r4 = r0.b
            int r15 = r4 - r10
            cj r13 = new cj
            r16 = r24
            r13.<init>(r14, r15, r16, r17)
            float r4 = r13.b()
            float r4 = r4 + r12
            y37 r14 = r13.d
            int r7 = r14.g
            int r11 = r10 + r7
            yr4 r7 = new yr4
            int r8 = r6.b
            int r9 = r6.c
            r6 = r7
            r7 = r13
            r13 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.add(r6)
            boolean r4 = r14.d
            if (r4 != 0) goto La6
            int r4 = r0.b
            if (r11 != r4) goto L9e
            s9 r4 = r0.a
            java.lang.Object r4 = r4.e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = defpackage.hf.U(r4)
            r6 = r23
            if (r6 == r4) goto La0
            goto La6
        L9e:
            r6 = r23
        La0:
            int r4 = r6 + 1
            r5 = r4
            r10 = r11
            r12 = r13
            goto L30
        La6:
            r1 = 1
            r10 = r11
            r12 = r13
            goto Lac
        Laa:
            r5 = 0
            r1 = r5
        Lac:
            r0.e = r12
            r0.f = r10
            r0.c = r1
            r0.h = r2
            int r1 = defpackage.q21.h(r21)
            float r1 = (float) r1
            r0.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r2.size()
            r1.<init>(r3)
            int r3 = r2.size()
            r4 = r5
        Lc9:
            r6 = 0
            if (r4 >= r3) goto L100
            java.lang.Object r7 = r2.get(r4)
            yr4 r7 = (defpackage.yr4) r7
            cj r8 = r7.a
            java.util.List r8 = r8.f
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.size()
            r9.<init>(r10)
            int r10 = r8.size()
            r11 = r5
        Le4:
            if (r11 >= r10) goto Lfa
            java.lang.Object r12 = r8.get(r11)
            of5 r12 = (defpackage.of5) r12
            if (r12 == 0) goto Lf3
            of5 r12 = r7.a(r12)
            goto Lf4
        Lf3:
            r12 = r6
        Lf4:
            r9.add(r12)
            int r11 = r11 + 1
            goto Le4
        Lfa:
            defpackage.gt0.A0(r1, r9)
            int r4 = r4 + 1
            goto Lc9
        L100:
            int r2 = r1.size()
            s9 r3 = r0.a
            java.lang.Object r3 = r3.b
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            if (r2 >= r3) goto L131
            s9 r2 = r0.a
            java.lang.Object r2 = r2.b
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            int r3 = r1.size()
            int r2 = r2 - r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = r5
        L125:
            if (r4 >= r2) goto L12d
            r3.add(r6)
            int r4 = r4 + 1
            goto L125
        L12d:
            java.util.ArrayList r1 = defpackage.gt0.V0(r1, r3)
        L131:
            r0.g = r1
            return
    }

    public final void a(long r8, float[] r10) {
            r7 = this;
            int r0 = defpackage.k47.f(r8)
            r7.k(r0)
            int r0 = defpackage.k47.e(r8)
            r7.l(r0)
            bh5 r5 = new bh5
            r5.<init>()
            r0 = 0
            r5.A = r0
            ah5 r6 = new ah5
            r6.<init>()
            z50 r1 = new z50
            r2 = r8
            r4 = r10
            r1.<init>(r2, r4, r5, r6)
            java.util.ArrayList r7 = r7.h
            defpackage.uj2.C(r7, r2, r1)
            return
    }

    public final float b(int r3) {
            r2 = this;
            r2.m(r3)
            java.util.ArrayList r2 = r2.h
            int r0 = defpackage.uj2.A(r3, r2)
            java.lang.Object r2 = r2.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            cj r0 = r2.a
            int r1 = r2.d
            int r3 = r3 - r1
            y37 r0 = r0.d
            float r3 = r0.e(r3)
            float r2 = r2.f
            float r3 = r3 + r2
            return r3
    }

    public final int c(int r4, boolean r5) {
            r3 = this;
            r3.m(r4)
            java.util.ArrayList r3 = r3.h
            int r0 = defpackage.uj2.A(r4, r3)
            java.lang.Object r3 = r3.get(r0)
            yr4 r3 = (defpackage.yr4) r3
            cj r0 = r3.a
            int r1 = r3.d
            int r4 = r4 - r1
            y37 r0 = r0.d
            if (r5 == 0) goto L47
            android.text.Layout r5 = r0.f
            java.lang.ThreadLocal r1 = defpackage.d47.a
            int r1 = r5.getEllipsisCount(r4)
            if (r1 <= 0) goto L32
            android.text.TextUtils$TruncateAt r1 = r0.b
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            if (r1 != r2) goto L32
            int r0 = r5.getLineStart(r4)
            int r4 = r5.getEllipsisStart(r4)
            int r4 = r4 + r0
            goto L4b
        L32:
            s9 r5 = r0.c()
            java.lang.Object r0 = r5.a
            android.text.Layout r0 = (android.text.Layout) r0
            int r1 = r0.getLineEnd(r4)
            int r4 = r0.getLineStart(r4)
            int r4 = r5.C(r1, r4)
            goto L4b
        L47:
            int r4 = r0.f(r4)
        L4b:
            int r3 = r3.b
            int r4 = r4 + r3
            return r4
    }

    public final int d(int r2) {
            r1 = this;
            s9 r0 = r1.a
            java.lang.Object r0 = r0.a
            fp r0 = (defpackage.fp) r0
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            java.util.ArrayList r1 = r1.h
            if (r2 < r0) goto L15
            int r0 = defpackage.hf.U(r1)
            goto L1d
        L15:
            if (r2 >= 0) goto L19
            r0 = 0
            goto L1d
        L19:
            int r0 = defpackage.uj2.z(r2, r1)
        L1d:
            java.lang.Object r1 = r1.get(r0)
            yr4 r1 = (defpackage.yr4) r1
            cj r0 = r1.a
            int r2 = r1.d(r2)
            y37 r0 = r0.d
            android.text.Layout r0 = r0.f
            int r2 = r0.getLineForOffset(r2)
            int r1 = r1.d
            int r2 = r2 + r1
            return r2
    }

    public final int e(float r3) {
            r2 = this;
            java.util.ArrayList r2 = r2.h
            int r0 = defpackage.uj2.B(r2, r3)
            java.lang.Object r2 = r2.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            int r0 = r2.c
            int r1 = r2.b
            int r0 = r0 - r1
            int r1 = r2.d
            if (r0 != 0) goto L16
            return r1
        L16:
            cj r0 = r2.a
            float r2 = r2.f
            float r3 = r3 - r2
            y37 r2 = r0.d
            int r3 = (int) r3
            android.text.Layout r0 = r2.f
            int r2 = r2.h
            int r3 = r3 - r2
            int r2 = r0.getLineForVertical(r3)
            int r2 = r2 + r1
            return r2
    }

    public final float f(int r3) {
            r2 = this;
            r2.m(r3)
            java.util.ArrayList r2 = r2.h
            int r0 = defpackage.uj2.A(r3, r2)
            java.lang.Object r2 = r2.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            cj r0 = r2.a
            int r1 = r2.d
            int r3 = r3 - r1
            y37 r0 = r0.d
            float r3 = r0.g(r3)
            float r2 = r2.f
            float r3 = r3 + r2
            return r3
    }

    public final int g(long r9) {
            r8 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r9 & r0
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            java.util.ArrayList r8 = r8.h
            int r3 = defpackage.uj2.B(r8, r3)
            java.lang.Object r8 = r8.get(r3)
            yr4 r8 = (defpackage.yr4) r8
            int r3 = r8.c
            int r4 = r8.b
            int r3 = r3 - r4
            if (r3 != 0) goto L20
            return r4
        L20:
            cj r3 = r8.a
            r5 = 32
            long r9 = r9 >> r5
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = java.lang.Float.intBitsToFloat(r2)
            float r8 = r8.f
            float r10 = r10 - r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r6 = (long) r10
            long r8 = r8 << r5
            long r6 = r6 & r0
            long r8 = r8 | r6
            y37 r10 = r3.d
            long r0 = r0 & r8
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (int) r0
            android.text.Layout r1 = r10.f
            int r2 = r10.h
            int r0 = r0 - r2
            int r0 = r1.getLineForVertical(r0)
            long r8 = r8 >> r5
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            android.text.Layout r9 = r10.f
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r10.b(r0)
            float r10 = r10 * r1
            float r10 = r10 + r8
            int r8 = r9.getOffsetForHorizontal(r0, r10)
            int r8 = r8 + r4
            return r8
    }

    public final long h(defpackage.of5 r11, int r12, defpackage.fa6 r13) {
            r10 = this;
            float r0 = r11.b
            java.util.ArrayList r10 = r10.h
            int r0 = defpackage.uj2.B(r10, r0)
            java.lang.Object r1 = r10.get(r0)
            yr4 r1 = (defpackage.yr4) r1
            float r1 = r1.g
            float r2 = r11.d
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            if (r1 >= 0) goto L85
            int r1 = defpackage.hf.U(r10)
            if (r0 != r1) goto L1e
            goto L85
        L1e:
            int r1 = defpackage.uj2.B(r10, r2)
            long r4 = defpackage.k47.b
        L24:
            long r6 = defpackage.k47.b
            boolean r2 = defpackage.k47.b(r4, r6)
            if (r2 == 0) goto L45
            if (r0 > r1) goto L45
            java.lang.Object r2 = r10.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            cj r4 = r2.a
            of5 r5 = r2.c(r11)
            long r4 = r4.c(r5, r12, r13)
            long r4 = r2.b(r4, r3)
            int r0 = r0 + 1
            goto L24
        L45:
            boolean r2 = defpackage.k47.b(r4, r6)
            if (r2 == 0) goto L4c
            return r6
        L4c:
            long r8 = defpackage.k47.b
            boolean r2 = defpackage.k47.b(r6, r8)
            if (r2 == 0) goto L6d
            if (r0 > r1) goto L6d
            java.lang.Object r2 = r10.get(r1)
            yr4 r2 = (defpackage.yr4) r2
            cj r6 = r2.a
            of5 r7 = r2.c(r11)
            long r6 = r6.c(r7, r12, r13)
            long r6 = r2.b(r6, r3)
            int r1 = r1 + (-1)
            goto L4c
        L6d:
            boolean r10 = defpackage.k47.b(r6, r8)
            if (r10 == 0) goto L74
            return r4
        L74:
            r10 = 32
            long r10 = r4 >> r10
            int r10 = (int) r10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r6
            int r11 = (int) r11
            long r10 = defpackage.jx2.f(r10, r11)
            return r10
        L85:
            java.lang.Object r10 = r10.get(r0)
            yr4 r10 = (defpackage.yr4) r10
            cj r0 = r10.a
            of5 r11 = r10.c(r11)
            long r11 = r0.c(r11, r12, r13)
            long r10 = r10.b(r11, r3)
            return r10
    }

    public final void i(defpackage.xj0 r11, long r12, defpackage.ge6 r14, defpackage.b17 r15, defpackage.oo1 r16) {
            r10 = this;
            r11.h()
            java.util.ArrayList r10 = r10.h
            int r0 = r10.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L2a
            java.lang.Object r2 = r10.get(r1)
            yr4 r2 = (defpackage.yr4) r2
            cj r3 = r2.a
            r4 = r11
            r5 = r12
            r7 = r14
            r8 = r15
            r9 = r16
            r3.f(r4, r5, r7, r8, r9)
            cj r2 = r2.a
            float r2 = r2.b()
            r3 = 0
            r11.o(r3, r2)
            int r1 = r1 + 1
            goto La
        L2a:
            r11.p()
            return
    }

    public final void j(defpackage.xj0 r10, defpackage.f80 r11, float r12, defpackage.ge6 r13, defpackage.b17 r14, defpackage.oo1 r15) {
            r9 = this;
            r10.h()
            java.util.ArrayList r0 = r9.h
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L11
            defpackage.q60.w(r9, r10, r11, r12, r13, r14, r15)
            goto L90
        L11:
            boolean r1 = r11 instanceof defpackage.cn6
            if (r1 == 0) goto L1a
            defpackage.q60.w(r9, r10, r11, r12, r13, r14, r15)
            goto L90
        L1a:
            boolean r9 = r11 instanceof defpackage.xd6
            if (r9 == 0) goto L94
            int r9 = r0.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
            r5 = r4
        L27:
            if (r3 >= r9) goto L43
            java.lang.Object r6 = r0.get(r3)
            yr4 r6 = (defpackage.yr4) r6
            cj r7 = r6.a
            float r7 = r7.b()
            float r5 = r5 + r7
            cj r6 = r6.a
            float r6 = r6.d()
            float r4 = java.lang.Math.max(r4, r6)
            int r3 = r3 + 1
            goto L27
        L43:
            xd6 r11 = (defpackage.xd6) r11
            int r9 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r9
            r9 = 32
            long r3 = r3 << r9
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r3 = r3 | r5
            android.graphics.Shader r3 = r11.b(r3)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r3.getLocalMatrix(r4)
            int r5 = r0.size()
        L69:
            if (r1 >= r5) goto L90
            java.lang.Object r9 = r0.get(r1)
            yr4 r9 = (defpackage.yr4) r9
            cj r9 = r9.a
            g80 r11 = new g80
            r11.<init>(r3)
            r9.g(r10, r11, r12, r13, r14, r15)
            float r11 = r9.b()
            r10.o(r2, r11)
            float r9 = r9.b()
            float r9 = -r9
            r4.setTranslate(r2, r9)
            r3.setLocalMatrix(r4)
            int r1 = r1 + 1
            goto L69
        L90:
            r10.p()
            return
        L94:
            defpackage.i.d()
            return
    }

    public final void k(int r3) {
            r2 = this;
            s9 r2 = r2.a
            java.lang.Object r2 = r2.a
            fp r2 = (defpackage.fp) r2
            if (r3 < 0) goto L11
            java.lang.String r0 = r2.B
            int r0 = r0.length()
            if (r3 >= r0) goto L11
            return
        L11:
            java.lang.String r0 = "offset("
            java.lang.String r1 = ") is out of bounds [0, "
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            r3.append(r2)
            r2 = 41
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.q53.a(r2)
            return
    }

    public final void l(int r3) {
            r2 = this;
            s9 r2 = r2.a
            java.lang.Object r2 = r2.a
            fp r2 = (defpackage.fp) r2
            if (r3 < 0) goto L11
            java.lang.String r0 = r2.B
            int r0 = r0.length()
            if (r3 > r0) goto L11
            return
        L11:
            java.lang.String r0 = "offset("
            java.lang.String r1 = ") is out of bounds [0, "
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            r3.append(r2)
            r2 = 93
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.q53.a(r2)
            return
    }

    public final void m(int r3) {
            r2 = this;
            r0 = 0
            int r2 = r2.f
            if (r3 < 0) goto L8
            if (r3 >= r2) goto L8
            r0 = 1
        L8:
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lineIndex("
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ") is out of bounds [0, "
            r0.append(r3)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            defpackage.q53.a(r2)
        L28:
            return
    }
}
