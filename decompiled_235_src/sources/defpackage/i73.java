package defpackage;

import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i73  reason: default package */
/* loaded from: classes.dex */
public final class i73 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ InputSetupActivity B;

    public /* synthetic */ i73(InputSetupActivity inputSetupActivity, int i) {
        this.A = i;
        this.B = inputSetupActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        InputSetupActivity inputSetupActivity = this.B;
        switch (i) {
            case 0:
                return inputSetupActivity.getDefaultViewModelProviderFactory();
            case 1:
                return inputSetupActivity.getViewModelStore();
            default:
                return inputSetupActivity.getDefaultViewModelCreationExtras();
        }
    }
}
