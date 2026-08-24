package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qf  reason: default package */
/* loaded from: classes.dex */
public final class qf implements defpackage.qe1, android.view.View.OnAttachStateChangeListener {
    public final defpackage.te A;
    public final defpackage.i4 B;
    public defpackage.u63 L;
    public final java.util.ArrayList R;
    public final long X;
    public defpackage.lf Y;
    public boolean Z;
    public final defpackage.v80 d0;
    public defpackage.p94 e0;
    public long f0;
    public final defpackage.p94 g0;
    public defpackage.ya6 h0;
    public boolean i0;
    public final defpackage.n0 j0;

    public qf(defpackage.te r3, defpackage.i4 r4) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r2.B = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.R = r4
            r0 = 100
            r2.X = r0
            lf r4 = defpackage.lf.SHOW_ORIGINAL
            r2.Y = r4
            r4 = 1
            r2.Z = r4
            r0 = 0
            r1 = 6
            v80 r4 = defpackage.nb3.c(r4, r0, r0, r1)
            r2.d0 = r4
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
            p94 r4 = defpackage.h93.a
            r4.getClass()
            r2.e0 = r4
            p94 r0 = new p94
            r0.<init>()
            r2.g0 = r0
            ya6 r0 = new ya6
            ab6 r3 = r3.getSemanticsOwner()
            xa6 r3 = r3.a()
            r0.<init>(r3, r4)
            r2.h0 = r0
            n0 r3 = new n0
            r4 = 3
            r3.<init>(r2, r4)
            r2.j0 = r3
            return
    }

    public final java.lang.Object a(defpackage.s41 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.of
            if (r0 == 0) goto L13
            r0 = r8
            of r0 = (defpackage.of) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            of r0 = new of
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            n80 r2 = r0.R
            defpackage.oi2.Y(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L33:
            n80 r2 = r0.R
            defpackage.oi2.Y(r8)
            goto L51
        L39:
            defpackage.oi2.Y(r8)
            v80 r8 = r7.d0
            r8.getClass()
            n80 r2 = new n80
            r2.<init>(r8)
        L46:
            r0.R = r2
            r0.Z = r4
            java.lang.Object r8 = r2.b(r0)
            if (r8 != r1) goto L51
            goto L84
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L85
            r2.c()
            boolean r8 = r7.d()
            if (r8 == 0) goto L65
            r7.e()
        L65:
            te r8 = r7.A
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.i0
            if (r5 != 0) goto L78
            if (r8 == 0) goto L78
            r7.i0 = r4
            n0 r5 = r7.j0
            r8.post(r5)
        L78:
            r0.R = r2
            r0.Z = r3
            long r5 = r7.X
            java.lang.Object r8 = defpackage.q60.t(r5, r0)
            if (r8 != r1) goto L46
        L84:
            return r1
        L85:
            jg7 r7 = defpackage.jg7.a
            return r7
    }

    public final void b(defpackage.g93 r34) {
            r33 = this;
            r0 = r33
            r1 = r34
            int[] r2 = r1.b
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L1a8
            r6 = 0
        Le:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r12
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L19c
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r14 = 0
        L28:
            if (r14 >= r9) goto L196
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r7 & r15
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L17d
            int r17 = r6 << 3
            int r17 = r17 + r14
            r5 = r2[r17]
            r17 = r11
            p94 r11 = r0.g0
            java.lang.Object r11 = r11.b(r5)
            ya6 r11 = (defpackage.ya6) r11
            java.lang.Object r5 = r1.b(r5)
            za6 r5 = (defpackage.za6) r5
            r21 = 0
            if (r5 == 0) goto L51
            xa6 r5 = r5.a
            goto L53
        L51:
            r5 = r21
        L53:
            if (r5 == 0) goto L176
            r22 = r12
            int r12 = r5.f
            ta6 r5 = r5.d
            ja4 r5 = r5.A
            if (r11 != 0) goto Ld7
            java.lang.Object[] r11 = r5.b
            long[] r13 = r5.a
            r24 = r15
            int r15 = r13.length
            int r15 = r15 + (-2)
            r26 = r2
            if (r15 < 0) goto Ld2
            r16 = r10
            r10 = 0
        L6f:
            r1 = r13[r10]
            r27 = r7
            long r7 = ~r1
            long r7 = r7 << r17
            long r7 = r7 & r1
            long r7 = r7 & r22
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r7 == 0) goto Lc9
            int r7 = r10 - r15
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L85:
            if (r8 >= r7) goto Lc5
            long r29 = r1 & r24
            int r29 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r29 >= 0) goto Lbe
            int r29 = r10 << 3
            int r29 = r29 + r8
            r29 = r11[r29]
            r30 = r1
            r1 = r29
            fb6 r1 = (defpackage.fb6) r1
            fb6 r2 = defpackage.bb6.C
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r5.g(r2)
            if (r1 != 0) goto La9
            r1 = r21
        La9:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb4
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            fp r1 = (defpackage.fp) r1
            goto Lb6
        Lb4:
            r1 = r21
        Lb6:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.g(r12, r1)
            goto Lc0
        Lbe:
            r30 = r1
        Lc0:
            long r1 = r30 >> r16
            int r8 = r8 + 1
            goto L85
        Lc5:
            r1 = r16
            if (r7 != r1) goto Ld4
        Lc9:
            if (r10 == r15) goto Ld4
            int r10 = r10 + 1
            r7 = r27
            r16 = 8
            goto L6f
        Ld2:
            r27 = r7
        Ld4:
            r15 = r14
            goto L173
        Ld7:
            r26 = r2
            r27 = r7
            r24 = r15
            java.lang.Object[] r1 = r5.b
            long[] r2 = r5.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto Ld4
            r10 = r1
            r13 = r2
            r8 = 0
        Le9:
            r1 = r13[r8]
            r29 = r13
            r15 = r14
            long r13 = ~r1
            long r13 = r13 << r17
            long r13 = r13 & r1
            long r13 = r13 & r22
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 == 0) goto L16a
            int r13 = r8 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r16 = 8
            int r13 = 8 - r13
            r14 = 0
        L102:
            if (r14 >= r13) goto L166
            long r30 = r1 & r24
            int r30 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r30 >= 0) goto L15c
            int r30 = r8 << 3
            int r30 = r30 + r14
            r30 = r10[r30]
            r31 = r1
            r1 = r30
            fb6 r1 = (defpackage.fb6) r1
            fb6 r2 = defpackage.bb6.C
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L159
            ta6 r1 = r11.a
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L12a
            r1 = r21
        L12a:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L135
            java.lang.Object r1 = defpackage.gt0.J0(r1)
            fp r1 = (defpackage.fp) r1
            goto L137
        L135:
            r1 = r21
        L137:
            java.lang.Object r2 = r5.g(r2)
            if (r2 != 0) goto L13f
            r2 = r21
        L13f:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L14a
            java.lang.Object r2 = defpackage.gt0.J0(r2)
            fp r2 = (defpackage.fp) r2
            goto L14c
        L14a:
            r2 = r21
        L14c:
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L159
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.g(r12, r1)
        L159:
            r1 = 8
            goto L15f
        L15c:
            r31 = r1
            goto L159
        L15f:
            long r30 = r31 >> r1
            int r14 = r14 + 1
            r1 = r30
            goto L102
        L166:
            r1 = 8
            if (r13 != r1) goto L173
        L16a:
            if (r8 == r7) goto L173
            int r8 = r8 + 1
            r14 = r15
            r13 = r29
            goto Le9
        L173:
            r1 = 8
            goto L187
        L176:
            java.lang.String r0 = "no value for specified key"
            ug r0 = defpackage.i61.e(r0)
            throw r0
        L17d:
            r26 = r2
            r27 = r7
            r17 = r11
            r22 = r12
            r15 = r14
            r1 = r10
        L187:
            long r7 = r27 >> r1
            int r14 = r15 + 1
            r10 = r1
            r11 = r17
            r12 = r22
            r2 = r26
            r1 = r34
            goto L28
        L196:
            r26 = r2
            r1 = r10
            if (r9 != r1) goto L1a8
            goto L19e
        L19c:
            r26 = r2
        L19e:
            if (r6 == r4) goto L1a8
            int r6 = r6 + 1
            r1 = r34
            r2 = r26
            goto Le
        L1a8:
            return
    }

    public final defpackage.g93 c() {
            r2 = this;
            boolean r0 = r2.Z
            if (r0 == 0) goto L1b
            r0 = 0
            r2.Z = r0
            te r0 = r2.A
            ab6 r0 = r0.getSemanticsOwner()
            ne r1 = defpackage.ne.Y
            p94 r0 = defpackage.u24.n(r0, r1)
            r2.e0 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.f0 = r0
        L1b:
            p94 r2 = r2.e0
            return r2
    }

    public final boolean d() {
            r0 = this;
            u63 r0 = r0.L
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void e() {
            r10 = this;
            u63 r0 = r10.L
            if (r0 != 0) goto L6
            goto L8a
        L6:
            java.lang.Object r1 = r0.L
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto L10
            goto L8a
        L10:
            java.util.ArrayList r10 = r10.R
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L8a
            int r2 = r10.size()
            r4 = 0
            r5 = r4
        L1e:
            r6 = 1
            if (r5 >= r2) goto L65
            java.lang.Object r7 = r10.get(r5)
            h31 r7 = (defpackage.h31) r7
            i31 r8 = r7.c
            int[] r9 = defpackage.nf.a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r6) goto L4f
            r6 = 2
            if (r8 != r6) goto L4b
            int r6 = r7.a
            long r6 = (long) r6
            android.view.autofill.AutofillId r6 = r0.s(r6)
            if (r6 == 0) goto L62
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L62
            android.view.contentcapture.ContentCaptureSession r7 = defpackage.yz0.g(r1)
            defpackage.rp.k(r7, r6)
            goto L62
        L4b:
            defpackage.i.d()
            return
        L4f:
            j97 r6 = r7.d
            if (r6 == 0) goto L62
            java.lang.Object r6 = r6.B
            android.view.ViewStructure r6 = (android.view.ViewStructure) r6
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L62
            android.view.contentcapture.ContentCaptureSession r7 = defpackage.yz0.g(r1)
            defpackage.rp.j(r7, r6)
        L62:
            int r5 = r5 + 1
            goto L1e
        L65:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L87
            android.view.contentcapture.ContentCaptureSession r1 = defpackage.yz0.g(r1)
            java.lang.Object r0 = r0.B
            android.view.View r0 = (android.view.View) r0
            u2 r0 = defpackage.hi2.z(r0)
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = r0.b
            android.view.autofill.AutofillId r0 = defpackage.au.b(r0)
            long[] r2 = new long[r6]
            r5 = -9223372036854775808
            r2[r4] = r5
            defpackage.rp.m(r1, r0, r2)
        L87:
            r10.clear()
        L8a:
            return
    }

    public final void f(defpackage.xa6 r10, defpackage.ya6 r11) {
            r9 = this;
            pf r0 = new pf
            r1 = 0
            r0.<init>(r1, r11, r9)
            r10.getClass()
            r11 = 4
            java.util.List r2 = defpackage.xa6.j(r11, r10)
            int r3 = r2.size()
            r4 = r1
            r5 = r4
        L14:
            if (r4 >= r3) goto L35
            java.lang.Object r6 = r2.get(r4)
            r7 = r6
            xa6 r7 = (defpackage.xa6) r7
            g93 r8 = r9.c()
            int r7 = r7.f
            boolean r7 = r8.a(r7)
            if (r7 == 0) goto L32
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r0.o(r7, r6)
            int r5 = r5 + 1
        L32:
            int r4 = r4 + 1
            goto L14
        L35:
            java.util.List r10 = defpackage.xa6.j(r11, r10)
            int r11 = r10.size()
        L3d:
            if (r1 >= r11) goto L6f
            java.lang.Object r0 = r10.get(r1)
            xa6 r0 = (defpackage.xa6) r0
            g93 r2 = r9.c()
            int r3 = r0.f
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L6c
            p94 r2 = r9.g0
            boolean r4 = r2.a(r3)
            if (r4 == 0) goto L6c
            java.lang.Object r2 = r2.b(r3)
            if (r2 == 0) goto L65
            ya6 r2 = (defpackage.ya6) r2
            r9.f(r0, r2)
            goto L6c
        L65:
            java.lang.String r9 = "node not present in pruned tree before this change"
            ug r9 = defpackage.i61.e(r9)
            throw r9
        L6c:
            int r1 = r1 + 1
            goto L3d
        L6f:
            return
    }

    public final void g(int r5, java.lang.String r6) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L7
            goto L1e
        L7:
            u63 r4 = r4.L
            if (r4 != 0) goto Lc
            goto L1e
        Lc:
            long r2 = (long) r5
            android.view.autofill.AutofillId r5 = r4.s(r2)
            if (r5 == 0) goto L1f
            if (r0 < r1) goto L1e
            java.lang.Object r4 = r4.L
            android.view.contentcapture.ContentCaptureSession r4 = defpackage.yz0.g(r4)
            defpackage.rp.l(r4, r5, r6)
        L1e:
            return
        L1f:
            java.lang.String r4 = "Invalid content capture ID"
            ug r4 = defpackage.i61.e(r4)
            throw r4
    }

    public final void i(int r19, defpackage.xa6 r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r0.d()
            if (r2 != 0) goto Lb
            return
        Lb:
            ta6 r2 = r1.d
            ja4 r2 = r2.A
            fb6 r3 = defpackage.bb6.E
            java.lang.Object r3 = r2.g(r3)
            r4 = 0
            if (r3 != 0) goto L19
            r3 = r4
        L19:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            lf r5 = r0.Y
            lf r6 = defpackage.lf.SHOW_ORIGINAL
            if (r5 != r6) goto L45
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = defpackage.nb3.k(r3, r5)
            if (r5 == 0) goto L45
            fb6 r3 = defpackage.sa6.m
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L32
            r2 = r4
        L32:
            y1 r2 = (defpackage.y1) r2
            if (r2 == 0) goto L6e
            ao2 r2 = r2.b
            qn2 r2 = (defpackage.qn2) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.g(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L6e
        L45:
            lf r5 = r0.Y
            lf r6 = defpackage.lf.SHOW_TRANSLATED
            if (r5 != r6) goto L6e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r3 = defpackage.nb3.k(r3, r5)
            if (r3 == 0) goto L6e
            fb6 r3 = defpackage.sa6.m
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L5c
            r2 = r4
        L5c:
            y1 r2 = (defpackage.y1) r2
            if (r2 == 0) goto L6e
            ao2 r2 = r2.b
            qn2 r2 = (defpackage.qn2) r2
            if (r2 == 0) goto L6e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Object r2 = r2.g(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L6e:
            int r6 = r1.f
            u63 r2 = r0.L
            r3 = 0
            if (r2 != 0) goto L78
        L75:
            r10 = r4
            goto L1b0
        L78:
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r5 >= r7) goto L7f
            goto L75
        L7f:
            te r8 = r0.A
            u2 r8 = defpackage.hi2.z(r8)
            if (r8 != 0) goto L88
            goto L75
        L88:
            xa6 r9 = r1.l()
            int r10 = r1.f
            if (r9 == 0) goto L9a
            int r8 = r9.f
            long r8 = (long) r8
            android.view.autofill.AutofillId r8 = r2.s(r8)
            if (r8 != 0) goto La0
            goto L75
        L9a:
            java.lang.Object r8 = r8.b
            android.view.autofill.AutofillId r8 = defpackage.au.b(r8)
        La0:
            long r11 = (long) r10
            if (r5 < r7) goto Lb5
            java.lang.Object r2 = r2.L
            android.view.contentcapture.ContentCaptureSession r2 = defpackage.yz0.g(r2)
            android.view.ViewStructure r2 = defpackage.rp.i(r2, r8, r11)
            j97 r5 = new j97
            r7 = 10
            r5.<init>(r2, r7)
            goto Lb6
        Lb5:
            r5 = r4
        Lb6:
            if (r5 != 0) goto Lb9
            goto L75
        Lb9:
            java.lang.Object r2 = r5.B
            r11 = r2
            android.view.ViewStructure r11 = (android.view.ViewStructure) r11
            ta6 r2 = r1.d
            fb6 r7 = defpackage.bb6.L
            ja4 r8 = r2.A
            boolean r7 = r8.c(r7)
            if (r7 == 0) goto Lcb
            goto L75
        Lcb:
            android.os.Bundle r7 = r11.getExtras()
            if (r7 == 0) goto Ldf
            java.lang.String r9 = "android.view.contentcapture.EventTimestamp"
            long r12 = r0.f0
            r7.putLong(r9, r12)
            java.lang.String r9 = "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"
            r12 = r19
            r7.putInt(r9, r12)
        Ldf:
            fb6 r7 = defpackage.bb6.A
            java.lang.Object r7 = r8.g(r7)
            if (r7 != 0) goto Le8
            r7 = r4
        Le8:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lef
            r11.setId(r10, r4, r4, r7)
        Lef:
            fb6 r7 = defpackage.bb6.n
            java.lang.Object r7 = r8.g(r7)
            if (r7 != 0) goto Lf8
            r7 = r4
        Lf8:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L101
            java.lang.String r7 = "android.widget.ViewGroup"
            r11.setClassName(r7)
        L101:
            fb6 r7 = defpackage.bb6.C
            java.lang.Object r7 = r8.g(r7)
            if (r7 != 0) goto L10a
            r7 = r4
        L10a:
            java.util.List r7 = (java.util.List) r7
            r9 = 62
            java.lang.String r10 = "\n"
            if (r7 == 0) goto L11e
            java.lang.String r12 = "android.widget.TextView"
            r11.setClassName(r12)
            java.lang.String r7 = defpackage.ex3.a(r9, r4, r10, r7)
            r11.setText(r7)
        L11e:
            fb6 r7 = defpackage.bb6.G
            java.lang.Object r7 = r8.g(r7)
            if (r7 != 0) goto L127
            r7 = r4
        L127:
            fp r7 = (defpackage.fp) r7
            if (r7 == 0) goto L133
            java.lang.String r12 = "android.widget.EditText"
            r11.setClassName(r12)
            r11.setText(r7)
        L133:
            fb6 r7 = defpackage.bb6.a
            java.lang.Object r7 = r8.g(r7)
            if (r7 != 0) goto L13c
            r7 = r4
        L13c:
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L147
            java.lang.String r7 = defpackage.ex3.a(r9, r4, r10, r7)
            r11.setContentDescription(r7)
        L147:
            fb6 r7 = defpackage.bb6.z
            java.lang.Object r7 = r8.g(r7)
            if (r7 != 0) goto L150
            r7 = r4
        L150:
            mq5 r7 = (defpackage.mq5) r7
            if (r7 == 0) goto L15f
            int r7 = r7.a
            java.lang.String r7 = defpackage.ln2.d0(r7)
            if (r7 == 0) goto L15f
            r11.setClassName(r7)
        L15f:
            a47 r2 = defpackage.ln2.E(r2)
            if (r2 == 0) goto L180
            z37 r2 = r2.a
            s47 r7 = r2.b
            qh1 r2 = r2.g
            nn6 r7 = r7.a
            long r7 = r7.b
            float r7 = defpackage.x47.c(r7)
            float r8 = r2.a()
            float r8 = r8 * r7
            float r2 = r2.Y()
            float r2 = r2 * r8
            r11.setTextStyle(r2, r3, r3, r3)
        L180:
            eg4 r2 = r1.d()
            if (r2 == 0) goto L196
            z64 r7 = r2.Y0()
            boolean r7 = r7.j0
            if (r7 == 0) goto L18f
            r4 = r2
        L18f:
            if (r4 == 0) goto L196
            of5 r2 = r1.a(r4)
            goto L198
        L196:
            of5 r2 = defpackage.of5.e
        L198:
            float r4 = r2.a
            int r12 = (int) r4
            float r7 = r2.b
            int r13 = (int) r7
            float r8 = r2.c
            float r8 = r8 - r4
            int r4 = (int) r8
            float r2 = r2.d
            float r2 = r2 - r7
            int r2 = (int) r2
            r14 = 0
            r15 = 0
            r17 = r2
            r16 = r4
            r11.setDimens(r12, r13, r14, r15, r16, r17)
            r10 = r5
        L1b0:
            if (r10 != 0) goto L1b3
            goto L1c1
        L1b3:
            h31 r5 = new h31
            long r7 = r0.f0
            i31 r9 = defpackage.i31.VIEW_APPEAR
            r5.<init>(r6, r7, r9, r10)
            java.util.ArrayList r2 = r0.R
            r2.add(r5)
        L1c1:
            r2 = 4
            java.util.List r1 = defpackage.xa6.j(r2, r1)
            int r2 = r1.size()
            r4 = r3
        L1cb:
            if (r3 >= r2) goto L1ea
            java.lang.Object r5 = r1.get(r3)
            r6 = r5
            xa6 r6 = (defpackage.xa6) r6
            g93 r7 = r0.c()
            int r6 = r6.f
            boolean r6 = r7.a(r6)
            if (r6 == 0) goto L1e7
            xa6 r5 = (defpackage.xa6) r5
            r0.i(r4, r5)
            int r4 = r4 + 1
        L1e7:
            int r3 = r3 + 1
            goto L1cb
        L1ea:
            return
    }

    public final void j(defpackage.xa6 r8) {
            r7 = this;
            boolean r0 = r7.d()
            if (r0 != 0) goto L7
            goto L30
        L7:
            int r2 = r8.f
            h31 r1 = new h31
            long r3 = r7.f0
            i31 r5 = defpackage.i31.VIEW_DISAPPEAR
            r6 = 0
            r1.<init>(r2, r3, r5, r6)
            java.util.ArrayList r0 = r7.R
            r0.add(r1)
            r0 = 4
            java.util.List r8 = defpackage.xa6.j(r0, r8)
            int r0 = r8.size()
            r1 = 0
        L22:
            if (r1 >= r0) goto L30
            java.lang.Object r2 = r8.get(r1)
            xa6 r2 = (defpackage.xa6) r2
            r7.j(r2)
            int r1 = r1 + 1
            goto L22
        L30:
            return
    }

    public final void k() {
            r17 = this;
            r0 = r17
            p94 r1 = r0.g0
            r1.c()
            g93 r2 = r0.c()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            za6 r13 = (defpackage.za6) r13
            ya6 r15 = new ya6
            xa6 r13 = r13.a
            g93 r6 = r0.c()
            r15.<init>(r13, r6)
            r1.i(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            ya6 r1 = new ya6
            te r2 = r0.A
            ab6 r2 = r2.getSemanticsOwner()
            xa6 r2 = r2.a()
            g93 r3 = r0.c()
            r1.<init>(r2, r3)
            r0.h0 = r1
            return
    }

    @Override // defpackage.qe1
    public final void onStart(defpackage.hu3 r2) {
            r1 = this;
            i4 r2 = r1.B
            java.lang.Object r2 = r2.c()
            u63 r2 = (defpackage.u63) r2
            r1.L = r2
            te r2 = r1.A
            ab6 r2 = r2.getSemanticsOwner()
            xa6 r2 = r2.a()
            r0 = -1
            r1.i(r0, r2)
            r1.e()
            return
    }

    @Override // defpackage.qe1
    public final void onStop(defpackage.hu3 r1) {
            r0 = this;
            te r1 = r0.A
            ab6 r1 = r1.getSemanticsOwner()
            xa6 r1 = r1.a()
            r0.j(r1)
            r0.e()
            r1 = 0
            r0.L = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            te r2 = r1.A
            android.os.Handler r2 = r2.getHandler()
            r2.getClass()
            n0 r0 = r1.j0
            r2.removeCallbacks(r0)
            r2 = 0
            r1.L = r2
            return
    }
}
