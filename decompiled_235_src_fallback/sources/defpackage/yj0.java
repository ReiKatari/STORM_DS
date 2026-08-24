package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj0  reason: default package */
/* loaded from: classes.dex */
public final class yj0 {
    public defpackage.qh1 a;
    public defpackage.kk3 b;
    public defpackage.xj0 c;
    public long d;

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof defpackage.yj0
            if (r0 != 0) goto L8
            goto L31
        L8:
            yj0 r3 = (defpackage.yj0) r3
            qh1 r0 = r2.a
            qh1 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            kk3 r0 = r2.b
            kk3 r1 = r3.b
            if (r0 == r1) goto L1c
            goto L31
        L1c:
            xj0 r0 = r2.c
            xj0 r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L27
            goto L31
        L27:
            long r0 = r2.d
            long r2 = r3.d
            boolean r2 = defpackage.xi6.b(r0, r2)
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
            qh1 r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            kk3 r1 = r3.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            xj0 r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.d
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DrawParams(density="
            r0.<init>(r1)
            qh1 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", layoutDirection="
            r0.append(r1)
            kk3 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", canvas="
            r0.append(r1)
            xj0 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.d
            java.lang.String r3 = defpackage.xi6.g(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
