package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza = 0;
    private static final java.lang.reflect.Method zzb = null;
    private static final java.lang.reflect.Method zzc = null;
    private static final java.lang.reflect.Method zzd = null;
    private static final java.lang.reflect.Method zze = null;
    private static final java.lang.reflect.Method zzf = null;
    private static final java.lang.reflect.Method zzg = null;
    private static final java.lang.reflect.Method zzh = null;
    private static final java.lang.reflect.Method zzi = null;
    private static java.lang.Boolean zzj;

    static {
            java.lang.String r0 = "add"
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            int r3 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r3
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Method r4 = r2.getMethod(r0, r4)     // Catch: java.lang.Exception -> L16
            goto L17
        L16:
            r4 = r3
        L17:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 == 0) goto L2a
            java.lang.Class[] r4 = new java.lang.Class[]{r1, r5}     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r0 = r2.getMethod(r0, r4)     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r0 = r3
        L2b:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.String r0 = "size"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch: java.lang.Exception -> L34
            goto L35
        L34:
            r0 = r3
        L35:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.String r0 = "get"
            java.lang.Class[] r4 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Method r0 = r2.getMethod(r0, r4)     // Catch: java.lang.Exception -> L42
            goto L43
        L42:
            r0 = r3
        L43:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L56
            java.lang.String r0 = "getName"
            java.lang.Class[] r4 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Method r0 = r2.getMethod(r0, r4)     // Catch: java.lang.Exception -> L56
            goto L57
        L56:
            r0 = r3
        L57:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            java.lang.String r4 = "WorkSourceUtil"
            if (r0 == 0) goto L6e
            java.lang.String r0 = "createWorkChain"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch: java.lang.Exception -> L68
            goto L6f
        L68:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r4, r6, r0)
        L6e:
            r0 = r3
        L6f:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L8e
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L88
            java.lang.String r6 = "addNode"
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r5}     // Catch: java.lang.Exception -> L88
            java.lang.reflect.Method r0 = r0.getMethod(r6, r1)     // Catch: java.lang.Exception -> L88
            goto L8f
        L88:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r4, r1, r0)
        L8e:
            r0 = r3
        L8f:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto La2
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch: java.lang.Exception -> La2
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> La3
            goto La3
        La2:
            r0 = r3
        La3:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3
            return
    }

    private WorkSourceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void add(android.os.WorkSource r3, int r4, java.lang.String r5) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzc
            java.lang.String r1 = "Unable to assign blame through WorkSource"
            java.lang.String r2 = "WorkSourceUtil"
            if (r0 == 0) goto L1d
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
        Lc:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L18
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Exception -> L18
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r3 = move-exception
            android.util.Log.wtf(r2, r1, r3)
            return
        L1d:
            java.lang.reflect.Method r5 = com.google.android.gms.common.util.WorkSourceUtil.zzb
            if (r5 == 0) goto L31
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L2d
            r5.invoke(r3, r4)     // Catch: java.lang.Exception -> L2d
            return
        L2d:
            r3 = move-exception
            android.util.Log.wtf(r2, r1, r3)
        L31:
            return
    }

    public static android.os.WorkSource fromPackage(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = "WorkSourceUtil"
            r1 = 0
            if (r3 == 0) goto L36
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            if (r2 == 0) goto L36
            if (r4 == 0) goto L36
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r3 != 0) goto L22
            java.lang.String r3 = "Could not get applicationInfo from package: "
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.e(r0, r3)
            return r1
        L22:
            int r3 = r3.uid
            android.os.WorkSource r0 = new android.os.WorkSource
            r0.<init>()
            add(r0, r3, r4)
            return r0
        L2d:
            java.lang.String r3 = "Could not find package: "
            java.lang.String r3 = r3.concat(r4)
            android.util.Log.e(r0, r3)
        L36:
            return r1
    }

    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            r0 = 0
            java.lang.String r1 = "WorkSourceUtil"
            if (r5 == 0) goto L6f
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            if (r2 == 0) goto L6f
            if (r7 == 0) goto L6f
            if (r6 != 0) goto L10
            goto L6f
        L10:
            r2 = -1
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            r3 = 0
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29
            if (r5 != 0) goto L26
            java.lang.String r5 = "Could not get applicationInfo from package: "
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r1, r5)
            goto L32
        L26:
            int r2 = r5.uid
            goto L32
        L29:
            java.lang.String r5 = "Could not find package: "
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r1, r5)
        L32:
            if (r2 >= 0) goto L35
            return r0
        L35:
            android.os.WorkSource r5 = new android.os.WorkSource
            r5.<init>()
            java.lang.reflect.Method r3 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r3 == 0) goto L6b
            java.lang.reflect.Method r4 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r4 != 0) goto L43
            goto L6b
        L43:
            java.lang.Object r0 = r3.invoke(r5, r0)     // Catch: java.lang.Exception -> L57
            int r3 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L57
            if (r2 == r3) goto L59
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L57
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r6}     // Catch: java.lang.Exception -> L57
            r4.invoke(r0, r6)     // Catch: java.lang.Exception -> L57
            goto L59
        L57:
            r6 = move-exception
            goto L65
        L59:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L57
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Exception -> L57
            r4.invoke(r0, r6)     // Catch: java.lang.Exception -> L57
            goto L6e
        L65:
            java.lang.String r7 = "Unable to assign chained blame through WorkSource"
            android.util.Log.w(r1, r7, r6)
            goto L6e
        L6b:
            add(r5, r2, r6)
        L6e:
            return r5
        L6f:
            java.lang.String r5 = "Unexpected null arguments"
            android.util.Log.w(r1, r5)
            return r0
    }

    public static int get(android.os.WorkSource r1, int r2) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zze
            if (r0 == 0) goto L22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Exception -> L1a
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L1a
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L1a
            return r1
        L1a:
            r1 = move-exception
            java.lang.String r2 = "WorkSourceUtil"
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r2, r0, r1)
        L22:
            r1 = 0
            return r1
    }

    public static java.lang.String getName(android.os.WorkSource r1, int r2) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzf
            if (r0 == 0) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L13
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L13
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.String r2 = "WorkSourceUtil"
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r2, r0, r1)
        L1b:
            r1 = 0
            return r1
    }

    public static java.util.List<java.lang.String> getNames(android.os.WorkSource r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            if (r5 != 0) goto La
            r2 = r1
            goto Le
        La:
            int r2 = size(r5)
        Le:
            if (r2 == 0) goto L25
        L10:
            if (r1 >= r2) goto L25
            java.lang.String r3 = getName(r5, r1)
            boolean r4 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r3)
            if (r4 != 0) goto L22
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r0.add(r3)
        L22:
            int r1 = r1 + 1
            goto L10
        L25:
            return r0
    }

    public static synchronized boolean hasWorkSourcePermission(android.content.Context r3) {
            java.lang.Class<com.google.android.gms.common.util.WorkSourceUtil> r0 = com.google.android.gms.common.util.WorkSourceUtil.class
            monitor-enter(r0)
            java.lang.Boolean r1 = com.google.android.gms.common.util.WorkSourceUtil.zzj     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            boolean r3 = r1.booleanValue()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r3
        Ld:
            r3 = move-exception
            goto L25
        Lf:
            r1 = 0
            if (r3 != 0) goto L14
            monitor-exit(r0)
            return r1
        L14:
            java.lang.String r2 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = defpackage.ge7.s(r3, r2)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L1d
            r1 = 1
        L1d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> Ld
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r1
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public static boolean isEmpty(android.os.WorkSource r3) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzi
            if (r0 == 0) goto L1b
            r1 = 0
            java.lang.Object r0 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L13
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Exception -> L13
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L13
            boolean r3 = r0.booleanValue()     // Catch: java.lang.Exception -> L13
            return r3
        L13:
            r0 = move-exception
            java.lang.String r1 = "WorkSourceUtil"
            java.lang.String r2 = "Unable to check WorkSource emptiness"
            android.util.Log.e(r1, r2, r0)
        L1b:
            int r3 = size(r3)
            if (r3 != 0) goto L23
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    public static int size(android.os.WorkSource r2) {
            java.lang.reflect.Method r0 = com.google.android.gms.common.util.WorkSourceUtil.zzd
            if (r0 == 0) goto L1b
            r1 = 0
            java.lang.Object r2 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L13
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Exception -> L13
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L13
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L13
            return r2
        L13:
            r2 = move-exception
            java.lang.String r0 = "WorkSourceUtil"
            java.lang.String r1 = "Unable to assign blame through WorkSource"
            android.util.Log.wtf(r0, r1, r2)
        L1b:
            r2 = 0
            return r2
    }
}
