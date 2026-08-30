package z2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements Set, oc.e {
    public final s A;
    public final /* synthetic */ int B;

    public m(s sVar, int i2) {
        this.B = i2;
        this.A = sVar;
    }

    private final boolean a(Collection collection) {
        s2.b bVar;
        int i2;
        f j2;
        boolean d4;
        Set s02 = zb.l.s0(collection);
        s sVar = this.A;
        boolean z10 = false;
        do {
            synchronized (q.f14930b) {
                r rVar = sVar.A;
                rVar.getClass();
                r rVar2 = (r) l.h(rVar);
                bVar = rVar2.f14931c;
                i2 = rVar2.f14932d;
            }
            bVar.getClass();
            s2.d b10 = bVar.b();
            Iterator it = sVar.B.iterator();
            while (((x) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((x) it).next();
                if (!s02.contains(entry.getKey())) {
                    b10.remove(entry.getKey());
                    z10 = true;
                }
            }
            s2.b b11 = b10.b();
            if (nc.k.a(b11, bVar)) {
                break;
            }
            r rVar3 = sVar.A;
            rVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                d4 = s.d(sVar, (r) l.w(rVar3, sVar, j2), i2, b11);
            }
            l.n(j2, sVar);
        } while (!d4);
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.B) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                q.l();
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                q.l();
                throw null;
            default:
                q.l();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.B) {
            case 0:
                q.l();
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                q.l();
                throw null;
            default:
                q.l();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.B) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof oc.a) || (obj instanceof oc.c))) {
                    Map.Entry entry = (Map.Entry) obj;
                    return nc.k.a(this.A.get(entry.getKey()), entry.getValue());
                }
                return false;
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.A.containsKey(obj);
            default:
                return this.A.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.B) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection2) {
                    if (!contains(entry)) {
                        return false;
                    }
                }
                return true;
            case DSiCameraSource.FrontCamera /* 1 */:
                Collection<Object> collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    for (Object obj : collection3) {
                        if (!this.A.containsKey(obj)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection<Object> collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    for (Object obj2 : collection4) {
                        if (!this.A.containsValue(obj2)) {
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
        switch (this.B) {
            case 0:
                s sVar = this.A;
                return new x(sVar, ((q2.b) sVar.e().f14931c.entrySet()).iterator(), 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                s sVar2 = this.A;
                return new x(sVar2, ((q2.b) sVar2.e().f14931c.entrySet()).iterator(), 1);
            default:
                s sVar3 = this.A;
                return new x(sVar3, ((q2.b) sVar3.e().f14931c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.B) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (((obj instanceof oc.a) && !(obj instanceof oc.c)) || this.A.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (this.A.remove(obj) != null) {
                    return true;
                }
                return false;
            default:
                s sVar = this.A;
                Iterator it = sVar.B.iterator();
                while (true) {
                    if (((x) it).hasNext()) {
                        obj2 = ((x) it).next();
                        if (nc.k.a(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    sVar.remove(entry.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        s2.b bVar;
        int i2;
        f j2;
        boolean d4;
        switch (this.B) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it.hasNext()) {
                        if (this.A.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                    break;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                while (true) {
                    boolean z11 = false;
                    for (Object obj : collection) {
                        if (this.A.remove(obj) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                    break;
                }
                break;
            default:
                Set s02 = zb.l.s0(collection);
                s sVar = this.A;
                boolean z12 = false;
                do {
                    synchronized (q.f14930b) {
                        r rVar = sVar.A;
                        rVar.getClass();
                        r rVar2 = (r) l.h(rVar);
                        bVar = rVar2.f14931c;
                        i2 = rVar2.f14932d;
                    }
                    bVar.getClass();
                    s2.d b10 = bVar.b();
                    Iterator it2 = sVar.B.iterator();
                    while (((x) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((x) it2).next();
                        if (s02.contains(entry.getValue())) {
                            b10.remove(entry.getKey());
                            z12 = true;
                        }
                    }
                    s2.b b11 = b10.b();
                    if (!nc.k.a(b11, bVar)) {
                        r rVar3 = sVar.A;
                        rVar3.getClass();
                        synchronized (l.f14919c) {
                            j2 = l.j();
                            d4 = s.d(sVar, (r) l.w(rVar3, sVar, j2), i2, b11);
                        }
                        l.n(j2, sVar);
                    }
                    return z12;
                } while (!d4);
                return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        s2.b bVar;
        int i2;
        f j2;
        boolean d4;
        s2.b bVar2;
        int i10;
        f j10;
        boolean d10;
        switch (this.B) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int E = zb.v.E(zb.m.G(collection2, 10));
                if (E < 16) {
                    E = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(E);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                s sVar = this.A;
                boolean z10 = false;
                do {
                    synchronized (q.f14930b) {
                        r rVar = sVar.A;
                        rVar.getClass();
                        r rVar2 = (r) l.h(rVar);
                        bVar = rVar2.f14931c;
                        i2 = rVar2.f14932d;
                    }
                    bVar.getClass();
                    s2.d b10 = bVar.b();
                    Iterator it = sVar.B.iterator();
                    while (((x) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((x) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !nc.k.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            b10.remove(entry2.getKey());
                            z10 = true;
                        }
                    }
                    s2.b b11 = b10.b();
                    if (!nc.k.a(b11, bVar)) {
                        r rVar3 = sVar.A;
                        rVar3.getClass();
                        synchronized (l.f14919c) {
                            j2 = l.j();
                            d4 = s.d(sVar, (r) l.w(rVar3, sVar, j2), i2, b11);
                        }
                        l.n(j2, sVar);
                    }
                    return z10;
                } while (!d4);
                return z10;
            case DSiCameraSource.FrontCamera /* 1 */:
                return a(collection);
            default:
                Set s02 = zb.l.s0(collection);
                s sVar2 = this.A;
                boolean z11 = false;
                do {
                    synchronized (q.f14930b) {
                        r rVar4 = sVar2.A;
                        rVar4.getClass();
                        r rVar5 = (r) l.h(rVar4);
                        bVar2 = rVar5.f14931c;
                        i10 = rVar5.f14932d;
                    }
                    bVar2.getClass();
                    s2.d b12 = bVar2.b();
                    Iterator it2 = sVar2.B.iterator();
                    while (((x) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((x) it2).next();
                        if (!s02.contains(entry3.getValue())) {
                            b12.remove(entry3.getKey());
                            z11 = true;
                        }
                    }
                    s2.b b13 = b12.b();
                    if (!nc.k.a(b13, bVar2)) {
                        r rVar6 = sVar2.A;
                        rVar6.getClass();
                        synchronized (l.f14919c) {
                            j10 = l.j();
                            d10 = s.d(sVar2, (r) l.w(rVar6, sVar2, j10), i10, b13);
                        }
                        l.n(j10, sVar2);
                    }
                    return z11;
                } while (!d10);
                return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return nc.j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return nc.j.b(this, objArr);
    }
}
