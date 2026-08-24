package com.google.mlkit.common.model;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.ModelType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CustomRemoteModel extends RemoteModel {
    private final RemoteModelSource zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private final RemoteModelSource zza;

        public Builder(RemoteModelSource remoteModelSource) {
            Preconditions.checkNotNull(remoteModelSource);
            this.zza = remoteModelSource;
        }

        public CustomRemoteModel build() {
            return new CustomRemoteModel(this.zza, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CustomRemoteModel(RemoteModelSource remoteModelSource, zza zzaVar) {
        super(r4, null, ModelType.CUSTOM);
        String zza;
        if (TextUtils.isEmpty(remoteModelSource.zza())) {
            zza = "no_model_name";
        } else {
            zza = remoteModelSource.zza();
        }
        this.zzb = remoteModelSource;
    }

    public RemoteModelSource getRemoteModelSource() {
        return this.zzb;
    }
}
