package defpackage;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qr1  reason: default package */
/* loaded from: classes.dex */
public final class qr1 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ qr1(EmulatorActivity emulatorActivity, int i) {
        this.A = i;
        this.B = emulatorActivity;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        EmulatorActivity emulatorActivity = this.B;
        switch (i) {
            case 0:
                return emulatorActivity.getDefaultViewModelProviderFactory();
            default:
                return emulatorActivity.getViewModelStore();
        }
    }
}
