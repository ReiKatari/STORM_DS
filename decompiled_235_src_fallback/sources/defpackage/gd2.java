package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd2  reason: default package */
/* loaded from: classes.dex */
public final class gd2 implements defpackage.tt7 {
    @Override // defpackage.tt7
    public final int a(defpackage.qh1 r1) {
            r0 = this;
            r0 = 0
            int r0 = r1.r0(r0)
            return r0
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            r0 = 0
            int r0 = r1.r0(r0)
            return r0
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r1) {
            r0 = this;
            r0 = 0
            int r0 = r1.r0(r0)
            return r0
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            r0 = 0
            int r0 = r1.r0(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L3
            goto L21
        L3:
            boolean r0 = r1 instanceof defpackage.gd2
            if (r0 != 0) goto L8
            goto L23
        L8:
            r0 = 0
            boolean r1 = defpackage.om1.b(r0, r0)
            if (r1 == 0) goto L23
            boolean r1 = defpackage.om1.b(r0, r0)
            if (r1 == 0) goto L23
            boolean r1 = defpackage.om1.b(r0, r0)
            if (r1 == 0) goto L23
            boolean r0 = defpackage.om1.b(r0, r0)
            if (r0 == 0) goto L23
        L21:
            r0 = 1
            return r0
        L23:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r2 = 0
            int r0 = java.lang.Float.hashCode(r2)
            r1 = 31
            int r0 = r0 * r1
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r2 = java.lang.Float.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Insets(left="
            r2.<init>(r0)
            r0 = 0
            java.lang.String r1 = defpackage.om1.c(r0)
            r2.append(r1)
            java.lang.String r1 = ", top="
            r2.append(r1)
            java.lang.String r1 = defpackage.om1.c(r0)
            r2.append(r1)
            java.lang.String r1 = ", right="
            r2.append(r1)
            java.lang.String r1 = defpackage.om1.c(r0)
            r2.append(r1)
            java.lang.String r1 = ", bottom="
            r2.append(r1)
            java.lang.String r0 = defpackage.om1.c(r0)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }
}
