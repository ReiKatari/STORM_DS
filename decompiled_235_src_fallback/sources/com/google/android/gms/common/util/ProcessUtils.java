package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ProcessUtils {
    private static java.lang.String zza;
    private static int zzb;

    private ProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getMyProcessName() {
            java.lang.String r0 = "/proc/"
            java.lang.String r1 = com.google.android.gms.common.util.ProcessUtils.zza
            if (r1 != 0) goto L64
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L13
            java.lang.String r0 = defpackage.o05.h()
            com.google.android.gms.common.util.ProcessUtils.zza = r0
            goto L64
        L13:
            int r1 = com.google.android.gms.common.util.ProcessUtils.zzb
            if (r1 != 0) goto L1d
            int r1 = android.os.Process.myPid()
            com.google.android.gms.common.util.ProcessUtils.zzb = r1
        L1d:
            r2 = 0
            if (r1 > 0) goto L21
            goto L62
        L21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            r3.append(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L57
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L57
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            java.lang.String r0 = r3.readLine()     // Catch: java.io.IOException -> L4e java.lang.Throwable -> L52
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.io.IOException -> L4e java.lang.Throwable -> L52
            java.lang.String r2 = r0.trim()     // Catch: java.io.IOException -> L4e java.lang.Throwable -> L52
        L4e:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r3)
            goto L62
        L52:
            r0 = move-exception
            r2 = r3
            goto L5c
        L55:
            r0 = move-exception
            goto L5c
        L57:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
            throw r0     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L60
        L5c:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            throw r0
        L60:
            r3 = r2
            goto L4e
        L62:
            com.google.android.gms.common.util.ProcessUtils.zza = r2
        L64:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            return r0
    }
}
