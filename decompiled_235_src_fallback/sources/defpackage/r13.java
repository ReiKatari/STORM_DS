package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r13  reason: default package */
/* loaded from: classes.dex */
public final class r13 extends defpackage.di7 {
    public static final defpackage.p13 z = null;
    public final java.lang.Object q;
    public defpackage.t13 r;
    public java.util.concurrent.Executor s;
    public defpackage.h61 t;
    public android.graphics.Rect u;
    public android.graphics.Matrix v;
    public defpackage.lc6 w;
    public defpackage.o33 x;
    public defpackage.mc6 y;

    static {
            p13 r0 = new p13
            r0.<init>()
            defpackage.r13.z = r0
            return
    }

    public r13(defpackage.v13 r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.q = r1
            return
    }

    @Override // defpackage.di7
    public final void A() {
            r4 = this;
            defpackage.nj2.h()
            mc6 r0 = r4.y
            r1 = 0
            if (r0 == 0) goto Ld
            r0.b()
            r4.y = r1
        Ld:
            o33 r0 = r4.x
            if (r0 == 0) goto L16
            r0.a()
            r4.x = r1
        L16:
            java.lang.Object r0 = r4.q
            monitor-enter(r0)
            t13 r2 = r4.r     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r2.q0 = r3     // Catch: java.lang.Throwable -> L25
            r2.d()     // Catch: java.lang.Throwable -> L25
            r4.r = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
    }

