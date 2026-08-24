package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu0  reason: default package */
/* loaded from: classes.dex */
public final class hu0 implements defpackage.l61, java.io.Serializable {
    public final defpackage.l61 A;
    public final defpackage.j61 B;

    public hu0(defpackage.j61 r1, defpackage.l61 r2) {
            r0 = this;
            r2.getClass()
            r1.getClass()
            r0.<init>()
            r0.A = r2
            r0.B = r1
            return
    }

    @Override // defpackage.l61
    public final defpackage.l61 D(defpackage.k61 r4) {
            r3 = this;
            r4.getClass()
            j61 r0 = r3.B
            j61 r1 = r0.Z(r4)
            l61 r2 = r3.A
            if (r1 == 0) goto Le
            return r2
        Le:
            l61 r4 = r2.D(r4)
            if (r4 != r2) goto L15
            return r3
        L15:
            vt1 r3 = defpackage.vt1.A
            if (r4 != r3) goto L1a
            return r0
        L1a:
            hu0 r3 = new hu0
            r3.<init>(r0, r4)
            return r3
    }

    @Override // defpackage.l61
    public final defpackage.l61 N(defpackage.l61 r4) {
            r3 = this;
            r4.getClass()
            vt1 r0 = defpackage.vt1.A
            if (r4 != r0) goto L8
            return r3
        L8:
            lw0 r0 = new lw0
            r1 = 20
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Object r3 = r4.x(r0, r3)
            l61 r3 = (defpackage.l61) r3
            return r3
    }

    @Override // defpackage.l61
    public final defpackage.j61 Z(defpackage.k61 r2) {
            r1 = this;
            r2.getClass()
        L3:
            j61 r0 = r1.B
            j61 r0 = r0.Z(r2)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            l61 r1 = r1.A
            boolean r0 = r1 instanceof defpackage.hu0
            if (r0 == 0) goto L15
            hu0 r1 = (defpackage.hu0) r1
            goto L3
        L15:
            j61 r1 = r1.Z(r2)
            return r1
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 == r7) goto L5e
            boolean r0 = r7 instanceof defpackage.hu0
            r1 = 0
            if (r0 == 0) goto L5d
            hu0 r7 = (defpackage.hu0) r7
            r0 = 2
            r2 = r7
            r3 = r0
        Lc:
            l61 r2 = r2.A
            boolean r4 = r2 instanceof defpackage.hu0
            r5 = 0
            if (r4 == 0) goto L16
            hu0 r2 = (defpackage.hu0) r2
            goto L17
        L16:
            r2 = r5
        L17:
            if (r2 != 0) goto L5a
            r2 = r6
        L1a:
            l61 r2 = r2.A
            boolean r4 = r2 instanceof defpackage.hu0
            if (r4 == 0) goto L23
            hu0 r2 = (defpackage.hu0) r2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 != 0) goto L57
            if (r3 != r0) goto L5d
        L28:
            j61 r0 = r6.B
            k61 r2 = r0.getKey()
            j61 r2 = r7.Z(r2)
            boolean r0 = defpackage.nb3.k(r2, r0)
            if (r0 != 0) goto L3a
            r6 = r1
            goto L54
        L3a:
            l61 r6 = r6.A
            boolean r0 = r6 instanceof defpackage.hu0
            if (r0 == 0) goto L43
            hu0 r6 = (defpackage.hu0) r6
            goto L28
        L43:
            r6.getClass()
            j61 r6 = (defpackage.j61) r6
            k61 r0 = r6.getKey()
            j61 r7 = r7.Z(r0)
            boolean r6 = defpackage.nb3.k(r7, r6)
        L54:
            if (r6 == 0) goto L5d
            goto L5e
        L57:
            int r0 = r0 + 1
            goto L1a
        L5a:
            int r3 = r3 + 1
            goto Lc
        L5d:
            return r1
        L5e:
            r6 = 1
            return r6
    }

    public final int hashCode() {
            r1 = this;
            l61 r0 = r1.A
            int r0 = r0.hashCode()
            j61 r1 = r1.B
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            fn0 r1 = new fn0
            r2 = 3
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.Object r3 = r3.x(r1, r2)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 93
            java.lang.String r3 = defpackage.lb1.q(r0, r3, r1)
            return r3
    }

    @Override // defpackage.l61
    public final java.lang.Object x(defpackage.eo2 r2, java.lang.Object r3) {
            r1 = this;
            l61 r0 = r1.A
            java.lang.Object r3 = r0.x(r2, r3)
            j61 r1 = r1.B
            java.lang.Object r1 = r2.o(r3, r1)
            return r1
    }
}
