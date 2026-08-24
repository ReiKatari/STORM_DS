package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rg7  reason: default package */
/* loaded from: classes.dex */
public final class rg7 extends AbstractList implements wr3, RandomAccess {
    public final vr3 A;

    public rg7(vr3 vr3Var) {
        this.A = vr3Var;
    }

    @Override // defpackage.wr3
    public final void e(ca0 ca0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.A.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qg7, java.util.Iterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.A = this.A.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pg7, java.util.ListIterator, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ?? obj = new Object();
        obj.A = this.A.listIterator(i);
        return obj;
    }

    @Override // defpackage.wr3
    public final List n() {
        return Collections.unmodifiableList(this.A.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A.size();
    }

    @Override // defpackage.wr3
    public final Object v(int i) {
        return this.A.B.get(i);
    }

    @Override // defpackage.wr3
    public final wr3 u() {
        return this;
    }
}
