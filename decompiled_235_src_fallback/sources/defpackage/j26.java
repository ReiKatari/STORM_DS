package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j26  reason: default package */
/* loaded from: classes.dex */
public final class j26 {
    public float a;
    public boolean b;
    public defpackage.lb4 c;

    public j26() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 1
            r1.b = r0
            r0 = 0
            r1.c = r0
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.j26
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j26 r5 = (defpackage.j26) r5
            float r1 = r4.a
            float r3 = r5.a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            lb4 r4 = r4.c
            lb4 r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            lb4 r3 = r3.c
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            int r0 = r0 + r3
            int r0 = r0 * r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RowColumnParentData(weight="
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", fill="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", crossAxisAlignment="
            r0.append(r1)
            lb4 r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ", flowLayoutData=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
