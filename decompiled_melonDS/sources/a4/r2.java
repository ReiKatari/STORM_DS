package a4;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r2 implements n2.c {
    public final Object A;
    public final ArrayList B = new ArrayList();
    public Object L;

    public r2(o0 o0Var) {
        this.A = o0Var;
        this.L = o0Var;
    }

    public final void a() {
        this.B.clear();
        this.L = this.A;
        ((o0) this.A).R();
    }

    @Override // n2.c
    public final void d(int i2, Object obj) {
        ((o0) this.L).B(i2, (o0) obj);
    }

    @Override // n2.c
    public final void e(Object obj) {
        this.B.add(this.L);
        this.L = obj;
    }

    @Override // n2.c
    public final void f() {
        j4.b rectManager;
        c3.d dVar;
        j4.b rectManager2;
        o0 o0Var = (o0) this.L;
        n1 n1Var = o0Var.A0;
        if (!o0Var.H()) {
            x3.a.a("onReuse is only expected on attached node");
        }
        y3.p0 p0Var = o0Var.C0;
        if (p0Var != null) {
            p0Var.i(false);
        }
        o0Var.f291o0 = false;
        if (o0Var.J0) {
            o0Var.J0 = false;
        } else {
            b3.o oVar = o0Var.A0.f267e;
            for (b3.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.X) {
                if (oVar2.f1777h0) {
                    oVar2.J0();
                }
            }
            for (b3.o oVar3 = oVar; oVar3 != null; oVar3 = oVar3.X) {
                if (oVar3.f1777h0) {
                    oVar3.L0();
                }
            }
            while (oVar != null) {
                if (oVar.f1777h0) {
                    oVar.F0();
                }
                oVar = oVar.X;
            }
        }
        int i2 = o0Var.B;
        c2 c2Var = o0Var.f286j0;
        if (c2Var != null && (rectManager2 = ((b4.x) c2Var).getRectManager()) != null) {
            rectManager2.h(o0Var);
        }
        o0Var.B = i4.n.f6765a.addAndGet(1);
        c2 c2Var2 = o0Var.f286j0;
        if (c2Var2 != null) {
            b4.x xVar = (b4.x) c2Var2;
            xVar.getLayoutNodes().g(i2);
            xVar.getLayoutNodes().i(o0Var.B, o0Var);
        }
        for (b3.o oVar4 = n1Var.f268f; oVar4 != null; oVar4 = oVar4.Y) {
            oVar4.E0();
        }
        n1Var.e();
        if (n1Var.d(8)) {
            o0Var.F();
        }
        o0.Y(o0Var);
        c2 c2Var3 = o0Var.f286j0;
        if (c2Var3 != null) {
            b4.x xVar2 = (b4.x) c2Var3;
            if (b4.x.e() && (dVar = xVar2.H0) != null) {
                b4.x xVar3 = dVar.L;
                a0.b bVar = dVar.A;
                a1.y yVar = dVar.f2558b0;
                if (yVar.e(i2)) {
                    bVar.T(xVar3, i2, false);
                }
                i4.m x9 = o0Var.x();
                if (x9 != null && x9.A.b(i4.t.f6796q)) {
                    yVar.a(o0Var.B);
                    bVar.T(xVar3, o0Var.B, true);
                }
            }
        }
        c2 c2Var4 = o0Var.f286j0;
        if (c2Var4 != null && (rectManager = ((b4.x) c2Var4).getRectManager()) != null) {
            rectManager.f(o0Var, true);
        }
    }

    @Override // n2.c
    public final /* bridge */ /* synthetic */ void g(int i2, Object obj) {
        o0 o0Var = (o0) obj;
    }

    @Override // n2.c
    public final void h() {
        c2 c2Var = ((o0) this.A).f286j0;
        if (c2Var != null) {
            ((b4.x) c2Var).t();
        }
    }

    @Override // n2.c
    public final void i(int i2, int i10, int i11) {
        ((o0) this.L).L(i2, i10, i11);
    }

    @Override // n2.c
    public final Object j() {
        return this.L;
    }

    @Override // n2.c
    public final void k(int i2, int i10) {
        ((o0) this.L).S(i2, i10);
    }

    @Override // n2.c
    public final void n() {
        ArrayList arrayList = this.B;
        this.L = arrayList.remove(arrayList.size() - 1);
    }
}
