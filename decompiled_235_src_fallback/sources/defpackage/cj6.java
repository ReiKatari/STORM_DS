package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cj6  reason: default package */
/* loaded from: classes.dex */
final class cj6 extends defpackage.e74 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ cj6(float r3, float r4, float r5, float r6, int r7) {
            r2 = this;
            r0 = r7 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r0 = r7 & 2
            if (r0 == 0) goto Lc
            r4 = r1
        Lc:
            r0 = r7 & 4
            if (r0 == 0) goto L11
            r5 = r1
        L11:
            r7 = r7 & 8
            if (r7 == 0) goto L16
            r6 = r1
        L16:
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public cj6(float r1, float r2, float r3, float r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            ej6 r0 = new ej6
            r0.<init>()
            float r1 = r2.a
            r0.k0 = r1
            float r1 = r2.b
            r0.l0 = r1
            float r1 = r2.c
            r0.m0 = r1
            float r1 = r2.d
            r0.n0 = r1
            boolean r2 = r2.e
            r0.o0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof defpackage.cj6
            if (r0 != 0) goto L8
            goto L3c
        L8:
            cj6 r3 = (defpackage.cj6) r3
            float r0 = r3.a
            float r1 = r2.a
            boolean r0 = defpackage.om1.b(r1, r0)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            float r0 = r2.b
            float r1 = r3.b
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            float r0 = r2.c
            float r1 = r3.c
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            float r0 = r2.d
            float r1 = r3.d
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L36
            goto L3c
        L36:
            boolean r2 = r2.e
            boolean r3 = r3.e
            if (r2 == r3) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r2) {
            r1 = this;
            ej6 r2 = (defpackage.ej6) r2
            float r0 = r1.a
            r2.k0 = r0
            float r0 = r1.b
            r2.l0 = r0
            float r0 = r1.c
            r2.m0 = r0
            float r0 = r1.d
            r2.n0 = r0
            boolean r1 = r1.e
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
            float r2 = r3.d
            int r0 = defpackage.xg6.a(r2, r0, r1)
            boolean r3 = r3.e
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }
}
