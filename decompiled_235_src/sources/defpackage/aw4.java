package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aw4  reason: default package */
/* loaded from: classes.dex */
public class aw4 extends AbstractMap implements Map, cg3 {
    public yv4 A;
    public jd1 B = new jd1(15);
    public ac7 L;
    public Object R;
    public int X;
    public int Y;

    public aw4(yv4 yv4Var) {
        this.A = yv4Var;
        this.L = yv4Var.A;
        this.Y = yv4Var.B;
    }

    public yv4 a() {
        ac7 ac7Var = this.L;
        yv4 yv4Var = this.A;
        if (ac7Var != yv4Var.A) {
            this.B = new jd1(15);
            yv4Var = new yv4(this.L, this.Y);
        }
        this.A = yv4Var;
        return yv4Var;
    }

    public /* bridge */ yv4 b() {
        return a();
    }

    public final void c(int i) {
        this.Y = i;
        this.X++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.L = ac7.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i;
        ac7 ac7Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ac7Var.d(obj, i, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new cw4(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i;
        ac7 ac7Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return ac7Var.g(obj, i, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new cw4(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        this.R = null;
        ac7 ac7Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        this.L = ac7Var.l(i, obj, obj2, 0, this);
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [oh1, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        yv4 yv4Var;
        aw4 aw4Var;
        yv4 yv4Var2 = null;
        if (map instanceof yv4) {
            yv4Var = (yv4) map;
        } else {
            yv4Var = null;
        }
        if (yv4Var == null) {
            if (map instanceof aw4) {
                aw4Var = (aw4) map;
            } else {
                aw4Var = null;
            }
            if (aw4Var != null) {
                yv4Var2 = aw4Var.a();
            }
        } else {
            yv4Var2 = yv4Var;
        }
        if (yv4Var2 != null) {
            ?? obj = new Object();
            obj.a = 0;
            int i = this.Y;
            ac7 ac7Var = this.L;
            ac7 ac7Var2 = yv4Var2.A;
            ac7Var2.getClass();
            this.L = ac7Var.m(ac7Var2, 0, obj, this);
            int i2 = (yv4Var2.B + i) - obj.a;
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
        ac7 ac7Var = this.L;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        ac7 o = ac7Var.o(i, obj, obj2, 0, this);
        if (o == null) {
            o = ac7.e;
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
        return new r04(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.R = null;
        ac7 n = this.L.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = ac7.e;
        }
        this.L = n;
        return this.R;
    }
}
