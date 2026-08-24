package com.google.mlkit.common.model;

import com.google.android.gms.common.internal.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DownloadConditions {
    private final boolean zza;
    private final boolean zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private boolean zza = false;
        private boolean zzb = false;

        public DownloadConditions build() {
            return new DownloadConditions(this.zza, this.zzb, null);
        }

        public Builder requireCharging() {
            this.zza = true;
            return this;
        }

        public Builder requireWifi() {
            this.zzb = true;
            return this;
        }
    }

    public /* synthetic */ DownloadConditions(boolean z, boolean z2, zzb zzbVar) {
        this.zza = z;
        this.zzb = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadConditions)) {
            return false;
        }
        DownloadConditions downloadConditions = (DownloadConditions) obj;
        if (this.zza == downloadConditions.zza && this.zzb == downloadConditions.zzb) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb));
    }

    public boolean isChargingRequired() {
        return this.zza;
    }

    public boolean isWifiRequired() {
        return this.zzb;
    }
}
