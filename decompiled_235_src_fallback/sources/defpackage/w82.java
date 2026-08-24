package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w82  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w82 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.x82 B;

    public /* synthetic */ w82(defpackage.x82 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 1
            x82 r8 = r8.B
            r4 = 0
            px0 r9 = (defpackage.px0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            switch(r0) {
                case 0: goto L3a;
                default: goto L14;
            }
        L14:
            r0 = r10 & 3
            if (r0 == r2) goto L1a
            r0 = r3
            goto L1b
        L1a:
            r0 = r4
        L1b:
            r10 = r10 & r3
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L36
            w82 r10 = new w82
            r10.<init>(r8, r4)
            r8 = 918246117(0x36bb52e5, float:5.5826845E-6)
            zv0 r8 = defpackage.n16.I(r8, r10, r9)
            r10 = 54
            defpackage.bl2.e(r3, r8, r9, r10, r4)
            goto L39
        L36:
            r9.V()
        L39:
            return r1
        L3a:
            r0 = r10 & 3
            if (r0 == r2) goto L40
            r0 = r3
            goto L41
        L40:
            r0 = r4
        L41:
            r10 = r10 & r3
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto Lda
            lc2 r10 = defpackage.dj6.c
            long r5 = defpackage.es7.s
            jy2 r0 = defpackage.u24.m
            a74 r10 = defpackage.vy7.L(r10, r5, r0)
            e40 r0 = defpackage.d90.L
            e34 r0 = defpackage.h70.d(r0, r4)
            long r5 = r9.T
            int r2 = java.lang.Long.hashCode(r5)
            xv4 r5 = r9.l()
            a74 r10 = defpackage.l.E(r9, r10)
            ix0 r6 = defpackage.jx0.i
            r6.getClass()
            iy0 r6 = defpackage.ix0.b
            r9.f0()
            boolean r7 = r9.S
            if (r7 == 0) goto L7a
            r9.k(r6)
            goto L7d
        L7a:
            r9.o0()
        L7d:
            pn r6 = defpackage.ix0.f
            defpackage.yh2.K(r9, r6, r0)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r9, r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            pn r2 = defpackage.ix0.g
            defpackage.yh2.K(r9, r2, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r9, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r9, r0, r10)
            vs4 r8 = r8.B
            java.lang.Object r8 = r8.getValue()
            eo2 r8 = (defpackage.eo2) r8
            if (r8 != 0) goto Laf
            r8 = 908576654(0x3627c78e, float:2.5001095E-6)
            r9.b0(r8)
            r9.p(r4)
            r8 = 0
            goto Lc0
        Laf:
            r10 = -1356164397(0xffffffffaf2a92d3, float:-1.5513572E-10)
            r9.b0(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r8.o(r9, r10)
            r9.p(r4)
            r8 = r1
        Lc0:
            if (r8 != 0) goto Lcf
            r8 = -1356164003(0xffffffffaf2a945d, float:-1.5514119E-10)
            r9.b0(r8)
            defpackage.g04.m(r9, r4)
        Lcb:
            r9.p(r4)
            goto Ld6
        Lcf:
            r8 = -1356164840(0xffffffffaf2a9118, float:-1.5512958E-10)
            r9.b0(r8)
            goto Lcb
        Ld6:
            r9.p(r3)
            goto Ldd
        Lda:
            r9.V()
        Ldd:
            return r1
    }
}
