package vb;

import a4.n;
import java.util.ArrayList;
import m9.o;
import pb.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ob.a {
    @Override // ob.a
    public final void a(n nVar) {
        ob.a aVar;
        ob.a aVar2;
        ArrayList arrayList = (ArrayList) nVar.B;
        ArrayList arrayList2 = (ArrayList) nVar.L;
        int size = arrayList2.size();
        int i2 = 0;
        int i10 = 0;
        while (true) {
            aVar = null;
            if (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                aVar2 = (ob.a) obj;
                if (c.class.isAssignableFrom(aVar2.getClass())) {
                    break;
                }
            } else {
                aVar2 = null;
                break;
            }
        }
        if (aVar2 == null) {
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                ob.a aVar3 = (ob.a) obj2;
                if (c.class.isAssignableFrom(aVar3.getClass())) {
                    aVar = aVar3;
                    break;
                }
            }
            if (aVar != null) {
                nVar.l(aVar);
                aVar2 = aVar;
            } else {
                o.j("Requested plugin is not added: ", c.class.getName(), ", plugins: ", arrayList);
                return;
            }
        }
        ((c) aVar2).f11533a.add(new Object());
    }
}
