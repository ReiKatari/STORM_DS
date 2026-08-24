package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn3  reason: default package */
/* loaded from: classes.dex */
public final class vn3 extends defpackage.e74 {
    public final float a;
    public final boolean b;

    public vn3(float r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            wn3 r0 = new wn3
            r0.<init>()
            float r1 = r2.a
            r0.k0 = r1
            boolean r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.vn3
            if (r1 == 0) goto Lb
            vn3 r5 = (defpackage.vn3) r5
            goto Lc
        Lb:
            r5 = 0
        Lc:
            r1 = 0
            if (r5 != 0) goto L10
            return r1
        L10:
            float r2 = r4.a
            float r3 = r5.a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1f
            boolean r4 = r4.b
            boolean r5 = r5.b
            if (r4 != r5) goto L1f
            return r0
        L1f:
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            wn3 r2 = (defpackage.wn3) r2
            float r0 = r1.a
            r2.k0 = r0
            boolean r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
