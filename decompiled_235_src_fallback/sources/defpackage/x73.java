package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x73  reason: default package */
/* loaded from: classes.dex */
public abstract class x73 {
    public static final java.util.Set a = null;

    static {
            b63 r0 = defpackage.b63.UP
            b63 r1 = defpackage.b63.DOWN
            b63 r2 = defpackage.b63.LEFT
            b63 r3 = defpackage.b63.RIGHT
            b63 r4 = defpackage.b63.A
            b63 r5 = defpackage.b63.B
            b63 r6 = defpackage.b63.X
            b63 r7 = defpackage.b63.Y
            b63 r8 = defpackage.b63.L
            b63 r9 = defpackage.b63.R
            b63 r10 = defpackage.b63.START
            b63 r11 = defpackage.b63.SELECT
            b63[] r0 = new defpackage.b63[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.Set r0 = defpackage.fv.V0(r0)
            defpackage.x73.a = r0
            return
    }

    public static final void a(defpackage.i63 r43, boolean r44, defpackage.on2 r45, defpackage.on2 r46, defpackage.px0 r47, int r48) {
            r1 = r43
            r2 = r44
            r7 = r47
            xq2 r7 = (defpackage.xq2) r7
            r0 = 1793988537(0x6aee17b9, float:1.4391819E26)
            r7.d0(r0)
            boolean r0 = r7.f(r1)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r48 | r0
            boolean r5 = r7.g(r2)
            if (r5 == 0) goto L22
            r5 = 32
            goto L24
        L22:
            r5 = 16
        L24:
            r0 = r0 | r5
            r13 = r45
            boolean r5 = r7.h(r13)
            if (r5 == 0) goto L30
            r5 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r5 = 128(0x80, float:1.8E-43)
        L32:
            r0 = r0 | r5
            r5 = r46
            boolean r6 = r7.h(r5)
            if (r6 == 0) goto L3e
            r6 = 2048(0x800, float:2.87E-42)
            goto L40
        L3e:
            r6 = 1024(0x400, float:1.435E-42)
        L40:
            r0 = r0 | r6
            r6 = r0 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r6 == r8) goto L49
            r6 = 1
            goto L4a
        L49:
            r6 = 0
        L4a:
            r8 = r0 & 1
            boolean r6 = r7.S(r8, r6)
            if (r6 == 0) goto L3ec
            java.lang.Object r6 = r7.P()
            vs0 r8 = defpackage.ox0.a
            if (r6 != r8) goto L61
            nh2 r6 = defpackage.nh2.b
            mh2 r6 = defpackage.mh2.a
            r7.l0(r6)
        L61:
            mh2 r6 = (defpackage.mh2) r6
            r6.getClass()
            nh2 r6 = new nh2
            r6.<init>()
            nh2 r10 = new nh2
            r10.<init>()
            es7 r11 = defpackage.bl2.F(r7)
            java.lang.Object r12 = r7.P()
            if (r12 != r8) goto L7e
            r94 r12 = defpackage.i61.f(r7)
        L7e:
            r94 r12 = (defpackage.r94) r12
            r14 = 6
            qa4 r14 = defpackage.bw7.a(r12, r7, r14)
            r16 = 1095761920(0x41500000, float:13.0)
            y16 r4 = defpackage.z16.b(r16)
            d40 r15 = defpackage.d90.i0
            x64 r5 = defpackage.x64.a
            r17 = r12
            r12 = 1065353216(0x3f800000, float:1.0)
            a74 r9 = defpackage.dj6.c(r5, r12)
            a74 r9 = defpackage.u24.g(r9, r4)
            java.lang.Object r19 = r14.getValue()
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            boolean r19 = r19.booleanValue()
            if (r19 != 0) goto Lad
            if (r2 == 0) goto Laa
            goto Lad
        Laa:
            long r12 = r11.d
            goto Laf
        Lad:
            long r12 = r11.e
        Laf:
            jy2 r3 = defpackage.u24.m
            a74 r3 = defpackage.vy7.L(r9, r12, r3)
            java.lang.Object r9 = r14.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto Lc7
            if (r2 == 0) goto Lc4
            goto Lc7
        Lc4:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto Lc9
        Lc7:
            r9 = 1073741824(0x40000000, float:2.0)
        Lc9:
            java.lang.Object r12 = r14.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto Ldb
            if (r2 == 0) goto Ld8
            goto Ldb
        Ld8:
            long r12 = r11.e
            goto Ldd
        Ldb:
            long r12 = r11.l
        Ldd:
            a74 r3 = defpackage.ak7.I(r3, r9, r12, r4)
            a74 r3 = defpackage.ak7.S(r3, r6)
            r4 = r0 & 14
            r9 = 4
            if (r4 != r9) goto Lec
            r4 = 1
            goto Led
        Lec:
            r4 = 0
        Led:
            boolean r9 = r7.f(r10)
            r4 = r4 | r9
            java.lang.Object r9 = r7.P()
            r12 = 9
            if (r4 != 0) goto Lfc
            if (r9 != r8) goto L104
        Lfc:
            bi2 r9 = new bi2
            r9.<init>(r12, r1, r10)
            r7.l0(r9)
        L104:
            qn2 r9 = (defpackage.qn2) r9
            a74 r3 = defpackage.ge7.y(r3, r9)
            r4 = r12
            r12 = 0
            r14 = 28
            r9 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r18 = r8
            r8 = r3
            r3 = r9
            r9 = r17
            r17 = r5
            r5 = r18
            r27 = r0
            r26 = r4
            r18 = r6
            r4 = r13
            r0 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r13 = r45
            a74 r8 = defpackage.mb3.t(r8, r9, r10, r11, r12, r13, r14)
            r9 = 1092616192(0x41200000, float:10.0)
            r10 = 1090519040(0x41000000, float:8.0)
            r11 = 1096810496(0x41600000, float:14.0)
            a74 r8 = defpackage.ge7.R(r8, r11, r9, r10, r9)
            du r9 = defpackage.ju.a
            r10 = 48
            l26 r9 = defpackage.k26.a(r9, r15, r7, r10)
            long r10 = r7.T
            int r10 = java.lang.Long.hashCode(r10)
            xv4 r11 = r7.l()
            a74 r8 = defpackage.l.E(r7, r8)
            ix0 r12 = defpackage.jx0.i
            r12.getClass()
            iy0 r12 = defpackage.ix0.b
            r7.f0()
            boolean r13 = r7.S
            if (r13 == 0) goto L15e
            r7.k(r12)
            goto L161
        L15e:
            r7.o0()
        L161:
            pn r13 = defpackage.ix0.f
            defpackage.yh2.K(r7, r13, r9)
            pn r9 = defpackage.ix0.e
            defpackage.yh2.K(r7, r9, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            pn r11 = defpackage.ix0.g
            defpackage.yh2.K(r7, r11, r10)
            ne r10 = defpackage.ix0.h
            defpackage.yh2.F(r7, r10)
            pn r14 = defpackage.ix0.d
            defpackage.yh2.K(r7, r14, r8)
            vn3 r8 = new vn3
            r15 = 1
            r8.<init>(r0, r15)
            eu r0 = defpackage.ju.c
            c40 r15 = defpackage.d90.k0
            yt0 r0 = defpackage.wt0.a(r0, r15, r7, r6)
            r15 = r3
            long r2 = r7.T
            int r2 = java.lang.Long.hashCode(r2)
            xv4 r3 = r7.l()
            a74 r8 = defpackage.l.E(r7, r8)
            r7.f0()
            boolean r6 = r7.S
            if (r6 == 0) goto L1a6
            r7.k(r12)
            goto L1a9
        L1a6:
            r7.o0()
        L1a9:
            defpackage.yh2.K(r7, r13, r0)
            defpackage.yh2.K(r7, r9, r3)
            defpackage.i61.w(r2, r7, r11, r7, r10)
            defpackage.yh2.K(r7, r14, r8)
            h63 r0 = r1.b
            h63 r2 = r1.c
            h63[] r0 = new defpackage.h63[]{r0, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1ca:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e3
            java.lang.Object r2 = r0.next()
            r3 = r2
            h63 r3 = (defpackage.h63) r3
            g63 r6 = defpackage.g63.a
            boolean r3 = defpackage.nb3.k(r3, r6)
            if (r3 != 0) goto L1ca
            r8.add(r2)
            goto L1ca
        L1e3:
            if (r44 == 0) goto L1f2
            r0 = 2025252762(0x78b6e79a, float:2.9677983E34)
            r2 = 2131952384(0x7f130300, float:1.954121E38)
            r6 = 0
            java.lang.String r0 = defpackage.i61.l(r7, r0, r2, r7, r6)
            r2 = r8
            goto L236
        L1f2:
            r6 = 0
            r0 = 2025363897(0x78b899b9, float:2.995314E34)
            r7.b0(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L20b
            r0 = 2025375739(0x78b8c7fb, float:2.998246E34)
            r2 = 2131952302(0x7f1302ae, float:1.9541043E38)
            java.lang.String r0 = defpackage.i61.l(r7, r0, r2, r7, r6)
            r2 = r8
            goto L233
        L20b:
            r0 = 2025481666(0x78ba65c2, float:3.0244722E34)
            r7.b0(r0)
            java.lang.Object r0 = r7.P()
            if (r0 != r5) goto L221
            bz1 r0 = new bz1
            r2 = 26
            r0.<init>(r2)
            r7.l0(r0)
        L221:
            r12 = r0
            qn2 r12 = (defpackage.qn2) r12
            r13 = 30
            java.lang.String r9 = " / "
            r10 = 0
            r11 = 0
            java.lang.String r0 = defpackage.gt0.P0(r8, r9, r10, r11, r12, r13)
            r2 = r8
            r6 = 0
            r7.p(r6)
        L233:
            r7.p(r6)
        L236:
            b63 r3 = r1.a
            r8 = 2139434571(0x7f852e4b, float:NaN)
            r7.b0(r8)
            int[] r8 = defpackage.w73.a
            int r3 = r3.ordinal()
            r3 = r8[r3]
            switch(r3) {
                case 1: goto L2a9;
                case 2: goto L2a5;
                case 3: goto L2a1;
                case 4: goto L29d;
                case 5: goto L299;
                case 6: goto L295;
                case 7: goto L291;
                case 8: goto L28d;
                case 9: goto L289;
                case 10: goto L285;
                case 11: goto L281;
                case 12: goto L27d;
                case 13: goto L279;
                case 14: goto L275;
                case 15: goto L271;
                case 16: goto L26d;
                case 17: goto L269;
                case 18: goto L265;
                case 19: goto L261;
                case 20: goto L25d;
                case 21: goto L259;
                case 22: goto L255;
                case 23: goto L250;
                default: goto L249;
            }
        L249:
            r7.p(r6)
            r3 = 0
            r6 = 0
            goto L2b4
        L250:
            r3 = 2131952076(0x7f1301cc, float:1.9540585E38)
            goto L2ac
        L255:
            r3 = 2131952499(0x7f130373, float:1.9541442E38)
            goto L2ac
        L259:
            r3 = 2131952063(0x7f1301bf, float:1.9540558E38)
            goto L2ac
        L25d:
            r3 = 2131952064(0x7f1301c0, float:1.954056E38)
            goto L2ac
        L261:
            r3 = 2131952073(0x7f1301c9, float:1.9540578E38)
            goto L2ac
        L265:
            r3 = 2131952067(0x7f1301c3, float:1.9540566E38)
            goto L2ac
        L269:
            r3 = 2131952061(0x7f1301bd, float:1.9540554E38)
            goto L2ac
        L26d:
            r3 = 2131952054(0x7f1301b6, float:1.954054E38)
            goto L2ac
        L271:
            r3 = 2131952045(0x7f1301ad, float:1.9540522E38)
            goto L2ac
        L275:
            r3 = 2131952062(0x7f1301be, float:1.9540556E38)
            goto L2ac
        L279:
            r3 = 2131952060(0x7f1301bc, float:1.9540552E38)
            goto L2ac
        L27d:
            r3 = 2131952070(0x7f1301c6, float:1.9540572E38)
            goto L2ac
        L281:
            r3 = 2131952071(0x7f1301c7, float:1.9540574E38)
            goto L2ac
        L285:
            r3 = 2131952065(0x7f1301c1, float:1.9540562E38)
            goto L2ac
        L289:
            r3 = 2131952055(0x7f1301b7, float:1.9540542E38)
            goto L2ac
        L28d:
            r3 = 2131952042(0x7f1301aa, float:1.9540516E38)
            goto L2ac
        L291:
            r3 = 2131952077(0x7f1301cd, float:1.9540587E38)
            goto L2ac
        L295:
            r3 = 2131952068(0x7f1301c4, float:1.9540568E38)
            goto L2ac
        L299:
            r3 = 2131952058(0x7f1301ba, float:1.9540548E38)
            goto L2ac
        L29d:
            r3 = 2131952080(0x7f1301d0, float:1.9540593E38)
            goto L2ac
        L2a1:
            r3 = 2131952079(0x7f1301cf, float:1.954059E38)
            goto L2ac
        L2a5:
            r3 = 2131952041(0x7f1301a9, float:1.9540514E38)
            goto L2ac
        L2a9:
            r3 = 2131952039(0x7f1301a7, float:1.954051E38)
        L2ac:
            java.lang.String r3 = defpackage.yh2.O(r7, r3)
            r6 = 0
            r7.p(r6)
        L2b4:
            if (r3 != 0) goto L2b8
            java.lang.String r3 = ""
        L2b8:
            nq6 r8 = defpackage.ye7.b
            java.lang.Object r9 = r7.j(r8)
            xe7 r9 = (defpackage.xe7) r9
            s47 r9 = r9.i
            long r10 = r4.g
            oj2 r33 = defpackage.oj2.Z
            r39 = 0
            r40 = 16777210(0xfffffa, float:2.3509879E-38)
            r31 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r28 = r9
            r29 = r10
            s47 r21 = defpackage.s47.a(r28, r29, r31, r33, r34, r35, r37, r39, r40)
            r24 = 0
            r25 = 65534(0xfffe, float:9.1833E-41)
            r13 = r4
            r4 = 0
            r9 = r5
            r19 = r6
            r5 = 0
            r22 = r7
            r10 = r8
            r7 = 0
            r11 = r9
            r9 = 0
            r12 = r10
            r10 = 0
            r20 = r11
            r14 = r12
            r11 = 0
            r23 = r13
            r13 = 0
            r29 = r14
            r28 = r15
            r14 = 0
            r30 = 1
            r16 = 0
            r31 = r17
            r17 = 0
            r32 = r18
            r18 = 0
            r33 = r19
            r19 = 0
            r34 = r20
            r20 = 0
            r35 = r23
            r23 = 0
            r47 = r0
            r0 = r29
            r1 = r30
            r41 = r31
            r42 = r34
            r29 = r28
            r28 = r2
            r2 = r35
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = r22
            java.lang.Object r0 = r7.j(r0)
            xe7 r0 = (defpackage.xe7) r0
            s47 r8 = r0.j
            if (r44 == 0) goto L339
            long r3 = r2.l
        L337:
            r9 = r3
            goto L345
        L339:
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L342
            long r3 = r2.g
            goto L337
        L342:
            long r3 = r2.h
            goto L337
        L345:
            if (r44 != 0) goto L352
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L34e
            goto L352
        L34e:
            oj2 r0 = defpackage.oj2.Y
        L350:
            r13 = r0
            goto L355
        L352:
            oj2 r0 = defpackage.oj2.d0
            goto L350
        L355:
            r19 = 0
            r20 = 16777210(0xfffffa, float:2.3509879E-38)
            r11 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            s47 r21 = defpackage.s47.a(r8, r9, r11, r13, r14, r15, r17, r19, r20)
            r24 = 0
            r25 = 65534(0xfffe, float:9.1833E-41)
            r4 = 0
            r5 = 0
            r22 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r3 = r47
            defpackage.x37.b(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = r22
            r7.p(r1)
            boolean r0 = r43.b()
            if (r0 == 0) goto L3de
            r0 = 247131823(0xebaeeaf, float:4.6082384E-30)
            r7.b0(r0)
            r15 = r29
            r0 = r41
            a74 r0 = defpackage.ak7.S(r0, r15)
            r3 = r32
            boolean r4 = r7.f(r3)
            java.lang.Object r5 = r7.P()
            if (r4 != 0) goto L3b0
            r11 = r42
            if (r5 != r11) goto L3b9
        L3b0:
            do0 r5 = new do0
            r4 = 2
            r5.<init>(r3, r4)
            r7.l0(r5)
        L3b9:
            qn2 r5 = (defpackage.qn2) r5
            a74 r4 = defpackage.ge7.y(r0, r5)
            d4 r0 = new d4
            r0.<init>(r2, r1)
            r2 = -2050622722(0xffffffff85c5fafe, float:-1.8617991E-35)
            zv0 r6 = defpackage.n16.I(r2, r0, r7)
            int r0 = r27 >> 9
            r0 = r0 & 14
            r8 = r0 | 24576(0x6000, float:3.4438E-41)
            r9 = 12
            r5 = 0
            r3 = r46
            defpackage.ej2.b(r3, r4, r5, r6, r7, r8, r9)
            r6 = 0
            r7.p(r6)
            goto L3e8
        L3de:
            r6 = 0
            r0 = 247508845(0xec0af6d, float:4.7500583E-30)
            r7.b0(r0)
            r7.p(r6)
        L3e8:
            r7.p(r1)
            goto L3ef
        L3ec:
            r7.V()
        L3ef:
            cf5 r6 = r7.t()
            if (r6 == 0) goto L406
            j7 r0 = new j7
            r1 = r43
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r48
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L406:
            return
    }

    public static final void b(me.magnum.melonds.ui.inputsetup.b r26, defpackage.on2 r27, defpackage.px0 r28, int r29) {
            r2 = r26
            r14 = r27
            r2.getClass()
            r14.getClass()
            r15 = r28
            xq2 r15 = (defpackage.xq2) r15
            r0 = 17335339(0x108842b, float:2.507408E-38)
            r15.d0(r0)
            boolean r0 = r15.h(r2)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r29 | r0
            boolean r1 = r15.h(r14)
            if (r1 == 0) goto L28
            r1 = 32
            goto L2a
        L28:
            r1 = 16
        L2a:
            r9 = r0 | r1
            r0 = r9 & 19
            r1 = 18
            r10 = 0
            if (r0 == r1) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = r10
        L36:
            r1 = r9 & 1
            boolean r0 = r15.S(r1, r0)
            if (r0 == 0) goto L1e0
            de5 r0 = r2.f
            qa4 r0 = defpackage.nb3.n(r0, r15)
            de5 r1 = r2.j
            qa4 r1 = defpackage.nb3.n(r1, r15)
            de5 r3 = r2.h
            qa4 r3 = defpackage.nb3.n(r3, r15)
            de5 r4 = r2.l
            qa4 r4 = defpackage.nb3.n(r4, r15)
            be5 r12 = r2.n
            java.lang.Object r0 = r0.getValue()
            r13 = r0
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r0 = r1.getValue()
            r16 = r0
            b63 r16 = (defpackage.b63) r16
            java.lang.Object r0 = r3.getValue()
            r17 = r0
            kk6 r17 = (defpackage.kk6) r17
            java.lang.Object r0 = r4.getValue()
            r18 = r0
            me.magnum.melonds.ui.inputsetup.b$a r18 = (me.magnum.melonds.ui.inputsetup.b.a) r18
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            vs0 r3 = defpackage.ox0.a
            if (r0 != 0) goto L88
            if (r1 != r3) goto L86
            goto L88
        L86:
            r11 = r3
            goto La3
        L88:
            a0 r0 = new a0
            r7 = 0
            r8 = 17
            r1 = 1
            r4 = r3
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            r5 = r4
            java.lang.String r4 = "startInputAssignment"
            r6 = r5
            java.lang.String r5 = "startInputAssignment(Lme/magnum/melonds/domain/model/Input;)V"
            r19 = r6
            r6 = 0
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.l0(r0)
            r1 = r0
        La3:
            po2 r1 = (defpackage.po2) r1
            r19 = r1
            qn2 r19 = (defpackage.qn2) r19
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto Lb5
            if (r1 != r11) goto Lc9
        Lb5:
            a0 r0 = new a0
            r7 = 0
            r8 = 18
            r1 = 1
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            java.lang.String r4 = "clearInputAssignment"
            java.lang.String r5 = "clearInputAssignment(Lme/magnum/melonds/domain/model/Input;)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.l0(r0)
            r1 = r0
        Lc9:
            po2 r1 = (defpackage.po2) r1
            r20 = r1
            qn2 r20 = (defpackage.qn2) r20
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto Ldb
            if (r1 != r11) goto Le3
        Ldb:
            k73 r1 = new k73
            r1.<init>(r2, r10)
            r15.l0(r1)
        Le3:
            r10 = r1
            on2 r10 = (defpackage.on2) r10
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto Lf2
            if (r1 != r11) goto Lfb
        Lf2:
            k73 r1 = new k73
            r0 = 1
            r1.<init>(r2, r0)
            r15.l0(r1)
        Lfb:
            r21 = r1
            on2 r21 = (defpackage.on2) r21
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto L10b
            if (r1 != r11) goto L11f
        L10b:
            a0 r0 = new a0
            r7 = 0
            r8 = 19
            r1 = 1
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            java.lang.String r4 = "setSlot2InvertX"
            java.lang.String r5 = "setSlot2InvertX(Z)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.l0(r0)
            r1 = r0
        L11f:
            po2 r1 = (defpackage.po2) r1
            r22 = r1
            qn2 r22 = (defpackage.qn2) r22
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto L131
            if (r1 != r11) goto L145
        L131:
            a0 r0 = new a0
            r7 = 0
            r8 = 20
            r1 = 1
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            java.lang.String r4 = "setSlot2InvertY"
            java.lang.String r5 = "setSlot2InvertY(Z)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.l0(r0)
            r1 = r0
        L145:
            po2 r1 = (defpackage.po2) r1
            r23 = r1
            qn2 r23 = (defpackage.qn2) r23
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto L157
            if (r1 != r11) goto L16b
        L157:
            a0 r0 = new a0
            r7 = 0
            r8 = 21
            r1 = 1
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            java.lang.String r4 = "setSlot2Deadzone"
            java.lang.String r5 = "setSlot2Deadzone(F)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.l0(r0)
            r1 = r0
        L16b:
            po2 r1 = (defpackage.po2) r1
            r24 = r1
            qn2 r24 = (defpackage.qn2) r24
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto L17d
            if (r1 != r11) goto L191
        L17d:
            a0 r0 = new a0
            r7 = 0
            r8 = 22
            r1 = 1
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            java.lang.String r4 = "setSlot2UseDeviceFilter"
            java.lang.String r5 = "setSlot2UseDeviceFilter(Z)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.l0(r0)
            r1 = r0
        L191:
            po2 r1 = (defpackage.po2) r1
            r25 = r1
            qn2 r25 = (defpackage.qn2) r25
            boolean r0 = r15.h(r2)
            java.lang.Object r1 = r15.P()
            if (r0 != 0) goto L1a3
            if (r1 != r11) goto L1b6
        L1a3:
            i4 r0 = new i4
            r7 = 0
            r8 = 6
            r1 = 0
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            java.lang.String r4 = "stopAnyAssignment"
            java.lang.String r5 = "stopAnyAssignment()V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.l0(r0)
            r1 = r0
        L1b6:
            po2 r1 = (defpackage.po2) r1
            on2 r1 = (defpackage.on2) r1
            int r0 = r9 << 9
            r2 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r2
            r2 = r17
            r17 = r0
            r0 = r13
            r13 = r1
            r1 = r16
            r16 = 0
            r7 = r10
            r4 = r12
            r3 = r18
            r5 = r19
            r6 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L1e3
        L1e0:
            r15.V()
        L1e3:
            cf5 r0 = r15.t()
            if (r0 == 0) goto L1f6
            ql1 r1 = new ql1
            r2 = 17
            r3 = r26
            r4 = r29
            r1.<init>(r3, r4, r2, r14)
            r0.d = r1
        L1f6:
            return
    }

    public static final void c(java.util.List r26, defpackage.b63 r27, defpackage.kk6 r28, me.magnum.melonds.ui.inputsetup.b.a r29, defpackage.le2 r30, defpackage.qn2 r31, defpackage.qn2 r32, defpackage.on2 r33, defpackage.on2 r34, defpackage.qn2 r35, defpackage.qn2 r36, defpackage.qn2 r37, defpackage.qn2 r38, defpackage.on2 r39, defpackage.on2 r40, defpackage.px0 r41, int r42, int r43) {
            r1 = r26
            r5 = r30
            r14 = r39
            r0 = r42
            r2 = r43
            r3 = r41
            xq2 r3 = (defpackage.xq2) r3
            r4 = 2056390557(0x7a92079d, float:3.7911488E35)
            r3.d0(r4)
            boolean r4 = r3.h(r1)
            if (r4 == 0) goto L1c
            r4 = 4
            goto L1d
        L1c:
            r4 = 2
        L1d:
            r4 = r4 | r0
            r8 = r0 & 48
            r11 = -1
            if (r8 != 0) goto L37
            if (r27 != 0) goto L27
            r8 = r11
            goto L2b
        L27:
            int r8 = r27.ordinal()
        L2b:
            boolean r8 = r3.d(r8)
            if (r8 == 0) goto L34
            r8 = 32
            goto L36
        L34:
            r8 = 16
        L36:
            r4 = r4 | r8
        L37:
            r12 = r28
            boolean r8 = r3.f(r12)
            if (r8 == 0) goto L42
            r8 = 256(0x100, float:3.59E-43)
            goto L44
        L42:
            r8 = 128(0x80, float:1.8E-43)
        L44:
            r4 = r4 | r8
            r8 = r0 & 3072(0xc00, float:4.305E-42)
            r16 = 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L5e
            if (r29 != 0) goto L4e
            goto L52
        L4e:
            int r11 = r29.ordinal()
        L52:
            boolean r8 = r3.d(r11)
            if (r8 == 0) goto L5b
            r8 = 2048(0x800, float:2.87E-42)
            goto L5d
        L5b:
            r8 = r16
        L5d:
            r4 = r4 | r8
        L5e:
            boolean r8 = r3.h(r5)
            r17 = 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L69
            r8 = r17
            goto L6b
        L69:
            r8 = 8192(0x2000, float:1.148E-41)
        L6b:
            r4 = r4 | r8
            r8 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r0
            if (r8 != 0) goto L81
            r8 = r31
            boolean r18 = r3.h(r8)
            if (r18 == 0) goto L7c
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L7e
        L7c:
            r18 = 65536(0x10000, float:9.1835E-41)
        L7e:
            r4 = r4 | r18
            goto L83
        L81:
            r8 = r31
        L83:
            r21 = 1572864(0x180000, float:2.204052E-39)
            r18 = r0 & r21
            r7 = r32
            if (r18 != 0) goto L98
            boolean r19 = r3.h(r7)
            if (r19 == 0) goto L94
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L96
        L94:
            r19 = 524288(0x80000, float:7.34684E-40)
        L96:
            r4 = r4 | r19
        L98:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r0 & r19
            r9 = r33
            if (r19 != 0) goto Lad
            boolean r20 = r3.h(r9)
            if (r20 == 0) goto La9
            r20 = 8388608(0x800000, float:1.1754944E-38)
            goto Lab
        La9:
            r20 = 4194304(0x400000, float:5.877472E-39)
        Lab:
            r4 = r4 | r20
        Lad:
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            r20 = r0 & r20
            r10 = r34
            if (r20 != 0) goto Lc2
            boolean r22 = r3.h(r10)
            if (r22 == 0) goto Lbe
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc0
        Lbe:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        Lc0:
            r4 = r4 | r22
        Lc2:
            r22 = 805306368(0x30000000, float:4.656613E-10)
            r22 = r0 & r22
            r11 = r35
            if (r22 != 0) goto Ld7
            boolean r23 = r3.h(r11)
            if (r23 == 0) goto Ld3
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto Ld5
        Ld3:
            r23 = 268435456(0x10000000, float:2.524355E-29)
        Ld5:
            r4 = r4 | r23
        Ld7:
            r23 = r2 & 6
            r13 = r36
            if (r23 != 0) goto Leb
            boolean r24 = r3.h(r13)
            if (r24 == 0) goto Le6
            r18 = 4
            goto Le8
        Le6:
            r18 = 2
        Le8:
            r18 = r2 | r18
            goto Led
        Leb:
            r18 = r2
        Led:
            r24 = r2 & 48
            r15 = r37
            if (r24 != 0) goto L100
            boolean r24 = r3.h(r15)
            if (r24 == 0) goto Lfc
            r19 = 32
            goto Lfe
        Lfc:
            r19 = 16
        Lfe:
            r18 = r18 | r19
        L100:
            r6 = r2 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L114
            r6 = r38
            boolean r20 = r3.h(r6)
            if (r20 == 0) goto L10f
            r23 = 256(0x100, float:3.59E-43)
            goto L111
        L10f:
            r23 = 128(0x80, float:1.8E-43)
        L111:
            r18 = r18 | r23
            goto L116
        L114:
            r6 = r38
        L116:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L124
            boolean r0 = r3.h(r14)
            if (r0 == 0) goto L122
            r16 = 2048(0x800, float:2.87E-42)
        L122:
            r18 = r18 | r16
        L124:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L138
            r0 = r40
            boolean r16 = r3.h(r0)
            if (r16 == 0) goto L131
            goto L133
        L131:
            r17 = 8192(0x2000, float:1.148E-41)
        L133:
            r18 = r18 | r17
        L135:
            r0 = r18
            goto L13b
        L138:
            r0 = r40
            goto L135
        L13b:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r4 & r16
            r41 = r4
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = 1
            if (r2 != r4) goto L152
            r2 = r0 & 9363(0x2493, float:1.312E-41)
            r4 = 9362(0x2492, float:1.3119E-41)
            if (r2 == r4) goto L150
            goto L152
        L150:
            r2 = 0
            goto L154
        L152:
            r2 = r16
        L154:
            r4 = r41 & 1
            boolean r2 = r3.S(r4, r2)
            if (r2 == 0) goto L25f
            nq6 r2 = defpackage.ky0.i
            java.lang.Object r2 = r3.j(r2)
            ah2 r2 = (defpackage.ah2) r2
            if (r27 != 0) goto L16b
            if (r29 == 0) goto L169
            goto L16b
        L169:
            r4 = 0
            goto L16d
        L16b:
            r4 = r16
        L16d:
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            r22 = r0
            r0 = 2048(0x800, float:2.87E-42)
            if (r6 != r0) goto L176
            goto L178
        L176:
            r16 = 0
        L178:
            java.lang.Object r0 = r3.P()
            vs0 r6 = defpackage.ox0.a
            if (r16 != 0) goto L182
            if (r0 != r6) goto L18c
        L182:
            x7 r0 = new x7
            r7 = 11
            r0.<init>(r7, r14)
            r3.l0(r0)
        L18c:
            on2 r0 = (defpackage.on2) r0
            r7 = 0
            defpackage.ge7.b(r4, r0, r3, r7, r7)
            boolean r0 = r3.h(r5)
            boolean r4 = r3.h(r2)
            r0 = r0 | r4
            java.lang.Object r4 = r3.P()
            if (r0 != 0) goto L1a3
            if (r4 != r6) goto L1ac
        L1a3:
            q73 r4 = new q73
            r0 = 0
            r4.<init>(r5, r2, r0)
            r3.l0(r4)
        L1ac:
            eo2 r4 = (defpackage.eo2) r4
            jg7 r0 = defpackage.jg7.a
            defpackage.mb3.i(r3, r4, r0)
            boolean r0 = r3.f(r1)
            java.lang.Object r2 = r3.P()
            java.util.Set r4 = defpackage.x73.a
            if (r0 != 0) goto L1c1
            if (r2 != r6) goto L1ea
        L1c1:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r1.iterator()
        L1ca:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L1e7
            java.lang.Object r7 = r0.next()
            r41 = r0
            r0 = r7
            i63 r0 = (defpackage.i63) r0
            b63 r0 = r0.a
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L1e4
            r2.add(r7)
        L1e4:
            r0 = r41
            goto L1ca
        L1e7:
            r3.l0(r2)
        L1ea:
            r7 = r2
            java.util.List r7 = (java.util.List) r7
            boolean r0 = r3.f(r1)
            java.lang.Object r2 = r3.P()
            if (r0 != 0) goto L1f9
            if (r2 != r6) goto L222
        L1f9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r1.iterator()
        L202:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L21f
            java.lang.Object r6 = r0.next()
            r41 = r0
            r0 = r6
            i63 r0 = (defpackage.i63) r0
            b63 r0 = r0.a
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L21c
            r2.add(r6)
        L21c:
            r0 = r41
            goto L202
        L21f:
            r3.l0(r2)
        L222:
            java.util.List r2 = (java.util.List) r2
            r0 = 2131952094(0x7f1301de, float:1.9540621E38)
            java.lang.String r0 = defpackage.yh2.O(r3, r0)
            n73 r6 = new n73
            r19 = r38
            r16 = r11
            r17 = r13
            r20 = r14
            r18 = r15
            r13 = r29
            r11 = r2
            r14 = r9
            r15 = r10
            r10 = r32
            r9 = r8
            r8 = r27
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2 = 1474138833(0x57dd92d1, float:4.8724528E14)
            zv0 r12 = defpackage.n16.I(r2, r6, r3)
            int r2 = r22 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r14 = r2 | r21
            r15 = 60
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r40
            r6 = r0
            r13 = r3
            defpackage.ps7.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L263
        L25f:
            r13 = r3
            r13.V()
        L263:
            cf5 r0 = r13.t()
            if (r0 == 0) goto L293
            r2 = r0
            o73 r0 = new o73
            r3 = r28
            r4 = r29
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r16 = r42
            r17 = r43
            r25 = r2
            r2 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = r25
            r2.d = r0
        L293:
            return
    }

    public static final void d(java.lang.String r24, defpackage.px0 r25, int r26) {
            r0 = r24
            r1 = r25
            xq2 r1 = (defpackage.xq2) r1
            r2 = 1078369560(0x40469d18, float:3.1033382)
            r1.d0(r2)
            boolean r2 = r1.f(r0)
            r3 = 2
            if (r2 == 0) goto L15
            r2 = 4
            goto L16
        L15:
            r2 = r3
        L16:
            r2 = r26 | r2
            r4 = r2 & 3
            if (r4 == r3) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r5 = r2 & 1
            boolean r4 = r1.S(r5, r4)
            if (r4 == 0) goto L88
            es7 r4 = defpackage.bl2.F(r1)
            nq6 r5 = defpackage.ye7.b
            java.lang.Object r5 = r1.j(r5)
            xe7 r5 = (defpackage.xe7) r5
            s47 r6 = r5.h
            long r7 = r4.l
            oj2 r11 = defpackage.oj2.e0
            r17 = 0
            r18 = 16777210(0xfffffa, float:2.3509879E-38)
            r9 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            s47 r18 = defpackage.s47.a(r6, r7, r9, r11, r12, r13, r15, r17, r18)
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 4
            x64 r4 = defpackage.x64.a
            r5 = 1082130432(0x40800000, float:4.0)
            r6 = 1086324736(0x40c00000, float:6.0)
            r7 = 0
            a74 r4 = defpackage.ge7.S(r4, r5, r6, r7, r8, r9)
            r2 = r2 & 14
            r20 = r2 | 48
            r21 = 0
            r22 = 65532(0xfffc, float:9.183E-41)
            r5 = r3
            r2 = 0
            r19 = r1
            r1 = r4
            r6 = r5
            r4 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r10 = r8
            r8 = 0
            r11 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r23 = r17
            r17 = 0
            defpackage.x37.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L8d
        L88:
            r19 = r1
            r19.V()
        L8d:
            cf5 r1 = r19.t()
            if (r1 == 0) goto L9d
            g5 r2 = new g5
            r3 = r26
            r5 = 2
            r2.<init>(r0, r3, r5)
            r1.d = r2
        L9d:
            return
    }

    public static final void e(defpackage.kk6 r67, me.magnum.melonds.ui.inputsetup.b.a r68, defpackage.on2 r69, defpackage.on2 r70, defpackage.qn2 r71, defpackage.qn2 r72, defpackage.qn2 r73, defpackage.qn2 r74, defpackage.px0 r75, int r76) {
            r1 = r67
            r2 = r68
            r3 = r69
            r4 = r70
            r7 = r73
            r13 = r75
            xq2 r13 = (defpackage.xq2) r13
            r0 = 1848560754(0x6e2ecc72, float:1.3524388E28)
            r13.d0(r0)
            boolean r0 = r13.f(r1)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r76 | r0
            if (r2 != 0) goto L23
            r6 = -1
            goto L27
        L23:
            int r6 = r2.ordinal()
        L27:
            boolean r6 = r13.d(r6)
            if (r6 == 0) goto L30
            r6 = 32
            goto L32
        L30:
            r6 = 16
        L32:
            r0 = r0 | r6
            boolean r6 = r13.h(r3)
            if (r6 == 0) goto L3c
            r6 = 256(0x100, float:3.59E-43)
            goto L3e
        L3c:
            r6 = 128(0x80, float:1.8E-43)
        L3e:
            r0 = r0 | r6
            boolean r6 = r13.h(r4)
            if (r6 == 0) goto L48
            r6 = 2048(0x800, float:2.87E-42)
            goto L4a
        L48:
            r6 = 1024(0x400, float:1.435E-42)
        L4a:
            r0 = r0 | r6
            r6 = r71
            boolean r8 = r13.h(r6)
            if (r8 == 0) goto L56
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L58
        L56:
            r8 = 8192(0x2000, float:1.148E-41)
        L58:
            r0 = r0 | r8
            r8 = r72
            boolean r9 = r13.h(r8)
            if (r9 == 0) goto L64
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L66
        L64:
            r9 = 65536(0x10000, float:9.1835E-41)
        L66:
            r0 = r0 | r9
            boolean r9 = r13.h(r7)
            if (r9 == 0) goto L70
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L72
        L70:
            r9 = 524288(0x80000, float:7.34684E-40)
        L72:
            r0 = r0 | r9
            r9 = r74
            boolean r11 = r13.h(r9)
            if (r11 == 0) goto L7e
            r11 = 8388608(0x800000, float:1.1754944E-38)
            goto L80
        L7e:
            r11 = 4194304(0x400000, float:5.877472E-39)
        L80:
            r0 = r0 | r11
            r11 = 4793491(0x492493, float:6.717112E-39)
            r11 = r11 & r0
            r12 = 4793490(0x492492, float:6.71711E-39)
            if (r11 == r12) goto L8c
            r11 = 1
            goto L8d
        L8c:
            r11 = 0
        L8d:
            r12 = r0 & 1
            boolean r11 = r13.S(r12, r11)
            if (r11 == 0) goto Lcb1
            es7 r11 = defpackage.bl2.F(r13)
            r12 = 1096810496(0x41600000, float:14.0)
            y16 r10 = defpackage.z16.b(r12)
            r31 = 1092616192(0x41200000, float:10.0)
            y16 r5 = defpackage.z16.b(r31)
            me.magnum.melonds.ui.inputsetup.b$a r14 = me.magnum.melonds.ui.inputsetup.b.a.X
            r15 = 2131952384(0x7f130300, float:1.954121E38)
            if (r2 != r14) goto Lbc
            r12 = 403359991(0x180ac8f7, float:1.7937543E-24)
            r13.b0(r12)
            java.lang.String r12 = defpackage.yh2.O(r13, r15)
            r13.s()
        Lb9:
            r32 = r12
            goto Lcc
        Lbc:
            r12 = 403422580(0x180bbd74, float:1.8060978E-24)
            r13.b0(r12)
            r13.s()
            int r12 = r1.c
            java.lang.String r12 = g(r12)
            goto Lb9
        Lcc:
            me.magnum.melonds.ui.inputsetup.b$a r12 = me.magnum.melonds.ui.inputsetup.b.a.Y
            if (r2 != r12) goto Le0
            r33 = r0
            r0 = 403583191(0x180e30d7, float:1.8377728E-24)
            r13.b0(r0)
            java.lang.String r0 = defpackage.yh2.O(r13, r15)
            r13.s()
            goto Lf1
        Le0:
            r33 = r0
            r0 = 403645780(0x180f2554, float:1.8501163E-24)
            r13.b0(r0)
            r13.s()
            int r0 = r1.d
            java.lang.String r0 = g(r0)
        Lf1:
            x64 r19 = defpackage.x64.a
            a74 r15 = defpackage.dj6.d(r19)
            a74 r15 = defpackage.u24.g(r15, r10)
            long r8 = r11.d
            a74 r8 = defpackage.vy7.M(r15, r8)
            r9 = r11
            r15 = r12
            long r11 = r9.c()
            r25 = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            a74 r8 = defpackage.ak7.I(r8, r14, r11, r10)
            r10 = 1096810496(0x41600000, float:14.0)
            a74 r8 = defpackage.ge7.O(r8, r10)
            c40 r10 = defpackage.d90.k0
            eu r11 = defpackage.ju.c
            r12 = 0
            yt0 r14 = defpackage.wt0.a(r11, r10, r13, r12)
            long r20 = defpackage.ge7.C(r13)
            int r18 = java.lang.Long.hashCode(r20)
            xv4 r12 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            ix0 r20 = defpackage.jx0.i
            r20.getClass()
            r34 = r0
            iy0 r0 = defpackage.ix0.b()
            r13.f0()
            boolean r20 = r13.D()
            if (r20 == 0) goto L146
            r13.k(r0)
            goto L149
        L146:
            r13.o0()
        L149:
            pn r0 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r0, r14)
            pn r0 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r0, r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            defpackage.i61.x(r13, r0, r13, r13, r8)
            r0 = 2131952677(0x7f130425, float:1.9541804E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r0)
            xe7 r0 = defpackage.gi2.I(r13)
            s47 r0 = r0.j
            r12 = r10
            r14 = r11
            long r10 = r9.e()
            r24 = 7
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1094713344(0x41400000, float:12.0)
            a74 r18 = defpackage.ge7.S(r19, r20, r21, r22, r23, r24)
            r35 = r19
            r29 = 0
            r30 = 65528(0xfff8, float:9.1824E-41)
            r19 = r12
            r27 = r13
            r12 = 0
            r20 = r14
            r14 = 0
            r21 = r15
            r15 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1
            r16 = 0
            r24 = r9
            r9 = r18
            r18 = 0
            r28 = r19
            r37 = r20
            r19 = 0
            r38 = r21
            r21 = 0
            r39 = r22
            r22 = 0
            r40 = r23
            r23 = 0
            r41 = r24
            r24 = 0
            r42 = r25
            r25 = 0
            r43 = r28
            r28 = 48
            r26 = r0
            r45 = r37
            r6 = r38
            r1 = r39
            r0 = r42
            r7 = r43
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            a74 r8 = defpackage.dj6.d(r35)
            a74 r8 = defpackage.u24.g(r8, r5)
            if (r2 != r0) goto L1dc
            long r9 = r41.c()
            goto L1e0
        L1dc:
            long r9 = r41.b()
        L1e0:
            a74 r8 = defpackage.vy7.M(r8, r9)
            r9 = 1069547520(0x3fc00000, float:1.5)
            if (r2 != r0) goto L1f1
            long r10 = r41.a()
            a74 r8 = defpackage.ak7.I(r8, r9, r10, r5)
            goto L1f9
        L1f1:
            long r10 = r41.c()
            a74 r8 = defpackage.ak7.I(r8, r1, r10, r5)
        L1f9:
            r10 = 0
            r11 = 15
            r12 = 0
            a74 r8 = defpackage.mb3.u(r8, r12, r10, r3, r11)
            r14 = r31
            r15 = 1094713344(0x41400000, float:12.0)
            a74 r8 = defpackage.ge7.P(r8, r15, r14)
            d40 r14 = defpackage.d90.i0
            du r9 = defpackage.ju.a
            r10 = 48
            l26 r11 = defpackage.k26.a(r9, r14, r13, r10)
            long r18 = defpackage.ge7.C(r13)
            int r18 = java.lang.Long.hashCode(r18)
            xv4 r10 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            iy0 r15 = defpackage.ix0.b()
            r13.f0()
            boolean r20 = r13.D()
            if (r20 == 0) goto L234
            r13.k(r15)
            goto L237
        L234:
            r13.o0()
        L237:
            pn r15 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r15, r11)
            pn r11 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r11, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            defpackage.i61.x(r13, r10, r13, r13, r8)
            n26 r8 = defpackage.n26.a
            r10 = r35
            a74 r11 = defpackage.m26.a(r8, r10, r1)
            r15 = r45
            yt0 r1 = defpackage.wt0.a(r15, r7, r13, r12)
            long r20 = defpackage.ge7.C(r13)
            int r18 = java.lang.Long.hashCode(r20)
            xv4 r12 = r13.z()
            a74 r11 = defpackage.l.E(r13, r11)
            iy0 r3 = defpackage.ix0.b()
            r13.f0()
            boolean r20 = r13.D()
            if (r20 == 0) goto L27b
            r13.k(r3)
            goto L27e
        L27b:
            r13.o0()
        L27e:
            pn r3 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r3, r1)
            pn r1 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r1, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            defpackage.i61.x(r13, r1, r13, r13, r11)
            r1 = 2131952667(0x7f13041b, float:1.9541783E38)
            java.lang.String r1 = defpackage.yh2.O(r13, r1)
            xe7 r3 = defpackage.gi2.I(r13)
            s47 r44 = r3.a()
            long r45 = r41.d()
            oj2 r52 = defpackage.oj2.Z
            r55 = 0
            r56 = 16777210(0xfffffa, float:2.3509879E-38)
            r47 = 0
            r50 = 0
            r49 = r52
            r51 = 0
            r53 = 0
            s47 r3 = defpackage.s47.a(r44, r45, r47, r49, r50, r51, r53, r55, r56)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            r11 = r9
            r9 = 0
            r35 = r10
            r12 = r11
            r10 = 0
            r18 = r12
            r27 = r13
            r12 = 0
            r20 = r14
            r14 = 0
            r37 = r15
            r15 = 0
            r21 = 15
            r22 = 0
            r16 = 0
            r24 = r18
            r18 = 0
            r25 = r20
            r28 = 48
            r19 = 0
            r36 = r21
            r21 = 0
            r38 = r22
            r22 = 0
            r42 = 1094713344(0x41400000, float:12.0)
            r23 = 0
            r43 = r24
            r24 = 0
            r44 = r25
            r25 = 0
            r45 = r28
            r28 = 0
            r26 = r3
            r63 = r8
            r61 = r37
            r62 = r43
            r3 = r44
            r8 = r1
            r43 = r7
            r1 = r35
            r7 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r8 = 2131952668(0x7f13041c, float:1.9541785E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r8)
            xe7 r9 = defpackage.gi2.I(r13)
            s47 r26 = r9.b()
            long r10 = r41.e()
            r30 = 65530(0xfffa, float:9.1827E-41)
            r9 = 0
            r12 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r13.r()
            r35 = 1086324736(0x40c00000, float:6.0)
            y16 r8 = defpackage.z16.b(r35)
            a74 r8 = defpackage.u24.g(r1, r8)
            long r9 = r41.c()
            a74 r8 = defpackage.vy7.M(r8, r9)
            r9 = 1090519040(0x41000000, float:8.0)
            r10 = 1082130432(0x40800000, float:4.0)
            a74 r8 = defpackage.ge7.P(r8, r9, r10)
            e40 r11 = defpackage.d90.L
            e34 r12 = defpackage.h70.d(r11, r7)
            long r14 = defpackage.ge7.C(r13)
            int r14 = java.lang.Long.hashCode(r14)
            xv4 r15 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            iy0 r9 = defpackage.ix0.b()
            r13.f0()
            boolean r17 = r13.D()
            if (r17 == 0) goto L372
            r13.k(r9)
            goto L375
        L372:
            r13.o0()
        L375:
            pn r9 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r9, r12)
            pn r9 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r9, r15)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            defpackage.i61.x(r13, r9, r13, r13, r8)
            xe7 r8 = defpackage.gi2.I(r13)
            s47 r8 = r8.j
            if (r2 != r0) goto L399
            long r14 = r41.a()
        L396:
            r18 = r14
            goto L39e
        L399:
            long r14 = r41.d()
            goto L396
        L39e:
            oj2 r22 = defpackage.nj2.t()
            r28 = 0
            r29 = 16777210(0xfffffa, float:2.3509879E-38)
            r20 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r17 = r8
            s47 r26 = defpackage.s47.a(r17, r18, r20, r22, r23, r24, r26, r28, r29)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            r9 = 0
            r8 = r10
            r0 = r11
            r10 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r18 = 1090519040(0x41000000, float:8.0)
            r16 = 0
            r19 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r24 = r23
            r23 = 0
            r25 = r24
            r24 = 0
            r28 = r25
            r25 = 0
            r37 = r28
            r28 = 0
            r8 = r32
            r7 = r37
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r13.r()
            r13.r()
            a74 r8 = defpackage.dj6.e(r1, r7)
            defpackage.gi2.h(r13, r8)
            a74 r8 = defpackage.dj6.d(r1)
            a74 r8 = defpackage.u24.g(r8, r5)
            if (r2 != r6) goto L40e
            long r9 = r41.c()
            goto L412
        L40e:
            long r9 = r41.b()
        L412:
            a74 r8 = defpackage.vy7.M(r8, r9)
            if (r2 != r6) goto L427
            long r9 = r41.a()
            r11 = 1069547520(0x3fc00000, float:1.5)
            a74 r5 = defpackage.ak7.I(r8, r11, r9, r5)
        L422:
            r8 = 15
            r9 = 0
            r12 = 0
            goto L432
        L427:
            long r9 = r41.c()
            r11 = 1065353216(0x3f800000, float:1.0)
            a74 r5 = defpackage.ak7.I(r8, r11, r9, r5)
            goto L422
        L432:
            a74 r5 = defpackage.mb3.u(r5, r12, r9, r4, r8)
            r14 = 1092616192(0x41200000, float:10.0)
            r15 = 1094713344(0x41400000, float:12.0)
            a74 r5 = defpackage.ge7.P(r5, r15, r14)
            r9 = r62
            r8 = 48
            l26 r10 = defpackage.k26.a(r9, r3, r13, r8)
            long r11 = defpackage.ge7.C(r13)
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r13.z()
            a74 r5 = defpackage.l.E(r13, r5)
            iy0 r14 = defpackage.ix0.b()
            r13.f0()
            boolean r15 = r13.D()
            if (r15 == 0) goto L467
            r13.k(r14)
            goto L46a
        L467:
            r13.o0()
        L46a:
            pn r14 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r14, r10)
            pn r10 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r10, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            defpackage.i61.x(r13, r10, r13, r13, r5)
            r5 = r63
            r11 = 1065353216(0x3f800000, float:1.0)
            a74 r10 = defpackage.m26.a(r5, r1, r11)
            r11 = r43
            r14 = r61
            r12 = 0
            yt0 r15 = defpackage.wt0.a(r14, r11, r13, r12)
            long r16 = defpackage.ge7.C(r13)
            int r12 = java.lang.Long.hashCode(r16)
            xv4 r8 = r13.z()
            a74 r10 = defpackage.l.E(r13, r10)
            iy0 r7 = defpackage.ix0.b()
            r13.f0()
            boolean r16 = r13.D()
            if (r16 == 0) goto L4b1
            r13.k(r7)
            goto L4b4
        L4b1:
            r13.o0()
        L4b4:
            pn r7 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r7, r15)
            pn r7 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r7, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            defpackage.i61.x(r13, r7, r13, r13, r10)
            r7 = 2131952669(0x7f13041d, float:1.9541787E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r7)
            xe7 r7 = defpackage.gi2.I(r13)
            s47 r47 = r7.a()
            r52 = r49
            long r48 = r41.d()
            r58 = 0
            r59 = 16777210(0xfffffa, float:2.3509879E-38)
            r50 = 0
            r53 = 0
            r54 = 0
            r56 = 0
            s47 r26 = defpackage.s47.a(r47, r48, r50, r52, r53, r54, r56, r58, r59)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            r24 = r9
            r9 = 0
            r43 = r11
            r10 = 0
            r27 = r13
            r12 = 0
            r45 = r14
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r28 = 48
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r62 = r24
            r24 = 0
            r25 = 0
            r60 = r28
            r28 = 0
            r64 = r45
            r4 = r60
            r7 = r62
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r8 = 2131952670(0x7f13041e, float:1.954179E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r8)
            xe7 r9 = defpackage.gi2.I(r13)
            s47 r26 = r9.b()
            long r10 = r41.e()
            r30 = 65530(0xfffa, float:9.1827E-41)
            r9 = 0
            r12 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r13.r()
            y16 r8 = defpackage.z16.b(r35)
            a74 r8 = defpackage.u24.g(r1, r8)
            long r9 = r41.c()
            a74 r8 = defpackage.vy7.M(r8, r9)
            r9 = 1090519040(0x41000000, float:8.0)
            r10 = 1082130432(0x40800000, float:4.0)
            a74 r8 = defpackage.ge7.P(r8, r9, r10)
            r12 = 0
            e34 r9 = defpackage.h70.d(r0, r12)
            long r11 = defpackage.ge7.C(r13)
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            iy0 r14 = defpackage.ix0.b()
            r13.f0()
            boolean r15 = r13.D()
            if (r15 == 0) goto L585
            r13.k(r14)
            goto L588
        L585:
            r13.o0()
        L588:
            pn r14 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r14, r9)
            pn r9 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r9, r12)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            defpackage.i61.x(r13, r9, r13, r13, r8)
            xe7 r8 = defpackage.gi2.I(r13)
            s47 r14 = r8.j
            if (r2 != r6) goto L5ab
            long r8 = r41.a()
        L5a9:
            r15 = r8
            goto L5b0
        L5ab:
            long r8 = r41.d()
            goto L5a9
        L5b0:
            oj2 r19 = defpackage.nj2.t()
            r25 = 0
            r26 = 16777210(0xfffffa, float:2.3509879E-38)
            r17 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            s47 r26 = defpackage.s47.a(r14, r15, r17, r19, r20, r21, r23, r25, r26)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            r9 = 0
            r8 = r10
            r10 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            r6 = r8
            r8 = r34
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r13.r()
            r13.r()
            r14 = 1092616192(0x41200000, float:10.0)
            a74 r8 = defpackage.dj6.e(r1, r14)
            defpackage.gi2.h(r13, r8)
            a74 r8 = defpackage.dj6.d(r1)
            r9 = 0
            r10 = 1
            a74 r8 = defpackage.ge7.Q(r8, r9, r6, r10)
            l26 r10 = defpackage.k26.a(r7, r3, r13, r4)
            long r11 = defpackage.ge7.C(r13)
            int r11 = java.lang.Long.hashCode(r11)
            xv4 r12 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            iy0 r14 = defpackage.ix0.b()
            r13.f0()
            boolean r15 = r13.D()
            if (r15 == 0) goto L62a
            r13.k(r14)
            goto L62d
        L62a:
            r13.o0()
        L62d:
            pn r14 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r14, r10)
            pn r10 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r10, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            defpackage.i61.x(r13, r10, r13, r13, r8)
            r8 = 2131952674(0x7f130422, float:1.9541797E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r8)
            xe7 r10 = defpackage.gi2.I(r13)
            s47 r14 = r10.a()
            long r15 = r41.d()
            r25 = 0
            r26 = 16777214(0xfffffe, float:2.3509884E-38)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            s47 r26 = defpackage.s47.a(r14, r15, r17, r19, r20, r21, r23, r25, r26)
            r10 = r9
            r11 = 1065353216(0x3f800000, float:1.0)
            a74 r9 = defpackage.m26.a(r5, r1, r11)
            r29 = 0
            r30 = 65532(0xfffc, float:9.183E-41)
            r12 = r10
            r10 = 0
            r14 = r12
            r27 = r13
            r12 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r24 = r23
            r23 = 0
            r25 = r24
            r24 = 0
            r28 = r25
            r25 = 0
            r32 = r28
            r28 = 0
            r4 = r32
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8 = r67
            boolean r9 = r8.e
            java.lang.Integer r10 = r8.a
            r11 = r9
            long r8 = r41.a()
            r14 = r10
            r13 = r11
            r12 = r41
            long r10 = r12.m
            long r15 = r12.f()
            r17 = r15
            r16 = r14
            long r14 = r12.n
            r65 = r17
            r18 = r13
            r12 = r65
            r17 = 996(0x3e4, float:1.396E-42)
            r32 = r16
            r16 = r27
            rf1 r12 = defpackage.nj2.i(r8, r10, r12, r14, r16, r17)
            int r8 = r33 >> 9
            r14 = r8 & 112(0x70, float:1.57E-43)
            r15 = 28
            r10 = 0
            r11 = 0
            r9 = r71
            r8 = r18
            r13 = r27
            defpackage.bx6.a(r8, r9, r10, r11, r12, r13, r14, r15)
            r13.r()
            a74 r8 = defpackage.dj6.d(r1)
            r10 = 1
            a74 r8 = defpackage.ge7.Q(r8, r4, r6, r10)
            r9 = 48
            l26 r10 = defpackage.k26.a(r7, r3, r13, r9)
            long r11 = defpackage.ge7.C(r13)
            int r9 = java.lang.Long.hashCode(r11)
            xv4 r11 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            iy0 r12 = defpackage.ix0.b()
            r13.f0()
            boolean r14 = r13.D()
            if (r14 == 0) goto L719
            r13.k(r12)
            goto L71c
        L719:
            r13.o0()
        L71c:
            pn r12 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r12, r10)
            pn r10 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r10, r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            defpackage.i61.x(r13, r9, r13, r13, r8)
            r8 = 2131952675(0x7f130423, float:1.95418E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r8)
            xe7 r9 = defpackage.gi2.I(r13)
            s47 r14 = r9.a()
            long r15 = r41.d()
            r25 = 0
            r26 = 16777214(0xfffffe, float:2.3509884E-38)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            s47 r26 = defpackage.s47.a(r14, r15, r17, r19, r20, r21, r23, r25, r26)
            r11 = 1065353216(0x3f800000, float:1.0)
            a74 r9 = defpackage.m26.a(r5, r1, r11)
            r29 = 0
            r30 = 65532(0xfffc, float:9.183E-41)
            r10 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8 = r67
            boolean r9 = r8.f
            r10 = r9
            long r8 = r41.a()
            r11 = r41
            long r12 = r11.m
            r14 = r12
            long r12 = r11.f()
            r16 = r14
            long r14 = r11.n
            r65 = r16
            r16 = r10
            r10 = r65
            r17 = 996(0x3e4, float:1.396E-42)
            r18 = r16
            r16 = r27
            rf1 r12 = defpackage.nj2.i(r8, r10, r12, r14, r16, r17)
            int r8 = r33 >> 12
            r14 = r8 & 112(0x70, float:1.57E-43)
            r15 = 28
            r10 = 0
            r11 = 0
            r9 = r72
            r8 = r18
            r13 = r27
            defpackage.bx6.a(r8, r9, r10, r11, r12, r13, r14, r15)
            r13.r()
            a74 r8 = defpackage.dj6.d(r1)
            r10 = 1
            a74 r8 = defpackage.ge7.Q(r8, r4, r6, r10)
            r9 = 48
            l26 r10 = defpackage.k26.a(r7, r3, r13, r9)
            long r11 = defpackage.ge7.C(r13)
            int r9 = java.lang.Long.hashCode(r11)
            xv4 r11 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            iy0 r12 = defpackage.ix0.b()
            r13.f0()
            boolean r14 = r13.D()
            if (r14 == 0) goto L7e7
            r13.k(r12)
            goto L7ea
        L7e7:
            r13.o0()
        L7ea:
            pn r12 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r12, r10)
            pn r10 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r10, r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            defpackage.i61.x(r13, r9, r13, r13, r8)
            r8 = 2131952671(0x7f13041f, float:1.9541791E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r8)
            xe7 r9 = defpackage.gi2.I(r13)
            s47 r14 = r9.a()
            long r15 = r41.d()
            r25 = 0
            r26 = 16777214(0xfffffe, float:2.3509884E-38)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            s47 r26 = defpackage.s47.a(r14, r15, r17, r19, r20, r21, r23, r25, r26)
            r11 = 1065353216(0x3f800000, float:1.0)
            a74 r9 = defpackage.m26.a(r5, r1, r11)
            r29 = 0
            r30 = 65532(0xfffc, float:9.183E-41)
            r10 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            gu r8 = new gu
            i r9 = new i
            r10 = 1
            r9.<init>(r10)
            r8.<init>(r6, r10, r9)
            r9 = 54
            l26 r8 = defpackage.k26.a(r8, r3, r13, r9)
            long r9 = defpackage.ge7.C(r13)
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r13.z()
            a74 r11 = defpackage.l.E(r13, r1)
            iy0 r12 = defpackage.ix0.b()
            r13.f0()
            boolean r14 = r13.D()
            if (r14 == 0) goto L87f
            r13.k(r12)
            goto L882
        L87f:
            r13.o0()
        L882:
            pn r12 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r12, r8)
            pn r8 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r8, r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            defpackage.i61.x(r13, r8, r13, r13, r11)
            r8 = 1107296256(0x42000000, float:32.0)
            a74 r9 = defpackage.dj6.i(r1, r8)
            y16 r10 = defpackage.z16.c()
            a74 r9 = defpackage.u24.g(r9, r10)
            long r10 = r41.c()
            a74 r9 = defpackage.vy7.M(r9, r10)
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r33 & r10
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r10 != r11) goto L8b7
            r14 = 1
            goto L8b8
        L8b7:
            r14 = 0
        L8b8:
            r12 = r33 & 14
            r15 = 4
            if (r12 != r15) goto L8bf
            r15 = 1
            goto L8c0
        L8bf:
            r15 = 0
        L8c0:
            r14 = r14 | r15
            java.lang.Object r15 = r13.P()
            vs0 r4 = defpackage.ox0.a
            if (r14 != 0) goto L8d2
            if (r15 != r4) goto L8cc
            goto L8d2
        L8cc:
            r8 = 0
            r14 = r67
            r6 = r73
            goto L8df
        L8d2:
            l73 r15 = new l73
            r8 = 0
            r14 = r67
            r6 = r73
            r15.<init>(r6, r14, r8)
            r13.l0(r15)
        L8df:
            on2 r15 = (defpackage.on2) r15
            r2 = 0
            r11 = 15
            a74 r9 = defpackage.mb3.u(r9, r8, r2, r15, r11)
            e40 r2 = defpackage.d90.Z
            e34 r11 = defpackage.h70.d(r2, r8)
            long r15 = defpackage.ge7.C(r13)
            int r8 = java.lang.Long.hashCode(r15)
            xv4 r15 = r13.z()
            a74 r9 = defpackage.l.E(r13, r9)
            r16 = r8
            iy0 r8 = defpackage.ix0.b()
            r13.f0()
            boolean r17 = r13.D()
            if (r17 == 0) goto L911
            r13.k(r8)
            goto L914
        L911:
            r13.o0()
        L914:
            pn r8 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r8, r11)
            pn r8 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r8, r15)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            defpackage.i61.x(r13, r8, r13, r13, r9)
            xe7 r8 = defpackage.gi2.I(r13)
            s47 r15 = r8.a()
            long r16 = r41.d()
            oj2 r20 = defpackage.nj2.p()
            r26 = 0
            r27 = 16777210(0xfffffa, float:2.3509879E-38)
            r18 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            s47 r26 = defpackage.s47.a(r15, r16, r18, r20, r21, r22, r24, r26, r27)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            java.lang.String r8 = "-"
            r9 = 0
            r15 = r10
            r10 = 0
            r16 = r12
            r27 = r13
            r12 = 0
            r14 = 0
            r17 = r15
            r15 = 0
            r19 = r16
            r18 = r17
            r16 = 0
            r20 = r18
            r18 = 0
            r22 = r19
            r21 = r20
            r19 = 0
            r23 = r21
            r21 = 0
            r24 = r22
            r22 = 0
            r25 = r23
            r23 = 0
            r28 = r24
            r24 = 0
            r37 = r25
            r25 = 0
            r42 = r28
            r28 = 6
            r75 = r37
            r37 = r3
            r3 = r75
            r75 = r2
            r63 = r5
            r62 = r7
            r7 = r42
            r2 = 1107296256(0x42000000, float:32.0)
            r5 = r67
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r13.r()
            y16 r8 = defpackage.z16.b(r35)
            a74 r8 = defpackage.u24.g(r1, r8)
            long r9 = r41.b()
            a74 r8 = defpackage.vy7.M(r8, r9)
            r10 = 1082130432(0x40800000, float:4.0)
            r14 = 1092616192(0x41200000, float:10.0)
            a74 r8 = defpackage.ge7.P(r8, r14, r10)
            r12 = 0
            e34 r0 = defpackage.h70.d(r0, r12)
            long r9 = defpackage.ge7.C(r13)
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r13.z()
            a74 r8 = defpackage.l.E(r13, r8)
            iy0 r11 = defpackage.ix0.b()
            r13.f0()
            boolean r12 = r13.D()
            if (r12 == 0) goto L9df
            r13.k(r11)
            goto L9e2
        L9df:
            r13.o0()
        L9e2:
            pn r11 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r11, r0)
            pn r0 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r0, r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            defpackage.i61.x(r13, r0, r13, r13, r8)
            java.util.Locale r0 = java.util.Locale.US
            float r8 = r5.g
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            float r8 = defpackage.gi2.p(r8, r10, r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r10 = 1
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
            java.lang.String r9 = "%.2f"
            java.lang.String r8 = java.lang.String.format(r0, r9, r8)
            xe7 r0 = defpackage.gi2.I(r13)
            s47 r14 = r0.j
            long r15 = r41.a()
            oj2 r19 = defpackage.nj2.p()
            r25 = 0
            r26 = 16777210(0xfffffa, float:2.3509879E-38)
            r17 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            s47 r26 = defpackage.s47.a(r14, r15, r17, r19, r20, r21, r23, r25, r26)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            r9 = 0
            r10 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r13.r()
            a74 r0 = defpackage.dj6.i(r1, r2)
            y16 r2 = defpackage.z16.c()
            a74 r0 = defpackage.u24.g(r0, r2)
            long r8 = r41.c()
            a74 r0 = defpackage.vy7.M(r0, r8)
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r3 != r11) goto La75
            r14 = 1
        La73:
            r15 = 4
            goto La77
        La75:
            r14 = 0
            goto La73
        La77:
            if (r7 != r15) goto La7b
            r2 = 1
            goto La7c
        La7b:
            r2 = 0
        La7c:
            r2 = r2 | r14
            java.lang.Object r3 = r13.P()
            if (r2 != 0) goto La85
            if (r3 != r4) goto La8e
        La85:
            l73 r3 = new l73
            r10 = 1
            r3.<init>(r6, r5, r10)
            r13.l0(r3)
        La8e:
            on2 r3 = (defpackage.on2) r3
            r2 = 0
            r8 = 15
            r12 = 0
            a74 r0 = defpackage.mb3.u(r0, r12, r2, r3, r8)
            r3 = r75
            e34 r3 = defpackage.h70.d(r3, r12)
            long r7 = defpackage.ge7.C(r13)
            int r4 = java.lang.Long.hashCode(r7)
            xv4 r7 = r13.z()
            a74 r0 = defpackage.l.E(r13, r0)
            iy0 r8 = defpackage.ix0.b()
            r13.f0()
            boolean r9 = r13.D()
            if (r9 == 0) goto Labf
            r13.k(r8)
            goto Lac2
        Labf:
            r13.o0()
        Lac2:
            pn r8 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r8, r3)
            pn r3 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r3, r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            defpackage.i61.x(r13, r3, r13, r13, r0)
            xe7 r0 = defpackage.gi2.I(r13)
            s47 r14 = r0.a()
            long r15 = r41.d()
            oj2 r19 = defpackage.nj2.p()
            r25 = 0
            r26 = 16777210(0xfffffa, float:2.3509879E-38)
            r17 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            s47 r26 = defpackage.s47.a(r14, r15, r17, r19, r20, r21, r23, r25, r26)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            java.lang.String r8 = "+"
            r9 = 0
            r10 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 6
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            r13.r()
            r13.r()
            r13.r()
            a74 r0 = defpackage.dj6.d(r1)
            r3 = 1
            r8 = 1082130432(0x40800000, float:4.0)
            r10 = 0
            a74 r0 = defpackage.ge7.Q(r0, r10, r8, r3)
            r4 = r37
            r7 = r62
            r9 = 48
            l26 r4 = defpackage.k26.a(r7, r4, r13, r9)
            long r7 = defpackage.ge7.C(r13)
            int r7 = java.lang.Long.hashCode(r7)
            xv4 r8 = r13.z()
            a74 r0 = defpackage.l.E(r13, r0)
            iy0 r9 = defpackage.ix0.b()
            r13.f0()
            boolean r10 = r13.D()
            if (r10 == 0) goto Lb5d
            r13.k(r9)
            goto Lb60
        Lb5d:
            r13.o0()
        Lb60:
            pn r9 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r9, r4)
            pn r4 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r4, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            defpackage.i61.x(r13, r4, r13, r13, r0)
            r0 = r63
            r11 = 1065353216(0x3f800000, float:1.0)
            a74 r0 = defpackage.m26.a(r0, r1, r11)
            r7 = r43
            r14 = r64
            r1 = 0
            yt0 r4 = defpackage.wt0.a(r14, r7, r13, r1)
            long r7 = defpackage.ge7.C(r13)
            int r7 = java.lang.Long.hashCode(r7)
            xv4 r8 = r13.z()
            a74 r0 = defpackage.l.E(r13, r0)
            iy0 r9 = defpackage.ix0.b()
            r13.f0()
            boolean r10 = r13.D()
            if (r10 == 0) goto Lba7
            r13.k(r9)
            goto Lbaa
        Lba7:
            r13.o0()
        Lbaa:
            pn r9 = defpackage.ix0.d()
            defpackage.yh2.K(r13, r9, r4)
            pn r4 = defpackage.ix0.f()
            defpackage.yh2.K(r13, r4, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            defpackage.i61.x(r13, r4, r13, r13, r0)
            r0 = 2131952672(0x7f130420, float:1.9541793E38)
            java.lang.String r8 = defpackage.yh2.O(r13, r0)
            xe7 r0 = defpackage.gi2.I(r13)
            s47 r14 = r0.a()
            long r15 = r41.d()
            r25 = 0
            r26 = 16777214(0xfffffe, float:2.3509884E-38)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            s47 r26 = defpackage.s47.a(r14, r15, r17, r19, r20, r21, r23, r25, r26)
            r29 = 0
            r30 = 65534(0xfffe, float:9.1833E-41)
            r9 = 0
            r10 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = r27
            boolean r0 = r5.b
            if (r0 == 0) goto Lc3d
            r0 = -271924794(0xffffffffefcac1c6, float:-1.2550046E29)
            r13.b0(r0)
            if (r32 == 0) goto Lc1d
            int r0 = r32.intValue()
            java.lang.String r10 = java.lang.String.valueOf(r0)
            goto Lc1e
        Lc1d:
            r10 = r2
        Lc1e:
            if (r10 != 0) goto Lc31
            r0 = -424412431(0xffffffffe6b3faf1, float:-4.2496633E23)
            r13.b0(r0)
            r0 = 2131952676(0x7f130424, float:1.9541801E38)
            java.lang.String r10 = defpackage.yh2.O(r13, r0)
        Lc2d:
            r13.s()
            goto Lc38
        Lc31:
            r0 = -424413764(0xffffffffe6b3f5bc, float:-4.249183E23)
            r13.b0(r0)
            goto Lc2d
        Lc38:
            r13.s()
        Lc3b:
            r8 = r10
            goto Lc4e
        Lc3d:
            r0 = -271806963(0xffffffffefcc8e0d, float:-1.2661334E29)
            r13.b0(r0)
            r0 = 2131952666(0x7f13041a, float:1.9541781E38)
            java.lang.String r10 = defpackage.yh2.O(r13, r0)
            r13.s()
            goto Lc3b
        Lc4e:
            xe7 r0 = defpackage.gi2.I(r13)
            s47 r26 = r0.b()
            long r10 = r41.e()
            r29 = 0
            r30 = 65530(0xfffa, float:9.1827E-41)
            r9 = 0
            r27 = r13
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            defpackage.x37.b(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r27.r()
            boolean r0 = r5.b
            if (r32 == 0) goto Lc83
            r1 = r3
        Lc83:
            long r8 = r41.a()
            r11 = r41
            long r2 = r11.m
            long r12 = r11.f()
            long r14 = r11.n
            r17 = 996(0x3e4, float:1.396E-42)
            r10 = r2
            r16 = r27
            rf1 r12 = defpackage.nj2.i(r8, r10, r12, r14, r16, r17)
            int r2 = r33 >> 18
            r14 = r2 & 112(0x70, float:1.57E-43)
            r15 = 20
            r10 = 0
            r9 = r74
            r8 = r0
            r11 = r1
            r13 = r27
            defpackage.bx6.a(r8, r9, r10, r11, r12, r13, r14, r15)
            r27.r()
            r27.r()
            goto Lcb8
        Lcb1:
            r5 = r1
            r6 = r7
            r27 = r13
            r27.V()
        Lcb8:
            cf5 r10 = r27.t()
            if (r10 == 0) goto Lcd6
            m73 r0 = new m73
            r2 = r68
            r3 = r69
            r4 = r70
            r8 = r74
            r9 = r76
            r1 = r5
            r7 = r6
            r5 = r71
            r6 = r72
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.e(r0)
        Lcd6:
            return
    }

    public static final void f(java.lang.String r27, defpackage.on2 r28, defpackage.px0 r29, int r30) {
            r0 = r27
            r1 = r28
            r5 = r29
            xq2 r5 = (defpackage.xq2) r5
            r2 = -1858542056(0xffffffff9138e618, float:-1.4585944E-28)
            r5.d0(r2)
            boolean r2 = r5.f(r0)
            if (r2 == 0) goto L16
            r2 = 4
            goto L17
        L16:
            r2 = 2
        L17:
            r2 = r30 | r2
            boolean r3 = r5.h(r1)
            if (r3 == 0) goto L22
            r3 = 32
            goto L24
        L22:
            r3 = 16
        L24:
            r23 = r2 | r3
            r2 = r23 & 19
            r3 = 18
            r4 = 0
            r6 = 1
            if (r2 == r3) goto L30
            r2 = r6
            goto L31
        L30:
            r2 = r4
        L31:
            r3 = r23 & 1
            boolean r2 = r5.S(r3, r2)
            if (r2 == 0) goto L154
            lc2 r2 = defpackage.dj6.c
            nq6 r3 = defpackage.vt0.a
            java.lang.Object r3 = r5.j(r3)
            ut0 r3 = (defpackage.ut0) r3
            long r7 = r3.a()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            long r7 = defpackage.kt0.c(r3, r7)
            jy2 r3 = defpackage.u24.m
            a74 r2 = defpackage.vy7.L(r2, r7, r3)
            java.lang.Object r3 = r5.P()
            vs0 r7 = defpackage.ox0.a
            if (r3 != r7) goto L66
            ns1 r3 = new ns1
            r7 = 20
            r3.<init>(r7)
            r5.l0(r3)
        L66:
            on2 r3 = (defpackage.on2) r3
            r7 = 0
            r8 = 14
            a74 r2 = defpackage.mb3.u(r2, r6, r7, r3, r8)
            e40 r3 = defpackage.d90.L
            e34 r3 = defpackage.h70.d(r3, r4)
            long r9 = r5.T
            int r4 = java.lang.Long.hashCode(r9)
            xv4 r7 = r5.l()
            a74 r2 = defpackage.l.E(r5, r2)
            ix0 r9 = defpackage.jx0.i
            r9.getClass()
            iy0 r9 = defpackage.ix0.b
            r5.f0()
            boolean r10 = r5.S
            if (r10 == 0) goto L95
            r5.k(r9)
            goto L98
        L95:
            r5.o0()
        L98:
            pn r10 = defpackage.ix0.f
            defpackage.yh2.K(r5, r10, r3)
            pn r3 = defpackage.ix0.e
            defpackage.yh2.K(r5, r3, r7)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            pn r7 = defpackage.ix0.g
            defpackage.yh2.K(r5, r7, r4)
            ne r4 = defpackage.ix0.h
            defpackage.yh2.F(r5, r4)
            pn r11 = defpackage.ix0.d
            defpackage.yh2.K(r5, r11, r2)
            vs0 r2 = defpackage.vs0.Y
            e40 r12 = defpackage.d90.Z
            x64 r13 = defpackage.x64.a
            a74 r2 = r2.n(r13, r12)
            c40 r12 = defpackage.d90.l0
            eu r14 = defpackage.ju.c
            r15 = 48
            yt0 r12 = defpackage.wt0.a(r14, r12, r5, r15)
            long r14 = r5.T
            int r14 = java.lang.Long.hashCode(r14)
            xv4 r15 = r5.l()
            a74 r2 = defpackage.l.E(r5, r2)
            r5.f0()
            boolean r6 = r5.S
            if (r6 == 0) goto Le2
            r5.k(r9)
            goto Le5
        Le2:
            r5.o0()
        Le5:
            defpackage.yh2.K(r5, r10, r12)
            defpackage.yh2.K(r5, r3, r15)
            defpackage.i61.w(r14, r5, r7, r5, r4)
            defpackage.yh2.K(r5, r11, r2)
            nq6 r2 = defpackage.ye7.b
            java.lang.Object r2 = r5.j(r2)
            xe7 r2 = (defpackage.xe7) r2
            s47 r2 = r2.f
            r20 = r23 & 14
            r21 = 0
            r22 = 65534(0xfffe, float:9.1833E-41)
            r1 = 0
            r18 = r2
            r2 = 0
            r19 = r5
            r4 = 0
            r6 = 0
            r7 = 0
            r10 = r8
            r8 = 0
            r11 = r10
            r10 = 0
            r14 = r11
            r11 = 0
            r15 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r24 = r16
            r16 = 0
            r25 = r17
            r17 = 0
            r26 = r25
            defpackage.x37.b(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8 = r0
            r5 = r19
            r0 = 1098907648(0x41800000, float:16.0)
            r15 = r26
            a74 r0 = defpackage.dj6.e(r15, r0)
            defpackage.gi2.h(r5, r0)
            int r0 = r23 >> 3
            r0 = r0 & 14
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r0 | r1
            r7 = 510(0x1fe, float:7.15E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            zv0 r4 = defpackage.jw0.d
            r0 = r28
            defpackage.mb3.o(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            r5.p(r1)
            r5.p(r1)
            goto L15a
        L154:
            r8 = r0
            r0 = r1
            r1 = r6
            r5.V()
        L15a:
            cf5 r2 = r5.t()
            if (r2 == 0) goto L169
            in2 r3 = new in2
            r4 = r30
            r3.<init>(r8, r0, r4, r1)
            r2.d = r3
        L169:
            return
    }

    public static final java.lang.String g(int r3) {
            java.lang.String r0 = android.view.MotionEvent.axisToString(r3)
            r0.getClass()
            java.lang.String r1 = "AXIS_"
            java.lang.String r2 = ""
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            java.lang.String r1 = "_"
            java.lang.String r2 = " "
            java.lang.String r0 = defpackage.xs6.e0(r0, r1, r2)
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " (#"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
