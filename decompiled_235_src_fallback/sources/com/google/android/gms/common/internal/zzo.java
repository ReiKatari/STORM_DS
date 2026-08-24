package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzo {
    private static final android.net.Uri zza = null;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final android.content.ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    static {
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r0 = r0.build()
            com.google.android.gms.common.internal.zzo.zza = r0
            return
    }

    public zzo(android.content.ComponentName r1, int r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.zzb = r2
            r0.zzc = r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzd = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zze = r1
            r1 = 0
            r0.zzf = r1
            return
    }

    public zzo(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            r3 = 4225(0x1081, float:5.92E-42)
            r4 = 0
            java.lang.String r0 = "com.google.android.gms"
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public zzo(java.lang.String r1, java.lang.String r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zzb = r1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzc = r2
            r1 = 0
            r0.zzd = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zze = r1
            r0.zzf = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.internal.zzo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.internal.zzo r5 = (com.google.android.gms.common.internal.zzo) r5
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            java.lang.String r1 = r4.zzc
            java.lang.String r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            android.content.ComponentName r1 = r4.zzd
            android.content.ComponentName r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            boolean r4 = r4.zzf
            boolean r5 = r5.zzf
            if (r4 != r5) goto L31
            return r0
        L31:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.zzb
            java.lang.String r1 = r4.zzc
            android.content.ComponentName r2 = r4.zzd
            r3 = 4225(0x1081, float:5.92E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.zzf
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r1, r2, r3, r4}
            int r4 = com.google.android.gms.common.internal.Objects.hashCode(r4)
            return r4
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            if (r0 != 0) goto L10
            android.content.ComponentName r0 = r1.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.content.ComponentName r1 = r1.zzd
            java.lang.String r1 = r1.flattenToString()
            return r1
        L10:
            return r0
    }

    public final android.content.ComponentName zza() {
            r0 = this;
            android.content.ComponentName r0 = r0.zzd
            return r0
    }

    public final android.content.Intent zzb(android.content.Context r6) {
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.zzb
            if (r1 == 0) goto L61
            boolean r1 = r5.zzf
            r2 = 0
            if (r1 == 0) goto L50
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.zzb
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L24
            android.net.Uri r3 = com.google.android.gms.common.internal.zzo.zza     // Catch: java.lang.IllegalArgumentException -> L24
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r6 = r6.call(r3, r4, r2, r1)     // Catch: java.lang.IllegalArgumentException -> L24
            goto L33
        L24:
            r6 = move-exception
            java.lang.String r1 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
            r6 = r2
        L33:
            if (r6 != 0) goto L36
            goto L3f
        L36:
            java.lang.String r1 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r6.getParcelable(r1)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
        L3f:
            if (r2 != 0) goto L50
            java.lang.String r6 = r5.zzb
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r1.concat(r6)
            android.util.Log.w(r0, r6)
        L50:
            if (r2 != 0) goto L60
            java.lang.String r6 = r5.zzb
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r6)
            java.lang.String r5 = r5.zzc
            android.content.Intent r5 = r0.setPackage(r5)
            return r5
        L60:
            return r2
        L61:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r5 = r5.zzd
            android.content.Intent r5 = r6.setComponent(r5)
            return r5
    }

    public final java.lang.String zzc() {
            r0 = this;
            java.lang.String r0 = r0.zzc
            return r0
    }
}
