package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r04  reason: default package */
/* loaded from: classes.dex */
public final class r04 extends AbstractCollection implements Collection, ag3 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ r04(Object obj, int i) {
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
                ((p04) this.B).clear();
                return;
            default:
                ((aw4) this.B).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((p04) this.B).containsValue(obj);
            default:
                return ((aw4) this.B).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((p04) this.B).isEmpty();
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
                p04 p04Var = (p04) obj;
                p04Var.getClass();
                return new m04(p04Var, 2);
            default:
                aw4 aw4Var = (aw4) obj;
                bc7[] bc7VarArr = new bc7[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    bc7VarArr[i2] = new cc7(2);
                }
                return new bw4(aw4Var, bc7VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                p04 p04Var = (p04) this.B;
                p04Var.c();
                int h = p04Var.h(obj);
                if (h < 0) {
                    return false;
                }
                p04Var.k(h);
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
                ((p04) this.B).c();
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
                ((p04) this.B).c();
                return super.retainAll(collection);
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.A) {
            case 0:
                return ((p04) this.B).e0;
            default:
                return ((aw4) this.B).Y;
        }
    }
}
