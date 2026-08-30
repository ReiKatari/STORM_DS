package f5;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class h extends g {
    public int m;

    public h(t tVar) {
        super(tVar);
        if (tVar instanceof m) {
            this.f4867e = f.HORIZONTAL_DIMENSION;
        } else {
            this.f4867e = f.VERTICAL_DIMENSION;
        }
    }

    @Override // f5.g
    public final void d(int i2) {
        if (!this.f4872j) {
            this.f4872j = true;
            this.f4869g = i2;
            ArrayList arrayList = this.f4873k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }
}
