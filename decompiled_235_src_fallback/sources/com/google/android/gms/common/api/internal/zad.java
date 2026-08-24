package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zad extends com.google.android.gms.common.api.internal.zac {
    protected final com.google.android.gms.tasks.TaskCompletionSource zaa;

    public zad(int r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zaa = r2
            return
    }

    public abstract void zac(com.google.android.gms.common.api.internal.zabq r1);

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.ApiException r0 = new com.google.android.gms.common.api.ApiException
            r0.<init>(r2)
            com.google.android.gms.tasks.TaskCompletionSource r1 = r1.zaa
            r1.trySetException(r0)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception r1) {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zaa
            r0.trySetException(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq r2) {
            r1 = this;
            r1.zac(r2)     // Catch: java.lang.RuntimeException -> L4 android.os.RemoteException -> Lb android.os.DeadObjectException -> L14
            return
        L4:
            r2 = move-exception
            com.google.android.gms.tasks.TaskCompletionSource r1 = r1.zaa
            r1.trySetException(r2)
            return
        Lb:
            r2 = move-exception
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.zai.zah(r2)
            r1.zad(r2)
            return
        L14:
            r2 = move-exception
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.zai.zah(r2)
            r1.zad(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            return
    }
}
