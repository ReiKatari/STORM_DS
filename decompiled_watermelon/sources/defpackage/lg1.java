package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lg1  reason: default package */
/* loaded from: classes.dex */
public final class lg1 extends fv5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z = AtomicIntegerFieldUpdater.newUpdater(lg1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.fv5, defpackage.p63
    public final void e(Object obj) {
        f(obj);
    }

    @Override // defpackage.fv5, defpackage.p63
    public final void f(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = Z;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    kg1.a(nk2.J(this.Y), b53.d0(obj));
                    return;
                } else {
                    i.n("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
