package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr2  reason: default package */
/* loaded from: classes.dex */
public final class rr2 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public int B;
    public java.lang.Object L;
    public final java.lang.Object R;

    public rr2(defpackage.ga4 r3) {
            r2 = this;
            r0 = 1
            r2.A = r0
            r2.<init>()
            r2.R = r3
            r0 = -1
            r2.B = r0
            fa4 r0 = new fa4
            r1 = 0
            r0.<init>(r3, r2, r1)
            rb6 r3 = defpackage.qo2.C(r0)
            r2.L = r3
            return
    }

    public rr2(java.util.Map r2, java.lang.Object r3) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.L = r3
            r1.R = r2
            return
    }

    public rr2(defpackage.jt6 r2) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r1.<init>()
            r1.R = r2
            qb6 r2 = r2.a
            java.util.Iterator r2 = r2.iterator()
            r1.L = r2
            return
    }

    public rr2(defpackage.ma4 r3) {
            r2 = this;
            r0 = 2
            r2.A = r0
            r2.<init>()
            r2.R = r3
            r0 = -1
            r2.B = r0
            la4 r0 = new la4
            r1 = 0
            r0.<init>(r3, r2, r1)
            rb6 r3 = defpackage.qo2.C(r0)
            r2.L = r3
            return
    }

    public rr2(defpackage.qd2 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r2 = -2
            r1.B = r2
            return
    }

    public void a() {
            r3 = this;
            int r0 = r3.B
            java.lang.Object r1 = r3.R
            qd2 r1 = (defpackage.qd2) r1
            r2 = -2
            if (r0 != r2) goto L12
            java.lang.Object r0 = r1.b
            on2 r0 = (defpackage.on2) r0
            java.lang.Object r0 = r0.c()
            goto L1d
        L12:
            qn2 r0 = r1.c
            java.lang.Object r1 = r3.L
            r1.getClass()
            java.lang.Object r0 = r0.g(r1)
        L1d:
            r3.L = r0
            if (r0 != 0) goto L23
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            r3.B = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r6 = this;
            int r0 = r6.A
            java.lang.Object r1 = r6.R
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L50;
                case 1: goto L47;
                case 2: goto L3e;
                case 3: goto L32;
                default: goto L9;
            }
        L9:
            jt6 r1 = (defpackage.jt6) r1
            java.lang.Object r0 = r6.L
            java.util.Iterator r0 = (java.util.Iterator) r0
        Lf:
            int r4 = r6.B
            int r5 = r1.b
            if (r4 >= r5) goto L24
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L24
            r0.next()
            int r4 = r6.B
            int r4 = r4 + r3
            r6.B = r4
            goto Lf
        L24:
            int r6 = r6.B
            int r1 = r1.c
            if (r6 >= r1) goto L31
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L31
            r2 = r3
        L31:
            return r2
        L32:
            int r6 = r6.B
            java.util.Map r1 = (java.util.Map) r1
            int r0 = r1.size()
            if (r6 >= r0) goto L3d
            r2 = r3
        L3d:
            return r2
        L3e:
            java.lang.Object r6 = r6.L
            rb6 r6 = (defpackage.rb6) r6
            boolean r6 = r6.hasNext()
            return r6
        L47:
            java.lang.Object r6 = r6.L
            rb6 r6 = (defpackage.rb6) r6
            boolean r6 = r6.hasNext()
            return r6
        L50:
            int r0 = r6.B
            if (r0 >= 0) goto L57
            r6.a()
        L57:
            int r6 = r6.B
            if (r6 != r3) goto L5c
            r2 = r3
        L5c:
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r5 = this;
            int r0 = r5.A
            java.lang.Object r1 = r5.R
            r2 = 0
            switch(r0) {
                case 0: goto L83;
                case 1: goto L7a;
                case 2: goto L71;
                case 3: goto L37;
                default: goto L8;
            }
        L8:
            jt6 r1 = (defpackage.jt6) r1
            java.lang.Object r0 = r5.L
            java.util.Iterator r0 = (java.util.Iterator) r0
        Le:
            int r3 = r5.B
            int r4 = r1.b
            if (r3 >= r4) goto L24
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L24
            r0.next()
            int r3 = r5.B
            int r3 = r3 + 1
            r5.B = r3
            goto Le
        L24:
            int r3 = r5.B
            int r1 = r1.c
            if (r3 >= r1) goto L33
            int r3 = r3 + 1
            r5.B = r3
            java.lang.Object r2 = r0.next()
            goto L36
        L33:
            defpackage.fa6.c()
        L36:
            return r2
        L37:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r2 = r5.L
            int r0 = r5.B
            int r0 = r0 + 1
            r5.B = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L54
            ew3 r0 = (defpackage.ew3) r0
            java.lang.Object r0 = r0.b
            r5.L = r0
            goto L70
        L54:
            java.util.ConcurrentModificationException r5 = new java.util.ConcurrentModificationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Hash code of an element ("
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ") has changed after it was added to the persistent set."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L6d:
            defpackage.fa6.c()
        L70:
            return r2
        L71:
            java.lang.Object r5 = r5.L
            rb6 r5 = (defpackage.rb6) r5
            java.lang.Object r5 = r5.next()
            return r5
        L7a:
            java.lang.Object r5 = r5.L
            rb6 r5 = (defpackage.rb6) r5
            java.lang.Object r5 = r5.next()
            return r5
        L83:
            int r0 = r5.B
            if (r0 >= 0) goto L8a
            r5.a()
        L8a:
            int r0 = r5.B
            if (r0 == 0) goto L97
            java.lang.Object r2 = r5.L
            r2.getClass()
            r0 = -1
            r5.B = r0
            goto L9a
        L97:
            defpackage.fa6.c()
        L9a:
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r4 = this;
            int r0 = r4.A
            java.lang.Object r1 = r4.R
            r2 = -1
            java.lang.String r3 = "Operation is not supported for read-only collection"
            switch(r0) {
                case 0: goto L32;
                case 1: goto L24;
                case 2: goto L16;
                case 3: goto L10;
                default: goto La;
            }
        La:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>(r3)
            throw r4
        L10:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>(r3)
            throw r4
        L16:
            int r0 = r4.B
            if (r0 == r2) goto L23
            ma4 r1 = (defpackage.ma4) r1
            ka4 r1 = r1.B
            r1.m(r0)
            r4.B = r2
        L23:
            return
        L24:
            int r0 = r4.B
            if (r0 == r2) goto L31
            ga4 r1 = (defpackage.ga4) r1
            ea4 r1 = r1.B
            r1.h(r0)
            r4.B = r2
        L31:
            return
        L32:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>(r3)
            throw r4
    }
}
