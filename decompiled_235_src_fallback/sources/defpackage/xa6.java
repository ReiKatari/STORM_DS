package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa6  reason: default package */
/* loaded from: classes.dex */
public final class xa6 {
    public final defpackage.z64 a;
    public final boolean b;
    public final defpackage.sm3 c;
    public final defpackage.ta6 d;
    public defpackage.xa6 e;
    public final int f;

    public xa6(defpackage.z64 r1, boolean r2, defpackage.sm3 r3, defpackage.ta6 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            int r1 = r3.B
            r0.f = r1
            return
    }

    public static /* synthetic */ java.util.List j(int r3, defpackage.xa6 r4) {
            r0 = r3 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            boolean r0 = r4.b
            r0 = r0 ^ r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            java.util.List r3 = r4.i(r0, r1)
            return r3
    }

    public final defpackage.of5 a(defpackage.eg4 r10) {
            r9 = this;
            xa6 r9 = r9.l()
            if (r9 != 0) goto L9
            of5 r9 = defpackage.of5.e
            return r9
        L9:
            sm3 r0 = r9.c
            if0 r0 = r0.B0
            java.lang.Object r0 = r0.g
            z64 r0 = (defpackage.z64) r0
            int r1 = r0.R
            r2 = 8
            r1 = r1 & r2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
        L1a:
            if (r0 == 0) goto L76
            int r1 = r0.L
            r1 = r1 & r2
            if (r1 == 0) goto L6e
            r1 = r0
            r5 = r4
        L23:
            if (r1 == 0) goto L6e
            boolean r6 = r1 instanceof defpackage.va6
            if (r6 == 0) goto L33
            r6 = r1
            va6 r6 = (defpackage.va6) r6
            boolean r6 = r6.j()
            if (r6 == 0) goto L69
            goto L77
        L33:
            int r6 = r1.L
            r6 = r6 & r2
            if (r6 == 0) goto L69
            boolean r6 = r1 instanceof defpackage.zg1
            if (r6 == 0) goto L69
            r6 = r1
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = 0
        L42:
            if (r6 == 0) goto L66
            int r8 = r6.L
            r8 = r8 & r2
            if (r8 == 0) goto L63
            int r7 = r7 + 1
            if (r7 != r3) goto L4f
            r1 = r6
            goto L63
        L4f:
            if (r5 != 0) goto L5a
            ua4 r5 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r5.<init>(r8)
        L5a:
            if (r1 == 0) goto L60
            r5.b(r1)
            r1 = r4
        L60:
            r5.b(r6)
        L63:
            z64 r6 = r6.Y
            goto L42
        L66:
            if (r7 != r3) goto L69
            goto L23
        L69:
            z64 r1 = defpackage.nc1.A(r5)
            goto L23
        L6e:
            int r1 = r0.R
            r1 = r1 & r2
            if (r1 == 0) goto L76
            z64 r0 = r0.Y
            goto L1a
        L76:
            r1 = r4
        L77:
            va6 r1 = (defpackage.va6) r1
            if (r1 == 0) goto L7f
            eg4 r4 = defpackage.nc1.d0(r1, r2)
        L7f:
            if (r4 != 0) goto L86
            of5 r9 = r9.a(r10)
            return r9
        L86:
            of5 r9 = r4.O(r10, r3)
            return r9
    }

    public final defpackage.xa6 b(defpackage.mq5 r6, defpackage.qn2 r7) {
            r5 = this;
            ta6 r0 = new ta6
            r0.<init>()
            r1 = 0
            r0.L = r1
            r0.R = r1
            r7.g(r0)
            xa6 r2 = new xa6
            wa6 r3 = new wa6
            r3.<init>(r7)
            sm3 r7 = new sm3
            int r4 = r5.f
            if (r6 == 0) goto L1f
            r6 = 1000000000(0x3b9aca00, float:0.0047237873)
        L1d:
            int r4 = r4 + r6
            goto L23
        L1f:
            r6 = 2000000000(0x77359400, float:3.682842E33)
            goto L1d
        L23:
            r6 = 1
            r7.<init>(r6, r4)
            r2.<init>(r3, r1, r7, r0)
            r2.e = r5
            return r2
    }

