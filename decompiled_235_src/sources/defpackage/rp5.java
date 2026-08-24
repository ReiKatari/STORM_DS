package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp5  reason: default package */
/* loaded from: classes.dex */
public final class rp5 extends d1 {
    public final ArrayList A;

    public rp5(ArrayList arrayList) {
        this.A = arrayList;
    }

    @Override // defpackage.d1
    public final int a() {
        return this.A.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.A.add(gt0.z0(i, this), obj);
    }

    @Override // defpackage.d1
    public final Object b(int i) {
        return this.A.remove(gt0.y0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.A.get(gt0.y0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new qp5(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new qp5(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.A.set(gt0.y0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new qp5(this, i);
    }
}
