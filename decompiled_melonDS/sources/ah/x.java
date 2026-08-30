package ah;

import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ EmulatorActivity B;

    public /* synthetic */ x(EmulatorActivity emulatorActivity, int i2) {
        this.A = i2;
        this.B = emulatorActivity;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                return this.B.getDefaultViewModelProviderFactory();
            default:
                return this.B.getViewModelStore();
        }
    }
}
