package hg;

import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ BackgroundsActivity B;

    public /* synthetic */ c(BackgroundsActivity backgroundsActivity, int i2) {
        this.A = i2;
        this.B = backgroundsActivity;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                return this.B.getDefaultViewModelProviderFactory();
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B.getViewModelStore();
            default:
                return this.B.getDefaultViewModelCreationExtras();
        }
    }
}
