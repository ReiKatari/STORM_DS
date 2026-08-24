package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x0  reason: default package */
/* loaded from: classes.dex */
public final class x0 extends defpackage.w0 implements java.util.ListIterator {
    public final /* synthetic */ defpackage.z0 R;

    public x0(defpackage.z0 r2, int r3) {
            r1 = this;
            r1.R = r2
            r0 = 0
            r1.<init>(r2, r0)
            int r2 = r2.a()
            if (r3 < 0) goto L11
            if (r3 > r2) goto L11
            r1.B = r3
            return
        L11:
            java.lang.String r1 = "index: "
            java.lang.String r0 = ", size: "
            java.lang.String r1 = defpackage.lb1.j(r1, r3, r2, r0)
            defpackage.e41.q(r1)
            r1 = 0
            throw r1
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            int r0 = r0.B
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L13
            int r0 = r1.B
            int r0 = r0 + (-1)
            r1.B = r0
            z0 r1 = r1.R
            java.lang.Object r1 = r1.get(r0)
            return r1
        L13:
            defpackage.fa6.c()
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            int r0 = r0.B
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
