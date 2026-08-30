package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r73  reason: default package */
/* loaded from: classes.dex */
public class r73 extends dz6 {
    public static final r73 a = new r73();

    private r73() {
    }

    public static l73 d(o83 o83Var) {
        String str;
        boolean z;
        if (o83Var instanceof y83) {
            y83 y83Var = (y83) o83Var;
            q83 n0 = y83Var.n0();
            if (n0 != q83.NAME && n0 != q83.END_ARRAY && n0 != q83.END_OBJECT && n0 != q83.END_DOCUMENT) {
                l73 l73Var = (l73) y83Var.C0();
                y83Var.u0();
                return l73Var;
            }
            f81.h(n0, " when reading a JsonElement.", "Unexpected ");
            return null;
        }
        q83 n02 = o83Var.n0();
        l73 f = f(o83Var, n02);
        if (f == null) {
            return e(o83Var, n02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (o83Var.J()) {
                if (f instanceof g83) {
                    str = o83Var.Z();
                } else {
                    str = null;
                }
                q83 n03 = o83Var.n0();
                l73 f2 = f(o83Var, n03);
                if (f2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (f2 == null) {
                    f2 = e(o83Var, n03);
                }
                if (f instanceof z63) {
                    ((z63) f).A.add(f2);
                } else {
                    ((g83) f).i(str, f2);
                }
                if (z) {
                    arrayDeque.addLast(f);
                    f = f2;
                }
            } else {
                if (f instanceof z63) {
                    o83Var.x();
                } else {
                    o83Var.B();
                }
                if (arrayDeque.isEmpty()) {
                    return f;
                }
                f = (l73) arrayDeque.removeLast();
            }
        }
    }

    public static l73 e(o83 o83Var, q83 q83Var) {
        int i = q73.a[q83Var.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        o83Var.j0();
                        return c83.A;
                    }
                    f81.z(q83Var, "Unexpected token: ");
                    return null;
                }
                return new l83(Boolean.valueOf(o83Var.Q()));
            }
            return new l83(new fh3(o83Var.l0()));
        }
        return new l83(o83Var.l0());
    }

    public static l73 f(o83 o83Var, q83 q83Var) {
        int i = q73.a[q83Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            o83Var.i();
            return new g83();
        }
        o83Var.d();
        return new z63();
    }

    public static void g(b93 b93Var, l73 l73Var) {
        boolean parseBoolean;
        if (l73Var != null && !(l73Var instanceof c83)) {
            if (l73Var instanceof l83) {
                l83 l83Var = (l83) l73Var;
                Serializable serializable = l83Var.A;
                if (serializable instanceof Number) {
                    b93Var.V(l83Var.k());
                    return;
                } else if (serializable instanceof Boolean) {
                    if (serializable instanceof Boolean) {
                        parseBoolean = ((Boolean) serializable).booleanValue();
                    } else {
                        parseBoolean = Boolean.parseBoolean(l83Var.d());
                    }
                    b93Var.f0(parseBoolean);
                    return;
                } else {
                    b93Var.Z(l83Var.d());
                    return;
                }
            }
            boolean z = l73Var instanceof z63;
            if (z) {
                b93Var.i();
                if (z) {
                    ArrayList arrayList = ((z63) l73Var).A;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        g(b93Var, (l73) obj);
                    }
                    b93Var.x();
                    return;
                }
                f81.z(l73Var, "Not a JSON Array: ");
                return;
            } else if (l73Var instanceof g83) {
                b93Var.p();
                Iterator it = ((wo3) l73Var.c().A.entrySet()).iterator();
                while (((vo3) it).hasNext()) {
                    xo3 b = ((vo3) it).b();
                    b93Var.C((String) b.getKey());
                    g(b93Var, (l73) b.getValue());
                }
                b93Var.B();
                return;
            } else {
                f81.i(l73Var.getClass(), "Couldn't write ");
                return;
            }
        }
        b93Var.F();
    }

    @Override // defpackage.dz6
    public final /* bridge */ /* synthetic */ Object b(o83 o83Var) {
        return d(o83Var);
    }

    @Override // defpackage.dz6
    public final /* bridge */ /* synthetic */ void c(b93 b93Var, Object obj) {
        g(b93Var, (l73) obj);
    }
}
