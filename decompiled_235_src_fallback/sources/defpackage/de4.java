package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de4  reason: default package */
/* loaded from: classes.dex */
final class de4 extends defpackage.e74 {
    public final defpackage.ae4 a;

    public de4(defpackage.ae4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            ge4 r0 = new ge4
            ae4 r2 = r2.a
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.de4
            if (r0 != 0) goto L5
            goto L11
        L5:
            de4 r2 = (defpackage.de4) r2
            ae4 r2 = r2.a
            ae4 r1 = r1.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r4) {
            r3 = this;
            ge4 r4 = (defpackage.ge4) r4
            ae4 r3 = r3.a
            r4.k0 = r3
            eb r3 = r4.l0
            java.lang.Object r0 = r3.B
            ge4 r0 = (defpackage.ge4) r0
            r1 = 0
            if (r0 != r4) goto L11
            r3.B = r1
        L11:
            eb r3 = new eb
            r0 = 14
            r3.<init>(r0)
            r4.l0 = r3
            boolean r2 = r4.j0
            if (r2 == 0) goto L31
            r3.B = r4
            r3.L = r1
            r4.m0 = r1
            pj r1 = new pj
            r1.<init>(r4, r0)
            r3.R = r1
            w61 r4 = r4.F0()
            r3.X = r4
        L31:
            return
    }

    public final int hashCode() {
            r0 = this;
            ae4 r0 = r0.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }
}
