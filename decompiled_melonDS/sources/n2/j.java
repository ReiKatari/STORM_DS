package n2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends RuntimeException {
    public final a1.h0 A;
    public final a1.h0 B;
    public final a1.w L;
    public final int R;

    public j(a1.h0 h0Var, a1.h0 h0Var2, a1.w wVar, int i2, Exception exc) {
        super(exc);
        this.A = h0Var;
        this.B = h0Var2;
        this.L = wVar;
        this.R = i2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        Collection collection;
        StringBuilder sb2 = new StringBuilder("\n            |Failed to execute op number ");
        sb2.append(this.R);
        sb2.append(":\n            |");
        uc.g y10 = p7.m.y(new i(this, null));
        if (!y10.hasNext()) {
            list = zb.q.A;
        } else {
            Object next = y10.next();
            if (!y10.hasNext()) {
                list = p7.t.x(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (y10.hasNext()) {
                    arrayList.add(y10.next());
                }
                list = arrayList;
            }
        }
        int size = list.size();
        if (50 >= size) {
            collection = zb.l.p0(list);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (list instanceof RandomAccess) {
                for (int i2 = size - 50; i2 < size; i2++) {
                    arrayList2.add(list.get(i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        sb2.append(zb.l.Y(collection, "\n", null, null, null, 62));
        sb2.append("\n            ");
        return vc.i.K(sb2.toString());
    }
}
