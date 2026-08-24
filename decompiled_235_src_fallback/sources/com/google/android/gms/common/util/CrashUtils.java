package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CrashUtils {
    private static final java.lang.String[] zza = null;

    static {
            java.lang.String r0 = "java."
            java.lang.String r1 = "javax."
            java.lang.String r2 = "android."
            java.lang.String r3 = "com.android."
            java.lang.String r4 = "dalvik."
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            com.google.android.gms.common.util.CrashUtils.zza = r0
            return
    }

    public CrashUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean addDynamiteErrorToDropBox(android.content.Context r1, java.lang.Throwable r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Exception -> L7
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Exception -> L7
            goto Lf
        L7:
            r1 = move-exception
            java.lang.String r2 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r2, r0, r1)
        Lf:
            r1 = 0
            return r1
    }
}
