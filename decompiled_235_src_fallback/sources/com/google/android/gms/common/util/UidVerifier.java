package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class UidVerifier {
    private UidVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isGooglePlayServicesUid(android.content.Context r2, int r3) {
            java.lang.String r0 = "com.google.android.gms"
            boolean r3 = uidHasPackageName(r2, r3, r0)
            if (r3 != 0) goto L9
            goto L2a
        L9:
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            r1 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1c
            com.google.android.gms.common.GoogleSignatureVerifier r2 = com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r2)
            boolean r2 = r2.isGooglePublicSignedPackage(r3)
            return r2
        L1c:
            r2 = 3
            java.lang.String r3 = "UidVerifier"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L2a
            java.lang.String r2 = "Package manager can't find google play services package, defaulting to false"
            android.util.Log.d(r3, r2)
        L2a:
            r2 = 0
            return r2
    }

    public static boolean uidHasPackageName(android.content.Context r0, int r1, java.lang.String r2) {
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)
            boolean r0 = r0.zza(r1, r2)
            return r0
    }
}
