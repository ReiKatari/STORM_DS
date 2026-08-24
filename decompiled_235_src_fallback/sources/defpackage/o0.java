package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o0  reason: default package */
/* loaded from: classes.dex */
public final class o0 extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ o0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    public /* synthetic */ o0(defpackage.p0 r1, int r2, int r3) {
            r0 = this;
            r0.B = r3
            r0.L = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.B
            x64 r1 = defpackage.x64.a
            r2 = 2
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 1
            java.lang.Object r8 = r8.L
            switch(r0) {
                case 0: goto L115;
                case 1: goto Lda;
                case 2: goto Lc2;
                case 3: goto Lb1;
                case 4: goto L8c;
                case 5: goto L7b;
                case 6: goto L1f;
                default: goto Le;
            }
        Le:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
            c05 r8 = (defpackage.c05) r8
            int r10 = defpackage.ii2.a0(r5)
            r8.a(r9, r10)
            return r4
        L1f:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r2) goto L2d
            r0 = r5
            goto L2e
        L2d:
            r0 = r3
        L2e:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L77
            java.util.List r8 = (java.util.List) r8
            int r10 = r8.size()
            r0 = r3
        L3e:
            if (r0 >= r10) goto L7a
            java.lang.Object r1 = r8.get(r0)
            eo2 r1 = (defpackage.eo2) r1
            long r6 = r9.T
            int r2 = java.lang.Long.hashCode(r6)
            ix0 r6 = defpackage.jx0.i
            r6.getClass()
            jf r6 = defpackage.ix0.c
            r9.f0()
            boolean r7 = r9.S
            if (r7 == 0) goto L5e
            r9.k(r6)
            goto L61
        L5e:
            r9.o0()
        L61:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            pn r6 = defpackage.ix0.g
            defpackage.yh2.K(r9, r6, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1.o(r9, r2)
            r9.p(r5)
            int r0 = r0 + 1
            goto L3e
        L77:
            r9.V()
        L7a:
            return r4
        L7b:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
            gj1 r8 = (defpackage.gj1) r8
            int r10 = defpackage.ii2.a0(r5)
            r8.a(r9, r10)
            return r4
        L8c:
            a74 r9 = (defpackage.a74) r9
            y64 r10 = (defpackage.y64) r10
            px0 r8 = (defpackage.px0) r8
            boolean r0 = r10 instanceof defpackage.nx0
            if (r0 == 0) goto Lac
            nx0 r10 = (defpackage.nx0) r10
            fo2 r10 = r10.a
            r0 = 3
            defpackage.ge7.p(r0, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r10 = r10.e(r1, r8, r0)
            a74 r10 = (defpackage.a74) r10
            a74 r10 = defpackage.l.D(r8, r10)
        Lac:
            a74 r8 = r9.d(r10)
            return r8
        Lb1:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            r10.intValue()
            androidx.compose.ui.platform.ComposeView r8 = (androidx.compose.ui.platform.ComposeView) r8
            int r10 = defpackage.ii2.a0(r5)
            r8.a(r9, r10)
            return r4
        Lc2:
            z42 r9 = (defpackage.z42) r9
            z42 r10 = (defpackage.z42) r10
            z42 r0 = defpackage.z42.PostExit
            if (r9 != r0) goto Ld5
            if (r10 != r0) goto Ld5
            z72 r8 = (defpackage.z72) r8
            ha7 r8 = r8.a
            boolean r8 = r8.e
            if (r8 != 0) goto Ld5
            r3 = r5
        Ld5:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        Lda:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r2) goto Le8
            r0 = r5
            goto Le9
        Le8:
            r0 = r3
        Le9:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L111
            java.lang.Object r10 = r9.P()
            vs0 r0 = defpackage.ox0.a
            if (r10 != r0) goto Lff
            ne r10 = defpackage.ne.Z
            r9.l0(r10)
        Lff:
            qn2 r10 = (defpackage.qn2) r10
            a74 r10 = defpackage.ua6.a(r1, r3, r10)
            qa4 r8 = (defpackage.qa4) r8
            java.lang.Object r8 = r8.getValue()
            eo2 r8 = (defpackage.eo2) r8
            defpackage.nw7.K(r10, r8, r9, r3)
            goto L114
        L111:
            r9.V()
        L114:
            return r4
        L115:
            px0 r9 = (defpackage.px0) r9
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            if (r0 == r2) goto L123
            r0 = r5
            goto L124
        L123:
            r0 = r3
        L124:
            r10 = r10 & r5
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L133
            p0 r8 = (defpackage.p0) r8
            r8.a(r9, r3)
            goto L136
        L133:
            r9.V()
        L136:
            return r4
    }
}
