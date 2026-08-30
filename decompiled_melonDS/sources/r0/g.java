package r0;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ k B;

    public /* synthetic */ g(k kVar, int i2) {
        this.A = i2;
        this.B = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.a();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.b();
                return;
            default:
                k kVar = this.B;
                m mVar = kVar.f12581r;
                if (mVar != null) {
                    mVar.m();
                }
                if (kVar.f12580q == null) {
                    b5.i iVar = kVar.f12579p;
                    iVar.f2054d = true;
                    b5.l lVar = iVar.f2052b;
                    if (lVar != null && lVar.B.cancel(true)) {
                        iVar.f2051a = null;
                        iVar.f2052b = null;
                        iVar.f2053c = null;
                    }
                }
                kVar.f12580q = null;
                return;
        }
    }
}
