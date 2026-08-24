package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd4  reason: default package */
/* loaded from: classes.dex */
public final class kd4 {
    public final java.util.List a;
    public final int b;

    public kd4() {
            r2 = this;
            yt1 r0 = defpackage.yt1.A
            r1 = -1
            r2.<init>(r1, r0)
            return
    }

    public kd4(int r3, java.util.List r4) {
            r2 = this;
            r2.<init>()
            r2.a = r4
            r2.b = r3
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L10
            r2 = -1
            if (r3 == r2) goto L1e
        L10:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L1f
            int r2 = r4.size()
            if (r3 < 0) goto L1f
            if (r3 >= r2) goto L1f
        L1e:
            return
        L1f:
            java.lang.String r2 = "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '"
            java.lang.String r0 = "', bounds = '"
            java.lang.StringBuilder r2 = defpackage.xg6.t(r2, r3, r0)
            l93 r3 = new l93
            int r4 = r4.size()
            r0 = 1
            int r4 = r4 - r0
            r1 = 0
            r3.<init>(r1, r4, r0)
            java.lang.String r4 = "'."
            defpackage.u34.s(r2, r3, r4)
            r2 = 0
            throw r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<kd4> r2 = defpackage.kd4.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            kd4 r5 = (defpackage.kd4) r5
            int r2 = r4.b
            int r3 = r5.b
            if (r2 == r3) goto L19
            return r1
        L19:
            java.util.List r4 = r4.a
            java.util.List r5 = r5.a
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L24
            return r1
        L24:
            return r0
        L25:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.b
            int r0 = r0 * 31
            java.util.List r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NavigationEventHistory(currentIndex="
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mergedHistory="
            r0.append(r1)
            java.util.List r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
