package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzb {
    private static java.lang.ClassLoader zza;
    private static java.lang.Thread zzb;

    public static synchronized java.lang.ClassLoader zza() {
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> La6
            if (r1 != 0) goto Ld5
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> La6
            r2 = 0
            if (r1 != 0) goto Laa
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> La6
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> La6
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> La6
            if (r1 != 0) goto L1d
            r1 = r2
            goto La1
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> La6
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            r6 = 0
            r7 = r6
        L2b:
            if (r7 >= r4) goto L44
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            if (r9 == 0) goto L3c
            goto L45
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r1 = move-exception
            goto La8
        L42:
            r1 = move-exception
            goto L83
        L44:
            r8 = r2
        L45:
            if (r8 != 0) goto L4e
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
        L4e:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
        L57:
            if (r6 >= r1) goto L6b
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L42
            if (r7 == 0) goto L68
            goto L6c
        L68:
            int r6 = r6 + 1
            goto L57
        L6b:
            r5 = r2
        L6c:
            if (r5 != 0) goto L9f
            com.google.android.gms.dynamite.zza r1 = new com.google.android.gms.dynamite.zza     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L80
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L80
            r1.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7d
            r1.start()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7d
            r5 = r1
            goto L9f
        L7d:
            r4 = move-exception
            r5 = r1
            goto L85
        L80:
            r1 = move-exception
            r4 = r1
            goto L85
        L83:
            r4 = r1
            r5 = r2
        L85:
            java.lang.String r1 = "DynamiteLoaderV2CL"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r7 = "Failed to enumerate thread/threadgroup "
            r6.append(r7)     // Catch: java.lang.Throwable -> L3f
            r6.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L3f
        L9f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            r1 = r5
        La1:
            com.google.android.gms.dynamite.zzb.zzb = r1     // Catch: java.lang.Throwable -> La6
            if (r1 != 0) goto Laa
            goto Ld0
        La6:
            r1 = move-exception
            goto Ld9
        La8:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> La6
        Laa:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.Thread r3 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> Lb2 java.lang.SecurityException -> Lb4
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> Lb2 java.lang.SecurityException -> Lb4
            goto Lcf
        Lb2:
            r2 = move-exception
            goto Ld3
        Lb4:
            r3 = move-exception
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r5.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = "Failed to get thread context classloader "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb2
            r5.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lb2
            android.util.Log.w(r4, r3)     // Catch: java.lang.Throwable -> Lb2
        Lcf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb2
        Ld0:
            com.google.android.gms.dynamite.zzb.zza = r2     // Catch: java.lang.Throwable -> La6
            goto Ld5
        Ld3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb2
            throw r2     // Catch: java.lang.Throwable -> La6
        Ld5:
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)
            return r1
        Ld9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r1
    }
}
