package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc3  reason: default package */
/* loaded from: classes.dex */
public final class bc3 extends uc3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e0 = AtomicIntegerFieldUpdater.newUpdater(bc3.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final a0 d0;

    public bc3(a0 a0Var) {
        this.d0 = a0Var;
    }

    @Override // defpackage.uc3
    public final boolean q() {
        return true;
    }

    @Override // defpackage.uc3
    public final void r(Throwable th) {
        if (e0.compareAndSet(this, 0, 1)) {
            this.d0.g(th);
        }
    }
}
