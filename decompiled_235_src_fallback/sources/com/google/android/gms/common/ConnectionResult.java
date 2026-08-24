package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ConnectionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.ConnectionResult> CREATOR = null;
    public static final int DEVELOPER_ERROR = 10;
    @java.lang.Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final com.google.android.gms.common.ConnectionResult RESULT_SUCCESS = null;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = -1;
    final int zza;
    private final int zzb;
    private final android.app.PendingIntent zzc;
    private final java.lang.String zzd;

    static {
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS = r0
            com.google.android.gms.common.zzb r0 = new com.google.android.gms.common.zzb
            r0.<init>()
            com.google.android.gms.common.ConnectionResult.CREATOR = r0
            return
    }

    public ConnectionResult(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public ConnectionResult(int r1, int r2, android.app.PendingIntent r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public ConnectionResult(int r2, android.app.PendingIntent r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ConnectionResult(int r2, android.app.PendingIntent r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public static java.lang.String zza(int r2) {
            r0 = 99
            if (r2 == r0) goto L65
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r2 == r0) goto L62
            switch(r2) {
                case -1: goto L5f;
                case 0: goto L5c;
                case 1: goto L59;
                case 2: goto L56;
                case 3: goto L53;
                case 4: goto L50;
                case 5: goto L4d;
                case 6: goto L4a;
                case 7: goto L47;
                case 8: goto L44;
                case 9: goto L41;
                case 10: goto L3e;
                case 11: goto L3b;
                default: goto Lb;
            }
        Lb:
            switch(r2) {
                case 13: goto L38;
                case 14: goto L35;
                case 15: goto L32;
                case 16: goto L2f;
                case 17: goto L2c;
                case 18: goto L29;
                case 19: goto L26;
                case 20: goto L23;
                case 21: goto L20;
                case 22: goto L1d;
                case 23: goto L1a;
                case 24: goto L17;
                default: goto Le;
            }
        Le:
            java.lang.String r0 = "UNKNOWN_ERROR_CODE("
            java.lang.String r1 = ")"
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            return r2
        L17:
            java.lang.String r2 = "API_DISABLED_FOR_CONNECTION"
            return r2
        L1a:
            java.lang.String r2 = "API_DISABLED"
            return r2
        L1d:
            java.lang.String r2 = "RESOLUTION_ACTIVITY_NOT_FOUND"
            return r2
        L20:
            java.lang.String r2 = "API_VERSION_UPDATE_REQUIRED"
            return r2
        L23:
            java.lang.String r2 = "RESTRICTED_PROFILE"
            return r2
        L26:
            java.lang.String r2 = "SERVICE_MISSING_PERMISSION"
            return r2
        L29:
            java.lang.String r2 = "SERVICE_UPDATING"
            return r2
        L2c:
            java.lang.String r2 = "SIGN_IN_FAILED"
            return r2
        L2f:
            java.lang.String r2 = "API_UNAVAILABLE"
            return r2
        L32:
            java.lang.String r2 = "INTERRUPTED"
            return r2
        L35:
            java.lang.String r2 = "TIMEOUT"
            return r2
        L38:
            java.lang.String r2 = "CANCELED"
            return r2
        L3b:
            java.lang.String r2 = "LICENSE_CHECK_FAILED"
            return r2
        L3e:
            java.lang.String r2 = "DEVELOPER_ERROR"
            return r2
        L41:
            java.lang.String r2 = "SERVICE_INVALID"
            return r2
        L44:
            java.lang.String r2 = "INTERNAL_ERROR"
            return r2
        L47:
            java.lang.String r2 = "NETWORK_ERROR"
            return r2
        L4a:
            java.lang.String r2 = "RESOLUTION_REQUIRED"
            return r2
        L4d:
            java.lang.String r2 = "INVALID_ACCOUNT"
            return r2
        L50:
            java.lang.String r2 = "SIGN_IN_REQUIRED"
            return r2
        L53:
            java.lang.String r2 = "SERVICE_DISABLED"
            return r2
        L56:
            java.lang.String r2 = "SERVICE_VERSION_UPDATE_REQUIRED"
            return r2
        L59:
            java.lang.String r2 = "SERVICE_MISSING"
            return r2
        L5c:
            java.lang.String r2 = "SUCCESS"
            return r2
        L5f:
            java.lang.String r2 = "UNKNOWN"
            return r2
        L62:
            java.lang.String r2 = "DRIVE_EXTERNAL_STORAGE_REQUIRED"
            return r2
        L65:
            java.lang.String r2 = "UNFINISHED"
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.ConnectionResult
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            int r1 = r4.zzb
            int r3 = r5.zzb
            if (r1 != r3) goto L27
            android.app.PendingIntent r1 = r4.zzc
            android.app.PendingIntent r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L27
            java.lang.String r4 = r4.zzd
            java.lang.String r5 = r5.zzd
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 == 0) goto L27
            return r0
        L27:
            return r2
    }

    public int getErrorCode() {
            r0 = this;
            int r0 = r0.zzb
            return r0
    }

    public java.lang.String getErrorMessage() {
            r0 = this;
            java.lang.String r0 = r0.zzd
            return r0
    }

    public android.app.PendingIntent getResolution() {
            r0 = this;
            android.app.PendingIntent r0 = r0.zzc
            return r0
    }

    public boolean hasResolution() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 == 0) goto La
            android.app.PendingIntent r1 = r1.zzc
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.app.PendingIntent r1 = r2.zzc
            java.lang.String r2 = r2.zzd
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r2
    }

    public boolean isSuccess() {
            r0 = this;
            int r0 = r0.zzb
            if (r0 != 0) goto L6
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
            android.app.PendingIntent r7 = r7.zzc
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

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            int r1 = r3.zzb
            java.lang.String r2 = "statusCode"
            java.lang.String r1 = zza(r1)
            r0.add(r2, r1)
            java.lang.String r1 = "resolution"
            android.app.PendingIntent r2 = r3.zzc
            r0.add(r1, r2)
            java.lang.String r1 = "message"
            java.lang.String r3 = r3.zzd
            r0.add(r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            r0 = 2
            int r2 = r4.getErrorCode()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
            android.app.PendingIntent r0 = r4.getResolution()
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            r6 = 4
            java.lang.String r4 = r4.getErrorMessage()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r4, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
