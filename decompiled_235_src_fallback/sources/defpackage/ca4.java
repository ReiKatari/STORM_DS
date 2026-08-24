package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca4  reason: default package */
/* loaded from: classes.dex */
public final class ca4 {
    public java.lang.Object[] a;
    public int b;
    public defpackage.aa4 c;

    public /* synthetic */ ca4() {
            r1 = this;
            r0 = 16
            r1.<init>(r0)
            return
    }

    public ca4(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L8
            java.lang.Object[] r1 = defpackage.uh4.a
            goto La
        L8:
            java.lang.Object[] r1 = new java.lang.Object[r1]
        La:
            r0.a = r1
            return
    }

    public final void a(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.b
            int r0 = r0 + 1
            java.lang.Object[] r1 = r3.a
            int r2 = r1.length
            if (r2 >= r0) goto Lc
            r3.m(r0, r1)
        Lc:
            java.lang.Object[] r0 = r3.a
            int r1 = r3.b
            r0[r1] = r4
            int r1 = r1 + 1
            r3.b = r1
            return
    }

    public final void b(defpackage.ca4 r6) {
            r5 = this;
            r6.getClass()
            boolean r0 = r6.h()
            if (r0 == 0) goto La
            goto L2a
        La:
            int r0 = r5.b
            int r1 = r6.b
            int r0 = r0 + r1
            java.lang.Object[] r1 = r5.a
            int r2 = r1.length
            if (r2 >= r0) goto L17
            r5.m(r0, r1)
        L17:
            java.lang.Object[] r0 = r5.a
            java.lang.Object[] r1 = r6.a
            int r2 = r5.b
            int r3 = r6.b
            r4 = 0
            defpackage.fv.t0(r1, r0, r2, r4, r3)
            int r0 = r5.b
            int r6 = r6.b
            int r0 = r0 + r6
            r5.b = r0
        L2a:
            return
    }

