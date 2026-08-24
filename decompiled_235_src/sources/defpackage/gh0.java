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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh0  reason: default package */
/* loaded from: classes.dex */
public final class gh0 {
    public final Executor a;
    public final ov2 b;
    public ScheduledFuture e;
    public if0 f;
    public kh0 g;
    public bx4 h;
    public g60 i;
    public final Object c = new Object();
    public final Object d = new Object();
    public final os0 j = new os0(this, 18);
    public volatile List k = yt1.A;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    public final LinkedHashMap o = new LinkedHashMap();

    public gh0(Executor executor, ov2 ov2Var) {
        this.a = executor;
        this.b = ov2Var;
    }

    public final void a(String str) {
        kh0 kh0Var = this.g;
        if (kh0Var == null) {
            return;
        }
        try {
            cg0 q = kh0Var.b(str).q();
            q.getClass();
            e(q);
        } catch (IllegalArgumentException unused) {
            kj2.f0("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean isEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.n;
        if (!isEmpty) {
            kj2.E("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                fh0 fh0Var = (fh0) it.next();
                fh0Var.b.execute(new ge(fh0Var, set));
            }
        }
        if (!set2.isEmpty()) {
            kj2.E("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                fh0 fh0Var2 = (fh0) it2.next();
                fh0Var2.b.execute(new mf(4, fh0Var2, set2));
            }
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            fi4 fi4Var = (fi4) this.o.remove(str);
            kh0 kh0Var = this.g;
            if (fi4Var != null && kh0Var != null) {
                try {
                    u24.x().execute(new mf(5, kh0Var.b(str), fi4Var));
                    kj2.t("CameraPresencePrvdr", "Removed state observer for: " + str);
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
            this.e = this.b.schedule(new dh0(this, list, i, 0), j, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            kj2.f0("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void e(cg0 cg0Var) {
        final String d = cg0Var.d();
        d.getClass();
        if (!this.l.get()) {
            return;
        }
        synchronized (this.c) {
            if (this.o.containsKey(d)) {
                return;
            }
            fi4 fi4Var = new fi4() { // from class: eh0
                @Override // defpackage.fi4
                public final void a(Object obj) {
                    Integer num;
                    sx sxVar = (sx) obj;
                    gh0 gh0Var = gh0.this;
                    if (!gh0Var.l.get()) {
                        kj2.t("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                    } else if (sxVar.b != null) {
                        StringBuilder t = i61.t("Camera ", d, " state changed to ");
                        t.append(sxVar.a);
                        t.append(" with error: ");
                        tx txVar = sxVar.b;
                        if (txVar != null) {
                            num = Integer.valueOf(txVar.a);
                        } else {
                            num = null;
                        }
                        t.append(num);
                        t.append(". Triggering refresh.");
                        kj2.f0("CameraPresencePrvdr", t.toString());
                        gh0Var.a.execute(new ch0(gh0Var, 2));
                    }
                }
            };
            u24.x().execute(new mf(6, cg0Var, fi4Var));
            this.o.put(d, fi4Var);
            kj2.t("CameraPresencePrvdr", "Registered state observer for camera: ".concat(d));
        }
    }

    public final void f() {
        cg0 cg0Var;
        w wVar;
        if (!this.l.getAndSet(false)) {
            kj2.t("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        kj2.E("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
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
        bx4 bx4Var = this.h;
        if (bx4Var != null) {
            os0 os0Var = this.j;
            Iterator it = bx4Var.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    wVar = (w) it.next();
                    if (wVar.b.equals(os0Var)) {
                        break;
                    }
                } else {
                    wVar = null;
                    break;
                }
            }
            if (wVar != null) {
                bx4Var.b.remove(wVar);
            }
            synchronized (bx4Var.a) {
                try {
                    if (bx4Var.e && bx4Var.b.isEmpty()) {
                        Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                        bx4Var.e = false;
                        Log.i("PipePresenceSrc", "Stopping camera ID flow collection.");
                        if (bx4Var.h.compareAndSet(true, false)) {
                            ap6 ap6Var = bx4Var.i;
                            if (ap6Var != null) {
                                ap6Var.h(null);
                            }
                            bx4Var.i = null;
                        }
                    }
                } finally {
                }
            }
        }
        synchronized (this.c) {
            if (!this.o.isEmpty()) {
                Map s0 = c14.s0(this.o);
                this.o.clear();
                kh0 kh0Var = this.g;
                if (kh0Var != null) {
                    LinkedHashSet<eg0> c = kh0Var.c();
                    ArrayList arrayList = new ArrayList();
                    for (eg0 eg0Var : c) {
                        if (eg0Var != null) {
                            cg0Var = eg0Var.q();
                        } else {
                            cg0Var = null;
                        }
                        if (cg0Var != null) {
                            arrayList.add(cg0Var);
                        }
                    }
                    kj2.t("CameraPresencePrvdr", "Clearing all " + s0.size() + " state observers.");
                    for (Map.Entry entry : s0.entrySet()) {
                        u24.x().execute(new v(arrayList, (fi4) entry.getValue(), (String) entry.getKey(), 6));
                    }
                }
            }
        }
        this.i = null;
        this.m.clear();
        this.n.clear();
        this.k = yt1.A;
        this.f = null;
        this.g = null;
    }

    public final void g(g60 g60Var, if0 if0Var, kh0 kh0Var) {
        List unmodifiableList;
        Throwable th;
        if0Var.getClass();
        kh0Var.getClass();
        if (this.l.compareAndSet(false, true)) {
            kj2.E("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.i = g60Var;
            Set<String> e = if0Var.e();
            ArrayList arrayList = new ArrayList(ht0.v0(e, 10));
            for (String str : e) {
                str.getClass();
                arrayList.add(nc1.J(str, null, null));
            }
            this.k = arrayList;
            this.f = if0Var;
            this.g = kh0Var;
            this.h = (bx4) if0Var.h;
            this.a.execute(new ch0(this, 1));
            bx4 bx4Var = this.h;
            if (bx4Var != null) {
                vb6 vb6Var = new vb6(this.a);
                os0 os0Var = this.j;
                bx4Var.b.add(new w(vb6Var, os0Var));
                synchronized (bx4Var.a) {
                    try {
                        if (!bx4Var.e && !bx4Var.b.isEmpty()) {
                            Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                            bx4Var.e = true;
                            bx4Var.b();
                        }
                        unmodifiableList = Collections.unmodifiableList(bx4Var.c);
                        th = bx4Var.d;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                vb6Var.execute(new v(th, new w(vb6Var, os0Var), unmodifiableList, 0));
            }
        }
    }
}
