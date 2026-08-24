package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih7  reason: default package */
/* loaded from: classes.dex */
final class ih7 extends defpackage.e74 {
    public final float a;
    public final float b;

    public ih7(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            jh7 r0 = new jh7
            r0.<init>()
            float r1 = r2.a
            r0.k0 = r1
            float r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.ih7
            if (r0 != 0) goto L5
            goto L1d
        L5:
            ih7 r3 = (defpackage.ih7) r3
            float r0 = r3.a
            float r1 = r2.a
            boolean r0 = defpackage.om1.b(r1, r0)
            if (r0 == 0) goto L1d
            float r2 = r2.b
            float r3 = r3.b
            boolean r2 = defpackage.om1.b(r2, r3)
            if (r2 == 0) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            jh7 r2 = (defpackage.jh7) r2
            float r0 = r1.a
            r2.k0 = r0
            float r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r1.b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
