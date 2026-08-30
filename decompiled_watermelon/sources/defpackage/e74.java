package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e74  reason: default package */
/* loaded from: classes.dex */
public final class e74 extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ f74 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e74(f74 f74Var, int i) {
        super(0);
        this.B = i;
        this.L = f74Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.B;
        f74 f74Var = this.L;
        switch (i) {
            case 0:
                return f74Var.requireActivity().getViewModelStore();
            case 1:
                return f74Var.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return f74Var.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
