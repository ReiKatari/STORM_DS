package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r97  reason: default package */
/* loaded from: classes.dex */
public final class r97 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public java.util.Iterator B;
    public final java.lang.Object L;

    public r97(defpackage.qd2 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            java.lang.Object r2 = r2.b
            qb6 r2 = (defpackage.qb6) r2
            java.util.Iterator r2 = r2.iterator()
            r1.B = r2
            return
    }

    public r97(defpackage.w0 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.L = r0
            r1.B = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.util.Iterator r1 = r1.B
            boolean r1 = r1.hasNext()
            return r1
        Lc:
            java.util.Iterator r1 = r1.B
            boolean r1 = r1.hasNext()
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r5 = this;
            int r0 = r5.A
            java.lang.Object r1 = r5.L
            switch(r0) {
                case 0: goto L4f;
                default: goto L7;
            }
        L7:
            java.util.Iterator r0 = r5.B
            java.lang.Object r0 = r0.next()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof android.view.ViewGroup
            r4 = 0
            if (r3 == 0) goto L1a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L1b
        L1a:
            r2 = r4
        L1b:
            if (r2 == 0) goto L24
            w0 r4 = new w0
            r3 = 10
            r4.<init>(r2, r3)
        L24:
            if (r4 == 0) goto L34
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L34
            java.util.Iterator r2 = r5.B
            r1.add(r2)
            r5.B = r4
            goto L4e
        L34:
            java.util.Iterator r2 = r5.B
            boolean r2 = r2.hasNext()
            if (r2 != 0) goto L4e
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L4e
            java.lang.Object r2 = defpackage.gt0.Q0(r1)
            java.util.Iterator r2 = (java.util.Iterator) r2
            r5.B = r2
            defpackage.gt0.Y0(r1)
            goto L34
        L4e:
            return r0
        L4f:
            qd2 r1 = (defpackage.qd2) r1
            qn2 r0 = r1.c
            java.util.Iterator r5 = r5.B
            java.lang.Object r5 = r5.next()
            java.lang.Object r5 = r0.g(r5)
            return r5
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.A
            switch(r1) {
                case 0: goto Ld;
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
    }
}
