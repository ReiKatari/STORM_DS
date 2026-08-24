package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua4  reason: default package */
/* loaded from: classes.dex */
public final class ua4 implements java.util.RandomAccess {
    public java.lang.Object[] A;
    public defpackage.aa4 B;
    public int L;

    public ua4(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r1 = 0
            r0.L = r1
            return
    }

    public final void a(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.L
            int r0 = r0 + 1
            java.lang.Object[] r1 = r3.A
            int r1 = r1.length
            if (r1 >= r0) goto Lc
            r3.n(r0)
        Lc:
            java.lang.Object[] r0 = r3.A
            int r1 = r3.L
            if (r4 == r1) goto L18
            int r2 = r4 + 1
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r4, r0, r2, r1)
        L18:
            r0[r4] = r5
            int r4 = r3.L
            int r4 = r4 + 1
            r3.L = r4
            return
    }

    public final void b(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.L
            int r0 = r0 + 1
            java.lang.Object[] r1 = r2.A
            int r1 = r1.length
            if (r1 >= r0) goto Lc
            r2.n(r0)
        Lc:
            java.lang.Object[] r0 = r2.A
            int r1 = r2.L
            r0[r1] = r3
            int r1 = r1 + 1
            r2.L = r1
            return
    }

    public final void c(int r5, defpackage.ua4 r6) {
            r4 = this;
            int r0 = r6.L
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r4.L
            int r1 = r1 + r0
            java.lang.Object[] r2 = r4.A
            int r2 = r2.length
            if (r2 >= r1) goto L10
            r4.n(r1)
        L10:
            java.lang.Object[] r1 = r4.A
            int r2 = r4.L
            if (r5 == r2) goto L1c
            int r3 = r5 + r0
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r5, r1, r3, r2)
        L1c:
            java.lang.Object[] r6 = r6.A
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r5, r0)
            int r5 = r4.L
            int r5 = r5 + r0
            r4.L = r5
            return
    }

    public final void d(int r7, java.util.List r8) {
            r6 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r8.size()
            int r1 = r6.L
            int r1 = r1 + r0
            java.lang.Object[] r2 = r6.A
            int r2 = r2.length
            if (r2 >= r1) goto L16
            r6.n(r1)
        L16:
            java.lang.Object[] r1 = r6.A
            int r2 = r6.L
            if (r7 == r2) goto L22
            int r3 = r7 + r0
            int r2 = r2 - r7
            java.lang.System.arraycopy(r1, r7, r1, r3, r2)
        L22:
            int r2 = r8.size()
            r3 = 0
        L27:
            if (r3 >= r2) goto L34
            int r4 = r7 + r3
            java.lang.Object r5 = r8.get(r3)
            r1[r4] = r5
            int r3 = r3 + 1
            goto L27
        L34:
            int r7 = r6.L
            int r7 = r7 + r0
            r6.L = r7
            return
    }

    public final boolean e(int r6, java.util.Collection r7) {
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r7.size()
            int r2 = r5.L
            int r2 = r2 + r0
            java.lang.Object[] r3 = r5.A
            int r3 = r3.length
            if (r3 >= r2) goto L17
            r5.n(r2)
        L17:
            java.lang.Object[] r2 = r5.A
            int r3 = r5.L
            if (r6 == r3) goto L23
            int r4 = r6 + r0
            int r3 = r3 - r6
            java.lang.System.arraycopy(r2, r6, r2, r4, r3)
        L23:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L29:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r7.next()
            int r4 = r1 + 1
            if (r1 < 0) goto L3c
            int r1 = r1 + r6
            r2[r1] = r3
            r1 = r4
            goto L29
        L3c:
            defpackage.hf.q0()
            r5 = 0
            throw r5
        L41:
            int r6 = r5.L
            int r6 = r6 + r0
            r5.L = r6
            r5 = 1
            return r5
    }

    public final java.util.List f() {
            r2 = this;
            aa4 r0 = r2.B
            if (r0 != 0) goto Lc
            aa4 r0 = new aa4
            r1 = 1
            r0.<init>(r2, r1)
            r2.B = r0
        Lc:
            return r0
    }

    public final void g() {
            r5 = this;
            java.lang.Object[] r0 = r5.A
            int r1 = r5.L
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r1) goto Le
            r4 = 0
            r0[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.L = r2
            return
    }

    public final boolean h(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.L
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r0 < 0) goto L18
            r3 = r2
        L8:
            java.lang.Object[] r4 = r5.A
            r4 = r4[r3]
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L13
            return r1
        L13:
            if (r3 == r0) goto L18
            int r3 = r3 + 1
            goto L8
        L18:
            return r2
    }

    public final int i(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.A
            int r3 = r3.L
            r1 = 0
        L5:
            if (r1 >= r3) goto L13
            r2 = r0[r1]
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 == 0) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L5
        L13:
            r3 = -1
            return r3
    }

    public final boolean j(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.i(r1)
            if (r1 < 0) goto Lb
            r0.l(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final java.lang.Object l(int r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.A
            r1 = r0[r5]
            int r2 = r4.L
            int r3 = r2 + (-1)
            if (r5 == r3) goto L10
            int r3 = r5 + 1
            int r2 = r2 - r3
            java.lang.System.arraycopy(r0, r3, r0, r5, r2)
        L10:
            int r5 = r4.L
            int r5 = r5 + (-1)
            r4.L = r5
            r4 = 0
            r0[r5] = r4
            return r1
    }

    public final void m(int r4, int r5) {
            r3 = this;
            if (r5 <= r4) goto L22
            int r0 = r3.L
            if (r5 >= r0) goto Lc
            java.lang.Object[] r1 = r3.A
            int r0 = r0 - r5
            java.lang.System.arraycopy(r1, r5, r1, r4, r0)
        Lc:
            int r0 = r3.L
            int r5 = r5 - r4
            int r4 = r0 - r5
            int r0 = r0 + (-1)
            if (r4 > r0) goto L20
            r5 = r4
        L16:
            java.lang.Object[] r1 = r3.A
            r2 = 0
            r1[r5] = r2
            if (r5 == r0) goto L20
            int r5 = r5 + 1
            goto L16
        L20:
            r3.L = r4
        L22:
            return
    }

    public final void n(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.A
            int r1 = r0.length
            int r2 = r1 * 2
            int r4 = java.lang.Math.max(r4, r2)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.A = r4
            return
    }
}
