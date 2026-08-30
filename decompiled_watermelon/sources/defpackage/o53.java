package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o53  reason: default package */
/* loaded from: classes.dex */
public final class o53 extends f63 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d0 = AtomicIntegerFieldUpdater.newUpdater(o53.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final z c0;

    public o53(z zVar) {
        this.c0 = zVar;
    }

    @Override // defpackage.f63
    public final boolean q() {
        return true;
    }

    @Override // defpackage.f63
    public final void r(Throwable th) {
        if (d0.compareAndSet(this, 0, 1)) {
            this.c0.n(th);
        }
    }
}
