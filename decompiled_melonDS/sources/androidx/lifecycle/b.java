package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1445a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1446b;

    public b(HashMap hashMap) {
        this.f1446b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            p pVar = (p) entry.getValue();
            List list = (List) this.f1445a.get(pVar);
            if (list == null) {
                list = new ArrayList();
                this.f1445a.put(pVar, list);
            }
            list.add((c) entry.getKey());
        }
    }

    public static void a(List list, x xVar, p pVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f1449b;
                try {
                    int i2 = cVar.f1448a;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                method.invoke(obj, xVar, pVar);
                            }
                        } else {
                            method.invoke(obj, xVar);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e10) {
                    m9.o.m("Failed to call observer method", e10.getCause());
                    return;
                }
            }
        }
    }
}
