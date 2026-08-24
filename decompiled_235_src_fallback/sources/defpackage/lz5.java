package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz5  reason: default package */
/* loaded from: classes.dex */
public final class lz5 {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    public lz5(android.net.Uri r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof defpackage.lz5
            if (r0 != 0) goto L8
            goto L35
        L8:
            lz5 r3 = (defpackage.lz5) r3
            android.net.Uri r0 = r2.a
            android.net.Uri r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r2 = r2.d
            java.lang.String r3 = r3.d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.net.Uri r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RootDirectory(uri="
            r0.<init>(r1)
            android.net.Uri r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", docId="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", displayName="
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", relativePath="
            r0.append(r1)
            java.lang.String r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
