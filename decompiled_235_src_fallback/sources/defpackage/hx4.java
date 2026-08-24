package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx4  reason: default package */
/* loaded from: classes.dex */
public final class hx4 {
    public final long a;
    public final long b;

    public hx4(long r5, long r7) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            r4.b = r7
            y47[] r4 = defpackage.x47.b
            r0 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r4 = r5 & r0
            r2 = 0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L1b
            java.lang.String r4 = "width cannot be TextUnit.Unspecified"
            defpackage.q53.a(r4)
        L1b:
            long r4 = r7 & r0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
            java.lang.String r4 = "height cannot be TextUnit.Unspecified"
            defpackage.q53.a(r4)
        L26:
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.hx4
            if (r1 != 0) goto L9
            goto L20
        L9:
            hx4 r6 = (defpackage.hx4) r6
            long r1 = r6.a
            long r3 = r5.a
            boolean r1 = defpackage.x47.a(r3, r1)
            if (r1 != 0) goto L16
            goto L20
        L16:
            long r1 = r5.b
            long r5 = r6.b
            boolean r5 = defpackage.x47.a(r1, r5)
            if (r5 != 0) goto L22
        L20:
            r5 = 0
            return r5
        L22:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            y47[] r0 = defpackage.x47.b
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r4 = defpackage.i61.c(r2, r0, r1)
            r0 = 4
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Placeholder(width="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.x47.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r3 = defpackage.x47.d(r1)
            r0.append(r3)
            java.lang.String r3 = ", placeholderVerticalAlign="
            r0.append(r3)
            java.lang.String r3 = "Center"
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
