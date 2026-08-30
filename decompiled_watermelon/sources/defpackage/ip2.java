package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ip2  reason: default package */
/* loaded from: classes.dex */
public final class ip2 extends g31 implements sc1 {
    public final Handler L;
    public final String R;
    public final boolean X;
    public final ip2 Y;

    public ip2(Handler handler, String str, boolean z) {
        ip2 ip2Var;
        this.L = handler;
        this.R = str;
        this.X = z;
        if (z) {
            ip2Var = this;
        } else {
            ip2Var = new ip2(handler, str, true);
        }
        this.Y = ip2Var;
    }

    @Override // defpackage.sc1
    public final eh1 Q(long j, final Runnable runnable, e31 e31Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.L.postDelayed(runnable, j)) {
            return new eh1() { // from class: hp2
                @Override // defpackage.eh1
                public final void dispose() {
                    ip2.this.L.removeCallbacks(runnable);
                }
            };
        }
        n0(e31Var, runnable);
        return t74.A;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ip2) {
            ip2 ip2Var = (ip2) obj;
            if (ip2Var.L == this.L && ip2Var.X == this.X) {
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

    @Override // defpackage.g31
    public final void j0(e31 e31Var, Runnable runnable) {
        if (!this.L.post(runnable)) {
            n0(e31Var, runnable);
        }
    }

    @Override // defpackage.g31
    public final boolean l0(e31 e31Var) {
        if (this.X && b53.x(Looper.myLooper(), this.L.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.g31
    public final g31 m0(int i) {
        jk2.m(1);
        return this;
    }

    public final void n0(e31 e31Var, Runnable runnable) {
        ln2.t(e31Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        bb1 bb1Var = tg1.a;
        ha1.L.j0(e31Var, runnable);
    }

    @Override // defpackage.g31
    public final String toString() {
        ip2 ip2Var;
        String str;
        bb1 bb1Var = tg1.a;
        ip2 ip2Var2 = bt3.a;
        if (this == ip2Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ip2Var = ip2Var2.Y;
            } catch (UnsupportedOperationException unused) {
                ip2Var = null;
            }
            if (this == ip2Var) {
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

    @Override // defpackage.sc1
    public final void w(long j, ih0 ih0Var) {
        we weVar = new we(23, ih0Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.L.postDelayed(weVar, j)) {
            ih0Var.z(new gi2(4, this, weVar));
        } else {
            n0(ih0Var.X, weVar);
        }
    }

    public ip2(Handler handler) {
        this(handler, null, false);
    }
}
