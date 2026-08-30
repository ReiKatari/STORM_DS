package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hc1  reason: default package */
/* loaded from: classes.dex */
public abstract class hc1 {
    public static final boolean k;
    public static final AtomicInteger l;
    public static final AtomicInteger m;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public i90 d;
    public final l90 e;
    public i90 f;
    public final l90 g;
    public final Size h;
    public final int i;
    public Class j;

    static {
        new Size(0, 0);
        k = ve2.D("DeferrableSurface");
        l = new AtomicInteger(0);
        m = new AtomicInteger(0);
    }

    public hc1(int i, Size size) {
        this.h = size;
        this.i = i;
        l90 k0 = ct3.k0(new j90(this) { // from class: fc1
            public final /* synthetic */ hc1 B;

            {
                this.B = this;
            }

            @Override // defpackage.j90
            public final Object i(i90 i90Var) {
                int i2 = r2;
                hc1 hc1Var = this.B;
                switch (i2) {
                    case 0:
                        synchronized (hc1Var.a) {
                            hc1Var.d = i90Var;
                        }
                        return "DeferrableSurface-termination(" + hc1Var + ")";
                    default:
                        synchronized (hc1Var.a) {
                            hc1Var.f = i90Var;
                        }
                        return "DeferrableSurface-close(" + hc1Var + ")";
                }
            }
        });
        this.e = k0;
        this.g = ct3.k0(new j90(this) { // from class: fc1
            public final /* synthetic */ hc1 B;

            {
                this.B = this;
            }

            @Override // defpackage.j90
            public final Object i(i90 i90Var) {
                int i2 = r2;
                hc1 hc1Var = this.B;
                switch (i2) {
                    case 0:
                        synchronized (hc1Var.a) {
                            hc1Var.d = i90Var;
                        }
                        return "DeferrableSurface-termination(" + hc1Var + ")";
                    default:
                        synchronized (hc1Var.a) {
                            hc1Var.f = i90Var;
                        }
                        return "DeferrableSurface-close(" + hc1Var + ")";
                }
            }
        });
        if (ve2.D("DeferrableSurface")) {
            e(m.incrementAndGet(), l.get(), "Surface created");
            k0.B.a(new we(18, this, Log.getStackTraceString(new Exception())), iq2.l());
        }
    }

    public void a() {
        i90 i90Var;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f.a(null);
                    if (this.b == 0) {
                        i90Var = this.d;
                        this.d = null;
                    } else {
                        i90Var = null;
                    }
                    if (ve2.D("DeferrableSurface")) {
                        ve2.v("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                } else {
                    i90Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i90Var != null) {
            i90Var.a(null);
        }
    }

    public final void b() {
        i90 i90Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i != 0) {
                    int i2 = i - 1;
                    this.b = i2;
                    if (i2 == 0 && this.c) {
                        i90Var = this.d;
                        this.d = null;
                    } else {
                        i90Var = null;
                    }
                    if (ve2.D("DeferrableSurface")) {
                        ve2.v("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
                        if (this.b == 0) {
                            e(m.get(), l.decrementAndGet(), "Surface no longer in use");
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i90Var != null) {
            i90Var.a(null);
        }
    }

    public final fq3 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new jx2(1, new gc1("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new gc1("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (ve2.D("DeferrableSurface")) {
                    if (this.b == 1) {
                        e(m.get(), l.incrementAndGet(), "New surface in use");
                    }
                    ve2.v("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!k && ve2.D("DeferrableSurface")) {
            ve2.v("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        ve2.v("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract fq3 f();
}
