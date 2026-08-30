package jd;

import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.d1;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;

    public /* synthetic */ i(int i2, List list) {
        this.A = i2;
        this.B = list;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                return ((tc.d) this.B.get(0)).c();
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((tc.d) this.B.get(0)).c();
            case 2:
                return new d1(((zh.c) l.R(this.B)).f15110a);
            case 3:
                return this.B;
            default:
                Object obj = this.B.get(2);
                obj.getClass();
                return (Integer) obj;
        }
    }
}
