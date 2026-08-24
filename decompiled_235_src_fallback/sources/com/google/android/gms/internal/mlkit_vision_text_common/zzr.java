package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzr> CREATOR = null;
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzn[] zza;
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzf zzb;
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzf zzc;
    public final java.lang.String zzd;
    public final float zze;
    public final java.lang.String zzf;
    public final boolean zzg;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzs r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzs
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzr.CREATOR = r0
            return
    }

    public zzr(com.google.android.gms.internal.mlkit_vision_text_common.zzn[] r1, com.google.android.gms.internal.mlkit_vision_text_common.zzf r2, com.google.android.gms.internal.mlkit_vision_text_common.zzf r3, java.lang.String r4, float r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzn[] r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r2, r0, r6, r3)
            r0 = 3
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r2 = r4.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r0 = 4
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r2 = r4.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r6 = 5
            java.lang.String r0 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 6
            float r0 = r4.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r0)
            r6 = 7
            java.lang.String r0 = r4.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 8
            boolean r4 = r4.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
