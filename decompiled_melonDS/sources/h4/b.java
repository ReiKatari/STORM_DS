package h4;

import me.magnum.melonds.common.camera.DSiCameraSource;
import nc.l;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends l implements mc.l {
    public static final b L = new b(1, 0);
    public static final b R = new b(1, 1);
    public static final b X = new b(1, 2);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                ((Number) obj).longValue();
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                return Integer.valueOf(((h) obj).f6078b);
            default:
                return Integer.valueOf(((h) obj).f6079c.a());
        }
    }
}
