package cc;

import a0.j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements c, ec.d {
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");
    public final c A;
    private volatile Object result;

    public i(c cVar, dc.a aVar) {
        this.A = cVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        dc.a aVar = dc.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return dc.a.COROUTINE_SUSPENDED;
        }
        if (obj == dc.a.RESUMED) {
            return dc.a.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof k)) {
            return obj;
        }
        throw ((k) obj).A;
    }

    @Override // ec.d
    public final ec.d f() {
        c cVar = this.A;
        if (cVar instanceof ec.d) {
            return (ec.d) cVar;
        }
        return null;
    }

    @Override // cc.c
    public final g g() {
        return this.A.g();
    }

    @Override // cc.c
    public final void h(Object obj) {
        while (true) {
            Object obj2 = this.result;
            dc.a aVar = dc.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
            if (obj2 == aVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
                dc.a aVar3 = dc.a.RESUMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                        break;
                    }
                }
                this.A.h(obj);
                return;
            }
            j.p("Already resumed");
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.A;
    }
}
