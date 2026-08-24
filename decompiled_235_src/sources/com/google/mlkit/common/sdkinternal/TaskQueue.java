package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TaskQueue {
    private boolean zzb;
    private final Object zza = new Object();
    private final Queue zzc = new ArrayDeque();
    private final AtomicReference zzd = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc() {
        synchronized (this.zza) {
            try {
                if (this.zzc.isEmpty()) {
                    this.zzb = false;
                    return;
                }
                zzv zzvVar = (zzv) this.zzc.remove();
                zzd(zzvVar.zza, zzvVar.zzb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzd(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    zzx zzxVar = new zzx(TaskQueue.this, null);
                    try {
                        runnable.run();
                        zzxVar.close();
                    } catch (Throwable th) {
                        try {
                            zzxVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            zzc();
        }
    }

    public void checkIsRunningOnCurrentThread() {
        Preconditions.checkState(Thread.currentThread().equals(this.zzd.get()));
    }

    public void submit(Executor executor, Runnable runnable) {
        synchronized (this.zza) {
            try {
                if (this.zzb) {
                    this.zzc.add(new zzv(executor, runnable, null));
                    return;
                }
                this.zzb = true;
                zzd(executor, runnable);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
