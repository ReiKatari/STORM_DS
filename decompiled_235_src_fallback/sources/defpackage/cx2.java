package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx2  reason: default package */
/* loaded from: classes.dex */
final class cx2 extends defpackage.e74 {
    public final defpackage.s47 a;
    public final int b;
    public final int c;

    public cx2(defpackage.s47 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            ex2 r0 = new ex2
            r0.<init>()
            s47 r1 = r2.a
            r0.k0 = r1
            int r1 = r2.b
            r0.l0 = r1
            int r2 = r2.c
            r0.m0 = r2
            r2 = -1
            r0.o0 = r2
            r0.p0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof defpackage.cx2
            if (r0 != 0) goto L8
            goto L22
        L8:
            cx2 r3 = (defpackage.cx2) r3
            s47 r0 = r3.a
            s47 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L22
        L15:
            int r0 = r2.b
            int r1 = r3.b
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            int r2 = r2.c
            int r3 = r3.c
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r4) {
            r3 = this;
            ex2 r4 = (defpackage.ex2) r4
            s47 r0 = r4.k0
            s47 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            int r2 = r3.b
            int r3 = r3.c
            if (r0 == 0) goto L1a
            int r0 = r4.l0
            if (r0 != r2) goto L1a
            int r0 = r4.m0
            if (r0 == r3) goto L19
            goto L1a
        L19:
            return
        L1a:
            r4.k0 = r1
            r4.l0 = r2
            r4.m0 = r3
            sm3 r3 = defpackage.nc1.f0(r4)
            kk3 r3 = r3.v0
            s47 r3 = defpackage.gi2.N(r1, r3)
            r4.q0 = r3
            r3 = 1
            r4.n0 = r3
            defpackage.xk2.w(r4)
            return
    }

    public final int hashCode() {
            r2 = this;
            s47 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.c
            int r0 = r0 + r2
            return r0
    }
}
