package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzw {
    public static void zza(java.lang.Object r1, java.lang.Object r2) {
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
