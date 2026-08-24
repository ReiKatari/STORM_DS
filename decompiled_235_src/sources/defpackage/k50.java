package defpackage;

import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k50  reason: default package */
/* loaded from: classes.dex */
public final class k50 extends q0 {
    public final Thread Y;
    public final l62 Z;

    public k50(l61 l61Var, Thread thread, l62 l62Var) {
        super(l61Var, true);
        this.Y = thread;
        this.Z = l62Var;
    }

    @Override // defpackage.ed3
    public final void d(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.Y;
        if (!nb3.k(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
