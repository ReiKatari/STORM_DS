package rh;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ o(me.magnum.melonds.ui.layouteditor.b bVar, int i2) {
        this.A = i2;
        this.B = bVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                ((og.i) obj).getClass();
                this.B.q(true);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                me.magnum.melonds.ui.layouteditor.b.j(this.B, (String) obj);
                break;
            default:
                me.magnum.melonds.ui.layouteditor.b.l(this.B, (ve.a) obj);
                break;
        }
        return yb.y.f14813a;
    }
}
