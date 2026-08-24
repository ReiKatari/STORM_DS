package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad6  reason: default package */
/* loaded from: classes.dex */
public final class ad6 extends e1 implements Serializable {
    public static final ad6 B = new ad6(p04.j0);
    public final p04 A;

    public ad6() {
        this.A = new p04();
    }

    @Override // defpackage.e1
    public final int a() {
        return this.A.e0;
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
        p04 p04Var = this.A;
        p04Var.getClass();
        return new m04(p04Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        p04 p04Var = this.A;
        p04Var.c();
        int g = p04Var.g(obj);
        if (g < 0) {
            return false;
        }
        p04Var.k(g);
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

    public ad6(p04 p04Var) {
        p04Var.getClass();
        this.A = p04Var;
    }

    public ad6(int i) {
        this.A = new p04(i);
    }
}
