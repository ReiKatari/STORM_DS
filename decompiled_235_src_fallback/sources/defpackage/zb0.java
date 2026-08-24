package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb0  reason: default package */
/* loaded from: classes.dex */
public final class zb0 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ zb0(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r13, defpackage.r41 r14) {
            r12 = this;
            int r0 = r12.A
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L852;
                case 1: goto L789;
                case 2: goto L703;
                case 3: goto L66d;
                case 4: goto L597;
                case 5: goto L585;
                case 6: goto L53a;
                case 7: goto L4ef;
                case 8: goto L47f;
                case 9: goto L425;
                case 10: goto L3c7;
                case 11: goto L357;
                case 12: goto L333;
                case 13: goto L2b6;
                case 14: goto L26e;
                case 15: goto L15c;
                case 16: goto Lfa;
                case 17: goto Lb2;
                case 18: goto L28;
                case 19: goto L1d;
                default: goto Ld;
            }
        Ld:
            x21 r13 = (defpackage.x21) r13
            java.lang.Object r14 = r12.B
            ll4 r14 = (defpackage.ll4) r14
            java.lang.Object r12 = r12.L
            yw7 r12 = (defpackage.yw7) r12
            r14.a(r12, r13)
            jg7 r12 = defpackage.jg7.a
            return r12
        L1d:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Object r12 = r12.b(r13, r14)
            return r12
        L28:
            boolean r0 = r14 instanceof defpackage.mg6
            if (r0 == 0) goto L39
            r0 = r14
            mg6 r0 = (defpackage.mg6) r0
            int r1 = r0.X
            r2 = r1 & r5
            if (r2 == 0) goto L39
            int r1 = r1 - r5
            r0.X = r1
            goto L3e
        L39:
            mg6 r0 = new mg6
            r0.<init>(r12, r14)
        L3e:
            java.lang.Object r14 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            if (r2 == 0) goto L52
            if (r2 != r6) goto L4c
            defpackage.oi2.Y(r14)
            goto Lab
        L4c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto Lb1
        L52:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            ne2 r14 = (defpackage.ne2) r14
            bg6 r13 = (defpackage.bg6) r13
            java.lang.Object r12 = r12.L
            ng6 r12 = (defpackage.ng6) r12
            po5 r2 = defpackage.ng6.l
            if (r13 != 0) goto L64
            goto L9d
        L64:
            boolean r2 = r13 instanceof defpackage.zf6
            if (r2 == 0) goto L82
            zf6 r13 = (defpackage.zf6) r13
            java.io.File r12 = r13.a
            boolean r13 = r12.isDirectory()
            if (r13 == 0) goto L9d
            java.lang.String[] r12 = r12.list()
            if (r12 == 0) goto L9d
            int r12 = r12.length
            if (r12 != 0) goto L7d
            r12 = r6
            goto L7e
        L7d:
            r12 = r4
        L7e:
            r12 = r12 ^ r6
            if (r12 != r6) goto L9d
            goto L9c
        L82:
            boolean r2 = r13 instanceof defpackage.ag6
            if (r2 == 0) goto Lae
            android.content.Context r12 = r12.a
            ag6 r13 = (defpackage.ag6) r13
            android.net.Uri r13 = r13.a
            qi6 r12 = defpackage.zl1.h(r12, r13)
            boolean r13 = r12.e()
            if (r13 == 0) goto L9d
            boolean r12 = r12.k()
            if (r12 == 0) goto L9d
        L9c:
            r4 = r6
        L9d:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            r0.X = r6
            java.lang.Object r12 = r14.a(r12, r0)
            if (r12 != r1) goto Lab
            r7 = r1
            goto Lb1
        Lab:
            jg7 r7 = defpackage.jg7.a
            goto Lb1
        Lae:
            defpackage.i.d()
        Lb1:
            return r7
        Lb2:
            boolean r0 = r14 instanceof defpackage.ig6
            if (r0 == 0) goto Lc3
            r0 = r14
            ig6 r0 = (defpackage.ig6) r0
            int r1 = r0.X
            r2 = r1 & r5
            if (r2 == 0) goto Lc3
            int r1 = r1 - r5
            r0.X = r1
            goto Lc8
        Lc3:
            ig6 r0 = new ig6
            r0.<init>(r12, r14)
        Lc8:
            java.lang.Object r14 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            if (r2 == 0) goto Ldc
            if (r2 != r6) goto Ld6
            defpackage.oi2.Y(r14)
            goto Lf7
        Ld6:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto Lf9
        Ldc:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            ne2 r14 = (defpackage.ne2) r14
            jg7 r13 = (defpackage.jg7) r13
            java.lang.Object r12 = r12.L
            on2 r12 = (defpackage.on2) r12
            java.lang.Object r12 = r12.c()
            r0.X = r6
            java.lang.Object r12 = r14.a(r12, r0)
            if (r12 != r1) goto Lf7
            r7 = r1
            goto Lf9
        Lf7:
            jg7 r7 = defpackage.jg7.a
        Lf9:
            return r7
        Lfa:
            jk4 r13 = (defpackage.jk4) r13
            long r0 = r13.a
            jg7 r13 = defpackage.jg7.a
            java.lang.Object r3 = r12.B
            gn r3 = (defpackage.gn) r3
            java.lang.Object r4 = r3.d()
            jk4 r4 = (defpackage.jk4) r4
            long r4 = r4.a
            r8 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r4 & r8
            r10 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L14d
            long r4 = r0 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L14d
            java.lang.Object r4 = r3.d()
            jk4 r4 = (defpackage.jk4) r4
            long r4 = r4.a
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r8
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r5 = r0 & r8
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L140
            goto L14d
        L140:
            java.lang.Object r12 = r12.L
            w61 r12 = (defpackage.w61) r12
            jc0 r14 = new jc0
            r14.<init>(r3, r0, r7)
            defpackage.hv.L(r12, r7, r7, r14, r2)
            goto L15b
        L14d:
            jk4 r12 = new jk4
            r12.<init>(r0)
            java.lang.Object r12 = r3.e(r14, r12)
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            if (r12 != r14) goto L15b
            r13 = r12
        L15b:
            return r13
        L15c:
            t93 r13 = (defpackage.t93) r13
            boolean r14 = r13 instanceof defpackage.n25
            java.lang.Object r0 = r12.B
            ql r0 = (defpackage.ql) r0
            if (r14 == 0) goto L178
            boolean r12 = r0.s0
            if (r12 == 0) goto L171
            n25 r13 = (defpackage.n25) r13
            r0.R0(r13)
            goto L26b
        L171:
            ca4 r12 = r0.t0
            r12.a(r13)
            goto L26b
        L178:
            java.lang.Object r12 = r12.L
            w61 r12 = (defpackage.w61) r12
            ka0 r14 = r0.p0
            r1 = 0
            if (r14 != 0) goto L1a0
            ka0 r14 = new ka0
            boolean r4 = r0.l0
            ch1 r5 = r0.o0
            r14.<init>()
            r14.a = r4
            r14.b = r5
            gn r4 = defpackage.nb3.b(r1)
            r14.c = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r14.d = r4
            defpackage.f04.I(r0)
            r0.p0 = r14
        L1a0:
            java.lang.Object r0 = r14.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r4 = r13 instanceof defpackage.oy2
            if (r4 == 0) goto L1ac
            r0.add(r13)
            goto L1eb
        L1ac:
            boolean r4 = r13 instanceof defpackage.py2
            if (r4 == 0) goto L1b8
            py2 r13 = (defpackage.py2) r13
            oy2 r13 = r13.a
            r0.remove(r13)
            goto L1eb
        L1b8:
            boolean r4 = r13 instanceof defpackage.sg2
            if (r4 == 0) goto L1c0
            r0.add(r13)
            goto L1eb
        L1c0:
            boolean r4 = r13 instanceof defpackage.tg2
            if (r4 == 0) goto L1cc
            tg2 r13 = (defpackage.tg2) r13
            sg2 r13 = r13.a
            r0.remove(r13)
            goto L1eb
        L1cc:
            boolean r4 = r13 instanceof defpackage.ao1
            if (r4 == 0) goto L1d4
            r0.add(r13)
            goto L1eb
        L1d4:
            boolean r4 = r13 instanceof defpackage.bo1
            if (r4 == 0) goto L1e0
            bo1 r13 = (defpackage.bo1) r13
            ao1 r13 = r13.a
            r0.remove(r13)
            goto L1eb
        L1e0:
            boolean r4 = r13 instanceof defpackage.zn1
            if (r4 == 0) goto L26b
            zn1 r13 = (defpackage.zn1) r13
            ao1 r13 = r13.a
            r0.remove(r13)
        L1eb:
            java.lang.Object r13 = defpackage.gt0.R0(r0)
            t93 r13 = (defpackage.t93) r13
            java.lang.Object r0 = r14.e
            t93 r0 = (defpackage.t93) r0
            boolean r0 = defpackage.nb3.k(r0, r13)
            if (r0 != 0) goto L26b
            if (r13 == 0) goto L242
            java.lang.Object r0 = r14.b
            ch1 r0 = (defpackage.ch1) r0
            java.lang.Object r0 = r0.c()
            eq5 r0 = (defpackage.eq5) r0
            boolean r4 = r13 instanceof defpackage.oy2
            if (r4 == 0) goto L20e
            float r1 = r0.c
            goto L21b
        L20e:
            boolean r5 = r13 instanceof defpackage.sg2
            if (r5 == 0) goto L215
            float r1 = r0.b
            goto L21b
        L215:
            boolean r5 = r13 instanceof defpackage.ao1
            if (r5 == 0) goto L21b
            float r1 = r0.a
        L21b:
            sc7 r0 = defpackage.iq5.a
            if (r4 == 0) goto L220
            goto L239
        L220:
            boolean r4 = r13 instanceof defpackage.sg2
            r5 = 45
            if (r4 == 0) goto L22e
            sc7 r0 = new sc7
            e41 r4 = defpackage.ir1.c
            r0.<init>(r5, r4, r3)
            goto L239
        L22e:
            boolean r4 = r13 instanceof defpackage.ao1
            if (r4 == 0) goto L239
            sc7 r0 = new sc7
            e41 r4 = defpackage.ir1.c
            r0.<init>(r5, r4, r3)
        L239:
            wc4 r3 = new wc4
            r3.<init>(r14, r1, r0, r7)
            defpackage.hv.L(r12, r7, r7, r3, r2)
            goto L269
        L242:
            java.lang.Object r0 = r14.e
            t93 r0 = (defpackage.t93) r0
            sc7 r1 = defpackage.iq5.a
            boolean r4 = r0 instanceof defpackage.oy2
            if (r4 == 0) goto L24d
            goto L25f
        L24d:
            boolean r4 = r0 instanceof defpackage.sg2
            if (r4 == 0) goto L252
            goto L25f
        L252:
            boolean r0 = r0 instanceof defpackage.ao1
            if (r0 == 0) goto L25f
            sc7 r1 = new sc7
            r0 = 150(0x96, float:2.1E-43)
            e41 r4 = defpackage.ir1.c
            r1.<init>(r0, r4, r3)
        L25f:
            bf4 r0 = new bf4
            r3 = 20
            r0.<init>(r14, r1, r7, r3)
            defpackage.hv.L(r12, r7, r7, r0, r2)
        L269:
            r14.e = r13
        L26b:
            jg7 r12 = defpackage.jg7.a
            return r12
        L26e:
            boolean r0 = r14 instanceof defpackage.sd4
            if (r0 == 0) goto L27f
            r0 = r14
            sd4 r0 = (defpackage.sd4) r0
            int r1 = r0.X
            r2 = r1 & r5
            if (r2 == 0) goto L27f
            int r1 = r1 - r5
            r0.X = r1
            goto L284
        L27f:
            sd4 r0 = new sd4
            r0.<init>(r12, r14)
        L284:
            java.lang.Object r14 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            if (r2 == 0) goto L298
            if (r2 != r6) goto L292
            defpackage.oi2.Y(r14)
            goto L2b3
        L292:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L2b5
        L298:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            ne2 r14 = (defpackage.ne2) r14
            jg7 r13 = (defpackage.jg7) r13
            java.lang.Object r12 = r12.L
            ud4 r12 = (defpackage.ud4) r12
            hj6 r12 = r12.b()
            r0.X = r6
            java.lang.Object r12 = r14.a(r12, r0)
            if (r12 != r1) goto L2b3
            r7 = r1
            goto L2b5
        L2b3:
            jg7 r7 = defpackage.jg7.a
        L2b5:
            return r7
        L2b6:
            t93 r13 = (defpackage.t93) r13
            java.lang.Object r14 = r12.L
            vv3 r14 = (defpackage.vv3) r14
            java.lang.Object r12 = r12.B
            ca4 r12 = (defpackage.ca4) r12
            boolean r0 = r13 instanceof defpackage.oy2
            if (r0 != 0) goto L2fd
            boolean r0 = r13 instanceof defpackage.sg2
            if (r0 != 0) goto L2fd
            boolean r0 = r13 instanceof defpackage.l25
            if (r0 == 0) goto L2cd
            goto L2fd
        L2cd:
            boolean r0 = r13 instanceof defpackage.py2
            if (r0 == 0) goto L2d9
            py2 r13 = (defpackage.py2) r13
            oy2 r13 = r13.a
            r12.j(r13)
            goto L300
        L2d9:
            boolean r0 = r13 instanceof defpackage.tg2
            if (r0 == 0) goto L2e5
            tg2 r13 = (defpackage.tg2) r13
            sg2 r13 = r13.a
            r12.j(r13)
            goto L300
        L2e5:
            boolean r0 = r13 instanceof defpackage.m25
            if (r0 == 0) goto L2f1
            m25 r13 = (defpackage.m25) r13
            l25 r13 = r13.a
            r12.j(r13)
            goto L300
        L2f1:
            boolean r0 = r13 instanceof defpackage.k25
            if (r0 == 0) goto L300
            k25 r13 = (defpackage.k25) r13
            l25 r13 = r13.a
            r12.j(r13)
            goto L300
        L2fd:
            r12.a(r13)
        L300:
            java.lang.Object[] r13 = r12.a
            int r12 = r12.b
            r0 = r4
        L305:
            if (r4 >= r12) goto L32b
            r1 = r13[r4]
            t93 r1 = (defpackage.t93) r1
            boolean r2 = r1 instanceof defpackage.oy2
            if (r2 == 0) goto L315
            r14.getClass()
            r0 = r0 | 2
            goto L328
        L315:
            boolean r2 = r1 instanceof defpackage.sg2
            if (r2 == 0) goto L31f
            r14.getClass()
            r0 = r0 | 1
            goto L328
        L31f:
            boolean r1 = r1 instanceof defpackage.l25
            if (r1 == 0) goto L328
            r14.getClass()
            r0 = r0 | 4
        L328:
            int r4 = r4 + 1
            goto L305
        L32b:
            ss4 r12 = r14.b
            r12.i(r0)
            jg7 r12 = defpackage.jg7.a
            return r12
        L333:
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r13 = defpackage.gt0.m1(r13)
            java.lang.Object r14 = r12.B
            wa3 r14 = (defpackage.wa3) r14
            ex6 r14 = r14.g
            java.lang.Object r14 = r14.getValue()
            fk3 r14 = (defpackage.fk3) r14
            r13.add(r4, r14)
            java.lang.Object r12 = r12.L
            qn3 r12 = (defpackage.qn3) r12
            tp6 r12 = r12.c
            r12.getClass()
            r12.m(r7, r13)
            jg7 r12 = defpackage.jg7.a
            return r12
        L357:
            boolean r0 = r14 instanceof defpackage.ta3
            if (r0 == 0) goto L368
            r0 = r14
            ta3 r0 = (defpackage.ta3) r0
            int r1 = r0.X
            r2 = r1 & r5
            if (r2 == 0) goto L368
            int r1 = r1 - r5
            r0.X = r1
            goto L36d
        L368:
            ta3 r0 = new ta3
            r0.<init>(r12, r14)
        L36d:
            java.lang.Object r14 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            if (r2 == 0) goto L381
            if (r2 != r6) goto L37b
            defpackage.oi2.Y(r14)
            goto L3c4
        L37b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L3c6
        L381:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            ne2 r14 = (defpackage.ne2) r14
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
        L38e:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L3b0
            java.lang.Object r2 = r13.next()
            r3 = r2
            fh1 r3 = (defpackage.fh1) r3
            boolean r4 = r3.b
            if (r4 != 0) goto L38e
            java.lang.Object r3 = r3.a
            fk3 r3 = (defpackage.fk3) r3
            java.util.UUID r3 = r3.a
            java.lang.Object r4 = r12.L
            java.util.UUID r4 = (java.util.UUID) r4
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L38e
            goto L3b1
        L3b0:
            r2 = r7
        L3b1:
            fh1 r2 = (defpackage.fh1) r2
            if (r2 == 0) goto L3ba
            java.lang.Object r12 = r2.a
            r7 = r12
            fk3 r7 = (defpackage.fk3) r7
        L3ba:
            r0.X = r6
            java.lang.Object r12 = r14.a(r7, r0)
            if (r12 != r1) goto L3c4
            r7 = r1
            goto L3c6
        L3c4:
            jg7 r7 = defpackage.jg7.a
        L3c6:
            return r7
        L3c7:
            boolean r0 = r14 instanceof defpackage.wf2
            if (r0 == 0) goto L3d8
            r0 = r14
            wf2 r0 = (defpackage.wf2) r0
            int r1 = r0.X
            r2 = r1 & r5
            if (r2 == 0) goto L3d8
            int r1 = r1 - r5
            r0.X = r1
            goto L3dd
        L3d8:
            wf2 r0 = new wf2
            r0.<init>(r12, r14)
        L3dd:
            java.lang.Object r14 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            if (r2 == 0) goto L3fb
            if (r2 == r6) goto L3f3
            if (r2 != r3) goto L3ed
            defpackage.oi2.Y(r14)
            goto L422
        L3ed:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L424
        L3f3:
            ne2 r12 = r0.d0
            java.lang.Object r13 = r0.Z
            defpackage.oi2.Y(r14)
            goto L414
        L3fb:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            ne2 r14 = (defpackage.ne2) r14
            java.lang.Object r12 = r12.L
            eo2 r12 = (defpackage.eo2) r12
            r0.Z = r13
            r0.d0 = r14
            r0.X = r6
            java.lang.Object r12 = r12.o(r13, r0)
            if (r12 != r1) goto L413
            goto L420
        L413:
            r12 = r14
        L414:
            r0.Z = r7
            r0.d0 = r7
            r0.X = r3
            java.lang.Object r12 = r12.a(r13, r0)
            if (r12 != r1) goto L422
        L420:
            r7 = r1
            goto L424
        L422:
            jg7 r7 = defpackage.jg7.a
        L424:
            return r7
        L425:
            boolean r0 = r14 instanceof defpackage.qf2
            if (r0 == 0) goto L436
            r0 = r14
            qf2 r0 = (defpackage.qf2) r0
            int r1 = r0.Y
            r2 = r1 & r5
            if (r2 == 0) goto L436
            int r1 = r1 - r5
            r0.Y = r1
            goto L43b
        L436:
            qf2 r0 = new qf2
            r0.<init>(r12, r14)
        L43b:
            java.lang.Object r14 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L453
            if (r2 != r6) goto L44d
            java.lang.Object r13 = r0.d0
            zb0 r12 = r0.R
            defpackage.oi2.Y(r14)
            goto L468
        L44d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L472
        L453:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            eo2 r14 = (defpackage.eo2) r14
            r0.R = r12
            r0.d0 = r13
            r0.Y = r6
            java.lang.Object r14 = r14.o(r13, r0)
            if (r14 != r1) goto L468
            r7 = r1
            goto L472
        L468:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L473
            jg7 r7 = defpackage.jg7.a
        L472:
            return r7
        L473:
            java.lang.Object r14 = r12.L
            dh5 r14 = (defpackage.dh5) r14
            r14.A = r13
            o r13 = new o
            r13.<init>(r12)
            throw r13
        L47f:
            boolean r0 = r14 instanceof defpackage.nf2
            if (r0 == 0) goto L490
            r0 = r14
            nf2 r0 = (defpackage.nf2) r0
            int r1 = r0.Y
            r2 = r1 & r5
            if (r2 == 0) goto L490
            int r1 = r1 - r5
            r0.Y = r1
            goto L495
        L490:
            nf2 r0 = new nf2
            r0.<init>(r12, r14)
        L495:
            java.lang.Object r14 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            if (r2 == 0) goto L4b5
            if (r2 == r6) goto L4ad
            if (r2 != r3) goto L4a7
            zb0 r12 = r0.R
            defpackage.oi2.Y(r14)
            goto L4e3
        L4a7:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L4e8
        L4ad:
            java.lang.Object r13 = r0.d0
            zb0 r12 = r0.R
            defpackage.oi2.Y(r14)
            goto L4c9
        L4b5:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            m8 r14 = (defpackage.m8) r14
            r0.R = r12
            r0.d0 = r13
            r0.Y = r6
            java.lang.Object r14 = r14.o(r13, r0)
            if (r14 != r1) goto L4c9
            goto L4e1
        L4c9:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L4e4
            java.lang.Object r14 = r12.L
            ne2 r14 = (defpackage.ne2) r14
            r0.R = r12
            r0.d0 = r7
            r0.Y = r3
            java.lang.Object r13 = r14.a(r13, r0)
            if (r13 != r1) goto L4e3
        L4e1:
            r7 = r1
            goto L4e8
        L4e3:
            r4 = r6
        L4e4:
            if (r4 == 0) goto L4e9
            jg7 r7 = defpackage.jg7.a
        L4e8:
            return r7
        L4e9:
            o r13 = new o
            r13.<init>(r12)
            throw r13
        L4ef:
            jg7 r0 = defpackage.jg7.a
            boolean r1 = r14 instanceof defpackage.hf2
            if (r1 == 0) goto L502
            r1 = r14
            hf2 r1 = (defpackage.hf2) r1
            int r2 = r1.Y
            r3 = r2 & r5
            if (r3 == 0) goto L502
            int r2 = r2 - r5
            r1.Y = r2
            goto L507
        L502:
            hf2 r1 = new hf2
            r1.<init>(r12, r14)
        L507:
            java.lang.Object r14 = r1.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L51c
            if (r3 != r6) goto L516
            defpackage.oi2.Y(r14)
        L514:
            r7 = r0
            goto L539
        L516:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L539
        L51c:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            bh5 r14 = (defpackage.bh5) r14
            int r3 = r14.A
            if (r3 < r6) goto L535
            java.lang.Object r12 = r12.L
            ne2 r12 = (defpackage.ne2) r12
            r1.Y = r6
            java.lang.Object r12 = r12.a(r13, r1)
            if (r12 != r2) goto L514
            r7 = r2
            goto L539
        L535:
            int r3 = r3 + r6
            r14.A = r3
            goto L514
        L539:
            return r7
        L53a:
            boolean r0 = r14 instanceof defpackage.ff2
            if (r0 == 0) goto L54b
            r0 = r14
            ff2 r0 = (defpackage.ff2) r0
            int r1 = r0.Z
            r2 = r1 & r5
            if (r2 == 0) goto L54b
            int r1 = r1 - r5
            r0.Z = r1
            goto L550
        L54b:
            ff2 r0 = new ff2
            r0.<init>(r12, r14)
        L550:
            java.lang.Object r14 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            if (r2 == 0) goto L568
            if (r2 != r6) goto L562
            zb0 r12 = r0.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L560
            goto L57b
        L560:
            r13 = move-exception
            goto L57e
        L562:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L57d
        L568:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B     // Catch: java.lang.Throwable -> L560
            ne2 r14 = (defpackage.ne2) r14     // Catch: java.lang.Throwable -> L560
            r0.R = r12     // Catch: java.lang.Throwable -> L560
            r0.Z = r6     // Catch: java.lang.Throwable -> L560
            java.lang.Object r12 = r14.a(r13, r0)     // Catch: java.lang.Throwable -> L560
            if (r12 != r1) goto L57b
            r7 = r1
            goto L57d
        L57b:
            jg7 r7 = defpackage.jg7.a
        L57d:
            return r7
        L57e:
            java.lang.Object r12 = r12.L
            dh5 r12 = (defpackage.dh5) r12
            r12.A = r13
            throw r13
        L585:
            pq5 r13 = (defpackage.pq5) r13
            java.lang.Object r14 = r12.B
            zg5 r14 = (defpackage.zg5) r14
            r14.A = r6
            java.lang.Object r12 = r12.L
            xb2 r12 = (defpackage.xb2) r12
            defpackage.xb2.a(r12, r13)
            jg7 r12 = defpackage.jg7.a
            return r12
        L597:
            yt1 r14 = defpackage.yt1.A
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r12.B
            bt r0 = (defpackage.bt) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L5a8:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L60e
            java.lang.Object r2 = r13.next()
            android.view.InputDevice r2 = (android.view.InputDevice) r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r3 < r5) goto L5f8
            android.os.VibratorManager r2 = defpackage.sd0.i(r2)
            r2.getClass()
            int[] r3 = defpackage.sd0.z(r2)
            r3.getClass()
            int r5 = r3.length
            if (r5 != 0) goto L5e0
            android.os.Vibrator r2 = defpackage.sd0.g(r2)
            boolean r3 = r2.hasVibrator()
            if (r3 == 0) goto L5d6
            goto L5d7
        L5d6:
            r2 = r7
        L5d7:
            if (r2 == 0) goto L5de
            java.util.List r2 = defpackage.hf.b0(r2)
            goto L60a
        L5de:
            r2 = r14
            goto L60a
        L5e0:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r8 = r3.length
            r5.<init>(r8)
            int r8 = r3.length
            r9 = r4
        L5e8:
            if (r9 >= r8) goto L5f6
            r10 = r3[r9]
            android.os.Vibrator r10 = defpackage.sd0.h(r2, r10)
            r5.add(r10)
            int r9 = r9 + 1
            goto L5e8
        L5f6:
            r2 = r5
            goto L60a
        L5f8:
            android.os.Vibrator r2 = r2.getVibrator()
            boolean r3 = r2.hasVibrator()
            if (r3 == 0) goto L603
            goto L604
        L603:
            r2 = r7
        L604:
            if (r2 == 0) goto L5de
            java.util.List r2 = defpackage.hf.b0(r2)
        L60a:
            defpackage.gt0.A0(r1, r2)
            goto L5a8
        L60e:
            java.lang.Object r13 = r0.R
            op r13 = (defpackage.op) r13
            if (r13 == 0) goto L617
            r13.b()
        L617:
            boolean r13 = r1.isEmpty()
            r14 = 26
            if (r13 == 0) goto L636
            java.lang.Object r12 = r12.L
            android.os.Vibrator r12 = (android.os.Vibrator) r12
            if (r12 == 0) goto L668
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r14) goto L630
            op r13 = new op
            r13.<init>(r12, r4)
        L62e:
            r7 = r13
            goto L668
        L630:
            op r13 = new op
            r13.<init>(r12, r6)
            goto L62e
        L636:
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = defpackage.ht0.v0(r1, r13)
            r12.<init>(r13)
            int r13 = r1.size()
            r2 = r4
        L646:
            if (r2 >= r13) goto L663
            java.lang.Object r3 = r1.get(r2)
            int r2 = r2 + 1
            android.os.Vibrator r3 = (android.os.Vibrator) r3
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r14) goto L65a
            op r5 = new op
            r5.<init>(r3, r4)
            goto L65f
        L65a:
            op r5 = new op
            r5.<init>(r3, r6)
        L65f:
            r12.add(r5)
            goto L646
        L663:
            op r7 = new op
            r7.<init>(r12)
        L668:
            r0.R = r7
            jg7 r12 = defpackage.jg7.a
            return r12
        L66d:
            java.lang.Object r0 = r12.L
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r2 = r14 instanceof defpackage.vp0
            if (r2 == 0) goto L682
            r2 = r14
            vp0 r2 = (defpackage.vp0) r2
            int r3 = r2.X
            r8 = r3 & r5
            if (r8 == 0) goto L682
            int r3 = r3 - r5
            r2.X = r3
            goto L687
        L682:
            vp0 r2 = new vp0
            r2.<init>(r12, r14)
        L687:
            java.lang.Object r14 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r2.X
            if (r5 == 0) goto L69c
            if (r5 != r6) goto L696
            defpackage.oi2.Y(r14)
            goto L700
        L696:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L702
        L69c:
            defpackage.oi2.Y(r14)
            java.lang.Object r12 = r12.B
            ne2 r12 = (defpackage.ne2) r12
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
        L6a9:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L6ed
            java.lang.Object r14 = r13.next()
            me.magnum.melonds.domain.model.Cheat r14 = (me.magnum.melonds.domain.model.Cheat) r14
            int r5 = r0.size()
            r7 = r4
            r8 = r7
        L6bb:
            if (r8 >= r5) goto L6d9
            java.lang.Object r9 = r0.get(r8)
            int r8 = r8 + 1
            co0 r9 = (defpackage.co0) r9
            me.magnum.melonds.domain.model.Cheat r9 = r9.a
            java.lang.Long r9 = r9.getId()
            java.lang.Long r10 = r14.getId()
            boolean r9 = defpackage.nb3.k(r9, r10)
            if (r9 == 0) goto L6d6
            goto L6da
        L6d6:
            int r7 = r7 + 1
            goto L6bb
        L6d9:
            r7 = r1
        L6da:
            if (r7 < 0) goto L6a9
            co0 r5 = new co0
            java.lang.Object r8 = r0.get(r7)
            co0 r8 = (defpackage.co0) r8
            java.lang.String r8 = r8.b
            r5.<init>(r14, r8)
            r0.set(r7, r5)
            goto L6a9
        L6ed:
            qp0 r13 = new qp0
            java.util.List r14 = defpackage.gt0.k1(r0)
            r13.<init>(r14)
            r2.X = r6
            java.lang.Object r12 = r12.a(r13, r2)
            if (r12 != r3) goto L700
            r7 = r3
            goto L702
        L700:
            jg7 r7 = defpackage.jg7.a
        L702:
            return r7
        L703:
            boolean r0 = r14 instanceof defpackage.tp0
            if (r0 == 0) goto L714
            r0 = r14
            tp0 r0 = (defpackage.tp0) r0
            int r2 = r0.X
            r3 = r2 & r5
            if (r3 == 0) goto L714
            int r2 = r2 - r5
            r0.X = r2
            goto L719
        L714:
            tp0 r0 = new tp0
            r0.<init>(r12, r14)
        L719:
            java.lang.Object r14 = r0.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.X
            if (r3 == 0) goto L72d
            if (r3 != r6) goto L727
            defpackage.oi2.Y(r14)
            goto L786
        L727:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L788
        L72d:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r12.B
            ne2 r14 = (defpackage.ne2) r14
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r12 = r12.L
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r12 = defpackage.gt0.m1(r12)
            java.util.Iterator r13 = r13.iterator()
        L742:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L777
            java.lang.Object r3 = r13.next()
            me.magnum.melonds.domain.model.Cheat r3 = (me.magnum.melonds.domain.model.Cheat) r3
            int r5 = r12.size()
            r7 = r4
            r8 = r7
        L754:
            if (r8 >= r5) goto L770
            java.lang.Object r9 = r12.get(r8)
            int r8 = r8 + 1
            me.magnum.melonds.domain.model.Cheat r9 = (me.magnum.melonds.domain.model.Cheat) r9
            java.lang.Long r9 = r9.getId()
            java.lang.Long r10 = r3.getId()
            boolean r9 = defpackage.nb3.k(r9, r10)
            if (r9 == 0) goto L76d
            goto L771
        L76d:
            int r7 = r7 + 1
            goto L754
        L770:
            r7 = r1
        L771:
            if (r7 < 0) goto L742
            r12.set(r7, r3)
            goto L742
        L777:
            qp0 r13 = new qp0
            r13.<init>(r12)
            r0.X = r6
            java.lang.Object r12 = r14.a(r13, r0)
            if (r12 != r2) goto L786
            r7 = r2
            goto L788
        L786:
            jg7 r7 = defpackage.jg7.a
        L788:
            return r7
        L789:
            oh0 r13 = (defpackage.oh0) r13
            boolean r14 = r13 instanceof defpackage.vh0
            if (r14 == 0) goto L7bb
            java.lang.Object r12 = r12.B
            dh5 r12 = (defpackage.dh5) r12
            java.lang.Object r12 = r12.A
            yk0 r12 = (defpackage.yk0) r12
            vh0 r13 = (defpackage.vh0) r13
            bf0 r13 = r13.a
            java.lang.Object r14 = r12.k
            monitor-enter(r14)
            uk0 r0 = r12.u     // Catch: java.lang.Throwable -> L7b8
            uk0 r1 = defpackage.uk0.CLOSING     // Catch: java.lang.Throwable -> L7b8
            if (r0 == r1) goto L7b5
            uk0 r1 = defpackage.uk0.CLOSED     // Catch: java.lang.Throwable -> L7b8
            if (r0 != r1) goto L7a9
            goto L7b5
        L7a9:
            r12.q = r13     // Catch: java.lang.Throwable -> L7b8
            w61 r13 = r12.i     // Catch: java.lang.Throwable -> L7b8
            vk0 r0 = new vk0     // Catch: java.lang.Throwable -> L7b8
            r0.<init>(r12, r7, r4)     // Catch: java.lang.Throwable -> L7b8
            defpackage.hv.L(r13, r7, r7, r0, r2)     // Catch: java.lang.Throwable -> L7b8
        L7b5:
            monitor-exit(r14)
            goto L84f
        L7b8:
            r12 = move-exception
            monitor-exit(r14)
            throw r12
        L7bb:
            boolean r14 = r13 instanceof defpackage.uh0
            if (r14 == 0) goto L7cc
            java.lang.Object r12 = r12.B
            dh5 r12 = (defpackage.dh5) r12
            java.lang.Object r12 = r12.A
            yk0 r12 = (defpackage.yk0) r12
            r12.o()
            goto L84f
        L7cc:
            boolean r14 = r13 instanceof defpackage.th0
            if (r14 == 0) goto L84f
            java.lang.Object r14 = r12.B
            dh5 r14 = (defpackage.dh5) r14
            java.lang.Object r14 = r14.A
            yk0 r14 = (defpackage.yk0) r14
            r14.o()
            java.lang.Object r12 = r12.L
            kc0 r12 = (defpackage.kc0) r12
            th0 r13 = (defpackage.th0) r13
            java.lang.Object r14 = r12.q
            monitor-enter(r14)
            boolean r0 = r12.e()     // Catch: java.lang.Throwable -> L818
            if (r0 == 0) goto L7ec
        L7ea:
            monitor-exit(r14)
            goto L84f
        L7ec:
            df0 r0 = r13.i     // Catch: java.lang.Throwable -> L818
            if (r0 == 0) goto L840
            r12.u = r0     // Catch: java.lang.Throwable -> L818
            int r0 = r0.a     // Catch: java.lang.Throwable -> L818
            r1 = 6
            if (r0 != r1) goto L7f8
            goto L7fd
        L7f8:
            if (r0 != r6) goto L7fb
            goto L7fd
        L7fb:
            if (r0 != r3) goto L81a
        L7fd:
            xe0 r13 = defpackage.xe0.w     // Catch: java.lang.Throwable -> L818
            r12.s = r13     // Catch: java.lang.Throwable -> L818
            java.lang.String r13 = "CXCP"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L818
            r0.<init>()     // Catch: java.lang.Throwable -> L818
            r0.append(r12)     // Catch: java.lang.Throwable -> L818
            java.lang.String r1 = " is disconnected"
            r0.append(r1)     // Catch: java.lang.Throwable -> L818
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L818
            android.util.Log.d(r13, r0)     // Catch: java.lang.Throwable -> L818
            goto L844
        L818:
            r12 = move-exception
            goto L84d
        L81a:
            xe0 r0 = defpackage.xe0.x     // Catch: java.lang.Throwable -> L818
            r12.s = r0     // Catch: java.lang.Throwable -> L818
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L818
            r1.<init>()     // Catch: java.lang.Throwable -> L818
            r1.append(r12)     // Catch: java.lang.Throwable -> L818
            java.lang.String r2 = " encountered error: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L818
            df0 r13 = r13.i     // Catch: java.lang.Throwable -> L818
            int r13 = r13.a     // Catch: java.lang.Throwable -> L818
            java.lang.String r13 = defpackage.df0.a(r13)     // Catch: java.lang.Throwable -> L818
            r1.append(r13)     // Catch: java.lang.Throwable -> L818
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L818
            android.util.Log.d(r0, r13)     // Catch: java.lang.Throwable -> L818
            goto L844
        L840:
            xe0 r13 = defpackage.xe0.z     // Catch: java.lang.Throwable -> L818
            r12.s = r13     // Catch: java.lang.Throwable -> L818
        L844:
            rv6 r13 = r12.f     // Catch: java.lang.Throwable -> L818
            r13.k()     // Catch: java.lang.Throwable -> L818
            r12.g()     // Catch: java.lang.Throwable -> L818
            goto L7ea
        L84d:
            monitor-exit(r14)
            throw r12
        L84f:
            jg7 r12 = defpackage.jg7.a
            return r12
        L852:
            xf0 r13 = (defpackage.xf0) r13
            java.lang.String r13 = r13.a
            jg7 r14 = defpackage.jg7.a
            java.lang.Object r0 = r12.B
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = defpackage.nb3.k(r13, r0)
            if (r0 == 0) goto L899
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = defpackage.xf0.b(r13)
            r1.append(r13)
            java.lang.String r13 = " has become available! Notifying listeners..."
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            android.util.Log.d(r0, r13)
            java.lang.Object r12 = r12.L
            cc0 r12 = (defpackage.cc0) r12
            java.util.concurrent.CopyOnWriteArrayList r12 = r12.B
            java.util.Iterator r12 = r12.iterator()
            r12.getClass()
        L889:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L899
            java.lang.Object r13 = r12.next()
            tu0 r13 = (defpackage.tu0) r13
            r13.b0(r14)
            goto L889
        L899:
            return r14
    }

    public java.lang.Object b(int r6, defpackage.r41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kp6
            if (r0 == 0) goto L13
            r0 = r7
            kp6 r0 = (defpackage.kp6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kp6 r0 = new kp6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            jg7 r3 = defpackage.jg7.a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            defpackage.oi2.Y(r7)
            return r3
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L30:
            defpackage.oi2.Y(r7)
            if (r6 <= 0) goto L4e
            java.lang.Object r6 = r5.B
            zg5 r6 = (defpackage.zg5) r6
            boolean r7 = r6.A
            if (r7 != 0) goto L4e
            r6.A = r4
            java.lang.Object r5 = r5.L
            ne2 r5 = (defpackage.ne2) r5
            ch6 r6 = defpackage.ch6.START
            r0.Y = r4
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r3
    }
}
