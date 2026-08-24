package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kc0  reason: default package */
/* loaded from: classes.dex */
public final class kc0 {
    public Map A;
    public ap6 B;
    public ap6 C;
    public ap6 D;
    public final w61 a;
    public final t57 b;
    public final ks6 c;
    public final kf0 d;
    public final gt2 e;
    public final rv6 f;
    public final sc0 g;
    public final sk0 h;
    public final s9 i;
    public final e65 j;
    public final oi0 k;
    public final nd0 l;
    public final yx6 m;
    public final qf0 n;
    public final xb0 o;
    public final jr6 p;
    public final Object q;
    public boolean r;
    public hf s;
    public ii0 t;
    public df0 u;
    public g67 v;
    public ap6 w;
    public final tu0 x;
    public pq7 y;
    public yk0 z;

    public kc0(w61 w61Var, t57 t57Var, ks6 ks6Var, kf0 kf0Var, gt2 gt2Var, rv6 rv6Var, sc0 sc0Var, sk0 sk0Var, s9 s9Var, e65 e65Var, oi0 oi0Var, nd0 nd0Var, yx6 yx6Var, qf0 qf0Var, xb0 xb0Var, jr6 jr6Var, wy0 wy0Var) {
        w61Var.getClass();
        t57Var.getClass();
        ks6Var.getClass();
        kf0Var.getClass();
        sc0Var.getClass();
        sk0Var.getClass();
        e65Var.getClass();
        oi0Var.getClass();
        nd0Var.getClass();
        yx6Var.getClass();
        wy0Var.getClass();
        this.a = w61Var;
        this.b = t57Var;
        this.c = ks6Var;
        this.d = kf0Var;
        this.e = gt2Var;
        this.f = rv6Var;
        this.g = sc0Var;
        this.h = sk0Var;
        this.i = s9Var;
        this.j = e65Var;
        this.k = oi0Var;
        this.l = nd0Var;
        this.m = yx6Var;
        this.n = qf0Var;
        this.o = xb0Var;
        this.p = jr6Var;
        this.q = new Object();
        this.r = true;
        this.s = xe0.z;
        this.t = new gi0(kf0Var.a);
        this.x = new tu0();
        this.C = hv.L(w61Var, null, null, new hc0(this, null, 0), 3);
        this.D = hv.L(w61Var, null, null, new hc0(this, null, 1), 3);
    }

