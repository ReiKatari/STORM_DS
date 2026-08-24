package com.google.android.gms.internal.mlkit_vision_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzi {
    public static void zza(java.lang.Object r2, java.lang.Object r3) {
            if (r2 == 0) goto L1e
            if (r3 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "null value in entry: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "=null"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L1e:
            java.util.Objects.toString(r3)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "null key in entry: null="
            java.lang.String r2 = r3.concat(r2)
            defpackage.u34.x(r2)
            return
    }
}
