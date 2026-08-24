package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: da  reason: default package */
/* loaded from: classes.dex */
public final class da implements defpackage.tt7 {
    public final defpackage.tt7 a;
    public final defpackage.qq4 b;

    public da(defpackage.tt7 r1, defpackage.qq4 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.tt7
    public final int a(defpackage.qh1 r2) {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.a(r2)
            qq4 r1 = r1.b
            int r1 = r1.a(r2)
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r2, defpackage.kk3 r3) {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.b(r2, r3)
            qq4 r1 = r1.b
            int r1 = r1.b(r2, r3)
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r2) {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.c(r2)
            qq4 r1 = r1.b
            int r1 = r1.c(r2)
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r2, defpackage.kk3 r3) {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.d(r2, r3)
            qq4 r1 = r1.b
            int r1 = r1.d(r2, r3)
            int r1 = r1 + r0
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof defpackage.da
            if (r0 != 0) goto L8
            goto L20
        L8:
            da r3 = (defpackage.da) r3
            tt7 r0 = r3.a
            tt7 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L20
            qq4 r3 = r3.b
            qq4 r2 = r2.b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.hashCode()
            qq4 r1 = r1.b
            lq4 r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            tt7 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = " + "
            r0.append(r1)
            qq4 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
