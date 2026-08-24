package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ye6  reason: default package */
/* loaded from: classes.dex */
public final class ye6 {
    public final defpackage.y16 a;
    public final defpackage.y16 b;
    public final defpackage.y16 c;

    public ye6() {
            r3 = this;
            r0 = 1082130432(0x40800000, float:4.0)
            y16 r1 = defpackage.z16.b(r0)
            y16 r0 = defpackage.z16.b(r0)
            r2 = 0
            y16 r2 = defpackage.z16.b(r2)
            r3.<init>()
            r3.a = r1
            r3.b = r0
            r3.c = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.ye6
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ye6 r3 = (defpackage.ye6) r3
            y16 r0 = r3.a
            y16 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            y16 r0 = r2.b
            y16 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            y16 r2 = r2.c
            y16 r3 = r3.c
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            y16 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            y16 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            y16 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Shapes(small="
            r0.<init>(r1)
            y16 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", medium="
            r0.append(r1)
            y16 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", large="
            r0.append(r1)
            y16 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
