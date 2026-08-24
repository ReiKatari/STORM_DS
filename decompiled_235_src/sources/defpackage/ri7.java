package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri7  reason: default package */
/* loaded from: classes.dex */
public final class ri7 implements li7 {
    public static final tu0 l = u24.b(new fm5(4, null));
    public static final tu0 m;
    public final n55 a;
    public final n55 b;
    public final ej7 c;
    public final n55 d;
    public final kj7 e;
    public final ij0 f;
    public volatile boolean g;
    public final ex6 h;
    public final ex6 i;
    public final ex6 j;
    public final LinkedHashMap k;

    static {
        tu0 tu0Var = new tu0();
        tu0Var.h(null);
        m = tu0Var;
    }

    public ri7(n55 n55Var, n55 n55Var2, ej7 ej7Var, n55 n55Var3, kj7 kj7Var, ij0 ij0Var) {
        n55Var.getClass();
        n55Var2.getClass();
        ej7Var.getClass();
        n55Var3.getClass();
        kj7Var.getClass();
        this.a = n55Var;
        this.b = n55Var2;
        this.c = ej7Var;
        this.d = n55Var3;
        this.e = kj7Var;
        this.f = ij0Var;
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.h = new ex6(new on2(this) { // from class: mi7
            public final /* synthetic */ ri7 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ri7 ri7Var = this.B;
                switch (i) {
                    case 0:
                        return (kk0) ri7Var.a.get();
                    case 1:
                        return (jj7) ri7Var.d.get();
                    default:
                        return (wi7) ri7Var.b.get();
                }
            }
        });
        this.i = new ex6(new on2(this) { // from class: mi7
            public final /* synthetic */ ri7 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ri7 ri7Var = this.B;
                switch (i) {
                    case 0:
                        return (kk0) ri7Var.a.get();
                    case 1:
                        return (jj7) ri7Var.d.get();
                    default:
                        return (wi7) ri7Var.b.get();
                }
            }
        });
        this.j = new ex6(new on2(this) { // from class: mi7
            public final /* synthetic */ ri7 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ri7 ri7Var = this.B;
                switch (i) {
                    case 0:
                        return (kk0) ri7Var.a.get();
                    case 1:
                        return (jj7) ri7Var.d.get();
                    default:
                        return (wi7) ri7Var.b.get();
                }
            }
        });
        this.k = new LinkedHashMap();
    }

    public static final Object k(ri7 ri7Var, ki7 ki7Var, Map map, xy0 xy0Var, hw6 hw6Var) {
        LinkedHashMap linkedHashMap = ri7Var.k;
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + ki7Var + "] values = " + map + ", optionPriority = " + xy0Var);
        }
        Object obj = linkedHashMap.get(ki7Var);
        if (obj == null) {
            obj = new ni7((jd0) null, (LinkedHashMap) null, (bl5) null, 15);
            linkedHashMap.put(ki7Var, obj);
        }
        ni7 ni7Var = (ni7) obj;
        jd0 jd0Var = new jd0(0);
        jd0Var.b(ni7Var.a.B);
        xy0Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            jd0Var.B.l(nw7.T((CaptureRequest.Key) entry.getKey()), xy0Var, value);
        }
        linkedHashMap.put(ki7Var, new ni7(jd0Var, c14.t0(ni7Var.b), gt0.o1(ni7Var.c), ni7Var.d));
        return ri7Var.n(l(linkedHashMap), null, hw6Var);
    }

    public static ni7 l(LinkedHashMap linkedHashMap) {
        ni7 ni7Var = new ni7((jd0) null, (LinkedHashMap) null, new bl5(1), 7);
        for (ki7 ki7Var : ki7.getEntries()) {
            ni7 ni7Var2 = (ni7) linkedHashMap.get(ki7Var);
            if (ni7Var2 != null) {
                ni7Var.a.b(ni7Var2.a.B);
                ni7Var.b.putAll(ni7Var2.b);
                ni7Var.c.addAll(ni7Var2.c);
                bl5 bl5Var = ni7Var2.d;
                if (bl5Var != null) {
                    ni7Var.d = new bl5(bl5Var.a);
                }
            }
        }
        return ni7Var;
    }

    @Override // defpackage.li7
    public final jg1 a() {
        tu0 tu0Var = null;
        if (!this.g) {
            tu0Var = m(new wc0(this, null, 5));
        }
        if (tu0Var == null) {
            return l;
        }
        return tu0Var;
    }

    @Override // defpackage.li7
    public final Object c(hw6 hw6Var) {
        jj7 jj7Var = (jj7) this.i.getValue();
        jj7Var.getClass();
        return jj7.c(jj7Var, hw6Var);
    }

    @Override // defpackage.li7
    public final void close() {
        this.g = true;
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        wi7 wi7Var = (wi7) this.j.getValue();
        synchronized (wi7Var.c) {
            try {
                if (wi7Var.g) {
                    wi7Var.g = false;
                    tu0 tu0Var = wi7Var.d;
                    if (tu0Var != null) {
                        tu0Var.v0(new CancellationException("UseCaseCameraState closed"));
                    }
                    wi7Var.d = null;
                }
                while (!wi7Var.f.isEmpty()) {
                    ((ti7) wi7Var.f.removeFirst()).b.v0(new CancellationException("UseCaseCameraState closed"));
                    wi7Var.q.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.li7
    public final jg1 d(kd0 kd0Var, Map map) {
        tu0 tu0Var = null;
        if (!this.g) {
            tu0Var = m(new ad(this, kd0Var, map, null, 5));
        }
        if (tu0Var == null) {
            return m;
        }
        return tu0Var;
    }

    @Override // defpackage.li7
    public final jg1 e(int i) {
        tu0 tu0Var = null;
        if (!this.g) {
            tu0Var = m(new oi7(this, i, null));
        }
        if (tu0Var == null) {
            return l;
        }
        return tu0Var;
    }

    @Override // defpackage.li7
    public final jg1 f(List list, ki7 ki7Var) {
        ki7Var.getClass();
        tu0 tu0Var = null;
        if (!this.g) {
            tu0Var = m(new ad(this, ki7Var, list, null, 4));
        }
        if (tu0Var == null) {
            return m;
        }
        return tu0Var;
    }

    @Override // defpackage.li7
    public final jg1 g(LinkedHashSet linkedHashSet, boolean z) {
        tu0 tu0Var = null;
        if (!this.g) {
            tu0Var = m(new qi7(linkedHashSet, z, this, null));
        }
        if (tu0Var == null) {
            return m;
        }
        return tu0Var;
    }

    @Override // defpackage.li7
    public final jg1 h(Map map, ki7 ki7Var, xy0 xy0Var) {
        ki7Var.getClass();
        xy0Var.getClass();
        if (this.g) {
            return m;
        }
        if (nb3.k(this.e.d.get(), Boolean.TRUE)) {
            return hv.i(this.e.f, null, a71.UNDISPATCHED, new kp5(this, ki7Var, map, xy0Var, null, 9), 1);
        }
        u34.i(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    @Override // defpackage.li7
    public final jg1 i(Map map, ki7 ki7Var, xy0 xy0Var) {
        tu0 tu0Var;
        ki7Var.getClass();
        xy0Var.getClass();
        if (!this.g) {
            tu0Var = m(new n22(this, ki7Var, map, xy0Var, null, 1));
        } else {
            tu0Var = null;
        }
        if (tu0Var == null) {
            return m;
        }
        return tu0Var;
    }

    @Override // defpackage.li7
    public final jg1 j() {
        tu0 tu0Var = null;
        if (!this.g) {
            tu0Var = m(new yc(this, null));
        }
        if (tu0Var == null) {
            return l;
        }
        return tu0Var;
    }

    public final tu0 m(qn2 qn2Var) {
        a71 a71Var;
        kj7 kj7Var = this.e;
        kj7Var.getClass();
        if (nb3.k(kj7Var.d.get(), Boolean.TRUE)) {
            a71Var = a71.UNDISPATCHED;
        } else {
            a71Var = a71.DEFAULT;
        }
        tu0 tu0Var = new tu0();
        hv.L(kj7Var.f, null, a71Var, new bf4(qn2Var, tu0Var, null, 25), 1);
        return tu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(ni7 ni7Var, LinkedHashSet linkedHashSet, s41 s41Var) {
        pi7 pi7Var;
        int i;
        jg1 jg1Var;
        int i2;
        if (s41Var instanceof pi7) {
            pi7Var = (pi7) s41Var;
            int i3 = pi7Var.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pi7Var.Y = i3 - Integer.MIN_VALUE;
                pi7 pi7Var2 = pi7Var;
                Object obj = pi7Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = pi7Var2.Y;
                jg1Var = null;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (!this.g) {
                        ij0 ij0Var = this.f;
                        xx xxVar = uc0.a;
                        if (ij0Var.A.b(uc0.a, null) == null) {
                            kk0 kk0Var = (kk0) this.h.getValue();
                            bl5 bl5Var = ni7Var.d;
                            bl5Var.getClass();
                            if (bl5Var.a != -1) {
                                bl5 bl5Var2 = ni7Var.d;
                                bl5Var2.getClass();
                                i2 = bl5Var2.a;
                            } else {
                                i2 = 1;
                            }
                            kk0Var.a(i2);
                            wi7 wi7Var = (wi7) this.j.getValue();
                            LinkedHashMap r0 = nw7.r0(ni7Var.a.a());
                            k54 k54Var = uy6.a;
                            sa4 a = sa4.a();
                            for (Map.Entry entry : ni7Var.b.entrySet()) {
                                a.a.put((String) entry.getKey(), entry.getValue());
                            }
                            Map singletonMap = Collections.singletonMap(k54Var, a);
                            singletonMap.getClass();
                            bl5 bl5Var3 = ni7Var.d;
                            Set set = ni7Var.c;
                            pi7Var2.Y = 1;
                            obj = wi7Var.c(r0, singletonMap, linkedHashSet, bl5Var3, set, pi7Var2);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                        } else {
                            u34.a();
                            return null;
                        }
                    }
                    if (jg1Var == null) {
                        return m;
                    }
                    return jg1Var;
                }
                jg1Var = (jg1) obj;
                if (jg1Var == null) {
                }
            }
        }
        pi7Var = new pi7(this, s41Var);
        pi7 pi7Var22 = pi7Var;
        Object obj2 = pi7Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = pi7Var22.Y;
        jg1Var = null;
        if (i == 0) {
        }
        jg1Var = (jg1) obj2;
        if (jg1Var == null) {
        }
    }
}
