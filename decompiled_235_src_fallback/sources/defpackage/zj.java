package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj  reason: default package */
/* loaded from: classes.dex */
public final class zj extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.c05 L;
    public final /* synthetic */ defpackage.qa4 R;

    public /* synthetic */ zj(defpackage.c05 r1, defpackage.qa4 r2, int r3) {
            r0 = this;
            r0.B = r3
            r0.L = r1
            r0.R = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.B
            jg7 r1 = defpackage.jg7.a
            qa4 r2 = r8.R
            c05 r8 = r8.L
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L44;
                default: goto Le;
            }
        Le:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r3) goto L1c
            r0 = r5
            goto L1d
        L1c:
            r0 = r4
        L1d:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L40
            py0 r10 = defpackage.ak.b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            pq r10 = r10.a(r0)
            zj r0 = new zj
            r0.<init>(r8, r2, r4)
            r8 = 1022273628(0x3ceea85c, float:0.029133014)
            zv0 r8 = defpackage.n16.I(r8, r0, r9)
            r0 = 56
            defpackage.hv.d(r10, r8, r9, r0)
            goto L43
        L40:
            r9.V()
        L43:
            return r1
        L44:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r3) goto L52
            r0 = r5
            goto L53
        L52:
            r0 = r4
        L53:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto Lf9
            java.lang.Object r10 = r9.P()
            vs0 r0 = defpackage.ox0.a
            if (r10 != r0) goto L69
            ne r10 = defpackage.ne.f0
            r9.l0(r10)
        L69:
            qn2 r10 = (defpackage.qn2) r10
            x64 r3 = defpackage.x64.a
            a74 r10 = defpackage.ua6.a(r3, r4, r10)
            boolean r3 = r9.h(r8)
            java.lang.Object r6 = r9.P()
            if (r3 != 0) goto L7d
            if (r6 != r0) goto L85
        L7d:
            wj r6 = new wj
            r6.<init>(r8, r5)
            r9.l0(r6)
        L85:
            qn2 r6 = (defpackage.qn2) r6
            a74 r10 = defpackage.lb4.E(r10, r6)
            boolean r8 = r8.getCanCalculatePosition()
            if (r8 == 0) goto L94
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L95
        L94:
            r8 = 0
        L95:
            a74 r8 = defpackage.jw2.j(r10, r8)
            py0 r10 = defpackage.ak.a
            java.lang.Object r10 = r2.getValue()
            eo2 r10 = (defpackage.eo2) r10
            java.lang.Object r2 = r9.P()
            if (r2 != r0) goto Lac
            fc r2 = defpackage.fc.d
            r9.l0(r2)
        Lac:
            e34 r2 = (defpackage.e34) r2
            long r6 = r9.T
            int r0 = java.lang.Long.hashCode(r6)
            xv4 r3 = r9.l()
            a74 r8 = defpackage.l.E(r9, r8)
            ix0 r6 = defpackage.jx0.i
            r6.getClass()
            iy0 r6 = defpackage.ix0.b
            r9.f0()
            boolean r7 = r9.S
            if (r7 == 0) goto Lce
            r9.k(r6)
            goto Ld1
        Lce:
            r9.o0()
        Ld1:
            pn r6 = defpackage.ix0.f
            defpackage.yh2.K(r9, r6, r2)
            pn r2 = defpackage.ix0.e
            defpackage.yh2.K(r9, r2, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            pn r2 = defpackage.ix0.g
            defpackage.yh2.K(r9, r2, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r9, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r9, r0, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r10.o(r9, r8)
            r9.p(r5)
            goto Lfc
        Lf9:
            r9.V()
        Lfc:
            return r1
    }
}
