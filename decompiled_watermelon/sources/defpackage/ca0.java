package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ca0  reason: default package */
/* loaded from: classes.dex */
public final class ca0 {
    public Map A;
    public kd6 B;
    public kd6 C;
    public kd6 D;
    public final o31 a;
    public final ct6 b;
    public final tg6 c;
    public final bd0 d;
    public final an2 e;
    public final xj6 f;
    public final ka0 g;
    public final ki0 h;
    public final r9 i;
    public final ww4 j;
    public final fg0 k;
    public final fb0 l;
    public final cm6 m;
    public final hd0 n;
    public final p90 o;
    public final tf6 p;
    public final Object q;
    public boolean r;
    public tq5 s;
    public zf0 t;
    public uc0 u;
    public pt6 v;
    public kd6 w;
    public final gs0 x;
    public nc7 y;
    public qi0 z;

    public ca0(o31 o31Var, ct6 ct6Var, tg6 tg6Var, bd0 bd0Var, an2 an2Var, xj6 xj6Var, ka0 ka0Var, ki0 ki0Var, r9 r9Var, ww4 ww4Var, fg0 fg0Var, fb0 fb0Var, cm6 cm6Var, hd0 hd0Var, p90 p90Var, tf6 tf6Var, aw0 aw0Var) {
        o31Var.getClass();
        ct6Var.getClass();
        tg6Var.getClass();
        bd0Var.getClass();
        ka0Var.getClass();
        ki0Var.getClass();
        ww4Var.getClass();
        fg0Var.getClass();
        fb0Var.getClass();
        cm6Var.getClass();
        aw0Var.getClass();
        this.a = o31Var;
        this.b = ct6Var;
        this.c = tg6Var;
        this.d = bd0Var;
        this.e = an2Var;
        this.f = xj6Var;
        this.g = ka0Var;
        this.h = ki0Var;
        this.i = r9Var;
        this.j = ww4Var;
        this.k = fg0Var;
        this.l = fb0Var;
        this.m = cm6Var;
        this.n = hd0Var;
        this.o = p90Var;
        this.p = tf6Var;
        this.q = new Object();
        this.r = true;
        this.s = oc0.y;
        this.t = new xf0(bd0Var.a);
        this.x = new gs0();
        this.C = tq5.w(o31Var, null, null, new z90(this, null, 0), 3);
        this.D = tq5.w(o31Var, null, null, new z90(this, null, 1), 3);
    }

    public static final void a(ca0 ca0Var, zf0 zf0Var) {
        Log.d("CXCP", ca0Var + " (" + ((Object) od0.b(ca0Var.d.a)) + ") camera status changed: " + zf0Var);
        synchronized (ca0Var.q) {
            try {
                if (ca0Var.e()) {
                    return;
                }
                if (zf0Var instanceof vf0) {
                    ca0Var.t = zf0Var;
                } else if (zf0Var instanceof xf0) {
                    ca0Var.t = zf0Var;
                } else if (zf0Var instanceof wf0) {
                    ca0Var.m.getClass();
                    ca0Var.v = new pt6(SystemClock.elapsedRealtimeNanos());
                }
                ca0Var.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void b(ca0 ca0Var) {
        if (ca0Var.e()) {
            Log.w("CXCP", "Ignoring stop(): " + ca0Var + " is already closed");
            return;
        }
        tq5 tq5Var = ca0Var.s;
        oc0 oc0Var = oc0.z;
        if (!tq5Var.equals(oc0Var) && !ca0Var.s.equals(oc0.y)) {
            nc7 nc7Var = ca0Var.y;
            qi0 qi0Var = ca0Var.z;
            ca0Var.y = null;
            ca0Var.z = null;
            ca0Var.s = oc0Var;
            Log.d("CXCP", "Stopping " + ca0Var);
            ca0Var.d(qi0Var, nc7Var);
            return;
        }
        Log.w("CXCP", "Ignoring stop(): " + ca0Var + " already stopping or stopped");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.k11 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aa0
            if (r0 == 0) goto L13
            r0 = r6
            aa0 r0 = (defpackage.aa0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            aa0 r0 = new aa0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L28
            defpackage.me2.a0(r6)
            goto La1
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.me2.a0(r6)
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r4 = "#awaitClosed"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r6, r2)
            java.lang.Object r6 = r5.q
            monitor-enter(r6)
            tq5 r2 = r5.s     // Catch: java.lang.Throwable -> L6f
            oc0 r4 = defpackage.oc0.t     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "#awaitClosed: Controller is already closed."
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.d(r0, r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return r5
        L6f:
            r5 = move-exception
            goto La4
        L71:
            tq5 r2 = r5.s     // Catch: java.lang.Throwable -> L6f
            oc0 r4 = defpackage.oc0.u     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L95
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "#awaitClosed: Controller isn't closing!"
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return r5
        L95:
            monitor-exit(r6)
            gs0 r5 = r5.x
            r0.Y = r3
            java.lang.Object r5 = r5.h(r0)
            if (r5 != r1) goto La1
            return r1
        La1:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        La4:
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca0.c(k11):java.lang.Object");
    }

    public final void d(qi0 qi0Var, nc7 nc7Var) {
        kd6 w = tq5.w(this.a, null, null, new n5(qi0Var, nc7Var, (j11) null, 5), 3);
        if (this.s.equals(oc0.u)) {
            w.R(new x90(this, 0));
        }
    }

    public final boolean e() {
        if (!this.s.equals(oc0.u) && !this.s.equals(oc0.t)) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (e()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        tq5 tq5Var = this.s;
        oc0 oc0Var = oc0.x;
        if (tq5Var.equals(oc0Var)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        this.u = null;
        bd0 bd0Var = this.d;
        String str = bd0Var.a;
        List n1 = tq0.n1(hi2.H(hi2.X(new od0(str)), new od0(str)));
        x90 x90Var = new x90(this, 1);
        ww4 ww4Var = this.j;
        ww4Var.getClass();
        str.getClass();
        o31 o31Var = ww4Var.d;
        an2 an2Var = this.e;
        nc7 nc7Var = new nc7(str, an2Var, o31Var);
        ka kaVar = ww4Var.e;
        if (((q60) kaVar.Y).c(new ib5(nc7Var, n1, an2Var, x90Var)) instanceof wj0) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) od0.b(str)) + '!');
            an2Var.a(new en2(12, false));
            nc7Var = null;
        }
        if (nc7Var == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
        } else if (this.y == null) {
            if (this.z == null) {
                this.y = nc7Var;
                qi0 qi0Var = new qi0(an2Var, this.h, this.i, this.k, this.m, bd0Var.o, null, this.p, this.c, this.b, this.a);
                this.z = qi0Var;
                Map map = this.A;
                if (map != null) {
                    qi0Var.k(map);
                }
                this.s = oc0Var;
                Log.d("CXCP", "Started " + this);
                kd6 kd6Var = this.B;
                if (kd6Var != null) {
                    kd6Var.i(null);
                }
                this.B = tq5.w(this.a, null, null, new z90(this, null, 2), 3);
                return;
            }
            i.n("Check failed.");
        } else {
            i.n("Check failed.");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca0.g():void");
    }

    public final String toString() {
        return "Camera2CameraController(" + this.n + ')';
    }
}
