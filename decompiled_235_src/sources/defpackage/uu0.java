package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu0  reason: default package */
/* loaded from: classes.dex */
public final class uu0 implements mb0 {
    public final /* synthetic */ int A;
    public final wu0 B;

    public /* synthetic */ uu0(wu0 wu0Var, int i) {
        this.A = i;
        this.B = wu0Var;
    }

    @Override // defpackage.mb0
    public final void c(gb0 gb0Var, vl5 vl5Var) {
        int i = this.A;
        wu0 wu0Var = this.B;
        switch (i) {
            case 0:
                if (vl5Var.a.m0) {
                    wu0Var.complete(vl5Var.b);
                    return;
                } else {
                    wu0Var.completeExceptionally(new ug(vl5Var));
                    return;
                }
            default:
                wu0Var.complete(vl5Var);
                return;
        }
    }

    @Override // defpackage.mb0
    public final void f(gb0 gb0Var, Throwable th) {
        int i = this.A;
        wu0 wu0Var = this.B;
        switch (i) {
            case 0:
                wu0Var.completeExceptionally(th);
                return;
            default:
                wu0Var.completeExceptionally(th);
                return;
        }
    }
}
