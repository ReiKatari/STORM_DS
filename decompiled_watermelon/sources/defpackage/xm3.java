package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xm3  reason: default package */
/* loaded from: classes.dex */
public final class xm3 {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public qc0 e;

    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[Catch: all -> 0x0021, TryCatch #3 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:45:0x0089, B:46:0x008c, B:48:0x009c, B:49:0x009f, B:52:0x00a2, B:53:0x00a7, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:29:0x0068, B:30:0x006a, B:37:0x0076, B:39:0x007a, B:40:0x007e, B:41:0x0085, B:31:0x006b, B:35:0x0073, B:34:0x0071, B:14:0x0033), top: B:58:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.sm3 r6, defpackage.me1 r7, defpackage.qc0 r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            java.lang.Object r1 = r7.g     // Catch: java.lang.Throwable -> L21
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L21
            r1 = r1 ^ 1
            defpackage.nl2.z(r1)     // Catch: java.lang.Throwable -> L21
            r5.e = r8     // Catch: java.lang.Throwable -> L21
            fn3 r8 = r6.o()     // Catch: java.lang.Throwable -> L21
            r5.e(r8)     // Catch: java.lang.Throwable -> L21
            wm3 r1 = r5.c(r8)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r5 = move-exception
            goto La8
        L24:
            java.util.HashMap r2 = r5.c     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L21
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L21
            qc0 r2 = r5.e     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L3d
            java.lang.Object r3 = r2.b     // Catch: java.lang.Throwable -> L21
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            int r2 = r2.e     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            r3 = 2
            if (r2 == r3) goto L89
            goto L3d
        L3a:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L21
            throw r5     // Catch: java.lang.Throwable -> L21
        L3d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L21
        L41:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L21
            ex r2 = (defpackage.ex) r2     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r3 = r5.b     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L21
            sm3 r2 = (defpackage.sm3) r2     // Catch: java.lang.Throwable -> L21
            r2.getClass()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2.equals(r6)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L41
            java.util.List r3 = r2.q()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L41
            java.lang.Object r3 = r2.A     // Catch: java.lang.Throwable -> L21
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L21
            me1 r4 = r2.X     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L71
            r4 = 0
            goto L73
        L71:
            boolean r4 = r4.b     // Catch: java.lang.Throwable -> L86
        L73:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            if (r4 != 0) goto L7e
            boolean r3 = r7.b     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L7e
            r2.t()     // Catch: java.lang.Throwable -> L21
            goto L41
        L7e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L21
            throw r5     // Catch: java.lang.Throwable -> L21
        L86:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L86
            throw r5     // Catch: java.lang.Throwable -> L21
        L89:
            r6.m(r7)     // Catch: java.lang.Throwable -> L21 defpackage.jg0 -> La1
            rm3 r6 = r8.getLifecycle()     // Catch: java.lang.Throwable -> L21
            qm3 r6 = r6.b()     // Catch: java.lang.Throwable -> L21
            qm3 r7 = defpackage.qm3.STARTED     // Catch: java.lang.Throwable -> L21
            boolean r6 = r6.isAtLeast(r7)     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto L9f
            r5.g(r8)     // Catch: java.lang.Throwable -> L21
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        La1:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L21
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L21
            throw r6     // Catch: java.lang.Throwable -> L21
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm3.a(sm3, me1, qc0):void");
    }

