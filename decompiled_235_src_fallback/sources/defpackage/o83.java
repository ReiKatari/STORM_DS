package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o83  reason: default package */
/* loaded from: classes.dex */
public final class o83 implements defpackage.lq4 {
    public final defpackage.tt7 a;
    public final defpackage.qh1 b;

    public o83(defpackage.tt7 r1, defpackage.qh1 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.lq4
    public final float a() {
            r1 = this;
            tt7 r0 = r1.a
            qh1 r1 = r1.b
            int r0 = r0.c(r1)
            float r1 = r1.Q(r0)
            return r1
    }

    @Override // defpackage.lq4
    public final float b(defpackage.kk3 r2) {
            r1 = this;
            tt7 r0 = r1.a
            qh1 r1 = r1.b
            int r2 = r0.d(r1, r2)
            float r1 = r1.Q(r2)
            return r1
    }

    @Override // defpackage.lq4
    public final float c(defpackage.kk3 r2) {
            r1 = this;
            tt7 r0 = r1.a
            qh1 r1 = r1.b
            int r2 = r0.b(r1, r2)
            float r1 = r1.Q(r2)
            return r1
    }

    @Override // defpackage.lq4
    public final float d() {
            r1 = this;
            tt7 r0 = r1.a
            qh1 r1 = r1.b
            int r0 = r0.a(r1)
            float r1 = r1.Q(r0)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.o83
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o83 r5 = (defpackage.o83) r5
            tt7 r1 = r5.a
            tt7 r3 = r4.a
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L21
            qh1 r4 = r4.b
            qh1 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            qh1 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InsetsPaddingValues(insets="
            r0.<init>(r1)
            tt7 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            qh1 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
