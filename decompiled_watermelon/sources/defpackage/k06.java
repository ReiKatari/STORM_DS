package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k06  reason: default package */
/* loaded from: classes.dex */
public final class k06 implements Executor {
    public final /* synthetic */ int A;
    public final Executor B;
    public final ArrayDeque L;
    public Runnable R;
    public final Object X;

    public k06(Executor executor, int i) {
        this.A = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.B = executor;
                this.L = new ArrayDeque();
                this.X = new Object();
                return;
            default:
                this.B = executor;
                this.L = new ArrayDeque();
                this.X = new Object();
                return;
        }
    }

    public final void a() {
        switch (this.A) {
            case 0:
                Runnable runnable = (Runnable) this.L.poll();
                this.R = runnable;
                if (runnable != null) {
                    this.B.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.X) {
                    Object poll = this.L.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.R = runnable2;
                    if (poll != null) {
                        this.B.execute(runnable2);
                    }
                }
                return;
            default:
                synchronized (this.X) {
                    try {
                        Runnable runnable3 = (Runnable) this.L.poll();
                        this.R = runnable3;
                        if (runnable3 != null) {
                            ((qf1) this.B).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                synchronized (this.X) {
                    try {
                        this.L.add(new qj2(12, this, runnable));
                        if (this.R == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.X) {
                    this.L.offer(new xc4(9, runnable, this));
                    if (this.R == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.X) {
                    try {
                        this.L.add(new we(2, this, runnable));
                        if (this.R == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public k06(qf1 qf1Var) {
        this.A = 2;
        this.X = new Object();
        this.L = new ArrayDeque();
        this.B = qf1Var;
    }
}
