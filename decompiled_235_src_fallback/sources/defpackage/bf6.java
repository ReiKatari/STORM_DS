package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bf6  reason: default package */
/* loaded from: classes.dex */
public final class bf6 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.dx4 L;
    public final /* synthetic */ defpackage.cf6 R;

    public bf6(defpackage.cf6 r2, defpackage.dx4 r3) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r1.R = r2
            r1.L = r3
            r2 = 1
            r1.<init>(r2)
            return
    }

    public bf6(defpackage.dx4 r2, defpackage.cf6 r3) {
            r1 = this;
            r0 = 1
            r1.B = r0
            r1.L = r2
            r1.R = r3
            r1.<init>(r0)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.B
            jg7 r2 = defpackage.jg7.a
            cf6 r3 = r0.R
            dx4 r0 = r0.L
            r4 = 0
            r5 = 0
            switch(r1) {
                case 0: goto Lad;
                default: goto Lf;
            }
        Lf:
            r1 = r19
            cx4 r1 = (defpackage.cx4) r1
            defpackage.cx4.j(r1, r0, r4, r4)
            if6 r0 = r3.m0
            gf6 r0 = r0.e()
            if6 r3 = r3.m0
            mg5 r0 = r0.c
            r0.i()
            zg6 r4 = r0.d()
            rf4 r6 = defpackage.rf4.a
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 != 0) goto Lac
            boolean r4 = r3.h()
            if (r4 != 0) goto L37
            goto Lac
        L37:
            zg6 r4 = r0.d()
            x60 r6 = r3.d()
            boolean r6 = r6.b()
            if (r6 == 0) goto Lac
            boolean r4 = r4.b()
            if (r4 == 0) goto Lac
            jk3 r1 = r1.d()
            if (r1 == 0) goto Lac
            long r6 = r1.m()
            long r11 = defpackage.qo2.S(r6)
            gf6 r4 = r3.e()
            sg6 r4 = r4.b
            gf6 r6 = r3.e()
            sg6 r6 = r6.b
            jk3 r6 = r6.Y
            java.lang.String r7 = "Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead."
            if (r6 == 0) goto La8
            sz3 r4 = r4.A
            long r13 = r4.c(r6, r1)
            gf6 r4 = r3.e()
            sg6 r4 = r4.b
            gf6 r3 = r3.e()
            sg6 r3 = r3.b
            jk3 r3 = r3.Y
            if (r3 == 0) goto La3
            r4 = 2
            long r15 = defpackage.jk3.i(r3, r1, r4)
            zg6 r8 = r0.d()
            java.lang.Object r1 = r0.c
            r9 = r1
            gf6 r9 = (defpackage.gf6) r9
            java.lang.Object r1 = r0.g
            r10 = r1
            cf6 r10 = (defpackage.cf6) r10
            r10.getClass()
            zg6 r1 = r8.a(r9, r10, r11, r13, r15)
            java.lang.Object r0 = r0.d
            vs4 r0 = (defpackage.vs4) r0
            r0.setValue(r1)
            goto Lac
        La3:
            defpackage.i.h(r7)
        La6:
            r2 = r5
            goto Lac
        La8:
            defpackage.i.h(r7)
            goto La6
        Lac:
            return r2
        Lad:
            r1 = r19
            cx4 r1 = (defpackage.cx4) r1
            r6 = 1
            r3.l0 = r6
            r3.k0 = r5
            if6 r6 = r3.m0
            gf6 r6 = r6.e()
            mg5 r6 = r6.c
            zg6 r6 = r6.d()
            if6 r7 = r3.m0
            boolean r7 = r7.h()
            if (r7 != 0) goto Lcf
            defpackage.cx4.j(r1, r0, r4, r4)
            goto L237
        Lcf:
            boolean r7 = r6.d()
            if (r7 == 0) goto L234
            eb r7 = r6.e()
            if (r7 == 0) goto L22e
            of5 r8 = r6.c()
            if (r8 == 0) goto L227
            if6 r6 = r3.m0
            gf6 r6 = r6.e()
            sg6 r6 = r6.b
            boolean r6 = r6.a()
            r12 = 0
            if (r6 == 0) goto L1ec
            jk3 r6 = r1.d()
            if (r6 != 0) goto Lfc
            defpackage.cx4.j(r1, r0, r4, r4)
            goto L237
        Lfc:
            if6 r14 = r3.m0
            gf6 r14 = r14.e()
            mg5 r14 = r14.c
            zg6 r14 = r14.d()
            boolean r14 = r14.b()
            jk3 r15 = r3.S0()
            long r12 = r15.J(r6, r12)
            defpackage.kn2.L(r7)
            if6 r15 = r3.m0
            if (r14 != 0) goto L131
            x60 r15 = r15.d()
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            of5 r9 = defpackage.kn2.L(r7)
            af6 r10 = new af6
            r10.<init>(r4)
            r15.a(r8, r9, r10)
            goto L141
        L131:
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            x60 r4 = r15.d()
            of5 r9 = defpackage.kn2.L(r7)
            r4.a(r8, r9, r5)
        L141:
            if6 r4 = r3.m0
            x60 r4 = r4.d()
            of5 r4 = r4.c()
            if (r4 == 0) goto L17b
            long r9 = r4.d()
            java.lang.Object r5 = r7.L
            vs4 r5 = (defpackage.vs4) r5
            java.lang.Object r5 = r5.getValue()
            jk4 r5 = (defpackage.jk4) r5
            r16 = r12
            r15 = 32
            long r11 = r5.a
            long r9 = defpackage.jk4.e(r9, r11)
            java.lang.Object r5 = r7.X
            vs4 r5 = (defpackage.vs4) r5
            java.lang.Object r5 = r5.getValue()
            jk4 r5 = (defpackage.jk4) r5
            long r11 = r5.a
            long r9 = defpackage.jk4.f(r9, r11)
            jk4 r5 = new jk4
            r5.<init>(r9)
            goto L17f
        L17b:
            r16 = r12
            r15 = 32
        L17f:
            if6 r7 = r3.m0
            x60 r7 = r7.d()
            boolean r7 = r7.b()
            if (r7 != 0) goto L19a
            if (r14 != 0) goto L18e
            goto L19a
        L18e:
            if (r5 == 0) goto L193
            long r3 = r5.a
            goto L197
        L193:
            long r3 = r8.d()
        L197:
            r9 = r16
            goto L1ce
        L19a:
            if (r5 == 0) goto L19f
            long r7 = r5.a
            goto L1a1
        L19f:
            r7 = r16
        L1a1:
            if (r5 != 0) goto L1b2
            long r4 = r6.m()
            long r4 = defpackage.qo2.S(r4)
            r9 = r16
            of5 r4 = defpackage.kj2.b(r9, r4)
            goto L1be
        L1b2:
            r9 = r16
            long r5 = r5.a
            long r11 = r4.c()
            of5 r4 = defpackage.kj2.b(r5, r11)
        L1be:
            if6 r3 = r3.m0
            gf6 r3 = r3.e()
            mg5 r3 = r3.c
            zg6 r3 = r3.d()
            r3.i(r4)
            r3 = r7
        L1ce:
            long r3 = defpackage.jk4.e(r3, r9)
            long r5 = r3 >> r15
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r3 = r3 & r18
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r4 = java.lang.Math.round(r5)
            int r3 = java.lang.Math.round(r3)
            defpackage.cx4.j(r1, r0, r4, r3)
            goto L237
        L1ec:
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r15 = 32
            if6 r5 = r3.m0
            x60 r5 = r5.d()
            boolean r5 = r5.b()
            if (r5 != 0) goto L223
            jk3 r4 = r1.d()
            if (r4 == 0) goto L219
            jk3 r3 = r3.S0()
            long r3 = r3.J(r4, r12)
            long r5 = r8.d()
            long r3 = defpackage.jk4.e(r5, r3)
            long r12 = defpackage.kn2.a0(r3)
        L219:
            long r3 = r12 >> r15
            int r3 = (int) r3
            long r4 = r12 & r18
            int r4 = (int) r4
            defpackage.cx4.j(r1, r0, r3, r4)
            goto L237
        L223:
            defpackage.cx4.j(r1, r0, r4, r4)
            goto L237
        L227:
            java.lang.String r0 = "Match State is configured, but current bounds is null. State = "
            defpackage.u34.w(r6, r0)
        L22c:
            r2 = r5
            goto L237
        L22e:
            java.lang.String r0 = "Match State is configured, but target data is null. State = "
            defpackage.u34.w(r6, r0)
            goto L22c
        L234:
            defpackage.cx4.j(r1, r0, r4, r4)
        L237:
            return r2
    }
}
