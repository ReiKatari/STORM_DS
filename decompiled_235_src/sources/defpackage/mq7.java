package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq7  reason: default package */
/* loaded from: classes.dex */
public final class mq7 implements ci7 {
    public final HashSet A;
    public final cj7 X;
    public final eg0 Y;
    public final eg0 Z;
    public final HashSet e0;
    public final HashMap f0;
    public final gl5 g0;
    public final gl5 h0;
    public final HashMap B = new HashMap();
    public final HashMap L = new HashMap();
    public final HashMap R = new HashMap();
    public final ce0 d0 = new ce0(this);

    public mq7(eg0 eg0Var, eg0 eg0Var2, HashSet hashSet, cj7 cj7Var, fa6 fa6Var) {
        this.Y = eg0Var;
        this.Z = eg0Var2;
        this.X = cj7Var;
        this.A = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            di7 di7Var = (di7) it.next();
            hashMap.put(di7Var, di7Var.p(eg0Var.q(), null, di7Var.g(true, cj7Var)));
        }
        this.f0 = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.e0 = hashSet2;
        this.g0 = new gl5(eg0Var, hashSet2);
        if (this.Z != null) {
            this.h0 = new gl5(this.Z, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            di7 di7Var2 = (di7) it2.next();
            this.R.put(di7Var2, Boolean.FALSE);
            this.L.put(di7Var2, new lq7(eg0Var, this, fa6Var));
        }
    }

    public static void s(qv6 qv6Var, ig1 ig1Var, rc6 rc6Var) {
        qv6Var.d();
        try {
            nj2.h();
            qv6Var.a();
            pv6 pv6Var = qv6Var.l;
            Objects.requireNonNull(pv6Var);
            pv6Var.g(ig1Var, new lv6(pv6Var, 0));
        } catch (hg1 unused) {
            nc6 nc6Var = rc6Var.f;
            if (nc6Var != null) {
                nc6Var.a(rc6Var, oc6.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static ig1 t(di7 di7Var) {
        List unmodifiableList;
        boolean z;
        if (di7Var instanceof d23) {
            unmodifiableList = di7Var.o.b();
        } else {
            unmodifiableList = Collections.unmodifiableList(di7Var.o.g.a);
        }
        if (unmodifiableList.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        np2.A(null, z);
        if (unmodifiableList.size() != 1) {
            return null;
        }
        return (ig1) unmodifiableList.get(0);
    }

    @Override // defpackage.ci7
    public final void b(di7 di7Var) {
        ig1 t;
        nj2.h();
        qv6 v = v(di7Var);
        if (w(di7Var) && (t = t(di7Var)) != null) {
            s(v, t, di7Var.o);
        }
    }

    @Override // defpackage.ci7
    public final void d(di7 di7Var) {
        nj2.h();
        if (!w(di7Var)) {
            this.R.put(di7Var, Boolean.TRUE);
            ig1 t = t(di7Var);
            if (t != null) {
                s(v(di7Var), t, di7Var.o);
            }
        }
    }

    @Override // defpackage.ci7
    public final void g(di7 di7Var) {
        nj2.h();
        if (!w(di7Var)) {
            return;
        }
        qv6 v = v(di7Var);
        ig1 t = t(di7Var);
        if (t != null) {
            s(v, t, di7Var.o);
            return;
        }
        nj2.h();
        v.a();
        v.l.a();
    }

    @Override // defpackage.ci7
    public final void h(di7 di7Var) {
        nj2.h();
        if (!w(di7Var)) {
            return;
        }
        this.R.put(di7Var, Boolean.FALSE);
        qv6 v = v(di7Var);
        nj2.h();
        v.a();
        v.l.a();
    }

    public final ry r(di7 di7Var, gl5 gl5Var, eg0 eg0Var, qv6 qv6Var, int i, boolean z) {
        int i2;
        int i3;
        int p = eg0Var.a().p(i);
        boolean e = k97.e(qv6Var.b);
        zi7 zi7Var = (zi7) this.f0.get(di7Var);
        Objects.requireNonNull(zi7Var);
        y15 b = gl5Var.b(zi7Var, qv6Var.d, k97.b(qv6Var.b), z);
        Rect rect = b.a;
        Size size = b.b;
        int i4 = k97.i((qv6Var.i + eg0Var.a().p(((n23) di7Var.h).K(0))) - p);
        boolean o = di7Var.o(eg0Var) ^ e;
        if (di7Var instanceof p25) {
            i2 = 1;
        } else if (di7Var instanceof d23) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2;
        if (di7Var instanceof d23) {
            i3 = 256;
        } else {
            i3 = 34;
        }
        return new ry(UUID.randomUUID(), i5, i3, rect, k97.g(i4, size), i4, o);
    }

    public final HashMap u(qv6 qv6Var, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            di7 di7Var = (di7) it.next();
            zi7 zi7Var = (zi7) this.f0.get(di7Var);
            Objects.requireNonNull(zi7Var);
            Size size = this.g0.b(zi7Var, qv6Var.d, k97.b(qv6Var.b), z).c;
            hashMap.put(di7Var, size);
            kj2.t("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + di7Var);
        }
        return hashMap;
    }

    public final qv6 v(di7 di7Var) {
        qv6 qv6Var = (qv6) this.B.get(di7Var);
        Objects.requireNonNull(qv6Var);
        return qv6Var;
    }

    public final boolean w(di7 di7Var) {
        Boolean bool = (Boolean) this.R.get(di7Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void x(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = this.B;
        hashMap3.clear();
        hashMap3.putAll(hashMap);
        for (Map.Entry entry : hashMap3.entrySet()) {
            di7 di7Var = (di7) entry.getKey();
            qv6 qv6Var = (qv6) entry.getValue();
            di7Var.C(qv6Var.d);
            di7Var.B(qv6Var.b);
            p87 b = qv6Var.g.b();
            Size size = (Size) hashMap2.get(di7Var);
            if (size != null) {
                b.b = size;
            }
            di7Var.F(b.a(), null);
            di7Var.s();
        }
    }
}
