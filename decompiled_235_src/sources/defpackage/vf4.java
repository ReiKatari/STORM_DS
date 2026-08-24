package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf4  reason: default package */
/* loaded from: classes.dex */
public final class vf4 extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ wf4 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf4(wf4 wf4Var, int i) {
        super(0);
        this.B = i;
        this.L = wf4Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.B;
        wf4 wf4Var = this.L;
        switch (i) {
            case 0:
                return wf4Var.requireActivity().getViewModelStore();
            case 1:
                return wf4Var.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return wf4Var.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
