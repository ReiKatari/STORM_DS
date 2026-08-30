package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j57  reason: default package */
/* loaded from: classes.dex */
public final class j57 {
    public final ke0 a;
    public final qc0 b;
    public final q03 c;
    public final ak7 d;
    public final rs3 e;
    public final jf0 f;
    public final fw4 g;
    public final fw4 h;
    public final zg0 i;
    public final gd0 j;
    public final Object k;
    public final LinkedHashSet l;
    public final LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final LinkedHashSet q;
    public final cy3 r;
    public final jj6 s;
    public final qh t;
    public final n95 u;
    public volatile s71 v;
    public final ArrayList w;
    public final Set x;

    public j57(ke0 ke0Var, qc0 qc0Var, q03 q03Var, ak7 ak7Var, rs3 rs3Var, Set set, v90 v90Var, jf0 jf0Var, wc1 wc1Var, fw4 fw4Var, fw4 fw4Var2, nz1 nz1Var, je0 je0Var, zg0 zg0Var, gd0 gd0Var, Context context, wg1 wg1Var) {
        qc0Var.getClass();
        ak7Var.getClass();
        rs3Var.getClass();
        set.getClass();
        v90Var.getClass();
        jf0Var.getClass();
        wc1Var.getClass();
        fw4Var.getClass();
        fw4Var2.getClass();
        nz1Var.getClass();
        je0Var.getClass();
        gd0Var.getClass();
        this.a = ke0Var;
        this.b = qc0Var;
        this.c = q03Var;
        this.d = ak7Var;
        this.e = rs3Var;
        this.f = jf0Var;
        this.g = wc1Var;
        this.h = fw4Var2;
        this.i = zg0Var;
        this.j = gd0Var;
        this.k = new Object();
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.o = true;
        this.p = true;
        this.q = new LinkedHashSet();
        this.r = new cy3(je0Var, new by3(), wg1Var);
        ce0 ce0Var = je0Var.b;
        this.s = new jj6(context, ce0Var, nz1Var, e52.k);
        this.t = new qh(ce0Var);
        this.u = new n95(26, this);
        this.w = new ArrayList();
        Set r1 = tq0.r1(set);
        r1.add(v90Var);
        this.x = r1;
    }

    public final void a(f47 f47Var) {
        f47Var.getClass();
        synchronized (this.k) {
            if (this.m.add(f47Var)) {
                l();
            }
        }
    }

