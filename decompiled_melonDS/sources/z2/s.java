package z2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements y, Map, oc.d {
    public r A;
    public final m B;
    public final m L;
    public final m R;

    public s() {
        s2.b bVar = s2.b.L;
        f j2 = l.j();
        r rVar = new r(j2.g(), bVar);
        if (!(j2 instanceof a)) {
            rVar.f14883b = new r(1, bVar);
        }
        this.A = rVar;
        this.B = new m(this, 0);
        this.L = new m(this, 1);
        this.R = new m(this, 2);
    }

    public static final boolean d(s sVar, r rVar, int i2, s2.b bVar) {
        boolean z10;
        synchronized (q.f14930b) {
            int i10 = rVar.f14932d;
            if (i10 == i2) {
                rVar.f14931c = bVar;
                z10 = true;
                rVar.f14932d = i10 + 1;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // z2.y
    public final a0 a() {
        return this.A;
    }

    @Override // z2.y
    public final void c(a0 a0Var) {
        a0Var.getClass();
        this.A = (r) a0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        f j2;
        r rVar = this.A;
        rVar.getClass();
        s2.b bVar = s2.b.L;
        if (bVar != ((r) l.h(rVar)).f14931c) {
            r rVar2 = this.A;
            rVar2.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                r rVar3 = (r) l.w(rVar2, this, j2);
                synchronized (q.f14930b) {
                    rVar3.f14931c = bVar;
                    rVar3.f14932d++;
                }
            }
            l.n(j2, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().f14931c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().f14931c.containsValue(obj);
    }

    public final r e() {
        r rVar = this.A;
        rVar.getClass();
        return (r) l.t(rVar, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.B;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().f14931c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().f14931c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.L;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        s2.b bVar;
        int i2;
        Object put;
        f j2;
        boolean d4;
        do {
            synchronized (q.f14930b) {
                r rVar = this.A;
                rVar.getClass();
                r rVar2 = (r) l.h(rVar);
                bVar = rVar2.f14931c;
                i2 = rVar2.f14932d;
            }
            bVar.getClass();
            s2.d b10 = bVar.b();
            put = b10.put(obj, obj2);
            s2.b b11 = b10.b();
            if (nc.k.a(b11, bVar)) {
                break;
            }
            r rVar3 = this.A;
            rVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                d4 = d(this, (r) l.w(rVar3, this, j2), i2, b11);
            }
            l.n(j2, this);
        } while (!d4);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        s2.b bVar;
        int i2;
        f j2;
        boolean d4;
        do {
            synchronized (q.f14930b) {
                r rVar = this.A;
                rVar.getClass();
                r rVar2 = (r) l.h(rVar);
                bVar = rVar2.f14931c;
                i2 = rVar2.f14932d;
            }
            bVar.getClass();
            s2.d b10 = bVar.b();
            b10.putAll(map);
            s2.b b11 = b10.b();
            if (!nc.k.a(b11, bVar)) {
                r rVar3 = this.A;
                rVar3.getClass();
                synchronized (l.f14919c) {
                    j2 = l.j();
                    d4 = d(this, (r) l.w(rVar3, this, j2), i2, b11);
                }
                l.n(j2, this);
            } else {
                return;
            }
        } while (!d4);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        s2.b bVar;
        int i2;
        V remove;
        f j2;
        boolean d4;
        do {
            synchronized (q.f14930b) {
                r rVar = this.A;
                rVar.getClass();
                r rVar2 = (r) l.h(rVar);
                bVar = rVar2.f14931c;
                i2 = rVar2.f14932d;
            }
            bVar.getClass();
            s2.d b10 = bVar.b();
            remove = b10.remove(obj);
            s2.b b11 = b10.b();
            if (nc.k.a(b11, bVar)) {
                break;
            }
            r rVar3 = this.A;
            rVar3.getClass();
            synchronized (l.f14919c) {
                j2 = l.j();
                d4 = d(this, (r) l.w(rVar3, this, j2), i2, b11);
            }
            l.n(j2, this);
        } while (!d4);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        s2.b bVar = e().f14931c;
        bVar.getClass();
        return bVar.B;
    }

    public final String toString() {
        r rVar = this.A;
        rVar.getClass();
        return "SnapshotStateMap(value=" + ((r) l.h(rVar)).f14931c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.R;
    }
}
