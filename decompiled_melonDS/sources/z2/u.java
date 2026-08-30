package z2;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n2.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f14945a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14947c;

    /* renamed from: h  reason: collision with root package name */
    public ah.e f14952h;

    /* renamed from: i  reason: collision with root package name */
    public t f14953i;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f14946b = new AtomicReference(null);

    /* renamed from: d  reason: collision with root package name */
    public final y2.b f14948d = new y2.b(5, this);

    /* renamed from: e  reason: collision with root package name */
    public final mh.z f14949e = new mh.z(29, this);

    /* renamed from: f  reason: collision with root package name */
    public final p2.b f14950f = new p2.b(new t[16]);

    /* renamed from: g  reason: collision with root package name */
    public final Object f14951g = new Object();

    /* renamed from: j  reason: collision with root package name */
    public long f14954j = -1;

    public u(mc.l lVar) {
        this.f14945a = lVar;
    }

    public final void a() {
        synchronized (this.f14951g) {
            p2.b bVar = this.f14950f;
            Object[] objArr = bVar.A;
            int i2 = bVar.L;
            for (int i10 = 0; i10 < i2; i10++) {
                t tVar = (t) objArr[i10];
                tVar.f14937e.a();
                tVar.f14938f.a();
                tVar.f14944l.a();
                tVar.m.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        boolean z10;
        Set set;
        Set set2;
        synchronized (this.f14951g) {
            z10 = this.f14947c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f14946b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else if (obj instanceof List) {
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                } else {
                    n2.t.b("Unexpected notification");
                    wa.b.a();
                    return false;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z11;
            }
            synchronized (this.f14951g) {
                p2.b bVar = this.f14950f;
                Object[] objArr = bVar.A;
                int i2 = bVar.L;
                for (int i10 = 0; i10 < i2; i10++) {
                    if (!((t) objArr[i10]).a(set) && !z11) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                }
            }
        }
    }

    public final void c(Object obj, mc.l lVar, mc.a aVar) {
        b bVar;
        t tVar;
        t tVar2;
        boolean z10;
        a1.d0 d0Var;
        f d0Var2;
        f j2;
        Object obj2;
        Object obj3;
        long[] jArr;
        int i2;
        long[] jArr2;
        long j10;
        boolean z11;
        synchronized (this.f14951g) {
            p2.b bVar2 = this.f14950f;
            Object[] objArr = bVar2.A;
            int i10 = bVar2.L;
            int i11 = 0;
            while (true) {
                bVar = null;
                if (i11 < i10) {
                    tVar = objArr[i11];
                    if (((t) tVar).f14933a == lVar) {
                        break;
                    }
                    i11++;
                } else {
                    tVar = null;
                    break;
                }
            }
            tVar2 = tVar;
            z10 = true;
            if (tVar2 == null) {
                lVar.getClass();
                nc.w.b(1, lVar);
                tVar2 = new t(lVar);
                bVar2.b(tVar2);
            }
        }
        t tVar3 = this.f14953i;
        long j11 = this.f14954j;
        if (j11 != -1 && j11 != v2.h.b()) {
            l1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j11 + "), currentThread={id=" + v2.h.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f14953i = tVar2;
            this.f14954j = v2.h.b();
            mh.z zVar = this.f14949e;
            Object obj4 = tVar2.f14934b;
            a1.d0 d0Var3 = tVar2.f14935c;
            int i12 = tVar2.f14936d;
            tVar2.f14934b = obj;
            tVar2.f14935c = (a1.d0) tVar2.f14938f.g(obj);
            if (tVar2.f14936d == -1) {
                tVar2.f14936d = Long.hashCode(l.j().g());
            }
            n2.q qVar = tVar2.f14941i;
            p2.b p10 = n2.s.p();
            try {
                p10.b(qVar);
                if (zVar == null) {
                    aVar.b();
                    d0Var = d0Var3;
                } else {
                    f fVar = (f) l.f14918b.d();
                    if (fVar instanceof d0) {
                        d0Var = d0Var3;
                        if (((d0) fVar).f14902t == v2.h.b()) {
                            mc.l lVar2 = ((d0) fVar).f14900r;
                            mc.l lVar3 = ((d0) fVar).f14901s;
                            ((d0) fVar).f14900r = l.k(zVar, lVar2, true);
                            ((d0) fVar).f14901s = lVar3;
                            aVar.b();
                            ((d0) fVar).f14900r = lVar2;
                            ((d0) fVar).f14901s = lVar3;
                        }
                    } else {
                        d0Var = d0Var3;
                    }
                    try {
                        try {
                            if (fVar != null && !(fVar instanceof b)) {
                                d0Var2 = fVar.u(zVar);
                                j2 = d0Var2.j();
                                aVar.b();
                                f.q(j2);
                                d0Var2.c();
                            }
                            aVar.b();
                            f.q(j2);
                            d0Var2.c();
                        } catch (Throwable th2) {
                            try {
                                f.q(j2);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    d0Var2.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    p10.k(p10.L - 1);
                                    throw th;
                                }
                            }
                        }
                        j2 = d0Var2.j();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    if (fVar instanceof b) {
                        bVar = (b) fVar;
                    }
                    d0Var2 = new d0(bVar, zVar, null, true, false);
                }
                p10.k(p10.L - 1);
                Object obj5 = tVar2.f14934b;
                obj5.getClass();
                int i13 = tVar2.f14936d;
                a1.d0 d0Var4 = tVar2.f14935c;
                if (d0Var4 != null) {
                    long[] jArr3 = d0Var4.f32a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j12 = jArr3[i14];
                            boolean z12 = z10;
                            obj3 = obj4;
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j12 & 255) < 128) {
                                        i2 = i16;
                                        int i17 = (i14 << 3) + i2;
                                        jArr2 = jArr3;
                                        Object obj6 = d0Var4.f33b[i17];
                                        j10 = j12;
                                        if (d0Var4.f34c[i17] != i13) {
                                            z11 = z12;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            tVar2.c(obj5, obj6);
                                        }
                                        if (z11) {
                                            d0Var4.f(i17);
                                        }
                                    } else {
                                        i2 = i16;
                                        jArr2 = jArr3;
                                        j10 = j12;
                                    }
                                    j12 = j10 >> 8;
                                    i16 = i2 + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i15 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i14 == length) {
                                break;
                            }
                            i14++;
                            z10 = z12;
                            obj4 = obj3;
                            jArr3 = jArr;
                        }
                        obj2 = obj3;
                        tVar2.f14934b = obj2;
                        tVar2.f14935c = d0Var;
                        tVar2.f14936d = i12;
                        this.f14953i = tVar3;
                        this.f14954j = j11;
                    }
                }
                obj2 = obj4;
                tVar2.f14934b = obj2;
                tVar2.f14935c = d0Var;
                tVar2.f14936d = i12;
                this.f14953i = tVar3;
                this.f14954j = j11;
            } catch (Throwable th6) {
                th = th6;
            }
        } finally {
            this.f14953i = tVar3;
            this.f14954j = j11;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    public final void d() {
        y2.b bVar = this.f14948d;
        l.e(l.f14917a);
        synchronized (l.f14919c) {
            l.f14924h = zb.l.d0(l.f14924h, bVar);
        }
        this.f14952h = new ah.e(21, bVar);
    }
}
