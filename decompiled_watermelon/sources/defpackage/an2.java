package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: an2  reason: default package */
/* loaded from: classes.dex */
public final class an2 {
    public final hd0 a;
    public final zm2 b;
    public final List c;
    public final ee6 d;

    public an2(ct6 ct6Var, hd0 hd0Var, bd0 bd0Var, nq3 nq3Var, List list, fb0 fb0Var) {
        int i;
        yh0 yh0Var;
        Iterable iterable;
        ct6Var.getClass();
        bd0Var.getClass();
        nq3Var.getClass();
        list.getClass();
        fb0Var.getClass();
        this.a = hd0Var;
        this.c = bd0Var.l;
        Map map = bd0Var.j;
        Map map2 = bd0Var.m;
        tx3 tx3Var = le0.c;
        Object obj = map.get(tx3Var);
        Boolean bool = Boolean.TRUE;
        if (b53.x(obj, bool) || b53.x(map2.get(tx3Var), bool)) {
            Log.i("CXCP", tx3Var + " is set to true, ignoring GraphState3A parameters.");
        }
        dd0 dd0Var = bd0Var.o;
        dd0Var.getClass();
        fb0Var.b.getClass();
        sb sbVar = dd0Var.b;
        Set set = (Set) fb0.c.get(Build.MANUFACTURER);
        if (set != null && set.contains(Build.DEVICE) && Build.VERSION.SDK_INT < 34) {
            i = Math.max(0, 10);
        } else {
            i = 0;
        }
        int i2 = sbVar.B;
        int i3 = eb0.a[((ed0) sbVar.L).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i.c();
                throw null;
            }
        } else {
            i2 = Math.max(i, i2);
        }
        if (i2 != 0) {
            yh0Var = new yh0(i2);
        } else {
            yh0Var = null;
        }
        if (yh0Var != null) {
            iterable = l07.b0(yh0Var);
        } else {
            iterable = pp1.A;
        }
        zm2 zm2Var = new zm2(hd0Var, map, map2, tq0.X0(list, iterable), nu.o0(new Object[]{nq3Var, yh0Var}), ct6Var.a, ct6Var.h);
        this.b = zm2Var;
        if (yh0Var != null) {
            if (yh0Var.L == null) {
                yh0Var.L = zm2Var;
                zm2Var.I(false);
                Log.w("CXCP", "Capture processing has been disabled for " + zm2Var + " until " + yh0Var.A + " frames have been completed.");
            } else {
                i.n("GraphLoop has already been set!");
                throw null;
            }
        }
        this.d = fe6.a(gn2.b);
    }

    public final void a(en2 en2Var) {
        ee6 ee6Var;
        Object value;
        Object obj;
        Log.d("CXCP", this + " onGraphError(" + en2Var + ')');
        do {
            ee6Var = this.d;
            value = ee6Var.getValue();
            jn2 jn2Var = (jn2) value;
            if (!(jn2Var instanceof hn2) && !(jn2Var instanceof gn2)) {
                obj = en2Var;
            } else {
                obj = gn2.b;
            }
        } while (!ee6Var.j(value, obj));
        for (kn2 kn2Var : this.c) {
            kn2Var.getClass();
            kn2Var.a.b(kn2Var.a(), en2Var);
        }
    }

    public final void b(vh0 vh0Var) {
        Log.d("CXCP", this + " onGraphStarted");
        fn2 fn2Var = fn2.b;
        this.d.k(fn2Var);
        this.b.J(vh0Var);
        for (kn2 kn2Var : this.c) {
            kn2Var.a.b(kn2Var.a(), fn2Var);
        }
    }

    public final void c() {
        Log.d("CXCP", this + " onGraphStopped");
        ee6 ee6Var = this.d;
        gn2 gn2Var = gn2.b;
        ee6Var.k(gn2Var);
        this.b.J(null);
        for (kn2 kn2Var : this.c) {
            kn2Var.a.b(kn2Var.a(), gn2Var);
        }
    }

    public final void d(sa5 sa5Var) {
        zm2 zm2Var = this.b;
        synchronized (zm2Var.c0) {
            try {
                sa5 sa5Var2 = zm2Var.f0;
                zm2Var.f0 = sa5Var;
                if (sa5Var2 != null || sa5Var != null) {
                    r9 r9Var = zm2Var.Z;
                    if (sa5Var != null) {
                        r9Var.H(new rm2(sa5Var));
                    } else {
                        r9Var.H(nm2.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sa5Var == null) {
            int size = zm2Var.R.size();
            for (int i = 0; i < size; i++) {
                ((vm2) zm2Var.R.get(i)).c();
            }
        }
    }

    public final void e(LinkedHashMap linkedHashMap) {
        zm2 zm2Var = this.b;
        zm2Var.getClass();
        synchronized (zm2Var.c0) {
            zm2Var.Z.H(new qm2(zm2Var.g0, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.a + ')';
    }
}
