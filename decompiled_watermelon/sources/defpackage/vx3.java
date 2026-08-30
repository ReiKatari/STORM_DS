package defpackage;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vx3  reason: default package */
/* loaded from: classes.dex */
public final class vx3 implements rw2, gf2 {
    public final Object A;
    public final tb0 B;
    public int L;
    public final a31 R;
    public boolean X;
    public final qh Y;
    public qw2 Z;
    public Executor c0;
    public final LongSparseArray d0;
    public final LongSparseArray e0;
    public int f0;
    public final ArrayList g0;
    public final ArrayList h0;

    public vx3(int i, int i2, int i3, int i4) {
        qh qhVar = new qh(ImageReader.newInstance(i, i2, i3, i4));
        this.A = new Object();
        this.B = new tb0(this);
        this.L = 0;
        this.R = new a31(16, this);
        this.X = false;
        this.d0 = new LongSparseArray();
        this.e0 = new LongSparseArray();
        this.h0 = new ArrayList();
        this.Y = qhVar;
        this.f0 = 0;
        this.g0 = new ArrayList(n());
    }

    @Override // defpackage.rw2
    public final int a() {
        int a;
        synchronized (this.A) {
            a = this.Y.a();
        }
        return a;
    }

    @Override // defpackage.rw2
    public final ow2 b() {
        synchronized (this.A) {
            try {
                if (this.g0.isEmpty()) {
                    return null;
                }
                if (this.f0 < this.g0.size()) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (int i2 = 0; i2 < this.g0.size() - 1; i2++) {
                        if (!this.h0.contains(this.g0.get(i2))) {
                            arrayList.add((ow2) this.g0.get(i2));
                        }
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ow2) obj).close();
                    }
                    int size2 = this.g0.size();
                    ArrayList arrayList2 = this.g0;
                    this.f0 = size2;
                    ow2 ow2Var = (ow2) arrayList2.get(size2 - 1);
                    this.h0.add(ow2Var);
                    return ow2Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rw2
    public final int c() {
        int c;
        synchronized (this.A) {
            c = this.Y.c();
        }
        return c;
    }

    @Override // defpackage.rw2
    public final void close() {
        synchronized (this.A) {
            try {
                if (this.X) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.g0);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ow2) obj).close();
                }
                this.g0.clear();
                this.Y.close();
                this.X = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rw2
    public final int d() {
        int d;
        synchronized (this.A) {
            d = this.Y.d();
        }
        return d;
    }

    @Override // defpackage.gf2
    public final void e(hf2 hf2Var) {
        synchronized (this.A) {
            h(hf2Var);
        }
    }

    @Override // defpackage.rw2
    public final void f() {
        synchronized (this.A) {
            this.Y.f();
            this.Z = null;
            this.c0 = null;
            this.L = 0;
        }
    }

    @Override // defpackage.rw2
    public final void g(qw2 qw2Var, Executor executor) {
        synchronized (this.A) {
            qw2Var.getClass();
            this.Z = qw2Var;
            executor.getClass();
            this.c0 = executor;
            this.Y.g(this.R, executor);
        }
    }

    @Override // defpackage.rw2
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.A) {
            surface = this.Y.getSurface();
        }
        return surface;
    }

    public final void h(hf2 hf2Var) {
        synchronized (this.A) {
            try {
                int indexOf = this.g0.indexOf(hf2Var);
                if (indexOf >= 0) {
                    this.g0.remove(indexOf);
                    int i = this.f0;
                    if (indexOf <= i) {
                        this.f0 = i - 1;
                    }
                }
                this.h0.remove(hf2Var);
                if (this.L > 0) {
                    j(this.Y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(q16 q16Var) {
        qw2 qw2Var;
        Executor executor;
        synchronized (this.A) {
            try {
                if (this.g0.size() < n()) {
                    q16Var.d(this);
                    this.g0.add(q16Var);
                    qw2Var = this.Z;
                    executor = this.c0;
                } else {
                    ve2.v("TAG", "Maximum image number reached.");
                    q16Var.close();
                    qw2Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qw2Var != null) {
            if (executor != null) {
                executor.execute(new we(28, this, qw2Var));
            } else {
                qw2Var.b(this);
            }
        }
    }

    public final void j(rw2 rw2Var) {
        ow2 ow2Var;
        synchronized (this.A) {
            try {
                if (this.X) {
                    return;
                }
                int size = this.e0.size() + this.g0.size();
                if (size >= rw2Var.n()) {
                    ve2.v("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        ow2Var = rw2Var.p();
                        if (ow2Var != null) {
                            this.L--;
                            size++;
                            this.e0.put(ow2Var.s().c(), ow2Var);
                            k();
                        }
                    } catch (IllegalStateException e) {
                        String a0 = ve2.a0("MetadataImageReader");
                        if (ve2.G(3, a0)) {
                            Log.d(a0, "Failed to acquire next image.", e);
                        }
                        ow2Var = null;
                    }
                    if (ow2Var == null || this.L <= 0) {
                        break;
                    }
                } while (size < rw2Var.n());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.A) {
            try {
                for (int size = this.d0.size() - 1; size >= 0; size--) {
                    ew2 ew2Var = (ew2) this.d0.valueAt(size);
                    long c = ew2Var.c();
                    ow2 ow2Var = (ow2) this.e0.get(c);
                    if (ow2Var != null) {
                        this.e0.remove(c);
                        this.d0.removeAt(size);
                        i(new q16(ow2Var, null, ew2Var));
                    }
                }
                l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        synchronized (this.A) {
            try {
                if (this.e0.size() != 0 && this.d0.size() != 0) {
                    long keyAt = this.e0.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.d0.keyAt(0);
                    nl2.z(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.e0.size() - 1; size >= 0; size--) {
                            if (this.e0.keyAt(size) < keyAt2) {
                                ((ow2) this.e0.valueAt(size)).close();
                                this.e0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.d0.size() - 1; size2 >= 0; size2--) {
                            if (this.d0.keyAt(size2) < keyAt) {
                                this.d0.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.rw2
    public final int n() {
        int n;
        synchronized (this.A) {
            n = this.Y.n();
        }
        return n;
    }

    @Override // defpackage.rw2
    public final ow2 p() {
        synchronized (this.A) {
            try {
                if (this.g0.isEmpty()) {
                    return null;
                }
                if (this.f0 < this.g0.size()) {
                    ArrayList arrayList = this.g0;
                    int i = this.f0;
                    this.f0 = i + 1;
                    ow2 ow2Var = (ow2) arrayList.get(i);
                    this.h0.add(ow2Var);
                    return ow2Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
