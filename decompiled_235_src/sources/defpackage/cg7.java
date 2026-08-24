package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cg7  reason: default package */
/* loaded from: classes.dex */
public final class cg7 implements nt {
    public final Object A;
    public final ArrayList B = new ArrayList();
    public Object L;

    public cg7(sm3 sm3Var) {
        this.A = sm3Var;
        this.L = sm3Var;
    }

    public final void a() {
        this.B.clear();
        this.L = this.A;
        ((sm3) this.A).P();
    }

    @Override // defpackage.nt
    public final void c(int i, Object obj) {
        ((sm3) this.L).B(i, (sm3) obj);
    }

    @Override // defpackage.nt
    public final void d(Object obj) {
        this.B.add(this.L);
        this.L = obj;
    }

    @Override // defpackage.nt
    public final void e() {
        rf5 rectManager;
        nd ndVar;
        rf5 rectManager2;
        sm3 sm3Var = (sm3) this.L;
        if0 if0Var = sm3Var.B0;
        if (!sm3Var.H()) {
            p53.a("onReuse is only expected on attached node");
        }
        gn3 gn3Var = sm3Var.D0;
        if (gn3Var != null) {
            gn3Var.i(false);
        }
        sm3Var.p0 = false;
        if (sm3Var.K0) {
            sm3Var.K0 = false;
        } else {
            z64 z64Var = (vy6) sm3Var.B0.f;
            for (z64 z64Var2 = z64Var; z64Var2 != null; z64Var2 = z64Var2.X) {
                if (z64Var2.j0) {
                    z64Var2.M0();
                }
            }
            for (z64 z64Var3 = z64Var; z64Var3 != null; z64Var3 = z64Var3.X) {
                if (z64Var3.j0) {
                    z64Var3.O0();
                }
            }
            while (z64Var != null) {
                if (z64Var.j0) {
                    z64Var.I0();
                }
                z64Var = z64Var.X;
            }
        }
        int i = sm3Var.B;
        zp4 zp4Var = sm3Var.k0;
        if (zp4Var != null && (rectManager2 = ((te) zp4Var).getRectManager()) != null) {
            rectManager2.g(sm3Var);
        }
        sm3Var.B = ua6.a.addAndGet(1);
        zp4 zp4Var2 = sm3Var.k0;
        if (zp4Var2 != null) {
            te teVar = (te) zp4Var2;
            teVar.getLayoutNodes().g(i);
            teVar.getLayoutNodes().i(sm3Var.B, sm3Var);
        }
        for (z64 z64Var4 = (z64) if0Var.g; z64Var4 != null; z64Var4 = z64Var4.Y) {
            z64Var4.H0();
        }
        if0Var.i();
        if (if0Var.g(8)) {
            sm3Var.F();
        }
        sm3.W(sm3Var);
        zp4 zp4Var3 = sm3Var.k0;
        if (zp4Var3 != null) {
            te teVar2 = (te) zp4Var3;
            if (te.d() && (ndVar = teVar2.L0) != null) {
                te teVar3 = ndVar.L;
                s63 s63Var = ndVar.A;
                q94 q94Var = ndVar.d0;
                if (q94Var.f(i)) {
                    s63Var.v(teVar3, i, false);
                }
                ta6 x = sm3Var.x();
                if (x != null && x.A.b(bb6.r)) {
                    q94Var.a(sm3Var.B);
                    s63Var.v(teVar3, sm3Var.B, true);
                }
            }
        }
        zp4 zp4Var4 = sm3Var.k0;
        if (zp4Var4 != null && (rectManager = ((te) zp4Var4).getRectManager()) != null) {
            rectManager.f(sm3Var);
        }
    }

    @Override // defpackage.nt
    public final void f(int i, int i2, int i3) {
        ((sm3) this.L).L(i, i2, i3);
    }

    @Override // defpackage.nt
    public final void g(int i, int i2) {
        ((sm3) this.L).Q(i, i2);
    }

    @Override // defpackage.nt
    public final void j() {
        ArrayList arrayList = this.B;
        this.L = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.nt
    public final /* bridge */ /* synthetic */ void k(int i, Object obj) {
        sm3 sm3Var = (sm3) obj;
    }

    @Override // defpackage.nt
    public final void l() {
        zp4 zp4Var = ((sm3) this.A).k0;
        if (zp4Var != null) {
            ((te) zp4Var).u();
        }
    }

    @Override // defpackage.nt
    public final Object m() {
        return this.L;
    }
}
