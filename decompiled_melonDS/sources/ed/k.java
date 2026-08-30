package ed;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4456a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4456a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a10 = mVar.a(runnable);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                m c4 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c4) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4456a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c4 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c4) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f4456a.get(this);
        mVar.getClass();
        long j2 = m.f4459f.get(mVar);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4456a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d4 = mVar.d();
            if (d4 != m.f4460g) {
                return d4;
            }
            m c4 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c4) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
