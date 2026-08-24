package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: df6  reason: default package */
/* loaded from: classes.dex */
public final class df6 extends defpackage.e74 {
    public final defpackage.if6 a;

    public df6(defpackage.if6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            cf6 r0 = new cf6
            if6 r1 = r1.a
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.df6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            df6 r4 = (defpackage.df6) r4
            if6 r3 = r3.a
            if6 r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            cf6 r3 = (defpackage.cf6) r3
            if6 r0 = r3.m0
            if6 r2 = r2.a
            if (r2 == r0) goto L23
            vs4 r0 = r0.A
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            r3.m0 = r2
            boolean r0 = r3.j0
            vs4 r2 = r2.A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setValue(r0)
            boolean r2 = r3.j0
            if (r2 == 0) goto L23
            r3.U0()
        L23:
            return
    }

    public final int hashCode() {
            r0 = this;
            if6 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SharedBoundsNodeElement(sharedElementState="
            r0.<init>(r1)
            if6 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
