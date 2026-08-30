package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n1  reason: default package */
/* loaded from: classes.dex */
public final class n1 extends l07 {
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;

    public n1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.n = atomicReferenceFieldUpdater;
        this.o = atomicReferenceFieldUpdater2;
        this.p = atomicReferenceFieldUpdater3;
        this.q = atomicReferenceFieldUpdater4;
        this.r = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.l07
    public final void l0(p1 p1Var, p1 p1Var2) {
        this.o.lazySet(p1Var, p1Var2);
    }

    @Override // defpackage.l07
    public final void m0(p1 p1Var, Thread thread) {
        this.n.lazySet(p1Var, thread);
    }

    @Override // defpackage.l07
    public final boolean v(q1 q1Var, m1 m1Var, m1 m1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(q1Var, m1Var, m1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(q1Var) == m1Var);
        return false;
    }

    @Override // defpackage.l07
    public final boolean w(q1 q1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(q1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(q1Var) == obj);
        return false;
    }

    @Override // defpackage.l07
    public final boolean x(q1 q1Var, p1 p1Var, p1 p1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(q1Var, p1Var, p1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(q1Var) == p1Var);
        return false;
    }
}
