package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk4  reason: default package */
/* loaded from: classes.dex */
final class pk4 extends defpackage.e74 {
    public final defpackage.qn2 a;

    public pk4(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            rk4 r0 = new rk4
            r0.<init>()
            qn2 r1 = r1.a
            r0.k0 = r1
            r1 = 1
            r0.l0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.pk4
            if (r1 == 0) goto Lb
            pk4 r3 = (defpackage.pk4) r3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto Lf
            goto L16
        Lf:
            qn2 r2 = r2.a
            qn2 r3 = r3.a
            if (r2 != r3) goto L16
            return r0
        L16:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r4) {
            r3 = this;
            rk4 r4 = (defpackage.rk4) r4
            qn2 r0 = r4.k0
            qn2 r3 = r3.a
            r1 = 1
            if (r0 != r3) goto Ld
            boolean r0 = r4.l0
            if (r0 == r1) goto L15
        Ld:
            sm3 r0 = defpackage.nc1.f0(r4)
            r2 = 0
            r0.U(r2)
        L15:
            r4.k0 = r3
            r4.l0 = r1
            return
    }

    public final int hashCode() {
            r1 = this;
            qn2 r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OffsetPxModifier(offset="
            r0.<init>(r1)
            qn2 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", rtlAware=true)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
