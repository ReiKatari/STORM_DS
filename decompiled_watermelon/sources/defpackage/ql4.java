package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ql4  reason: default package */
/* loaded from: classes.dex */
public final class ql4 {
    public final iv0 a;
    public final dv0 b;
    public final sk2 c;
    public final aj2 d;
    public final boolean e;
    public final h27 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(sl4.InitialPending);
    public long i = jk2.s();
    public e24 j;
    public final r8 k;
    public final t55 l;

    public ql4(iv0 iv0Var, dv0 dv0Var, sk2 sk2Var, g24 g24Var, aj2 aj2Var, boolean z, h27 h27Var, Object obj) {
        this.a = iv0Var;
        this.b = dv0Var;
        this.c = sk2Var;
        this.d = aj2Var;
        this.e = z;
        this.f = h27Var;
        this.g = obj;
        e24 e24Var = xu5.a;
        e24Var.getClass();
        this.j = e24Var;
        r8 r8Var = new r8();
        r8Var.g(g24Var, sk2Var.z());
        this.k = r8Var;
        this.l = new t55(h27Var.L);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (pl4.a[((sl4) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    sl4 sl4Var = sl4.ApplyPending;
                    sl4 sl4Var2 = sl4.Applied;
                    while (!atomicReference.compareAndSet(sl4Var, sl4Var2)) {
                        if (atomicReference.get() != sl4Var) {
                            or4.b("Unexpected state change from: " + sl4Var + " to: " + sl4Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case ig7.b /* 6 */:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            atomicReference.set(sl4.Invalid);
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
                    this.a.l0 = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        if (((sl4) this.h.get()).compareTo(sl4.ApplyPending) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        boolean z;
        sl4 sl4Var = sl4.RecomposePending;
        sl4 sl4Var2 = sl4.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.h;
            if (atomicReference.compareAndSet(sl4Var, sl4Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != sl4Var) {
                z = false;
                break;
            }
        }
        if (!z) {
            or4.b("Unexpected state change from: " + sl4Var + " to: " + sl4Var2 + '.');
        }
    }

    public final boolean e(x56 x56Var) {
        AtomicReference atomicReference = this.h;
        try {
            int i = pl4.a[((sl4) atomicReference.get()).ordinal()];
            iv0 iv0Var = this.a;
            dv0 dv0Var = this.b;
            switch (i) {
                case 1:
                    sk2 sk2Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        sk2Var.z = 0;
                        sk2Var.y = true;
                    }
                    this.j = dv0Var.b(iv0Var, x56Var, this.d);
                    if (z) {
                        sk2Var.s();
                    }
                    sl4 sl4Var = sl4.InitialPending;
                    sl4 sl4Var2 = sl4.RecomposePending;
                    while (true) {
                        if (!atomicReference.compareAndSet(sl4Var, sl4Var2)) {
                            if (atomicReference.get() != sl4Var) {
                                or4.b("Unexpected state change from: " + sl4Var + " to: " + sl4Var2 + '.');
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                        break;
                    }
                    break;
                case 2:
                    sl4 sl4Var3 = sl4.RecomposePending;
                    sl4 sl4Var4 = sl4.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(sl4Var3, sl4Var4)) {
                            if (atomicReference.get() != sl4Var3) {
                                or4.b("Unexpected state change from: " + sl4Var3 + " to: " + sl4Var4 + '.');
                            }
                        }
                    }
                    long j = this.i;
                    this.i = jk2.s();
                    this.j = dv0Var.n(iv0Var, x56Var, this.j);
                    this.i = j;
                    sl4 sl4Var5 = sl4.Recomposing;
                    sl4 sl4Var6 = sl4.RecomposePending;
                    while (true) {
                        if (!atomicReference.compareAndSet(sl4Var5, sl4Var6)) {
                            if (atomicReference.get() != sl4Var5) {
                                or4.b("Unexpected state change from: " + sl4Var5 + " to: " + sl4Var6 + '.');
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                        break;
                    }
                    break;
                case 3:
                    xu0.b("Recursive call to resume()");
                    throw new RuntimeException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case ig7.b /* 6 */:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new RuntimeException();
            }
            return c();
        } catch (Exception e) {
            atomicReference.set(sl4.Invalid);
            throw e;
        }
    }
}
