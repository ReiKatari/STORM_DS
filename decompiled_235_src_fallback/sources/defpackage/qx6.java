package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx6  reason: default package */
/* loaded from: classes.dex */
final class qx6 extends defpackage.e74 {
    public final defpackage.qn2 a;

    public qx6(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            rx6 r0 = new rx6
            hd2 r1 = defpackage.hv.k
            r0.<init>(r1)
            qn2 r2 = r2.a
            r0.n0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L10
        L3:
            boolean r0 = r2 instanceof defpackage.qx6
            if (r0 != 0) goto L8
            goto L12
        L8:
            qx6 r2 = (defpackage.qx6) r2
            qn2 r2 = r2.a
            qn2 r1 = r1.a
            if (r1 != r2) goto L12
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            rx6 r2 = (defpackage.rx6) r2
            qn2 r0 = r2.n0
            qn2 r1 = r1.a
            if (r0 == r1) goto L21
            r2.n0 = r1
            dv7 r0 = r2.o0
            if (r0 == 0) goto L21
            java.lang.Object r1 = r1.g(r0)
            tt7 r1 = (defpackage.tt7) r1
            tt7 r0 = r2.m0
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L21
            r2.m0 = r1
            r2.S0()
        L21:
            return
    }

    public final int hashCode() {
            r0 = this;
            qn2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
