package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a52  reason: default package */
/* loaded from: classes.dex */
final class a52 extends defpackage.e74 {
    public final defpackage.ga7 a;
    public final defpackage.w97 b;
    public final defpackage.w97 c;
    public final defpackage.w97 d;
    public final defpackage.o52 e;
    public final defpackage.z72 f;
    public final defpackage.on2 g;
    public final defpackage.b52 h;

    public a52(defpackage.ga7 r1, defpackage.w97 r2, defpackage.w97 r3, defpackage.w97 r4, defpackage.o52 r5, defpackage.z72 r6, defpackage.on2 r7, defpackage.b52 r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r9 = this;
            n52 r0 = new n52
            on2 r7 = r9.g
            b52 r8 = r9.h
            ga7 r1 = r9.a
            w97 r2 = r9.b
            w97 r3 = r9.c
            w97 r4 = r9.d
            o52 r5 = r9.e
            z72 r6 = r9.f
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.a52
            if (r0 == 0) goto L51
            a52 r3 = (defpackage.a52) r3
            ga7 r0 = r3.a
            ga7 r1 = r2.a
            if (r0 == r1) goto Ld
            goto L51
        Ld:
            w97 r0 = r3.b
            w97 r1 = r2.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L51
            w97 r0 = r3.c
            w97 r1 = r2.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L51
            w97 r0 = r3.d
            w97 r1 = r2.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L51
            o52 r0 = r3.e
            o52 r1 = r2.e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            z72 r0 = r3.f
            z72 r1 = r2.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L51
            on2 r0 = r3.g
            on2 r1 = r2.g
            if (r0 != r1) goto L51
            b52 r3 = r3.h
            b52 r2 = r2.h
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L51
            r2 = 1
            return r2
        L51:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            n52 r2 = (defpackage.n52) r2
            ga7 r0 = r1.a
            r2.l0 = r0
            w97 r0 = r1.b
            r2.m0 = r0
            w97 r0 = r1.c
            r2.n0 = r0
            w97 r0 = r1.d
            r2.o0 = r0
            o52 r0 = r1.e
            r2.p0 = r0
            z72 r0 = r1.f
            r2.q0 = r0
            on2 r0 = r1.g
            r2.r0 = r0
            b52 r1 = r1.h
            r2.s0 = r1
            return
    }

    public final int hashCode() {
            r3 = this;
            ga7 r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            w97 r2 = r3.b
            if (r2 == 0) goto L12
            int r2 = r2.hashCode()
            goto L13
        L12:
            r2 = r1
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            w97 r2 = r3.c
            if (r2 == 0) goto L1f
            int r2 = r2.hashCode()
            goto L20
        L1f:
            r2 = r1
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            w97 r2 = r3.d
            if (r2 == 0) goto L2b
            int r1 = r2.hashCode()
        L2b:
            int r0 = r0 + r1
            int r0 = r0 * 31
            o52 r1 = r3.e
            ha7 r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            z72 r0 = r3.f
            ha7 r0 = r0.a
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            on2 r1 = r3.g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            b52 r3 = r3.h
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            return r3
    }
}
