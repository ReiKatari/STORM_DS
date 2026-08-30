package zc;

import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends a {
    public final Thread R;
    public final l0 X;

    public c(cc.g gVar, Thread thread, l0 l0Var) {
        super(gVar, true);
        this.R = thread;
        this.X = l0Var;
    }

    @Override // zc.f1
    public final void c(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.R;
        if (!nc.k.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
