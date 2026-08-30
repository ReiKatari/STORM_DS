package g2;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class q5 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.p B;

    public /* synthetic */ q5(int i2, mc.p pVar) {
        this.A = 1;
        this.B = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        y2.f fVar;
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    e7.a(l4.r0.a(((f7) rVar.j(g7.f5161b)).f5152k, 0L, 0L, null, null, 0L, 0L, null, 16744447), this.B, rVar, 0);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                x5.c(this.B, (n2.m) obj, n2.s.F(1));
                return yb.y.f14813a;
            case 2:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    this.B.j(rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            default:
                y2.c cVar = (y2.c) obj;
                List list = (List) this.B.j(cVar, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (fVar = cVar.B) != null && !fVar.b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (!list.isEmpty()) {
                    return new ArrayList(list);
                }
                return null;
        }
    }

    public /* synthetic */ q5(mc.p pVar, int i2, byte b10) {
        this.A = i2;
        this.B = pVar;
    }
}
