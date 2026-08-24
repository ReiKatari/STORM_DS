package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu4  reason: default package */
/* loaded from: classes.dex */
public final class yu4 implements defpackage.zu4 {
    public final defpackage.gd5 a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final java.lang.String i;
    public final defpackage.bd5 j;

    public yu4(defpackage.gd5 r1, java.lang.String r2, long r3, long r5, long r7, long r9, long r11, int r13, java.lang.String r14) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r7
            r0.f = r9
            r0.g = r11
            r0.h = r13
            r0.i = r14
            bd5 r1 = defpackage.bd5.LEADERBOARD
            r0.j = r1
            return
    }

    @Override // defpackage.zu4
    public final defpackage.bd5 a() {
            r0 = this;
            bd5 r0 = r0.j
            return r0
    }

    @Override // defpackage.zu4
    public final defpackage.gd5 b() {
            r0 = this;
            gd5 r0 = r0.a
            return r0
    }

    @Override // defpackage.zu4
    public final java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    @Override // defpackage.zu4
    public final long d() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    @Override // defpackage.zu4
    public final long e() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L60
        L3:
            boolean r0 = r5 instanceof defpackage.yu4
            if (r0 != 0) goto L8
            goto L5e
        L8:
            yu4 r5 = (defpackage.yu4) r5
            gd5 r0 = r4.a
            gd5 r1 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L5e
        L15:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L5e
        L20:
            long r0 = r4.c
            long r2 = r5.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L5e
        L29:
            long r0 = r4.d
            long r2 = r5.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L5e
        L32:
            long r0 = r4.e
            long r2 = r5.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            goto L5e
        L3b:
            long r0 = r4.f
            long r2 = r5.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L44
            goto L5e
        L44:
            long r0 = r4.g
            long r2 = r5.g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4d
            goto L5e
        L4d:
            int r0 = r4.h
            int r1 = r5.h
            if (r0 == r1) goto L54
            goto L5e
        L54:
            java.lang.String r4 = r4.i
            java.lang.String r5 = r5.i
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L60
        L5e:
            r4 = 0
            return r4
        L60:
            r4 = 1
            return r4
    }

    @Override // defpackage.zu4
    public final long f() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public final int hashCode() {
            r4 = this;
            gd5 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            r2 = 1
            int r0 = defpackage.xg6.e(r0, r2, r1)
            long r2 = r4.f
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.g
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r2 = r4.h
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r4 = r4.i
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardEntry(context="
            r0.<init>(r1)
            gd5 r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", submissionId="
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", nativeSubmissionId="
            r0.append(r1)
            long r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", sequence="
            java.lang.String r2 = ", createdAtEpochMs="
            long r3 = r5.d
            defpackage.xg6.B(r0, r1, r3, r2)
            long r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", hardcore=true, leaderboardId="
            java.lang.String r2 = ", attemptId="
            long r3 = r5.f
            defpackage.xg6.B(r0, r1, r3, r2)
            long r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", rawScore="
            r0.append(r1)
            int r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", formattedScore="
            r0.append(r1)
            java.lang.String r5 = r5.i
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
