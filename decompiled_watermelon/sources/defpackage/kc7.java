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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kc7  reason: default package */
/* loaded from: classes.dex */
public final class kc7 implements e47 {
    public final HashSet A;
    public final e57 X;
    public final vd0 Y;
    public final vd0 Z;
    public final HashSet d0;
    public final HashMap e0;
    public final ob5 f0;
    public final ob5 g0;
    public final HashMap B = new HashMap();
    public final HashMap L = new HashMap();
    public final HashMap R = new HashMap();
    public final tb0 c0 = new tb0(this);

    public kc7(vd0 vd0Var, vd0 vd0Var2, HashSet hashSet, e57 e57Var, vd6 vd6Var) {
        this.Y = vd0Var;
        this.Z = vd0Var2;
        this.X = e57Var;
        this.A = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f47 f47Var = (f47) it.next();
            hashMap.put(f47Var, f47Var.p(vd0Var.l(), null, f47Var.g(true, e57Var)));
        }
        this.e0 = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.d0 = hashSet2;
        this.f0 = new ob5(vd0Var, hashSet2);
        if (this.Z != null) {
            this.g0 = new ob5(this.Z, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            f47 f47Var2 = (f47) it2.next();
            this.R.put(f47Var2, Boolean.FALSE);
            this.L.put(f47Var2, new jc7(vd0Var, this, vd6Var));
        }
    }

    public static void t(wj6 wj6Var, hc1 hc1Var, d16 d16Var) {
        wj6Var.d();
        try {
            nk2.s();
            wj6Var.a();
            vj6 vj6Var = wj6Var.l;
            Objects.requireNonNull(vj6Var);
            vj6Var.g(hc1Var, new rj6(vj6Var, 0));
        } catch (gc1 unused) {
            z06 z06Var = d16Var.f;
            if (z06Var != null) {
                z06Var.a(d16Var, a16.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static hc1 u(f47 f47Var) {
        List unmodifiableList;
        boolean z;
        if (f47Var instanceof zv2) {
            unmodifiableList = f47Var.o.b();
        } else {
            unmodifiableList = Collections.unmodifiableList(f47Var.o.g.a);
        }
        if (unmodifiableList.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        nl2.D(null, z);
        if (unmodifiableList.size() != 1) {
            return null;
        }
        return (hc1) unmodifiableList.get(0);
    }

    @Override // defpackage.e47
    public final void d(f47 f47Var) {
        hc1 u;
        nk2.s();
        wj6 w = w(f47Var);
        if (x(f47Var) && (u = u(f47Var)) != null) {
            t(w, u, f47Var.o);
        }
    }

    @Override // defpackage.e47
    public final void m(f47 f47Var) {
        nk2.s();
        if (!x(f47Var)) {
            this.R.put(f47Var, Boolean.TRUE);
            hc1 u = u(f47Var);
            if (u != null) {
                t(w(f47Var), u, f47Var.o);
            }
        }
    }

    @Override // defpackage.e47
    public final void o(f47 f47Var) {
        nk2.s();
        if (!x(f47Var)) {
            return;
        }
        this.R.put(f47Var, Boolean.FALSE);
        wj6 w = w(f47Var);
        nk2.s();
        w.a();
        w.l.a();
    }

    @Override // defpackage.e47
    public final void q(f47 f47Var) {
        nk2.s();
        if (!x(f47Var)) {
            return;
        }
        wj6 w = w(f47Var);
        hc1 u = u(f47Var);
        if (u != null) {
            t(w, u, f47Var.o);
            return;
        }
        nk2.s();
        w.a();
        w.l.a();
    }

    public final fx s(f47 f47Var, ob5 ob5Var, vd0 vd0Var, wj6 wj6Var, int i, boolean z) {
        int i2;
        int i3;
        int g = vd0Var.b().g(i);
        boolean e = tw6.e(wj6Var.b);
        b57 b57Var = (b57) this.e0.get(f47Var);
        Objects.requireNonNull(b57Var);
        ws4 b = ob5Var.b(b57Var, wj6Var.d, tw6.b(wj6Var.b), z);
        Rect rect = b.a;
        Size size = b.b;
        int i4 = tw6.i((wj6Var.i + vd0Var.b().g(((jw2) f47Var.h).I(0))) - g);
        boolean o = f47Var.o(vd0Var) ^ e;
        if (f47Var instanceof nt4) {
            i2 = 1;
        } else if (f47Var instanceof zv2) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2;
        if (f47Var instanceof zv2) {
            i3 = 256;
        } else {
            i3 = 34;
        }
        return new fx(UUID.randomUUID(), i5, i3, rect, tw6.g(i4, size), i4, o);
    }

    public final HashMap v(wj6 wj6Var, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            f47 f47Var = (f47) it.next();
            b57 b57Var = (b57) this.e0.get(f47Var);
            Objects.requireNonNull(b57Var);
            Size size = this.f0.b(b57Var, wj6Var.d, tw6.b(wj6Var.b), z).c;
            hashMap.put(f47Var, size);
            ve2.v("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + f47Var);
        }
        return hashMap;
    }

    public final wj6 w(f47 f47Var) {
        wj6 wj6Var = (wj6) this.B.get(f47Var);
        Objects.requireNonNull(wj6Var);
        return wj6Var;
    }

    public final boolean x(f47 f47Var) {
        Boolean bool = (Boolean) this.R.get(f47Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void y(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = this.B;
        hashMap3.clear();
        hashMap3.putAll(hashMap);
        for (Map.Entry entry : hashMap3.entrySet()) {
            f47 f47Var = (f47) entry.getKey();
            wj6 wj6Var = (wj6) entry.getValue();
            f47Var.C(wj6Var.d);
            f47Var.B(wj6Var.b);
            cw6 b = wj6Var.g.b();
            Size size = (Size) hashMap2.get(f47Var);
            if (size != null) {
                b.b = size;
            }
            f47Var.F(b.a(), null);
            f47Var.s();
        }
    }
}
