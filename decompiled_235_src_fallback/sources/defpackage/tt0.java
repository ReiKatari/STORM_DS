package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tt0  reason: default package */
/* loaded from: classes.dex */
public abstract class tt0 {
    public static final java.lang.ThreadLocal a = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.tt0.a = r0
            return
    }

    public static int a(double r17, double r19, double r21) {
            r0 = 4614479601276245823(0x4009ecbfb15b573f, double:3.2406)
            double r0 = r0 * r17
            r2 = -4613770284334934970(0xbff8985f06f69446, double:-1.5372)
            double r2 = r2 * r19
            double r2 = r2 + r0
            r0 = -4620718437840042171(0xbfdfe90ff9724745, double:-0.4986)
            double r0 = r0 * r21
            double r0 = r0 + r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            r4 = -4616469741951580845(0xbfef013a92a30553, double:-0.9689)
            double r4 = r4 * r17
            r6 = 4611126671353668488(0x3ffe0346dc5d6388, double:1.8758)
            double r6 = r6 * r19
            double r6 = r6 + r4
            r4 = 4586141601340942451(0x3fa53f7ced916873, double:0.0415)
            double r4 = r4 * r21
            double r4 = r4 + r6
            double r4 = r4 / r2
            r6 = 4588188037011619604(0x3fac84b5dcc63f14, double:0.0557)
            double r6 = r6 * r17
            r8 = -4626854141972371735(0xbfca1cac083126e9, double:-0.204)
            double r8 = r8 * r19
            double r8 = r8 + r6
            r6 = 4607439123978777526(0x3ff0e978d4fdf3b6, double:1.057)
            double r6 = r6 * r21
            double r6 = r6 + r8
            double r6 = r6 / r2
            r2 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r9 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r11 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r13 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            r15 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            if (r8 <= 0) goto L6e
            double r0 = java.lang.Math.pow(r0, r13)
            double r0 = r0 * r15
            double r0 = r0 - r11
            goto L6f
        L6e:
            double r0 = r0 * r9
        L6f:
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L7a
            double r4 = java.lang.Math.pow(r4, r13)
            double r4 = r4 * r15
            double r4 = r4 - r11
            goto L7b
        L7a:
            double r4 = r4 * r9
        L7b:
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L86
            double r2 = java.lang.Math.pow(r6, r13)
            double r2 = r2 * r15
            double r2 = r2 - r11
            goto L88
        L86:
            double r2 = r6 * r9
        L88:
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r0 = r0 * r6
            long r0 = java.lang.Math.round(r0)
            int r0 = (int) r0
            r1 = 255(0xff, float:3.57E-43)
            r8 = 0
            if (r0 >= 0) goto L9a
            r0 = r8
            goto L9e
        L9a:
            int r0 = java.lang.Math.min(r0, r1)
        L9e:
            double r4 = r4 * r6
            long r4 = java.lang.Math.round(r4)
            int r4 = (int) r4
            if (r4 >= 0) goto La8
            r4 = r8
            goto Lac
        La8:
            int r4 = java.lang.Math.min(r4, r1)
        Lac:
            double r2 = r2 * r6
            long r2 = java.lang.Math.round(r2)
            int r2 = (int) r2
            if (r2 >= 0) goto Lb5
            goto Lb9
        Lb5:
            int r8 = java.lang.Math.min(r2, r1)
        Lb9:
            int r0 = android.graphics.Color.rgb(r0, r4, r8)
            return r0
    }

    public static int b(int r6, int r7) {
            int r0 = android.graphics.Color.alpha(r7)
            int r1 = android.graphics.Color.alpha(r6)
            int r2 = 255 - r0
            int r3 = 255 - r1
            int r3 = r3 * r2
            int r3 = r3 / 255
            int r2 = 255 - r3
            int r3 = android.graphics.Color.red(r6)
            int r4 = android.graphics.Color.red(r7)
            int r3 = c(r3, r1, r4, r0, r2)
            int r4 = android.graphics.Color.green(r6)
            int r5 = android.graphics.Color.green(r7)
            int r4 = c(r4, r1, r5, r0, r2)
            int r6 = android.graphics.Color.blue(r6)
            int r7 = android.graphics.Color.blue(r7)
            int r6 = c(r6, r1, r7, r0, r2)
            int r6 = android.graphics.Color.argb(r2, r3, r4, r6)
            return r6
    }

    public static int c(int r0, int r1, int r2, int r3, int r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0 * 255
            int r0 = r0 * r1
            int r2 = r2 * r3
            int r1 = 255 - r1
            int r1 = r1 * r2
            int r1 = r1 + r0
            int r4 = r4 * 255
            int r1 = r1 / r4
            return r1
    }

    public static int d(int r1, int r2) {
            if (r2 < 0) goto Le
            r0 = 255(0xff, float:3.57E-43)
            if (r2 > r0) goto Le
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            int r2 = r2 << 24
            r1 = r1 | r2
            return r1
        Le:
            java.lang.String r1 = "alpha must be between 0 and 255."
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }
}
