package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad6  reason: default package */
/* loaded from: classes.dex */
public final class ad6 extends defpackage.e1 implements java.io.Serializable {
    public static final defpackage.ad6 B = null;
    public final defpackage.p04 A;

    static {
            ad6 r0 = new ad6
            p04 r1 = defpackage.p04.j0
            r0.<init>(r1)
            defpackage.ad6.B = r0
            return
    }

    public ad6() {
            r1 = this;
            p04 r0 = new p04
            r0.<init>()
            r1.<init>()
            r1.A = r0
            return
    }

    public ad6(int r2) {
            r1 = this;
            p04 r0 = new p04
            r0.<init>(r2)
            r1.<init>()
            r1.A = r0
            return
    }

    public ad6(defpackage.p04 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.e1
    public final int a() {
            r0 = this;
            p04 r0 = r0.A
            int r0 = r0.e0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object r1) {
            r0 = this;
            p04 r0 = r0.A
            int r0 = r0.a(r1)
            if (r0 < 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            p04 r0 = r1.A
            r0.c()
            boolean r1 = super.addAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
            r0 = this;
            p04 r0 = r0.A
            r0.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            p04 r0 = r0.A
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
            r0 = this;
            p04 r0 = r0.A
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            p04 r2 = r2.A
            r2.getClass()
            m04 r0 = new m04
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            p04 r0 = r0.A
            r0.c()
            int r1 = r0.g(r1)
            if (r1 >= 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0.k(r1)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            p04 r0 = r1.A
            r0.c()
            boolean r1 = super.removeAll(r2)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection r2) {
            r1 = this;
            r2.getClass()
            p04 r0 = r1.A
            r0.c()
            boolean r1 = super.retainAll(r2)
            return r1
    }
}
