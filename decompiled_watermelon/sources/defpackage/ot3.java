package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ot3  reason: default package */
/* loaded from: classes.dex */
public final class ot3 extends AbstractCollection implements Collection, g93 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ ot3(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.A) {
            case 0:
                ((mt3) this.B).clear();
                return;
            default:
                ((vm4) this.B).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((mt3) this.B).containsValue(obj);
            default:
                return ((vm4) this.B).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((mt3) this.B).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                mt3 mt3Var = (mt3) obj;
                mt3Var.getClass();
                return new jt3(mt3Var, 2);
            default:
                vm4 vm4Var = (vm4) obj;
                gy6[] gy6VarArr = new gy6[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    gy6VarArr[i2] = new hy6(2);
                }
                return new wm4(vm4Var, gy6VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                mt3 mt3Var = (mt3) this.B;
                mt3Var.c();
                int h = mt3Var.h(obj);
                if (h < 0) {
                    return false;
                }
                mt3Var.k(h);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                ((mt3) this.B).c();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                ((mt3) this.B).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return ((mt3) this.B).d0;
            default:
                return ((vm4) this.B).Y;
        }
    }
}
