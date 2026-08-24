package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BlockingServiceConnection implements android.content.ServiceConnection {
    boolean zza;
    private final java.util.concurrent.BlockingQueue zzb;

    public BlockingServiceConnection() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.zzb = r0
            return
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.os.IBinder getService() {
            r1 = this;
            java.lang.String r0 = "BlockingServiceConnection.getService() called on main thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            boolean r0 = r1.zza
            if (r0 != 0) goto L15
            r0 = 1
            r1.zza = r0
            java.util.concurrent.BlockingQueue r1 = r1.zzb
            java.lang.Object r1 = r1.take()
            android.os.IBinder r1 = (android.os.IBinder) r1
            return r1
        L15:
            java.lang.String r1 = "Cannot call get on this connection more than once"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.os.IBinder getServiceWithTimeout(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            java.lang.String r0 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0)
            boolean r0 = r1.zza
            if (r0 != 0) goto L1f
            r0 = 1
            r1.zza = r0
            java.util.concurrent.BlockingQueue r1 = r1.zzb
            java.lang.Object r1 = r1.poll(r2, r4)
            android.os.IBinder r1 = (android.os.IBinder) r1
            if (r1 == 0) goto L17
            return r1
        L17:
            java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
            java.lang.String r2 = "Timed out waiting for the service connection"
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.String r1 = "Cannot call get on this connection more than once"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            r0 = this;
            java.util.concurrent.BlockingQueue r0 = r0.zzb
            r0.add(r2)
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            return
    }
}
