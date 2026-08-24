package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al5  reason: default package */
/* loaded from: classes.dex */
public final class al5 extends defpackage.lh0 {
    public final defpackage.pq7 a;
    public final java.util.List b;
    public final defpackage.gt2 c;
    public final defpackage.fc0 d;

    public al5(defpackage.pq7 r1, java.util.List r2, defpackage.gt2 r3, defpackage.fc0 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.al5
            r2 = 0
            if (r1 != 0) goto La
            goto L1d
        La:
            al5 r5 = (defpackage.al5) r5
            pq7 r1 = r4.a
            pq7 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.List r1 = r4.b
            java.util.List r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1e
        L1d:
            return r2
        L1e:
            gt2 r1 = r4.c
            gt2 r3 = r5.c
            if (r1 == r3) goto L25
            return r2
        L25:
            fc0 r4 = r4.d
            fc0 r5 = r5.d
            if (r4 == r5) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            pq7 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            gt2 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            int r0 = defpackage.xg6.e(r2, r0, r1)
            fc0 r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RequestOpen(virtualCamera="
            r0.<init>(r1)
            pq7 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", sharedCameraIds="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", graphListener="
            r0.append(r1)
            gt2 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", isPrewarm=false, isForegroundObserver="
            r0.append(r1)
            fc0 r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
