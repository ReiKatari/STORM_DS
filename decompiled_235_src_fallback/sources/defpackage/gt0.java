package defpackage;
/* renamed from: gt0  reason: default package */
/* loaded from: classes.dex */
public abstract class gt0 extends defpackage.jt0 {
    public static void A0(java.util.Collection r1, java.lang.Iterable r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            return
        L10:
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L14
        L22:
            return
    }

    public static defpackage.ev B0(java.lang.Iterable r2) {
            r2.getClass()
            ev r0 = new ev
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    public static boolean C0(java.lang.Iterable r1, java.lang.Object r2) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.contains(r2)
            return r1
        Le:
            int r1 = L0(r1, r2)
            if (r1 < 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static java.util.List D0(java.lang.Iterable r3, int r4) {
            r3.getClass()
            r0 = 0
            if (r4 < 0) goto La7
            if (r4 != 0) goto Ld
            java.util.List r3 = k1(r3)
            return r3
        Ld:
            boolean r1 = r3 instanceof java.util.Collection
            if (r1 == 0) goto L85
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 - r4
            if (r1 > 0) goto L1e
            yt1 r3 = defpackage.yt1.A
            return r3
        L1e:
            r2 = 1
            if (r1 != r2) goto L51
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L2c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = Q0(r3)
            goto L46
        L2c:
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
        L3a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r4 = r3.next()
            goto L3a
        L45:
            r3 = r4
        L46:
            java.util.List r3 = defpackage.hf.b0(r3)
            return r3
        L4b:
            java.lang.String r3 = "Collection is empty."
            defpackage.fa6.e(r3)
            return r0
        L51:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L8a
            boolean r1 = r3 instanceof java.util.RandomAccess
            if (r1 == 0) goto L70
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
        L64:
            if (r4 >= r1) goto L84
            java.lang.Object r2 = r3.get(r4)
            r0.add(r2)
            int r4 = r4 + 1
            goto L64
        L70:
            java.util.List r3 = (java.util.List) r3
            java.util.ListIterator r3 = r3.listIterator(r4)
        L76:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L84
            java.lang.Object r4 = r3.next()
            r0.add(r4)
            goto L76
        L84:
            return r0
        L85:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L8a:
            java.util.Iterator r3 = r3.iterator()
            r1 = 0
        L8f:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto La2
            java.lang.Object r2 = r3.next()
            if (r1 < r4) goto L9f
            r0.add(r2)
            goto L8f
        L9f:
            int r1 = r1 + 1
            goto L8f
        La2:
            java.util.List r3 = defpackage.hf.f0(r0)
            return r3
        La7:
            java.lang.String r3 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r3 = defpackage.lb1.k(r3, r4, r1)
            defpackage.i.f(r3)
            return r0
    }

    public static java.util.List E0(java.util.List r1) {
            int r0 = r1.size()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L9
            r0 = 0
        L9:
            java.util.List r1 = e1(r1, r0)
            return r1
    }

    public static final boolean F0(java.lang.Iterable r2, defpackage.qn2 r3, boolean r4) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = r3.g(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r4) goto L5
            r2.remove()
            r0 = 1
            goto L5
        L20:
            return r0
    }

    public static java.lang.Object G0(java.lang.Iterable r1) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = H0(r1)
            return r1
        Le:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r1 = r1.next()
            return r1
        L1d:
            java.lang.String r1 = "Collection is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object H0(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        Lf:
            java.lang.String r1 = "List is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object I0(java.lang.Iterable r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L13
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            goto L1d
        Ld:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        L13:
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            java.lang.Object r1 = r1.next()
            return r1
    }

