package gd;

import androidx.preference.Preference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: c0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5639c0 = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");
    public final m A;
    public final t B;
    public c L;
    public long R;
    public long X;
    public int Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ d f5640b0;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [nc.t, java.lang.Object] */
    public b(d dVar, int i2) {
        this.f5640b0 = dVar;
        setDaemon(true);
        setContextClassLoader(d.class.getClassLoader());
        this.A = new m();
        this.B = new Object();
        this.L = c.DORMANT;
        this.nextParkedWorker = d.f5644e0;
        int nanoTime = (int) System.nanoTime();
        this.Y = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final i a(boolean z10) {
        i e6;
        i e10;
        long j2;
        c cVar = this.L;
        c cVar2 = c.CPU_ACQUIRED;
        d dVar = this.f5640b0;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.A;
        if (cVar != cVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d.f5642c0;
            do {
                j2 = atomicLongFieldUpdater.get(dVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5652b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.B) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i2 = m.f5654d.get(mVar);
                    int i10 = m.f5653c.get(mVar);
                    while (true) {
                        if (i2 != i10 && m.f5655e.get(mVar) != 0) {
                            i10--;
                            i c4 = mVar.c(i10, true);
                            if (c4 != null) {
                                iVar = c4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) dVar.Y.d();
                        if (iVar3 == null) {
                            return i(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!d.f5642c0.compareAndSet(dVar, j2, j2 - 4398046511104L));
            this.L = c.CPU_ACQUIRED;
        }
        if (z10) {
            if (d(dVar.A * 2) != 0) {
                z11 = false;
            }
            if (z11 && (e10 = e()) != null) {
                return e10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f5652b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (e6 = e()) != null) {
                return e6;
            }
        } else {
            i e11 = e();
            if (e11 != null) {
                return e11;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i10 = this.Y;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.Y = i13;
        int i14 = i2 - 1;
        if ((i14 & i2) == 0) {
            return i13 & i14;
        }
        return (i13 & Preference.DEFAULT_ORDER) % i2;
    }

    public final i e() {
        int d4 = d(2);
        d dVar = this.f5640b0;
        g gVar = dVar.Y;
        g gVar2 = dVar.X;
        if (d4 == 0) {
            i iVar = (i) gVar2.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) gVar.d();
        }
        i iVar2 = (i) gVar.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) gVar2.d();
    }

    public final void f(int i2) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5640b0.R);
        sb2.append("-worker-");
        if (i2 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i2);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        boolean z10;
        c cVar2 = this.L;
        if (cVar2 == c.CPU_ACQUIRED) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d.f5642c0.addAndGet(this.f5640b0, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.L = cVar;
        }
        return z10;
    }

    public final i i(int i2) {
        boolean z10;
        long j2;
        i iVar;
        long j10;
        long j11;
        i iVar2;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f5642c0;
        d dVar = this.f5640b0;
        int i11 = (int) (atomicLongFieldUpdater.get(dVar) & 2097151);
        i iVar3 = null;
        if (i11 < 2) {
            return null;
        }
        int d4 = d(i11);
        int i12 = 0;
        long j12 = Long.MAX_VALUE;
        while (i12 < i11) {
            d4++;
            if (d4 > i11) {
                d4 = 1;
            }
            b bVar = (b) dVar.Z.b(d4);
            if (bVar != null && bVar != this) {
                m mVar = bVar.A;
                if (i2 == 3) {
                    iVar = mVar.b();
                    j2 = 0;
                } else {
                    mVar.getClass();
                    int i13 = m.f5654d.get(mVar);
                    int i14 = m.f5653c.get(mVar);
                    if (i2 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i13 != i14) {
                            j2 = 0;
                            if (!z10 || m.f5655e.get(mVar) != 0) {
                                int i15 = i13 + 1;
                                iVar = mVar.c(i13, z10);
                                if (iVar != null) {
                                    break;
                                }
                                i13 = i15;
                            } else {
                                break;
                            }
                        } else {
                            j2 = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                t tVar = this.B;
                if (iVar != null) {
                    tVar.A = iVar;
                    iVar2 = iVar3;
                    j11 = -1;
                    j10 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5652b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j10 = -1;
                            break;
                        }
                        j10 = -1;
                        if (iVar4.B) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        if ((i10 & i2) == 0) {
                            break;
                        }
                        k.f5651f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.A;
                        long j13 = k.f5647b;
                        if (nanoTime < j13) {
                            j11 = j13 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                tVar.A = iVar4;
                                j11 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j11 = -2;
                    iVar2 = iVar3;
                }
                if (j11 == j10) {
                    i iVar5 = (i) tVar.A;
                    tVar.A = iVar2;
                    return iVar5;
                } else if (j11 > j2) {
                    j12 = Math.min(j12, j11);
                }
            }
            i12++;
            iVar3 = null;
        }
        if (j12 == Long.MAX_VALUE) {
            j12 = 0;
        }
        this.X = j12;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.b.run():void");
    }
}
