package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzaq {
    public static int zza(int r2, java.lang.String r3) {
            if (r2 < 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " cannot be negative but was: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static void zzb(java.lang.Object r1, java.lang.Object r2) {
            if (r1 == 0) goto L15
            if (r2 == 0) goto L5
            return
        L5:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "null value in entry: "
            java.lang.String r0 = "=null"
            java.lang.String r1 = defpackage.lb1.A(r2, r1, r0)
            defpackage.u34.x(r1)
            return
        L15:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "null key in entry: null="
            java.lang.String r1 = r2.concat(r1)
            defpackage.u34.x(r1)
            return
    }
}
