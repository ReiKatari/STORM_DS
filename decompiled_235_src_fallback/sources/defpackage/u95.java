package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u95  reason: default package */
/* loaded from: classes.dex */
public final class u95 extends defpackage.ca5 {
    public final defpackage.ls3 a;
    public final defpackage.ta5 b;
    public final java.net.URL c;

    public u95(defpackage.ls3 r1, defpackage.ta5 r2, java.net.URL r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.u95
            if (r0 != 0) goto L8
            goto L2a
        L8:
            u95 r3 = (defpackage.u95) r3
            ls3 r0 = r2.a
            ls3 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            ta5 r0 = r2.b
            ta5 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.net.URL r2 = r2.c
            java.net.URL r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            ls3 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ta5 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.URL r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardAttemptStarted(key="
            r0.<init>(r1)
            ls3 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", leaderboard="
            r0.append(r1)
            ta5 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", gameIcon="
            r0.append(r1)
            java.net.URL r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
