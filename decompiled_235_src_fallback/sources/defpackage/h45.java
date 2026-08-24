package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h45  reason: default package */
/* loaded from: classes.dex */
public final class h45 {
    public final java.lang.String a;

    public h45(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.lang.Object a(defpackage.ng3 r1) {
            r0 = this;
            java.util.HashMap r1 = r1.A
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = r0.a
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    public final void b(defpackage.ng3 r1, java.lang.Object r2) {
            r0 = this;
            java.util.HashMap r1 = r1.A
            if (r2 != 0) goto L8
            r1.remove(r0)
            return
        L8:
            r1.put(r0, r2)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<h45> r0 = defpackage.h45.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            h45 r3 = (defpackage.h45) r3
            java.lang.String r2 = r2.a
            java.lang.String r3 = r3.a
            boolean r2 = r2.equals(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Prop{name='"
            r0.<init>(r1)
            java.lang.String r2 = r2.a
            java.lang.String r1 = "'}"
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
