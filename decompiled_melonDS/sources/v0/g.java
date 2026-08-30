package v0;

import android.graphics.Rect;
import android.util.Size;
import d0.c1;
import d0.f1;
import d0.s0;
import d0.u1;
import d0.v1;
import j0.b1;
import j0.d0;
import j0.l2;
import j0.o2;
import j0.t0;
import j0.t1;
import j0.u0;
import j0.w1;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import m9.o;
import p7.m;
import q.q3;
import r0.k;
import r0.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements u1 {
    public final HashSet A;
    public final o2 X;
    public final d0 Y;
    public final d0 Z;

    /* renamed from: c0  reason: collision with root package name */
    public final HashSet f13603c0;

    /* renamed from: d0  reason: collision with root package name */
    public final HashMap f13604d0;

    /* renamed from: e0  reason: collision with root package name */
    public final b f13605e0;

    /* renamed from: f0  reason: collision with root package name */
    public final b f13606f0;
    public final HashMap B = new HashMap();
    public final HashMap L = new HashMap();
    public final HashMap R = new HashMap();

    /* renamed from: b0  reason: collision with root package name */
    public final c1 f13602b0 = new c1(this);

    public g(d0 d0Var, d0 d0Var2, HashSet hashSet, o2 o2Var, o oVar) {
        this.Y = d0Var;
        this.Z = d0Var2;
        this.X = o2Var;
        this.A = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            hashMap.put(v1Var, v1Var.n(d0Var.k(), null, v1Var.f(true, o2Var)));
        }
        this.f13604d0 = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.f13603c0 = hashSet2;
        this.f13605e0 = new b(d0Var, hashSet2);
        if (this.Z != null) {
            this.f13606f0 = new b(this.Z, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            v1 v1Var2 = (v1) it2.next();
            this.R.put(v1Var2, Boolean.FALSE);
            this.L.put(v1Var2, new f(d0Var, this, oVar));
        }
    }

    public static void s(l lVar, u0 u0Var, w1 w1Var) {
        lVar.d();
        try {
            l0.f.e();
            lVar.a();
            k kVar = lVar.f12593l;
            Objects.requireNonNull(kVar);
            kVar.g(u0Var, new r0.g(kVar, 0));
        } catch (t0 unused) {
            t1 t1Var = w1Var.f7321f;
            if (t1Var != null) {
                t1Var.a(w1Var, j0.u1.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    public static u0 t(v1 v1Var) {
        List unmodifiableList;
        boolean z10;
        if (v1Var instanceof s0) {
            unmodifiableList = v1Var.f3480n.b();
        } else {
            unmodifiableList = Collections.unmodifiableList(v1Var.f3480n.f7322g.f7274a);
        }
        if (unmodifiableList.size() <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.o(null, z10);
        if (unmodifiableList.size() != 1) {
            return null;
        }
        return (u0) unmodifiableList.get(0);
    }

    @Override // d0.u1
    public final void d(v1 v1Var) {
        l0.f.e();
        if (!w(v1Var)) {
            this.R.put(v1Var, Boolean.TRUE);
            u0 t5 = t(v1Var);
            if (t5 != null) {
                s(v(v1Var), t5, v1Var.f3480n);
            }
        }
    }

    @Override // d0.u1
    public final void l(v1 v1Var) {
        u0 t5;
        l0.f.e();
        l v10 = v(v1Var);
        if (w(v1Var) && (t5 = t(v1Var)) != null) {
            s(v10, t5, v1Var.f3480n);
        }
    }

    @Override // d0.u1
    public final void n(v1 v1Var) {
        l0.f.e();
        if (!w(v1Var)) {
            return;
        }
        l v10 = v(v1Var);
        u0 t5 = t(v1Var);
        if (t5 != null) {
            s(v10, t5, v1Var.f3480n);
            return;
        }
        l0.f.e();
        v10.a();
        v10.f12593l.a();
    }

    @Override // d0.u1
    public final void q(v1 v1Var) {
        l0.f.e();
        if (!w(v1Var)) {
            return;
        }
        this.R.put(v1Var, Boolean.FALSE);
        l v10 = v(v1Var);
        l0.f.e();
        v10.a();
        v10.f12593l.a();
    }

    public final t0.b r(v1 v1Var, b bVar, d0 d0Var, l lVar, int i2, boolean z10) {
        int i10;
        int i11;
        int e6 = d0Var.b().e(i2);
        boolean e10 = k0.h.e(lVar.f12583b);
        l2 l2Var = (l2) this.f13604d0.get(v1Var);
        Objects.requireNonNull(l2Var);
        a b10 = bVar.b(l2Var, lVar.f12585d, k0.h.b(lVar.f12583b), z10);
        Rect rect = b10.f13574a;
        Size size = b10.f13575b;
        int i12 = k0.h.i((lVar.f12590i + d0Var.b().e(((b1) v1Var.f3474g).p())) - e6);
        boolean m = v1Var.m(d0Var) ^ e10;
        if (v1Var instanceof f1) {
            i10 = 1;
        } else if (v1Var instanceof s0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10;
        if (v1Var instanceof s0) {
            i11 = 256;
        } else {
            i11 = 34;
        }
        return new t0.b(UUID.randomUUID(), i13, i11, rect, k0.h.g(size, i12), i12, m);
    }

    public final HashMap u(l lVar, boolean z10) {
        HashMap hashMap = new HashMap();
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            l2 l2Var = (l2) this.f13604d0.get(v1Var);
            Objects.requireNonNull(l2Var);
            Size size = this.f13605e0.b(l2Var, lVar.f12585d, k0.h.b(lVar.f12583b), z10).f13576c;
            hashMap.put(v1Var, size);
            aj.g.o("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + v1Var);
        }
        return hashMap;
    }

    public final l v(v1 v1Var) {
        l lVar = (l) this.B.get(v1Var);
        Objects.requireNonNull(lVar);
        return lVar;
    }

    public final boolean w(v1 v1Var) {
        Boolean bool = (Boolean) this.R.get(v1Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void x(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = this.B;
        hashMap3.clear();
        hashMap3.putAll(hashMap);
        for (Map.Entry entry : hashMap3.entrySet()) {
            v1 v1Var = (v1) entry.getKey();
            l lVar = (l) entry.getValue();
            v1Var.z(lVar.f12585d);
            v1Var.y(lVar.f12583b);
            q3 b10 = lVar.f12588g.b();
            Size size = (Size) hashMap2.get(v1Var);
            if (size != null) {
                b10.f11995b = size;
            }
            v1Var.f3475h = v1Var.w(b10.c(), null);
            v1Var.p();
        }
    }
}
