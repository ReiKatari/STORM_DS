package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iv  reason: default package */
/* loaded from: classes.dex */
final class iv extends defpackage.e74 {
    public final float a;

    public iv(float r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lb
            return
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "aspectRatio "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r2 = " must be > 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.n53.a(r1)
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            kv r0 = new kv
            r0.<init>()
            float r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.iv
            if (r1 == 0) goto Lc
            r1 = r3
            iv r1 = (defpackage.iv) r1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 != 0) goto L10
            goto L1e
        L10:
            float r2 = r2.a
            float r1 = r1.a
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L1e
            iv r3 = (defpackage.iv) r3
            r3.getClass()
            return r0
        L1e:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            kv r1 = (defpackage.kv) r1
            float r0 = r0.a
            r1.k0 = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            float r1 = r1.a
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 * 31
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }
}
