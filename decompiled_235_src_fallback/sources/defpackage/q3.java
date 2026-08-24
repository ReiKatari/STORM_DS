package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q3  reason: default package */
/* loaded from: classes.dex */
public final class q3 extends defpackage.v3 {
    public final long a;
    public final defpackage.ls3 b;
    public final java.lang.String c;
    public final java.net.URL d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final long g;
    public final long h;
    public final defpackage.bt i;
    public final long j;

    public q3(long r1, defpackage.ls3 r3, java.lang.String r4, java.net.URL r5, java.lang.String r6, java.lang.String r7, long r8, long r10, defpackage.bt r12, long r13) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r0.h = r10
            r0.i = r12
            r0.j = r13
            return
    }

    @Override // defpackage.v3
    public final defpackage.bt a() {
            r0 = this;
            bt r0 = r0.i
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            goto L6f
        L4:
            boolean r0 = r7 instanceof defpackage.q3
            r1 = 0
            if (r0 != 0) goto Lb
            goto L6e
        Lb:
            q3 r7 = (defpackage.q3) r7
            long r2 = r6.a
            long r4 = r7.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L16
            goto L6e
        L16:
            ls3 r0 = r6.b
            ls3 r2 = r7.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L21
            goto L6e
        L21:
            java.lang.String r0 = r6.c
            java.lang.String r2 = r7.c
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L2c
            goto L6e
        L2c:
            java.net.URL r0 = r6.d
            java.net.URL r2 = r7.d
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L37
            goto L6e
        L37:
            java.lang.String r0 = r6.e
            java.lang.String r2 = r7.e
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L42
            goto L6e
        L42:
            java.lang.String r0 = r6.f
            java.lang.String r2 = r7.f
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L4d
            goto L6e
        L4d:
            long r2 = r6.g
            long r4 = r7.g
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L56
            goto L6e
        L56:
            long r2 = r6.h
            long r4 = r7.h
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L5f
            goto L6e
        L5f:
            bt r0 = r6.i
            bt r2 = r7.i
            if (r0 == r2) goto L66
            return r1
        L66:
            long r2 = r6.j
            long r6 = r7.j
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L6f
        L6e:
            return r1
        L6f:
            r6 = 1
            return r6
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            ls3 r3 = r4.b
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r3)
            java.net.URL r3 = r4.d
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.e
            int r0 = defpackage.xg6.d(r0, r1, r3)
            java.lang.String r3 = r4.f
            if (r3 != 0) goto L33
            goto L37
        L33:
            int r2 = r3.hashCode()
        L37:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.g
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.h
            int r0 = defpackage.i61.c(r2, r0, r1)
            bt r2 = r4.i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r0 = r4.j
            int r4 = java.lang.Long.hashCode(r0)
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardEntrySubmitted(leaderboardId="
            r0.<init>(r1)
            long r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", attemptKey="
            r0.append(r1)
            ls3 r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", gameIcon="
            r0.append(r1)
            java.net.URL r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", submittedScore="
            java.lang.String r2 = ", bestScore="
            java.lang.String r3 = r5.e
            java.lang.String r4 = r5.f
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", rank="
            java.lang.String r2 = ", numberOfEntries="
            long r3 = r5.g
            defpackage.xg6.B(r0, r1, r3, r2)
            long r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            bt r1 = r5.i
            r0.append(r1)
            java.lang.String r1 = ", uiInstanceId="
            java.lang.String r2 = ")"
            long r3 = r5.j
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
