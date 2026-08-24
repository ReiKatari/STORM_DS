package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj7  reason: default package */
/* loaded from: classes.dex */
public final class gj7 {
    public final tg0 a;
    public final ze0 b;
    public final u63 c;
    public final sy7 d;
    public final wz3 e;
    public final sh0 f;
    public final n55 g;
    public final n55 h;
    public final ij0 i;
    public final pf0 j;
    public final Object k;
    public final LinkedHashSet l;
    public final LinkedHashSet m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final LinkedHashSet q;
    public final v54 r;
    public final dv6 s;
    public final ci t;
    public final ro5 u;
    public volatile ib1 v;
    public final ArrayList w;
    public final Set x;

    public gj7(tg0 tg0Var, ze0 ze0Var, u63 u63Var, sy7 sy7Var, wz3 wz3Var, Set set, dc0 dc0Var, sh0 sh0Var, yg1 yg1Var, n55 n55Var, n55 n55Var2, a42 a42Var, sg0 sg0Var, ij0 ij0Var, pf0 pf0Var, Context context, al1 al1Var) {
        ze0Var.getClass();
        sy7Var.getClass();
        wz3Var.getClass();
        set.getClass();
        dc0Var.getClass();
        sh0Var.getClass();
        yg1Var.getClass();
        n55Var.getClass();
        n55Var2.getClass();
        a42Var.getClass();
        sg0Var.getClass();
        pf0Var.getClass();
        this.a = tg0Var;
        this.b = ze0Var;
        this.c = u63Var;
        this.d = sy7Var;
        this.e = wz3Var;
        this.f = sh0Var;
        this.g = yg1Var;
        this.h = n55Var2;
        this.i = ij0Var;
        this.j = pf0Var;
        this.k = new Object();
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.o = true;
        this.p = true;
        this.q = new LinkedHashSet();
        this.r = new v54(sg0Var, new u54(), al1Var);
        lg0 lg0Var = sg0Var.b;
        this.s = new dv6(context, lg0Var, a42Var, x92.k);
        this.t = new ci(lg0Var);
        this.u = new ro5(this, 25);
        this.w = new ArrayList();
        Set o1 = gt0.o1(set);
        o1.add(dc0Var);
        this.x = o1;
    }

    public final void a(di7 di7Var) {
        di7Var.getClass();
        synchronized (this.k) {
            if (this.m.add(di7Var)) {
                l();
            }
        }
    }

