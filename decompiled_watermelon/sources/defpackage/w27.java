package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w27  reason: default package */
/* loaded from: classes.dex */
public final class w27 extends AbstractList implements vk3, RandomAccess {
    public final uk3 A;

    public w27(uk3 uk3Var) {
        this.A = uk3Var;
    }

    @Override // defpackage.vk3
    public final void a(v70 v70Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.vk3
    public final Object g(int i) {
        return this.A.B.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.A.get(i);
    }

    @Override // defpackage.vk3
    public final List h() {
        return Collections.unmodifiableList(this.A.B);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, v27] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.A = this.A.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, java.lang.Object, u27] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ?? obj = new Object();
        obj.A = this.A.listIterator(i);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A.size();
    }

    @Override // defpackage.vk3
    public final vk3 f() {
        return this;
    }
}
