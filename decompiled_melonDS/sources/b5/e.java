package b5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends r {

    /* renamed from: b0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2043b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2044c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2045d0;

    /* renamed from: e0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2046e0;

    /* renamed from: f0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2047f0;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f2043b0 = atomicReferenceFieldUpdater;
        this.f2044c0 = atomicReferenceFieldUpdater2;
        this.f2045d0 = atomicReferenceFieldUpdater3;
        this.f2046e0 = atomicReferenceFieldUpdater4;
        this.f2047f0 = atomicReferenceFieldUpdater5;
    }

    @Override // q8.r
    public final void O(g gVar, g gVar2) {
        this.f2044c0.lazySet(gVar, gVar2);
    }

    @Override // q8.r
    public final void P(g gVar, Thread thread) {
        this.f2043b0.lazySet(gVar, thread);
    }

    @Override // q8.r
    public final boolean l(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2046e0;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // q8.r
    public final boolean m(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2047f0;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // q8.r
    public final boolean n(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f2045d0;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
