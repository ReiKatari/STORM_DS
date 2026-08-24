package com.google.mlkit.common.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DownloadConditions {
    private final boolean zza;
    private final boolean zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private boolean zza;
        private boolean zzb;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zza = r0
                r1.zzb = r0
                return
        }

        public com.google.mlkit.common.model.DownloadConditions build() {
                r3 = this;
                com.google.mlkit.common.model.DownloadConditions r0 = new com.google.mlkit.common.model.DownloadConditions
                boolean r1 = r3.zza
                boolean r3 = r3.zzb
                r2 = 0
                r0.<init>(r1, r3, r2)
                return r0
        }

        public com.google.mlkit.common.model.DownloadConditions.Builder requireCharging() {
                r1 = this;
                r0 = 1
                r1.zza = r0
                return r1
        }

        public com.google.mlkit.common.model.DownloadConditions.Builder requireWifi() {
                r1 = this;
                r0 = 1
                r1.zzb = r0
                return r1
        }
    }

    public /* synthetic */ DownloadConditions(boolean r1, boolean r2, com.google.mlkit.common.model.zzb r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.common.model.DownloadConditions
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.mlkit.common.model.DownloadConditions r5 = (com.google.mlkit.common.model.DownloadConditions) r5
            boolean r1 = r4.zza
            boolean r3 = r5.zza
            if (r1 != r3) goto L19
            boolean r4 = r4.zzb
            boolean r5 = r5.zzb
            if (r4 != r5) goto L19
            return r0
        L19:
            return r2
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.zza
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r1.zzb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            int r1 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r1
    }

    public boolean isChargingRequired() {
            r0 = this;
            boolean r0 = r0.zza
            return r0
    }

    public boolean isWifiRequired() {
            r0 = this;
            boolean r0 = r0.zzb
            return r0
    }
}
