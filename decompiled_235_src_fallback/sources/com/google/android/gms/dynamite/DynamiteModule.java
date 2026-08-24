package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = null;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = null;
    public static final int REMOTE = 1;
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = null;
    private static java.lang.Boolean zzb = null;
    private static java.lang.String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static java.lang.Boolean zzf;
    private static final java.lang.ThreadLocal zzg = null;
    private static final java.lang.ThreadLocal zzh = null;
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzi = null;
    private static com.google.android.gms.dynamite.zzq zzk;
    private static com.google.android.gms.dynamite.zzr zzl;
    private final android.content.Context zzj;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;

        public DynamiteLoaderClassLoader() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class LoadingException extends java.lang.Exception {
        public /* synthetic */ LoadingException(java.lang.String r1, com.google.android.gms.dynamite.zzp r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public /* synthetic */ LoadingException(java.lang.String r1, java.lang.Throwable r2, com.google.android.gms.dynamite.zzp r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface VersionPolicy {

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public interface IVersions {
            int zza(android.content.Context r1, java.lang.String r2);

            int zzb(android.content.Context r1, java.lang.String r2, boolean r3);
        }

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public static class SelectionResult {
            public int localVersion;
            public int remoteVersion;
            public int selection;

            public SelectionResult() {
                    r1 = this;
                    r1.<init>()
                    r0 = 0
                    r1.localVersion = r0
                    r1.remoteVersion = r0
                    r1.selection = r0
                    return
            }
        }

        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r1, java.lang.String r2, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r3);
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzg = r0
            com.google.android.gms.dynamite.zzd r0 = new com.google.android.gms.dynamite.zzd
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzh = r0
            com.google.android.gms.dynamite.zze r0 = new com.google.android.gms.dynamite.zze
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zzi = r0
            com.google.android.gms.dynamite.zzf r0 = new com.google.android.gms.dynamite.zzf
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE = r0
            com.google.android.gms.dynamite.zzg r0 = new com.google.android.gms.dynamite.zzg
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_LOCAL = r0
            com.google.android.gms.dynamite.zzh r0 = new com.google.android.gms.dynamite.zzh
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzi r0 = new com.google.android.gms.dynamite.zzi
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION = r0
            com.google.android.gms.dynamite.zzj r0 = new com.google.android.gms.dynamite.zzj
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = r0
            com.google.android.gms.dynamite.zzk r0 = new com.google.android.gms.dynamite.zzk
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION = r0
            com.google.android.gms.dynamite.zzl r0 = new com.google.android.gms.dynamite.zzl
            r0.<init>()
            com.google.android.gms.dynamite.DynamiteModule.zza = r0
            return
    }

    private DynamiteModule(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r0.zzj = r1
            return
    }

    public static int getLocalVersion(android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "Module descriptor id '"
            java.lang.String r2 = "com.google.android.gms.dynamite.descriptors."
            r3 = 0
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            r4.<init>(r2)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            r4.append(r7)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r2 = ".ModuleDescriptor"
            r4.append(r2)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.Class r6 = r6.loadClass(r2)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r2 = "MODULE_ID"
            java.lang.reflect.Field r2 = r6.getDeclaredField(r2)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r4 = "MODULE_VERSION"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            r4 = 0
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r5, r7)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            if (r5 != 0) goto L62
            java.lang.Object r6 = r2.get(r4)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            r2.<init>(r1)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            r2.append(r6)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r6 = "' didn't match expected id '"
            r2.append(r6)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            r2.append(r7)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r6 = "'"
            r2.append(r6)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            android.util.Log.e(r0, r6)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            return r3
        L60:
            r6 = move-exception
            goto L67
        L62:
            int r6 = r6.getInt(r4)     // Catch: java.lang.Exception -> L60 java.lang.ClassNotFoundException -> L79
            return r6
        L67:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Failed to load module descriptor class: "
            java.lang.String r6 = r7.concat(r6)
            android.util.Log.e(r0, r6)
            goto L8f
        L79:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Local module descriptor class for "
            r6.<init>(r1)
            r6.append(r7)
            java.lang.String r7 = " not found."
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r0, r6)
        L8f:
            return r3
    }

    public static int getRemoteVersion(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            int r1 = zza(r1, r2, r0)
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r23, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r24, java.lang.String r25) {
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r0 = "No acceptable module "
            java.lang.String r4 = "VersionPolicy returned invalid code:"
            java.lang.String r5 = "Selected remote version of "
            java.lang.String r6 = "Selected remote version of "
            java.lang.String r7 = "Considering local module "
            android.content.Context r8 = r1.getApplicationContext()
            r9 = 0
            if (r8 == 0) goto L2cc
            java.lang.ThreadLocal r10 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Object r11 = r10.get()
            com.google.android.gms.dynamite.zzn r11 = (com.google.android.gms.dynamite.zzn) r11
            com.google.android.gms.dynamite.zzn r12 = new com.google.android.gms.dynamite.zzn
            r12.<init>(r9)
            r10.set(r12)
            java.lang.ThreadLocal r13 = com.google.android.gms.dynamite.DynamiteModule.zzh
            java.lang.Object r14 = r13.get()
            java.lang.Long r14 = (java.lang.Long) r14
            long r15 = r14.longValue()
            r17 = 0
            long r19 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2ad
            java.lang.Long r9 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> L2ad
            r13.set(r9)     // Catch: java.lang.Throwable -> L2ad
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r9 = com.google.android.gms.dynamite.DynamiteModule.zzi     // Catch: java.lang.Throwable -> L2ad
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r9 = r2.selectModule(r1, r3, r9)     // Catch: java.lang.Throwable -> L2ad
            java.lang.String r13 = "DynamiteModule"
            r19 = r10
            int r10 = r9.localVersion     // Catch: java.lang.Throwable -> L2ad
            r21 = r15
            int r15 = r9.remoteVersion     // Catch: java.lang.Throwable -> L86
            r16 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L86
            r0.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = ":"
            r0.append(r7)     // Catch: java.lang.Throwable -> L86
            r0.append(r10)     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = " and remote module "
            r0.append(r7)     // Catch: java.lang.Throwable -> L86
            r0.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r7 = ":"
            r0.append(r7)     // Catch: java.lang.Throwable -> L86
            r0.append(r15)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L86
            android.util.Log.i(r13, r0)     // Catch: java.lang.Throwable -> L86
            int r0 = r9.selection     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L27f
            r7 = -1
            if (r0 != r7) goto L89
            int r0 = r9.localVersion     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L27f
            r0 = r7
            goto L89
        L86:
            r0 = move-exception
            goto L2b0
        L89:
            r10 = 1
            if (r0 != r10) goto L90
            int r13 = r9.remoteVersion     // Catch: java.lang.Throwable -> L86
            if (r13 == 0) goto L27f
        L90:
            if (r0 != r7) goto L98
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r8, r3)     // Catch: java.lang.Throwable -> L86
            goto L247
        L98:
            if (r0 != r10) goto L26c
            r4 = 0
            int r0 = r9.remoteVersion     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r13 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            boolean r15 = zzf(r1)     // Catch: java.lang.Throwable -> L1f2
            if (r15 == 0) goto L1f4
            java.lang.Boolean r15 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L1f2
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L1f2
            if (r15 == 0) goto L1e9
            boolean r13 = r15.booleanValue()     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r15 = 2
            if (r13 == 0) goto L15d
            java.lang.String r5 = "DynamiteModule"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r13.<init>(r6)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r13.append(r3)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r6 = ", version >= "
            r13.append(r6)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r13.append(r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r6 = r13.toString()     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            android.util.Log.i(r5, r6)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r5 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            com.google.android.gms.dynamite.zzr r6 = com.google.android.gms.dynamite.DynamiteModule.zzl     // Catch: java.lang.Throwable -> L15a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15a
            if (r6 == 0) goto L151
            java.lang.Object r5 = r19.get()     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            com.google.android.gms.dynamite.zzn r5 = (com.google.android.gms.dynamite.zzn) r5     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            if (r5 == 0) goto L148
            android.database.Cursor r13 = r5.zza     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            if (r13 == 0) goto L148
            android.content.Context r13 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            android.database.Cursor r5 = r5.zza     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r10 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7 = 0
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r7 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            int r10 = com.google.android.gms.dynamite.DynamiteModule.zze     // Catch: java.lang.Throwable -> L145
            if (r10 < r15) goto Lf4
            r10 = 1
            goto Lf5
        Lf4:
            r10 = r4
        Lf5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L145
            if (r10 == 0) goto L117
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r7, r10)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r7 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r10 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            d13 r0 = r6.zzf(r7, r3, r0, r10)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            goto L12c
        L10e:
            r0 = move-exception
            goto L1ff
        L111:
            r0 = move-exception
            goto L20d
        L114:
            r0 = move-exception
            goto L20e
        L117:
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r7, r10)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r7 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r10 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            d13 r0 = r6.zze(r7, r3, r0, r10)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L12c:
            java.lang.Object r0 = defpackage.zh4.d(r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            if (r0 == 0) goto L13c
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L139:
            r0 = r5
            goto L247
        L13c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = "Failed to get module context"
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L145:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L145
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L148:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = "No result cursor"
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L151:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = "DynamiteLoaderV2 was not cached."
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L15a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L15a
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L15d:
            java.lang.String r6 = "DynamiteModule"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7.append(r3)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = ", version >= "
            r7.append(r5)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7.append(r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            android.util.Log.i(r6, r5)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            com.google.android.gms.dynamite.zzq r5 = zzg(r1)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            if (r5 == 0) goto L1e0
            int r6 = r5.zze()     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7 = 3
            if (r6 < r7) goto L1a5
            java.lang.Object r6 = r19.get()     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            com.google.android.gms.dynamite.zzn r6 = (com.google.android.gms.dynamite.zzn) r6     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            if (r6 == 0) goto L19c
            zh4 r7 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            android.database.Cursor r6 = r6.zza     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r10 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            d13 r0 = r5.zzi(r7, r3, r0, r10)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            goto L1c8
        L19c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = "No cached result cursor holder"
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L1a5:
            if (r6 != r15) goto L1b8
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "IDynamite loader version = 2"
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r6 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            d13 r0 = r5.zzj(r6, r3, r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            goto L1c8
        L1b8:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r6, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            zh4 r6 = new zh4     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            d13 r0 = r5.zzh(r6, r3, r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L1c8:
            java.lang.Object r0 = defpackage.zh4.d(r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            if (r0 == 0) goto L1d7
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            goto L139
        L1d7:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = "Failed to load remote module."
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L1e0:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = "Failed to create IDynamiteLoader."
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L1e9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            java.lang.String r5 = "Failed to determine which loading route to use."
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L1f2:
            r0 = move-exception
            goto L1fd
        L1f4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r5 = "Remote loading disabled"
            r7 = 0
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L1f2
            throw r0     // Catch: java.lang.Throwable -> L1f2
        L1fd:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L1f2
            throw r0     // Catch: java.lang.Throwable -> L10e com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L111 android.os.RemoteException -> L114
        L1ff:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
            java.lang.String r6 = "Failed to load remote module."
            r7 = 0
            r5.<init>(r6, r0, r7)     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
            throw r5     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
        L20b:
            r0 = move-exception
            goto L217
        L20d:
            throw r0     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
        L20e:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r5 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
            java.lang.String r6 = "Failed to load remote module."
            r7 = 0
            r5.<init>(r6, r0, r7)     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
            throw r5     // Catch: java.lang.Throwable -> L86 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L20b
        L217:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = r0.getMessage()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r10 = "Failed to load remote module: "
            r7.append(r10)     // Catch: java.lang.Throwable -> L86
            r7.append(r6)     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L86
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L86
            int r5 = r9.localVersion     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L263
            com.google.android.gms.dynamite.zzo r6 = new com.google.android.gms.dynamite.zzo     // Catch: java.lang.Throwable -> L86
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> L86
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r1 = r2.selectModule(r1, r3, r6)     // Catch: java.lang.Throwable -> L86
            int r1 = r1.selection     // Catch: java.lang.Throwable -> L86
            r2 = -1
            if (r1 != r2) goto L263
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r8, r3)     // Catch: java.lang.Throwable -> L86
        L247:
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 != 0) goto L251
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.remove()
            goto L256
        L251:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.set(r14)
        L256:
            android.database.Cursor r1 = r12.zza
            if (r1 == 0) goto L25d
            r1.close()
        L25d:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.set(r11)
            return r0
        L263:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r7 = 0
            r1.<init>(r2, r0, r7)     // Catch: java.lang.Throwable -> L86
            throw r1     // Catch: java.lang.Throwable -> L86
        L26c:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L86
            r2.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L86
            r7 = 0
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L86
            throw r1     // Catch: java.lang.Throwable -> L86
        L27f:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L86
            int r1 = r9.localVersion     // Catch: java.lang.Throwable -> L86
            int r2 = r9.remoteVersion     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r5 = r16
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L86
            r4.append(r3)     // Catch: java.lang.Throwable -> L86
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch: java.lang.Throwable -> L86
            r4.append(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch: java.lang.Throwable -> L86
            r4.append(r2)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = "."
            r4.append(r1)     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L86
            r7 = 0
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L2ad:
            r0 = move-exception
            r21 = r15
        L2b0:
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 != 0) goto L2ba
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.remove()
            goto L2bf
        L2ba:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzh
            r1.set(r14)
        L2bf:
            android.database.Cursor r1 = r12.zza
            if (r1 == 0) goto L2c6
            r1.close()
        L2c6:
            java.lang.ThreadLocal r1 = com.google.android.gms.dynamite.DynamiteModule.zzg
            r1.set(r11)
            throw r0
        L2cc:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "null application Context"
            r7 = 0
            r0.<init>(r1, r7)
            throw r0
    }

    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lec
            java.lang.Boolean r0 = com.google.android.gms.dynamite.DynamiteModule.zzb     // Catch: java.lang.Throwable -> L4b
            r2 = 0
            r3 = 0
            if (r0 != 0) goto Le0
            android.content.Context r0 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Class r0 = r0.loadClass(r4)     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Class r4 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch: java.lang.Throwable -> L36
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L36
            if (r5 != r6) goto L39
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L36
            goto Lb9
        L36:
            r0 = move-exception
            goto Lbb
        L39:
            if (r5 == 0) goto L42
            zzd(r5)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L3e
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L36
            goto Lb9
        L42:
            boolean r5 = zzf(r10)     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L4f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            return r3
        L4b:
            r0 = move-exception
            r11 = r0
            goto L1d9
        L4f:
            boolean r5 = com.google.android.gms.dynamite.DynamiteModule.zzd     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto Lb0
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L36
            boolean r6 = r5.equals(r2)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L5c
            goto Lb0
        L5c:
            r6 = 1
            int r6 = zzb(r10, r11, r12, r6)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            java.lang.String r7 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            if (r7 == 0) goto La3
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            if (r7 == 0) goto L6c
            goto La3
        L6c:
            java.lang.ClassLoader r7 = com.google.android.gms.dynamite.zzb.zza()     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            if (r7 == 0) goto L73
            goto L98
        L73:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            r8 = 29
            if (r7 < r8) goto L8a
            defpackage.hz.b()     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            java.lang.String r7 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            dalvik.system.DelegateLastClassLoader r7 = defpackage.hz.a(r7, r8)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            goto L98
        L8a:
            com.google.android.gms.dynamite.zzc r7 = new com.google.android.gms.dynamite.zzc     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            java.lang.String r8 = com.google.android.gms.dynamite.DynamiteModule.zzc     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
        L98:
            zzd(r7)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            r0.set(r2, r7)     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            com.google.android.gms.dynamite.DynamiteModule.zzb = r5     // Catch: java.lang.Throwable -> L36 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> La6
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            return r6
        La3:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            return r6
        La6:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L36
            r0.set(r2, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L36
            goto Lb9
        Lb0:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L36
            r0.set(r2, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L36
        Lb9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            goto Lde
        Lbb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L4b java.lang.NoSuchFieldException -> Lbd java.lang.IllegalAccessException -> Lbf java.lang.ClassNotFoundException -> Lc1
        Lbd:
            r0 = move-exception
            goto Lc2
        Lbf:
            r0 = move-exception
            goto Lc2
        Lc1:
            r0 = move-exception
        Lc2:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r5.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r6 = "Failed to load module via V2: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4b
            r5.append(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L4b
            android.util.Log.w(r4, r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4b
        Lde:
            com.google.android.gms.dynamite.DynamiteModule.zzb = r0     // Catch: java.lang.Throwable -> L4b
        Le0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lec
            if (r0 == 0) goto L10d
            int r10 = zzb(r10, r11, r12, r3)     // Catch: java.lang.Throwable -> Lec com.google.android.gms.dynamite.DynamiteModule.LoadingException -> Lf0
            return r10
        Lec:
            r0 = move-exception
            r11 = r0
            goto L1db
        Lf0:
            r0 = move-exception
            r11 = r0
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lec
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lec
            r0.<init>()     // Catch: java.lang.Throwable -> Lec
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch: java.lang.Throwable -> Lec
            r0.append(r11)     // Catch: java.lang.Throwable -> Lec
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> Lec
            android.util.Log.w(r12, r11)     // Catch: java.lang.Throwable -> Lec
            return r3
        L10d:
            com.google.android.gms.dynamite.zzq r4 = zzg(r10)     // Catch: java.lang.Throwable -> Lec
            if (r4 != 0) goto L115
            goto L1cf
        L115:
            int r0 = r4.zze()     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            r1 = 3
            if (r0 < r1) goto L186
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            if (r0 == 0) goto L134
            android.database.Cursor r0 = r0.zza     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            if (r0 == 0) goto L134
            int r3 = r0.getInt(r3)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            goto L1cf
        L130:
            r0 = move-exception
            r11 = r0
            goto L1af
        L134:
            zh4 r5 = new zh4     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            r5.<init>(r10)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            java.lang.Object r0 = r0.get()     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            long r8 = r0.longValue()     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            r6 = r11
            r7 = r12
            d13 r11 = r4.zzk(r5, r6, r7, r8)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            java.lang.Object r11 = defpackage.zh4.d(r11)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            if (r11 == 0) goto L175
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L167 android.os.RemoteException -> L16a
            if (r12 != 0) goto L15a
            goto L175
        L15a:
            int r12 = r11.getInt(r3)     // Catch: java.lang.Throwable -> L167 android.os.RemoteException -> L16a
            if (r12 <= 0) goto L16d
            boolean r0 = zze(r11)     // Catch: java.lang.Throwable -> L167 android.os.RemoteException -> L16a
            if (r0 == 0) goto L16d
            goto L16e
        L167:
            r0 = move-exception
            r12 = r0
            goto L182
        L16a:
            r0 = move-exception
            r12 = r0
            goto L184
        L16d:
            r2 = r11
        L16e:
            if (r2 == 0) goto L173
            r2.close()     // Catch: java.lang.Throwable -> Lec
        L173:
            r3 = r12
            goto L1cf
        L175:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch: java.lang.Throwable -> L167 android.os.RemoteException -> L16a
            if (r11 == 0) goto L1cf
            r11.close()     // Catch: java.lang.Throwable -> Lec
            goto L1cf
        L182:
            r2 = r11
            goto L1d3
        L184:
            r2 = r11
            goto L1b0
        L186:
            r6 = r11
            r7 = r12
            r11 = 2
            if (r0 != r11) goto L19c
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r11, r12)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            zh4 r11 = new zh4     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            r11.<init>(r10)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            int r3 = r4.zzg(r11, r6, r7)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            goto L1cf
        L19c:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r11, r12)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            zh4 r11 = new zh4     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            r11.<init>(r10)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            int r3 = r4.zzf(r11, r6, r7)     // Catch: android.os.RemoteException -> L130 java.lang.Throwable -> L1d0
            goto L1cf
        L1ad:
            r12 = r11
            goto L1d3
        L1af:
            r12 = r11
        L1b0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L1d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d0
            r0.<init>()     // Catch: java.lang.Throwable -> L1d0
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d0
            r0.append(r12)     // Catch: java.lang.Throwable -> L1d0
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L1d0
            android.util.Log.w(r11, r12)     // Catch: java.lang.Throwable -> L1d0
            if (r2 == 0) goto L1cf
            r2.close()     // Catch: java.lang.Throwable -> Lec
        L1cf:
            return r3
        L1d0:
            r0 = move-exception
            r11 = r0
            goto L1ad
        L1d3:
            if (r2 == 0) goto L1d8
            r2.close()     // Catch: java.lang.Throwable -> Lec
        L1d8:
            throw r12     // Catch: java.lang.Throwable -> Lec
        L1d9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4b
            throw r11     // Catch: java.lang.Throwable -> Lec
        L1db:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
    }

    private static int zzb(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) {
            r1 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            java.lang.ThreadLocal r9 = com.google.android.gms.dynamite.DynamiteModule.zzh     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            java.lang.Long r9 = (java.lang.Long) r9     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            long r3 = r9.longValue()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            java.lang.String r9 = "api_force_staging"
            java.lang.String r0 = "api"
            r8 = 1
            if (r8 == r11) goto L19
            r9 = r0
        L19:
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            r11.<init>()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            java.lang.String r0 = "content"
            android.net.Uri$Builder r11 = r11.scheme(r0)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            java.lang.String r0 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r11 = r11.authority(r0)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            android.net.Uri$Builder r9 = r11.path(r9)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            android.net.Uri$Builder r9 = r9.appendPath(r10)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            java.lang.String r10 = "requestStartTime"
            java.lang.String r11 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            android.net.Uri r3 = r9.build()     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lbb java.lang.Exception -> Lbf
            if (r9 == 0) goto Lac
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            if (r10 == 0) goto Lac
            r10 = 0
            int r11 = r9.getInt(r10)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            if (r11 <= 0) goto L91
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r2 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            r0 = 2
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.dynamite.DynamiteModule.zzc = r0     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "loaderVersion"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 < 0) goto L73
            int r0 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L70
            com.google.android.gms.dynamite.DynamiteModule.zze = r0     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r0 = move-exception
            r10 = r0
            goto L8f
        L73:
            java.lang.String r0 = "disableStandaloneDynamiteLoader2"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 < 0) goto L86
            int r0 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L82
            goto L83
        L82:
            r8 = r10
        L83:
            com.google.android.gms.dynamite.DynamiteModule.zzd = r8     // Catch: java.lang.Throwable -> L70
            r10 = r8
        L86:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
            boolean r0 = zze(r9)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            if (r0 == 0) goto L91
            r9 = r1
            goto L91
        L8f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L70
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
        L91:
            if (r12 == 0) goto La6
            if (r10 != 0) goto L96
            goto La6
        L96:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11, r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
        L9e:
            r0 = move-exception
            r10 = r0
            goto La4
        La1:
            r0 = move-exception
            r10 = r0
            goto Lc3
        La4:
            r1 = r9
            goto Le3
        La6:
            if (r9 == 0) goto Lab
            r9.close()
        Lab:
            return r11
        Lac:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r11 = "Failed to retrieve remote module version."
            android.util.Log.w(r10, r11)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r10.<init>(r11, r1)     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
            throw r10     // Catch: java.lang.Throwable -> L9e java.lang.Exception -> La1
        Lbb:
            r0 = move-exception
            r9 = r0
            r10 = r9
            goto Le3
        Lbf:
            r0 = move-exception
            r9 = r0
            r10 = r9
            r9 = r1
        Lc3:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch: java.lang.Throwable -> L9e
            if (r11 == 0) goto Lc8
            throw r10     // Catch: java.lang.Throwable -> L9e
        Lc8:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = r10.getMessage()     // Catch: java.lang.Throwable -> L9e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r0.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "V2 version check failed: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L9e
            r0.append(r12)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L9e
            r11.<init>(r12, r10, r1)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        Le3:
            if (r1 == 0) goto Le8
            r1.close()
        Le8:
            throw r10
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context r2, java.lang.String r3) {
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "Selected local version of "
            java.lang.String r3 = r1.concat(r3)
            android.util.Log.i(r0, r3)
            com.google.android.gms.dynamite.DynamiteModule r3 = new com.google.android.gms.dynamite.DynamiteModule
            r3.<init>(r2)
            return r3
    }

    private static void zzd(java.lang.ClassLoader r3) {
            r0 = 0
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            java.lang.reflect.Constructor r3 = r3.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            java.lang.Object r3 = r3.newInstance(r0)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            if (r3 != 0) goto L15
            r1 = r0
            goto L31
        L15:
            java.lang.String r1 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r1 = r3.queryLocalInterface(r1)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            boolean r2 = r1 instanceof com.google.android.gms.dynamite.zzr     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            if (r2 == 0) goto L2c
            com.google.android.gms.dynamite.zzr r1 = (com.google.android.gms.dynamite.zzr) r1     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            goto L31
        L22:
            r3 = move-exception
            goto L34
        L24:
            r3 = move-exception
            goto L34
        L26:
            r3 = move-exception
            goto L34
        L28:
            r3 = move-exception
            goto L34
        L2a:
            r3 = move-exception
            goto L34
        L2c:
            com.google.android.gms.dynamite.zzr r1 = new com.google.android.gms.dynamite.zzr     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            r1.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
        L31:
            com.google.android.gms.dynamite.DynamiteModule.zzl = r1     // Catch: java.lang.NoSuchMethodException -> L22 java.lang.reflect.InvocationTargetException -> L24 java.lang.InstantiationException -> L26 java.lang.IllegalAccessException -> L28 java.lang.ClassNotFoundException -> L2a
            return
        L34:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r2 = "Failed to instantiate dynamite loader"
            r1.<init>(r2, r3, r0)
            throw r1
    }

    private static boolean zze(android.database.Cursor r2) {
            java.lang.ThreadLocal r0 = com.google.android.gms.dynamite.DynamiteModule.zzg
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0
            if (r0 == 0) goto L12
            android.database.Cursor r1 = r0.zza
            if (r1 != 0) goto L12
            r0.zza = r2
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    private static boolean zzf(android.content.Context r6) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 0
            boolean r1 = r0.equals(r1)
            r2 = 1
            if (r1 == 0) goto Lb
            return r2
        Lb:
            java.lang.Boolean r1 = com.google.android.gms.dynamite.DynamiteModule.zzf
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            return r2
        L14:
            java.lang.Boolean r0 = com.google.android.gms.dynamite.DynamiteModule.zzf
            java.lang.String r1 = "DynamiteModule"
            r3 = 0
            if (r0 != 0) goto L58
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r4, r3)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            r5 = 10000000(0x989680, float:1.4012985E-38)
            int r6 = r4.isGooglePlayServicesAvailable(r6, r5)
            if (r6 != 0) goto L3f
            if (r0 == 0) goto L3f
            java.lang.String r6 = "com.google.android.gms"
            java.lang.String r4 = r0.packageName
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L3f
            r3 = r2
        L3f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.dynamite.DynamiteModule.zzf = r6
            if (r3 == 0) goto L58
            android.content.pm.ApplicationInfo r6 = r0.applicationInfo
            if (r6 == 0) goto L58
            int r6 = r6.flags
            r6 = r6 & 129(0x81, float:1.81E-43)
            if (r6 != 0) goto L58
            java.lang.String r6 = "Non-system-image GmsCore APK, forcing V1"
            android.util.Log.i(r1, r6)
            com.google.android.gms.dynamite.DynamiteModule.zzd = r2
        L58:
            if (r3 != 0) goto L5f
            java.lang.String r6 = "Invalid GmsCore APK, remote loading disabled."
            android.util.Log.e(r1, r6)
        L5f:
            return r3
    }

    private static com.google.android.gms.dynamite.zzq zzg(android.content.Context r5) {
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)
            com.google.android.gms.dynamite.zzq r2 = com.google.android.gms.dynamite.DynamiteModule.zzk     // Catch: java.lang.Throwable -> Lb
            if (r2 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r5 = move-exception
            goto L5a
        Ld:
            r2 = 0
            java.lang.String r3 = "com.google.android.gms"
            r4 = 3
            android.content.Context r5 = r5.createPackageContext(r3, r4)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            java.lang.String r3 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r3)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            if (r5 != 0) goto L29
            r3 = r2
            goto L3d
        L29:
            java.lang.String r3 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r3 = r5.queryLocalInterface(r3)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            boolean r4 = r3 instanceof com.google.android.gms.dynamite.zzq     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            if (r4 == 0) goto L38
            com.google.android.gms.dynamite.zzq r3 = (com.google.android.gms.dynamite.zzq) r3     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            goto L3d
        L36:
            r5 = move-exception
            goto L43
        L38:
            com.google.android.gms.dynamite.zzq r3 = new com.google.android.gms.dynamite.zzq     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            r3.<init>(r5)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
        L3d:
            if (r3 == 0) goto L58
            com.google.android.gms.dynamite.DynamiteModule.zzk = r3     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r3
        L43:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lb
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> Lb
            android.util.Log.e(r3, r5)     // Catch: java.lang.Throwable -> Lb
        L58:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r2
        L5a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r5
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.content.Context getModuleContext() {
            r0 = this;
            android.content.Context r0 = r0.zzj
            return r0
    }

    public android.os.IBinder instantiate(java.lang.String r3) {
            r2 = this;
            android.content.Context r2 = r2.zzj     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.IllegalAccessException -> L11 java.lang.InstantiationException -> L13 java.lang.ClassNotFoundException -> L15
            return r2
        L11:
            r2 = move-exception
            goto L16
        L13:
            r2 = move-exception
            goto L16
        L15:
            r2 = move-exception
        L16:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "Failed to instantiate module class: "
            java.lang.String r3 = r1.concat(r3)
            r1 = 0
            r0.<init>(r3, r2, r1)
            throw r0
    }
}
