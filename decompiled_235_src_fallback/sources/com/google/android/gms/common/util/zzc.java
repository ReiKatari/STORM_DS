package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzc {
    private static final java.util.regex.Pattern zza = null;

    static {
            java.lang.String r0 = "\\\\u[0-9a-fA-F]{4}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.zzc.zza = r0
            return
    }

    public static java.lang.String zza(java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L6f
            java.util.regex.Pattern r0 = com.google.android.gms.common.util.zzc.zza
            java.util.regex.Matcher r0 = r0.matcher(r7)
            r1 = 0
            r2 = 0
        Le:
            boolean r3 = r0.find()
            if (r3 == 0) goto L5b
            if (r1 != 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L1b:
            int r3 = r0.start()
            r4 = r3
        L20:
            r5 = 92
            if (r4 < 0) goto L2d
            char r6 = r7.charAt(r4)
            if (r6 != r5) goto L2d
            int r4 = r4 + (-1)
            goto L20
        L2d:
            int r3 = r3 - r4
            r4 = 2
            int r3 = r3 % r4
            if (r3 == 0) goto Le
            java.lang.String r3 = r0.group()
            java.lang.String r3 = r3.substring(r4)
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)
            int r4 = r0.start()
            r1.append(r7, r2, r4)
            if (r3 != r5) goto L4f
            java.lang.String r2 = "\\\\"
            r1.append(r2)
            goto L56
        L4f:
            char[] r2 = java.lang.Character.toChars(r3)
            r1.append(r2)
        L56:
            int r2 = r0.end()
            goto Le
        L5b:
            if (r1 != 0) goto L5e
            goto L6f
        L5e:
            int r3 = r0.regionEnd()
            if (r2 >= r3) goto L6b
            int r0 = r0.regionEnd()
            r1.append(r7, r2, r0)
        L6b:
            java.lang.String r7 = r1.toString()
        L6f:
            return r7
    }
}
