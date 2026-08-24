package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp5  reason: default package */
/* loaded from: classes.dex */
public final class rp5 extends defpackage.d1 {
    public final java.util.ArrayList A;

    public rp5(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.d1
    public final int a() {
            r0 = this;
            java.util.ArrayList r0 = r0.A
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.A
            int r1 = defpackage.gt0.z0(r2, r1)
            r0.add(r1, r3)
            return
    }

    @Override // defpackage.d1
    public final java.lang.Object b(int r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.A
            int r1 = defpackage.gt0.y0(r2, r1)
            java.lang.Object r1 = r0.remove(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r0 = this;
            java.util.ArrayList r0 = r0.A
            r0.clear()
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.A
            int r1 = defpackage.gt0.y0(r2, r1)
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r2 = this;
            qp5 r0 = new qp5
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
            r2 = this;
            qp5 r0 = new qp5
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int r2) {
            r1 = this;
            qp5 r0 = new qp5
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.ArrayList r0 = r1.A
            int r1 = defpackage.gt0.y0(r2, r1)
            java.lang.Object r1 = r0.set(r1, r3)
            return r1
    }
}
