package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class PlatformVersion {
    private PlatformVersion() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAtLeastHoneycomb() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastHoneycombMR1() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastIceCreamSandwich() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastJellyBean() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastJellyBeanMR1() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastJellyBeanMR2() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastKitKat() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastKitKatWatch() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastLollipop() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastLollipopMR1() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastM() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastN() {
            r0 = 1
            return r0
    }

    public static boolean isAtLeastO() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastSv2() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static boolean isAtLeastU() {
            boolean r0 = isAtLeastT()
            if (r0 != 0) goto L7
            goto L21
        L7:
            int r0 = defpackage.a90.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L23
            r1 = 33
            if (r0 < r1) goto L21
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r0 = "UpsideDownCake"
            boolean r0 = defpackage.a90.a(r0)
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    public static boolean isAtLeastV() {
            boolean r0 = isAtLeastU()
            if (r0 != 0) goto L7
            goto L21
        L7:
            int r0 = defpackage.a90.a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L23
            r1 = 34
            if (r0 < r1) goto L21
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r0.getClass()
            java.lang.String r0 = "VanillaIceCream"
            boolean r0 = defpackage.a90.a(r0)
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }
}
