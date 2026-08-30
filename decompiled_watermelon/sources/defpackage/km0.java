package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: km0  reason: default package */
/* loaded from: classes.dex */
public final class km0 extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ gh3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km0(gh3 gh3Var, int i) {
        super(0);
        this.B = i;
        this.L = gh3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        lq2 lq2Var;
        int i = this.B;
        gh3 gh3Var = this.L;
        switch (i) {
            case 0:
                return ((ab7) gh3Var.getValue()).getViewModelStore();
            default:
                ab7 ab7Var = (ab7) gh3Var.getValue();
                if (ab7Var instanceof lq2) {
                    lq2Var = (lq2) ab7Var;
                } else {
                    lq2Var = null;
                }
                if (lq2Var != null) {
                    return lq2Var.getDefaultViewModelCreationExtras();
                }
                return x31.b;
        }
    }
}
