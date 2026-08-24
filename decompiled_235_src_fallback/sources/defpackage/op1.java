package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op1  reason: default package */
/* loaded from: classes.dex */
public final class op1 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.util.Iterator B;
    public int L;

    public op1(java.util.Iterator r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            return
    }

    public op1(defpackage.pp1 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            qb6 r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
            r1.B = r0
            int r2 = r2.b
            r1.L = r2
            return
    }

    public op1(defpackage.xy6 r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r0 = 50
            r1.L = r0
            qb6 r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
            r1.B = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.A
            java.util.Iterator r1 = r2.B
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L15;
                default: goto L7;
            }
        L7:
            int r2 = r2.L
            if (r2 <= 0) goto L13
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
        L15:
            boolean r2 = r1.hasNext()
            return r2
        L1a:
            int r0 = r2.L
            if (r0 <= 0) goto L2e
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2e
            r1.next()
            int r0 = r2.L
            int r0 = r0 + (-1)
            r2.L = r0
            goto L1a
        L2e:
            boolean r2 = r1.hasNext()
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            java.util.Iterator r2 = r5.B
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L19;
                default: goto L8;
            }
        L8:
            int r0 = r5.L
            if (r0 == 0) goto L15
            int r0 = r0 + (-1)
            r5.L = r0
            java.lang.Object r1 = r2.next()
            goto L18
        L15:
            defpackage.fa6.c()
        L18:
            return r1
        L19:
            j43 r0 = new j43
            int r3 = r5.L
            int r4 = r3 + 1
            r5.L = r4
            if (r3 < 0) goto L2b
            java.lang.Object r5 = r2.next()
            r0.<init>(r3, r5)
            return r0
        L2b:
            defpackage.hf.q0()
            throw r1
        L2f:
            int r0 = r5.L
            if (r0 <= 0) goto L43
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            r2.next()
            int r0 = r5.L
            int r0 = r0 + (-1)
            r5.L = r0
            goto L2f
        L43:
            java.lang.Object r5 = r2.next()
            return r5
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.A
            switch(r1) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        L15:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
