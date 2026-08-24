package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb4  reason: default package */
/* loaded from: classes.dex */
public final class zb4 {
    public final defpackage.rc4 a;
    public final defpackage.n10 b;
    public defpackage.mc4 c;
    public android.os.Bundle d;
    public android.os.Bundle[] e;
    public final defpackage.pu f;
    public final defpackage.tp6 g;
    public final defpackage.tp6 h;
    public final defpackage.de5 i;
    public final java.util.LinkedHashMap j;
    public final java.util.LinkedHashMap k;
    public final java.util.LinkedHashMap l;
    public final java.util.LinkedHashMap m;
    public defpackage.hu3 n;
    public defpackage.ac4 o;
    public final java.util.ArrayList p;
    public defpackage.tt3 q;
    public final defpackage.wb4 r;
    public final defpackage.rd4 s;
    public final java.util.LinkedHashMap t;
    public defpackage.qn2 u;
    public defpackage.xb4 v;
    public final java.util.LinkedHashMap w;
    public int x;
    public final java.util.ArrayList y;
    public final defpackage.of6 z;

    public zb4(defpackage.rc4 r3, defpackage.n10 r4) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            pu r3 = new pu
            r3.<init>()
            r2.f = r3
            yt1 r3 = defpackage.yt1.A
            tp6 r4 = defpackage.up6.a(r3)
            r2.g = r4
            tp6 r3 = defpackage.up6.a(r3)
            r2.h = r3
            de5 r4 = new de5
            r4.<init>(r3)
            r2.i = r4
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.j = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.k = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.l = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.m = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.p = r3
            tt3 r3 = defpackage.tt3.INITIALIZED
            r2.q = r3
            wb4 r3 = new wb4
            r4 = 0
            r3.<init>(r2, r4)
            r2.r = r3
            rd4 r3 = new rd4
            r3.<init>()
            r2.s = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.t = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.w = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.y = r3
            m80 r3 = defpackage.m80.DROP_OLDEST
            r0 = 2
            r1 = 1
            of6 r3 = defpackage.pf6.b(r1, r4, r3, r0)
            r2.z = r3
            return
    }

    public static defpackage.ic4 d(int r2, defpackage.ic4 r3, defpackage.ic4 r4, boolean r5) {
            z9 r0 = r3.B
            int r0 = r0.a
            if (r0 != r2) goto L19
            if (r4 == 0) goto L18
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L19
            mc4 r0 = r3.L
            mc4 r1 = r4.L
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L19
        L18:
            return r3
        L19:
            boolean r0 = r3 instanceof defpackage.mc4
            if (r0 == 0) goto L21
            r0 = r3
            mc4 r0 = (defpackage.mc4) r0
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L29
            mc4 r0 = r3.L
            r0.getClass()
        L29:
            dk0 r3 = r0.Y
            ic4 r2 = r3.o(r2, r0, r4, r5)
            return r2
    }

    public static /* synthetic */ void n(defpackage.zb4 r2, defpackage.sb4 r3) {
            pu r0 = new pu
            r0.<init>()
            r1 = 0
            r2.m(r3, r1, r0)
            return
    }

    public final void a(defpackage.ic4 r17, android.os.Bundle r18, defpackage.sb4 r19, java.util.List r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            rc4 r5 = r0.a
            rh r5 = r5.c
            ic4 r6 = r3.B
            boolean r7 = r6 instanceof defpackage.hj1
            r8 = 0
            r9 = 1
            pu r10 = r0.f
            if (r7 != 0) goto L3c
        L18:
            boolean r7 = r10.isEmpty()
            if (r7 != 0) goto L3c
            java.lang.Object r7 = r10.last()
            sb4 r7 = (defpackage.sb4) r7
            ic4 r7 = r7.B
            boolean r7 = r7 instanceof defpackage.hj1
            if (r7 == 0) goto L3c
            java.lang.Object r7 = r10.last()
            sb4 r7 = (defpackage.sb4) r7
            ic4 r7 = r7.B
            z9 r7 = r7.B
            int r7 = r7.a
            boolean r7 = r0.l(r7, r9, r8)
            if (r7 != 0) goto L18
        L3c:
            pu r7 = new pu
            r7.<init>()
            boolean r11 = r1 instanceof defpackage.mc4
            r12 = 0
            if (r11 == 0) goto L9b
            r11 = r6
        L47:
            r11.getClass()
            mc4 r11 = r11.L
            if (r11 == 0) goto L97
            int r13 = r4.size()
            java.util.ListIterator r13 = r4.listIterator(r13)
        L56:
            boolean r14 = r13.hasPrevious()
            if (r14 == 0) goto L6c
            java.lang.Object r14 = r13.previous()
            r15 = r14
            sb4 r15 = (defpackage.sb4) r15
            ic4 r15 = r15.B
            boolean r15 = defpackage.nb3.k(r15, r11)
            if (r15 == 0) goto L56
            goto L6d
        L6c:
            r14 = r12
        L6d:
            sb4 r14 = (defpackage.sb4) r14
            if (r14 != 0) goto L7b
            tt3 r13 = r0.h()
            ac4 r14 = r0.o
            sb4 r14 = defpackage.x31.r(r5, r11, r2, r13, r14)
        L7b:
            r7.addFirst(r14)
            boolean r13 = r10.isEmpty()
            if (r13 != 0) goto L97
            java.lang.Object r13 = r10.last()
            sb4 r13 = (defpackage.sb4) r13
            ic4 r13 = r13.B
            if (r13 != r11) goto L97
            java.lang.Object r13 = r10.last()
            sb4 r13 = (defpackage.sb4) r13
            n(r0, r13)
        L97:
            if (r11 == 0) goto L9b
            if (r11 != r1) goto L47
        L9b:
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto La3
            r11 = r6
            goto Lab
        La3:
            java.lang.Object r11 = r7.first()
            sb4 r11 = (defpackage.sb4) r11
            ic4 r11 = r11.B
        Lab:
            if (r11 == 0) goto Lfe
            z9 r13 = r11.B
            int r13 = r13.a
            ic4 r13 = r0.c(r13, r11)
            if (r13 == r11) goto Lfe
            mc4 r11 = r11.L
            if (r11 == 0) goto Lfc
            if (r2 == 0) goto Lc5
            boolean r13 = r2.isEmpty()
            if (r13 != r9) goto Lc5
            r13 = r12
            goto Lc6
        Lc5:
            r13 = r2
        Lc6:
            int r14 = r4.size()
            java.util.ListIterator r14 = r4.listIterator(r14)
        Lce:
            boolean r15 = r14.hasPrevious()
            if (r15 == 0) goto Le6
            java.lang.Object r15 = r14.previous()
            r8 = r15
            sb4 r8 = (defpackage.sb4) r8
            ic4 r8 = r8.B
            boolean r8 = defpackage.nb3.k(r8, r11)
            if (r8 == 0) goto Le4
            goto Le7
        Le4:
            r8 = 0
            goto Lce
        Le6:
            r15 = r12
        Le7:
            sb4 r15 = (defpackage.sb4) r15
            if (r15 != 0) goto Lf9
            android.os.Bundle r8 = r11.a(r13)
            tt3 r13 = r0.h()
            ac4 r14 = r0.o
            sb4 r15 = defpackage.x31.r(r5, r11, r8, r13, r14)
        Lf9:
            r7.addFirst(r15)
        Lfc:
            r8 = 0
            goto Lab
        Lfe:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L105
            goto L10d
        L105:
            java.lang.Object r6 = r7.first()
            sb4 r6 = (defpackage.sb4) r6
            ic4 r6 = r6.B
        L10d:
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L146
            java.lang.Object r8 = r10.last()
            sb4 r8 = (defpackage.sb4) r8
            ic4 r8 = r8.B
            boolean r8 = r8 instanceof defpackage.mc4
            if (r8 == 0) goto L146
            java.lang.Object r8 = r10.last()
            sb4 r8 = (defpackage.sb4) r8
            ic4 r8 = r8.B
            r8.getClass()
            mc4 r8 = (defpackage.mc4) r8
            dk0 r8 = r8.Y
            java.lang.Object r8 = r8.X
            un6 r8 = (defpackage.un6) r8
            z9 r9 = r6.B
            int r9 = r9.a
            java.lang.Object r8 = r8.c(r9)
            if (r8 != 0) goto L146
            java.lang.Object r8 = r10.last()
            sb4 r8 = (defpackage.sb4) r8
            n(r0, r8)
            goto L10d
        L146:
            java.lang.Object r6 = r10.f()
            sb4 r6 = (defpackage.sb4) r6
            if (r6 != 0) goto L154
            java.lang.Object r6 = r7.f()
            sb4 r6 = (defpackage.sb4) r6
        L154:
            if (r6 == 0) goto L159
            ic4 r6 = r6.B
            goto L15a
        L159:
            r6 = r12
        L15a:
            mc4 r8 = r0.c
            boolean r6 = defpackage.nb3.k(r6, r8)
            if (r6 != 0) goto L1a4
            int r6 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r6)
        L16a:
            boolean r6 = r4.hasPrevious()
            if (r6 == 0) goto L185
            java.lang.Object r6 = r4.previous()
            r8 = r6
            sb4 r8 = (defpackage.sb4) r8
            ic4 r8 = r8.B
            mc4 r9 = r0.c
            r9.getClass()
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L16a
            r12 = r6
        L185:
            sb4 r12 = (defpackage.sb4) r12
            if (r12 != 0) goto L1a1
            mc4 r4 = r0.c
            r4.getClass()
            mc4 r6 = r0.c
            r6.getClass()
            android.os.Bundle r2 = r6.a(r2)
            tt3 r6 = r0.h()
            ac4 r8 = r0.o
            sb4 r12 = defpackage.x31.r(r5, r4, r2, r6, r8)
        L1a1:
            r7.addFirst(r12)
        L1a4:
            java.util.Iterator r2 = r7.iterator()
        L1a8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1df
            java.lang.Object r4 = r2.next()
            sb4 r4 = (defpackage.sb4) r4
            ic4 r5 = r4.B
            java.lang.String r5 = r5.A
            rd4 r6 = r0.s
            qd4 r5 = r6.b(r5)
            java.util.LinkedHashMap r6 = r0.t
            java.lang.Object r5 = r6.get(r5)
            if (r5 == 0) goto L1cc
            vb4 r5 = (defpackage.vb4) r5
            r5.a(r4)
            goto L1a8
        L1cc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "NavigatorBackStack for "
            r0.<init>(r2)
            java.lang.String r1 = r1.A
            java.lang.String r2 = " should already be created"
            java.lang.String r0 = defpackage.i61.n(r0, r1, r2)
            defpackage.u34.f(r0)
            return
        L1df:
            r10.addAll(r7)
            r10.addLast(r3)
            java.util.ArrayList r1 = defpackage.gt0.U0(r3, r7)
            int r2 = r1.size()
            r8 = 0
        L1ee:
            if (r8 >= r2) goto L20a
            java.lang.Object r3 = r1.get(r8)
            int r8 = r8 + 1
            sb4 r3 = (defpackage.sb4) r3
            ic4 r4 = r3.B
            mc4 r4 = r4.L
            if (r4 == 0) goto L1ee
            z9 r4 = r4.B
            int r4 = r4.a
            sb4 r4 = r0.e(r4)
            r0.j(r3, r4)
            goto L1ee
        L20a:
            return
    }

    public final boolean b() {
            r11 = this;
        L0:
            pu r0 = r11.f
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1e
            java.lang.Object r1 = r0.last()
            sb4 r1 = (defpackage.sb4) r1
            ic4 r1 = r1.B
            boolean r1 = r1 instanceof defpackage.mc4
            if (r1 == 0) goto L1e
            java.lang.Object r0 = r0.last()
            sb4 r0 = (defpackage.sb4) r0
            n(r11, r0)
            goto L0
        L1e:
            java.lang.Object r1 = r0.h()
            sb4 r1 = (defpackage.sb4) r1
            java.util.ArrayList r2 = r11.y
            if (r1 == 0) goto L2b
            r2.add(r1)
        L2b:
            int r3 = r11.x
            r4 = 1
            int r3 = r3 + r4
            r11.x = r3
            r11.r()
            int r3 = r11.x
            int r3 = r3 + (-1)
            r11.x = r3
            r5 = 0
            if (r3 != 0) goto L95
            java.util.ArrayList r3 = defpackage.gt0.m1(r2)
            r2.clear()
            int r2 = r3.size()
            r6 = r5
        L49:
            r7 = 0
            if (r6 >= r2) goto L7c
            java.lang.Object r8 = r3.get(r6)
            int r6 = r6 + 1
            sb4 r8 = (defpackage.sb4) r8
            java.util.ArrayList r9 = r11.p
            java.util.List r9 = defpackage.gt0.k1(r9)
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r9.hasNext()
            if (r10 != 0) goto L6a
            of6 r7 = r11.z
            r7.k(r8)
            goto L49
        L6a:
            java.lang.Object r11 = r9.next()
            if (r11 == 0) goto L74
            defpackage.u34.a()
            return r5
        L74:
            ic4 r11 = r8.B
            uk1 r11 = r8.d0
            r11.c()
            throw r7
        L7c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            tp6 r0 = r11.g
            r0.getClass()
            r0.m(r7, r2)
            java.util.ArrayList r0 = r11.o()
            tp6 r11 = r11.h
            r11.getClass()
            r11.m(r7, r0)
        L95:
            if (r1 == 0) goto L98
            return r4
        L98:
            return r5
    }

    public final defpackage.ic4 c(int r3, defpackage.ic4 r4) {
            r2 = this;
            mc4 r0 = r2.c
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            z9 r1 = r0.B
            int r1 = r1.a
            if (r1 != r3) goto L1c
            if (r4 == 0) goto L1b
            boolean r0 = defpackage.nb3.k(r0, r4)
            if (r0 == 0) goto L1c
            mc4 r0 = r4.L
            if (r0 != 0) goto L1c
            mc4 r2 = r2.c
            return r2
        L1b:
            return r0
        L1c:
            pu r0 = r2.f
            java.lang.Object r0 = r0.h()
            sb4 r0 = (defpackage.sb4) r0
            if (r0 == 0) goto L2a
            ic4 r0 = r0.B
            if (r0 != 0) goto L2f
        L2a:
            mc4 r0 = r2.c
            r0.getClass()
        L2f:
            r2 = 0
            ic4 r2 = d(r3, r0, r4, r2)
            return r2
    }

    public final defpackage.sb4 e(int r4) {
            r3 = this;
            pu r0 = r3.f
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        La:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.previous()
            r2 = r1
            sb4 r2 = (defpackage.sb4) r2
            ic4 r2 = r2.B
            z9 r2 = r2.B
            int r2 = r2.a
            if (r2 != r4) goto La
            goto L21
        L20:
            r1 = 0
        L21:
            sb4 r1 = (defpackage.sb4) r1
            if (r1 == 0) goto L26
            return r1
        L26:
            java.lang.String r0 = "No destination with ID "
            java.lang.String r1 = " is on the NavController's back stack. The current destination is "
            java.lang.StringBuilder r4 = defpackage.xg6.t(r0, r4, r1)
            ic4 r3 = r3.f()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public final defpackage.ic4 f() {
            r0 = this;
            pu r0 = r0.f
            java.lang.Object r0 = r0.h()
            sb4 r0 = (defpackage.sb4) r0
            if (r0 == 0) goto Ld
            ic4 r0 = r0.B
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final defpackage.mc4 g() {
            r0 = this;
            mc4 r0 = r0.c
            if (r0 == 0) goto L8
            r0.getClass()
            return r0
        L8:
            java.lang.String r0 = "You must call setGraph() before calling getGraph()"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    public final defpackage.tt3 h() {
            r1 = this;
            hu3 r0 = r1.n
            if (r0 != 0) goto L7
            tt3 r1 = defpackage.tt3.CREATED
            return r1
        L7:
            tt3 r1 = r1.q
            return r1
    }

    public final defpackage.mc4 i() {
            r1 = this;
            pu r0 = r1.f
            java.lang.Object r0 = r0.h()
            sb4 r0 = (defpackage.sb4) r0
            if (r0 == 0) goto Le
            ic4 r0 = r0.B
            if (r0 != 0) goto L13
        Le:
            mc4 r0 = r1.c
            r0.getClass()
        L13:
            boolean r1 = r0 instanceof defpackage.mc4
            if (r1 == 0) goto L1b
            r1 = r0
            mc4 r1 = (defpackage.mc4) r1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L23
            mc4 r1 = r0.L
            r1.getClass()
        L23:
            return r1
    }

    public final void j(defpackage.sb4 r2, defpackage.sb4 r3) {
            r1 = this;
            java.util.LinkedHashMap r0 = r1.j
            r0.put(r2, r3)
            java.util.LinkedHashMap r1 = r1.k
            java.lang.Object r2 = r1.get(r3)
            if (r2 != 0) goto L15
            tw r2 = new tw
            r2.<init>()
            r1.put(r3, r2)
        L15:
            java.lang.Object r1 = r1.get(r3)
            r1.getClass()
            tw r1 = (defpackage.tw) r1
            java.util.concurrent.atomic.AtomicInteger r1 = r1.a
            r1.incrementAndGet()
            return
    }

    public final void k(defpackage.ic4 r22, android.os.Bundle r23, defpackage.ad4 r24) {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            r1.getClass()
            java.util.LinkedHashMap r3 = r0.t
            java.util.Collection r3 = r3.values()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r4 = r3.hasNext()
            r5 = 1
            if (r4 == 0) goto L25
            java.lang.Object r4 = r3.next()
            vb4 r4 = (defpackage.vb4) r4
            r4.d = r5
            goto L15
        L25:
            zg5 r3 = new zg5
            r3.<init>()
            r4 = -1
            if (r2 == 0) goto L3a
            int r7 = r2.c
            if (r7 == r4) goto L3a
            boolean r8 = r2.d
            boolean r9 = r2.e
            boolean r7 = r0.l(r7, r8, r9)
            goto L3b
        L3a:
            r7 = 0
        L3b:
            android.os.Bundle r8 = r22.a(r23)
            if (r2 == 0) goto L62
            boolean r9 = r2.b
            if (r9 != r5) goto L62
            java.util.LinkedHashMap r9 = r0.l
            z9 r10 = r1.B
            int r10 = r10.a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L62
            z9 r1 = r1.B
            int r1 = r1.a
            boolean r1 = r0.p(r1, r8, r2)
            r3.A = r1
            r5 = 0
            goto L230
        L62:
            if (r2 == 0) goto L206
            boolean r10 = r2.a
            if (r10 != r5) goto L206
            pu r10 = r0.f
            java.lang.Object r10 = r10.h()
            sb4 r10 = (defpackage.sb4) r10
            pu r11 = r0.f
            int r12 = r11.a()
            java.util.ListIterator r11 = r11.listIterator(r12)
        L7a:
            boolean r12 = r11.hasPrevious()
            if (r12 == 0) goto L8f
            java.lang.Object r12 = r11.previous()
            sb4 r12 = (defpackage.sb4) r12
            ic4 r12 = r12.B
            if (r12 != r1) goto L7a
            int r11 = r11.nextIndex()
            goto L90
        L8f:
            r11 = r4
        L90:
            if (r11 != r4) goto L94
            goto L206
        L94:
            boolean r12 = r1 instanceof defpackage.mc4
            if (r12 == 0) goto Lfe
            int r10 = defpackage.mc4.Z
            r10 = r1
            mc4 r10 = (defpackage.mc4) r10
            x84 r12 = new x84
            r13 = 11
            r12.<init>(r13)
            qb6 r10 = defpackage.sb6.Z(r10, r12)
            x84 r12 = new x84
            r13 = 6
            r12.<init>(r13)
            qd2 r13 = new qd2
            r14 = 2
            r13.<init>(r10, r12, r14)
            java.util.List r10 = defpackage.sb6.c0(r13)
            pu r12 = r0.f
            int r12 = r12.L
            int r12 = r12 - r11
            int r13 = r10.size()
            if (r12 == r13) goto Lc5
            goto L206
        Lc5:
            pu r12 = r0.f
            int r13 = r12.L
            java.util.List r12 = r12.subList(r11, r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = defpackage.ht0.v0(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
        Ldc:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto Lf6
            java.lang.Object r14 = r12.next()
            sb4 r14 = (defpackage.sb4) r14
            ic4 r14 = r14.B
            z9 r14 = r14.B
            int r14 = r14.a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            goto Ldc
        Lf6:
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L10e
            goto L206
        Lfe:
            if (r10 == 0) goto L206
            ic4 r10 = r10.B
            if (r10 == 0) goto L206
            z9 r12 = r1.B
            int r12 = r12.a
            z9 r10 = r10.B
            int r10 = r10.a
            if (r12 != r10) goto L206
        L10e:
            pu r10 = new pu
            r10.<init>()
        L113:
            pu r12 = r0.f
            int r12 = defpackage.hf.U(r12)
            if (r12 < r11) goto L16c
            pu r12 = r0.f
            java.lang.Object r12 = defpackage.gt0.Y0(r12)
            sb4 r12 = (defpackage.sb4) r12
            r0.q(r12)
            sb4 r13 = new sb4
            ic4 r14 = r12.B
            r15 = r23
            android.os.Bundle r16 = r14.a(r15)
            rh r14 = r12.A
            ic4 r15 = r12.B
            tt3 r4 = r12.R
            ac4 r5 = r12.X
            java.lang.String r6 = r12.Y
            android.os.Bundle r9 = r12.Z
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            uk1 r4 = r13.d0
            tt3 r5 = r12.R
            r4.getClass()
            r5.getClass()
            r4.f = r5
            uk1 r4 = r13.d0
            uk1 r5 = r12.d0
            java.lang.Object r5 = r5.l
            tt3 r5 = (defpackage.tt3) r5
            r4.getClass()
            r5.getClass()
            r4.l = r5
            r4.f()
            r10.addFirst(r13)
            r4 = -1
            r5 = 1
            goto L113
        L16c:
            java.util.Iterator r4 = r10.iterator()
        L170:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L193
            java.lang.Object r5 = r4.next()
            sb4 r5 = (defpackage.sb4) r5
            ic4 r6 = r5.B
            mc4 r6 = r6.L
            if (r6 == 0) goto L18d
            z9 r6 = r6.B
            int r6 = r6.a
            sb4 r6 = r0.e(r6)
            r0.j(r5, r6)
        L18d:
            pu r6 = r0.f
            r6.addLast(r5)
            goto L170
        L193:
            java.util.Iterator r4 = r10.iterator()
        L197:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L204
            java.lang.Object r5 = r4.next()
            sb4 r5 = (defpackage.sb4) r5
            rd4 r6 = r0.s
            ic4 r9 = r5.B
            java.lang.String r9 = r9.A
            qd4 r6 = r6.b(r9)
            ic4 r9 = r5.B
            if (r9 == 0) goto L1b2
            goto L1b3
        L1b2:
            r9 = 0
        L1b3:
            if (r9 != 0) goto L1b6
            goto L197
        L1b6:
            r6.c(r9)
            vb4 r6 = r6.b()
            q61 r9 = r6.a
            monitor-enter(r9)
            de5 r10 = r6.e     // Catch: java.lang.Throwable -> L1f1
            rp6 r10 = r10.A     // Catch: java.lang.Throwable -> L1f1
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L1f1
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Throwable -> L1f1
            java.util.ArrayList r10 = defpackage.gt0.m1(r10)     // Catch: java.lang.Throwable -> L1f1
            int r11 = r10.size()     // Catch: java.lang.Throwable -> L1f1
            java.util.ListIterator r11 = r10.listIterator(r11)     // Catch: java.lang.Throwable -> L1f1
        L1d6:
            boolean r12 = r11.hasPrevious()     // Catch: java.lang.Throwable -> L1f1
            if (r12 == 0) goto L1f3
            java.lang.Object r12 = r11.previous()     // Catch: java.lang.Throwable -> L1f1
            sb4 r12 = (defpackage.sb4) r12     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r12 = r12.Y     // Catch: java.lang.Throwable -> L1f1
            java.lang.String r13 = r5.Y     // Catch: java.lang.Throwable -> L1f1
            boolean r12 = defpackage.nb3.k(r12, r13)     // Catch: java.lang.Throwable -> L1f1
            if (r12 == 0) goto L1d6
            int r11 = r11.nextIndex()     // Catch: java.lang.Throwable -> L1f1
            goto L1f4
        L1f1:
            r0 = move-exception
            goto L202
        L1f3:
            r11 = -1
        L1f4:
            r10.set(r11, r5)     // Catch: java.lang.Throwable -> L1f1
            tp6 r5 = r6.b     // Catch: java.lang.Throwable -> L1f1
            r5.getClass()     // Catch: java.lang.Throwable -> L1f1
            r6 = 0
            r5.m(r6, r10)     // Catch: java.lang.Throwable -> L1f1
            monitor-exit(r9)
            goto L197
        L202:
            monitor-exit(r9)
            throw r0
        L204:
            r5 = 1
            goto L207
        L206:
            r5 = 0
        L207:
            if (r5 != 0) goto L230
            rc4 r4 = r0.a
            rh r4 = r4.c
            tt3 r6 = r0.h()
            ac4 r9 = r0.o
            sb4 r4 = defpackage.x31.r(r4, r1, r8, r6, r9)
            rd4 r6 = r0.s
            java.lang.String r9 = r1.A
            qd4 r6 = r6.b(r9)
            java.util.List r4 = defpackage.hf.b0(r4)
            cn r9 = new cn
            r9.<init>(r3, r0, r1, r8)
            r0.u = r9
            r6.d(r4, r2)
            r6 = 0
            r0.u = r6
        L230:
            n10 r1 = r0.b
            r1.c()
            java.util.LinkedHashMap r1 = r0.t
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L241:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L251
            java.lang.Object r2 = r1.next()
            vb4 r2 = (defpackage.vb4) r2
            r4 = 0
            r2.d = r4
            goto L241
        L251:
            if (r7 != 0) goto L25e
            boolean r1 = r3.A
            if (r1 != 0) goto L25e
            if (r5 == 0) goto L25a
            goto L25e
        L25a:
            r0.r()
            return
        L25e:
            r0.b()
            return
    }

    public final boolean l(int r16, boolean r17, boolean r18) {
            r15 = this;
            r0 = r16
            pu r6 = r15.f
            boolean r1 = r6.isEmpty()
            r7 = 0
            if (r1 == 0) goto Lc
            return r7
        Lc:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r1 = defpackage.gt0.a1(r6)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            r9 = 0
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            sb4 r2 = (defpackage.sb4) r2
            ic4 r2 = r2.B
            java.lang.String r3 = r2.A
            z9 r4 = r2.B
            rd4 r5 = r15.s
            qd4 r3 = r5.b(r3)
            if (r17 != 0) goto L38
            int r5 = r4.a
            if (r5 == r0) goto L3b
        L38:
            r8.add(r3)
        L3b:
            int r3 = r4.a
            if (r3 != r0) goto L19
            r10 = r2
            goto L42
        L41:
            r10 = r9
        L42:
            if (r10 != 0) goto L67
            int r1 = defpackage.ic4.X
            rc4 r15 = r15.a
            rh r15 = r15.c
            java.lang.String r15 = defpackage.mp2.C(r15, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring popBackStack to destination "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = " as it was not found on the current back stack"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "NavController"
            android.util.Log.i(r0, r15)
            return r7
        L67:
            zg5 r2 = new zg5
            r2.<init>()
            pu r5 = new pu
            r5.<init>()
            int r11 = r8.size()
            r0 = r7
        L76:
            if (r0 >= r11) goto La9
            java.lang.Object r1 = r8.get(r0)
            int r12 = r0 + 1
            r13 = r1
            qd4 r13 = (defpackage.qd4) r13
            zg5 r1 = new zg5
            r1.<init>()
            java.lang.Object r0 = r6.last()
            r14 = r0
            sb4 r14 = (defpackage.sb4) r14
            xb4 r0 = new xb4
            r3 = r15
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r13.getClass()
            r14.getClass()
            r15.v = r0
            r13.e(r14, r4)
            r15.v = r9
            boolean r0 = r1.A
            if (r0 != 0) goto La7
            goto Lab
        La7:
            r0 = r12
            goto L76
        La9:
            r4 = r18
        Lab:
            if (r4 == 0) goto L153
            r0 = 1
            java.util.LinkedHashMap r1 = r15.l
            if (r17 != 0) goto Lf3
            x84 r4 = new x84
            r6 = 4
            r4.<init>(r6)
            qb6 r4 = defpackage.sb6.Z(r10, r4)
            yb4 r6 = new yb4
            r6.<init>(r15, r7)
            qd2 r8 = new qd2
            r8.<init>(r4, r6, r0)
            oc2 r4 = new oc2
            r4.<init>(r8, r7)
        Lcb:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lf3
            java.lang.Object r6 = r4.next()
            ic4 r6 = (defpackage.ic4) r6
            z9 r6 = r6.B
            int r6 = r6.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r8 = r5.f()
            ub4 r8 = (defpackage.ub4) r8
            if (r8 == 0) goto Lee
            aj r8 = r8.a
            java.lang.Object r8 = r8.L
            java.lang.String r8 = (java.lang.String) r8
            goto Lef
        Lee:
            r8 = r9
        Lef:
            r1.put(r6, r8)
            goto Lcb
        Lf3:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L153
            java.lang.Object r4 = r5.first()
            ub4 r4 = (defpackage.ub4) r4
            aj r4 = r4.a
            int r6 = r4.B
            ic4 r6 = r15.c(r6, r9)
            x84 r8 = new x84
            r9 = 5
            r8.<init>(r9)
            qb6 r6 = defpackage.sb6.Z(r6, r8)
            yb4 r8 = new yb4
            r8.<init>(r15, r0)
            qd2 r9 = new qd2
            r9.<init>(r6, r8, r0)
            oc2 r0 = new oc2
            r0.<init>(r9, r7)
        L120:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L13c
            java.lang.Object r6 = r0.next()
            ic4 r6 = (defpackage.ic4) r6
            z9 r6 = r6.B
            int r6 = r6.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r4.L
            java.lang.String r7 = (java.lang.String) r7
            r1.put(r6, r7)
            goto L120
        L13c:
            java.util.Collection r0 = r1.values()
            java.lang.Object r1 = r4.L
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L153
            java.lang.Object r0 = r4.L
            java.lang.String r0 = (java.lang.String) r0
            java.util.LinkedHashMap r1 = r15.m
            r1.put(r0, r5)
        L153:
            n10 r15 = r15.b
            r15.c()
            boolean r15 = r2.A
            return r15
    }

    public final void m(defpackage.sb4 r4, boolean r5, defpackage.pu r6) {
            r3 = this;
            r4.getClass()
            pu r0 = r3.f
            java.lang.Object r1 = r0.last()
            sb4 r1 = (defpackage.sb4) r1
            boolean r2 = defpackage.nb3.k(r1, r4)
            if (r2 == 0) goto L8e
            defpackage.gt0.Y0(r0)
            ic4 r4 = r1.B
            java.lang.String r4 = r4.A
            rd4 r0 = r3.s
            qd4 r4 = r0.b(r4)
            java.util.LinkedHashMap r0 = r3.t
            java.lang.Object r4 = r0.get(r4)
            vb4 r4 = (defpackage.vb4) r4
            r0 = 1
            if (r4 == 0) goto L3e
            de5 r4 = r4.f
            if (r4 == 0) goto L3e
            rp6 r4 = r4.A
            java.lang.Object r4 = r4.getValue()
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L3e
            boolean r4 = r4.contains(r1)
            if (r4 != r0) goto L3e
            goto L48
        L3e:
            java.util.LinkedHashMap r4 = r3.k
            boolean r4 = r4.containsKey(r1)
            if (r4 == 0) goto L47
            goto L48
        L47:
            r0 = 0
        L48:
            uk1 r4 = r1.d0
            java.lang.Object r4 = r4.k
            ku3 r4 = (defpackage.ku3) r4
            tt3 r4 = r4.d
            tt3 r2 = defpackage.tt3.CREATED
            boolean r4 = r4.isAtLeast(r2)
            if (r4 == 0) goto L73
            if (r5 == 0) goto L65
            r1.a(r2)
            ub4 r4 = new ub4
            r4.<init>(r1)
            r6.addFirst(r4)
        L65:
            if (r0 != 0) goto L70
            tt3 r4 = defpackage.tt3.DESTROYED
            r1.a(r4)
            r3.q(r1)
            goto L73
        L70:
            r1.a(r2)
        L73:
            if (r5 != 0) goto L8d
            if (r0 != 0) goto L8d
            ac4 r3 = r3.o
            if (r3 == 0) goto L8d
            java.lang.String r4 = r1.Y
            r4.getClass()
            java.util.LinkedHashMap r3 = r3.b
            java.lang.Object r3 = r3.remove(r4)
            ap7 r3 = (defpackage.ap7) r3
            if (r3 == 0) goto L8d
            r3.a()
        L8d:
            return
        L8e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Attempted to pop "
            r3.<init>(r5)
            ic4 r4 = r4.B
            r3.append(r4)
            ic4 r4 = r1.B
            java.lang.String r5 = ", which is not the top of the back stack ("
            r3.append(r5)
            r3.append(r4)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public final java.util.ArrayList o() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashMap r1 = r7.t
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()
            vb4 r2 = (defpackage.vb4) r2
            de5 r2 = r2.f
            rp6 r2 = r2.A
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r2.next()
            r5 = r4
            sb4 r5 = (defpackage.sb4) r5
            boolean r6 = r0.contains(r5)
            if (r6 != 0) goto L30
            uk1 r5 = r5.d0
            java.lang.Object r5 = r5.l
            tt3 r5 = (defpackage.tt3) r5
            tt3 r6 = defpackage.tt3.STARTED
            boolean r5 = r5.isAtLeast(r6)
            if (r5 != 0) goto L30
            r3.add(r4)
            goto L30
        L55:
            defpackage.gt0.A0(r0, r3)
            goto L11
        L59:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            pu r7 = r7.f
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r7.next()
            r3 = r2
            sb4 r3 = (defpackage.sb4) r3
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L64
            uk1 r3 = r3.d0
            java.lang.Object r3 = r3.l
            tt3 r3 = (defpackage.tt3) r3
            tt3 r4 = defpackage.tt3.STARTED
            boolean r3 = r3.isAtLeast(r4)
            if (r3 == 0) goto L64
            r1.add(r2)
            goto L64
        L89:
            defpackage.gt0.A0(r0, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r1 = r0.size()
            r2 = 0
        L96:
            if (r2 >= r1) goto Lab
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            r4 = r3
            sb4 r4 = (defpackage.sb4) r4
            ic4 r4 = r4.B
            boolean r4 = r4 instanceof defpackage.mc4
            if (r4 != 0) goto L96
            r7.add(r3)
            goto L96
        Lab:
            return r7
    }

    public final boolean p(int r16, android.os.Bundle r17, defpackage.ad4 r18) {
            r15 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.util.LinkedHashMap r1 = r15.l
            boolean r0 = r1.containsKey(r0)
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r1.getClass()
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = defpackage.nb3.k(r3, r0)
            if (r3 != r4) goto L25
            r1.remove()
            goto L25
        L3c:
            java.util.LinkedHashMap r1 = r15.m
            java.util.Map r1 = defpackage.ge7.n(r1)
            java.lang.Object r0 = r1.remove(r0)
            pu r0 = (defpackage.pu) r0
            rc4 r1 = r15.a
            rh r6 = r1.c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            pu r3 = r15.f
            java.lang.Object r3 = r3.h()
            sb4 r3 = (defpackage.sb4) r3
            if (r3 == 0) goto L5f
            ic4 r3 = r3.B
            if (r3 != 0) goto L63
        L5f:
            mc4 r3 = r15.g()
        L63:
            r14 = 0
            if (r0 == 0) goto Lcb
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lcb
            java.lang.Object r5 = r0.next()
            ub4 r5 = (defpackage.ub4) r5
            aj r7 = r5.a
            aj r5 = r5.a
            int r7 = r7.B
            ic4 r7 = d(r7, r3, r14, r4)
            if (r7 == 0) goto Lbb
            tt3 r9 = r15.h()
            ac4 r10 = r15.o
            r6.getClass()
            r9.getClass()
            java.lang.Object r3 = r5.R
            android.os.Bundle r3 = (android.os.Bundle) r3
            if (r3 == 0) goto La3
            android.content.Context r8 = r6.a
            if (r8 == 0) goto L9d
            java.lang.ClassLoader r8 = r8.getClassLoader()
            goto L9e
        L9d:
            r8 = r14
        L9e:
            r3.setClassLoader(r8)
            r8 = r3
            goto La4
        La3:
            r8 = r14
        La4:
            java.lang.Object r3 = r5.L
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r5.X
            r12 = r3
            android.os.Bundle r12 = (android.os.Bundle) r12
            r11.getClass()
            sb4 r5 = new sb4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1.add(r5)
            r3 = r7
            goto L6a
        Lbb:
            int r15 = defpackage.ic4.X
            int r15 = r5.B
            java.lang.String r15 = defpackage.mp2.C(r6, r15)
            java.lang.String r0 = "Restore State failed: destination "
            java.lang.String r1 = " cannot be found from the current destination "
            defpackage.u34.l(r0, r15, r1, r3)
            return r2
        Lcb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.size()
            r5 = r2
        Lda:
            if (r5 >= r4) goto Lef
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            r7 = r6
            sb4 r7 = (defpackage.sb4) r7
            ic4 r7 = r7.B
            boolean r7 = r7 instanceof defpackage.mc4
            if (r7 != 0) goto Lda
            r3.add(r6)
            goto Lda
        Lef:
            int r4 = r3.size()
            r5 = r2
        Lf4:
            if (r5 >= r4) goto L130
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            sb4 r6 = (defpackage.sb4) r6
            java.lang.Object r7 = defpackage.gt0.R0(r0)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L115
            java.lang.Object r8 = defpackage.gt0.Q0(r7)
            sb4 r8 = (defpackage.sb4) r8
            if (r8 == 0) goto L115
            ic4 r8 = r8.B
            if (r8 == 0) goto L115
            java.lang.String r8 = r8.A
            goto L116
        L115:
            r8 = r14
        L116:
            ic4 r9 = r6.B
            java.lang.String r9 = r9.A
            boolean r8 = defpackage.nb3.k(r8, r9)
            if (r8 == 0) goto L124
            r7.add(r6)
            goto Lf4
        L124:
            sb4[] r6 = new defpackage.sb4[]{r6}
            java.util.ArrayList r6 = defpackage.hf.d0(r6)
            r0.add(r6)
            goto Lf4
        L130:
            zg5 r8 = new zg5
            r8.<init>()
            int r3 = r0.size()
        L139:
            if (r2 >= r3) goto L16d
            java.lang.Object r4 = r0.get(r2)
            int r2 = r2 + 1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = defpackage.gt0.H0(r4)
            sb4 r5 = (defpackage.sb4) r5
            ic4 r5 = r5.B
            java.lang.String r5 = r5.A
            rd4 r6 = r15.s
            qd4 r5 = r6.b(r5)
            bh5 r10 = new bh5
            r10.<init>()
            d5 r7 = new d5
            r13 = 6
            r11 = r15
            r12 = r17
            r9 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r15.u = r7
            r1 = r18
            r5.d(r4, r1)
            r15.u = r14
            r1 = r9
            goto L139
        L16d:
            boolean r15 = r8.A
            return r15
    }

    public final void q(defpackage.sb4 r4) {
            r3 = this;
            r4.getClass()
            java.util.LinkedHashMap r0 = r3.j
            java.lang.Object r4 = r0.remove(r4)
            sb4 r4 = (defpackage.sb4) r4
            if (r4 != 0) goto Le
            goto L47
        Le:
            java.util.LinkedHashMap r0 = r3.k
            java.lang.Object r1 = r0.get(r4)
            tw r1 = (defpackage.tw) r1
            if (r1 == 0) goto L23
            java.util.concurrent.atomic.AtomicInteger r1 = r1.a
            int r1 = r1.decrementAndGet()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 != 0) goto L27
            goto L47
        L27:
            int r1 = r1.intValue()
            if (r1 != 0) goto L47
            ic4 r1 = r4.B
            java.lang.String r1 = r1.A
            rd4 r2 = r3.s
            qd4 r1 = r2.b(r1)
            java.util.LinkedHashMap r3 = r3.t
            java.lang.Object r3 = r3.get(r1)
            vb4 r3 = (defpackage.vb4) r3
            if (r3 == 0) goto L44
            r3.c(r4)
        L44:
            r0.remove(r4)
        L47:
            return
    }

    public final void r() {
            r10 = this;
            pu r0 = r10.f
            java.util.ArrayList r0 = defpackage.gt0.m1(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L158
        Le:
            java.lang.Object r1 = defpackage.gt0.Q0(r0)
            sb4 r1 = (defpackage.sb4) r1
            ic4 r1 = r1.B
            ic4[] r1 = new defpackage.ic4[]{r1}
            java.util.ArrayList r1 = defpackage.hf.d0(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r3 = defpackage.gt0.Q0(r1)
            boolean r3 = r3 instanceof defpackage.hj1
            if (r3 == 0) goto L4c
            java.util.List r3 = defpackage.gt0.a1(r0)
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            sb4 r4 = (defpackage.sb4) r4
            ic4 r4 = r4.B
            r2.add(r4)
            boolean r5 = r4 instanceof defpackage.hj1
            if (r5 != 0) goto L33
            boolean r4 = r4 instanceof defpackage.mc4
            if (r4 != 0) goto L33
        L4c:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.List r4 = defpackage.gt0.a1(r0)
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L137
            java.lang.Object r5 = r4.next()
            sb4 r5 = (defpackage.sb4) r5
            uk1 r6 = r5.d0
            java.lang.Object r6 = r6.l
            tt3 r6 = (defpackage.tt3) r6
            ic4 r7 = r5.B
            java.lang.Object r8 = defpackage.gt0.J0(r1)
            ic4 r8 = (defpackage.ic4) r8
            if (r8 == 0) goto Lf4
            z9 r8 = r8.B
            int r8 = r8.a
            z9 r9 = r7.B
            int r9 = r9.a
            if (r8 != r9) goto Lf4
            tt3 r8 = defpackage.tt3.RESUMED
            if (r6 == r8) goto Ld3
            ic4 r6 = r5.B
            java.lang.String r6 = r6.A
            rd4 r9 = r10.s
            qd4 r6 = r9.b(r6)
            java.util.LinkedHashMap r9 = r10.t
            java.lang.Object r6 = r9.get(r6)
            vb4 r6 = (defpackage.vb4) r6
            if (r6 == 0) goto Lae
            de5 r6 = r6.f
            if (r6 == 0) goto Lae
            rp6 r6 = r6.A
            java.lang.Object r6 = r6.getValue()
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto Lae
            boolean r6 = r6.contains(r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto Laf
        Lae:
            r6 = 0
        Laf:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r6 = defpackage.nb3.k(r6, r9)
            if (r6 != 0) goto Lce
            java.util.LinkedHashMap r6 = r10.k
            java.lang.Object r6 = r6.get(r5)
            tw r6 = (defpackage.tw) r6
            if (r6 == 0) goto Lca
            java.util.concurrent.atomic.AtomicInteger r6 = r6.a
            int r6 = r6.get()
            if (r6 != 0) goto Lca
            goto Lce
        Lca:
            r3.put(r5, r8)
            goto Ld3
        Lce:
            tt3 r6 = defpackage.tt3.STARTED
            r3.put(r5, r6)
        Ld3:
            java.lang.Object r5 = defpackage.gt0.J0(r2)
            ic4 r5 = (defpackage.ic4) r5
            if (r5 == 0) goto Le8
            z9 r5 = r5.B
            int r5 = r5.a
            z9 r6 = r7.B
            int r6 = r6.a
            if (r5 != r6) goto Le8
            defpackage.gt0.X0(r2)
        Le8:
            defpackage.gt0.X0(r1)
            mc4 r5 = r7.L
            if (r5 == 0) goto L59
            r1.add(r5)
            goto L59
        Lf4:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L130
            z9 r7 = r7.B
            int r7 = r7.a
            java.lang.Object r8 = defpackage.gt0.H0(r2)
            ic4 r8 = (defpackage.ic4) r8
            z9 r8 = r8.B
            int r8 = r8.a
            if (r7 != r8) goto L130
            java.lang.Object r7 = defpackage.gt0.X0(r2)
            ic4 r7 = (defpackage.ic4) r7
            tt3 r8 = defpackage.tt3.RESUMED
            if (r6 != r8) goto L11a
            tt3 r6 = defpackage.tt3.STARTED
            r5.a(r6)
            goto L121
        L11a:
            tt3 r8 = defpackage.tt3.STARTED
            if (r6 == r8) goto L121
            r3.put(r5, r8)
        L121:
            mc4 r5 = r7.L
            if (r5 == 0) goto L59
            boolean r6 = r2.contains(r5)
            if (r6 != 0) goto L59
            r2.add(r5)
            goto L59
        L130:
            tt3 r6 = defpackage.tt3.CREATED
            r5.a(r6)
            goto L59
        L137:
            int r10 = r0.size()
            r1 = 0
        L13c:
            if (r1 >= r10) goto L158
            java.lang.Object r2 = r0.get(r1)
            int r1 = r1 + 1
            sb4 r2 = (defpackage.sb4) r2
            java.lang.Object r4 = r3.get(r2)
            tt3 r4 = (defpackage.tt3) r4
            if (r4 == 0) goto L152
            r2.a(r4)
            goto L13c
        L152:
            uk1 r2 = r2.d0
            r2.f()
            goto L13c
        L158:
            return
    }
}
