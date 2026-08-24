package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm6  reason: default package */
/* loaded from: classes.dex */
public final class cm6 implements Set, dg3 {
    public final om6 A;
    public final /* synthetic */ int B;

    public cm6(om6 om6Var, int i) {
        this.B = i;
        this.A = om6Var;
    }

    private final boolean a(Collection collection) {
        yv4 yv4Var;
        int i;
        vl6 j;
        boolean c;
        Set p1 = gt0.p1(collection);
        om6 om6Var = this.A;
        boolean z = false;
        do {
            synchronized (ak7.g) {
                nm6 nm6Var = om6Var.A;
                nm6Var.getClass();
                nm6 nm6Var2 = (nm6) bm6.h(nm6Var);
                yv4Var = nm6Var2.c;
                i = nm6Var2.d;
            }
            yv4Var.getClass();
            aw4 b = yv4Var.b();
            Iterator it = om6Var.B.iterator();
            while (((u0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((dq6) it).next();
                if (!p1.contains(entry.getKey())) {
                    b.remove(entry.getKey());
                    z = true;
                }
            }
            yv4 b2 = b.b();
            if (nb3.k(b2, yv4Var)) {
                break;
            }
            nm6 nm6Var3 = om6Var.A;
            nm6Var3.getClass();
            synchronized (bm6.c) {
                j = bm6.j();
                c = om6.c(om6Var, (nm6) bm6.w(nm6Var3, om6Var, j), i, b2);
            }
            bm6.n(j, om6Var);
        } while (!c);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.B) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ak7.K0();
                throw null;
            case 1:
                ak7.K0();
                throw null;
            default:
                ak7.K0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.B) {
            case 0:
                ak7.K0();
                throw null;
            case 1:
                ak7.K0();
                throw null;
            default:
                ak7.K0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.B;
        om6 om6Var = this.A;
        switch (i) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof zf3) || (obj instanceof bg3))) {
                    Map.Entry entry = (Map.Entry) obj;
                    return nb3.k(om6Var.get(entry.getKey()), entry.getValue());
                }
                return false;
            case 1:
                return om6Var.containsKey(obj);
            default:
                return om6Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.B;
        om6 om6Var = this.A;
        switch (i) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!contains(entry)) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection<Object> collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    for (Object obj : collection3) {
                        if (!om6Var.containsKey(obj)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection<Object> collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    for (Object obj2 : collection4) {
                        if (!om6Var.containsValue(obj2)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.B;
        om6 om6Var = this.A;
        switch (i) {
            case 0:
                return new dq6(om6Var, ((s33) om6Var.d().c.entrySet()).iterator(), 0);
            case 1:
                return new dq6(om6Var, ((s33) om6Var.d().c.entrySet()).iterator(), 1);
            default:
                return new dq6(om6Var, ((s33) om6Var.d().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        int i = this.B;
        om6 om6Var = this.A;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (((obj instanceof zf3) && !(obj instanceof bg3)) || om6Var.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (om6Var.remove(obj) == null) {
                    return false;
                }
                return true;
            default:
                Iterator it = om6Var.B.iterator();
                while (true) {
                    if (((u0) it).hasNext()) {
                        obj2 = ((dq6) it).next();
                        if (nb3.k(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                om6Var.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        yv4 yv4Var;
        int i;
        vl6 j;
        boolean c;
        boolean z = false;
        switch (this.B) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.A.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
            case 1:
                while (true) {
                    boolean z3 = false;
                    for (Object obj : collection) {
                        if (this.A.remove(obj) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set p1 = gt0.p1(collection);
                om6 om6Var = this.A;
                do {
                    synchronized (ak7.g) {
                        nm6 nm6Var = om6Var.A;
                        nm6Var.getClass();
                        nm6 nm6Var2 = (nm6) bm6.h(nm6Var);
                        yv4Var = nm6Var2.c;
                        i = nm6Var2.d;
                    }
                    yv4Var.getClass();
                    aw4 b = yv4Var.b();
                    Iterator it2 = om6Var.B.iterator();
                    while (((u0) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((dq6) it2).next();
                        if (p1.contains(entry.getValue())) {
                            b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    yv4 b2 = b.b();
                    if (!nb3.k(b2, yv4Var)) {
                        nm6 nm6Var3 = om6Var.A;
                        nm6Var3.getClass();
                        synchronized (bm6.c) {
                            j = bm6.j();
                            c = om6.c(om6Var, (nm6) bm6.w(nm6Var3, om6Var, j), i, b2);
                        }
                        bm6.n(j, om6Var);
                    }
                    return z;
                } while (!c);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        yv4 yv4Var;
        int i;
        vl6 j;
        boolean c;
        yv4 yv4Var2;
        int i2;
        vl6 j2;
        boolean c2;
        boolean z = false;
        switch (this.B) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int k0 = c14.k0(ht0.v0(collection2, 10));
                if (k0 < 16) {
                    k0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                om6 om6Var = this.A;
                do {
                    synchronized (ak7.g) {
                        nm6 nm6Var = om6Var.A;
                        nm6Var.getClass();
                        nm6 nm6Var2 = (nm6) bm6.h(nm6Var);
                        yv4Var = nm6Var2.c;
                        i = nm6Var2.d;
                    }
                    yv4Var.getClass();
                    aw4 b = yv4Var.b();
                    Iterator it = om6Var.B.iterator();
                    while (((u0) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((dq6) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !nb3.k(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    yv4 b2 = b.b();
                    if (!nb3.k(b2, yv4Var)) {
                        nm6 nm6Var3 = om6Var.A;
                        nm6Var3.getClass();
                        synchronized (bm6.c) {
                            j = bm6.j();
                            c = om6.c(om6Var, (nm6) bm6.w(nm6Var3, om6Var, j), i, b2);
                        }
                        bm6.n(j, om6Var);
                    }
                    return z;
                } while (!c);
                return z;
            case 1:
                return a(collection);
            default:
                Set p1 = gt0.p1(collection);
                om6 om6Var2 = this.A;
                do {
                    synchronized (ak7.g) {
                        nm6 nm6Var4 = om6Var2.A;
                        nm6Var4.getClass();
                        nm6 nm6Var5 = (nm6) bm6.h(nm6Var4);
                        yv4Var2 = nm6Var5.c;
                        i2 = nm6Var5.d;
                    }
                    yv4Var2.getClass();
                    aw4 b3 = yv4Var2.b();
                    Iterator it2 = om6Var2.B.iterator();
                    while (((u0) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((dq6) it2).next();
                        if (!p1.contains(entry3.getValue())) {
                            b3.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    yv4 b4 = b3.b();
                    if (!nb3.k(b4, yv4Var2)) {
                        nm6 nm6Var6 = om6Var2.A;
                        nm6Var6.getClass();
                        synchronized (bm6.c) {
                            j2 = bm6.j();
                            c2 = om6.c(om6Var2, (nm6) bm6.w(nm6Var6, om6Var2, j2), i2, b4);
                        }
                        bm6.n(j2, om6Var2);
                    }
                    return z;
                } while (!c2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return nb3.b0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nb3.c0(this, objArr);
    }
}
