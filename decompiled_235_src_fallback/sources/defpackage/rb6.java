package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb6  reason: default package */
/* loaded from: classes.dex */
public final class rb6 implements java.util.Iterator, defpackage.r41, defpackage.zf3 {
    public int A;
    public java.lang.Object B;
    public java.util.Iterator L;
    public defpackage.r41 R;

    public final java.lang.RuntimeException a() {
            r3 = this;
            int r0 = r3.A
            r1 = 4
            if (r0 == r1) goto L26
            r1 = 5
            if (r0 == r1) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.<init>(r2)
            int r3 = r3.A
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Iterator has failed."
            r3.<init>(r0)
            return r3
        L26:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            return r3
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            vt1 r0 = defpackage.vt1.A
            return r0
    }

    public final defpackage.x61 c(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            r0.B = r2
            r2 = 3
            r0.A = r2
            r0.R = r1
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            r1.getClass()
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.A
            r1 = 0
            if (r0 == 0) goto L29
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L19
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r4 = 0
            return r4
        L13:
            java.lang.RuntimeException r4 = r4.a()
            throw r4
        L18:
            return r3
        L19:
            java.util.Iterator r0 = r4.L
            r0.getClass()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r4.A = r2
            return r3
        L27:
            r4.L = r1
        L29:
            r0 = 5
            r4.A = r0
            r41 r0 = r4.R
            r0.getClass()
            r4.R = r1
            jg7 r1 = defpackage.jg7.a
            r0.i(r1)
            goto L0
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r1) {
            r0 = this;
            defpackage.oi2.Y(r1)
            r1 = 4
            r0.A = r1
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            if (r0 == 0) goto L27
            r2 = 1
            if (r0 == r2) goto L27
            r3 = 2
            if (r0 == r3) goto L1b
            r2 = 3
            if (r0 != r2) goto L16
            r0 = 0
            r4.A = r0
            java.lang.Object r0 = r4.B
            r4.B = r1
            return r0
        L16:
            java.lang.RuntimeException r4 = r4.a()
            throw r4
        L1b:
            r4.A = r2
            java.util.Iterator r4 = r4.L
            r4.getClass()
            java.lang.Object r4 = r4.next()
            return r4
        L27:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r4 = r4.next()
            return r4
        L32:
            defpackage.fa6.c()
            return r1
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
