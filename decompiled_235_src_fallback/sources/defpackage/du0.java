package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: du0  reason: default package */
/* loaded from: classes.dex */
final class du0 extends defpackage.e74 {
    public final defpackage.r94 a;
    public final boolean b;
    public final defpackage.on2 c;
    public final defpackage.on2 d;

    public du0(defpackage.on2 r1, defpackage.on2 r2, defpackage.r94 r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r3
            r0.b = r4
            r0.c = r1
            r0.d = r2
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r4 = this;
            gu0 r0 = new gu0
            r94 r1 = r4.a
            boolean r2 = r4.b
            on2 r3 = r4.c
            on2 r4 = r4.d
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 != 0) goto L7
            goto L31
        L7:
            java.lang.Class<du0> r1 = defpackage.du0.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L31
        L10:
            du0 r4 = (defpackage.du0) r4
            r94 r1 = r3.a
            r94 r2 = r4.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L1d
            goto L31
        L1d:
            boolean r1 = r3.b
            boolean r2 = r4.b
            if (r1 == r2) goto L24
            goto L31
        L24:
            on2 r1 = r3.c
            on2 r2 = r4.c
            if (r1 == r2) goto L2b
            goto L31
        L2b:
            on2 r3 = r3.d
            on2 r4 = r4.d
            if (r3 == r4) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r11) {
            r10 = this;
            r0 = r11
            gu0 r0 = (defpackage.gu0) r0
            r11 = 1
            r0.I0 = r11
            on2 r1 = r0.H0
            r8 = 0
            if (r1 != 0) goto Ld
            r1 = r11
            goto Le
        Ld:
            r1 = r8
        Le:
            on2 r2 = r10.d
            if (r2 != 0) goto L14
            r3 = r11
            goto L15
        L14:
            r3 = r8
        L15:
            if (r1 == r3) goto L1f
            r0.V0()
            defpackage.bl2.G(r0)
            r1 = r11
            goto L20
        L1f:
            r1 = r8
        L20:
            r0.H0 = r2
            boolean r2 = r0.r0
            boolean r4 = r10.b
            if (r2 == r4) goto L2a
            r9 = r11
            goto L2b
        L2a:
            r9 = r1
        L2b:
            r94 r1 = r10.a
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            on2 r7 = r10.c
            r0.f1(r1, r2, r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3e
            r0.g1(r8)
            r0.g1(r11)
        L3e:
            return
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            r94 r1 = r4.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 961
            r2 = 31
            int r1 = defpackage.xg6.e(r1, r0, r2)
            boolean r2 = r4.b
            r3 = 29791(0x745f, float:4.1746E-41)
            int r1 = defpackage.xg6.e(r1, r2, r3)
            on2 r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 961
            on2 r4 = r4.d
            if (r4 == 0) goto L2c
            int r0 = r4.hashCode()
        L2c:
            int r2 = r2 + r0
            int r2 = r2 * 961
            r4 = 1
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r2
            return r4
    }
}
