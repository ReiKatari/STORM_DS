package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad4  reason: default package */
/* loaded from: classes.dex */
public final class ad4 {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    public ad4(boolean r1, boolean r2, int r3, boolean r4, boolean r5, int r6, int r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 == 0) goto L38
            boolean r1 = r4 instanceof defpackage.ad4
            if (r1 != 0) goto Lb
            goto L38
        Lb:
            ad4 r4 = (defpackage.ad4) r4
            boolean r1 = r4.a
            boolean r2 = r3.a
            if (r2 != r1) goto L38
            boolean r1 = r3.b
            boolean r2 = r4.b
            if (r1 != r2) goto L38
            int r1 = r3.c
            int r2 = r4.c
            if (r1 != r2) goto L38
            boolean r1 = r3.d
            boolean r2 = r4.d
            if (r1 != r2) goto L38
            boolean r1 = r3.e
            boolean r2 = r4.e
            if (r1 != r2) goto L38
            int r1 = r3.f
            int r2 = r4.f
            if (r1 != r2) goto L38
            int r3 = r3.g
            int r4 = r4.g
            if (r3 != r4) goto L38
            return r0
        L38:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.a
            int r0 = r0 * 31
            boolean r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            r1 = 923521(0xe1781, float:1.294129E-39)
            int r0 = r0 * r1
            boolean r1 = r2.d
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.e
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.g
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r0 = r0 + (-1)
            int r0 = r0 * 31
            int r0 = r0 + (-1)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<ad4> r1 = defpackage.ad4.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            boolean r1 = r4.a
            if (r1 == 0) goto L1c
            java.lang.String r1 = "launchSingleTop "
            r0.append(r1)
        L1c:
            boolean r1 = r4.b
            if (r1 == 0) goto L25
            java.lang.String r1 = "restoreState "
            r0.append(r1)
        L25:
            r1 = -1
            int r2 = r4.g
            int r4 = r4.f
            if (r4 != r1) goto L2f
            if (r2 != r1) goto L2f
            goto L64
        L2f:
            java.lang.String r3 = "anim(enterAnim=0x"
            r0.append(r3)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            java.lang.String r4 = " exitAnim=0x"
            r0.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r2)
            r0.append(r4)
            java.lang.String r4 = " popEnterAnim=0x"
            r0.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r1)
            r0.append(r4)
            java.lang.String r4 = " popExitAnim=0x"
            r0.append(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r1)
            r0.append(r4)
            java.lang.String r4 = ")"
            r0.append(r4)
        L64:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
