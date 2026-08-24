package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb6  reason: default package */
/* loaded from: classes.dex */
public final class vb6 implements Executor {
    public final Executor B;
    public final ArrayDeque A = new ArrayDeque();
    public final g15 L = new g15(this, 20);
    public ub6 R = ub6.IDLE;
    public long X = 0;

    public vb6(Executor executor) {
        executor.getClass();
        this.B = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void execute(Runnable runnable) {
        ub6 ub6Var;
        runnable.getClass();
        synchronized (this.A) {
            ub6 ub6Var2 = this.R;
            if (ub6Var2 != ub6.RUNNING && ub6Var2 != (ub6Var = ub6.QUEUED)) {
                long j = this.X;
                boolean z = true;
                t36 t36Var = new t36(runnable, 1);
                this.A.add(t36Var);
                ub6 ub6Var3 = ub6.QUEUING;
                this.R = ub6Var3;
                try {
                    this.B.execute(this.L);
                    if (this.R == ub6Var3) {
                        synchronized (this.A) {
                            try {
                                if (this.X == j && this.R == ub6Var3) {
                                    this.R = ub6Var;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.A) {
                        try {
                            ub6 ub6Var4 = this.R;
                            if (ub6Var4 != ub6.IDLE) {
                                if (ub6Var4 == ub6.QUEUING) {
                                }
                                z = false;
                                if ((e instanceof RejectedExecutionException) || z) {
                                    throw e;
                                }
                            }
                            if (this.A.removeLastOccurrence(t36Var)) {
                                if (e instanceof RejectedExecutionException) {
                                }
                                throw e;
                            }
                            z = false;
                            if (e instanceof RejectedExecutionException) {
                            }
                            throw e;
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.A.add(runnable);
        }
    }
}
