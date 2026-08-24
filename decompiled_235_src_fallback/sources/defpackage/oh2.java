package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oh2  reason: default package */
/* loaded from: classes.dex */
final class oh2 extends defpackage.e74 {
    public final defpackage.nh2 a;

    public oh2(defpackage.nh2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            qh2 r0 = new qh2
            r0.<init>()
            nh2 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.oh2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oh2 r4 = (defpackage.oh2) r4
            nh2 r3 = r3.a
            nh2 r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            qh2 r2 = (defpackage.qh2) r2
            nh2 r0 = r2.k0
            ua4 r0 = r0.a
            r0.j(r2)
            nh2 r1 = r1.a
            r2.k0 = r1
            ua4 r1 = r1.a
            r1.b(r2)
            return
    }

    public final int hashCode() {
            r0 = this;
            nh2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FocusRequesterElement(focusRequester="
            r0.<init>(r1)
            nh2 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
