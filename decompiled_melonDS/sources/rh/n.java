package rh;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ n(me.magnum.melonds.ui.layouteditor.b bVar, int i2) {
        this.A = i2;
        this.B = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                me.magnum.melonds.ui.layouteditor.b bVar = this.B;
                le.a aVar = bVar.L;
                aVar.f9057j.animate().y(aVar.f9048a.getBottom()).setDuration(100L).withEndAction(new n(bVar, 3)).start();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.L.f9055h.setVisibility(0);
                return;
            case 2:
                this.B.L.f9055h.setVisibility(8);
                return;
            case 3:
                this.B.L.f9057j.setVisibility(4);
                return;
            default:
                le.a aVar2 = this.B.L;
                aVar2.f9057j.animate().y(aVar2.f9048a.getBottom() - aVar2.f9057j.getHeight()).setDuration(100L).withEndAction(null).start();
                return;
        }
    }
}
