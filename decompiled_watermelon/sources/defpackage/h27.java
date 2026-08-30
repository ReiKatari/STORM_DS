package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h27  reason: default package */
/* loaded from: classes.dex */
public final class h27 implements xs {
    public final Object A;
    public final ArrayList B = new ArrayList();
    public Object L;

    public h27(vf3 vf3Var) {
        this.A = vf3Var;
        this.L = vf3Var;
    }

    public final void a() {
        this.B.clear();
        this.L = this.A;
        ((vf3) this.A).P();
    }

    @Override // defpackage.xs
    public final void c(int i, Object obj) {
        ((vf3) this.L).A(i, (vf3) obj);
    }

    @Override // defpackage.xs
    public final void d(Object obj) {
        this.B.add(this.L);
        this.L = obj;
    }

    @Override // defpackage.xs
    public final void e() {
        b65 rectManager;
        yc ycVar;
        b65 rectManager2;
        vf3 vf3Var = (vf3) this.L;
        zc0 zc0Var = vf3Var.A0;
        if (!vf3Var.H()) {
            mz2.a("onReuse is only expected on attached node");
        }
        jg3 jg3Var = vf3Var.C0;
        if (jg3Var != null) {
            jg3Var.i(false);
        }
        vf3Var.o0 = false;
        if (vf3Var.J0) {
            vf3Var.J0 = false;
        } else {
            yy3 yy3Var = (lm6) vf3Var.A0.f;
            for (yy3 yy3Var2 = yy3Var; yy3Var2 != null; yy3Var2 = yy3Var2.X) {
                if (yy3Var2.i0) {
                    yy3Var2.M0();
                }
            }
            for (yy3 yy3Var3 = yy3Var; yy3Var3 != null; yy3Var3 = yy3Var3.X) {
                if (yy3Var3.i0) {
                    yy3Var3.O0();
                }
            }
            while (yy3Var != null) {
                if (yy3Var.i0) {
                    yy3Var.I0();
                }
                yy3Var = yy3Var.X;
            }
        }
        int i = vf3Var.B;
        wg4 wg4Var = vf3Var.j0;
        if (wg4Var != null && (rectManager2 = ((ee) wg4Var).getRectManager()) != null) {
            rectManager2.g(vf3Var);
        }
        vf3Var.B = fz5.a.addAndGet(1);
        wg4 wg4Var2 = vf3Var.j0;
        if (wg4Var2 != null) {
            ee eeVar = (ee) wg4Var2;
            eeVar.m7getLayoutNodes().g(i);
            eeVar.m7getLayoutNodes().i(vf3Var.B, vf3Var);
        }
        for (yy3 yy3Var4 = (yy3) zc0Var.g; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
            yy3Var4.H0();
        }
        zc0Var.i();
        if (zc0Var.g(8)) {
            vf3Var.F();
        }
        vf3.W(vf3Var);
        wg4 wg4Var3 = vf3Var.j0;
        if (wg4Var3 != null) {
            ee eeVar2 = (ee) wg4Var3;
            if (ee.e() && (ycVar = eeVar2.K0) != null) {
                ee eeVar3 = ycVar.L;
                ka3 ka3Var = ycVar.A;
                k14 k14Var = ycVar.c0;
                if (k14Var.f(i)) {
                    ka3Var.C(eeVar3, i, false);
                }
                ez5 w = vf3Var.w();
                if (w != null && w.A.b(mz5.r)) {
                    k14Var.a(vf3Var.B);
                    ka3Var.C(eeVar3, vf3Var.B, true);
                }
            }
        }
        wg4 wg4Var4 = vf3Var.j0;
        if (wg4Var4 != null && (rectManager = ((ee) wg4Var4).getRectManager()) != null) {
            rectManager.f(vf3Var);
        }
    }

    @Override // defpackage.xs
    public final /* bridge */ /* synthetic */ void f(int i, Object obj) {
        vf3 vf3Var = (vf3) obj;
    }

    @Override // defpackage.xs
    public final void g() {
        wg4 wg4Var = ((vf3) this.A).j0;
        if (wg4Var != null) {
            ((ee) wg4Var).u();
        }
    }

    @Override // defpackage.xs
    public final void h(int i, int i2, int i3) {
        ((vf3) this.L).L(i, i2, i3);
    }

    @Override // defpackage.xs
    public final Object i() {
        return this.L;
    }

    @Override // defpackage.xs
    public final void j(int i, int i2) {
        ((vf3) this.L).Q(i, i2);
    }

    @Override // defpackage.xs
    public final void s() {
        ArrayList arrayList = this.B;
        this.L = arrayList.remove(arrayList.size() - 1);
    }
}
