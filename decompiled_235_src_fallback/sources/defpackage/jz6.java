package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jz6  reason: default package */
/* loaded from: classes.dex */
public final class jz6 implements defpackage.lo {
    public final defpackage.il7 A;
    public final defpackage.wc7 B;
    public java.lang.Object L;
    public java.lang.Object R;
    public defpackage.ap X;
    public defpackage.ap Y;
    public final defpackage.ap Z;
    public long d0;
    public defpackage.ap e0;

    public jz6(defpackage.to r1, defpackage.wc7 r2, java.lang.Object r3, java.lang.Object r4, defpackage.ap r5) {
            r0 = this;
            il7 r1 = r1.a(r2)
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r4
            r0.R = r3
            qn2 r1 = r2.a
            java.lang.Object r1 = r1.g(r3)
            ap r1 = (defpackage.ap) r1
            r0.X = r1
            qn2 r1 = r2.a
            java.lang.Object r2 = r1.g(r4)
            ap r2 = (defpackage.ap) r2
            r0.Y = r2
            if (r5 == 0) goto L2a
            ap r1 = defpackage.nw7.R(r5)
            goto L34
        L2a:
            java.lang.Object r1 = r1.g(r3)
            ap r1 = (defpackage.ap) r1
            ap r1 = r1.c()
        L34:
            r0.Z = r1
            r1 = -1
            r0.d0 = r1
            return
    }

    @Override // defpackage.lo
    public final boolean a() {
            r0 = this;
            il7 r0 = r0.A
            boolean r0 = r0.a()
            return r0
    }

    @Override // defpackage.lo
    public final long b() {
            r4 = this;
            long r0 = r4.d0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L16
            ap r0 = r4.X
            ap r1 = r4.Y
            ap r2 = r4.Z
            il7 r3 = r4.A
            long r0 = r3.b(r0, r1, r2)
            r4.d0 = r0
        L16:
            long r0 = r4.d0
            return r0
    }

    @Override // defpackage.lo
    public final defpackage.wc7 c() {
            r0 = this;
            wc7 r0 = r0.B
            return r0
    }

    @Override // defpackage.lo
    public final defpackage.ap d(long r8) {
            r7 = this;
            boolean r0 = r7.e(r8)
            if (r0 != 0) goto L14
            ap r4 = r7.X
            ap r5 = r7.Y
            ap r6 = r7.Z
            il7 r1 = r7.A
            r2 = r8
            ap r7 = r1.h(r2, r4, r5, r6)
            return r7
        L14:
            ap r8 = r7.e0
            if (r8 != 0) goto L26
            ap r8 = r7.X
            ap r9 = r7.Y
            ap r0 = r7.Z
            il7 r1 = r7.A
            ap r8 = r1.r(r8, r9, r0)
            r7.e0 = r8
        L26:
            return r8
    }

    public final void f(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.R
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 != 0) goto L1d
            r2.R = r3
            wc7 r0 = r2.B
            qn2 r0 = r0.a
            java.lang.Object r3 = r0.g(r3)
            ap r3 = (defpackage.ap) r3
            r2.X = r3
            r3 = 0
            r2.e0 = r3
            r0 = -1
            r2.d0 = r0
        L1d:
            return
    }

    @Override // defpackage.lo
    public final java.lang.Object g(long r8) {
            r7 = this;
            boolean r0 = r7.e(r8)
            if (r0 != 0) goto L51
            ap r4 = r7.X
            ap r5 = r7.Y
            ap r6 = r7.Z
            il7 r1 = r7.A
            r2 = r8
            ap r8 = r1.q(r2, r4, r5, r6)
            int r9 = r8.b()
            r0 = 0
        L18:
            if (r0 >= r9) goto L48
            float r1 = r8.a(r0)
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "AnimationVector cannot contain a NaN. "
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r4 = ". Animation: "
            r1.append(r4)
            r1.append(r7)
            java.lang.String r4 = ", playTimeNanos: "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.t05.b(r1)
        L45:
            int r0 = r0 + 1
            goto L18
        L48:
            wc7 r7 = r7.B
            qn2 r7 = r7.b
            java.lang.Object r7 = r7.g(r8)
            return r7
        L51:
            java.lang.Object r7 = r7.L
            return r7
    }

    @Override // defpackage.lo
    public final java.lang.Object h() {
            r0 = this;
            java.lang.Object r0 = r0.L
            return r0
    }

    public final void i(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = r2.L
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 != 0) goto L1d
            r2.L = r3
            wc7 r0 = r2.B
            qn2 r0 = r0.a
            java.lang.Object r3 = r0.g(r3)
            ap r3 = (defpackage.ap) r3
            r2.Y = r3
            r3 = 0
            r2.e0 = r3
            r0 = -1
            r2.d0 = r0
        L1d:
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TargetBasedAnimation: "
            r0.<init>(r1)
            java.lang.Object r1 = r5.R
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.Object r1 = r5.L
            r0.append(r1)
            java.lang.String r1 = ",initial velocity: "
            r0.append(r1)
            ap r1 = r5.Z
            r0.append(r1)
            java.lang.String r1 = ", duration: "
            r0.append(r1)
            long r1 = r5.b()
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 / r3
            r0.append(r1)
            java.lang.String r1 = " ms,animationSpec: "
            r0.append(r1)
            il7 r5 = r5.A
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
