package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m16  reason: default package */
/* loaded from: classes.dex */
public final class m16 extends d1 implements Serializable {
    public static final m16 B = new m16(mt3.i0);
    public final mt3 A;

    public m16() {
        this.A = new mt3();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.A.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.A.c();
        return super.addAll(collection);
    }

    @Override // defpackage.d1
    public final int b() {
        return this.A.d0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        mt3 mt3Var = this.A;
        mt3Var.getClass();
        return new jt3(mt3Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        mt3 mt3Var = this.A;
        mt3Var.c();
        int g = mt3Var.g(obj);
        if (g < 0) {
            return false;
        }
        mt3Var.k(g);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.A.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.A.c();
        return super.retainAll(collection);
    }

    public m16(mt3 mt3Var) {
        mt3Var.getClass();
        this.A = mt3Var;
    }

    public m16(int i) {
        this.A = new mt3(i);
    }
}
