package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs2  reason: default package */
/* loaded from: classes.dex */
public final class rs2 extends defpackage.zg1 implements defpackage.mo1 {
    public final /* synthetic */ int m0;
    public final defpackage.sg n0;
    public final defpackage.mr1 o0;
    public java.lang.Object p0;

    public rs2(defpackage.ow6 r2, defpackage.sg r3, defpackage.mr1 r4) {
            r1 = this;
            r0 = 1
            r1.m0 = r0
            r1.<init>()
            r1.n0 = r3
            r1.o0 = r4
            r1.R0(r2)
            return
    }

    public rs2(defpackage.ow6 r2, defpackage.sg r3, defpackage.mr1 r4, defpackage.lq4 r5) {
            r1 = this;
            r0 = 0
            r1.m0 = r0
            r1.<init>()
            r1.n0 = r3
            r1.o0 = r4
            r1.p0 = r5
            r1.R0(r2)
            return
    }

    public static boolean U0(float r1, android.widget.EdgeEffect r2, android.graphics.Canvas r3) {
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            boolean r1 = r2.draw(r3)
            return r1
        La:
            int r0 = r3.save()
            r3.rotate(r1)
            boolean r1 = r2.draw(r3)
            r3.restoreToCount(r0)
            return r1
    }

    public static boolean V0(float r3, long r4, android.widget.EdgeEffect r6, android.graphics.Canvas r7) {
            int r0 = r7.save()
            r7.rotate(r3)
            r3 = 32
            long r1 = r4 >> r3
            int r3 = (int) r1
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r7.translate(r3, r4)
            boolean r3 = r6.draw(r7)
            r7.restoreToCount(r0)
            return r3
    }

