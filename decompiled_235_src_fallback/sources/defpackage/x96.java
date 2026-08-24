package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x96  reason: default package */
/* loaded from: classes.dex */
final class x96 extends defpackage.e74 {
    public final boolean a;
    public final defpackage.r94 b;
    public final defpackage.n43 c;
    public final boolean d;
    public final boolean e;
    public final defpackage.mq5 f;
    public final defpackage.on2 g;

    public x96(boolean r1, defpackage.r94 r2, defpackage.n43 r3, boolean r4, boolean r5, defpackage.mq5 r6, defpackage.on2 r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r8 = this;
            z96 r0 = new z96
            on2 r7 = r8.g
            r5 = 0
            r94 r1 = r8.b
            n43 r2 = r8.c
            boolean r3 = r8.d
            boolean r4 = r8.e
            mq5 r6 = r8.f
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r8 = r8.a
            r0.J0 = r8
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4f
        L3:
            if (r3 != 0) goto L6
            goto L4d
        L6:
            java.lang.Class<x96> r0 = defpackage.x96.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L4d
        Lf:
            x96 r3 = (defpackage.x96) r3
            boolean r0 = r2.a
            boolean r1 = r3.a
            if (r0 == r1) goto L18
            goto L4d
        L18:
            r94 r0 = r2.b
            r94 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L23
            goto L4d
        L23:
            n43 r0 = r2.c
            n43 r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2e
            goto L4d
        L2e:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L35
            goto L4d
        L35:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L3c
            goto L4d
        L3c:
            mq5 r0 = r2.f
            mq5 r1 = r3.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L47
            goto L4d
        L47:
            on2 r2 = r2.g
            on2 r3 = r3.g
            if (r2 == r3) goto L4f
        L4d:
            r2 = 0
            return r2
        L4f:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r9) {
            r8 = this;
            r0 = r9
            z96 r0 = (defpackage.z96) r0
            boolean r9 = r0.J0
            boolean r1 = r8.a
            if (r9 == r1) goto Le
            r0.J0 = r1
            defpackage.bl2.G(r0)
        Le:
            r5 = 0
            r94 r1 = r8.b
            n43 r2 = r8.c
            boolean r3 = r8.d
            boolean r4 = r8.e
            mq5 r6 = r8.f
            on2 r7 = r8.g
            r0.f1(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            r94 r3 = r4.b
            if (r3 == 0) goto L13
            int r3 = r3.hashCode()
            goto L14
        L13:
            r3 = r2
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            n43 r3 = r4.c
            if (r3 == 0) goto L1f
            int r3 = r3.hashCode()
            goto L20
        L1f:
            r3 = r2
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r4.d
            int r0 = defpackage.xg6.e(r0, r3, r1)
            boolean r3 = r4.e
            int r0 = defpackage.xg6.e(r0, r3, r1)
            mq5 r3 = r4.f
            if (r3 == 0) goto L38
            int r2 = r3.a
            int r2 = java.lang.Integer.hashCode(r2)
        L38:
            int r0 = r0 + r2
            int r0 = r0 * r1
            on2 r4 = r4.g
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }
}
