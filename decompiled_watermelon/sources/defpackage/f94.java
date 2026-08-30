package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f94  reason: default package */
/* loaded from: classes.dex */
public final class f94 extends dz6 {
    public static final s84 c = new s84(1, wt6.DOUBLE);
    public final qo2 a;
    public final xt6 b;

    public f94(qo2 qo2Var, xt6 xt6Var) {
        this.a = qo2Var;
        this.b = xt6Var;
    }

    public static Serializable e(o83 o83Var, q83 q83Var) {
        int i = e94.a[q83Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            o83Var.i();
            return new yo3(true);
        }
        o83Var.d();
        return new ArrayList();
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        String str;
        boolean z;
        q83 n0 = o83Var.n0();
        Object e = e(o83Var, n0);
        if (e == null) {
            return d(o83Var, n0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (o83Var.J()) {
                if (e instanceof Map) {
                    str = o83Var.Z();
                } else {
                    str = null;
                }
                q83 n02 = o83Var.n0();
                Serializable e2 = e(o83Var, n02);
                if (e2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (e2 == null) {
                    e2 = d(o83Var, n02);
                }
                if (e instanceof List) {
                    ((List) e).add(e2);
                } else {
                    ((Map) e).put(str, e2);
                }
                if (z) {
                    arrayDeque.addLast(e);
                    e = e2;
                }
            } else {
                if (e instanceof List) {
                    o83Var.x();
                } else {
                    o83Var.B();
                }
                if (arrayDeque.isEmpty()) {
                    return e;
                }
                e = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        if (obj == null) {
            b93Var.F();
            return;
        }
        Class<?> cls = obj.getClass();
        qo2 qo2Var = this.a;
        qo2Var.getClass();
        dz6 d = qo2Var.d(new n07(cls));
        if (d instanceof f94) {
            b93Var.p();
            b93Var.B();
            return;
        }
        d.c(b93Var, obj);
    }

    public final Serializable d(o83 o83Var, q83 q83Var) {
        int i = e94.a[q83Var.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        o83Var.j0();
                        return null;
                    }
                    f81.z(q83Var, "Unexpected token: ");
                    return null;
                }
                return Boolean.valueOf(o83Var.Q());
            }
            return this.b.readNumber(o83Var);
        }
        return o83Var.l0();
    }
}
