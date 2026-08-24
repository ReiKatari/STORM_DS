package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Base64Utils {
    public Base64Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decode(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    public static byte[] decodeUrlSafe(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static byte[] decodeUrlSafeNoPadding(java.lang.String r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            byte[] r1 = android.util.Base64.decode(r1, r0)
            return r1
    }

    public static java.lang.String encode(byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    public static java.lang.String encodeUrlSafe(byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    public static java.lang.String encodeUrlSafeNoPadding(byte[] r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }
}
