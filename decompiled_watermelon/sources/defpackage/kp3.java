package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kp3  reason: default package */
/* loaded from: classes.dex */
public final class kp3 extends mp3 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i, long j, Object obj) {
        List arrayList;
        List list = (List) l37.d.i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof vk3) {
                arrayList = new uk3(i);
            } else if ((list instanceof ut4) && (list instanceof r33)) {
                arrayList = ((r33) list).e(i);
            } else {
                arrayList = new ArrayList(i);
            }
            l37.o(j, obj, arrayList);
            return arrayList;
        } else if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            l37.o(j, obj, arrayList2);
            return arrayList2;
        } else if (list instanceof w27) {
            w27 w27Var = (w27) list;
            uk3 uk3Var = new uk3(w27Var.A.size() + i);
            uk3Var.addAll(w27Var);
            l37.o(j, obj, uk3Var);
            return uk3Var;
        } else {
            if ((list instanceof ut4) && (list instanceof r33)) {
                r33 r33Var = (r33) list;
                if (!((i1) r33Var).A) {
                    r33 e = r33Var.e(list.size() + i);
                    l37.o(j, obj, e);
                    return e;
                }
            }
            return list;
        }
    }

    @Override // defpackage.mp3
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) l37.d.i(j, obj);
        if (list instanceof vk3) {
            unmodifiableList = ((vk3) list).f();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if ((list instanceof ut4) && (list instanceof r33)) {
                i1 i1Var = (i1) ((r33) list);
                if (i1Var.A) {
                    i1Var.A = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        l37.o(j, obj, unmodifiableList);
    }

    @Override // defpackage.mp3
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) l37.d.i(j, obj2);
        List d = d(list.size(), j, obj);
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        l37.o(j, obj, list);
    }

    @Override // defpackage.mp3
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}
