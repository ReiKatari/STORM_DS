package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk4  reason: default package */
/* loaded from: classes.dex */
final class kk4 extends defpackage.e74 {
    public final float a;
    public final float b;

    public kk4(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            nk4 r0 = new nk4
            r0.<init>()
            float r1 = r2.a
            r0.k0 = r1
            float r2 = r2.b
            r0.l0 = r2
            r2 = 1
            r0.m0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.kk4
            if (r1 == 0) goto Lb
            kk4 r4 = (defpackage.kk4) r4
            goto Lc
        Lb:
            r4 = 0
        Lc:
            if (r4 != 0) goto Lf
            goto L24
        Lf:
            float r1 = r3.a
            float r2 = r4.a
            boolean r1 = defpackage.om1.b(r1, r2)
            if (r1 == 0) goto L24
            float r3 = r3.b
            float r4 = r4.b
            boolean r3 = defpackage.om1.b(r3, r4)
            if (r3 == 0) goto L24
            return r0
        L24:
            r3 = 0
            return r3
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r5) {
            r4 = this;
            nk4 r5 = (defpackage.nk4) r5
            float r0 = r5.k0
            float r1 = r4.a
            boolean r0 = defpackage.om1.b(r0, r1)
            float r4 = r4.b
            r2 = 1
            if (r0 == 0) goto L1b
            float r0 = r5.l0
            boolean r0 = defpackage.om1.b(r0, r4)
            if (r0 == 0) goto L1b
            boolean r0 = r5.m0
            if (r0 == r2) goto L23
        L1b:
            sm3 r0 = defpackage.nc1.f0(r5)
            r3 = 0
            r0.U(r3)
        L23:
            r5.k0 = r1
            r5.l0 = r4
            r5.m0 = r2
            return
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r2.b
            int r2 = defpackage.xg6.a(r2, r0, r1)
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OffsetModifierElement(x="
            r0.<init>(r1)
            float r1 = r2.a
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", y="
            r0.append(r1)
            float r2 = r2.b
            java.lang.String r2 = defpackage.om1.c(r2)
            r0.append(r2)
            java.lang.String r2 = ", rtlAware=true)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
