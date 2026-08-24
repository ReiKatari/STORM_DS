package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt7  reason: default package */
/* loaded from: classes.dex */
public abstract class dt7 {
    public static defpackage.e33 a;

    public static final defpackage.e33 a() {
            e33 r0 = defpackage.dt7.a
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Wifi"
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
            ww2 r4 = new ww2
            r2 = 1
            r3 = 0
            r4.<init>(r2, r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            r11 = 1091567616(0x41100000, float:9.0)
            r4.o(r2, r11)
            r2 = 1073741824(0x40000000, float:2.0)
            r4.n(r2, r2)
            r9 = 1099956224(0x41900000, float:18.0)
            r10 = 0
            r5 = 1084164669(0x409f0a3d, float:4.97)
            r6 = -1063318979(0xffffffffc09f0a3d, float:-4.97)
            r7 = 1095793377(0x41507ae1, float:13.03)
            r8 = -1063318979(0xffffffffc09f0a3d, float:-4.97)
            r4.i(r5, r6, r7, r8, r9, r10)
            r12 = -1073741824(0xffffffffc0000000, float:-2.0)
            r4.n(r2, r12)
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 1091567616(0x41100000, float:9.0)
            r5 = 1099395236(0x418770a4, float:16.93)
            r6 = 1077642527(0x403b851f, float:2.93)
            r7 = 1088589660(0x40e28f5c, float:7.08)
            r8 = 1077642527(0x403b851f, float:2.93)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.g()
            r5 = 1099431936(0x41880000, float:17.0)
            r4.o(r11, r5)
            r5 = 1077936128(0x40400000, float:3.0)
            r4.n(r5, r5)
            r6 = -1069547520(0xffffffffc0400000, float:-3.0)
            r4.n(r5, r6)
            r9 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r10 = 0
            r5 = -1076677837(0xffffffffbfd33333, float:-1.65)
            r6 = -1076593951(0xffffffffbfd47ae1, float:-1.66)
            r7 = -1064640184(0xffffffffc08ae148, float:-4.34)
            r8 = -1076593951(0xffffffffbfd47ae1, float:-1.66)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.g()
            r5 = 1084227584(0x40a00000, float:5.0)
            r6 = 1095761920(0x41500000, float:13.0)
            r4.o(r5, r6)
            r4.n(r2, r2)
            r9 = 1092616192(0x41200000, float:10.0)
            r5 = 1076929495(0x4030a3d7, float:2.76)
            r6 = -1070554153(0xffffffffc030a3d7, float:-2.76)
            r7 = 1088925204(0x40e7ae14, float:7.24)
            r8 = -1070554153(0xffffffffc030a3d7, float:-2.76)
            r4.i(r5, r6, r7, r8, r9, r10)
            r4.n(r2, r12)
            r9 = 1084227584(0x40a00000, float:5.0)
            r10 = 1095761920(0x41500000, float:13.0)
            r5 = 1098005873(0x41723d71, float:15.14)
            r6 = 1091714417(0x41123d71, float:9.14)
            r7 = 1091431301(0x410deb85, float:8.87)
            r8 = 1091714417(0x41123d71, float:9.14)
            r4.h(r5, r6, r7, r8, r9, r10)
            r4.g()
            java.util.ArrayList r2 = r4.b
            defpackage.d33.a(r1, r2, r3, r0)
            e33 r0 = r1.b()
            defpackage.dt7.a = r0
            return r0
    }

    public static boolean b(java.util.List r4) {
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = android.os.Build.MODEL
            r2.getClass()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            r2.getClass()
            boolean r0 = defpackage.xs6.g0(r2, r0, r1)
            if (r0 == 0) goto L4
            r4 = 1
            return r4
        L27:
            return r1
    }
}
