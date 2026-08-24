package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h4 extends defpackage.po2 implements defpackage.eo2 {
    public final /* synthetic */ int d0;

    public /* synthetic */ h4(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.d0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r20, java.lang.Object r21) {
            r19 = this;
            r0 = r19
            int r1 = r0.d0
            r2 = 3
            r3 = 21
            r4 = 1
            r5 = 0
            jg7 r6 = defpackage.jg7.a
            r7 = 0
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L3d2;
                case 1: goto L36a;
                case 2: goto L346;
                case 3: goto L323;
                case 4: goto L27e;
                case 5: goto La1;
                case 6: goto L74;
                case 7: goto L2f;
                case 8: goto L20;
                default: goto L11;
            }
        L11:
            r1 = r20
            qn2 r1 = (defpackage.qn2) r1
            r2 = r21
            r41 r2 = (defpackage.r41) r2
            m16 r0 = (defpackage.m16) r0
            java.lang.Object r0 = defpackage.qo2.p(r2, r1, r0)
            return r0
        L20:
            r1 = r20
            qn2 r1 = (defpackage.qn2) r1
            r2 = r21
            r41 r2 = (defpackage.r41) r2
            m16 r0 = (defpackage.m16) r0
            java.lang.Object r0 = defpackage.qo2.p(r2, r1, r0)
            return r0
        L2f:
            r1 = r20
            wb6 r1 = (defpackage.wb6) r1
            r2 = r21
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1.getClass()
            a55 r0 = (defpackage.a55) r0
            r0.getClass()
            boolean r3 = r1.k(r2)
            if (r3 != 0) goto L6e
            wb6 r1 = r1.j(r2)
            np2 r2 = r1.e()
            bt6 r3 = defpackage.bt6.g
            boolean r3 = defpackage.nb3.k(r2, r3)
            if (r3 != 0) goto L6b
            bt6 r3 = defpackage.bt6.f
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L62
            goto L6b
        L62:
            boolean r1 = r1.c()
            if (r1 == 0) goto L6e
            r0.e0 = r4
            goto L6f
        L6b:
            r0.e0 = r5
            goto L6f
        L6e:
            r4 = r5
        L6f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L74:
            r1 = r20
            wb6 r1 = (defpackage.wb6) r1
            r2 = r21
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1.getClass()
            ge3 r0 = (defpackage.ge3) r0
            r0.getClass()
            boolean r3 = r1.k(r2)
            if (r3 != 0) goto L99
            wb6 r1 = r1.j(r2)
            boolean r1 = r1.c()
            if (r1 == 0) goto L99
            goto L9a
        L99:
            r4 = r5
        L9a:
            r0.b = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        La1:
            r1 = r20
            java.util.List r1 = (java.util.List) r1
            r2 = r21
            r41 r2 = (defpackage.r41) r2
            ft2 r0 = (defpackage.ft2) r0
            r0.getClass()
            ts2 r3 = defpackage.ts2.c
            ts2 r8 = defpackage.ts2.b
            ts2 r9 = defpackage.ts2.a
            ts2 r10 = defpackage.ts2.d
            int r11 = r1.size()
            if (r11 != r4) goto Lbf
            r11 = r5
            goto L16e
        Lbf:
            int r11 = r1.size()
            r12 = -1
            int r11 = r11 + r12
            if (r11 < 0) goto Lf7
            r13 = r12
        Lc8:
            int r14 = r11 + (-1)
            java.lang.Object r15 = r1.get(r11)
            at2 r15 = (defpackage.at2) r15
            boolean r16 = defpackage.nb3.k(r15, r9)
            if (r16 != 0) goto L16e
            boolean r16 = defpackage.nb3.k(r15, r8)
            if (r16 != 0) goto L16e
            boolean r16 = defpackage.nb3.k(r15, r10)
            if (r16 != 0) goto L16e
            boolean r16 = defpackage.nb3.k(r15, r3)
            if (r16 == 0) goto Lea
            goto L16e
        Lea:
            boolean r15 = r15 instanceof defpackage.ys2
            if (r15 == 0) goto Lf1
            if (r13 >= 0) goto Lf1
            r13 = r11
        Lf1:
            if (r14 >= 0) goto Lf5
            r11 = r13
            goto Lf8
        Lf5:
            r11 = r14
            goto Lc8
        Lf7:
            r11 = r12
        Lf8:
            if (r11 < 0) goto Lfc
            goto L16e
        Lfc:
            int r11 = r1.size()
            r15 = r5
            r13 = r12
            r14 = r13
        L103:
            if (r15 >= r11) goto L123
            java.lang.Object r16 = r1.get(r15)
            r12 = r16
            at2 r12 = (defpackage.at2) r12
            boolean r5 = r12 instanceof defpackage.ws2
            if (r5 == 0) goto L113
            r13 = r15
            goto L11e
        L113:
            boolean r5 = r12 instanceof defpackage.vs2
            if (r5 == 0) goto L119
            r14 = r15
            goto L11e
        L119:
            boolean r5 = r12 instanceof defpackage.xs2
            if (r5 != 0) goto L11e
            goto L123
        L11e:
            int r15 = r15 + 1
            r5 = 0
            r12 = -1
            goto L103
        L123:
            if (r13 < 0) goto L127
            r11 = r13
            goto L16e
        L127:
            if (r14 < 0) goto L12b
            r11 = r14
            goto L16e
        L12b:
            kk5 r5 = r0.j0
            if (r5 == 0) goto L150
            sw r5 = r0.i0
            boolean r5 = r5.b()
            if (r5 == 0) goto L150
            int r5 = r1.size()
            r11 = 0
        L13c:
            if (r11 >= r5) goto L150
            java.lang.Object r12 = r1.get(r11)
            at2 r12 = (defpackage.at2) r12
            boolean r13 = r12 instanceof defpackage.us2
            if (r13 != 0) goto L16e
            boolean r12 = r12 instanceof defpackage.zs2
            if (r12 == 0) goto L14d
            goto L16e
        L14d:
            int r11 = r11 + 1
            goto L13c
        L150:
            int r5 = r1.size()
            r11 = -1
            r12 = 0
        L156:
            if (r12 >= r5) goto L16a
            java.lang.Object r13 = r1.get(r12)
            at2 r13 = (defpackage.at2) r13
            boolean r13 = r13 instanceof defpackage.xs2
            if (r13 == 0) goto L16a
            int r11 = r12 + 1
            r18 = r12
            r12 = r11
            r11 = r18
            goto L156
        L16a:
            if (r11 < 0) goto L16d
            goto L16e
        L16d:
            r11 = 0
        L16e:
            java.lang.Object r5 = r1.get(r11)
            at2 r5 = (defpackage.at2) r5
            boolean r8 = defpackage.nb3.k(r5, r8)
            if (r8 == 0) goto L17f
            r1.remove(r11)
            goto L27c
        L17f:
            boolean r3 = defpackage.nb3.k(r5, r3)
            if (r3 == 0) goto L190
            java.lang.Object r0 = r0.v(r1, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L27c
        L18d:
            r6 = r0
            goto L27c
        L190:
            boolean r3 = defpackage.nb3.k(r5, r9)
            if (r3 == 0) goto L1d1
            dk0 r2 = r0.o0
            if (r2 == 0) goto L19d
            r2.a()
        L19d:
            r0.j0 = r7
            r1.remove(r11)
            r5 = 0
        L1a3:
            if (r5 >= r11) goto L27c
            java.lang.Object r2 = r1.get(r5)
            at2 r2 = (defpackage.at2) r2
            boolean r3 = defpackage.nb3.k(r2, r10)
            if (r3 != 0) goto L1cb
            boolean r3 = defpackage.nb3.k(r2, r9)
            if (r3 != 0) goto L1cb
            boolean r3 = r2 instanceof defpackage.xs2
            if (r3 != 0) goto L1cb
            boolean r3 = r2 instanceof defpackage.zs2
            if (r3 == 0) goto L1c0
            goto L1cb
        L1c0:
            boolean r2 = r2 instanceof defpackage.us2
            if (r2 == 0) goto L1c8
            r0.e(r7)
            goto L1cb
        L1c8:
            int r5 = r5 + 1
            goto L1a3
        L1cb:
            r1.remove(r5)
            int r11 = r11 + (-1)
            goto L1a3
        L1d1:
            boolean r3 = defpackage.nb3.k(r5, r10)
            if (r3 == 0) goto L200
            dk0 r2 = r0.o0
            if (r2 == 0) goto L1de
            r2.x()
        L1de:
            r0.j0 = r7
            r1.remove(r11)
            r5 = 0
        L1e4:
            if (r5 >= r11) goto L27c
            java.lang.Object r0 = r1.get(r5)
            at2 r0 = (defpackage.at2) r0
            boolean r2 = defpackage.nb3.k(r0, r10)
            if (r2 != 0) goto L1fa
            boolean r0 = r0 instanceof defpackage.xs2
            if (r0 == 0) goto L1f7
            goto L1fa
        L1f7:
            int r5 = r5 + 1
            goto L1e4
        L1fa:
            r1.remove(r5)
            int r11 = r11 + (-1)
            goto L1e4
        L200:
            boolean r3 = r5 instanceof defpackage.ys2
            if (r3 == 0) goto L210
            ys2 r5 = (defpackage.ys2) r5
            java.lang.Object r0 = r0.u(r1, r11, r5, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L27c
            goto L18d
        L210:
            boolean r2 = r5 instanceof defpackage.us2
            if (r2 == 0) goto L21a
            us2 r5 = (defpackage.us2) r5
            r0.n(r1, r11, r5, r4)
            goto L27c
        L21a:
            boolean r2 = r5 instanceof defpackage.zs2
            if (r2 == 0) goto L224
            zs2 r5 = (defpackage.zs2) r5
            r0.x(r1, r11, r5)
            goto L27c
        L224:
            boolean r2 = r5 instanceof defpackage.ws2
            if (r2 == 0) goto L26c
            ws2 r5 = (defpackage.ws2) r5
            java.util.Map r2 = r0.L
            java.util.Map r3 = r5.a
            r0.k0 = r3
            java.util.Map r3 = r5.b
            r0.l0 = r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L23b
            goto L24d
        L23b:
            p04 r4 = new p04
            r4.<init>()
            r4.putAll(r3)
            r2.getClass()
            r4.putAll(r2)
            p04 r2 = r4.b()
        L24d:
            r0.m0 = r2
            r1.remove(r11)
            r5 = 0
        L253:
            if (r5 >= r11) goto L268
            java.lang.Object r2 = r1.get(r5)
            at2 r2 = (defpackage.at2) r2
            boolean r2 = r2 instanceof defpackage.ws2
            if (r2 == 0) goto L265
            r1.remove(r5)
            int r11 = r11 + (-1)
            goto L253
        L265:
            int r5 = r5 + 1
            goto L253
        L268:
            r0.A()
            goto L27c
        L26c:
            boolean r2 = r5 instanceof defpackage.vs2
            if (r2 != 0) goto L27d
            boolean r2 = r5 instanceof defpackage.xs2
            if (r2 == 0) goto L278
            r0.r(r11, r1, r4)
            goto L27c
        L278:
            defpackage.i.d()
            r6 = r7
        L27c:
            return r6
        L27d:
            throw r7
        L27e:
            r1 = r20
            sh2 r1 = (defpackage.sh2) r1
            r4 = r21
            sh2 r4 = (defpackage.sh2) r4
            di2 r0 = (defpackage.di2) r0
            boolean r5 = r0.j0
            if (r5 != 0) goto L28e
            goto L322
        L28e:
            boolean r4 = r4.isFocused()
            boolean r1 = r1.isFocused()
            if (r4 != r1) goto L29a
            goto L322
        L29a:
            qn2 r1 = r0.n0
            if (r1 == 0) goto L2a5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r1.g(r5)
        L2a5:
            jd1 r1 = defpackage.ei2.k0
            if (r4 == 0) goto L2e4
            w61 r5 = r0.F0()
            a6 r8 = new a6
            r8.<init>(r0, r7, r3)
            defpackage.hv.L(r5, r7, r7, r8, r2)
            dh5 r2 = new dh5
            r2.<init>()
            ci2 r3 = new ci2
            r5 = 0
            r3.<init>(r5, r2, r0)
            defpackage.jx2.B(r0, r3)
            java.lang.Object r2 = r2.A
            lq3 r2 = (defpackage.lq3) r2
            if (r2 == 0) goto L2cd
            r2.a()
            goto L2ce
        L2cd:
            r2 = r7
        L2ce:
            r0.p0 = r2
            eg4 r2 = r0.q0
            if (r2 == 0) goto L2f4
            z64 r2 = r2.Y0()
            boolean r2 = r2.j0
            if (r2 == 0) goto L2f4
            boolean r2 = r0.j0
            if (r2 == 0) goto L2f4
            defpackage.ii2.t(r0, r1)
            goto L2f4
        L2e4:
            lq3 r2 = r0.p0
            if (r2 == 0) goto L2eb
            r2.b()
        L2eb:
            r0.p0 = r7
            boolean r2 = r0.j0
            if (r2 == 0) goto L2f4
            defpackage.ii2.t(r0, r1)
        L2f4:
            defpackage.bl2.G(r0)
            r94 r1 = r0.m0
            if (r1 == 0) goto L322
            sg2 r2 = r0.o0
            if (r4 == 0) goto L316
            if (r2 == 0) goto L30b
            tg2 r3 = new tg2
            r3.<init>(r2)
            r0.U0(r1, r3)
            r0.o0 = r7
        L30b:
            sg2 r2 = new sg2
            r2.<init>()
            r0.U0(r1, r2)
            r0.o0 = r2
            goto L322
        L316:
            if (r2 == 0) goto L322
            tg2 r3 = new tg2
            r3.<init>(r2)
            r0.U0(r1, r3)
            r0.o0 = r7
        L322:
            return r6
        L323:
            r1 = r20
            me.magnum.melonds.domain.model.DSiWareTitle r1 = (me.magnum.melonds.domain.model.DSiWareTitle) r1
            r2 = r21
            bb1 r2 = (defpackage.bb1) r2
            r1.getClass()
            r2.getClass()
            cb1 r0 = (defpackage.cb1) r0
            r0.getClass()
            ab1 r3 = r0.a
            r3.a = r1
            r3.b = r2
            j04 r0 = r0.b
            java.lang.String r1 = r2.getFileName()
            r0.a(r1)
            return r6
        L346:
            r1 = r20
            me.magnum.melonds.domain.model.DSiWareTitle r1 = (me.magnum.melonds.domain.model.DSiWareTitle) r1
            r2 = r21
            bb1 r2 = (defpackage.bb1) r2
            r1.getClass()
            r2.getClass()
            za1 r0 = (defpackage.za1) r0
            r0.getClass()
            ab1 r3 = r0.a
            r3.a = r1
            r3.b = r2
            j04 r0 = r0.b
            vr4 r1 = new vr4
            r1.<init>(r7, r7)
            r0.a(r1)
            return r6
        L36a:
            r8 = r20
            me.magnum.melonds.domain.model.Cheat r8 = (me.magnum.melonds.domain.model.Cheat) r8
            r1 = r21
            jo0 r1 = (defpackage.jo0) r1
            r8.getClass()
            r1.getClass()
            java.lang.String r14 = r1.c
            aq0 r0 = (defpackage.aq0) r0
            r0.getClass()
            java.lang.String r4 = r1.b
            java.lang.String r5 = r1.a
            boolean r9 = defpackage.qs6.v0(r5)
            if (r9 != 0) goto L3d1
            boolean r9 = defpackage.qs6.v0(r14)
            if (r9 != 0) goto L3d1
            java.lang.String r9 = r8.getName()
            boolean r5 = defpackage.nb3.k(r9, r5)
            if (r5 == 0) goto L3ae
            java.lang.String r5 = r8.getDescription()
            boolean r5 = defpackage.nb3.k(r5, r4)
            if (r5 == 0) goto L3ae
            java.lang.String r5 = r8.getCode()
            boolean r5 = defpackage.nb3.k(r5, r14)
            if (r5 == 0) goto L3ae
            goto L3d1
        L3ae:
            java.lang.String r12 = r1.a
            boolean r1 = defpackage.qs6.v0(r4)
            if (r1 != 0) goto L3b8
            r13 = r4
            goto L3b9
        L3b8:
            r13 = r7
        L3b9:
            r16 = 35
            r17 = 0
            r9 = 0
            r10 = 0
            r15 = 0
            me.magnum.melonds.domain.model.Cheat r1 = me.magnum.melonds.domain.model.Cheat.copy$default(r8, r9, r10, r12, r13, r14, r15, r16, r17)
            as0 r4 = defpackage.to7.a(r0)
            z r5 = new z
            r5.<init>(r0, r1, r7, r3)
            defpackage.hv.L(r4, r7, r7, r5, r2)
        L3d1:
            return r6
        L3d2:
            r1 = r20
            ta5 r1 = (defpackage.ta5) r1
            r2 = r21
            r41 r2 = (defpackage.r41) r2
            nx1 r0 = (defpackage.nx1) r0
            java.lang.Object r0 = r0.f(r1, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L3e5
            goto L3eb
        L3e5:
            hm5 r1 = new hm5
            r1.<init>(r0)
            r0 = r1
        L3eb:
            return r0
    }
}
