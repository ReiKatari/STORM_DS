package ac;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends zb.g {
    public final /* synthetic */ int A;
    public final e B;

    public /* synthetic */ f(e eVar, int i2) {
        this.A = i2;
        this.B = eVar;
    }

    @Override // zb.g
    public final int a() {
        switch (this.A) {
            case 0:
                return this.B.f700c0;
            default:
                return this.B.f700c0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i2 = this.A;
        collection.getClass();
        switch (i2) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.A) {
            case 0:
                this.B.clear();
                return;
            default:
                this.B.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                e eVar = this.B;
                eVar.getClass();
                int g10 = eVar.g(entry.getKey());
                if (g10 < 0) {
                    return false;
                }
                Object[] objArr = eVar.B;
                objArr.getClass();
                return k.a(objArr[g10], entry.getValue());
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                return this.B.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return this.B.isEmpty();
            default:
                return this.B.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                e eVar = this.B;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.B;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                e eVar = this.B;
                eVar.getClass();
                eVar.c();
                int g10 = eVar.g(entry.getKey());
                if (g10 < 0) {
                    return false;
                }
                Object[] objArr = eVar.B;
                objArr.getClass();
                if (!k.a(objArr[g10], entry.getValue())) {
                    return false;
                }
                eVar.k(g10);
                return true;
            default:
                e eVar2 = this.B;
                eVar2.c();
                int g11 = eVar2.g(obj);
                if (g11 < 0) {
                    return false;
                }
                eVar2.k(g11);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i2 = this.A;
        collection.getClass();
        switch (i2) {
            case 0:
                this.B.c();
                return super.removeAll(collection);
            default:
                this.B.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i2 = this.A;
        collection.getClass();
        switch (i2) {
            case 0:
                this.B.c();
                return super.retainAll(collection);
            default:
                this.B.c();
                return super.retainAll(collection);
        }
    }
}
