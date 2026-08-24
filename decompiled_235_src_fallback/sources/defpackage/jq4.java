package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq4  reason: default package */
/* loaded from: classes.dex */
final class jq4 extends defpackage.e74 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public jq4(float r4, float r5, float r6, float r7) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 >= 0) goto L1b
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L19
            goto L1b
        L19:
            r4 = r2
            goto L1c
        L1b:
            r4 = r1
        L1c:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L29
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L27
            goto L29
        L27:
            r5 = r2
            goto L2a
        L29:
            r5 = r1
        L2a:
            r4 = r4 & r5
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L38
            boolean r5 = java.lang.Float.isNaN(r6)
            if (r5 == 0) goto L36
            goto L38
        L36:
            r5 = r2
            goto L39
        L38:
            r5 = r1
        L39:
            r4 = r4 & r5
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L46
            boolean r3 = java.lang.Float.isNaN(r7)
            if (r3 == 0) goto L45
            goto L46
        L45:
            r1 = r2
        L46:
            r3 = r4 & r1
            if (r3 != 0) goto L4f
            java.lang.String r3 = "Padding must be non-negative"
            defpackage.n53.a(r3)
        L4f:
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            kq4 r0 = new kq4
            r0.<init>()
            float r1 = r2.a
            r0.k0 = r1
            float r1 = r2.b
            r0.l0 = r1
            float r1 = r2.c
            r0.m0 = r1
            float r2 = r2.d
            r0.n0 = r2
            r2 = 1
            r0.o0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.jq4
            if (r0 == 0) goto L7
            jq4 r3 = (defpackage.jq4) r3
            goto L8
        L7:
            r3 = 0
        L8:
            if (r3 != 0) goto Lb
            goto L35
        Lb:
            float r0 = r2.a
            float r1 = r3.a
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 == 0) goto L35
            float r0 = r2.b
            float r1 = r3.b
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 == 0) goto L35
            float r0 = r2.c
            float r1 = r3.c
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 == 0) goto L35
            float r2 = r2.d
            float r3 = r3.d
            boolean r2 = defpackage.om1.b(r2, r3)
            if (r2 == 0) goto L35
            r2 = 1
            return r2
        L35:
            r2 = 0
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            kq4 r2 = (defpackage.kq4) r2
            float r0 = r1.a
            r2.k0 = r0
            float r0 = r1.b
            r2.l0 = r0
            float r0 = r1.c
            r2.m0 = r0
            float r1 = r1.d
            r2.n0 = r1
            r1 = 1
            r2.o0 = r1
            return
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.d
            int r3 = defpackage.xg6.a(r3, r0, r1)
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }
}
