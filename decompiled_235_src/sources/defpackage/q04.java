package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q04  reason: default package */
/* loaded from: classes.dex */
public final class q04 extends e1 {
    public final /* synthetic */ int A;
    public final p04 B;

    public /* synthetic */ q04(p04 p04Var, int i) {
        this.A = i;
        this.B = p04Var;
    }

    @Override // defpackage.e1
    public final int a() {
        switch (this.A) {
            case 0:
                return this.B.e0;
            default:
                return this.B.e0;
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
        int i = this.A;
        collection.getClass();
        switch (i) {
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
        int i = this.A;
        p04 p04Var = this.B;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                p04Var.getClass();
                int g = p04Var.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = p04Var.B;
                objArr.getClass();
                return nb3.k(objArr[g], entry.getValue());
            default:
                return p04Var.containsKey(obj);
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
        int i = this.A;
        p04 p04Var = this.B;
        switch (i) {
            case 0:
                p04Var.getClass();
                return new m04(p04Var, 0);
            default:
                p04Var.getClass();
                return new m04(p04Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.A;
        p04 p04Var = this.B;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    p04Var.getClass();
                    p04Var.c();
                    int g = p04Var.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = p04Var.B;
                        objArr.getClass();
                        if (nb3.k(objArr[g], entry.getValue())) {
                            p04Var.k(g);
                            return true;
                        }
                    }
                }
                return false;
            default:
                p04Var.c();
                int g2 = p04Var.g(obj);
                if (g2 < 0) {
                    return false;
                }
                p04Var.k(g2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.A;
        p04 p04Var = this.B;
        collection.getClass();
        switch (i) {
            case 0:
                p04Var.c();
                return super.removeAll(collection);
            default:
                p04Var.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.A;
        p04 p04Var = this.B;
        collection.getClass();
        switch (i) {
            case 0:
                p04Var.c();
                return super.retainAll(collection);
            default:
                p04Var.c();
                return super.retainAll(collection);
        }
    }
}
