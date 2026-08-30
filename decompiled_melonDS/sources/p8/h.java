package p8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f11493b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11494a;

    static {
        h hVar = new h(new LinkedHashMap());
        p7.j.J(hVar);
        f11493b = hVar;
    }

    public h(h hVar) {
        hVar.getClass();
        this.f11494a = new HashMap(hVar.f11494a);
    }

    public final String a(String str) {
        Object obj = this.f11494a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean b(String str) {
        Object obj = this.f11494a.get(str);
        if (obj != null && String.class.isAssignableFrom(obj.getClass())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj != null && h.class.equals(obj.getClass())) {
                HashMap hashMap = ((h) obj).f11494a;
                HashMap hashMap2 = this.f11494a;
                Set<String> keySet = hashMap2.keySet();
                if (nc.k.a(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 != null && obj3 != null) {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z10 = zb.k.e(objArr, (Object[]) obj3);
                                    continue;
                                }
                            }
                            z10 = obj2.equals(obj3);
                            continue;
                        } else if (obj2 == obj3) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (!z10) {
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
        int i2 = 0;
        for (Map.Entry entry : this.f11494a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                hashCode = Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value);
            } else {
                hashCode = entry.hashCode();
            }
            i2 += hashCode;
        }
        return i2 * 31;
    }

    public final String toString() {
        return w.d.s(new StringBuilder("Data {"), zb.l.Y(this.f11494a.entrySet(), null, null, null, new od.x(6), 31), "}");
    }

    public h(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.f11494a = new HashMap(linkedHashMap);
    }
}
