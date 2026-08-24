package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs2  reason: default package */
/* loaded from: classes.dex */
public final class cs2 {
    public final defpackage.ki5 a;
    public final defpackage.pv b;
    public final defpackage.bm7 c;
    public final defpackage.s83 d;

    public cs2(defpackage.ki5 r1, defpackage.pv r2, defpackage.bm7 r3, defpackage.s83 r4) {
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
            boolean r0 = r3 instanceof defpackage.cs2
            if (r0 != 0) goto L8
            goto L35
        L8:
            cs2 r3 = (defpackage.cs2) r3
            ki5 r0 = r2.a
            ki5 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            pv r0 = r2.b
            pv r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            bm7 r0 = r2.c
            bm7 r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            s83 r2 = r2.d
            s83 r3 = r3.d
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
            r2 = this;
            ki5 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            pv r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            bm7 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            s83 r2 = r2.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GitHubReleaseCandidate(release="
            r0.<init>(r1)
            ki5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", asset="
            r0.append(r1)
            pv r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            bm7 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", publishedAt="
            r0.append(r1)
            s83 r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
