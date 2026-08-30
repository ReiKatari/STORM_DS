package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: to0  reason: default package */
/* loaded from: classes.dex */
public final class to0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public to0(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            pm3 pm3Var = (pm3) entry.getValue();
            List list = (List) this.a.get(pm3Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(pm3Var, list);
            }
            list.add((uo0) entry.getKey());
        }
    }

    public static void a(List list, fn3 fn3Var, pm3 pm3Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                uo0 uo0Var = (uo0) list.get(size);
                Method method = uo0Var.b;
                try {
                    int i = uo0Var.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, fn3Var, pm3Var);
                            }
                        } else {
                            method.invoke(obj, fn3Var);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    c44.o("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
