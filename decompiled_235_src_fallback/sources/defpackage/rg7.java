package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rg7  reason: default package */
/* loaded from: classes.dex */
public final class rg7 extends java.util.AbstractList implements defpackage.wr3, java.util.RandomAccess {
    public final defpackage.vr3 A;

    public rg7(defpackage.vr3 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.wr3
    public final void e(defpackage.ca0 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            vr3 r0 = r0.A
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            qg7 r0 = new qg7
            r0.<init>()
            vr3 r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
            r0.A = r1
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            pg7 r0 = new pg7
            r0.<init>()
            vr3 r1 = r1.A
            java.util.ListIterator r1 = r1.listIterator(r2)
            r0.A = r1
            return r0
    }

    @Override // defpackage.wr3
    public final java.util.List n() {
            r0 = this;
            vr3 r0 = r0.A
            java.util.ArrayList r0 = r0.B
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            vr3 r0 = r0.A
            int r0 = r0.size()
            return r0
    }

    @Override // defpackage.wr3
    public final defpackage.wr3 u() {
            r0 = this;
            return r0
    }

    @Override // defpackage.wr3
    public final java.lang.Object v(int r1) {
            r0 = this;
            vr3 r0 = r0.A
            java.util.ArrayList r0 = r0.B
            java.lang.Object r0 = r0.get(r1)
            return r0
    }
}
