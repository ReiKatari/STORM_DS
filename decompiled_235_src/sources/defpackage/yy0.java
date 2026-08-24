package defpackage;

import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy0  reason: default package */
/* loaded from: classes.dex */
public interface yy0 {
    static void r(da4 da4Var, yy0 yy0Var, yy0 yy0Var2, xx xxVar) {
        if (Objects.equals(xxVar, n23.w)) {
            el5 el5Var = (el5) yy0Var2.b(xxVar, null);
            el5 el5Var2 = (el5) yy0Var.b(xxVar, null);
            xy0 j = yy0Var2.j(xxVar);
            if (el5Var == null) {
                el5Var = el5Var2;
            } else if (el5Var2 != null) {
                cs1 cs1Var = el5Var2.a;
                fl5 fl5Var = el5Var2.b;
                cs1 cs1Var2 = el5Var.a;
                if (cs1Var2 != null) {
                    cs1Var = cs1Var2;
                }
                fl5 fl5Var2 = el5Var.b;
                if (fl5Var2 != null) {
                    fl5Var = fl5Var2;
                }
                el5Var = new el5(cs1Var, fl5Var);
            }
            da4Var.l(xxVar, j, el5Var);
            return;
        }
        da4Var.l(xxVar, yy0Var2.j(xxVar), yy0Var2.e(xxVar));
    }

    static go4 t(yy0 yy0Var, yy0 yy0Var2) {
        da4 d;
        if (yy0Var == null && yy0Var2 == null) {
            return go4.L;
        }
        if (yy0Var2 != null) {
            d = da4.k(yy0Var2);
        } else {
            d = da4.d();
        }
        if (yy0Var != null) {
            for (xx xxVar : yy0Var.c()) {
                r(d, yy0Var2, yy0Var, xxVar);
            }
        }
        return go4.a(d);
    }

    Object b(xx xxVar, Object obj);

    Set c();

    Object e(xx xxVar);

    Set f(xx xxVar);

    Object g(xx xxVar, xy0 xy0Var);

    void h(pk0 pk0Var);

    boolean i(xx xxVar);

    xy0 j(xx xxVar);
}
