package f2;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;

    public /* synthetic */ m0(int i2, ArrayList arrayList) {
        this.A = i2;
        this.B = arrayList;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int[] iArr;
        int i2;
        switch (this.A) {
            case 0:
                y3.h1 h1Var = (y3.h1) obj;
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y3.h1.k(h1Var, (y3.i1) arrayList.get(i10), 0, 0);
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ji.g gVar = (ji.g) obj;
                gVar.getClass();
                this.B.add(gVar);
                return yb.y.f14813a;
            case 2:
                y3.h1 h1Var2 = (y3.h1) obj;
                ArrayList arrayList2 = this.B;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    q1.g gVar2 = (q1.g) arrayList2.get(i11);
                    List list = gVar2.f12134b;
                    boolean z10 = gVar2.f12139g;
                    if (gVar2.f12143k == Integer.MIN_VALUE) {
                        k1.b.a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        y3.i1 i1Var = (y3.i1) list.get(i12);
                        int i13 = i11;
                        long c4 = x4.j.c((iArr[i2 + 1] & 4294967295L) | (gVar2.f12141i[i12 * 2] << 32), gVar2.f12135c);
                        if (z10) {
                            y3.h1.w(h1Var2, i1Var, c4);
                        } else {
                            y3.h1.s(h1Var2, i1Var, c4);
                        }
                        i12++;
                        i11 = i13;
                    }
                    i11++;
                }
                return yb.y.f14813a;
            default:
                y3.h1 h1Var3 = (y3.h1) obj;
                ArrayList arrayList3 = this.B;
                int size4 = arrayList3.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    y3.h1.n(h1Var3, (y3.i1) arrayList3.get(i14), 0, 0);
                }
                return yb.y.f14813a;
        }
    }
}
