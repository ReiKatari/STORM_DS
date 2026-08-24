package com.google.android.gms.common.stats;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends com.google.android.gms.common.stats.StatsEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.stats.WakeLockEvent> CREATOR = null;
    final int zza;
    private final long zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final int zzg;
    private final java.util.List zzh;
    private final java.lang.String zzi;
    private final long zzj;
    private final int zzk;
    private final java.lang.String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    static {
            com.google.android.gms.common.stats.zza r0 = new com.google.android.gms.common.stats.zza
            r0.<init>()
            com.google.android.gms.common.stats.WakeLockEvent.CREATOR = r0
            return
    }

    public WakeLockEvent(int r1, long r2, int r4, java.lang.String r5, int r6, java.util.List r7, java.lang.String r8, long r9, int r11, java.lang.String r12, java.lang.String r13, float r14, long r15, java.lang.String r17, boolean r18) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r4
            r0.zzd = r5
            r0.zze = r12
            r1 = r17
            r0.zzf = r1
            r0.zzg = r6
            r0.zzh = r7
            r0.zzi = r8
            r0.zzj = r9
            r0.zzk = r11
            r0.zzl = r13
            r0.zzm = r14
            r1 = r15
            r0.zzn = r1
            r1 = r18
            r0.zzo = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r0 = 1
            int r1 = r5.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 2
            long r1 = r5.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r0, r1)
            java.lang.String r0 = r5.zzd
            r1 = 4
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r0, r2)
            r0 = 5
            int r1 = r5.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 6
            java.util.List r1 = r5.zzh
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r6, r0, r1, r2)
            r0 = 8
            long r3 = r5.zzj
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r0, r3)
            r0 = 10
            java.lang.String r1 = r5.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 11
            int r1 = r5.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 12
            java.lang.String r1 = r5.zzi
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 13
            java.lang.String r1 = r5.zzl
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 14
            int r1 = r5.zzk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 15
            float r1 = r5.zzm
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r6, r0, r1)
            r0 = 16
            long r3 = r5.zzn
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r0, r3)
            r0 = 17
            java.lang.String r1 = r5.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 18
            boolean r5 = r5.zzo
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r6, r0, r5)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r7)
            return
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
            r0 = this;
            int r0 = r0.zzc
            return r0
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final java.lang.String zzc() {
            r11 = this;
            java.util.List r0 = r11.zzh
            java.lang.String r1 = ""
            if (r0 != 0) goto L8
            r0 = r1
            goto Le
        L8:
            java.lang.String r2 = ","
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
        Le:
            int r2 = r11.zzk
            java.lang.String r3 = r11.zze
            java.lang.String r4 = r11.zzl
            float r5 = r11.zzm
            java.lang.String r6 = r11.zzf
            int r7 = r11.zzg
            java.lang.String r8 = r11.zzd
            boolean r11 = r11.zzo
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "\t"
            r9.<init>(r10)
            r9.append(r8)
            r9.append(r10)
            r9.append(r7)
            r9.append(r10)
            r9.append(r0)
            r9.append(r10)
            r9.append(r2)
            r9.append(r10)
            if (r3 != 0) goto L40
            r3 = r1
        L40:
            r9.append(r3)
            r9.append(r10)
            if (r4 != 0) goto L49
            r4 = r1
        L49:
            r9.append(r4)
            r9.append(r10)
            r9.append(r5)
            r9.append(r10)
            if (r6 != 0) goto L58
            goto L59
        L58:
            r1 = r6
        L59:
            r9.append(r1)
            r9.append(r10)
            r9.append(r11)
            java.lang.String r11 = r9.toString()
            return r11
    }
}
