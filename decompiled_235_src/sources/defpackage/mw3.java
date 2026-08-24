package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw3  reason: default package */
/* loaded from: classes.dex */
public final class mw3 extends ow3 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j, int i) {
        List arrayList;
        List list = (List) gh7.d.i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof wr3) {
                arrayList = new vr3(i);
            } else if ((list instanceof w25) && (list instanceof z93)) {
                arrayList = ((z93) list).k(i);
            } else {
                arrayList = new ArrayList(i);
            }
            gh7.o(obj, j, arrayList);
            return arrayList;
        } else if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            gh7.o(obj, j, arrayList2);
            return arrayList2;
        } else if (list instanceof rg7) {
            rg7 rg7Var = (rg7) list;
            vr3 vr3Var = new vr3(rg7Var.A.size() + i);
            vr3Var.addAll(rg7Var);
            gh7.o(obj, j, vr3Var);
            return vr3Var;
        } else {
            if ((list instanceof w25) && (list instanceof z93)) {
                z93 z93Var = (z93) list;
                if (!((j1) z93Var).A) {
                    z93 k = z93Var.k(list.size() + i);
                    gh7.o(obj, j, k);
                    return k;
                }
            }
            return list;
        }
    }

    @Override // defpackage.ow3
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) gh7.d.i(j, obj);
        if (list instanceof wr3) {
            unmodifiableList = ((wr3) list).u();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if ((list instanceof w25) && (list instanceof z93)) {
                j1 j1Var = (j1) ((z93) list);
                if (j1Var.A) {
                    j1Var.A = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        gh7.o(obj, j, unmodifiableList);
    }

    @Override // defpackage.ow3
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) gh7.d.i(j, obj2);
        List d = d(obj, j, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        gh7.o(obj, j, list);
    }

    @Override // defpackage.ow3
    public final List c(long j, Object obj) {
        return d(obj, j, 10);
    }
}
