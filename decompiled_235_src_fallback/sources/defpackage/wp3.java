package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wp3  reason: default package */
/* loaded from: classes.dex */
final class wp3 extends defpackage.e74 {
    public final defpackage.zp3 a;

    public wp3(defpackage.zp3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            xp3 r0 = new xp3
            r0.<init>()
            zp3 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.wp3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wp3 r4 = (defpackage.wp3) r4
            zp3 r3 = r3.a
            zp3 r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            xp3 r3 = (defpackage.xp3) r3
            zp3 r0 = r3.k0
            zp3 r2 = r2.a
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L1c
            z64 r0 = r3.A
            boolean r0 = r0.j0
            if (r0 == 0) goto L1c
            zp3 r0 = r3.k0
            r0.g()
            r1 = 0
            r0.b = r1
            r3.k0 = r2
        L1c:
            return
    }

    public final int hashCode() {
            r0 = this;
            zp3 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayingDisappearingItemsElement(animator="
            r0.<init>(r1)
            zp3 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
