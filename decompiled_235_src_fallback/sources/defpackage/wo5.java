package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo5  reason: default package */
/* loaded from: classes.dex */
public final class wo5 {
    public final long a;
    public final java.lang.String b;

    public wo5(long r1, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.wo5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wo5 r8 = (defpackage.wo5) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r7 = r7.b
            java.lang.String r8 = r8.b
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r2 = r2.b
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            int r2 = r2.hashCode()
        L12:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RemoteShaderPackage(contentLength="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", lastModified="
            r0.append(r1)
            java.lang.String r3 = r3.b
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
