package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa7  reason: default package */
/* loaded from: classes.dex */
public final class pa7 extends la7 {
    public final /* synthetic */ int a;
    public ea7 b;

    public /* synthetic */ pa7(ea7 ea7Var, int i) {
        this.a = i;
        this.b = ea7Var;
    }

    @Override // defpackage.la7, defpackage.da7
    public void a(ea7 ea7Var) {
        switch (this.a) {
            case 1:
                qa7 qa7Var = (qa7) this.b;
                int i = qa7Var.C0 - 1;
                qa7Var.C0 = i;
                if (i == 0) {
                    qa7Var.D0 = false;
                    qa7Var.n();
                }
                ea7Var.D(this);
                return;
            case 2:
                this.b.G();
                ea7Var.D(this);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.la7, defpackage.da7
    public void c(ea7 ea7Var) {
        switch (this.a) {
            case 1:
                qa7 qa7Var = (qa7) this.b;
                if (!qa7Var.D0) {
                    qa7Var.O();
                    qa7Var.D0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.la7, defpackage.da7
    public void f(ea7 ea7Var) {
        switch (this.a) {
            case 0:
                qa7 qa7Var = (qa7) this.b;
                qa7Var.A0.remove(ea7Var);
                if (!qa7Var.u()) {
                    qa7Var.A(qa7Var, fa6.R, false);
                    qa7Var.n0 = true;
                    qa7Var.A(qa7Var, fa6.L, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ pa7() {
        this.a = 1;
    }
}
