package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om6  reason: default package */
/* loaded from: classes.dex */
public final class om6 implements eq6, Map, cg3 {
    public nm6 A;
    public final cm6 B;
    public final cm6 L;
    public final cm6 R;

    public om6() {
        yv4 yv4Var = yv4.L;
        vl6 j = bm6.j();
        nm6 nm6Var = new nm6(j.g(), yv4Var);
        if (!(j instanceof os2)) {
            nm6Var.b = new nm6(1L, yv4Var);
        }
        this.A = nm6Var;
        this.B = new cm6(this, 0);
        this.L = new cm6(this, 1);
        this.R = new cm6(this, 2);
    }

    public static final boolean c(om6 om6Var, nm6 nm6Var, int i, yv4 yv4Var) {
        boolean z;
        synchronized (ak7.g) {
            int i2 = nm6Var.d;
            if (i2 == i) {
                nm6Var.c = yv4Var;
                z = true;
                nm6Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.eq6
    public final hq6 a() {
        return this.A;
    }

    @Override // java.util.Map
    public final void clear() {
        vl6 j;
        nm6 nm6Var = this.A;
        nm6Var.getClass();
        yv4 yv4Var = yv4.L;
        if (yv4Var != ((nm6) bm6.h(nm6Var)).c) {
            nm6 nm6Var2 = this.A;
            nm6Var2.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                nm6 nm6Var3 = (nm6) bm6.w(nm6Var2, this, j);
                synchronized (ak7.g) {
                    nm6Var3.c = yv4Var;
                    nm6Var3.d++;
                }
            }
            bm6.n(j, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return d().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return d().c.containsValue(obj);
    }

    public final nm6 d() {
        nm6 nm6Var = this.A;
        nm6Var.getClass();
        return (nm6) bm6.t(nm6Var, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.B;
    }

    @Override // defpackage.eq6
    public final void f(hq6 hq6Var) {
        hq6Var.getClass();
        this.A = (nm6) hq6Var;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return d().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return d().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.L;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        yv4 yv4Var;
        int i;
        Object put;
        vl6 j;
        boolean c;
        do {
            synchronized (ak7.g) {
                nm6 nm6Var = this.A;
                nm6Var.getClass();
                nm6 nm6Var2 = (nm6) bm6.h(nm6Var);
                yv4Var = nm6Var2.c;
                i = nm6Var2.d;
            }
            yv4Var.getClass();
            aw4 b = yv4Var.b();
            put = b.put(obj, obj2);
            yv4 b2 = b.b();
            if (nb3.k(b2, yv4Var)) {
                break;
            }
            nm6 nm6Var3 = this.A;
            nm6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                c = c(this, (nm6) bm6.w(nm6Var3, this, j), i, b2);
            }
            bm6.n(j, this);
        } while (!c);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        yv4 yv4Var;
        int i;
        vl6 j;
        boolean c;
        do {
            synchronized (ak7.g) {
                nm6 nm6Var = this.A;
                nm6Var.getClass();
                nm6 nm6Var2 = (nm6) bm6.h(nm6Var);
                yv4Var = nm6Var2.c;
                i = nm6Var2.d;
            }
            yv4Var.getClass();
            aw4 b = yv4Var.b();
            b.putAll(map);
            yv4 b2 = b.b();
            if (!nb3.k(b2, yv4Var)) {
                nm6 nm6Var3 = this.A;
                nm6Var3.getClass();
                synchronized (bm6.c) {
                    j = bm6.j();
                    c = c(this, (nm6) bm6.w(nm6Var3, this, j), i, b2);
                }
                bm6.n(j, this);
            } else {
                return;
            }
        } while (!c);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        yv4 yv4Var;
        int i;
        V remove;
        vl6 j;
        boolean c;
        do {
            synchronized (ak7.g) {
                nm6 nm6Var = this.A;
                nm6Var.getClass();
                nm6 nm6Var2 = (nm6) bm6.h(nm6Var);
                yv4Var = nm6Var2.c;
                i = nm6Var2.d;
            }
            yv4Var.getClass();
            aw4 b = yv4Var.b();
            remove = b.remove(obj);
            yv4 b2 = b.b();
            if (nb3.k(b2, yv4Var)) {
                break;
            }
            nm6 nm6Var3 = this.A;
            nm6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                c = c(this, (nm6) bm6.w(nm6Var3, this, j), i, b2);
            }
            bm6.n(j, this);
        } while (!c);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        yv4 yv4Var = d().c;
        yv4Var.getClass();
        return yv4Var.B;
    }

    public final String toString() {
        nm6 nm6Var = this.A;
        nm6Var.getClass();
        return "SnapshotStateMap(value=" + ((nm6) bm6.h(nm6Var)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.R;
    }
}
