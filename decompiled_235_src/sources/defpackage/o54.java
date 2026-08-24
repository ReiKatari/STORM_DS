package defpackage;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o54  reason: default package */
/* loaded from: classes.dex */
public final class o54 implements v23, fk2 {
    public final Object A;
    public final ce0 B;
    public int L;
    public final h61 R;
    public boolean X;
    public final ci Y;
    public u23 Z;
    public Executor d0;
    public final LongSparseArray e0;
    public final LongSparseArray f0;
    public int g0;
    public final ArrayList h0;
    public final ArrayList i0;

    public o54(int i, int i2, int i3, int i4) {
        ci ciVar = new ci(ImageReader.newInstance(i, i2, i3, i4));
        this.A = new Object();
        this.B = new ce0(this);
        this.L = 0;
        this.R = new h61(this, 15);
        this.X = false;
        this.e0 = new LongSparseArray();
        this.f0 = new LongSparseArray();
        this.i0 = new ArrayList();
        this.Y = ciVar;
        this.g0 = 0;
        this.h0 = new ArrayList(f());
    }

    @Override // defpackage.v23
    public final s23 a() {
        synchronized (this.A) {
            try {
                if (this.h0.isEmpty()) {
                    return null;
                }
                if (this.g0 < this.h0.size()) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (int i2 = 0; i2 < this.h0.size() - 1; i2++) {
                        if (!this.i0.contains(this.h0.get(i2))) {
                            arrayList.add((s23) this.h0.get(i2));
                        }
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((s23) obj).close();
                    }
                    int size2 = this.h0.size();
                    ArrayList arrayList2 = this.h0;
                    this.g0 = size2;
                    s23 s23Var = (s23) arrayList2.get(size2 - 1);
                    this.i0.add(s23Var);
                    return s23Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v23
    public final int b() {
        int b;
        synchronized (this.A) {
            b = this.Y.b();
        }
        return b;
    }

    @Override // defpackage.fk2
    public final void c(gk2 gk2Var) {
        synchronized (this.A) {
            g(gk2Var);
        }
    }

    @Override // defpackage.v23
    public final void close() {
        synchronized (this.A) {
            try {
                if (this.X) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.h0);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((s23) obj).close();
                }
                this.h0.clear();
                this.Y.close();
                this.X = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v23
    public final void d() {
        synchronized (this.A) {
            this.Y.d();
            this.Z = null;
            this.d0 = null;
            this.L = 0;
        }
    }

    @Override // defpackage.v23
    public final void e(u23 u23Var, Executor executor) {
        synchronized (this.A) {
            u23Var.getClass();
            this.Z = u23Var;
            executor.getClass();
            this.d0 = executor;
            this.Y.e(this.R, executor);
        }
    }

    @Override // defpackage.v23
    public final int f() {
        int f;
        synchronized (this.A) {
            f = this.Y.f();
        }
        return f;
    }

    public final void g(gk2 gk2Var) {
        synchronized (this.A) {
            try {
                int indexOf = this.h0.indexOf(gk2Var);
                if (indexOf >= 0) {
                    this.h0.remove(indexOf);
                    int i = this.g0;
                    if (indexOf <= i) {
                        this.g0 = i - 1;
                    }
                }
                this.i0.remove(gk2Var);
                if (this.L > 0) {
                    i(this.Y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v23
    public final int getHeight() {
        int height;
        synchronized (this.A) {
            height = this.Y.getHeight();
        }
        return height;
    }

    @Override // defpackage.v23
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.A) {
            surface = this.Y.getSurface();
        }
        return surface;
    }

    @Override // defpackage.v23
    public final int getWidth() {
        int width;
        synchronized (this.A) {
            width = this.Y.getWidth();
        }
        return width;
    }

    public final void h(ed6 ed6Var) {
        u23 u23Var;
        Executor executor;
        synchronized (this.A) {
            try {
                if (this.h0.size() < f()) {
                    ed6Var.e(this);
                    this.h0.add(ed6Var);
                    u23Var = this.Z;
                    executor = this.d0;
                } else {
                    kj2.t("TAG", "Maximum image number reached.");
                    ed6Var.close();
                    u23Var = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (u23Var != null) {
            if (executor != null) {
                executor.execute(new mf(28, this, u23Var));
            } else {
                u23Var.b(this);
            }
        }
    }

    public final void i(v23 v23Var) {
        s23 s23Var;
        synchronized (this.A) {
            try {
                if (this.X) {
                    return;
                }
                int size = this.f0.size() + this.h0.size();
                if (size >= v23Var.f()) {
                    kj2.t("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        s23Var = v23Var.j();
                        if (s23Var != null) {
                            this.L--;
                            size++;
                            this.f0.put(s23Var.S().c(), s23Var);
                            k();
                        }
                    } catch (IllegalStateException e) {
                        String c0 = kj2.c0("MetadataImageReader");
                        if (kj2.J(3, c0)) {
                            Log.d(c0, "Failed to acquire next image.", e);
                        }
                        s23Var = null;
                    }
                    if (s23Var == null || this.L <= 0) {
                        break;
                    }
                } while (size < v23Var.f());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v23
    public final s23 j() {
        synchronized (this.A) {
            try {
                if (this.h0.isEmpty()) {
                    return null;
                }
                if (this.g0 < this.h0.size()) {
                    ArrayList arrayList = this.h0;
                    int i = this.g0;
                    this.g0 = i + 1;
                    s23 s23Var = (s23) arrayList.get(i);
                    this.i0.add(s23Var);
                    return s23Var;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.A) {
            try {
                for (int size = this.e0.size() - 1; size >= 0; size--) {
                    i23 i23Var = (i23) this.e0.valueAt(size);
                    long c = i23Var.c();
                    s23 s23Var = (s23) this.f0.get(c);
                    if (s23Var != null) {
                        this.f0.remove(c);
                        this.e0.removeAt(size);
                        h(new ed6(s23Var, null, i23Var));
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
                if (this.f0.size() != 0 && this.e0.size() != 0) {
                    long keyAt = this.f0.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.e0.keyAt(0);
                    np2.t(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f0.size() - 1; size >= 0; size--) {
                            if (this.f0.keyAt(size) < keyAt2) {
                                ((s23) this.f0.valueAt(size)).close();
                                this.f0.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.e0.size() - 1; size2 >= 0; size2--) {
                            if (this.e0.keyAt(size2) < keyAt) {
                                this.e0.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
