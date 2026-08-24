package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq7  reason: default package */
/* loaded from: classes.dex */
public final class yq7 {
    public final defpackage.sr7 a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;

    public yq7(defpackage.sr7 r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof defpackage.yq7
            if (r0 != 0) goto L8
            goto L47
        L8:
            yq7 r3 = (defpackage.yq7) r3
            sr7 r0 = r2.a
            sr7 r1 = r3.a
            if (r0 == r1) goto L11
            goto L47
        L11:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L47
        L1c:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L47
        L27:
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L32
            goto L47
        L32:
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            java.lang.String r2 = r2.f
            java.lang.String r3 = r3.f
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            sr7 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            r2 = 0
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r4 = r4.f
            if (r4 != 0) goto L33
            goto L37
        L33:
            int r2 = r4.hashCode()
        L37:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VulkanDriverConfiguration(mode="
            r0.<init>(r1)
            sr7 r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", tmpLibDir="
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", hookLibDir="
            r0.append(r1)
            java.lang.String r1 = ", customDriverDir="
            java.lang.String r2 = ", customDriverName="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.e
            r0.append(r1)
            java.lang.String r1 = ", customDriverDisplayName="
            r0.append(r1)
            java.lang.String r5 = r5.f
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
