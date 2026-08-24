package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa5  reason: default package */
/* loaded from: classes.dex */
public final class oa5 extends defpackage.ra5 {
    public final java.net.URL a;

    public oa5(java.net.URL r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.ra5
    public final java.net.URL a() {
            r0 = this;
            java.net.URL r0 = r0.a
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.oa5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oa5 r4 = (defpackage.oa5) r4
            java.net.URL r3 = r3.a
            java.net.URL r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.net.URL r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LoginExpired(icon="
            r0.<init>(r1)
            java.net.URL r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
