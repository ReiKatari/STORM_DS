package mh;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.b1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b1 B;

    public /* synthetic */ s(b1 b1Var, int i2) {
        this.A = i2;
        this.B = b1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        int i2 = this.A;
        yb.y yVar = yb.y.f14813a;
        b1 b1Var = this.B;
        float floatValue = ((Float) obj).floatValue();
        ((Float) obj2).floatValue();
        switch (i2) {
            case 0:
                float f8 = x.f9704a;
                b1Var.h(floatValue);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                float f10 = x.f9704a;
                b1Var.h(floatValue);
                return yVar;
            case 2:
                b1Var.h(floatValue);
                return yVar;
            default:
                b1Var.h(floatValue);
                return yVar;
        }
    }
}
