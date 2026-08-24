package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig1  reason: default package */
/* loaded from: classes.dex */
public abstract class ig1 {
    public static final boolean k;
    public static final AtomicInteger l;
    public static final AtomicInteger m;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public qb0 d;
    public final tb0 e;
    public qb0 f;
    public final tb0 g;
    public final Size h;
    public final int i;
    public Class j;

    static {
        new Size(0, 0);
        k = kj2.F("DeferrableSurface");
        l = new AtomicInteger(0);
        m = new AtomicInteger(0);
    }

    public ig1(int i, Size size) {
        this.h = size;
        this.i = i;
        tb0 W = ak7.W(new rb0(this) { // from class: gg1
            public final /* synthetic */ ig1 B;

            {
                this.B = this;
            }

            @Override // defpackage.rb0
            public final Object s(qb0 qb0Var) {
                int i2 = r2;
                ig1 ig1Var = this.B;
                switch (i2) {
                    case 0:
                        synchronized (ig1Var.a) {
                            ig1Var.d = qb0Var;
                        }
                        return "DeferrableSurface-termination(" + ig1Var + ")";
                    default:
                        synchronized (ig1Var.a) {
                            ig1Var.f = qb0Var;
                        }
                        return "DeferrableSurface-close(" + ig1Var + ")";
                }
            }
        });
        this.e = W;
        this.g = ak7.W(new rb0(this) { // from class: gg1
            public final /* synthetic */ ig1 B;

            {
                this.B = this;
            }

            @Override // defpackage.rb0
            public final Object s(qb0 qb0Var) {
                int i2 = r2;
                ig1 ig1Var = this.B;
                switch (i2) {
                    case 0:
                        synchronized (ig1Var.a) {
                            ig1Var.d = qb0Var;
                        }
                        return "DeferrableSurface-termination(" + ig1Var + ")";
                    default:
                        synchronized (ig1Var.a) {
                            ig1Var.f = qb0Var;
                        }
                        return "DeferrableSurface-close(" + ig1Var + ")";
                }
            }
        });
        if (kj2.F("DeferrableSurface")) {
            e(m.incrementAndGet(), l.get(), "Surface created");
            mf mfVar = new mf(18, this, Log.getStackTraceString(new Exception()));
            W.B.a(u24.j(), mfVar);
        }
    }

    public void a() {
        qb0 qb0Var;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f.a(null);
                    if (this.b == 0) {
                        qb0Var = this.d;
                        this.d = null;
                    } else {
                        qb0Var = null;
                    }
                    if (kj2.F("DeferrableSurface")) {
                        kj2.t("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                } else {
                    qb0Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qb0Var != null) {
            qb0Var.a(null);
        }
    }

    public final void b() {
        qb0 qb0Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i != 0) {
                    int i2 = i - 1;
                    this.b = i2;
                    if (i2 == 0 && this.c) {
                        qb0Var = this.d;
                        this.d = null;
                    } else {
                        qb0Var = null;
                    }
                    if (kj2.F("DeferrableSurface")) {
                        kj2.t("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
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
        if (qb0Var != null) {
            qb0Var.a(null);
        }
    }

    public final gx3 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new n33(new hg1("DeferrableSurface already closed.", this), 1);
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
                    throw new hg1("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (kj2.F("DeferrableSurface")) {
                    if (this.b == 1) {
                        e(m.get(), l.incrementAndGet(), "New surface in use");
                    }
                    kj2.t("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!k && kj2.F("DeferrableSurface")) {
            kj2.t("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        kj2.t("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract gx3 f();
}
