package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zu1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ zu1(java.lang.Object r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.R = r4
            r0.<init>()
            return
    }

    public /* synthetic */ zu1(defpackage.jm7 r2, defpackage.dx4 r3, int r4) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.B = r4
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.A
            r2 = 1
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            int r5 = r0.B
            java.lang.Object r6 = r0.R
            java.lang.Object r0 = r0.L
            switch(r1) {
                case 0: goto L14f;
                case 1: goto L124;
                case 2: goto L77;
                case 3: goto L4c;
                default: goto L11;
            }
        L11:
            jm7 r0 = (defpackage.jm7) r0
            dx4 r6 = (defpackage.dx4) r6
            r7 = r20
            cx4 r7 = (defpackage.cx4) r7
            int r8 = r0.b
            i27 r1 = r0.a
            p97 r9 = r0.c
            on2 r0 = r0.d
            java.lang.Object r0 = r0.c()
            b47 r0 = (defpackage.b47) r0
            if (r0 == 0) goto L2d
            a47 r0 = r0.a
        L2b:
            r10 = r0
            goto L2f
        L2d:
            r0 = 0
            goto L2b
        L2f:
            r11 = 0
            int r12 = r6.A
            of5 r0 = defpackage.xk2.f(r7, r8, r9, r10, r11, r12)
            lo4 r2 = defpackage.lo4.Vertical
            int r8 = r6.B
            r1.a(r2, r0, r5, r8)
            rs4 r0 = r1.a
            float r0 = r0.h()
            float r0 = -r0
            int r0 = java.lang.Math.round(r0)
            defpackage.cx4.l(r7, r6, r3, r0)
            return r4
        L4c:
            n76 r0 = (defpackage.n76) r0
            dx4 r6 = (defpackage.dx4) r6
            r1 = r20
            cx4 r1 = (defpackage.cx4) r1
            s76 r7 = r0.k0
            ss4 r7 = r7.a
            int r7 = r7.h()
            if (r7 >= 0) goto L5f
            r7 = r3
        L5f:
            if (r7 <= r5) goto L62
            goto L63
        L62:
            r5 = r7
        L63:
            int r5 = -r5
            boolean r0 = r0.l0
            if (r0 == 0) goto L6a
            r7 = r3
            goto L6b
        L6a:
            r7 = r5
        L6b:
            if (r0 == 0) goto L6e
            goto L6f
        L6e:
            r5 = r3
        L6f:
            r1.A = r2
            defpackage.cx4.m(r1, r6, r7, r5)
            r1.A = r3
            return r4
        L77:
            cf5 r0 = (defpackage.cf5) r0
            y94 r6 = (defpackage.y94) r6
            r1 = r20
            yx0 r1 = (defpackage.yx0) r1
            int r7 = r0.e
            if (r7 != r5) goto L123
            y94 r7 = r0.f
            boolean r7 = defpackage.nb3.k(r6, r7)
            if (r7 == 0) goto L123
            boolean r7 = r1 instanceof defpackage.ey0
            if (r7 == 0) goto L123
            long[] r7 = r6.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L123
            r9 = r3
        L97:
            r10 = r7[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L117
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r3
        Lb1:
            if (r14 >= r12) goto L111
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L102
            int r15 = r9 << 3
            int r15 = r15 + r14
            java.lang.Object[] r2 = r6.b
            r2 = r2[r15]
            int[] r3 = r6.c
            r3 = r3[r15]
            if (r3 == r5) goto Lcb
            r3 = 1
            goto Lcc
        Lcb:
            r3 = 0
        Lcc:
            if (r3 == 0) goto Lf6
            r19 = r13
            r13 = r1
            ey0 r13 = (defpackage.ey0) r13
            r20 = r1
            ja4 r1 = r13.Z
            defpackage.mp2.U(r1, r2, r0)
            r18 = r3
            boolean r3 = r2 instanceof defpackage.ii1
            if (r3 == 0) goto Lfc
            r3 = r2
            ii1 r3 = (defpackage.ii1) r3
            boolean r1 = r1.c(r3)
            if (r1 != 0) goto Lee
            ja4 r1 = r13.f0
            defpackage.mp2.W(r1, r3)
        Lee:
            ja4 r1 = r0.g
            if (r1 == 0) goto Lfc
            r1.k(r2)
            goto Lfc
        Lf6:
            r20 = r1
            r18 = r3
            r19 = r13
        Lfc:
            if (r18 == 0) goto L106
            r6.f(r15)
            goto L106
        L102:
            r20 = r1
            r19 = r13
        L106:
            long r10 = r10 >> r19
            int r14 = r14 + 1
            r13 = r19
            r1 = r20
            r2 = 1
            r3 = 0
            goto Lb1
        L111:
            r20 = r1
            r1 = r13
            if (r12 != r1) goto L123
            goto L119
        L117:
            r20 = r1
        L119:
            if (r9 == r8) goto L123
            int r9 = r9 + 1
            r1 = r20
            r2 = 1
            r3 = 0
            goto L97
        L123:
            return r4
        L124:
            rj5 r0 = (defpackage.rj5) r0
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r6
            r1 = r20
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            int r2 = r0.a
            if (r1 == 0) goto L139
            r1 = r2 | r5
            goto L13b
        L139:
            int r1 = ~r5
            r1 = r1 & r2
        L13b:
            r0.a = r1
            boolean r1 = r6.Y()
            if (r1 != 0) goto L144
            goto L14e
        L144:
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r1 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r0 = r0.a
            r1.setRenderer3DDebugControls(r0)
            r6.a0()
        L14e:
            return r4
        L14f:
            nj5 r0 = (defpackage.nj5) r0
            on2 r6 = (defpackage.on2) r6
            r1 = r20
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            int r2 = r0.m
            if (r1 == 0) goto L164
            r1 = r2 | r5
            goto L166
        L164:
            int r1 = ~r5
            r1 = r1 & r2
        L166:
            r0.m = r1
            r6.c()
            return r4
    }
}
