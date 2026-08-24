package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzy {
    public static java.lang.String zza(java.lang.String r10, java.lang.Object... r11) {
            r1 = 0
            r2 = r1
        L2:
            int r0 = r11.length
            if (r2 >= r0) goto L55
            r3 = r11[r2]
            if (r3 != 0) goto Lc
            java.lang.String r0 = "null"
            goto L50
        Lc:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L11
            goto L50
        L11:
            r0 = move-exception
            r8 = r0
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r4 = "@"
            java.lang.String r0 = defpackage.lb1.m(r0, r4, r3)
            java.lang.String r3 = "com.google.common.base.Strings"
            java.util.logging.Logger r3 = java.util.logging.Logger.getLogger(r3)
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.String r6 = "lenientToString"
            java.lang.String r5 = "Exception during lenientFormat for "
            java.lang.String r7 = r5.concat(r0)
            java.lang.String r5 = "com.google.common.base.Strings"
            r3.logp(r4, r5, r6, r7, r8)
            java.lang.Class r3 = r8.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = " threw "
            java.lang.String r5 = ">"
            java.lang.String r6 = "<"
            java.lang.String r0 = defpackage.lb1.n(r6, r0, r4, r3, r5)
        L50:
            r11[r2] = r0
            int r2 = r2 + 1
            goto L2
        L55:
            int r2 = r10.length()
            int r0 = r0 * 16
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + r0
            r3.<init>(r2)
            r0 = r1
        L62:
            int r2 = r11.length
            if (r1 >= r2) goto L7f
            java.lang.String r4 = "%s"
            int r4 = r10.indexOf(r4, r0)
            r5 = -1
            if (r4 != r5) goto L6f
            goto L7f
        L6f:
            r3.append(r10, r0, r4)
            int r0 = r1 + 1
            r1 = r11[r1]
            r3.append(r1)
            int r1 = r4 + 2
            r9 = r1
            r1 = r0
            r0 = r9
            goto L62
        L7f:
            int r4 = r10.length()
            r3.append(r10, r0, r4)
            if (r1 >= r2) goto Laa
            java.lang.String r10 = " ["
            r3.append(r10)
            int r10 = r1 + 1
            r0 = r11[r1]
            r3.append(r0)
        L94:
            int r0 = r11.length
            if (r10 >= r0) goto La5
            java.lang.String r0 = ", "
            r3.append(r0)
            int r0 = r10 + 1
            r10 = r11[r10]
            r3.append(r10)
            r10 = r0
            goto L94
        La5:
            r10 = 93
            r3.append(r10)
        Laa:
            java.lang.String r10 = r3.toString()
            return r10
    }

    public static boolean zzb(java.lang.String r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }
}
