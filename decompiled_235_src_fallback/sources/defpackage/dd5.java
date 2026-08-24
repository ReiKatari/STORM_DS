package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd5  reason: default package */
/* loaded from: classes.dex */
public final class dd5 {
    public final defpackage.fd5 a;
    public final defpackage.lc5 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final defpackage.lc5 h;
    public final boolean i;

    public dd5(defpackage.fd5 r1, defpackage.lc5 r2, int r3, int r4, int r5, int r6, int r7, defpackage.lc5 r8, boolean r9) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L52
        L3:
            boolean r0 = r3 instanceof defpackage.dd5
            if (r0 != 0) goto L8
            goto L50
        L8:
            dd5 r3 = (defpackage.dd5) r3
            fd5 r0 = r2.a
            fd5 r1 = r3.a
            if (r0 == r1) goto L11
            goto L50
        L11:
            lc5 r0 = r2.b
            lc5 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L50
        L1c:
            int r0 = r2.c
            int r1 = r3.c
            if (r0 == r1) goto L23
            goto L50
        L23:
            int r0 = r2.d
            int r1 = r3.d
            if (r0 == r1) goto L2a
            goto L50
        L2a:
            int r0 = r2.e
            int r1 = r3.e
            if (r0 == r1) goto L31
            goto L50
        L31:
            int r0 = r2.f
            int r1 = r3.f
            if (r0 == r1) goto L38
            goto L50
        L38:
            int r0 = r2.g
            int r1 = r3.g
            if (r0 == r1) goto L3f
            goto L50
        L3f:
            lc5 r0 = r2.h
            lc5 r1 = r3.h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4a
            goto L50
        L4a:
            boolean r2 = r2.i
            boolean r3 = r3.i
            if (r2 == r3) goto L52
        L50:
            r2 = 0
            return r2
        L52:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            fd5 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            lc5 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.c
            int r0 = defpackage.lb1.a(r0, r2, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.e
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.f
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.g
            int r0 = defpackage.lb1.a(r2, r0, r1)
            lc5 r2 = r3.h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.i
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RaPendingSyncResult(source="
            r0.<init>(r1)
            fd5 r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", before="
            r0.append(r1)
            lc5 r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", submittedAchievements="
            r0.append(r1)
            java.lang.String r1 = ", submittedLeaderboardEntries="
            java.lang.String r2 = ", alreadyAccepted="
            int r3 = r5.c
            int r4 = r5.d
            defpackage.lb1.x(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", failedAchievements="
            java.lang.String r2 = ", failedLeaderboardEntries="
            int r3 = r5.e
            int r4 = r5.f
            defpackage.lb1.x(r0, r3, r1, r4, r2)
            int r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", remaining="
            r0.append(r1)
            lc5 r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", transientFailure="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.i
            java.lang.String r5 = defpackage.i61.o(r0, r5, r1)
            return r5
    }
}
