package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my1  reason: default package */
/* loaded from: classes.dex */
public final class my1 extends defpackage.ny1 {
    public final defpackage.a43 a;
    public final boolean b;
    public final boolean c;

    public my1(defpackage.a43 r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof defpackage.my1
            if (r0 != 0) goto L8
            goto L22
        L8:
            my1 r3 = (defpackage.my1) r3
            a43 r0 = r2.a
            a43 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L22
        L15:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            boolean r2 = r2.c
            boolean r3 = r3.c
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            a43 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.c
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SettingsScreen(romSettingsOverrides="
            r0.<init>(r1)
            a43 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", retroAchievementsRuntimeIdentityLocked="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", retroAchievementsInGameLogoutSupported="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.c
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
