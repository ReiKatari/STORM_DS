package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry4  reason: default package */
/* loaded from: classes.dex */
public final class ry4 extends defpackage.e74 {
    public final defpackage.sj a;

    public ry4(defpackage.sj r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            sy4 r0 = new sy4
            sj r2 = r2.a
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.ry4
            if (r1 != 0) goto L9
            goto L15
        L9:
            ry4 r3 = (defpackage.ry4) r3
            sj r2 = r2.a
            sj r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L17
        L15:
            r2 = 0
            return r2
        L17:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            sy4 r2 = (defpackage.sy4) r2
            sj r0 = r2.l0
            sj r1 = r1.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            r2.l0 = r1
            boolean r1 = r2.m0
            if (r1 == 0) goto L15
            r2.T0()
        L15:
            return
    }

    public final int hashCode() {
            r1 = this;
            sj r1 = r1.a
            int r1 = r1.b
            int r1 = r1 * 31
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerHoverIconModifierElement(icon="
            r0.<init>(r1)
            sj r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", overrideDescendants=false)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
