package androidx.lifecycle;

import cd.q1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1479a;

    /* renamed from: b  reason: collision with root package name */
    public final a7.v f1480b;

    public p0() {
        this.f1479a = new LinkedHashMap();
        this.f1480b = new a7.v(zb.r.A);
    }

    public final Object a(String str) {
        Object value;
        a7.v vVar = this.f1480b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) vVar.A;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) vVar.R;
        try {
            q1 q1Var = (q1) linkedHashMap2.get(str);
            if (q1Var != null && (value = q1Var.getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) vVar.L).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final cd.y0 b(String str) {
        a7.v vVar = this.f1480b;
        boolean containsKey = ((LinkedHashMap) vVar.R).containsKey(str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) vVar.A;
        if (containsKey) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) vVar.R;
            Object obj = linkedHashMap2.get(str);
            if (obj == null) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, null);
                }
                obj = cd.q.c(linkedHashMap.get(str));
                linkedHashMap2.put(str, obj);
            }
            return new cd.y0((q1) obj);
        }
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) vVar.L;
        Object obj2 = linkedHashMap3.get(str);
        if (obj2 == null) {
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, null);
            }
            obj2 = cd.q.c(linkedHashMap.get(str));
            linkedHashMap3.put(str, obj2);
        }
        return new cd.y0((q1) obj2);
    }

    public final void c(Object obj, String str) {
        f0 f0Var;
        if (obj != null) {
            ArrayList arrayList = v6.a.f13751a;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (((Class) obj2).isInstance(obj)) {
                    }
                }
            }
            fj.j.m(obj.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        ArrayList arrayList2 = v6.a.f13751a;
        Object obj3 = this.f1479a.get(str);
        if (obj3 instanceof f0) {
            f0Var = (f0) obj3;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            f0Var.h(obj);
        }
        this.f1480b.w(obj, str);
    }

    public p0(ac.e eVar) {
        this.f1479a = new LinkedHashMap();
        this.f1480b = new a7.v(eVar);
    }
}
