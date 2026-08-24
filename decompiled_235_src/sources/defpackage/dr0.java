package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr0  reason: default package */
/* loaded from: classes.dex */
public final class dr0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public dr0(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            st3 st3Var = (st3) entry.getValue();
            List list = (List) this.a.get(st3Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(st3Var, list);
            }
            list.add((er0) entry.getKey());
        }
    }

    public static void a(List list, hu3 hu3Var, st3 st3Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                er0 er0Var = (er0) list.get(size);
                Method method = er0Var.b;
                try {
                    int i = er0Var.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, hu3Var, st3Var);
                            }
                        } else {
                            method.invoke(obj, hu3Var);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    u34.p("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
