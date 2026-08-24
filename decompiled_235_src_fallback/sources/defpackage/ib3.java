package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ib3  reason: default package */
/* loaded from: classes.dex */
final class ib3 extends defpackage.e74 {
    public final defpackage.gb3 a;

    public ib3(defpackage.gb3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            kb3 r0 = new kb3
            r1 = 0
            r0.<init>(r1)
            gb3 r2 = r2.a
            r0.l0 = r2
            r2 = 1
            r0.m0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.ib3
            if (r1 == 0) goto Lb
            ib3 r3 = (defpackage.ib3) r3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto Lf
            goto L16
        Lf:
            gb3 r2 = r2.a
            gb3 r3 = r3.a
            if (r2 != r3) goto L16
            return r0
        L16:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            kb3 r1 = (defpackage.kb3) r1
            gb3 r0 = r0.a
            r1.l0 = r0
            r0 = 1
            r1.m0 = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            gb3 r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }
}
