package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hs0  reason: default package */
/* loaded from: classes.dex */
public final class hs0 implements e90 {
    public final /* synthetic */ int A;
    public final js0 B;

    public /* synthetic */ hs0(js0 js0Var, int i) {
        this.A = i;
        this.B = js0Var;
    }

    @Override // defpackage.e90
    public final void b(y80 y80Var, Throwable th) {
        int i = this.A;
        js0 js0Var = this.B;
        switch (i) {
            case 0:
                js0Var.completeExceptionally(th);
                return;
            default:
                js0Var.completeExceptionally(th);
                return;
        }
    }

    @Override // defpackage.e90
    public final void f(y80 y80Var, dc5 dc5Var) {
        int i = this.A;
        js0 js0Var = this.B;
        switch (i) {
            case 0:
                if (dc5Var.a.l0) {
                    js0Var.complete(dc5Var.b);
                    return;
                } else {
                    js0Var.completeExceptionally(new hg(dc5Var));
                    return;
                }
            default:
                js0Var.complete(dc5Var);
                return;
        }
    }
}
