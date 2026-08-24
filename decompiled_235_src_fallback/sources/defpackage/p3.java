package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p3  reason: default package */
/* loaded from: classes.dex */
public final class p3 extends defpackage.v3 {
    public final defpackage.ls3 a;
    public final defpackage.ta5 b;
    public final java.net.URL c;
    public final java.lang.String d;
    public final defpackage.n3 e;
    public final defpackage.bt f;
    public final long g;

    public p3(defpackage.ls3 r1, defpackage.ta5 r2, java.net.URL r3, java.lang.String r4, defpackage.n3 r5, defpackage.bt r6, long r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    @Override // defpackage.v3
    public final defpackage.bt a() {
            r0 = this;
            bt r0 = r0.f
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4e
        L3:
            boolean r0 = r5 instanceof defpackage.p3
            r1 = 0
            if (r0 != 0) goto L9
            goto L4d
        L9:
            p3 r5 = (defpackage.p3) r5
            ls3 r0 = r4.a
            ls3 r2 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L16
            goto L4d
        L16:
            ta5 r0 = r4.b
            ta5 r2 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L21
            goto L4d
        L21:
            java.net.URL r0 = r4.c
            java.net.URL r2 = r5.c
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2c
            goto L4d
        L2c:
            java.lang.String r0 = r4.d
            java.lang.String r2 = r5.d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L37
            goto L4d
        L37:
            n3 r0 = r4.e
            n3 r2 = r5.e
            if (r0 == r2) goto L3e
            goto L4d
        L3e:
            bt r0 = r4.f
            bt r2 = r5.f
            if (r0 == r2) goto L45
            return r1
        L45:
            long r2 = r4.g
            long r4 = r5.g
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L4e
        L4d:
            return r1
        L4e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            ls3 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            ta5 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.net.URL r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            n3 r2 = r3.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            bt r0 = r3.f
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r1 = r3.g
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardAttemptResult(key="
            r0.<init>(r1)
            ls3 r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = ", leaderboard="
            r0.append(r1)
            ta5 r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", gameIcon="
            r0.append(r1)
            java.net.URL r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ", currentValue="
            r0.append(r1)
            java.lang.String r1 = r4.d
            r0.append(r1)
            java.lang.String r1 = ", result="
            r0.append(r1)
            n3 r1 = r4.e
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            bt r1 = r4.f
            r0.append(r1)
            java.lang.String r1 = ", uiInstanceId="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r4.g
            java.lang.String r4 = defpackage.lb1.p(r0, r2, r1)
            return r4
    }
}
