package com.github.junrar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ContentDescription {
    public java.lang.String path;
    public long size;

    public ContentDescription(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.path = r1
            r0.size = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            com.github.junrar.ContentDescription r5 = (com.github.junrar.ContentDescription) r5
            java.lang.String r2 = r4.path
            java.lang.String r3 = r5.path
            if (r2 != 0) goto L1e
            if (r3 == 0) goto L25
            return r1
        L1e:
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L25
            return r1
        L25:
            long r2 = r4.size
            long r4 = r5.size
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L2e
            return r0
        L2e:
            return r1
    }

    public int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.path
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * r1
            long r1 = r5.size
            r5 = 32
            long r3 = r1 >>> r5
            long r1 = r1 ^ r3
            int r5 = (int) r1
            int r0 = r0 + r5
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.path
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            long r1 = r3.size
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
