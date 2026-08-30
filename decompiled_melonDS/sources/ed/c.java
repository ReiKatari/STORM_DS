package ed;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(r rVar) {
        this._prev$volatile = rVar;
    }

    public final void b() {
        B.set(this, null);
    }

    public final c c() {
        Object obj = A.get(this);
        if (obj == b.f4445a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c cVar;
        c c4;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            c cVar2 = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar2 != null && cVar2.d()) {
                cVar2 = (c) atomicReferenceFieldUpdater.get(cVar2);
            }
            c c10 = c();
            c10.getClass();
            while (c10.d() && (c4 = c10.c()) != null) {
                c10 = c4;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c10);
                if (((c) obj) == null) {
                    cVar = null;
                } else {
                    cVar = cVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c10, obj, cVar)) {
                    if (atomicReferenceFieldUpdater.get(c10) != obj) {
                        break;
                    }
                }
            }
            if (cVar2 != null) {
                A.set(cVar2, c10);
            }
            if (!c10.d() || c10.c() == null) {
                if (cVar2 == null || !cVar2.d()) {
                    return;
                }
            }
        }
    }
}
