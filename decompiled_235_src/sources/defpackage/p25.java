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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p25  reason: default package */
/* loaded from: classes.dex */
public final class p25 extends di7 {
    public static final o25 x = new Object();
    public static final ov2 y = u24.x();
    public i q;
    public Executor r;
    public lc6 s;
    public ig1 t;
    public qv6 u;
    public bw6 v;
    public mc6 w;

    @Override // defpackage.di7
    public final void A() {
        G();
    }

    @Override // defpackage.di7
    public final void C(Rect rect) {
        this.k = rect;
        eg0 d = d();
        qv6 qv6Var = this.u;
        if (d != null && qv6Var != null) {
            nj2.D(new nv6(qv6Var, i(d, o(d)), ((Integer) ((n23) this.h).b(n23.q, -1)).intValue()));
        }
    }

    public final void G() {
        mc6 mc6Var = this.w;
        if (mc6Var != null) {
            mc6Var.b();
            this.w = null;
        }
        ig1 ig1Var = this.t;
        if (ig1Var != null) {
            ig1Var.a();
            this.t = null;
        }
        qv6 qv6Var = this.u;
        if (qv6Var != null) {
            qv6Var.b();
            this.u = null;
        }
        bw6 bw6Var = this.v;
        if (bw6Var != null) {
            synchronized (bw6Var.a) {
                bw6Var.l = null;
                bw6Var.m = null;
            }
        }
        this.v = null;
    }

    public final void H(q25 q25Var, yy yyVar) {
        boolean z;
        Rect rect;
        boolean z2;
        nj2.h();
        eg0 d = d();
        Objects.requireNonNull(d);
        G();
        if (this.u == null) {
            z = true;
        } else {
            z = false;
        }
        Rect rect2 = null;
        np2.A(null, z);
        Matrix matrix = this.l;
        boolean o = d.o();
        Size size = yyVar.a;
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
        xx xxVar = n23.q;
        int intValue = ((Integer) ((n23) this.h).b(xxVar, -1)).intValue();
        if (d.o() && o(d)) {
            z2 = true;
        } else {
            z2 = false;
        }
        qv6 qv6Var = new qv6(1, 34, yyVar, matrix, o, rect, i, intValue, z2);
        this.u = qv6Var;
        rk3 rk3Var = new rk3(this, 6);
        nj2.h();
        qv6Var.a();
        qv6Var.m.add(rk3Var);
        bw6 c = this.u.c(true);
        this.v = c;
        this.t = c.j;
        if (this.q != null) {
            eg0 d2 = d();
            qv6 qv6Var2 = this.u;
            if (d2 != null && qv6Var2 != null) {
                nj2.D(new nv6(qv6Var2, i(d2, o(d2)), ((Integer) ((n23) this.h).b(xxVar, -1)).intValue()));
            }
            i iVar = this.q;
            iVar.getClass();
            bw6 bw6Var = this.v;
            bw6Var.getClass();
            this.r.execute(new q64(3, iVar, bw6Var));
        }
        lc6 d3 = lc6.d(q25Var, yyVar.a);
        dk0 dk0Var = d3.b;
        d3.h = yyVar.d;
        a(d3, yyVar);
        int E = q25Var.E();
        if (E != 0) {
            dk0Var.getClass();
            if (E != 0) {
                ((da4) dk0Var.X).m(zi7.U, Integer.valueOf(E));
            }
        }
        yy0 yy0Var = yyVar.f;
        if (yy0Var != null) {
            dk0Var.e(yy0Var);
        }
        if (this.q != null) {
            d3.b(this.t, yyVar.c, ((Integer) ((n23) this.h).b(n23.r, -1)).intValue());
        }
        mc6 mc6Var = this.w;
        if (mc6Var != null) {
            mc6Var.b();
        }
        mc6 mc6Var2 = new mc6(new a23(this, 1));
        this.w = mc6Var2;
        d3.f = mc6Var2;
        this.s = d3;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{d3.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.di7
    public final zi7 g(boolean z, cj7 cj7Var) {
        x.getClass();
        q25 q25Var = o25.a;
        yy0 a = cj7Var.a(q25Var.x(), 1);
        if (z) {
            a = yy0.t(a, q25Var);
        }
        if (a == null) {
            return null;
        }
        return new q25(go4.a(((jd0) m(a)).B));
    }

    @Override // defpackage.di7
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.di7
    public final yi7 m(yy0 yy0Var) {
        return new jd0(da4.k(yy0Var), 5);
    }

    public final String toString() {
        return "Preview:".concat(h());
    }

    @Override // defpackage.di7
    public final zi7 v(cg0 cg0Var, yi7 yi7Var) {
        yi7Var.f().m(j23.l, 34);
        return yi7Var.h();
    }

    @Override // defpackage.di7
    public final yy y(yy0 yy0Var) {
        this.s.a(yy0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.s.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p87 b = this.i.b();
        b.f = yy0Var;
        return b.a();
    }

    @Override // defpackage.di7
    public final yy z(yy yyVar, yy yyVar2) {
        kj2.t("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yyVar + ", secondaryStreamSpec " + yyVar2);
        H((q25) this.h, yyVar);
        return yyVar;
    }
}
