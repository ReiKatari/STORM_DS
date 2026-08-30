package a5;

import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.h1;
import y3.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ ArrayList L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i2, ArrayList arrayList) {
        super(1);
        this.B = i2;
        this.L = arrayList;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                h1 h1Var = (h1) obj;
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    h1.n(h1Var, (i1) arrayList.get(i2), 0, 0);
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                h1 h1Var2 = (h1) obj;
                ArrayList arrayList2 = this.L;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        h1.n(h1Var2, (i1) arrayList2.get(i10), 0, 0);
                        if (i10 != size2) {
                            i10++;
                        }
                    }
                }
                return yb.y.f14813a;
            default:
                h1 h1Var3 = (h1) obj;
                ArrayList arrayList3 = this.L;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    h1.o(h1Var3, (i1) arrayList3.get(i11), 0, 0);
                }
                return yb.y.f14813a;
        }
    }
}