    public final boolean b(LinkedHashSet linkedHashSet) {
        if (((Boolean) this.i.A.b(ij0.h0, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(linkedHashSet)) {
            c();
            return true;
        } else if (linkedHashSet.contains(this.r) && !j(linkedHashSet)) {
            v54 v54Var = this.r;
            v54Var.getClass();
            synchronized (this.k) {
                if (this.m.remove(v54Var)) {
                    l();
                }
            }
            g(hf.b0(v54Var));
            v54Var.D((eg0) this.g.get());
            return true;
        } else {
            return false;
        }
    }

    public final void c() {
        v54 v54Var = this.r;
        v54Var.b((eg0) this.g.get(), null, null, null);
        v54Var.F(yy.a(w54.a).a(), null);
        d(hf.b0(v54Var));
        a(v54Var);
    }

    public final void d(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (kj2.L()) {
                    Log.w("CXCP", "Attach [] from " + this + " (Ignored)");
                }
                return;
            }
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Attaching " + list + " from " + this);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!this.l.contains((di7) obj)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ((di7) obj2).w();
            }
            if (this.l.addAll(list) && !b(gt0.M0(this.l, this.m))) {
                n();
                this.e.a(gt0.k1(this.l));
                k(this.l);
            }
            if (!this.o) {
                this.q.addAll(arrayList);
            } else {
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    ((di7) obj3).u();
                }
            }
        }
    }

    public final Object e(hw6 hw6Var) {
        List k1;
        synchronized (this.k) {
            f();
            this.r.A();
            k1 = gt0.k1(this.w);
        }
        Object F = n16.F(k1, hw6Var);
        if (F == x61.COROUTINE_SUSPENDED) {
            return F;
        }
        return jg7.a;
    }

    public final void f() {
        rc3 b;
        String str;
        xf0 xf0Var;
        ii7 h = h();
        this.v = null;
        ze0 ze0Var = this.b;
        zf0 zf0Var = (zf0) this.h.get();
        ze0Var.getClass();
        zf0Var.getClass();
        synchronized (ze0Var.b) {
            try {
                if (ze0Var.f) {
                    ArrayList arrayList = ze0Var.d;
                    lg0 lg0Var = (lg0) jw2.H(zf0Var, gh5.a(lg0.class));
                    if (lg0Var != null) {
                        str = ((qc0) lg0Var).A;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        xf0Var = new xf0(str);
                    } else {
                        xf0Var = null;
                    }
                    if (xf0Var != null) {
                        arrayList.remove(xf0Var.a);
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
                b = hv.L(h.b.f, null, null, new ns3(null, h), 3);
            } else {
                b = u24.b(jg7.a);
            }
            this.w.add(b);
            b.a0(new ja7(6, this, b));
        }
        synchronized (this.k) {
        }
    }

    public final void g(List list) {
        synchronized (this.k) {
            if (list.isEmpty()) {
                if (kj2.L()) {
                    Log.w("CXCP", "Detaching [] from " + this + " (Ignored)");
                }
                return;
            }
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Detaching " + list + " from " + this);
            }
            this.m.removeAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                di7 di7Var = (di7) it.next();
                if (this.l.contains(di7Var)) {
                    di7Var.x();
                }
            }
            if (this.l.removeAll(list)) {
                if (b(gt0.M0(this.l, this.m))) {
                    return;
                }
                if (this.l.isEmpty()) {
                    this.d.d(false);
                    this.e.a(yt1.A);
                } else {
                    n();
                    this.e.a(gt0.k1(this.l));
                }
                k(this.l);
            }
            this.q.removeAll(list);
        }
    }

    public final ii7 h() {
        ib1 ib1Var = this.v;
        if (ib1Var != null) {
            return (ii7) ib1Var.m.get();
        }
        return null;
    }

    public final int i() {
        int i;
        synchronized (this.k) {
            ze0 ze0Var = this.b;
            synchronized (ze0Var.b) {
                i = ze0Var.e;
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
        if (defpackage.kj2.L() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0199, code lost:
        android.util.Log.w("CXCP", "Invalid surface resolution or stream spec is found.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019e, code lost:
        r3.clear();
     */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(LinkedHashSet linkedHashSet) {
        boolean z;
        dv6 dv6Var;
        boolean z2;
        ?? r22;
        int i;
        boolean z3;
        boolean a;
        zi7 zi7Var;
        List b0;
        if (((Boolean) this.i.A.b(ij0.h0, Boolean.TRUE)).booleanValue() && !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                di7 di7Var = (di7) it.next();
                v54 v54Var = this.r;
                if (!nb3.k(di7Var, v54Var)) {
                    List b = di7Var.o.b();
                    b.getClass();
                    if (!b.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : this.l) {
                            if (!nb3.k((di7) obj, v54Var)) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                            pc6 pc6Var = new pc6();
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                pc6Var.a(((di7) obj2).o);
                            }
                            rc6 b2 = pc6Var.b();
                            List unmodifiableList = Collections.unmodifiableList(b2.g.a);
                            unmodifiableList.getClass();
                            List<ig1> b3 = b2.b();
                            b3.getClass();
                            if (!b3.isEmpty()) {
                                if (!b3.isEmpty()) {
                                    for (ig1 ig1Var : b3) {
                                        if (!nb3.k(ig1Var.j, MediaCodec.class)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                                z = true;
                                boolean isEmpty = unmodifiableList.isEmpty();
                                if (z || isEmpty) {
                                    if (v54Var.c() == null) {
                                        v54Var.F(yy.a(w54.a).a(), null);
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i3 = 0;
                                    while (true) {
                                        dv6Var = this.s;
                                        if (i3 < size2) {
                                            Object obj3 = arrayList.get(i3);
                                            i3++;
                                            di7 di7Var2 = (di7) obj3;
                                            Size c = di7Var2.c();
                                            yy yyVar = di7Var2.i;
                                            if (c == null || yyVar == null) {
                                                break;
                                            }
                                            jv6 p = dv6Var.p(i(), di7Var2.h.q(), c, di7Var2.h.w());
                                            int q = di7Var2.h.q();
                                            yq1 yq1Var = yyVar.c;
                                            if (di7Var2 instanceof pr6) {
                                                zi7 zi7Var2 = ((pr6) di7Var2).h;
                                                zi7Var2.getClass();
                                                b0 = (List) ((qr6) zi7Var2).e(qr6.B);
                                                b0.getClass();
                                            } else {
                                                b0 = hf.b0(di7Var2.h.x());
                                            }
                                            List list = b0;
                                            yy0 yy0Var = yyVar.f;
                                            if (yy0Var == null) {
                                                yy0Var = da4.d();
                                            }
                                            yy0 yy0Var2 = yy0Var;
                                            int i4 = yyVar.d;
                                            Range range = yyVar.e;
                                            Boolean bool = (Boolean) di7Var2.h.b(zi7.O, Boolean.FALSE);
                                            Objects.requireNonNull(bool);
                                            arrayList2.add(new px(p, q, c, yq1Var, list, yy0Var2, i4, range, bool.booleanValue(), di7Var2.h.A(c)));
                                        } else {
                                            z2 = true;
                                            r22 = 0;
                                            break;
                                        }
                                    }
                                    if (arrayList2.isEmpty()) {
                                        a = r22;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int size3 = arrayList.size();
                                        int i5 = r22;
                                        while (i5 < size3) {
                                            Object obj4 = arrayList.get(i5);
                                            i5++;
                                            di7 di7Var3 = (di7) obj4;
                                            List<ig1> b4 = di7Var3.o.b();
                                            b4.getClass();
                                            for (ig1 ig1Var2 : b4) {
                                                int i6 = i();
                                                int q2 = di7Var3.h.q();
                                                Size size4 = ig1Var2.h;
                                                size4.getClass();
                                                arrayList3.add(dv6Var.p(i6, q2, size4, di7Var3.h.w()));
                                            }
                                        }
                                        int i7 = i();
                                        Iterator it2 = this.t.o(arrayList2, hf.b0(v54Var.h), hf.b0(Integer.valueOf((int) r22))).entrySet().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                i = 10;
                                                if (((yq1) ((Map.Entry) it2.next()).getValue()).b == 10) {
                                                    break;
                                                }
                                            } else {
                                                i = 8;
                                                break;
                                            }
                                        }
                                        int i8 = i;
                                        boolean t = ej2.t(arrayList);
                                        in7 I = ej2.I(arrayList, new h37(13));
                                        ArrayList arrayList4 = new ArrayList();
                                        int size5 = arrayList.size();
                                        int i9 = r22;
                                        while (i9 < size5) {
                                            Object obj5 = arrayList.get(i9);
                                            i9++;
                                            if (obj5 instanceof d23) {
                                                arrayList4.add(obj5);
                                            }
                                        }
                                        d23 d23Var = (d23) gt0.J0(arrayList4);
                                        if (d23Var != null && (zi7Var = d23Var.h) != null && zi7Var.q() == 4101) {
                                            z3 = z2;
                                        } else {
                                            z3 = r22;
                                        }
                                        Range range2 = yy.h;
                                        range2.getClass();
                                        bv6 bv6Var = new bv6(i7, i8, t, I, z3, false, false, false, range2, false);
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.addAll(arrayList3);
                                        int i10 = i();
                                        int q3 = v54Var.h.q();
                                        Size c2 = v54Var.c();
                                        c2.getClass();
                                        arrayList5.add(dv6Var.p(i10, q3, c2, v54Var.h.w()));
                                        yt1 yt1Var = yt1.A;
                                        a = this.s.a(bv6Var, arrayList5, zt1.A, yt1Var, yt1Var);
                                        if (kj2.F("CXCP")) {
                                            Log.d("CXCP", "Combination of " + arrayList3 + " + " + v54Var + " is supported: " + a);
                                        }
                                    }
                                    if (a) {
                                        return z2;
                                    }
                                    return r22;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void k(LinkedHashSet linkedHashSet) {
        String str;
        f();
        List k1 = gt0.k1(linkedHashSet);
        xf0 xf0Var = null;
        if (k1.isEmpty()) {
            for (gi7 gi7Var : this.x) {
                gi7Var.b(null);
                gi7Var.reset();
            }
            return;
        }
        if (!this.o) {
            for (gi7 gi7Var2 : this.x) {
                gi7Var2.b(null);
            }
        }
        qt2 qt2Var = new qt2(this.f);
        synchronized (this.k) {
        }
        tc6 tc6Var = new tc6(k1, this.p);
        pf0 pf0Var = this.j;
        ro5 ro5Var = this.u;
        synchronized (this.k) {
        }
        pf0Var.getClass();
        ro5Var.getClass();
        fi7 fi7Var = new fi7(ro5Var, qt2Var, tc6Var, new ex6(new u6(tc6Var, pf0Var, qt2Var, 21)));
        if (!this.o) {
            ze0 ze0Var = this.b;
            zf0 zf0Var = (zf0) this.h.get();
            ze0Var.getClass();
            zf0Var.getClass();
            synchronized (ze0Var.b) {
                try {
                    if (ze0Var.f) {
                        ArrayList arrayList = ze0Var.d;
                        lg0 lg0Var = (lg0) jw2.H(zf0Var, gh5.a(lg0.class));
                        if (lg0Var != null) {
                            str = ((qc0) lg0Var).A;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            xf0Var = new xf0(str);
                        }
                        if (xf0Var != null) {
                            arrayList.add(xf0Var.a);
                            synchronized (ze0Var.b) {
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
        u63 u63Var = this.c;
        this.v = new ib1((eb1) u63Var.B, (gb1) u63Var.L, fi7Var);
        ii7 h = h();
        if (h != null) {
            hv.L(h.b.f, null, null, new y3((r41) null, h, 18), 3);
            for (gi7 gi7Var3 : this.x) {
                gi7Var3.b(h.c);
            }
            hv.L(h.b.f, null, null, new lo0((r41) null, h, this.n), 3);
            m(gt0.M0(this.l, this.m));
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "Notifying " + this.q + " camera control ready");
            }
            for (di7 di7Var : this.q) {
                di7Var.u();
            }
            this.q.clear();
            return;
        }
        i.m("Required value was null.");
    }

    public final void l() {
        if (this.l.isEmpty()) {
            return;
        }
        LinkedHashSet M0 = gt0.M0(this.l, this.m);
        if (((Boolean) this.i.A.b(ij0.h0, Boolean.TRUE)).booleanValue() && !this.l.contains(this.r) && j(M0)) {
            c();
        } else if (M0.contains(this.r) && !j(M0)) {
            v54 v54Var = this.r;
            v54Var.getClass();
            synchronized (this.k) {
                if (this.m.remove(v54Var)) {
                    l();
                }
            }
            g(hf.b0(v54Var));
            v54Var.D((eg0) this.g.get());
        } else {
            m(M0);
        }
    }

    public final void m(LinkedHashSet linkedHashSet) {
        ii7 h = h();
        if (h != null) {
            h.c.g(linkedHashSet, this.p);
            for (gi7 gi7Var : this.x) {
                if (gi7Var instanceof fj7) {
                    ((fj7) gi7Var).a(linkedHashSet);
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
                } else if (((Boolean) ((di7) it.next()).h.b(zi7.Q, Boolean.FALSE)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        this.d.d(z);
    }

    public final String toString() {
        return "UseCaseManager<" + this.j + '>';
    }
}
