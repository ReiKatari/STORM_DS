package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u75  reason: default package */
/* loaded from: classes.dex */
public final class u75 {
    public final long a;
    public final long b;
    public final java.lang.String c;
    public final defpackage.r75 d;
    public final java.net.URL e;

    public u75(long r1, long r3, java.lang.String r5, defpackage.r75 r6, java.net.URL r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r6
            r0.e = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3c
        L3:
            boolean r0 = r5 instanceof defpackage.u75
            if (r0 != 0) goto L8
            goto L3a
        L8:
            u75 r5 = (defpackage.u75) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L3a
        L13:
            long r0 = r4.b
            long r2 = r5.b
            boolean r0 = defpackage.ga5.a(r0, r2)
            if (r0 != 0) goto L1e
            goto L3a
        L1e:
            java.lang.String r0 = r4.c
            java.lang.String r1 = r5.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L29
            goto L3a
        L29:
            r75 r0 = r4.d
            r75 r1 = r5.d
            if (r0 == r1) goto L30
            goto L3a
        L30:
            java.net.URL r4 = r4.e
            java.net.URL r5 = r5.e
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3c
        L3a:
            r4 = 0
            return r4
        L3c:
            r4 = 1
            return r4
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
            java.net.URL r4 = r4.e
            int r4 = r4.hashCode()
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            long r0 = r4.b
            java.lang.String r0 = defpackage.ga5.b(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "RAAchievementSetSummary(setId="
            r1.<init>(r2)
            long r2 = r4.a
            r1.append(r2)
            java.lang.String r2 = ", gameId="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", title="
            r1.append(r0)
            java.lang.String r0 = r4.c
            r1.append(r0)
            java.lang.String r0 = ", type="
            r1.append(r0)
            r75 r0 = r4.d
            r1.append(r0)
            java.lang.String r0 = ", iconUrl="
            r1.append(r0)
            java.net.URL r4 = r4.e
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }
}
