package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca3  reason: default package */
/* loaded from: classes.dex */
public final class ca3 extends defpackage.fd4 {
    public final java.lang.Class q;
    public final java.lang.Class r;

    public ca3(java.lang.Class r3) {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            r2.q = r3
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            boolean r0 = r0.isAssignableFrom(r3)
            r1 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r3.isEnum()
            if (r0 == 0) goto L18
            r2.r = r3
            return
        L18:
            java.lang.String r2 = " is not an Enum type."
            defpackage.e41.f(r3, r2)
            throw r1
        L1e:
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
            boolean r1 = r0 instanceof java.io.Serializable
            if (r1 == 0) goto L11
            java.io.Serializable r0 = (java.io.Serializable) r0
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.String b() {
            r0 = this;
            java.lang.Class r0 = r0.r
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.Object d(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "null"
            boolean r0 = r8.equals(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.Class r7 = r7.r
            java.lang.Object[] r0 = r7.getEnumConstants()
            r0.getClass()
            int r2 = r0.length
            r3 = 0
        L15:
            if (r3 >= r2) goto L2f
            r4 = r0[r3]
            r5 = r4
            java.lang.Enum r5 = (java.lang.Enum) r5
            r5.getClass()
            java.lang.String r5 = r5.name()
            r6 = 1
            boolean r5 = defpackage.xs6.Z(r5, r8, r6)
            if (r5 == 0) goto L2c
            r1 = r4
            goto L2f
        L2c:
            int r3 = r3 + 1
            goto L15
        L2f:
            java.lang.Enum r1 = (java.lang.Enum) r1
            if (r1 == 0) goto L34
            return r1
        L34:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Enum value "
            java.lang.String r2 = " not found for type "
            java.lang.StringBuilder r8 = defpackage.i61.t(r1, r8, r2)
            java.lang.String r7 = r7.getName()
            r8.append(r7)
            r7 = 46
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r0.<init>(r7)
            throw r0
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            java.io.Serializable r3 = (java.io.Serializable) r3
            r2.getClass()
            java.lang.Class r0 = r0.q
            java.lang.Object r0 = r0.cast(r3)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r1.putSerializable(r2, r0)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.ca3
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ca3 r2 = (defpackage.ca3) r2
            java.lang.Class r2 = r2.q
            java.lang.Class r1 = r1.q
            boolean r1 = r1.equals(r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Class r0 = r0.q
            int r0 = r0.hashCode()
            return r0
    }
}
