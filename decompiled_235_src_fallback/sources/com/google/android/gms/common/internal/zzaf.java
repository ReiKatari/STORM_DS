package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zzaf extends defpackage.u28 implements com.google.android.gms.common.internal.zzag {
    public static com.google.android.gms.common.internal.zzag zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.zzag
            if (r1 == 0) goto L11
            com.google.android.gms.common.internal.zzag r0 = (com.google.android.gms.common.internal.zzag) r0
            return r0
        L11:
            com.google.android.gms.common.internal.zzae r0 = new com.google.android.gms.common.internal.zzae
            r0.<init>(r2)
            return r0
    }
}
