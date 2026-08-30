package zb;

import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class v extends p7.a {
    public static Object D(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int E(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Preference.DEFAULT_ORDER;
    }

    public static Map F(yb.j... jVarArr) {
        if (jVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(E(jVarArr.length));
            G(linkedHashMap, jVarArr);
            return linkedHashMap;
        }
        return r.A;
    }

    public static final void G(HashMap hashMap, yb.j[] jVarArr) {
        for (yb.j jVar : jVarArr) {
            hashMap.put(jVar.A, jVar.B);
        }
    }

    public static Map H(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            int i2 = 0;
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(E(arrayList.size()));
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    yb.j jVar = (yb.j) obj;
                    linkedHashMap.put(jVar.A, jVar.B);
                }
                return linkedHashMap;
            }
            yb.j jVar2 = (yb.j) arrayList.get(0);
            jVar2.getClass();
            Map singletonMap = Collections.singletonMap(jVar2.A, jVar2.B);
            singletonMap.getClass();
            return singletonMap;
        }
        return r.A;
    }

    public static Map I(Map map) {
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
        return r.A;
    }

    public static LinkedHashMap J(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
