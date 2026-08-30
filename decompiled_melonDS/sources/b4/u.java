package b4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i2, int i10) {
        super(1);
        this.B = i10;
        this.L = i2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                return Boolean.valueOf(((g3.g0) obj).V0(this.L));
            case DSiCameraSource.FrontCamera /* 1 */:
                return Boolean.valueOf(((g3.g0) obj).V0(this.L));
            case 2:
                return Boolean.valueOf(((g3.g0) obj).V0(this.L));
            case 3:
                return Boolean.valueOf(((g3.g0) obj).V0(this.L));
            default:
                return Boolean.valueOf(((g3.g0) obj).O0(this.L));
        }
    }
}
