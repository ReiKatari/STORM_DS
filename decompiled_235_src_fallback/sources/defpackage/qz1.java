package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz1  reason: default package */
/* loaded from: classes.dex */
public final class qz1 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final defpackage.gk4 d;
    public final defpackage.ik4 e;
    public final java.lang.String f;
    public final long g;
    public long h;

    public qz1(java.lang.String r1, java.lang.String r2, long r3, defpackage.gk4 r5, defpackage.ik4 r6, java.lang.String r7, long r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r6.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r1 = 0
            r0.h = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L55
        L3:
            boolean r0 = r5 instanceof defpackage.qz1
            if (r0 != 0) goto L8
            goto L53
        L8:
            qz1 r5 = (defpackage.qz1) r5
            java.lang.String r0 = r4.a
            java.lang.String r1 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L53
        L15:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L53
        L20:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L53
        L29:
            gk4 r0 = r4.d
            gk4 r1 = r5.d
            if (r0 == r1) goto L30
            goto L53
        L30:
            ik4 r0 = r4.e
            ik4 r1 = r5.e
            if (r0 == r1) goto L37
            goto L53
        L37:
            java.lang.String r0 = r4.f
            java.lang.String r1 = r5.f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L53
        L42:
            long r0 = r4.g
            long r2 = r5.g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4b
            goto L53
        L4b:
            long r0 = r4.h
            long r4 = r5.h
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L55
        L53:
            r4 = 0
            return r4
        L55:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            gk4 r2 = r4.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ik4 r0 = r4.e
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.g
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.h
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r7 = this;
            long r0 = r7.h
            java.lang.String r2 = ", contentId="
            java.lang.String r3 = ", gameId="
            java.lang.String r4 = "OfflineRetroAchievementsSession(userId="
            java.lang.String r5 = r7.a
            java.lang.String r6 = r7.b
            java.lang.StringBuilder r2 = defpackage.i61.u(r4, r5, r2, r6, r3)
            long r3 = r7.c
            r2.append(r3)
            java.lang.String r3 = ", unlockMode="
            r2.append(r3)
            gk4 r3 = r7.d
            r2.append(r3)
            java.lang.String r3 = ", offlineType="
            r2.append(r3)
            ik4 r3 = r7.e
            r2.append(r3)
            java.lang.String r3 = ", sessionId="
            r2.append(r3)
            java.lang.String r3 = r7.f
            r2.append(r3)
            java.lang.String r3 = ", startedAtEpochMs="
            java.lang.String r4 = ", nextOrderIndex="
            long r5 = r7.g
            defpackage.xg6.B(r2, r3, r5, r4)
            java.lang.String r7 = ")"
            java.lang.String r7 = defpackage.lb1.p(r2, r0, r7)
            return r7
    }
}
