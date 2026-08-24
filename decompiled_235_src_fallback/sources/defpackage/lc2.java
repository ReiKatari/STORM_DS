package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc2  reason: default package */
/* loaded from: classes.dex */
final class lc2 extends defpackage.e74 {
    public final defpackage.wj1 a;
    public final float b;

    public lc2(defpackage.wj1 r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            mc2 r0 = new mc2
            r0.<init>()
            wj1 r1 = r2.a
            r0.k0 = r1
            float r2 = r2.b
            r0.l0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.lc2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lc2 r5 = (defpackage.lc2) r5
            wj1 r1 = r5.a
            wj1 r3 = r4.a
            if (r3 == r1) goto L13
            return r2
        L13:
            float r4 = r4.b
            float r5 = r5.b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L1c
            return r0
        L1c:
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            mc2 r2 = (defpackage.mc2) r2
            wj1 r0 = r1.a
            r2.k0 = r0
            float r1 = r1.b
            r2.l0 = r1
            return
    }

    public final int hashCode() {
            r1 = this;
            wj1 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r1.b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
