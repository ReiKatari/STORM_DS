package com.google.android.gms.common.api;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = null;
    public static final com.google.android.gms.common.api.Status RESULT_CANCELED = null;
    public static final com.google.android.gms.common.api.Status RESULT_DEAD_CLIENT = null;
    public static final com.google.android.gms.common.api.Status RESULT_INTERNAL_ERROR = null;
    public static final com.google.android.gms.common.api.Status RESULT_INTERRUPTED = null;
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS = null;
    public static final com.google.android.gms.common.api.Status RESULT_SUCCESS_CACHE = null;
    public static final com.google.android.gms.common.api.Status RESULT_TIMEOUT = null;
    public static final com.google.android.gms.common.api.Status zza = null;
    private final int zzb;
    private final java.lang.String zzc;
    private final android.app.PendingIntent zzd;
    private final com.google.android.gms.common.ConnectionResult zze;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = -1
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_SUCCESS_CACHE = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_SUCCESS = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 14
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_INTERRUPTED = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 8
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 15
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_TIMEOUT = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 16
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_CANCELED = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.zza = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 18
            r0.<init>(r1)
            com.google.android.gms.common.api.Status.RESULT_DEAD_CLIENT = r0
            com.google.android.gms.common.api.zzb r0 = new com.google.android.gms.common.api.zzb
            r0.<init>()
            com.google.android.gms.common.api.Status.CREATOR = r0
            return
    }

    public Status(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Status(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Status(int r2, java.lang.String r3, android.app.PendingIntent r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public Status(int r1, java.lang.String r2, android.app.PendingIntent r3, com.google.android.gms.common.ConnectionResult r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    public Status(com.google.android.gms.common.ConnectionResult r2, java.lang.String r3) {
            r1 = this;
            r0 = 17
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public Status(com.google.android.gms.common.ConnectionResult r2, java.lang.String r3, int r4) {
            r1 = this;
            android.app.PendingIntent r0 = r2.getResolution()
            r1.<init>(r4, r3, r0, r2)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r3.zzb
            int r2 = r4.zzb
            if (r0 != r2) goto L2e
            java.lang.String r0 = r3.zzc
            java.lang.String r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L2e
            android.app.PendingIntent r0 = r3.zzd
            android.app.PendingIntent r2 = r4.zzd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L2e
            com.google.android.gms.common.ConnectionResult r3 = r3.zze
            com.google.android.gms.common.ConnectionResult r4 = r4.zze
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r3, r4)
            if (r3 == 0) goto L2e
            r3 = 1
            return r3
        L2e:
            return r1
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult() {
            r0 = this;
            com.google.android.gms.common.ConnectionResult r0 = r0.zze
            return r0
    }

    public android.app.PendingIntent getResolution() {
            r0 = this;
            android.app.PendingIntent r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
            r0 = this;
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int getStatusCode() {
            r0 = this;
            int r0 = r0.zzb
            return r0
    }

    public java.lang.String getStatusMessage() {
            r0 = this;
            java.lang.String r0 = r0.zzc
            return r0
    }

    public boolean hasResolution() {
            r0 = this;
            android.app.PendingIntent r0 = r0.zzd
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r3.zzc
            android.app.PendingIntent r2 = r3.zzd
            com.google.android.gms.common.ConnectionResult r3 = r3.zze
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r1, r2, r3}
            int r3 = com.google.android.gms.common.internal.Objects.hashCode(r3)
            return r3
    }

    public boolean isCanceled() {
            r1 = this;
            int r1 = r1.zzb
            r0 = 16
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean isInterrupted() {
            r1 = this;
            int r1 = r1.zzb
            r0 = 14
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean isSuccess() {
            r0 = this;
            int r0 = r0.zzb
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void startResolutionForResult(android.app.Activity r8, int r9) {
            r7 = this;
            boolean r0 = r7.hasResolution()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.PendingIntent r7 = r7.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            android.content.IntentSender r1 = r7.getIntentSender()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r2 = r9
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    public void startResolutionForResult(defpackage.d9 r4) {
            r3 = this;
            boolean r0 = r3.hasResolution()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.PendingIntent r3 = r3.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.IntentSender r3 = r3.getIntentSender()
            r3.getClass()
            s93 r0 = new s93
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2, r2)
            r4.a(r0)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = "statusCode"
            java.lang.String r2 = r3.zza()
            r0.add(r1, r2)
            java.lang.String r1 = "resolution"
            android.app.PendingIntent r3 = r3.zzd
            r0.add(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r1 = 1
            int r2 = r4.getStatusCode()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r2)
            java.lang.String r1 = r4.getStatusMessage()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            r1 = 3
            android.app.PendingIntent r2 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r2, r6, r3)
            r1 = 4
            com.google.android.gms.common.ConnectionResult r4 = r4.getConnectionResult()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r1, r4, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            if (r0 == 0) goto L5
            return r0
        L5:
            int r1 = r1.zzb
            java.lang.String r1 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r1)
            return r1
    }
}