    public android.graphics.RenderNode W0() {
            r1 = this;
            java.lang.Object r0 = r1.p0
            android.graphics.RenderNode r0 = (android.graphics.RenderNode) r0
            if (r0 != 0) goto Lc
            android.graphics.RenderNode r0 = defpackage.r74.e()
            r1.p0 = r0
        Lc:
            return r0
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r0.m0
            sg r3 = r0.n0
            mr1 r7 = r0.o0
            r11 = 1119092736(0x42b40000, float:90.0)
            r12 = 1132920832(0x43870000, float:270.0)
            r13 = 1127481344(0x43340000, float:180.0)
            switch(r2) {
                case 0: goto L38e;
                default: goto L13;
            }
        L13:
            zj0 r2 = r1.A
            long r14 = r2.e()
            r3.i(r14)
            bt r14 = r2.B
            xj0 r14 = r14.G()
            android.graphics.Canvas r14 = defpackage.xd.a(r14)
            vs4 r15 = r3.d
            r15.getValue()
            long r15 = r2.e()
            boolean r15 = defpackage.xi6.f(r15)
            if (r15 == 0) goto L3a
            r1.b()
            goto L38d
        L3a:
            boolean r15 = r14.isHardwareAccelerated()
            if (r15 != 0) goto L7d
            android.widget.EdgeEffect r0 = r7.d
            if (r0 == 0) goto L47
            r0.finish()
        L47:
            android.widget.EdgeEffect r0 = r7.e
            if (r0 == 0) goto L4e
            r0.finish()
        L4e:
            android.widget.EdgeEffect r0 = r7.f
            if (r0 == 0) goto L55
            r0.finish()
        L55:
            android.widget.EdgeEffect r0 = r7.g
            if (r0 == 0) goto L5c
            r0.finish()
        L5c:
            android.widget.EdgeEffect r0 = r7.h
            if (r0 == 0) goto L63
            r0.finish()
        L63:
            android.widget.EdgeEffect r0 = r7.i
            if (r0 == 0) goto L6a
            r0.finish()
        L6a:
            android.widget.EdgeEffect r0 = r7.j
            if (r0 == 0) goto L71
            r0.finish()
        L71:
            android.widget.EdgeEffect r0 = r7.k
            if (r0 == 0) goto L78
            r0.finish()
        L78:
            r1.b()
            goto L38d
        L7d:
            r15 = 1106247680(0x41f00000, float:30.0)
            float r15 = r1.e0(r15)
            android.widget.EdgeEffect r4 = r7.d
            boolean r4 = defpackage.mr1.f(r4)
            if (r4 != 0) goto La6
            android.widget.EdgeEffect r4 = r7.h
            boolean r4 = defpackage.mr1.g(r4)
            if (r4 != 0) goto La6
            android.widget.EdgeEffect r4 = r7.e
            boolean r4 = defpackage.mr1.f(r4)
            if (r4 != 0) goto La6
            android.widget.EdgeEffect r4 = r7.i
            boolean r4 = defpackage.mr1.g(r4)
            if (r4 == 0) goto La4
            goto La6
        La4:
            r4 = 0
            goto La7
        La6:
            r4 = 1
        La7:
            android.widget.EdgeEffect r6 = r7.f
            boolean r6 = defpackage.mr1.f(r6)
            if (r6 != 0) goto Lca
            android.widget.EdgeEffect r6 = r7.j
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 != 0) goto Lca
            android.widget.EdgeEffect r6 = r7.g
            boolean r6 = defpackage.mr1.f(r6)
            if (r6 != 0) goto Lca
            android.widget.EdgeEffect r6 = r7.k
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto Lc8
            goto Lca
        Lc8:
            r6 = 0
            goto Lcb
        Lca:
            r6 = 1
        Lcb:
            if (r4 == 0) goto Le6
            if (r6 == 0) goto Le6
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            android.graphics.RenderNode r8 = r0.W0()
            int r9 = r14.getWidth()
            r19 = 32
            int r10 = r14.getHeight()
            defpackage.r74.v(r8, r9, r10)
            goto L11f
        Le6:
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r19 = 32
            if (r4 == 0) goto L106
            android.graphics.RenderNode r8 = r0.W0()
            int r9 = r14.getWidth()
            int r10 = defpackage.u24.E(r15)
            int r10 = r10 * 2
            int r10 = r10 + r9
            int r9 = r14.getHeight()
            defpackage.r74.v(r8, r10, r9)
            goto L11f
        L106:
            if (r6 == 0) goto L38a
            android.graphics.RenderNode r8 = r0.W0()
            int r9 = r14.getWidth()
            int r10 = r14.getHeight()
            int r20 = defpackage.u24.E(r15)
            int r20 = r20 * 2
            int r10 = r20 + r10
            defpackage.r74.v(r8, r9, r10)
        L11f:
            android.graphics.RenderNode r8 = r0.W0()
            android.graphics.RecordingCanvas r8 = defpackage.r74.d(r8)
            android.widget.EdgeEffect r9 = r7.j
            boolean r9 = defpackage.mr1.g(r9)
            if (r9 == 0) goto L141
            android.widget.EdgeEffect r9 = r7.j
            if (r9 != 0) goto L13b
            lo4 r9 = defpackage.lo4.Horizontal
            android.widget.EdgeEffect r9 = r7.a(r9)
            r7.j = r9
        L13b:
            U0(r11, r9, r8)
            r9.finish()
        L141:
            android.widget.EdgeEffect r9 = r7.f
            boolean r9 = defpackage.mr1.f(r9)
            r20 = 1065353216(0x3f800000, float:1.0)
            r10 = 31
            if (r9 == 0) goto L18f
            android.widget.EdgeEffect r9 = r7.c()
            boolean r21 = U0(r12, r9, r8)
            android.widget.EdgeEffect r11 = r7.f
            boolean r11 = defpackage.mr1.g(r11)
            if (r11 == 0) goto L18c
            long r22 = r3.c()
            r24 = r6
            long r5 = r22 & r17
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            android.widget.EdgeEffect r6 = r7.j
            if (r6 != 0) goto L176
            lo4 r6 = defpackage.lo4.Horizontal
            android.widget.EdgeEffect r6 = r7.a(r6)
            r7.j = r6
        L176:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r10) goto L17f
            float r9 = defpackage.up.e(r9)
            goto L180
        L17f:
            r9 = 0
        L180:
            float r5 = r20 - r5
            if (r11 < r10) goto L188
            defpackage.up.g(r6, r9, r5)
            goto L193
        L188:
            r6.onPull(r9, r5)
            goto L193
        L18c:
            r24 = r6
            goto L193
        L18f:
            r24 = r6
            r21 = 0
        L193:
            android.widget.EdgeEffect r5 = r7.h
            boolean r5 = defpackage.mr1.g(r5)
            if (r5 == 0) goto L1ad
            android.widget.EdgeEffect r5 = r7.h
            if (r5 != 0) goto L1a7
            lo4 r5 = defpackage.lo4.Vertical
            android.widget.EdgeEffect r5 = r7.a(r5)
            r7.h = r5
        L1a7:
            U0(r13, r5, r8)
            r5.finish()
        L1ad:
            android.widget.EdgeEffect r5 = r7.d
            boolean r5 = defpackage.mr1.f(r5)
            if (r5 == 0) goto L1fc
            android.widget.EdgeEffect r5 = r7.e()
            r11 = 0
            boolean r6 = U0(r11, r5, r8)
            if (r6 != 0) goto L1c6
            if (r21 == 0) goto L1c3
            goto L1c6
        L1c3:
            r21 = 0
            goto L1c8
        L1c6:
            r21 = 1
        L1c8:
            android.widget.EdgeEffect r6 = r7.d
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto L1fc
            long r22 = r3.c()
            r9 = r14
            long r13 = r22 >> r19
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            android.widget.EdgeEffect r14 = r7.h
            if (r14 != 0) goto L1e8
            lo4 r14 = defpackage.lo4.Vertical
            android.widget.EdgeEffect r14 = r7.a(r14)
            r7.h = r14
        L1e8:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r10) goto L1f1
            float r5 = defpackage.up.e(r5)
            goto L1f2
        L1f1:
            r5 = 0
        L1f2:
            if (r6 < r10) goto L1f8
            defpackage.up.g(r14, r5, r13)
            goto L1fd
        L1f8:
            r14.onPull(r5, r13)
            goto L1fd
        L1fc:
            r9 = r14
        L1fd:
            android.widget.EdgeEffect r5 = r7.k
            boolean r5 = defpackage.mr1.g(r5)
            if (r5 == 0) goto L217
            android.widget.EdgeEffect r5 = r7.k
            if (r5 != 0) goto L211
            lo4 r5 = defpackage.lo4.Horizontal
            android.widget.EdgeEffect r5 = r7.a(r5)
            r7.k = r5
        L211:
            U0(r12, r5, r8)
            r5.finish()
        L217:
            android.widget.EdgeEffect r5 = r7.g
            boolean r5 = defpackage.mr1.f(r5)
            if (r5 == 0) goto L265
            android.widget.EdgeEffect r5 = r7.d()
            r6 = 1119092736(0x42b40000, float:90.0)
            boolean r6 = U0(r6, r5, r8)
            if (r6 != 0) goto L231
            if (r21 == 0) goto L22e
            goto L231
        L22e:
            r21 = 0
            goto L233
        L231:
            r21 = 1
        L233:
            android.widget.EdgeEffect r6 = r7.g
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto L265
            long r12 = r3.c()
            long r12 = r12 & r17
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            android.widget.EdgeEffect r12 = r7.k
            if (r12 != 0) goto L252
            lo4 r12 = defpackage.lo4.Horizontal
            android.widget.EdgeEffect r12 = r7.a(r12)
            r7.k = r12
        L252:
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L25b
            float r5 = defpackage.up.e(r5)
            goto L25c
        L25b:
            r5 = 0
        L25c:
            if (r13 < r10) goto L262
            defpackage.up.g(r12, r5, r6)
            goto L265
        L262:
            r12.onPull(r5, r6)
        L265:
            android.widget.EdgeEffect r5 = r7.i
            boolean r5 = defpackage.mr1.g(r5)
            if (r5 == 0) goto L280
            android.widget.EdgeEffect r5 = r7.i
            if (r5 != 0) goto L279
            lo4 r5 = defpackage.lo4.Vertical
            android.widget.EdgeEffect r5 = r7.a(r5)
            r7.i = r5
        L279:
            r11 = 0
            U0(r11, r5, r8)
            r5.finish()
        L280:
            android.widget.EdgeEffect r5 = r7.e
            boolean r5 = defpackage.mr1.f(r5)
            if (r5 == 0) goto L2d2
            android.widget.EdgeEffect r5 = r7.b()
            r6 = 1127481344(0x43340000, float:180.0)
            boolean r6 = U0(r6, r5, r8)
            if (r6 != 0) goto L29a
            if (r21 == 0) goto L297
            goto L29a
        L297:
            r16 = 0
            goto L29c
        L29a:
            r16 = 1
        L29c:
            android.widget.EdgeEffect r6 = r7.e
            boolean r6 = defpackage.mr1.g(r6)
            if (r6 == 0) goto L2d0
            long r12 = r3.c()
            long r12 = r12 >> r19
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            android.widget.EdgeEffect r12 = r7.i
            if (r12 != 0) goto L2bb
            lo4 r12 = defpackage.lo4.Vertical
            android.widget.EdgeEffect r12 = r7.a(r12)
            r7.i = r12
        L2bb:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r10) goto L2c4
            float r5 = defpackage.up.e(r5)
            goto L2c5
        L2c4:
            r5 = 0
        L2c5:
            float r6 = r20 - r6
            if (r7 < r10) goto L2cd
            defpackage.up.g(r12, r5, r6)
            goto L2d0
        L2cd:
            r12.onPull(r5, r6)
        L2d0:
            r21 = r16
        L2d2:
            if (r21 == 0) goto L2d7
            r3.d()
        L2d7:
            if (r24 == 0) goto L2db
            r3 = 0
            goto L2dc
        L2db:
            r3 = r15
        L2dc:
            if (r4 == 0) goto L2e0
            r5 = 0
            goto L2e1
        L2e0:
            r5 = r15
        L2e1:
            kk3 r4 = r1.getLayoutDirection()
            wd r6 = new wd
            r6.<init>()
            r6.a = r8
            long r7 = r2.e()
            bt r10 = r2.B
            qh1 r10 = r10.I()
            bt r11 = r2.B
            kk3 r11 = r11.K()
            bt r12 = r2.B
            xj0 r12 = r12.G()
            bt r13 = r2.B
            long r13 = r13.L()
            bt r15 = r2.B
            r20 = r9
            java.lang.Object r9 = r15.L
            ut2 r9 = (defpackage.ut2) r9
            r15.W(r1)
            r15.X(r4)
            r15.V(r6)
            r15.Y(r7)
            r4 = 0
            r15.L = r4
            r6.h()
            bt r4 = r2.B     // Catch: java.lang.Throwable -> L367
            java.lang.Object r4 = r4.B     // Catch: java.lang.Throwable -> L367
            os0 r4 = (defpackage.os0) r4     // Catch: java.lang.Throwable -> L367
            r4.g0(r3, r5)     // Catch: java.lang.Throwable -> L367
            r1.b()     // Catch: java.lang.Throwable -> L369
            bt r1 = r2.B     // Catch: java.lang.Throwable -> L367
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L367
            os0 r1 = (defpackage.os0) r1     // Catch: java.lang.Throwable -> L367
            float r3 = -r3
            float r4 = -r5
            r1.g0(r3, r4)     // Catch: java.lang.Throwable -> L367
            r6.p()
            bt r1 = r2.B
            r1.W(r10)
            r1.X(r11)
            r1.V(r12)
            r1.Y(r13)
            r1.L = r9
            android.graphics.RenderNode r1 = r0.W0()
            defpackage.r74.u(r1)
            int r1 = r20.save()
            r9 = r20
            r9.translate(r3, r4)
            android.graphics.RenderNode r0 = r0.W0()
            defpackage.r74.s(r9, r0)
            r9.restoreToCount(r1)
            goto L38d
        L367:
            r0 = move-exception
            goto L376
        L369:
            r0 = move-exception
            bt r1 = r2.B     // Catch: java.lang.Throwable -> L367
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L367
            os0 r1 = (defpackage.os0) r1     // Catch: java.lang.Throwable -> L367
            float r3 = -r3
            float r4 = -r5
            r1.g0(r3, r4)     // Catch: java.lang.Throwable -> L367
            throw r0     // Catch: java.lang.Throwable -> L367
        L376:
            r6.p()
            bt r1 = r2.B
            r1.W(r10)
            r1.X(r11)
            r1.V(r12)
            r1.Y(r13)
            r1.L = r9
            throw r0
        L38a:
            r1.b()
        L38d:
            return
        L38e:
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r19 = 32
            java.lang.Object r0 = r0.p0
            lq4 r0 = (defpackage.lq4) r0
            zj0 r2 = r1.A
            long r4 = r2.e()
            r3.i(r4)
            long r4 = r2.e()
            boolean r4 = defpackage.xi6.f(r4)
            if (r4 == 0) goto L3b1
            r1.b()
            goto L4c4
        L3b1:
            r1.b()
            vs4 r4 = r3.d
            r4.getValue()
            bt r4 = r2.B
            xj0 r4 = r4.G()
            android.graphics.Canvas r4 = defpackage.xd.a(r4)
            android.widget.EdgeEffect r5 = r7.f
            boolean r5 = defpackage.mr1.f(r5)
            if (r5 == 0) goto L3fb
            android.widget.EdgeEffect r5 = r7.c()
            long r8 = r2.e()
            long r8 = r8 & r17
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = -r8
            kk3 r9 = r1.getLayoutDirection()
            float r9 = r0.b(r9)
            float r9 = r1.e0(r9)
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r13 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            long r13 = r13 << r19
            long r8 = r8 & r17
            long r8 = r8 | r13
            boolean r5 = V0(r12, r8, r5, r4)
            goto L3fc
        L3fb:
            r5 = 0
        L3fc:
            android.widget.EdgeEffect r8 = r7.d
            boolean r8 = defpackage.mr1.f(r8)
            if (r8 == 0) goto L42c
            android.widget.EdgeEffect r8 = r7.e()
            float r9 = r0.d()
            float r9 = r1.e0(r9)
            r11 = 0
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r12 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            long r12 = r12 << r19
            long r9 = r9 & r17
            long r9 = r9 | r12
            boolean r8 = V0(r11, r9, r8, r4)
            if (r8 != 0) goto L42b
            if (r5 == 0) goto L429
            goto L42b
        L429:
            r5 = 0
            goto L42c
        L42b:
            r5 = 1
        L42c:
            android.widget.EdgeEffect r8 = r7.g
            boolean r8 = defpackage.mr1.f(r8)
            if (r8 == 0) goto L474
            android.widget.EdgeEffect r8 = r7.d()
            long r9 = r2.e()
            long r9 = r9 >> r19
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r9 = defpackage.u24.E(r9)
            kk3 r10 = r1.getLayoutDirection()
            float r10 = r0.c(r10)
            float r9 = (float) r9
            float r9 = -r9
            float r10 = r1.e0(r10)
            float r10 = r10 + r9
            r11 = 0
            int r9 = java.lang.Float.floatToRawIntBits(r11)
            long r11 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            long r11 = r11 << r19
            long r9 = r9 & r17
            long r9 = r9 | r11
            r11 = 1119092736(0x42b40000, float:90.0)
            boolean r8 = V0(r11, r9, r8, r4)
            if (r8 != 0) goto L473
            if (r5 == 0) goto L471
            goto L473
        L471:
            r5 = 0
            goto L474
        L473:
            r5 = 1
        L474:
            android.widget.EdgeEffect r8 = r7.e
            boolean r8 = defpackage.mr1.f(r8)
            if (r8 == 0) goto L4bf
            android.widget.EdgeEffect r7 = r7.b()
            float r0 = r0.a()
            float r0 = r1.e0(r0)
            long r8 = r2.e()
            long r8 = r8 >> r19
            int r1 = (int) r8
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = -r1
            long r8 = r2.e()
            long r8 = r8 & r17
            int r2 = (int) r8
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = -r2
            float r2 = r2 + r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r8 = (long) r2
            long r0 = r0 << r19
            long r8 = r8 & r17
            long r0 = r0 | r8
            r6 = 1127481344(0x43340000, float:180.0)
            boolean r0 = V0(r6, r0, r7, r4)
            if (r0 != 0) goto L4bd
            if (r5 == 0) goto L4bb
            goto L4bd
        L4bb:
            r4 = 0
            goto L4be
        L4bd:
            r4 = 1
        L4be:
            r5 = r4
        L4bf:
            if (r5 == 0) goto L4c4
            r3.d()
        L4c4:
            return
    }
}
