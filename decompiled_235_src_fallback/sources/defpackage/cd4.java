package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd4  reason: default package */
/* loaded from: classes.dex */
public final class cd4 extends defpackage.ed4 {
    public final java.lang.Class r;

    public cd4(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            boolean r0 = r2.isEnum()
            if (r0 == 0) goto Ld
            r1.r = r2
            return
        Ld:
            java.lang.String r1 = " is not an Enum type."
            defpackage.e41.f(r2, r1)
            r1 = 0
            throw r1
    }

    @Override // defpackage.ed4, defpackage.fd4
    public final java.lang.String b() {
            r0 = this;
            java.lang.Class r0 = r0.r
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // defpackage.ed4, defpackage.fd4
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.String r1) {
            r0 = this;
            java.lang.Enum r0 = r0.h(r1)
            return r0
    }

    @Override // defpackage.ed4
    public final /* bridge */ /* synthetic */ java.io.Serializable g(java.lang.String r1) {
            r0 = this;
            java.lang.Enum r0 = r0.h(r1)
            return r0
    }

    public final java.lang.Enum h(java.lang.String r7) {
            r6 = this;
            java.lang.Class r6 = r6.r
            java.lang.Object[] r0 = r6.getEnumConstants()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            r4 = r3
            java.lang.Enum r4 = (java.lang.Enum) r4
            java.lang.String r4 = r4.name()
            r5 = 1
            boolean r4 = defpackage.xs6.Z(r4, r7, r5)
            if (r4 == 0) goto L1e
            goto L22
        L1e:
            int r2 = r2 + 1
            goto Lb
        L21:
            r3 = 0
        L22:
            java.lang.Enum r3 = (java.lang.Enum) r3
            if (r3 == 0) goto L27
            return r3
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Enum value "
            java.lang.String r2 = " not found for type "
            java.lang.StringBuilder r7 = defpackage.i61.t(r1, r7, r2)
            java.lang.String r6 = r6.getName()
            r7.append(r6)
            r6 = 46
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.<init>(r6)
            throw r0
    }
}
