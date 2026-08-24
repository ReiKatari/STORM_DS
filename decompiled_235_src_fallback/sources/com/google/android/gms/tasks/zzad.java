package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzad<T> implements com.google.android.gms.tasks.zzae<T> {
    private final java.util.concurrent.CountDownLatch zza;

    private zzad() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    public /* synthetic */ zzad(com.google.android.gms.tasks.zzac r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r2.<init>(r0)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
            r0 = this;
            java.util.concurrent.CountDownLatch r0 = r0.zza
            r0.countDown()
            return
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception r1) {
            r0 = this;
            java.util.concurrent.CountDownLatch r0 = r0.zza
            r0.countDown()
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(T r1) {
            r0 = this;
            java.util.concurrent.CountDownLatch r0 = r0.zza
            r0.countDown()
            return
    }

    public final void zza() {
            r0 = this;
            java.util.concurrent.CountDownLatch r0 = r0.zza
            r0.await()
            return
    }

    public final boolean zzb(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            java.util.concurrent.CountDownLatch r0 = r0.zza
            boolean r0 = r0.await(r1, r3)
            return r0
    }
}
