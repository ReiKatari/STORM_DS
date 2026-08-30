package ed;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4458e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4459f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g  reason: collision with root package name */
    public static final a0.c f4460g = new a0.c("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f4461a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4462b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4463c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4464d;

    public m(int i2, boolean z10) {
        this.f4461a = i2;
        this.f4462b = z10;
        int i10 = i2 - 1;
        this.f4463c = i10;
        this.f4464d = new AtomicReferenceArray(i2);
        if (i10 <= 1073741823) {
            if ((i2 & i10) == 0) {
                return;
            }
            a0.j.p("Check failed.");
            throw null;
        }
        a0.j.p("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4459f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                if ((2305843009213693952L & j2) != 0) {
                    return 2;
                }
                return 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i10 = (int) ((1152921503533105152L & j2) >> 30);
            int i11 = this.f4463c;
            if (((i10 + 2) & i11) != (i2 & i11)) {
                boolean z10 = this.f4462b;
                AtomicReferenceArray atomicReferenceArray = this.f4464d;
                if (!z10 && atomicReferenceArray.get(i10 & i11) != null) {
                    int i12 = this.f4461a;
                    if (i12 < 1024 || ((i10 - i2) & 1073741823) > (i12 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f4459f.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i10 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i10 & i11, obj);
                        m mVar = this;
                        while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = mVar.f4464d;
                            int i13 = mVar.f4463c & i10;
                            Object obj2 = atomicReferenceArray2.get(i13);
                            if ((obj2 instanceof l) && ((l) obj2).f4457a == i10) {
                                atomicReferenceArray2.set(i13, obj);
                                continue;
                            } else {
                                mVar = null;
                                continue;
                            }
                            if (mVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f4459f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f4459f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j2;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j2, j10)) {
                j2 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4458e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f4461a * 2, mVar.f4462b);
            int i2 = (int) (1073741823 & j2);
            int i10 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i11 = mVar.f4463c;
                int i12 = i2 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = mVar.f4464d.get(i12);
                if (obj == null) {
                    obj = new l(i2);
                }
                mVar3.f4464d.set(mVar3.f4463c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4459f;
            long j2 = atomicLongFieldUpdater.get(mVar);
            if ((j2 & 1152921504606846976L) != 0) {
                return f4460g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i10 = mVar.f4463c;
            int i11 = i2 & i10;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i10) == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.f4464d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z10 = mVar.f4462b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else if (obj instanceof l) {
                break;
            } else {
                long j10 = (i2 + 1) & 1073741823;
                if (f4459f.compareAndSet(mVar, j2, (j2 & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                mVar = this;
                if (z10) {
                    while (true) {
                        long j11 = atomicLongFieldUpdater.get(mVar);
                        int i12 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f4459f.compareAndSet(mVar2, j11, (j11 & (-1073741824)) | j10)) {
                                mVar2.f4464d.set(i12 & mVar2.f4463c, null);
                                mVar = null;
                            } else {
                                mVar = mVar2;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
