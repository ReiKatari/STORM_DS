package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fa6 implements defpackage.ga6, defpackage.m37, defpackage.wq7, defpackage.mo2 {
    public static final defpackage.fa6 B = null;
    public static final defpackage.fa6 L = null;
    public static final defpackage.fa6 R = null;
    public static final defpackage.fa6 X = null;
    public static final defpackage.fa6 Y = null;
    public final /* synthetic */ int A;

    static {
            fa6 r0 = new fa6
            r1 = 8
            r0.<init>(r1)
            defpackage.fa6.B = r0
            fa6 r0 = new fa6
            r1 = 9
            r0.<init>(r1)
            defpackage.fa6.L = r0
            fa6 r0 = new fa6
            r1 = 10
            r0.<init>(r1)
            defpackage.fa6.R = r0
            fa6 r0 = new fa6
            r1 = 11
            r0.<init>(r1)
            defpackage.fa6.X = r0
            fa6 r0 = new fa6
            r1 = 12
            r0.<init>(r1)
            defpackage.fa6.Y = r0
            return
    }

    public /* synthetic */ fa6(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ fa6(defpackage.di7 r1) {
            r0 = this;
            r1 = 14
            r0.A = r1
            r0.<init>()
            return
    }

    public static /* synthetic */ void c() {
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void d(java.lang.Object r2, java.lang.String r3) {
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void e(java.lang.String r1) {
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void f(java.lang.String r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void g(java.lang.StringBuilder r0, java.lang.Object r1, java.lang.Object r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ void h(java.lang.String r1) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void i(java.lang.String r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void j(java.lang.String r1) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.wq7
    public defpackage.p97 a(defpackage.fp r2) {
            r1 = this;
            p97 r1 = new p97
            jd1 r0 = defpackage.lk4.a
            r1.<init>(r2, r0)
            return r1
    }

    @Override // defpackage.mo2
    public java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L28
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r2, r0)
            r1.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            xw7 r0 = (defpackage.xw7) r0
            jw7 r0 = r0.a()
            r1.add(r0)
            goto L13
        L27:
            return r1
        L28:
            r1 = 0
            return r1
    }

    @Override // defpackage.ga6
    public defpackage.ea6 b(defpackage.ci r12) {
            r11 = this;
            int r11 = r11.A
            switch(r11) {
                case 0: goto L123;
                case 1: goto L11c;
                default: goto L5;
            }
        L5:
            java.lang.Object r11 = r12.L
            ea6 r11 = (defpackage.ea6) r11
            java.lang.Object r0 = r12.R
            ls0 r0 = (defpackage.ls0) r0
            if (r11 != 0) goto L17
            cs1 r11 = defpackage.cs1.k0
            ea6 r11 = defpackage.ej2.e(r12, r11)
            goto L11b
        L17:
            da6 r1 = r11.b
            da6 r2 = r11.a
            boolean r3 = r12.B
            if (r3 == 0) goto L28
            da6 r0 = defpackage.ej2.f(r12, r0, r2)
            r3 = r2
            r2 = r1
            r1 = r3
            r3 = r0
            goto L2e
        L28:
            da6 r0 = defpackage.ej2.f(r12, r0, r1)
            r3 = r2
            r2 = r0
        L2e:
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L36
            goto L11b
        L36:
            m71 r11 = r12.m()
            m71 r0 = defpackage.m71.CROSSED
            r1 = 1
            r4 = 0
            if (r11 == r0) goto L51
            m71 r11 = r12.m()
            m71 r0 = defpackage.m71.COLLAPSED
            if (r11 != r0) goto L4f
            int r11 = r3.b
            int r0 = r2.b
            if (r11 <= r0) goto L4f
            goto L51
        L4f:
            r11 = r4
            goto L52
        L51:
            r11 = r1
        L52:
            ea6 r0 = new ea6
            r0.<init>(r3, r2, r11)
            java.lang.Object r11 = r12.R
            ls0 r11 = (defpackage.ls0) r11
            da6 r2 = r0.a
            long r5 = r2.c
            da6 r3 = r0.b
            long r7 = r3.c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L6e
            int r5 = r2.b
            int r6 = r3.b
            if (r5 != r6) goto L11a
            goto L94
        L6e:
            boolean r5 = r0.c
            if (r5 == 0) goto L74
            r6 = r2
            goto L75
        L74:
            r6 = r3
        L75:
            int r6 = r6.b
            if (r6 == 0) goto L7b
            goto L11a
        L7b:
            if (r5 == 0) goto L7f
            r5 = r3
            goto L80
        L7f:
            r5 = r2
        L80:
            java.lang.Object r6 = r11.e
            a47 r6 = (defpackage.a47) r6
            z37 r6 = r6.a
            fp r6 = r6.a
            java.lang.String r6 = r6.B
            int r6 = r6.length()
            int r5 = r5.b
            if (r6 == r5) goto L94
            goto L11a
        L94:
            java.lang.Object r5 = r12.L
            ea6 r5 = (defpackage.ea6) r5
            java.lang.Object r6 = r11.e
            a47 r6 = (defpackage.a47) r6
            z37 r6 = r6.a
            fp r6 = r6.a
            java.lang.String r6 = r6.B
            if (r5 == 0) goto L11a
            int r6 = r6.length()
            if (r6 != 0) goto Lac
            goto L11a
        Lac:
            boolean r12 = r12.B
            java.lang.Object r6 = r11.e
            a47 r6 = (defpackage.a47) r6
            z37 r6 = r6.a
            fp r6 = r6.a
            java.lang.String r6 = r6.B
            int r7 = r11.b
            int r8 = r6.length()
            r9 = 2
            r10 = 0
            if (r7 != 0) goto Lda
            int r5 = defpackage.mp2.w(r4, r6)
            if (r12 == 0) goto Ld1
            da6 r11 = defpackage.ej2.l(r2, r11, r5)
            ea6 r11 = defpackage.ea6.a(r0, r11, r10, r1, r9)
            goto L11b
        Ld1:
            da6 r11 = defpackage.ej2.l(r3, r11, r5)
            ea6 r11 = defpackage.ea6.a(r0, r10, r11, r4, r1)
            goto L11b
        Lda:
            if (r7 != r8) goto Lf4
            int r5 = defpackage.mp2.x(r8, r6)
            if (r12 == 0) goto Leb
            da6 r11 = defpackage.ej2.l(r2, r11, r5)
            ea6 r11 = defpackage.ea6.a(r0, r11, r10, r4, r9)
            goto L11b
        Leb:
            da6 r11 = defpackage.ej2.l(r3, r11, r5)
            ea6 r11 = defpackage.ea6.a(r0, r10, r11, r1, r1)
            goto L11b
        Lf4:
            boolean r5 = r5.c
            if (r5 != r1) goto Lf9
            r4 = r1
        Lf9:
            r5 = r12 ^ r4
            if (r5 == 0) goto L102
            int r5 = defpackage.mp2.x(r7, r6)
            goto L106
        L102:
            int r5 = defpackage.mp2.w(r7, r6)
        L106:
            if (r12 == 0) goto L111
            da6 r11 = defpackage.ej2.l(r2, r11, r5)
            ea6 r11 = defpackage.ea6.a(r0, r11, r10, r4, r9)
            goto L11b
        L111:
            da6 r11 = defpackage.ej2.l(r3, r11, r5)
            ea6 r11 = defpackage.ea6.a(r0, r10, r11, r4, r1)
            goto L11b
        L11a:
            r11 = r0
        L11b:
            return r11
        L11c:
            vs0 r11 = defpackage.vs0.t0
            ea6 r11 = defpackage.ej2.e(r12, r11)
            return r11
        L123:
            cs1 r11 = defpackage.cs1.k0
            ea6 r11 = defpackage.ej2.e(r12, r11)
            return r11
    }
}
