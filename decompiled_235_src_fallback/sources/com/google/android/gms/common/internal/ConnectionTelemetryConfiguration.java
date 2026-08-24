package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ConnectionTelemetryConfiguration> CREATOR = null;
    private final com.google.android.gms.common.internal.RootTelemetryConfiguration zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final int zze;
    private final int[] zzf;

    static {
            com.google.android.gms.common.internal.zzm r0 = new com.google.android.gms.common.internal.zzm
            r0.<init>()
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR = r0
            return
    }

    public ConnectionTelemetryConfiguration(com.google.android.gms.common.internal.RootTelemetryConfiguration r1, boolean r2, boolean r3, int[] r4, int r5, int[] r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    public int getMaxMethodInvocationsLogged() {
            r0 = this;
            int r0 = r0.zze
            return r0
    }

    public int[] getMethodInvocationMethodKeyAllowlist() {
            r0 = this;
            int[] r0 = r0.zzd
            return r0
    }

    public int[] getMethodInvocationMethodKeyDisallowlist() {
            r0 = this;
            int[] r0 = r0.zzf
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            r6 = 2
            boolean r1 = r4.getMethodInvocationTelemetryEnabled()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 3
            boolean r1 = r4.getMethodTimingTelemetryEnabled()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 4
            int[] r1 = r4.getMethodInvocationMethodKeyAllowlist()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r5, r6, r1, r3)
            r6 = 5
            int r1 = r4.getMaxMethodInvocationsLogged()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r1)
            r6 = 6
            int[] r4 = r4.getMethodInvocationMethodKeyDisallowlist()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r5, r6, r4, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.common.internal.RootTelemetryConfiguration zza() {
            r0 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.zza
            return r0
    }
}
