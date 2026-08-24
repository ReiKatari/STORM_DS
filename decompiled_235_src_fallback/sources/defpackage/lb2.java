package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb2  reason: default package */
/* loaded from: classes.dex */
public final class lb2 {
    public final android.net.Uri a;
    public final android.net.Uri b;
    public final long c;
    public final long d;
    public final defpackage.zl1 e;

    public lb2(android.net.Uri r1, android.net.Uri r2, long r3, long r5, defpackage.zl1 r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3e
        L3:
            boolean r0 = r5 instanceof defpackage.lb2
            if (r0 != 0) goto L8
            goto L3c
        L8:
            lb2 r5 = (defpackage.lb2) r5
            android.net.Uri r0 = r4.a
            android.net.Uri r1 = r5.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            android.net.Uri r0 = r4.b
            android.net.Uri r1 = r5.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L3c
        L29:
            long r0 = r4.d
            long r2 = r5.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L3c
        L32:
            zl1 r4 = r4.e
            zl1 r5 = r5.e
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3e
        L3c:
            r4 = 0
            return r4
        L3e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            android.net.Uri r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            android.net.Uri r2 = r5.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.c
            int r0 = defpackage.i61.c(r3, r2, r1)
            long r2 = r5.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            zl1 r5 = r5.e
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DirectoryFileState(uri="
            r0.<init>(r1)
            android.net.Uri r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", parentUri="
            r0.append(r1)
            android.net.Uri r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", lastModified="
            r0.append(r1)
            long r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", size="
            java.lang.String r2 = ", documentFile="
            long r3 = r5.d
            defpackage.xg6.B(r0, r1, r3, r2)
            zl1 r5 = r5.e
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