    public final boolean b(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.i.A.d(zg0.g0, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSet)) {
            c();
            return true;
        } else if (linkedHashSet.contains(this.r) && !j(linkedHashSet)) {
            cy3 cy3Var = this.r;
            cy3Var.getClass();
            synchronized (this.k) {
                if (this.m.remove(cy3Var)) {
                    l();
                }
            }
            g(l07.b0(cy3Var));
            cy3Var.D((vd0) this.g.get());
            return true;
        } else {
            return false;
        }
    }

    public final void c() {
        cy3 cy3Var = this.r;
        cy3Var.b((vd0) this.g.get(), null, null, null);
        cy3Var.F(jx.a(dy3.a).a(), null);
        d(l07.b0(cy3Var));
        a(cy3Var);
    }

    public final void d(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (ve2.I()) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.l.contains((f47) obj)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ((f47) obj2).w();
            }
            if (this.l.addAll(list) && !b(tq0.P0(this.l, this.m))) {
                n();
                this.e.a(tq0.n1(this.l));
                k(this.l);
            }
            if (!this.o) {
                this.q.addAll(arrayList);
            } else {
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((f47) obj3).u();
                }
            }
        }
    }

    public final Object e(nk6 nk6Var) {
        List n1;
        synchronized (this.k) {
            f();
            this.r.A();
            n1 = tq0.n1(this.w);
        }
        Object O = a53.O(n1, nk6Var);
        if (O == p31.COROUTINE_SUSPENDED) {
            return O;
        }
        return o27.a;
    }

    public final void f() {
        c63 d;
        String str;
        od0 od0Var;
        k47 h = h();
        this.v = null;
        qc0 qc0Var = this.b;
        qd0 qd0Var = (qd0) this.h.get();
        qc0Var.getClass();
        qd0Var.getClass();
        synchronized (qc0Var.b) {
            try {
                if (qc0Var.f) {
                    ArrayList arrayList = qc0Var.d;
                    ce0 ce0Var = (ce0) l.U(qd0Var, q75.a(ce0.class));
                    if (ce0Var != null) {
                        str = ((ia0) ce0Var).A;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        od0Var = new od0(str);
                    } else {
                        od0Var = null;
                    }
                    if (od0Var != null) {
                        arrayList.remove(od0Var.a);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h != null) {
            if (h.h.a()) {
                h.c.close();
                d = tq5.w(h.b.f, null, null, new ys3(null, h), 3);
            } else {
                d = a53.d(o27.a);
            }
            this.w.add(d);
            d.R(new h57(0, this, d));
        }
        synchronized (this.k) {
        }
    }

    public final void g(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (ve2.I()) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.m.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f47 f47Var = (f47) it.next();
                if (this.l.contains(f47Var)) {
                    f47Var.x();
                }
            }
            if (this.l.removeAll(list)) {
                if (b(tq0.P0(this.l, this.m))) {
                    return;
                }
                if (this.l.isEmpty()) {
                    this.d.e(false);
                    this.e.a(pp1.A);
                } else {
                    n();
                    this.e.a(tq0.n1(this.l));
                }
                k(this.l);
            }
            this.q.removeAll(list);
        }
    }

    public final k47 h() {
        s71 s71Var = this.v;
        if (s71Var != null) {
            return (k47) s71Var.m.get();
        }
        return null;
    }

    public final int i() {
        int i;
        synchronized (this.k) {
            qc0 qc0Var = this.b;
            synchronized (qc0Var.b) {
                i = qc0Var.e;
            }
            if (i == 2) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
        r35 = true;
        r22 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0197, code lost:
        if (defpackage.ve2.I() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0199, code lost:
        android.util.Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019e, code lost:
        r3.clear();
     */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.util.LinkedHashSet r35) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j57.j(java.util.LinkedHashSet):boolean");
    }

    public final void k(LinkedHashSet linkedHashSet) {
        String str;
        f();
        List n1 = tq0.n1(linkedHashSet);
        od0 od0Var = null;
        if (n1.isEmpty()) {
            for (i47 i47Var : this.x) {
                i47Var.b(null);
                i47Var.reset();
            }
            return;
        }
        if (!this.o) {
            for (i47 i47Var2 : this.x) {
                i47Var2.b(null);
            }
        }
        kn2 kn2Var = new kn2(this.f);
        synchronized (this.k) {
        }
        f16 f16Var = new f16(n1, this.p);
        gd0 gd0Var = this.j;
        n95 n95Var = this.u;
        synchronized (this.k) {
        }
        gd0Var.getClass();
        n95Var.getClass();
        h47 h47Var = new h47(n95Var, kn2Var, f16Var, new il6(new t6(f16Var, gd0Var, kn2Var, 21)));
        if (!this.o) {
            qc0 qc0Var = this.b;
            qd0 qd0Var = (qd0) this.h.get();
            qc0Var.getClass();
            qd0Var.getClass();
            synchronized (qc0Var.b) {
                try {
                    if (qc0Var.f) {
                        ArrayList arrayList = qc0Var.d;
                        ce0 ce0Var = (ce0) l.U(qd0Var, q75.a(ce0.class));
                        if (ce0Var != null) {
                            str = ((ia0) ce0Var).A;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            od0Var = new od0(str);
                        }
                        if (od0Var != null) {
                            arrayList.add(od0Var.a);
                            synchronized (qc0Var.b) {
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        q03 q03Var = this.c;
        this.v = new s71((o71) q03Var.B, (q71) q03Var.L, h47Var);
        k47 h = h();
        if (h != null) {
            tq5.w(h.b.f, null, null, new x3((j11) null, h, 17), 3);
            for (i47 i47Var3 : this.x) {
                i47Var3.b(h.c);
            }
            tq5.w(h.b.f, null, null, new dm0((j11) null, h, this.n), 3);
            m(tq0.P0(this.l, this.m));
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "Notifying " + this.q + " camera control ready");
            }
            for (f47 f47Var : this.q) {
                f47Var.u();
            }
            this.q.clear();
            return;
        }
        i.n("Required value was null.");
    }

    public final void l() {
        if (this.l.isEmpty()) {
            return;
        }
        LinkedHashSet P0 = tq0.P0(this.l, this.m);
        if (((Boolean) this.i.A.d(zg0.g0, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(P0)) {
            c();
        } else if (P0.contains(this.r) && !j(P0)) {
            cy3 cy3Var = this.r;
            cy3Var.getClass();
            synchronized (this.k) {
                if (this.m.remove(cy3Var)) {
                    l();
                }
            }
            g(l07.b0(cy3Var));
            cy3Var.D((vd0) this.g.get());
        } else {
            m(P0);
        }
    }

    public final void m(LinkedHashSet linkedHashSet) {
        k47 h = h();
        if (h != null) {
            h.c.a(linkedHashSet, this.p);
            for (i47 i47Var : this.x) {
                if (i47Var instanceof i57) {
                    ((i57) i47Var).a(linkedHashSet);
                }
            }
        }
    }

    public final void n() {
        boolean z = false;
        LinkedHashSet linkedHashSet = this.l;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Boolean) ((f47) it.next()).h.d(b57.P, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.d.e(z);
    }

    public final String toString() {
        return "UseCaseManager<" + this.j + '>';
    }
}
