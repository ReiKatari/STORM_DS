package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g81  reason: default package */
/* loaded from: classes.dex */
public final class g81 {
    public static final g81 b;
    public final HashMap a;

    static {
        g81 g81Var = new g81(new LinkedHashMap());
        a53.Q(g81Var);
        b = g81Var;
    }

    public g81(g81 g81Var) {
        g81Var.getClass();
        this.a = new HashMap(g81Var.a);
    }

    public final long a(String str) {
        Object obj = 0L;
        Object obj2 = this.a.get(str);
        if (obj2 instanceof Long) {
            obj = obj2;
        }
        return ((Number) obj).longValue();
    }

    public final String b(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(String str) {
        Object obj = this.a.get(str);
        if (obj != null && String.class.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && g81.class.equals(obj.getClass())) {
                HashMap hashMap = ((g81) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (b53.x(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 != null && obj3 != null) {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = nu.b0(objArr, (Object[]) obj3);
                                    continue;
                                }
                            }
                            z = obj2.equals(obj3);
                            continue;
                        } else if (obj2 == obj3) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                hashCode = Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value);
            } else {
                hashCode = entry.hashCode();
            }
            i += hashCode;
        }
        return i * 31;
    }

    public final String toString() {
        return b31.q(new StringBuilder("Data {"), tq0.S0(this.a.entrySet(), null, null, null, new nl0(18), 31), "}");
    }

    public g81(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }
}
