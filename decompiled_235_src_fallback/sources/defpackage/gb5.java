package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb5  reason: default package */
/* loaded from: classes.dex */
public final class gb5 {
    public final long a;
    public final java.lang.String b;
    public final defpackage.r75 c;
    public final long d;
    public final java.net.URL e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;

    public gb5(long r1, long r3, defpackage.r75 r5, java.lang.String r6, java.net.URL r7, java.util.ArrayList r8, java.util.ArrayList r9) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r6
            r0.c = r5
            r0.d = r3
            r0.e = r7
            r0.f = r8
            r0.g = r9
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L3
            goto L51
        L3:
            boolean r0 = r7 instanceof defpackage.gb5
            r1 = 0
            if (r0 != 0) goto L9
            goto L50
        L9:
            gb5 r7 = (defpackage.gb5) r7
            long r2 = r6.a
            long r4 = r7.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L53
            java.lang.String r0 = r6.b
            java.lang.String r2 = r7.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L1e
            goto L50
        L1e:
            r75 r0 = r6.c
            r75 r2 = r7.c
            if (r0 == r2) goto L25
            goto L50
        L25:
            long r2 = r6.d
            long r4 = r7.d
            boolean r0 = defpackage.ga5.a(r2, r4)
            if (r0 != 0) goto L30
            goto L50
        L30:
            java.net.URL r0 = r6.e
            java.net.URL r2 = r7.e
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            goto L50
        L3b:
            java.util.ArrayList r0 = r6.f
            java.util.ArrayList r2 = r7.f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L46
            goto L50
        L46:
            java.util.ArrayList r6 = r6.g
            java.util.ArrayList r7 = r7.g
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L51
        L50:
            return r1
        L51:
            r6 = 1
            return r6
        L53:
            return r1
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r5.b
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            r75 r2 = r5.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.d
            int r0 = defpackage.i61.c(r3, r2, r1)
            java.net.URL r2 = r5.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.ArrayList r0 = r5.f
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.ArrayList r5 = r5.g
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r6 = this;
            long r0 = r6.a
            java.lang.String r0 = defpackage.mp2.a0(r0)
            long r1 = r6.d
            java.lang.String r1 = defpackage.ga5.b(r1)
            java.lang.String r2 = ", title="
            java.lang.String r3 = ", type="
            java.lang.String r4 = "RAUserAchievementSet(id="
            java.lang.String r5 = r6.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r4, r0, r2, r5, r3)
            r75 r2 = r6.c
            r0.append(r2)
            java.lang.String r2 = ", gameId="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", iconUrl="
            r0.append(r1)
            java.net.URL r1 = r6.e
            r0.append(r1)
            java.lang.String r1 = ", achievements="
            r0.append(r1)
            java.util.ArrayList r1 = r6.f
            r0.append(r1)
            java.lang.String r1 = ", leaderboards="
            r0.append(r1)
            java.util.ArrayList r6 = r6.g
            r0.append(r6)
            java.lang.String r6 = ")"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
