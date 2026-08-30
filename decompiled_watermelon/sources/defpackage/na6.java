package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: na6  reason: default package */
/* loaded from: classes.dex */
public final class na6 implements Set, j93 {
    public final za6 A;
    public final /* synthetic */ int B;

    public na6(za6 za6Var, int i) {
        this.B = i;
        this.A = za6Var;
    }

    private final boolean b(Collection collection) {
        tm4 tm4Var;
        int i;
        ga6 j;
        boolean a;
        Set s1 = tq0.s1(collection);
        za6 za6Var = this.A;
        boolean z = false;
        do {
            synchronized (ct3.j0) {
                ya6 ya6Var = za6Var.A;
                ya6Var.getClass();
                ya6 ya6Var2 = (ya6) ma6.h(ya6Var);
                tm4Var = ya6Var2.c;
                i = ya6Var2.d;
            }
            tm4Var.getClass();
            vm4 b = tm4Var.b();
            Iterator it = za6Var.B.iterator();
            while (((t0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((oe6) it).next();
                if (!s1.contains(entry.getKey())) {
                    b.remove(entry.getKey());
                    z = true;
                }
            }
            tm4 b2 = b.b();
            if (b53.x(b2, tm4Var)) {
                break;
            }
            ya6 ya6Var3 = za6Var.A;
            ya6Var3.getClass();
            synchronized (ma6.c) {
                j = ma6.j();
                a = za6.a(za6Var, (ya6) ma6.w(ya6Var3, za6Var, j), i, b2);
            }
            ma6.n(j, za6Var);
        } while (!a);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.B) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ct3.X0();
                throw null;
            case 1:
                ct3.X0();
                throw null;
            default:
                ct3.X0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.B) {
            case 0:
                ct3.X0();
                throw null;
            case 1:
                ct3.X0();
                throw null;
            default:
                ct3.X0();
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
        za6 za6Var = this.A;
        switch (i) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof f93) || (obj instanceof h93))) {
                    Map.Entry entry = (Map.Entry) obj;
                    return b53.x(za6Var.get(entry.getKey()), entry.getValue());
                }
                return false;
            case 1:
                return za6Var.containsKey(obj);
            default:
                return za6Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.B;
        za6 za6Var = this.A;
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
                        if (!za6Var.containsKey(obj)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection<Object> collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    for (Object obj2 : collection4) {
                        if (!za6Var.containsValue(obj2)) {
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
        za6 za6Var = this.A;
        switch (i) {
            case 0:
                return new oe6(za6Var, ((ox2) za6Var.e().c.entrySet()).iterator(), 0);
            case 1:
                return new oe6(za6Var, ((ox2) za6Var.e().c.entrySet()).iterator(), 1);
            default:
                return new oe6(za6Var, ((ox2) za6Var.e().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        int i = this.B;
        za6 za6Var = this.A;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (((obj instanceof f93) && !(obj instanceof h93)) || za6Var.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (za6Var.remove(obj) == null) {
                    return false;
                }
                return true;
            default:
                Iterator it = za6Var.B.iterator();
                while (true) {
                    if (((t0) it).hasNext()) {
                        obj2 = ((oe6) it).next();
                        if (b53.x(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                za6Var.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        tm4 tm4Var;
        int i;
        ga6 j;
        boolean a;
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
                Set s1 = tq0.s1(collection);
                za6 za6Var = this.A;
                do {
                    synchronized (ct3.j0) {
                        ya6 ya6Var = za6Var.A;
                        ya6Var.getClass();
                        ya6 ya6Var2 = (ya6) ma6.h(ya6Var);
                        tm4Var = ya6Var2.c;
                        i = ya6Var2.d;
                    }
                    tm4Var.getClass();
                    vm4 b = tm4Var.b();
                    Iterator it2 = za6Var.B.iterator();
                    while (((t0) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((oe6) it2).next();
                        if (s1.contains(entry.getValue())) {
                            b.remove(entry.getKey());
                            z = true;
                        }
                    }
                    tm4 b2 = b.b();
                    if (!b53.x(b2, tm4Var)) {
                        ya6 ya6Var3 = za6Var.A;
                        ya6Var3.getClass();
                        synchronized (ma6.c) {
                            j = ma6.j();
                            a = za6.a(za6Var, (ya6) ma6.w(ya6Var3, za6Var, j), i, b2);
                        }
                        ma6.n(j, za6Var);
                    }
                    return z;
                } while (!a);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        tm4 tm4Var;
        int i;
        ga6 j;
        boolean a;
        tm4 tm4Var2;
        int i2;
        ga6 j2;
        boolean a2;
        boolean z = false;
        switch (this.B) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int j0 = zt3.j0(uq0.y0(collection2, 10));
                if (j0 < 16) {
                    j0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                za6 za6Var = this.A;
                do {
                    synchronized (ct3.j0) {
                        ya6 ya6Var = za6Var.A;
                        ya6Var.getClass();
                        ya6 ya6Var2 = (ya6) ma6.h(ya6Var);
                        tm4Var = ya6Var2.c;
                        i = ya6Var2.d;
                    }
                    tm4Var.getClass();
                    vm4 b = tm4Var.b();
                    Iterator it = za6Var.B.iterator();
                    while (((t0) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((oe6) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !b53.x(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    tm4 b2 = b.b();
                    if (!b53.x(b2, tm4Var)) {
                        ya6 ya6Var3 = za6Var.A;
                        ya6Var3.getClass();
                        synchronized (ma6.c) {
                            j = ma6.j();
                            a = za6.a(za6Var, (ya6) ma6.w(ya6Var3, za6Var, j), i, b2);
                        }
                        ma6.n(j, za6Var);
                    }
                    return z;
                } while (!a);
                return z;
            case 1:
                return b(collection);
            default:
                Set s1 = tq0.s1(collection);
                za6 za6Var2 = this.A;
                do {
                    synchronized (ct3.j0) {
                        ya6 ya6Var4 = za6Var2.A;
                        ya6Var4.getClass();
                        ya6 ya6Var5 = (ya6) ma6.h(ya6Var4);
                        tm4Var2 = ya6Var5.c;
                        i2 = ya6Var5.d;
                    }
                    tm4Var2.getClass();
                    vm4 b3 = tm4Var2.b();
                    Iterator it2 = za6Var2.B.iterator();
                    while (((t0) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((oe6) it2).next();
                        if (!s1.contains(entry3.getValue())) {
                            b3.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    tm4 b4 = b3.b();
                    if (!b53.x(b4, tm4Var2)) {
                        ya6 ya6Var6 = za6Var2.A;
                        ya6Var6.getClass();
                        synchronized (ma6.c) {
                            j2 = ma6.j();
                            a2 = za6.a(za6Var2, (ya6) ma6.w(ya6Var6, za6Var2, j2), i2, b4);
                        }
                        ma6.n(j2, za6Var2);
                    }
                    return z;
                } while (!a2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return b53.i0(this, objArr);
    }
}
