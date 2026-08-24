package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg6  reason: default package */
/* loaded from: classes.dex */
final class wg6 extends defpackage.e74 {
    public final defpackage.sg6 a;

    public wg6(defpackage.sg6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            yg6 r0 = new yg6
            r0.<init>()
            sg6 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.wg6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wg6 r4 = (defpackage.wg6) r4
            sg6 r3 = r3.a
            sg6 r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            yg6 r2 = (defpackage.yg6) r2
            sg6 r0 = r2.k0
            sg6 r1 = r1.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L11
            pj r0 = r1.R
            defpackage.jx2.B(r2, r0)
        L11:
            r2.k0 = r1
            return
    }

    public final int hashCode() {
            r0 = this;
            sg6 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SharedTransitionScopeRootModifierElement(sharedTransitionScope="
            r0.<init>(r1)
            sg6 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
