package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import j0.l2;
import j0.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 extends v1 {

    /* renamed from: w  reason: collision with root package name */
    public static final e1 f3367w = new Object();

    /* renamed from: x  reason: collision with root package name */
    public static final l0.d f3368x = ij.a.p0();

    /* renamed from: p  reason: collision with root package name */
    public m9.o f3369p;

    /* renamed from: q  reason: collision with root package name */
    public Executor f3370q;

    /* renamed from: r  reason: collision with root package name */
    public j0.r1 f3371r;

    /* renamed from: s  reason: collision with root package name */
    public p1 f3372s;

    /* renamed from: t  reason: collision with root package name */
    public r0.l f3373t;

    /* renamed from: u  reason: collision with root package name */
    public r1 f3374u;

    /* renamed from: v  reason: collision with root package name */
    public j0.s1 f3375v;

    public final void C() {
        j0.s1 s1Var = this.f3375v;
        if (s1Var != null) {
            s1Var.b();
            this.f3375v = null;
        }
        p1 p1Var = this.f3372s;
        if (p1Var != null) {
            p1Var.a();
            this.f3372s = null;
        }
        r0.l lVar = this.f3373t;
        if (lVar != null) {
            lVar.b();
            this.f3373t = null;
        }
        r1 r1Var = this.f3374u;
        if (r1Var != null) {
            synchronized (r1Var.f3445a) {
                r1Var.f3456l = null;
                r1Var.m = null;
            }
        }
        this.f3374u = null;
    }

    public final void D(j0.j1 j1Var, j0.k kVar) {
        boolean z10;
        Rect rect;
        boolean z11;
        l0.f.e();
        j0.d0 c4 = c();
        Objects.requireNonNull(c4);
        C();
        if (this.f3373t == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Rect rect2 = null;
        p7.m.o(null, z10);
        Matrix matrix = this.f3478k;
        boolean i2 = c4.i();
        Size size = kVar.f7235a;
        Rect rect3 = this.f3477j;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        int h2 = h(c4, m(c4));
        j0.g gVar = j0.b1.f7155s;
        int intValue = ((Integer) ((j0.b1) this.f3474g).h(gVar, -1)).intValue();
        if (c4.i() && m(c4)) {
            z11 = true;
        } else {
            z11 = false;
        }
        r0.l lVar = new r0.l(1, 34, kVar, matrix, i2, rect, h2, intValue, z11);
        this.f3373t = lVar;
        a8.f fVar = new a8.f(9, this);
        l0.f.e();
        lVar.a();
        lVar.m.add(fVar);
        r1 c10 = this.f3373t.c(true);
        this.f3374u = c10;
        this.f3372s = c10.f3454j;
        if (this.f3369p != null) {
            j0.d0 c11 = c();
            r0.l lVar2 = this.f3373t;
            if (c11 != null && lVar2 != null) {
                l0.f.B(new r0.i(lVar2, h(c11, m(c11)), ((Integer) ((j0.b1) this.f3474g).h(gVar, -1)).intValue()));
            }
            m9.o oVar = this.f3369p;
            oVar.getClass();
            r1 r1Var = this.f3374u;
            r1Var.getClass();
            this.f3370q.execute(new ad.c(6, oVar, r1Var));
        }
        j0.r1 d4 = j0.r1.d(j1Var, kVar.f7235a);
        i1 i1Var = d4.f7282b;
        d4.f7288h = kVar.f7238d;
        a(d4, kVar);
        int B = j1Var.B();
        if (B != 0) {
            i1Var.getClass();
            if (B != 0) {
                ((j0.g1) i1Var.R).o(l2.O, Integer.valueOf(B));
            }
        }
        j0.r0 r0Var = kVar.f7240f;
        if (r0Var != null) {
            i1Var.i(r0Var);
        }
        if (this.f3369p != null) {
            d4.b(this.f3372s, kVar.f7237c, ((Integer) ((j0.b1) this.f3474g).h(j0.b1.f7156t, -1)).intValue());
        }
        j0.s1 s1Var = this.f3375v;
        if (s1Var != null) {
            s1Var.b();
        }
        j0.s1 s1Var2 = new j0.s1(new p0(1, this));
        this.f3375v = s1Var2;
        d4.f7286f = s1Var2;
        this.f3371r = d4;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{d4.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
    }

    @Override // d0.v1
    public final l2 f(boolean z10, o2 o2Var) {
        f3367w.getClass();
        j0.j1 j1Var = e1.f3364a;
        j0.r0 a10 = o2Var.a(j1Var.r(), 1);
        if (z10) {
            a10 = j0.r0.m(a10, j1Var);
        }
        if (a10 == null) {
            return null;
        }
        return new j0.j1(j0.i1.a(l(a10).f2374b));
    }

    @Override // d0.v1
    public final Set k() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // d0.v1
    public final c0.f l(j0.r0 r0Var) {
        return new c0.f(j0.g1.c(r0Var), 4);
    }

    @Override // d0.v1
    public final l2 s(j0.b0 b0Var, c0.f fVar) {
        fVar.a().o(j0.a1.f7148n, 34);
        return fVar.d();
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    @Override // d0.v1
    public final j0.k v(j0.r0 r0Var) {
        this.f3371r.a(r0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.f3371r.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        q3 b10 = this.f3475h.b();
        b10.f11999f = r0Var;
        return b10.c();
    }

    @Override // d0.v1
    public final j0.k w(j0.k kVar, j0.k kVar2) {
        aj.g.o("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + kVar + ", secondaryStreamSpec " + kVar2);
        D((j0.j1) this.f3474g, kVar);
        return kVar;
    }

    @Override // d0.v1
    public final void x() {
        C();
    }

    @Override // d0.v1
    public final void z(Rect rect) {
        this.f3477j = rect;
        j0.d0 c4 = c();
        r0.l lVar = this.f3373t;
        if (c4 != null && lVar != null) {
            l0.f.B(new r0.i(lVar, h(c4, m(c4)), ((Integer) ((j0.b1) this.f3474g).h(j0.b1.f7155s, -1)).intValue()));
        }
    }
}
