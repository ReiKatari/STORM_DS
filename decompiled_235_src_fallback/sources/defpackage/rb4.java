package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb4  reason: default package */
/* loaded from: classes.dex */
public final class rb4 {
    public final defpackage.fd4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public rb4(defpackage.fd4 r2, boolean r3, boolean r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.a
            if (r0 != 0) goto L19
            if (r3 != 0) goto La
            goto L19
        La:
            java.lang.String r1 = r2.b()
            java.lang.String r2 = " does not allow nullable values"
            java.lang.String r1 = r1.concat(r2)
            defpackage.i.f(r1)
            r1 = 0
            throw r1
        L19:
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r4
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 == 0) goto L2b
            java.lang.Class<rb4> r1 = defpackage.rb4.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Lf
            goto L2b
        Lf:
            rb4 r4 = (defpackage.rb4) r4
            boolean r1 = r3.b
            boolean r2 = r4.b
            if (r1 == r2) goto L18
            goto L2b
        L18:
            boolean r1 = r3.c
            boolean r2 = r4.c
            if (r1 == r2) goto L1f
            goto L2b
        L1f:
            fd4 r3 = r3.a
            fd4 r4 = r4.a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2a
            goto L2b
        L2a:
            return r0
        L2b:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            fd4 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r2 = r2.c
            int r0 = r0 + r2
            int r0 = r0 * 31
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<rb4> r1 = defpackage.rb4.class
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r1 = r1.c()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " Type: "
            r1.<init>(r2)
            fd4 r2 = r3.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " Nullable: "
            r1.<init>(r2)
            boolean r2 = r3.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            boolean r3 = r3.c
            if (r3 == 0) goto L41
            java.lang.String r3 = " DefaultValue: null"
            r0.append(r3)
        L41:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
