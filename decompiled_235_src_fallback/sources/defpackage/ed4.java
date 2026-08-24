package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed4  reason: default package */
/* loaded from: classes.dex */
public class ed4 extends defpackage.fd4 {
    public final java.lang.Class q;

    public ed4(int r1, java.lang.Class r2) {
            r0 = this;
            r1 = 0
            r0.<init>(r1)
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto Lf
            r0.q = r2
            return
        Lf:
            java.lang.String r0 = " does not implement Serializable."
            defpackage.e41.f(r2, r0)
            r0 = 0
            throw r0
    }

    public ed4(java.lang.Class r3) {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            boolean r0 = r0.isAssignableFrom(r3)
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r3.isEnum()
            if (r0 != 0) goto L16
            r2.q = r3
            return
        L16:
            java.lang.String r2 = " is an Enum. You should use EnumType instead."
            defpackage.e41.f(r3, r2)
            throw r1
        L1c:
            java.lang.String r2 = " does not implement Serializable."
            defpackage.e41.f(r3, r2)
            throw r1
    }

    @Override // defpackage.fd4
    public final java.lang.Object a(android.os.Bundle r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.lang.Object r0 = r1.get(r2)
            java.io.Serializable r0 = (java.io.Serializable) r0
            return r0
    }

    @Override // defpackage.fd4
    public java.lang.String b() {
            r0 = this;
            java.lang.Class r0 = r0.q
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // defpackage.fd4
    public /* bridge */ /* synthetic */ java.lang.Object d(java.lang.String r1) {
            r0 = this;
            java.io.Serializable r0 = r0.g(r1)
            return r0
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            java.io.Serializable r3 = (java.io.Serializable) r3
            r2.getClass()
            r3.getClass()
            java.lang.Class r0 = r0.q
            r0.cast(r3)
            r1.putSerializable(r2, r3)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.ed4
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ed4 r2 = (defpackage.ed4) r2
            java.lang.Class r2 = r2.q
            java.lang.Class r1 = r1.q
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    public java.io.Serializable g(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Serializables don't support default values."
            r0.<init>(r1)
            throw r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = r0.q
            int r0 = r0.hashCode()
            return r0
    }
}
