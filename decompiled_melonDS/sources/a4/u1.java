package a4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u1 extends y3.i1 {
    public final /* synthetic */ int Y;

    public u1(int i2, int i10, int i11) {
        this.Y = i11;
        switch (i11) {
            case DSiCameraSource.FrontCamera /* 1 */:
                r0((i10 & 4294967295L) | (i2 << 32));
                return;
            case 2:
                r0((i10 & 4294967295L) | (i2 << 32));
                return;
            default:
                r0((i10 & 4294967295L) | (i2 << 32));
                return;
        }
    }

    @Override // y3.i1
    public final int i0(y3.q qVar) {
        switch (this.Y) {
            case 0:
                return Integer.MIN_VALUE;
            case DSiCameraSource.FrontCamera /* 1 */:
                return Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // y3.i1
    public final void q0(long j2, float f8, mc.l lVar) {
        int i2 = this.Y;
    }

    private final void v0(long j2, float f8, mc.l lVar) {
    }

    private final void w0(long j2, float f8, mc.l lVar) {
    }

    private final void y0(long j2, float f8, mc.l lVar) {
    }
}
