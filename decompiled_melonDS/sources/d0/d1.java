package d0;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 implements j0.d1, c0 {
    public final Object A;
    public final c1 B;
    public int L;
    public final ah.e R;
    public boolean X;
    public final c Y;
    public j0.c1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public Executor f3354b0;

    /* renamed from: c0  reason: collision with root package name */
    public final LongSparseArray f3355c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LongSparseArray f3356d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f3357e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f3358f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f3359g0;

    public d1(int i2, int i10, int i11, int i12) {
        c cVar = new c(ImageReader.newInstance(i2, i10, i11, i12));
        this.A = new Object();
        this.B = new c1(this);
        this.L = 0;
        this.R = new ah.e(7, this);
        this.X = false;
        this.f3355c0 = new LongSparseArray();
        this.f3356d0 = new LongSparseArray();
        this.f3359g0 = new ArrayList();
        this.Y = cVar;
        this.f3357e0 = 0;
        this.f3358f0 = new ArrayList(n());
    }

    @Override // j0.d1
    public final int a() {
        int a10;
        synchronized (this.A) {
            a10 = this.Y.a();
        }
        return a10;
    }

    @Override // j0.d1
    public final void b(j0.c1 c1Var, Executor executor) {
        synchronized (this.A) {
            c1Var.getClass();
            this.Z = c1Var;
            executor.getClass();
            this.f3354b0 = executor;
            this.Y.b(this.R, executor);
        }
    }

    @Override // j0.d1
    public final int c() {
        int c4;
        synchronized (this.A) {
            c4 = this.Y.c();
        }
        return c4;
    }

    @Override // j0.d1
    public final void close() {
        synchronized (this.A) {
            try {
                if (this.X) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f3358f0);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((y0) obj).close();
                }
                this.f3358f0.clear();
                this.Y.close();
                this.X = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d0.c0
    public final void d(d0 d0Var) {
        synchronized (this.A) {
            g(d0Var);
        }
    }

    @Override // j0.d1
    public final y0 e() {
        synchronized (this.A) {
            try {
                if (this.f3358f0.isEmpty()) {
                    return null;
                }
                if (this.f3357e0 < this.f3358f0.size()) {
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    for (int i10 = 0; i10 < this.f3358f0.size() - 1; i10++) {
                        if (!this.f3359g0.contains(this.f3358f0.get(i10))) {
                            arrayList.add((y0) this.f3358f0.get(i10));
                        }
                    }
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((y0) obj).close();
                    }
                    int size2 = this.f3358f0.size();
                    ArrayList arrayList2 = this.f3358f0;
                    this.f3357e0 = size2;
                    y0 y0Var = (y0) arrayList2.get(size2 - 1);
                    this.f3359g0.add(y0Var);
                    return y0Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j0.d1
    public final int f() {
        int f8;
        synchronized (this.A) {
            f8 = this.Y.f();
        }
        return f8;
    }

    public final void g(d0 d0Var) {
        synchronized (this.A) {
            try {
                int indexOf = this.f3358f0.indexOf(d0Var);
                if (indexOf >= 0) {
                    this.f3358f0.remove(indexOf);
                    int i2 = this.f3357e0;
                    if (indexOf <= i2) {
                        this.f3357e0 = i2 - 1;
                    }
                }
                this.f3359g0.remove(d0Var);
                if (this.L > 0) {
                    j(this.Y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j0.d1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.A) {
            surface = this.Y.getSurface();
        }
        return surface;
    }

    @Override // j0.d1
    public final void h() {
        synchronized (this.A) {
            this.Y.h();
            this.Z = null;
            this.f3354b0 = null;
            this.L = 0;
        }
    }

    public final void i(l1 l1Var) {
        j0.c1 c1Var;
        Executor executor;
        synchronized (this.A) {
            try {
                if (this.f3358f0.size() < n()) {
                    l1Var.d(this);
                    this.f3358f0.add(l1Var);
                    c1Var = this.Z;
                    executor = this.f3354b0;
                } else {
                    aj.g.o("TAG", "Maximum image number reached.");
                    l1Var.close();
                    c1Var = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c1Var != null) {
            if (executor != null) {
                executor.execute(new ad.c(5, this, c1Var));
            } else {
                c1Var.c(this);
            }
        }
    }

    public final void j(j0.d1 d1Var) {
        y0 y0Var;
        synchronized (this.A) {
            try {
                if (this.X) {
                    return;
                }
                int size = this.f3356d0.size() + this.f3358f0.size();
                if (size >= d1Var.n()) {
                    aj.g.o("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        y0Var = d1Var.p();
                        if (y0Var != null) {
                            this.L--;
                            size++;
                            this.f3356d0.put(y0Var.q().c(), y0Var);
                            k();
                        }
                    } catch (IllegalStateException e6) {
                        aj.g.p("MetadataImageReader", "Failed to acquire next image.", e6);
                        y0Var = null;
                    }
                    if (y0Var == null || this.L <= 0) {
                        break;
                    }
                } while (size < d1Var.n());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        synchronized (this.A) {
            try {
                for (int size = this.f3355c0.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) this.f3355c0.valueAt(size);
                    long c4 = t0Var.c();
                    y0 y0Var = (y0) this.f3356d0.get(c4);
                    if (y0Var != null) {
                        this.f3356d0.remove(c4);
                        this.f3355c0.removeAt(size);
                        i(new l1(y0Var, null, t0Var));
                    }
                }
                l();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        synchronized (this.A) {
            try {
                if (this.f3356d0.size() != 0 && this.f3355c0.size() != 0) {
                    long keyAt = this.f3356d0.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f3355c0.keyAt(0);
                    p7.m.h(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f3356d0.size() - 1; size >= 0; size--) {
                            if (this.f3356d0.keyAt(size) < keyAt2) {
                                ((y0) this.f3356d0.valueAt(size)).close();
                                this.f3356d0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f3355c0.size() - 1; size2 >= 0; size2--) {
                            if (this.f3355c0.keyAt(size2) < keyAt) {
                                this.f3355c0.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // j0.d1
    public final int n() {
        int n10;
        synchronized (this.A) {
            n10 = this.Y.n();
        }
        return n10;
    }

    @Override // j0.d1
    public final y0 p() {
        synchronized (this.A) {
            try {
                if (this.f3358f0.isEmpty()) {
                    return null;
                }
                if (this.f3357e0 < this.f3358f0.size()) {
                    ArrayList arrayList = this.f3358f0;
                    int i2 = this.f3357e0;
                    this.f3357e0 = i2 + 1;
                    y0 y0Var = (y0) arrayList.get(i2);
                    this.f3359g0.add(y0Var);
                    return y0Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
