package y3;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface v0 {
    w0 a(x0 x0Var, List list, long j2);

    default int c(v vVar, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a4.t1((u0) list.get(i10), w.Min, x.Height, 1));
        }
        return a(new y(vVar, vVar.getLayoutDirection()), arrayList, x4.b.b(i2, 0, 13)).a();
    }

    default int d(v vVar, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a4.t1((u0) list.get(i10), w.Max, x.Width, 1));
        }
        return a(new y(vVar, vVar.getLayoutDirection()), arrayList, x4.b.b(0, i2, 7)).c();
    }

    default int g(v vVar, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a4.t1((u0) list.get(i10), w.Min, x.Width, 1));
        }
        return a(new y(vVar, vVar.getLayoutDirection()), arrayList, x4.b.b(0, i2, 7)).c();
    }

    default int j(v vVar, List list, int i2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a4.t1((u0) list.get(i10), w.Max, x.Height, 1));
        }
        return a(new y(vVar, vVar.getLayoutDirection()), arrayList, x4.b.b(i2, 0, 13)).a();
    }
}
