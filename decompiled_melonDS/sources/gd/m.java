package gd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5652b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5653c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5654d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5655e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f5656a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5653c;
        if (atomicIntegerFieldUpdater.get(this) - f5654d.get(this) == 127) {
            return iVar;
        }
        if (iVar.B) {
            f5655e.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f5656a;
            if (atomicReferenceArray.get(i2) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i2, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5654d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f5653c.get(this) == 0) {
                return null;
            }
            int i10 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (iVar = (i) this.f5656a.getAndSet(i10, null)) != null) {
                if (iVar.B) {
                    f5655e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i2, boolean z10) {
        int i10 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f5656a;
        i iVar = (i) atomicReferenceArray.get(i10);
        if (iVar == null || iVar.B != z10) {
            return null;
        }
        while (!atomicReferenceArray.compareAndSet(i10, iVar, null)) {
            if (atomicReferenceArray.get(i10) != iVar) {
                return null;
            }
        }
        if (z10) {
            f5655e.decrementAndGet(this);
        }
        return iVar;
    }
}
