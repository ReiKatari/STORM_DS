package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek4  reason: default package */
/* loaded from: classes.dex */
public final class ek4 {
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;
    public final long e;
    public final boolean f;
    public final java.lang.String g;
    public final long h;
    public final long i;
    public final long j;
    public final defpackage.gk4 k;
    public final defpackage.ik4 l;
    public final boolean m;

    public ek4(long r1, java.lang.String r3, java.lang.String r4, long r5, long r7, boolean r9, java.lang.String r10, long r11, long r13, long r15, defpackage.gk4 r17, defpackage.ik4 r18, boolean r19) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r10.getClass()
            r17.getClass()
            r18.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r7
            r0.f = r9
            r0.g = r10
            r0.h = r11
            r0.i = r13
            r1 = r15
            r0.j = r1
            r1 = r17
            r0.k = r1
            r1 = r18
            r0.l = r1
            r1 = r19
            r0.m = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ek4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ek4 r8 = (defpackage.ek4) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            return r2
        L34:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L3d
            return r2
        L3d:
            boolean r1 = r7.f
            boolean r3 = r8.f
            if (r1 == r3) goto L44
            return r2
        L44:
            java.lang.String r1 = r7.g
            java.lang.String r3 = r8.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4f
            return r2
        L4f:
            long r3 = r7.h
            long r5 = r8.h
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L58
            return r2
        L58:
            long r3 = r7.i
            long r5 = r8.i
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L61
            return r2
        L61:
            long r3 = r7.j
            long r5 = r8.j
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L6a
            return r2
        L6a:
            gk4 r1 = r7.k
            gk4 r3 = r8.k
            if (r1 == r3) goto L71
            return r2
        L71:
            ik4 r1 = r7.l
            ik4 r3 = r8.l
            if (r1 == r3) goto L78
            return r2
        L78:
            boolean r7 = r7.m
            boolean r8 = r8.m
            if (r7 == r8) goto L7f
            return r2
        L7f:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r2 = r4.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r4.g
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.h
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.i
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.j
            int r0 = defpackage.i61.c(r2, r0, r1)
            gk4 r2 = r4.k
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ik4 r0 = r4.l
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r4 = r4.m
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflineUnlockEvent(seq="
            r0.<init>(r1)
            long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", userId="
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", contentId="
            r0.append(r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", gameId="
            r0.append(r1)
            long r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", achievementId="
            java.lang.String r2 = ", isHardcore="
            long r3 = r5.e
            defpackage.xg6.B(r0, r1, r3, r2)
            boolean r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", sessionId="
            r0.append(r1)
            java.lang.String r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", localTimestampEpochMs="
            r0.append(r1)
            long r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", offsetFromSessionStartMs="
            java.lang.String r2 = ", orderIndex="
            long r3 = r5.i
            defpackage.xg6.B(r0, r1, r3, r2)
            long r1 = r5.j
            r0.append(r1)
            java.lang.String r1 = ", unlockMode="
            r0.append(r1)
            gk4 r1 = r5.k
            r0.append(r1)
            java.lang.String r1 = ", offlineType="
            r0.append(r1)
            ik4 r1 = r5.l
            r0.append(r1)
            java.lang.String r1 = ", pendingSync="
            r0.append(r1)
            boolean r5 = r5.m
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
