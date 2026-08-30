package gk;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements h {
    public final /* synthetic */ int A;
    public final k B;

    public /* synthetic */ i(k kVar, int i2) {
        this.A = i2;
        this.B = kVar;
    }

    @Override // gk.h
    public final void b(e eVar, r0 r0Var) {
        switch (this.A) {
            case 0:
                boolean z10 = r0Var.f5800a.f11710k0;
                k kVar = this.B;
                if (z10) {
                    kVar.complete(r0Var.f5801b);
                    return;
                } else {
                    kVar.completeExceptionally(new androidx.fragment.app.g0(r0Var));
                    return;
                }
            default:
                this.B.complete(r0Var);
                return;
        }
    }

    @Override // gk.h
    public final void c(e eVar, Throwable th2) {
        switch (this.A) {
            case 0:
                this.B.completeExceptionally(th2);
                return;
            default:
                this.B.completeExceptionally(th2);
                return;
        }
    }
}
