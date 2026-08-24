package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzz {
    private final int zza;

    public zzj(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 25
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            int r3 = java.util.Arrays.hashCode(r3)
            r2.zza = r3
            return
    }

    public static byte[] zze(java.lang.String r1) {
            java.lang.String r0 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L31
            boolean r1 = r4 instanceof com.google.android.gms.common.internal.zzaa
            if (r1 != 0) goto L8
            goto L31
        L8:
            com.google.android.gms.common.internal.zzaa r4 = (com.google.android.gms.common.internal.zzaa) r4     // Catch: android.os.RemoteException -> L29
            int r1 = r4.zzc()     // Catch: android.os.RemoteException -> L29
            int r2 = r3.zza     // Catch: android.os.RemoteException -> L29
            if (r1 == r2) goto L13
            return r0
        L13:
            d13 r4 = r4.zzd()     // Catch: android.os.RemoteException -> L29
            if (r4 != 0) goto L1a
            return r0
        L1a:
            java.lang.Object r4 = defpackage.zh4.d(r4)     // Catch: android.os.RemoteException -> L29
            byte[] r4 = (byte[]) r4     // Catch: android.os.RemoteException -> L29
            byte[] r3 = r3.zzf()     // Catch: android.os.RemoteException -> L29
            boolean r3 = java.util.Arrays.equals(r3, r4)     // Catch: android.os.RemoteException -> L29
            return r3
        L29:
            r3 = move-exception
            java.lang.String r4 = "GoogleCertificates"
            java.lang.String r1 = "Failed to get Google certificates from remote"
            android.util.Log.e(r4, r1, r3)
        L31:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
            r0 = this;
            int r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final defpackage.d13 zzd() {
            r1 = this;
            byte[] r1 = r1.zzf()
            zh4 r0 = new zh4
            r0.<init>(r1)
            return r0
    }

    public abstract byte[] zzf();
}
