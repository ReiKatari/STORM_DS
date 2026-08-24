package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft6  reason: default package */
/* loaded from: classes.dex */
public final class ft6 extends defpackage.e74 {
    public final defpackage.tm1 a;

    public ft6(defpackage.tm1 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            gt6 r0 = new gt6
            tm1 r2 = r2.a
            sj r1 = defpackage.nb3.t
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L1f
        L3:
            boolean r0 = r2 instanceof defpackage.ft6
            if (r0 != 0) goto L8
            goto L1d
        L8:
            ft6 r2 = (defpackage.ft6) r2
            sj r0 = defpackage.nb3.t
            boolean r0 = r0.equals(r0)
            if (r0 != 0) goto L13
            goto L1d
        L13:
            tm1 r1 = r1.a
            tm1 r2 = r2.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            gt6 r3 = (defpackage.gt6) r3
            sj r0 = defpackage.nb3.t
            sj r1 = r3.l0
            boolean r1 = defpackage.nb3.k(r1, r0)
            if (r1 != 0) goto L15
            r3.l0 = r0
            boolean r0 = r3.m0
            if (r0 == 0) goto L15
            r3.T0()
        L15:
            tm1 r2 = r2.a
            r3.k0 = r2
            return
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1022(0x3fe, float:1.432E-42)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.xg6.e(r0, r2, r1)
            tm1 r3 = r3.a
            if (r3 != 0) goto Lf
            goto L13
        Lf:
            int r2 = r3.hashCode()
        L13:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StylusHoverIconModifierElement(icon="
            r0.<init>(r1)
            sj r1 = defpackage.nb3.t
            r0.append(r1)
            java.lang.String r1 = ", overrideDescendants=false, touchBoundsExpansion="
            r0.append(r1)
            tm1 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
