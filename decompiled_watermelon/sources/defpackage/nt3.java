package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nt3  reason: default package */
/* loaded from: classes.dex */
public final class nt3 extends d1 {
    public final /* synthetic */ int A;
    public final mt3 B;

    public /* synthetic */ nt3(mt3 mt3Var, int i) {
        this.A = i;
        this.B = mt3Var;
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

    @Override // defpackage.d1
    public final int b() {
        switch (this.A) {
            case 0:
                return this.B.d0;
            default:
                return this.B.d0;
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
        mt3 mt3Var = this.B;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                mt3Var.getClass();
                int g = mt3Var.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = mt3Var.B;
                objArr.getClass();
                return b53.x(objArr[g], entry.getValue());
            default:
                return mt3Var.containsKey(obj);
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
        mt3 mt3Var = this.B;
        switch (i) {
            case 0:
                mt3Var.getClass();
                return new jt3(mt3Var, 0);
            default:
                mt3Var.getClass();
                return new jt3(mt3Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.A;
        mt3 mt3Var = this.B;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    mt3Var.getClass();
                    mt3Var.c();
                    int g = mt3Var.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = mt3Var.B;
                        objArr.getClass();
                        if (b53.x(objArr[g], entry.getValue())) {
                            mt3Var.k(g);
                            return true;
                        }
                    }
                }
                return false;
            default:
                mt3Var.c();
                int g2 = mt3Var.g(obj);
                if (g2 < 0) {
                    return false;
                }
                mt3Var.k(g2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.A;
        mt3 mt3Var = this.B;
        collection.getClass();
        switch (i) {
            case 0:
                mt3Var.c();
                return super.removeAll(collection);
            default:
                mt3Var.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.A;
        mt3 mt3Var = this.B;
        collection.getClass();
        switch (i) {
            case 0:
                mt3Var.c();
                return super.retainAll(collection);
            default:
                mt3Var.c();
                return super.retainAll(collection);
        }
    }
}