    public final void c(defpackage.sm3 r6, java.util.ArrayList r7) {
            r5 = this;
            ua4 r6 = r6.y()
            java.lang.Object[] r0 = r6.A
            int r6 = r6.L
            r1 = 0
        L9:
            if (r1 >= r6) goto L33
            r2 = r0[r1]
            sm3 r2 = (defpackage.sm3) r2
            boolean r3 = r2.H()
            if (r3 == 0) goto L30
            boolean r3 = r2.K0
            if (r3 != 0) goto L30
            if0 r3 = r2.B0
            r4 = 8
            boolean r3 = r3.g(r4)
            if (r3 == 0) goto L2d
            boolean r3 = r5.b
            xa6 r2 = defpackage.kn2.h(r2, r3)
            r7.add(r2)
            goto L30
        L2d:
            r5.c(r2, r7)
        L30:
            int r1 = r1 + 1
            goto L9
        L33:
            return
    }

    public final defpackage.eg4 d() {
            r1 = this;
            boolean r0 = r1.o()
            if (r0 == 0) goto L13
            xa6 r1 = r1.l()
            if (r1 == 0) goto L11
            eg4 r1 = r1.d()
            return r1
        L11:
            r1 = 0
            return r1
        L13:
            va6 r0 = r1.f()
            if (r0 == 0) goto L20
            r1 = 8
            eg4 r1 = defpackage.nc1.d0(r0, r1)
            return r1
        L20:
            sm3 r1 = r1.c
            if0 r1 = r1.B0
            java.lang.Object r1 = r1.d
            y53 r1 = (defpackage.y53) r1
            return r1
    }

