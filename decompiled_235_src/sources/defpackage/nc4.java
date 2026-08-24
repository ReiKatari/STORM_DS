package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc4  reason: default package */
/* loaded from: classes.dex */
public final class nc4 extends jc4 {
    public final rd4 g;
    public final Object h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc4(rd4 rd4Var, Object obj, Map map) {
        super(rd4Var.b(xk2.o(qc4.class)), null, map);
        rd4Var.getClass();
        obj.getClass();
        map.getClass();
        this.i = new ArrayList();
        this.g = rd4Var;
        this.h = obj;
    }

    public final mc4 c() {
        int hashCode;
        mc4 mc4Var = (mc4) super.a();
        ArrayList arrayList = this.i;
        arrayList.getClass();
        dk0 dk0Var = mc4Var.Y;
        dk0Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ic4 ic4Var = (ic4) obj;
            if (ic4Var != null) {
                un6 un6Var = (un6) dk0Var.X;
                mc4 mc4Var2 = (mc4) dk0Var.R;
                z9 z9Var = mc4Var2.B;
                z9 z9Var2 = ic4Var.B;
                int i2 = z9Var2.a;
                String str = (String) z9Var2.e;
                if (i2 == 0 && str == null) {
                    i.h("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) z9Var.e;
                if (str2 != null && nb3.k(str, str2)) {
                    u34.y("Destination ", ic4Var, " cannot have the same route as graph ", mc4Var2);
                    return null;
                } else if (i2 != z9Var.a) {
                    ic4 ic4Var2 = (ic4) un6Var.c(i2);
                    if (ic4Var2 == ic4Var) {
                        continue;
                    } else if (ic4Var.L == null) {
                        if (ic4Var2 != null) {
                            ic4Var2.L = null;
                        }
                        ic4Var.L = mc4Var2;
                        un6Var.e(z9Var2.a, ic4Var);
                    } else {
                        i.m("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                } else {
                    u34.y("Destination ", ic4Var, " cannot have the same id as graph ", mc4Var2);
                    return null;
                }
            }
        }
        Object obj2 = this.h;
        if (obj2 == null) {
            if (this.c != null) {
                i.m("You must set a start destination route");
                return null;
            }
            i.m("You must set a start destination id");
            return null;
        }
        gg3 K = jx2.K(gh5.a(obj2.getClass()));
        int O = np2.O(K);
        ic4 l = dk0Var.l(O);
        if (l != null) {
            Map c = l.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap(c14.k0(c.size()));
            for (Map.Entry entry : c.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((rb4) entry.getValue()).a);
            }
            String P = np2.P(obj2, linkedHashMap);
            mc4 mc4Var3 = (mc4) dk0Var.R;
            if (P == null) {
                hashCode = 0;
            } else {
                if (!P.equals((String) mc4Var3.B.e)) {
                    if (!qs6.v0(P)) {
                        int i3 = ic4.X;
                        hashCode = "android-app://androidx.navigation/".concat(P).hashCode();
                    } else {
                        i.h("Cannot have an empty start destination route");
                    }
                } else {
                    u34.y("Start destination ", P, " cannot use the same route as the graph ", mc4Var3);
                }
                dk0Var.L = O;
                return mc4Var;
            }
            dk0Var.L = hashCode;
            dk0Var.Y = P;
            dk0Var.L = O;
            return mc4Var;
        }
        e41.g(K.e().a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
        return null;
    }
}
