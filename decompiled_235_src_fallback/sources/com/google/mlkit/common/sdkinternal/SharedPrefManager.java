package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SharedPrefManager {
    public static final defpackage.bv0 COMPONENT = null;
    public static final java.lang.String PREF_FILE = "com.google.mlkit.internal";
    protected final android.content.Context zza;

    static {
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r0 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            dk0 r0 = defpackage.bv0.a(r0)
            wh1 r1 = new wh1
            r2 = 1
            r3 = 0
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r4 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            r1.<init>(r2, r3, r4)
            r0.b(r1)
            wh1 r1 = new wh1
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r1.<init>(r2, r3, r4)
            r0.b(r1)
            com.google.mlkit.common.sdkinternal.zzs r1 = new com.google.mlkit.common.sdkinternal.zzs
            r1.<init>()
            r0.B = r1
            bv0 r0 = r0.j()
            com.google.mlkit.common.sdkinternal.SharedPrefManager.COMPONENT = r0
            return
    }

    public SharedPrefManager(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.mlkit.common.sdkinternal.SharedPrefManager getInstance(com.google.mlkit.common.sdkinternal.MlKitContext r1) {
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r0 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            java.lang.Object r1 = r1.get(r0)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r1 = (com.google.mlkit.common.sdkinternal.SharedPrefManager) r1
            return r1
    }

    public synchronized void clearDownloadingModelInfo(com.google.mlkit.common.model.RemoteModel r10) {
            r9 = this;
            java.lang.String r0 = "model_first_use_time_"
            java.lang.String r1 = "downloading_begin_time_"
            java.lang.String r2 = "downloading_model_type_"
            java.lang.String r3 = "downloading_model_hash_"
            java.lang.String r4 = "downloading_model_id_"
            monitor-enter(r9)
            java.lang.String r5 = r9.getDownloadingModelHash(r10)     // Catch: java.lang.Throwable -> L7c
            android.content.SharedPreferences r6 = r9.zza()     // Catch: java.lang.Throwable -> L7c
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = r10.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L7c
            r8.append(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Throwable -> L7c
            android.content.SharedPreferences$Editor r4 = r6.remove(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = r10.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L7c
            r7.append(r6)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L7c
            android.content.SharedPreferences$Editor r3 = r4.remove(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            r4.append(r5)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            android.content.SharedPreferences$Editor r2 = r3.remove(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r10.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            r4.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L7c
            android.content.SharedPreferences$Editor r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r10 = r10.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7c
            r2.append(r10)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            android.content.SharedPreferences$Editor r10 = r1.remove(r10)     // Catch: java.lang.Throwable -> L7c
            r10.apply()     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r9)
            return
        L7c:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L7c
            throw r10
    }

    public synchronized void clearIncompatibleModelInfo(com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            java.lang.String r0 = "bad_hash_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r2.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r4 = r1.remove(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "app_version"
            android.content.SharedPreferences$Editor r4 = r4.remove(r0)     // Catch: java.lang.Throwable -> L2a
            r4.apply()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L2a:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r4
    }

    public synchronized void clearLatestModelHash(com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            java.lang.String r0 = "current_model_hash_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r4 = r1.remove(r4)     // Catch: java.lang.Throwable -> L24
            r4.commit()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return
        L24:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public synchronized java.lang.String getDownloadingModelHash(com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            java.lang.String r0 = "downloading_model_hash_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            r2.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            java.lang.String r4 = r1.getString(r4, r0)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return r4
        L1e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    public synchronized java.lang.Long getDownloadingModelId(com.google.mlkit.common.model.RemoteModel r5) {
            r4 = this;
            java.lang.String r0 = "downloading_model_id_"
            monitor-enter(r4)
            android.content.SharedPreferences r1 = r4.zza()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            r2.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L2c
            r2 = -1
            long r0 = r1.getLong(r5, r2)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L26
            monitor-exit(r4)
            r4 = 0
            return r4
        L26:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r4)
            return r5
        L2c:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2c
            throw r5
    }

    public synchronized java.lang.String getIncompatibleModelHash(com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            java.lang.String r0 = "bad_hash_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            r2.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            java.lang.String r4 = r1.getString(r4, r0)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return r4
        L1e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    public synchronized java.lang.String getLatestModelHash(com.google.mlkit.common.model.RemoteModel r4) {
            r3 = this;
            java.lang.String r0 = "current_model_hash_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            r2.append(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            java.lang.String r4 = r1.getString(r4, r0)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return r4
        L1e:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    public synchronized java.lang.String getMlSdkInstanceId() {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "ml_sdk_instance_id"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L10
            monitor-exit(r3)
            return r0
        L10:
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L2b
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "ml_sdk_instance_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r0)     // Catch: java.lang.Throwable -> L2b
            r1.apply()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r3)
            return r0
        L2b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r0
    }

    public synchronized long getModelDownloadBeginTimeMs(com.google.mlkit.common.model.RemoteModel r5) {
            r4 = this;
            java.lang.String r0 = "downloading_begin_time_"
            monitor-enter(r4)
            android.content.SharedPreferences r1 = r4.zza()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = r5.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            r2.append(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            long r0 = r1.getLong(r5, r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return r0
        L1f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    public synchronized long getModelFirstUseTimeMs(com.google.mlkit.common.model.RemoteModel r5) {
            r4 = this;
            java.lang.String r0 = "model_first_use_time_"
            monitor-enter(r4)
            android.content.SharedPreferences r1 = r4.zza()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = r5.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            r2.append(r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            long r0 = r1.getLong(r5, r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return r0
        L1f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5
    }

    public synchronized java.lang.String getPreviousAppVersion() {
            r3 = this;
            monitor-enter(r3)
            android.content.SharedPreferences r0 = r3.zza()     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "app_version"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r3)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    public synchronized void setDownloadingModelInfo(long r7, com.google.mlkit.common.sdkinternal.ModelInfo r9) {
            r6 = this;
            java.lang.String r0 = "downloading_begin_time_"
            java.lang.String r1 = "downloading_model_id_"
            java.lang.String r2 = "downloading_model_hash_"
            monitor-enter(r6)
            java.lang.String r3 = r9.getModelNameForPersist()     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = r9.getModelHash()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences r4 = r6.zza()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L50
            r5.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r9 = r4.putString(r2, r9)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L50
            r2.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r7 = r9.putLong(r1, r7)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L50
            r8.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L50
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L50
            android.content.SharedPreferences$Editor r7 = r7.putLong(r8, r0)     // Catch: java.lang.Throwable -> L50
            r7.apply()     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)
            return
        L50:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r7
    }

    public synchronized void setIncompatibleModelInfo(com.google.mlkit.common.model.RemoteModel r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r0 = "bad_hash_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r2.append(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            android.content.SharedPreferences$Editor r4 = r1.putString(r4, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "app_version"
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r6)     // Catch: java.lang.Throwable -> L2a
            r4.apply()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)
            return
        L2a:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r4
    }

    public synchronized void setLatestModelHash(com.google.mlkit.common.model.RemoteModel r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "current_model_hash_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r4 = r1.putString(r4, r5)     // Catch: java.lang.Throwable -> L24
            r4.apply()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return
        L24:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public synchronized void setModelFirstUseTimeMs(com.google.mlkit.common.model.RemoteModel r4, long r5) {
            r3 = this;
            java.lang.String r0 = "model_first_use_time_"
            monitor-enter(r3)
            android.content.SharedPreferences r1 = r3.zza()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r4.getUniqueModelNameForPersist()     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r4 = r1.putLong(r4, r5)     // Catch: java.lang.Throwable -> L24
            r4.apply()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return
        L24:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public final android.content.SharedPreferences zza() {
            r2 = this;
            android.content.Context r2 = r2.zza
            java.lang.String r0 = "com.google.mlkit.internal"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public final synchronized java.lang.String zzb(java.lang.String r2, long r3) {
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.zza()     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "cached_local_model_hash_%1s_%2s"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            java.lang.String r2 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)
            return r2
        L1e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }

    public final synchronized void zzc(java.lang.String r2, long r3, java.lang.String r5) {
            r1 = this;
            monitor-enter(r1)
            android.content.SharedPreferences r0 = r1.zza()     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "cached_local_model_hash_%1s_%2s"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r2 = r0.putString(r2, r5)     // Catch: java.lang.Throwable -> L24
            r2.apply()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r1)
            return
        L24:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r2
    }
}
