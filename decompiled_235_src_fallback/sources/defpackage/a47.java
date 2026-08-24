package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a47  reason: default package */
/* loaded from: classes.dex */
public final class a47 {
    public final defpackage.z37 a;
    public final defpackage.v84 b;
    public final long c;
    public final float d;
    public final float e;
    public final java.util.ArrayList f;

    public a47(defpackage.z37 r2, defpackage.v84 r3, long r4) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            java.util.ArrayList r2 = r3.h
            boolean r4 = r2.isEmpty()
            r5 = 0
            if (r4 == 0) goto L14
            r4 = r5
            goto L23
        L14:
            r4 = 0
            java.lang.Object r0 = r2.get(r4)
            yr4 r0 = (defpackage.yr4) r0
            cj r0 = r0.a
            y37 r0 = r0.d
            float r4 = r0.d(r4)
        L23:
            r1.d = r4
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L2c
            goto L42
        L2c:
            java.lang.Object r2 = defpackage.gt0.Q0(r2)
            yr4 r2 = (defpackage.yr4) r2
            cj r4 = r2.a
            y37 r4 = r4.d
            int r5 = r4.g
            int r5 = r5 + (-1)
            float r4 = r4.d(r5)
            float r2 = r2.f
            float r5 = r4 + r2
        L42:
            r1.e = r5
            java.util.ArrayList r2 = r3.g
            r1.f = r2
            return
    }

    public final defpackage.jl5 a(int r2) {
            r1 = this;
            v84 r1 = r1.b
            r1.l(r2)
            s9 r0 = r1.a
            java.lang.Object r0 = r0.a
            fp r0 = (defpackage.fp) r0
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            java.util.ArrayList r1 = r1.h
            if (r2 != r0) goto L1a
            int r0 = defpackage.hf.U(r1)
            goto L1e
        L1a:
            int r0 = defpackage.uj2.z(r2, r1)
        L1e:
            java.lang.Object r1 = r1.get(r0)
            yr4 r1 = (defpackage.yr4) r1
            cj r0 = r1.a
            int r1 = r1.d(r2)
            y37 r2 = r0.d
            android.text.Layout r2 = r2.f
            boolean r1 = r2.isRtlCharAt(r1)
            if (r1 == 0) goto L37
            jl5 r1 = defpackage.jl5.Rtl
            return r1
        L37:
            jl5 r1 = defpackage.jl5.Ltr
            return r1
    }

    public final defpackage.of5 b(int r9) {
            r8 = this;
            v84 r8 = r8.b
            r8.k(r9)
            java.util.ArrayList r8 = r8.h
            int r0 = defpackage.uj2.z(r9, r8)
            java.lang.Object r8 = r8.get(r0)
            yr4 r8 = (defpackage.yr4) r8
            cj r0 = r8.a
            int r9 = r8.d(r9)
            java.lang.CharSequence r1 = r0.e
            if (r9 < 0) goto L22
            int r2 = r1.length()
            if (r9 >= r2) goto L22
            goto L3d
        L22:
            java.lang.String r2 = "offset("
            java.lang.String r3 = ") is out of bounds [0,"
            java.lang.StringBuilder r2 = defpackage.xg6.t(r2, r9, r3)
            int r1 = r1.length()
            r2.append(r1)
            r1 = 41
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.q53.a(r1)
        L3d:
            y37 r0 = r0.d
            android.text.Layout r1 = r0.f
            int r2 = r1.getLineForOffset(r9)
            float r3 = r0.g(r2)
            float r4 = r0.e(r2)
            int r2 = r1.getParagraphDirection(r2)
            r5 = 1
            r6 = 0
            if (r2 != r5) goto L57
            r2 = r5
            goto L58
        L57:
            r2 = r6
        L58:
            boolean r1 = r1.isRtlCharAt(r9)
            if (r2 == 0) goto L6a
            if (r1 != 0) goto L6a
            float r1 = r0.h(r9, r6)
            int r9 = r9 + r5
            float r9 = r0.h(r9, r5)
            goto L90
        L6a:
            if (r2 == 0) goto L7b
            if (r1 == 0) goto L7b
            float r1 = r0.i(r9, r6)
            int r9 = r9 + r5
            float r9 = r0.i(r9, r5)
        L77:
            r7 = r1
            r1 = r9
            r9 = r7
            goto L90
        L7b:
            if (r1 == 0) goto L87
            float r1 = r0.h(r9, r6)
            int r9 = r9 + r5
            float r9 = r0.h(r9, r5)
            goto L77
        L87:
            float r1 = r0.i(r9, r6)
            int r9 = r9 + r5
            float r9 = r0.i(r9, r5)
        L90:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1, r3, r9, r4)
            of5 r9 = new of5
            float r1 = r0.left
            float r2 = r0.top
            float r3 = r0.right
            float r0 = r0.bottom
            r9.<init>(r1, r2, r3, r0)
            of5 r8 = r8.a(r9)
            return r8
    }

    public final defpackage.of5 c(int r5) {
            r4 = this;
            v84 r4 = r4.b
            r4.l(r5)
            s9 r0 = r4.a
            java.lang.Object r0 = r0.a
            fp r0 = (defpackage.fp) r0
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            java.util.ArrayList r4 = r4.h
            if (r5 != r0) goto L1a
            int r0 = defpackage.hf.U(r4)
            goto L1e
        L1a:
            int r0 = defpackage.uj2.z(r5, r4)
        L1e:
            java.lang.Object r4 = r4.get(r0)
            yr4 r4 = (defpackage.yr4) r4
            cj r0 = r4.a
            int r5 = r4.d(r5)
            java.lang.CharSequence r1 = r0.e
            y37 r0 = r0.d
            if (r5 < 0) goto L37
            int r2 = r1.length()
            if (r5 > r2) goto L37
            goto L52
        L37:
            java.lang.String r2 = "offset("
            java.lang.String r3 = ") is out of bounds [0,"
            java.lang.StringBuilder r2 = defpackage.xg6.t(r2, r5, r3)
            int r1 = r1.length()
            r2.append(r1)
            r1 = 93
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.q53.a(r1)
        L52:
            r1 = 0
            float r1 = r0.h(r5, r1)
            android.text.Layout r2 = r0.f
            int r5 = r2.getLineForOffset(r5)
            of5 r2 = new of5
            float r3 = r0.g(r5)
            float r5 = r0.e(r5)
            r2.<init>(r1, r3, r1, r5)
            of5 r4 = r4.a(r2)
            return r4
    }

    public final boolean d() {
            r5 = this;
            r0 = 32
            long r1 = r5.c
            long r3 = r1 >> r0
            int r0 = (int) r3
            float r0 = (float) r0
            v84 r5 = r5.b
            float r3 = r5.d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
            goto L27
        L11:
            boolean r0 = r5.c
            if (r0 != 0) goto L27
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r1 & r3
            int r0 = (int) r0
            float r0 = (float) r0
            float r5 = r5.e
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L25
            goto L27
        L25:
            r5 = 0
            return r5
        L27:
            r5 = 1
            return r5
    }

    public final float e(int r3) {
            r2 = this;
            v84 r2 = r2.b
            r2.m(r3)
            java.util.ArrayList r2 = r2.h
            int r0 = defpackage.uj2.A(r3, r2)
            java.lang.Object r2 = r2.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            cj r0 = r2.a
            int r2 = r2.d
            int r3 = r3 - r2
            y37 r2 = r0.d
            android.text.Layout r0 = r2.f
            float r0 = r0.getLineLeft(r3)
            int r1 = r2.g
            int r1 = r1 + (-1)
            if (r3 != r1) goto L27
            float r2 = r2.j
            goto L28
        L27:
            r2 = 0
        L28:
            float r0 = r0 + r2
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L3
            goto L43
        L3:
            boolean r0 = r7 instanceof defpackage.a47
            r1 = 0
            if (r0 != 0) goto L9
            goto L45
        L9:
            a47 r7 = (defpackage.a47) r7
            z37 r0 = r7.a
            z37 r2 = r6.a
            boolean r0 = defpackage.nb3.k(r2, r0)
            if (r0 != 0) goto L16
            goto L45
        L16:
            v84 r0 = r6.b
            v84 r2 = r7.b
            if (r0 == r2) goto L1d
            return r1
        L1d:
            long r2 = r6.c
            long r4 = r7.c
            boolean r0 = defpackage.q93.b(r2, r4)
            if (r0 != 0) goto L28
            goto L45
        L28:
            float r0 = r6.d
            float r2 = r7.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L45
            float r0 = r6.e
            float r2 = r7.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L45
            java.util.ArrayList r6 = r6.f
            java.util.ArrayList r7 = r7.f
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 != 0) goto L43
            goto L45
        L43:
            r6 = 1
            return r6
        L45:
            return r1
    }

    public final float f(int r3) {
            r2 = this;
            v84 r2 = r2.b
            r2.m(r3)
            java.util.ArrayList r2 = r2.h
            int r0 = defpackage.uj2.A(r3, r2)
            java.lang.Object r2 = r2.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            cj r0 = r2.a
            int r2 = r2.d
            int r3 = r3 - r2
            y37 r2 = r0.d
            android.text.Layout r0 = r2.f
            float r0 = r0.getLineRight(r3)
            int r1 = r2.g
            int r1 = r1 + (-1)
            if (r3 != r1) goto L27
            float r2 = r2.k
            goto L28
        L27:
            r2 = 0
        L28:
            float r0 = r0 + r2
            return r0
    }

    public final int g(int r3) {
            r2 = this;
            v84 r2 = r2.b
            r2.m(r3)
            java.util.ArrayList r2 = r2.h
            int r0 = defpackage.uj2.A(r3, r2)
            java.lang.Object r2 = r2.get(r0)
            yr4 r2 = (defpackage.yr4) r2
            cj r0 = r2.a
            int r1 = r2.d
            int r3 = r3 - r1
            y37 r0 = r0.d
            android.text.Layout r0 = r0.f
            int r3 = r0.getLineStart(r3)
            int r2 = r2.b
            int r3 = r3 + r2
            return r3
    }

    public final defpackage.jl5 h(int r2) {
            r1 = this;
            v84 r1 = r1.b
            r1.l(r2)
            s9 r0 = r1.a
            java.lang.Object r0 = r0.a
            fp r0 = (defpackage.fp) r0
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            java.util.ArrayList r1 = r1.h
            if (r2 != r0) goto L1a
            int r0 = defpackage.hf.U(r1)
            goto L1e
        L1a:
            int r0 = defpackage.uj2.z(r2, r1)
        L1e:
            java.lang.Object r1 = r1.get(r0)
            yr4 r1 = (defpackage.yr4) r1
            cj r0 = r1.a
            int r1 = r1.d(r2)
            y37 r2 = r0.d
            android.text.Layout r0 = r2.f
            int r1 = r0.getLineForOffset(r1)
            android.text.Layout r2 = r2.f
            int r1 = r2.getParagraphDirection(r1)
            r2 = 1
            if (r1 != r2) goto L3e
            jl5 r1 = defpackage.jl5.Ltr
            return r1
        L3e:
            jl5 r1 = defpackage.jl5.Rtl
            return r1
    }

    public final int hashCode() {
            r5 = this;
            z37 r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            v84 r2 = r5.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.c
            int r0 = defpackage.i61.c(r3, r2, r1)
            float r2 = r5.d
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r5.e
            int r0 = defpackage.xg6.a(r2, r0, r1)
            java.util.ArrayList r5 = r5.f
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }

    public final defpackage.hj i(int r6, int r7) {
            r5 = this;
            v84 r5 = r5.b
            s9 r0 = r5.a
            java.lang.Object r0 = r0.a
            fp r0 = (defpackage.fp) r0
            if (r6 < 0) goto L15
            if (r6 > r7) goto L15
            java.lang.String r1 = r0.B
            int r1 = r1.length()
            if (r7 > r1) goto L15
            goto L34
        L15:
            java.lang.String r1 = ") or End("
            java.lang.String r2 = ") is out of range [0.."
            java.lang.String r3 = "Start("
            java.lang.StringBuilder r1 = defpackage.i61.q(r6, r7, r3, r1, r2)
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            r1.append(r0)
            java.lang.String r0 = "), or start > end!"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.q53.a(r0)
        L34:
            if (r6 != r7) goto L3b
            hj r5 = defpackage.lj.a()
            return r5
        L3b:
            hj r0 = defpackage.lj.a()
            java.util.ArrayList r5 = r5.h
            long r1 = defpackage.jx2.f(r6, r7)
            u84 r3 = new u84
            r4 = 0
            r3.<init>(r0, r6, r7, r4)
            defpackage.uj2.C(r5, r1, r3)
            return r0
    }

    public final long j(int r6) {
            r5 = this;
            v84 r5 = r5.b
            r5.l(r6)
            s9 r0 = r5.a
            java.lang.Object r0 = r0.a
            fp r0 = (defpackage.fp) r0
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            java.util.ArrayList r5 = r5.h
            if (r6 != r0) goto L1a
            int r0 = defpackage.hf.U(r5)
            goto L1e
        L1a:
            int r0 = defpackage.uj2.z(r6, r5)
        L1e:
            java.lang.Object r5 = r5.get(r0)
            yr4 r5 = (defpackage.yr4) r5
            cj r0 = r5.a
            int r6 = r5.d(r6)
            y37 r0 = r0.d
            m42 r0 = r0.j()
            int r1 = r0.j(r6)
            boolean r1 = r0.h(r1)
            r2 = -1
            if (r1 == 0) goto L53
            r0.a(r6)
            r1 = r6
        L3f:
            if (r1 == r2) goto L7c
            boolean r3 = r0.h(r1)
            if (r3 == 0) goto L4e
            boolean r3 = r0.d(r1)
            if (r3 != 0) goto L4e
            goto L7c
        L4e:
            int r1 = r0.j(r1)
            goto L3f
        L53:
            r0.a(r6)
            boolean r1 = r0.g(r6)
            if (r1 == 0) goto L70
            boolean r1 = r0.e(r6)
            if (r1 == 0) goto L6b
            boolean r1 = r0.c(r6)
            if (r1 == 0) goto L69
            goto L6b
        L69:
            r1 = r6
            goto L7c
        L6b:
            int r1 = r0.j(r6)
            goto L7c
        L70:
            boolean r1 = r0.c(r6)
            if (r1 == 0) goto L7b
            int r1 = r0.j(r6)
            goto L7c
        L7b:
            r1 = r2
        L7c:
            if (r1 != r2) goto L7f
            r1 = r6
        L7f:
            int r3 = r0.i(r6)
            boolean r3 = r0.d(r3)
            if (r3 == 0) goto La1
            r0.a(r6)
            r3 = r6
        L8d:
            if (r3 == r2) goto Lcb
            boolean r4 = r0.h(r3)
            if (r4 != 0) goto L9c
            boolean r4 = r0.d(r3)
            if (r4 == 0) goto L9c
            goto Lcb
        L9c:
            int r3 = r0.i(r3)
            goto L8d
        La1:
            r0.a(r6)
            boolean r3 = r0.c(r6)
            if (r3 == 0) goto Lbf
            boolean r3 = r0.e(r6)
            if (r3 == 0) goto Lb9
            boolean r3 = r0.g(r6)
            if (r3 == 0) goto Lb7
            goto Lb9
        Lb7:
            r3 = r6
            goto Lcb
        Lb9:
            int r0 = r0.i(r6)
        Lbd:
            r3 = r0
            goto Lcb
        Lbf:
            boolean r3 = r0.g(r6)
            if (r3 == 0) goto Lca
            int r0 = r0.i(r6)
            goto Lbd
        Lca:
            r3 = r2
        Lcb:
            if (r3 != r2) goto Lce
            goto Lcf
        Lce:
            r6 = r3
        Lcf:
            long r0 = defpackage.jx2.f(r1, r6)
            r6 = 0
            long r5 = r5.b(r0, r6)
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextLayoutResult(layoutInput="
            r0.<init>(r1)
            z37 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", multiParagraph="
            r0.append(r1)
            v84 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.c
            java.lang.String r1 = defpackage.q93.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", firstBaseline="
            r0.append(r1)
            float r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", lastBaseline="
            r0.append(r1)
            float r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", placeholderRects="
            r0.append(r1)
            java.util.ArrayList r3 = r3.f
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