    public final void e(java.util.ArrayList r4, java.util.ArrayList r5) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
            r3.s(r4, r1)
            int r3 = r4.size()
        Lc:
            if (r0 >= r3) goto L2a
            java.lang.Object r1 = r4.get(r0)
            xa6 r1 = (defpackage.xa6) r1
            boolean r2 = r1.p()
            if (r2 == 0) goto L1e
            r5.add(r1)
            goto L27
        L1e:
            ta6 r2 = r1.d
            boolean r2 = r2.R
            if (r2 != 0) goto L27
            r1.e(r4, r5)
        L27:
            int r0 = r0 + 1
            goto Lc
        L2a:
            return
    }

    public final defpackage.va6 f() {
            r10 = this;
            ta6 r0 = r10.d
            boolean r0 = r0.L
            r1 = 16
            r2 = 0
            r3 = 1
            r4 = 0
            sm3 r10 = r10.c
            if (r0 == 0) goto L89
            if0 r10 = r10.B0
            java.lang.Object r10 = r10.g
            z64 r10 = (defpackage.z64) r10
            int r0 = r10.R
            r0 = r0 & 8
            if (r0 == 0) goto Lf3
            r0 = r4
        L1a:
            if (r10 == 0) goto L86
            int r5 = r10.L
            r5 = r5 & 8
            if (r5 == 0) goto L7d
            r5 = r10
            r6 = r4
        L24:
            if (r5 == 0) goto L7d
            boolean r7 = r5 instanceof defpackage.va6
            if (r7 == 0) goto L3f
            r7 = r5
            va6 r7 = (defpackage.va6) r7
            boolean r8 = r7.j()
            if (r8 == 0) goto L3d
            boolean r8 = r7.C0()
            if (r8 == 0) goto L3a
            return r7
        L3a:
            if (r0 != 0) goto L3d
            r0 = r7
        L3d:
            r7 = r2
            goto L40
        L3f:
            r7 = r3
        L40:
            if (r7 == 0) goto L78
            int r7 = r5.L
            r7 = r7 & 8
            if (r7 == 0) goto L78
            boolean r7 = r5 instanceof defpackage.zg1
            if (r7 == 0) goto L78
            r7 = r5
            zg1 r7 = (defpackage.zg1) r7
            z64 r7 = r7.l0
            r8 = r2
        L52:
            if (r7 == 0) goto L75
            int r9 = r7.L
            r9 = r9 & 8
            if (r9 == 0) goto L72
            int r8 = r8 + 1
            if (r8 != r3) goto L60
            r5 = r7
            goto L72
        L60:
            if (r6 != 0) goto L69
            ua4 r6 = new ua4
            z64[] r9 = new defpackage.z64[r1]
            r6.<init>(r9)
        L69:
            if (r5 == 0) goto L6f
            r6.b(r5)
            r5 = r4
        L6f:
            r6.b(r7)
        L72:
            z64 r7 = r7.Y
            goto L52
        L75:
            if (r8 != r3) goto L78
            goto L24
        L78:
            z64 r5 = defpackage.nc1.A(r6)
            goto L24
        L7d:
            int r5 = r10.R
            r5 = r5 & 8
            if (r5 == 0) goto L86
            z64 r10 = r10.Y
            goto L1a
        L86:
            r4 = r0
            goto Lf3
        L89:
            if0 r10 = r10.B0
            java.lang.Object r10 = r10.g
            z64 r10 = (defpackage.z64) r10
            int r0 = r10.R
            r0 = r0 & 8
            if (r0 == 0) goto Lf3
        L95:
            if (r10 == 0) goto Lf3
            int r0 = r10.L
            r0 = r0 & 8
            if (r0 == 0) goto Lea
            r0 = r10
            r5 = r4
        L9f:
            if (r0 == 0) goto Lea
            boolean r6 = r0 instanceof defpackage.va6
            if (r6 == 0) goto Laf
            r6 = r0
            va6 r6 = (defpackage.va6) r6
            boolean r6 = r6.j()
            if (r6 == 0) goto Le5
            goto L86
        Laf:
            int r6 = r0.L
            r6 = r6 & 8
            if (r6 == 0) goto Le5
            boolean r6 = r0 instanceof defpackage.zg1
            if (r6 == 0) goto Le5
            r6 = r0
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = r2
        Lbf:
            if (r6 == 0) goto Le2
            int r8 = r6.L
            r8 = r8 & 8
            if (r8 == 0) goto Ldf
            int r7 = r7 + 1
            if (r7 != r3) goto Lcd
            r0 = r6
            goto Ldf
        Lcd:
            if (r5 != 0) goto Ld6
            ua4 r5 = new ua4
            z64[] r8 = new defpackage.z64[r1]
            r5.<init>(r8)
        Ld6:
            if (r0 == 0) goto Ldc
            r5.b(r0)
            r0 = r4
        Ldc:
            r5.b(r6)
        Ldf:
            z64 r6 = r6.Y
            goto Lbf
        Le2:
            if (r7 != r3) goto Le5
            goto L9f
        Le5:
            z64 r0 = defpackage.nc1.A(r5)
            goto L9f
        Lea:
            int r0 = r10.R
            r0 = r0 & 8
            if (r0 == 0) goto Lf3
            z64 r10 = r10.Y
            goto L95
        Lf3:
            va6 r4 = (defpackage.va6) r4
            return r4
    }

    public final defpackage.of5 g() {
            r2 = this;
            eg4 r2 = r2.d()
            if (r2 == 0) goto L1c
            z64 r0 = r2.Y0()
            boolean r0 = r0.j0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L1c
            jk3 r0 = defpackage.ej2.w(r2)
            r1 = 1
            of5 r2 = r0.O(r2, r1)
            return r2
        L1c:
            of5 r2 = defpackage.of5.e
            return r2
    }

    public final defpackage.of5 h() {
            r1 = this;
            eg4 r1 = r1.d()
            if (r1 == 0) goto L18
            z64 r0 = r1.Y0()
            boolean r0 = r0.j0
            if (r0 == 0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L18
            r0 = 1
            of5 r1 = defpackage.ej2.k(r1, r0)
            return r1
        L18:
            of5 r1 = defpackage.of5.e
            return r1
    }

    public final java.util.List i(boolean r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto Lb
            ta6 r2 = r1.d
            boolean r2 = r2.R
            if (r2 == 0) goto Lb
            yt1 r1 = defpackage.yt1.A
            return r1
        Lb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r1.p()
            if (r0 == 0) goto L1f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.e(r2, r3)
            return r3
        L1f:
            java.util.List r1 = r1.s(r2, r3)
            return r1
    }

    public final defpackage.ta6 k() {
            r2 = this;
            boolean r0 = r2.p()
            ta6 r1 = r2.d
            if (r0 == 0) goto L15
            ta6 r0 = r1.b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.r(r1, r0)
            return r0
        L15:
            return r1
    }

    public final defpackage.xa6 l() {
            r5 = this;
            xa6 r0 = r5.e
            if (r0 == 0) goto L5
            return r0
        L5:
            sm3 r0 = r5.c
            boolean r5 = r5.b
            r1 = 0
            if (r5 == 0) goto L23
            sm3 r2 = r0.v()
        L10:
            if (r2 == 0) goto L23
            ta6 r3 = r2.x()
            if (r3 == 0) goto L1e
            boolean r3 = r3.L
            r4 = 1
            if (r3 != r4) goto L1e
            goto L24
        L1e:
            sm3 r2 = r2.v()
            goto L10
        L23:
            r2 = r1
        L24:
            if (r2 != 0) goto L3e
            sm3 r0 = r0.v()
        L2a:
            if (r0 == 0) goto L3d
            if0 r2 = r0.B0
            r3 = 8
            boolean r2 = r2.g(r3)
            if (r2 == 0) goto L38
            r2 = r0
            goto L3e
        L38:
            sm3 r0 = r0.v()
            goto L2a
        L3d:
            r2 = r1
        L3e:
            if (r2 != 0) goto L41
            return r1
        L41:
            xa6 r5 = defpackage.kn2.h(r2, r5)
            return r5
    }

    public final defpackage.of5 m() {
            r2 = this;
            va6 r0 = r2.f()
            if (r0 != 0) goto L13
            sm3 r2 = r2.c
            if0 r2 = r2.B0
            java.lang.Object r2 = r2.d
            y53 r2 = (defpackage.y53) r2
            of5 r2 = r2.u1()
            return r2
        L13:
            z64 r0 = (defpackage.z64) r0
            z64 r0 = r0.A
            fb6 r1 = defpackage.sa6.b
            ta6 r2 = r2.d
            ja4 r2 = r2.A
            java.lang.Object r2 = r2.g(r1)
            if (r2 != 0) goto L24
            r2 = 0
        L24:
            r1 = 1
            if (r2 == 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = 0
        L2a:
            of5 r2 = defpackage.bl2.t(r0, r2, r1)
            return r2
    }

    public final defpackage.ta6 n() {
            r0 = this;
            ta6 r0 = r0.d
            return r0
    }

    public final boolean o() {
            r0 = this;
            xa6 r0 = r0.e
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean p() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto Lc
            ta6 r1 = r1.d
            boolean r1 = r1.L
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final boolean q() {
            r2 = this;
            boolean r0 = r2.o()
            if (r0 != 0) goto L2e
            r0 = 4
            java.util.List r0 = j(r0, r2)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            sm3 r2 = r2.c
            sm3 r2 = r2.v()
        L17:
            r0 = 1
            if (r2 == 0) goto L2a
            ta6 r1 = r2.x()
            if (r1 == 0) goto L25
            boolean r1 = r1.L
            if (r1 != r0) goto L25
            goto L2b
        L25:
            sm3 r2 = r2.v()
            goto L17
        L2a:
            r2 = 0
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            r2 = 0
            return r2
    }

    public final void r(java.util.ArrayList r4, defpackage.ta6 r5) {
            r3 = this;
            ta6 r0 = r3.d
            boolean r0 = r0.R
            if (r0 != 0) goto L2b
            int r0 = r4.size()
            r1 = 0
            r3.s(r4, r1)
            int r3 = r4.size()
        L12:
            if (r0 >= r3) goto L2b
            java.lang.Object r1 = r4.get(r0)
            xa6 r1 = (defpackage.xa6) r1
            boolean r2 = r1.p()
            if (r2 != 0) goto L28
            ta6 r2 = r1.d
            r5.d(r2)
            r1.r(r4, r5)
        L28:
            int r0 = r0 + 1
            goto L12
        L2b:
            return
    }

    public final java.util.List s(java.util.ArrayList r6, boolean r7) {
            r5 = this;
            boolean r0 = r5.o()
            if (r0 == 0) goto L9
            yt1 r5 = defpackage.yt1.A
            return r5
        L9:
            sm3 r0 = r5.c
            r5.c(r0, r6)
            if (r7 == 0) goto L70
            ta6 r7 = r5.d
            ja4 r0 = r7.A
            fb6 r1 = defpackage.bb6.z
            java.lang.Object r1 = r0.g(r1)
            r2 = 0
            if (r1 != 0) goto L1e
            r1 = r2
        L1e:
            mq5 r1 = (defpackage.mq5) r1
            if (r1 == 0) goto L3a
            boolean r3 = r7.L
            if (r3 == 0) goto L3a
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L3a
            mc r3 = new mc
            r4 = 21
            r3.<init>(r1, r4)
            xa6 r1 = r5.b(r1, r3)
            r6.add(r1)
        L3a:
            fb6 r1 = defpackage.bb6.a
            boolean r3 = r0.c(r1)
            if (r3 == 0) goto L70
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L70
            boolean r7 = r7.L
            if (r7 == 0) goto L70
            java.lang.Object r7 = r0.g(r1)
            if (r7 != 0) goto L53
            r7 = r2
        L53:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L5e
            java.lang.Object r7 = defpackage.gt0.J0(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L5f
        L5e:
            r7 = r2
        L5f:
            if (r7 == 0) goto L70
            mc r0 = new mc
            r1 = 22
            r0.<init>(r7, r1)
            xa6 r5 = r5.b(r2, r0)
            r7 = 0
            r6.add(r7, r5)
        L70:
            return r6
    }
}
