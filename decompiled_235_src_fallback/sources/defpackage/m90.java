package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m90  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m90 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.lq4 B;
    public final /* synthetic */ defpackage.fo2 L;

    public /* synthetic */ m90(defpackage.lq4 r1, defpackage.fo2 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 0
            fo2 r4 = r7.L
            lq4 r7 = r7.B
            r5 = 1
            px0 r8 = (defpackage.px0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            switch(r0) {
                case 0: goto L95;
                default: goto L16;
            }
        L16:
            r0 = r9 & 3
            if (r0 == r2) goto L1b
            r3 = r5
        L1b:
            r9 = r9 & r5
            xq2 r8 = (defpackage.xq2) r8
            boolean r9 = r8.S(r9, r3)
            if (r9 == 0) goto L91
            float r9 = defpackage.k90.b
            float r0 = defpackage.k90.c
            x64 r2 = defpackage.x64.a
            a74 r9 = defpackage.dj6.a(r2, r9, r0)
            a74 r7 = defpackage.ge7.N(r9, r7)
            d40 r9 = defpackage.d90.i0
            r0 = 54
            d90 r2 = defpackage.ju.d
            l26 r9 = defpackage.k26.a(r2, r9, r8, r0)
            int r0 = defpackage.ge7.B(r8)
            xv4 r2 = r8.l()
            a74 r7 = defpackage.l.E(r8, r7)
            ix0 r3 = defpackage.jx0.i
            r3.getClass()
            iy0 r3 = defpackage.ix0.b
            r8.f0()
            boolean r6 = r8.S
            if (r6 == 0) goto L5a
            r8.k(r3)
            goto L5d
        L5a:
            r8.o0()
        L5d:
            pn r3 = defpackage.ix0.f
            defpackage.yh2.K(r8, r3, r9)
            pn r9 = defpackage.ix0.e
            defpackage.yh2.K(r8, r9, r2)
            pn r9 = defpackage.ix0.g
            boolean r2 = r8.S
            if (r2 != 0) goto L7b
            java.lang.Object r2 = r8.P()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L7e
        L7b:
            defpackage.i61.v(r0, r8, r0, r9)
        L7e:
            pn r9 = defpackage.ix0.d
            defpackage.yh2.K(r8, r9, r7)
            r7 = 6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            n26 r9 = defpackage.n26.a
            r4.e(r9, r8, r7)
            r8.p(r5)
            goto L94
        L91:
            r8.V()
        L94:
            return r1
        L95:
            r0 = r9 & 3
            if (r0 == r2) goto L9a
            r3 = r5
        L9a:
            r9 = r9 & r5
            xq2 r8 = (defpackage.xq2) r8
            boolean r9 = r8.S(r9, r3)
            if (r9 == 0) goto Lbf
            nq6 r9 = defpackage.ye7.b
            java.lang.Object r9 = r8.j(r9)
            xe7 r9 = (defpackage.xe7) r9
            s47 r9 = r9.k
            m90 r0 = new m90
            r0.<init>(r7, r4, r5)
            r7 = 165539859(0x9ddf013, float:5.342958E-33)
            zv0 r7 = defpackage.n16.I(r7, r0, r8)
            r0 = 48
            defpackage.x37.a(r9, r7, r8, r0)
            goto Lc2
        Lbf:
            r8.V()
        Lc2:
            return r1
    }
}
