package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e11  reason: default package */
/* loaded from: classes.dex */
public abstract class e11 {
    public static final long a = 0;
    public static final /* synthetic */ int b = 0;

    static {
            r0 = 4060612362(0xf208070a, double:2.006209069E-314)
            long r0 = defpackage.hv.c(r0)
            defpackage.e11.a = r0
            return
    }

    public static final void a(java.lang.String r44, java.util.ArrayList r45, defpackage.qn2 r46, defpackage.on2 r47, defpackage.px0 r48, int r49) {
            r2 = r45
            r46.getClass()
            r47.getClass()
            r7 = r48
            xq2 r7 = (defpackage.xq2) r7
            r0 = 186119708(0xb17f61c, float:2.9266694E-32)
            r7.d0(r0)
            r1 = r44
            boolean r0 = r7.f(r1)
            r3 = 2
            if (r0 == 0) goto L1d
            r0 = 4
            goto L1e
        L1d:
            r0 = r3
        L1e:
            r0 = r49 | r0
            boolean r4 = r7.h(r2)
            if (r4 == 0) goto L29
            r4 = 32
            goto L2b
        L29:
            r4 = 16
        L2b:
            r0 = r0 | r4
            r5 = r46
            boolean r4 = r7.h(r5)
            if (r4 == 0) goto L37
            r4 = 256(0x100, float:3.59E-43)
            goto L39
        L37:
            r4 = 128(0x80, float:1.8E-43)
        L39:
            r0 = r0 | r4
            r4 = r47
            boolean r6 = r7.h(r4)
            if (r6 == 0) goto L45
            r6 = 2048(0x800, float:2.87E-42)
            goto L47
        L45:
            r6 = 1024(0x400, float:1.435E-42)
        L47:
            r0 = r0 | r6
            r6 = r0 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            r9 = 0
            r10 = 1
            if (r6 == r8) goto L52
            r6 = r10
            goto L53
        L52:
            r6 = r9
        L53:
            r8 = r0 & 1
            boolean r6 = r7.S(r8, r6)
            if (r6 == 0) goto L64a
            boolean r6 = r7.f(r2)
            java.lang.Object r8 = r7.P()
            if (r6 != 0) goto L69
            vs0 r6 = defpackage.ox0.a
            if (r8 != r6) goto L63d
        L69:
            java.util.ArrayList r8 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ht0.v0(r2, r6)
            r8.<init>(r6)
            int r6 = r2.size()
            r11 = r9
        L79:
            if (r11 >= r6) goto L63a
            java.lang.Object r12 = r2.get(r11)
            int r11 = r11 + 1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = ": "
            java.lang.String[] r13 = new java.lang.String[]{r13}
            java.util.List r12 = defpackage.qs6.K0(r12, r13, r3)
            java.lang.Object r13 = r12.get(r9)
            java.lang.String r13 = (java.lang.String) r13
            int r14 = r12.size()
            if (r14 != r3) goto La0
            java.lang.Object r12 = r12.get(r10)
            java.lang.String r12 = (java.lang.String) r12
            goto La1
        La0:
            r12 = 0
        La1:
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r14 = r13.toLowerCase(r14)
            r14.getClass()
            java.lang.String r15 = "mapping"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto Lca
            java.lang.String r15 = "назнач"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto Lca
            java.lang.String r15 = "кноп"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto Lca
            java.lang.String r15 = "клавиш"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 == 0) goto Lce
        Lca:
            r14 = r10
            r10 = r9
            goto L616
        Lce:
            java.lang.String r15 = "layout"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L478
            java.lang.String r15 = "расклад"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L478
            java.lang.String r15 = "управлен"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L478
            java.lang.String r15 = "экранн"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 == 0) goto Lf0
            goto L478
        Lf0:
            java.lang.String r15 = "dual"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L46b
            java.lang.String r15 = "двух"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L46b
            java.lang.String r15 = "экран"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 == 0) goto L10a
            goto L46b
        L10a:
            java.lang.String r15 = "filter"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L34c
            java.lang.String r15 = "фильтр"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 == 0) goto L11c
            goto L34c
        L11c:
            java.lang.String r15 = "preset"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L264
            java.lang.String r15 = "пресет"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 == 0) goto L12e
            goto L264
        L12e:
            java.lang.String r15 = "parameter"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L257
            java.lang.String r15 = "параметр"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 == 0) goto L140
            goto L257
        L140:
            java.lang.String r15 = "mic"
            boolean r15 = defpackage.qs6.j0(r14, r15, r9)
            if (r15 != 0) goto L161
            java.lang.String r15 = "микрофон"
            boolean r14 = defpackage.qs6.j0(r14, r15, r9)
            if (r14 == 0) goto L151
            goto L161
        L151:
            e33 r3 = defpackage.ej2.H()
            vr4 r14 = new vr4
            java.lang.String r15 = "Параметры и конфигурация для текущей игры"
            r14.<init>(r3, r15)
            r3 = r14
            r14 = r10
            r10 = r9
            goto L621
        L161:
            e33 r14 = defpackage.np2.b
            if (r14 == 0) goto L167
            goto L24c
        L167:
            d33 r24 = new d33
            r32 = 0
            r34 = 96
            java.lang.String r25 = "Filled.Mic"
            r26 = 1103101952(0x41c00000, float:24.0)
            r27 = 1103101952(0x41c00000, float:24.0)
            r28 = 1103101952(0x41c00000, float:24.0)
            r29 = 1103101952(0x41c00000, float:24.0)
            r30 = 0
            r33 = 0
            r24.<init>(r25, r26, r27, r28, r29, r30, r32, r33, r34)
            r14 = r24
            int r15 = defpackage.el7.a
            cn6 r15 = new cn6
            long r3 = defpackage.kt0.b
            r15.<init>(r3)
            ww2 r3 = new ww2
            r3.<init>(r10, r9)
            r4 = 1094713344(0x41400000, float:12.0)
            r10 = 1096810496(0x41600000, float:14.0)
            r3.o(r4, r10)
            r29 = 1077894185(0x403f5c29, float:2.99)
            r30 = -1069547520(0xffffffffc0400000, float:-3.0)
            r25 = 1070889697(0x3fd47ae1, float:1.66)
            r26 = 0
            r27 = 1077894185(0x403f5c29, float:2.99)
            r28 = -1079278305(0xffffffffbfab851f, float:-1.34)
            r24 = r3
            r24.i(r25, r26, r27, r28, r29, r30)
            r4 = 1097859072(0x41700000, float:15.0)
            r10 = 1084227584(0x40a00000, float:5.0)
            r3.m(r4, r10)
            r29 = -1069547520(0xffffffffc0400000, float:-3.0)
            r25 = 0
            r26 = -1076593951(0xffffffffbfd47ae1, float:-1.66)
            r27 = -1079278305(0xffffffffbfab851f, float:-1.34)
            r28 = -1069547520(0xffffffffc0400000, float:-3.0)
            r24.i(r25, r26, r27, r28, r29, r30)
            r4 = 1079362191(0x4055c28f, float:3.34)
            r9 = 1091567616(0x41100000, float:9.0)
            r3.p(r9, r4, r9, r10)
            r4 = 1086324736(0x40c00000, float:6.0)
            r3.u(r4)
            r29 = 1077936128(0x40400000, float:3.0)
            r30 = 1077936128(0x40400000, float:3.0)
            r26 = 1070889697(0x3fd47ae1, float:1.66)
            r27 = 1068205343(0x3fab851f, float:1.34)
            r28 = 1077936128(0x40400000, float:3.0)
            r24.i(r25, r26, r27, r28, r29, r30)
            r3.g()
            r4 = 1099589222(0x418a6666, float:17.3)
            r9 = 1093664768(0x41300000, float:11.0)
            r3.o(r4, r9)
            r29 = -1062626918(0xffffffffc0a9999a, float:-5.3)
            r30 = 1084437299(0x40a33333, float:5.1)
            r26 = 1077936128(0x40400000, float:3.0)
            r27 = -1071476900(0xffffffffc0228f5c, float:-2.54)
            r28 = 1084437299(0x40a33333, float:5.1)
            r24.i(r25, r26, r27, r28, r29, r30)
            r4 = 1087792742(0x40d66666, float:6.7)
            r10 = 1096810496(0x41600000, float:14.0)
            r3.p(r4, r10, r4, r9)
            r10 = 1084227584(0x40a00000, float:5.0)
            r3.m(r10, r9)
            r29 = 1086324736(0x40c00000, float:6.0)
            r30 = 1087834685(0x40d70a3d, float:6.72)
            r26 = 1079655793(0x405a3d71, float:3.41)
            r27 = 1076761723(0x402e147b, float:2.72)
            r28 = 1086807081(0x40c75c29, float:6.23)
            r24.i(r25, r26, r27, r28, r29, r30)
            r4 = 1101529088(0x41a80000, float:21.0)
            r3.m(r9, r4)
            r4 = 1073741824(0x40000000, float:2.0)
            r3.l(r4)
            r4 = -1068373115(0xffffffffc051eb85, float:-3.28)
            r3.u(r4)
            r30 = -1059648963(0xffffffffc0d70a3d, float:-6.72)
            r25 = 1079110533(0x4051eb85, float:3.28)
            r26 = -1091190129(0xffffffffbef5c28f, float:-0.48)
            r27 = 1086324736(0x40c00000, float:6.0)
            r28 = -1068289229(0xffffffffc0533333, float:-3.3)
            r24.i(r25, r26, r27, r28, r29, r30)
            r4 = -1076258406(0xffffffffbfd9999a, float:-1.7)
            r3.l(r4)
            r3.g()
            java.util.ArrayList r3 = r3.b
            r4 = 0
            defpackage.d33.a(r14, r3, r4, r15)
            e33 r14 = r14.b()
            defpackage.np2.b = r14
        L24c:
            vr4 r3 = new vr4
            java.lang.String r4 = "Выбор источника звука микрофона DS (микрофон устройства или шум)"
            r3.<init>(r14, r4)
        L253:
            r10 = 0
            r14 = 1
            goto L621
        L257:
            e33 r3 = defpackage.ej2.H()
            vr4 r14 = new vr4
            java.lang.String r4 = "Пользовательские параметры и переменные активного шейдера"
            r14.<init>(r3, r4)
        L262:
            r3 = r14
            goto L253
        L264:
            e33 r3 = defpackage.u24.p
            if (r3 == 0) goto L26a
            goto L343
        L26a:
            d33 r33 = new d33
            r41 = 0
            r43 = 96
            java.lang.String r34 = "Filled.AutoAwesome"
            r35 = 1103101952(0x41c00000, float:24.0)
            r36 = 1103101952(0x41c00000, float:24.0)
            r37 = 1103101952(0x41c00000, float:24.0)
            r38 = 1103101952(0x41c00000, float:24.0)
            r39 = 0
            r42 = 0
            r33.<init>(r34, r35, r36, r37, r38, r39, r41, r42, r43)
            r3 = r33
            int r4 = defpackage.el7.a
            cn6 r4 = new cn6
            long r9 = defpackage.kt0.b
            r4.<init>(r9)
            ww2 r9 = new ww2
            r10 = 0
            r14 = 1
            r9.<init>(r14, r10)
            r10 = 1100480512(0x41980000, float:19.0)
            r14 = 1091567616(0x41100000, float:9.0)
            r9.o(r10, r14)
            r15 = 1067450368(0x3fa00000, float:1.25)
            r14 = -1070596096(0xffffffffc0300000, float:-2.75)
            r9.n(r15, r14)
            r10 = 1084227584(0x40a00000, float:5.0)
            r15 = 1102577664(0x41b80000, float:23.0)
            r9.m(r15, r10)
            r15 = -1080033280(0xffffffffbfa00000, float:-1.25)
            r9.n(r14, r15)
            r10 = 1100480512(0x41980000, float:19.0)
            r14 = 1065353216(0x3f800000, float:1.0)
            r9.m(r10, r14)
            r14 = 1076887552(0x40300000, float:2.75)
            r9.n(r15, r14)
            r10 = 1084227584(0x40a00000, float:5.0)
            r15 = 1097859072(0x41700000, float:15.0)
            r9.m(r15, r10)
            r10 = 1067450368(0x3fa00000, float:1.25)
            r9.n(r14, r10)
            r10 = 1091567616(0x41100000, float:9.0)
            r15 = 1100480512(0x41980000, float:19.0)
            r9.m(r15, r10)
            r9.g()
            r15 = 1094189056(0x41380000, float:11.5)
            r14 = 1092091904(0x41180000, float:9.5)
            r9.o(r15, r14)
            r15 = 1082130432(0x40800000, float:4.0)
            r9.m(r10, r15)
            r15 = 1087373312(0x40d00000, float:6.5)
            r9.m(r15, r14)
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 1094713344(0x41400000, float:12.0)
            r9.m(r14, r15)
            r14 = 1085276160(0x40b00000, float:5.5)
            r15 = 1075838976(0x40200000, float:2.5)
            r9.n(r14, r15)
            r14 = 1101004800(0x41a00000, float:20.0)
            r9.m(r10, r14)
            r10 = -1062207488(0xffffffffc0b00000, float:-5.5)
            r9.n(r15, r10)
            r14 = 1099431936(0x41880000, float:17.0)
            r15 = 1094713344(0x41400000, float:12.0)
            r9.m(r14, r15)
            r14 = -1071644672(0xffffffffc0200000, float:-2.5)
            r9.n(r10, r14)
            r9.g()
            r10 = 1100480512(0x41980000, float:19.0)
            r15 = 1097859072(0x41700000, float:15.0)
            r9.o(r10, r15)
            r1 = -1080033280(0xffffffffbfa00000, float:-1.25)
            r14 = 1076887552(0x40300000, float:2.75)
            r9.n(r1, r14)
            r9.m(r15, r10)
            r15 = 1067450368(0x3fa00000, float:1.25)
            r9.n(r14, r15)
            r14 = 1102577664(0x41b80000, float:23.0)
            r9.m(r10, r14)
            r1 = -1070596096(0xffffffffc0300000, float:-2.75)
            r9.n(r15, r1)
            r9.m(r14, r10)
            r14 = -1080033280(0xffffffffbfa00000, float:-1.25)
            r9.n(r1, r14)
            r15 = 1097859072(0x41700000, float:15.0)
            r9.m(r10, r15)
            r9.g()
            java.util.ArrayList r1 = r9.b
            r10 = 0
            defpackage.d33.a(r3, r1, r10, r4)
            e33 r3 = r3.b()
            defpackage.u24.p = r3
        L343:
            vr4 r14 = new vr4
            java.lang.String r1 = "Выбор файла шейдера RetroArch (.slangp / .glslp)"
            r14.<init>(r3, r1)
            goto L262
        L34c:
            e33 r1 = defpackage.hv.o
            if (r1 == 0) goto L352
            goto L462
        L352:
            d33 r33 = new d33
            r41 = 0
            r43 = 96
            java.lang.String r34 = "Filled.Filter"
            r35 = 1103101952(0x41c00000, float:24.0)
            r36 = 1103101952(0x41c00000, float:24.0)
            r37 = 1103101952(0x41c00000, float:24.0)
            r38 = 1103101952(0x41c00000, float:24.0)
            r39 = 0
            r42 = 0
            r33.<init>(r34, r35, r36, r37, r38, r39, r41, r42, r43)
            r1 = r33
            int r3 = defpackage.el7.a
            cn6 r3 = new cn6
            long r9 = defpackage.kt0.b
            r3.<init>(r9)
            ww2 r4 = new ww2
            r10 = 0
            r14 = 1
            r4.<init>(r14, r10)
            r9 = 1098865705(0x417f5c29, float:15.96)
            r10 = 1092920279(0x4124a3d7, float:10.29)
            r4.o(r9, r10)
            r9 = 1080201052(0x40628f5c, float:3.54)
            r14 = -1070596096(0xffffffffc0300000, float:-2.75)
            r4.n(r14, r9)
            r9 = -1074077368(0xffffffffbffae148, float:-1.96)
            r10 = -1072231875(0xffffffffc0170a3d, float:-2.36)
            r4.n(r9, r10)
            r9 = 1091043328(0x41080000, float:8.5)
            r15 = 1097859072(0x41700000, float:15.0)
            r4.m(r9, r15)
            r9 = 1093664768(0x41300000, float:11.0)
            r4.l(r9)
            r9 = -1067282596(0xffffffffc0628f5c, float:-3.54)
            r10 = -1063864238(0xffffffffc096b852, float:-4.71)
            r4.n(r9, r10)
            r4.g()
            r9 = 1077936128(0x40400000, float:3.0)
            r10 = 1084227584(0x40a00000, float:5.0)
            r4.o(r9, r10)
            r14 = 1065353216(0x3f800000, float:1.0)
            r4.m(r14, r10)
            r10 = 1098907648(0x41800000, float:16.0)
            r4.u(r10)
            r29 = 1073741824(0x40000000, float:2.0)
            r30 = 1073741824(0x40000000, float:2.0)
            r25 = 0
            r26 = 1066192077(0x3f8ccccd, float:1.1)
            r27 = 1063675494(0x3f666666, float:0.9)
            r28 = 1073741824(0x40000000, float:2.0)
            r24 = r4
            r24.i(r25, r26, r27, r28, r29, r30)
            r4.l(r10)
            r10 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.u(r10)
            r10 = 1101529088(0x41a80000, float:21.0)
            r4.m(r9, r10)
            r14 = 1084227584(0x40a00000, float:5.0)
            r4.m(r9, r14)
            r4.g()
            r14 = 1065353216(0x3f800000, float:1.0)
            r4.o(r10, r14)
            r10 = 1088421888(0x40e00000, float:7.0)
            r4.m(r10, r14)
            r29 = -1073741824(0xffffffffc0000000, float:-2.0)
            r25 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r26 = 0
            r27 = -1073741824(0xffffffffc0000000, float:-2.0)
            r28 = 1063675494(0x3f666666, float:0.9)
            r24.i(r25, r26, r27, r28, r29, r30)
            r10 = 1096810496(0x41600000, float:14.0)
            r4.u(r10)
            r29 = 1073741824(0x40000000, float:2.0)
            r25 = 0
            r26 = 1066192077(0x3f8ccccd, float:1.1)
            r27 = 1063675494(0x3f666666, float:0.9)
            r28 = 1073741824(0x40000000, float:2.0)
            r24.i(r25, r26, r27, r28, r29, r30)
            r4.l(r10)
            r30 = -1073741824(0xffffffffc0000000, float:-2.0)
            r25 = 1066192077(0x3f8ccccd, float:1.1)
            r26 = 0
            r27 = 1073741824(0x40000000, float:2.0)
            r28 = -1083808154(0xffffffffbf666666, float:-0.9)
            r24.i(r25, r26, r27, r28, r29, r30)
            r14 = 1102577664(0x41b80000, float:23.0)
            r4.m(r14, r9)
            r29 = -1073741824(0xffffffffc0000000, float:-2.0)
            r25 = 0
            r26 = -1081291571(0xffffffffbf8ccccd, float:-1.1)
            r27 = -1083808154(0xffffffffbf666666, float:-0.9)
            r28 = -1073741824(0xffffffffc0000000, float:-2.0)
            r24.i(r25, r26, r27, r28, r29, r30)
            r4.g()
            r10 = 1101529088(0x41a80000, float:21.0)
            r14 = 1099431936(0x41880000, float:17.0)
            r4.o(r10, r14)
            r10 = 1088421888(0x40e00000, float:7.0)
            r4.m(r10, r14)
            r4.m(r10, r9)
            r10 = 1096810496(0x41600000, float:14.0)
            r4.l(r10)
            r4.u(r10)
            r4.g()
            java.util.ArrayList r4 = r4.b
            r10 = 0
            defpackage.d33.a(r1, r4, r10, r3)
            e33 r1 = r1.b()
            defpackage.hv.o = r1
        L462:
            vr4 r14 = new vr4
            java.lang.String r3 = "Графический фильтр или шейдерная постобработка изображения"
            r14.<init>(r1, r3)
            goto L262
        L46b:
            e33 r1 = defpackage.nj2.v()
            vr4 r14 = new vr4
            java.lang.String r3 = "Распределение экранов DS на внешнем мониторе/ТВ с автосохранением для игры"
            r14.<init>(r1, r3)
            goto L262
        L478:
            e33 r1 = defpackage.kn2.b
            if (r1 == 0) goto L480
            r10 = 0
            r14 = 1
            goto L60e
        L480:
            d33 r16 = new d33
            r24 = 0
            r26 = 96
            r25 = 0
            r18 = 1103101952(0x41c00000, float:24.0)
            r19 = 1103101952(0x41c00000, float:24.0)
            r20 = 1103101952(0x41c00000, float:24.0)
            r21 = 1103101952(0x41c00000, float:24.0)
            r22 = 0
            java.lang.String r17 = "Filled.TouchApp"
            r16.<init>(r17, r18, r19, r20, r21, r22, r24, r25, r26)
            r1 = r16
            int r3 = defpackage.el7.a
            cn6 r3 = new cn6
            long r9 = defpackage.kt0.b
            r3.<init>(r9)
            ww2 r4 = new ww2
            r10 = 0
            r14 = 1
            r4.<init>(r14, r10)
            r9 = 1093916426(0x4133d70a, float:11.24)
            r10 = 1091567616(0x41100000, float:9.0)
            r4.o(r10, r9)
            r9 = 1089470464(0x40f00000, float:7.5)
            r4.t(r9)
            r21 = 1094189056(0x41380000, float:11.5)
            r22 = 1084227584(0x40a00000, float:5.0)
            r17 = 1091567616(0x41100000, float:9.0)
            r18 = 1086576394(0x40c3d70a, float:6.12)
            r19 = 1092742021(0x4121eb85, float:10.12)
            r20 = 1084227584(0x40a00000, float:5.0)
            r16 = r4
            r16.h(r17, r18, r19, r20, r21, r22)
            r9 = 1086576394(0x40c3d70a, float:6.12)
            r10 = 1089470464(0x40f00000, float:7.5)
            r15 = 1096810496(0x41600000, float:14.0)
            r4.p(r15, r9, r15, r10)
            r9 = 1081039913(0x406f5c29, float:3.74)
            r4.u(r9)
            r21 = 1073741824(0x40000000, float:2.0)
            r22 = -1066443735(0xffffffffc06f5c29, float:-3.74)
            r17 = 1067114824(0x3f9ae148, float:1.21)
            r18 = -1085318103(0xffffffffbf4f5c29, float:-0.81)
            r19 = 1073741824(0x40000000, float:2.0)
            r20 = -1072986849(0xffffffffc00b851f, float:-2.18)
            r16.i(r17, r18, r19, r20, r21, r22)
            r21 = 1094189056(0x41380000, float:11.5)
            r22 = 1077936128(0x40400000, float:3.0)
            r17 = 1098907648(0x41800000, float:16.0)
            r18 = 1084248556(0x40a051ec, float:5.01)
            r19 = 1096800010(0x415fd70a, float:13.99)
            r20 = 1077936128(0x40400000, float:3.0)
            r16.h(r17, r18, r19, r20, r21, r22)
            r9 = 1084248556(0x40a051ec, float:5.01)
            r15 = 1088421888(0x40e00000, float:7.0)
            r4.p(r15, r9, r15, r10)
            r21 = 1091567616(0x41100000, float:9.0)
            r22 = 1093916426(0x4133d70a, float:11.24)
            r17 = 1088421888(0x40e00000, float:7.0)
            r18 = 1091630531(0x4110f5c3, float:9.06)
            r19 = 1090078638(0x40f947ae, float:7.79)
            r20 = 1093067080(0x4126e148, float:10.43)
            r16.h(r17, r18, r19, r20, r21, r22)
            r4.g()
            r9 = 1100396626(0x4196b852, float:18.84)
            r10 = 1098771333(0x417deb85, float:15.87)
            r4.o(r9, r10)
            r9 = -1064220754(0xffffffffc09147ae, float:-4.54)
            r10 = -1072651305(0xffffffffc010a3d7, float:-2.26)
            r4.n(r9, r10)
            r21 = -1089847951(0xffffffffbf0a3d71, float:-0.54)
            r22 = -1109309522(0xffffffffbde147ae, float:-0.11)
            r17 = -1104276357(0xffffffffbe2e147b, float:-0.17)
            r18 = -1114678231(0xffffffffbd8f5c29, float:-0.07)
            r19 = -1095552205(0xffffffffbeb33333, float:-0.35)
            r20 = -1109309522(0xffffffffbde147ae, float:-0.11)
            r16.i(r17, r18, r19, r20, r21, r22)
            r9 = 1095761920(0x41500000, float:13.0)
            r4.k(r9)
            r9 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r4.u(r9)
            r21 = 1094189056(0x41380000, float:11.5)
            r22 = 1086324736(0x40c00000, float:6.0)
            r17 = 1095761920(0x41500000, float:13.0)
            r18 = 1087729828(0x40d570a4, float:6.67)
            r19 = 1095059374(0x414547ae, float:12.33)
            r20 = 1086324736(0x40c00000, float:6.0)
            r16.h(r17, r18, r19, r20, r21, r22)
            r9 = 1087729828(0x40d570a4, float:6.67)
            r10 = 1092616192(0x41200000, float:10.0)
            r15 = 1089470464(0x40f00000, float:7.5)
            r4.p(r10, r9, r10, r15)
            r9 = 1093392138(0x412bd70a, float:10.74)
            r4.u(r9)
            r21 = -1066737336(0xffffffffc06ae148, float:-3.67)
            r22 = -1086324736(0xffffffffbf400000, float:-0.75)
            r17 = -1067030938(0xffffffffc0666666, float:-3.6)
            r18 = -1086156964(0xffffffffbf428f5c, float:-0.76)
            r19 = -1067282596(0xffffffffc0628f5c, float:-3.54)
            r20 = -1086324736(0xffffffffbf400000, float:-0.75)
            r16.i(r17, r18, r19, r20, r21, r22)
            r21 = -1085653647(0xffffffffbf4a3d71, float:-0.79)
            r22 = 1051260355(0x3ea8f5c3, float:0.33)
            r17 = -1096894382(0xffffffffbe9eb852, float:-0.31)
            r18 = 0
            r19 = -1089009091(0xffffffffbf170a3d, float:-0.59)
            r20 = 1040522936(0x3e051eb8, float:0.13)
            r16.i(r17, r18, r19, r20, r21, r22)
            r9 = -1085653647(0xffffffffbf4a3d71, float:-0.79)
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            r4.n(r9, r10)
            r9 = 1084101755(0x409e147b, float:4.94)
            r4.n(r9, r9)
            r21 = 1093402624(0x412c0000, float:10.75)
            r22 = 1103101952(0x41c00000, float:24.0)
            r17 = 1092574249(0x411f5c29, float:9.96)
            r18 = 1103012823(0x41bea3d7, float:23.83)
            r19 = 1092972708(0x412570a4, float:10.34)
            r20 = 1103101952(0x41c00000, float:24.0)
            r16.h(r17, r18, r19, r20, r21, r22)
            r9 = 1087981486(0x40d947ae, float:6.79)
            r4.l(r9)
            r21 = 1069044204(0x3fb851ec, float:1.44)
            r22 = -1079781622(0xffffffffbfa3d70a, float:-1.28)
            r17 = 1061158912(0x3f400000, float:0.75)
            r18 = 0
            r19 = 1068121457(0x3faa3d71, float:1.33)
            r20 = -1089680179(0xffffffffbf0ccccd, float:-0.55)
            r16.i(r17, r18, r19, r20, r21, r22)
            r9 = 1061158912(0x3f400000, float:0.75)
            r10 = -1062689833(0xffffffffc0a8a3d7, float:-5.27)
            r4.n(r9, r10)
            r21 = 1017370378(0x3ca3d70a, float:0.02)
            r22 = -1102263091(0xffffffffbe4ccccd, float:-0.2)
            r17 = 1008981770(0x3c23d70a, float:0.01)
            r18 = -1114678231(0xffffffffbd8f5c29, float:-0.07)
            r19 = 1017370378(0x3ca3d70a, float:0.02)
            r20 = -1106289623(0xffffffffbe0f5c29, float:-0.14)
            r16.i(r17, r18, r19, r20, r21, r22)
            r21 = 1100396626(0x4196b852, float:18.84)
            r22 = 1098771333(0x417deb85, float:15.87)
            r17 = 1100873728(0x419e0000, float:19.75)
            r18 = 1099237949(0x41850a3d, float:16.63)
            r19 = 1100674499(0x419af5c3, float:19.37)
            r20 = 1098954834(0x4180b852, float:16.09)
            r16.h(r17, r18, r19, r20, r21, r22)
            r4.g()
            java.util.ArrayList r4 = r4.b
            r10 = 0
            defpackage.d33.a(r1, r4, r10, r3)
            e33 r1 = r1.b()
            defpackage.kn2.b = r1
        L60e:
            vr4 r3 = new vr4
            java.lang.String r4 = "Выбор и редактирование расположения сенсорных кнопок на экране"
            r3.<init>(r1, r4)
            goto L621
        L616:
            e33 r1 = defpackage.ej2.G()
            vr4 r3 = new vr4
            java.lang.String r4 = "Настройка назначения физических кнопок геймпада или клавиатуры"
            r3.<init>(r1, r4)
        L621:
            java.lang.Object r1 = r3.A
            e33 r1 = (defpackage.e33) r1
            java.lang.Object r3 = r3.B
            java.lang.String r3 = (java.lang.String) r3
            d11 r4 = new d11
            r4.<init>(r13, r12, r3, r1)
            r8.add(r4)
            r1 = r44
            r4 = r47
            r9 = r10
            r10 = r14
            r3 = 2
            goto L79
        L63a:
            r7.l0(r8)
        L63d:
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            r8 = r0 & 8078(0x1f8e, float:1.132E-41)
            r3 = r44
            r6 = r47
            b(r3, r4, r5, r6, r7, r8)
            goto L64d
        L64a:
            r7.V()
        L64d:
            cf5 r7 = r7.t()
            if (r7 == 0) goto L663
            p4 r0 = new p4
            r6 = 4
            r1 = r44
            r3 = r46
            r4 = r47
            r5 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L663:
            return
    }

    public static final void b(java.lang.String r60, java.util.List r61, defpackage.qn2 r62, defpackage.on2 r63, defpackage.px0 r64, int r65) {
            r3 = r62
            r4 = r63
            jy2 r0 = defpackage.u24.m
            d40 r1 = defpackage.d90.i0
            c40 r2 = defpackage.d90.k0
            e40 r5 = defpackage.d90.L
            r61.getClass()
            r3.getClass()
            r4.getClass()
            r11 = r64
            xq2 r11 = (defpackage.xq2) r11
            r6 = -950762260(0xffffffffc75484ec, float:-54404.92)
            r11.d0(r6)
            r14 = r60
            boolean r6 = r11.f(r14)
            if (r6 == 0) goto L29
            r6 = 4
            goto L2a
        L29:
            r6 = 2
        L2a:
            r6 = r65 | r6
            r7 = r61
            boolean r8 = r11.h(r7)
            if (r8 == 0) goto L37
            r8 = 32
            goto L39
        L37:
            r8 = 16
        L39:
            r6 = r6 | r8
            boolean r8 = r11.h(r3)
            if (r8 == 0) goto L43
            r8 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r8 = 128(0x80, float:1.8E-43)
        L45:
            r6 = r6 | r8
            boolean r8 = r11.h(r4)
            r12 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L50
            r8 = r12
            goto L52
        L50:
            r8 = 1024(0x400, float:1.435E-42)
        L52:
            r6 = r6 | r8
            r8 = r6 & 1171(0x493, float:1.641E-42)
            r13 = 1170(0x492, float:1.64E-42)
            r14 = 1
            r7 = 0
            if (r8 == r13) goto L5d
            r8 = r14
            goto L5e
        L5d:
            r8 = r7
        L5e:
            r13 = r6 & 1
            boolean r8 = r11.S(r13, r8)
            if (r8 == 0) goto L861
            es7 r8 = defpackage.bl2.F(r11)
            java.lang.Object r13 = r11.P()
            vs0 r9 = defpackage.ox0.a
            if (r13 != r9) goto L7a
            nh2 r13 = new nh2
            r13.<init>()
            r11.l0(r13)
        L7a:
            nh2 r13 = (defpackage.nh2) r13
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != r12) goto L83
            r17 = r14
            goto L85
        L83:
            r17 = r7
        L85:
            java.lang.Object r15 = r11.P()
            r19 = r13
            r13 = 6
            if (r17 != 0) goto L90
            if (r15 != r9) goto L98
        L90:
            x7 r15 = new x7
            r15.<init>(r13, r4)
            r11.l0(r15)
        L98:
            on2 r15 = (defpackage.on2) r15
            defpackage.ge7.b(r7, r15, r11, r7, r14)
            lc2 r15 = defpackage.dj6.c
            long r13 = defpackage.e11.a
            a74 r13 = defpackage.vy7.L(r15, r13, r0)
            java.lang.Object r14 = r11.P()
            r7 = 14
            if (r14 != r9) goto Lb5
            vn0 r14 = new vn0
            r14.<init>(r7)
            r11.l0(r14)
        Lb5:
            qn2 r14 = (defpackage.qn2) r14
            a74 r22 = defpackage.ge7.y(r13, r14)
            java.lang.Object r13 = r11.P()
            if (r13 != r9) goto Lc5
            r94 r13 = defpackage.i61.f(r11)
        Lc5:
            r23 = r13
            r94 r23 = (defpackage.r94) r23
            if (r10 != r12) goto Lcd
            r13 = 1
            goto Lce
        Lcd:
            r13 = 0
        Lce:
            java.lang.Object r14 = r11.P()
            if (r13 != 0) goto Ld6
            if (r14 != r9) goto Ldf
        Ld6:
            x7 r14 = new x7
            r13 = 7
            r14.<init>(r13, r4)
            r11.l0(r14)
        Ldf:
            r27 = r14
            on2 r27 = (defpackage.on2) r27
            r28 = 28
            r24 = 0
            r25 = 0
            r26 = 0
            a74 r13 = defpackage.mb3.t(r22, r23, r24, r25, r26, r27, r28)
            if (r10 != r12) goto Lf3
            r10 = 1
            goto Lf4
        Lf3:
            r10 = 0
        Lf4:
            java.lang.Object r12 = r11.P()
            if (r10 != 0) goto Lff
            if (r12 != r9) goto Lfd
            goto Lff
        Lfd:
            r14 = 2
            goto L108
        Lff:
            m01 r12 = new m01
            r14 = 2
            r12.<init>(r14, r4)
            r11.l0(r12)
        L108:
            qn2 r12 = (defpackage.qn2) r12
            a74 r10 = defpackage.u24.B(r13, r12)
            r12 = 0
            e34 r13 = defpackage.h70.d(r5, r12)
            r12 = r8
            long r7 = r11.T
            int r7 = java.lang.Long.hashCode(r7)
            xv4 r8 = r11.l()
            a74 r10 = defpackage.l.E(r11, r10)
            ix0 r22 = defpackage.jx0.i
            r22.getClass()
            iy0 r14 = defpackage.ix0.b
            r11.f0()
            r23 = r6
            boolean r6 = r11.S
            if (r6 == 0) goto L136
            r11.k(r14)
            goto L139
        L136:
            r11.o0()
        L139:
            pn r6 = defpackage.ix0.f
            defpackage.yh2.K(r11, r6, r13)
            pn r13 = defpackage.ix0.e
            defpackage.yh2.K(r11, r13, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            pn r8 = defpackage.ix0.g
            defpackage.yh2.K(r11, r8, r7)
            ne r7 = defpackage.ix0.h
            defpackage.yh2.F(r11, r7)
            r24 = r12
            pn r12 = defpackage.ix0.d
            defpackage.yh2.K(r11, r12, r10)
            rk7 r10 = defpackage.nc1.o
            a74 r10 = defpackage.nc1.j0(r15, r10)
            java.lang.Object r15 = r11.P()
            r29 = r5
            r5 = 15
            if (r15 != r9) goto L170
            vn0 r15 = new vn0
            r15.<init>(r5)
            r11.l0(r15)
        L170:
            qn2 r15 = (defpackage.qn2) r15
            a74 r30 = defpackage.ge7.y(r10, r15)
            java.lang.Object r10 = r11.P()
            if (r10 != r9) goto L180
            r94 r10 = defpackage.i61.f(r11)
        L180:
            r31 = r10
            r94 r31 = (defpackage.r94) r31
            java.lang.Object r10 = r11.P()
            if (r10 != r9) goto L194
            c5 r10 = new c5
            r15 = 22
            r10.<init>(r15)
            r11.l0(r10)
        L194:
            r35 = r10
            on2 r35 = (defpackage.on2) r35
            r36 = 28
            r32 = 0
            r33 = 0
            r34 = 0
            a74 r10 = defpackage.mb3.t(r30, r31, r32, r33, r34, r35, r36)
            eu r15 = defpackage.ju.c
            r5 = 0
            yt0 r3 = defpackage.wt0.a(r15, r2, r11, r5)
            long r4 = r11.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r11.l()
            a74 r10 = defpackage.l.E(r11, r10)
            r11.f0()
            r25 = r15
            boolean r15 = r11.S
            if (r15 == 0) goto L1c6
            r11.k(r14)
            goto L1c9
        L1c6:
            r11.o0()
        L1c9:
            defpackage.yh2.K(r11, r6, r3)
            defpackage.yh2.K(r11, r13, r5)
            defpackage.i61.w(r4, r11, r8, r11, r7)
            defpackage.yh2.K(r11, r12, r10)
            x64 r3 = defpackage.x64.a
            r4 = 1065353216(0x3f800000, float:1.0)
            a74 r5 = defpackage.dj6.c(r3, r4)
            r15 = 1094713344(0x41400000, float:12.0)
            r10 = 1090519040(0x41000000, float:8.0)
            r4 = 1102053376(0x41b00000, float:22.0)
            a74 r4 = defpackage.ge7.R(r5, r15, r10, r4, r10)
            du r5 = defpackage.ju.a
            r15 = 48
            l26 r10 = defpackage.k26.a(r5, r1, r11, r15)
            r32 = r1
            r33 = r2
            long r1 = r11.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r11.l()
            a74 r4 = defpackage.l.E(r11, r4)
            r11.f0()
            boolean r15 = r11.S
            if (r15 == 0) goto L20c
            r11.k(r14)
            goto L20f
        L20c:
            r11.o0()
        L20f:
            defpackage.yh2.K(r11, r6, r10)
            defpackage.yh2.K(r11, r13, r2)
            defpackage.i61.w(r1, r11, r8, r11, r7)
            defpackage.yh2.K(r11, r12, r4)
            r1 = 1108869120(0x42180000, float:38.0)
            a74 r1 = defpackage.dj6.i(r3, r1)
            y16 r2 = defpackage.z16.a
            a74 r1 = defpackage.u24.g(r1, r2)
            java.lang.Object r2 = r11.P()
            if (r2 != r9) goto L238
            vn0 r2 = new vn0
            r4 = 16
            r2.<init>(r4)
            r11.l0(r2)
            goto L23a
        L238:
            r4 = 16
        L23a:
            qn2 r2 = (defpackage.qn2) r2
            a74 r1 = defpackage.ge7.y(r1, r2)
            r2 = 0
            r15 = r63
            r4 = 0
            r10 = 15
            a74 r1 = defpackage.mb3.u(r1, r4, r2, r15, r10)
            e40 r10 = defpackage.d90.Z
            e34 r10 = defpackage.h70.d(r10, r4)
            r34 = r5
            long r4 = r11.T
            int r4 = java.lang.Long.hashCode(r4)
            xv4 r5 = r11.l()
            a74 r1 = defpackage.l.E(r11, r1)
            r11.f0()
            r35 = r2
            boolean r2 = r11.S
            if (r2 == 0) goto L26d
            r11.k(r14)
            goto L270
        L26d:
            r11.o0()
        L270:
            defpackage.yh2.K(r11, r6, r10)
            defpackage.yh2.K(r11, r13, r5)
            defpackage.i61.w(r4, r11, r8, r11, r7)
            defpackage.yh2.K(r11, r12, r1)
            r1 = r6
            e33 r6 = defpackage.jw2.q()
            int r2 = defpackage.kt0.i
            r2 = r9
            long r9 = defpackage.kt0.d
            r4 = 1101004800(0x41a00000, float:20.0)
            r5 = r8
            a74 r8 = defpackage.dj6.i(r3, r4)
            r36 = r12
            r12 = 3504(0xdb0, float:4.91E-42)
            r37 = r13
            r13 = 0
            r38 = r7
            r7 = 0
            r39 = r1
            r44 = r2
            r41 = r5
            r5 = r19
            r1 = r23
            r2 = r24
            r43 = r36
            r40 = r37
            r42 = r38
            r16 = 16
            r37 = 14
            defpackage.i13.a(r6, r7, r8, r9, r11, r12, r13)
            r17 = r9
            r6 = 1
            r11.p(r6)
            r7 = 1092616192(0x41200000, float:10.0)
            a74 r8 = defpackage.dj6.l(r3, r7)
            defpackage.gi2.h(r11, r8)
            r8 = r6
            e33 r6 = defpackage.ej2.H()
            long r9 = r2.j
            long r12 = r2.j
            a74 r2 = defpackage.dj6.i(r3, r4)
            r19 = r12
            r12 = 432(0x1b0, float:6.05E-43)
            r13 = 0
            r4 = r7
            r7 = 0
            r48 = r8
            r8 = r2
            r2 = r48
            r48 = r19
            defpackage.i13.a(r6, r7, r8, r9, r11, r12, r13)
            a74 r6 = defpackage.dj6.l(r3, r4)
            defpackage.gi2.h(r11, r6)
            pi2 r13 = defpackage.qs7.a
            long r6 = defpackage.hi2.E(r16)
            oj2 r12 = defpackage.oj2.d0
            r8 = r1 & 14
            r9 = 1772928(0x1b0d80, float:2.484401E-39)
            r8 = r8 | r9
            r27 = 3120(0xc30, float:4.372E-42)
            r9 = 48
            r28 = 120722(0x1d792, float:1.69168E-40)
            r58 = r25
            r25 = r11
            r10 = r6
            r6 = r58
            r7 = 0
            r16 = r14
            r14 = 0
            r19 = r16
            r16 = 0
            r26 = r8
            r20 = r9
            r8 = r17
            r21 = 1094713344(0x41400000, float:12.0)
            r17 = 0
            r23 = r19
            r19 = 2
            r24 = r20
            r20 = 0
            r38 = r21
            r21 = 1
            r50 = 2
            r22 = 0
            r51 = r23
            r23 = 0
            r52 = r24
            r24 = 0
            r64 = r1
            r53 = r6
            r1 = r50
            r4 = r51
            r6 = r60
            r50 = r38
            defpackage.x37.b(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11 = r25
            r11.p(r2)
            r6 = 1065353216(0x3f800000, float:1.0)
            a74 r7 = defpackage.dj6.c(r3, r6)
            a74 r7 = defpackage.dj6.e(r7, r6)
            r6 = 1035489772(0x3db851ec, float:0.09)
            long r8 = defpackage.kt0.c(r6, r8)
            a74 r6 = defpackage.vy7.L(r7, r8, r0)
            r14 = 6
            defpackage.h70.a(r6, r11, r14)
            gu r6 = new gu
            i r7 = new i
            r7.<init>(r2)
            r15 = 1090519040(0x41000000, float:8.0)
            r6.<init>(r15, r2, r7)
            a74 r7 = defpackage.zt0.a(r3)
            r8 = 1143603200(0x442a0000, float:680.0)
            a74 r7 = defpackage.dj6.m(r8, r2, r7)
            c40 r8 = defpackage.d90.l0
            cy2 r9 = new cy2
            r9.<init>(r8)
            a74 r7 = r7.d(r9)
            r8 = 1065353216(0x3f800000, float:1.0)
            a74 r7 = defpackage.dj6.c(r7, r8)
            s76 r8 = defpackage.nb3.U(r11)
            a74 r7 = defpackage.nb3.W(r7, r8, r2)
            r8 = 1099956224(0x41900000, float:18.0)
            r9 = 1096810496(0x41600000, float:14.0)
            a74 r7 = defpackage.ge7.P(r7, r8, r9)
            r10 = r33
            yt0 r6 = defpackage.wt0.a(r6, r10, r11, r14)
            long r12 = r11.T
            int r12 = java.lang.Long.hashCode(r12)
            xv4 r13 = r11.l()
            a74 r7 = defpackage.l.E(r11, r7)
            r11.f0()
            boolean r8 = r11.S
            if (r8 == 0) goto L3b0
            r11.k(r4)
        L3ad:
            r4 = r39
            goto L3b4
        L3b0:
            r11.o0()
            goto L3ad
        L3b4:
            defpackage.yh2.K(r11, r4, r6)
            r4 = r40
            defpackage.yh2.K(r11, r4, r13)
            r4 = r41
            r6 = r42
            defpackage.i61.w(r12, r11, r4, r11, r6)
            r4 = r43
            defpackage.yh2.K(r11, r4, r7)
            r4 = -145403326(0xfffffffff7555242, float:-4.3266704E33)
            r11.b0(r4)
            java.util.Iterator r4 = r61.iterator()
            r7 = 0
        L3d3:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L80b
            java.lang.Object r6 = r4.next()
            int r33 = r7 + 1
            if (r7 < 0) goto L807
            d11 r6 = (defpackage.d11) r6
            java.lang.Object r8 = r11.P()
            r12 = r44
            if (r8 != r12) goto L3ef
            r94 r8 = defpackage.i61.f(r11)
        L3ef:
            r94 r8 = (defpackage.r94) r8
            qa4 r13 = defpackage.bw7.a(r8, r11, r14)
            y16 r14 = defpackage.z16.b(r50)
            r15 = 1065353216(0x3f800000, float:1.0)
            a74 r9 = defpackage.dj6.c(r3, r15)
            r15 = 1112539136(0x42500000, float:52.0)
            r2 = 0
            a74 r2 = defpackage.dj6.f(r9, r15, r2, r1)
            a74 r2 = defpackage.u24.g(r2, r14)
            java.lang.Object r9 = r13.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L423
            int r9 = defpackage.kt0.i
            r9 = r2
            long r1 = defpackage.kt0.d
            r15 = 1042536202(0x3e23d70a, float:0.16)
        L41e:
            long r1 = defpackage.kt0.c(r15, r1)
            goto L42c
        L423:
            r9 = r2
            int r1 = defpackage.kt0.i
            long r1 = defpackage.kt0.d
            r15 = 1028443341(0x3d4ccccd, float:0.05)
            goto L41e
        L42c:
            a74 r1 = defpackage.vy7.L(r9, r1, r0)
            java.lang.Object r2 = r13.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L43f
            r2 = 1073741824(0x40000000, float:2.0)
            goto L441
        L43f:
            r2 = 1065353216(0x3f800000, float:1.0)
        L441:
            java.lang.Object r9 = r13.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L452
            r18 = r8
            r8 = r48
            goto L45f
        L452:
            int r9 = defpackage.kt0.i
            r18 = r8
            long r8 = defpackage.kt0.d
            r15 = 1036831949(0x3dcccccd, float:0.1)
            long r8 = defpackage.kt0.c(r15, r8)
        L45f:
            a74 r1 = defpackage.ak7.I(r1, r2, r8, r14)
            if (r7 != 0) goto L469
            a74 r1 = defpackage.ak7.S(r1, r5)
        L469:
            r17 = r1
            r1 = r64
            r2 = r1 & 896(0x380, float:1.256E-42)
            r14 = 256(0x100, float:3.59E-43)
            if (r2 != r14) goto L475
            r2 = 1
            goto L476
        L475:
            r2 = 0
        L476:
            boolean r8 = r11.d(r7)
            r2 = r2 | r8
            java.lang.Object r8 = r11.P()
            if (r2 != 0) goto L487
            if (r8 != r12) goto L484
            goto L487
        L484:
            r2 = r62
            goto L492
        L487:
            k01 r8 = new k01
            r2 = r62
            r9 = 1
            r8.<init>(r2, r7, r9)
            r11.l0(r8)
        L492:
            r22 = r8
            on2 r22 = (defpackage.on2) r22
            r23 = 28
            r19 = 0
            r20 = 0
            r21 = 0
            a74 r7 = defpackage.mb3.t(r17, r18, r19, r20, r21, r22, r23)
            r15 = r50
            r8 = 1096810496(0x41600000, float:14.0)
            a74 r7 = defpackage.ge7.P(r7, r8, r15)
            r9 = r32
            r14 = r34
            r15 = 48
            l26 r8 = defpackage.k26.a(r14, r9, r11, r15)
            r64 = r1
            long r1 = r11.T
            int r1 = java.lang.Long.hashCode(r1)
            xv4 r2 = r11.l()
            a74 r7 = defpackage.l.E(r11, r7)
            ix0 r17 = defpackage.jx0.i
            r17.getClass()
            iy0 r14 = defpackage.ix0.b
            r11.f0()
            boolean r15 = r11.S
            if (r15 == 0) goto L4d6
            r11.k(r14)
            goto L4d9
        L4d6:
            r11.o0()
        L4d9:
            pn r15 = defpackage.ix0.f
            defpackage.yh2.K(r11, r15, r8)
            pn r8 = defpackage.ix0.e
            defpackage.yh2.K(r11, r8, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            pn r2 = defpackage.ix0.g
            defpackage.yh2.K(r11, r2, r1)
            ne r1 = defpackage.ix0.h
            defpackage.yh2.F(r11, r1)
            r44 = r12
            pn r12 = defpackage.ix0.d
            defpackage.yh2.K(r11, r12, r7)
            e33 r7 = r6.d
            if (r7 == 0) goto L563
            r7 = -1254435045(0xffffffffb53ad71b, float:-6.960342E-7)
            r11.b0(r7)
            r7 = r6
            e33 r6 = r7.d
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L519
            r32 = r4
            r17 = r6
            r13 = r7
            r6 = r48
            goto L529
        L519:
            int r13 = defpackage.kt0.i
            r17 = r6
            r13 = r7
            long r6 = defpackage.kt0.d
            r32 = r4
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            long r6 = defpackage.kt0.c(r4, r6)
        L529:
            r4 = 1103101952(0x41c00000, float:24.0)
            a74 r4 = defpackage.dj6.i(r3, r4)
            r18 = r12
            r12 = 432(0x1b0, float:6.05E-43)
            r19 = r13
            r13 = 0
            r20 = r10
            r58 = r6
            r6 = r9
            r9 = r58
            r7 = 0
            r42 = r0
            r41 = r5
            r0 = r8
            r50 = r18
            r43 = r19
            r5 = r20
            r47 = r44
            r8 = r4
            r44 = r6
            r6 = r17
            r4 = 1096810496(0x41600000, float:14.0)
            defpackage.i13.a(r6, r7, r8, r9, r11, r12, r13)
            a74 r6 = defpackage.dj6.l(r3, r4)
            defpackage.gi2.h(r11, r6)
            r12 = 0
            r11.p(r12)
        L560:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L580
        L563:
            r42 = r0
            r32 = r4
            r41 = r5
            r43 = r6
            r0 = r8
            r5 = r10
            r50 = r12
            r47 = r44
            r4 = 1096810496(0x41600000, float:14.0)
            r12 = 0
            r44 = r9
            r6 = -1254019893(0xffffffffb5412ccb, float:-7.1963285E-7)
            r11.b0(r6)
            r11.p(r12)
            goto L560
        L580:
            double r7 = (double) r6
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            java.lang.String r8 = "invalid weight; must be greater than zero"
            if (r7 <= 0) goto L58a
            goto L58d
        L58a:
            defpackage.n53.a(r8)
        L58d:
            vn3 r7 = new vn3
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r13 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r13 <= 0) goto L599
            r6 = r12
        L597:
            r13 = 1
            goto L59c
        L599:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L597
        L59c:
            r7.<init>(r6, r13)
            r6 = r53
            r13 = 0
            yt0 r4 = defpackage.wt0.a(r6, r5, r11, r13)
            r16 = r9
            long r9 = r11.T
            int r9 = java.lang.Long.hashCode(r9)
            xv4 r10 = r11.l()
            a74 r7 = defpackage.l.E(r11, r7)
            r11.f0()
            boolean r13 = r11.S
            if (r13 == 0) goto L5c1
            r11.k(r14)
            goto L5c4
        L5c1:
            r11.o0()
        L5c4:
            defpackage.yh2.K(r11, r15, r4)
            defpackage.yh2.K(r11, r0, r10)
            defpackage.i61.w(r9, r11, r2, r11, r1)
            r4 = r50
            defpackage.yh2.K(r11, r4, r7)
            gu r7 = new gu
            i r9 = new i
            r13 = 1
            r9.<init>(r13)
            r10 = 1090519040(0x41000000, float:8.0)
            r7.<init>(r10, r13, r9)
            r9 = 1065353216(0x3f800000, float:1.0)
            a74 r13 = defpackage.dj6.c(r3, r9)
            r9 = 54
            r50 = r5
            r5 = r44
            l26 r7 = defpackage.k26.a(r7, r5, r11, r9)
            r9 = r12
            r18 = r13
            long r12 = r11.T
            int r12 = java.lang.Long.hashCode(r12)
            xv4 r13 = r11.l()
            r19 = r9
            r9 = r18
            a74 r9 = defpackage.l.E(r11, r9)
            r11.f0()
            boolean r10 = r11.S
            if (r10 == 0) goto L60f
            r11.k(r14)
            goto L612
        L60f:
            r11.o0()
        L612:
            defpackage.yh2.K(r11, r15, r7)
            defpackage.yh2.K(r11, r0, r13)
            defpackage.i61.w(r12, r11, r2, r11, r1)
            defpackage.yh2.K(r11, r4, r9)
            r53 = r6
            r7 = r43
            java.lang.String r6 = r7.a
            int r9 = defpackage.kt0.i
            r10 = r8
            long r8 = defpackage.kt0.d
            r12 = 4623789442425946112(0x402b000000000000, double:13.5)
            long r12 = defpackage.hi2.D(r12)
            r20 = 4625619029774565376(0x4031800000000000, double:17.5)
            long r20 = defpackage.hi2.D(r20)
            r25 = r11
            r58 = r12
            r13 = r10
            r10 = r58
            oj2 r12 = defpackage.oj2.e0
            r44 = r5
            r22 = r6
            r18 = r13
            r13 = 1065353216(0x3f800000, float:1.0)
            double r5 = (double) r13
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L651
        L64e:
            r43 = r7
            goto L655
        L651:
            defpackage.n53.a(r18)
            goto L64e
        L655:
            vn3 r7 = new vn3
            int r5 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r5 <= 0) goto L65f
            r6 = r19
        L65d:
            r5 = 1
            goto L661
        L65f:
            r6 = r13
            goto L65d
        L661:
            r7.<init>(r6, r5)
            r5 = 1090519040(0x41000000, float:8.0)
            r27 = 6
            r52 = 48
            r28 = 130000(0x1fbd0, float:1.82169E-40)
            r31 = r13
            r13 = 0
            r6 = r14
            r16 = r15
            r14 = 0
            r17 = r16
            r16 = 0
            r19 = 0
            r58 = r20
            r21 = r17
            r17 = r58
            r20 = 0
            r23 = r21
            r21 = 0
            r24 = r6
            r6 = r22
            r22 = 0
            r54 = r23
            r23 = 0
            r55 = r24
            r24 = 0
            r56 = 1094713344(0x41400000, float:12.0)
            r26 = 200064(0x30d80, float:2.8035E-40)
            r45 = r34
            r46 = 256(0x100, float:3.59E-43)
            r34 = r1
            r1 = r54
            r54 = r2
            r2 = r5
            r5 = r43
            r43 = r31
            r31 = r4
            r4 = r55
            defpackage.x37.b(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6 = r8
            r11 = r25
            java.lang.String r8 = r5.b
            if (r8 == 0) goto L759
            r8 = 1125110463(0x430fd2bf, float:143.82323)
            r11.b0(r8)
            r8 = 1086324736(0x40c00000, float:6.0)
            y16 r8 = defpackage.z16.b(r8)
            a74 r8 = defpackage.u24.g(r3, r8)
            r9 = 1039516303(0x3df5c28f, float:0.12)
            long r9 = defpackage.kt0.c(r9, r6)
            r12 = r42
            a74 r8 = defpackage.vy7.L(r8, r9, r12)
            r9 = 1077936128(0x40400000, float:3.0)
            a74 r8 = defpackage.ge7.P(r8, r2, r9)
            r9 = r29
            r13 = 0
            e34 r10 = defpackage.h70.d(r9, r13)
            long r13 = r11.T
            int r13 = java.lang.Long.hashCode(r13)
            xv4 r14 = r11.l()
            a74 r8 = defpackage.l.E(r11, r8)
            r11.f0()
            boolean r15 = r11.S
            if (r15 == 0) goto L6fa
            r11.k(r4)
            goto L6fd
        L6fa:
            r11.o0()
        L6fd:
            defpackage.yh2.K(r11, r1, r10)
            defpackage.yh2.K(r11, r0, r14)
            r1 = r34
            r0 = r54
            defpackage.i61.w(r13, r11, r0, r11, r1)
            r4 = r31
            defpackage.yh2.K(r11, r4, r8)
            r0 = r6
            java.lang.String r6 = r5.b
            r29 = r9
            long r8 = defpackage.es7.p
            r13 = 4622663542519103488(0x4027000000000000, double:11.5)
            long r13 = defpackage.hi2.D(r13)
            r42 = r12
            oj2 r12 = defpackage.oj2.d0
            long r17 = defpackage.hi2.E(r37)
            wz6 r4 = new wz6
            r7 = 6
            r4.<init>(r7)
            r27 = 6
            r28 = 129490(0x1f9d2, float:1.81454E-40)
            r57 = r7
            r7 = 0
            r25 = r11
            r10 = r13
            r13 = 0
            r14 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 200064(0x30d80, float:2.8035E-40)
            r16 = r4
            r4 = r57
            defpackage.x37.b(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11 = r25
            r13 = 1
            r11.p(r13)
            r12 = 0
            r11.p(r12)
            goto L766
        L759:
            r0 = r6
            r4 = 6
            r12 = 0
            r13 = 1
            r6 = 1126100293(0x431eed45, float:158.92683)
            r11.b0(r6)
            r11.p(r12)
        L766:
            r11.p(r13)
            java.lang.String r6 = r5.c
            if (r6 == 0) goto L7b9
            r6 = -1834553436(0xffffffff92a6efa4, float:-1.0535149E-27)
            r11.b0(r6)
            r6 = 1082130432(0x40800000, float:4.0)
            a74 r6 = defpackage.dj6.e(r3, r6)
            defpackage.gi2.h(r11, r6)
            java.lang.String r6 = r5.c
            r5 = 1059481190(0x3f266666, float:0.65)
            long r8 = defpackage.kt0.c(r5, r0)
            r5 = 11
            long r12 = defpackage.hi2.E(r5)
            r30 = 15
            long r17 = defpackage.hi2.E(r30)
            r27 = 6
            r28 = 130034(0x1fbf2, float:1.82216E-40)
            r7 = 0
            r25 = r11
            r10 = r12
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 3456(0xd80, float:4.843E-42)
            defpackage.x37.b(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11 = r25
            r12 = 0
            r11.p(r12)
        L7b7:
            r5 = 1
            goto L7c6
        L7b9:
            r12 = 0
            r30 = 15
            r5 = -1834156543(0xffffffff92acfe01, float:-1.0917343E-27)
            r11.b0(r5)
            r11.p(r12)
            goto L7b7
        L7c6:
            r11.p(r5)
            r14 = 1092616192(0x41200000, float:10.0)
            a74 r6 = defpackage.dj6.l(r3, r14)
            defpackage.gi2.h(r11, r6)
            e33 r6 = defpackage.mp2.J()
            r7 = 1055286886(0x3ee66666, float:0.45)
            long r9 = defpackage.kt0.c(r7, r0)
            r0 = 1099956224(0x41900000, float:18.0)
            a74 r8 = defpackage.dj6.i(r3, r0)
            r12 = 3504(0xdb0, float:4.91E-42)
            r13 = 0
            r7 = 0
            defpackage.i13.a(r6, r7, r8, r9, r11, r12, r13)
            r11.p(r5)
            r15 = r2
            r14 = r4
            r2 = r5
            r4 = r32
            r7 = r33
            r5 = r41
            r0 = r42
            r32 = r44
            r34 = r45
            r44 = r47
            r10 = r50
            r50 = r56
            r1 = 2
            r9 = 1096810496(0x41600000, float:14.0)
            goto L3d3
        L807:
            defpackage.hf.q0()
            throw r35
        L80b:
            r41 = r5
            r4 = r14
            r12 = 0
            r5 = r2
            r11.p(r12)
            r11.p(r5)
            rq2 r0 = new rq2
            r1 = 2131952373(0x7f1302f5, float:1.9541187E38)
            java.lang.String r1 = defpackage.yh2.O(r11, r1)
            r2 = r35
            r0.<init>(r2, r1)
            rq2 r1 = new rq2
            r2 = 2131952371(0x7f1302f3, float:1.9541183E38)
            java.lang.String r2 = defpackage.yh2.O(r11, r2)
            java.lang.String r3 = "A"
            r1.<init>(r3, r2)
            rq2 r2 = new rq2
            r3 = 2131952372(0x7f1302f4, float:1.9541185E38)
            java.lang.String r3 = defpackage.yh2.O(r11, r3)
            java.lang.String r5 = "B"
            r2.<init>(r5, r3)
            rq2[] r0 = new defpackage.rq2[]{r0, r1, r2}
            java.util.List r6 = defpackage.hf.c0(r0)
            r10 = 0
            r25 = r11
            r11 = 6
            r7 = 0
            r8 = 0
            r9 = r25
            defpackage.is7.a(r6, r7, r8, r9, r10, r11)
            r11 = r9
            r13 = 1
            r11.p(r13)
            r5 = r41
            defpackage.is7.b(r5, r11, r4)
            r11.p(r13)
            goto L864
        L861:
            r11.V()
        L864:
            cf5 r6 = r11.t()
            if (r6 == 0) goto L87b
            p4 r0 = new p4
            r1 = r60
            r2 = r61
            r3 = r62
            r4 = r63
            r5 = r65
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r0
        L87b:
            return
    }
}
