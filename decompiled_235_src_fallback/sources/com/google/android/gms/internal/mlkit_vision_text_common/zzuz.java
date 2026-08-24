package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzuz> CREATOR = null;
    private final java.lang.String zza;
    private final android.graphics.Rect zzb;
    private final java.util.List zzc;
    private final java.lang.String zzd;
    private final java.util.List zze;

    static {
            com.google.android.gms.internal.mlkit_vision_text_common.zzva r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzva
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzuz.CREATOR = r0
            return
    }

    public zzuz(java.lang.String r1, android.graphics.Rect r2, java.util.List r3, java.lang.String r4, java.util.List r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            r0 = 2
            android.graphics.Rect r2 = r4.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r6 = 3
            java.util.List r0 = r4.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r6, r0, r3)
            r6 = 4
            java.lang.String r0 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 5
            java.util.List r4 = r4.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r6, r4, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }

    public final android.graphics.Rect zza() {
            r0 = this;
            android.graphics.Rect r0 = r0.zzb
            return r0
    }

    public final java.lang.String zzb() {
            r0 = this;
            java.lang.String r0 = r0.zzd
            return r0
    }

    public final java.lang.String zzc() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }

    public final java.util.List zzd() {
            r0 = this;
            java.util.List r0 = r0.zzc
            return r0
    }

    public final java.util.List zze() {
            r0 = this;
            java.util.List r0 = r0.zze
            return r0
    }
}
