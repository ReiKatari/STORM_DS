package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c6  reason: default package */
/* loaded from: classes.dex */
public final class c6 {
    public final long a;
    public final java.lang.String b;
    public final defpackage.r75 c;
    public final java.net.URL d;
    public final defpackage.qq5 e;
    public final java.util.List f;
    public final java.util.List g;

    public c6(long r1, java.lang.String r3, defpackage.r75 r4, java.net.URL r5, defpackage.qq5 r6, java.util.List r7, java.util.List r8) {
            r0 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L52
        L3:
            boolean r0 = r5 instanceof defpackage.c6
            if (r0 != 0) goto L8
            goto L50
        L8:
            c6 r5 = (defpackage.c6) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L50
        L13:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1e
            goto L50
        L1e:
            r75 r0 = r4.c
            r75 r1 = r5.c
            if (r0 == r1) goto L25
            goto L50
        L25:
            java.net.URL r0 = r4.d
            java.net.URL r1 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L30
            goto L50
        L30:
            qq5 r0 = r4.e
            qq5 r1 = r5.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3b
            goto L50
        L3b:
            java.util.List r0 = r4.f
            java.util.List r1 = r5.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L46
            goto L50
        L46:
            java.util.List r4 = r4.g
            java.util.List r5 = r5.g
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L52
        L50:
            r4 = 0
            return r4
        L52:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            r75 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.net.URL r0 = r3.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            qq5 r2 = r3.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r3.f
            int r0 = defpackage.i61.b(r2, r0, r1)
            java.util.List r3 = r3.g
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AchievementSetUiModel(setId="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", setTitle="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", setType="
            r0.append(r1)
            r75 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", setIcon="
            r0.append(r1)
            java.net.URL r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", setSummary="
            r0.append(r1)
            qq5 r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", buckets="
            r0.append(r1)
            java.util.List r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", leaderboards="
            r0.append(r1)
            java.util.List r3 = r3.g
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
