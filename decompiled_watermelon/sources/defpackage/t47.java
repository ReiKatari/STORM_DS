package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t47  reason: default package */
/* loaded from: classes.dex */
public final class t47 implements n47 {
    public static final gs0 l = a53.d(new lc5(4, null));
    public static final gs0 m;
    public final fw4 a;
    public final fw4 b;
    public final g57 c;
    public final fw4 d;
    public final n57 e;
    public final zg0 f;
    public volatile boolean g;
    public final il6 h;
    public final il6 i;
    public final il6 j;
    public final LinkedHashMap k;

    static {
        gs0 gs0Var = new gs0();
        gs0Var.i(null);
        m = gs0Var;
    }

    public t47(fw4 fw4Var, fw4 fw4Var2, g57 g57Var, fw4 fw4Var3, n57 n57Var, zg0 zg0Var) {
        fw4Var.getClass();
        fw4Var2.getClass();
        g57Var.getClass();
        fw4Var3.getClass();
        n57Var.getClass();
        this.a = fw4Var;
        this.b = fw4Var2;
        this.c = g57Var;
        this.d = fw4Var3;
        this.e = n57Var;
        this.f = zg0Var;
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.h = new il6(new ki2(this) { // from class: o47
            public final /* synthetic */ t47 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                t47 t47Var = this.B;
                switch (i) {
                    case 0:
                        return (ci0) t47Var.a.get();
                    case 1:
                        return (m57) t47Var.d.get();
                    default:
                        return (y47) t47Var.b.get();
                }
            }
        });
        this.i = new il6(new ki2(this) { // from class: o47
            public final /* synthetic */ t47 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                t47 t47Var = this.B;
                switch (i) {
                    case 0:
                        return (ci0) t47Var.a.get();
                    case 1:
                        return (m57) t47Var.d.get();
                    default:
                        return (y47) t47Var.b.get();
                }
            }
        });
        this.j = new il6(new ki2(this) { // from class: o47
            public final /* synthetic */ t47 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                t47 t47Var = this.B;
                switch (i) {
                    case 0:
                        return (ci0) t47Var.a.get();
                    case 1:
                        return (m57) t47Var.d.get();
                    default:
                        return (y47) t47Var.b.get();
                }
            }
        });
        this.k = new LinkedHashMap();
    }

    public static final Object k(t47 t47Var, m47 m47Var, Map map, bw0 bw0Var, nk6 nk6Var) {
        LinkedHashMap linkedHashMap = t47Var.k;
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + m47Var + "] values = " + map + ", optionPriority = " + bw0Var);
        }
        Object obj = linkedHashMap.get(m47Var);
        if (obj == null) {
            obj = new p47((bb0) null, (LinkedHashMap) null, (jb5) null, 15);
            linkedHashMap.put(m47Var, obj);
        }
        p47 p47Var = (p47) obj;
        bb0 bb0Var = new bb0(0);
        bb0Var.c(p47Var.a.B);
        bw0Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            bb0Var.B.m(dt3.a0((CaptureRequest.Key) entry.getKey()), bw0Var, value);
        }
        linkedHashMap.put(m47Var, new p47(bb0Var, zt3.s0(p47Var.b), tq0.r1(p47Var.c), p47Var.d));
        return t47Var.n(l(linkedHashMap), null, nk6Var);
    }

    public static p47 l(LinkedHashMap linkedHashMap) {
        p47 p47Var = new p47((bb0) null, (LinkedHashMap) null, new jb5(1), 7);
        for (m47 m47Var : m47.getEntries()) {
            p47 p47Var2 = (p47) linkedHashMap.get(m47Var);
            if (p47Var2 != null) {
                p47Var.a.c(p47Var2.a.B);
                p47Var.b.putAll(p47Var2.b);
                p47Var.c.addAll(p47Var2.c);
                jb5 jb5Var = p47Var2.d;
                if (jb5Var != null) {
                    p47Var.d = new jb5(jb5Var.a);
                }
            }
        }
        return p47Var;
    }

    @Override // defpackage.n47
    public final ic1 a(LinkedHashSet linkedHashSet, boolean z) {
        gs0 gs0Var = null;
        if (!this.g) {
            gs0Var = m(new s47(linkedHashSet, z, this, null));
        }
        if (gs0Var == null) {
            return m;
        }
        return gs0Var;
    }

    @Override // defpackage.n47
    public final ic1 b(Map map, m47 m47Var, bw0 bw0Var) {
        m47Var.getClass();
        bw0Var.getClass();
        if (this.g) {
            return m;
        }
        if (b53.x(this.e.d.get(), Boolean.TRUE)) {
            return tq5.e(this.e.f, null, s31.UNDISPATCHED, new qk5(this, m47Var, map, bw0Var, null, 7), 1);
        }
        c44.h(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    @Override // defpackage.n47
    public final ic1 c() {
        gs0 gs0Var = null;
        if (!this.g) {
            gs0Var = m(new oa0(this, null, 4));
        }
        if (gs0Var == null) {
            return l;
        }
        return gs0Var;
    }

    @Override // defpackage.n47
    public final void close() {
        this.g = true;
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        y47 y47Var = (y47) this.j.getValue();
        synchronized (y47Var.c) {
            try {
                if (y47Var.g) {
                    y47Var.g = false;
                    gs0 gs0Var = y47Var.d;
                    if (gs0Var != null) {
                        gs0Var.v0(new CancellationException("UseCaseCameraState closed"));
                    }
                    y47Var.d = null;
                }
                while (!y47Var.f.isEmpty()) {
                    ((v47) y47Var.f.removeFirst()).b.v0(new CancellationException("UseCaseCameraState closed"));
                    y47Var.q.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n47
    public final ic1 e(Map map, m47 m47Var, bw0 bw0Var) {
        gs0 gs0Var;
        m47Var.getClass();
        bw0Var.getClass();
        if (!this.g) {
            gs0Var = m(new cy1(this, m47Var, map, bw0Var, null, 1));
        } else {
            gs0Var = null;
        }
        if (gs0Var == null) {
            return m;
        }
        return gs0Var;
    }

    @Override // defpackage.n47
    public final Object f(nk6 nk6Var) {
        m57 m57Var = (m57) this.i.getValue();
        m57Var.getClass();
        return m57.c(m57Var, nk6Var);
    }

    @Override // defpackage.n47
    public final ic1 g() {
        gs0 gs0Var = null;
        if (!this.g) {
            gs0Var = m(new kc(this, null));
        }
        if (gs0Var == null) {
            return l;
        }
        return gs0Var;
    }

    @Override // defpackage.n47
    public final ic1 h(cb0 cb0Var, Map map) {
        gs0 gs0Var = null;
        if (!this.g) {
            gs0Var = m(new mc(this, cb0Var, map, null, 5));
        }
        if (gs0Var == null) {
            return m;
        }
        return gs0Var;
    }

    @Override // defpackage.n47
    public final ic1 i(int i) {
        gs0 gs0Var = null;
        if (!this.g) {
            gs0Var = m(new q47(this, i, null));
        }
        if (gs0Var == null) {
            return l;
        }
        return gs0Var;
    }

    @Override // defpackage.n47
    public final ic1 j(List list, m47 m47Var) {
        m47Var.getClass();
        gs0 gs0Var = null;
        if (!this.g) {
            gs0Var = m(new mc(this, m47Var, list, null, 4));
        }
        if (gs0Var == null) {
            return m;
        }
        return gs0Var;
    }

    public final gs0 m(mi2 mi2Var) {
        s31 s31Var;
        n57 n57Var = this.e;
        n57Var.getClass();
        if (b53.x(n57Var.d.get(), Boolean.TRUE)) {
            s31Var = s31.UNDISPATCHED;
        } else {
            s31Var = s31.DEFAULT;
        }
        gs0 gs0Var = new gs0();
        tq5.w(n57Var.f, null, s31Var, new v74(mi2Var, gs0Var, null, 25), 1);
        return gs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.p47 r10, java.util.LinkedHashSet r11, defpackage.k11 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.r47
            if (r0 == 0) goto L14
            r0 = r12
            r47 r0 = (defpackage.r47) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            r47 r0 = new r47
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.R
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r7.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L2b
            defpackage.me2.a0(r12)
            goto Lb9
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            return r2
        L31:
            defpackage.me2.a0(r12)
            boolean r12 = r9.g
            if (r12 != 0) goto Lc1
            zg0 r12 = r9.f
            uw r1 = defpackage.ma0.a
            ef4 r12 = r12.A
            uw r1 = defpackage.ma0.a
            java.lang.Object r12 = r12.d(r1, r2)
            if (r12 != 0) goto Lbd
            il6 r12 = r9.h
            java.lang.Object r12 = r12.getValue()
            ci0 r12 = (defpackage.ci0) r12
            jb5 r1 = r10.d
            r1.getClass()
            int r1 = r1.a
            r2 = -1
            if (r1 == r2) goto L60
            jb5 r1 = r10.d
            r1.getClass()
            int r1 = r1.a
            goto L61
        L60:
            r1 = r3
        L61:
            r12.a(r1)
            il6 r9 = r9.j
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            y47 r1 = (defpackage.y47) r1
            bb0 r9 = r10.a
            cb0 r9 = r9.a()
            java.util.LinkedHashMap r2 = defpackage.dt3.p0(r9)
            tx3 r9 = defpackage.km6.a
            m24 r12 = defpackage.m24.a()
            java.util.Map r4 = r10.b
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L87:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La3
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            android.util.ArrayMap r8 = r12.a
            r8.put(r6, r5)
            goto L87
        La3:
            java.util.Map r9 = java.util.Collections.singletonMap(r9, r12)
            r9.getClass()
            jb5 r5 = r10.d
            java.util.Set r6 = r10.c
            r7.Y = r3
            r3 = r9
            r4 = r11
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto Lb9
            return r0
        Lb9:
            r2 = r12
            ic1 r2 = (defpackage.ic1) r2
            goto Lc1
        Lbd:
            defpackage.c44.b()
            return r2
        Lc1:
            if (r2 != 0) goto Lc6
            gs0 r9 = defpackage.t47.m
            return r9
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t47.n(p47, java.util.LinkedHashSet, k11):java.lang.Object");
    }
}
