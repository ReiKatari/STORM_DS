package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv2  reason: default package */
/* loaded from: classes.dex */
public final class wv2 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int e;

    public wv2(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.a = r3
            r0.b = r4
            r0.c = r5
            r0.d = r1
            r0.e = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof defpackage.wv2
            if (r0 != 0) goto L8
            goto L38
        L8:
            wv2 r3 = (defpackage.wv2) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L38
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L38
        L2b:
            int r0 = r2.d
            int r1 = r3.d
            if (r0 == r1) goto L32
            goto L38
        L32:
            int r2 = r2.e
            int r3 = r3.e
            if (r2 == r3) goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.e
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", contentId="
            java.lang.String r1 = ", gameTitle="
            java.lang.String r2 = "PendingHardcoreUnlockLoss(userId="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", achievementCount="
            r0.append(r1)
            int r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", leaderboardCount="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r5 = r5.e
            java.lang.String r5 = defpackage.lb1.o(r0, r5, r1)
            return r5
    }
}
