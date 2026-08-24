package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwj {
    public static java.lang.String zba(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.zbd()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.zbd()
            if (r1 >= r2) goto L8f
            byte r2 = r5.zba(r1)
            r3 = 34
            if (r2 == r3) goto L86
            r3 = 39
            if (r2 == r3) goto L80
            r3 = 92
            if (r2 == r3) goto L7a
            switch(r2) {
                case 7: goto L74;
                case 8: goto L6e;
                case 9: goto L68;
                case 10: goto L62;
                case 11: goto L5c;
                case 12: goto L56;
                case 13: goto L50;
                default: goto L23;
            }
        L23:
            r4 = 32
            if (r2 < r4) goto L30
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L30
            char r2 = (char) r2
            r0.append(r2)
            goto L8b
        L30:
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
            char r2 = (char) r2
            r0.append(r2)
            goto L8b
        L50:
            java.lang.String r2 = "\\r"
            r0.append(r2)
            goto L8b
        L56:
            java.lang.String r2 = "\\f"
            r0.append(r2)
            goto L8b
        L5c:
            java.lang.String r2 = "\\v"
            r0.append(r2)
            goto L8b
        L62:
            java.lang.String r2 = "\\n"
            r0.append(r2)
            goto L8b
        L68:
            java.lang.String r2 = "\\t"
            r0.append(r2)
            goto L8b
        L6e:
            java.lang.String r2 = "\\b"
            r0.append(r2)
            goto L8b
        L74:
            java.lang.String r2 = "\\a"
            r0.append(r2)
            goto L8b
        L7a:
            java.lang.String r2 = "\\\\"
            r0.append(r2)
            goto L8b
        L80:
            java.lang.String r2 = "\\'"
            r0.append(r2)
            goto L8b
        L86:
            java.lang.String r2 = "\\\""
            r0.append(r2)
        L8b:
            int r1 = r1 + 1
            goto La
        L8f:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