    public final void c(java.util.List r7) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            goto L33
        L7:
            int r0 = r6.b
            int r1 = r7.size()
            int r1 = r1 + r0
            java.lang.Object[] r2 = r6.a
            int r3 = r2.length
            if (r3 >= r1) goto L16
            r6.m(r1, r2)
        L16:
            java.lang.Object[] r1 = r6.a
            int r2 = r7.size()
            r3 = 0
        L1d:
            if (r3 >= r2) goto L2a
            int r4 = r3 + r0
            java.lang.Object r5 = r7.get(r3)
            r1[r4] = r5
            int r3 = r3 + 1
            goto L1d
        L2a:
            int r0 = r6.b
            int r7 = r7.size()
            int r7 = r7 + r0
            r6.b = r7
        L33:
            return
    }

    public final void d() {
            r4 = this;
            java.lang.Object[] r0 = r4.a
            int r1 = r4.b
            r2 = 0
            r3 = 0
            defpackage.fv.z0(r2, r1, r3, r0)
            r4.b = r2
            return
    }

    public final java.lang.Object e() {
            r1 = this;
            boolean r0 = r1.h()
            if (r0 != 0) goto Lc
            java.lang.Object[] r1 = r1.a
            r0 = 0
            r1 = r1[r0]
            return r1
        Lc:
            java.lang.String r1 = "ObjectList is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ca4
            r1 = 0
            if (r0 == 0) goto L2e
            ca4 r6 = (defpackage.ca4) r6
            int r0 = r6.b
            int r2 = r5.b
            if (r0 == r2) goto Le
            goto L2e
        Le:
            java.lang.Object[] r5 = r5.a
            java.lang.Object[] r6 = r6.a
            l93 r0 = defpackage.gi2.R(r1, r2)
            int r2 = r0.A
            int r0 = r0.B
            if (r2 > r0) goto L2c
        L1c:
            r3 = r5[r2]
            r4 = r6[r2]
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L27
            return r1
        L27:
            if (r2 == r0) goto L2c
            int r2 = r2 + 1
            goto L1c
        L2c:
            r5 = 1
            return r5
        L2e:
            return r1
    }

    public final java.lang.Object f(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.b
            if (r2 >= r0) goto Lb
            java.lang.Object[] r1 = r1.a
            r1 = r1[r2]
            return r1
        Lb:
            r1.o(r2)
            r1 = 0
            throw r1
    }

    public final int g(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.a
            r1 = 0
            if (r4 != 0) goto L11
            int r3 = r3.b
        L7:
            if (r1 >= r3) goto L21
            r4 = r0[r1]
            if (r4 != 0) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L7
        L11:
            int r3 = r3.b
        L13:
            if (r1 >= r3) goto L21
            r2 = r0[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1e
            return r1
        L1e:
            int r1 = r1 + 1
            goto L13
        L21:
            r3 = -1
            return r3
    }

    public final boolean h() {
            r0 = this;
            int r0 = r0.b
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r5 = this;
            java.lang.Object[] r0 = r5.a
            int r5 = r5.b
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r5) goto L19
            r4 = r0[r2]
            if (r4 == 0) goto L12
            int r4 = r4.hashCode()
            goto L13
        L12:
            r4 = r1
        L13:
            int r4 = r4 * 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L7
        L19:
            return r3
    }

    public final boolean i() {
            r0 = this;
            int r0 = r0.b
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean j(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.g(r1)
            if (r1 < 0) goto Lb
            r0.k(r1)
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final java.lang.Object k(int r6) {
            r5 = this;
            r0 = 0
            if (r6 < 0) goto L1d
            int r1 = r5.b
            if (r6 >= r1) goto L1d
            java.lang.Object[] r2 = r5.a
            r3 = r2[r6]
            int r4 = r1 + (-1)
            if (r6 == r4) goto L14
            int r4 = r6 + 1
            defpackage.fv.t0(r2, r2, r6, r4, r1)
        L14:
            int r6 = r5.b
            int r6 = r6 + (-1)
            r5.b = r6
            r2[r6] = r0
            return r3
        L1d:
            r5.o(r6)
            throw r0
    }

    public final void l(int r4, int r5) {
            r3 = this;
            java.lang.String r0 = "Start ("
            if (r4 < 0) goto L44
            int r1 = r3.b
            if (r4 > r1) goto L44
            if (r5 < 0) goto L44
            if (r5 > r1) goto L44
            if (r5 < r4) goto L25
            if (r5 == r4) goto L24
            if (r5 >= r1) goto L17
            java.lang.Object[] r0 = r3.a
            defpackage.fv.t0(r0, r0, r4, r5, r1)
        L17:
            int r0 = r3.b
            int r5 = r5 - r4
            int r4 = r0 - r5
            java.lang.Object[] r5 = r3.a
            r1 = 0
            defpackage.fv.z0(r4, r0, r1, r5)
            r3.b = r4
        L24:
            return
        L25:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = ") is more than end ("
            r3.append(r4)
            r3.append(r5)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        L44:
            java.lang.String r1 = ") and end ("
            java.lang.String r2 = ") must be in 0.."
            java.lang.StringBuilder r4 = defpackage.i61.q(r4, r5, r0, r1, r2)
            int r3 = r3.b
            defpackage.u34.q(r4, r3)
            return
    }

    public final void m(int r3, java.lang.Object[] r4) {
            r2 = this;
            r4.getClass()
            int r0 = r4.length
            int r1 = r0 * 3
            int r1 = r1 / 2
            int r3 = java.lang.Math.max(r3, r1)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            defpackage.fv.t0(r4, r3, r1, r1, r0)
            r2.a = r3
            return
    }

    public final java.lang.Object n(int r2, java.lang.Object r3) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.b
            if (r2 >= r0) goto Ld
            java.lang.Object[] r1 = r1.a
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        Ld:
            r1.o(r2)
            r1 = 0
            throw r1
    }

    public final void o(int r3) {
            r2 = this;
            java.lang.String r0 = "Index "
            java.lang.String r1 = " must be in 0.."
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            int r2 = r2.b
            int r2 = r2 + (-1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
    }

    public final void p(int r3) {
            r2 = this;
            java.lang.String r0 = "Index "
            java.lang.String r1 = " must be in 0.."
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            int r2 = r2.b
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.Object[] r1 = r6.a
            int r2 = r6.b
            r3 = 0
        Lf:
            if (r3 >= r2) goto L32
            r4 = r1[r3]
            r5 = -1
            if (r3 != r5) goto L1c
            java.lang.String r6 = "..."
            r0.append(r6)
            goto L37
        L1c:
            if (r3 == 0) goto L23
            java.lang.String r5 = ", "
            r0.append(r5)
        L23:
            if (r4 != r6) goto L28
            java.lang.String r4 = "(this)"
            goto L2c
        L28:
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L2c:
            r0.append(r4)
            int r3 = r3 + 1
            goto Lf
        L32:
            java.lang.String r6 = "]"
            r0.append(r6)
        L37:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