    @Override // defpackage.di7
    public final void B(android.graphics.Matrix r3) {
            r2 = this;
            super.B(r3)
            java.lang.Object r0 = r2.q
            monitor-enter(r0)
            t13 r1 = r2.r     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1.i(r3)     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r2 = move-exception
            goto L14
        L10:
            r2.v = r3     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @Override // defpackage.di7
    public final void C(android.graphics.Rect r3) {
            r2 = this;
            r2.k = r3
            java.lang.Object r0 = r2.q
            monitor-enter(r0)
            t13 r1 = r2.r     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            r1.j(r3)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L13
        Lf:
            r2.u = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public final defpackage.lc6 G(defpackage.v13 r18, defpackage.yy r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            defpackage.nj2.h()
            android.util.Size r3 = r2.a
            lx2 r4 = defpackage.u24.t()
            xx r5 = defpackage.i57.E
            java.lang.Object r4 = r1.b(r5, r4)
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            r4.getClass()
            zi7 r5 = r0.h
            v13 r5 = (defpackage.v13) r5
            xx r6 = defpackage.v13.B
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            java.lang.Object r5 = r5.b(r6, r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 1
            if (r5 != r6) goto L48
            zi7 r5 = r0.h
            v13 r5 = (defpackage.v13) r5
            xx r8 = defpackage.v13.L
            r9 = 6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.b(r8, r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L49
        L48:
            r5 = 4
        L49:
            xx r8 = defpackage.v13.R
            r9 = 0
            java.lang.Object r8 = r1.b(r8, r9)
            if (r8 != 0) goto L1af
            re5 r8 = new re5
            int r10 = r3.getWidth()
            int r11 = r3.getHeight()
            zi7 r12 = r0.h
            int r12 = r12.q()
            ci r5 = defpackage.ln2.l(r10, r11, r12, r5)
            r8.<init>(r5)
            java.lang.Object r5 = r0.q
            monitor-enter(r5)
            r0.I()     // Catch: java.lang.Throwable -> L1ac
            t13 r10 = r0.r     // Catch: java.lang.Throwable -> L1ac
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1ac
            eg0 r5 = r0.d()
            if (r5 == 0) goto L9a
            eg0 r5 = r0.d()
            zi7 r11 = r0.h
            v13 r11 = (defpackage.v13) r11
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            xx r13 = defpackage.v13.Z
            java.lang.Object r11 = r11.b(r13, r12)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L9a
            int r5 = r0.i(r5, r7)
            int r5 = r5 % 180
            if (r5 == 0) goto L9a
            r5 = r6
            goto L9b
        L9a:
            r5 = r7
        L9b:
            if (r5 == 0) goto La2
            int r11 = r3.getHeight()
            goto La6
        La2:
            int r11 = r3.getWidth()
        La6:
            if (r5 == 0) goto Lad
            int r5 = r3.getWidth()
            goto Lb1
        Lad:
            int r5 = r3.getHeight()
        Lb1:
            int r12 = r0.H()
            r13 = 2
            r14 = 35
            if (r12 != r13) goto Lbc
            r12 = r6
            goto Lbd
        Lbc:
            r12 = r14
        Lbd:
            zi7 r15 = r0.h
            int r15 = r15.q()
            if (r15 != r14) goto Lcd
            int r15 = r0.H()
            if (r15 != r13) goto Lcd
            r13 = r6
            goto Lce
        Lcd:
            r13 = r7
        Lce:
            zi7 r15 = r0.h
            int r15 = r15.q()
            if (r15 != r14) goto Ldf
            int r15 = r0.H()
            r6 = 3
            if (r15 != r6) goto Ldf
            r6 = 1
            goto Le0
        Ldf:
            r6 = r7
        Le0:
            zi7 r15 = r0.h
            int r15 = r15.q()
            if (r15 != r14) goto L10f
            eg0 r14 = r0.d()
            if (r14 == 0) goto Lf8
            eg0 r14 = r0.d()
            int r14 = r0.i(r14, r7)
            if (r14 != 0) goto L10c
        Lf8:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            zi7 r15 = r0.h
            v13 r15 = (defpackage.v13) r15
            xx r7 = defpackage.v13.Y
            java.lang.Object r7 = r15.b(r7, r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r14.equals(r7)
            if (r7 == 0) goto L10f
        L10c:
            r16 = 1
            goto L111
        L10f:
            r16 = 0
        L111:
            if (r13 != 0) goto L117
            if (r16 == 0) goto L124
            if (r6 != 0) goto L124
        L117:
            re5 r9 = new re5
            int r6 = r8.f()
            ci r5 = defpackage.ln2.l(r11, r5, r12, r6)
            r9.<init>(r5)
        L124:
            if (r9 == 0) goto L130
            java.lang.Object r5 = r10.p0
            monitor-enter(r5)
            r10.d0 = r9     // Catch: java.lang.Throwable -> L12d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12d
            goto L130
        L12d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12d
            throw r0
        L130:
            java.lang.Object r6 = r0.q
            monitor-enter(r6)
            eg0 r5 = r0.d()     // Catch: java.lang.Throwable -> L143
            if (r5 == 0) goto L145
            t13 r7 = r0.r     // Catch: java.lang.Throwable -> L143
            r11 = 0
            int r5 = r0.i(r5, r11)     // Catch: java.lang.Throwable -> L143
            r7.B = r5     // Catch: java.lang.Throwable -> L143
            goto L145
        L143:
            r0 = move-exception
            goto L1aa
        L145:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L143
            r8.e(r10, r4)
            android.util.Size r4 = r2.a
            lc6 r1 = defpackage.lc6.d(r1, r4)
            yy0 r4 = r2.f
            if (r4 == 0) goto L158
            dk0 r5 = r1.b
            r5.e(r4)
        L158:
            o33 r4 = r0.x
            if (r4 == 0) goto L15f
            r4.a()
        L15f:
            o33 r4 = new o33
            android.view.Surface r5 = r8.getSurface()
            zi7 r6 = r0.h
            int r6 = r6.q()
            r4.<init>(r5, r3, r6)
            r0.x = r4
            tb0 r3 = r4.e
            gx3 r3 = defpackage.l.F(r3)
            mf r4 = new mf
            r5 = 24
            r4.<init>(r5, r8, r9)
            ov2 r5 = defpackage.u24.x()
            r3.a(r5, r4)
            int r3 = r2.d
            r1.h = r3
            r0.a(r1, r2)
            o33 r3 = r0.x
            yq1 r2 = r2.c
            r4 = -1
            r1.b(r3, r2, r4)
            mc6 r2 = r0.y
            if (r2 == 0) goto L19a
            r2.b()
        L19a:
            mc6 r2 = new mc6
            n13 r3 = new n13
            r11 = 0
            r3.<init>(r0, r10, r11)
            r2.<init>(r3)
            r0.y = r2
            r1.f = r2
            return r1
        L1aa:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L143
            throw r0
        L1ac:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1ac
            throw r0
        L1af:
            defpackage.u34.a()
            return r9
    }

    public final int H() {
            r2 = this;
            zi7 r2 = r2.h
            v13 r2 = (defpackage.v13) r2
            xx r0 = defpackage.v13.X
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.b(r0, r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    public final void I() {
            r6 = this;
            java.lang.Object r0 = r6.q
            monitor-enter(r0)
            zi7 r1 = r6.h     // Catch: java.lang.Throwable -> L23
            v13 r1 = (defpackage.v13) r1     // Catch: java.lang.Throwable -> L23
            xx r2 = defpackage.v13.B     // Catch: java.lang.Throwable -> L23
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r1.b(r2, r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L23
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L23
            r4 = 1
            if (r2 != r4) goto L26
            u13 r1 = new u13     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            r6.r = r1     // Catch: java.lang.Throwable -> L23
            goto L39
        L23:
            r6 = move-exception
            goto Lb9
        L26:
            y13 r2 = new y13     // Catch: java.lang.Throwable -> L23
            lx2 r4 = defpackage.u24.t()     // Catch: java.lang.Throwable -> L23
            xx r5 = defpackage.i57.E     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.b(r5, r4)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1     // Catch: java.lang.Throwable -> L23
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23
            r6.r = r2     // Catch: java.lang.Throwable -> L23
        L39:
            t13 r1 = r6.r     // Catch: java.lang.Throwable -> L23
            int r2 = r6.H()     // Catch: java.lang.Throwable -> L23
            r1.R = r2     // Catch: java.lang.Throwable -> L23
            t13 r1 = r6.r     // Catch: java.lang.Throwable -> L23
            zi7 r2 = r6.h     // Catch: java.lang.Throwable -> L23
            v13 r2 = (defpackage.v13) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L23
            xx r5 = defpackage.v13.Z     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.b(r5, r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L23
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L23
            r1.X = r2     // Catch: java.lang.Throwable -> L23
            eg0 r1 = r6.d()     // Catch: java.lang.Throwable -> L23
            zi7 r2 = r6.h     // Catch: java.lang.Throwable -> L23
            v13 r2 = (defpackage.v13) r2     // Catch: java.lang.Throwable -> L23
            xx r4 = defpackage.v13.Y     // Catch: java.lang.Throwable -> L23
            r5 = 0
            java.lang.Object r2 = r2.b(r4, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L79
            cg0 r4 = r1.q()     // Catch: java.lang.Throwable -> L23
            y65 r4 = r4.s()     // Catch: java.lang.Throwable -> L23
            java.lang.Class<androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk> r5 = androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk.class
            boolean r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L23
            goto L7a
        L79:
            r4 = r3
        L7a:
            t13 r5 = r6.r     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L7f
            goto L83
        L7f:
            boolean r4 = r2.booleanValue()     // Catch: java.lang.Throwable -> L23
        L83:
            r5.Y = r4     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L8f
            t13 r2 = r6.r     // Catch: java.lang.Throwable -> L23
            int r1 = r6.i(r1, r3)     // Catch: java.lang.Throwable -> L23
            r2.B = r1     // Catch: java.lang.Throwable -> L23
        L8f:
            android.graphics.Rect r1 = r6.u     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L98
            t13 r2 = r6.r     // Catch: java.lang.Throwable -> L23
            r2.j(r1)     // Catch: java.lang.Throwable -> L23
        L98:
            android.graphics.Matrix r1 = r6.v     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto La1
            t13 r2 = r6.r     // Catch: java.lang.Throwable -> L23
            r2.i(r1)     // Catch: java.lang.Throwable -> L23
        La1:
            java.util.concurrent.Executor r1 = r6.s     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lb7
            h61 r2 = r6.t     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto Lb7
            t13 r6 = r6.r     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r6.p0     // Catch: java.lang.Throwable -> L23
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L23
            r6.A = r2     // Catch: java.lang.Throwable -> Lb4
            r6.Z = r1     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb4
            goto Lb7
        Lb4:
            r6 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb4
            throw r6     // Catch: java.lang.Throwable -> L23
        Lb7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        Lb9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r6
    }

    @Override // defpackage.di7
    public final defpackage.zi7 g(boolean r4, defpackage.cj7 r5) {
            r3 = this;
            p13 r0 = defpackage.r13.z
            r0.getClass()
            v13 r0 = defpackage.p13.a
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
            v13 r4 = new v13
            da4 r3 = r3.B
            go4 r3 = defpackage.go4.a(r3)
            r4.<init>(r3)
            return r4
    }

    @Override // defpackage.di7
    public final defpackage.yi7 m(defpackage.yy0 r2) {
            r1 = this;
            jd0 r1 = new jd0
            da4 r2 = defpackage.da4.k(r2)
            r0 = 3
            r1.<init>(r2, r0)
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r1 = r1.h()
            java.lang.String r0 = "ImageAnalysis:"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    @Override // defpackage.di7
    public final defpackage.zi7 v(defpackage.cg0 r1, defpackage.yi7 r2) {
            r0 = this;
            java.lang.Object r0 = r0.q
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            zi7 r0 = r2.h()
            return r0
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // defpackage.di7
    public final defpackage.yy y(defpackage.yy0 r4) {
            r3 = this;
            lc6 r0 = r3.w
            r0.a(r4)
            lc6 r0 = r3.w
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
            java.lang.String r0 = "ImageAnalysis"
            defpackage.kj2.t(r0, r4)
            zi7 r4 = r2.h
            v13 r4 = (defpackage.v13) r4
            r2.f()
            lc6 r4 = r2.G(r4, r3)
            r2.w = r4
            rc6 r4 = r4.c()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            r4 = r4[r1]
            java.util.Objects.requireNonNull(r4)
            r0.add(r4)
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            r2.E(r4)
            return r3
    }
}
