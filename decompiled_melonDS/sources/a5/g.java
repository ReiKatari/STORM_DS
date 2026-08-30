package a5;

import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends nc.l implements mc.a {
    public static final g L = new g(0, 0);
    public static final g R = new g(0, 1);
    public static final g X = new g(0, 2);
    public static final g Y = new g(0, 3);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.B) {
            case 0:
                return UUID.randomUUID();
            case DSiCameraSource.FrontCamera /* 1 */:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
