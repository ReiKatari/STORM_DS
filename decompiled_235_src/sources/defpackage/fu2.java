package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fu2  reason: default package */
/* loaded from: classes.dex */
public final class fu2 implements e66, ll4, b72 {
    public static final String k0 = ga0.h("GreedyScheduler");
    public final Context A;
    public final wg1 L;
    public boolean R;
    public final o35 Z;
    public final rr6 d0;
    public final az0 e0;
    public Boolean g0;
    public final ww2 h0;
    public final ow7 i0;
    public final eb j0;
    public final HashMap B = new HashMap();
    public final Object X = new Object();
    public final rr6 Y = new rr6(new wb1(9, (byte) 0));
    public final HashMap f0 = new HashMap();

    public fu2(Context context, az0 az0Var, w87 w87Var, o35 o35Var, rr6 rr6Var, ow7 ow7Var) {
        this.A = context;
        d51 d51Var = az0Var.g;
        this.L = new wg1(this, d51Var, az0Var.d);
        this.j0 = new eb(d51Var, rr6Var);
        this.i0 = ow7Var;
        this.h0 = new ww2(w87Var);
        this.e0 = az0Var;
        this.Z = o35Var;
        this.d0 = rr6Var;
    }

    @Override // defpackage.ll4
    public final void a(yw7 yw7Var, x21 x21Var) {
        gw7 a = rr7.a(yw7Var);
        boolean z = x21Var instanceof v21;
        rr6 rr6Var = this.d0;
        eb ebVar = this.j0;
        String str = k0;
        rr6 rr6Var2 = this.Y;
        if (z) {
            if (!rr6Var2.g(a)) {
                ga0 f = ga0.f();
                f.b(str, "Constraints met: Scheduling work ID " + a);
                jp6 r = rr6Var2.r(a);
                ebVar.O(r);
                rr6Var.getClass();
                rr6Var.p(r, null);
                return;
            }
            return;
        }
        ga0 f2 = ga0.f();
        f2.b(str, "Constraints not met: Cancelling work ID " + a);
        jp6 l = rr6Var2.l(a);
        if (l != null) {
            ebVar.m(l);
            int i = ((w21) x21Var).a;
            rr6Var.getClass();
            rr6Var.q(l, i);
        }
    }

    @Override // defpackage.b72
    public final void b(gw7 gw7Var, boolean z) {
        rc3 rc3Var;
        jp6 l = this.Y.l(gw7Var);
        if (l != null) {
            this.j0.m(l);
        }
        synchronized (this.X) {
            rc3Var = (rc3) this.B.remove(gw7Var);
        }
        if (rc3Var != null) {
            ga0 f = ga0.f();
            String str = k0;
            f.b(str, "Stopping tracking for " + gw7Var);
            rc3Var.h(null);
        }
        if (!z) {
            synchronized (this.X) {
                this.f0.remove(gw7Var);
            }
        }
    }

    @Override // defpackage.e66
    public final boolean c() {
        return false;
    }

    @Override // defpackage.e66
    public final void d(String str) {
        List<jp6> l;
        Runnable runnable;
        String str2 = k0;
        if (this.g0 == null) {
            this.g0 = Boolean.valueOf(l35.a(this.A, this.e0));
        }
        if (!this.g0.booleanValue()) {
            ga0.f().g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.R) {
            this.Z.a(this);
            this.R = true;
        }
        ga0 f = ga0.f();
        f.b(str2, "Cancelling work ID " + str);
        wg1 wg1Var = this.L;
        if (wg1Var != null && (runnable = (Runnable) wg1Var.d.remove(str)) != null) {
            ((Handler) wg1Var.b.B).removeCallbacks(runnable);
        }
        rr6 rr6Var = this.Y;
        rr6Var.getClass();
        str.getClass();
        synchronized (rr6Var.L) {
            l = ((wb1) rr6Var.B).l(str);
        }
        for (jp6 jp6Var : l) {
            this.j0.m(jp6Var);
            rr6 rr6Var2 = this.d0;
            rr6Var2.getClass();
            rr6Var2.q(jp6Var, -512);
        }
    }

    @Override // defpackage.e66
    public final void e(yw7... yw7VarArr) {
        long max;
        if (this.g0 == null) {
            this.g0 = Boolean.valueOf(l35.a(this.A, this.e0));
        }
        if (!this.g0.booleanValue()) {
            ga0.f().g(k0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.R) {
            this.Z.a(this);
            this.R = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (yw7 yw7Var : yw7VarArr) {
            if (!this.Y.g(rr7.a(yw7Var))) {
                synchronized (this.X) {
                    try {
                        gw7 a = rr7.a(yw7Var);
                        eu2 eu2Var = (eu2) this.f0.get(a);
                        if (eu2Var == null) {
                            int i = yw7Var.k;
                            this.e0.d.getClass();
                            eu2Var = new eu2(i, System.currentTimeMillis());
                            this.f0.put(a, eu2Var);
                        }
                        max = (Math.max((yw7Var.k - eu2Var.a) - 5, 0) * 30000) + eu2Var.b;
                    } finally {
                    }
                }
                long max2 = Math.max(yw7Var.a(), max);
                this.e0.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (yw7Var.b == iw7.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        wg1 wg1Var = this.L;
                        if (wg1Var != null) {
                            d51 d51Var = wg1Var.b;
                            HashMap hashMap = wg1Var.d;
                            Runnable runnable = (Runnable) hashMap.remove(yw7Var.a);
                            if (runnable != null) {
                                ((Handler) d51Var.B).removeCallbacks(runnable);
                            }
                            uo2 uo2Var = new uo2(9, wg1Var, yw7Var, false);
                            hashMap.put(yw7Var.a, uo2Var);
                            wg1Var.c.getClass();
                            ((Handler) d51Var.B).postDelayed(uo2Var, max2 - System.currentTimeMillis());
                        }
                    } else if (!nb3.k(p21.j, yw7Var.j)) {
                        p21 p21Var = yw7Var.j;
                        if (p21Var.d) {
                            ga0.f().b(k0, "Ignoring " + yw7Var + ". Requires device idle.");
                        } else if (!p21Var.i.isEmpty()) {
                            ga0.f().b(k0, "Ignoring " + yw7Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(yw7Var);
                            hashSet2.add(yw7Var.a);
                        }
                    } else if (!this.Y.g(rr7.a(yw7Var))) {
                        ga0.f().b(k0, "Starting work for " + yw7Var.a);
                        rr6 rr6Var = this.Y;
                        rr6Var.getClass();
                        jp6 r = rr6Var.r(rr7.a(yw7Var));
                        this.j0.O(r);
                        rr6 rr6Var2 = this.d0;
                        rr6Var2.getClass();
                        rr6Var2.p(r, null);
                    }
                }
            }
        }
        synchronized (this.X) {
            try {
                if (!hashSet.isEmpty()) {
                    ga0.f().b(k0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        yw7 yw7Var2 = (yw7) it.next();
                        gw7 a2 = rr7.a(yw7Var2);
                        if (!this.B.containsKey(a2)) {
                            this.B.put(a2, zv7.a(this.h0, yw7Var2, this.i0.b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }
}
