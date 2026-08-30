package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m57  reason: default package */
/* loaded from: classes.dex */
public final class m57 {
    public final n57 a;
    public final ke0 b;
    public final yx2 c;
    public final f16 d;
    public final Object e;
    public jc1 f;
    public final LinkedHashMap g;
    public LinkedHashMap h;
    public gs0 i;

    public m57(n57 n57Var, ke0 ke0Var, yx2 yx2Var, f16 f16Var) {
        n57Var.getClass();
        f16Var.getClass();
        this.a = n57Var;
        this.b = ke0Var;
        this.c = yx2Var;
        this.d = f16Var;
        this.e = new Object();
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.m57 r4, java.util.List r5, long r6, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.l57
            if (r0 == 0) goto L13
            r0 = r8
            l57 r0 = (defpackage.l57) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            l57 r0 = new l57
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.R
            p31 r8 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.me2.a0(r4)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            return r2
        L2e:
            defpackage.me2.a0(r4)
            ys3 r4 = new ys3
            r1 = 18
            r4.<init>(r5, r2, r1)
            r0.Y = r3
            java.lang.Object r4 = defpackage.ln2.W(r6, r4, r0)
            if (r4 != r8) goto L41
            return r8
        L41:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L47
            pp1 r4 = defpackage.pp1.A
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m57.a(m57, java.util.List, long, k11):java.lang.Object");
    }

    public static final void b(m57 m57Var) {
        Set<Surface> keySet;
        fg0 a = m57Var.b.a();
        a.getClass();
        synchronized (a.a) {
            try {
                a.c.add(m57Var);
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
            m57Var.d(surface);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.m57 r4, defpackage.k11 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.k57
            if (r0 == 0) goto L13
            r0 = r5
            k57 r0 = (defpackage.k57) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            k57 r0 = new k57
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r5)     // Catch: java.util.concurrent.CancellationException -> L48
            return r5
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.me2.a0(r5)
            java.lang.Object r5 = r4.e
            monitor-enter(r5)
            jc1 r2 = r4.f     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5a
            gs0 r4 = r4.i     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3d
            goto L5a
        L3d:
            monitor-exit(r5)
            r0.Y = r3     // Catch: java.util.concurrent.CancellationException -> L48
            java.lang.Object r4 = r2.h(r0)     // Catch: java.util.concurrent.CancellationException -> L48
            if (r4 != r1) goto L47
            return r1
        L47:
            return r4
        L48:
            boolean r4 = defpackage.ve2.I()
            if (r4 == 0) goto L55
            java.lang.String r4 = "CXCP"
            java.lang.String r5 = "Surface setup was cancelled"
            android.util.Log.w(r4, r5)
        L55:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L58:
            r4 = move-exception
            goto L5e
        L5a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)
            return r4
        L5e:
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m57.c(m57, k11):java.lang.Object");
    }

    public final void d(Surface surface) {
        hc1 hc1Var;
        surface.getClass();
        synchronized (this.e) {
            try {
                LinkedHashMap linkedHashMap = this.h;
                if (linkedHashMap != null && (hc1Var = (hc1) linkedHashMap.get(surface)) != null && !this.g.containsKey(surface)) {
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", "SurfaceActive " + hc1Var + " in " + this);
                    }
                    this.g.put(surface, hc1Var);
                    try {
                        hc1Var.d();
                    } catch (gc1 e) {
                        if (ve2.I()) {
                            Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                        }
                        f16 f16Var = this.d;
                        hc1 hc1Var2 = e.A;
                        hc1Var2.getClass();
                        f16Var.a(hc1Var2);
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
                    if (ve2.D("CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    fg0 a = this.b.a();
                    a.getClass();
                    synchronized (a.a) {
                        a.c.remove(this);
                    }
                    gs0 gs0Var = this.i;
                    if (gs0Var != null) {
                        gs0Var.c0(o27.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
