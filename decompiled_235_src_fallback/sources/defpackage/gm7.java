package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gm7  reason: default package */
/* loaded from: classes.dex */
public final class gm7 extends defpackage.e74 {
    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            hm7 r1 = new hm7
            d40 r0 = defpackage.d90.i0
            r1.<init>()
            r1.k0 = r0
            return r1
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r1 instanceof defpackage.gm7
            if (r0 == 0) goto Lb
            gm7 r1 = (defpackage.gm7) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto L10
            r0 = 0
            return r0
        L10:
            d40 r0 = defpackage.d90.i0
            boolean r0 = r0.equals(r0)
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            hm7 r1 = (defpackage.hm7) r1
            d40 r0 = defpackage.d90.i0
            r1.k0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            r0 = 0
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }
}
