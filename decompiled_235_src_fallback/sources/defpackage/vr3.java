package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr3  reason: default package */
/* loaded from: classes.dex */
public final class vr3 extends defpackage.j1 implements defpackage.wr3, java.util.RandomAccess {
    public final java.util.ArrayList B;

    static {
            vr3 r0 = new vr3
            r1 = 10
            r0.<init>(r1)
            r1 = 0
            r0.A = r1
            return
    }

    public vr3(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public vr3(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            r1.a()
            java.util.ArrayList r0 = r1.B
            r0.add(r2, r3)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // defpackage.j1, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, java.util.Collection r3) {
            r1 = this;
            r1.a()
            boolean r0 = r3 instanceof defpackage.wr3
            if (r0 == 0) goto Ld
            wr3 r3 = (defpackage.wr3) r3
            java.util.List r3 = r3.n()
        Ld:
            java.util.ArrayList r0 = r1.B
            boolean r2 = r0.addAll(r2, r3)
            int r3 = r1.modCount
            int r3 = r3 + 1
            r1.modCount = r3
            return r2
    }

    @Override // defpackage.j1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.B
            int r0 = r0.size()
            boolean r1 = r1.addAll(r0, r2)
            return r1
    }

    @Override // defpackage.j1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
            r1 = this;
            r1.a()
            java.util.ArrayList r0 = r1.B
            r0.clear()
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // defpackage.wr3
    public final void e(defpackage.ca0 r2) {
            r1 = this;
            r1.a()
            java.util.ArrayList r0 = r1.B
            r0.add(r2)
            int r2 = r1.modCount
            int r2 = r2 + 1
            r1.modCount = r2
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int r7) {
            r6 = this;
            java.util.ArrayList r6 = r6.B
            java.lang.Object r0 = r6.get(r7)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            boolean r1 = r0 instanceof defpackage.ea0
            if (r1 == 0) goto L4a
            ea0 r0 = (defpackage.ea0) r0
            java.nio.charset.Charset r1 = defpackage.aa3.a
            int r2 = r0.size()
            if (r2 != 0) goto L1e
            java.lang.String r1 = ""
            goto L31
        L1e:
            r2 = r0
            ca0 r2 = (defpackage.ca0) r2
            java.lang.String r3 = new java.lang.String
            byte[] r4 = r2.R
            int r5 = r2.g()
            int r2 = r2.size()
            r3.<init>(r4, r5, r2, r1)
            r1 = r3
        L31:
            ca0 r0 = (defpackage.ca0) r0
            int r2 = r0.g()
            byte[] r3 = r0.R
            int r0 = r0.size()
            int r0 = r0 + r2
            nj2 r4 = defpackage.xj7.a
            boolean r0 = r4.z(r3, r2, r0)
            if (r0 == 0) goto L49
            r6.set(r7, r1)
        L49:
            return r1
        L4a:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = defpackage.aa3.a
            r1.<init>(r0, r2)
            nj2 r2 = defpackage.xj7.a
            r3 = 0
            int r4 = r0.length
            boolean r0 = r2.z(r0, r3, r4)
            if (r0 == 0) goto L60
            r6.set(r7, r1)
        L60:
            return r1
    }

    @Override // defpackage.z93
    public final defpackage.z93 k(int r2) {
            r1 = this;
            java.util.ArrayList r1 = r1.B
            int r0 = r1.size()
            if (r2 < r0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r0.addAll(r1)
            vr3 r1 = new vr3
            r1.<init>(r0)
            return r1
        L16:
            defpackage.u34.t()
            r1 = 0
            return r1
    }

    @Override // defpackage.wr3
    public final java.util.List n() {
            r0 = this;
            java.util.ArrayList r0 = r0.B
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int r4) {
            r3 = this;
            r3.a()
            java.util.ArrayList r0 = r3.B
            java.lang.Object r4 = r0.remove(r4)
            int r0 = r3.modCount
            int r0 = r0 + 1
            r3.modCount = r0
            boolean r3 = r4 instanceof java.lang.String
            if (r3 == 0) goto L16
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L16:
            boolean r3 = r4 instanceof defpackage.ea0
            if (r3 == 0) goto L39
            ea0 r4 = (defpackage.ea0) r4
            java.nio.charset.Charset r3 = defpackage.aa3.a
            int r0 = r4.size()
            if (r0 != 0) goto L27
            java.lang.String r3 = ""
            return r3
        L27:
            ca0 r4 = (defpackage.ca0) r4
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.R
            int r2 = r4.g()
            int r4 = r4.size()
            r0.<init>(r1, r2, r4, r3)
            return r0
        L39:
            byte[] r4 = (byte[]) r4
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r0 = defpackage.aa3.a
            r3.<init>(r4, r0)
            return r3
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r4 = (java.lang.String) r4
            r2.a()
            java.util.ArrayList r2 = r2.B
            java.lang.Object r2 = r2.set(r3, r4)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L12
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L12:
            boolean r3 = r2 instanceof defpackage.ea0
            if (r3 == 0) goto L35
            ea0 r2 = (defpackage.ea0) r2
            java.nio.charset.Charset r3 = defpackage.aa3.a
            int r4 = r2.size()
            if (r4 != 0) goto L23
            java.lang.String r2 = ""
            return r2
        L23:
            ca0 r2 = (defpackage.ca0) r2
            java.lang.String r4 = new java.lang.String
            byte[] r0 = r2.R
            int r1 = r2.g()
            int r2 = r2.size()
            r4.<init>(r0, r1, r2, r3)
            return r4
        L35:
            byte[] r2 = (byte[]) r2
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = defpackage.aa3.a
            r3.<init>(r2, r4)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r0 = this;
            java.util.ArrayList r0 = r0.B
            int r0 = r0.size()
            return r0
    }

    @Override // defpackage.wr3
    public final defpackage.wr3 u() {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto La
            rg7 r0 = new rg7
            r0.<init>(r1)
            return r0
        La:
            return r1
    }

    @Override // defpackage.wr3
    public final java.lang.Object v(int r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.B
            java.lang.Object r0 = r0.get(r1)
            return r0
    }
}
