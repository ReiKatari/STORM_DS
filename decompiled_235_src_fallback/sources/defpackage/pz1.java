package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pz1  reason: default package */
/* loaded from: classes.dex */
public final class pz1 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.vj4 c;
    public final defpackage.ep2 d;
    public final boolean e;

    public pz1(java.lang.String r1, java.lang.String r2, defpackage.vj4 r3, defpackage.ep2 r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L3a
        L3:
            boolean r0 = r4 instanceof defpackage.pz1
            r1 = 0
            if (r0 != 0) goto L9
            goto L39
        L9:
            pz1 r4 = (defpackage.pz1) r4
            java.lang.String r0 = r3.a
            java.lang.String r2 = r4.a
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L16
            goto L39
        L16:
            java.lang.String r0 = r3.b
            java.lang.String r2 = r4.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L21
            goto L39
        L21:
            vj4 r0 = r3.c
            vj4 r2 = r4.c
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2c
            goto L39
        L2c:
            ep2 r0 = r3.d
            ep2 r2 = r4.d
            if (r0 == r2) goto L33
            return r1
        L33:
            boolean r3 = r3.e
            boolean r4 = r4.e
            if (r3 == r4) goto L3a
        L39:
            return r1
        L3a:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            vj4 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ep2 r0 = r3.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r3 = r3.e
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", contentId="
            java.lang.String r1 = ", cache="
            java.lang.String r2 = "OfflineRetroAchievementsContext(userId="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            vj4 r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", achievementData="
            r0.append(r1)
            ep2 r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", missingCache="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.e
            java.lang.String r5 = defpackage.i61.o(r0, r5, r1)
            return r5
    }
}
