package defpackage;

import defpackage.k63;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c63  reason: default package */
/* loaded from: classes.dex */
public final class c63 implements if3, be3 {
    public static ee3 c(ze3 ze3Var, String str) {
        ee3 ee3Var = (ee3) ze3Var.A.get(str);
        if (ee3Var != null) {
            return ee3Var;
        }
        throw new RuntimeException(lb1.A("Missing input assignment field '", str, "'"));
    }

    @Override // defpackage.be3
    public final Object a(ee3 ee3Var, Type type, j97 j97Var) {
        ze3 ze3Var;
        String str;
        ee3Var.getClass();
        type.getClass();
        j97Var.getClass();
        Integer num = null;
        if (ee3Var instanceof ze3) {
            ze3Var = ee3Var.b();
        } else {
            ze3Var = null;
        }
        if (ze3Var != null) {
            aw3 aw3Var = ze3Var.A;
            ee3 ee3Var2 = (ee3) aw3Var.get("type");
            if (ee3Var2 != null) {
                str = ee3Var2.c();
            } else {
                str = null;
            }
            if (str == null || qs6.v0(str)) {
                if (aw3Var.containsKey("keyCode")) {
                    str = "key";
                } else if (!aw3Var.containsKey("axisCode")) {
                    str = "none";
                } else {
                    str = "axis";
                }
            }
            int hashCode = str.hashCode();
            if (hashCode != 106079) {
                if (hashCode != 3008417) {
                    if (hashCode == 3387192 && str.equals("none")) {
                        return k63.b.d.INSTANCE;
                    }
                } else if (str.equals("axis")) {
                    ee3 ee3Var3 = (ee3) aw3Var.get("deviceId");
                    if (ee3Var3 != null && !(ee3Var3 instanceof ve3)) {
                        num = Integer.valueOf(ee3Var3.a());
                    }
                    int a = c(ze3Var, "axisCode").a();
                    Object d = j97Var.d(c(ze3Var, "direction"), d63.class);
                    d.getClass();
                    return new k63.b.a(num, a, (d63) d);
                }
            } else if (str.equals("key")) {
                ee3 ee3Var4 = (ee3) aw3Var.get("deviceId");
                if (ee3Var4 != null && !(ee3Var4 instanceof ve3)) {
                    num = Integer.valueOf(ee3Var4.a());
                }
                return new k63.b.c(c(ze3Var, "keyCode").a(), num);
            }
            throw new RuntimeException("Unknown input assignment type");
        }
        throw new RuntimeException("Input assignment must be an object");
    }

    @Override // defpackage.if3
    public final ee3 b(Object obj, Type type, j97 j97Var) {
        k63.b bVar = (k63.b) obj;
        bVar.getClass();
        type.getClass();
        j97Var.getClass();
        ze3 ze3Var = new ze3();
        if (bVar instanceof k63.b.d) {
            ze3Var.d("type", new ef3("none"));
            return ze3Var;
        }
        boolean z = bVar instanceof k63.b.c;
        ee3 ee3Var = ve3.A;
        if (z) {
            ze3Var.d("type", new ef3("key"));
            k63.b.c cVar = (k63.b.c) bVar;
            Integer num = cVar.a;
            if (num == null) {
                ze3Var.d("deviceId", ee3Var);
            } else {
                ze3Var.d("deviceId", new ef3(num));
            }
            ze3Var.d("keyCode", new ef3(Integer.valueOf(cVar.b)));
            return ze3Var;
        } else if (bVar instanceof k63.b.a) {
            ze3Var.d("type", new ef3("axis"));
            k63.b.a aVar = (k63.b.a) bVar;
            Integer num2 = aVar.a;
            if (num2 == null) {
                ze3Var.d("deviceId", ee3Var);
            } else {
                ze3Var.d("deviceId", new ef3(num2));
            }
            ze3Var.d("axisCode", new ef3(Integer.valueOf(aVar.b)));
            d63 d63Var = aVar.c;
            su2 su2Var = ((yb7) j97Var.B).c;
            if (d63Var == null) {
                su2Var.getClass();
            } else {
                su2Var.getClass();
                tf3 tf3Var = new tf3();
                su2Var.g(d63Var, d63.class, tf3Var);
                ArrayList arrayList = tf3Var.k0;
                if (arrayList.isEmpty()) {
                    ee3Var = tf3Var.m0;
                } else {
                    e41.y(arrayList, "Expected one JSON element but was ");
                    return null;
                }
            }
            ze3Var.d("direction", ee3Var);
            return ze3Var;
        } else {
            i.d();
            return null;
        }
    }
}
