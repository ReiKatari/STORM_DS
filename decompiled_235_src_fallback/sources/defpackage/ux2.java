package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux2  reason: default package */
/* loaded from: classes.dex */
public final class ux2 {
    public final defpackage.of5 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ux2(defpackage.of5 r1, boolean r2, boolean r3, boolean r4, boolean r5) {
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
            goto L32
        L3:
            boolean r0 = r3 instanceof defpackage.ux2
            if (r0 != 0) goto L8
            goto L30
        L8:
            ux2 r3 = (defpackage.ux2) r3
            of5 r0 = r3.a
            of5 r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L30
        L15:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L1c
            goto L30
        L1c:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L23
            goto L30
        L23:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L2a
            goto L30
        L2a:
            boolean r2 = r2.e
            boolean r3 = r3.e
            if (r2 == r3) goto L32
        L30:
            r2 = 0
            return r2
        L32:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            of5 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.e
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HingeInfo(bounds="
            r0.<init>(r1)
            of5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", isFlat="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", isVertical="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", isSeparating="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", isOccluding="
            r0.append(r1)
            boolean r2 = r2.e
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
