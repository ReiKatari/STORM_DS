package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t0  reason: default package */
/* loaded from: classes.dex */
public abstract class t0 implements java.util.Iterator, defpackage.zf3 {
    public int A;
    public java.lang.Object B;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 == r2) goto L13
            r3 = 2
            if (r0 != r3) goto Lc
            return r1
        Lc:
            java.lang.String r3 = "hasNext called when the iterator is in the FAILED state."
            defpackage.i.h(r3)
            r3 = 0
            return r3
        L13:
            return r2
        L14:
            r0 = 3
            r3.A = r0
            r3.a()
            int r3 = r3.A
            if (r3 != r2) goto L1f
            return r2
        L1f:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r4.A = r1
            java.lang.Object r4 = r4.B
            return r4
        Lb:
            r3 = 2
            if (r0 == r3) goto L1d
            r0 = 3
            r4.A = r0
            r4.a()
            int r0 = r4.A
            if (r0 != r2) goto L1d
            r4.A = r1
            java.lang.Object r4 = r4.B
            return r4
        L1d:
            defpackage.fa6.c()
            r4 = 0
            return r4
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
