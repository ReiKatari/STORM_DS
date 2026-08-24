package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o1  reason: default package */
/* loaded from: classes.dex */
public final class o1 extends q60 {
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;

    public o1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.p = atomicReferenceFieldUpdater;
        this.q = atomicReferenceFieldUpdater2;
        this.r = atomicReferenceFieldUpdater3;
        this.s = atomicReferenceFieldUpdater4;
        this.t = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.q60
    public final void S(q1 q1Var, q1 q1Var2) {
        this.q.lazySet(q1Var, q1Var2);
    }

    @Override // defpackage.q60
    public final void T(q1 q1Var, Thread thread) {
        this.p.lazySet(q1Var, thread);
    }

    @Override // defpackage.q60
    public final boolean m(r1 r1Var, n1 n1Var, n1 n1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(r1Var, n1Var, n1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r1Var) == n1Var);
        return false;
    }

    @Override // defpackage.q60
    public final boolean n(r1 r1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(r1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r1Var) == obj);
        return false;
    }

    @Override // defpackage.q60
    public final boolean o(r1 r1Var, q1 q1Var, q1 q1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(r1Var, q1Var, q1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r1Var) == q1Var);
        return false;
    }
}
