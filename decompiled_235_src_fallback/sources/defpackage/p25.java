package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p25  reason: default package */
/* loaded from: classes.dex */
public final class p25 extends defpackage.di7 {
    public static final defpackage.o25 x = null;
    public static final defpackage.ov2 y = null;
    public defpackage.i q;
    public java.util.concurrent.Executor r;
    public defpackage.lc6 s;
    public defpackage.ig1 t;
    public defpackage.qv6 u;
    public defpackage.bw6 v;
    public defpackage.mc6 w;

    static {
            o25 r0 = new o25
            r0.<init>()
            defpackage.p25.x = r0
            ov2 r0 = defpackage.u24.x()
            defpackage.p25.y = r0
            return
    }

    @Override // defpackage.di7
    public final void A() {
            r0 = this;
            r0.G()
            return
    }

    @Override // defpackage.di7
    public final void C(android.graphics.Rect r4) {
            r3 = this;
            r3.k = r4
            eg0 r4 = r3.d()
            qv6 r0 = r3.u
            if (r4 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r1 = r3.o(r4)
            int r4 = r3.i(r4, r1)
            zi7 r3 = r3.h
            n23 r3 = (defpackage.n23) r3
            xx r1 = defpackage.n23.q
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.b(r1, r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            nv6 r1 = new nv6
            r1.<init>(r0, r4, r3)
            defpackage.nj2.D(r1)
        L31:
            return
    }

    public final void G() {
            r3 = this;
            mc6 r0 = r3.w
            r1 = 0
            if (r0 == 0) goto La
            r0.b()
            r3.w = r1
        La:
            ig1 r0 = r3.t
            if (r0 == 0) goto L13
            r0.a()
            r3.t = r1
        L13:
            qv6 r0 = r3.u
            if (r0 == 0) goto L1c
            r0.b()
            r3.u = r1
        L1c:
            bw6 r0 = r3.v
            if (r0 == 0) goto L2c
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            r0.l = r1     // Catch: java.lang.Throwable -> L29
            r0.m = r1     // Catch: java.lang.Throwable -> L29
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r3
        L2c:
            r3.v = r1
            return
    }

    public final void H(defpackage.q25 r15, defpackage.yy r16) {
            r14 = this;
            r3 = r16
            r0 = -1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            defpackage.nj2.h()
            eg0 r0 = r14.d()
            java.util.Objects.requireNonNull(r0)
            r14.G()
            qv6 r1 = r14.u
            r11 = 0
            r12 = 1
            if (r1 != 0) goto L1c
            r1 = r12
            goto L1d
        L1c:
            r1 = r11
        L1d:
            r2 = 0
            defpackage.np2.A(r2, r1)
            qv6 r1 = new qv6
            android.graphics.Matrix r4 = r14.l
            boolean r5 = r0.o()
            android.util.Size r6 = r3.a
            android.graphics.Rect r7 = r14.k
            if (r7 == 0) goto L31
            r6 = r7
            goto L41
        L31:
            if (r6 == 0) goto L40
            android.graphics.Rect r2 = new android.graphics.Rect
            int r7 = r6.getWidth()
            int r6 = r6.getHeight()
            r2.<init>(r11, r11, r7, r6)
        L40:
            r6 = r2
        L41:
            java.util.Objects.requireNonNull(r6)
            boolean r2 = r14.o(r0)
            int r7 = r14.i(r0, r2)
            zi7 r2 = r14.h
            n23 r2 = (defpackage.n23) r2
            xx r13 = defpackage.n23.q
            java.lang.Object r2 = r2.b(r13, r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r8 = r2.intValue()
            boolean r2 = r0.o()
            if (r2 == 0) goto L6b
            boolean r0 = r14.o(r0)
            if (r0 == 0) goto L6b
            r9 = r12
        L69:
            r0 = r1
            goto L6d
        L6b:
            r9 = r11
            goto L69
        L6d:
            r1 = 1
            r2 = 34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r14.u = r0
            rk3 r1 = new rk3
            r2 = 6
            r1.<init>(r14, r2)
            defpackage.nj2.h()
            r0.a()
            java.util.HashSet r0 = r0.m
            r0.add(r1)
            qv6 r0 = r14.u
            bw6 r0 = r0.c(r12)
            r14.v = r0
            o33 r0 = r0.j
            r14.t = r0
            i r0 = r14.q
            if (r0 == 0) goto Ld3
            eg0 r0 = r14.d()
            qv6 r1 = r14.u
            if (r0 == 0) goto Lbe
            if (r1 == 0) goto Lbe
            boolean r2 = r14.o(r0)
            int r0 = r14.i(r0, r2)
            zi7 r2 = r14.h
            n23 r2 = (defpackage.n23) r2
            java.lang.Object r2 = r2.b(r13, r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            nv6 r4 = new nv6
            r4.<init>(r1, r0, r2)
            defpackage.nj2.D(r4)
        Lbe:
            i r0 = r14.q
            r0.getClass()
            bw6 r1 = r14.v
            r1.getClass()
            java.util.concurrent.Executor r2 = r14.r
            q64 r4 = new q64
            r5 = 3
            r4.<init>(r5, r0, r1)
            r2.execute(r4)
        Ld3:
            android.util.Size r0 = r3.a
            lc6 r0 = defpackage.lc6.d(r15, r0)
            dk0 r1 = r0.b
            int r2 = r3.d
            r0.h = r2
            r14.a(r0, r3)
            int r15 = r15.E()
            if (r15 == 0) goto Lfa
            r1.getClass()
            if (r15 == 0) goto Lfa
            xx r2 = defpackage.zi7.U
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Object r4 = r1.X
            da4 r4 = (defpackage.da4) r4
            r4.m(r2, r15)
        Lfa:
            yy0 r15 = r3.f
            if (r15 == 0) goto L101
            r1.e(r15)
        L101:
            i r15 = r14.q
            if (r15 == 0) goto L11c
            ig1 r15 = r14.t
            yq1 r1 = r3.c
            zi7 r2 = r14.h
            n23 r2 = (defpackage.n23) r2
            xx r3 = defpackage.n23.r
            java.lang.Object r2 = r2.b(r3, r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.b(r15, r1, r2)
        L11c:
            mc6 r15 = r14.w
            if (r15 == 0) goto L123
            r15.b()
        L123:
            mc6 r15 = new mc6
            a23 r1 = new a23
            r1.<init>(r14, r12)
            r15.<init>(r1)
            r14.w = r15
            r0.f = r15
            r14.s = r0
            rc6 r15 = r0.c()
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r12)
            r15 = r15[r11]
            java.util.Objects.requireNonNull(r15)
            r0.add(r15)
            java.util.List r15 = java.util.Collections.unmodifiableList(r0)
            r14.E(r15)
            return
    }

    @Override // defpackage.di7
    public final defpackage.zi7 g(boolean r4, defpackage.cj7 r5) {
            r3 = this;
            o25 r0 = defpackage.p25.x
            r0.getClass()
            q25 r0 = defpackage.o25.a
            bj7 r1 = r0.x()
            r2 = 1
            yy0 r5 = r5.a(r1, r2)
            if (r4 == 0) goto L16
            go4 r5 = defpackage.yy0.t(r5, r0)
        L16:
            if (r5 != 0) goto L1a
            r3 = 0
            return r3
        L1a:
            yi7 r3 = r3.m(r5)
            jd0 r3 = (defpackage.jd0) r3
            q25 r4 = new q25
            da4 r3 = r3.B
            go4 r3 = defpackage.go4.a(r3)
            r4.<init>(r3)
            return r4
    }

    @Override // defpackage.di7
    public final java.util.Set l() {
            r1 = this;
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            return r1
    }

    @Override // defpackage.di7
    public final defpackage.yi7 m(defpackage.yy0 r2) {
            r1 = this;
            jd0 r1 = new jd0
            da4 r2 = defpackage.da4.k(r2)
            r0 = 5
            r1.<init>(r2, r0)
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r1 = r1.h()
            java.lang.String r0 = "Preview:"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    @Override // defpackage.di7
    public final defpackage.zi7 v(defpackage.cg0 r2, defpackage.yi7 r3) {
            r1 = this;
            da4 r1 = r3.f()
            xx r2 = defpackage.j23.l
            r0 = 34
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.m(r2, r0)
            zi7 r1 = r3.h()
            return r1
    }

    @Override // defpackage.di7
    public final defpackage.yy y(defpackage.yy0 r4) {
            r3 = this;
            lc6 r0 = r3.s
            r0.a(r4)
            lc6 r0 = r3.s
            rc6 r0 = r0.c()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r2 = 0
            r0 = r0[r2]
            java.util.Objects.requireNonNull(r0)
            r1.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r3.E(r0)
            yy r3 = r3.i
            p87 r3 = r3.b()
            r3.f = r4
            yy r3 = r3.a()
            return r3
    }

    @Override // defpackage.di7
    public final defpackage.yy z(defpackage.yy r3, defpackage.yy r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSuggestedStreamSpecUpdated: primaryStreamSpec = "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", secondaryStreamSpec "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "Preview"
            defpackage.kj2.t(r0, r4)
            zi7 r4 = r2.h
            q25 r4 = (defpackage.q25) r4
            r2.H(r4, r3)
            return r3
    }
}
