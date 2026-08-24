package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un5  reason: default package */
/* loaded from: classes.dex */
public final class un5 extends defpackage.vn5 {
    public final defpackage.ta5 a;
    public final int b;
    public final java.lang.String c;
    public final defpackage.hb5 d;
    public final boolean e;

    public un5(defpackage.ta5 r1, int r2, java.lang.String r3, defpackage.hb5 r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof defpackage.un5
            if (r0 != 0) goto L8
            goto L38
        L8:
            un5 r3 = (defpackage.un5) r3
            ta5 r0 = r2.a
            ta5 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            int r0 = r2.b
            int r1 = r3.b
            if (r0 == r1) goto L1c
            goto L38
        L1c:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L38
        L27:
            hb5 r0 = r2.d
            hb5 r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L38
        L32:
            boolean r2 = r2.e
            boolean r3 = r3.e
            if (r2 == r3) goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            ta5 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            hb5 r2 = r3.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.e
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LeaderboardEntrySubmission(leaderboard="
            r0.<init>(r1)
            ta5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", formattedValue="
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", authentication="
            r0.append(r1)
            hb5 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", firstTry="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.e
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
