package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qe3  reason: default package */
/* loaded from: classes.dex */
public final class qe3 extends defpackage.df3 {
    public final boolean A;
    public final java.lang.String B;

    public qe3(boolean r1, java.lang.Object r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.A = r1
            java.lang.String r1 = r2.toString()
            r0.B = r1
            return
    }

    @Override // defpackage.df3
    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.B
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            if (r3 == 0) goto L24
            java.lang.Class<qe3> r0 = defpackage.qe3.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L24
        Le:
            qe3 r3 = (defpackage.qe3) r3
            boolean r0 = r2.A
            boolean r1 = r3.A
            if (r0 == r1) goto L17
            goto L24
        L17:
            java.lang.String r2 = r2.B
            java.lang.String r3 = r3.B
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L22
            goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.A
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r1.B
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.df3
    public final java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.A
            java.lang.String r1 = r1.B
            if (r0 == 0) goto L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            defpackage.os6.a(r0, r1)
            java.lang.String r1 = r0.toString()
        L12:
            return r1
    }
}
