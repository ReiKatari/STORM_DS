package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb1  reason: default package */
/* loaded from: classes.dex */
public final class xb1 {
    public static final xb1 b;
    public final HashMap a;

    static {
        xb1 xb1Var = new xb1(new LinkedHashMap());
        u24.H(xb1Var);
        b = xb1Var;
    }

    public xb1(xb1 xb1Var) {
        xb1Var.getClass();
        this.a = new HashMap(xb1Var.a);
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
            if (obj != null && xb1.class.equals(obj.getClass())) {
                HashMap hashMap = ((xb1) obj).a;
                HashMap hashMap2 = this.a;
                Set<String> keySet = hashMap2.keySet();
                if (nb3.k(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 != null && obj3 != null) {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = fv.p0(objArr, (Object[]) obj3);
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
        return i61.n(new StringBuilder("Data {"), gt0.P0(this.a.entrySet(), null, null, null, new vn0(19), 31), "}");
    }

    public xb1(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }
}
