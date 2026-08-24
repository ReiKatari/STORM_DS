package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi0  reason: default package */
/* loaded from: classes.dex */
public final class zi0 implements defpackage.pd0 {
    public final defpackage.x9 A;
    public final defpackage.x9 B;
    public final defpackage.cj7 L;
    public final defpackage.yf0 R;
    public final java.util.ArrayList X;
    public final java.util.ArrayList Y;
    public final defpackage.ze0 Z;
    public java.util.List d0;
    public android.util.Range e0;
    public final defpackage.oe0 f0;
    public final java.lang.Object g0;
    public boolean h0;
    public defpackage.yy0 i0;
    public defpackage.di7 j0;
    public defpackage.pr6 k0;
    public final defpackage.u63 l0;
    public final defpackage.u63 m0;
    public final defpackage.rr6 n0;
    public final defpackage.rr6 o0;

    public zi0(defpackage.eg0 r4, defpackage.eg0 r5, defpackage.w9 r6, defpackage.w9 r7, defpackage.u63 r8, defpackage.u63 r9, defpackage.ze0 r10, defpackage.rr6 r11, defpackage.cj7 r12) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.X = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.Y = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r3.d0 = r0
            android.util.Range r0 = defpackage.yy.h
            r3.e0 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.g0 = r0
            r0 = 1
            r3.h0 = r0
            r0 = 0
            r3.i0 = r0
            rr6 r1 = new rr6
            r2 = 0
            r1.<init>(r2)
            r3.n0 = r1
            oe0 r1 = r6.L
            r3.f0 = r1
            x9 r1 = new x9
            r1.<init>(r4, r6)
            r3.A = r1
            if (r5 == 0) goto L45
            if (r7 == 0) goto L45
            x9 r4 = new x9
            r4.<init>(r5, r7)
            r3.B = r4
            goto L47
        L45:
            r3.B = r0
        L47:
            r3.l0 = r8
            r3.m0 = r9
            r3.Z = r10
            r3.L = r12
            yf0 r4 = defpackage.nc1.M(r6, r7)
            r3.R = r4
            r3.o0 = r11
            return
    }

    public static void C(java.util.HashMap r3) {
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            di7 r1 = (defpackage.di7) r1
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L2b
            r1.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r1.g = r2
            goto L8
        L2f:
            return
    }

    public static java.util.ArrayList D(java.util.ArrayList r5, java.util.List r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            int r1 = r5.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L27
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            di7 r3 = (defpackage.di7) r3
            r3.getClass()
            java.util.Iterator r3 = r6.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L22
            goto La
        L22:
            java.lang.ClassCastException r5 = defpackage.i61.j(r3)
            throw r5
        L27:
            return r0
    }

    public static java.util.HashMap g(java.util.LinkedHashSet r4, defpackage.il5 r5) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            di7 r1 = (defpackage.di7) r1
            java.util.HashSet r2 = r1.g
            r0.put(r1, r2)
            r2 = 0
            if (r5 == 0) goto L20
            java.util.LinkedHashSet r3 = r5.b
            goto L21
        L20:
            r3 = r2
        L21:
            if (r3 == 0) goto L28
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r3)
        L28:
            r1.g = r2
            goto L9
        L2b:
            return r0
    }

    public static android.graphics.Matrix s(android.graphics.Rect r4, android.util.Size r5) {
            int r0 = r4.width()
            if (r0 <= 0) goto Le
            int r0 = r4.height()
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "Cannot compute viewport crop rects zero sized sensor rect."
            defpackage.np2.s(r1, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r5 = r5.getHeight()
            float r5 = (float) r5
            r3 = 0
            r1.<init>(r3, r3, r2, r5)
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.CENTER
            r4.setRectToRect(r1, r0, r5)
            r4.invert(r4)
            return r4
    }

    public static defpackage.d23 t() {
            jd0 r0 = new jd0
            r1 = 4
            r0.<init>(r1)
            xx r1 = defpackage.kz6.C
            da4 r0 = r0.B
            java.lang.String r2 = "ImageCapture-Extra"
            r0.m(r1, r2)
            r1 = 256(0x100, float:3.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            xx r3 = defpackage.e23.R
            r4 = 0
            java.lang.Object r3 = r0.b(r3, r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r5 = 1
            r6 = 2
            r7 = 3
            if (r3 == 0) goto L2f
            xx r1 = defpackage.j23.l
            r0.m(r1, r3)
            goto L86
        L2f:
            b23 r3 = defpackage.d23.z
            xx r3 = defpackage.e23.X
            java.lang.Object r8 = r0.b(r3, r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L47
            xx r1 = defpackage.j23.l
            r0.m(r1, r2)
            goto L86
        L47:
            java.lang.Object r8 = r0.b(r3, r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L60
            xx r3 = defpackage.j23.l
            r0.m(r3, r2)
            xx r2 = defpackage.j23.m
            r0.m(r2, r1)
            goto L86
        L60:
            java.lang.Object r2 = r0.b(r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L81
            xx r1 = defpackage.j23.l
            r2 = 4101(0x1005, float:5.747E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.m(r1, r2)
            xx r1 = defpackage.j23.n
            yq1 r2 = defpackage.yq1.c
            r0.m(r1, r2)
            goto L86
        L81:
            xx r2 = defpackage.j23.l
            r0.m(r2, r1)
        L86:
            e23 r1 = new e23
            go4 r2 = defpackage.go4.a(r0)
            r1.<init>(r2)
            defpackage.n23.J(r1)
            d23 r2 = new d23
            r2.<init>(r1)
            xx r1 = defpackage.n23.s
            java.lang.Object r1 = r0.b(r1, r4)
            android.util.Size r1 = (android.util.Size) r1
            if (r1 == 0) goto Lae
            android.util.Rational r3 = new android.util.Rational
            int r8 = r1.getWidth()
            int r1 = r1.getHeight()
            r3.<init>(r8, r1)
        Lae:
            xx r1 = defpackage.dc3.y
            ec3 r3 = defpackage.u24.u()
            java.lang.Object r1 = r0.b(r1, r3)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            java.lang.String r3 = "The IO executor can't be null"
            defpackage.np2.x(r1, r3)
            xx r1 = defpackage.e23.L
            java.util.TreeMap r3 = r0.A
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L104
            java.lang.Object r1 = r0.e(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lfe
            int r3 = r1.intValue()
            if (r3 == 0) goto Le9
            int r3 = r1.intValue()
            if (r3 == r5) goto Le9
            int r3 = r1.intValue()
            if (r3 == r7) goto Le9
            int r3 = r1.intValue()
            if (r3 != r6) goto Lfe
        Le9:
            int r1 = r1.intValue()
            if (r1 != r7) goto L104
            xx r1 = defpackage.e23.e0
            java.lang.Object r0 = r0.b(r1, r4)
            if (r0 == 0) goto Lf8
            goto L104
        Lf8:
            java.lang.String r0 = "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."
            defpackage.i.h(r0)
            return r4
        Lfe:
            java.lang.String r0 = "The flash mode is not allowed to set: "
            defpackage.e41.w(r1, r0)
            return r4
        L104:
            return r2
    }

    public static defpackage.p25 u() {
            jd0 r0 = new jd0
            r1 = 5
            r0.<init>(r1)
            xx r1 = defpackage.kz6.C
            da4 r0 = r0.B
            java.lang.String r2 = "Preview-Extra"
            r0.m(r1, r2)
            q25 r1 = new q25
            go4 r0 = defpackage.go4.a(r0)
            r1.<init>(r0)
            defpackage.n23.J(r1)
            p25 r0 = new p25
            r0.<init>(r1)
            ov2 r1 = defpackage.p25.y
            r0.r = r1
            i r2 = new i
            r3 = 10
            r2.<init>(r3)
            defpackage.nj2.h()
            r0.q = r2
            r0.r = r1
            android.util.Size r1 = r0.c()
            if (r1 == 0) goto L44
            zi7 r1 = r0.h
            q25 r1 = (defpackage.q25) r1
            yy r2 = r0.i
            r0.H(r1, r2)
            r0.r()
        L44:
            r0.q()
            return r0
    }

    public static java.util.HashMap x(java.util.ArrayList r9, defpackage.cj7 r10, defpackage.cj7 r11, android.util.Range r12) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r9.size()
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L9e
            java.lang.Object r4 = r9.get(r3)
            int r3 = r3 + 1
            di7 r4 = (defpackage.di7) r4
            boolean r5 = r4 instanceof defpackage.pr6
            if (r5 == 0) goto L55
            r5 = r4
            pr6 r5 = (defpackage.pr6) r5
            jd0 r6 = new jd0
            r7 = 5
            r6.<init>(r7)
            q25 r7 = new q25
            da4 r6 = r6.B
            go4 r6 = defpackage.go4.a(r6)
            r7.<init>(r6)
            defpackage.n23.J(r7)
            p25 r6 = new p25
            r6.<init>(r7)
            ov2 r7 = defpackage.p25.y
            r6.r = r7
            zi7 r6 = r6.g(r2, r10)
            if (r6 != 0) goto L41
            r5 = 0
            goto L59
        L41:
            da4 r6 = defpackage.da4.k(r6)
            xx r7 = defpackage.kz6.D
            r6.n(r7)
            yi7 r5 = r5.m(r6)
            jd0 r5 = (defpackage.jd0) r5
            zi7 r5 = r5.h()
            goto L59
        L55:
            zi7 r5 = r4.g(r2, r10)
        L59:
            r6 = 1
            zi7 r6 = r4.g(r6, r11)
            if (r6 == 0) goto L65
            da4 r6 = defpackage.da4.k(r6)
            goto L69
        L65:
            da4 r6 = defpackage.da4.d()
        L69:
            xx r7 = defpackage.zi7.M
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r6.m(r7, r8)
            android.util.Range r7 = defpackage.yy.h
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L88
            xx r7 = defpackage.zi7.N
            xy0 r8 = defpackage.xy0.HIGH_PRIORITY_REQUIRED
            r6.l(r7, r8, r12)
            xx r7 = defpackage.zi7.O
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.m(r7, r8)
        L88:
            yi7 r6 = r4.m(r6)
            zi7 r6 = r6.h()
            ui0 r7 = new ui0
            r7.<init>()
            r7.a = r5
            r7.b = r6
            r0.put(r4, r7)
            goto Lb
        L9e:
            return r0
    }

    public final void A() {
            r1 = this;
            java.lang.Object r0 = r1.g0
            monitor-enter(r0)
            oe0 r1 = r1.f0     // Catch: java.lang.Throwable -> La
            r1.z()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    public final void B(java.util.ArrayList r7) {
            r6 = this;
            java.lang.Object r0 = r6.g0
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r3 = r2
        L9:
            if (r3 >= r1) goto L17
            java.lang.Object r4 = r7.get(r3)     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            di7 r4 = (defpackage.di7) r4     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r4.g = r5     // Catch: java.lang.Throwable -> L2f
            goto L9
        L17:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayList r3 = r6.X     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            r1.removeAll(r7)     // Catch: java.lang.Throwable -> L2f
            x9 r7 = r6.B     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L26
            r2 = 1
        L26:
            db0 r7 = r6.r(r1, r2)     // Catch: java.lang.Throwable -> L2f
            r6.d(r7)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r6
    }

    @Override // defpackage.pd0
    public final defpackage.zf0 a() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final void b(java.util.Collection r4, defpackage.il5 r5) {
            r3 = this;
            java.lang.String r0 = "CameraUseCaseAdapter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "addUseCases: appUseCasesToAdd = "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", featureGroup = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            defpackage.kj2.t(r0, r1)
            java.lang.Object r0 = r3.g0
            monitor-enter(r0)
            x9 r1 = r3.A     // Catch: java.lang.Throwable -> L4a
            oe0 r2 = r3.f0     // Catch: java.lang.Throwable -> L4a
            r1.i(r2)     // Catch: java.lang.Throwable -> L4a
            x9 r1 = r3.B     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L2c
            r1.i(r2)     // Catch: java.lang.Throwable -> L4a
        L2c:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L4a
            java.util.ArrayList r2 = r3.X     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4a
            r1.addAll(r4)     // Catch: java.lang.Throwable -> L4a
            java.util.HashMap r4 = g(r1, r5)     // Catch: java.lang.Throwable -> L4a
            x9 r5 = r3.B     // Catch: java.lang.Throwable -> L4a java.lang.IllegalArgumentException -> L4c
            if (r5 == 0) goto L40
            r5 = 1
            goto L41
        L40:
            r5 = 0
        L41:
            db0 r5 = r3.r(r1, r5)     // Catch: java.lang.Throwable -> L4a java.lang.IllegalArgumentException -> L4c
            r3.d(r5)     // Catch: java.lang.Throwable -> L4a java.lang.IllegalArgumentException -> L4c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L4a:
            r3 = move-exception
            goto L56
        L4c:
            r3 = move-exception
            C(r4)     // Catch: java.lang.Throwable -> L4a
            si0 r4 = new si0     // Catch: java.lang.Throwable -> L4a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            throw r4     // Catch: java.lang.Throwable -> L4a
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r3
    }

    public final void d(defpackage.db0 r11) {
            r10 = this;
            sr6 r0 = r11.i
            java.util.Map r0 = r0.a
            java.util.ArrayList r1 = r11.b
            java.lang.Object r2 = r10.g0
            monitor-enter(r2)
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L36
            r4 = 0
            r5 = r4
        Lf:
            if (r5 >= r3) goto L39
            java.lang.Object r6 = r1.get(r5)     // Catch: java.lang.Throwable -> L36
            int r5 = r5 + 1
            di7 r6 = (defpackage.di7) r6     // Catch: java.lang.Throwable -> L36
            x9 r7 = r10.A     // Catch: java.lang.Throwable -> L36
            w9 r7 = r7.B     // Catch: java.lang.Throwable -> L36
            cg0 r7 = r7.A     // Catch: java.lang.Throwable -> L36
            android.graphics.Rect r7 = r7.j()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r0.get(r6)     // Catch: java.lang.Throwable -> L36
            yy r8 = (defpackage.yy) r8     // Catch: java.lang.Throwable -> L36
            r8.getClass()     // Catch: java.lang.Throwable -> L36
            android.util.Size r8 = r8.a     // Catch: java.lang.Throwable -> L36
            android.graphics.Matrix r7 = s(r7, r8)     // Catch: java.lang.Throwable -> L36
            r6.B(r7)     // Catch: java.lang.Throwable -> L36
            goto Lf
        L36:
            r10 = move-exception
            goto L1e8
        L39:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            java.util.List r0 = r10.d0
            java.util.ArrayList r1 = r11.b
            java.util.LinkedHashSet r2 = r11.a
            java.util.ArrayList r0 = D(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r3.removeAll(r1)
            java.util.ArrayList r0 = D(r3, r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L69
            java.lang.String r1 = "CameraUseCaseAdapter"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unused effects: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.kj2.f0(r1, r0)
        L69:
            java.util.ArrayList r0 = r11.e
            int r1 = r0.size()
            r2 = r4
        L70:
            if (r2 >= r1) goto L80
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            di7 r3 = (defpackage.di7) r3
            x9 r5 = r10.A
            r3.D(r5)
            goto L70
        L80:
            x9 r0 = r10.A
            java.util.ArrayList r1 = r11.e
            r0.m(r1)
            x9 r0 = r10.B
            if (r0 == 0) goto Laf
            java.util.ArrayList r0 = r11.e
            int r1 = r0.size()
            r2 = r4
        L92:
            if (r2 >= r1) goto La5
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            di7 r3 = (defpackage.di7) r3
            x9 r5 = r10.B
            java.util.Objects.requireNonNull(r5)
            r3.D(r5)
            goto L92
        La5:
            x9 r0 = r10.B
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = r11.e
            r0.m(r1)
        Laf:
            java.util.ArrayList r0 = r11.e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L141
            java.util.ArrayList r0 = r11.d
            int r1 = r0.size()
            r2 = r4
        Lbe:
            if (r2 >= r1) goto L141
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            di7 r3 = (defpackage.di7) r3
            sr6 r5 = r11.i
            java.util.Map r5 = r5.a
            boolean r6 = r5.containsKey(r3)
            if (r6 == 0) goto Lbe
            java.lang.Object r5 = r5.get(r3)
            yy r5 = (defpackage.yy) r5
            java.util.Objects.requireNonNull(r5)
            yy0 r5 = r5.f
            if (r5 == 0) goto Lbe
            rc6 r6 = r3.o
            ek0 r7 = r6.g
            go4 r7 = r7.b
            java.util.Objects.requireNonNull(r5)
            java.util.Set r8 = r5.c()
            int r8 = r8.size()
            ek0 r6 = r6.g
            go4 r6 = r6.b
            java.util.Set r6 = r6.c()
            int r6 = r6.size()
            if (r8 == r6) goto Lff
            goto L129
        Lff:
            java.util.Set r6 = r5.c()
            java.util.Iterator r6 = r6.iterator()
        L107:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lbe
            java.lang.Object r8 = r6.next()
            xx r8 = (defpackage.xx) r8
            java.util.TreeMap r9 = r7.A
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L129
            java.lang.Object r9 = r7.e(r8)
            java.lang.Object r8 = r5.e(r8)
            boolean r8 = java.util.Objects.equals(r9, r8)
            if (r8 != 0) goto L107
        L129:
            yy r5 = r3.y(r5)
            r3.i = r5
            boolean r5 = r10.h0
            if (r5 == 0) goto Lbe
            x9 r5 = r10.A
            r5.g(r3)
            x9 r5 = r10.B
            if (r5 == 0) goto Lbe
            r5.g(r3)
            goto Lbe
        L141:
            java.util.ArrayList r0 = r11.c
            int r1 = r0.size()
            r2 = r4
        L148:
            if (r2 >= r1) goto L19f
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            di7 r3 = (defpackage.di7) r3
            java.util.HashMap r5 = r11.h
            java.lang.Object r5 = r5.get(r3)
            ui0 r5 = (defpackage.ui0) r5
            java.util.Objects.requireNonNull(r5)
            x9 r6 = r10.B
            x9 r7 = r10.A
            zi7 r8 = r5.a
            if (r6 == 0) goto L188
            zi7 r5 = r5.b
            r3.b(r7, r6, r8, r5)
            sr6 r5 = r11.i
            java.util.Map r5 = r5.a
            java.lang.Object r5 = r5.get(r3)
            yy r5 = (defpackage.yy) r5
            r5.getClass()
            sr6 r6 = r11.j
            r6.getClass()
            java.util.Map r6 = r6.a
            java.lang.Object r6 = r6.get(r3)
            yy r6 = (defpackage.yy) r6
            r3.F(r5, r6)
            goto L148
        L188:
            zi7 r5 = r5.b
            r6 = 0
            r3.b(r7, r6, r8, r5)
            sr6 r5 = r11.i
            java.util.Map r5 = r5.a
            java.lang.Object r5 = r5.get(r3)
            yy r5 = (defpackage.yy) r5
            r5.getClass()
            r3.F(r5, r6)
            goto L148
        L19f:
            boolean r0 = r10.h0
            if (r0 == 0) goto L1b3
            x9 r0 = r10.A
            java.util.ArrayList r1 = r11.c
            r0.l(r1)
            x9 r0 = r10.B
            if (r0 == 0) goto L1b3
            java.util.ArrayList r1 = r11.c
            r0.l(r1)
        L1b3:
            java.util.ArrayList r0 = r11.c
            int r1 = r0.size()
        L1b9:
            if (r4 >= r1) goto L1c7
            java.lang.Object r2 = r0.get(r4)
            int r4 = r4 + 1
            di7 r2 = (defpackage.di7) r2
            r2.s()
            goto L1b9
        L1c7:
            java.util.ArrayList r0 = r10.X
            r0.clear()
            java.util.ArrayList r0 = r10.X
            java.util.LinkedHashSet r1 = r11.a
            r0.addAll(r1)
            java.util.ArrayList r0 = r10.Y
            r0.clear()
            java.util.ArrayList r0 = r10.Y
            java.util.ArrayList r1 = r11.b
            r0.addAll(r1)
            di7 r0 = r11.g
            r10.j0 = r0
            pr6 r11 = r11.f
            r10.k0 = r11
            return
        L1e8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r10
    }

    public final void h() {
            r5 = this;
            java.lang.Object r0 = r5.g0
            monitor-enter(r0)
            boolean r1 = r5.h0     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L5f
            java.util.ArrayList r1 = r5.Y     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            x9 r1 = r5.A     // Catch: java.lang.Throwable -> L20
            oe0 r2 = r5.f0     // Catch: java.lang.Throwable -> L20
            r1.i(r2)     // Catch: java.lang.Throwable -> L20
            x9 r1 = r5.B     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            oe0 r2 = r5.f0     // Catch: java.lang.Throwable -> L20
            r1.i(r2)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r5 = move-exception
            goto L61
        L22:
            x9 r1 = r5.A     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r2 = r5.Y     // Catch: java.lang.Throwable -> L20
            r1.l(r2)     // Catch: java.lang.Throwable -> L20
            x9 r1 = r5.B     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L32
            java.util.ArrayList r2 = r5.Y     // Catch: java.lang.Throwable -> L20
            r1.l(r2)     // Catch: java.lang.Throwable -> L20
        L32:
            java.lang.Object r1 = r5.g0     // Catch: java.lang.Throwable -> L20
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L20
            yy0 r2 = r5.i0     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L43
            x9 r3 = r5.A     // Catch: java.lang.Throwable -> L41
            v9 r3 = r3.L     // Catch: java.lang.Throwable -> L41
            r3.c(r2)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r5 = move-exception
            goto L5d
        L43:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r1 = r5.Y     // Catch: java.lang.Throwable -> L20
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L20
            r3 = 0
        L4b:
            if (r3 >= r2) goto L59
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L20
            int r3 = r3 + 1
            di7 r4 = (defpackage.di7) r4     // Catch: java.lang.Throwable -> L20
            r4.s()     // Catch: java.lang.Throwable -> L20
            goto L4b
        L59:
            r1 = 1
            r5.h0 = r1     // Catch: java.lang.Throwable -> L20
            goto L5f
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r5     // Catch: java.lang.Throwable -> L20
        L5f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r5
    }

    public final defpackage.db0 r(java.util.LinkedHashSet r25, boolean r26) {
            r24 = this;
            r1 = r24
            r2 = r25
            r1.A()
            java.lang.Object r3 = r1.g0
            monitor-enter(r3)
            java.util.List r0 = r1.d0     // Catch: java.lang.Throwable -> L80
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L80
            r4 = 2
            r5 = 0
            r6 = 1
            if (r0 != 0) goto L83
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L80
        L19:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L44
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L80
            di7 r7 = (defpackage.di7) r7     // Catch: java.lang.Throwable -> L80
            boolean r8 = r7 instanceof defpackage.d23     // Catch: java.lang.Throwable -> L80
            if (r8 != 0) goto L2a
            goto L19
        L2a:
            zi7 r7 = r7.h     // Catch: java.lang.Throwable -> L80
            xx r8 = defpackage.e23.X     // Catch: java.lang.Throwable -> L80
            boolean r9 = r7.i(r8)     // Catch: java.lang.Throwable -> L80
            if (r9 == 0) goto L19
            java.lang.Object r7 = r7.e(r8)     // Catch: java.lang.Throwable -> L80
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L80
            r7.getClass()     // Catch: java.lang.Throwable -> L80
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L80
            if (r7 == r6) goto L78
            goto L19
        L44:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L80
        L48:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L80
            if (r7 == 0) goto L74
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L80
            di7 r7 = (defpackage.di7) r7     // Catch: java.lang.Throwable -> L80
            boolean r8 = r7 instanceof defpackage.d23     // Catch: java.lang.Throwable -> L80
            if (r8 != 0) goto L59
            goto L48
        L59:
            zi7 r7 = r7.h     // Catch: java.lang.Throwable -> L80
            xx r8 = defpackage.e23.X     // Catch: java.lang.Throwable -> L80
            boolean r9 = r7.i(r8)     // Catch: java.lang.Throwable -> L80
            if (r9 == 0) goto L48
            java.lang.Object r7 = r7.e(r8)     // Catch: java.lang.Throwable -> L80
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L80
            r7.getClass()     // Catch: java.lang.Throwable -> L80
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L80
            if (r7 != r4) goto L48
            r0 = r6
            goto L75
        L74:
            r0 = r5
        L75:
            if (r0 != 0) goto L78
            goto L83
        L78:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = "Ultra HDR image and Raw capture does not support for use with CameraEffect."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            goto L38a
        L83:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            if (r26 != 0) goto L164
            r1.A()
            rr6 r0 = r1.n0
            x9 r3 = r1.A
            w9 r3 = r3.B
            cg0 r3 = r3.A
            java.lang.String r3 = r3.d()
            java.lang.Object r7 = r0.B
            androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk r7 = (androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk) r7
            if (r7 == 0) goto Le5
            java.lang.String r0 = "1"
            java.util.HashSet r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.a
            java.lang.String r7 = "oneplus"
            java.lang.String r8 = android.os.Build.BRAND
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto Lc1
            java.lang.String r7 = "cph2583"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r9)
            if (r7 == 0) goto Lc1
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L164
            boolean r0 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.b(r2)
            if (r0 == 0) goto L164
            goto L15f
        Lc1:
            java.lang.String r7 = "google"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L164
            java.util.HashSet r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.a
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r8 = r8.toLowerCase()
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L164
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L164
            boolean r0 = androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk.b(r2)
            if (r0 == 0) goto L164
            goto L15f
        Le5:
            java.lang.Object r0 = r0.L
            androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk r0 = (androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk) r0
            if (r0 == 0) goto L164
            r3.getClass()
            java.lang.String r0 = "motorola"
            java.lang.String r7 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L164
            java.lang.String r0 = "moto e20"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r7)
            if (r0 == 0) goto L164
            java.lang.String r0 = "0"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L164
            int r0 = r2.size()
            if (r0 == r4) goto L111
            goto L164
        L111:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L119
        L117:
            r0 = r5
            goto L12e
        L119:
            java.util.Iterator r0 = r2.iterator()
        L11d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L117
            java.lang.Object r3 = r0.next()
            di7 r3 = (defpackage.di7) r3
            boolean r3 = r3 instanceof defpackage.p25
            if (r3 == 0) goto L11d
            r0 = r6
        L12e:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L136
        L134:
            r3 = r5
            goto L15b
        L136:
            java.util.Iterator r3 = r2.iterator()
        L13a:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L134
            java.lang.Object r7 = r3.next()
            di7 r7 = (defpackage.di7) r7
            zi7 r8 = r7.h
            xx r9 = defpackage.zi7.T
            boolean r8 = r8.i(r9)
            if (r8 == 0) goto L13a
            zi7 r7 = r7.h
            bj7 r7 = r7.x()
            bj7 r8 = defpackage.bj7.VIDEO_CAPTURE
            if (r7 != r8) goto L13a
            r3 = r6
        L15b:
            if (r0 == 0) goto L164
            if (r3 == 0) goto L164
        L15f:
            db0 r0 = r1.r(r2, r6)
            return r0
        L164:
            java.lang.Object r7 = r1.g0
            monitor-enter(r7)
            java.util.HashSet r13 = r24.y(r25, r26)     // Catch: java.lang.Throwable -> L178
            int r0 = r13.size()     // Catch: java.lang.Throwable -> L178
            if (r0 >= r4) goto L17b
            r1.A()     // Catch: java.lang.Throwable -> L178
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L178
        L175:
            r0 = 0
            goto L215
        L178:
            r0 = move-exception
            goto L388
        L17b:
            pr6 r0 = r1.k0     // Catch: java.lang.Throwable -> L178
            if (r0 == 0) goto L1ac
            mq7 r0 = r0.r     // Catch: java.lang.Throwable -> L178
            java.util.HashSet r0 = r0.A     // Catch: java.lang.Throwable -> L178
            boolean r0 = r0.equals(r13)     // Catch: java.lang.Throwable -> L178
            if (r0 == 0) goto L1ac
            pr6 r0 = r1.k0     // Catch: java.lang.Throwable -> L178
            r0.getClass()     // Catch: java.lang.Throwable -> L178
            java.util.Iterator r8 = r13.iterator()     // Catch: java.lang.Throwable -> L178
            java.lang.Object r8 = r8.next()     // Catch: java.lang.Throwable -> L178
            di7 r8 = (defpackage.di7) r8     // Catch: java.lang.Throwable -> L178
            java.util.HashSet r8 = r8.g     // Catch: java.lang.Throwable -> L178
            if (r8 == 0) goto L1a2
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L178
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L178
            goto L1a3
        L1a2:
            r9 = 0
        L1a3:
            r0.g = r9     // Catch: java.lang.Throwable -> L178
            pr6 r0 = r1.k0     // Catch: java.lang.Throwable -> L178
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L178
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L178
            goto L215
        L1ac:
            r0 = 4
            int[] r0 = new int[]{r6, r4, r0}     // Catch: java.lang.Throwable -> L178
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L178
            r8.<init>()     // Catch: java.lang.Throwable -> L178
            java.util.Iterator r9 = r13.iterator()     // Catch: java.lang.Throwable -> L178
        L1ba:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L178
            if (r10 == 0) goto L204
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L178
            di7 r10 = (defpackage.di7) r10     // Catch: java.lang.Throwable -> L178
            r11 = r5
        L1c7:
            r12 = 3
            if (r11 >= r12) goto L1ba
            r12 = r0[r11]     // Catch: java.lang.Throwable -> L178
            java.util.Set r14 = r10.l()     // Catch: java.lang.Throwable -> L178
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L178
        L1d4:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> L178
            if (r15 == 0) goto L1ea
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L178
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch: java.lang.Throwable -> L178
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> L178
            r3 = r12 & r15
            if (r3 != r15) goto L1d4
            r3 = r6
            goto L1eb
        L1ea:
            r3 = r5
        L1eb:
            if (r3 == 0) goto L201
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L178
            boolean r3 = r8.contains(r3)     // Catch: java.lang.Throwable -> L178
            if (r3 == 0) goto L1fa
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L178
            goto L175
        L1fa:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L178
            r8.add(r3)     // Catch: java.lang.Throwable -> L178
        L201:
            int r11 = r11 + 1
            goto L1c7
        L204:
            pr6 r8 = new pr6     // Catch: java.lang.Throwable -> L178
            x9 r9 = r1.A     // Catch: java.lang.Throwable -> L178
            x9 r10 = r1.B     // Catch: java.lang.Throwable -> L178
            u63 r11 = r1.l0     // Catch: java.lang.Throwable -> L178
            u63 r12 = r1.m0     // Catch: java.lang.Throwable -> L178
            cj7 r14 = r1.L     // Catch: java.lang.Throwable -> L178
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L178
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L178
            r0 = r8
        L215:
            java.lang.Object r3 = r1.g0
            monitor-enter(r3)
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22a
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L22a
            if (r0 == 0) goto L22d
            r7.add(r0)     // Catch: java.lang.Throwable -> L22a
            mq7 r8 = r0.r     // Catch: java.lang.Throwable -> L22a
            java.util.HashSet r8 = r8.A     // Catch: java.lang.Throwable -> L22a
            r7.removeAll(r8)     // Catch: java.lang.Throwable -> L22a
            goto L22d
        L22a:
            r0 = move-exception
            goto L386
        L22d:
            java.lang.Object r8 = r1.g0     // Catch: java.lang.Throwable -> L22a
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L22a
            oe0 r9 = r1.f0     // Catch: java.lang.Throwable -> L383
            xx r10 = defpackage.oe0.c     // Catch: java.lang.Throwable -> L383
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L383
            java.lang.Object r9 = r9.b(r10, r11)     // Catch: java.lang.Throwable -> L383
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L383
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L383
            if (r9 != r6) goto L246
            r9 = r6
            goto L247
        L246:
            r9 = r5
        L247:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L383
            if (r9 == 0) goto L2ae
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L22a
            r9 = r5
            r10 = r9
            r11 = r10
        L251:
            if (r11 >= r8) goto L26c
            java.lang.Object r12 = r7.get(r11)     // Catch: java.lang.Throwable -> L22a
            int r11 = r11 + 1
            di7 r12 = (defpackage.di7) r12     // Catch: java.lang.Throwable -> L22a
            boolean r13 = r12 instanceof defpackage.p25     // Catch: java.lang.Throwable -> L22a
            if (r13 != 0) goto L26a
            boolean r13 = r12 instanceof defpackage.pr6     // Catch: java.lang.Throwable -> L22a
            if (r13 == 0) goto L264
            goto L26a
        L264:
            boolean r12 = r12 instanceof defpackage.d23     // Catch: java.lang.Throwable -> L22a
            if (r12 == 0) goto L251
            r9 = r6
            goto L251
        L26a:
            r10 = r6
            goto L251
        L26c:
            if (r9 == 0) goto L27c
            if (r10 != 0) goto L27c
            di7 r7 = r1.j0     // Catch: java.lang.Throwable -> L22a
            boolean r8 = r7 instanceof defpackage.p25     // Catch: java.lang.Throwable -> L22a
            if (r8 == 0) goto L277
            goto L2af
        L277:
            p25 r7 = u()     // Catch: java.lang.Throwable -> L22a
            goto L2af
        L27c:
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L22a
            r9 = r5
            r10 = r9
            r11 = r10
        L283:
            if (r11 >= r8) goto L29e
            java.lang.Object r12 = r7.get(r11)     // Catch: java.lang.Throwable -> L22a
            int r11 = r11 + 1
            di7 r12 = (defpackage.di7) r12     // Catch: java.lang.Throwable -> L22a
            boolean r13 = r12 instanceof defpackage.p25     // Catch: java.lang.Throwable -> L22a
            if (r13 != 0) goto L29c
            boolean r13 = r12 instanceof defpackage.pr6     // Catch: java.lang.Throwable -> L22a
            if (r13 == 0) goto L296
            goto L29c
        L296:
            boolean r12 = r12 instanceof defpackage.d23     // Catch: java.lang.Throwable -> L22a
            if (r12 == 0) goto L283
            r10 = r6
            goto L283
        L29c:
            r9 = r6
            goto L283
        L29e:
            if (r9 == 0) goto L2ae
            if (r10 != 0) goto L2ae
            di7 r7 = r1.j0     // Catch: java.lang.Throwable -> L22a
            boolean r8 = r7 instanceof defpackage.d23     // Catch: java.lang.Throwable -> L22a
            if (r8 == 0) goto L2a9
            goto L2af
        L2a9:
            d23 r7 = t()     // Catch: java.lang.Throwable -> L22a
            goto L2af
        L2ae:
            r7 = 0
        L2af:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            if (r7 == 0) goto L2ba
            r3.add(r7)
        L2ba:
            if (r0 == 0) goto L2c6
            r3.add(r0)
            mq7 r8 = r0.r
            java.util.HashSet r8 = r8.A
            r3.removeAll(r8)
        L2c6:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r3)
            java.util.ArrayList r9 = r1.Y
            r8.removeAll(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            java.util.ArrayList r10 = r1.Y
            r9.retainAll(r10)
            r10 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList r11 = r1.Y
            r5.<init>(r11)
            r5.removeAll(r3)
            oe0 r11 = r1.f0
            xx r12 = defpackage.oe0.b
            aj7 r13 = defpackage.cj7.a
            java.lang.Object r11 = r11.b(r12, r13)
            cj7 r11 = (defpackage.cj7) r11
            cj7 r12 = r1.L
            android.util.Range r13 = r1.e0
            java.util.HashMap r11 = x(r8, r11, r12, r13)
            java.util.List[] r12 = new java.util.List[r4]
            r12[r10] = r8
            r12[r6] = r9
            r13 = r10
        L300:
            if (r10 >= r4) goto L31b
            r14 = r12[r10]
            java.util.Iterator r14 = r14.iterator()
        L308:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L319
            java.lang.Object r15 = r14.next()
            di7 r15 = (defpackage.di7) r15
            java.util.HashSet r15 = r15.g
            if (r15 == 0) goto L308
            r13 = r6
        L319:
            if (r13 == 0) goto L31e
        L31b:
            r23 = r13
            goto L321
        L31e:
            int r10 = r10 + 1
            goto L300
        L321:
            rr6 r4 = r1.o0     // Catch: java.lang.IllegalArgumentException -> L363
            int r17 = r1.w()     // Catch: java.lang.IllegalArgumentException -> L363
            x9 r10 = r1.A     // Catch: java.lang.IllegalArgumentException -> L363
            w9 r10 = r10.B     // Catch: java.lang.IllegalArgumentException -> L363
            oe0 r12 = r1.f0     // Catch: java.lang.IllegalArgumentException -> L363
            android.util.Range r13 = r1.e0     // Catch: java.lang.IllegalArgumentException -> L363
            r16 = r4
            r19 = r8
            r20 = r9
            r18 = r10
            r21 = r12
            r22 = r13
            sr6 r9 = r16.f(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.IllegalArgumentException -> L363
            x9 r4 = r1.B     // Catch: java.lang.IllegalArgumentException -> L363
            if (r4 == 0) goto L365
            rr6 r4 = r1.o0     // Catch: java.lang.IllegalArgumentException -> L363
            int r17 = r1.w()     // Catch: java.lang.IllegalArgumentException -> L363
            x9 r8 = r1.B     // Catch: java.lang.IllegalArgumentException -> L363
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L363
            w9 r8 = r8.B     // Catch: java.lang.IllegalArgumentException -> L363
            oe0 r10 = r1.f0     // Catch: java.lang.IllegalArgumentException -> L363
            android.util.Range r12 = r1.e0     // Catch: java.lang.IllegalArgumentException -> L363
            r16 = r4
            r18 = r8
            r21 = r10
            r22 = r12
            sr6 r1 = r16.f(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.IllegalArgumentException -> L363
            r10 = r1
        L361:
            r6 = r0
            goto L367
        L363:
            r0 = move-exception
            goto L374
        L365:
            r10 = 0
            goto L361
        L367:
            db0 r0 = new db0
            r1 = r2
            r2 = r3
            r8 = r11
            r3 = r19
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L374:
            if (r26 != 0) goto L382
            r1.A()
            x9 r3 = r1.B
            if (r3 != 0) goto L382
            db0 r0 = r1.r(r2, r6)
            return r0
        L382:
            throw r0
        L383:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L383
            throw r0     // Catch: java.lang.Throwable -> L22a
        L386:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L22a
            throw r0
        L388:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L178
            throw r0
        L38a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L80
            throw r0
    }

    public final void v() {
            r4 = this;
            java.lang.Object r0 = r4.g0
            monitor-enter(r0)
            boolean r1 = r4.h0     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L3e
            x9 r1 = r4.A     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList r3 = r4.Y     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r1.m(r2)     // Catch: java.lang.Throwable -> L22
            x9 r1 = r4.B     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList r3 = r4.Y     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            r1.m(r2)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r4 = move-exception
            goto L40
        L24:
            java.lang.Object r1 = r4.g0     // Catch: java.lang.Throwable -> L22
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L22
            x9 r2 = r4.A     // Catch: java.lang.Throwable -> L3b
            v9 r2 = r2.L     // Catch: java.lang.Throwable -> L3b
            ve0 r3 = r2.b     // Catch: java.lang.Throwable -> L3b
            yy0 r3 = r3.f()     // Catch: java.lang.Throwable -> L3b
            r4.i0 = r3     // Catch: java.lang.Throwable -> L3b
            r2.g()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            r4.h0 = r1     // Catch: java.lang.Throwable -> L22
            goto L3e
        L3b:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3b
            throw r4     // Catch: java.lang.Throwable -> L22
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    public final int w() {
            r2 = this;
            java.lang.Object r0 = r2.g0
            monitor-enter(r0)
            ze0 r2 = r2.Z     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r2.b     // Catch: java.lang.Throwable -> L11
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L11
            int r2 = r2.e     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            r1 = 2
            if (r2 != r1) goto L13
            r2 = 1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = move-exception
            goto L19
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r2 = 0
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2     // Catch: java.lang.Throwable -> L11
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public final java.util.HashSet y(java.util.LinkedHashSet r5, boolean r6) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.Object r1 = r4.g0
            monitor-enter(r1)
            java.util.List r4 = r4.d0     // Catch: java.lang.Throwable -> L54
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L54
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L56
            if (r6 == 0) goto L18
            r4 = 3
            goto L19
        L18:
            r4 = 0
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()
            di7 r6 = (defpackage.di7) r6
            boolean r1 = r6 instanceof defpackage.pr6
            r1 = r1 ^ 1
            java.lang.String r2 = "Only support one level of sharing for now."
            defpackage.np2.s(r2, r1)
            java.util.Set r1 = r6.l()
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r4 & r2
            if (r3 != r2) goto L3b
            r0.add(r6)
            goto L1e
        L53:
            return r0
        L54:
            r4 = move-exception
            goto L64
        L56:
            java.lang.Object r4 = r4.next()     // Catch: java.lang.Throwable -> L54
            if (r4 != 0) goto L5e
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L54
        L5e:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L54
            r4.<init>()     // Catch: java.lang.Throwable -> L54
            throw r4     // Catch: java.lang.Throwable -> L54
        L64:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r4
    }

    public final java.util.List z() {
            r2 = this;
            java.lang.Object r0 = r2.g0
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            java.util.ArrayList r2 = r2.X     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}
