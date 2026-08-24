package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb5  reason: default package */
/* loaded from: classes.dex */
public final class hb5 extends defpackage.jb5 {
    public final java.lang.String a;
    public final java.lang.String b;

    public hb5(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.jb5
    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.hb5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hb5 r5 = (defpackage.hb5) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", token="
            java.lang.String r1 = ")"
            java.lang.String r2 = "Authenticated(username="
            java.lang.String r3 = r4.a
            java.lang.String r4 = r4.b
            java.lang.String r4 = defpackage.lb1.n(r2, r3, r0, r4, r1)
            return r4
    }
}
