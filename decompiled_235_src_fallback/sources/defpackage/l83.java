package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l83  reason: default package */
/* loaded from: classes.dex */
final class l83 extends defpackage.e74 {
    public final defpackage.tt7 a;

    public l83(defpackage.tt7 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            n83 r0 = new n83
            tt7 r1 = r1.a
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.l83
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            l83 r2 = (defpackage.l83) r2
            tt7 r2 = r2.a
            tt7 r1 = r1.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            n83 r2 = (defpackage.n83) r2
            tt7 r0 = r2.m0
            tt7 r1 = r1.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L11
            r2.m0 = r1
            r2.S0()
        L11:
            return
    }

    public final int hashCode() {
            r0 = this;
            tt7 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
