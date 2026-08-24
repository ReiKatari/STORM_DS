package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm1  reason: default package */
/* loaded from: classes.dex */
public final class tm1 {
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r2 = r3 instanceof defpackage.tm1
            if (r2 != 0) goto L9
            goto L28
        L9:
            r2 = 1092616192(0x41200000, float:10.0)
            boolean r3 = defpackage.om1.b(r2, r2)
            if (r3 != 0) goto L12
            goto L28
        L12:
            r3 = 1109393408(0x42200000, float:40.0)
            boolean r1 = defpackage.om1.b(r3, r3)
            if (r1 != 0) goto L1b
            goto L28
        L1b:
            boolean r2 = defpackage.om1.b(r2, r2)
            if (r2 != 0) goto L22
            goto L28
        L22:
            boolean r2 = defpackage.om1.b(r3, r3)
            if (r2 != 0) goto L2a
        L28:
            r2 = 0
            return r2
        L2a:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r3 = 1092616192(0x41200000, float:10.0)
            int r0 = java.lang.Float.hashCode(r3)
            r1 = 31
            int r0 = r0 * r1
            r2 = 1109393408(0x42200000, float:40.0)
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r3 = defpackage.xg6.a(r3, r0, r1)
            int r3 = defpackage.xg6.a(r2, r3, r1)
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "DpTouchBoundsExpansion(start="
            r3.<init>(r0)
            r0 = 1092616192(0x41200000, float:10.0)
            java.lang.String r1 = defpackage.om1.c(r0)
            r3.append(r1)
            java.lang.String r1 = ", top="
            r3.append(r1)
            r1 = 1109393408(0x42200000, float:40.0)
            java.lang.String r2 = defpackage.om1.c(r1)
            r3.append(r2)
            java.lang.String r2 = ", end="
            r3.append(r2)
            java.lang.String r0 = defpackage.om1.c(r0)
            r3.append(r0)
            java.lang.String r0 = ", bottom="
            r3.append(r0)
            java.lang.String r0 = defpackage.om1.c(r1)
            r3.append(r0)
            java.lang.String r0 = ", isLayoutDirectionAware=true)"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }
}
