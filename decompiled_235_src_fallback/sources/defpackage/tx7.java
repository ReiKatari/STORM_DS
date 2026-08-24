package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx7  reason: default package */
/* loaded from: classes.dex */
final class tx7 extends defpackage.e74 {
    public final defpackage.wj1 a;
    public final defpackage.eo2 b;
    public final java.lang.Object c;

    public tx7(defpackage.wj1 r1, defpackage.eo2 r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            vx7 r0 = new vx7
            r0.<init>()
            wj1 r1 = r2.a
            r0.k0 = r1
            eo2 r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            if (r3 != 0) goto L6
            goto L22
        L6:
            java.lang.Class<tx7> r0 = defpackage.tx7.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L22
        Lf:
            tx7 r3 = (defpackage.tx7) r3
            wj1 r0 = r2.a
            wj1 r1 = r3.a
            if (r0 == r1) goto L18
            goto L22
        L18:
            java.lang.Object r2 = r2.c
            java.lang.Object r3 = r3.c
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            vx7 r2 = (defpackage.vx7) r2
            wj1 r0 = r1.a
            r2.k0 = r0
            eo2 r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r3 = this;
            wj1 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.Object r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }
}
