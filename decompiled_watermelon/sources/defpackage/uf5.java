package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uf5  reason: default package */
/* loaded from: classes.dex */
public final class uf5 extends c1 {
    public final ArrayList A;

    public uf5(ArrayList arrayList) {
        this.A = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.A.add(tq0.C0(i, this), obj);
    }

    @Override // defpackage.c1
    public final int b() {
        return this.A.size();
    }

    @Override // defpackage.c1
    public final Object c(int i) {
        return this.A.remove(tq0.B0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.A.get(tq0.B0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new tf5(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new tf5(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.A.set(tq0.B0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new tf5(this, i);
    }
}
