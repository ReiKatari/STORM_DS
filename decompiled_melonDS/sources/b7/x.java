package b7;

import f2.k0;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ s2 B;

    public /* synthetic */ x(s2 s2Var, int i2) {
        this.A = i2;
        this.B = s2Var;
    }

    @Override // mc.a
    public final Object b() {
        int i2 = this.A;
        s2 s2Var = this.B;
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) s2Var.getValue()) {
                    if (nc.k.a(((a7.i) obj).B.A, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new h3.b(((h3.b) s2Var.getValue()).f6050a);
            default:
                d1.m mVar = k0.f4750a;
                return new h3.b(((h3.b) s2Var.getValue()).f6050a);
        }
    }
}
