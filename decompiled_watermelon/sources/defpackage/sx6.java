package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sx6  reason: default package */
/* loaded from: classes.dex */
public final class sx6 extends ox6 {
    public final /* synthetic */ int a;
    public ix6 b;

    public /* synthetic */ sx6(ix6 ix6Var, int i) {
        this.a = i;
        this.b = ix6Var;
    }

    @Override // defpackage.ox6, defpackage.hx6
    public void a(ix6 ix6Var) {
        switch (this.a) {
            case 1:
                tx6 tx6Var = (tx6) this.b;
                int i = tx6Var.B0 - 1;
                tx6Var.B0 = i;
                if (i == 0) {
                    tx6Var.C0 = false;
                    tx6Var.o();
                }
                ix6Var.D(this);
                return;
            case 2:
                this.b.G();
                ix6Var.D(this);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ox6, defpackage.hx6
    public void d(ix6 ix6Var) {
        switch (this.a) {
            case 1:
                tx6 tx6Var = (tx6) this.b;
                if (!tx6Var.C0) {
                    tx6Var.O();
                    tx6Var.C0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.ox6, defpackage.hx6
    public void e(ix6 ix6Var) {
        switch (this.a) {
            case 0:
                tx6 tx6Var = (tx6) this.b;
                tx6Var.z0.remove(ix6Var);
                if (!tx6Var.v()) {
                    tx6Var.A(tx6Var, vd6.R, false);
                    tx6Var.m0 = true;
                    tx6Var.A(tx6Var, vd6.L, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ sx6() {
        this.a = 1;
    }
}
