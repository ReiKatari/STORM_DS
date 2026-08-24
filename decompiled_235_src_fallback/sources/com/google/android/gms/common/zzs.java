package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzs> CREATOR = null;
    private final java.lang.String zza;
    private final com.google.android.gms.common.zzj zzb;
    private final boolean zzc;
    private final boolean zzd;

    static {
            com.google.android.gms.common.zzt r0 = new com.google.android.gms.common.zzt
            r0.<init>()
            com.google.android.gms.common.zzs.CREATOR = r0
            return
    }

    public zzs(java.lang.String r3, android.os.IBinder r4, boolean r5, boolean r6) {
            r2 = this;
            java.lang.String r0 = "Could not unwrap certificate"
            java.lang.String r1 = "GoogleCertificatesQuery"
            r2.<init>()
            r2.zza = r3
            r3 = 0
            if (r4 != 0) goto Ld
            goto L2f
        Ld:
            com.google.android.gms.common.internal.zzaa r4 = com.google.android.gms.common.internal.zzz.zzg(r4)     // Catch: android.os.RemoteException -> L2b
            d13 r4 = r4.zzd()     // Catch: android.os.RemoteException -> L2b
            if (r4 != 0) goto L19
            r4 = r3
            goto L1f
        L19:
            java.lang.Object r4 = defpackage.zh4.d(r4)
            byte[] r4 = (byte[]) r4
        L1f:
            if (r4 == 0) goto L27
            com.google.android.gms.common.zzk r3 = new com.google.android.gms.common.zzk
            r3.<init>(r4)
            goto L2f
        L27:
            android.util.Log.e(r1, r0)
            goto L2f
        L2b:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
        L2f:
            r2.zzb = r3
            r2.zzc = r5
            r2.zzd = r6
            return
    }

    public zzs(java.lang.String r1, com.google.android.gms.common.zzj r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            com.google.android.gms.common.zzj r5 = r3.zzb
            if (r5 != 0) goto L17
            java.lang.String r5 = "GoogleCertificatesQuery"
            java.lang.String r1 = "certificate binder is null"
            android.util.Log.w(r5, r1)
            r5 = 0
        L17:
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r5, r2)
            r5 = 3
            boolean r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 4
            boolean r3 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
