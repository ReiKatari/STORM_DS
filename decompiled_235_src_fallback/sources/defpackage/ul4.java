package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul4  reason: default package */
/* loaded from: classes.dex */
final class ul4 extends defpackage.e74 {
    public final defpackage.qn2 a;

    public ul4(defpackage.qn2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            vl4 r0 = new vl4
            r0.<init>()
            qn2 r3 = r3.a
            r0.k0 = r3
            r1 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            r0.l0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ul4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ul4 r4 = (defpackage.ul4) r4
            qn2 r4 = r4.a
            qn2 r3 = r3.a
            if (r3 != r4) goto L13
            return r0
        L13:
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            vl4 r3 = (defpackage.vl4) r3
            qn2 r2 = r2.a
            r3.k0 = r2
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            r3.l0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            qn2 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
