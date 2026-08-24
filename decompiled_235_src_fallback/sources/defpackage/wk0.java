package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wk0  reason: default package */
/* loaded from: classes.dex */
public final class wk0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ long d0;
    public final /* synthetic */ java.lang.Object e0;

    public /* synthetic */ wk0(int r1, long r2, defpackage.r41 r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            r0.X = r1
            r0.Z = r5
            r0.e0 = r6
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public wk0(long r2, defpackage.yk0 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public wk0(defpackage.fo1 r2, long r3, defpackage.r41 r5) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.e0 = r2
            r1.d0 = r3
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public wk0(defpackage.zi6 r2, long r3, defpackage.bj6 r5, defpackage.r41 r6) {
            r1 = this;
            r0 = 3
            r1.X = r0
            r1.Z = r2
            r1.d0 = r3
            r1.e0 = r5
            r2 = 2
            r1.<init>(r2, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L37;
                case 1: goto L2c;
                case 2: goto L21;
                case 3: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            wk0 r2 = (defpackage.wk0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            wk0 r2 = (defpackage.wk0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            wk0 r2 = (defpackage.wk0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            wk0 r2 = (defpackage.wk0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            wk0 r2 = (defpackage.wk0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r13, java.lang.Object r14) {
            r12 = this;
            int r0 = r12.X
            long r1 = r12.d0
            java.lang.Object r3 = r12.e0
            switch(r0) {
                case 0: goto L4d;
                case 1: goto L42;
                case 2: goto L2e;
                case 3: goto L1b;
                default: goto L9;
            }
        L9:
            wk0 r4 = new wk0
            java.lang.Object r14 = r12.Z
            r9 = r14
            t57 r9 = (defpackage.t57) r9
            r10 = r3
            qn2 r10 = (defpackage.qn2) r10
            long r6 = r12.d0
            r5 = 4
            r8 = r13
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L1b:
            r8 = r13
            wk0 r5 = new wk0
            java.lang.Object r13 = r12.Z
            r6 = r13
            zi6 r6 = (defpackage.zi6) r6
            r9 = r8
            long r7 = r12.d0
            bj6 r3 = (defpackage.bj6) r3
            r10 = r9
            r9 = r3
            r5.<init>(r6, r7, r9, r10)
            return r5
        L2e:
            r8 = r13
            wk0 r5 = new wk0
            java.lang.Object r13 = r12.Z
            r10 = r13
            sz1 r10 = (defpackage.sz1) r10
            r11 = r3
            nv4 r11 = (defpackage.nv4) r11
            long r12 = r12.d0
            r6 = 2
            r9 = r8
            r7 = r12
            r5.<init>(r6, r7, r9, r10, r11)
            return r5
        L42:
            r8 = r13
            wk0 r12 = new wk0
            fo1 r3 = (defpackage.fo1) r3
            r12.<init>(r3, r1, r8)
            r12.Z = r14
            return r12
        L4d:
            r8 = r13
            wk0 r12 = new wk0
            yk0 r3 = (defpackage.yk0) r3
            r12.<init>(r1, r3, r8)
            r12.Z = r14
            return r12
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            jg7 r6 = defpackage.jg7.a
            long r1 = r11.d0
            java.lang.Object r3 = r11.e0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto Le3;
                case 1: goto Lb8;
                case 2: goto L84;
                case 3: goto L4a;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r11.Y
            if (r6 == 0) goto L21
            if (r6 != r7) goto L1c
            defpackage.oi2.Y(r12)
            r0 = r12
            goto L49
        L1c:
            defpackage.i.m(r5)
            r0 = r8
            goto L49
        L21:
            defpackage.oi2.Y(r12)
            java.lang.Object r5 = r11.Z
            t57 r5 = (defpackage.t57) r5
            n61 r6 = r5.f
            qn2 r3 = (defpackage.qn2) r3
            w61 r5 = r5.b
            v27 r9 = new v27
            r9.<init>(r7, r8, r3)
            r3 = 2
            kg1 r3 = defpackage.hv.i(r5, r6, r8, r9, r3)
            ns3 r5 = new ns3
            r6 = 15
            r5.<init>(r3, r8, r6)
            r11.Y = r7
            java.lang.Object r1 = defpackage.xk2.N(r1, r5, r11)
            if (r1 != r0) goto L48
            goto L49
        L48:
            r0 = r1
        L49:
            return r0
        L4a:
            bj6 r3 = (defpackage.bj6) r3
            java.lang.Object r0 = r11.Z
            zi6 r0 = (defpackage.zi6) r0
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r11.Y
            if (r10 == 0) goto L62
            if (r10 != r7) goto L5d
            defpackage.oi2.Y(r12)
            r0 = r12
            goto L7d
        L5d:
            defpackage.i.m(r5)
            r6 = r8
            goto L83
        L62:
            defpackage.oi2.Y(r12)
            gn r0 = r0.a
            q93 r5 = new q93
            r5.<init>(r1)
            io6 r2 = r3.l0
            r11.Y = r7
            r3 = 0
            r1 = r5
            r5 = 12
            r4 = r11
            java.lang.Object r0 = defpackage.gn.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r9) goto L7d
            r6 = r9
            goto L83
        L7d:
            ro r0 = (defpackage.ro) r0
            mo r0 = r0.b
            mo r0 = defpackage.mo.BoundReached
        L83:
            return r6
        L84:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r11.Y
            if (r6 == 0) goto L96
            if (r6 != r7) goto L91
            defpackage.oi2.Y(r12)
            r0 = r12
            goto Lb7
        L91:
            defpackage.i.m(r5)
            r0 = r8
            goto Lb7
        L96:
            defpackage.oi2.Y(r12)
            java.lang.Object r5 = r11.Z
            sz1 r5 = (defpackage.sz1) r5
            tp6 r5 = r5.i0
            b7 r6 = new b7
            r9 = 10
            r6.<init>(r5, r9)
            u22 r5 = new u22
            nv4 r3 = (defpackage.nv4) r3
            r5.<init>(r3, r1, r8)
            r11.Y = r7
            java.lang.Object r1 = defpackage.f04.C(r6, r5, r11)
            if (r1 != r0) goto Lb6
            goto Lb7
        Lb6:
            r0 = r1
        Lb7:
            return r0
        Lb8:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r11.Y
            if (r9 == 0) goto Lc9
            if (r9 != r7) goto Lc4
            defpackage.oi2.Y(r12)
            goto Le2
        Lc4:
            defpackage.i.m(r5)
            r6 = r8
            goto Le2
        Lc9:
            defpackage.oi2.Y(r12)
            java.lang.Object r5 = r11.Z
            w61 r5 = (defpackage.w61) r5
            fo1 r3 = (defpackage.fo1) r3
            fo2 r3 = r3.I0
            jk4 r8 = new jk4
            r8.<init>(r1)
            r11.Y = r7
            java.lang.Object r1 = r3.e(r5, r8, r11)
            if (r1 != r0) goto Le2
            r6 = r0
        Le2:
            return r6
        Le3:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r11.Y
            if (r9 == 0) goto Lf4
            if (r9 != r7) goto Lef
            defpackage.oi2.Y(r12)
            goto L125
        Lef:
            defpackage.i.m(r5)
            r6 = r8
            goto L12c
        Lf4:
            defpackage.oi2.Y(r12)
            java.lang.Object r5 = r11.Z
            w61 r5 = (defpackage.w61) r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Finalizing "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = " in "
            r8.append(r5)
            r8.append(r1)
            java.lang.String r5 = " ms"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r8 = "CXCP"
            android.util.Log.d(r8, r5)
            r11.Y = r7
            java.lang.Object r1 = defpackage.q60.t(r1, r11)
            if (r1 != r0) goto L125
            r6 = r0
            goto L12c
        L125:
            yk0 r3 = (defpackage.yk0) r3
            r0 = 0
            r3.n(r0)
        L12c:
            return r6
    }
}
