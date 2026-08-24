package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c50  reason: default package */
/* loaded from: classes.dex */
final class c50 extends defpackage.e74 {
    public final defpackage.qn2 a;

    public c50(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            d50 r0 = new d50
            qn2 r1 = r1.a
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.c50
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c50 r4 = (defpackage.c50) r4
            qn2 r4 = r4.a
            qn2 r3 = r3.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            d50 r2 = (defpackage.d50) r2
            qn2 r1 = r1.a
            r2.k0 = r1
            z64 r0 = r2.A
            boolean r0 = r0.j0
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            r0 = 2
            eg4 r2 = defpackage.nc1.d0(r2, r0)
            eg4 r2 = r2.n0
            if (r2 == 0) goto L1a
            r0 = 1
            r2.x1(r1, r0)
        L1a:
            return
    }

    public final int hashCode() {
            r0 = this;
            qn2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
