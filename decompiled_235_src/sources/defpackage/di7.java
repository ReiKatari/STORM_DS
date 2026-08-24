package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di7  reason: default package */
/* loaded from: classes.dex */
public abstract class di7 {
    public zi7 e;
    public final zi7 f;
    public HashSet g;
    public zi7 h;
    public yy i;
    public zi7 j;
    public Rect k;
    public eg0 m;
    public eg0 n;
    public rc6 o;
    public rc6 p;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final Object c = new Object();
    public bi7 d = bi7.INACTIVE;
    public Matrix l = new Matrix();

    public di7(zi7 zi7Var) {
        new fa6(this);
        this.o = rc6.a();
        this.p = rc6.a();
        this.f = zi7Var;
        this.h = zi7Var;
    }

    public abstract void A();

    public void B(Matrix matrix) {
        this.l = new Matrix(matrix);
    }

    public void C(Rect rect) {
        this.k = rect;
    }

    public final void D(eg0 eg0Var) {
        A();
        synchronized (this.b) {
            try {
                eg0 eg0Var2 = this.m;
                if (eg0Var == eg0Var2) {
                    this.a.remove(eg0Var2);
                    this.m = null;
                }
                eg0 eg0Var3 = this.n;
                if (eg0Var == eg0Var3) {
                    this.a.remove(eg0Var3);
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.c) {
        }
        this.i = null;
        this.k = null;
        this.h = this.f;
        this.e = null;
        this.j = null;
    }

    public final void E(List list) {
        if (!list.isEmpty()) {
            this.o = (rc6) list.get(0);
            if (list.size() > 1) {
                this.p = (rc6) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (ig1 ig1Var : ((rc6) it.next()).b()) {
                    if (ig1Var.j == null) {
                        ig1Var.j = getClass();
                    }
                }
            }
        }
    }

    public final void F(yy yyVar, yy yyVar2) {
        this.i = z(yyVar, yyVar2);
    }

    public final void a(lc6 lc6Var, yy yyVar) {
        Range range = yy.h;
        if (!range.equals(yyVar.e)) {
            Range range2 = yyVar.e;
            dk0 dk0Var = lc6Var.b;
            dk0Var.getClass();
            ((da4) dk0Var.X).m(ek0.f, range2);
            return;
        }
        synchronized (this.b) {
            try {
                eg0 eg0Var = this.m;
                eg0Var.getClass();
                ArrayList c = eg0Var.q().s().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (c.size() > 1) {
                    z = false;
                }
                np2.s("There should not have more than one AeFpsRangeQuirk.", z);
                if (!c.isEmpty()) {
                    Range range3 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) c.get(0))).a.getValue();
                    if (range3 != null) {
                        range = range3;
                    }
                    dk0 dk0Var2 = lc6Var.b;
                    dk0Var2.getClass();
                    ((da4) dk0Var2.X).m(ek0.f, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(eg0 eg0Var, eg0 eg0Var2, zi7 zi7Var, zi7 zi7Var2) {
        synchronized (this.b) {
            this.m = eg0Var;
            this.n = eg0Var2;
            this.a.add(eg0Var);
            if (eg0Var2 != null) {
                this.a.add(eg0Var2);
            }
        }
        this.e = zi7Var;
        this.j = zi7Var2;
        this.h = p(eg0Var.q(), this.e, this.j);
        synchronized (this.c) {
        }
        t();
    }

    public final Size c() {
        yy yyVar = this.i;
        if (yyVar != null) {
            return yyVar.a;
        }
        return null;
    }

    public final eg0 d() {
        eg0 eg0Var;
        synchronized (this.b) {
            eg0Var = this.m;
        }
        return eg0Var;
    }

    public final ve0 e() {
        synchronized (this.b) {
            try {
                eg0 eg0Var = this.m;
                if (eg0Var == null) {
                    return ve0.a;
                }
                return eg0Var.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String f() {
        eg0 d = d();
        np2.x(d, "No camera attached to use case: " + this);
        return d.q().d();
    }

    public abstract zi7 g(boolean z, cj7 cj7Var);

    public final String h() {
        zi7 zi7Var = this.h;
        String str = (String) zi7Var.b(kz6.C, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int i(eg0 eg0Var, boolean z) {
        int p = eg0Var.q().p(((n23) this.h).K(0));
        if (!eg0Var.o() && z) {
            return k97.i(-p);
        }
        return p;
    }

    public final eg0 j() {
        eg0 eg0Var;
        synchronized (this.b) {
            eg0Var = this.n;
        }
        return eg0Var;
    }

    public Set k(cg0 cg0Var) {
        return null;
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public abstract yi7 m(yy0 yy0Var);

    public boolean n() {
        return this instanceof r13;
    }

    public final boolean o(eg0 eg0Var) {
        int intValue = ((Integer) ((n23) this.h).b(n23.r, -1)).intValue();
        if (intValue != -1 && intValue != 0) {
            if (intValue == 1) {
                return true;
            }
            if (intValue == 2) {
                return eg0Var.c();
            }
            throw new AssertionError(lb1.g(intValue, "Unknown mirrorMode: "));
        }
        return false;
    }

    public final zi7 p(cg0 cg0Var, zi7 zi7Var, zi7 zi7Var2) {
        da4 d;
        if (zi7Var2 != null) {
            d = da4.k(zi7Var2);
            d.n(kz6.C);
        } else {
            d = da4.d();
        }
        TreeMap treeMap = d.A;
        xx xxVar = n23.o;
        zi7 zi7Var3 = this.f;
        if (zi7Var3.i(xxVar) || zi7Var3.i(n23.s)) {
            xx xxVar2 = n23.w;
            if (treeMap.containsKey(xxVar2)) {
                d.n(xxVar2);
            }
        }
        xx xxVar3 = n23.w;
        if (zi7Var3.i(xxVar3)) {
            xx xxVar4 = n23.u;
            if (treeMap.containsKey(xxVar4) && ((el5) zi7Var3.e(xxVar3)).b != null) {
                d.n(xxVar4);
            }
        }
        for (xx xxVar5 : zi7Var3.c()) {
            yy0.r(d, d, zi7Var3, xxVar5);
        }
        if (zi7Var != null) {
            for (xx xxVar6 : zi7Var.c()) {
                if (!xxVar6.a.equals(kz6.C.a)) {
                    yy0.r(d, d, zi7Var, xxVar6);
                }
            }
        }
        if (treeMap.containsKey(n23.s)) {
            xx xxVar7 = n23.o;
            if (treeMap.containsKey(xxVar7)) {
                d.n(xxVar7);
            }
        }
        xx xxVar8 = n23.w;
        if (treeMap.containsKey(xxVar8)) {
            ((el5) d.e(xxVar8)).getClass();
        }
        kj2.t("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.g + ", this = " + this);
        HashSet<qu2> hashSet = this.g;
        if (hashSet != null) {
            int i = ar1.c;
            Range range = yy.h;
            in7 in7Var = kn7.c;
            yq1 yq1Var = yq1.d;
            for (qu2 qu2Var : hashSet) {
                if (qu2Var instanceof ar1) {
                    yq1Var = ((ar1) qu2Var).a;
                } else if (qu2Var instanceof nk2) {
                    nk2 nk2Var = (nk2) qu2Var;
                    range = new Range(Integer.valueOf(nk2Var.a), Integer.valueOf(nk2Var.b));
                } else if (qu2Var instanceof kn7) {
                    in7Var = ((kn7) qu2Var).a;
                }
            }
            if ((this instanceof p25) || ej2.L(this)) {
                d.m(j23.n, yq1Var);
            }
            d.m(zi7.N, range);
            int i2 = ai7.a[in7Var.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            d.m(zi7.U, 2);
                            d.m(zi7.V, 0);
                        }
                    } else {
                        d.m(zi7.U, 0);
                        d.m(zi7.V, 2);
                    }
                } else {
                    d.m(zi7.U, 1);
                    d.m(zi7.V, 1);
                }
            } else {
                d.m(zi7.U, 0);
                d.m(zi7.V, 0);
            }
        }
        return v(cg0Var, m(d));
    }

    public final void q() {
        this.d = bi7.ACTIVE;
        s();
    }

    public final void r() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ci7) it.next()).b(this);
        }
    }

    public final void s() {
        int ordinal = this.d.ordinal();
        HashSet hashSet = this.a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((ci7) it.next()).h(this);
                }
                return;
            }
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((ci7) it2.next()).d(this);
        }
    }

    public zi7 v(cg0 cg0Var, yi7 yi7Var) {
        return yi7Var.h();
    }

    public yy y(yy0 yy0Var) {
        yy yyVar = this.i;
        if (yyVar != null) {
            p87 b = yyVar.b();
            b.f = yy0Var;
            return b.a();
        }
        fa6.h("Attempt to update the implementation options for a use case without attached stream specifications.");
        return null;
    }

    public abstract yy z(yy yyVar, yy yyVar2);

    public void t() {
    }

    public void u() {
    }

    public void w() {
    }

    public void x() {
    }
}
