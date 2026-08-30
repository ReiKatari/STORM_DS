package j0;

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
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7180a;

    /* renamed from: c  reason: collision with root package name */
    public w.j f7182c;

    /* renamed from: d  reason: collision with root package name */
    public j0 f7183d;

    /* renamed from: e  reason: collision with root package name */
    public d0.b1 f7184e;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7181b = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final d2.t f7185f = new d2.t(20, this);

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f7186g = zb.q.A;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f7187h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f7188i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList f7189j = new CopyOnWriteArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f7190k = new LinkedHashMap();

    public f0(Executor executor) {
        this.f7180a = executor;
    }

    public final void a(String str) {
        j0 j0Var = this.f7183d;
        if (j0Var == null) {
            return;
        }
        try {
            b0 k10 = j0Var.b(str).k();
            k10.getClass();
            d(k10);
        } catch (IllegalArgumentException unused) {
            aj.g.y0("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean isEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7189j;
        if (!isEmpty) {
            aj.g.I("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw w.d.k(it);
            }
        }
        if (!set2.isEmpty()) {
            aj.g.I("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
            Iterator it2 = copyOnWriteArrayList.iterator();
            if (it2.hasNext()) {
                throw w.d.k(it2);
            }
        }
    }

    public final void c(String str) {
        synchronized (this.f7181b) {
            androidx.lifecycle.g0 g0Var = (androidx.lifecycle.g0) this.f7190k.remove(str);
            j0 j0Var = this.f7183d;
            if (g0Var != null && j0Var != null) {
                try {
                    ij.a.p0().execute(new ad.c(10, j0Var.b(str), g0Var));
                    aj.g.o("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(b0 b0Var) {
        final String d4 = b0Var.d();
        d4.getClass();
        if (!this.f7187h.get()) {
            return;
        }
        synchronized (this.f7181b) {
            if (this.f7190k.containsKey(d4)) {
                return;
            }
            androidx.lifecycle.g0 g0Var = new androidx.lifecycle.g0() { // from class: j0.e0
                @Override // androidx.lifecycle.g0
                public final void a(Object obj) {
                    d0.f fVar;
                    d0.s sVar;
                    d0.e eVar = (d0.e) obj;
                    f0 f0Var = f0.this;
                    if (!f0Var.f7187h.get()) {
                        aj.g.o("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                        return;
                    }
                    Integer num = null;
                    if (eVar != null) {
                        fVar = eVar.f3361b;
                    } else {
                        fVar = null;
                    }
                    if (fVar == null) {
                        if (eVar != null) {
                            sVar = eVar.f3360a;
                        } else {
                            sVar = null;
                        }
                        if (sVar != d0.s.CLOSED) {
                            return;
                        }
                    }
                    StringBuilder u4 = w.d.u("Camera ", d4, " state changed to ");
                    u4.append(eVar.f3360a);
                    u4.append(" with error: ");
                    d0.f fVar2 = eVar.f3361b;
                    if (fVar2 != null) {
                        num = Integer.valueOf(fVar2.f3365a);
                    }
                    u4.append(num);
                    u4.append(". Triggering refresh.");
                    aj.g.y0("CameraPresencePrvdr", u4.toString());
                    d0.b1 b1Var = f0Var.f7184e;
                    if (b1Var != null) {
                        b1Var.d();
                    }
                }
            };
            ij.a.p0().execute(new ad.c(11, b0Var, g0Var));
            this.f7190k.put(d4, g0Var);
            aj.g.o("CameraPresencePrvdr", "Registered state observer for camera: ".concat(d4));
        }
    }

    public final void e() {
        a aVar;
        if (!this.f7187h.getAndSet(false)) {
            aj.g.o("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        aj.g.I("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        d0.b1 b1Var = this.f7184e;
        if (b1Var != null) {
            d2.t tVar = this.f7185f;
            Iterator it = ((CopyOnWriteArrayList) b1Var.f3334d).iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = (a) it.next();
                    if (aVar.f7146b.equals(tVar)) {
                        break;
                    }
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                ((CopyOnWriteArrayList) b1Var.f3334d).remove(aVar);
            }
            synchronized (b1Var.f3333c) {
                try {
                    if (b1Var.f3331a && ((CopyOnWriteArrayList) b1Var.f3334d).isEmpty()) {
                        Log.i("CameraPresenceSrc", "Last observer removed. Stopping monitoring.");
                        b1Var.f3331a = false;
                        b1Var.i();
                    }
                } finally {
                }
            }
        }
        synchronized (this.f7181b) {
            if (!this.f7190k.isEmpty()) {
                Map I = zb.v.I(this.f7190k);
                this.f7190k.clear();
                j0 j0Var = this.f7183d;
                if (j0Var != null) {
                    LinkedHashSet<d0> c4 = j0Var.c();
                    ArrayList arrayList = new ArrayList(zb.m.G(c4, 10));
                    for (d0 d0Var : c4) {
                        arrayList.add(d0Var.k());
                    }
                    aj.g.o("CameraPresencePrvdr", "Clearing all " + I.size() + " state observers.");
                    ArrayList arrayList2 = new ArrayList(I.size());
                    for (Map.Entry entry : I.entrySet()) {
                        ij.a.p0().execute(new a0.i(arrayList, (androidx.lifecycle.g0) entry.getValue(), (String) entry.getKey(), 6));
                        arrayList2.add(yb.y.f14813a);
                    }
                }
            }
        }
        this.f7188i.clear();
        this.f7189j.clear();
        this.f7186g = zb.q.A;
        this.f7182c = null;
        this.f7183d = null;
    }

    public final void f(w.j jVar, j0 j0Var) {
        List unmodifiableList;
        Throwable th2;
        jVar.getClass();
        j0Var.getClass();
        if (this.f7187h.compareAndSet(false, true)) {
            aj.g.I("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            LinkedHashSet<String> a10 = jVar.a();
            ArrayList arrayList = new ArrayList(zb.m.G(a10, 10));
            for (String str : a10) {
                str.getClass();
                arrayList.add(new d0.q(p7.t.A(str), null));
            }
            this.f7186g = arrayList;
            this.f7182c = jVar;
            this.f7183d = j0Var;
            d0.b1 b1Var = jVar.f13983j;
            this.f7184e = b1Var;
            if (b1Var != null) {
                Executor executor = this.f7180a;
                d2.t tVar = this.f7185f;
                ((CopyOnWriteArrayList) b1Var.f3334d).add(new a(executor, tVar));
                synchronized (b1Var.f3333c) {
                    try {
                        if (!b1Var.f3331a && !((CopyOnWriteArrayList) b1Var.f3334d).isEmpty()) {
                            Log.i("CameraPresenceSrc", "First observer added. Starting monitoring.");
                            b1Var.f3331a = true;
                            b1Var.h();
                        }
                        unmodifiableList = Collections.unmodifiableList((List) b1Var.f3332b);
                        th2 = (Throwable) b1Var.f3335e;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                executor.execute(new a0.i(th2, new a(executor, tVar), unmodifiableList, 5));
            }
        }
    }
}
