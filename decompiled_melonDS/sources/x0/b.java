package x0;

import android.util.Range;
import androidx.lifecycle.h0;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import d0.b1;
import d0.l;
import j0.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements w, l {
    public final x B;
    public final n0.f L;
    public final Object A = new Object();
    public boolean R = false;
    public b1 X = null;

    public b(x xVar, n0.f fVar) {
        this.B = xVar;
        this.L = fVar;
        if (xVar.getLifecycle().b().isAtLeast(q.STARTED)) {
            fVar.q();
        } else {
            fVar.v();
        }
        xVar.getLifecycle().a(this);
    }

    @Override // d0.l
    public final b0 b() {
        return this.L.A.B;
    }

    public final void l(b1 b1Var) {
        synchronized (this.A) {
            try {
                b1 b1Var2 = this.X;
                if (b1Var2 == null) {
                    this.X = b1Var;
                } else {
                    boolean z10 = b1Var.f3331a;
                    boolean z11 = b1Var2.f3331a;
                    if (z10) {
                        if (z11) {
                            ArrayList arrayList = new ArrayList((List) this.X.f3334d);
                            arrayList.addAll((List) b1Var.f3334d);
                            this.X = new b1(arrayList, (List) b1Var.f3332b);
                        } else {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                    } else if (!z11) {
                        this.X = b1Var;
                        n0.f fVar = this.L;
                        fVar.C((ArrayList) fVar.z());
                    } else {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                }
                synchronized (this.L.f9729e0) {
                }
                n0.f fVar2 = this.L;
                List list = (List) b1Var.f3332b;
                synchronized (fVar2.f9729e0) {
                    fVar2.f9726b0 = list;
                }
                synchronized (this.L.f9729e0) {
                }
                n0.f fVar3 = this.L;
                Range range = (Range) b1Var.f3335e;
                synchronized (fVar3.f9729e0) {
                    fVar3.f9727c0 = range;
                }
                b0 b10 = b();
                b10.getClass();
                f0.c o5 = x8.e.o(b1Var, b10);
                ((l0.d) b1Var.f3338h).execute(new g(6, o5, b1Var));
                this.L.d((List) b1Var.f3334d, o5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final x n() {
        x xVar;
        synchronized (this.A) {
            xVar = this.B;
        }
        return xVar;
    }

    @h0(p.ON_DESTROY)
    public void onDestroy(x xVar) {
        synchronized (this.A) {
            n0.f fVar = this.L;
            fVar.C((ArrayList) fVar.z());
        }
    }

    @h0(p.ON_PAUSE)
    public void onPause(x xVar) {
        this.L.A.c(false);
    }

    @h0(p.ON_RESUME)
    public void onResume(x xVar) {
        this.L.A.c(true);
    }

    @h0(p.ON_START)
    public void onStart(x xVar) {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    this.L.q();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @h0(p.ON_STOP)
    public void onStop(x xVar) {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    this.L.v();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final List q() {
        List unmodifiableList;
        synchronized (this.A) {
            unmodifiableList = Collections.unmodifiableList(this.L.z());
        }
        return unmodifiableList;
    }

    public final void r() {
        synchronized (this.A) {
            try {
                if (this.R) {
                    return;
                }
                onStop(this.B);
                this.R = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s() {
        synchronized (this.A) {
            n0.f fVar = this.L;
            fVar.C((ArrayList) fVar.z());
            this.X = null;
        }
    }

    public final void t() {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    return;
                }
                this.R = false;
                if (this.B.getLifecycle().b().isAtLeast(q.STARTED)) {
                    onStart(this.B);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
