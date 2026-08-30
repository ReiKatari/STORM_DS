package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sm3  reason: default package */
/* loaded from: classes.dex */
public final class sm3 implements en3, hb0 {
    public final fn3 B;
    public final qg0 L;
    public final Object A = new Object();
    public boolean R = false;
    public me1 X = null;

    public sm3(fn3 fn3Var, qg0 qg0Var, zq5 zq5Var) {
        this.B = fn3Var;
        this.L = qg0Var;
        if (fn3Var.getLifecycle().b().isAtLeast(qm3.STARTED)) {
            qg0Var.q();
        } else {
            qg0Var.w();
        }
        fn3Var.getLifecycle().a(this);
    }

    @Override // defpackage.hb0
    public final qd0 b() {
        return this.L.A.B;
    }

    public final void m(me1 me1Var) {
        synchronized (this.A) {
            try {
                me1 me1Var2 = this.X;
                if (me1Var2 == null) {
                    this.X = me1Var;
                } else {
                    boolean z = me1Var.b;
                    boolean z2 = me1Var2.b;
                    if (z) {
                        if (z2) {
                            ArrayList arrayList = new ArrayList((List) this.X.g);
                            arrayList.addAll((List) me1Var.g);
                            this.X = new me1(arrayList, (List) me1Var.c);
                        } else {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                    } else if (!z2) {
                        this.X = me1Var;
                        qg0 qg0Var = this.L;
                        qg0Var.C((ArrayList) qg0Var.A());
                    } else {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                }
                synchronized (this.L.f0) {
                }
                qg0 qg0Var2 = this.L;
                List list = (List) me1Var.c;
                synchronized (qg0Var2.f0) {
                    qg0Var2.c0 = list;
                }
                synchronized (this.L.f0) {
                }
                qg0 qg0Var3 = this.L;
                Range range = (Range) me1Var.d;
                synchronized (qg0Var3.f0) {
                    qg0Var3.d0 = range;
                }
                td0 td0Var = (td0) b();
                td0Var.getClass();
                qb5 u = jo1.u(td0Var, me1Var);
                ((np2) me1Var.i).execute(new we(27, u, me1Var));
                this.L.d((List) me1Var.g, u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final fn3 o() {
        fn3 fn3Var;
        synchronized (this.A) {
            fn3Var = this.B;
        }
        return fn3Var;
    }

    @rc4(pm3.ON_DESTROY)
    public void onDestroy(fn3 fn3Var) {
        synchronized (this.A) {
            qg0 qg0Var = this.L;
            qg0Var.C((ArrayList) qg0Var.A());
        }
    }

    @rc4(pm3.ON_PAUSE)
    public void onPause(fn3 fn3Var) {
        this.L.A.c(false);
    }

    @rc4(pm3.ON_RESUME)
    public void onResume(fn3 fn3Var) {
        this.L.A.c(true);
    }

    @rc4(pm3.ON_START)
    public void onStart(fn3 fn3Var) {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    this.L.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @rc4(pm3.ON_STOP)
    public void onStop(fn3 fn3Var) {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    this.L.w();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List q() {
        List unmodifiableList;
        synchronized (this.A) {
            unmodifiableList = Collections.unmodifiableList(this.L.A());
        }
        return unmodifiableList;
    }

    public final void s() {
        synchronized (this.A) {
            try {
                if (this.R) {
                    return;
                }
                onStop(this.B);
                this.R = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        synchronized (this.A) {
            List A = this.L.A();
            this.L.C((ArrayList) A);
            ArrayList arrayList = (ArrayList) A;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                f47 f47Var = (f47) obj;
                if (f47Var.n()) {
                    synchronized (f47Var.c) {
                    }
                }
            }
            this.X = null;
        }
    }

    public final void u() {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    return;
                }
                this.R = false;
                if (this.B.getLifecycle().b().isAtLeast(qm3.STARTED)) {
                    onStart(this.B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
