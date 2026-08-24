package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s75  reason: default package */
/* loaded from: classes.dex */
public final class s75 {
    public final long a;
    public final long b;
    public final java.lang.String c;
    public final defpackage.r75 d;
    public final java.net.URL e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;

    public s75(long r1, long r3, defpackage.r75 r5, java.lang.String r6, java.net.URL r7, java.util.ArrayList r8, java.util.ArrayList r9) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r6
            r0.d = r5
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
            boolean r0 = r7 instanceof defpackage.s75
            r1 = 0
            if (r0 != 0) goto L9
            goto L50
        L9:
            s75 r7 = (defpackage.s75) r7
            long r2 = r6.a
            long r4 = r7.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L53
            long r2 = r6.b
            long r4 = r7.b
            boolean r0 = defpackage.ga5.a(r2, r4)
            if (r0 != 0) goto L1e
            goto L50
        L1e:
            java.lang.String r0 = r6.c
            java.lang.String r2 = r7.c
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L29
            goto L50
        L29:
            r75 r0 = r6.d
            r75 r2 = r7.d
            if (r0 == r2) goto L30
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
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r2 = r4.c
            if (r2 != 0) goto L15
            r2 = 0
            goto L19
        L15:
            int r2 = r2.hashCode()
        L19:
            int r0 = r0 + r2
            int r0 = r0 * r1
            r75 r2 = r4.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.net.URL r0 = r4.e
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.ArrayList r2 = r4.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.ArrayList r4 = r4.g
            int r4 = r4.hashCode()
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.a
            java.lang.String r0 = defpackage.mp2.a0(r0)
            long r1 = r5.b
            java.lang.String r1 = defpackage.ga5.b(r1)
            java.lang.String r2 = ", gameId="
            java.lang.String r3 = ", title="
            java.lang.String r4 = "RAAchievementSet(id="
            java.lang.StringBuilder r0 = defpackage.i61.u(r4, r0, r2, r1, r3)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            r75 r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", iconUrl="
            r0.append(r1)
            java.net.URL r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", achievements="
            r0.append(r1)
            java.util.ArrayList r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", leaderboards="
            r0.append(r1)
            java.util.ArrayList r5 = r5.g
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
