package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ji  reason: default package */
/* loaded from: classes.dex */
public final class ji extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public java.lang.Object d0;
    public java.lang.Object e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ java.lang.Object g0;

    public /* synthetic */ ji(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, defpackage.r41 r6, int r7) {
            r0 = this;
            r0.X = r7
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r0.g0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    public /* synthetic */ ji(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
            r0.g0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public /* synthetic */ ji(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.e0 = r1
            r0.f0 = r2
            r0.g0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ ji(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.f0 = r1
            r0.g0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public ji(defpackage.n96 r2, java.lang.Object r3, defpackage.ga7 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 13
            r1.X = r0
            r1.f0 = r2
            r1.Z = r3
            r1.g0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public ji(defpackage.on2 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 14
            r1.X = r0
            r1.g0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    private final java.lang.Object v(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = r10.g0
            on2 r0 = (defpackage.on2) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r10.Y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L14
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L29
        L14:
            java.lang.Object r2 = r10.Z
            java.lang.Object r5 = r10.e0
            ul0 r5 = (defpackage.ul0) r5
            java.lang.Object r7 = r10.d0
            s35 r7 = (defpackage.s35) r7
            java.lang.Object r8 = r10.f0
            ne2 r8 = (defpackage.ne2) r8
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L26
            goto L70
        L26:
            r10 = move-exception
            goto La0
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r6
        L2f:
            java.lang.Object r2 = r10.Z
            java.lang.Object r5 = r10.e0
            ul0 r5 = (defpackage.ul0) r5
            java.lang.Object r7 = r10.d0
            s35 r7 = (defpackage.s35) r7
            java.lang.Object r8 = r10.f0
            ne2 r8 = (defpackage.ne2) r8
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L26
            goto L81
        L41:
            defpackage.oi2.Y(r11)
            java.lang.Object r11 = r10.f0
            r8 = r11
            ne2 r8 = (defpackage.ne2) r8
            s35 r7 = new s35
            r7.<init>()
            si6 r11 = new si6
            r11.<init>()
            r7.A = r11
            r11 = 6
            v80 r11 = defpackage.nb3.c(r5, r6, r6, r11)
            java.lang.Object r2 = r7.C(r11, r0)     // Catch: java.lang.Throwable -> L9e
            r10.f0 = r8     // Catch: java.lang.Throwable -> L9e
            r10.d0 = r7     // Catch: java.lang.Throwable -> L9e
            r10.e0 = r11     // Catch: java.lang.Throwable -> L9e
            r10.Z = r2     // Catch: java.lang.Throwable -> L9e
            r10.Y = r5     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r8.a(r2, r10)     // Catch: java.lang.Throwable -> L9e
            if (r5 != r1) goto L6f
            goto L9b
        L6f:
            r5 = r11
        L70:
            r10.f0 = r8     // Catch: java.lang.Throwable -> L26
            r10.d0 = r7     // Catch: java.lang.Throwable -> L26
            r10.e0 = r5     // Catch: java.lang.Throwable -> L26
            r10.Z = r2     // Catch: java.lang.Throwable -> L26
            r10.Y = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r5.o(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r1) goto L81
            goto L9b
        L81:
            java.lang.Object r11 = r7.C(r5, r0)     // Catch: java.lang.Throwable -> L26
            boolean r9 = defpackage.nb3.k(r11, r2)     // Catch: java.lang.Throwable -> L26
            if (r9 != 0) goto L70
            r10.f0 = r8     // Catch: java.lang.Throwable -> L26
            r10.d0 = r7     // Catch: java.lang.Throwable -> L26
            r10.e0 = r5     // Catch: java.lang.Throwable -> L26
            r10.Z = r11     // Catch: java.lang.Throwable -> L26
            r10.Y = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r8.a(r11, r10)     // Catch: java.lang.Throwable -> L26
            if (r2 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r2 = r11
            goto L70
        L9e:
            r10 = move-exception
            r5 = r11
        La0:
            java.lang.Object r11 = r7.A
            gx0 r11 = (defpackage.gx0) r11
            if (r11 == 0) goto La9
            r11.k(r5)
        La9:
            java.lang.Object r11 = r7.A
            gx0 r11 = (defpackage.gx0) r11
            if (r11 == 0) goto Lb0
            goto Lb5
        Lb0:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.r05.b(r0)
        Lb5:
            r11.e()
            r7.A = r6
            throw r10
    }

    private final java.lang.Object x(java.lang.Object r11) {
            r10 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.Y
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r11)
            goto L3f
        Ld:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L14:
            defpackage.oi2.Y(r11)
            java.lang.Object r11 = r10.Z
            r4 = r11
            w61 r4 = (defpackage.w61) r4
            java.lang.Object r11 = r10.d0
            zy4 r11 = (defpackage.zy4) r11
            on1 r3 = new on1
            java.lang.Object r1 = r10.e0
            r5 = r1
            c27 r5 = (defpackage.c27) r5
            java.lang.Object r1 = r10.f0
            r6 = r1
            j4 r6 = (defpackage.j4) r6
            java.lang.Object r1 = r10.g0
            r7 = r1
            j25 r7 = (defpackage.j25) r7
            r8 = 0
            r9 = 2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.Y = r2
            java.lang.Object r10 = defpackage.uj2.o(r11, r3, r10)
            if (r10 != r0) goto L3f
            return r0
        L3f:
            jg7 r10 = defpackage.jg7.a
            return r10
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto Lf7;
                case 1: goto Le8;
                case 2: goto Ld9;
                case 3: goto Lca;
                case 4: goto Lbb;
                case 5: goto Lac;
                case 6: goto L9d;
                case 7: goto L8e;
                case 8: goto L7f;
                case 9: goto L70;
                case 10: goto L61;
                case 11: goto L52;
                case 12: goto L43;
                case 13: goto L34;
                case 14: goto L25;
                case 15: goto L16;
                default: goto L7;
            }
        L7:
            k86 r3 = (defpackage.k86) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            ne2 r3 = (defpackage.ne2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L52:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L61:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L70:
            le2 r3 = (defpackage.le2) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L7f:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L8e:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L9d:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lac:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lbb:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lca:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Ld9:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Le8:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        Lf7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            ji r2 = (defpackage.ji) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.X
            java.lang.Object r1 = r11.g0
            switch(r0) {
                case 0: goto L183;
                case 1: goto L175;
                case 2: goto L167;
                case 3: goto L148;
                case 4: goto L129;
                case 5: goto L10a;
                case 6: goto Lfc;
                case 7: goto Ldd;
                case 8: goto Lbd;
                case 9: goto L9f;
                case 10: goto L90;
                case 11: goto L70;
                case 12: goto L57;
                case 13: goto L48;
                case 14: goto L3d;
                case 15: goto L1f;
                default: goto L7;
            }
        L7:
            ji r2 = new ji
            java.lang.Object r0 = r11.e0
            r3 = r0
            z87 r3 = (defpackage.z87) r3
            java.lang.Object r11 = r11.f0
            r4 = r11
            m86 r4 = (defpackage.m86) r4
            r5 = r1
            dh5 r5 = (defpackage.dh5) r5
            r7 = 16
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r2.Z = r13
            return r2
        L1f:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.d0
            r4 = r12
            zy4 r4 = (defpackage.zy4) r4
            java.lang.Object r12 = r11.e0
            r5 = r12
            c27 r5 = (defpackage.c27) r5
            java.lang.Object r11 = r11.f0
            r6 = r11
            j4 r6 = (defpackage.j4) r6
            r7 = r1
            j25 r7 = (defpackage.j25) r7
            r8 = r9
            r9 = 15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.Z = r13
            return r3
        L3d:
            r9 = r12
            ji r11 = new ji
            on2 r1 = (defpackage.on2) r1
            r11.<init>(r1, r9)
            r11.f0 = r13
            return r11
        L48:
            r9 = r12
            ji r12 = new ji
            java.lang.Object r13 = r11.f0
            n96 r13 = (defpackage.n96) r13
            java.lang.Object r11 = r11.Z
            ga7 r1 = (defpackage.ga7) r1
            r12.<init>(r13, r11, r1, r9)
            return r12
        L57:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.e0
            r4 = r12
            if5 r4 = (defpackage.if5) r4
            java.lang.Object r11 = r11.f0
            r5 = r11
            hf5 r5 = (defpackage.hf5) r5
            r6 = r1
            um r6 = (defpackage.um) r6
            r8 = 12
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r3.Z = r13
            return r3
        L70:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.Z
            r4 = r12
            z23 r4 = (defpackage.z23) r4
            java.lang.Object r12 = r11.d0
            r5 = r12
            pe5 r5 = (defpackage.pe5) r5
            java.lang.Object r12 = r11.e0
            r6 = r12
            wi6 r6 = (defpackage.wi6) r6
            java.lang.Object r11 = r11.f0
            r7 = r11
            k62 r7 = (defpackage.k62) r7
            r8 = r1
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            r10 = 11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L90:
            r9 = r12
            ji r12 = new ji
            java.lang.Object r11 = r11.f0
            zp3 r11 = (defpackage.zp3) r11
            java.util.List r1 = (java.util.List) r1
            r13 = 10
            r12.<init>(r11, r1, r9, r13)
            return r12
        L9f:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.d0
            r4 = r12
            uw0 r4 = (defpackage.uw0) r4
            java.lang.Object r12 = r11.e0
            r5 = r12
            qa4 r5 = (defpackage.qa4) r5
            java.lang.Object r11 = r11.f0
            r6 = r11
            rs4 r6 = (defpackage.rs4) r6
            r7 = r1
            qa4 r7 = (defpackage.qa4) r7
            r8 = r9
            r9 = 9
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.Z = r13
            return r3
        Lbd:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.Z
            r4 = r12
            dh5 r4 = (defpackage.dh5) r4
            java.lang.Object r12 = r11.d0
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r11.e0
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = r11.f0
            r7 = r11
            hq2 r7 = (defpackage.hq2) r7
            r8 = r1
            f13 r8 = (defpackage.f13) r8
            r10 = 8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        Ldd:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.Z
            r4 = r12
            hu1 r4 = (defpackage.hu1) r4
            java.lang.Object r12 = r11.d0
            r5 = r12
            sz1 r5 = (defpackage.sz1) r5
            java.lang.Object r12 = r11.e0
            r6 = r12
            dy1 r6 = (defpackage.dy1) r6
            java.lang.Object r11 = r11.f0
            r7 = r11
            c46 r7 = (defpackage.c46) r7
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r10 = 7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        Lfc:
            r9 = r12
            ji r12 = new ji
            java.lang.Object r11 = r11.f0
            sz1 r11 = (defpackage.sz1) r11
            pq5 r1 = (defpackage.pq5) r1
            r13 = 6
            r12.<init>(r11, r1, r9, r13)
            return r12
        L10a:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.Z
            r4 = r12
            s70 r4 = (defpackage.s70) r4
            java.lang.Object r12 = r11.d0
            r5 = r12
            c37 r5 = (defpackage.c37) r5
            java.lang.Object r12 = r11.e0
            r6 = r12
            jt3 r6 = (defpackage.jt3) r6
            java.lang.Object r11 = r11.f0
            r7 = r11
            b47 r7 = (defpackage.b47) r7
            r8 = r1
            mk4 r8 = (defpackage.mk4) r8
            r10 = 5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L129:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.Z
            r4 = r12
            jt3 r4 = (defpackage.jt3) r4
            java.lang.Object r12 = r11.d0
            r5 = r12
            qa4 r5 = (defpackage.qa4) r5
            java.lang.Object r12 = r11.e0
            r6 = r12
            o37 r6 = (defpackage.o37) r6
            java.lang.Object r11 = r11.f0
            r7 = r11
            p27 r7 = (defpackage.p27) r7
            r8 = r1
            l33 r8 = (defpackage.l33) r8
            r10 = 4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L148:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.Z
            r4 = r12
            x56 r4 = (defpackage.x56) r4
            java.lang.Object r12 = r11.d0
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r12 = r11.e0
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r11 = r11.f0
            r7 = r11
            v10 r7 = (defpackage.v10) r7
            r8 = r1
            n00 r8 = (defpackage.n00) r8
            r10 = 3
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L167:
            r9 = r12
            ji r12 = new ji
            java.lang.Object r11 = r11.f0
            jk r11 = (defpackage.jk) r11
            lb5 r1 = (defpackage.lb5) r1
            r13 = 2
            r12.<init>(r11, r1, r9, r13)
            return r12
        L175:
            r9 = r12
            ji r12 = new ji
            java.lang.Object r11 = r11.f0
            hk r11 = (defpackage.hk) r11
            hb5 r1 = (defpackage.hb5) r1
            r13 = 1
            r12.<init>(r11, r1, r9, r13)
            return r12
        L183:
            r9 = r12
            ji r3 = new ji
            java.lang.Object r12 = r11.d0
            r4 = r12
            rj r4 = (defpackage.rj) r4
            java.lang.Object r12 = r11.e0
            r5 = r12
            qn2 r5 = (defpackage.qn2) r5
            java.lang.Object r11 = r11.f0
            r6 = r11
            ki r6 = (defpackage.ki) r6
            r7 = r1
            et3 r7 = (defpackage.et3) r7
            r8 = r9
            r9 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.Z = r13
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r23) {
            r22 = this;
            r1 = r22
            int r0 = r1.X
            r5 = 0
            r6 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            switch(r0) {
                case 0: goto L9f7;
                case 1: goto L993;
                case 2: goto L943;
                case 3: goto L8fb;
                case 4: goto L8a7;
                case 5: goto L822;
                case 6: goto L79b;
                case 7: goto L750;
                case 8: goto L710;
                case 9: goto L666;
                case 10: goto L4cb;
                case 11: goto L482;
                case 12: goto L2cc;
                case 13: goto L11b;
                case 14: goto L116;
                case 15: goto L111;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r1.f0
            m86 r0 = (defpackage.m86) r0
            java.lang.Object r2 = r1.g0
            dh5 r2 = (defpackage.dh5) r2
            java.lang.Object r5 = r1.e0
            z87 r5 = (defpackage.z87) r5
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r1.Y
            if (r7 == 0) goto L37
            if (r7 != r9) goto L30
            java.lang.Object r7 = r1.d0
            dh5 r7 = (defpackage.dh5) r7
            java.lang.Object r11 = r1.Z
            k86 r11 = (defpackage.k86) r11
            defpackage.oi2.Y(r23)
            r12 = r11
            r11 = r7
            r7 = r23
            goto L82
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            goto L110
        L37:
            defpackage.oi2.Y(r23)
            java.lang.Object r7 = r1.Z
            k86 r7 = (defpackage.k86) r7
            java.lang.Object r11 = r2.A
            x87 r11 = (defpackage.x87) r11
            long r11 = r11.a
            long r11 = r0.e(r11)
            float r11 = r0.i(r11)
            m86 r12 = r5.a
            float r11 = r12.d(r11)
            long r13 = r12.h(r11)
            long r13 = r7.a(r9, r13)
            long r13 = r12.e(r13)
            r12.g(r13)
            r11 = r7
        L62:
            java.lang.Object r7 = r2.A
            x87 r7 = (defpackage.x87) r7
            boolean r7 = r7.c
            if (r7 != 0) goto L10e
            v80 r7 = r5.f
            r1.Z = r11
            r1.d0 = r2
            r1.Y = r9
            bf4 r12 = new bf4
            r12.<init>(r7, r10, r8)
            java.lang.Object r7 = defpackage.g04.C(r12, r1)
            if (r7 != r6) goto L80
            r10 = r6
            goto L110
        L80:
            r12 = r11
            r11 = r2
        L82:
            r11.A = r7
            java.lang.Object r7 = r2.A
            x87 r7 = (defpackage.x87) r7
            yc1 r11 = r5.e
            long r13 = r7.b
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r7.a
            java.lang.Object r7 = r11.A
            rl7 r7 = (defpackage.rl7) r7
            r17 = 32
            long r8 = r3 >> r17
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r7.a(r8, r13)
            java.lang.Object r7 = r11.B
            rl7 r7 = (defpackage.rl7) r7
            long r3 = r3 & r15
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r7.a(r3, r13)
            v80 r3 = r5.f
            x87 r3 = defpackage.z87.e(r3)
            if (r3 == 0) goto Le4
            yc1 r4 = r5.e
            long r7 = r3.b
            long r13 = r3.a
            java.lang.Object r9 = r4.A
            rl7 r9 = (defpackage.rl7) r9
            long r10 = r13 >> r17
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r9.a(r10, r7)
            java.lang.Object r4 = r4.B
            rl7 r4 = (defpackage.rl7) r4
            long r9 = r13 & r15
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r4.a(r9, r7)
            java.lang.Object r4 = r2.A
            x87 r4 = (defpackage.x87) r4
            x87 r3 = r4.a(r3)
            r2.A = r3
        Le4:
            java.lang.Object r3 = r2.A
            x87 r3 = (defpackage.x87) r3
            long r3 = r3.a
            long r3 = r0.e(r3)
            float r3 = r0.i(r3)
            m86 r4 = r5.a
            float r3 = r4.d(r3)
            long r7 = r4.h(r3)
            r3 = 1
            long r7 = r12.a(r3, r7)
            long r7 = r4.e(r7)
            r4.g(r7)
            r11 = r12
            r8 = 2
            r9 = 1
            r10 = 0
            goto L62
        L10e:
            jg7 r10 = defpackage.jg7.a
        L110:
            return r10
        L111:
            java.lang.Object r0 = r22.x(r23)
            return r0
        L116:
            java.lang.Object r0 = r22.v(r23)
            return r0
        L11b:
            wo r12 = defpackage.n96.t
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r3 = r1.g0
            ga7 r3 = (defpackage.ga7) r3
            wo r4 = defpackage.n96.s
            java.lang.Object r14 = r1.Z
            java.lang.Object r8 = r1.f0
            r15 = r8
            n96 r15 = (defpackage.n96) r15
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r1.Y
            r13 = 5
            r17 = 1065353216(0x3f800000, float:1.0)
            r2 = 4
            r19 = r8
            r7 = 0
            if (r9 == 0) goto L17c
            r10 = 1
            r20 = -9223372036854775808
            if (r9 == r10) goto L16e
            r3 = 2
            if (r9 == r3) goto L167
            if (r9 == r6) goto L160
            if (r9 == r2) goto L156
            if (r9 != r13) goto L14e
            defpackage.oi2.Y(r23)
            r1 = r5
            goto L2c1
        L14e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L2c5
        L156:
            defpackage.oi2.Y(r23)
            r9 = r13
            r7 = r19
            r19 = r5
            goto L2b2
        L160:
            defpackage.oi2.Y(r23)
            r10 = r19
            goto L1f4
        L167:
            defpackage.oi2.Y(r23)
            r10 = r19
            goto L1eb
        L16e:
            java.lang.Object r3 = r1.e0
            n96 r3 = (defpackage.n96) r3
            java.lang.Object r9 = r1.d0
            hb4 r9 = (defpackage.hb4) r9
            defpackage.oi2.Y(r23)
            r10 = r19
            goto L1b6
        L17c:
            r20 = -9223372036854775808
            defpackage.oi2.Y(r23)
            vs4 r9 = r15.b
            java.lang.Object r9 = r9.getValue()
            boolean r10 = r14.equals(r9)
            if (r10 != 0) goto L1a1
            defpackage.n96.o(r15)
            r15.x(r5)
            r3.p(r14)
            r3.n(r7)
            r15.l(r9)
            vs4 r3 = r15.b
            r3.setValue(r14)
        L1a1:
            hb4 r9 = r15.k
            r1.d0 = r9
            r1.e0 = r15
            r3 = 1
            r1.Y = r3
            java.lang.Object r3 = r9.e(r1)
            r10 = r19
            if (r3 != r10) goto L1b5
        L1b2:
            r7 = r10
            goto L2bd
        L1b5:
            r3 = r15
        L1b6:
            java.lang.Object r3 = r3.d     // Catch: java.lang.Throwable -> L2c6
            r11 = 0
            r9.h(r11)
            boolean r3 = r14.equals(r3)
            if (r3 != 0) goto L1f4
            r1.d0 = r11
            r1.e0 = r11
            r3 = 2
            r1.Y = r3
            long r7 = r15.m
            int r3 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r3 != 0) goto L1e0
            f96 r3 = r15.p
            l61 r7 = r1.b()
            um r7 = defpackage.ii2.x(r7)
            java.lang.Object r3 = r7.a(r3, r1)
            if (r3 != r10) goto L1e7
            goto L1e8
        L1e0:
            java.lang.Object r3 = r15.s(r1)
            if (r3 != r10) goto L1e7
            goto L1e8
        L1e7:
            r3 = r0
        L1e8:
            if (r3 != r10) goto L1eb
            goto L1b2
        L1eb:
            r1.Y = r6
            java.lang.Object r3 = defpackage.n96.r(r15, r1)
            if (r3 != r10) goto L1f4
            goto L1b2
        L1f4:
            vs4 r3 = r15.c
            rs4 r6 = r15.i
            java.lang.Object r3 = r3.getValue()
            boolean r3 = defpackage.nb3.k(r3, r14)
            if (r3 != 0) goto L2c4
            float r3 = r6.h()
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 >= 0) goto L218
            g96 r3 = r15.o
            if (r3 == 0) goto L21f
            ll7 r7 = r3.b
            r11 = 0
            boolean r7 = defpackage.nb3.k(r11, r7)
            if (r7 != 0) goto L218
            goto L21f
        L218:
            r19 = r5
            r7 = r10
            r9 = r13
        L21c:
            r11 = 0
            goto L2a5
        L21f:
            if (r3 == 0) goto L225
            ll7 r7 = r3.b
            r8 = r7
            goto L226
        L225:
            r8 = 0
        L226:
            if (r8 == 0) goto L244
            r19 = r10
            long r9 = r3.a
            wo r11 = r3.e
            wo r7 = r3.f
            if (r7 != 0) goto L23a
            r13 = r4
        L233:
            r7 = r19
            r19 = r5
            r4 = 0
            goto L23c
        L23a:
            r13 = r7
            goto L233
        L23c:
            ap r8 = r8.h(r9, r11, r12, r13)
            wo r8 = (defpackage.wo) r8
            r9 = 5
            goto L26d
        L244:
            r8 = r4
            r19 = r5
            r7 = r10
            r9 = r13
            r4 = 0
            if (r3 == 0) goto L26d
            long r10 = r3.a
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 != 0) goto L254
            goto L26d
        L254:
            long r10 = r3.g
            int r12 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r12 != 0) goto L25c
            long r10 = r15.f
        L25c:
            float r10 = (float) r10
            r11 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r10 = r10 / r11
            int r11 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r11 > 0) goto L266
            goto L26d
        L266:
            wo r8 = new wo
            float r10 = r17 / r10
            r8.<init>(r10)
        L26d:
            if (r3 != 0) goto L274
            g96 r3 = new g96
            r3.<init>()
        L274:
            wo r10 = r3.e
            r11 = 0
            r3.b = r11
            r11 = 0
            r3.c = r11
            float r12 = r6.h()
            r3.d = r12
            float r12 = r6.h()
            r10.e(r11, r12)
            long r10 = r15.f
            r3.g = r10
            r3.a = r4
            r3.f = r8
            double r4 = (double) r10
            float r6 = r6.h()
            double r10 = (double) r6
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 - r10
            double r12 = r12 * r4
            long r4 = defpackage.u24.F(r12)
            r3.h = r4
            r15.o = r3
            goto L21c
        L2a5:
            r1.d0 = r11
            r1.e0 = r11
            r1.Y = r2
            java.lang.Object r2 = defpackage.n96.p(r15, r1)
            if (r2 != r7) goto L2b2
            goto L2bd
        L2b2:
            r15.l(r14)
            r1.Y = r9
            java.lang.Object r1 = defpackage.n96.q(r15, r1)
            if (r1 != r7) goto L2bf
        L2bd:
            r10 = r7
            goto L2c5
        L2bf:
            r1 = r19
        L2c1:
            r15.x(r1)
        L2c4:
            r10 = r0
        L2c5:
            return r10
        L2c6:
            r0 = move-exception
            r11 = 0
            r9.h(r11)
            throw r0
        L2cc:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L2ef
            r3 = 1
            if (r2 != r3) goto L2e7
            java.lang.Object r0 = r1.d0
            r2 = r0
            h61 r2 = (defpackage.h61) r2
            java.lang.Object r0 = r1.Z
            r3 = r0
            rc3 r3 = (defpackage.rc3) r3
            defpackage.oi2.Y(r23)     // Catch: java.lang.Throwable -> L2e4
            goto L40b
        L2e4:
            r0 = move-exception
            goto L43e
        L2e7:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L438
        L2ef:
            defpackage.oi2.Y(r23)
            java.lang.Object r2 = r1.Z
            w61 r2 = (defpackage.w61) r2
            l61 r2 = r2.A()
            rc3 r3 = defpackage.yh2.u(r2)
            java.lang.Object r2 = r1.e0
            if5 r2 = (defpackage.if5) r2
            java.lang.Object r4 = r2.c
            monitor-enter(r4)
            java.lang.Throwable r5 = r2.e     // Catch: java.lang.Throwable -> L32b
            if (r5 != 0) goto L47f
            tp6 r5 = r2.u     // Catch: java.lang.Throwable -> L32b
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L32b
            ff5 r5 = (defpackage.ff5) r5     // Catch: java.lang.Throwable -> L32b
            ff5 r6 = defpackage.ff5.ShuttingDown     // Catch: java.lang.Throwable -> L32b
            int r5 = r5.compareTo(r6)     // Catch: java.lang.Throwable -> L32b
            if (r5 <= 0) goto L477
            rc3 r5 = r2.d     // Catch: java.lang.Throwable -> L32b
            if (r5 != 0) goto L46f
            r2.d = r3     // Catch: java.lang.Throwable -> L32b
            qj0 r2 = r2.y()     // Catch: java.lang.Throwable -> L32b
            if (r2 == 0) goto L32e
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            defpackage.tx0.a(r2)     // Catch: java.lang.Throwable -> L32b
            goto L32e
        L32b:
            r0 = move-exception
            goto L480
        L32e:
            monitor-exit(r4)
            java.lang.Object r2 = r1.e0
            if5 r2 = (defpackage.if5) r2
            z5 r4 = new z5
            r5 = 22
            r4.<init>(r2, r5)
            r76 r2 = defpackage.bm6.a
            defpackage.bm6.e(r2)
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            java.util.List r5 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L46c
            java.util.ArrayList r5 = defpackage.gt0.U0(r4, r5)     // Catch: java.lang.Throwable -> L46c
            defpackage.bm6.h = r5     // Catch: java.lang.Throwable -> L46c
            monitor-exit(r2)
            h61 r2 = new h61
            r5 = 20
            r2.<init>(r4, r5)
            tp6 r4 = defpackage.if5.z
            java.lang.Object r4 = r1.e0
            if5 r4 = (defpackage.if5) r4
            q61 r4 = r4.y
        L35a:
            tp6 r5 = defpackage.if5.z
            java.lang.Object r6 = r5.getValue()
            hw4 r6 = (defpackage.hw4) r6
            d90 r7 = defpackage.d90.t0
            yv4 r8 = r6.L
            boolean r9 = r8.containsKey(r4)
            if (r9 == 0) goto L36e
            r8 = r6
            goto L3a9
        L36e:
            boolean r9 = r6.isEmpty()
            if (r9 == 0) goto L383
            ew3 r9 = new ew3
            r9.<init>(r7, r7)
            yv4 r7 = r8.c(r4, r9)
            hw4 r8 = new hw4
            r8.<init>(r4, r4, r7)
            goto L3a9
        L383:
            java.lang.Object r9 = r6.B
            java.lang.Object r10 = r8.get(r9)
            r10.getClass()
            ew3 r10 = (defpackage.ew3) r10
            ew3 r11 = new ew3
            java.lang.Object r10 = r10.a
            r11.<init>(r10, r4)
            yv4 r8 = r8.c(r9, r11)
            ew3 r10 = new ew3
            r10.<init>(r9, r7)
            yv4 r7 = r8.c(r4, r10)
            hw4 r8 = new hw4
            java.lang.Object r9 = r6.A
            r8.<init>(r9, r4, r7)
        L3a9:
            if (r6 == r8) goto L3b1
            boolean r5 = r5.j(r6, r8)
            if (r5 == 0) goto L35a
        L3b1:
            java.lang.Object r4 = r1.e0     // Catch: java.lang.Throwable -> L2e4
            if5 r4 = (defpackage.if5) r4     // Catch: java.lang.Throwable -> L2e4
            java.lang.Object r5 = r4.c     // Catch: java.lang.Throwable -> L2e4
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L2e4
            java.util.List r4 = r4.D()     // Catch: java.lang.Throwable -> L43b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e4
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L2e4
            r11 = 0
        L3c2:
            if (r11 >= r5) goto L3ec
            java.lang.Object r6 = r4.get(r11)     // Catch: java.lang.Throwable -> L2e4
            ey0 r6 = (defpackage.ey0) r6     // Catch: java.lang.Throwable -> L2e4
            mk6 r6 = r6.Y     // Catch: java.lang.Throwable -> L2e4
            java.lang.Object[] r6 = r6.L     // Catch: java.lang.Throwable -> L2e4
            int r7 = r6.length     // Catch: java.lang.Throwable -> L2e4
            r8 = 0
        L3d0:
            if (r8 >= r7) goto L3e9
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L2e4
            boolean r10 = r9 instanceof defpackage.cf5     // Catch: java.lang.Throwable -> L2e4
            if (r10 == 0) goto L3db
            cf5 r9 = (defpackage.cf5) r9     // Catch: java.lang.Throwable -> L2e4
            goto L3dc
        L3db:
            r9 = 0
        L3dc:
            if (r9 == 0) goto L3e6
            ey0 r10 = r9.a     // Catch: java.lang.Throwable -> L2e4
            if (r10 == 0) goto L3e6
            r12 = 0
            r10.s(r9, r12)     // Catch: java.lang.Throwable -> L2e4
        L3e6:
            int r8 = r8 + 1
            goto L3d0
        L3e9:
            int r11 = r11 + 1
            goto L3c2
        L3ec:
            u12 r4 = new u12     // Catch: java.lang.Throwable -> L2e4
            java.lang.Object r5 = r1.f0     // Catch: java.lang.Throwable -> L2e4
            hf5 r5 = (defpackage.hf5) r5     // Catch: java.lang.Throwable -> L2e4
            java.lang.Object r6 = r1.g0     // Catch: java.lang.Throwable -> L2e4
            um r6 = (defpackage.um) r6     // Catch: java.lang.Throwable -> L2e4
            r7 = 24
            r11 = 0
            r4.<init>(r5, r6, r11, r7)     // Catch: java.lang.Throwable -> L2e4
            r1.Z = r3     // Catch: java.lang.Throwable -> L2e4
            r1.d0 = r2     // Catch: java.lang.Throwable -> L2e4
            r10 = 1
            r1.Y = r10     // Catch: java.lang.Throwable -> L2e4
            java.lang.Object r4 = defpackage.g04.C(r4, r1)     // Catch: java.lang.Throwable -> L2e4
            if (r4 != r0) goto L40b
            r10 = r0
            goto L438
        L40b:
            r2.d()
            java.lang.Object r0 = r1.e0
            if5 r0 = (defpackage.if5) r0
            java.lang.Object r2 = r0.c
            monitor-enter(r2)
            rc3 r4 = r0.d     // Catch: java.lang.Throwable -> L41d
            if (r4 != r3) goto L41f
            r11 = 0
            r0.d = r11     // Catch: java.lang.Throwable -> L41d
            goto L41f
        L41d:
            r0 = move-exception
            goto L439
        L41f:
            qj0 r0 = r0.y()     // Catch: java.lang.Throwable -> L41d
            if (r0 == 0) goto L42a
            java.lang.String r0 = "called outside of runRecomposeAndApplyChanges"
            defpackage.tx0.a(r0)     // Catch: java.lang.Throwable -> L41d
        L42a:
            monitor-exit(r2)
            tp6 r0 = defpackage.if5.z
            java.lang.Object r0 = r1.e0
            if5 r0 = (defpackage.if5) r0
            q61 r0 = r0.y
            defpackage.x31.n(r0)
            jg7 r10 = defpackage.jg7.a
        L438:
            return r10
        L439:
            monitor-exit(r2)
            throw r0
        L43b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e4
            throw r0     // Catch: java.lang.Throwable -> L2e4
        L43e:
            r2.d()
            java.lang.Object r2 = r1.e0
            if5 r2 = (defpackage.if5) r2
            java.lang.Object r4 = r2.c
            monitor-enter(r4)
            rc3 r5 = r2.d     // Catch: java.lang.Throwable -> L450
            if (r5 != r3) goto L452
            r11 = 0
            r2.d = r11     // Catch: java.lang.Throwable -> L450
            goto L452
        L450:
            r0 = move-exception
            goto L46a
        L452:
            qj0 r2 = r2.y()     // Catch: java.lang.Throwable -> L450
            if (r2 == 0) goto L45d
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            defpackage.tx0.a(r2)     // Catch: java.lang.Throwable -> L450
        L45d:
            monitor-exit(r4)
            tp6 r2 = defpackage.if5.z
            java.lang.Object r1 = r1.e0
            if5 r1 = (defpackage.if5) r1
            q61 r1 = r1.y
            defpackage.x31.n(r1)
            throw r0
        L46a:
            monitor-exit(r4)
            throw r0
        L46c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L46f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32b
            java.lang.String r1 = "Recomposer already running"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32b
            throw r0     // Catch: java.lang.Throwable -> L32b
        L477:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32b
            java.lang.String r1 = "Recomposer shut down"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L32b
            throw r0     // Catch: java.lang.Throwable -> L32b
        L47f:
            throw r5     // Catch: java.lang.Throwable -> L32b
        L480:
            monitor-exit(r4)
            throw r0
        L482:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L498
            r3 = 1
            if (r2 != r3) goto L491
            defpackage.oi2.Y(r23)
            r0 = r23
            goto L4ca
        L491:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            goto L4ca
        L498:
            defpackage.oi2.Y(r23)
            re5 r2 = new re5
            java.lang.Object r3 = r1.Z
            z23 r3 = (defpackage.z23) r3
            java.lang.Object r4 = r1.d0
            pe5 r4 = (defpackage.pe5) r4
            java.util.ArrayList r4 = r4.h
            java.lang.Object r5 = r1.e0
            r7 = r5
            wi6 r7 = (defpackage.wi6) r7
            java.lang.Object r5 = r1.f0
            r8 = r5
            k62 r8 = (defpackage.k62) r8
            java.lang.Object r5 = r1.g0
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L4b9
            r9 = 1
            goto L4ba
        L4b9:
            r9 = 0
        L4ba:
            r5 = 0
            r6 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10 = 1
            r1.Y = r10
            java.lang.Object r1 = r2.h(r3, r1)
            if (r1 != r0) goto L4c9
            goto L4ca
        L4c9:
            r0 = r1
        L4ca:
            return r0
        L4cb:
            java.lang.Object r0 = r1.g0
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r1.f0
            r3 = r0
            zp3 r3 = (defpackage.zp3) r3
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.Y
            if (r0 == 0) goto L525
            r10 = 1
            if (r0 == r10) goto L518
            r5 = 2
            if (r0 == r5) goto L504
            if (r0 != r6) goto L4fc
            java.lang.Object r0 = r1.e0
            r4 = r0
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r0 = r1.d0
            r5 = r0
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r0 = r1.Z
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            defpackage.oi2.Y(r23)     // Catch: java.lang.Throwable -> L4f9
            r0 = r23
            goto L5e4
        L4f9:
            r0 = move-exception
            goto L602
        L4fc:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L665
        L504:
            java.lang.Object r0 = r1.d0
            r5 = r0
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r0 = r1.Z
            r7 = r0
            java.util.List r7 = (java.util.List) r7
            defpackage.oi2.Y(r23)     // Catch: java.lang.Throwable -> L515
            r0 = r23
            goto L59b
        L515:
            r0 = move-exception
            goto L59f
        L518:
            java.lang.Object r0 = r1.Z
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            defpackage.oi2.Y(r23)     // Catch: java.lang.Throwable -> L523
            r0 = r23
            goto L559
        L523:
            r0 = move-exception
            goto L55e
        L525:
            defpackage.oi2.Y(r23)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r0 = r3.d     // Catch: java.lang.Throwable -> L535
            u6 r0 = (defpackage.u6) r0     // Catch: java.lang.Throwable -> L535
            r0.c()     // Catch: java.lang.Throwable -> L535
            goto L548
        L535:
            r0 = move-exception
            vb5 r7 = new vb5
            yb5 r8 = defpackage.yb5.TERMINAL_COMMIT
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r7.<init>(r8, r0)
            r5.add(r7)
        L548:
            java.io.Serializable r0 = r3.e     // Catch: java.lang.Throwable -> L523
            u12 r0 = (defpackage.u12) r0     // Catch: java.lang.Throwable -> L523
            r1.Z = r5     // Catch: java.lang.Throwable -> L523
            r10 = 1
            r1.Y = r10     // Catch: java.lang.Throwable -> L523
            java.lang.Object r0 = r0.o(r2, r1)     // Catch: java.lang.Throwable -> L523
            if (r0 != r4) goto L559
            goto L5df
        L559:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L523
            r7 = r5
            r5 = r0
            goto L572
        L55e:
            vb5 r7 = new vb5
            yb5 r8 = defpackage.yb5.NATIVE_DISCARD
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r7.<init>(r8, r0)
            r5.add(r7)
            r7 = r5
            r5 = 0
        L572:
            if (r5 == 0) goto L589
            int r0 = r2.size()
            int r8 = r5.intValue()
            if (r8 == r0) goto L589
            vb5 r0 = new vb5
            yb5 r8 = defpackage.yb5.NATIVE_DISCARD
            r11 = 0
            r0.<init>(r8, r11)
            r7.add(r0)
        L589:
            java.io.Serializable r0 = r3.f     // Catch: java.lang.Throwable -> L515
            wc0 r0 = (defpackage.wc0) r0     // Catch: java.lang.Throwable -> L515
            r1.Z = r7     // Catch: java.lang.Throwable -> L515
            r1.d0 = r5     // Catch: java.lang.Throwable -> L515
            r8 = 2
            r1.Y = r8     // Catch: java.lang.Throwable -> L515
            java.lang.Object r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L515
            if (r0 != r4) goto L59b
            goto L5df
        L59b:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L515
            r8 = r0
            goto L5b2
        L59f:
            vb5 r8 = new vb5
            yb5 r9 = defpackage.yb5.KOTLIN_DISCARD
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r8.<init>(r9, r0)
            r7.add(r8)
            r8 = 0
        L5b2:
            java.lang.Object r0 = r3.g     // Catch: java.lang.Throwable -> L5ba
            u6 r0 = (defpackage.u6) r0     // Catch: java.lang.Throwable -> L5ba
            r0.c()     // Catch: java.lang.Throwable -> L5ba
            goto L5cd
        L5ba:
            r0 = move-exception
            vb5 r9 = new vb5
            yb5 r10 = defpackage.yb5.RUNTIME_TERMINATION
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r9.<init>(r10, r0)
            r7.add(r9)
        L5cd:
            java.lang.Object r0 = r3.h     // Catch: java.lang.Throwable -> L5ff
            n22 r0 = (defpackage.n22) r0     // Catch: java.lang.Throwable -> L5ff
            r1.Z = r7     // Catch: java.lang.Throwable -> L5ff
            r1.d0 = r5     // Catch: java.lang.Throwable -> L5ff
            r1.e0 = r8     // Catch: java.lang.Throwable -> L5ff
            r1.Y = r6     // Catch: java.lang.Throwable -> L5ff
            java.lang.Object r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L5ff
            if (r0 != r4) goto L5e2
        L5df:
            r10 = r4
            goto L665
        L5e2:
            r1 = r7
            r4 = r8
        L5e4:
            r6 = r0
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L4f9
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L4f9
            if (r6 != 0) goto L5f8
            vb5 r6 = new vb5     // Catch: java.lang.Throwable -> L4f9
            yb5 r7 = defpackage.yb5.AUTHENTICATION_CLEAR     // Catch: java.lang.Throwable -> L4f9
            r11 = 0
            r6.<init>(r7, r11)     // Catch: java.lang.Throwable -> L4f9
            r1.add(r6)     // Catch: java.lang.Throwable -> L4f9
        L5f8:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4f9
            boolean r7 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4f9
            goto L615
        L5ff:
            r0 = move-exception
            r1 = r7
            r4 = r8
        L602:
            vb5 r6 = new vb5
            yb5 r7 = defpackage.yb5.AUTHENTICATION_CLEAR
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r6.<init>(r7, r0)
            r1.add(r6)
            r7 = 0
        L615:
            java.lang.Object r0 = r3.i     // Catch: java.lang.Throwable -> L61d
            dz1 r0 = (defpackage.dz1) r0     // Catch: java.lang.Throwable -> L61d
            r0.c()     // Catch: java.lang.Throwable -> L61d
            goto L630
        L61d:
            r0 = move-exception
            vb5 r3 = new vb5
            yb5 r6 = defpackage.yb5.SESSION_CLOSE
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r3.<init>(r6, r0)
            r1.add(r3)
        L630:
            xb5 r0 = new xb5
            int r2 = r2.size()
            r0.<init>(r2, r5, r4)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L647:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L660
            java.lang.Object r4 = r1.next()
            r5 = r4
            vb5 r5 = (defpackage.vb5) r5
            yb5 r5 = r5.a
            boolean r5 = r2.add(r5)
            if (r5 == 0) goto L647
            r3.add(r4)
            goto L647
        L660:
            zb5 r10 = new zb5
            r10.<init>(r0, r7, r3)
        L665:
            return r10
        L666:
            java.lang.Object r0 = r1.f0
            rs4 r0 = (defpackage.rs4) r0
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r1.g0
            qa4 r3 = (defpackage.qa4) r3
            java.lang.Object r4 = r1.d0
            uw0 r4 = (defpackage.uw0) r4
            java.lang.Object r5 = r1.e0
            qa4 r5 = (defpackage.qa4) r5
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r1.Y
            if (r7 == 0) goto L69e
            r10 = 1
            if (r7 == r10) goto L699
            r5 = 2
            if (r7 != r5) goto L691
            java.lang.Object r0 = r1.Z
            sb4 r0 = (defpackage.sb4) r0
            defpackage.oi2.Y(r23)     // Catch: java.lang.Throwable -> L68e
        L68b:
            r11 = 0
            goto L700
        L68e:
            r0 = move-exception
            goto L70a
        L691:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L709
        L699:
            defpackage.oi2.Y(r23)
        L69c:
            r10 = r2
            goto L709
        L69e:
            defpackage.oi2.Y(r23)
            java.lang.Object r7 = r1.Z
            le2 r7 = (defpackage.le2) r7
            java.lang.Object r8 = r5.getValue()
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            r9 = 2
            if (r8 >= r9) goto L6be
            p34 r0 = defpackage.p34.L
            r10 = 1
            r1.Y = r10
            java.lang.Object r0 = r7.b(r0, r1)
            if (r0 != r6) goto L69c
            goto L6fc
        L6be:
            r8 = 0
            r0.i(r8)
            java.lang.Object r8 = r5.getValue()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = defpackage.gt0.Q0(r8)
            sb4 r8 = (defpackage.sb4) r8
            r4.g(r8)
            java.lang.Object r9 = r5.getValue()
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            r10 = 2
            int r5 = r5 - r10
            java.lang.Object r5 = r9.get(r5)
            sb4 r5 = (defpackage.sb4) r5
            r4.g(r5)
            f7 r5 = new f7     // Catch: java.lang.Throwable -> L68e
            r9 = 1
            r5.<init>(r3, r0, r9)     // Catch: java.lang.Throwable -> L68e
            r1.Z = r8     // Catch: java.lang.Throwable -> L68e
            r1.Y = r10     // Catch: java.lang.Throwable -> L68e
            java.lang.Object r0 = r7.b(r5, r1)     // Catch: java.lang.Throwable -> L68e
            if (r0 != r6) goto L6fe
        L6fc:
            r10 = r6
            goto L709
        L6fe:
            r0 = r8
            goto L68b
        L700:
            r4.e(r0, r11)     // Catch: java.lang.Throwable -> L68e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            goto L69c
        L709:
            return r10
        L70a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r3.setValue(r1)
            throw r0
        L710:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L726
            r10 = 1
            if (r2 != r10) goto L71f
            defpackage.oi2.Y(r23)
            r0 = r23
            goto L74f
        L71f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            goto L74f
        L726:
            defpackage.oi2.Y(r23)
            hn r2 = new hn
            java.lang.Object r3 = r1.Z
            dh5 r3 = (defpackage.dh5) r3
            java.lang.Object r4 = r1.d0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.e0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.f0
            hq2 r6 = (defpackage.hq2) r6
            java.lang.Object r7 = r1.g0
            f13 r7 = (defpackage.f13) r7
            r8 = 0
            r9 = 7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10 = 1
            r1.Y = r10
            java.lang.Object r1 = defpackage.g04.C(r2, r1)
            if (r1 != r0) goto L74e
            goto L74f
        L74e:
            r0 = r1
        L74f:
            return r0
        L750:
            r10 = r9
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L766
            if (r2 != r10) goto L75f
            defpackage.oi2.Y(r23)
            r2 = r23
            goto L78f
        L75f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L79a
        L766:
            defpackage.oi2.Y(r23)
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            la r3 = new la
            java.lang.Object r4 = r1.d0
            sz1 r4 = (defpackage.sz1) r4
            java.lang.Object r5 = r1.e0
            dy1 r5 = (defpackage.dy1) r5
            java.lang.Object r6 = r1.f0
            c46 r6 = (defpackage.c46) r6
            java.lang.Object r7 = r1.g0
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r9 = 3
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10 = 1
            r1.Y = r10
            java.lang.Object r2 = defpackage.hv.d0(r2, r3, r1)
            if (r2 != r0) goto L78f
            r10 = r0
            goto L79a
        L78f:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r1.Z
            hu1 r0 = (defpackage.hu1) r0
            r0.g(r2)
            jg7 r10 = defpackage.jg7.a
        L79a:
            return r10
        L79b:
            java.lang.Object r0 = r1.g0
            pq5 r0 = (defpackage.pq5) r0
            java.lang.Object r2 = r1.f0
            sz1 r2 = (defpackage.sz1) r2
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.Y
            if (r4 == 0) goto L7d8
            r10 = 1
            if (r4 == r10) goto L7d2
            r5 = 2
            if (r4 == r5) goto L7bd
            if (r4 != r6) goto L7b6
            defpackage.oi2.Y(r23)
            goto L81f
        L7b6:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L821
        L7bd:
            java.lang.Object r0 = r1.e0
            me.magnum.melonds.domain.model.VideoRenderer r0 = (me.magnum.melonds.domain.model.VideoRenderer) r0
            java.lang.Object r2 = r1.d0
            pq5 r2 = (defpackage.pq5) r2
            java.lang.Object r4 = r1.Z
            of6 r4 = (defpackage.of6) r4
            defpackage.oi2.Y(r23)
            r5 = r4
            r4 = r0
            r0 = r2
            r2 = r23
            goto L807
        L7d2:
            defpackage.oi2.Y(r23)
            r4 = r23
            goto L7eb
        L7d8:
            defpackage.oi2.Y(r23)
            kd6 r4 = r2.c
            jt5 r5 = r0.f
            r10 = 1
            r1.Y = r10
            ng6 r4 = (defpackage.ng6) r4
            java.lang.Object r4 = r4.l(r5, r1)
            if (r4 != r3) goto L7eb
            goto L81d
        L7eb:
            me.magnum.melonds.domain.model.EmulatorConfiguration r4 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r4
            me.magnum.melonds.domain.model.RendererConfiguration r4 = r4.getRendererConfiguration()
            of6 r5 = r2.T0
            me.magnum.melonds.domain.model.VideoRenderer r4 = r4.getRenderer()
            r1.Z = r5
            r1.d0 = r0
            r1.e0 = r4
            r8 = 2
            r1.Y = r8
            java.lang.Object r2 = defpackage.sz1.g(r2, r0, r1)
            if (r2 != r3) goto L807
            goto L81d
        L807:
            z33 r2 = (defpackage.z33) r2
            zy1 r7 = new zy1
            r7.<init>(r0, r4, r2)
            r11 = 0
            r1.Z = r11
            r1.d0 = r11
            r1.e0 = r11
            r1.Y = r6
            java.lang.Object r0 = r5.a(r7, r1)
            if (r0 != r3) goto L81f
        L81d:
            r10 = r3
            goto L821
        L81f:
            jg7 r10 = defpackage.jg7.a
        L821:
            return r10
        L822:
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r17 = 1065353216(0x3f800000, float:1.0)
            jg7 r0 = defpackage.jg7.a
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            if (r3 == 0) goto L841
            r10 = 1
            if (r3 != r10) goto L83a
            defpackage.oi2.Y(r23)
        L837:
            r10 = r0
            goto L8a6
        L83a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L8a6
        L841:
            defpackage.oi2.Y(r23)
            java.lang.Object r3 = r1.Z
            s70 r3 = (defpackage.s70) r3
            java.lang.Object r4 = r1.d0
            c37 r4 = (defpackage.c37) r4
            java.lang.Object r5 = r1.e0
            jt3 r5 = (defpackage.jt3) r5
            d17 r5 = r5.a
            java.lang.Object r6 = r1.f0
            b47 r6 = (defpackage.b47) r6
            a47 r6 = r6.a
            java.lang.Object r7 = r1.g0
            mk4 r7 = (defpackage.mk4) r7
            r10 = 1
            r1.Y = r10
            long r8 = r4.b
            int r4 = defpackage.k47.e(r8)
            int r4 = r7.s(r4)
            z37 r7 = r6.a
            fp r7 = r7.a
            java.lang.String r7 = r7.B
            int r7 = r7.length()
            if (r4 >= r7) goto L87a
            of5 r4 = r6.b(r4)
            goto L89b
        L87a:
            if (r4 == 0) goto L885
            r18 = 1
            int r4 = r4 + (-1)
            of5 r4 = r6.b(r4)
            goto L89b
        L885:
            s47 r4 = r5.b
            qh1 r6 = r5.g
            ki2 r5 = r5.h
            long r4 = defpackage.l17.b(r4, r6, r5)
            of5 r6 = new of5
            long r4 = r4 & r15
            int r4 = (int) r4
            float r4 = (float) r4
            r5 = r17
            r8 = 0
            r6.<init>(r8, r8, r5, r4)
            r4 = r6
        L89b:
            java.lang.Object r1 = r3.a(r4, r1)
            if (r1 != r2) goto L8a2
            goto L8a3
        L8a2:
            r1 = r0
        L8a3:
            if (r1 != r2) goto L837
            r10 = r2
        L8a6:
            return r10
        L8a7:
            java.lang.Object r0 = r1.Z
            r3 = r0
            jt3 r3 = (defpackage.jt3) r3
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L8c2
            r10 = 1
            if (r2 != r10) goto L8bb
            defpackage.oi2.Y(r23)     // Catch: java.lang.Throwable -> L8b9
            goto L8f1
        L8b9:
            r0 = move-exception
            goto L8f7
        L8bb:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L8f6
        L8c2:
            defpackage.oi2.Y(r23)
            java.lang.Object r2 = r1.d0     // Catch: java.lang.Throwable -> L8b9
            qa4 r2 = (defpackage.qa4) r2     // Catch: java.lang.Throwable -> L8b9
            f4 r4 = new f4     // Catch: java.lang.Throwable -> L8b9
            r5 = 16
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L8b9
            g21 r8 = defpackage.np2.f0(r4)     // Catch: java.lang.Throwable -> L8b9
            bm0 r2 = new bm0     // Catch: java.lang.Throwable -> L8b9
            java.lang.Object r4 = r1.e0     // Catch: java.lang.Throwable -> L8b9
            o37 r4 = (defpackage.o37) r4     // Catch: java.lang.Throwable -> L8b9
            java.lang.Object r5 = r1.f0     // Catch: java.lang.Throwable -> L8b9
            p27 r5 = (defpackage.p27) r5     // Catch: java.lang.Throwable -> L8b9
            java.lang.Object r6 = r1.g0     // Catch: java.lang.Throwable -> L8b9
            l33 r6 = (defpackage.l33) r6     // Catch: java.lang.Throwable -> L8b9
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8b9
            r10 = 1
            r1.Y = r10     // Catch: java.lang.Throwable -> L8b9
            java.lang.Object r1 = r8.b(r2, r1)     // Catch: java.lang.Throwable -> L8b9
            if (r1 != r0) goto L8f1
            r10 = r0
            goto L8f6
        L8f1:
            defpackage.hf.N(r3)
            jg7 r10 = defpackage.jg7.a
        L8f6:
            return r10
        L8f7:
            defpackage.hf.N(r3)
            throw r0
        L8fb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L911
            r10 = 1
            if (r2 != r10) goto L90a
            defpackage.oi2.Y(r23)
            r2 = r23
            goto L92f
        L90a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L942
        L911:
            defpackage.oi2.Y(r23)
            java.lang.Object r2 = r1.Z
            x56 r2 = (defpackage.x56) r2
            gl6 r2 = r2.a
            java.lang.Object r3 = r1.d0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.e0
            java.lang.String r4 = (java.lang.String) r4
            al6 r5 = defpackage.al6.Long
            r10 = 1
            r1.Y = r10
            java.lang.Object r2 = r2.a(r3, r4, r5, r1)
            if (r2 != r0) goto L92f
            r10 = r0
            goto L942
        L92f:
            ll6 r2 = (defpackage.ll6) r2
            ll6 r0 = defpackage.ll6.ActionPerformed
            if (r2 != r0) goto L940
            java.lang.Object r0 = r1.f0
            v10 r0 = (defpackage.v10) r0
            java.lang.Object r1 = r1.g0
            n00 r1 = (defpackage.n00) r1
            r0.e(r1)
        L940:
            jg7 r10 = defpackage.jg7.a
        L942:
            return r10
        L943:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L963
            r10 = 1
            if (r2 != r10) goto L95c
            java.lang.Object r0 = r1.e0
            lb5 r0 = (defpackage.lb5) r0
            java.lang.Object r2 = r1.d0
            jk r2 = (defpackage.jk) r2
            java.lang.Object r1 = r1.Z
            hb4 r1 = (defpackage.hb4) r1
            defpackage.oi2.Y(r23)
            goto L983
        L95c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L98c
        L963:
            defpackage.oi2.Y(r23)
            java.lang.Object r2 = r1.f0
            jk r2 = (defpackage.jk) r2
            hb4 r3 = r2.b
            java.lang.Object r4 = r1.g0
            lb5 r4 = (defpackage.lb5) r4
            r1.Z = r3
            r1.d0 = r2
            r1.e0 = r4
            r10 = 1
            r1.Y = r10
            java.lang.Object r1 = r3.e(r1)
            if (r1 != r0) goto L981
            r10 = r0
            goto L98c
        L981:
            r1 = r3
            r0 = r4
        L983:
            defpackage.jk.a(r2, r0)     // Catch: java.lang.Throwable -> L98d
            r11 = 0
            r1.h(r11)
            jg7 r10 = defpackage.jg7.a
        L98c:
            return r10
        L98d:
            r0 = move-exception
            r11 = 0
            r1.h(r11)
            throw r0
        L993:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            if (r2 == 0) goto L9b3
            r10 = 1
            if (r2 != r10) goto L9ac
            java.lang.Object r0 = r1.e0
            hb5 r0 = (defpackage.hb5) r0
            java.lang.Object r2 = r1.d0
            hk r2 = (defpackage.hk) r2
            java.lang.Object r1 = r1.Z
            hb4 r1 = (defpackage.hb4) r1
            defpackage.oi2.Y(r23)
            goto L9d3
        L9ac:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto L9f0
        L9b3:
            defpackage.oi2.Y(r23)
            java.lang.Object r2 = r1.f0
            hk r2 = (defpackage.hk) r2
            hb4 r3 = r2.b
            java.lang.Object r4 = r1.g0
            hb5 r4 = (defpackage.hb5) r4
            r1.Z = r3
            r1.d0 = r2
            r1.e0 = r4
            r10 = 1
            r1.Y = r10
            java.lang.Object r1 = r3.e(r1)
            if (r1 != r0) goto L9d1
            r10 = r0
            goto L9f0
        L9d1:
            r1 = r3
            r0 = r4
        L9d3:
            android.content.SharedPreferences r2 = r2.a     // Catch: java.lang.Throwable -> L9f1
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L9f1
            java.lang.String r3 = "ra_username"
            java.lang.String r4 = r0.a     // Catch: java.lang.Throwable -> L9f1
            r2.putString(r3, r4)     // Catch: java.lang.Throwable -> L9f1
            java.lang.String r3 = "ra_token"
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L9f1
            r2.putString(r3, r0)     // Catch: java.lang.Throwable -> L9f1
            r2.apply()     // Catch: java.lang.Throwable -> L9f1
            r11 = 0
            r1.h(r11)
            jg7 r10 = defpackage.jg7.a
        L9f0:
            return r10
        L9f1:
            r0 = move-exception
            r11 = 0
            r1.h(r11)
            throw r0
        L9f7:
            java.lang.Object r0 = r1.f0
            r2 = r0
            ki r2 = (defpackage.ki) r2
            java.lang.Object r0 = r1.d0
            rj r0 = (defpackage.rj) r0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.Y
            if (r4 == 0) goto La17
            r10 = 1
            if (r4 == r10) goto La10
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r10 = 0
            goto La5c
        La10:
            defpackage.oi2.Y(r23)     // Catch: java.lang.Throwable -> La14
            goto La5d
        La14:
            r0 = move-exception
            r11 = 0
            goto La63
        La17:
            defpackage.oi2.Y(r23)
            java.lang.Object r4 = r1.Z
            w61 r4 = (defpackage.w61) r4
            gt3 r5 = defpackage.ht3.a
            android.view.View r7 = r0.A
            r5.getClass()
            u63 r5 = new u63
            r5.<init>(r7)
            kt3 r7 = new kt3
            android.view.View r8 = r0.A
            ii r9 = new ii
            java.lang.Object r10 = r1.g0
            et3 r10 = (defpackage.et3) r10
            r9.<init>(r10)
            r7.<init>(r8, r9, r5)
            boolean r8 = defpackage.et6.a
            if (r8 == 0) goto La47
            z r8 = new z
            r11 = 0
            r8.<init>(r2, r5, r11, r6)
            defpackage.hv.L(r4, r11, r11, r8, r6)
        La47:
            java.lang.Object r4 = r1.e0
            qn2 r4 = (defpackage.qn2) r4
            if (r4 == 0) goto La50
            r4.g(r7)
        La50:
            r2.c = r7
            r10 = 1
            r1.Y = r10     // Catch: java.lang.Throwable -> La14
            x61 r0 = r0.a(r7, r1)     // Catch: java.lang.Throwable -> La14
            if (r0 != r3) goto La5d
            r10 = r3
        La5c:
            return r10
        La5d:
            ug r0 = new ug     // Catch: java.lang.Throwable -> La14
            r0.<init>()     // Catch: java.lang.Throwable -> La14
            throw r0     // Catch: java.lang.Throwable -> La14
        La63:
            r2.c = r11
            throw r0
    }
}
