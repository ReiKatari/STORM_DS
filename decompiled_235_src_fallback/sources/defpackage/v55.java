package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v55  reason: default package */
/* loaded from: classes.dex */
public final class v55 implements defpackage.w55 {
    public final defpackage.n8 a;
    public final defpackage.jb4 b;

    public v55(defpackage.n8 r1, defpackage.jb4 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.v55
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            v55 r5 = (defpackage.v55) r5
            n8 r1 = r4.a
            n8 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            jb4 r4 = r4.b
            jb4 r5 = r5.b
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            n8 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            jb4 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Success(activeCamera="
            r0.<init>(r1)
            n8 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", token="
            r0.append(r1)
            jb4 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
