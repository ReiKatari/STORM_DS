package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y77  reason: default package */
/* loaded from: classes.dex */
final class y77 extends defpackage.e74 {
    public final boolean a;
    public final defpackage.r94 b;
    public final boolean c;
    public final defpackage.mq5 d;
    public final defpackage.qn2 e;

    public y77(boolean r1, defpackage.r94 r2, boolean r3, defpackage.mq5 r4, defpackage.qn2 r5) {
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
            r6 = this;
            z77 r0 = new z77
            mq5 r4 = r6.d
            qn2 r5 = r6.e
            boolean r1 = r6.a
            r94 r2 = r6.b
            boolean r3 = r6.c
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            if (r3 != 0) goto L6
            goto L3b
        L6:
            java.lang.Class<y77> r0 = defpackage.y77.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L3b
        Lf:
            y77 r3 = (defpackage.y77) r3
            boolean r0 = r2.a
            boolean r1 = r3.a
            if (r0 == r1) goto L18
            goto L3b
        L18:
            r94 r0 = r2.b
            r94 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L23
            goto L3b
        L23:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L2a
            goto L3b
        L2a:
            mq5 r0 = r2.d
            mq5 r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L3b
        L35:
            qn2 r2 = r2.e
            qn2 r3 = r3.e
            if (r2 == r3) goto L3d
        L3b:
            r2 = 0
            return r2
        L3d:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r9) {
            r8 = this;
            r0 = r9
            z77 r0 = (defpackage.z77) r0
            boolean r9 = r0.J0
            boolean r1 = r8.a
            if (r9 == r1) goto Le
            r0.J0 = r1
            defpackage.bl2.G(r0)
        Le:
            qn2 r9 = r8.e
            r0.K0 = r9
            r5 = 0
            t46 r7 = r0.L0
            r94 r1 = r8.b
            r2 = 0
            r3 = 0
            boolean r4 = r8.c
            mq5 r6 = r8.d
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
            int r0 = r0 * 961
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            mq5 r2 = r4.d
            int r2 = r2.a
            int r0 = defpackage.lb1.a(r2, r0, r1)
            qn2 r4 = r4.e
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }
}
