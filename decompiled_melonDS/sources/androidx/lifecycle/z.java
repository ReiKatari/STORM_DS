package androidx.lifecycle;

import android.os.Looper;
import cd.q1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends r {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1502b;

    /* renamed from: c  reason: collision with root package name */
    public s.a f1503c = new s.a();

    /* renamed from: d  reason: collision with root package name */
    public q f1504d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f1505e;

    /* renamed from: f  reason: collision with root package name */
    public int f1506f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1507g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1508h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f1509i;

    /* renamed from: j  reason: collision with root package name */
    public final q1 f1510j;

    public z(x xVar, boolean z10) {
        this.f1502b = z10;
        q qVar = q.INITIALIZED;
        this.f1504d = qVar;
        this.f1509i = new ArrayList();
        this.f1505e = new WeakReference(xVar);
        this.f1510j = cd.q.c(qVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.y] */
    @Override // androidx.lifecycle.r
    public final void a(w wVar) {
        v hVar;
        x xVar;
        wVar.getClass();
        e("addObserver");
        q qVar = this.f1504d;
        q qVar2 = q.DESTROYED;
        if (qVar != qVar2) {
            qVar2 = q.INITIALIZED;
        }
        qVar2.getClass();
        ?? obj = new Object();
        HashMap hashMap = a0.f1443a;
        boolean z10 = wVar instanceof v;
        boolean z11 = wVar instanceof f;
        Object obj2 = null;
        boolean z12 = false;
        if (z10 && z11) {
            hVar = new h((f) wVar, (v) wVar);
        } else if (z11) {
            hVar = new h((f) wVar, (v) null);
        } else if (z10) {
            hVar = (v) wVar;
        } else {
            Class<?> cls = wVar.getClass();
            if (a0.b(cls) == 2) {
                Object obj3 = a0.f1444b.get(cls);
                obj3.getClass();
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    j[] jVarArr = new j[size];
                    if (size <= 0) {
                        hVar = new e(0, jVarArr);
                    } else {
                        a0.a((Constructor) list.get(0), wVar);
                        throw null;
                    }
                } else {
                    a0.a((Constructor) list.get(0), wVar);
                    throw null;
                }
            } else {
                hVar = new h(wVar);
            }
        }
        obj.f1500b = hVar;
        obj.f1499a = qVar2;
        s.a aVar = this.f1503c;
        s.c a10 = aVar.a(wVar);
        if (a10 != null) {
            obj2 = a10.B;
        } else {
            HashMap hashMap2 = aVar.X;
            s.c cVar = new s.c(wVar, obj);
            aVar.R++;
            s.c cVar2 = aVar.B;
            if (cVar2 == null) {
                aVar.A = cVar;
                aVar.B = cVar;
            } else {
                cVar2.L = cVar;
                cVar.R = cVar2;
                aVar.B = cVar;
            }
            hashMap2.put(wVar, cVar);
        }
        if (((y) obj2) != null || (xVar = (x) this.f1505e.get()) == null) {
            return;
        }
        if (this.f1506f != 0 || this.f1507g) {
            z12 = true;
        }
        q d4 = d(wVar);
        this.f1506f++;
        while (obj.f1499a.compareTo(d4) < 0 && this.f1503c.X.containsKey(wVar)) {
            q qVar3 = obj.f1499a;
            ArrayList arrayList = this.f1509i;
            arrayList.add(qVar3);
            n nVar = p.Companion;
            q qVar4 = obj.f1499a;
            nVar.getClass();
            p b10 = n.b(qVar4);
            if (b10 != null) {
                obj.a(xVar, b10);
                arrayList.remove(arrayList.size() - 1);
                d4 = d(wVar);
            } else {
                a0.j.g(obj.f1499a, "no event up from ");
                return;
            }
        }
        if (!z12) {
            i();
        }
        this.f1506f--;
    }

    @Override // androidx.lifecycle.r
    public final q b() {
        return this.f1504d;
    }

    @Override // androidx.lifecycle.r
    public final void c(w wVar) {
        wVar.getClass();
        e("removeObserver");
        this.f1503c.b(wVar);
    }

    public final q d(w wVar) {
        s.c cVar;
        q qVar;
        HashMap hashMap = this.f1503c.X;
        q qVar2 = null;
        if (hashMap.containsKey(wVar)) {
            cVar = ((s.c) hashMap.get(wVar)).R;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            qVar = ((y) cVar.B).f1499a;
        } else {
            qVar = null;
        }
        ArrayList arrayList = this.f1509i;
        if (!arrayList.isEmpty()) {
            qVar2 = (q) arrayList.get(arrayList.size() - 1);
        }
        q qVar3 = this.f1504d;
        qVar3.getClass();
        if (qVar == null || qVar.compareTo(qVar3) >= 0) {
            qVar = qVar3;
        }
        if (qVar2 != null && qVar2.compareTo(qVar) < 0) {
            return qVar2;
        }
        return qVar;
    }

    public final void e(String str) {
        if (this.f1502b) {
            r.a.D().f12557b.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            m9.o.g(kc.a.g("Method ", str, " must be called on the main thread"));
        }
    }

    public final void f(p pVar) {
        pVar.getClass();
        e("handleLifecycleEvent");
        g(pVar.getTargetState());
    }

    public final void g(q qVar) {
        if (this.f1504d != qVar) {
            x xVar = (x) this.f1505e.get();
            q qVar2 = this.f1504d;
            qVar2.getClass();
            qVar.getClass();
            if (qVar2 == q.INITIALIZED && qVar == q.DESTROYED) {
                q qVar3 = q.CREATED;
                throw new IllegalStateException(("State must be at least '" + qVar3 + "' to be moved to '" + qVar + "' in component " + xVar).toString());
            }
            q qVar4 = q.DESTROYED;
            if (qVar2 == qVar4 && qVar2 != qVar) {
                throw new IllegalStateException(("State is '" + qVar4 + "' and cannot be moved to `" + qVar + "` in component " + xVar).toString());
            }
            this.f1504d = qVar;
            if (!this.f1507g && this.f1506f == 0) {
                this.f1507g = true;
                i();
                this.f1507g = false;
                if (this.f1504d == qVar4) {
                    this.f1503c = new s.a();
                    return;
                }
                return;
            }
            this.f1508h = true;
        }
    }

    public final void h(q qVar) {
        qVar.getClass();
        e("setCurrentState");
        g(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        r7.f1508h = false;
        r7.f1510j.j(r7.f1504d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.i():void");
    }
}
