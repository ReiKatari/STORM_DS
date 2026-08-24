package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> CREATOR = null;
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;

    static {
            com.google.android.gms.common.internal.zzaj r0 = new com.google.android.gms.common.internal.zzaj
            r0.<init>()
            com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR = r0
            return
    }

    public RootTelemetryConfiguration(int r1, boolean r2, boolean r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    public int getBatchPeriodMillis() {
            r0 = this;
            int r0 = r0.zzd
            return r0
    }

    public int getMaxMethodInvocationsInBatch() {
            r0 = this;
            int r0 = r0.zze
            return r0
    }

    public boolean getMethodInvocationTelemetryEnabled() {
            r0 = this;
            boolean r0 = r0.zzb
            return r0
    }

    public boolean getMethodTimingTelemetryEnabled() {
            r0 = this;
            boolean r0 = r0.zzc
            return r0
    }

    public int getVersion() {
            r0 = this;
            int r0 = r0.zza
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r0 = 1
            int r1 = r2.getVersion()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r0, r1)
            r0 = 2
            boolean r1 = r2.getMethodInvocationTelemetryEnabled()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r0, r1)
            r0 = 3
            boolean r1 = r2.getMethodTimingTelemetryEnabled()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r0, r1)
            r0 = 4
            int r1 = r2.getBatchPeriodMillis()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r0, r1)
            r0 = 5
            int r2 = r2.getMaxMethodInvocationsInBatch()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
