package defpackage;

import me.magnum.melonds.ui.inputsetup.InputSetupActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e13  reason: default package */
/* loaded from: classes.dex */
public final class e13 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ InputSetupActivity B;

    public /* synthetic */ e13(InputSetupActivity inputSetupActivity, int i) {
        this.A = i;
        this.B = inputSetupActivity;
    }

    @Override // defpackage.ki2
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
