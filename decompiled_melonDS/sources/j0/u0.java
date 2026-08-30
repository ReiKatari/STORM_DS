package j0;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: k  reason: collision with root package name */
    public static final Size f7292k = new Size(0, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f7293l = aj.g.L("DeferrableSurface");
    public static final AtomicInteger m = new AtomicInteger(0);

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicInteger f7294n = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f7295a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f7296b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7297c = false;

    /* renamed from: d  reason: collision with root package name */
    public b5.i f7298d;

    /* renamed from: e  reason: collision with root package name */
    public final b5.l f7299e;

    /* renamed from: f  reason: collision with root package name */
    public b5.i f7300f;

    /* renamed from: g  reason: collision with root package name */
    public final b5.l f7301g;

    /* renamed from: h  reason: collision with root package name */
    public final Size f7302h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7303i;

    /* renamed from: j  reason: collision with root package name */
    public Class f7304j;

    public u0(Size size, int i2) {
        this.f7302h = size;
        this.f7303i = i2;
        b5.l A = a.a.A(new b5.j(this) { // from class: j0.s0
            public final /* synthetic */ u0 B;

            {
                this.B = this;
            }

            @Override // b5.j
            public final Object h(b5.i iVar) {
                switch (r2) {
                    case 0:
                        u0 u0Var = this.B;
                        synchronized (u0Var.f7295a) {
                            u0Var.f7298d = iVar;
                        }
                        return "DeferrableSurface-termination(" + u0Var + ")";
                    default:
                        u0 u0Var2 = this.B;
                        synchronized (u0Var2.f7295a) {
                            u0Var2.f7300f = iVar;
                        }
                        return "DeferrableSurface-close(" + u0Var2 + ")";
                }
            }
        });
        this.f7299e = A;
        this.f7301g = a.a.A(new b5.j(this) { // from class: j0.s0
            public final /* synthetic */ u0 B;

            {
                this.B = this;
            }

            @Override // b5.j
            public final Object h(b5.i iVar) {
                switch (r2) {
                    case 0:
                        u0 u0Var = this.B;
                        synchronized (u0Var.f7295a) {
                            u0Var.f7298d = iVar;
                        }
                        return "DeferrableSurface-termination(" + u0Var + ")";
                    default:
                        u0 u0Var2 = this.B;
                        synchronized (u0Var2.f7295a) {
                            u0Var2.f7300f = iVar;
                        }
                        return "DeferrableSurface-close(" + u0Var2 + ")";
                }
            }
        });
        if (aj.g.L("DeferrableSurface")) {
            e(f7294n.incrementAndGet(), m.get(), "Surface created");
            A.B.a(new ad.c(13, this, Log.getStackTraceString(new Exception())), ij.a.D());
        }
    }

    public void a() {
        b5.i iVar;
        synchronized (this.f7295a) {
            try {
                if (!this.f7297c) {
                    this.f7297c = true;
                    this.f7300f.b(null);
                    if (this.f7296b == 0) {
                        iVar = this.f7298d;
                        this.f7298d = null;
                    } else {
                        iVar = null;
                    }
                    if (aj.g.L("DeferrableSurface")) {
                        aj.g.o("DeferrableSurface", "surface closed,  useCount=" + this.f7296b + " closed=true " + this);
                    }
                } else {
                    iVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVar != null) {
            iVar.b(null);
        }
    }

    public final void b() {
        b5.i iVar;
        synchronized (this.f7295a) {
            try {
                int i2 = this.f7296b;
                if (i2 != 0) {
                    int i10 = i2 - 1;
                    this.f7296b = i10;
                    if (i10 == 0 && this.f7297c) {
                        iVar = this.f7298d;
                        this.f7298d = null;
                    } else {
                        iVar = null;
                    }
                    if (aj.g.L("DeferrableSurface")) {
                        aj.g.o("DeferrableSurface", "use count-1,  useCount=" + this.f7296b + " closed=" + this.f7297c + " " + this);
                        if (this.f7296b == 0) {
                            e(f7294n.get(), m.decrementAndGet(), "Surface no longer in use");
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVar != null) {
            iVar.b(null);
        }
    }

    public final ta.a c() {
        synchronized (this.f7295a) {
            try {
                if (this.f7297c) {
                    return new m0.k(1, new t0("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (this.f7295a) {
            try {
                int i2 = this.f7296b;
                if (i2 == 0 && this.f7297c) {
                    throw new t0("Cannot begin use on a closed surface.", this);
                }
                this.f7296b = i2 + 1;
                if (aj.g.L("DeferrableSurface")) {
                    if (this.f7296b == 1) {
                        e(f7294n.get(), m.incrementAndGet(), "New surface in use");
                    }
                    aj.g.o("DeferrableSurface", "use count+1, useCount=" + this.f7296b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(int i2, int i10, String str) {
        if (!f7293l && aj.g.L("DeferrableSurface")) {
            aj.g.o("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        aj.g.o("DeferrableSurface", str + "[total_surfaces=" + i2 + ", used_surfaces=" + i10 + "](" + this + "}");
    }

    public abstract ta.a f();
}
