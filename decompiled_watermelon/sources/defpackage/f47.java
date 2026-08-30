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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f47  reason: default package */
/* loaded from: classes.dex */
public abstract class f47 {
    public b57 e;
    public final b57 f;
    public HashSet g;
    public b57 h;
    public jx i;
    public b57 j;
    public Rect k;
    public vd0 m;
    public vd0 n;
    public d16 o;
    public d16 p;
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public final Object c = new Object();
    public d47 d = d47.INACTIVE;
    public Matrix l = new Matrix();

    public f47(b57 b57Var) {
        new vd6(this);
        this.o = d16.a();
        this.p = d16.a();
        this.f = b57Var;
        this.h = b57Var;
    }

    public abstract void A();

    public void B(Matrix matrix) {
        this.l = new Matrix(matrix);
    }

    public void C(Rect rect) {
        this.k = rect;
    }

    public final void D(vd0 vd0Var) {
        A();
        synchronized (this.b) {
            try {
                vd0 vd0Var2 = this.m;
                if (vd0Var == vd0Var2) {
                    this.a.remove(vd0Var2);
                    this.m = null;
                }
                vd0 vd0Var3 = this.n;
                if (vd0Var == vd0Var3) {
                    this.a.remove(vd0Var3);
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
            this.o = (d16) list.get(0);
            if (list.size() > 1) {
                this.p = (d16) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (hc1 hc1Var : ((d16) it.next()).b()) {
                    if (hc1Var.j == null) {
                        hc1Var.j = getClass();
                    }
                }
            }
        }
    }

    public final void F(jx jxVar, jx jxVar2) {
        this.i = z(jxVar, jxVar2);
    }

    public final void a(x06 x06Var, jx jxVar) {
        Range range = jx.h;
        if (!range.equals(jxVar.e)) {
            Range range2 = jxVar.e;
            vh0 vh0Var = x06Var.b;
            vh0Var.getClass();
            ((x14) vh0Var.e).r(wh0.f, range2);
            return;
        }
        synchronized (this.b) {
            try {
                vd0 vd0Var = this.m;
                vd0Var.getClass();
                ArrayList c = vd0Var.l().l().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (c.size() > 1) {
                    z = false;
                }
                nl2.y("There should not have more than one AeFpsRangeQuirk.", z);
                if (!c.isEmpty()) {
                    Range range3 = (Range) ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) c.get(0))).a.getValue();
                    if (range3 != null) {
                        range = range3;
                    }
                    vh0 vh0Var2 = x06Var.b;
                    vh0Var2.getClass();
                    ((x14) vh0Var2.e).r(wh0.f, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(vd0 vd0Var, vd0 vd0Var2, b57 b57Var, b57 b57Var2) {
        synchronized (this.b) {
            this.m = vd0Var;
            this.n = vd0Var2;
            this.a.add(vd0Var);
            if (vd0Var2 != null) {
                this.a.add(vd0Var2);
            }
        }
        this.e = b57Var;
        this.j = b57Var2;
        this.h = p(vd0Var.l(), this.e, this.j);
        synchronized (this.c) {
        }
        t();
    }

    public final Size c() {
        jx jxVar = this.i;
        if (jxVar != null) {
            return jxVar.a;
        }
        return null;
    }

    public final vd0 d() {
        vd0 vd0Var;
        synchronized (this.b) {
            vd0Var = this.m;
        }
        return vd0Var;
    }

    public final mc0 e() {
        synchronized (this.b) {
            try {
                vd0 vd0Var = this.m;
                if (vd0Var == null) {
                    return mc0.a;
                }
                return vd0Var.n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String f() {
        vd0 d = d();
        nl2.C(d, "No camera attached to use case: " + this);
        return d.l().f();
    }

    public abstract b57 g(boolean z, e57 e57Var);

    public final String h() {
        b57 b57Var = this.h;
        String str = (String) b57Var.d(an6.z, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int i(vd0 vd0Var, boolean z) {
        int g = vd0Var.l().g(((jw2) this.h).I(0));
        if (!vd0Var.j() && z) {
            return tw6.i(-g);
        }
        return g;
    }

    public final vd0 j() {
        vd0 vd0Var;
        synchronized (this.b) {
            vd0Var = this.n;
        }
        return vd0Var;
    }

    public Set k(td0 td0Var) {
        return null;
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public abstract a57 m(cw0 cw0Var);

    public boolean n() {
        return this instanceof nv2;
    }

    public final boolean o(vd0 vd0Var) {
        int intValue = ((Integer) ((jw2) this.h).d(jw2.r, -1)).intValue();
        if (intValue != -1 && intValue != 0) {
            if (intValue == 1) {
                return true;
            }
            if (intValue == 2) {
                return vd0Var.g();
            }
            throw new AssertionError(wh1.g(intValue, "Unknown mirrorMode: "));
        }
        return false;
    }

    public final b57 p(td0 td0Var, b57 b57Var, b57 b57Var2) {
        x14 f;
        if (b57Var2 != null) {
            f = x14.j(b57Var2);
            f.s(an6.z);
        } else {
            f = x14.f();
        }
        TreeMap treeMap = f.A;
        uw uwVar = jw2.o;
        b57 b57Var3 = this.f;
        if (b57Var3.a(uwVar) || b57Var3.a(jw2.s)) {
            uw uwVar2 = jw2.w;
            if (treeMap.containsKey(uwVar2)) {
                f.s(uwVar2);
            }
        }
        uw uwVar3 = jw2.w;
        if (b57Var3.a(uwVar3)) {
            uw uwVar4 = jw2.u;
            if (treeMap.containsKey(uwVar4) && ((mb5) b57Var3.g(uwVar3)).b != null) {
                f.s(uwVar4);
            }
        }
        for (uw uwVar5 : b57Var3.e()) {
            cw0.C(f, f, b57Var3, uwVar5);
        }
        if (b57Var != null) {
            for (uw uwVar6 : b57Var.e()) {
                if (!uwVar6.a.equals(an6.z.a)) {
                    cw0.C(f, f, b57Var, uwVar6);
                }
            }
        }
        if (treeMap.containsKey(jw2.s)) {
            uw uwVar7 = jw2.o;
            if (treeMap.containsKey(uwVar7)) {
                f.s(uwVar7);
            }
        }
        uw uwVar8 = jw2.w;
        if (treeMap.containsKey(uwVar8)) {
            ((mb5) f.g(uwVar8)).getClass();
        }
        ve2.v("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.g + ", this = " + this);
        HashSet<no2> hashSet = this.g;
        if (hashSet != null) {
            int i = um1.c;
            Range range = jx.h;
            i97 i97Var = k97.c;
            sm1 sm1Var = sm1.d;
            for (no2 no2Var : hashSet) {
                if (no2Var instanceof um1) {
                    sm1Var = ((um1) no2Var).a;
                } else if (no2Var instanceof of2) {
                    of2 of2Var = (of2) no2Var;
                    range = new Range(Integer.valueOf(of2Var.a), Integer.valueOf(of2Var.b));
                } else if (no2Var instanceof k97) {
                    i97Var = ((k97) no2Var).a;
                }
            }
            if ((this instanceof nt4) || yf2.E(this)) {
                f.r(fw2.n, sm1Var);
            }
            f.r(b57.M, range);
            int i2 = c47.a[i97Var.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f.r(b57.T, 2);
                            f.r(b57.U, 0);
                        }
                    } else {
                        f.r(b57.T, 0);
                        f.r(b57.U, 2);
                    }
                } else {
                    f.r(b57.T, 1);
                    f.r(b57.U, 1);
                }
            } else {
                f.r(b57.T, 0);
                f.r(b57.U, 0);
            }
        }
        return v(td0Var, m(f));
    }

    public final void q() {
        this.d = d47.ACTIVE;
        s();
    }

    public final void r() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((e47) it.next()).d(this);
        }
    }

    public final void s() {
        int ordinal = this.d.ordinal();
        HashSet hashSet = this.a;
        if (ordinal != 0) {
            if (ordinal == 1) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((e47) it.next()).o(this);
                }
                return;
            }
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((e47) it2.next()).m(this);
        }
    }

    public b57 v(td0 td0Var, a57 a57Var) {
        return a57Var.d();
    }

    public jx y(cw0 cw0Var) {
        jx jxVar = this.i;
        if (jxVar != null) {
            cw6 b = jxVar.b();
            b.f = cw0Var;
            return b.a();
        }
        vd6.i("Attempt to update the implementation options for a use case without attached stream specifications.");
        return null;
    }

    public abstract jx z(jx jxVar, jx jxVar2);

    public void t() {
    }

    public void u() {
    }

    public void w() {
    }

    public void x() {
    }
}
