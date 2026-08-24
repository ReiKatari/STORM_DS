package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p28  reason: default package */
/* loaded from: classes.dex */
public abstract class p28 extends java.util.AbstractCollection implements java.io.Serializable {
    public static final java.lang.Object[] A = null;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            defpackage.p28.A = r0
            return
    }

    public abstract int a(java.lang.Object[] r1);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract int b();

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public abstract boolean d();

    public abstract java.lang.Object[] f();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
            r1 = this;
            r0 = 1296(0x510, float:1.816E-42)
            java.util.Spliterator r1 = java.util.Spliterators.spliterator(r1, r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = defpackage.p28.A
            java.lang.Object[] r1 = r1.toArray(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.size()
            int r1 = r4.length
            if (r1 >= r0) goto L2d
            java.lang.Object[] r2 = r3.f()
            if (r2 != 0) goto L1c
            if (r1 == 0) goto L17
            r1 = 0
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
        L17:
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            goto L32
        L1c:
            int r0 = r3.c()
            int r3 = r3.b()
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r3 = java.util.Arrays.copyOfRange(r2, r0, r3, r4)
            return r3
        L2d:
            if (r1 <= r0) goto L32
            r1 = 0
            r4[r0] = r1
        L32:
            r3.a(r4)
            return r4
    }
}
