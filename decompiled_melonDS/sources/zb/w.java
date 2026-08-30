package zb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import z2.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends f {
    public final ArrayList A;

    public w(ArrayList arrayList) {
        this.A = arrayList;
    }

    @Override // zb.f
    public final int a() {
        return this.A.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        this.A.add(l.K(i2, this), obj);
    }

    @Override // zb.f
    public final Object b(int i2) {
        return this.A.remove(l.J(i2, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return this.A.get(l.J(i2, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new b0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new b0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        return this.A.set(l.J(i2, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new b0(this, i2);
    }
}
