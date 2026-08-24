package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oh7  reason: default package */
/* loaded from: classes.dex */
public final class oh7 {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;
    public final java.util.LinkedHashSet d;

    public oh7(java.lang.String r1, long r2, java.lang.String r4, java.util.LinkedHashSet r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L35
        L3:
            boolean r0 = r5 instanceof defpackage.oh7
            if (r0 != 0) goto L8
            goto L33
        L8:
            oh7 r5 = (defpackage.oh7) r5
            java.lang.String r0 = r4.a
            java.lang.String r1 = r5.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L33
        L15:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L33
        L1e:
            java.lang.String r0 = r4.c
            java.lang.String r1 = r5.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L29
            goto L33
        L29:
            java.util.LinkedHashSet r4 = r4.d
            java.util.LinkedHashSet r5 = r5.d
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
        L33:
            r4 = 0
            return r4
        L35:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r2 = r4.c
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.LinkedHashSet r4 = r4.d
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UpdateApkMetadata(packageName="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", versionCode="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", versionName="
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", signerDigests="
            r0.append(r1)
            java.util.LinkedHashSet r3 = r3.d
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
