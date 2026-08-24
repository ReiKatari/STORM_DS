package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx3  reason: default package */
/* loaded from: classes.dex */
public final class xx3 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.io.File d;
    public final float e;

    public xx3(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.io.File r4, float r5) {
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
            goto L42
        L3:
            boolean r0 = r3 instanceof defpackage.xx3
            if (r0 != 0) goto L8
            goto L40
        L8:
            xx3 r3 = (defpackage.xx3) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.io.File r0 = r2.d
            java.io.File r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            float r2 = r2.e
            float r3 = r3.e
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
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
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 108812813(0x67c5a0d, float:4.746209E-35)
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.c
            int r0 = defpackage.xg6.d(r2, r1, r0)
            java.io.File r2 = r3.d
            if (r2 != 0) goto L22
            r2 = 0
            goto L26
        L22:
            int r2 = r2.hashCode()
        L26:
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 1
            int r0 = defpackage.xg6.e(r0, r2, r1)
            float r3 = r3.e
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", displayName="
            java.lang.String r1 = ", language=ru-RU, gender="
            java.lang.String r2 = "VoiceModelPack(id="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", modelFile="
            r0.append(r1)
            java.io.File r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", isInstalled=true, sizeMb="
            r0.append(r1)
            float r5 = r5.e
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
