package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DataUtils {
    public DataUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void copyStringToBuffer(java.lang.String r3, android.database.CharArrayBuffer r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto La
            r4.sizeCopied = r1
            return
        La:
            char[] r0 = r4.data
            if (r0 == 0) goto L20
            int r0 = r0.length
            int r2 = r3.length()
            if (r0 >= r2) goto L16
            goto L20
        L16:
            int r0 = r3.length()
            char[] r2 = r4.data
            r3.getChars(r1, r0, r2, r1)
            goto L26
        L20:
            char[] r0 = r3.toCharArray()
            r4.data = r0
        L26:
            int r3 = r3.length()
            r4.sizeCopied = r3
            return
    }

    public static byte[] loadImageBytes(android.graphics.Bitmap r3) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r3.compress(r1, r2, r0)
            byte[] r3 = r0.toByteArray()
            return r3
    }
}
