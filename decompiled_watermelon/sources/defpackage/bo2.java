package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bo2  reason: default package */
/* loaded from: classes.dex */
public final class bo2 implements zu5, nc4, k22 {
    public static final String j0 = y70.h("GreedyScheduler");
    public final Context A;
    public final uc1 L;
    public boolean R;
    public final ku4 Z;
    public final wv6 c0;
    public final ew0 d0;
    public Boolean f0;
    public final vq2 g0;
    public final nh7 h0;
    public final q9 i0;
    public final HashMap B = new HashMap();
    public final Object X = new Object();
    public final ci3 Y = new ci3(new e81(9, (byte) 0));
    public final HashMap e0 = new HashMap();

    public bo2(Context context, ew0 ew0Var, jw6 jw6Var, ku4 ku4Var, wv6 wv6Var, nh7 nh7Var) {
        this.A = context;
        t71 t71Var = ew0Var.g;
        this.L = new uc1(this, t71Var, ew0Var.d);
        this.i0 = new q9(t71Var, wv6Var);
        this.h0 = nh7Var;
        this.g0 = new vq2(jw6Var);
        this.d0 = ew0Var;
        this.Z = ku4Var;
        this.c0 = wv6Var;
    }

    @Override // defpackage.zu5
    public final void a(String str) {
        List<td6> l;
        Runnable runnable;
        String str2 = j0;
        if (this.f0 == null) {
            this.f0 = Boolean.valueOf(hu4.a(this.A, this.d0));
        }
        if (!this.f0.booleanValue()) {
            y70.f().g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.R) {
            this.Z.a(this);
            this.R = true;
        }
        y70 f = y70.f();
        f.b(str2, "Cancelling work ID " + str);
        uc1 uc1Var = this.L;
        if (uc1Var != null && (runnable = (Runnable) uc1Var.d.remove(str)) != null) {
            ((Handler) uc1Var.b.B).removeCallbacks(runnable);
        }
        ci3 ci3Var = this.Y;
        ci3Var.getClass();
        str.getClass();
        synchronized (ci3Var.L) {
            l = ((e81) ci3Var.B).l(str);
        }
        for (td6 td6Var : l) {
            this.i0.m(td6Var);
            wv6 wv6Var = this.c0;
            wv6Var.getClass();
            wv6Var.l(td6Var, -512);
        }
    }

    @Override // defpackage.nc4
    public final void b(xh7 xh7Var, sz0 sz0Var) {
        gh7 b = ei7.b(xh7Var);
        boolean z = sz0Var instanceof qz0;
        wv6 wv6Var = this.c0;
        q9 q9Var = this.i0;
        String str = j0;
        ci3 ci3Var = this.Y;
        if (z) {
            if (!ci3Var.q(b)) {
                y70 f = y70.f();
                f.b(str, "Constraints met: Scheduling work ID " + b);
                td6 A = ci3Var.A(b);
                q9Var.N(A);
                wv6Var.getClass();
                wv6Var.k(A, null);
                return;
            }
            return;
        }
        y70 f2 = y70.f();
        f2.b(str, "Constraints not met: Cancelling work ID " + b);
        td6 y = ci3Var.y(b);
        if (y != null) {
            q9Var.m(y);
            int i = ((rz0) sz0Var).a;
            wv6Var.getClass();
            wv6Var.l(y, i);
        }
    }

    @Override // defpackage.zu5
    public final void c(xh7... xh7VarArr) {
        long max;
        if (this.f0 == null) {
            this.f0 = Boolean.valueOf(hu4.a(this.A, this.d0));
        }
        if (!this.f0.booleanValue()) {
            y70.f().g(j0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.R) {
            this.Z.a(this);
            this.R = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (xh7 xh7Var : xh7VarArr) {
            if (!this.Y.q(ei7.b(xh7Var))) {
                synchronized (this.X) {
                    try {
                        gh7 b = ei7.b(xh7Var);
                        ao2 ao2Var = (ao2) this.e0.get(b);
                        if (ao2Var == null) {
                            int i = xh7Var.k;
                            this.d0.d.getClass();
                            ao2Var = new ao2(i, System.currentTimeMillis());
                            this.e0.put(b, ao2Var);
                        }
                        max = (Math.max((xh7Var.k - ao2Var.a) - 5, 0) * 30000) + ao2Var.b;
                    } finally {
                    }
                }
                long max2 = Math.max(xh7Var.a(), max);
                this.d0.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (xh7Var.b == ih7.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        uc1 uc1Var = this.L;
                        if (uc1Var != null) {
                            t71 t71Var = uc1Var.b;
                            HashMap hashMap = uc1Var.d;
                            Runnable runnable = (Runnable) hashMap.remove(xh7Var.a);
                            if (runnable != null) {
                                ((Handler) t71Var.B).removeCallbacks(runnable);
                            }
                            qj2 qj2Var = new qj2(7, uc1Var, xh7Var, false);
                            hashMap.put(xh7Var.a, qj2Var);
                            uc1Var.c.getClass();
                            ((Handler) t71Var.B).postDelayed(qj2Var, max2 - System.currentTimeMillis());
                        }
                    } else if (!b53.x(kz0.j, xh7Var.j)) {
                        kz0 kz0Var = xh7Var.j;
                        if (kz0Var.d) {
                            y70.f().b(j0, "Ignoring " + xh7Var + ". Requires device idle.");
                        } else if (!kz0Var.i.isEmpty()) {
                            y70.f().b(j0, "Ignoring " + xh7Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(xh7Var);
                            hashSet2.add(xh7Var.a);
                        }
                    } else if (!this.Y.q(ei7.b(xh7Var))) {
                        y70.f().b(j0, "Starting work for " + xh7Var.a);
                        ci3 ci3Var = this.Y;
                        ci3Var.getClass();
                        td6 A = ci3Var.A(ei7.b(xh7Var));
                        this.i0.N(A);
                        wv6 wv6Var = this.c0;
                        wv6Var.getClass();
                        wv6Var.k(A, null);
                    }
                }
            }
        }
        synchronized (this.X) {
            try {
                if (!hashSet.isEmpty()) {
                    y70.f().b(j0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        xh7 xh7Var2 = (xh7) it.next();
                        gh7 b2 = ei7.b(xh7Var2);
                        if (!this.B.containsKey(b2)) {
                            this.B.put(b2, zg7.a(this.g0, xh7Var2, this.h0.b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.k22
    public final void d(gh7 gh7Var, boolean z) {
        c63 c63Var;
        td6 y = this.Y.y(gh7Var);
        if (y != null) {
            this.i0.m(y);
        }
        synchronized (this.X) {
            c63Var = (c63) this.B.remove(gh7Var);
        }
        if (c63Var != null) {
            y70 f = y70.f();
            String str = j0;
            f.b(str, "Stopping tracking for " + gh7Var);
            c63Var.i(null);
        }
        if (!z) {
            synchronized (this.X) {
                this.e0.remove(gh7Var);
            }
        }
    }

    @Override // defpackage.zu5
    public final boolean e() {
        return false;
    }
}
