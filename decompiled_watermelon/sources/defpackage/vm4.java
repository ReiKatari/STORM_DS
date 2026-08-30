package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vm4  reason: default package */
/* loaded from: classes.dex */
public class vm4 extends AbstractMap implements Map, i93 {
    public tm4 A;
    public hm1 B = new Object();
    public fy6 L;
    public Object R;
    public int X;
    public int Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hm1] */
    public vm4(tm4 tm4Var) {
        this.A = tm4Var;
        this.L = tm4Var.A;
        this.Y = tm4Var.B;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hm1] */
    public tm4 a() {
        fy6 fy6Var = this.L;
        tm4 tm4Var = this.A;
        if (fy6Var != tm4Var.A) {
            this.B = new Object();
            tm4Var = new tm4(this.L, this.Y);
        }
        this.A = tm4Var;
        return tm4Var;
    }

    public /* bridge */ tm4 b() {
        return a();
    }

    public final void c(int i) {
        this.Y = i;
        this.X++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.L = fy6.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        fy6 fy6Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return fy6Var.d(i, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new xm4(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        fy6 fy6Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return fy6Var.g(i, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new xm4(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.R = null;
        fy6 fy6Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.L = fy6Var.l(i, obj, obj2, 0, this);
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, md1] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        tm4 tm4Var;
        vm4 vm4Var;
        tm4 tm4Var2 = null;
        if (map instanceof tm4) {
            tm4Var = (tm4) map;
        } else {
            tm4Var = null;
        }
        if (tm4Var == null) {
            if (map instanceof vm4) {
                vm4Var = (vm4) map;
            } else {
                vm4Var = null;
            }
            if (vm4Var != null) {
                tm4Var2 = vm4Var.a();
            }
        } else {
            tm4Var2 = tm4Var;
        }
        if (tm4Var2 != null) {
            ?? obj = new Object();
            obj.a = 0;
            int i = this.Y;
            fy6 fy6Var = this.L;
            fy6 fy6Var2 = tm4Var2.A;
            fy6Var2.getClass();
            this.L = fy6Var.m(fy6Var2, 0, obj, this);
            int i2 = (tm4Var2.B + i) - obj.a;
            if (i != i2) {
                c(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i;
        int i2 = this.Y;
        fy6 fy6Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        fy6 o = fy6Var.o(i, obj, obj2, 0, this);
        if (o == null) {
            o = fy6.e;
        }
        this.L = o;
        if (i2 == this.Y) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new ot3(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.R = null;
        fy6 n = this.L.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = fy6.e;
        }
        this.L = n;
        return this.R;
    }
}
