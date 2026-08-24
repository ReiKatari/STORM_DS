package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o00  reason: default package */
/* loaded from: classes.dex */
final class o00 extends defpackage.e74 {
    public final long a;
    public final defpackage.f80 b;
    public final float c;
    public final defpackage.ke6 d;

    public o00(long r2, defpackage.bv3 r4, defpackage.ke6 r5, int r6) {
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L6
            long r2 = defpackage.kt0.h
        L6:
            r6 = r6 & 2
            if (r6 == 0) goto Lb
            r4 = 0
        Lb:
            r1.<init>()
            r1.a = r2
            r1.b = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.c = r2
            r1.d = r5
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            d10 r0 = new d10
            r0.<init>()
            long r1 = r3.a
            r0.k0 = r1
            f80 r1 = r3.b
            r0.l0 = r1
            float r1 = r3.c
            r0.m0 = r1
            ke6 r3 = r3.d
            r0.n0 = r3
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.o0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.o00
            if (r0 == 0) goto L7
            o00 r6 = (defpackage.o00) r6
            goto L8
        L7:
            r6 = 0
        L8:
            r0 = 0
            if (r6 != 0) goto Lc
            return r0
        Lc:
            long r1 = r5.a
            long r3 = r6.a
            boolean r1 = defpackage.kt0.d(r1, r3)
            if (r1 == 0) goto L34
            f80 r1 = r5.b
            f80 r2 = r6.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L34
            float r1 = r5.c
            float r2 = r6.c
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L34
            ke6 r5 = r5.d
            ke6 r6 = r6.d
            boolean r5 = defpackage.nb3.k(r5, r6)
            if (r5 == 0) goto L34
            r5 = 1
            return r5
        L34:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            d10 r3 = (defpackage.d10) r3
            long r0 = r2.a
            r3.k0 = r0
            f80 r0 = r2.b
            r3.l0 = r0
            float r0 = r2.c
            r3.m0 = r0
            ke6 r0 = r3.n0
            ke6 r2 = r2.d
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L1d
            r3.n0 = r2
            defpackage.bl2.G(r3)
        L1d:
            defpackage.f04.I(r3)
            return
    }

    public final int hashCode() {
            r3 = this;
            int r0 = defpackage.kt0.i
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            f80 r2 = r3.b
            if (r2 == 0) goto L14
            int r2 = r2.hashCode()
            goto L15
        L14:
            r2 = 0
        L15:
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            ke6 r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }
}
