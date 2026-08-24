package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gt2  reason: default package */
/* loaded from: classes.dex */
public final class gt2 {
    public final qf0 a;
    public final ft2 b;
    public final List c;
    public final tp6 d;

    public gt2(t57 t57Var, qf0 qf0Var, kf0 kf0Var, ox3 ox3Var, List list, nd0 nd0Var) {
        int i;
        gk0 gk0Var;
        Iterable iterable;
        t57Var.getClass();
        kf0Var.getClass();
        ox3Var.getClass();
        list.getClass();
        nd0Var.getClass();
        this.a = qf0Var;
        this.c = kf0Var.l;
        Map map = kf0Var.j;
        Map map2 = kf0Var.m;
        k54 k54Var = ug0.c;
        Object obj = map.get(k54Var);
        Boolean bool = Boolean.TRUE;
        if (nb3.k(obj, bool) || nb3.k(map2.get(k54Var), bool)) {
            Log.i("CXCP", k54Var + " is set to true, ignoring GraphState3A parameters.");
        }
        mf0 mf0Var = kf0Var.o;
        mf0Var.getClass();
        nd0Var.b.getClass();
        zb zbVar = mf0Var.b;
        Set set = (Set) nd0.c.get(Build.MANUFACTURER);
        if (set != null && set.contains(Build.DEVICE) && Build.VERSION.SDK_INT < 34) {
            i = Math.max(0, 10);
        } else {
            i = 0;
        }
        int i2 = zbVar.B;
        int i3 = md0.a[((nf0) zbVar.L).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i.d();
                throw null;
            }
        } else {
            i2 = Math.max(i, i2);
        }
        if (i2 != 0) {
            gk0Var = new gk0(i2);
        } else {
            gk0Var = null;
        }
        if (gk0Var != null) {
            iterable = hf.b0(gk0Var);
        } else {
            iterable = yt1.A;
        }
        ft2 ft2Var = new ft2(qf0Var, map, map2, gt0.V0(list, iterable), fv.C0(new Object[]{ox3Var, gk0Var}), t57Var.a, t57Var.h);
        this.b = ft2Var;
        if (gk0Var != null) {
            if (gk0Var.L == null) {
                gk0Var.L = ft2Var;
                ft2Var.D(false);
                Log.w("CXCP", "Capture processing has been disabled for " + ft2Var + " until " + gk0Var.A + " frames have been completed.");
            } else {
                i.m("GraphLoop has already been set!");
                throw null;
            }
        }
        this.d = up6.a(mt2.b);
    }

    public final void a(kt2 kt2Var) {
        tp6 tp6Var;
        Object value;
        Object obj;
        Log.d("CXCP", this + " onGraphError(" + kt2Var + ')');
        do {
            tp6Var = this.d;
            value = tp6Var.getValue();
            pt2 pt2Var = (pt2) value;
            if (!(pt2Var instanceof nt2) && !(pt2Var instanceof mt2)) {
                obj = kt2Var;
            } else {
                obj = mt2.b;
            }
        } while (!tp6Var.j(value, obj));
        for (qt2 qt2Var : this.c) {
            qt2Var.getClass();
            qt2Var.a.b(qt2Var.a(), kt2Var);
        }
    }

    public final void b(dk0 dk0Var) {
        Log.d("CXCP", this + " onGraphStarted");
        lt2 lt2Var = lt2.b;
        this.d.l(lt2Var);
        this.b.F(dk0Var);
        for (qt2 qt2Var : this.c) {
            qt2Var.a.b(qt2Var.a(), lt2Var);
        }
    }

    public final void c() {
        Log.d("CXCP", this + " onGraphStopped");
        tp6 tp6Var = this.d;
        mt2 mt2Var = mt2.b;
        tp6Var.l(mt2Var);
        this.b.F(null);
        for (qt2 qt2Var : this.c) {
            qt2Var.a.b(qt2Var.a(), mt2Var);
        }
    }

    public final void d(kk5 kk5Var) {
        ft2 ft2Var = this.b;
        synchronized (ft2Var.d0) {
            try {
                kk5 kk5Var2 = ft2Var.g0;
                ft2Var.g0 = kk5Var;
                if (kk5Var2 != null || kk5Var != null) {
                    s9 s9Var = ft2Var.Z;
                    if (kk5Var != null) {
                        s9Var.H(new xs2(kk5Var));
                    } else {
                        s9Var.H(ts2.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kk5Var == null) {
            int size = ft2Var.R.size();
            for (int i = 0; i < size; i++) {
                ((bt2) ft2Var.R.get(i)).c();
            }
        }
    }

    public final void e(LinkedHashMap linkedHashMap) {
        ft2 ft2Var = this.b;
        ft2Var.getClass();
        synchronized (ft2Var.d0) {
            ft2Var.Z.H(new ws2(ft2Var.h0, linkedHashMap));
        }
    }

    public final String toString() {
        return "GraphProcessor(cameraGraph: " + this.a + ')';
    }
}
