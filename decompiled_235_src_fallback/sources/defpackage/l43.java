package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l43  reason: default package */
/* loaded from: classes.dex */
final class l43 extends defpackage.e74 {
    public final defpackage.r94 a;
    public final defpackage.n43 b;

    public l43(defpackage.r94 r1, defpackage.n43 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            m43 r0 = new m43
            n43 r1 = r2.b
            r94 r2 = r2.a
            xg1 r2 = r1.a(r2)
            r0.<init>()
            r0.m0 = r2
            r0.R0(r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.l43
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l43 r5 = (defpackage.l43) r5
            r94 r1 = r5.a
            r94 r3 = r4.a
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            n43 r4 = r4.b
            n43 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            m43 r2 = (defpackage.m43) r2
            n43 r0 = r1.b
            r94 r1 = r1.a
            xg1 r1 = r0.a(r1)
            xg1 r0 = r2.m0
            r2.S0(r0)
            r2.m0 = r1
            r2.R0(r1)
            return
    }

    public final int hashCode() {
            r1 = this;
            r94 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            n43 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
