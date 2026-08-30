package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nt4  reason: default package */
/* loaded from: classes.dex */
public final class nt4 extends f47 {
    public static final mt4 x = new Object();
    public static final np2 y = iq2.x();
    public i q;
    public Executor r;
    public x06 s;
    public hc1 t;
    public wj6 u;
    public hk6 v;
    public y06 w;

    @Override // defpackage.f47
    public final void A() {
        G();
    }

    @Override // defpackage.f47
    public final void C(Rect rect) {
        this.k = rect;
        vd0 d = d();
        wj6 wj6Var = this.u;
        if (d != null && wj6Var != null) {
            nk2.V(new tj6(wj6Var, i(d, o(d)), ((Integer) ((jw2) this.h).d(jw2.q, -1)).intValue()));
        }
    }

    public final void G() {
        y06 y06Var = this.w;
        if (y06Var != null) {
            y06Var.b();
            this.w = null;
        }
        hc1 hc1Var = this.t;
        if (hc1Var != null) {
            hc1Var.a();
            this.t = null;
        }
        wj6 wj6Var = this.u;
        if (wj6Var != null) {
            wj6Var.b();
            this.u = null;
        }
        hk6 hk6Var = this.v;
        if (hk6Var != null) {
            synchronized (hk6Var.a) {
                hk6Var.l = null;
                hk6Var.m = null;
            }
        }
        this.v = null;
    }

    public final void H(ot4 ot4Var, jx jxVar) {
        boolean z;
        Rect rect;
        boolean z2;
        nk2.s();
        vd0 d = d();
        Objects.requireNonNull(d);
        G();
        if (this.u == null) {
            z = true;
        } else {
            z = false;
        }
        Rect rect2 = null;
        nl2.D(null, z);
        Matrix matrix = this.l;
        boolean j = d.j();
        Size size = jxVar.a;
        Rect rect3 = this.k;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        int i = i(d, o(d));
        uw uwVar = jw2.q;
        int intValue = ((Integer) ((jw2) this.h).d(uwVar, -1)).intValue();
        if (d.j() && o(d)) {
            z2 = true;
        } else {
            z2 = false;
        }
        wj6 wj6Var = new wj6(1, 34, jxVar, matrix, j, rect, i, intValue, z2);
        this.u = wj6Var;
        tm3 tm3Var = new tm3(4, this);
        nk2.s();
        wj6Var.a();
        wj6Var.m.add(tm3Var);
        hk6 c = this.u.c(true);
        this.v = c;
        this.t = c.j;
        if (this.q != null) {
            vd0 d2 = d();
            wj6 wj6Var2 = this.u;
            if (d2 != null && wj6Var2 != null) {
                nk2.V(new tj6(wj6Var2, i(d2, o(d2)), ((Integer) ((jw2) this.h).d(uwVar, -1)).intValue()));
            }
            i iVar = this.q;
            iVar.getClass();
            hk6 hk6Var = this.v;
            hk6Var.getClass();
            this.r.execute(new xc4(1, iVar, hk6Var));
        }
        x06 d3 = x06.d(ot4Var, jxVar.a);
        vh0 vh0Var = d3.b;
        d3.h = jxVar.d;
        a(d3, jxVar);
        int z3 = ot4Var.z();
        if (z3 != 0) {
            vh0Var.getClass();
            if (z3 != 0) {
                ((x14) vh0Var.e).r(b57.T, Integer.valueOf(z3));
            }
        }
        cw0 cw0Var = jxVar.f;
        if (cw0Var != null) {
            vh0Var.d(cw0Var);
        }
        if (this.q != null) {
            d3.b(this.t, jxVar.c, ((Integer) ((jw2) this.h).d(jw2.r, -1)).intValue());
        }
        y06 y06Var = this.w;
        if (y06Var != null) {
            y06Var.b();
        }
        y06 y06Var2 = new y06(new wv2(1, this));
        this.w = y06Var2;
        d3.f = y06Var2;
        this.s = d3;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{d3.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.f47
    public final b57 g(boolean z, e57 e57Var) {
        x.getClass();
        ot4 ot4Var = mt4.a;
        cw0 a = e57Var.a(ot4Var.n(), 1);
        if (z) {
            a = cw0.J(a, ot4Var);
        }
        if (a == null) {
            return null;
        }
        return new ot4(ef4.b(((bb0) m(a)).B));
    }

    @Override // defpackage.f47
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.f47
    public final a57 m(cw0 cw0Var) {
        return new bb0(x14.j(cw0Var), 5);
    }

    public final String toString() {
        return "Preview:".concat(h());
    }

    @Override // defpackage.f47
    public final b57 v(td0 td0Var, a57 a57Var) {
        a57Var.b().r(fw2.l, 34);
        return a57Var.d();
    }

    @Override // defpackage.f47
    public final jx y(cw0 cw0Var) {
        this.s.a(cw0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.s.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        cw6 b = this.i.b();
        b.f = cw0Var;
        return b.a();
    }

    @Override // defpackage.f47
    public final jx z(jx jxVar, jx jxVar2) {
        ve2.v("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + jxVar + ", secondaryStreamSpec " + jxVar2);
        H((ot4) this.h, jxVar);
        return jxVar;
    }
}
