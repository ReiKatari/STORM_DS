package defpackage;

import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oo1  reason: default package */
/* loaded from: classes.dex */
public final class oo1 extends l07 {
    public final /* synthetic */ l07 n;
    public final /* synthetic */ ThreadPoolExecutor o;

    public oo1(l07 l07Var, ThreadPoolExecutor threadPoolExecutor) {
        this.n = l07Var;
        this.o = threadPoolExecutor;
    }

    @Override // defpackage.l07
    public final void i0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.i0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.l07
    public final void j0(q9 q9Var) {
        ThreadPoolExecutor threadPoolExecutor = this.o;
        try {
            this.n.j0(q9Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
