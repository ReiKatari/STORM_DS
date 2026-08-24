package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b60  reason: default package */
/* loaded from: classes.dex */
public final class b60 extends defpackage.e74 {
    public final float a;
    public final defpackage.cn6 b;
    public final defpackage.ke6 c;

    public b60(float r1, defpackage.cn6 r2, defpackage.ke6 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            a60 r0 = new a60
            cn6 r1 = r3.b
            ke6 r2 = r3.c
            float r3 = r3.a
            r0.<init>(r3, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.b60
            if (r0 != 0) goto L8
            goto L2a
        L8:
            b60 r3 = (defpackage.b60) r3
            float r0 = r2.a
            float r1 = r3.a
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            cn6 r0 = r2.b
            cn6 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            ke6 r2 = r2.c
            ke6 r3 = r3.c
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r4) {
            r3 = this;
            a60 r4 = (defpackage.a60) r4
            float r0 = r4.n0
            na0 r1 = r4.q0
            float r2 = r3.a
            boolean r0 = defpackage.om1.b(r0, r2)
            if (r0 != 0) goto L13
            r4.n0 = r2
            r1.R0()
        L13:
            cn6 r0 = r4.o0
            cn6 r2 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L22
            r4.o0 = r2
            r1.R0()
        L22:
            ke6 r0 = r4.p0
            ke6 r3 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 != 0) goto L34
            r4.p0 = r3
            r1.R0()
            defpackage.bl2.G(r4)
        L34:
            return
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            cn6 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            ke6 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BorderModifierNodeElement(width="
            r0.<init>(r1)
            float r1 = r2.a
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", brush="
            r0.append(r1)
            cn6 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            ke6 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
