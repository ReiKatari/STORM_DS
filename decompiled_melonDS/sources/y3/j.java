package y3;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends nc.l implements mc.a {
    public static final j L = new j(0, 0);
    public static final j R = new j(0, 1);
    public static final j X = new j(0, 2);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.B) {
            case 0:
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new a4.o0(2);
            default:
                return null;
        }
    }
}
