package s2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d extends AbstractMap implements Map, oc.d {
    public b A;
    public u2.b B = new Object();
    public k L;
    public Object R;
    public int X;
    public int Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [u2.b, java.lang.Object] */
    public d(b bVar) {
        this.A = bVar;
        this.L = bVar.A;
        this.Y = bVar.B;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [u2.b, java.lang.Object] */
    public b a() {
        k kVar = this.L;
        b bVar = this.A;
        if (kVar != bVar.A) {
            this.B = new Object();
            bVar = new b(this.L, this.Y);
        }
        this.A = bVar;
        return bVar;
    }

    public /* bridge */ b b() {
        return a();
    }

    public final void c(int i2) {
        this.Y = i2;
        this.X++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.L = k.f12817e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i2;
        k kVar = this.L;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return kVar.d(i2, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i2;
        k kVar = this.L;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return kVar.g(i2, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i2;
        this.R = null;
        k kVar = this.L;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        this.L = kVar.l(i2, obj, obj2, 0, this);
        return this.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [u2.a, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b bVar;
        d dVar;
        b bVar2 = null;
        if (map instanceof b) {
            bVar = (b) map;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            if (map instanceof d) {
                dVar = (d) map;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                bVar2 = dVar.a();
            }
        } else {
            bVar2 = bVar;
        }
        if (bVar2 != null) {
            ?? obj = new Object();
            obj.f13478a = 0;
            int i2 = this.Y;
            k kVar = this.L;
            k kVar2 = bVar2.A;
            kVar2.getClass();
            this.L = kVar.m(kVar2, 0, obj, this);
            int i10 = (bVar2.B + i2) - obj.f13478a;
            if (i2 != i10) {
                c(i10);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i2;
        int i10 = this.Y;
        k kVar = this.L;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        k o5 = kVar.o(i2, obj, obj2, 0, this);
        if (o5 == null) {
            o5 = k.f12817e;
        }
        this.L = o5;
        if (i10 == this.Y) {
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
        return new ac.g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.R = null;
        k n10 = this.L.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n10 == null) {
            n10 = k.f12817e;
        }
        this.L = n10;
        return this.R;
    }
}
