package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vo7  reason: default package */
/* loaded from: classes.dex */
public final class vo7 implements i71, wr0 {
    public static final void b(vo7 vo7Var, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(ht0.v0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new vv7(intValue, ((Number) it2.next()).intValue()));
            }
            gt0.A0(arrayList, arrayList2);
        }
        gt0.p1(arrayList);
    }

    @Override // defpackage.wr0
    public long a() {
        return System.currentTimeMillis();
    }
}
