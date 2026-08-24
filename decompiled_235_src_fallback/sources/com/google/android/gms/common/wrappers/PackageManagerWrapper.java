package com.google.android.gms.common.wrappers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PackageManagerWrapper {
    protected final android.content.Context zza;

    public PackageManagerWrapper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public int checkCallingOrSelfPermission(java.lang.String r1) {
            r0 = this;
            android.content.Context r0 = r0.zza
            int r0 = r0.checkCallingOrSelfPermission(r1)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int checkPermission(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            android.content.Context r0 = r0.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r0 = r0.checkPermission(r1, r2)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String r1, int r2) {
            r0 = this;
            android.content.Context r0 = r0.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)
            return r0
    }

    public java.lang.CharSequence getApplicationLabel(java.lang.String r3) {
            r2 = this;
            android.content.Context r2 = r2.zza
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r1)
            java.lang.CharSequence r2 = r0.getApplicationLabel(r2)
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public defpackage.wr4 getApplicationLabelAndIcon(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)
            android.content.Context r0 = r2.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.CharSequence r0 = r0.getApplicationLabel(r3)
            android.content.Context r2 = r2.zza
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.graphics.drawable.Drawable r2 = r2.getApplicationIcon(r3)
            wr4 r3 = new wr4
            r3.<init>(r0, r2)
            return r3
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.content.pm.PackageInfo getPackageInfo(java.lang.String r1, int r2) {
            r0 = this;
            android.content.Context r0 = r0.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
            return r0
    }

    public boolean isCallerInstantApp() {
            r2 = this;
            int r0 = android.os.Binder.getCallingUid()
            int r1 = android.os.Process.myUid()
            if (r0 != r1) goto L11
            android.content.Context r2 = r2.zza
            boolean r2 = com.google.android.gms.common.wrappers.InstantApps.isInstantApp(r2)
            return r2
        L11:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()
            if (r0 == 0) goto L32
            android.content.Context r0 = r2.zza
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Binder.getCallingUid()
            java.lang.String r0 = r0.getNameForUid(r1)
            if (r0 == 0) goto L32
            android.content.Context r2 = r2.zza
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            boolean r2 = defpackage.oc3.t(r2, r0)
            return r2
        L32:
            r2 = 0
            return r2
    }

    public final boolean zza(int r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()
            android.content.Context r3 = r3.zza
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            java.lang.String r0 = "appops"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.SecurityException -> L20
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3     // Catch: java.lang.SecurityException -> L20
            if (r3 == 0) goto L18
            r3.checkPackage(r4, r5)     // Catch: java.lang.SecurityException -> L20
            return r2
        L18:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.SecurityException -> L20
            java.lang.String r4 = "context.getSystemService(Context.APP_OPS_SERVICE) is null"
            r3.<init>(r4)     // Catch: java.lang.SecurityException -> L20
            throw r3     // Catch: java.lang.SecurityException -> L20
        L20:
            return r1
        L21:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String[] r3 = r3.getPackagesForUid(r4)
            if (r5 == 0) goto L3d
            if (r3 == 0) goto L3d
            r4 = r1
        L2e:
            int r0 = r3.length
            if (r4 >= r0) goto L3d
            r0 = r3[r4]
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3a
            return r2
        L3a:
            int r4 = r4 + 1
            goto L2e
        L3d:
            return r1
    }
}
