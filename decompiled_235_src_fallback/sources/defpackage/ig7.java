package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig7  reason: default package */
/* loaded from: classes.dex */
public final class ig7 implements defpackage.tt7 {
    public final defpackage.tt7 a;
    public final defpackage.tt7 b;

    public ig7(defpackage.tt7 r1, defpackage.tt7 r2) {
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
            tt7 r1 = r1.b
            int r1 = r1.a(r2)
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r2, defpackage.kk3 r3) {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.b(r2, r3)
            tt7 r1 = r1.b
            int r1 = r1.b(r2, r3)
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r2) {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.c(r2)
            tt7 r1 = r1.b
            int r1 = r1.c(r2)
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r2, defpackage.kk3 r3) {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.d(r2, r3)
            tt7 r1 = r1.b
            int r1 = r1.d(r2, r3)
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ig7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ig7 r5 = (defpackage.ig7) r5
            tt7 r1 = r5.a
            tt7 r3 = r4.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L21
            tt7 r5 = r5.b
            tt7 r4 = r4.b
            boolean r4 = defpackage.nb3.k(r5, r4)
            if (r4 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.hashCode()
            tt7 r1 = r1.b
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
            java.lang.String r1 = " ∪ "
            r0.append(r1)
            tt7 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