    public static java.lang.Object J0(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static java.lang.Object K0(int r1, java.util.List r2) {
            r2.getClass()
            if (r1 < 0) goto L10
            int r0 = r2.size()
            if (r1 >= r0) goto L10
            java.lang.Object r1 = r2.get(r1)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static int L0(java.lang.Iterable r2, java.lang.Object r3) {
            r2.getClass()
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Le
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.indexOf(r3)
            return r2
        Le:
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r2.next()
            if (r0 < 0) goto L29
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L26
            return r0
        L26:
            int r0 = r0 + 1
            goto L13
        L29:
            defpackage.hf.q0()
            r2 = 0
            throw r2
        L2e:
            r2 = -1
            return r2
    }

    public static java.util.LinkedHashSet M0(java.lang.Iterable r3, java.lang.Iterable r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto Ld
            java.util.Collection r4 = (java.util.Collection) r4
            goto L11
        Ld:
            java.util.List r4 = k1(r4)
        L11:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r3.next()
            boolean r2 = r4.contains(r1)
            if (r2 == 0) goto L1a
            r0.add(r1)
            goto L1a
        L2e:
            return r0
    }

    public static final void N0(java.lang.Iterable r2, java.lang.StringBuilder r3, java.lang.CharSequence r4, java.lang.CharSequence r5, java.lang.CharSequence r6, int r7, java.lang.CharSequence r8, defpackage.qn2 r9) {
            r2.getClass()
            r3.append(r5)
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            int r5 = r5 + 1
            r1 = 1
            if (r5 <= r1) goto L1d
            r3.append(r4)
        L1d:
            if (r7 < 0) goto L21
            if (r5 > r7) goto L25
        L21:
            defpackage.hi2.s(r3, r0, r9)
            goto Lb
        L25:
            if (r7 < 0) goto L2c
            if (r5 <= r7) goto L2c
            r3.append(r8)
        L2c:
            r3.append(r6)
            return
    }

    public static /* synthetic */ void O0(java.util.List r8, java.lang.StringBuilder r9, java.lang.String r10, defpackage.k0 r11, int r12) {
            r12 = r12 & 64
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r7 = r11
            java.lang.String r3 = ""
            r5 = -1
            java.lang.String r6 = "..."
            r4 = r3
            r0 = r8
            r1 = r9
            r2 = r10
            N0(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static java.lang.String P0(java.lang.Iterable r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, defpackage.qn2 r12, int r13) {
            r0 = r13 & 1
            if (r0 == 0) goto L6
            java.lang.String r9 = ", "
        L6:
            r2 = r9
            r9 = r13 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto Lf
            r3 = r0
            goto L10
        Lf:
            r3 = r10
        L10:
            r9 = r13 & 4
            if (r9 == 0) goto L16
            r4 = r0
            goto L17
        L16:
            r4 = r11
        L17:
            r9 = r13 & 8
            if (r9 == 0) goto L1e
            r9 = -1
        L1c:
            r5 = r9
            goto L20
        L1e:
            r9 = 5
            goto L1c
        L20:
            r9 = r13 & 32
            if (r9 == 0) goto L25
            r12 = 0
        L25:
            r7 = r12
            r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "..."
            r0 = r8
            N0(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = r1.toString()
            return r8
    }

    public static java.lang.Object Q0(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
        L14:
            java.lang.String r1 = "List is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object R0(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            r1 = 0
            return r1
        Lb:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    public static java.lang.Comparable S0(java.util.ArrayList r3) {
            java.util.Iterator r3 = r3.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            java.lang.Object r0 = r3.next()
            java.lang.Comparable r0 = (java.lang.Comparable) r0
        L12:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L12
            r0 = r1
            goto L12
        L26:
            return r0
    }

    public static java.util.ArrayList T0(java.util.List r6, java.lang.Object r7) {
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = r1
        L14:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r6.next()
            r4 = 1
            if (r2 != 0) goto L29
            boolean r5 = defpackage.nb3.k(r3, r7)
            if (r5 == 0) goto L29
            r2 = r4
            r4 = r1
        L29:
            if (r4 == 0) goto L14
            r0.add(r3)
            goto L14
        L2f:
            return r0
    }

    public static java.util.ArrayList U0(java.lang.Object r2, java.util.Collection r3) {
            r3.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            r0.addAll(r3)
            r0.add(r2)
            return r0
    }

    public static java.util.ArrayList V0(java.util.Collection r3, java.lang.Iterable r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L21
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            java.util.Collection r4 = (java.util.Collection) r4
            int r2 = r4.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r3)
            r0.addAll(r4)
            return r0
        L21:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            A0(r0, r4)
            return r0
    }

    public static boolean W0(java.util.List r7, defpackage.qn2 r8) {
            r7.getClass()
            r8.getClass()
            boolean r0 = r7 instanceof java.util.RandomAccess
            r1 = 1
            if (r0 != 0) goto L20
            boolean r0 = r7 instanceof defpackage.zf3
            if (r0 == 0) goto L1b
            boolean r0 = r7 instanceof defpackage.ag3
            if (r0 == 0) goto L14
            goto L1b
        L14:
            java.lang.String r8 = "kotlin.collections.MutableIterable"
            defpackage.ge7.X(r7, r8)
            r7 = 0
            throw r7
        L1b:
            boolean r7 = F0(r7, r8, r1)
            return r7
        L20:
            int r0 = defpackage.hf.U(r7)
            r2 = 0
            if (r0 < 0) goto L46
            r3 = r2
            r4 = r3
        L29:
            java.lang.Object r5 = r7.get(r3)
            java.lang.Object r6 = r8.g(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r1) goto L3a
            goto L41
        L3a:
            if (r4 == r3) goto L3f
            r7.set(r4, r5)
        L3f:
            int r4 = r4 + 1
        L41:
            if (r3 == r0) goto L47
            int r3 = r3 + 1
            goto L29
        L46:
            r4 = r2
        L47:
            int r8 = r7.size()
            if (r4 >= r8) goto L5d
            int r8 = r7.size()
            int r8 = r8 - r1
            if (r4 > r8) goto L5c
        L54:
            r7.remove(r8)
            if (r8 == r4) goto L5c
            int r8 = r8 + (-1)
            goto L54
        L5c:
            return r1
        L5d:
            return r2
    }

    public static java.lang.Object X0(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lf
            r0 = 0
            java.lang.Object r1 = r1.remove(r0)
            return r1
        Lf:
            java.lang.String r1 = "List is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object Y0(java.util.List r1) {
            r1.getClass()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L14
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
        L14:
            java.lang.String r1 = "List is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object Z0(java.util.AbstractList r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
    }

    public static java.util.List a1(java.lang.Iterable r2) {
            r2.getClass()
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L16
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto L16
            java.util.List r2 = k1(r2)
            return r2
        L16:
            java.util.List r2 = n1(r2)
            java.util.Collections.reverse(r2)
            return r2
    }

    public static java.lang.Object b1(java.util.List r3) {
            r3.getClass()
            int r0 = r3.size()
            r1 = 0
            if (r0 == 0) goto L19
            r2 = 1
            if (r0 != r2) goto L13
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            return r3
        L13:
            java.lang.String r3 = "List has more than one element."
            defpackage.i.h(r3)
            return r1
        L19:
            java.lang.String r3 = "List is empty."
            defpackage.fa6.e(r3)
            return r1
    }

    public static java.util.List c1(java.lang.Iterable r3) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L2e
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L16
            java.util.List r3 = k1(r3)
            return r3
        L16:
            r3 = 0
            java.lang.Comparable[] r3 = new java.lang.Comparable[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r0 = r3
            java.lang.Comparable[] r0 = (java.lang.Comparable[]) r0
            r0.getClass()
            int r1 = r0.length
            if (r1 <= r2) goto L29
            java.util.Arrays.sort(r0)
        L29:
            java.util.List r3 = defpackage.fv.l0(r3)
            return r3
        L2e:
            java.util.List r3 = n1(r3)
            defpackage.jt0.w0(r3)
            return r3
    }

    public static java.util.List d1(java.lang.Iterable r3, java.util.Comparator r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L31
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r2 = 1
            if (r1 > r2) goto L19
            java.util.List r3 = k1(r3)
            return r3
        L19:
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            r3.getClass()
            int r0 = r3.length
            if (r0 <= r2) goto L29
            java.util.Arrays.sort(r3, r4)
        L29:
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
            return r3
        L31:
            java.util.List r3 = n1(r3)
            defpackage.jt0.x0(r3, r4)
            return r3
    }

    public static java.util.List e1(java.lang.Iterable r4, int r5) {
            r4.getClass()
            if (r5 < 0) goto L47
            if (r5 != 0) goto La
            yt1 r4 = defpackage.yt1.A
            return r4
        La:
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L28
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            if (r5 < r0) goto L1d
            java.util.List r4 = k1(r4)
            return r4
        L1d:
            if (r5 != r1) goto L28
            java.lang.Object r4 = G0(r4)
            java.util.List r4 = defpackage.hf.b0(r4)
            return r4
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
            r2 = 0
        L32:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r4.next()
            r0.add(r3)
            int r2 = r2 + r1
            if (r2 != r5) goto L32
        L42:
            java.util.List r4 = defpackage.hf.f0(r0)
            return r4
        L47:
            java.lang.String r4 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r4 = defpackage.lb1.k(r4, r5, r0)
            defpackage.i.f(r4)
            r4 = 0
            return r4
    }

    public static java.util.List f1(int r3, java.util.List r4) {
            if (r3 < 0) goto L49
            if (r3 != 0) goto L7
            yt1 r3 = defpackage.yt1.A
            return r3
        L7:
            int r0 = r4.size()
            if (r3 < r0) goto L12
            java.util.List r3 = k1(r4)
            return r3
        L12:
            r1 = 1
            if (r3 != r1) goto L1e
            java.lang.Object r3 = Q0(r4)
            java.util.List r3 = defpackage.hf.b0(r3)
            return r3
        L1e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            boolean r2 = r4 instanceof java.util.RandomAccess
            if (r2 == 0) goto L35
            int r3 = r0 - r3
        L29:
            if (r3 >= r0) goto L48
            java.lang.Object r2 = r4.get(r3)
            r1.add(r2)
            int r3 = r3 + 1
            goto L29
        L35:
            int r0 = r0 - r3
            java.util.ListIterator r3 = r4.listIterator(r0)
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r3.next()
            r1.add(r4)
            goto L3a
        L48:
            return r1
        L49:
            java.lang.String r4 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = defpackage.lb1.k(r4, r3, r0)
            defpackage.i.f(r3)
            r3 = 0
            return r3
    }

    public static boolean[] g1(java.util.List r4) {
            r4.getClass()
            int r0 = r4.size()
            boolean[] r0 = new boolean[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto Le
        L24:
            return r0
    }

    public static final void h1(java.lang.Iterable r1, java.util.AbstractCollection r2) {
            r1.getClass()
            java.util.Iterator r1 = r1.iterator()
        L7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L7
        L15:
            return
    }

    public static float[] i1(java.util.List r4) {
            r4.getClass()
            int r0 = r4.size()
            float[] r0 = new float[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto Le
        L24:
            return r0
    }

    public static int[] j1(java.util.List r4) {
            r4.getClass()
            int r0 = r4.size()
            int[] r0 = new int[r0]
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r1 + 1
            r0[r1] = r2
            r1 = r3
            goto Le
        L24:
            return r0
    }

    public static java.util.List k1(java.lang.Iterable r3) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L35
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            if (r1 == 0) goto L32
            r2 = 1
            if (r1 == r2) goto L19
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
        L19:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L25
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L2d
        L25:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
        L2d:
            java.util.List r3 = defpackage.hf.b0(r3)
            return r3
        L32:
            yt1 r3 = defpackage.yt1.A
            return r3
        L35:
            java.util.List r3 = n1(r3)
            java.util.List r3 = defpackage.hf.f0(r3)
            return r3
    }

    public static long[] l1(java.util.Collection r5) {
            r5.getClass()
            int r0 = r5.size()
            long[] r0 = new long[r0]
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r5.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r4 = r1 + 1
            r0[r1] = r2
            r1 = r4
            goto Le
        L24:
            return r0
    }

    public static java.util.ArrayList m1(java.util.Collection r1) {
            r1.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    public static final java.util.List n1(java.lang.Iterable r1) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            h1(r1, r0)
            return r0
    }

    public static java.util.Set o1(java.lang.Iterable r1) {
            r1.getClass()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Lf
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            return r0
        Lf:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            h1(r1, r0)
            return r0
    }

    public static java.util.Set p1(java.lang.Iterable r3) {
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L3d
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r2 = r0.size()
            if (r2 == 0) goto L5b
            if (r2 == r1) goto L24
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r0 = r0.size()
            int r0 = defpackage.c14.k0(r0)
            r1.<init>(r0)
            h1(r3, r1)
            return r1
        L24:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L30
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            goto L38
        L30:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
        L38:
            java.util.Set r3 = defpackage.ii2.R(r3)
            return r3
        L3d:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            h1(r3, r0)
            int r3 = r0.size()
            if (r3 == 0) goto L5b
            if (r3 == r1) goto L4e
            return r0
        L4e:
            java.util.Iterator r3 = r0.iterator()
            java.lang.Object r3 = r3.next()
            java.util.Set r3 = defpackage.ii2.R(r3)
            return r3
        L5b:
            du1 r3 = defpackage.du1.A
            return r3
    }

    public static java.util.ArrayList q1(java.util.List r4, java.util.List r5) {
            r5.getClass()
            java.util.Iterator r0 = r4.iterator()
            java.util.Iterator r1 = r5.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = defpackage.ht0.v0(r4, r3)
            int r5 = defpackage.ht0.v0(r5, r3)
            int r4 = java.lang.Math.min(r4, r5)
            r2.<init>(r4)
        L1e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3b
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r0.next()
            java.lang.Object r5 = r1.next()
            vr4 r3 = new vr4
            r3.<init>(r4, r5)
            r2.add(r3)
            goto L1e
        L3b:
            return r2
    }

    public static final int y0(int r4, java.util.List r5) {
            r0 = 1
            if (r4 < 0) goto L11
            int r1 = r5.size()
            int r1 = r1 - r0
            if (r4 > r1) goto L11
            int r5 = r5.size()
            int r5 = r5 - r0
            int r5 = r5 - r4
            return r5
        L11:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Element index "
            java.lang.String r3 = " must be in range ["
            java.lang.StringBuilder r4 = defpackage.xg6.t(r2, r4, r3)
            l93 r2 = new l93
            int r5 = r5.size()
            int r5 = r5 - r0
            r3 = 0
            r2.<init>(r3, r5, r0)
            r4.append(r2)
            java.lang.String r5 = "]."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
    }

    public static final int z0(int r4, java.util.List r5) {
            if (r4 < 0) goto Le
            int r0 = r5.size()
            if (r4 > r0) goto Le
            int r5 = r5.size()
            int r5 = r5 - r4
            return r5
        Le:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Position index "
            java.lang.String r2 = " must be in range ["
            java.lang.StringBuilder r4 = defpackage.xg6.t(r1, r4, r2)
            l93 r1 = new l93
            int r5 = r5.size()
            r2 = 1
            r3 = 0
            r1.<init>(r3, r5, r2)
            r4.append(r1)
            java.lang.String r5 = "]."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
