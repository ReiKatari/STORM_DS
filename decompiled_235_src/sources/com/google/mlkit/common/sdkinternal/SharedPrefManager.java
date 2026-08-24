package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.model.RemoteModel;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SharedPrefManager {
    public static final bv0 COMPONENT;
    public static final String PREF_FILE = "com.google.mlkit.internal";
    protected final Context zza;

    static {
        dk0 a = bv0.a(SharedPrefManager.class);
        a.b(new wh1(1, 0, MlKitContext.class));
        a.b(new wh1(1, 0, Context.class));
        a.B = new sv0() { // from class: com.google.mlkit.common.sdkinternal.zzs
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new SharedPrefManager((Context) ov0Var.a(Context.class));
            }
        };
        COMPONENT = a.j();
    }

    public SharedPrefManager(Context context) {
        this.zza = context;
    }

    public static SharedPrefManager getInstance(MlKitContext mlKitContext) {
        return (SharedPrefManager) mlKitContext.get(SharedPrefManager.class);
    }

    public synchronized void clearDownloadingModelInfo(RemoteModel remoteModel) {
        String downloadingModelHash = getDownloadingModelHash(remoteModel);
        SharedPreferences.Editor edit = zza().edit();
        String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        SharedPreferences.Editor remove = edit.remove("downloading_model_id_" + uniqueModelNameForPersist);
        String uniqueModelNameForPersist2 = remoteModel.getUniqueModelNameForPersist();
        SharedPreferences.Editor remove2 = remove.remove("downloading_model_hash_" + uniqueModelNameForPersist2);
        SharedPreferences.Editor remove3 = remove2.remove("downloading_model_type_" + downloadingModelHash);
        String uniqueModelNameForPersist3 = remoteModel.getUniqueModelNameForPersist();
        SharedPreferences.Editor remove4 = remove3.remove("downloading_begin_time_" + uniqueModelNameForPersist3);
        String uniqueModelNameForPersist4 = remoteModel.getUniqueModelNameForPersist();
        remove4.remove("model_first_use_time_" + uniqueModelNameForPersist4).apply();
    }

    public synchronized void clearIncompatibleModelInfo(RemoteModel remoteModel) {
        SharedPreferences.Editor edit = zza().edit();
        String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        edit.remove("bad_hash_" + uniqueModelNameForPersist).remove("app_version").apply();
    }

    public synchronized void clearLatestModelHash(RemoteModel remoteModel) {
        SharedPreferences.Editor edit = zza().edit();
        String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        edit.remove("current_model_hash_" + uniqueModelNameForPersist).commit();
    }

    public synchronized String getDownloadingModelHash(RemoteModel remoteModel) {
        SharedPreferences zza;
        String uniqueModelNameForPersist;
        zza = zza();
        uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        return zza.getString("downloading_model_hash_" + uniqueModelNameForPersist, null);
    }

    public synchronized Long getDownloadingModelId(RemoteModel remoteModel) {
        SharedPreferences zza = zza();
        String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        long j = zza.getLong("downloading_model_id_" + uniqueModelNameForPersist, -1L);
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public synchronized String getIncompatibleModelHash(RemoteModel remoteModel) {
        SharedPreferences zza;
        String uniqueModelNameForPersist;
        zza = zza();
        uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        return zza.getString("bad_hash_" + uniqueModelNameForPersist, null);
    }

    public synchronized String getLatestModelHash(RemoteModel remoteModel) {
        SharedPreferences zza;
        String uniqueModelNameForPersist;
        zza = zza();
        uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        return zza.getString("current_model_hash_" + uniqueModelNameForPersist, null);
    }

    public synchronized String getMlSdkInstanceId() {
        String string = zza().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        zza().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public synchronized long getModelDownloadBeginTimeMs(RemoteModel remoteModel) {
        SharedPreferences zza;
        String uniqueModelNameForPersist;
        zza = zza();
        uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        return zza.getLong("downloading_begin_time_" + uniqueModelNameForPersist, 0L);
    }

    public synchronized long getModelFirstUseTimeMs(RemoteModel remoteModel) {
        SharedPreferences zza;
        String uniqueModelNameForPersist;
        zza = zza();
        uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        return zza.getLong("model_first_use_time_" + uniqueModelNameForPersist, 0L);
    }

    public synchronized String getPreviousAppVersion() {
        return zza().getString("app_version", null);
    }

    public synchronized void setDownloadingModelInfo(long j, ModelInfo modelInfo) {
        String modelNameForPersist = modelInfo.getModelNameForPersist();
        String modelHash = modelInfo.getModelHash();
        SharedPreferences.Editor edit = zza().edit();
        SharedPreferences.Editor putString = edit.putString("downloading_model_hash_" + modelNameForPersist, modelHash);
        SharedPreferences.Editor putLong = putString.putLong("downloading_model_id_" + modelNameForPersist, j);
        putLong.putLong("downloading_begin_time_" + modelNameForPersist, SystemClock.elapsedRealtime()).apply();
    }

    public synchronized void setIncompatibleModelInfo(RemoteModel remoteModel, String str, String str2) {
        SharedPreferences.Editor edit = zza().edit();
        String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        edit.putString("bad_hash_" + uniqueModelNameForPersist, str).putString("app_version", str2).apply();
    }

    public synchronized void setLatestModelHash(RemoteModel remoteModel, String str) {
        SharedPreferences.Editor edit = zza().edit();
        String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        edit.putString("current_model_hash_" + uniqueModelNameForPersist, str).apply();
    }

    public synchronized void setModelFirstUseTimeMs(RemoteModel remoteModel, long j) {
        SharedPreferences.Editor edit = zza().edit();
        String uniqueModelNameForPersist = remoteModel.getUniqueModelNameForPersist();
        edit.putLong("model_first_use_time_" + uniqueModelNameForPersist, j).apply();
    }

    public final SharedPreferences zza() {
        return this.zza.getSharedPreferences(PREF_FILE, 0);
    }

    public final synchronized String zzb(String str, long j) {
        return zza().getString(String.format("cached_local_model_hash_%1s_%2s", Preconditions.checkNotNull(str), Long.valueOf(j)), null);
    }

    public final synchronized void zzc(String str, long j, String str2) {
        zza().edit().putString(String.format("cached_local_model_hash_%1s_%2s", Preconditions.checkNotNull(str), Long.valueOf(j)), str2).apply();
    }
}
