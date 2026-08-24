package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v46  reason: default package */
/* loaded from: classes.dex */
public final class v46 {
    public final LinkedHashMap a;
    public final s9 b;

    public v46() {
        this.a = new LinkedHashMap();
        this.b = new s9(zt1.A);
    }

    public final Object a(String str) {
        Object value;
        s9 s9Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) s9Var.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) s9Var.d;
        try {
            tp6 tp6Var = (tp6) linkedHashMap2.get(str);
            if (tp6Var != null && (value = tp6Var.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) s9Var.c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final de5 b(String str) {
        s9 s9Var = this.b;
        boolean containsKey = ((LinkedHashMap) s9Var.d).containsKey(str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) s9Var.a;
        if (containsKey) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) s9Var.d;
            Object obj = linkedHashMap2.get(str);
            if (obj == null) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, null);
                }
                obj = up6.a(linkedHashMap.get(str));
                linkedHashMap2.put(str, obj);
            }
            return new de5((tp6) obj);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) s9Var.c;
        Object obj2 = linkedHashMap3.get(str);
        if (obj2 == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, null);
            }
            obj2 = up6.a(linkedHashMap.get(str));
            linkedHashMap3.put(str, obj2);
        }
        return new de5((tp6) obj2);
    }

    public final void c(Object obj, String str) {
        s94 s94Var;
        if (obj != null) {
            ArrayList arrayList = x46.a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((Class) obj2).isInstance(obj)) {
                    }
                }
            }
            u34.A(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        ArrayList arrayList2 = x46.a;
        Object obj3 = this.a.get(str);
        if (obj3 instanceof s94) {
            s94Var = (s94) obj3;
        } else {
            s94Var = null;
        }
        if (s94Var != null) {
            s94Var.f(obj);
        }
        this.b.G(obj, str);
    }

    public v46(p04 p04Var) {
        this.a = new LinkedHashMap();
        this.b = new s9(p04Var);
    }
}
