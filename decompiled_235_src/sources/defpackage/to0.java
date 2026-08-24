package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to0  reason: default package */
/* loaded from: classes.dex */
public final class to0 extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ go3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to0(go3 go3Var, int i) {
        super(0);
        this.B = i;
        this.L = go3Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        mw2 mw2Var;
        int i = this.B;
        go3 go3Var = this.L;
        switch (i) {
            case 0:
                return ((bp7) go3Var.getValue()).getViewModelStore();
            default:
                bp7 bp7Var = (bp7) go3Var.getValue();
                if (bp7Var instanceof mw2) {
                    mw2Var = (mw2) bp7Var;
                } else {
                    mw2Var = null;
                }
                if (mw2Var != null) {
                    return mw2Var.getDefaultViewModelCreationExtras();
                }
                return h71.b;
        }
    }
}
