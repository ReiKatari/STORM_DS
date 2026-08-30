package defpackage;

import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zt3  reason: default package */
/* loaded from: classes.dex */
public abstract class zt3 extends gk2 {
    public static Object i0(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int j0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Preference.DEFAULT_ORDER;
    }

    public static Map k0(ti4 ti4Var) {
        ti4Var.getClass();
        Map singletonMap = Collections.singletonMap(ti4Var.A, ti4Var.B);
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map l0(ti4... ti4VarArr) {
        if (ti4VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(j0(ti4VarArr.length));
            p0(linkedHashMap, ti4VarArr);
            return linkedHashMap;
        }
        return qp1.A;
    }

    public static LinkedHashMap m0(ti4... ti4VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0(ti4VarArr.length));
        p0(linkedHashMap, ti4VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap n0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map o0(Map map, ti4 ti4Var) {
        map.getClass();
        if (map.isEmpty()) {
            return k0(ti4Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(ti4Var.A, ti4Var.B);
        return linkedHashMap;
    }

    public static final void p0(HashMap hashMap, ti4[] ti4VarArr) {
        for (ti4 ti4Var : ti4VarArr) {
            hashMap.put(ti4Var.A, ti4Var.B);
        }
    }

    public static Map q0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(j0(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    ti4 ti4Var = (ti4) obj;
                    linkedHashMap.put(ti4Var.A, ti4Var.B);
                }
                return linkedHashMap;
            }
            return k0((ti4) arrayList.get(0));
        }
        return qp1.A;
    }

    public static Map r0(Map map) {
        map.getClass();
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(map);
            }
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            singletonMap.getClass();
            return singletonMap;
        }
        return qp1.A;
    }

    public static LinkedHashMap s0(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
