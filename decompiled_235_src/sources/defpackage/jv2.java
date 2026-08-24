package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv2  reason: default package */
/* loaded from: classes.dex */
public final class jv2 extends n61 implements ug1 {
    public final Handler L;
    public final String R;
    public final boolean X;
    public final jv2 Y;

    public jv2(Handler handler, String str, boolean z) {
        jv2 jv2Var;
        this.L = handler;
        this.R = str;
        this.X = z;
        if (z) {
            jv2Var = this;
        } else {
            jv2Var = new jv2(handler, str, true);
        }
        this.Y = jv2Var;
    }

    @Override // defpackage.ug1
    public final il1 A(long j, final Runnable runnable, l61 l61Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.L.postDelayed(runnable, j)) {
            return new il1() { // from class: iv2
                @Override // defpackage.il1
                public final void dispose() {
                    jv2.this.L.removeCallbacks(runnable);
                }
            };
        }
        n0(l61Var, runnable);
        return lg4.A;
    }

    @Override // defpackage.ug1
    public final void J(long j, rj0 rj0Var) {
        mf mfVar = new mf(23, rj0Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.L.postDelayed(mfVar, j)) {
            rj0Var.z(new bi2(6, this, mfVar));
        } else {
            n0(rj0Var.X, mfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jv2) {
            jv2 jv2Var = (jv2) obj;
            if (jv2Var.L == this.L && jv2Var.X == this.X) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.L);
        if (this.X) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.n61
    public final void j0(l61 l61Var, Runnable runnable) {
        if (!this.L.post(runnable)) {
            n0(l61Var, runnable);
        }
    }

    @Override // defpackage.n61
    public final boolean l0(l61 l61Var) {
        if (this.X && nb3.k(Looper.myLooper(), this.L.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.n61
    public final n61 m0(int i) {
        kn2.u(1);
        return this;
    }

    public final void n0(l61 l61Var, Runnable runnable) {
        yh2.m(l61Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        xe1 xe1Var = xk1.a;
        de1.L.j0(l61Var, runnable);
    }

    @Override // defpackage.n61
    public final String toString() {
        jv2 jv2Var;
        String str;
        xe1 xe1Var = xk1.a;
        jv2 jv2Var2 = e04.a;
        if (this == jv2Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                jv2Var = jv2Var2.Y;
            } catch (UnsupportedOperationException unused) {
                jv2Var = null;
            }
            if (this == jv2Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.R;
            if (str2 == null) {
                str2 = this.L.toString();
            }
            if (this.X) {
                return str2 + ".immediate";
            }
            return str2;
        }
        return str;
    }

    public jv2(Handler handler) {
        this(handler, null, false);
    }
}
