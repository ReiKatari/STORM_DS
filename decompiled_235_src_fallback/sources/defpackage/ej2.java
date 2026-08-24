package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej2  reason: default package */
/* loaded from: classes.dex */
public abstract class ej2 {
    public static defpackage.e33 a = null;
    public static defpackage.e33 b = null;
    public static defpackage.e33 c = null;
    public static defpackage.e33 d = null;
    public static java.lang.Thread e = null;
    public static defpackage.e33 f = null;
    public static boolean g = true;

    public static final int A(defpackage.j36 r0, java.lang.String r1) {
            r0.getClass()
            int r0 = s(r0, r1)
            return r0
    }

    public static final int B(defpackage.j36 r8, java.lang.String r9) {
            r8.getClass()
            int r0 = s(r8, r9)
            if (r0 < 0) goto La
            return r0
        La:
            int r0 = r8.getColumnCount()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r7 = 0
            r2 = r7
        L15:
            if (r2 >= r0) goto L21
            java.lang.String r3 = r8.getColumnName(r2)
            r1.add(r3)
            int r2 = r2 + 1
            goto L15
        L21:
            r5 = 0
            r6 = 63
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r8 = defpackage.gt0.P0(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "' does not exist. Available columns: ["
            r1 = 93
            java.lang.String r2 = "Column '"
            defpackage.e41.l(r2, r9, r0, r8, r1)
            return r7
    }

    public static final defpackage.e33 C() {
            e33 r0 = defpackage.ej2.b
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Leaderboard"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r2 = new ww2
            r3 = 1
            r4 = 0
            r2.<init>(r3, r4)
            r3 = 1089470464(0x40f00000, float:7.5)
            r5 = 1101529088(0x41a80000, float:21.0)
            r2.o(r3, r5)
            r3 = 1073741824(0x40000000, float:2.0)
            r2.k(r3)
            r3 = 1091567616(0x41100000, float:9.0)
            r2.t(r3)
            r3 = 1085276160(0x40b00000, float:5.5)
            r2.l(r3)
            r2.t(r5)
            r2.g()
            r5 = 1097596928(0x416c0000, float:14.75)
            r6 = 1077936128(0x40400000, float:3.0)
            r2.o(r5, r6)
            r5 = -1062207488(0xffffffffc0b00000, float:-5.5)
            r2.l(r5)
            r7 = 1099956224(0x41900000, float:18.0)
            r2.u(r7)
            r2.l(r3)
            r2.t(r6)
            r2.g()
            r3 = 1102053376(0x41b00000, float:22.0)
            r6 = 1093664768(0x41300000, float:11.0)
            r2.o(r3, r6)
            r2.l(r5)
            r5 = 1092616192(0x41200000, float:10.0)
            r2.u(r5)
            r2.k(r3)
            r2.t(r6)
            r2.g()
            java.util.ArrayList r2 = r2.b
            defpackage.d33.a(r1, r2, r4, r0)
            e33 r0 = r1.b()
            defpackage.ej2.b = r0
            return r0
    }

    public static android.content.Intent D(defpackage.jq r3) {
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto L7
            return r0
        L7:
            android.content.ComponentName r0 = r3.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            java.lang.String r0 = F(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L46
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = F(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r3 != 0) goto L23
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            return r3
        L23:
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            return r3
        L2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "getParentActivityIntent: bad parentActivityName '"
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = "' in manifest"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "NavUtils"
            android.util.Log.e(r0, r3)
            return r1
        L46:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    public static android.content.Intent E(android.content.Context r2, android.content.ComponentName r3) {
            java.lang.String r0 = F(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = F(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            return r2
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
            return r2
    }

    public static java.lang.String F(android.content.Context r3, android.content.ComponentName r4) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Le
            r1 = 269222528(0x100c0280, float:2.7612058E-29)
            goto L11
        Le:
            r1 = 787072(0xc0280, float:1.102923E-39)
        L11:
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r4, r1)
            java.lang.String r0 = r4.parentActivityName
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.os.Bundle r4 = r4.metaData
            r0 = 0
            if (r4 != 0) goto L20
            return r0
        L20:
            java.lang.String r1 = "android.support.PARENT_ACTIVITY"
            java.lang.String r4 = r4.getString(r1)
            if (r4 != 0) goto L29
            return r0
        L29:
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L46:
            return r4
    }

    public static final defpackage.e33 G() {
            e33 r0 = defpackage.ej2.d
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            r10 = 0
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            java.lang.String r2 = "Filled.SportsEsports"
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r4 = new ww2
            r2 = 1
            r3 = 0
            r4.<init>(r2, r3)
            r2 = 1101833175(0x41aca3d7, float:21.58)
            r3 = 1098954834(0x4180b852, float:16.09)
            r4.o(r2, r3)
            r2 = -1057677640(0xffffffffc0f51eb8, float:-7.66)
            r3 = -1081375457(0xffffffffbf8b851f, float:-1.09)
            r4.n(r3, r2)
            r9 = 1099185521(0x41843d71, float:16.53)
            r10 = 1084227584(0x40a00000, float:5.0)
            r5 = 1101114900(0x41a1ae14, float:20.21)
            r6 = 1087289426(0x40ceb852, float:6.46)
            r7 = 1100228854(0x419428f6, float:18.52)
            r8 = 1084227584(0x40a00000, float:5.0)
            r4.h(r5, r6, r7, r8, r9, r10)
            r2 = 1089407549(0x40ef0a3d, float:7.47)
            r4.k(r2)
            r9 = 1080075223(0x4060a3d7, float:3.51)
            r10 = 1090969928(0x4106e148, float:8.43)
            r5 = 1085234217(0x40af5c29, float:5.48)
            r6 = 1084227584(0x40a00000, float:5.0)
            r7 = 1081249628(0x40728f5c, float:3.79)
            r8 = 1087289426(0x40ceb852, float:6.46)
            r4.h(r5, r6, r7, r8, r9, r10)
            r2 = 1089806008(0x40f51eb8, float:7.66)
            r4.n(r3, r2)
            r9 = 1084101755(0x409e147b, float:4.94)
            r10 = 1100480512(0x41980000, float:19.0)
            r5 = 1074580685(0x400ccccd, float:2.2)
            r6 = 1099762237(0x418d0a3d, float:17.63)
            r7 = 1079571907(0x4058f5c3, float:3.39)
            r8 = 1100480512(0x41980000, float:19.0)
            r4.h(r5, r6, r7, r8, r9, r10)
            r2 = 0
            r4.l(r2)
            r9 = 1072064102(0x3fe66666, float:1.8)
            r10 = -1086324736(0xffffffffbf400000, float:-0.75)
            r5 = 1059984507(0x3f2e147b, float:0.68)
            r6 = 0
            r7 = 1068037571(0x3fa8f5c3, float:1.32)
            r8 = -1098236559(0xffffffffbe8a3d71, float:-0.27)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 1098907648(0x41800000, float:16.0)
            r3 = 1091567616(0x41100000, float:9.0)
            r4.m(r3, r2)
            r2 = 1086324736(0x40c00000, float:6.0)
            r4.l(r2)
            r2 = 1074790400(0x40100000, float:2.25)
            r4.n(r2, r2)
            r10 = 1061158912(0x3f400000, float:0.75)
            r5 = 1056293519(0x3ef5c28f, float:0.48)
            r6 = 1056293519(0x3ef5c28f, float:0.48)
            r7 = 1066443735(0x3f90a3d7, float:1.13)
            r8 = 1061158912(0x3f400000, float:0.75)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 0
            r4.l(r2)
            r9 = 1101833175(0x41aca3d7, float:21.58)
            r10 = 1098954834(0x4180b852, float:16.09)
            r5 = 1101324616(0x41a4e148, float:20.61)
            r6 = 1100480512(0x41980000, float:19.0)
            r7 = 1101948518(0x41ae6666, float:21.8)
            r8 = 1099762237(0x418d0a3d, float:17.63)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.g()
            r2 = 1093664768(0x41300000, float:11.0)
            r4.o(r2, r2)
            r2 = 1091567616(0x41100000, float:9.0)
            r4.k(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            r4.u(r2)
            r2 = 1090519040(0x41000000, float:8.0)
            r4.k(r2)
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.u(r2)
            r2 = 1086324736(0x40c00000, float:6.0)
            r4.k(r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.u(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            r4.l(r2)
            r2 = 1090519040(0x41000000, float:8.0)
            r4.t(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.l(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            r4.u(r2)
            r4.l(r2)
            r2 = 1093664768(0x41300000, float:11.0)
            r4.t(r2)
            r4.g()
            r2 = 1097859072(0x41700000, float:15.0)
            r3 = 1092616192(0x41200000, float:10.0)
            r4.o(r2, r3)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = -1089680179(0xffffffffbf0ccccd, float:-0.55)
            r6 = 0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = -1092196762(0xffffffffbee66666, float:-0.45)
            r4.i(r5, r6, r7, r8, r9, r10)
            r9 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = -1089680179(0xffffffffbf0ccccd, float:-0.55)
            r7 = 1055286886(0x3ee66666, float:0.45)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 1055286886(0x3ee66666, float:0.45)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.q(r3, r2, r3, r3)
            r9 = 1097859072(0x41700000, float:15.0)
            r10 = 1092616192(0x41200000, float:10.0)
            r5 = 1098907648(0x41800000, float:16.0)
            r6 = 1092144333(0x4118cccd, float:9.55)
            r7 = 1098435789(0x4178cccd, float:15.55)
            r8 = 1092616192(0x41200000, float:10.0)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.g()
            r2 = 1099431936(0x41880000, float:17.0)
            r3 = 1095761920(0x41500000, float:13.0)
            r4.o(r2, r3)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = -1089680179(0xffffffffbf0ccccd, float:-0.55)
            r6 = 0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = -1092196762(0xffffffffbee66666, float:-0.45)
            r4.i(r5, r6, r7, r8, r9, r10)
            r9 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = -1089680179(0xffffffffbf0ccccd, float:-0.55)
            r7 = 1055286886(0x3ee66666, float:0.45)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.i(r5, r6, r7, r8, r9, r10)
            r2 = 1055286886(0x3ee66666, float:0.45)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.q(r3, r2, r3, r3)
            r9 = 1099431936(0x41880000, float:17.0)
            r10 = 1095761920(0x41500000, float:13.0)
            r5 = 1099956224(0x41900000, float:18.0)
            r6 = 1095290061(0x4148cccd, float:12.55)
            r7 = 1099720294(0x418c6666, float:17.55)
            r8 = 1095761920(0x41500000, float:13.0)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.g()
            java.util.ArrayList r2 = r4.b
            r3 = 0
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.ej2.d = r0
            return r0
    }

    public static final defpackage.e33 H() {
            e33 r0 = defpackage.ej2.f
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Tune"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r2 = new ww2
            r3 = 1
            r4 = 0
            r2.<init>(r3, r4)
            r3 = 1077936128(0x40400000, float:3.0)
            r5 = 1099431936(0x41880000, float:17.0)
            r2.o(r3, r5)
            r6 = 1073741824(0x40000000, float:2.0)
            r2.u(r6)
            r7 = 1086324736(0x40c00000, float:6.0)
            r2.l(r7)
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r2.u(r8)
            r2.m(r3, r5)
            r2.g()
            r9 = 1084227584(0x40a00000, float:5.0)
            r2.o(r3, r9)
            r2.u(r6)
            r10 = 1092616192(0x41200000, float:10.0)
            r2.l(r10)
            r11 = 1095761920(0x41500000, float:13.0)
            r2.m(r11, r9)
            r2.m(r3, r9)
            r2.g()
            r12 = 1101529088(0x41a80000, float:21.0)
            r2.o(r11, r12)
            r2.u(r8)
            r13 = 1090519040(0x41000000, float:8.0)
            r2.l(r13)
            r2.u(r8)
            r13 = -1056964608(0xffffffffc1000000, float:-8.0)
            r2.l(r13)
            r2.u(r8)
            r2.l(r8)
            r2.u(r7)
            r2.l(r6)
            r2.g()
            r13 = 1088421888(0x40e00000, float:7.0)
            r14 = 1091567616(0x41100000, float:9.0)
            r2.o(r13, r14)
            r2.u(r6)
            r15 = 1093664768(0x41300000, float:11.0)
            r2.m(r3, r15)
            r2.u(r6)
            r4 = 1082130432(0x40800000, float:4.0)
            r2.l(r4)
            r2.u(r6)
            r2.l(r6)
            r2.m(r14, r14)
            r2.m(r13, r14)
            r2.g()
            r2.o(r12, r11)
            r2.u(r8)
            r2.m(r15, r15)
            r2.u(r6)
            r2.l(r10)
            r2.g()
            r10 = 1097859072(0x41700000, float:15.0)
            r2.o(r10, r14)
            r2.l(r6)
            r2.m(r5, r13)
            r2.l(r4)
            r2.m(r12, r9)
            r4 = -1065353216(0xffffffffc0800000, float:-4.0)
            r2.l(r4)
            r2.m(r5, r3)
            r2.l(r8)
            r2.u(r7)
            r2.g()
            java.util.ArrayList r2 = r2.b
            r3 = 0
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.ej2.f = r0
            return r0
    }

    public static final defpackage.in7 I(java.util.ArrayList r10, defpackage.qn2 r11) {
            hn7 r0 = defpackage.in7.Companion
            int r1 = r10.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            java.lang.String r5 = ")!"
            java.lang.String r6 = "UseCaseUtil"
            if (r4 >= r1) goto L34
            java.lang.Object r7 = r10.get(r4)
            int r4 = r4 + 1
            di7 r7 = (defpackage.di7) r7
            java.lang.Object r7 = r11.g(r7)
            zi7 r7 = (defpackage.zi7) r7
            int r7 = r7.E()
            if (r7 == 0) goto L9
            if (r3 == r7) goto L32
            if (r3 == 0) goto L32
            java.lang.String r8 = "Unexpected configurations: Overwriting current previewStabilizationMode("
            java.lang.String r9 = ") with useCasePreviewStabilization("
            java.lang.String r3 = defpackage.xg6.m(r3, r7, r8, r9, r5)
            defpackage.kj2.f0(r6, r3)
        L32:
            r3 = r7
            goto L9
        L34:
            int r1 = r10.size()
            r4 = r2
        L39:
            if (r4 >= r1) goto L60
            java.lang.Object r7 = r10.get(r4)
            int r4 = r4 + 1
            di7 r7 = (defpackage.di7) r7
            java.lang.Object r7 = r11.g(r7)
            zi7 r7 = (defpackage.zi7) r7
            int r7 = r7.y()
            if (r7 == 0) goto L39
            if (r2 == r7) goto L5e
            if (r2 == 0) goto L5e
            java.lang.String r8 = "Unexpected configurations: Overwriting current videoStabilizationMode("
            java.lang.String r9 = ") with useCaseVideoStabilization("
            java.lang.String r2 = defpackage.xg6.m(r2, r7, r8, r9, r5)
            defpackage.kj2.f0(r6, r2)
        L5e:
            r2 = r7
            goto L39
        L60:
            r0.getClass()
            r10 = 1
            if (r3 == r10) goto L77
            if (r2 != r10) goto L69
            goto L77
        L69:
            r10 = 2
            if (r3 != r10) goto L6f
            in7 r10 = defpackage.in7.PREVIEW
            return r10
        L6f:
            if (r2 != r10) goto L74
            in7 r10 = defpackage.in7.ON
            return r10
        L74:
            in7 r10 = defpackage.in7.UNSPECIFIED
            return r10
        L77:
            in7 r10 = defpackage.in7.OFF
            return r10
    }

    public static boolean J(android.view.MotionEvent r0, int r1) {
            int r0 = r0.getSource()
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static final boolean K(defpackage.vy4 r10, long r11, long r13) {
            int r0 = r10.i
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            long r3 = r10.c
            r10 = 32
            long r5 = r3 >> r10
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r8 = r13 >> r10
            int r4 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r0 = (float) r0
            float r4 = r4 * r0
            long r8 = r11 >> r10
            int r10 = (int) r8
            float r10 = (float) r10
            float r10 = r10 + r4
            long r13 = r13 & r6
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r13 = r13 * r0
            long r11 = r11 & r6
            int r11 = (int) r11
            float r11 = (float) r11
            float r11 = r11 + r13
            float r12 = -r4
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 >= 0) goto L3f
            r12 = r2
            goto L40
        L3f:
            r12 = r1
        L40:
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 <= 0) goto L46
            r10 = r2
            goto L47
        L46:
            r10 = r1
        L47:
            r10 = r10 | r12
            float r12 = -r13
            int r12 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r12 >= 0) goto L4f
            r12 = r2
            goto L50
        L4f:
            r12 = r1
        L50:
            r10 = r10 | r12
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 <= 0) goto L56
            r1 = r2
        L56:
            r10 = r10 | r1
            return r10
    }

    public static final boolean L(defpackage.di7 r2) {
            r2.getClass()
            zi7 r0 = r2.h
            xx r1 = defpackage.zi7.T
            boolean r0 = r0.i(r1)
            r1 = 0
            if (r0 == 0) goto L1b
            zi7 r2 = r2.h
            bj7 r2 = r2.x()
            bj7 r0 = defpackage.bj7.VIDEO_CAPTURE
            if (r2 != r0) goto L1a
            r2 = 1
            return r2
        L1a:
            return r1
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " UseCase does not have capture type."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "UseCaseUtil"
            defpackage.kj2.v(r0, r2)
            return r1
    }

    public static java.lang.String M(java.lang.String r1) {
            r1.getClass()
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFD
            java.lang.String r1 = java.text.Normalizer.normalize(r1, r0)
            r1.getClass()
            xh5 r0 = defpackage.tz5.L
            r0.getClass()
            java.util.regex.Pattern r0 = r0.A
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            r1.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            r1.getClass()
            return r1
    }

    public static void N(defpackage.c37 r5, defpackage.d17 r6, defpackage.a47 r7, defpackage.jk3 r8, defpackage.t37 r9, boolean r10, defpackage.mk4 r11) {
            if (r10 != 0) goto L4
            goto La4
        L4:
            long r0 = r5.b
            int r5 = defpackage.k47.e(r0)
            int r5 = r11.s(r5)
            java.lang.String r10 = defpackage.l17.a
            z37 r10 = r7.a
            fp r10 = r10.a
            java.lang.String r10 = r10.B
            int r10 = r10.length()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r5 >= r10) goto L26
            of5 r5 = r7.b(r5)
            goto L45
        L26:
            if (r5 == 0) goto L2f
            int r5 = r5 + (-1)
            of5 r5 = r7.b(r5)
            goto L45
        L2f:
            s47 r5 = r6.b
            qh1 r7 = r6.g
            ki2 r6 = r6.h
            long r5 = defpackage.l17.b(r5, r7, r6)
            of5 r7 = new of5
            long r5 = r5 & r0
            int r5 = (int) r5
            float r5 = (float) r5
            r6 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r6, r6, r10, r5)
            r5 = r7
        L45:
            float r6 = r5.b
            float r7 = r5.a
            int r10 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r10
            int r2 = java.lang.Float.floatToRawIntBits(r6)
            long r2 = (long) r2
            r4 = 32
            long r10 = r10 << r4
            long r2 = r2 & r0
            long r10 = r10 | r2
            long r10 = r8.P(r10)
            long r2 = r10 >> r4
            int r8 = (int) r2
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r10 = r10 & r0
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r2 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r10)
            long r10 = (long) r8
            long r2 = r2 << r4
            long r10 = r10 & r0
            long r10 = r10 | r2
            float r8 = r5.c
            float r8 = r8 - r7
            float r5 = r5.d
            float r5 = r5 - r6
            int r6 = java.lang.Float.floatToRawIntBits(r8)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r2 = (long) r5
            long r5 = r6 << r4
            long r7 = r2 & r0
            long r5 = r5 | r7
            of5 r5 = defpackage.kj2.b(r10, r5)
            o37 r6 = r9.a
            java.util.concurrent.atomic.AtomicReference r6 = r6.b
            java.lang.Object r6 = r6.get()
            t37 r6 = (defpackage.t37) r6
            boolean r6 = defpackage.nb3.k(r6, r9)
            if (r6 == 0) goto La4
            gy4 r6 = r9.b
            r6.h(r5)
        La4:
            return
    }

    public static defpackage.aj2 O(android.content.res.XmlResourceParser r26, android.content.res.Resources r27) {
            r0 = r27
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS
        L4:
            int r2 = r26.next()
            r3 = 1
            r4 = 2
            if (r2 == r4) goto Lf
            if (r2 == r3) goto Lf
            goto L4
        Lf:
            if (r2 != r4) goto L26a
            r2 = 0
            java.lang.String r5 = "font-family"
            r6 = r26
            r6.require(r4, r2, r5)
            java.lang.String r7 = r6.getName()
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L264
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r6)
            int[] r7 = defpackage.g75.b
            android.content.res.TypedArray r5 = r0.obtainAttributes(r5, r7)
            r7 = 0
            java.lang.String r9 = r5.getString(r7)
            r8 = 5
            java.lang.String r10 = r5.getString(r8)
            r11 = 6
            java.lang.String r15 = r5.getString(r11)
            java.lang.String r16 = r5.getString(r4)
            int r12 = r5.getResourceId(r3, r7)
            r13 = 3
            int r14 = r5.getInteger(r13, r3)
            r17 = r2
            r2 = 500(0x1f4, float:7.0E-43)
            r8 = 4
            int r2 = r5.getInteger(r8, r2)
            r8 = 7
            java.lang.String r3 = r5.getString(r8)
            r5.recycle()
            if (r9 == 0) goto L1ad
            if (r10 == 0) goto L1ad
            java.util.List r12 = S(r0, r12)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L67:
            int r8 = r6.next()
            if (r8 == r13) goto L16d
            int r8 = r6.getEventType()
            if (r8 == r4) goto L74
            goto L67
        L74:
            java.lang.String r8 = r6.getName()
            java.lang.String r11 = "fallback"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L15b
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r6)
            int[] r11 = defpackage.g75.d
            android.content.res.TypedArray r8 = r0.obtainAttributes(r8, r11)
            r18 = r14
            java.lang.String r11 = r8.getString(r7)     // Catch: java.lang.Throwable -> L108
            r13 = 1
            java.lang.String r14 = r8.getString(r13)     // Catch: java.lang.Throwable -> L108
            r13 = r14
            java.lang.String r14 = r8.getString(r4)     // Catch: java.lang.Throwable -> L108
            if (r11 == 0) goto L10b
        L9c:
            int r7 = r6.next()     // Catch: java.lang.Throwable -> L108
            r4 = 3
            if (r7 == r4) goto Laf
            V(r6)     // Catch: java.lang.Throwable -> La8
            r4 = 2
            goto L9c
        La8:
            r0 = move-exception
            r5 = r0
            r4 = r8
            r2 = 1
            goto L116
        Laf:
            r7 = r8
            ui2 r8 = new ui2     // Catch: java.lang.Throwable -> L103
            r20 = r3
            r4 = r7
            r7 = r18
            r18 = r2
            r2 = 1
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L100
            boolean r11 = r4 instanceof java.lang.AutoCloseable
            if (r11 == 0) goto Lc9
            r2 = r4
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2
            r2.close()
            goto Lfb
        Lc9:
            boolean r11 = r4 instanceof java.util.concurrent.ExecutorService
            if (r11 == 0) goto Lf8
            java.util.concurrent.ExecutorService r4 = (java.util.concurrent.ExecutorService) r4
            java.util.concurrent.ForkJoinPool r11 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r4 != r11) goto Ld6
            goto Lfb
        Ld6:
            boolean r11 = r4.isTerminated()
            if (r11 != 0) goto Lfb
            r4.shutdown()
            r13 = 0
        Le0:
            if (r11 != 0) goto Lee
            boolean r11 = r4.awaitTermination(r2, r1)     // Catch: java.lang.InterruptedException -> Le7
            goto Le0
        Le7:
            if (r13 != 0) goto Le0
            r4.shutdownNow()
            r13 = 1
            goto Le0
        Lee:
            if (r13 == 0) goto Lfb
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            goto Lfb
        Lf8:
            r4.recycle()
        Lfb:
            r5.add(r8)
            goto L163
        L100:
            r0 = move-exception
        L101:
            r5 = r0
            goto L116
        L103:
            r0 = move-exception
            r4 = r7
        L105:
            r2 = 1
            goto L101
        L108:
            r0 = move-exception
            r4 = r8
            goto L105
        L10b:
            r4 = r8
            r2 = 1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L100
            java.lang.String r5 = "query attribute must be set in fallback element"
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L100
            throw r0     // Catch: java.lang.Throwable -> L100
        L116:
            if (r4 == 0) goto L15a
            boolean r0 = r4 instanceof java.lang.AutoCloseable     // Catch: java.lang.Throwable -> L156
            if (r0 != 0) goto L14f
            boolean r0 = r4 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L156
            if (r0 == 0) goto L14b
            r8 = r4
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8     // Catch: java.lang.Throwable -> L156
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()     // Catch: java.lang.Throwable -> L156
            if (r8 == r0) goto L15a
            boolean r0 = r8.isTerminated()     // Catch: java.lang.Throwable -> L156
            if (r0 != 0) goto L15a
            r8.shutdown()     // Catch: java.lang.Throwable -> L156
            r7 = 0
        L133:
            if (r0 != 0) goto L141
            boolean r0 = r8.awaitTermination(r2, r1)     // Catch: java.lang.InterruptedException -> L13a java.lang.Throwable -> L156
            goto L133
        L13a:
            if (r7 != 0) goto L133
            r8.shutdownNow()     // Catch: java.lang.Throwable -> L156
            r7 = 1
            goto L133
        L141:
            if (r7 == 0) goto L15a
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L156
            r0.interrupt()     // Catch: java.lang.Throwable -> L156
            goto L15a
        L14b:
            r4.recycle()     // Catch: java.lang.Throwable -> L156
            goto L15a
        L14f:
            r8 = r4
            java.lang.AutoCloseable r8 = (java.lang.AutoCloseable) r8     // Catch: java.lang.Throwable -> L156
            r8.close()     // Catch: java.lang.Throwable -> L156
            goto L15a
        L156:
            r0 = move-exception
            r5.addSuppressed(r0)
        L15a:
            throw r5
        L15b:
            r18 = r2
            r20 = r3
            r7 = r14
            V(r6)
        L163:
            r14 = r7
            r2 = r18
            r3 = r20
            r4 = 2
            r7 = 0
            r13 = 3
            goto L67
        L16d:
            r18 = r2
            r20 = r3
            r7 = r14
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L182
            dj2 r0 = new dj2
            r1 = r18
            r2 = r20
            r0.<init>(r5, r7, r1, r2)
            goto L1a6
        L182:
            r1 = r18
            r2 = r20
            if (r15 == 0) goto L1a7
            ui2 r8 = new ui2
            r13 = 0
            r14 = 0
            r11 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5.add(r8)
            if (r16 == 0) goto L1a1
            ui2 r8 = new ui2
            r13 = 0
            r14 = 0
            r11 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5.add(r8)
        L1a1:
            dj2 r0 = new dj2
            r0.<init>(r5, r7, r1, r2)
        L1a6:
            return r0
        L1a7:
            java.lang.String r0 = "The provider font XML requires query attribute or fallback children."
            defpackage.i.h(r0)
            return r17
        L1ad:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L1b2:
            int r2 = r6.next()
            r4 = 3
            if (r2 == r4) goto L24e
            int r2 = r6.getEventType()
            r3 = 2
            if (r2 == r3) goto L1c1
            goto L1b2
        L1c1:
            java.lang.String r2 = r6.getName()
            java.lang.String r4 = "font"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L246
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r6)
            int[] r4 = defpackage.g75.c
            android.content.res.TypedArray r2 = r0.obtainAttributes(r2, r4)
            r13 = 8
            boolean r4 = r2.hasValue(r13)
            if (r4 == 0) goto L1e0
            goto L1e1
        L1e0:
            r13 = 1
        L1e1:
            r4 = 400(0x190, float:5.6E-43)
            int r20 = r2.getInt(r13, r4)
            boolean r4 = r2.hasValue(r11)
            if (r4 == 0) goto L1f0
            r4 = r11
        L1ee:
            r5 = 0
            goto L1f2
        L1f0:
            r4 = r3
            goto L1ee
        L1f2:
            int r4 = r2.getInt(r4, r5)
            r13 = 1
            if (r13 != r4) goto L1fc
            r25 = r13
            goto L1fe
        L1fc:
            r25 = 0
        L1fe:
            r4 = 9
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L207
            goto L208
        L207:
            r4 = 3
        L208:
            boolean r5 = r2.hasValue(r8)
            if (r5 == 0) goto L210
            r5 = r8
            goto L211
        L210:
            r5 = 4
        L211:
            java.lang.String r24 = r2.getString(r5)
            r5 = 0
            int r21 = r2.getInt(r4, r5)
            r4 = 5
            boolean r7 = r2.hasValue(r4)
            if (r7 == 0) goto L223
            r7 = r4
            goto L224
        L223:
            r7 = r5
        L224:
            int r22 = r2.getResourceId(r7, r5)
            java.lang.String r23 = r2.getString(r7)
            r2.recycle()
        L22f:
            int r2 = r6.next()
            r5 = 3
            if (r2 == r5) goto L23a
            V(r6)
            goto L22f
        L23a:
            cj2 r19 = new cj2
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r2 = r19
            r1.add(r2)
            goto L1b2
        L246:
            r4 = 5
            r5 = 3
            r13 = 1
            V(r6)
            goto L1b2
        L24e:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L255
            return r17
        L255:
            bj2 r0 = new bj2
            r5 = 0
            cj2[] r2 = new defpackage.cj2[r5]
            java.lang.Object[] r1 = r1.toArray(r2)
            cj2[] r1 = (defpackage.cj2[]) r1
            r0.<init>(r1)
            return r0
        L264:
            r17 = r2
            V(r6)
            return r17
        L26a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    public static final boolean P(defpackage.vh2 r11, defpackage.ln r12) {
            r0 = 16
            vh2[] r1 = new defpackage.vh2[r0]
            z64 r2 = r11.A
            boolean r2 = r2.j0
            if (r2 != 0) goto Lf
            java.lang.String r2 = "visitChildren called on an unattached node"
            defpackage.p53.c(r2)
        Lf:
            ua4 r2 = new ua4
            z64[] r3 = new defpackage.z64[r0]
            r2.<init>(r3)
            z64 r11 = r11.A
            z64 r3 = r11.Y
            r4 = 0
            if (r3 != 0) goto L22
            defpackage.nc1.z(r2, r11)
        L20:
            r11 = r4
            goto L26
        L22:
            r2.b(r3)
            goto L20
        L26:
            int r3 = r2.L
            r5 = 1
            if (r3 == 0) goto La3
            int r3 = r3 + (-1)
            java.lang.Object r3 = r2.l(r3)
            z64 r3 = (defpackage.z64) r3
            int r6 = r3.R
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L3d
            defpackage.nc1.z(r2, r3)
            goto L26
        L3d:
            if (r3 == 0) goto L26
            int r6 = r3.L
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto La0
            r6 = 0
            r7 = r6
        L47:
            if (r3 == 0) goto L26
            boolean r8 = r3 instanceof defpackage.vh2
            if (r8 == 0) goto L65
            vh2 r3 = (defpackage.vh2) r3
            int r8 = r11 + 1
            int r9 = r1.length
            if (r9 >= r8) goto L61
            int r9 = r1.length
            int r10 = r9 * 2
            int r10 = java.lang.Math.max(r8, r10)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.System.arraycopy(r1, r4, r10, r4, r9)
            r1 = r10
        L61:
            r1[r11] = r3
            r11 = r8
            goto L9b
        L65:
            int r8 = r3.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9b
            boolean r8 = r3 instanceof defpackage.zg1
            if (r8 == 0) goto L9b
            r8 = r3
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = r4
        L75:
            if (r8 == 0) goto L98
            int r10 = r8.L
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L95
            int r9 = r9 + 1
            if (r9 != r5) goto L83
            r3 = r8
            goto L95
        L83:
            if (r7 != 0) goto L8c
            ua4 r7 = new ua4
            z64[] r10 = new defpackage.z64[r0]
            r7.<init>(r10)
        L8c:
            if (r3 == 0) goto L92
            r7.b(r3)
            r3 = r6
        L92:
            r7.b(r8)
        L95:
            z64 r8 = r8.Y
            goto L75
        L98:
            if (r9 != r5) goto L9b
            goto L47
        L9b:
            z64 r3 = defpackage.nc1.A(r7)
            goto L47
        La0:
            z64 r3 = r3.Y
            goto L3d
        La3:
            zh2 r0 = defpackage.zh2.b
            java.util.Arrays.sort(r1, r4, r11, r0)
            int r11 = r11 - r5
            int r0 = r1.length
            if (r11 >= r0) goto Lc2
        Lac:
            if (r11 < 0) goto Lc2
            r0 = r1[r11]
            vh2 r0 = (defpackage.vh2) r0
            boolean r2 = defpackage.yh2.A(r0)
            if (r2 == 0) goto Lbf
            boolean r0 = i(r0, r12)
            if (r0 == 0) goto Lbf
            return r5
        Lbf:
            int r11 = r11 + (-1)
            goto Lac
        Lc2:
            return r4
    }

    public static final boolean Q(defpackage.vh2 r11, defpackage.ln r12) {
            r0 = 16
            vh2[] r1 = new defpackage.vh2[r0]
            z64 r2 = r11.A
            boolean r2 = r2.j0
            if (r2 != 0) goto Lf
            java.lang.String r2 = "visitChildren called on an unattached node"
            defpackage.p53.c(r2)
        Lf:
            ua4 r2 = new ua4
            z64[] r3 = new defpackage.z64[r0]
            r2.<init>(r3)
            z64 r11 = r11.A
            z64 r3 = r11.Y
            r4 = 0
            if (r3 != 0) goto L22
            defpackage.nc1.z(r2, r11)
        L20:
            r11 = r4
            goto L26
        L22:
            r2.b(r3)
            goto L20
        L26:
            int r3 = r2.L
            r5 = 1
            if (r3 == 0) goto La3
            int r3 = r3 + (-1)
            java.lang.Object r3 = r2.l(r3)
            z64 r3 = (defpackage.z64) r3
            int r6 = r3.R
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L3d
            defpackage.nc1.z(r2, r3)
            goto L26
        L3d:
            if (r3 == 0) goto L26
            int r6 = r3.L
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto La0
            r6 = 0
            r7 = r6
        L47:
            if (r3 == 0) goto L26
            boolean r8 = r3 instanceof defpackage.vh2
            if (r8 == 0) goto L65
            vh2 r3 = (defpackage.vh2) r3
            int r8 = r11 + 1
            int r9 = r1.length
            if (r9 >= r8) goto L61
            int r9 = r1.length
            int r10 = r9 * 2
            int r10 = java.lang.Math.max(r8, r10)
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.System.arraycopy(r1, r4, r10, r4, r9)
            r1 = r10
        L61:
            r1[r11] = r3
            r11 = r8
            goto L9b
        L65:
            int r8 = r3.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L9b
            boolean r8 = r3 instanceof defpackage.zg1
            if (r8 == 0) goto L9b
            r8 = r3
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = r4
        L75:
            if (r8 == 0) goto L98
            int r10 = r8.L
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L95
            int r9 = r9 + 1
            if (r9 != r5) goto L83
            r3 = r8
            goto L95
        L83:
            if (r7 != 0) goto L8c
            ua4 r7 = new ua4
            z64[] r10 = new defpackage.z64[r0]
            r7.<init>(r10)
        L8c:
            if (r3 == 0) goto L92
            r7.b(r3)
            r3 = r6
        L92:
            r7.b(r8)
        L95:
            z64 r8 = r8.Y
            goto L75
        L98:
            if (r9 != r5) goto L9b
            goto L47
        L9b:
            z64 r3 = defpackage.nc1.A(r7)
            goto L47
        La0:
            z64 r3 = r3.Y
            goto L3d
        La3:
            zh2 r0 = defpackage.zh2.b
            java.util.Arrays.sort(r1, r4, r11, r0)
            r0 = r4
        La9:
            if (r0 >= r11) goto Lbf
            r2 = r1[r0]
            vh2 r2 = (defpackage.vh2) r2
            boolean r3 = defpackage.yh2.A(r2)
            if (r3 == 0) goto Lbc
            boolean r2 = x(r2, r12)
            if (r2 == 0) goto Lbc
            return r5
        Lbc:
            int r0 = r0 + 1
            goto La9
        Lbf:
            return r4
    }

    public static final long R(defpackage.vy4 r4, boolean r5) {
            long r0 = r4.g
            long r2 = r4.c
            long r0 = defpackage.jk4.e(r2, r0)
            if (r5 != 0) goto L13
            boolean r4 = r4.c()
            if (r4 == 0) goto L13
            r4 = 0
            return r4
        L13:
            return r0
    }

    public static java.util.List S(android.content.res.Resources r8, int r9) {
            if (r9 != 0) goto L5
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L5:
            android.content.res.TypedArray r0 = r8.obtainTypedArray(r9)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.List r8 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L15
            r0.recycle()
            return r8
        L15:
            r8 = move-exception
            goto L70
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            r2 = 0
            int r3 = r0.getType(r2)     // Catch: java.lang.Throwable -> L15
            r4 = 1
            if (r3 != r4) goto L50
            r9 = r2
        L25:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L15
            if (r9 >= r3) goto L6c
            int r3 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L4d
            java.lang.String[] r3 = r8.getStringArray(r3)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r4.<init>()     // Catch: java.lang.Throwable -> L15
            int r5 = r3.length     // Catch: java.lang.Throwable -> L15
            r6 = r2
        L3c:
            if (r6 >= r5) goto L4a
            r7 = r3[r6]     // Catch: java.lang.Throwable -> L15
            byte[] r7 = android.util.Base64.decode(r7, r2)     // Catch: java.lang.Throwable -> L15
            r4.add(r7)     // Catch: java.lang.Throwable -> L15
            int r6 = r6 + 1
            goto L3c
        L4a:
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
        L4d:
            int r9 = r9 + 1
            goto L25
        L50:
            java.lang.String[] r8 = r8.getStringArray(r9)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r9.<init>()     // Catch: java.lang.Throwable -> L15
            int r3 = r8.length     // Catch: java.lang.Throwable -> L15
            r4 = r2
        L5b:
            if (r4 >= r3) goto L69
            r5 = r8[r4]     // Catch: java.lang.Throwable -> L15
            byte[] r5 = android.util.Base64.decode(r5, r2)     // Catch: java.lang.Throwable -> L15
            r9.add(r5)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + 1
            goto L5b
        L69:
            r1.add(r9)     // Catch: java.lang.Throwable -> L15
        L6c:
            r0.recycle()
            return r1
        L70:
            r0.recycle()
            throw r8
    }

    public static final boolean T(defpackage.vh2 r12, defpackage.vh2 r13, int r14, defpackage.ln r15) {
            sh2 r0 = r12.W0()
            sh2 r1 = defpackage.sh2.ActiveParent
            r2 = 0
            if (r0 != r1) goto L1b0
            r0 = 16
            vh2[] r1 = new defpackage.vh2[r0]
            z64 r3 = r12.A
            boolean r3 = r3.j0
            if (r3 != 0) goto L18
            java.lang.String r3 = "visitChildren called on an unattached node"
            defpackage.p53.c(r3)
        L18:
            ua4 r3 = new ua4
            z64[] r4 = new defpackage.z64[r0]
            r3.<init>(r4)
            z64 r4 = r12.A
            z64 r5 = r4.Y
            if (r5 != 0) goto L2a
            defpackage.nc1.z(r3, r4)
        L28:
            r4 = r2
            goto L2e
        L2a:
            r3.b(r5)
            goto L28
        L2e:
            int r5 = r3.L
            r6 = 0
            r7 = 1
            if (r5 == 0) goto Lab
            int r5 = r5 + (-1)
            java.lang.Object r5 = r3.l(r5)
            z64 r5 = (defpackage.z64) r5
            int r8 = r5.R
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L46
            defpackage.nc1.z(r3, r5)
            goto L2e
        L46:
            if (r5 == 0) goto L2e
            int r8 = r5.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto La8
            r8 = r6
        L4f:
            if (r5 == 0) goto L2e
            boolean r9 = r5 instanceof defpackage.vh2
            if (r9 == 0) goto L6d
            vh2 r5 = (defpackage.vh2) r5
            int r9 = r4 + 1
            int r10 = r1.length
            if (r10 >= r9) goto L69
            int r10 = r1.length
            int r11 = r10 * 2
            int r11 = java.lang.Math.max(r9, r11)
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.System.arraycopy(r1, r2, r11, r2, r10)
            r1 = r11
        L69:
            r1[r4] = r5
            r4 = r9
            goto La3
        L6d:
            int r9 = r5.L
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto La3
            boolean r9 = r5 instanceof defpackage.zg1
            if (r9 == 0) goto La3
            r9 = r5
            zg1 r9 = (defpackage.zg1) r9
            z64 r9 = r9.l0
            r10 = r2
        L7d:
            if (r9 == 0) goto La0
            int r11 = r9.L
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L9d
            int r10 = r10 + 1
            if (r10 != r7) goto L8b
            r5 = r9
            goto L9d
        L8b:
            if (r8 != 0) goto L94
            ua4 r8 = new ua4
            z64[] r11 = new defpackage.z64[r0]
            r8.<init>(r11)
        L94:
            if (r5 == 0) goto L9a
            r8.b(r5)
            r5 = r6
        L9a:
            r8.b(r9)
        L9d:
            z64 r9 = r9.Y
            goto L7d
        La0:
            if (r10 != r7) goto La3
            goto L4f
        La3:
            z64 r5 = defpackage.nc1.A(r8)
            goto L4f
        La8:
            z64 r5 = r5.Y
            goto L46
        Lab:
            zh2 r3 = defpackage.zh2.b
            java.util.Arrays.sort(r1, r2, r4, r3)
            if (r14 != r7) goto Lde
            l93 r3 = defpackage.gi2.R(r2, r4)
            int r4 = r3.A
            int r3 = r3.B
            if (r4 > r3) goto L10d
            r5 = r2
        Lbd:
            if (r5 == 0) goto Ld0
            r8 = r1[r4]
            vh2 r8 = (defpackage.vh2) r8
            boolean r9 = defpackage.yh2.A(r8)
            if (r9 == 0) goto Ld0
            boolean r8 = x(r8, r15)
            if (r8 == 0) goto Ld0
            goto Lfe
        Ld0:
            r8 = r1[r4]
            boolean r8 = defpackage.nb3.k(r8, r13)
            if (r8 == 0) goto Ld9
            r5 = r7
        Ld9:
            if (r4 == r3) goto L10d
            int r4 = r4 + 1
            goto Lbd
        Lde:
            r3 = 2
            if (r14 != r3) goto L1aa
            l93 r3 = defpackage.gi2.R(r2, r4)
            int r4 = r3.A
            int r3 = r3.B
            if (r4 > r3) goto L10d
            r5 = r2
        Lec:
            if (r5 == 0) goto Lff
            r8 = r1[r3]
            vh2 r8 = (defpackage.vh2) r8
            boolean r9 = defpackage.yh2.A(r8)
            if (r9 == 0) goto Lff
            boolean r8 = i(r8, r15)
            if (r8 == 0) goto Lff
        Lfe:
            return r7
        Lff:
            r8 = r1[r3]
            boolean r8 = defpackage.nb3.k(r8, r13)
            if (r8 == 0) goto L108
            r5 = r7
        L108:
            if (r3 == r4) goto L10d
            int r3 = r3 + (-1)
            goto Lec
        L10d:
            if (r14 != r7) goto L111
            goto L1a9
        L111:
            ih2 r13 = r12.T0()
            boolean r13 = r13.a
            if (r13 == 0) goto L1a9
            z64 r13 = r12.A
            boolean r13 = r13.j0
            if (r13 != 0) goto L124
            java.lang.String r13 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r13)
        L124:
            z64 r13 = r12.A
            z64 r13 = r13.X
            sm3 r14 = defpackage.nc1.f0(r12)
        L12c:
            if (r14 == 0) goto L19b
            if0 r1 = r14.B0
            java.lang.Object r1 = r1.g
            z64 r1 = (defpackage.z64) r1
            int r1 = r1.R
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L18a
        L13a:
            if (r13 == 0) goto L18a
            int r1 = r13.L
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L187
            r1 = r13
            r3 = r6
        L144:
            if (r1 == 0) goto L187
            boolean r4 = r1 instanceof defpackage.vh2
            if (r4 == 0) goto L14c
            r6 = r1
            goto L19b
        L14c:
            int r4 = r1.L
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L182
            boolean r4 = r1 instanceof defpackage.zg1
            if (r4 == 0) goto L182
            r4 = r1
            zg1 r4 = (defpackage.zg1) r4
            z64 r4 = r4.l0
            r5 = r2
        L15c:
            if (r4 == 0) goto L17f
            int r8 = r4.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L17c
            int r5 = r5 + 1
            if (r5 != r7) goto L16a
            r1 = r4
            goto L17c
        L16a:
            if (r3 != 0) goto L173
            ua4 r3 = new ua4
            z64[] r8 = new defpackage.z64[r0]
            r3.<init>(r8)
        L173:
            if (r1 == 0) goto L179
            r3.b(r1)
            r1 = r6
        L179:
            r3.b(r4)
        L17c:
            z64 r4 = r4.Y
            goto L15c
        L17f:
            if (r5 != r7) goto L182
            goto L144
        L182:
            z64 r1 = defpackage.nc1.A(r3)
            goto L144
        L187:
            z64 r13 = r13.X
            goto L13a
        L18a:
            sm3 r14 = r14.v()
            if (r14 == 0) goto L199
            if0 r13 = r14.B0
            if (r13 == 0) goto L199
            java.lang.Object r13 = r13.f
            vy6 r13 = (defpackage.vy6) r13
            goto L12c
        L199:
            r13 = r6
            goto L12c
        L19b:
            if (r6 != 0) goto L19e
            goto L1a9
        L19e:
            java.lang.Object r12 = r15.g(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L1a9:
            return r2
        L1aa:
            java.lang.String r12 = "This function should only be used for 1-D focus search"
            defpackage.i.m(r12)
            return r2
        L1b0:
            java.lang.String r12 = "This function should only be used within a parent that has focus."
            defpackage.i.m(r12)
            return r2
    }

    public static final java.lang.String U(java.lang.Object r2) {
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r0.isAnonymousClass()
            if (r0 == 0) goto L13
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            goto L1b
        L13:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 64
            r1.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r0 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "%07x"
            java.lang.String r2 = java.lang.String.format(r0, r2)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static void V(org.xmlpull.v1.XmlPullParser r3) {
            r0 = 1
        L1:
            if (r0 <= 0) goto L14
            int r1 = r3.next()
            r2 = 2
            if (r1 == r2) goto L11
            r2 = 3
            if (r1 == r2) goto Le
            goto L1
        Le:
            int r0 = r0 + (-1)
            goto L1
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    public static void W(android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            defpackage.rp.y(r2, r3)
            return
        La:
            boolean r0 = defpackage.ej2.g
            if (r0 == 0) goto L15
            defpackage.rp.y(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L12
            return
        L12:
            r2 = 0
            defpackage.ej2.g = r2
        L15:
            return
    }

    public static final defpackage.a74 X(defpackage.a74 r7, defpackage.ke6 r8, long r9, defpackage.c60 r11, float r12) {
            r4 = 0
            r6 = 24
            r3 = 0
            r0 = r7
            r2 = r8
            r1 = r12
            a74 r7 = defpackage.nj2.E(r0, r1, r2, r3, r4, r6)
            if (r11 == 0) goto L18
            float r8 = r11.a
            cn6 r11 = r11.b
            b60 r12 = new b60
            r12.<init>(r8, r11, r2)
            goto L1a
        L18:
            x64 r12 = defpackage.x64.a
        L1a:
            a74 r7 = r7.d(r12)
            a74 r7 = defpackage.vy7.L(r7, r9, r2)
            a74 r7 = defpackage.u24.g(r7, r2)
            return r7
    }

    public static final long Y(long r2, defpackage.qd1 r4, float r5, defpackage.xq2 r6) {
            nq6 r0 = defpackage.vt0.a
            java.lang.Object r0 = r6.j(r0)
            ut0 r0 = (defpackage.ut0) r0
            long r0 = r0.j()
            boolean r0 = defpackage.kt0.d(r2, r0)
            r1 = 0
            if (r0 == 0) goto L23
            if (r4 == 0) goto L23
            r4 = -1124614454(0xffffffffbcf7beca, float:-0.030242343)
            r6.b0(r4)
            long r2 = defpackage.qd1.a(r2, r5, r6, r1)
            r6.p(r1)
            return r2
        L23:
            r4 = -1124546347(0xffffffffbcf8c8d5, float:-0.030369202)
            r6.b0(r4)
            r6.p(r1)
            return r2
    }

    public static final android.graphics.Rect Z(defpackage.m93 r4) {
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.a
            int r2 = r4.b
            int r3 = r4.c
            int r4 = r4.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final long a(int r2) {
            if (r2 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 != 0) goto Lc
            java.lang.String r0 = "The span value should be higher than 0"
            defpackage.s53.a(r0)
        Lc:
            long r0 = (long) r2
            return r0
    }

    public static final android.graphics.RectF a0(defpackage.of5 r4) {
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r4.a
            float r2 = r4.b
            float r3 = r4.c
            float r4 = r4.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final void b(defpackage.on2 r15, defpackage.a74 r16, boolean r17, defpackage.eo2 r18, defpackage.px0 r19, int r20, int r21) {
            r4 = r18
            r5 = r20
            r0 = r19
            xq2 r0 = (defpackage.xq2) r0
            r1 = 1316660641(0x4e7aa5a1, float:1.05128966E9)
            r0.d0(r1)
            r1 = r5 & 6
            r2 = 4
            if (r1 != 0) goto L1e
            boolean r1 = r0.h(r15)
            if (r1 == 0) goto L1b
            r1 = r2
            goto L1c
        L1b:
            r1 = 2
        L1c:
            r1 = r1 | r5
            goto L1f
        L1e:
            r1 = r5
        L1f:
            r3 = r21 & 2
            if (r3 == 0) goto L28
            r1 = r1 | 48
        L25:
            r6 = r16
            goto L3a
        L28:
            r6 = r5 & 48
            if (r6 != 0) goto L25
            r6 = r16
            boolean r7 = r0.f(r6)
            if (r7 == 0) goto L37
            r7 = 32
            goto L39
        L37:
            r7 = 16
        L39:
            r1 = r1 | r7
        L3a:
            r1 = r1 | 3456(0xd80, float:4.843E-42)
            r7 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L4c
            boolean r7 = r0.h(r4)
            if (r7 == 0) goto L49
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L4b
        L49:
            r7 = 8192(0x2000, float:1.148E-41)
        L4b:
            r1 = r1 | r7
        L4c:
            r7 = r1 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            r13 = 1
            r14 = 0
            if (r7 == r8) goto L56
            r7 = r13
            goto L57
        L56:
            r7 = r14
        L57:
            r8 = r1 & 1
            boolean r7 = r0.S(r8, r7)
            if (r7 == 0) goto Lfb
            if (r3 == 0) goto L64
            x64 r3 = defpackage.x64.a
            goto L65
        L64:
            r3 = r6
        L65:
            nq6 r6 = defpackage.u93.a
            m64 r6 = defpackage.m64.a
            a74 r6 = r3.d(r6)
            r7 = 0
            kq5 r8 = defpackage.jq5.a(r2, r7, r14)
            mq5 r10 = new mq5
            r10.<init>(r14)
            r12 = 8
            r7 = 0
            r9 = 1
            r11 = r15
            a74 r2 = defpackage.mb3.t(r6, r7, r8, r9, r10, r11, r12)
            e40 r6 = defpackage.d90.Z
            e34 r6 = defpackage.h70.d(r6, r14)
            int r7 = defpackage.ge7.B(r0)
            xv4 r8 = r0.l()
            a74 r2 = defpackage.l.E(r0, r2)
            ix0 r10 = defpackage.jx0.i
            r10.getClass()
            iy0 r10 = defpackage.ix0.b
            r0.f0()
            boolean r11 = r0.S
            if (r11 == 0) goto La5
            r0.k(r10)
            goto La8
        La5:
            r0.o0()
        La8:
            pn r10 = defpackage.ix0.f
            defpackage.yh2.K(r0, r10, r6)
            pn r6 = defpackage.ix0.e
            defpackage.yh2.K(r0, r6, r8)
            pn r6 = defpackage.ix0.g
            boolean r8 = r0.S
            if (r8 != 0) goto Lc6
            java.lang.Object r8 = r0.P()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = defpackage.nb3.k(r8, r10)
            if (r8 != 0) goto Lc9
        Lc6:
            defpackage.i61.v(r7, r0, r7, r6)
        Lc9:
            pn r6 = defpackage.ix0.d
            defpackage.yh2.K(r0, r6, r2)
            r2 = -1874697310(0xffffffff904263a2, float:-3.8336508E-29)
            r0.b0(r2)
            py0 r2 = defpackage.g31.a
            java.lang.Object r6 = r0.j(r2)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r0.p(r14)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            pq r2 = r2.a(r6)
            int r1 = r1 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r6 = 8
            r1 = r1 | r6
            defpackage.hv.d(r2, r4, r0, r1)
            r0.p(r13)
            r2 = r3
            r3 = r9
            goto L101
        Lfb:
            r0.V()
            r3 = r17
            r2 = r6
        L101:
            cf5 r7 = r0.t()
            if (r7 == 0) goto L111
            g13 r0 = new g13
            r1 = r15
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        L111:
            return
    }

    public static final defpackage.of5 b0(android.graphics.RectF r4) {
            of5 r0 = new of5
            float r1 = r4.left
            float r2 = r4.top
            float r3 = r4.right
            float r4 = r4.bottom
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final void c(defpackage.a74 r17, defpackage.ke6 r18, long r19, long r21, float r23, defpackage.zv0 r24, defpackage.px0 r25, int r26, int r27) {
            r3 = r19
            r9 = r26
            r8 = r25
            xq2 r8 = (defpackage.xq2) r8
            r0 = 174096871(0xa6081e7, float:1.08096396E-32)
            r8.d0(r0)
            r0 = r27 & 1
            if (r0 == 0) goto L18
            r1 = r9 | 6
            r2 = r1
            r1 = r17
            goto L2c
        L18:
            r1 = r9 & 6
            if (r1 != 0) goto L29
            r1 = r17
            boolean r2 = r8.f(r1)
            if (r2 == 0) goto L26
            r2 = 4
            goto L27
        L26:
            r2 = 2
        L27:
            r2 = r2 | r9
            goto L2c
        L29:
            r1 = r17
            r2 = r9
        L2c:
            r5 = r27 & 2
            if (r5 == 0) goto L35
            r2 = r2 | 48
        L32:
            r6 = r18
            goto L47
        L35:
            r6 = r9 & 48
            if (r6 != 0) goto L32
            r6 = r18
            boolean r7 = r8.f(r6)
            if (r7 == 0) goto L44
            r7 = 32
            goto L46
        L44:
            r7 = 16
        L46:
            r2 = r2 | r7
        L47:
            r7 = r9 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L57
            boolean r7 = r8.e(r3)
            if (r7 == 0) goto L54
            r7 = 256(0x100, float:3.59E-43)
            goto L56
        L54:
            r7 = 128(0x80, float:1.8E-43)
        L56:
            r2 = r2 | r7
        L57:
            r7 = r9 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L6e
            r7 = r27 & 8
            r10 = r21
            if (r7 != 0) goto L6a
            boolean r7 = r8.e(r10)
            if (r7 == 0) goto L6a
            r7 = 2048(0x800, float:2.87E-42)
            goto L6c
        L6a:
            r7 = 1024(0x400, float:1.435E-42)
        L6c:
            r2 = r2 | r7
            goto L70
        L6e:
            r10 = r21
        L70:
            r7 = r27 & 16
            if (r7 == 0) goto L77
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L88
        L77:
            r7 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L88
            r7 = 0
            boolean r7 = r8.f(r7)
            if (r7 == 0) goto L85
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L87
        L85:
            r7 = 8192(0x2000, float:1.148E-41)
        L87:
            r2 = r2 | r7
        L88:
            r7 = r27 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L92
            r2 = r2 | r12
        L8f:
            r12 = r23
            goto La3
        L92:
            r12 = r12 & r9
            if (r12 != 0) goto L8f
            r12 = r23
            boolean r13 = r8.c(r12)
            if (r13 == 0) goto La0
            r13 = 131072(0x20000, float:1.83671E-40)
            goto La2
        La0:
            r13 = 65536(0x10000, float:9.1835E-41)
        La2:
            r2 = r2 | r13
        La3:
            r13 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 & r9
            if (r13 != 0) goto Lb7
            r13 = r24
            boolean r14 = r8.h(r13)
            if (r14 == 0) goto Lb3
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto Lb5
        Lb3:
            r14 = 524288(0x80000, float:7.34684E-40)
        Lb5:
            r2 = r2 | r14
            goto Lb9
        Lb7:
            r13 = r24
        Lb9:
            r14 = 599187(0x92493, float:8.3964E-40)
            r14 = r14 & r2
            r15 = 599186(0x92492, float:8.39638E-40)
            r16 = 1
            if (r14 == r15) goto Lc7
            r14 = r16
            goto Lc8
        Lc7:
            r14 = 0
        Lc8:
            r2 = r2 & 1
            boolean r2 = r8.S(r2, r14)
            if (r2 == 0) goto L13c
            r8.X()
            r2 = r9 & 1
            if (r2 == 0) goto Le4
            boolean r2 = r8.B()
            if (r2 == 0) goto Lde
            goto Le4
        Lde:
            r8.V()
        Le1:
            r2 = r6
            r6 = r12
            goto L101
        Le4:
            if (r0 == 0) goto Le9
            x64 r0 = defpackage.x64.a
            goto Lea
        Le9:
            r0 = r1
        Lea:
            if (r5 == 0) goto Lef
            jy2 r1 = defpackage.u24.m
            r6 = r1
        Lef:
            r1 = r27 & 8
            if (r1 == 0) goto Lf8
            long r1 = defpackage.vt0.b(r3, r8)
            r10 = r1
        Lf8:
            if (r7 == 0) goto Lff
            r1 = 0
            r2 = r6
            r6 = r1
            r1 = r0
            goto L101
        Lff:
            r1 = r0
            goto Le1
        L101:
            r8.q()
            py0 r0 = defpackage.os1.b
            java.lang.Object r5 = r8.j(r0)
            om1 r5 = (defpackage.om1) r5
            float r5 = r5.A
            float r5 = r5 + r6
            py0 r7 = defpackage.j31.a
            kt0 r12 = new kt0
            r12.<init>(r10)
            pq r7 = r7.a(r12)
            om1 r12 = new om1
            r12.<init>(r5)
            pq r0 = r0.a(r12)
            pq[] r12 = new defpackage.pq[]{r7, r0}
            sv6 r0 = new sv6
            r7 = r13
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r3 = -2004281689(0xffffffff888916a7, float:-8.250713E-34)
            zv0 r0 = defpackage.n16.I(r3, r0, r8)
            r3 = 56
            defpackage.hv.e(r12, r0, r8, r3)
            r7 = r6
        L13a:
            r5 = r10
            goto L142
        L13c:
            r8.V()
            r2 = r6
            r7 = r12
            goto L13a
        L142:
            cf5 r11 = r8.t()
            if (r11 == 0) goto L155
            tv6 r0 = new tv6
            r3 = r19
            r8 = r24
            r10 = r27
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r11.d = r0
        L155:
            return
    }

    public static java.lang.Object c0(java.lang.String r4) {
            java.lang.String r0 = "http://"
            if (r4 == 0) goto Ld
            java.lang.CharSequence r4 = defpackage.qs6.T0(r4)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lf7
            goto Le
        Ld:
            r4 = 0
        Le:
            if (r4 != 0) goto L12
            java.lang.String r4 = ""
        L12:
            int r1 = r4.length()     // Catch: java.lang.Throwable -> Lf7
            if (r1 <= 0) goto Lef
            java.net.URI r1 = new java.net.URI     // Catch: java.lang.Throwable -> Lf7
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r4 = r1.getScheme()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r2 = "http"
            boolean r4 = defpackage.nb3.k(r4, r2)     // Catch: java.lang.Throwable -> Lf7
            if (r4 == 0) goto Le7
            java.lang.String r4 = r1.getRawUserInfo()     // Catch: java.lang.Throwable -> Lf7
            if (r4 != 0) goto Ldf
            java.lang.String r4 = r1.getRawQuery()     // Catch: java.lang.Throwable -> Lf7
            if (r4 != 0) goto Ld7
            java.lang.String r4 = r1.getRawFragment()     // Catch: java.lang.Throwable -> Lf7
            if (r4 != 0) goto Lcf
            java.lang.String r4 = r1.getHost()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r2 = "127.0.0.1"
            boolean r4 = defpackage.nb3.k(r4, r2)     // Catch: java.lang.Throwable -> Lf7
            r2 = 1
            if (r4 != 0) goto L5d
            java.lang.String r4 = r1.getHost()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r3 = "localhost"
            boolean r4 = defpackage.xs6.Z(r4, r3, r2)     // Catch: java.lang.Throwable -> Lf7
            if (r4 == 0) goto L55
            goto L5d
        L55:
            java.lang.String r4 = "Only localhost or 127.0.0.1 is allowed"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        L5d:
            int r4 = r1.getPort()     // Catch: java.lang.Throwable -> Lf7
            if (r2 > r4) goto Lc7
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r4 >= r2) goto Lc7
            java.lang.String r4 = r1.getRawPath()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r2 = "/dorequest.php"
            if (r4 == 0) goto L95
            int r4 = r4.length()     // Catch: java.lang.Throwable -> Lf7
            if (r4 != 0) goto L76
            goto L95
        L76:
            java.lang.String r4 = r1.getRawPath()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r3 = "/"
            boolean r4 = defpackage.nb3.k(r4, r3)     // Catch: java.lang.Throwable -> Lf7
            if (r4 != 0) goto L95
            java.lang.String r4 = r1.getRawPath()     // Catch: java.lang.Throwable -> Lf7
            boolean r4 = defpackage.nb3.k(r4, r2)     // Catch: java.lang.Throwable -> Lf7
            if (r4 == 0) goto L8d
            goto L95
        L8d:
            java.lang.String r4 = "Only /dorequest.php is allowed"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        L95:
            java.lang.String r4 = r1.getHost()     // Catch: java.lang.Throwable -> Lf7
            r4.getClass()     // Catch: java.lang.Throwable -> Lf7
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r4 = r4.toLowerCase(r3)     // Catch: java.lang.Throwable -> Lf7
            r4.getClass()     // Catch: java.lang.Throwable -> Lf7
            int r1 = r1.getPort()     // Catch: java.lang.Throwable -> Lf7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf7
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lf7
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r4 = ":"
            r3.append(r4)     // Catch: java.lang.Throwable -> Lf7
            r3.append(r1)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> Lf7
            ik7 r0 = new ik7     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = r4.concat(r2)     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lf7
            return r0
        Lc7:
            java.lang.String r4 = "A valid explicit port is required"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        Lcf:
            java.lang.String r4 = "Fragment is not allowed"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        Ld7:
            java.lang.String r4 = "Query is not allowed"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        Ldf:
            java.lang.String r4 = "User info is not allowed"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        Le7:
            java.lang.String r4 = "Only HTTP loopback is supported"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        Lef:
            java.lang.String r4 = "Missing host"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lf7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r0     // Catch: java.lang.Throwable -> Lf7
        Lf7:
            r4 = move-exception
            em5 r0 = new em5
            r0.<init>(r4)
            return r0
    }

    public static final void d(defpackage.on2 r21, defpackage.a74 r22, boolean r23, defpackage.ke6 r24, long r25, long r27, defpackage.c60 r29, float r30, defpackage.r94 r31, defpackage.zv0 r32, defpackage.px0 r33, int r34, int r35) {
            r7 = r27
            r10 = r30
            r0 = r34
            r1 = r33
            xq2 r1 = (defpackage.xq2) r1
            r2 = 2141308794(0x7fa1c77a, float:NaN)
            r1.d0(r2)
            r2 = r0 & 6
            if (r2 != 0) goto L21
            r2 = r21
            boolean r3 = r1.h(r2)
            if (r3 == 0) goto L1e
            r3 = 4
            goto L1f
        L1e:
            r3 = 2
        L1f:
            r3 = r3 | r0
            goto L24
        L21:
            r2 = r21
            r3 = r0
        L24:
            r4 = r0 & 48
            if (r4 != 0) goto L37
            r4 = r22
            boolean r5 = r1.f(r4)
            if (r5 == 0) goto L33
            r5 = 32
            goto L35
        L33:
            r5 = 16
        L35:
            r3 = r3 | r5
            goto L39
        L37:
            r4 = r22
        L39:
            r5 = r35 & 4
            if (r5 == 0) goto L42
            r3 = r3 | 384(0x180, float:5.38E-43)
        L3f:
            r6 = r23
            goto L54
        L42:
            r6 = r0 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L3f
            r6 = r23
            boolean r9 = r1.g(r6)
            if (r9 == 0) goto L51
            r9 = 256(0x100, float:3.59E-43)
            goto L53
        L51:
            r9 = 128(0x80, float:1.8E-43)
        L53:
            r3 = r3 | r9
        L54:
            r9 = r0 & 3072(0xc00, float:4.305E-42)
            r11 = r24
            if (r9 != 0) goto L66
            boolean r9 = r1.f(r11)
            if (r9 == 0) goto L63
            r9 = 2048(0x800, float:2.87E-42)
            goto L65
        L63:
            r9 = 1024(0x400, float:1.435E-42)
        L65:
            r3 = r3 | r9
        L66:
            r9 = r0 & 24576(0x6000, float:3.4438E-41)
            r12 = r25
            if (r9 != 0) goto L78
            boolean r9 = r1.e(r12)
            if (r9 == 0) goto L75
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L77
        L75:
            r9 = 8192(0x2000, float:1.148E-41)
        L77:
            r3 = r3 | r9
        L78:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r0
            if (r9 != 0) goto L89
            boolean r9 = r1.e(r7)
            if (r9 == 0) goto L86
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L88
        L86:
            r9 = 65536(0x10000, float:9.1835E-41)
        L88:
            r3 = r3 | r9
        L89:
            r9 = r35 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L93
            r3 = r3 | r14
        L90:
            r14 = r29
            goto La4
        L93:
            r14 = r14 & r0
            if (r14 != 0) goto L90
            r14 = r29
            boolean r15 = r1.f(r14)
            if (r15 == 0) goto La1
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto La3
        La1:
            r15 = 524288(0x80000, float:7.34684E-40)
        La3:
            r3 = r3 | r15
        La4:
            r15 = 12582912(0xc00000, float:1.7632415E-38)
            r15 = r15 & r0
            if (r15 != 0) goto Lb5
            boolean r15 = r1.c(r10)
            if (r15 == 0) goto Lb2
            r15 = 8388608(0x800000, float:1.1754944E-38)
            goto Lb4
        Lb2:
            r15 = 4194304(0x400000, float:5.877472E-39)
        Lb4:
            r3 = r3 | r15
        Lb5:
            r15 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = r15 & r0
            if (r15 != 0) goto Lca
            r15 = r31
            boolean r16 = r1.f(r15)
            if (r16 == 0) goto Lc5
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc7
        Lc5:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        Lc7:
            r3 = r3 | r16
            goto Lcc
        Lca:
            r15 = r31
        Lcc:
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r16 = r0 & r16
            r0 = r32
            if (r16 != 0) goto Le1
            boolean r16 = r1.h(r0)
            if (r16 == 0) goto Ldd
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto Ldf
        Ldd:
            r16 = 268435456(0x10000000, float:2.524355E-29)
        Ldf:
            r3 = r3 | r16
        Le1:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r3 & r16
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = 1
            if (r0 == r2) goto Lf0
            r0 = r16
            goto Lf1
        Lf0:
            r0 = 0
        Lf1:
            r2 = r3 & 1
            boolean r0 = r1.S(r2, r0)
            if (r0 == 0) goto L15c
            r1.X()
            r0 = r34 & 1
            if (r0 == 0) goto L10e
            boolean r0 = r1.B()
            if (r0 == 0) goto L107
            goto L10e
        L107:
            r1.V()
        L10a:
            r18 = r6
            r15 = r14
            goto L117
        L10e:
            if (r5 == 0) goto L112
            r6 = r16
        L112:
            if (r9 == 0) goto L10a
            r0 = 0
            r14 = r0
            goto L10a
        L117:
            r1.q()
            py0 r0 = defpackage.os1.b
            java.lang.Object r2 = r1.j(r0)
            om1 r2 = (defpackage.om1) r2
            float r2 = r2.A
            float r14 = r2 + r10
            py0 r2 = defpackage.j31.a
            kt0 r3 = new kt0
            r3.<init>(r7)
            pq r2 = r2.a(r3)
            om1 r3 = new om1
            r3.<init>(r14)
            pq r0 = r0.a(r3)
            pq[] r0 = new defpackage.pq[]{r2, r0}
            uv6 r9 = new uv6
            r19 = r21
            r17 = r31
            r20 = r32
            r16 = r10
            r10 = r4
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19, r20)
            r2 = -1766606150(0xffffffff96b3baba, float:-2.903685E-25)
            zv0 r2 = defpackage.n16.I(r2, r9, r1)
            r3 = 56
            defpackage.hv.e(r0, r2, r1, r3)
            r9 = r15
            r3 = r18
            goto L161
        L15c:
            r1.V()
            r3 = r6
            r9 = r14
        L161:
            cf5 r15 = r1.t()
            if (r15 == 0) goto L180
            vv6 r0 = new vv6
            r1 = r21
            r2 = r22
            r4 = r24
            r5 = r25
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r34
            r14 = r35
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            r15.d = r0
        L180:
            return
    }

    public static final defpackage.ea6 e(defpackage.ci r4, defpackage.s60 r5) {
            m71 r0 = r4.m()
            java.lang.Object r4 = r4.R
            ls0 r4 = (defpackage.ls0) r4
            m71 r1 = defpackage.m71.CROSSED
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            ea6 r1 = new ea6
            da6 r3 = h(r4, r0, r3, r5)
            da6 r4 = h(r4, r0, r2, r5)
            r1.<init>(r3, r4, r0)
            return r1
    }

    public static final defpackage.da6 f(defpackage.ci r13, defpackage.ls0 r14, defpackage.da6 r15) {
            int r0 = r14.c
            int r1 = r14.b
            boolean r2 = r13.B
            if (r2 == 0) goto La
            r5 = r1
            goto Lb
        La:
            r5 = r0
        Lb:
            java.lang.Object r3 = r14.e
            r9 = r3
            a47 r9 = (defpackage.a47) r9
            int r10 = r14.d
            xr3 r11 = defpackage.xr3.NONE
            mz2 r3 = new mz2
            r3.<init>(r5, r14)
            go3 r8 = defpackage.kj2.M(r11, r3)
            if (r2 == 0) goto L21
            r6 = r0
            goto L22
        L21:
            r6 = r1
        L22:
            vr5 r3 = new vr5
            r7 = r13
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            go3 r13 = defpackage.kj2.M(r11, r3)
            r6 = 1
            long r11 = r15.c
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 == 0) goto L3c
            java.lang.Object r13 = r13.getValue()
            da6 r13 = (defpackage.da6) r13
            return r13
        L3c:
            if (r5 != r10) goto L3f
            return r15
        L3f:
            v84 r14 = r9.b
            int r14 = r14.d(r10)
            java.lang.Object r3 = r8.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == r14) goto L58
            java.lang.Object r13 = r13.getValue()
            da6 r13 = (defpackage.da6) r13
            return r13
        L58:
            int r14 = r15.b
            long r6 = r9.j(r14)
            r15 = -1
            if (r10 != r15) goto L62
            goto L80
        L62:
            if (r5 != r10) goto L65
            goto L9f
        L65:
            if (r1 >= r0) goto L6a
            m71 r15 = defpackage.m71.NOT_CROSSED
            goto L71
        L6a:
            if (r1 <= r0) goto L6f
            m71 r15 = defpackage.m71.CROSSED
            goto L71
        L6f:
            m71 r15 = defpackage.m71.COLLAPSED
        L71:
            m71 r0 = defpackage.m71.CROSSED
            if (r15 != r0) goto L77
            r15 = 1
            goto L78
        L77:
            r15 = 0
        L78:
            r15 = r15 ^ r2
            if (r15 == 0) goto L7e
            if (r5 >= r10) goto L9f
            goto L80
        L7e:
            if (r5 <= r10) goto L9f
        L80:
            int r15 = defpackage.k47.c
            r15 = 32
            long r0 = r6 >> r15
            int r15 = (int) r0
            if (r14 == r15) goto L98
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r15 = (int) r0
            if (r14 != r15) goto L93
            goto L98
        L93:
            da6 r13 = r4.b(r5)
            return r13
        L98:
            java.lang.Object r13 = r13.getValue()
            da6 r13 = (defpackage.da6) r13
            return r13
        L9f:
            da6 r13 = r4.b(r5)
            return r13
    }

    public static final void g(defpackage.j07 r16, android.content.Context r17, boolean r18, java.lang.String r19, long r20) {
            r0 = r16
            boolean r1 = defpackage.k47.c(r20)
            if (r1 != 0) goto L64
            int r1 = r19.length()
            if (r1 != 0) goto Lf
            goto L64
        Lf:
            android.content.pm.PackageManager r1 = r17.getPackageManager()
            dv4 r2 = defpackage.mb3.v
            r4 = r17
            java.lang.Object r2 = r2.g(r4)
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L24
            goto L64
        L24:
            ca4 r3 = r0.a
            ca4 r0 = r0.a
            w07 r10 = defpackage.w07.b
            r3.a(r10)
            int r11 = r2.size()
            r12 = 0
            r13 = r12
        L33:
            if (r13 >= r11) goto L61
            java.lang.Object r3 = r2.get(r13)
            r5 = r3
            android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
            j35 r14 = new j35
            r14.<init>(r13)
            java.lang.CharSequence r3 = r5.loadLabel(r1)
            java.lang.String r15 = r3.toString()
            k35 r3 = new k35
            r6 = r18
            r7 = r19
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8)
            s07 r4 = new s07
            r4.<init>(r14, r15, r12, r3)
            r0.a(r4)
            int r13 = r13 + 1
            r4 = r17
            goto L33
        L61:
            r0.a(r10)
        L64:
            return
    }

    public static final defpackage.da6 h(defpackage.ls0 r2, boolean r3, boolean r4, defpackage.s60 r5) {
            if (r4 == 0) goto L5
            int r0 = r2.b
            goto L7
        L5:
            int r0 = r2.c
        L7:
            long r0 = r5.k(r0, r2)
            r3 = r3 ^ r4
            if (r3 == 0) goto L16
            int r3 = defpackage.k47.c
            r3 = 32
            long r3 = r0 >> r3
        L14:
            int r3 = (int) r3
            goto L1f
        L16:
            int r3 = defpackage.k47.c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            goto L14
        L1f:
            da6 r2 = r2.b(r3)
            return r2
    }

    public static final boolean i(defpackage.vh2 r9, defpackage.ln r10) {
            sh2 r0 = r9.W0()
            int[] r1 = defpackage.zl4.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L3f
            if (r0 == r5) goto L3a
            if (r0 == r3) goto L3a
            if (r0 != r2) goto L36
            boolean r0 = P(r9, r10)
            if (r0 != 0) goto L88
            ih2 r0 = r9.T0()
            boolean r0 = r0.a
            if (r0 == 0) goto L32
            java.lang.Object r9 = r10.g(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L33
        L32:
            r9 = r4
        L33:
            if (r9 == 0) goto L87
            goto L88
        L36:
            defpackage.i.d()
            return r4
        L3a:
            boolean r9 = P(r9, r10)
            return r9
        L3f:
            vh2 r0 = defpackage.yh2.t(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L89
            sh2 r8 = r0.W0()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L66
            if (r1 == r5) goto L61
            if (r1 == r3) goto L61
            if (r1 == r2) goto L5d
            defpackage.i.d()
            return r4
        L5d:
            defpackage.i.m(r7)
            return r4
        L61:
            boolean r9 = y(r9, r0, r5, r10)
            return r9
        L66:
            boolean r1 = i(r0, r10)
            if (r1 != 0) goto L88
            boolean r9 = y(r9, r0, r5, r10)
            if (r9 != 0) goto L88
            ih2 r9 = r0.T0()
            boolean r9 = r9.a
            if (r9 == 0) goto L87
            java.lang.Object r9 = r10.g(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L87
            goto L88
        L87:
            return r4
        L88:
            return r6
        L89:
            defpackage.i.m(r7)
            return r4
    }

    public static final defpackage.of5 j(defpackage.jk3 r6) {
            jk3 r0 = r6.D()
            if (r0 == 0) goto Lc
            r1 = 1
            of5 r6 = r0.O(r6, r1)
            return r6
        Lc:
            of5 r0 = new of5
            long r1 = r6.m()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = (float) r1
            long r2 = r6.m()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r6 = (int) r2
            float r6 = (float) r6
            r2 = 0
            r0.<init>(r2, r2, r1, r6)
            return r0
    }

    public static final defpackage.of5 k(defpackage.jk3 r14, boolean r15) {
            jk3 r0 = w(r14)
            long r1 = r0.m()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = (float) r1
            long r4 = r0.m()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r2 = (int) r4
            float r2 = (float) r2
            of5 r14 = r0.O(r14, r15)
            float r4 = r14.a
            r5 = 0
            if (r15 == 0) goto L2c
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 >= 0) goto L27
            r4 = r5
        L27:
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 <= 0) goto L2c
            r4 = r1
        L2c:
            float r8 = r14.b
            if (r15 == 0) goto L3a
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 >= 0) goto L35
            r8 = r5
        L35:
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 <= 0) goto L3a
            r8 = r2
        L3a:
            float r9 = r14.c
            if (r15 == 0) goto L4a
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L43
            r9 = r5
        L43:
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L48
            goto L49
        L48:
            r1 = r9
        L49:
            r9 = r1
        L4a:
            float r14 = r14.d
            if (r15 == 0) goto L5b
            int r15 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r15 >= 0) goto L53
            goto L54
        L53:
            r5 = r14
        L54:
            int r14 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r14 <= 0) goto L59
            goto L5a
        L59:
            r2 = r5
        L5a:
            r14 = r2
        L5b:
            int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r15 != 0) goto L60
            goto L64
        L60:
            int r15 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r15 != 0) goto L67
        L64:
            of5 r14 = defpackage.of5.e
            return r14
        L67:
            int r15 = java.lang.Float.floatToRawIntBits(r4)
            long r1 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r15
            long r1 = r1 << r3
            long r10 = r10 & r6
            long r1 = r1 | r10
            long r1 = r0.d(r1)
            int r15 = java.lang.Float.floatToRawIntBits(r9)
            long r10 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r8)
            long r12 = (long) r15
            long r10 = r10 << r3
            long r12 = r12 & r6
            long r10 = r10 | r12
            long r10 = r0.d(r10)
            int r15 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r14)
            long r12 = (long) r15
            long r8 = r8 << r3
            long r12 = r12 & r6
            long r8 = r8 | r12
            long r8 = r0.d(r8)
            int r15 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r15
            int r14 = java.lang.Float.floatToRawIntBits(r14)
            long r14 = (long) r14
            long r4 = r4 << r3
            long r14 = r14 & r6
            long r14 = r14 | r4
            long r14 = r0.d(r14)
            long r4 = r1 >> r3
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r10 >> r3
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r12 = r14 >> r3
            int r5 = (int) r12
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r12 = r8 >> r3
            int r3 = (int) r12
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r12 = java.lang.Math.min(r5, r3)
            float r12 = java.lang.Math.min(r4, r12)
            float r12 = java.lang.Math.min(r0, r12)
            float r3 = java.lang.Math.max(r5, r3)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = java.lang.Math.max(r0, r3)
            long r1 = r1 & r6
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r10 & r6
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r14 = r14 & r6
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            long r3 = r8 & r6
            int r15 = (int) r3
            float r15 = java.lang.Float.intBitsToFloat(r15)
            float r3 = java.lang.Math.min(r14, r15)
            float r3 = java.lang.Math.min(r2, r3)
            float r3 = java.lang.Math.min(r1, r3)
            float r14 = java.lang.Math.max(r14, r15)
            float r14 = java.lang.Math.max(r2, r14)
            float r14 = java.lang.Math.max(r1, r14)
            of5 r15 = new of5
            r15.<init>(r12, r3, r0, r14)
            return r15
    }

    public static final defpackage.da6 l(defpackage.da6 r2, defpackage.ls0 r3, int r4) {
            java.lang.Object r3 = r3.e
            a47 r3 = (defpackage.a47) r3
            jl5 r3 = r3.a(r4)
            long r0 = r2.c
            da6 r2 = new da6
            r2.<init>(r3, r4, r0)
            return r2
    }

    public static final boolean m(defpackage.vy4 r1) {
            boolean r0 = r1.c()
            if (r0 != 0) goto L10
            boolean r0 = r1.h
            if (r0 != 0) goto L10
            boolean r1 = r1.d
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final boolean n(defpackage.vy4 r1) {
            boolean r0 = r1.h
            if (r0 != 0) goto La
            boolean r1 = r1.d
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final boolean o(defpackage.vy4 r1) {
            boolean r0 = r1.c()
            if (r0 != 0) goto L10
            boolean r0 = r1.h
            if (r0 == 0) goto L10
            boolean r1 = r1.d
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final boolean p(defpackage.vy4 r1) {
            boolean r0 = r1.h
            if (r0 == 0) goto La
            boolean r1 = r1.d
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static int q(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static defpackage.cf1 r(long r24, long r26, defpackage.px0 r28, int r29) {
            r0 = r28
            r1 = r29 & 1
            if (r1 == 0) goto L17
            nq6 r1 = defpackage.vt0.a
            r2 = r0
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r1 = r2.j(r1)
            ut0 r1 = (defpackage.ut0) r1
            long r1 = r1.g()
            r4 = r1
            goto L19
        L17:
            r4 = r24
        L19:
            nq6 r1 = defpackage.vt0.a
            r2 = r0
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r3 = r2.j(r1)
            ut0 r3 = (defpackage.ut0) r3
            long r6 = r3.f()
            py0 r3 = defpackage.j31.a
            java.lang.Object r3 = r2.j(r3)
            kt0 r3 = (defpackage.kt0) r3
            long r8 = r3.a
            java.lang.Object r3 = r2.j(r1)
            ut0 r3 = (defpackage.ut0) r3
            boolean r3 = r3.k()
            if (r3 == 0) goto L42
            defpackage.hv.N(r8)
            goto L45
        L42:
            defpackage.hv.N(r8)
        L45:
            r3 = 1052938076(0x3ec28f5c, float:0.38)
            long r6 = defpackage.kt0.c(r3, r6)
            java.lang.Object r2 = r2.j(r1)
            ut0 r2 = (defpackage.ut0) r2
            long r2 = r2.j()
            long r6 = defpackage.hv.l(r6, r2)
            r2 = r29 & 4
            if (r2 == 0) goto L6d
            r2 = r0
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r2 = r2.j(r1)
            ut0 r2 = (defpackage.ut0) r2
            long r2 = r2.g()
            r8 = r2
            goto L6f
        L6d:
            r8 = r26
        L6f:
            r2 = 1047904911(0x3e75c28f, float:0.24)
            long r10 = defpackage.kt0.c(r2, r8)
            r2 = r0
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r1 = r2.j(r1)
            ut0 r1 = (defpackage.ut0) r1
            long r1 = r1.f()
            r3 = 1050924810(0x3ea3d70a, float:0.32)
            long r12 = defpackage.kt0.c(r3, r1)
            r1 = 1039516303(0x3df5c28f, float:0.12)
            long r14 = defpackage.kt0.c(r1, r12)
            long r2 = defpackage.vt0.b(r8, r0)
            r0 = 1057635697(0x3f0a3d71, float:0.54)
            long r2 = defpackage.kt0.c(r0, r2)
            long r18 = defpackage.kt0.c(r0, r8)
            long r20 = defpackage.kt0.c(r1, r2)
            long r22 = defpackage.kt0.c(r1, r14)
            r16 = r2
            cf1 r3 = new cf1
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r20, r22)
            return r3
    }

    public static final int s(defpackage.j36 r10, java.lang.String r11) {
            r10.getClass()
            int r0 = r10.getColumnCount()
            r1 = 0
            r2 = r1
        L9:
            r3 = -1
            if (r2 >= r0) goto L1a
            java.lang.String r4 = r10.getColumnName(r2)
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L17
            goto L1b
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            r2 = r3
        L1b:
            if (r2 < 0) goto L1e
            return r2
        L1e:
            java.lang.String r0 = "`"
            r2 = 96
            java.lang.String r0 = defpackage.i61.k(r2, r0, r11)
            int r4 = r10.getColumnCount()
            r5 = r1
        L2b:
            if (r5 >= r4) goto L3b
            java.lang.String r6 = r10.getColumnName(r5)
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L38
            goto L3c
        L38:
            int r5 = r5 + 1
            goto L2b
        L3b:
            r5 = r3
        L3c:
            if (r5 < 0) goto L3f
            return r5
        L3f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            if (r0 > r4) goto L84
            int r0 = r11.length()
            if (r0 != 0) goto L4c
            goto L84
        L4c:
            int r0 = r10.getColumnCount()
            java.lang.String r4 = "."
            java.lang.String r5 = r4.concat(r11)
            java.lang.String r4 = defpackage.i61.k(r2, r4, r11)
            r6 = r1
        L5b:
            if (r6 >= r0) goto L84
            java.lang.String r7 = r10.getColumnName(r6)
            int r8 = r7.length()
            int r9 = r11.length()
            int r9 = r9 + 2
            if (r8 < r9) goto L81
            boolean r8 = defpackage.xs6.Y(r7, r5, r1)
            if (r8 == 0) goto L74
            goto L80
        L74:
            char r8 = r7.charAt(r1)
            if (r8 != r2) goto L81
            boolean r7 = defpackage.xs6.Y(r7, r4, r1)
            if (r7 == 0) goto L81
        L80:
            return r6
        L81:
            int r6 = r6 + 1
            goto L5b
        L84:
            return r3
    }

    public static final boolean t(java.util.ArrayList r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L1a
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            di7 r3 = (defpackage.di7) r3
            if (r3 == 0) goto L6
            boolean r3 = L(r3)
            r4 = 1
            if (r3 != r4) goto L6
            return r4
        L1a:
            return r1
    }

    public static int u(int r2, java.lang.String r3) {
            int r2 = android.opengl.GLES20.glCreateShader(r2)
            android.opengl.GLES20.glShaderSource(r2, r3)
            android.opengl.GLES20.glCompileShader(r2)
            r3 = 1
            int[] r3 = new int[r3]
            r0 = 35713(0x8b81, float:5.0045E-41)
            r1 = 0
            android.opengl.GLES20.glGetShaderiv(r2, r0, r3, r1)
            r3 = r3[r1]
            if (r3 != 0) goto L21
            java.lang.String r3 = "ShaderFactory"
            java.lang.String r0 = android.opengl.GLES20.glGetShaderInfoLog(r2)
            android.util.Log.e(r3, r0)
        L21:
            return r2
    }

    public static defpackage.wd6 v(defpackage.fe6 r7) {
            r7.getClass()
            r0 = 35633(0x8b31, float:4.9932E-41)
            java.lang.String r1 = r7.b
            int r0 = u(r0, r1)
            r1 = 35632(0x8b30, float:4.9931E-41)
            java.lang.String r2 = r7.c
            int r1 = u(r1, r2)
            int r2 = android.opengl.GLES20.glCreateProgram()
            android.opengl.GLES20.glAttachShader(r2, r0)
            android.opengl.GLES20.glAttachShader(r2, r1)
            android.opengl.GLES20.glLinkProgram(r2)
            r3 = 1
            int[] r4 = new int[r3]
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r2, r5, r4, r6)
            r4 = r4[r6]
            if (r4 != 0) goto L39
            java.lang.String r4 = "ShaderFactory"
            java.lang.String r5 = android.opengl.GLES20.glGetProgramInfoLog(r2)
            android.util.Log.e(r4, r5)
        L39:
            ee6 r7 = r7.a
            int[] r4 = defpackage.de6.a
            int r7 = r7.ordinal()
            r7 = r4[r7]
            if (r7 == r3) goto L50
            r3 = 2
            if (r7 != r3) goto L4b
            r7 = 9729(0x2601, float:1.3633E-41)
            goto L52
        L4b:
            defpackage.i.d()
            r7 = 0
            return r7
        L50:
            r7 = 9728(0x2600, float:1.3632E-41)
        L52:
            wd6 r3 = new wd6
            r3.<init>(r0, r1, r2, r7)
            return r3
    }

    public static final defpackage.jk3 w(defpackage.jk3 r2) {
            jk3 r0 = r2.D()
        L4:
            r1 = r0
            r0 = r2
            r2 = r1
            if (r2 == 0) goto Le
            jk3 r0 = r2.D()
            goto L4
        Le:
            boolean r2 = r0 instanceof defpackage.eg4
            if (r2 == 0) goto L16
            r2 = r0
            eg4 r2 = (defpackage.eg4) r2
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 != 0) goto L1a
            return r0
        L1a:
            eg4 r0 = r2.o0
        L1c:
            r1 = r0
            r0 = r2
            r2 = r1
            if (r2 == 0) goto L24
            eg4 r0 = r2.o0
            goto L1c
        L24:
            return r0
    }

    public static final boolean x(defpackage.vh2 r4, defpackage.ln r5) {
            sh2 r0 = r4.W0()
            int[] r1 = defpackage.zl4.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L3a
            r2 = 2
            if (r0 == r2) goto L35
            r2 = 3
            if (r0 == r2) goto L35
            r2 = 4
            if (r0 != r2) goto L31
            ih2 r0 = r4.T0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r5.g(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L2c:
            boolean r4 = Q(r4, r5)
            return r4
        L31:
            defpackage.i.d()
            return r1
        L35:
            boolean r4 = Q(r4, r5)
            return r4
        L3a:
            vh2 r0 = defpackage.yh2.t(r4)
            if (r0 == 0) goto L4f
            boolean r3 = x(r0, r5)
            if (r3 != 0) goto L4e
            boolean r4 = y(r4, r0, r2, r5)
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            return r1
        L4e:
            return r2
        L4f:
            java.lang.String r4 = "ActiveParent must have a focusedChild"
            defpackage.i.m(r4)
            return r1
    }

    public static final boolean y(defpackage.vh2 r8, defpackage.vh2 r9, int r10, defpackage.ln r11) {
            boolean r0 = T(r8, r9, r10, r11)
            if (r0 == 0) goto L8
            r8 = 1
            return r8
        L8:
            zp4 r0 = defpackage.nc1.g0(r8)
            te r0 = (defpackage.te) r0
            ah2 r0 = r0.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            vh2 r2 = r0.f()
            am4 r1 = new am4
            r7 = 0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.nb3.X(r3, r5, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L2f
            boolean r8 = r8.booleanValue()
            return r8
        L2f:
            r8 = 0
            return r8
    }

    public static final android.graphics.Rect z(android.text.TextPaint r16, java.lang.CharSequence r17, int r18, int r19) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r1 instanceof android.text.Spanned
            if (r4 == 0) goto L7e
            r4 = r1
            android.text.Spanned r4 = (android.text.Spanned) r4
            int r6 = r2 + (-1)
            java.lang.Class<android.text.style.MetricAffectingSpan> r7 = android.text.style.MetricAffectingSpan.class
            int r6 = r4.nextSpanTransition(r6, r3, r7)
            if (r6 == r3) goto L7e
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            android.text.TextPaint r9 = new android.text.TextPaint
            r9.<init>()
        L28:
            if (r2 >= r3) goto L7d
            int r10 = r4.nextSpanTransition(r2, r3, r7)
            java.lang.Object[] r11 = r4.getSpans(r2, r10, r7)
            android.text.style.MetricAffectingSpan[] r11 = (android.text.style.MetricAffectingSpan[]) r11
            r9.set(r0)
            int r12 = r11.length
            r13 = 0
        L39:
            if (r13 >= r12) goto L4d
            r14 = r11[r13]
            int r15 = r4.getSpanStart(r14)
            int r5 = r4.getSpanEnd(r14)
            if (r15 == r5) goto L4a
            r14.updateMeasureState(r9)
        L4a:
            int r13 = r13 + 1
            goto L39
        L4d:
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r5 < r11) goto L57
            defpackage.r74.t(r9, r1, r2, r10, r8)
            goto L5e
        L57:
            java.lang.String r5 = r1.toString()
            r9.getTextBounds(r5, r2, r10, r8)
        L5e:
            int r2 = r6.right
            int r5 = r8.width()
            int r5 = r5 + r2
            r6.right = r5
            int r2 = r6.top
            int r5 = r8.top
            int r2 = java.lang.Math.min(r2, r5)
            r6.top = r2
            int r2 = r6.bottom
            int r5 = r8.bottom
            int r2 = java.lang.Math.max(r2, r5)
            r6.bottom = r2
            r2 = r10
            goto L28
        L7d:
            return r6
        L7e:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r5 < r11) goto L8d
            defpackage.r74.t(r0, r1, r2, r3, r4)
            return r4
        L8d:
            java.lang.String r1 = r1.toString()
            r0.getTextBounds(r1, r2, r3, r4)
            return r4
    }
}
