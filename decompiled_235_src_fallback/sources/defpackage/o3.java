package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o3  reason: default package */
/* loaded from: classes.dex */
public final class o3 extends defpackage.v3 {
    public final defpackage.ls3 a;
    public final defpackage.ta5 b;
    public final java.net.URL c;
    public final java.lang.String d;
    public final defpackage.bt e;
    public final long f;

    public o3(defpackage.ls3 r1, defpackage.ta5 r2, java.net.URL r3, java.lang.String r4, defpackage.bt r5, long r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    @Override // defpackage.v3
    public final defpackage.bt a() {
            r0 = this;
            bt r0 = r0.e
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L47
        L3:
            boolean r0 = r5 instanceof defpackage.o3
            r1 = 0
            if (r0 != 0) goto L9
            goto L46
        L9:
            o3 r5 = (defpackage.o3) r5
            ls3 r0 = r4.a
            ls3 r2 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L16
            goto L46
        L16:
            ta5 r0 = r4.b
            ta5 r2 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L21
            goto L46
        L21:
            java.net.URL r0 = r4.c
            java.net.URL r2 = r5.c
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2c
            goto L46
        L2c:
            java.lang.String r0 = r4.d
            java.lang.String r2 = r5.d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L37
            goto L46
        L37:
            bt r0 = r4.e
            bt r2 = r5.e
            if (r0 == r2) goto L3e
            return r1
        L3e:
            long r2 = r4.f
            long r4 = r5.f
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L47
        L46:
            return r1
        L47:
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
            bt r2 = r3.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r0 = r3.f
            int r3 = java.lang.Long.hashCode(r0)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardAttempt(key="
            r0.<init>(r1)
            ls3 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", leaderboard="
            r0.append(r1)
            ta5 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", gameIcon="
            r0.append(r1)
            java.net.URL r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", currentValue="
            r0.append(r1)
            java.lang.String r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            bt r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", uiInstanceId="
            r0.append(r1)
            long r1 = r3.f
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
