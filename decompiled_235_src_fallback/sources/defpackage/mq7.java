package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mq7  reason: default package */
/* loaded from: classes.dex */
public final class mq7 implements defpackage.ci7 {
    public final java.util.HashSet A;
    public final java.util.HashMap B;
    public final java.util.HashMap L;
    public final java.util.HashMap R;
    public final defpackage.cj7 X;
    public final defpackage.eg0 Y;
    public final defpackage.eg0 Z;
    public final defpackage.ce0 d0;
    public final java.util.HashSet e0;
    public final java.util.HashMap f0;
    public final defpackage.gl5 g0;
    public final defpackage.gl5 h0;

    public mq7(defpackage.eg0 r6, defpackage.eg0 r7, java.util.HashSet r8, defpackage.cj7 r9, defpackage.fa6 r10) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.B = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.L = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.R = r0
            ce0 r0 = new ce0
            r0.<init>(r5)
            r5.d0 = r0
            r5.Y = r6
            r5.Z = r7
            r5.X = r9
            r5.A = r8
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r0 = r8.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()
            di7 r1 = (defpackage.di7) r1
            cg0 r2 = r6.q()
            r3 = 1
            zi7 r3 = r1.g(r3, r9)
            r4 = 0
            zi7 r2 = r1.p(r2, r4, r3)
            r7.put(r1, r2)
            goto L30
        L4e:
            r5.f0 = r7
            java.util.HashSet r9 = new java.util.HashSet
            java.util.Collection r7 = r7.values()
            r9.<init>(r7)
            r5.e0 = r9
            gl5 r7 = new gl5
            r7.<init>(r6, r9)
            r5.g0 = r7
            eg0 r7 = r5.Z
            if (r7 == 0) goto L6f
            gl5 r7 = new gl5
            eg0 r0 = r5.Z
            r7.<init>(r0, r9)
            r5.h0 = r7
        L6f:
            java.util.Iterator r7 = r8.iterator()
        L73:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L91
            java.lang.Object r8 = r7.next()
            di7 r8 = (defpackage.di7) r8
            java.util.HashMap r9 = r5.R
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.put(r8, r0)
            java.util.HashMap r9 = r5.L
            lq7 r0 = new lq7
            r0.<init>(r6, r5, r10)
            r9.put(r8, r0)
            goto L73
        L91:
            return
    }

    public static void s(defpackage.qv6 r2, defpackage.ig1 r3, defpackage.rc6 r4) {
            r2.d()
            defpackage.nj2.h()     // Catch: defpackage.hg1 -> L18
            r2.a()     // Catch: defpackage.hg1 -> L18
            pv6 r2 = r2.l     // Catch: defpackage.hg1 -> L18
            java.util.Objects.requireNonNull(r2)     // Catch: defpackage.hg1 -> L18
            lv6 r0 = new lv6     // Catch: defpackage.hg1 -> L18
            r1 = 0
            r0.<init>(r2, r1)     // Catch: defpackage.hg1 -> L18
            r2.g(r3, r0)     // Catch: defpackage.hg1 -> L18
            return
        L18:
            nc6 r2 = r4.f
            if (r2 == 0) goto L21
            oc6 r3 = defpackage.oc6.SESSION_ERROR_SURFACE_NEEDS_RESET
            r2.a(r4, r3)
        L21:
            return
    }

    public static defpackage.ig1 t(defpackage.di7 r4) {
            boolean r0 = r4 instanceof defpackage.d23
            if (r0 == 0) goto Lb
            rc6 r4 = r4.o
            java.util.List r4 = r4.b()
            goto L15
        Lb:
            rc6 r4 = r4.o
            ek0 r4 = r4.g
            java.util.ArrayList r4 = r4.a
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
        L15:
            int r0 = r4.size()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L1f
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            r3 = 0
            defpackage.np2.A(r3, r0)
            int r0 = r4.size()
            if (r0 != r2) goto L31
            java.lang.Object r4 = r4.get(r1)
            ig1 r4 = (defpackage.ig1) r4
            return r4
        L31:
            return r3
    }

    @Override // defpackage.ci7
    public final void b(defpackage.di7 r2) {
            r1 = this;
            defpackage.nj2.h()
            qv6 r0 = r1.v(r2)
            boolean r1 = r1.w(r2)
            if (r1 != 0) goto Le
            goto L19
        Le:
            ig1 r1 = t(r2)
            if (r1 == 0) goto L19
            rc6 r2 = r2.o
            s(r0, r1, r2)
        L19:
            return
    }

    @Override // defpackage.ci7
    public final void d(defpackage.di7 r3) {
            r2 = this;
            defpackage.nj2.h()
            boolean r0 = r2.w(r3)
            if (r0 == 0) goto La
            goto L20
        La:
            java.util.HashMap r0 = r2.R
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r3, r1)
            ig1 r0 = t(r3)
            if (r0 == 0) goto L20
            qv6 r2 = r2.v(r3)
            rc6 r3 = r3.o
            s(r2, r0, r3)
        L20:
            return
    }

    @Override // defpackage.ci7
    public final void g(defpackage.di7 r2) {
            r1 = this;
            defpackage.nj2.h()
            boolean r0 = r1.w(r2)
            if (r0 != 0) goto La
            return
        La:
            qv6 r1 = r1.v(r2)
            ig1 r0 = t(r2)
            if (r0 == 0) goto L1a
            rc6 r2 = r2.o
            s(r1, r0, r2)
            return
        L1a:
            defpackage.nj2.h()
            r1.a()
            pv6 r1 = r1.l
            r1.a()
            return
    }

    @Override // defpackage.ci7
    public final void h(defpackage.di7 r3) {
            r2 = this;
            defpackage.nj2.h()
            boolean r0 = r2.w(r3)
            if (r0 != 0) goto La
            return
        La:
            java.util.HashMap r0 = r2.R
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.put(r3, r1)
            qv6 r2 = r2.v(r3)
            defpackage.nj2.h()
            r2.a()
            pv6 r2 = r2.l
            r2.a()
            return
    }

    public final defpackage.ry r(defpackage.di7 r10, defpackage.gl5 r11, defpackage.eg0 r12, defpackage.qv6 r13, int r14, boolean r15) {
            r9 = this;
            zf0 r0 = r12.a()
            int r14 = r0.p(r14)
            android.graphics.Matrix r0 = r13.b
            boolean r0 = defpackage.k97.e(r0)
            java.util.HashMap r9 = r9.f0
            java.lang.Object r9 = r9.get(r10)
            zi7 r9 = (defpackage.zi7) r9
            java.util.Objects.requireNonNull(r9)
            android.graphics.Rect r1 = r13.d
            android.graphics.Matrix r2 = r13.b
            int r2 = defpackage.k97.b(r2)
            y15 r9 = r11.b(r9, r1, r2, r15)
            android.graphics.Rect r5 = r9.a
            android.util.Size r9 = r9.b
            zi7 r11 = r10.h
            n23 r11 = (defpackage.n23) r11
            r15 = 0
            int r11 = r11.K(r15)
            zf0 r15 = r12.a()
            int r11 = r15.p(r11)
            int r13 = r13.i
            int r13 = r13 + r11
            int r13 = r13 - r14
            int r7 = defpackage.k97.i(r13)
            boolean r11 = r10.o(r12)
            r8 = r11 ^ r0
            boolean r11 = r10 instanceof defpackage.p25
            if (r11 == 0) goto L4f
            r11 = 1
        L4d:
            r3 = r11
            goto L57
        L4f:
            boolean r11 = r10 instanceof defpackage.d23
            if (r11 == 0) goto L55
            r11 = 4
            goto L4d
        L55:
            r11 = 2
            goto L4d
        L57:
            boolean r10 = r10 instanceof defpackage.d23
            if (r10 == 0) goto L5f
            r10 = 256(0x100, float:3.59E-43)
        L5d:
            r4 = r10
            goto L62
        L5f:
            r10 = 34
            goto L5d
        L62:
            android.util.Size r6 = defpackage.k97.g(r7, r9)
            ry r1 = new ry
            java.util.UUID r2 = java.util.UUID.randomUUID()
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public final java.util.HashMap u(defpackage.qv6 r8, boolean r9) {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashSet r1 = r7.A
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()
            di7 r2 = (defpackage.di7) r2
            java.util.HashMap r3 = r7.f0
            java.lang.Object r3 = r3.get(r2)
            zi7 r3 = (defpackage.zi7) r3
            java.util.Objects.requireNonNull(r3)
            android.graphics.Rect r4 = r8.d
            android.graphics.Matrix r5 = r8.b
            int r5 = defpackage.k97.b(r5)
            gl5 r6 = r7.g0
            y15 r3 = r6.b(r3, r4, r5, r9)
            android.util.Size r3 = r3.c
            r0.put(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Selected child size: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ", useCase: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "VirtualCameraAdapter"
            defpackage.kj2.t(r3, r2)
            goto Lb
        L51:
            return r0
    }

    public final defpackage.qv6 v(defpackage.di7 r1) {
            r0 = this;
            java.util.HashMap r0 = r0.B
            java.lang.Object r0 = r0.get(r1)
            qv6 r0 = (defpackage.qv6) r0
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public final boolean w(defpackage.di7 r1) {
            r0 = this;
            java.util.HashMap r0 = r0.R
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void x(java.util.HashMap r3, java.util.HashMap r4) {
            r2 = this;
            java.util.HashMap r2 = r2.B
            r2.clear()
            r2.putAll(r3)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            di7 r0 = (defpackage.di7) r0
            java.lang.Object r3 = r3.getValue()
            qv6 r3 = (defpackage.qv6) r3
            android.graphics.Rect r1 = r3.d
            r0.C(r1)
            android.graphics.Matrix r1 = r3.b
            r0.B(r1)
            yy r3 = r3.g
            p87 r3 = r3.b()
            java.lang.Object r1 = r4.get(r0)
            android.util.Size r1 = (android.util.Size) r1
            if (r1 == 0) goto L42
            r3.b = r1
        L42:
            yy r3 = r3.a()
            r1 = 0
            r0.F(r3, r1)
            r0.s()
            goto L10
        L4e:
            return
    }
}
