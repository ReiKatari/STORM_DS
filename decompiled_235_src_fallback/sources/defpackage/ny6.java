package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny6  reason: default package */
/* loaded from: classes.dex */
public final class ny6 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;
    public final int d;
    public final java.lang.String e;
    public final int f;
    public final int g;

    public ny6(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, int r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toUpperCase(r1)
            r1.getClass()
            java.lang.String r2 = "INT"
            r3 = 0
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 == 0) goto L29
            r1 = 3
            goto L6a
        L29:
            java.lang.String r2 = "CHAR"
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 != 0) goto L69
            java.lang.String r2 = "CLOB"
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 != 0) goto L69
            java.lang.String r2 = "TEXT"
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 == 0) goto L42
            goto L69
        L42:
            java.lang.String r2 = "BLOB"
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 == 0) goto L4c
            r1 = 5
            goto L6a
        L4c:
            java.lang.String r2 = "REAL"
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 != 0) goto L67
            java.lang.String r2 = "FLOA"
            boolean r2 = defpackage.qs6.j0(r1, r2, r3)
            if (r2 != 0) goto L67
            java.lang.String r2 = "DOUB"
            boolean r1 = defpackage.qs6.j0(r1, r2, r3)
            if (r1 == 0) goto L65
            goto L67
        L65:
            r1 = 1
            goto L6a
        L67:
            r1 = 4
            goto L6a
        L69:
            r1 = 2
        L6a:
            r0.g = r1
            return
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L5
            goto L6a
        L5:
            boolean r1 = r9 instanceof defpackage.ny6
            r2 = 0
            if (r1 != 0) goto Lc
            goto L6b
        Lc:
            int r1 = r8.d
            if (r1 <= 0) goto L12
            r1 = r0
            goto L13
        L12:
            r1 = r2
        L13:
            ny6 r9 = (defpackage.ny6) r9
            int r3 = r9.f
            int r4 = r9.d
            if (r4 <= 0) goto L1d
            r4 = r0
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r1 == r4) goto L21
            goto L6b
        L21:
            java.lang.String r1 = r8.a
            java.lang.String r4 = r9.a
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 != 0) goto L2c
            goto L6b
        L2c:
            boolean r1 = r8.c
            boolean r4 = r9.c
            if (r1 == r4) goto L33
            goto L6b
        L33:
            java.lang.String r1 = r9.e
            r4 = 2
            int r5 = r8.f
            java.lang.String r6 = r8.e
            if (r5 != r0) goto L47
            if (r3 != r4) goto L47
            if (r6 == 0) goto L47
            boolean r7 = defpackage.ln2.o(r6, r1)
            if (r7 != 0) goto L47
            goto L6b
        L47:
            if (r5 != r4) goto L54
            if (r3 != r0) goto L54
            if (r1 == 0) goto L54
            boolean r4 = defpackage.ln2.o(r1, r6)
            if (r4 != 0) goto L54
            goto L6b
        L54:
            if (r5 == 0) goto L64
            if (r5 != r3) goto L64
            if (r6 == 0) goto L61
            boolean r1 = defpackage.ln2.o(r6, r1)
            if (r1 != 0) goto L64
            goto L6b
        L61:
            if (r1 == 0) goto L64
            goto L6b
        L64:
            int r8 = r8.g
            int r9 = r9.g
            if (r8 != r9) goto L6b
        L6a:
            return r0
        L6b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.g
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.c
            if (r1 == 0) goto L14
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L16
        L14:
            r1 = 1237(0x4d5, float:1.733E-42)
        L16:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.d
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |Column {\n            |   name = '"
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "',\n            |   type = '"
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "',\n            |   affinity = '"
            r0.append(r1)
            int r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = "',\n            |   notNull = '"
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "',\n            |   primaryKeyPosition = '"
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = "',\n            |   defaultValue = '"
            r0.append(r1)
            java.lang.String r2 = r2.e
            if (r2 != 0) goto L3f
            java.lang.String r2 = "undefined"
        L3f:
            r0.append(r2)
            java.lang.String r2 = "'\n            |}\n        "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = defpackage.rs6.S(r2)
            java.lang.String r2 = defpackage.rs6.Q(r2)
            return r2
    }
}
