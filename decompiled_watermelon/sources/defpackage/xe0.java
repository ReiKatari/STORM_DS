package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xe0  reason: default package */
/* loaded from: classes.dex */
public final class xe0 {
    public final Executor a;
    public final np2 b;
    public ScheduledFuture e;
    public zc0 f;
    public bf0 g;
    public wn4 h;
    public i40 i;
    public final Object c = new Object();
    public final Object d = new Object();
    public final bq0 j = new bq0(17, this);
    public volatile List k = pp1.A;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    public final LinkedHashMap o = new LinkedHashMap();

    public xe0(Executor executor, np2 np2Var) {
        this.a = executor;
        this.b = np2Var;
    }

    public final void a(String str) {
        bf0 bf0Var = this.g;
        if (bf0Var == null) {
            return;
        }
        try {
            td0 l = bf0Var.b(str).l();
            l.getClass();
            e(l);
        } catch (IllegalArgumentException unused) {
            ve2.c0("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean isEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (!isEmpty) {
            ve2.C("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                we0 we0Var = (we0) it.next();
                we0Var.b.execute(new rd(we0Var, set));
            }
        }
        if (!set2.isEmpty()) {
            ve2.C("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                we0 we0Var2 = (we0) it2.next();
                we0Var2.b.execute(new we(4, we0Var2, set2));
            }
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            l94 l94Var = (l94) this.o.remove(str);
            bf0 bf0Var = this.g;
            if (l94Var != null && bf0Var != null) {
                try {
                    iq2.x().execute(new we(5, bf0Var.b(str), l94Var));
                    ve2.v("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(int i, List list) {
        long j;
        if (i > 0 && this.l.get()) {
            if (i == 3) {
                j = 0;
            } else {
                j = 400;
            }
            this.e = this.b.schedule(new ue0(this, list, i, 0), j, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            ve2.c0("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void e(td0 td0Var) {
        final String f = td0Var.f();
        f.getClass();
        if (!this.l.get()) {
            return;
        }
        synchronized (this.c) {
            if (this.o.containsKey(f)) {
                return;
            }
            l94 l94Var = new l94() { // from class: ve0
                @Override // defpackage.l94
                public final void a(Object obj) {
                    Integer num;
                    qw qwVar = (qw) obj;
                    xe0 xe0Var = xe0.this;
                    if (!xe0Var.l.get()) {
                        ve2.v("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                    } else if (qwVar.b != null) {
                        StringBuilder u = b31.u("Camera ", f, " state changed to ");
                        u.append(qwVar.a);
                        u.append(" with error: ");
                        rw rwVar = qwVar.b;
                        if (rwVar != null) {
                            num = Integer.valueOf(rwVar.a);
                        } else {
                            num = null;
                        }
                        u.append(num);
                        u.append(". Triggering refresh.");
                        ve2.c0("CameraPresencePrvdr", u.toString());
                        xe0Var.a.execute(new te0(xe0Var, 2));
                    }
                }
            };
            iq2.x().execute(new we(6, td0Var, l94Var));
            this.o.put(f, l94Var);
            ve2.v("CameraPresencePrvdr", "Registered state observer for camera: ".concat(f));
        }
    }

    public final void f() {
        td0 td0Var;
        v vVar;
        if (!this.l.getAndSet(false)) {
            ve2.v("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        ve2.C("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.d) {
            try {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        wn4 wn4Var = this.h;
        if (wn4Var != null) {
            bq0 bq0Var = this.j;
            Iterator it = wn4Var.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    vVar = (v) it.next();
                    if (vVar.b.equals(bq0Var)) {
                        break;
                    }
                } else {
                    vVar = null;
                    break;
                }
            }
            if (vVar != null) {
                wn4Var.b.remove(vVar);
            }
            synchronized (wn4Var.a) {
                try {
                    if (wn4Var.e && wn4Var.b.isEmpty()) {
                        Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                        wn4Var.e = false;
                        Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                        if (wn4Var.h.compareAndSet(true, false)) {
                            kd6 kd6Var = wn4Var.i;
                            if (kd6Var != null) {
                                kd6Var.i(null);
                            }
                            wn4Var.i = null;
                        }
                    }
                } finally {
                }
            }
        }
        synchronized (this.c) {
            if (!this.o.isEmpty()) {
                Map r0 = zt3.r0(this.o);
                this.o.clear();
                bf0 bf0Var = this.g;
                if (bf0Var != null) {
                    LinkedHashSet<vd0> c = bf0Var.c();
                    ArrayList arrayList = new ArrayList();
                    for (vd0 vd0Var : c) {
                        if (vd0Var != null) {
                            td0Var = vd0Var.l();
                        } else {
                            td0Var = null;
                        }
                        if (td0Var != null) {
                            arrayList.add(td0Var);
                        }
                    }
                    ve2.v("CameraPresencePrvdr", "Clearing all " + r0.size() + " state observers.");
                    for (Map.Entry entry : r0.entrySet()) {
                        iq2.x().execute(new u(arrayList, (l94) entry.getValue(), (String) entry.getKey(), 5));
                    }
                }
            }
        }
        this.i = null;
        this.m.clear();
        this.n.clear();
        this.k = pp1.A;
        this.f = null;
        this.g = null;
    }

    public final void g(i40 i40Var, zc0 zc0Var, bf0 bf0Var) {
        List unmodifiableList;
        Throwable th;
        zc0Var.getClass();
        bf0Var.getClass();
        if (this.l.compareAndSet(false, true)) {
            ve2.C("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.i = i40Var;
            Set<String> e = zc0Var.e();
            ArrayList arrayList = new ArrayList(uq0.y0(e, 10));
            for (String str : e) {
                str.getClass();
                arrayList.add(dk7.p(str, null, null));
            }
            this.k = arrayList;
            this.f = zc0Var;
            this.g = bf0Var;
            this.h = (wn4) zc0Var.h;
            this.a.execute(new te0(this, 1));
            wn4 wn4Var = this.h;
            if (wn4Var != null) {
                g06 g06Var = new g06(this.a);
                bq0 bq0Var = this.j;
                wn4Var.b.add(new v(g06Var, bq0Var));
                synchronized (wn4Var.a) {
                    try {
                        if (!wn4Var.e && !wn4Var.b.isEmpty()) {
                            Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                            wn4Var.e = true;
                            wn4Var.b();
                        }
                        unmodifiableList = Collections.unmodifiableList(wn4Var.c);
                        th = wn4Var.d;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                g06Var.execute(new u(th, new v(g06Var, bq0Var), unmodifiableList, 0));
            }
        }
    }
}
