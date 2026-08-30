package defpackage;

import defpackage.h03;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zz2  reason: default package */
/* loaded from: classes.dex */
public final class zz2 implements p83, i73 {
    public static l73 c(g83 g83Var, String str) {
        l73 l73Var = (l73) g83Var.A.get(str);
        if (l73Var != null) {
            return l73Var;
        }
        throw new RuntimeException(wh1.A("Missing input assignment field '", str, "'"));
    }

    @Override // defpackage.p83
    public final l73 a(Object obj, Type type, dz4 dz4Var) {
        h03.b bVar = (h03.b) obj;
        bVar.getClass();
        type.getClass();
        dz4Var.getClass();
        g83 g83Var = new g83();
        if (bVar instanceof h03.b.d) {
            g83Var.i("type", new l83("none"));
            return g83Var;
        }
        boolean z = bVar instanceof h03.b.c;
        l73 l73Var = c83.A;
        if (z) {
            g83Var.i("type", new l83("key"));
            h03.b.c cVar = (h03.b.c) bVar;
            Integer num = cVar.a;
            if (num == null) {
                g83Var.i("deviceId", l73Var);
            } else {
                g83Var.i("deviceId", new l83(num));
            }
            g83Var.i("keyCode", new l83(Integer.valueOf(cVar.b)));
            return g83Var;
        } else if (bVar instanceof h03.b.a) {
            g83Var.i("type", new l83("axis"));
            h03.b.a aVar = (h03.b.a) bVar;
            Integer num2 = aVar.a;
            if (num2 == null) {
                g83Var.i("deviceId", l73Var);
            } else {
                g83Var.i("deviceId", new l83(num2));
            }
            g83Var.i("axisCode", new l83(Integer.valueOf(aVar.b)));
            a03 a03Var = aVar.c;
            qo2 qo2Var = ((dy6) dz4Var.A).c;
            if (a03Var == null) {
                qo2Var.getClass();
            } else {
                qo2Var.getClass();
                a93 a93Var = new a93();
                qo2Var.g(a03Var, a03.class, a93Var);
                ArrayList arrayList = a93Var.j0;
                if (arrayList.isEmpty()) {
                    l73Var = a93Var.l0;
                } else {
                    f81.z(arrayList, "Expected one JSON element but was ");
                    return null;
                }
            }
            g83Var.i("direction", l73Var);
            return g83Var;
        } else {
            i.c();
            return null;
        }
    }

    @Override // defpackage.i73
    public final Object b(l73 l73Var, Type type, dz4 dz4Var) {
        g83 g83Var;
        String str;
        l73Var.getClass();
        type.getClass();
        dz4Var.getClass();
        Integer num = null;
        if (l73Var instanceof g83) {
            g83Var = l73Var.c();
        } else {
            g83Var = null;
        }
        if (g83Var != null) {
            yo3 yo3Var = g83Var.A;
            l73 l73Var2 = (l73) yo3Var.get("type");
            if (l73Var2 != null) {
                str = l73Var2.d();
            } else {
                str = null;
            }
            if (str == null || zg6.B0(str)) {
                if (yo3Var.containsKey("keyCode")) {
                    str = "key";
                } else if (!yo3Var.containsKey("axisCode")) {
                    str = "none";
                } else {
                    str = "axis";
                }
            }
            int hashCode = str.hashCode();
            if (hashCode != 106079) {
                if (hashCode != 3008417) {
                    if (hashCode == 3387192 && str.equals("none")) {
                        return h03.b.d.INSTANCE;
                    }
                } else if (str.equals("axis")) {
                    l73 l73Var3 = (l73) yo3Var.get("deviceId");
                    if (l73Var3 != null && !(l73Var3 instanceof c83)) {
                        num = Integer.valueOf(l73Var3.b());
                    }
                    int b = c(g83Var, "axisCode").b();
                    Object q = dz4Var.q(c(g83Var, "direction"), a03.class);
                    q.getClass();
                    return new h03.b.a(num, b, (a03) q);
                }
            } else if (str.equals("key")) {
                l73 l73Var4 = (l73) yo3Var.get("deviceId");
                if (l73Var4 != null && !(l73Var4 instanceof c83)) {
                    num = Integer.valueOf(l73Var4.b());
                }
                return new h03.b.c(c(g83Var, "keyCode").b(), num);
            }
            throw new RuntimeException("Unknown input assignment type");
        }
        throw new RuntimeException("Input assignment must be an object");
    }
}
