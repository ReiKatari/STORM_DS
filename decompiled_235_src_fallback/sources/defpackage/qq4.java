package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq4  reason: default package */
/* loaded from: classes.dex */
public final class qq4 implements defpackage.tt7 {
    public final defpackage.lq4 a;

    public qq4(defpackage.lq4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.tt7
    public final int a(defpackage.qh1 r1) {
            r0 = this;
            lq4 r0 = r0.a
            float r0 = r0.d()
            int r0 = r1.r0(r0)
            return r0
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            lq4 r0 = r0.a
            float r0 = r0.c(r2)
            int r0 = r1.r0(r0)
            return r0
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r1) {
            r0 = this;
            lq4 r0 = r0.a
            float r0 = r0.a()
            int r0 = r1.r0(r0)
            return r0
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            lq4 r0 = r0.a
            float r0 = r0.b(r2)
            int r0 = r1.r0(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.qq4
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            qq4 r2 = (defpackage.qq4) r2
            lq4 r2 = r2.a
            lq4 r1 = r1.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            lq4 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            kk3 r0 = defpackage.kk3.Ltr
            lq4 r5 = r5.a
            float r1 = r5.b(r0)
            float r2 = r5.d()
            float r0 = r5.c(r0)
            float r5 = r5.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "PaddingValues("
            r3.<init>(r4)
            java.lang.String r1 = defpackage.om1.c(r1)
            r3.append(r1)
            java.lang.String r1 = ", "
            r3.append(r1)
            java.lang.String r2 = defpackage.om1.c(r2)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r0 = defpackage.om1.c(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r5 = defpackage.om1.c(r5)
            r3.append(r5)
            r5 = 41
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
