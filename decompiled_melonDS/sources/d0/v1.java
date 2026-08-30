package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import j0.l2;
import j0.o2;
import j0.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: d  reason: collision with root package name */
    public l2 f3471d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3472e;

    /* renamed from: f  reason: collision with root package name */
    public HashSet f3473f;

    /* renamed from: g  reason: collision with root package name */
    public l2 f3474g;

    /* renamed from: h  reason: collision with root package name */
    public j0.k f3475h;

    /* renamed from: i  reason: collision with root package name */
    public l2 f3476i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f3477j;

    /* renamed from: l  reason: collision with root package name */
    public j0.d0 f3479l;
    public j0.d0 m;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f3468a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Object f3469b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public t1 f3470c = t1.INACTIVE;

    /* renamed from: k  reason: collision with root package name */
    public Matrix f3478k = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    public w1 f3480n = w1.a();

    /* renamed from: o  reason: collision with root package name */
    public w1 f3481o = w1.a();

    public v1(l2 l2Var) {
        this.f3472e = l2Var;
        this.f3474g = l2Var;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [j0.l2, java.lang.Object] */
    public final void A(j0.d0 d0Var) {
        x();
        synchronized (this.f3469b) {
            try {
                j0.d0 d0Var2 = this.f3479l;
                if (d0Var == d0Var2) {
                    this.f3468a.remove(d0Var2);
                    this.f3479l = null;
                }
                j0.d0 d0Var3 = this.m;
                if (d0Var == d0Var3) {
                    this.f3468a.remove(d0Var3);
                    this.m = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3475h = null;
        this.f3477j = null;
        this.f3474g = this.f3472e;
        this.f3471d = null;
        this.f3476i = null;
    }

    public final void B(List list) {
        if (!list.isEmpty()) {
            this.f3480n = (w1) list.get(0);
            if (list.size() > 1) {
                this.f3481o = (w1) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (j0.u0 u0Var : ((w1) it.next()).b()) {
                    if (u0Var.f7304j == null) {
                        u0Var.f7304j = getClass();
                    }
                }
            }
        }
    }

    public final void a(j0.r1 r1Var, j0.k kVar) {
        Range range = j0.k.f7234h;
        if (!range.equals(kVar.f7239e)) {
            Range range2 = kVar.f7239e;
            i1 i1Var = r1Var.f7282b;
            i1Var.getClass();
            ((j0.g1) i1Var.R).o(j0.p0.f7273j, range2);
            return;
        }
        synchronized (this.f3469b) {
            try {
                j0.d0 d0Var = this.f3479l;
                d0Var.getClass();
                ArrayList l10 = d0Var.k().i().l(AeFpsRangeQuirk.class);
                boolean z10 = true;
                if (l10.size() > 1) {
                    z10 = false;
                }
                p7.m.g("There should not have more than one AeFpsRangeQuirk.", z10);
                if (!l10.isEmpty()) {
                    Range range3 = ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) l10.get(0))).f1031a;
                    if (range3 != null) {
                        range = range3;
                    }
                    i1 i1Var2 = r1Var.f7282b;
                    i1Var2.getClass();
                    ((j0.g1) i1Var2.R).o(j0.p0.f7273j, range);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(j0.d0 d0Var, j0.d0 d0Var2, l2 l2Var, l2 l2Var2) {
        synchronized (this.f3469b) {
            this.f3479l = d0Var;
            this.m = d0Var2;
            this.f3468a.add(d0Var);
            if (d0Var2 != null) {
                this.f3468a.add(d0Var2);
            }
        }
        this.f3471d = l2Var;
        this.f3476i = l2Var2;
        this.f3474g = n(d0Var.k(), this.f3471d, this.f3476i);
        q();
    }

    public final j0.d0 c() {
        j0.d0 d0Var;
        synchronized (this.f3469b) {
            d0Var = this.f3479l;
        }
        return d0Var;
    }

    public final j0.a0 d() {
        synchronized (this.f3469b) {
            try {
                j0.d0 d0Var = this.f3479l;
                if (d0Var == null) {
                    return j0.a0.f7147a;
                }
                return d0Var.o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String e() {
        j0.d0 c4 = c();
        p7.m.l(c4, "No camera attached to use case: " + this);
        return c4.k().d();
    }

    public abstract l2 f(boolean z10, o2 o2Var);

    public final String g() {
        l2 l2Var = this.f3474g;
        String str = (String) l2Var.h(n0.k.U, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int h(j0.d0 d0Var, boolean z10) {
        int e6 = d0Var.k().e(((j0.b1) this.f3474g).p());
        if (!d0Var.i() && z10) {
            return k0.h.i(-e6);
        }
        return e6;
    }

    public final j0.d0 i() {
        j0.d0 d0Var;
        synchronized (this.f3469b) {
            d0Var = this.m;
        }
        return d0Var;
    }

    public Set j(j0.b0 b0Var) {
        return null;
    }

    public Set k() {
        return Collections.EMPTY_SET;
    }

    public abstract c0.f l(j0.r0 r0Var);

    public final boolean m(j0.d0 d0Var) {
        int intValue = ((Integer) ((j0.b1) this.f3474g).h(j0.b1.f7156t, -1)).intValue();
        if (intValue != -1 && intValue != 0) {
            if (intValue == 1) {
                return true;
            }
            if (intValue == 2) {
                return d0Var.f();
            }
            throw new AssertionError(w.d.l(intValue, "Unknown mirrorMode: "));
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [j0.p1, java.lang.Object, j0.r0] */
    public final l2 n(j0.b0 b0Var, l2 l2Var, l2 l2Var2) {
        j0.g1 b10;
        if (l2Var2 != null) {
            b10 = j0.g1.c(l2Var2);
            b10.A.remove(n0.k.U);
        } else {
            b10 = j0.g1.b();
        }
        TreeMap treeMap = b10.A;
        j0.g gVar = j0.b1.f7153q;
        ?? r22 = this.f3472e;
        if (r22.e(gVar) || r22.e(j0.b1.f7157u)) {
            j0.g gVar2 = j0.b1.f7161y;
            if (treeMap.containsKey(gVar2)) {
                treeMap.remove(gVar2);
            }
        }
        j0.g gVar3 = j0.b1.f7161y;
        if (r22.e(gVar3)) {
            j0.g gVar4 = j0.b1.f7159w;
            if (treeMap.containsKey(gVar4) && ((u0.b) r22.g(gVar3)).f13270b != null) {
                treeMap.remove(gVar4);
            }
        }
        for (j0.g gVar5 : r22.f()) {
            j0.r0.w(b10, b10, r22, gVar5);
        }
        if (l2Var != null) {
            for (j0.g gVar6 : l2Var.f()) {
                if (!gVar6.f7200a.equals(n0.k.U.f7200a)) {
                    j0.r0.w(b10, b10, l2Var, gVar6);
                }
            }
        }
        if (treeMap.containsKey(j0.b1.f7157u)) {
            j0.g gVar7 = j0.b1.f7153q;
            if (treeMap.containsKey(gVar7)) {
                treeMap.remove(gVar7);
            }
        }
        j0.g gVar8 = j0.b1.f7161y;
        if (treeMap.containsKey(gVar8)) {
            ((u0.b) b10.g(gVar8)).getClass();
        }
        aj.g.o("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f3473f + ", this = " + this);
        HashSet<e0.b> hashSet = this.f3473f;
        if (hashSet != null) {
            int i2 = g0.a.f5000c;
            Range range = j0.k.f7234h;
            g0.e eVar = g0.f.f5009c;
            a0 a0Var = a0.f3320d;
            for (e0.b bVar : hashSet) {
                if (bVar instanceof g0.a) {
                    a0Var = ((g0.a) bVar).f5001a;
                } else if (bVar instanceof g0.c) {
                    g0.c cVar = (g0.c) bVar;
                    range = new Range(Integer.valueOf(cVar.f5004a), Integer.valueOf(cVar.f5005b));
                } else if (bVar instanceof g0.f) {
                    eVar = ((g0.f) bVar).f5010a;
                }
            }
            if ((this instanceof f1) || n0.f.B(this)) {
                b10.o(j0.a1.f7150p, a0Var);
            }
            b10.o(l2.I, range);
            int i10 = s1.f3467a[eVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        b10.o(l2.O, 2);
                        b10.o(l2.P, 0);
                    }
                } else {
                    b10.o(l2.O, 0);
                    b10.o(l2.P, 2);
                }
            } else {
                b10.o(l2.O, 1);
                b10.o(l2.P, 1);
            }
        }
        return s(b0Var, l(b10));
    }

    public final void o() {
        Iterator it = this.f3468a.iterator();
        while (it.hasNext()) {
            ((u1) it.next()).l(this);
        }
    }

    public final void p() {
        int ordinal = this.f3470c.ordinal();
        HashSet hashSet = this.f3468a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((u1) it.next()).q(this);
                }
                return;
            }
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((u1) it2.next()).d(this);
        }
    }

    public abstract l2 s(j0.b0 b0Var, c0.f fVar);

    public abstract j0.k v(j0.r0 r0Var);

    public abstract j0.k w(j0.k kVar, j0.k kVar2);

    public abstract void x();

    public void y(Matrix matrix) {
        this.f3478k = new Matrix(matrix);
    }

    public void z(Rect rect) {
        this.f3477j = rect;
    }

    public void q() {
    }

    public void r() {
    }

    public void t() {
    }

    public void u() {
    }
}
