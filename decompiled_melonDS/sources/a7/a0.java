package a7;

import a1.x0;
import a4.k2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends y {

    /* renamed from: g  reason: collision with root package name */
    public final n0 f545g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f546h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f547i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n0 n0Var, Object obj, Map map) {
        super(n0Var.b(pc.a.y(c0.class)), null, map);
        n0Var.getClass();
        obj.getClass();
        map.getClass();
        this.f547i = new ArrayList();
        this.f545g = n0Var;
        this.f546h = obj;
    }

    public final z c() {
        int hashCode;
        z zVar = (z) super.a();
        ArrayList arrayList = this.f547i;
        arrayList.getClass();
        d5.j jVar = zVar.Y;
        jVar.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            x xVar = (x) obj;
            if (xVar != null) {
                x0 x0Var = (x0) jVar.f3862d;
                z zVar2 = (z) jVar.f3861c;
                k2 k2Var = zVar2.B;
                k2 k2Var2 = xVar.B;
                int i10 = k2Var2.f248a;
                String str = (String) k2Var2.f252e;
                if (i10 == 0 && str == null) {
                    a0.j.h("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) k2Var.f252e;
                if (str2 != null && nc.k.a(str, str2)) {
                    fj.j.i("Destination ", xVar, " cannot have the same route as graph ", zVar2);
                    return null;
                } else if (i10 != k2Var.f248a) {
                    x xVar2 = (x) x0Var.c(i10);
                    if (xVar2 == xVar) {
                        continue;
                    } else if (xVar.L == null) {
                        if (xVar2 != null) {
                            xVar2.L = null;
                        }
                        xVar.L = zVar2;
                        x0Var.f(k2Var2.f248a, xVar);
                    } else {
                        a0.j.p("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                } else {
                    fj.j.i("Destination ", xVar, " cannot have the same id as graph ", zVar2);
                    return null;
                }
            }
        }
        Object obj2 = this.f546h;
        if (obj2 == null) {
            if (this.f634c != null) {
                a0.j.p("You must set a start destination route");
                return null;
            }
            a0.j.p("You must set a start destination id");
            return null;
        }
        jd.a Y = aj.g.Y(nc.u.a(obj2.getClass()));
        int b10 = e7.d.b(Y);
        x e6 = jVar.e(b10);
        if (e6 != null) {
            Map c4 = e6.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zb.v.E(c4.size()));
            for (Map.Entry entry : c4.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((h) entry.getValue()).f571a);
            }
            String c10 = e7.d.c(obj2, linkedHashMap);
            z zVar3 = (z) jVar.f3861c;
            if (c10 == null) {
                hashCode = 0;
            } else {
                if (!c10.equals((String) zVar3.B.f252e)) {
                    if (!vc.h.j0(c10)) {
                        int i11 = x.X;
                        hashCode = "android-app://androidx.navigation/".concat(c10).hashCode();
                    } else {
                        a0.j.h("Cannot have an empty start destination route");
                    }
                } else {
                    fj.j.i("Start destination ", c10, " cannot use the same route as the graph ", zVar3);
                }
                jVar.f3860b = b10;
                return zVar;
            }
            jVar.f3860b = hashCode;
            jVar.f3864f = c10;
            jVar.f3860b = b10;
            return zVar;
        }
        fj.j.f(Y.e().b(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
        return null;
    }
}
