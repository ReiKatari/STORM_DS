package g2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ c3(int i2, Collection collection) {
        this.A = 3;
        this.B = i2;
        this.L = collection;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        mc.l lVar;
        switch (this.A) {
            case 0:
                y3.h1.k((y3.h1) obj, (y3.i1) this.L, 0, -this.B);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ArrayList arrayList = (ArrayList) this.L;
                y3.h1 h1Var = (y3.h1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y3.i1 i1Var = (y3.i1) arrayList.get(i2);
                    y3.h1.n(h1Var, i1Var, 0, (this.B - i1Var.B) / 2);
                }
                return yb.y.f14813a;
            case 2:
                p1.m0 m0Var = (p1.m0) obj;
                n1.a aVar = ((o1.t) this.L).f10589a;
                z2.f e6 = z2.q.e();
                if (e6 != null) {
                    lVar = e6.e();
                } else {
                    lVar = null;
                }
                z2.q.k(e6, z2.q.h(e6), lVar);
                aVar.getClass();
                int i10 = m0Var.f11231a;
                if (i10 == -1) {
                    i10 = 2;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    m0Var.a(this.B + i11);
                }
                return yb.y.f14813a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.B, (Collection) this.L));
        }
    }

    public /* synthetic */ c3(int i2, int i10, Object obj) {
        this.A = i10;
        this.L = obj;
        this.B = i2;
    }
}
