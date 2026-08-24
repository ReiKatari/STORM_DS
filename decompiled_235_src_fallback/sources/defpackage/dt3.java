package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt3  reason: default package */
/* loaded from: classes.dex */
final class dt3 extends defpackage.e74 {
    public final defpackage.ki a;
    public final defpackage.jt3 b;
    public final defpackage.p27 c;

    public dt3(defpackage.ki r1, defpackage.jt3 r2, defpackage.p27 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            et3 r0 = new et3
            jt3 r1 = r3.b
            p27 r2 = r3.c
            ki r3 = r3.a
            r0.<init>(r3, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.dt3
            r2 = 0
            if (r1 != 0) goto La
            goto L16
        La:
            dt3 r5 = (defpackage.dt3) r5
            ki r1 = r4.a
            ki r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
        L16:
            return r2
        L17:
            jt3 r1 = r4.b
            jt3 r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            p27 r4 = r4.c
            p27 r5 = r5.c
            if (r4 == r5) goto L25
            return r2
        L25:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            et3 r3 = (defpackage.et3) r3
            boolean r0 = r3.j0
            if (r0 == 0) goto L10
            ki r0 = r3.k0
            r0.c()
            ki r0 = r3.k0
            r0.k(r3)
        L10:
            ki r0 = r2.a
            r3.k0 = r0
            boolean r1 = r3.j0
            if (r1 == 0) goto L24
            et3 r1 = r0.a
            if (r1 != 0) goto L1d
            goto L22
        L1d:
            java.lang.String r1 = "Expected textInputModifierNode to be null"
            defpackage.s53.c(r1)
        L22:
            r0.a = r3
        L24:
            jt3 r0 = r2.b
            r3.l0 = r0
            p27 r2 = r2.c
            r3.m0 = r2
            return
    }

    public final int hashCode() {
            r2 = this;
            ki r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            jt3 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            p27 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LegacyAdaptingPlatformTextInputModifier(serviceAdapter="
            r0.<init>(r1)
            ki r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", legacyTextFieldState="
            r0.append(r1)
            jt3 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", textFieldSelectionManager="
            r0.append(r1)
            p27 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
