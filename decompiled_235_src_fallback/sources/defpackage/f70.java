package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f70  reason: default package */
/* loaded from: classes.dex */
final class f70 extends defpackage.e74 {
    public final defpackage.e40 a;
    public final boolean b;

    public f70(defpackage.e40 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            g70 r0 = new g70
            r0.<init>()
            e40 r1 = r2.a
            r0.k0 = r1
            boolean r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof defpackage.f70
            if (r0 == 0) goto La
            f70 r3 = (defpackage.f70) r3
            goto Lb
        La:
            r3 = 0
        Lb:
            if (r3 != 0) goto Le
            goto L20
        Le:
            e40 r0 = r2.a
            e40 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 != r3) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            g70 r2 = (defpackage.g70) r2
            e40 r0 = r1.a
            r2.k0 = r0
            boolean r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r1 = this;
            e40 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
