package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd4  reason: default package */
/* loaded from: classes.dex */
public final class dd4 extends defpackage.fd4 {
    public final java.lang.Class q;

    public dd4(java.lang.Class r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L1c
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L15
            goto L1c
        L15:
            java.lang.String r1 = " does not implement Parcelable or Serializable."
            defpackage.e41.f(r2, r1)
            r1 = 0
            throw r1
        L1c:
            r1.q = r2
            return
    }

    @Override // defpackage.fd4
    public final java.lang.Object a(android.os.Bundle r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.lang.Object r0 = r1.get(r2)
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.String b() {
            r0 = this;
            java.lang.Class r0 = r0.q
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.Object d(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Parcelables don't support default values."
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r2.getClass()
            java.lang.Class r0 = r0.q
            r0.cast(r3)
            if (r3 == 0) goto L19
            boolean r0 = r3 instanceof android.os.Parcelable
            if (r0 == 0) goto Lf
            goto L19
        Lf:
            boolean r0 = r3 instanceof java.io.Serializable
            if (r0 == 0) goto L18
            java.io.Serializable r3 = (java.io.Serializable) r3
            r1.putSerializable(r2, r3)
        L18:
            return
        L19:
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r1.putParcelable(r2, r3)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1e
            java.lang.Class<dd4> r0 = defpackage.dd4.class
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            goto L1e
        L13:
            dd4 r3 = (defpackage.dd4) r3
            java.lang.Class r2 = r2.q
            java.lang.Class r3 = r3.q
            boolean r2 = defpackage.nb3.k(r2, r3)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = r0.q
            int r0 = r0.hashCode()
            return r0
    }
}
