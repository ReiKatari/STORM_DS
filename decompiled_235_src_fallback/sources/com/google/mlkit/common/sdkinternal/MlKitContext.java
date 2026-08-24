package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MlKitContext {
    private static final java.lang.Object zza = null;
    private static com.google.mlkit.common.sdkinternal.MlKitContext zzb;
    private defpackage.xv0 zzc;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.mlkit.common.sdkinternal.MlKitContext.zza = r0
            return
    }

    private MlKitContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext getInstance() {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "MlKitContext has not been initialized"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L19
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Throwable -> L19
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = (com.google.mlkit.common.sdkinternal.MlKitContext) r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initialize(android.content.Context r10, java.util.List<defpackage.tv0> r11) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L39
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = r3
        Lc:
            java.lang.String r4 = "MlKitContext is already initialized"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L39
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = new com.google.mlkit.common.sdkinternal.MlKitContext     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            com.google.mlkit.common.sdkinternal.MlKitContext.zzb = r1     // Catch: java.lang.Throwable -> L39
            android.content.Context r10 = zzc(r10)     // Catch: java.lang.Throwable -> L39
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L39
            r4.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L39
        L25:
            boolean r5 = r11.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L3b
            java.lang.Object r5 = r11.next()     // Catch: java.lang.Throwable -> L39
            tv0 r5 = (defpackage.tv0) r5     // Catch: java.lang.Throwable -> L39
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L39
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L39
            goto L25
        L39:
            r10 = move-exception
            goto L88
        L3b:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L39
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L39
            xv0 r4 = new xv0     // Catch: java.lang.Throwable -> L39
            java.util.concurrent.Executor r5 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD     // Catch: java.lang.Throwable -> L39
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            bv0 r10 = defpackage.bv0.b(r10, r6, r7)     // Catch: java.lang.Throwable -> L39
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r6 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            bv0 r6 = defpackage.bv0.b(r1, r6, r7)     // Catch: java.lang.Throwable -> L39
            bv0[] r10 = new defpackage.bv0[]{r10, r6}     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r6.<init>()     // Catch: java.lang.Throwable -> L39
            int r7 = r11.size()     // Catch: java.lang.Throwable -> L39
        L65:
            if (r3 >= r7) goto L78
            java.lang.Object r8 = r11.get(r3)     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 1
            tv0 r8 = (defpackage.tv0) r8     // Catch: java.lang.Throwable -> L39
            rv0 r9 = new rv0     // Catch: java.lang.Throwable -> L39
            r9.<init>(r8, r2)     // Catch: java.lang.Throwable -> L39
            r6.add(r9)     // Catch: java.lang.Throwable -> L39
            goto L65
        L78:
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch: java.lang.Throwable -> L39
            r4.<init>(r5, r6, r10)     // Catch: java.lang.Throwable -> L39
            r1.zzc = r4     // Catch: java.lang.Throwable -> L39
            r4.M0()     // Catch: java.lang.Throwable -> L39
            com.google.mlkit.common.sdkinternal.MlKitContext r10 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r10
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r10
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(android.content.Context r2) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8
            goto Lc
        L8:
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = zza(r2)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(android.content.Context r2, java.util.List<defpackage.tv0> r3) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8
            goto Lc
        L8:
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = initialize(r2, r3)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext initializeIfNeeded(android.content.Context r2, java.util.concurrent.Executor r3) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L8
            goto Lc
        L8:
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = zzb(r2, r3)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext zza(android.content.Context r2) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD     // Catch: java.lang.Throwable -> Lb
            com.google.mlkit.common.sdkinternal.MlKitContext r2 = zzb(r2, r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public static com.google.mlkit.common.sdkinternal.MlKitContext zzb(android.content.Context r7, java.util.concurrent.Executor r8) {
            java.lang.Object r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zza
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            if (r1 != 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = r2
        Lb:
            java.lang.String r3 = "MlKitContext is already initialized"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r3)     // Catch: java.lang.Throwable -> L5c
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = new com.google.mlkit.common.sdkinternal.MlKitContext     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
            com.google.mlkit.common.sdkinternal.MlKitContext.zzb = r1     // Catch: java.lang.Throwable -> L5c
            android.content.Context r7 = zzc(r7)     // Catch: java.lang.Throwable -> L5c
            u2 r3 = new u2     // Catch: java.lang.Throwable -> L5c
            d90 r4 = new d90     // Catch: java.lang.Throwable -> L5c
            r5 = 28
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r3 = r3.a()     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5c
            r4.<init>()     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5c
            r5.<init>()     // Catch: java.lang.Throwable -> L5c
            r4.addAll(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L5c
            bv0 r7 = defpackage.bv0.b(r7, r3, r6)     // Catch: java.lang.Throwable -> L5c
            r5.add(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r7 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L5c
            bv0 r7 = defpackage.bv0.b(r1, r7, r2)     // Catch: java.lang.Throwable -> L5c
            r5.add(r7)     // Catch: java.lang.Throwable -> L5c
            xv0 r7 = new xv0     // Catch: java.lang.Throwable -> L5c
            r7.<init>(r8, r4, r5)     // Catch: java.lang.Throwable -> L5c
            r1.zzc = r7     // Catch: java.lang.Throwable -> L5c
            r7.M0()     // Catch: java.lang.Throwable -> L5c
            com.google.mlkit.common.sdkinternal.MlKitContext r7 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            return r7
        L5c:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            throw r7
    }

    private static android.content.Context zzc(android.content.Context r1) {
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 == 0) goto L7
            return r0
        L7:
            return r1
    }

    public <T> T get(java.lang.Class<T> r3) {
            r2 = this;
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = com.google.mlkit.common.sdkinternal.MlKitContext.zzb
            if (r0 != r2) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.String r1 = "MlKitContext has been deleted"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            xv0 r0 = r2.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            xv0 r2 = r2.zzc
            java.lang.Object r2 = r2.a(r3)
            return r2
    }

    public android.content.Context getApplicationContext() {
            r1 = this;
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r1 = r1.get(r0)
            android.content.Context r1 = (android.content.Context) r1
            return r1
    }
}
