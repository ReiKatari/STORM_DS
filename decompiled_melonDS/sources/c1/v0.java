package c1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ mc.l L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(mc.l lVar, int i2) {
        super(1);
        this.B = i2;
        this.L = lVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                long j2 = ((x4.l) obj).f14346a;
                return new x4.l((((Number) this.L.k(Integer.valueOf((int) (j2 >> 32)))).intValue() << 32) | (4294967295L & ((int) (j2 & 4294967295L))));
            case DSiCameraSource.FrontCamera /* 1 */:
                return new x4.j((((Number) this.L.k(Integer.valueOf((int) (((x4.l) obj).f14346a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            case 2:
                return new x4.j((0 << 32) | (4294967295L & ((Number) this.L.k(Integer.valueOf((int) (((x4.l) obj).f14346a & 4294967295L)))).intValue()));
            case 3:
                return new x4.j((((Number) this.L.k(Integer.valueOf((int) (((x4.l) obj).f14346a >> 32)))).intValue() << 32) | (0 & 4294967295L));
            default:
                return new x4.j((0 << 32) | (4294967295L & ((Number) this.L.k(Integer.valueOf((int) (((x4.l) obj).f14346a & 4294967295L)))).intValue()));
        }
    }
}
