package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu4  reason: default package */
/* loaded from: classes.dex */
public final class tu4 {
    public final ey0 a;
    public final zx0 b;
    public final xq2 c;
    public final eo2 d;
    public final boolean e;
    public final cg7 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(vu4.InitialPending);
    public long i = kj2.s();
    public ka4 j;
    public final jb1 k;
    public final jf5 l;

    public tu4(ey0 ey0Var, zx0 zx0Var, xq2 xq2Var, ma4 ma4Var, eo2 eo2Var, boolean z, cg7 cg7Var, Object obj) {
        this.a = ey0Var;
        this.b = zx0Var;
        this.c = xq2Var;
        this.d = eo2Var;
        this.e = z;
        this.f = cg7Var;
        this.g = obj;
        ka4 ka4Var = c66.a;
        ka4Var.getClass();
        this.j = ka4Var;
        jb1 jb1Var = new jb1();
        jb1Var.g(ma4Var, xq2Var.C());
        this.k = jb1Var;
        this.l = new jf5(cg7Var.L);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (su4.a[((vu4) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    vu4 vu4Var = vu4.ApplyPending;
                    vu4 vu4Var2 = vu4.Applied;
                    while (!atomicReference.compareAndSet(vu4Var, vu4Var2)) {
                        if (atomicReference.get() != vu4Var) {
                            r05.b("Unexpected state change from: " + vu4Var + " to: " + vu4Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            atomicReference.set(vu4.Invalid);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.m0 = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        if (((vu4) this.h.get()).compareTo(vu4.ApplyPending) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        boolean z;
        vu4 vu4Var = vu4.RecomposePending;
        vu4 vu4Var2 = vu4.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.h;
            if (atomicReference.compareAndSet(vu4Var, vu4Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != vu4Var) {
                z = false;
                break;
            }
        }
        if (!z) {
            r05.b("Unexpected state change from: " + vu4Var + " to: " + vu4Var2 + '.');
        }
    }

    public final boolean e(kh6 kh6Var) {
        AtomicReference atomicReference = this.h;
        try {
            int i = su4.a[((vu4) atomicReference.get()).ordinal()];
            ey0 ey0Var = this.a;
            zx0 zx0Var = this.b;
            switch (i) {
                case 1:
                    xq2 xq2Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        xq2Var.z = 0;
                        xq2Var.y = true;
                    }
                    this.j = zx0Var.b(ey0Var, kh6Var, this.d);
                    if (z) {
                        xq2Var.u();
                    }
                    vu4 vu4Var = vu4.InitialPending;
                    vu4 vu4Var2 = vu4.RecomposePending;
                    while (true) {
                        if (!atomicReference.compareAndSet(vu4Var, vu4Var2)) {
                            if (atomicReference.get() != vu4Var) {
                                r05.b("Unexpected state change from: " + vu4Var + " to: " + vu4Var2 + '.');
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                        break;
                    }
                    break;
                case 2:
                    vu4 vu4Var3 = vu4.RecomposePending;
                    vu4 vu4Var4 = vu4.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(vu4Var3, vu4Var4)) {
                            if (atomicReference.get() != vu4Var3) {
                                r05.b("Unexpected state change from: " + vu4Var3 + " to: " + vu4Var4 + '.');
                            }
                        }
                    }
                    long j = this.i;
                    this.i = kj2.s();
                    this.j = zx0Var.n(ey0Var, kh6Var, this.j);
                    this.i = j;
                    vu4 vu4Var5 = vu4.Recomposing;
                    vu4 vu4Var6 = vu4.RecomposePending;
                    while (true) {
                        if (!atomicReference.compareAndSet(vu4Var5, vu4Var6)) {
                            if (atomicReference.get() != vu4Var5) {
                                r05.b("Unexpected state change from: " + vu4Var5 + " to: " + vu4Var6 + '.');
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                        break;
                    }
                    break;
                case 3:
                    tx0.b("Recursive call to resume()");
                    throw new RuntimeException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new RuntimeException();
            }
            return c();
        } catch (Exception e) {
            atomicReference.set(vu4.Invalid);
            throw e;
        }
    }
}
