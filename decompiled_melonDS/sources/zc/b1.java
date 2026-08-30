package zc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b1 extends ed.j implements i0, v0 {
    public f1 R;

    @Override // zc.v0
    public final boolean d() {
        return true;
    }

    @Override // zc.i0
    public final void dispose() {
        f1 i2 = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.A;
            Object obj = atomicReferenceFieldUpdater.get(i2);
            if (obj instanceof b1) {
                if (obj == this) {
                    k0 k0Var = x.f15040j;
                    while (!atomicReferenceFieldUpdater.compareAndSet(i2, obj, k0Var)) {
                        if (atomicReferenceFieldUpdater.get(i2) != obj) {
                            break;
                        }
                    }
                    return;
                }
                return;
            } else if (!(obj instanceof v0) || ((v0) obj).e() == null) {
                return;
            } else {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ed.j.A;
                    Object obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (!(obj2 instanceof ed.o)) {
                        if (obj2 == this) {
                            ed.j jVar = (ed.j) obj2;
                            return;
                        }
                        obj2.getClass();
                        ed.j jVar2 = (ed.j) obj2;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ed.j.L;
                        ed.o oVar = (ed.o) atomicReferenceFieldUpdater3.get(jVar2);
                        if (oVar == null) {
                            oVar = new ed.o(jVar2);
                            atomicReferenceFieldUpdater3.set(jVar2, oVar);
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                break;
                            }
                        }
                        jVar2.c();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // zc.v0
    public final h1 e() {
        return null;
    }

    public y0 getParent() {
        return i();
    }

    public final f1 i() {
        f1 f1Var = this.R;
        if (f1Var != null) {
            return f1Var;
        }
        nc.k.f("job");
        throw null;
    }

    public abstract boolean j();

    public abstract void k(Throwable th2);

    @Override // ed.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + x.n(this) + "[job@" + x.n(i()) + ']';
    }
}
