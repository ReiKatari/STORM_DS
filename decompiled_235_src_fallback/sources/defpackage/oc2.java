package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc2  reason: default package */
/* loaded from: classes.dex */
public final class oc2 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.util.Iterator B;
    public int L;
    public java.lang.Object R;
    public final /* synthetic */ defpackage.qb6 X;

    public oc2(defpackage.pc2 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.X = r2
            qb6 r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
            r1.B = r2
            r2 = -1
            r1.L = r2
            return
    }

    public oc2(defpackage.qd2 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.X = r2
            java.lang.Object r2 = r2.b
            qb6 r2 = (defpackage.qb6) r2
            java.util.Iterator r2 = r2.iterator()
            r1.B = r2
            return
    }

    public oc2(defpackage.qd2 r1, byte r2) {
            r0 = this;
            r2 = 2
            r0.A = r2
            r0.<init>()
            r0.X = r1
            java.lang.Object r1 = r1.b
            qb6 r1 = (defpackage.qb6) r1
            java.util.Iterator r1 = r1.iterator()
            r0.B = r1
            r1 = -1
            r0.L = r1
            return
    }

    public void a() {
            r4 = this;
            qb6 r0 = r4.X
            pc2 r0 = (defpackage.pc2) r0
        L4:
            java.util.Iterator r1 = r4.B
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r1 = r1.next()
            qn2 r2 = r0.c
            java.lang.Object r2 = r2.g(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r3 = r0.b
            if (r2 != r3) goto L4
            r4.R = r1
            r0 = 1
            r4.L = r0
            return
        L26:
            r0 = 0
            r4.L = r0
            return
    }

    public void b() {
            r2 = this;
            java.util.Iterator r0 = r2.B
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r0 = r0.next()
            qb6 r1 = r2.X
            qd2 r1 = (defpackage.qd2) r1
            qn2 r1 = r1.c
            java.lang.Object r1 = r1.g(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L24
            r1 = 1
            r2.L = r1
            r2.R = r0
            return
        L24:
            r0 = 0
            r2.L = r0
            return
    }

    public boolean c() {
            r5 = this;
            qb6 r0 = r5.X
            qd2 r0 = (defpackage.qd2) r0
            java.lang.Object r1 = r5.R
            java.util.Iterator r1 = (java.util.Iterator) r1
            r2 = 1
            if (r1 == 0) goto L14
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L14
            r5.L = r2
            return r2
        L14:
            java.util.Iterator r1 = r5.B
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r1 = r1.next()
            tb6 r3 = defpackage.tb6.d0
            qn2 r4 = r0.c
            java.lang.Object r1 = r4.g(r1)
            java.lang.Object r1 = r3.g(r1)
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L14
            r5.R = r1
            r5.L = r2
            return r2
        L39:
            r0 = 2
            r5.L = r0
            r0 = 0
            r5.R = r0
            r5 = 0
            return r5
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto L25;
                case 1: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r2.L
            r1 = -1
            if (r0 != r1) goto Ld
            r2.b()
        Ld:
            int r2 = r2.L
            r0 = 1
            if (r2 != r0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        L15:
            int r0 = r2.L
            r1 = 1
            if (r0 != r1) goto L1b
            goto L24
        L1b:
            r1 = 2
            if (r0 != r1) goto L20
            r1 = 0
            goto L24
        L20:
            boolean r1 = r2.c()
        L24:
            return r1
        L25:
            int r0 = r2.L
            r1 = -1
            if (r0 != r1) goto L2d
            r2.a()
        L2d:
            int r2 = r2.L
            r0 = 1
            if (r2 != r0) goto L33
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.A
            r1 = -1
            r2 = 0
            switch(r0) {
                case 0: goto L43;
                case 1: goto L1e;
                default: goto L7;
            }
        L7:
            int r0 = r3.L
            if (r0 != r1) goto Le
            r3.b()
        Le:
            int r0 = r3.L
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r3.R
            r3.R = r2
            r3.L = r1
            r2 = r0
            goto L1d
        L1a:
            defpackage.fa6.c()
        L1d:
            return r2
        L1e:
            int r0 = r3.L
            r1 = 2
            if (r0 == r1) goto L3f
            if (r0 != 0) goto L30
            boolean r0 = r3.c()
            if (r0 == 0) goto L2c
            goto L30
        L2c:
            defpackage.fa6.c()
            goto L42
        L30:
            r0 = 0
            r3.L = r0
            java.lang.Object r3 = r3.R
            java.util.Iterator r3 = (java.util.Iterator) r3
            r3.getClass()
            java.lang.Object r2 = r3.next()
            goto L42
        L3f:
            defpackage.fa6.c()
        L42:
            return r2
        L43:
            int r0 = r3.L
            if (r0 != r1) goto L4a
            r3.a()
        L4a:
            int r0 = r3.L
            if (r0 == 0) goto L56
            java.lang.Object r0 = r3.R
            r3.R = r2
            r3.L = r1
            r2 = r0
            goto L59
        L56:
            defpackage.fa6.c()
        L59:
            return r2
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
