package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx2  reason: default package */
/* loaded from: classes.dex */
public final class xx2 implements java.util.ListIterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public int B;
    public int L;
    public int R;
    public final java.lang.Object X;

    public xx2(defpackage.jw3 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.X = r2
            r1.B = r3
            r3 = -1
            r1.L = r3
            int r2 = defpackage.jw3.c(r2)
            r1.R = r2
            return
    }

    public xx2(defpackage.kw3 r2, int r3) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.X = r2
            r1.B = r3
            r3 = -1
            r1.L = r3
            int r2 = defpackage.kw3.c(r2)
            r1.R = r2
            return
    }

    public xx2(defpackage.mm6 r2, int r3) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.X = r2
            int r3 = r3 + (-1)
            r1.B = r3
            r3 = -1
            r1.L = r3
            int r2 = defpackage.ge7.F(r2)
            r1.R = r2
            return
    }

    public xx2(defpackage.zx2 r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r4 = r4 & 1
            if (r4 == 0) goto L8
            r3 = r0
        L8:
            ca4 r4 = r2.A
            int r4 = r4.b
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public xx2(defpackage.zx2 r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.X = r2
            r1.B = r3
            r1.L = r4
            r1.R = r5
            return
    }

    public void a() {
            r1 = this;
            java.lang.Object r0 = r1.X
            jw3 r0 = (defpackage.jw3) r0
            kw3 r0 = r0.X
            int r0 = defpackage.kw3.c(r0)
            int r1 = r1.R
            if (r0 != r1) goto Lf
            return
        Lf:
            defpackage.i.l()
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            r1 = -1
            java.lang.Object r2 = r4.X
            switch(r0) {
                case 0: goto L51;
                case 1: goto L3a;
                case 2: goto L23;
                default: goto L8;
            }
        L8:
            r4.c()
            mm6 r2 = (defpackage.mm6) r2
            int r0 = r4.B
            int r0 = r0 + 1
            r2.add(r0, r5)
            r4.L = r1
            int r5 = r4.B
            int r5 = r5 + 1
            r4.B = r5
            int r5 = defpackage.ge7.F(r2)
            r4.R = r5
            return
        L23:
            r4.b()
            kw3 r2 = (defpackage.kw3) r2
            int r0 = r4.B
            int r3 = r0 + 1
            r4.B = r3
            r2.add(r0, r5)
            r4.L = r1
            int r5 = defpackage.kw3.c(r2)
            r4.R = r5
            return
        L3a:
            r4.a()
            jw3 r2 = (defpackage.jw3) r2
            int r0 = r4.B
            int r3 = r0 + 1
            r4.B = r3
            r2.add(r0, r5)
            r4.L = r1
            int r5 = defpackage.jw3.c(r2)
            r4.R = r5
            return
        L51:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Operation is not supported for read-only collection"
            r4.<init>(r5)
            throw r4
    }

    public void b() {
            r1 = this;
            java.lang.Object r0 = r1.X
            kw3 r0 = (defpackage.kw3) r0
            int r0 = defpackage.kw3.c(r0)
            int r1 = r1.R
            if (r0 != r1) goto Ld
            return
        Ld:
            defpackage.i.l()
            return
    }

    public void c() {
            r1 = this;
            java.lang.Object r0 = r1.X
            mm6 r0 = (defpackage.mm6) r0
            int r0 = defpackage.ge7.F(r0)
            int r1 = r1.R
            if (r0 != r1) goto Ld
            return
        Ld:
            defpackage.i.l()
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.A
            java.lang.Object r1 = r4.X
            r2 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L20;
                case 2: goto L16;
                default: goto L9;
            }
        L9:
            int r4 = r4.B
            mm6 r1 = (defpackage.mm6) r1
            int r0 = r1.size()
            int r0 = r0 - r3
            if (r4 >= r0) goto L15
            r2 = r3
        L15:
            return r2
        L16:
            int r4 = r4.B
            kw3 r1 = (defpackage.kw3) r1
            int r0 = r1.B
            if (r4 >= r0) goto L1f
            r2 = r3
        L1f:
            return r2
        L20:
            int r4 = r4.B
            jw3 r1 = (defpackage.jw3) r1
            int r0 = r1.L
            if (r4 >= r0) goto L29
            r2 = r3
        L29:
            return r2
        L2a:
            int r0 = r4.B
            int r4 = r4.R
            if (r0 >= r4) goto L31
            r2 = r3
        L31:
            return r2
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L15;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            int r1 = r1.B
            if (r1 < 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
        Ld:
            int r1 = r1.B
            if (r1 <= 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
        L15:
            int r1 = r1.B
            if (r1 <= 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
        L1d:
            int r0 = r1.B
            int r1 = r1.L
            if (r0 <= r1) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = 0
        L26:
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            java.lang.Object r2 = r4.X
            switch(r0) {
                case 0: goto L58;
                case 1: goto L3b;
                case 2: goto L21;
                default: goto L8;
            }
        L8:
            r4.c()
            int r0 = r4.B
            int r0 = r0 + 1
            r4.L = r0
            mm6 r2 = (defpackage.mm6) r2
            int r1 = r2.size()
            defpackage.ge7.m(r0, r1)
            java.lang.Object r1 = r2.get(r0)
            r4.B = r0
            return r1
        L21:
            r4.b()
            int r0 = r4.B
            kw3 r2 = (defpackage.kw3) r2
            int r3 = r2.B
            if (r0 >= r3) goto L37
            int r1 = r0 + 1
            r4.B = r1
            r4.L = r0
            java.lang.Object[] r4 = r2.A
            r1 = r4[r0]
            goto L3a
        L37:
            defpackage.fa6.c()
        L3a:
            return r1
        L3b:
            r4.a()
            int r0 = r4.B
            jw3 r2 = (defpackage.jw3) r2
            int r3 = r2.L
            if (r0 >= r3) goto L54
            int r1 = r0 + 1
            r4.B = r1
            r4.L = r0
            java.lang.Object[] r4 = r2.A
            int r1 = r2.B
            int r1 = r1 + r0
            r1 = r4[r1]
            goto L57
        L54:
            defpackage.fa6.c()
        L57:
            return r1
        L58:
            zx2 r2 = (defpackage.zx2) r2
            ca4 r0 = r2.A
            int r1 = r4.B
            int r2 = r1 + 1
            r4.B = r2
            java.lang.Object r4 = r0.f(r1)
            r4.getClass()
            z64 r4 = (defpackage.z64) r4
            return r4
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L10;
                case 1: goto Ld;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r1.B
            int r1 = r1 + 1
            return r1
        La:
            int r1 = r1.B
            return r1
        Ld:
            int r1 = r1.B
            return r1
        L10:
            int r0 = r1.B
            int r1 = r1.L
            int r0 = r0 - r1
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r3 = this;
            int r0 = r3.A
            r1 = 0
            java.lang.Object r2 = r3.X
            switch(r0) {
                case 0: goto L58;
                case 1: goto L3d;
                case 2: goto L25;
                default: goto L8;
            }
        L8:
            r3.c()
            int r0 = r3.B
            mm6 r2 = (defpackage.mm6) r2
            int r1 = r2.size()
            defpackage.ge7.m(r0, r1)
            int r0 = r3.B
            r3.L = r0
            java.lang.Object r0 = r2.get(r0)
            int r1 = r3.B
            int r1 = r1 + (-1)
            r3.B = r1
            return r0
        L25:
            r3.b()
            int r0 = r3.B
            if (r0 <= 0) goto L39
            int r0 = r0 + (-1)
            r3.B = r0
            r3.L = r0
            kw3 r2 = (defpackage.kw3) r2
            java.lang.Object[] r3 = r2.A
            r1 = r3[r0]
            goto L3c
        L39:
            defpackage.fa6.c()
        L3c:
            return r1
        L3d:
            r3.a()
            int r0 = r3.B
            if (r0 <= 0) goto L54
            int r0 = r0 + (-1)
            r3.B = r0
            r3.L = r0
            jw3 r2 = (defpackage.jw3) r2
            java.lang.Object[] r3 = r2.A
            int r1 = r2.B
            int r1 = r1 + r0
            r1 = r3[r1]
            goto L57
        L54:
            defpackage.fa6.c()
        L57:
            return r1
        L58:
            zx2 r2 = (defpackage.zx2) r2
            ca4 r0 = r2.A
            int r1 = r3.B
            int r1 = r1 + (-1)
            r3.B = r1
            java.lang.Object r3 = r0.f(r1)
            r3.getClass()
            z64 r3 = (defpackage.z64) r3
            return r3
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L10;
                case 1: goto Ld;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.B
            return r1
        L8:
            int r1 = r1.B
        La:
            int r1 = r1 + (-1)
            return r1
        Ld:
            int r1 = r1.B
            goto La
        L10:
            int r0 = r1.B
            int r1 = r1.L
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r4 = this;
            int r0 = r4.A
            java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
            r2 = -1
            java.lang.Object r3 = r4.X
            switch(r0) {
                case 0: goto L5c;
                case 1: goto L3f;
                case 2: goto L22;
                default: goto La;
            }
        La:
            r4.c()
            mm6 r3 = (defpackage.mm6) r3
            int r0 = r4.L
            r3.remove(r0)
            int r0 = r4.B
            int r0 = r0 + r2
            r4.B = r0
            r4.L = r2
            int r0 = defpackage.ge7.F(r3)
            r4.R = r0
            return
        L22:
            kw3 r3 = (defpackage.kw3) r3
            r4.b()
            int r0 = r4.L
            if (r0 == r2) goto L3b
            r3.b(r0)
            int r0 = r4.L
            r4.B = r0
            r4.L = r2
            int r0 = defpackage.kw3.c(r3)
            r4.R = r0
            goto L3e
        L3b:
            defpackage.i.m(r1)
        L3e:
            return
        L3f:
            jw3 r3 = (defpackage.jw3) r3
            r4.a()
            int r0 = r4.L
            if (r0 == r2) goto L58
            r3.b(r0)
            int r0 = r4.L
            r4.B = r0
            r4.L = r2
            int r0 = defpackage.jw3.c(r3)
            r4.R = r0
            goto L5b
        L58:
            defpackage.i.m(r1)
        L5b:
            return
        L5c:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r4.<init>(r0)
            throw r4
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.A
            java.lang.String r1 = "Call next() or previous() before replacing element from the iterator."
            r2 = -1
            java.lang.Object r3 = r4.X
            switch(r0) {
                case 0: goto L45;
                case 1: goto L34;
                case 2: goto L23;
                default: goto La;
            }
        La:
            mm6 r3 = (defpackage.mm6) r3
            r4.c()
            int r0 = r4.L
            if (r0 < 0) goto L1d
            r3.set(r0, r5)
            int r5 = defpackage.ge7.F(r3)
            r4.R = r5
            goto L22
        L1d:
            java.lang.String r4 = "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"
            defpackage.i.m(r4)
        L22:
            return
        L23:
            r4.b()
            int r4 = r4.L
            if (r4 == r2) goto L30
            kw3 r3 = (defpackage.kw3) r3
            r3.set(r4, r5)
            goto L33
        L30:
            defpackage.i.m(r1)
        L33:
            return
        L34:
            r4.a()
            int r4 = r4.L
            if (r4 == r2) goto L41
            jw3 r3 = (defpackage.jw3) r3
            r3.set(r4, r5)
            goto L44
        L41:
            defpackage.i.m(r1)
        L44:
            return
        L45:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Operation is not supported for read-only collection"
            r4.<init>(r5)
            throw r4
    }
}
