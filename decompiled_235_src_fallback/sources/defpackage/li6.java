package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: li6  reason: default package */
/* loaded from: classes.dex */
public final class li6 {
    public final java.lang.String a;
    public final java.util.List b;
    public final defpackage.qn2 c;
    public final java.lang.Object d;
    public final defpackage.qn2 e;

    public li6(java.lang.String r1, java.util.List r2, defpackage.qn2 r3, java.lang.Object r4, defpackage.qn2 r5) {
            r0 = this;
            r2.getClass()
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
            boolean r0 = r3 instanceof defpackage.li6
            if (r0 != 0) goto L8
            goto L40
        L8:
            li6 r3 = (defpackage.li6) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            qn2 r0 = r2.c
            qn2 r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.lang.Object r0 = r2.d
            java.lang.Object r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            qn2 r2 = r2.e
            qn2 r3 = r3.e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
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
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            qn2 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.Object r0 = r3.d
            if (r0 != 0) goto L1d
            r0 = 0
            goto L21
        L1d:
            int r0 = r0.hashCode()
        L21:
            int r2 = r2 + r0
            int r2 = r2 * r1
            qn2 r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Payload(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", items="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", labelOf="
            r0.append(r1)
            qn2 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", selected="
            r0.append(r1)
            java.lang.Object r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", onSelect="
            r0.append(r1)
            qn2 r2 = r2.e
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
