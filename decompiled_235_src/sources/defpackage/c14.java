package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c14  reason: default package */
/* loaded from: classes.dex */
public abstract class c14 extends ln2 {
    public static Object j0(Map map, Object obj) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int k0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map l0(vr4 vr4Var) {
        vr4Var.getClass();
        Map singletonMap = Collections.singletonMap(vr4Var.A, vr4Var.B);
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map m0(vr4... vr4VarArr) {
        if (vr4VarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(k0(vr4VarArr.length));
            q0(linkedHashMap, vr4VarArr);
            return linkedHashMap;
        }
        return zt1.A;
    }

    public static LinkedHashMap n0(vr4... vr4VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0(vr4VarArr.length));
        q0(linkedHashMap, vr4VarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap o0(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map p0(Map map, vr4 vr4Var) {
        map.getClass();
        if (map.isEmpty()) {
            return l0(vr4Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(vr4Var.A, vr4Var.B);
        return linkedHashMap;
    }

    public static final void q0(HashMap hashMap, vr4[] vr4VarArr) {
        for (vr4 vr4Var : vr4VarArr) {
            hashMap.put(vr4Var.A, vr4Var.B);
        }
    }

    public static Map r0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(k0(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    vr4 vr4Var = (vr4) obj;
                    linkedHashMap.put(vr4Var.A, vr4Var.B);
                }
                return linkedHashMap;
            }
            return l0((vr4) arrayList.get(0));
        }
        return zt1.A;
    }

    public static Map s0(Map map) {
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
        return zt1.A;
    }

    public static LinkedHashMap t0(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
