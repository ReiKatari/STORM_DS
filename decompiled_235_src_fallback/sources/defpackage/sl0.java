package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sl0  reason: default package */
/* loaded from: classes.dex */
public final class sl0 {
    public final defpackage.e40 a;
    public final defpackage.qn2 b;
    public final defpackage.rc2 c;
    public final boolean d;

    public sl0(defpackage.e40 r1, defpackage.qn2 r2, defpackage.rc2 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof defpackage.sl0
            if (r0 != 0) goto L8
            goto L31
        L8:
            sl0 r3 = (defpackage.sl0) r3
            e40 r0 = r2.a
            e40 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            qn2 r0 = r2.b
            qn2 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            rc2 r0 = r2.c
            rc2 r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            boolean r2 = r2.d
            boolean r3 = r3.d
            if (r2 == r3) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            e40 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            qn2 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            rc2 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r2 = r2.d
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChangeSize(alignment="
            r0.<init>(r1)
            e40 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            qn2 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", animationSpec="
            r0.append(r1)
            rc2 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", clip="
            r0.append(r1)
            boolean r2 = r2.d
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
