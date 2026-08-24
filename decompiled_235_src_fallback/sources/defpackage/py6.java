package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py6  reason: default package */
/* loaded from: classes.dex */
public final class py6 {
    public final java.lang.String a;
    public final boolean b;
    public final java.util.List c;
    public final java.util.List d;

    public py6(java.lang.String r1, boolean r2, java.util.List r3, java.util.List r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L28
            int r1 = r3.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r2 = 0
        L1e:
            if (r2 >= r1) goto L28
            java.lang.String r3 = "ASC"
            r4.add(r3)
            int r2 = r2 + 1
            goto L1e
        L28:
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = r5 instanceof defpackage.py6
            r1 = 0
            if (r0 != 0) goto La
            goto L2a
        La:
            py6 r5 = (defpackage.py6) r5
            java.lang.String r0 = r5.a
            boolean r2 = r5.b
            boolean r3 = r4.b
            if (r3 == r2) goto L15
            goto L2a
        L15:
            java.util.List r2 = r4.c
            java.util.List r3 = r5.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            goto L2a
        L20:
            java.util.List r2 = r4.d
            java.util.List r5 = r5.d
            boolean r5 = defpackage.nb3.k(r2, r5)
            if (r5 != 0) goto L2b
        L2a:
            return r1
        L2b:
            java.lang.String r4 = r4.a
            java.lang.String r5 = "index_"
            boolean r2 = defpackage.xs6.g0(r4, r5, r1)
            if (r2 == 0) goto L3a
            boolean r4 = defpackage.xs6.g0(r0, r5, r1)
            return r4
        L3a:
            boolean r4 = r4.equals(r0)
            return r4
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = "index_"
            r1 = 0
            java.lang.String r2 = r3.a
            boolean r0 = defpackage.xs6.g0(r2, r0, r1)
            if (r0 == 0) goto Lf
            r0 = -1184239155(0xffffffffb969f1cd, float:-2.231069E-4)
            goto L13
        Lf:
            int r0 = r2.hashCode()
        L13:
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List r2 = r3.c
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.List r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |Index {\n            |   name = '"
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "',\n            |   unique = '"
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columns = {"
            r0.append(r1)
            java.util.List r1 = r2.c
            java.lang.String r1 = defpackage.ln2.M(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |   orders = {"
            r0.append(r1)
            java.util.List r2 = r2.d
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
