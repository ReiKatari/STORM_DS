package bi;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ e L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i2) {
        super(0);
        this.B = i2;
        this.L = eVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.B) {
            case 0:
                return this.L.requireActivity().getViewModelStore();
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.L.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.L.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
