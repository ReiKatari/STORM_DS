package com.google.android.gms.common.internal;

import android.os.IInterface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private static final com.google.android.gms.common.Feature[] zze = null;
    private volatile java.lang.String zzA;
    private com.google.android.gms.common.ConnectionResult zzB;
    private boolean zzC;
    private volatile com.google.android.gms.common.internal.zzk zzD;
    com.google.android.gms.common.internal.zzv zza;
    final android.os.Handler zzb;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzc;
    protected java.util.concurrent.atomic.AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile java.lang.String zzk;
    private final android.content.Context zzl;
    private final android.os.Looper zzm;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzn;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzo;
    private final java.lang.Object zzp;
    private final java.lang.Object zzq;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzr;
    private android.os.IInterface zzs;
    private final java.util.ArrayList zzt;
    private com.google.android.gms.common.internal.zze zzu;
    private int zzv;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzw;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzx;
    private final int zzy;
    private final java.lang.String zzz;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface BaseConnectionCallbacks {
        public static final int CAUSE_DEAD_OBJECT_EXCEPTION = 3;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(android.os.Bundle r1);

        void onConnectionSuspended(int r1);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult r1);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult r1);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

        public LegacyClientCallbackAdapter(com.google.android.gms.common.internal.BaseGmsClient r1) {
                r0 = this;
                r0.zza = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult r3) {
                r2 = this;
                boolean r0 = r3.isSuccess()
                com.google.android.gms.common.internal.BaseGmsClient r1 = r2.zza
                if (r0 == 0) goto L11
                r2 = 0
                java.util.Set r3 = r1.getScopes()
                r1.getRemoteService(r2, r3)
                return
            L11:
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r1)
                if (r0 == 0) goto L20
                com.google.android.gms.common.internal.BaseGmsClient r2 = r2.zza
                com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r2 = com.google.android.gms.common.internal.BaseGmsClient.zzc(r2)
                r2.onConnectionFailed(r3)
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    static {
            r0 = 0
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[r0]
            com.google.android.gms.common.internal.BaseGmsClient.zze = r0
            java.lang.String r0 = "service_esmobile"
            java.lang.String r1 = "service_googleme"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            com.google.android.gms.common.internal.BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = r0
            return
    }

    public BaseGmsClient(android.content.Context r4, android.os.Handler r5, com.google.android.gms.common.internal.GmsClientSupervisor r6, com.google.android.gms.common.GoogleApiAvailabilityLight r7, int r8, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r9, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r10) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.zzk = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.zzp = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r3.zzq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.zzt = r1
            r1 = 1
            r3.zzv = r1
            r3.zzB = r0
            r1 = 0
            r3.zzC = r1
            r3.zzD = r0
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>(r1)
            r3.zzd = r2
            java.lang.String r1 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r1)
            r3.zzl = r4
            java.lang.String r4 = "Handler must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r4)
            r3.zzb = r5
            android.os.Looper r4 = r5.getLooper()
            r3.zzm = r4
            java.lang.String r4 = "Supervisor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r4)
            r3.zzn = r6
            java.lang.String r4 = "API availability must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r4)
            r3.zzo = r7
            r3.zzy = r8
            r3.zzw = r9
            r3.zzx = r10
            r3.zzz = r0
            return
    }

    public BaseGmsClient(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r13, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r14, java.lang.String r15) {
            r9 = this;
            com.google.android.gms.common.internal.GmsClientSupervisor r3 = com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(r10)
            com.google.android.gms.common.GoogleApiAvailabilityLight r4 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public BaseGmsClient(android.content.Context r3, android.os.Looper r4, com.google.android.gms.common.internal.GmsClientSupervisor r5, com.google.android.gms.common.GoogleApiAvailabilityLight r6, int r7, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks r8, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener r9, java.lang.String r10) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzk = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzp = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.zzq = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.zzt = r1
            r1 = 1
            r2.zzv = r1
            r2.zzB = r0
            r1 = 0
            r2.zzC = r1
            r2.zzD = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.zzd = r0
            java.lang.String r0 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r2.zzl = r3
            java.lang.String r3 = "Looper must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r3)
            r2.zzm = r4
            java.lang.String r3 = "Supervisor must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r3)
            r2.zzn = r5
            java.lang.String r3 = "API availability must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r3)
            r2.zzo = r6
            com.google.android.gms.common.internal.zzb r3 = new com.google.android.gms.common.internal.zzb
            r3.<init>(r2, r4)
            r2.zzb = r3
            r2.zzy = r7
            r2.zzw = r8
            r2.zzx = r9
            r2.zzz = r10
            return
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.ConnectionResult r0 = r0.zzB
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzb(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r0.zzw
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzc(com.google.android.gms.common.internal.BaseGmsClient r0) {
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r0 = r0.zzx
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzd(com.google.android.gms.common.internal.BaseGmsClient r0) {
            java.lang.Object r0 = r0.zzq
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.ArrayList zzf(com.google.android.gms.common.internal.BaseGmsClient r0) {
            java.util.ArrayList r0 = r0.zzt
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzg(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.ConnectionResult r1) {
            r0.zzB = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zzh(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.internal.IGmsServiceBroker r1) {
            r0.zzr = r1
            return
    }

    public static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.common.internal.BaseGmsClient r0, int r1, android.os.IInterface r2) {
            r2 = 0
            r0.zzp(r1, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.common.internal.BaseGmsClient r0, com.google.android.gms.common.internal.zzk r1) {
            r0.zzD = r1
            boolean r0 = r0.usesClientTelemetry()
            if (r0 == 0) goto L19
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r1.zzd
            com.google.android.gms.common.internal.RootTelemetryConfigManager r1 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            if (r0 != 0) goto L12
            r0 = 0
            goto L16
        L12:
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.zza()
        L16:
            r1.zza(r0)
        L19:
            return
    }

    public static /* bridge */ /* synthetic */ void zzk(com.google.android.gms.common.internal.BaseGmsClient r2, int r3) {
            java.lang.Object r3 = r2.zzp
            monitor-enter(r3)
            int r0 = r2.zzv     // Catch: java.lang.Throwable -> L21
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 3
            if (r0 != r3) goto Le
            r3 = 1
            r2.zzC = r3
            r3 = 5
            goto Lf
        Le:
            r3 = 4
        Lf:
            android.os.Handler r0 = r2.zzb
            java.util.concurrent.atomic.AtomicInteger r2 = r2.zzd
            int r2 = r2.get()
            r1 = 16
            android.os.Message r2 = r0.obtainMessage(r3, r2, r1)
            r0.sendMessage(r2)
            return
        L21:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r2
    }

    public static /* bridge */ /* synthetic */ boolean zzm(com.google.android.gms.common.internal.BaseGmsClient r0) {
            boolean r0 = r0.zzC
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zzn(com.google.android.gms.common.internal.BaseGmsClient r2, int r3, int r4, android.os.IInterface r5) {
            java.lang.Object r0 = r2.zzp
            monitor-enter(r0)
            int r1 = r2.zzv     // Catch: java.lang.Throwable -> La
            if (r1 == r3) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r2 = 0
            return r2
        La:
            r2 = move-exception
            goto L12
        Lc:
            r2.zzp(r4, r5)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r2 = 1
            return r2
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.BaseGmsClient r2) {
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L25
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L25
            r2 = 1
            return r2
        L25:
            return r1
    }

    private final void zzp(int r18, android.os.IInterface r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "unable to connect to service: "
            java.lang.String r4 = "Calling connect() while still connected, missing disconnect() for "
            r5 = 0
            r6 = 1
            r7 = 4
            if (r1 == r7) goto L11
            r8 = r5
            goto L12
        L11:
            r8 = r6
        L12:
            if (r2 != 0) goto L16
            r9 = r5
            goto L17
        L16:
            r9 = r6
        L17:
            if (r8 != r9) goto L1a
            r5 = r6
        L1a:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r5)
            java.lang.Object r5 = r0.zzp
            monitor-enter(r5)
            r0.zzv = r1     // Catch: java.lang.Throwable -> L39
            r0.zzs = r2     // Catch: java.lang.Throwable -> L39
            r8 = 0
            if (r1 == r6) goto L150
            r6 = 2
            r9 = 3
            if (r1 == r6) goto L3c
            if (r1 == r9) goto L3c
            if (r1 == r7) goto L31
            goto L176
        L31:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L39
            r0.onConnectedLocked(r2)     // Catch: java.lang.Throwable -> L39
            goto L176
        L39:
            r0 = move-exception
            goto L178
        L3c:
            com.google.android.gms.common.internal.zze r14 = r0.zzu     // Catch: java.lang.Throwable -> L39
            if (r14 == 0) goto L8a
            com.google.android.gms.common.internal.zzv r1 = r0.zza     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L8a
            java.lang.String r2 = "GmsClient"
            java.lang.String r6 = r1.zzb()     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r1.zza()     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L39
            r7.append(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = " on "
            r7.append(r4)     // Catch: java.lang.Throwable -> L39
            r7.append(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L39
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.GmsClientSupervisor r10 = r0.zzn     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r1 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r1.zzb()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r1 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r12 = r1.zza()     // Catch: java.lang.Throwable -> L39
            java.lang.String r15 = r0.zze()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r1 = r0.zza     // Catch: java.lang.Throwable -> L39
            boolean r16 = r1.zzc()     // Catch: java.lang.Throwable -> L39
            r13 = 4225(0x1081, float:5.92E-42)
            r10.zzb(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.atomic.AtomicInteger r1 = r0.zzd     // Catch: java.lang.Throwable -> L39
            r1.incrementAndGet()     // Catch: java.lang.Throwable -> L39
        L8a:
            com.google.android.gms.common.internal.zze r1 = new com.google.android.gms.common.internal.zze     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.atomic.AtomicInteger r2 = r0.zzd     // Catch: java.lang.Throwable -> L39
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L39
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L39
            r0.zzu = r1     // Catch: java.lang.Throwable -> L39
            int r2 = r0.zzv     // Catch: java.lang.Throwable -> L39
            if (r2 != r9) goto Lb7
            java.lang.String r2 = r0.getLocalStartServiceAction()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto Lb7
            com.google.android.gms.common.internal.zzv r9 = new com.google.android.gms.common.internal.zzv     // Catch: java.lang.Throwable -> L39
            android.content.Context r2 = r0.getContext()     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r2.getPackageName()     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r0.getLocalStartServiceAction()     // Catch: java.lang.Throwable -> L39
            r13 = 4225(0x1081, float:5.92E-42)
            r14 = 0
            r12 = 1
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L39
            goto Lcb
        Lb7:
            com.google.android.gms.common.internal.zzv r9 = new com.google.android.gms.common.internal.zzv     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r0.getStartServicePackage()     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r0.getStartServiceAction()     // Catch: java.lang.Throwable -> L39
            boolean r14 = r0.getUseDynamicLookup()     // Catch: java.lang.Throwable -> L39
            r12 = 0
            r13 = 4225(0x1081, float:5.92E-42)
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L39
        Lcb:
            r0.zza = r9     // Catch: java.lang.Throwable -> L39
            boolean r2 = r9.zzc()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto Lf3
            int r2 = r0.getMinApkVersion()     // Catch: java.lang.Throwable -> L39
            r4 = 17895000(0x1110e58, float:2.6642585E-38)
            if (r2 < r4) goto Ldd
            goto Lf3
        Ldd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r0 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r0.zzb()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L39
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        Lf3:
            com.google.android.gms.common.internal.GmsClientSupervisor r2 = r0.zzn     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r4 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r4.zzb()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r6 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = r6.zza()     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = r0.zze()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r9 = r0.zza     // Catch: java.lang.Throwable -> L39
            boolean r9 = r9.zzc()     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.Executor r10 = r0.getBindServiceExecutor()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzo r11 = new com.google.android.gms.common.internal.zzo     // Catch: java.lang.Throwable -> L39
            r12 = 4225(0x1081, float:5.92E-42)
            r11.<init>(r4, r6, r12, r9)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r2.zzc(r11, r1, r7, r10)     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L176
            java.lang.String r1 = "GmsClient"
            com.google.android.gms.common.internal.zzv r2 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.zzb()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r4 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r4.zza()     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L39
            r6.append(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = " on "
            r6.append(r2)     // Catch: java.lang.Throwable -> L39
            r6.append(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L39
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.atomic.AtomicInteger r1 = r0.zzd     // Catch: java.lang.Throwable -> L39
            int r1 = r1.get()     // Catch: java.lang.Throwable -> L39
            r2 = 16
            r0.zzl(r2, r8, r1)     // Catch: java.lang.Throwable -> L39
            goto L176
        L150:
            com.google.android.gms.common.internal.zze r13 = r0.zzu     // Catch: java.lang.Throwable -> L39
            if (r13 == 0) goto L176
            com.google.android.gms.common.internal.GmsClientSupervisor r9 = r0.zzn     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r1 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r10 = r1.zzb()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r1 = r0.zza     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r1.zza()     // Catch: java.lang.Throwable -> L39
            java.lang.String r14 = r0.zze()     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.common.internal.zzv r1 = r0.zza     // Catch: java.lang.Throwable -> L39
            boolean r15 = r1.zzc()     // Catch: java.lang.Throwable -> L39
            r12 = 4225(0x1081, float:5.92E-42)
            r9.zzb(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L39
            r0.zzu = r8     // Catch: java.lang.Throwable -> L39
        L176:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
            return
        L178:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L39
            throw r0
    }

    public void checkAvailabilityAndConnect() {
            r3 = this;
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r3.zzo
            android.content.Context r1 = r3.zzl
            int r2 = r3.getMinApkVersion()
            int r0 = r0.isGooglePlayServicesAvailable(r1, r2)
            if (r0 == 0) goto L1c
            r1 = 1
            r2 = 0
            r3.zzp(r1, r2)
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r1 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r1.<init>(r3)
            r3.triggerNotAvailable(r1, r0, r2)
            return
        L1c:
            com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter r0 = new com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter
            r0.<init>(r3)
            r3.connect(r0)
            return
    }

    public final void checkConnected() {
            r0 = this;
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "Not connected. Call connect() and wait for onConnected() to be called."
            defpackage.i.m(r0)
            return
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r2) {
            r1 = this;
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zzc = r2
            r2 = 2
            r0 = 0
            r1.zzp(r2, r0)
            return
    }

    public abstract T createServiceInterface(android.os.IBinder r1);

    public void disconnect() {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzd
            r0.incrementAndGet()
            java.util.ArrayList r0 = r4.zzt
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.zzt     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1f
            r2 = 0
        Lf:
            java.util.ArrayList r3 = r4.zzt
            if (r2 >= r1) goto L21
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.internal.zzc r3 = (com.google.android.gms.common.internal.zzc) r3     // Catch: java.lang.Throwable -> L1f
            r3.zzf()     // Catch: java.lang.Throwable -> L1f
            int r2 = r2 + 1
            goto Lf
        L1f:
            r4 = move-exception
            goto L34
        L21:
            r3.clear()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r4.zzq
            monitor-enter(r1)
            r0 = 0
            r4.zzr = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            r1 = 1
            r4.zzp(r1, r0)
            return
        L31:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r4
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }

    public void disconnect(java.lang.String r1) {
            r0 = this;
            r0.zzk = r1
            r0.disconnect()
            return
    }

    public void dump(java.lang.String r10, java.io.FileDescriptor r11, java.io.PrintWriter r12, java.lang.String[] r13) {
            r9 = this;
            java.lang.Object r11 = r9.zzp
            monitor-enter(r11)
            int r13 = r9.zzv     // Catch: java.lang.Throwable -> L16f
            android.os.IInterface r0 = r9.zzs     // Catch: java.lang.Throwable -> L16f
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L16f
            java.lang.Object r1 = r9.zzq
            monitor-enter(r1)
            com.google.android.gms.common.internal.IGmsServiceBroker r11 = r9.zzr     // Catch: java.lang.Throwable -> L16c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16c
            java.io.PrintWriter r1 = r12.append(r10)
            java.lang.String r2 = "mConnectState="
            r1.append(r2)
            r1 = 3
            r2 = 2
            r3 = 1
            if (r13 == r3) goto L44
            if (r13 == r2) goto L3e
            if (r13 == r1) goto L38
            r4 = 4
            if (r13 == r4) goto L32
            r4 = 5
            if (r13 == r4) goto L2c
            java.lang.String r13 = "UNKNOWN"
            r12.print(r13)
            goto L49
        L2c:
            java.lang.String r13 = "DISCONNECTING"
            r12.print(r13)
            goto L49
        L32:
            java.lang.String r13 = "CONNECTED"
            r12.print(r13)
            goto L49
        L38:
            java.lang.String r13 = "LOCAL_CONNECTING"
            r12.print(r13)
            goto L49
        L3e:
            java.lang.String r13 = "REMOTE_CONNECTING"
            r12.print(r13)
            goto L49
        L44:
            java.lang.String r13 = "DISCONNECTED"
            r12.print(r13)
        L49:
            java.lang.String r13 = " mService="
            r12.append(r13)
            if (r0 != 0) goto L56
            java.lang.String r13 = "null"
            r12.append(r13)
            goto L73
        L56:
            java.lang.String r13 = r9.getServiceDescriptor()
            java.io.PrintWriter r13 = r12.append(r13)
            java.lang.String r4 = "@"
            java.io.PrintWriter r13 = r13.append(r4)
            android.os.IBinder r0 = r0.asBinder()
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r13.append(r0)
        L73:
            java.lang.String r13 = " mServiceBroker="
            r12.append(r13)
            if (r11 != 0) goto L80
            java.lang.String r11 = "null"
            r12.println(r11)
            goto L95
        L80:
            java.lang.String r13 = "IGmsServiceBroker@"
            java.io.PrintWriter r13 = r12.append(r13)
            android.os.IBinder r11 = r11.asBinder()
            int r11 = java.lang.System.identityHashCode(r11)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r13.println(r11)
        L95:
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r13 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r0 = java.util.Locale.US
            r11.<init>(r13, r0)
            long r4 = r9.zzh
            r6 = 0
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 <= 0) goto Ld2
            java.io.PrintWriter r13 = r12.append(r10)
            java.lang.String r0 = "lastConnectedTime="
            java.io.PrintWriter r13 = r13.append(r0)
            long r4 = r9.zzh
            java.util.Date r0 = new java.util.Date
            r0.<init>(r4)
            java.lang.String r0 = r11.format(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r4 = " "
            r8.append(r4)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r13.println(r0)
        Ld2:
            long r4 = r9.zzg
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 <= 0) goto L12a
            java.io.PrintWriter r13 = r12.append(r10)
            java.lang.String r0 = "lastSuspendedCause="
            r13.append(r0)
            int r13 = r9.zzf
            if (r13 == r3) goto Lfd
            if (r13 == r2) goto Lf7
            if (r13 == r1) goto Lf1
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12.append(r13)
            goto L102
        Lf1:
            java.lang.String r13 = "CAUSE_DEAD_OBJECT_EXCEPTION"
            r12.append(r13)
            goto L102
        Lf7:
            java.lang.String r13 = "CAUSE_NETWORK_LOST"
            r12.append(r13)
            goto L102
        Lfd:
            java.lang.String r13 = "CAUSE_SERVICE_DISCONNECTED"
            r12.append(r13)
        L102:
            java.lang.String r13 = " lastSuspendedTime="
            java.io.PrintWriter r13 = r12.append(r13)
            long r0 = r9.zzg
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r2 = r11.format(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r13.println(r0)
        L12a:
            long r0 = r9.zzj
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 <= 0) goto L16b
            java.io.PrintWriter r10 = r12.append(r10)
            java.lang.String r13 = "lastFailedStatus="
            java.io.PrintWriter r10 = r10.append(r13)
            int r13 = r9.zzi
            java.lang.String r13 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r13)
            r10.append(r13)
            java.lang.String r10 = " lastFailedTime="
            java.io.PrintWriter r10 = r12.append(r10)
            long r12 = r9.zzj
            java.util.Date r9 = new java.util.Date
            r9.<init>(r12)
            java.lang.String r9 = r11.format(r9)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r12)
            java.lang.String r12 = " "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.println(r9)
        L16b:
            return
        L16c:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16c
            throw r9
        L16f:
            r9 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L16f
            throw r9
    }

    public boolean enableLocalFallback() {
            r0 = this;
            r0 = 0
            return r0
    }

    public android.accounts.Account getAccount() {
            r0 = this;
            r0 = 0
            return r0
    }

    public com.google.android.gms.common.Feature[] getApiFeatures() {
            r0 = this;
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.common.internal.BaseGmsClient.zze
            return r0
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
            r0 = this;
            com.google.android.gms.common.internal.zzk r0 = r0.zzD
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.Feature[] r0 = r0.zzb
            return r0
    }

    public java.util.concurrent.Executor getBindServiceExecutor() {
            r0 = this;
            r0 = 0
            return r0
    }

    public android.os.Bundle getConnectionHint() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final android.content.Context getContext() {
            r0 = this;
            android.content.Context r0 = r0.zzl
            return r0
    }

    public java.lang.String getEndpointPackageName() {
            r1 = this;
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto Lf
            com.google.android.gms.common.internal.zzv r1 = r1.zza
            if (r1 == 0) goto Lf
            java.lang.String r1 = r1.zza()
            return r1
        Lf:
            java.lang.String r1 = "Failed to connect when checking package"
            defpackage.u34.j(r1)
            r1 = 0
            return r1
    }

    public int getGCoreServiceId() {
            r0 = this;
            int r0 = r0.zzy
            return r0
    }

    public android.os.Bundle getGetServiceRequestExtraArgs() {
            r0 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    public java.lang.String getLastDisconnectMessage() {
            r0 = this;
            java.lang.String r0 = r0.zzk
            return r0
    }

    public java.lang.String getLocalStartServiceAction() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final android.os.Looper getLooper() {
            r0 = this;
            android.os.Looper r0 = r0.zzm
            return r0
    }

    public int getMinApkVersion() {
            r0 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            return r0
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor r19, java.util.Set<com.google.android.gms.common.api.Scope> r20) {
            r18 = this;
            r1 = r18
            r0 = r20
            android.os.Bundle r2 = r1.getGetServiceRequestExtraArgs()
            com.google.android.gms.common.internal.GetServiceRequest r3 = new com.google.android.gms.common.internal.GetServiceRequest
            java.lang.String r4 = r1.zzA
            int r6 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            com.google.android.gms.common.api.Scope[] r9 = com.google.android.gms.common.internal.GetServiceRequest.zza
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            int r5 = r1.zzy
            com.google.android.gms.common.Feature[] r12 = com.google.android.gms.common.internal.GetServiceRequest.zzb
            r15 = 0
            r16 = 0
            r17 = r4
            r4 = 6
            r7 = 0
            r8 = 0
            r11 = 0
            r14 = 1
            r13 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            android.content.Context r4 = r1.zzl
            java.lang.String r4 = r4.getPackageName()
            r3.zzf = r4
            r3.zzi = r2
            if (r0 == 0) goto L3e
            r2 = 0
            com.google.android.gms.common.api.Scope[] r2 = new com.google.android.gms.common.api.Scope[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.google.android.gms.common.api.Scope[] r0 = (com.google.android.gms.common.api.Scope[]) r0
            r3.zzh = r0
        L3e:
            boolean r0 = r1.requiresSignIn()
            if (r0 == 0) goto L5e
            android.accounts.Account r0 = r1.getAccount()
            if (r0 != 0) goto L53
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r2 = "<<default account>>"
            java.lang.String r4 = "com.google"
            r0.<init>(r2, r4)
        L53:
            r3.zzj = r0
            if (r19 == 0) goto L6a
            android.os.IBinder r0 = r19.asBinder()
            r3.zzg = r0
            goto L6a
        L5e:
            boolean r0 = r1.requiresAccount()
            if (r0 == 0) goto L6a
            android.accounts.Account r0 = r1.getAccount()
            r3.zzj = r0
        L6a:
            com.google.android.gms.common.Feature[] r0 = com.google.android.gms.common.internal.BaseGmsClient.zze
            r3.zzk = r0
            com.google.android.gms.common.Feature[] r0 = r1.getApiFeatures()
            r3.zzl = r0
            boolean r0 = r1.usesClientTelemetry()
            if (r0 == 0) goto L7d
            r0 = 1
            r3.zzo = r0
        L7d:
            java.lang.Object r2 = r1.zzq     // Catch: java.lang.RuntimeException -> La0 android.os.RemoteException -> La2 android.os.DeadObjectException -> La4 java.lang.SecurityException -> Lba
            monitor-enter(r2)     // Catch: java.lang.RuntimeException -> La0 android.os.RemoteException -> La2 android.os.DeadObjectException -> La4 java.lang.SecurityException -> Lba
            com.google.android.gms.common.internal.IGmsServiceBroker r0 = r1.zzr     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L95
            com.google.android.gms.common.internal.zzd r4 = new com.google.android.gms.common.internal.zzd     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.atomic.AtomicInteger r5 = r1.zzd     // Catch: java.lang.Throwable -> L93
            int r5 = r5.get()     // Catch: java.lang.Throwable -> L93
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L93
            r0.getService(r4, r3)     // Catch: java.lang.Throwable -> L93
            goto L9c
        L93:
            r0 = move-exception
            goto L9e
        L95:
            java.lang.String r0 = "GmsClient"
            java.lang.String r3 = "mServiceBroker is null, client disconnected"
            android.util.Log.w(r0, r3)     // Catch: java.lang.Throwable -> L93
        L9c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L93
            return
        L9e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.RuntimeException -> La0 android.os.RemoteException -> La2 android.os.DeadObjectException -> La4 java.lang.SecurityException -> Lba
        La0:
            r0 = move-exception
            goto La6
        La2:
            r0 = move-exception
            goto La6
        La4:
            r0 = move-exception
            goto Lbc
        La6:
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r2, r3, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zzd
            int r0 = r0.get()
            r2 = 8
            r3 = 0
            r1.onPostInitHandler(r2, r3, r3, r0)
            return
        Lba:
            r0 = move-exception
            throw r0
        Lbc:
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = "IGmsServiceBroker.getService failed"
            android.util.Log.w(r2, r3, r0)
            r0 = 3
            r1.triggerConnectionSuspended(r0)
            return
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
            r0 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    public final T getService() {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r1 = r3.zzv     // Catch: java.lang.Throwable -> L14
            r2 = 5
            if (r1 == r2) goto L16
            r3.checkConnected()     // Catch: java.lang.Throwable -> L14
            android.os.IInterface r3 = r3.zzs     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "Client is connected but service is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r3
        L14:
            r3 = move-exception
            goto L1c
        L16:
            android.os.DeadObjectException r3 = new android.os.DeadObjectException     // Catch: java.lang.Throwable -> L14
            r3.<init>()     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    public android.os.IBinder getServiceBrokerBinder() {
            r1 = this;
            java.lang.Object r0 = r1.zzq
            monitor-enter(r0)
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = r1.zzr     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r1 = 0
            return r1
        La:
            r1 = move-exception
            goto L12
        Lc:
            android.os.IBinder r1 = r1.asBinder()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return r1
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public abstract java.lang.String getServiceDescriptor();

    public android.content.Intent getSignInIntent() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Not a sign in API"
            r1.<init>(r0)
            throw r1
    }

    public abstract java.lang.String getStartServiceAction();

    public java.lang.String getStartServicePackage() {
            r0 = this;
            java.lang.String r0 = "com.google.android.gms"
            return r0
    }

    public com.google.android.gms.common.internal.ConnectionTelemetryConfiguration getTelemetryConfiguration() {
            r0 = this;
            com.google.android.gms.common.internal.zzk r0 = r0.zzD
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r0 = r0.zzd
            return r0
    }

    public boolean getUseDynamicLookup() {
            r1 = this;
            int r1 = r1.getMinApkVersion()
            r0 = 211700000(0xc9e4920, float:2.4387765E-31)
            if (r1 < r0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean hasConnectionInfo() {
            r0 = this;
            com.google.android.gms.common.internal.zzk r0 = r0.zzD
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public boolean isConnected() {
            r2 = this;
            java.lang.Object r0 = r2.zzp
            monitor-enter(r0)
            int r2 = r2.zzv     // Catch: java.lang.Throwable -> Ld
            r1 = 4
            if (r2 != r1) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public boolean isConnecting() {
            r3 = this;
            java.lang.Object r0 = r3.zzp
            monitor-enter(r0)
            int r3 = r3.zzv     // Catch: java.lang.Throwable -> L10
            r1 = 2
            r2 = 1
            if (r3 == r1) goto Le
            r1 = 3
            if (r3 != r1) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public void onConnectedLocked(T r3) {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzh = r0
            return
    }

    public void onConnectionFailed(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            int r3 = r3.getErrorCode()
            r2.zzi = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzj = r0
            return
    }

    public void onConnectionSuspended(int r3) {
            r2 = this;
            r2.zzf = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.zzg = r0
            return
    }

    public void onPostInitHandler(int r2, android.os.IBinder r3, android.os.Bundle r4, int r5) {
            r1 = this;
            com.google.android.gms.common.internal.zzf r0 = new com.google.android.gms.common.internal.zzf
            r0.<init>(r1, r2, r3, r4)
            android.os.Handler r2 = r1.zzb
            r3 = 1
            r4 = -1
            android.os.Message r2 = r2.obtainMessage(r3, r5, r4, r0)
            android.os.Handler r1 = r1.zzb
            r1.sendMessage(r2)
            return
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1) {
            r0 = this;
            r1.onSignOutComplete()
            return
    }

    public boolean providesSignIn() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean requiresAccount() {
            r0 = this;
            r0 = 0
            return r0
    }

    public boolean requiresGooglePlayServices() {
            r0 = this;
            r0 = 1
            return r0
    }

    public boolean requiresSignIn() {
            r0 = this;
            r0 = 0
            return r0
    }

    public void setAttributionTag(java.lang.String r1) {
            r0 = this;
            r0.zzA = r1
            return
    }

    public void triggerConnectionSuspended(int r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzd
            int r0 = r0.get()
            android.os.Handler r1 = r3.zzb
            r2 = 6
            android.os.Message r4 = r1.obtainMessage(r2, r0, r4)
            android.os.Handler r3 = r3.zzb
            r3.sendMessage(r4)
            return
    }

    public void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r3, int r4, android.app.PendingIntent r5) {
            r2 = this;
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            r2.zzc = r3
            java.util.concurrent.atomic.AtomicInteger r3 = r2.zzd
            int r3 = r3.get()
            android.os.Handler r0 = r2.zzb
            r1 = 3
            android.os.Message r3 = r0.obtainMessage(r1, r3, r4, r5)
            android.os.Handler r2 = r2.zzb
            r2.sendMessage(r3)
            return
    }

    public boolean usesClientTelemetry() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzz
            if (r0 != 0) goto Lf
            android.content.Context r1 = r1.zzl
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            return r1
        Lf:
            return r0
    }

    public final void zzl(int r3, android.os.Bundle r4, int r5) {
            r2 = this;
            com.google.android.gms.common.internal.zzg r4 = new com.google.android.gms.common.internal.zzg
            r0 = 0
            r4.<init>(r2, r3, r0)
            android.os.Handler r3 = r2.zzb
            r0 = 7
            r1 = -1
            android.os.Message r3 = r3.obtainMessage(r0, r5, r1, r4)
            android.os.Handler r2 = r2.zzb
            r2.sendMessage(r3)
            return
    }
}
