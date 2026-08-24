package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzl> CREATOR = null;
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzr[] zza;
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzf zzb;
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzf zzc;
    public final com.google.android.gms.internal.mlkit_vision_text_common.zzf zzd;
    public final java.lang.String zze;
    public final float zzf;
    public final java.lang.String zzg;
    public final int zzh;
    public final boolean zzi;
    public final int zzj;
    public final int zzk;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzm r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzm
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzl.CREATOR = r0
            return
    }

    public zzl(com.google.android.gms.internal.mlkit_vision_text_common.zzr[] r1, com.google.android.gms.internal.mlkit_vision_text_common.zzf r2, com.google.android.gms.internal.mlkit_vision_text_common.zzf r3, com.google.android.gms.internal.mlkit_vision_text_common.zzf r4, java.lang.String r5, float r6, java.lang.String r7, int r8, boolean r9, int r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzr[] r0 = r4.zza
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
            r0 = 5
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r2 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r6 = 6
            java.lang.String r0 = r4.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 7
            float r0 = r4.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r0)
            r6 = 8
            java.lang.String r0 = r4.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 9
            int r0 = r4.zzh
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r0)
            r6 = 10
            boolean r0 = r4.zzi
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r0)
            r6 = 11
            int r0 = r4.zzj
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r0)
            r6 = 12
            int r4 = r4.zzk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
