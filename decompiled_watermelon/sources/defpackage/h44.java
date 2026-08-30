package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h44  reason: default package */
/* loaded from: classes.dex */
public final class h44 extends d44 {
    public final l54 g;
    public final Object h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h44(l54 l54Var, Object obj, Map map) {
        super(l54Var.b(hi2.x(k44.class)), null, map);
        l54Var.getClass();
        obj.getClass();
        map.getClass();
        this.i = new ArrayList();
        this.g = l54Var;
        this.h = obj;
    }

    public final g44 c() {
        int hashCode;
        g44 g44Var = (g44) super.a();
        ArrayList arrayList = this.i;
        arrayList.getClass();
        vh0 vh0Var = g44Var.Y;
        vh0Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b44 b44Var = (b44) obj;
            if (b44Var != null) {
                ec6 ec6Var = (ec6) vh0Var.e;
                g44 g44Var2 = (g44) vh0Var.d;
                y9 y9Var = g44Var2.B;
                y9 y9Var2 = b44Var.B;
                int i2 = y9Var2.a;
                String str = (String) y9Var2.e;
                if (i2 == 0 && str == null) {
                    i.i("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) y9Var.e;
                if (str2 != null && b53.x(str, str2)) {
                    c44.v("Destination ", b44Var, " cannot have the same route as graph ", g44Var2);
                    return null;
                } else if (i2 != y9Var.a) {
                    b44 b44Var2 = (b44) ec6Var.c(i2);
                    if (b44Var2 == b44Var) {
                        continue;
                    } else if (b44Var.L == null) {
                        if (b44Var2 != null) {
                            b44Var2.L = null;
                        }
                        b44Var.L = g44Var2;
                        ec6Var.f(y9Var2.a, b44Var);
                    } else {
                        i.n("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                } else {
                    c44.v("Destination ", b44Var, " cannot have the same id as graph ", g44Var2);
                    return null;
                }
            }
        }
        Object obj2 = this.h;
        if (obj2 == null) {
            if (this.c != null) {
                i.n("You must set a start destination route");
                return null;
            }
            i.n("You must set a start destination id");
            return null;
        }
        m93 O = me2.O(q75.a(obj2.getClass()));
        int v = io2.v(O);
        b44 j = vh0Var.j(v);
        if (j != null) {
            Map d = j.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zt3.j0(d.size()));
            for (Map.Entry entry : d.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((k34) entry.getValue()).a);
            }
            String w = io2.w(obj2, linkedHashMap);
            g44 g44Var3 = (g44) vh0Var.d;
            if (w == null) {
                hashCode = 0;
            } else {
                if (!w.equals((String) g44Var3.B.e)) {
                    if (!zg6.B0(w)) {
                        int i3 = b44.X;
                        hashCode = "android-app://androidx.navigation/".concat(w).hashCode();
                    } else {
                        i.i("Cannot have an empty start destination route");
                    }
                } else {
                    c44.v("Start destination ", w, " cannot use the same route as the graph ", g44Var3);
                }
                vh0Var.c = v;
                return g44Var;
            }
            vh0Var.c = hashCode;
            vh0Var.f = w;
            vh0Var.c = v;
            return g44Var;
        }
        i.m(O.e().b(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
        return null;
    }
}
