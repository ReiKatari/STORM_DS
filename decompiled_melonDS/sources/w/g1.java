package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import j0.o1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 extends c1 {

    /* renamed from: b  reason: collision with root package name */
    public final x0 f13927b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f13928c;

    /* renamed from: d  reason: collision with root package name */
    public final l0.h f13929d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.d f13930e;

    /* renamed from: f  reason: collision with root package name */
    public o0 f13931f;

    /* renamed from: g  reason: collision with root package name */
    public rd.k f13932g;

    /* renamed from: h  reason: collision with root package name */
    public b5.l f13933h;

    /* renamed from: i  reason: collision with root package name */
    public b5.i f13934i;

    /* renamed from: j  reason: collision with root package name */
    public m0.d f13935j;

    /* renamed from: o  reason: collision with root package name */
    public final l0.d f13939o;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f13941q;

    /* renamed from: r  reason: collision with root package name */
    public m0.m f13942r;

    /* renamed from: s  reason: collision with root package name */
    public final a0.d f13943s;

    /* renamed from: t  reason: collision with root package name */
    public final a0.b f13944t;

    /* renamed from: u  reason: collision with root package name */
    public final a0.l f13945u;

    /* renamed from: v  reason: collision with root package name */
    public final a0.m f13946v;

    /* renamed from: a  reason: collision with root package name */
    public final Object f13926a = new Object();

    /* renamed from: k  reason: collision with root package name */
    public List f13936k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13937l = false;
    public boolean m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13938n = false;

    /* renamed from: p  reason: collision with root package name */
    public final Object f13940p = new Object();

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f13947w = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r2v2, types: [a0.m, java.lang.Object] */
    public g1(o1 o1Var, o1 o1Var2, x0 x0Var, l0.h hVar, l0.d dVar, Handler handler) {
        boolean z10 = false;
        this.f13927b = x0Var;
        this.f13928c = handler;
        this.f13929d = hVar;
        this.f13930e = dVar;
        this.f13943s = new a0.d(o1Var, o1Var2);
        this.f13945u = new a0.l((o1Var.h(CaptureSessionStuckQuirk.class) || o1Var.h(IncorrectCaptureStateQuirk.class)) ? true : true);
        this.f13944t = new a0.b(o1Var2);
        ?? obj = new Object();
        obj.f11a = o1Var2.h(Preview3AThreadCrashQuirk.class);
        this.f13946v = obj;
        this.f13939o = dVar;
    }

    @Override // w.c1
    public final void a(g1 g1Var) {
        Objects.requireNonNull(this.f13931f);
        this.f13931f.a(g1Var);
    }

    @Override // w.c1
    public final void b(g1 g1Var) {
        Objects.requireNonNull(this.f13931f);
        this.f13931f.b(g1Var);
    }

    @Override // w.c1
    public final void c(g1 g1Var) {
        b5.l lVar;
        synchronized (this.f13940p) {
            this.f13943s.a(this.f13941q);
        }
        k("onClosed()");
        synchronized (this.f13926a) {
            try {
                if (!this.f13937l) {
                    this.f13937l = true;
                    p7.m.l(this.f13933h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f13933h;
                } else {
                    lVar = null;
                }
            } finally {
            }
        }
        synchronized (this.f13926a) {
            try {
                List<j0.u0> list = this.f13936k;
                if (list != null) {
                    for (j0.u0 u0Var : list) {
                        u0Var.b();
                    }
                    this.f13936k = null;
                }
            } finally {
            }
        }
        this.f13945u.u();
        if (lVar != null) {
            lVar.B.a(new d1(this, g1Var, 0), ij.a.D());
        }
    }

    @Override // w.c1
    public final void d(g1 g1Var) {
        Objects.requireNonNull(this.f13931f);
        synchronized (this.f13926a) {
            try {
                List<j0.u0> list = this.f13936k;
                if (list != null) {
                    for (j0.u0 u0Var : list) {
                        u0Var.b();
                    }
                    this.f13936k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f13945u.u();
        x0 x0Var = this.f13927b;
        x0Var.f(this);
        synchronized (x0Var.f14090c) {
            ((LinkedHashSet) x0Var.f14093f).remove(this);
        }
        this.f13931f.d(g1Var);
    }

    @Override // w.c1
    public final void e(g1 g1Var) {
        ArrayList arrayList;
        k("Session onConfigured()");
        a0.b bVar = this.f13944t;
        x0 x0Var = this.f13927b;
        synchronized (x0Var.f14090c) {
            arrayList = new ArrayList((LinkedHashSet) x0Var.f14093f);
        }
        ArrayList g10 = this.f13927b.g();
        int i2 = 0;
        if (((CaptureSessionOnClosedNotCalledQuirk) bVar.B) != null) {
            LinkedHashSet<g1> linkedHashSet = new LinkedHashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                g1 g1Var2 = (g1) obj;
                if (g1Var2 == g1Var) {
                    break;
                }
                linkedHashSet.add(g1Var2);
            }
            for (g1 g1Var3 : linkedHashSet) {
                g1Var3.getClass();
                g1Var3.d(g1Var3);
            }
        }
        Objects.requireNonNull(this.f13931f);
        x0 x0Var2 = this.f13927b;
        synchronized (x0Var2.f14090c) {
            ((LinkedHashSet) x0Var2.f14091d).add(this);
            ((LinkedHashSet) x0Var2.f14093f).remove(this);
        }
        x0Var2.f(this);
        this.f13931f.e(g1Var);
        if (((CaptureSessionOnClosedNotCalledQuirk) bVar.B) != null) {
            LinkedHashSet<g1> linkedHashSet2 = new LinkedHashSet();
            int size2 = g10.size();
            while (i2 < size2) {
                Object obj2 = g10.get(i2);
                i2++;
                g1 g1Var4 = (g1) obj2;
                if (g1Var4 == g1Var) {
                    break;
                }
                linkedHashSet2.add(g1Var4);
            }
            for (g1 g1Var5 : linkedHashSet2) {
                g1Var5.getClass();
                g1Var5.c(g1Var5);
            }
        }
    }

    @Override // w.c1
    public final void f(g1 g1Var) {
        Objects.requireNonNull(this.f13931f);
        this.f13931f.f(g1Var);
    }

    @Override // w.c1
    public final void g(g1 g1Var) {
        b5.l lVar;
        synchronized (this.f13926a) {
            try {
                if (!this.f13938n) {
                    this.f13938n = true;
                    p7.m.l(this.f13933h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f13933h;
                } else {
                    lVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (lVar != null) {
            lVar.B.a(new d1(this, g1Var, 1), ij.a.D());
        }
    }

    @Override // w.c1
    public final void h(g1 g1Var, Surface surface) {
        Objects.requireNonNull(this.f13931f);
        this.f13931f.h(g1Var, surface);
    }

    public final void i() {
        if (!this.f13947w.compareAndSet(false, true)) {
            k("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f13946v.f11a) {
            try {
                k("Call abortCaptures() before closing session.");
                p7.m.l(this.f13932g, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((p1.a0) this.f13932g.B).B).abortCaptures();
            } catch (Exception e6) {
                k("Exception when calling abortCaptures()" + e6);
            }
        }
        k("Session call close()");
        this.f13945u.g().a(new e1(this, 1), this.f13929d);
    }

    public final void j(CameraCaptureSession cameraCaptureSession) {
        if (this.f13932g == null) {
            this.f13932g = new rd.k(cameraCaptureSession, this.f13928c);
        }
    }

    public final void k(String str) {
        aj.g.o("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    public final boolean l() {
        boolean z10;
        synchronized (this.f13926a) {
            if (this.f13933h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final ta.a m(CameraDevice cameraDevice, y.s sVar, List list) {
        ta.a d4;
        synchronized (this.f13940p) {
            try {
                ArrayList g10 = this.f13927b.g();
                ArrayList arrayList = new ArrayList();
                int size = g10.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = g10.get(i2);
                    i2++;
                    g1 g1Var = (g1) obj;
                    arrayList.add(a.a.A(new m0.f(g1Var.f13945u.g(), g1Var.f13939o, 1500L)));
                }
                m0.m mVar = new m0.m(new ArrayList(arrayList), false, ij.a.D());
                this.f13942r = mVar;
                d4 = m0.i.d(m0.i.g(m0.d.b(mVar), new f1(this, cameraDevice, sVar, list), this.f13929d));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d4;
    }

    public final int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback d4 = this.f13945u.d(captureCallback);
        p7.m.l(this.f13932g, "Need to call openCaptureSession before using this API.");
        return ((p1.a0) this.f13932g.B).H(captureRequest, this.f13929d, d4);
    }

    public final ta.a o(ArrayList arrayList) {
        synchronized (this.f13926a) {
            try {
                if (this.m) {
                    return new m0.k(1, new CancellationException("Opener is disabled"));
                }
                m0.b g10 = m0.i.g(m0.d.b(k7.w.I(arrayList, this.f13929d, this.f13930e)), new bi.h(13, this, arrayList), this.f13929d);
                this.f13935j = g10;
                return m0.i.d(g10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f13940p) {
            try {
                if (l()) {
                    this.f13943s.a(this.f13941q);
                } else {
                    m0.m mVar = this.f13942r;
                    if (mVar != null) {
                        mVar.cancel(true);
                    }
                }
                m0.d dVar = null;
                synchronized (this.f13926a) {
                    try {
                        if (!this.m) {
                            m0.d dVar2 = this.f13935j;
                            if (dVar2 != null) {
                                dVar = dVar2;
                            }
                            this.m = true;
                        }
                        z10 = !l();
                    } finally {
                    }
                }
                if (dVar != null) {
                    dVar.cancel(true);
                }
            } finally {
            }
        }
        return z10;
    }

    public final rd.k q() {
        this.f13932g.getClass();
        return this.f13932g;
    }
}
