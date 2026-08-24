package defpackage;

import android.content.res.TypedArray;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf6  reason: default package */
/* loaded from: classes.dex */
public final class sf6 implements hp4 {
    public final hp4 A;
    public final m44 B;
    public final sw L = g04.s(false);

    public sf6(hp4 hp4Var, m44 m44Var) {
        this.A = hp4Var;
        this.B = m44Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        if (this.L.a()) {
            m44 m44Var = this.B;
            uw uwVar = (uw) m44Var.L;
            uwVar.getClass();
            if (uw.b.decrementAndGet(uwVar) == 0) {
                ((gs0) ((xw) m44Var.R).b(null)).getClass();
                hp4 hp4Var = (hp4) m44Var.B;
                if (hp4Var instanceof AutoCloseable) {
                    hp4Var.close();
                } else if (hp4Var instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) hp4Var;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (hp4Var instanceof TypedArray) {
                    ((TypedArray) hp4Var).recycle();
                } else if (hp4Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) hp4Var).release();
                } else if (hp4Var instanceof MediaDrm) {
                    ((MediaDrm) hp4Var).release();
                } else {
                    u34.t();
                }
            }
        }
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (this.L.b()) {
            return null;
        }
        if (ar0Var.equals(gh5.a(sf6.class)) || ar0Var.equals(gh5.a(hp4.class)) || ar0Var.equals(gh5.a(j33.class))) {
            return this;
        }
        if (!ar0Var.equals(gh5.a(Image.class))) {
            return this.A.e(ar0Var);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sf6 k0() {
        int i;
        int i2;
        hp4 hp4Var;
        sf6 sf6Var;
        if (!this.L.b()) {
            m44 m44Var = this.B;
            uw uwVar = (uw) m44Var.L;
            do {
                i = uwVar.a;
                if (i == 0) {
                    i2 = 0;
                } else {
                    i2 = i + 1;
                }
            } while (!uw.b.compareAndSet(uwVar, i, i2));
            if (i2 != 0) {
                hp4Var = (hp4) m44Var.B;
            } else {
                hp4Var = null;
            }
            if (hp4Var != null) {
                sf6Var = new sf6(this.A, this.B);
                if (sf6Var == null) {
                    return sf6Var;
                }
                i.m("Required value was null.");
                return null;
            }
        }
        sf6Var = null;
        if (sf6Var == null) {
        }
    }

    public final String toString() {
        return this.A.toString();
    }
}
