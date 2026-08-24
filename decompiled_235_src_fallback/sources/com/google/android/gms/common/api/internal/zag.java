package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zag extends com.google.android.gms.common.api.internal.zac {
    private final com.google.android.gms.common.api.internal.TaskApiCall zaa;
    private final com.google.android.gms.tasks.TaskCompletionSource zab;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zad;

    public zag(int r1, com.google.android.gms.common.api.internal.TaskApiCall r2, com.google.android.gms.tasks.TaskCompletionSource r3, com.google.android.gms.common.api.internal.StatusExceptionMapper r4) {
            r0 = this;
            r0.<init>(r1)
            r0.zab = r3
            r0.zaa = r2
            r0.zad = r4
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r2.shouldAutoResolveMissingFeatures()
            if (r0 != 0) goto L13
            goto L1a
        L13:
            java.lang.String r0 = "Best-effort write calls cannot pass methods that should auto-resolve missing features."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
        L1a:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.zaa
            boolean r0 = r0.shouldAutoResolveMissingFeatures()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r0.zaa
            com.google.android.gms.common.Feature[] r0 = r0.zab()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.StatusExceptionMapper r0 = r1.zad
            com.google.android.gms.tasks.TaskCompletionSource r1 = r1.zab
            java.lang.Exception r2 = r0.getException(r2)
            r1.trySetException(r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception r1) {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zab
            r0.trySetException(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.TaskApiCall r0 = r2.zaa     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> Le android.os.DeadObjectException -> L1e
            com.google.android.gms.common.api.Api$Client r3 = r3.zaf()     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> Le android.os.DeadObjectException -> L1e
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.zab     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> Le android.os.DeadObjectException -> L1e
            r0.doExecute(r3, r1)     // Catch: java.lang.RuntimeException -> Lc android.os.RemoteException -> Le android.os.DeadObjectException -> L1e
            return
        Lc:
            r3 = move-exception
            goto L10
        Le:
            r3 = move-exception
            goto L16
        L10:
            com.google.android.gms.tasks.TaskCompletionSource r2 = r2.zab
            r2.trySetException(r3)
            return
        L16:
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.internal.zai.zah(r3)
            r2.zad(r3)
            return
        L1e:
            r2 = move-exception
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.zab
            r1.zad(r0, r2)
            return
    }
}
