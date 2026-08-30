package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: za6  reason: default package */
/* loaded from: classes.dex */
public final class za6 implements pe6, Map, i93 {
    public ya6 A;
    public final na6 B;
    public final na6 L;
    public final na6 R;

    public za6() {
        tm4 tm4Var = tm4.L;
        ga6 j = ma6.j();
        ya6 ya6Var = new ya6(j.g(), tm4Var);
        if (!(j instanceof jm2)) {
            ya6Var.b = new ya6(1L, tm4Var);
        }
        this.A = ya6Var;
        this.B = new na6(this, 0);
        this.L = new na6(this, 1);
        this.R = new na6(this, 2);
    }

    public static final boolean a(za6 za6Var, ya6 ya6Var, int i, tm4 tm4Var) {
        boolean z;
        synchronized (ct3.j0) {
            int i2 = ya6Var.d;
            if (i2 == i) {
                ya6Var.c = tm4Var;
                z = true;
                ya6Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.pe6
    public final se6 b() {
        return this.A;
    }

    @Override // java.util.Map
    public final void clear() {
        ga6 j;
        ya6 ya6Var = this.A;
        ya6Var.getClass();
        tm4 tm4Var = tm4.L;
        if (tm4Var != ((ya6) ma6.h(ya6Var)).c) {
            ya6 ya6Var2 = this.A;
            ya6Var2.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                ya6 ya6Var3 = (ya6) ma6.w(ya6Var2, this, j);
                synchronized (ct3.j0) {
                    ya6Var3.c = tm4Var;
                    ya6Var3.d++;
                }
            }
            ma6.n(j, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    @Override // defpackage.pe6
    public final void d(se6 se6Var) {
        se6Var.getClass();
        this.A = (ya6) se6Var;
    }

    public final ya6 e() {
        ya6 ya6Var = this.A;
        ya6Var.getClass();
        return (ya6) ma6.t(ya6Var, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.B;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.L;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        tm4 tm4Var;
        int i;
        Object put;
        ga6 j;
        boolean a;
        do {
            synchronized (ct3.j0) {
                ya6 ya6Var = this.A;
                ya6Var.getClass();
                ya6 ya6Var2 = (ya6) ma6.h(ya6Var);
                tm4Var = ya6Var2.c;
                i = ya6Var2.d;
            }
            tm4Var.getClass();
            vm4 b = tm4Var.b();
            put = b.put(obj, obj2);
            tm4 b2 = b.b();
            if (b53.x(b2, tm4Var)) {
                break;
            }
            ya6 ya6Var3 = this.A;
            ya6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                a = a(this, (ya6) ma6.w(ya6Var3, this, j), i, b2);
            }
            ma6.n(j, this);
        } while (!a);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        tm4 tm4Var;
        int i;
        ga6 j;
        boolean a;
        do {
            synchronized (ct3.j0) {
                ya6 ya6Var = this.A;
                ya6Var.getClass();
                ya6 ya6Var2 = (ya6) ma6.h(ya6Var);
                tm4Var = ya6Var2.c;
                i = ya6Var2.d;
            }
            tm4Var.getClass();
            vm4 b = tm4Var.b();
            b.putAll(map);
            tm4 b2 = b.b();
            if (!b53.x(b2, tm4Var)) {
                ya6 ya6Var3 = this.A;
                ya6Var3.getClass();
                synchronized (ma6.c) {
                    j = ma6.j();
                    a = a(this, (ya6) ma6.w(ya6Var3, this, j), i, b2);
                }
                ma6.n(j, this);
            } else {
                return;
            }
        } while (!a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        tm4 tm4Var;
        int i;
        V remove;
        ga6 j;
        boolean a;
        do {
            synchronized (ct3.j0) {
                ya6 ya6Var = this.A;
                ya6Var.getClass();
                ya6 ya6Var2 = (ya6) ma6.h(ya6Var);
                tm4Var = ya6Var2.c;
                i = ya6Var2.d;
            }
            tm4Var.getClass();
            vm4 b = tm4Var.b();
            remove = b.remove(obj);
            tm4 b2 = b.b();
            if (b53.x(b2, tm4Var)) {
                break;
            }
            ya6 ya6Var3 = this.A;
            ya6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                a = a(this, (ya6) ma6.w(ya6Var3, this, j), i, b2);
            }
            ma6.n(j, this);
        } while (!a);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        tm4 tm4Var = e().c;
        tm4Var.getClass();
        return tm4Var.B;
    }

    public final String toString() {
        ya6 ya6Var = this.A;
        ya6Var.getClass();
        return "SnapshotStateMap(value=" + ((ya6) ma6.h(ya6Var)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.R;
    }
}
