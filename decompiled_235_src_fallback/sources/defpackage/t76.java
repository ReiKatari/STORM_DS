package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t76  reason: default package */
/* loaded from: classes.dex */
final class t76 extends defpackage.e74 {
    public final defpackage.f86 a;
    public final defpackage.lo4 b;
    public final boolean c;
    public final defpackage.sd2 d;
    public final defpackage.r94 e;
    public final defpackage.z70 f;
    public final boolean g;
    public final defpackage.sg h;

    public t76(defpackage.sg r1, defpackage.z70 r2, defpackage.sd2 r3, defpackage.r94 r4, defpackage.lo4 r5, defpackage.f86 r6, boolean r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.a = r6
            r0.b = r5
            r0.c = r7
            r0.d = r3
            r0.e = r4
            r0.f = r2
            r0.g = r8
            r0.h = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            u76 r0 = new u76
            r0.<init>()
            f86 r1 = r2.a
            r0.m0 = r1
            lo4 r1 = r2.b
            r0.n0 = r1
            boolean r1 = r2.c
            r0.o0 = r1
            sd2 r1 = r2.d
            r0.p0 = r1
            r94 r1 = r2.e
            r0.q0 = r1
            z70 r1 = r2.f
            r0.r0 = r1
            boolean r1 = r2.g
            r0.s0 = r1
            sg r2 = r2.h
            r0.t0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L5c
        L3:
            if (r3 == 0) goto L5e
            java.lang.Class<t76> r0 = defpackage.t76.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L5e
        Le:
            t76 r3 = (defpackage.t76) r3
            f86 r0 = r2.a
            f86 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1b
            goto L5e
        L1b:
            lo4 r0 = r2.b
            lo4 r1 = r3.b
            if (r0 == r1) goto L22
            goto L5e
        L22:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L29
            goto L5e
        L29:
            sd2 r0 = r2.d
            sd2 r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L34
            goto L5e
        L34:
            r94 r0 = r2.e
            r94 r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3f
            goto L5e
        L3f:
            z70 r0 = r2.f
            z70 r1 = r3.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L4a
            goto L5e
        L4a:
            boolean r0 = r2.g
            boolean r1 = r3.g
            if (r0 == r1) goto L51
            goto L5e
        L51:
            sg r2 = r2.h
            sg r3 = r3.h
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L5c
            goto L5e
        L5c:
            r2 = 1
            return r2
        L5e:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r10) {
            r9 = this;
            r0 = r10
            u76 r0 = (defpackage.u76) r0
            r94 r4 = r9.e
            z70 r2 = r9.f
            sg r1 = r9.h
            sd2 r3 = r9.d
            lo4 r5 = r9.b
            f86 r6 = r9.a
            boolean r7 = r9.g
            boolean r8 = r9.c
            r0.W0(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final int hashCode() {
            r4 = this;
            f86 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            lo4 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.c
            int r0 = defpackage.xg6.e(r2, r0, r1)
            r2 = 0
            int r0 = defpackage.xg6.e(r0, r2, r1)
            sd2 r3 = r4.d
            if (r3 == 0) goto L25
            int r3 = r3.hashCode()
            goto L26
        L25:
            r3 = r2
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            r94 r3 = r4.e
            if (r3 == 0) goto L31
            int r3 = r3.hashCode()
            goto L32
        L31:
            r3 = r2
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            z70 r3 = r4.f
            if (r3 == 0) goto L3d
            int r3 = r3.hashCode()
            goto L3e
        L3d:
            r3 = r2
        L3e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r4.g
            int r0 = defpackage.xg6.e(r0, r3, r1)
            sg r4 = r4.h
            if (r4 == 0) goto L4e
            int r2 = r4.hashCode()
        L4e:
            int r0 = r0 + r2
            return r0
    }
}