    public final sm3 b(fn3 fn3Var, qg0 qg0Var, zq5 zq5Var) {
        boolean z;
        synchronized (this.a) {
            try {
                if (this.b.get(new ex(System.identityHashCode(fn3Var), qg0Var.R)) == null) {
                    z = true;
                } else {
                    z = false;
                }
                nl2.y("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z);
                sm3 sm3Var = new sm3(fn3Var, qg0Var, zq5Var);
                if (((ArrayList) qg0Var.A()).isEmpty()) {
                    sm3Var.s();
                }
                if (fn3Var.getLifecycle().b() == qm3.DESTROYED) {
                    return sm3Var;
                }
                f(sm3Var);
                return sm3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wm3 c(fn3 fn3Var) {
        synchronized (this.a) {
            try {
                for (wm3 wm3Var : this.c.keySet()) {
                    if (fn3Var.equals(wm3Var.B)) {
                        return wm3Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(fn3 fn3Var) {
        synchronized (this.a) {
            try {
                wm3 c = c(fn3Var);
                if (c == null) {
                    return false;
                }
                for (ex exVar : (Set) this.c.get(c)) {
                    sm3 sm3Var = (sm3) this.b.get(exVar);
                    sm3Var.getClass();
                    if (!sm3Var.q().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(fn3 fn3Var) {
        HashMap hashMap;
        w9 w9Var;
        wm3 c = c(fn3Var);
        if (c != null) {
            HashSet hashSet = new HashSet();
            Set set = (Set) this.c.get(c);
            Objects.requireNonNull(set);
            Iterator it = set.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = this.b;
                if (!hasNext) {
                    break;
                }
                ex exVar = (ex) it.next();
                sm3 sm3Var = (sm3) hashMap.get(exVar);
                if (sm3Var != null) {
                    qg0 qg0Var = sm3Var.L;
                    if (qg0Var.A.A.e() || ((w9Var = qg0Var.B) != null && w9Var.A.e())) {
                        hashSet.add(exVar);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                ve2.c0("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    sm3 sm3Var2 = (sm3) hashMap.get((ex) it2.next());
                    Objects.requireNonNull(sm3Var2);
                    k(sm3Var2);
                }
            }
        }
    }

    public final void f(sm3 sm3Var) {
        Set hashSet;
        synchronized (this.a) {
            try {
                fn3 o = sm3Var.o();
                ex exVar = new ex(System.identityHashCode(o), sm3Var.L.R);
                wm3 c = c(o);
                if (c != null) {
                    hashSet = (Set) this.c.get(c);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(exVar);
                this.b.put(exVar, sm3Var);
                if (c == null) {
                    wm3 wm3Var = new wm3(o, this);
                    this.c.put(wm3Var, hashSet);
                    o.getLifecycle().a(wm3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(fn3 fn3Var) {
        int i;
        synchronized (this.a) {
            try {
                if (!d(fn3Var)) {
                    return;
                }
                if (this.d.isEmpty()) {
                    this.d.push(fn3Var);
                } else {
                    qc0 qc0Var = this.e;
                    if (qc0Var != null) {
                        synchronized (qc0Var.b) {
                            i = qc0Var.e;
                        }
                        if (i != 2) {
                        }
                    }
                    fn3 fn3Var2 = (fn3) this.d.peek();
                    if (!fn3Var.equals(fn3Var2)) {
                        i(fn3Var2);
                        this.d.remove(fn3Var);
                        this.d.push(fn3Var);
                    }
                }
                m(fn3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(fn3 fn3Var) {
        synchronized (this.a) {
            try {
                this.d.remove(fn3Var);
                i(fn3Var);
                if (!this.d.isEmpty()) {
                    m((fn3) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(fn3 fn3Var) {
        synchronized (this.a) {
            try {
                wm3 c = c(fn3Var);
                if (c == null) {
                    return;
                }
                for (ex exVar : (Set) this.c.get(c)) {
                    sm3 sm3Var = (sm3) this.b.get(exVar);
                    sm3Var.getClass();
                    sm3Var.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    public final void j(HashSet hashSet) {
        HashSet<ex> hashSet2 = hashSet;
        synchronized (this.a) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (ex exVar : hashSet2) {
                sm3 sm3Var = (sm3) this.b.get(exVar);
                if (sm3Var != null) {
                    sm3Var.t();
                    h(sm3Var.o());
                }
            }
        }
    }

    public final void k(sm3 sm3Var) {
        synchronized (this.a) {
            try {
                fn3 o = sm3Var.o();
                ex exVar = new ex(System.identityHashCode(o), sm3Var.L.R);
                this.b.remove(exVar);
                HashSet hashSet = new HashSet();
                for (wm3 wm3Var : this.c.keySet()) {
                    if (o.equals(wm3Var.B)) {
                        Set set = (Set) this.c.get(wm3Var);
                        set.remove(exVar);
                        if (set.isEmpty()) {
                            hashSet.add(wm3Var.B);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((fn3) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(fn3 fn3Var) {
        synchronized (this.a) {
            try {
                wm3 c = c(fn3Var);
                if (c == null) {
                    return;
                }
                h(fn3Var);
                for (ex exVar : (Set) this.c.get(c)) {
                    this.b.remove(exVar);
                }
                this.c.remove(c);
                c.B.getLifecycle().c(c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(fn3 fn3Var) {
        synchronized (this.a) {
            try {
                for (ex exVar : (Set) this.c.get(c(fn3Var))) {
                    sm3 sm3Var = (sm3) this.b.get(exVar);
                    sm3Var.getClass();
                    if (!sm3Var.q().isEmpty()) {
                        sm3Var.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
