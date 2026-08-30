package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pt5  reason: default package */
/* loaded from: classes.dex */
public final class pt5 {
    public final LinkedHashMap a;
    public final r9 b;

    public pt5() {
        this.a = new LinkedHashMap();
        this.b = new r9(qp1.A);
    }

    public final Object a(String str) {
        Object value;
        r9 r9Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) r9Var.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) r9Var.d;
        try {
            ee6 ee6Var = (ee6) linkedHashMap2.get(str);
            if (ee6Var != null && (value = ee6Var.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) r9Var.c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final q45 b(String str) {
        r9 r9Var = this.b;
        boolean containsKey = ((LinkedHashMap) r9Var.d).containsKey(str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) r9Var.a;
        if (containsKey) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) r9Var.d;
            Object obj = linkedHashMap2.get(str);
            if (obj == null) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, null);
                }
                obj = fe6.a(linkedHashMap.get(str));
                linkedHashMap2.put(str, obj);
            }
            return new q45((ee6) obj);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) r9Var.c;
        Object obj2 = linkedHashMap3.get(str);
        if (obj2 == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, null);
            }
            obj2 = fe6.a(linkedHashMap.get(str));
            linkedHashMap3.put(str, obj2);
        }
        return new q45((ee6) obj2);
    }

    public final void c(Object obj, String str) {
        m14 m14Var;
        if (obj != null) {
            ArrayList arrayList = rt5.a;
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
            c44.t(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        ArrayList arrayList2 = rt5.a;
        Object obj3 = this.a.get(str);
        if (obj3 instanceof m14) {
            m14Var = (m14) obj3;
        } else {
            m14Var = null;
        }
        if (m14Var != null) {
            m14Var.f(obj);
        }
        this.b.G(obj, str);
    }

    public pt5(mt3 mt3Var) {
        this.a = new LinkedHashMap();
        this.b = new r9(mt3Var);
    }
}
