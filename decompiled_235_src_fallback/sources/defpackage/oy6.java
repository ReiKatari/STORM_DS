package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oy6  reason: default package */
/* loaded from: classes.dex */
public final class oy6 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.List d;
    public final java.util.List e;

    public oy6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List r4, java.util.List r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
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
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r3 instanceof defpackage.oy6
            if (r0 != 0) goto L9
            goto L36
        L9:
            oy6 r3 = (defpackage.oy6) r3
            java.lang.String r0 = r3.a
            java.lang.String r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L16
            goto L36
        L16:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L21
            goto L36
        L21:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2c
            goto L36
        L2c:
            java.util.List r0 = r2.d
            java.util.List r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
        L36:
            r2 = 0
            return r2
        L38:
            java.util.List r2 = r2.e
            java.util.List r3 = r3.e
            boolean r2 = r2.equals(r3)
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.util.List r2 = r3.d
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.List r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |ForeignKey {\n            |   referenceTable = '"
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "',\n            |   onDelete = '"
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "',\n            |   onUpdate = '"
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columnNames = {"
            r0.append(r1)
            java.util.List r1 = r2.d
            java.util.List r1 = defpackage.gt0.c1(r1)
            java.lang.String r1 = defpackage.ln2.M(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |   referenceColumnNames = {"
            r0.append(r1)
            java.util.List r2 = r2.e
            java.util.List r2 = defpackage.gt0.c1(r2)
            java.lang.String r2 = defpackage.ln2.L(r2)
            r0.append(r2)
            java.lang.String r2 = "\n            |}\n        "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = defpackage.rs6.S(r2)
            java.lang.String r2 = defpackage.rs6.Q(r2)
            return r2
    }
}
