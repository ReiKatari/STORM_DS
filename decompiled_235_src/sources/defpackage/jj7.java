package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj7  reason: default package */
/* loaded from: classes.dex */
public final class jj7 {
    public final kj7 a;
    public final tg0 b;
    public final c43 c;
    public final tc6 d;
    public final Object e;
    public kg1 f;
    public final LinkedHashMap g;
    public LinkedHashMap h;
    public tu0 i;

    public jj7(kj7 kj7Var, tg0 tg0Var, c43 c43Var, tc6 tc6Var) {
        kj7Var.getClass();
        tc6Var.getClass();
        this.a = kj7Var;
        this.b = tg0Var;
        this.c = c43Var;
        this.d = tc6Var;
        this.e = new Object();
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jj7 jj7Var, List list, long j, s41 s41Var) {
        ij7 ij7Var;
        int i;
        List list2;
        if (s41Var instanceof ij7) {
            ij7Var = (ij7) s41Var;
            int i2 = ij7Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ij7Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = ij7Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ij7Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ns3 ns3Var = new ns3(list, null, 19);
                    ij7Var.Y = 1;
                    obj = xk2.N(j, ns3Var, ij7Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                list2 = (List) obj;
                if (list2 != null) {
                    return yt1.A;
                }
                return list2;
            }
        }
        ij7Var = new ij7(jj7Var, s41Var);
        Object obj2 = ij7Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ij7Var.Y;
        if (i == 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
    }

    public static final void b(jj7 jj7Var) {
        Set<Surface> keySet;
        oi0 a = jj7Var.b.a();
        a.getClass();
        synchronized (a.a) {
            try {
                a.c.add(jj7Var);
                LinkedHashMap linkedHashMap = a.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                keySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Surface surface : keySet) {
            jj7Var.d(surface);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(jj7 jj7Var, s41 s41Var) {
        hj7 hj7Var;
        int i;
        try {
            if (s41Var instanceof hj7) {
                hj7Var = (hj7) s41Var;
                int i2 = hj7Var.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hj7Var.Y = i2 - Integer.MIN_VALUE;
                    Object obj = hj7Var.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = hj7Var.Y;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    synchronized (jj7Var.e) {
                        kg1 kg1Var = jj7Var.f;
                        if (kg1Var != null && jj7Var.i == null) {
                            hj7Var.Y = 1;
                            Object q = kg1Var.q(hj7Var);
                            if (q == x61Var) {
                                return x61Var;
                            }
                            return q;
                        }
                        return Boolean.FALSE;
                    }
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException unused) {
            if (kj2.L()) {
                Log.w("CXCP", "Surface setup was cancelled");
            }
            return Boolean.FALSE;
        }
        hj7Var = new hj7(jj7Var, s41Var);
        Object obj2 = hj7Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = hj7Var.Y;
    }

    public final void d(Surface surface) {
        ig1 ig1Var;
        surface.getClass();
        synchronized (this.e) {
            try {
                LinkedHashMap linkedHashMap = this.h;
                if (linkedHashMap != null && (ig1Var = (ig1) linkedHashMap.get(surface)) != null && !this.g.containsKey(surface)) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", "SurfaceActive " + ig1Var + " in " + this);
                    }
                    this.g.put(surface, ig1Var);
                    try {
                        ig1Var.d();
                    } catch (hg1 e) {
                        if (kj2.L()) {
                            Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                        }
                        tc6 tc6Var = this.d;
                        ig1 ig1Var2 = e.A;
                        ig1Var2.getClass();
                        tc6Var.a(ig1Var2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.e) {
            try {
                if (this.g.isEmpty() && this.h == null) {
                    if (kj2.F("CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    oi0 a = this.b.a();
                    a.getClass();
                    synchronized (a.a) {
                        a.c.remove(this);
                    }
                    tu0 tu0Var = this.i;
                    if (tu0Var != null) {
                        tu0Var.b0(jg7.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
