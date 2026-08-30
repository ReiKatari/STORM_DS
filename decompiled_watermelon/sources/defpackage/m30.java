package defpackage;

import java.util.concurrent.locks.LockSupport;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m30  reason: default package */
/* loaded from: classes.dex */
public final class m30 extends p0 {
    public final Thread Y;
    public final u12 Z;

    public m30(e31 e31Var, Thread thread, u12 u12Var) {
        super(e31Var, true);
        this.Y = thread;
        this.Z = u12Var;
    }

    @Override // defpackage.p63
    public final void e(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.Y;
        if (!b53.x(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
