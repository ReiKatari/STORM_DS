package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz5  reason: default package */
/* loaded from: classes.dex */
public final class uz5 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;
    public final java.lang.String d;

    public uz5(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof defpackage.uz5
            if (r0 != 0) goto L8
            goto L31
        L8:
            uz5 r3 = (defpackage.uz5) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.lang.String r2 = r2.d
            java.lang.String r3 = r3.d
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", developerName="
            java.lang.String r1 = ", isDSiWareTitle="
            java.lang.String r2 = "RomMetadata(romTitle="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            boolean r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", retroAchievementsHash="
            r0.append(r1)
            java.lang.String r5 = r5.d
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
