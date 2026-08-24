package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class GoogleApiManager implements android.os.Handler.Callback {
    public static final com.google.android.gms.common.api.Status zaa = null;
    private static final com.google.android.gms.common.api.Status zab = null;
    private static final java.lang.Object zac = null;
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private long zae;
    private boolean zaf;
    private com.google.android.gms.common.internal.TelemetryData zag;
    private com.google.android.gms.common.internal.TelemetryLoggingClient zah;
    private final android.content.Context zai;
    private final com.google.android.gms.common.GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;
    private final java.util.concurrent.atomic.AtomicInteger zal;
    private final java.util.concurrent.atomic.AtomicInteger zam;
    private final java.util.Map zan;
    private com.google.android.gms.common.api.internal.zaae zao;
    private final java.util.Set zap;
    private final java.util.Set zaq;
    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.os.Handler zar;
    private volatile boolean zas;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 4
            java.lang.String r2 = "Sign-out occurred while this API call was in progress."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zaa = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "The user must be signed in to make this API call."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zab = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.api.internal.GoogleApiManager.zac = r0
            return
    }

    private GoogleApiManager(android.content.Context r6, android.os.Looper r7, com.google.android.gms.common.GoogleApiAvailability r8) {
            r5 = this;
            r5.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r5.zae = r0
            r0 = 0
            r5.zaf = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            r1.<init>(r2)
            r5.zal = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r5.zam = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r3 = 5
            r4 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r3, r4, r2)
            r5.zan = r1
            r1 = 0
            r5.zao = r1
            zu r1 = new zu
            r1.<init>(r0)
            r5.zap = r1
            zu r1 = new zu
            r1.<init>(r0)
            r5.zaq = r1
            r5.zas = r2
            r5.zai = r6
            b08 r1 = new b08
            r1.<init>(r7, r5)
            r5.zar = r1
            r5.zaj = r8
            com.google.android.gms.common.internal.zal r7 = new com.google.android.gms.common.internal.zal
            r7.<init>(r8)
            r5.zak = r7
            boolean r6 = com.google.android.gms.common.util.DeviceProperties.isAuto(r6)
            if (r6 == 0) goto L50
            r5.zas = r0
        L50:
            r5 = 6
            android.os.Message r5 = r1.obtainMessage(r5)
            r1.sendMessage(r5)
            return
    }

    public static void reportSignOut() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            java.util.concurrent.atomic.AtomicInteger r2 = r1.zam     // Catch: java.lang.Throwable -> L18
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> L18
            android.os.Handler r1 = r1.zar     // Catch: java.lang.Throwable -> L18
            r2 = 10
            android.os.Message r2 = r1.obtainMessage(r2)     // Catch: java.lang.Throwable -> L18
            r1.sendMessageAtFrontOfQueue(r2)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r1 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public static /* bridge */ /* synthetic */ boolean zaC(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            boolean r0 = r0.zas
            return r0
    }

    private static com.google.android.gms.common.api.Status zaF(com.google.android.gms.common.api.internal.ApiKey r4, com.google.android.gms.common.ConnectionResult r5) {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r4 = r4.zaa()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "API: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = " is not available on this device. Connection failed with: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r0.<init>(r5, r4)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final com.google.android.gms.common.api.internal.zabq zaG(com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            java.util.Map r0 = r2.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = r3.getApiKey()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L18
            com.google.android.gms.common.api.internal.zabq r0 = new com.google.android.gms.common.api.internal.zabq
            r0.<init>(r2, r3)
            java.util.Map r3 = r2.zan
            r3.put(r1, r0)
        L18:
            boolean r3 = r0.zaA()
            if (r3 == 0) goto L23
            java.util.Set r2 = r2.zaq
            r2.add(r1)
        L23:
            r0.zao()
            return r0
    }

    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaH() {
            r1 = this;
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zah
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.zai
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = com.google.android.gms.common.internal.TelemetryLogging.getClient(r0)
            r1.zah = r0
        Lc:
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = r1.zah
            return r1
    }

    private final void zaI() {
            r2 = this;
            com.google.android.gms.common.internal.TelemetryData r0 = r2.zag
            if (r0 == 0) goto L1a
            int r1 = r0.zaa()
            if (r1 > 0) goto L10
            boolean r1 = r2.zaD()
            if (r1 == 0) goto L17
        L10:
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = r2.zaH()
            r1.log(r0)
        L17:
            r0 = 0
            r2.zag = r0
        L1a:
            return
    }

    private final void zaJ(com.google.android.gms.tasks.TaskCompletionSource r1, int r2, com.google.android.gms.common.api.GoogleApi r3) {
            r0 = this;
            if (r2 == 0) goto L1d
            com.google.android.gms.common.api.internal.ApiKey r3 = r3.getApiKey()
            com.google.android.gms.common.api.internal.zacd r2 = com.google.android.gms.common.api.internal.zacd.zaa(r0, r2, r3)
            if (r2 == 0) goto L1d
            com.google.android.gms.tasks.Task r1 = r1.getTask()
            android.os.Handler r0 = r0.zar
            r0.getClass()
            com.google.android.gms.common.api.internal.zabk r3 = new com.google.android.gms.common.api.internal.zabk
            r3.<init>(r0)
            r1.addOnCompleteListener(r3, r2)
        L1d:
            return
    }

    public static /* bridge */ /* synthetic */ long zab(com.google.android.gms.common.api.internal.GoogleApiManager r2) {
            long r0 = r2.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ android.content.Context zac(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.content.Context r0 = r0.zai
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler zad(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.os.Handler r0 = r0.zar
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zae(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.GoogleApiAvailability r0 = r0.zaj
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zaf() {
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zag(com.google.android.gms.common.api.internal.ApiKey r0, com.google.android.gms.common.ConnectionResult r1) {
            com.google.android.gms.common.api.Status r0 = zaF(r0, r1)
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zaae zah(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.api.internal.zaae r0 = r0.zao
            return r0
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zaj() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Must guarantee manager is non-null before using getInstance"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.common.api.internal.GoogleApiManager zak(android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L1f
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = new com.google.android.gms.common.api.internal.GoogleApiManager     // Catch: java.lang.Throwable -> L1f
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.common.api.internal.GoogleApiManager.zad = r2     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r4 = move-exception
            goto L25
        L21:
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r4
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zal zal(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.internal.zal r0 = r0.zak
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zaq() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zar(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Map r0 = r0.zan
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Set zas(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Set r0 = r0.zap
            return r0
    }

    public static /* bridge */ /* synthetic */ void zat(com.google.android.gms.common.api.internal.GoogleApiManager r0, boolean r1) {
            r1 = 1
            r0.zaf = r1
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r10) {
            r9 = this;
            int r0 = r10.what
            r1 = 13
            r2 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "GoogleApiManager"
            r5 = 0
            r6 = 1
            r7 = 17
            r8 = 0
            switch(r0) {
                case 1: goto L2e3;
                case 2: goto L293;
                case 3: goto L276;
                case 4: goto L239;
                case 5: goto L1c1;
                case 6: goto L192;
                case 7: goto L189;
                case 8: goto L239;
                case 9: goto L170;
                case 10: goto L149;
                case 11: goto L130;
                case 12: goto L117;
                case 13: goto L239;
                case 14: goto Le3;
                case 15: goto Lc2;
                case 16: goto La1;
                case 17: goto L9c;
                case 18: goto L27;
                case 19: goto L23;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unknown message id: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r4, r9)
            return r8
        L23:
            r9.zaf = r8
            goto L31b
        L27:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zace r10 = (com.google.android.gms.common.api.internal.zace) r10
            long r0 = r10.zac
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4d
            com.google.android.gms.common.internal.TelemetryData r0 = new com.google.android.gms.common.internal.TelemetryData
            int r1 = r10.zab
            com.google.android.gms.common.internal.MethodInvocation r10 = r10.zaa
            com.google.android.gms.common.internal.MethodInvocation[] r10 = new com.google.android.gms.common.internal.MethodInvocation[]{r10}
            java.util.List r10 = java.util.Arrays.asList(r10)
            r0.<init>(r1, r10)
            com.google.android.gms.common.internal.TelemetryLoggingClient r9 = r9.zaH()
            r9.log(r0)
            goto L31b
        L4d:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zag
            if (r0 == 0) goto L78
            java.util.List r1 = r0.zab()
            int r0 = r0.zaa()
            int r2 = r10.zab
            if (r0 != r2) goto L70
            if (r1 == 0) goto L68
            int r0 = r1.size()
            int r1 = r10.zad
            if (r0 < r1) goto L68
            goto L70
        L68:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zag
            com.google.android.gms.common.internal.MethodInvocation r1 = r10.zaa
            r0.zac(r1)
            goto L78
        L70:
            android.os.Handler r0 = r9.zar
            r0.removeMessages(r7)
            r9.zaI()
        L78:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zag
            if (r0 != 0) goto L31b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.internal.MethodInvocation r1 = r10.zaa
            r0.add(r1)
            com.google.android.gms.common.internal.TelemetryData r1 = new com.google.android.gms.common.internal.TelemetryData
            int r2 = r10.zab
            r1.<init>(r2, r0)
            r9.zag = r1
            android.os.Handler r9 = r9.zar
            android.os.Message r0 = r9.obtainMessage(r7)
            long r1 = r10.zac
            r9.sendMessageDelayed(r0, r1)
            goto L31b
        L9c:
            r9.zaI()
            goto L31b
        La1:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zabs r10 = (com.google.android.gms.common.api.internal.zabs) r10
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L31b
            java.util.Map r9 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            java.lang.Object r9 = r9.get(r0)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            com.google.android.gms.common.api.internal.zabq.zam(r9, r10)
            goto L31b
        Lc2:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zabs r10 = (com.google.android.gms.common.api.internal.zabs) r10
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L31b
            java.util.Map r9 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            java.lang.Object r9 = r9.get(r0)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            com.google.android.gms.common.api.internal.zabq.zal(r9, r10)
            goto L31b
        Le3:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zaaf r10 = (com.google.android.gms.common.api.internal.zaaf) r10
            com.google.android.gms.common.api.internal.ApiKey r0 = r10.zaa()
            java.util.Map r1 = r9.zan
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto Lfe
            com.google.android.gms.tasks.TaskCompletionSource r9 = r10.zab()
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.setResult(r10)
            goto L31b
        Lfe:
            java.util.Map r9 = r9.zan
            java.lang.Object r9 = r9.get(r0)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            boolean r9 = com.google.android.gms.common.api.internal.zabq.zay(r9, r8)
            com.google.android.gms.tasks.TaskCompletionSource r10 = r10.zab()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10.setResult(r9)
            goto L31b
        L117:
            java.util.Map r0 = r9.zan
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L31b
            java.util.Map r9 = r9.zan
            java.lang.Object r10 = r10.obj
            java.lang.Object r9 = r9.get(r10)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            r9.zaB()
            goto L31b
        L130:
            java.util.Map r0 = r9.zan
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L31b
            java.util.Map r9 = r9.zan
            java.lang.Object r10 = r10.obj
            java.lang.Object r9 = r9.get(r10)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            r9.zaw()
            goto L31b
        L149:
            java.util.Set r10 = r9.zaq
            java.util.Iterator r10 = r10.iterator()
        L14f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L169
            java.lang.Object r0 = r10.next()
            com.google.android.gms.common.api.internal.ApiKey r0 = (com.google.android.gms.common.api.internal.ApiKey) r0
            java.util.Map r1 = r9.zan
            java.lang.Object r0 = r1.remove(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 == 0) goto L14f
            r0.zav()
            goto L14f
        L169:
            java.util.Set r9 = r9.zaq
            r9.clear()
            goto L31b
        L170:
            java.util.Map r0 = r9.zan
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L31b
            java.util.Map r9 = r9.zan
            java.lang.Object r10 = r10.obj
            java.lang.Object r9 = r9.get(r10)
            com.google.android.gms.common.api.internal.zabq r9 = (com.google.android.gms.common.api.internal.zabq) r9
            r9.zau()
            goto L31b
        L189:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.GoogleApi r10 = (com.google.android.gms.common.api.GoogleApi) r10
            r9.zaG(r10)
            goto L31b
        L192:
            android.content.Context r10 = r9.zai
            android.content.Context r10 = r10.getApplicationContext()
            boolean r10 = r10 instanceof android.app.Application
            if (r10 == 0) goto L31b
            android.content.Context r10 = r9.zai
            android.content.Context r10 = r10.getApplicationContext()
            android.app.Application r10 = (android.app.Application) r10
            com.google.android.gms.common.api.internal.BackgroundDetector.initialize(r10)
            com.google.android.gms.common.api.internal.BackgroundDetector r10 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            com.google.android.gms.common.api.internal.zabl r0 = new com.google.android.gms.common.api.internal.zabl
            r0.<init>(r9)
            r10.addListener(r0)
            com.google.android.gms.common.api.internal.BackgroundDetector r10 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            boolean r10 = r10.readCurrentStateIfPossible(r6)
            if (r10 != 0) goto L31b
            r9.zae = r2
            goto L31b
        L1c1:
            int r0 = r10.arg1
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.ConnectionResult r10 = (com.google.android.gms.common.ConnectionResult) r10
            java.util.Map r2 = r9.zan
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L1d1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1e4
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            int r8 = r3.zab()
            if (r8 != r0) goto L1d1
            r5 = r3
        L1e4:
            if (r5 == 0) goto L227
            int r0 = r10.getErrorCode()
            if (r0 != r1) goto L21a
            com.google.android.gms.common.GoogleApiAvailability r9 = r9.zaj
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            int r1 = r10.getErrorCode()
            java.lang.String r9 = r9.getErrorString(r1)
            java.lang.String r10 = r10.getErrorMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error resolution was canceled by the user, original error message: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = ": "
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = r1.toString()
            r0.<init>(r7, r9)
            com.google.android.gms.common.api.internal.zabq.zai(r5, r0)
            goto L31b
        L21a:
            com.google.android.gms.common.api.internal.ApiKey r9 = com.google.android.gms.common.api.internal.zabq.zag(r5)
            com.google.android.gms.common.api.Status r9 = zaF(r9, r10)
            com.google.android.gms.common.api.internal.zabq.zai(r5, r9)
            goto L31b
        L227:
            java.lang.String r9 = "Could not find API instance "
            java.lang.String r10 = " while trying to fail enqueued calls."
            java.lang.String r9 = defpackage.lb1.k(r9, r0, r10)
            java.lang.Exception r10 = new java.lang.Exception
            r10.<init>()
            android.util.Log.wtf(r4, r9, r10)
            goto L31b
        L239:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zach r10 = (com.google.android.gms.common.api.internal.zach) r10
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.GoogleApi r1 = r10.zac
            com.google.android.gms.common.api.internal.ApiKey r1 = r1.getApiKey()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L253
            com.google.android.gms.common.api.GoogleApi r0 = r10.zac
            com.google.android.gms.common.api.internal.zabq r0 = r9.zaG(r0)
        L253:
            boolean r1 = r0.zaA()
            if (r1 == 0) goto L26f
            java.util.concurrent.atomic.AtomicInteger r9 = r9.zam
            int r9 = r9.get()
            int r1 = r10.zab
            if (r9 == r1) goto L26f
            com.google.android.gms.common.api.internal.zai r9 = r10.zaa
            com.google.android.gms.common.api.Status r10 = com.google.android.gms.common.api.internal.GoogleApiManager.zaa
            r9.zad(r10)
            r0.zav()
            goto L31b
        L26f:
            com.google.android.gms.common.api.internal.zai r9 = r10.zaa
            r0.zap(r9)
            goto L31b
        L276:
            java.util.Map r9 = r9.zan
            java.util.Collection r9 = r9.values()
            java.util.Iterator r9 = r9.iterator()
        L280:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L31b
            java.lang.Object r10 = r9.next()
            com.google.android.gms.common.api.internal.zabq r10 = (com.google.android.gms.common.api.internal.zabq) r10
            r10.zan()
            r10.zao()
            goto L280
        L293:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zal r10 = (com.google.android.gms.common.api.internal.zal) r10
            java.util.Set r0 = r10.zab()
            java.util.Iterator r0 = r0.iterator()
        L29f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31b
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.internal.ApiKey r2 = (com.google.android.gms.common.api.internal.ApiKey) r2
            java.util.Map r3 = r9.zan
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            if (r3 != 0) goto L2be
            com.google.android.gms.common.ConnectionResult r9 = new com.google.android.gms.common.ConnectionResult
            r9.<init>(r1)
            r10.zac(r2, r9, r5)
            goto L31b
        L2be:
            boolean r4 = r3.zaz()
            if (r4 == 0) goto L2d2
            com.google.android.gms.common.ConnectionResult r4 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            com.google.android.gms.common.api.Api$Client r3 = r3.zaf()
            java.lang.String r3 = r3.getEndpointPackageName()
            r10.zac(r2, r4, r3)
            goto L29f
        L2d2:
            com.google.android.gms.common.ConnectionResult r4 = r3.zad()
            if (r4 == 0) goto L2dc
            r10.zac(r2, r4, r5)
            goto L29f
        L2dc:
            r3.zat(r10)
            r3.zao()
            goto L29f
        L2e3:
            java.lang.Object r10 = r10.obj
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r6 == r10) goto L2ee
            goto L2f0
        L2ee:
            r2 = 10000(0x2710, double:4.9407E-320)
        L2f0:
            r9.zae = r2
            android.os.Handler r10 = r9.zar
            r0 = 12
            r10.removeMessages(r0)
            java.util.Map r10 = r9.zan
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L303:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L31b
            java.lang.Object r1 = r10.next()
            com.google.android.gms.common.api.internal.ApiKey r1 = (com.google.android.gms.common.api.internal.ApiKey) r1
            android.os.Handler r2 = r9.zar
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            long r3 = r9.zae
            r2.sendMessageDelayed(r1, r3)
            goto L303
        L31b:
            return r6
    }

    public final void zaA(com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zao     // Catch: java.lang.Throwable -> Lf
            if (r1 == r3) goto L11
            r2.zao = r3     // Catch: java.lang.Throwable -> Lf
            java.util.Set r1 = r2.zap     // Catch: java.lang.Throwable -> Lf
            r1.clear()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L1c
        L11:
            java.util.Set r2 = r2.zap     // Catch: java.lang.Throwable -> Lf
            zu r3 = r3.zaa()     // Catch: java.lang.Throwable -> Lf
            r2.addAll(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public final void zaB(com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zao     // Catch: java.lang.Throwable -> L10
            if (r1 != r3) goto L12
            r3 = 0
            r2.zao = r3     // Catch: java.lang.Throwable -> L10
            java.util.Set r2 = r2.zap     // Catch: java.lang.Throwable -> L10
            r2.clear()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public final boolean zaD() {
            r3 = this;
            boolean r0 = r3.zaf
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L18
            boolean r0 = r0.getMethodInvocationTelemetryEnabled()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            com.google.android.gms.common.internal.zal r0 = r3.zak
            android.content.Context r3 = r3.zai
            r2 = 203400000(0xc1fa340, float:1.2298041E-31)
            int r3 = r0.zaa(r3, r2)
            r0 = -1
            if (r3 == r0) goto L2a
            if (r3 != 0) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            r3 = 1
            return r3
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zaE(com.google.android.gms.common.ConnectionResult r2, int r3) {
            r1 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = r1.zaj
            android.content.Context r1 = r1.zai
            boolean r1 = r0.zah(r1, r2, r3)
            return r1
    }

    public final int zaa() {
            r0 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zal
            int r0 = r0.getAndIncrement()
            return r0
    }

    public final com.google.android.gms.common.api.internal.zabq zai(com.google.android.gms.common.api.internal.ApiKey r1) {
            r0 = this;
            java.util.Map r0 = r0.zan
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            return r0
    }

    public final com.google.android.gms.tasks.Task zam(java.lang.Iterable r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zal r0 = new com.google.android.gms.common.api.internal.zal
            r0.<init>(r3)
            android.os.Handler r3 = r2.zar
            r1 = 2
            android.os.Message r3 = r3.obtainMessage(r1, r0)
            android.os.Handler r2 = r2.zar
            r2.sendMessage(r3)
            com.google.android.gms.tasks.Task r2 = r0.zaa()
            return r2
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.tasks.Task zan(com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaf r0 = new com.google.android.gms.common.api.internal.zaaf
            com.google.android.gms.common.api.internal.ApiKey r3 = r3.getApiKey()
            r0.<init>(r3)
            android.os.Handler r3 = r2.zar
            r1 = 14
            android.os.Message r3 = r3.obtainMessage(r1, r0)
            android.os.Handler r2 = r2.zar
            r2.sendMessage(r3)
            com.google.android.gms.tasks.TaskCompletionSource r2 = r0.zab()
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            return r2
    }

    public final com.google.android.gms.tasks.Task zao(com.google.android.gms.common.api.GoogleApi r4, com.google.android.gms.common.api.internal.RegisterListenerMethod r5, com.google.android.gms.common.api.internal.UnregisterListenerMethod r6, java.lang.Runnable r7) {
            r3 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            int r1 = r5.zaa()
            r3.zaJ(r0, r1, r4)
            com.google.android.gms.common.api.internal.zaf r1 = new com.google.android.gms.common.api.internal.zaf
            com.google.android.gms.common.api.internal.zaci r2 = new com.google.android.gms.common.api.internal.zaci
            r2.<init>(r5, r6, r7)
            r1.<init>(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r5 = r3.zam
            com.google.android.gms.common.api.internal.zach r6 = new com.google.android.gms.common.api.internal.zach
            int r5 = r5.get()
            r6.<init>(r1, r5, r4)
            android.os.Handler r4 = r3.zar
            r5 = 8
            android.os.Message r4 = r4.obtainMessage(r5, r6)
            android.os.Handler r3 = r3.zar
            r3.sendMessage(r4)
            com.google.android.gms.tasks.Task r3 = r0.getTask()
            return r3
    }

    public final com.google.android.gms.tasks.Task zap(com.google.android.gms.common.api.GoogleApi r3, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r4, int r5) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r2.zaJ(r0, r5, r3)
            com.google.android.gms.common.api.internal.zah r5 = new com.google.android.gms.common.api.internal.zah
            r5.<init>(r4, r0)
            java.util.concurrent.atomic.AtomicInteger r4 = r2.zam
            com.google.android.gms.common.api.internal.zach r1 = new com.google.android.gms.common.api.internal.zach
            int r4 = r4.get()
            r1.<init>(r5, r4, r3)
            android.os.Handler r3 = r2.zar
            r4 = 13
            android.os.Message r3 = r3.obtainMessage(r4, r1)
            android.os.Handler r2 = r2.zar
            r2.sendMessage(r3)
            com.google.android.gms.tasks.Task r2 = r0.getTask()
            return r2
    }

    public final void zau(com.google.android.gms.common.api.GoogleApi r2, int r3, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r4) {
            r1 = this;
            com.google.android.gms.common.api.internal.zae r0 = new com.google.android.gms.common.api.internal.zae
            r0.<init>(r3, r4)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.zam
            com.google.android.gms.common.api.internal.zach r4 = new com.google.android.gms.common.api.internal.zach
            int r3 = r3.get()
            r4.<init>(r0, r3, r2)
            android.os.Handler r2 = r1.zar
            r3 = 4
            android.os.Message r2 = r2.obtainMessage(r3, r4)
            android.os.Handler r1 = r1.zar
            r1.sendMessage(r2)
            return
    }

    public final void zav(com.google.android.gms.common.api.GoogleApi r2, int r3, com.google.android.gms.common.api.internal.TaskApiCall r4, com.google.android.gms.tasks.TaskCompletionSource r5, com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
            r1 = this;
            int r0 = r4.zaa()
            r1.zaJ(r5, r0, r2)
            com.google.android.gms.common.api.internal.zag r0 = new com.google.android.gms.common.api.internal.zag
            r0.<init>(r3, r4, r5, r6)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.zam
            com.google.android.gms.common.api.internal.zach r4 = new com.google.android.gms.common.api.internal.zach
            int r3 = r3.get()
            r4.<init>(r0, r3, r2)
            android.os.Handler r2 = r1.zar
            r3 = 4
            android.os.Message r2 = r2.obtainMessage(r3, r4)
            android.os.Handler r1 = r1.zar
            r1.sendMessage(r2)
            return
    }

    public final void zaw(com.google.android.gms.common.internal.MethodInvocation r7, int r8, long r9, int r11) {
            r6 = this;
            com.google.android.gms.common.api.internal.zace r0 = new com.google.android.gms.common.api.internal.zace
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r5)
            android.os.Handler r7 = r6.zar
            r8 = 18
            android.os.Message r7 = r7.obtainMessage(r8, r0)
            android.os.Handler r6 = r6.zar
            r6.sendMessage(r7)
            return
    }

    public final void zax(com.google.android.gms.common.ConnectionResult r3, int r4) {
            r2 = this;
            boolean r0 = r2.zaE(r3, r4)
            if (r0 != 0) goto L11
            android.os.Handler r2 = r2.zar
            r0 = 5
            r1 = 0
            android.os.Message r3 = r2.obtainMessage(r0, r4, r1, r3)
            r2.sendMessage(r3)
        L11:
            return
    }

    public final void zay() {
            r1 = this;
            android.os.Handler r1 = r1.zar
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            return
    }

    public final void zaz(com.google.android.gms.common.api.GoogleApi r2) {
            r1 = this;
            android.os.Handler r1 = r1.zar
            r0 = 7
            android.os.Message r2 = r1.obtainMessage(r0, r2)
            r1.sendMessage(r2)
            return
    }
}