    public static final void a(kc0 kc0Var, ii0 ii0Var) {
        Log.d("CXCP", kc0Var + " (" + ((Object) xf0.b(kc0Var.d.a)) + ") camera status changed: " + ii0Var);
        synchronized (kc0Var.q) {
            try {
                if (kc0Var.e()) {
                    return;
                }
                if (ii0Var instanceof ei0) {
                    kc0Var.t = ii0Var;
                } else if (ii0Var instanceof gi0) {
                    kc0Var.t = ii0Var;
                } else if (ii0Var instanceof fi0) {
                    kc0Var.m.getClass();
                    kc0Var.v = new g67(SystemClock.elapsedRealtimeNanos());
                }
                kc0Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void b(kc0 kc0Var) {
        if (kc0Var.e()) {
            Log.w("CXCP", "Ignoring stop(): " + kc0Var + " is already closed");
            return;
        }
        hf hfVar = kc0Var.s;
        xe0 xe0Var = xe0.A;
        if (!hfVar.equals(xe0Var) && !kc0Var.s.equals(xe0.z)) {
            pq7 pq7Var = kc0Var.y;
            yk0 yk0Var = kc0Var.z;
            kc0Var.y = null;
            kc0Var.z = null;
            kc0Var.s = xe0Var;
            Log.d("CXCP", "Stopping " + kc0Var);
            kc0Var.d(yk0Var, pq7Var);
            return;
        }
        Log.w("CXCP", "Ignoring stop(): " + kc0Var + " already stopping or stopped");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s41 s41Var) {
        ic0 ic0Var;
        int i;
        if (s41Var instanceof ic0) {
            ic0Var = (ic0) s41Var;
            int i2 = ic0Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ic0Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = ic0Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ic0Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Log.d("CXCP", this + "#awaitClosed");
                    synchronized (this.q) {
                        if (this.s.equals(xe0.u)) {
                            Log.d("CXCP", this + "#awaitClosed: Controller is already closed.");
                            return Boolean.TRUE;
                        } else if (!this.s.equals(xe0.v)) {
                            Log.w("CXCP", this + "#awaitClosed: Controller isn't closing!");
                            return Boolean.FALSE;
                        } else {
                            tu0 tu0Var = this.x;
                            ic0Var.Y = 1;
                            if (tu0Var.q(ic0Var) == x61Var) {
                                return x61Var;
                            }
                        }
                    }
                }
                return Boolean.TRUE;
            }
        }
        ic0Var = new ic0(this, s41Var);
        Object obj2 = ic0Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ic0Var.Y;
        if (i == 0) {
        }
        return Boolean.TRUE;
    }

    public final void d(yk0 yk0Var, pq7 pq7Var) {
        ap6 L = hv.L(this.a, null, null, new m5(yk0Var, pq7Var, (r41) null, 6), 3);
        if (this.s.equals(xe0.v)) {
            L.a0(new fc0(this, 0));
        }
    }

    public final boolean e() {
        if (!this.s.equals(xe0.v) && !this.s.equals(xe0.u)) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (e()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        hf hfVar = this.s;
        xe0 xe0Var = xe0.y;
        if (hfVar.equals(xe0Var)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        this.u = null;
        kf0 kf0Var = this.d;
        String str = kf0Var.a;
        List k1 = gt0.k1(ii2.E(ii2.R(new xf0(str)), new xf0(str)));
        fc0 fc0Var = new fc0(this, 1);
        e65 e65Var = this.j;
        e65Var.getClass();
        str.getClass();
        w61 w61Var = e65Var.d;
        gt2 gt2Var = this.e;
        pq7 pq7Var = new pq7(str, gt2Var, w61Var);
        pa paVar = e65Var.e;
        if (((v80) paVar.Y).c(new al5(pq7Var, k1, gt2Var, fc0Var)) instanceof fm0) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) xf0.b(str)) + '!');
            gt2Var.a(new kt2(12, false));
            pq7Var = null;
        }
        if (pq7Var == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
        } else if (this.y == null) {
            if (this.z == null) {
                this.y = pq7Var;
                yk0 yk0Var = new yk0(gt2Var, this.h, this.i, this.k, this.m, kf0Var.o, null, this.p, this.c, this.b, this.a);
                this.z = yk0Var;
                Map map = this.A;
                if (map != null) {
                    yk0Var.k(map);
                }
                this.s = xe0Var;
                Log.d("CXCP", "Started " + this);
                ap6 ap6Var = this.B;
                if (ap6Var != null) {
                    ap6Var.h(null);
                }
                this.B = hv.L(this.a, null, null, new hc0(this, null, 2), 3);
                return;
            }
            i.m("Check failed.");
        } else {
            i.m("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r3.a != 9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
        if (r3.a != 8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        boolean z;
        long j;
        ap6 ap6Var;
        this.m.getClass();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        hf hfVar = this.s;
        df0 df0Var = this.u;
        ii0 ii0Var = this.t;
        g67 g67Var = this.v;
        ii0Var.getClass();
        boolean z2 = false;
        if ((ii0Var instanceof ei0) && (df0Var == null || df0Var.a != 3)) {
            z = true;
        } else {
            z = false;
        }
        if (g67Var != null && sq1.a(elapsedRealtimeNanos - g67Var.a, 200000000L) <= 0) {
            z2 = true;
        }
        if (hfVar.equals(xe0.w)) {
            if (!z && !z2) {
                int i = Build.VERSION.SDK_INT;
                if (29 <= i && i < 33) {
                    Log.d("CXCP", "Quirk for multi-resume activated: Kicking off restart.");
                }
                Log.d("CXCP", this + ": Not restarting. Controller state = " + this.s + ", last camera error = " + this.u + ", camera availability = " + this.t + ", last camera priorities changed = " + this.v + ", current timestamp = " + ((Object) g67.a(elapsedRealtimeNanos)) + '.');
            }
            if (!this.d.o.f) {
                j = 700;
            } else {
                j = 0;
            }
            long j2 = j;
            ap6Var = this.w;
            if (ap6Var != null) {
                ap6Var.h(null);
            }
            this.w = hv.L(this.a, null, null, new jc0(j2, this, null, 0), 3);
            return;
        }
        if (hfVar.equals(xe0.x)) {
            if (z) {
                if (df0Var != null) {
                }
                if (df0Var != null) {
                }
                if (!this.d.o.f) {
                }
                long j22 = j;
                ap6Var = this.w;
                if (ap6Var != null) {
                }
                this.w = hv.L(this.a, null, null, new jc0(j22, this, null, 0), 3);
                return;
            }
        }
        Log.d("CXCP", this + ": Not restarting. Controller state = " + this.s + ", last camera error = " + this.u + ", camera availability = " + this.t + ", last camera priorities changed = " + this.v + ", current timestamp = " + ((Object) g67.a(elapsedRealtimeNanos)) + '.');
    }

    public final String toString() {
        return "Camera2CameraController(" + this.n + ')';
    }
}
