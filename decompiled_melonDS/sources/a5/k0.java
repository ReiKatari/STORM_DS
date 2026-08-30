package a5;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.a B;

    public /* synthetic */ k0(int i2, mc.a aVar) {
        this.A = i2;
        this.B = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.b();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.b();
                return;
            case 2:
                this.B.b();
                return;
            default:
                this.B.b();
                return;
        }
    }
}
