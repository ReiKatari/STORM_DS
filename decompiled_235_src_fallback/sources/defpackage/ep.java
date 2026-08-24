package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep  reason: default package */
/* loaded from: classes.dex */
public final class ep {
    public final java.lang.Object a;
    public final int b;
    public final int c;
    public final java.lang.String d;

    public ep(java.lang.Object r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ep(java.lang.Object r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            if (r2 > r3) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L17
            java.lang.String r0 = "Reversed range is not supported"
            defpackage.q53.a(r0)
        L17:
            return
    }

    public static defpackage.ep a(defpackage.ep r1, defpackage.bp r2, int r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L6
            java.lang.Object r2 = r1.a
        L6:
            int r0 = r1.b
            r4 = r4 & 4
            if (r4 == 0) goto Le
            int r3 = r1.c
        Le:
            java.lang.String r4 = r1.d
            r1.getClass()
            ep r1 = new ep
            r1.<init>(r2, r0, r3, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ep
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ep r5 = (defpackage.ep) r5
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r4 = r4.d
            java.lang.String r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.lang.String r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Range(item="
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", start="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", tag="
            r0.append(r1)
            java.lang.String r2 = r2.d
            r1 = 41
            java.lang.String r2 = defpackage.lb1.q(r0, r2, r1)
            return r2
    }
}
