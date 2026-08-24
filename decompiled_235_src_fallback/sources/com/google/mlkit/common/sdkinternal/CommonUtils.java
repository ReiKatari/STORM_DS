package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CommonUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "CommonUtils"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.sdkinternal.CommonUtils.zza = r0
            return
    }

    private CommonUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getAppVersion(android.content.Context r2) {
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            r1 = 0
            android.content.pm.PackageInfo r2 = r0.getPackageInfo(r2, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            int r2 = r2.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            return r2
        L14:
            r2 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.sdkinternal.CommonUtils.zza
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "Exception thrown when trying to get app version "
            java.lang.String r2 = r1.concat(r2)
            java.lang.String r1 = "CommonUtils"
            r0.e(r1, r2)
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String languageTagFromLocale(java.util.Locale r3) {
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r0 == 0) goto Lb
            java.lang.String r3 = r3.toLanguageTag()
            return r3
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.getLanguage()
            r0.<init>(r1)
            java.lang.String r1 = r3.getCountry()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "-"
            if (r1 != 0) goto L2a
            r0.append(r2)
            java.lang.String r1 = r3.getCountry()
            r0.append(r1)
        L2a:
            java.lang.String r1 = r3.getVariant()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3e
            r0.append(r2)
            java.lang.String r3 = r3.getVariant()
            r0.append(r3)
        L3e:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
