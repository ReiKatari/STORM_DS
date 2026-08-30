package n2;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final y f9929a;

    /* renamed from: b  reason: collision with root package name */
    public final v f9930b;

    /* renamed from: c  reason: collision with root package name */
    public final r f9931c;

    /* renamed from: d  reason: collision with root package name */
    public final mc.p f9932d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9933e;

    /* renamed from: f  reason: collision with root package name */
    public final a4.r2 f9934f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9935g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference f9936h = new AtomicReference(j1.InitialPending);

    /* renamed from: i  reason: collision with root package name */
    public long f9937i = v2.h.b();

    /* renamed from: j  reason: collision with root package name */
    public a1.n0 f9938j;

    /* renamed from: k  reason: collision with root package name */
    public final v2.i f9939k;

    /* renamed from: l  reason: collision with root package name */
    public final v1 f9940l;

    public i1(y yVar, v vVar, r rVar, a1.p0 p0Var, mc.p pVar, boolean z10, a4.r2 r2Var, Object obj) {
        this.f9929a = yVar;
        this.f9930b = vVar;
        this.f9931c = rVar;
        this.f9932d = pVar;
        this.f9933e = z10;
        this.f9934f = r2Var;
        this.f9935g = obj;
        a1.n0 n0Var = a1.v0.f110a;
        n0Var.getClass();
        this.f9938j = n0Var;
        v2.i iVar = new v2.i();
        iVar.g(p0Var, rVar.z());
        this.f9939k = iVar;
        this.f9940l = new v1(r2Var.L);
    }

    public final void a() {
        AtomicReference atomicReference = this.f9936h;
        try {
            switch (h1.f9903a[((j1) atomicReference.get()).ordinal()]) {
                case DSiCameraSource.FrontCamera /* 1 */:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    j1 j1Var = j1.ApplyPending;
                    j1 j1Var2 = j1.Applied;
                    while (!atomicReference.compareAndSet(j1Var, j1Var2)) {
                        if (atomicReference.get() != j1Var) {
                            l1.b("Unexpected state change from: " + j1Var + " to: " + j1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case l1.c.f8511g /* 5 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                case l1.c.f8509e /* 6 */:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e6) {
            atomicReference.set(j1.Invalid);
            throw e6;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f9935g) {
                try {
                    this.f9940l.a(this.f9934f, this.f9939k);
                    this.f9939k.c();
                    this.f9939k.d();
                } finally {
                    this.f9939k.b();
                    this.f9929a.f10076k0 = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        if (((j1) this.f9936h.get()).compareTo(j1.ApplyPending) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        boolean z10;
        j1 j1Var = j1.RecomposePending;
        j1 j1Var2 = j1.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.f9936h;
            if (atomicReference.compareAndSet(j1Var, j1Var2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != j1Var) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            l1.b("Unexpected state change from: " + j1Var + " to: " + j1Var2 + '.');
        }
    }

    public final boolean e(c2 c2Var) {
        AtomicReference atomicReference = this.f9936h;
        try {
            int i2 = h1.f9903a[((j1) atomicReference.get()).ordinal()];
            y yVar = this.f9929a;
            v vVar = this.f9930b;
            switch (i2) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    r rVar = this.f9931c;
                    boolean z10 = this.f9933e;
                    if (z10) {
                        rVar.f10018z = 100;
                        rVar.f10017y = true;
                    }
                    this.f9938j = vVar.b(yVar, c2Var, this.f9932d);
                    if (z10) {
                        rVar.s();
                    }
                    j1 j1Var = j1.InitialPending;
                    j1 j1Var2 = j1.RecomposePending;
                    while (true) {
                        if (!atomicReference.compareAndSet(j1Var, j1Var2)) {
                            if (atomicReference.get() != j1Var) {
                                l1.b("Unexpected state change from: " + j1Var + " to: " + j1Var2 + '.');
                            }
                        }
                    }
                    if (this.f9938j.g()) {
                        d();
                        break;
                    }
                    break;
                case 2:
                    j1 j1Var3 = j1.RecomposePending;
                    j1 j1Var4 = j1.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(j1Var3, j1Var4)) {
                            if (atomicReference.get() != j1Var3) {
                                l1.b("Unexpected state change from: " + j1Var3 + " to: " + j1Var4 + '.');
                            }
                        }
                    }
                    long j2 = this.f9937i;
                    this.f9937i = v2.h.b();
                    this.f9938j = vVar.n(yVar, c2Var, this.f9938j);
                    this.f9937i = j2;
                    j1 j1Var5 = j1.Recomposing;
                    j1 j1Var6 = j1.RecomposePending;
                    while (true) {
                        if (!atomicReference.compareAndSet(j1Var5, j1Var6)) {
                            if (atomicReference.get() != j1Var5) {
                                l1.b("Unexpected state change from: " + j1Var5 + " to: " + j1Var6 + '.');
                            }
                        }
                    }
                    if (this.f9938j.g()) {
                        d();
                        break;
                    }
                    break;
                case 3:
                    t.b("Recursive call to resume()");
                    throw new RuntimeException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case l1.c.f8511g /* 5 */:
                    throw new IllegalStateException("The paused composition has been applied");
                case l1.c.f8509e /* 6 */:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new RuntimeException();
            }
            return c();
        } catch (Exception e6) {
            atomicReference.set(j1.Invalid);
            throw e6;
        }
    }
}
