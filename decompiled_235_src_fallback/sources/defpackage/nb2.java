package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb2  reason: default package */
/* loaded from: classes.dex */
public final class nb2 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.mt5 d;
    public final java.util.Date e;
    public final boolean f;
    public final java.lang.String g;
    public final long h;
    public final boolean i;

    public nb2(java.lang.String r1, java.lang.String r2, java.lang.String r3, defpackage.mt5 r4, java.util.Date r5, boolean r6, java.lang.String r7, long r8, boolean r10) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r7.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L65
        L4:
            boolean r0 = r5 instanceof defpackage.nb2
            if (r0 != 0) goto L9
            goto L63
        L9:
            nb2 r5 = (defpackage.nb2) r5
            java.lang.String r0 = r4.a
            java.lang.String r1 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L16
            goto L63
        L16:
            java.lang.String r0 = r4.b
            java.lang.String r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L21
            goto L63
        L21:
            java.lang.String r0 = r4.c
            java.lang.String r1 = r5.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2c
            goto L63
        L2c:
            mt5 r0 = r4.d
            mt5 r1 = r5.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L63
        L37:
            java.util.Date r0 = r4.e
            java.util.Date r1 = r5.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L42
            goto L63
        L42:
            boolean r0 = r4.f
            boolean r1 = r5.f
            if (r0 == r1) goto L49
            goto L63
        L49:
            java.lang.String r0 = r4.g
            java.lang.String r1 = r5.g
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L54
            goto L63
        L54:
            long r0 = r4.h
            long r2 = r5.h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L5d
            goto L63
        L5d:
            boolean r4 = r4.i
            boolean r5 = r5.i
            if (r4 == r5) goto L65
        L63:
            r4 = 0
            return r4
        L65:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            mt5 r2 = r4.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Date r0 = r4.e
            if (r0 != 0) goto L23
            r0 = 0
            goto L27
        L23:
            int r0 = r0.hashCode()
        L27:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f
            int r0 = defpackage.xg6.e(r2, r0, r1)
            java.lang.String r2 = r4.g
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.h
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r4 = r4.i
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", developerName="
            java.lang.String r1 = ", fileName="
            java.lang.String r2 = "RomMetadataMirrorDto(name="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", config="
            r0.append(r1)
            mt5 r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", lastPlayed="
            r0.append(r1)
            java.util.Date r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", isDsiWareTitle="
            r0.append(r1)
            boolean r1 = r5.f
            r0.append(r1)
            java.lang.String r1 = ", retroAchievementsHash="
            r0.append(r1)
            java.lang.String r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", totalPlayTime="
            r0.append(r1)
            long r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", isFavorite="
            r0.append(r1)
            boolean r5 = r5.i
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
