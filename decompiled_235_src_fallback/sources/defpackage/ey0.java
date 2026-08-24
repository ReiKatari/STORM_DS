package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey0  reason: default package */
/* loaded from: classes.dex */
public final class ey0 implements defpackage.yx0 {
    public final defpackage.zx0 A;
    public final defpackage.cg7 B;
    public final java.util.concurrent.atomic.AtomicReference L;
    public final java.lang.Object R;
    public final defpackage.ma4 X;
    public final defpackage.mk6 Y;
    public final defpackage.ja4 Z;
    public final defpackage.ka4 d0;
    public final defpackage.ka4 e0;
    public final defpackage.ja4 f0;
    public final defpackage.rl0 g0;
    public final defpackage.rl0 h0;
    public final defpackage.ja4 i0;
    public defpackage.ja4 j0;
    public boolean k0;
    public defpackage.kh6 l0;
    public defpackage.tu4 m0;
    public defpackage.ey0 n0;
    public int o0;
    public final defpackage.os0 p0;
    public final defpackage.jb1 q0;
    public final defpackage.xq2 r0;
    public int s0;

    public ey0(defpackage.zx0 r11, defpackage.cg7 r12) {
            r10 = this;
            r10.<init>()
            r10.A = r11
            r10.B = r12
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r10.L = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r10.R = r0
            ka4 r0 = new ka4
            r0.<init>()
            ma4 r5 = new ma4
            r5.<init>(r0)
            r10.X = r5
            mk6 r0 = new mk6
            r0.<init>()
            boolean r1 = r11.d()
            if (r1 == 0) goto L34
            p94 r1 = new p94
            r1.<init>()
            r0.g0 = r1
        L34:
            boolean r1 = r11.f()
            if (r1 == 0) goto L3d
            r0.b()
        L3d:
            r10.Y = r0
            ja4 r1 = defpackage.mp2.q()
            r10.Z = r1
            ka4 r1 = new ka4
            r1.<init>()
            r10.d0 = r1
            ka4 r1 = new ka4
            r1.<init>()
            r10.e0 = r1
            ja4 r1 = defpackage.mp2.q()
            r10.f0 = r1
            rl0 r6 = new rl0
            r6.<init>()
            r10.g0 = r6
            rl0 r7 = new rl0
            r7.<init>()
            r10.h0 = r7
            ja4 r1 = defpackage.mp2.q()
            r10.i0 = r1
            ja4 r1 = defpackage.mp2.q()
            r10.j0 = r1
            os0 r8 = new os0
            r1 = 25
            r8.<init>(r11, r1)
            r10.p0 = r8
            jb1 r1 = new jb1
            r1.<init>()
            r10.q0 = r1
            mk6 r4 = defpackage.ok6.d(r0)
            xq2 r1 = new xq2
            r9 = r10
            r3 = r11
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r3.p(r1)
            r9.r0 = r1
            return
    }

    public final void A(defpackage.eo2 r4) {
            r3 = this;
            boolean r0 = r3.i()
            r3.q()
            zx0 r1 = r3.A
            if (r0 == 0) goto L1a
            r0 = 0
            xq2 r2 = r3.r0
            r2.z = r0
            r0 = 1
            r2.y = r0
            r1.a(r3, r4)
            r2.u()
            return
        L1a:
            r1.a(r3, r4)
            return
    }

    public final void a() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.L
            r1 = 0
            r0.set(r1)
            rl0 r0 = r2.g0
            co4 r0 = r0.m
            r0.e0()
            rl0 r0 = r2.h0
            co4 r0 = r0.m
            r0.e0()
            ma4 r0 = r2.X
            ka4 r1 = r0.A
            boolean r1 = r1.g()
            if (r1 != 0) goto L35
            jb1 r1 = r2.q0
            xq2 r2 = r2.r0
            cy0 r2 = r2.C()
            r1.g(r0, r2)     // Catch: java.lang.Throwable -> L30
            r1.b()     // Catch: java.lang.Throwable -> L30
            r1.a()
            return
        L30:
            r2 = move-exception
            r1.a()
            throw r2
        L35:
            return
    }

    public final void b(java.util.Set r32, boolean r33) {
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            boolean r3 = r1 instanceof defpackage.d66
            ja4 r4 = r0.f0
            r5 = 0
            r14 = 8
            if (r3 == 0) goto L111
            d66 r1 = (defpackage.d66) r1
            ka4 r1 = r1.A
            java.lang.Object[] r3 = r1.b
            long[] r1 = r1.a
            int r15 = r1.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto L104
            r6 = 0
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L21:
            r8 = r1[r6]
            r7 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = ~r8
            long r10 = r10 << r7
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto Lf5
            int r10 = r6 - r15
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L3a:
            if (r11 >= r10) goto Le9
            long r22 = r8 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto Ld2
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            r22 = r7
            boolean r7 = r12 instanceof defpackage.cf5
            if (r7 == 0) goto L5a
            cf5 r12 = (defpackage.cf5) r12
            r12.b(r5)
        L52:
            r29 = r1
            r26 = r8
            r32 = r15
            goto Lcf
        L5a:
            r0.c(r2, r12)
            java.lang.Object r7 = r4.g(r12)
            if (r7 == 0) goto L52
            boolean r12 = r7 instanceof defpackage.ka4
            if (r12 == 0) goto Lc4
            ka4 r7 = (defpackage.ka4) r7
            java.lang.Object[] r12 = r7.b
            long[] r7 = r7.a
            int r13 = r7.length
            int r13 = r13 + (-2)
            if (r13 < 0) goto L52
            r25 = r14
            r32 = r15
            r5 = 0
        L77:
            r14 = r7[r5]
            r26 = r8
            r9 = r7
            long r7 = ~r14
            long r7 = r7 << r22
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto Lb6
            int r7 = r5 - r13
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L8e:
            if (r8 >= r7) goto Laf
            long r28 = r14 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto La6
            int r28 = r5 << 3
            int r28 = r28 + r8
            r28 = r12[r28]
            r29 = r1
            r1 = r28
            ii1 r1 = (defpackage.ii1) r1
            r0.c(r2, r1)
            goto La8
        La6:
            r29 = r1
        La8:
            long r14 = r14 >> r25
            int r8 = r8 + 1
            r1 = r29
            goto L8e
        Laf:
            r29 = r1
            r1 = r25
            if (r7 != r1) goto Lcf
            goto Lb8
        Lb6:
            r29 = r1
        Lb8:
            if (r5 == r13) goto Lcf
            int r5 = r5 + 1
            r7 = r9
            r8 = r26
            r1 = r29
            r25 = 8
            goto L77
        Lc4:
            r29 = r1
            r26 = r8
            r32 = r15
            ii1 r7 = (defpackage.ii1) r7
            r0.c(r2, r7)
        Lcf:
            r1 = 8
            goto Ldb
        Ld2:
            r29 = r1
            r22 = r7
            r26 = r8
            r32 = r15
            r1 = r14
        Ldb:
            long r8 = r26 >> r1
            int r11 = r11 + 1
            r15 = r32
            r14 = r1
            r7 = r22
            r1 = r29
            r5 = 0
            goto L3a
        Le9:
            r29 = r1
            r22 = r7
            r1 = r14
            r32 = r15
            if (r10 != r1) goto L18e
            r15 = r32
            goto Lf9
        Lf5:
            r29 = r1
            r22 = r7
        Lf9:
            if (r6 == r15) goto L18e
            int r6 = r6 + 1
            r1 = r29
            r5 = 0
            r14 = 8
            goto L21
        L104:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            goto L18e
        L111:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L122:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L18e
            java.lang.Object r3 = r1.next()
            boolean r5 = r3 instanceof defpackage.cf5
            if (r5 == 0) goto L137
            cf5 r3 = (defpackage.cf5) r3
            r5 = 0
            r3.b(r5)
            goto L122
        L137:
            r5 = 0
            r0.c(r2, r3)
            java.lang.Object r3 = r4.g(r3)
            if (r3 == 0) goto L122
            boolean r6 = r3 instanceof defpackage.ka4
            if (r6 == 0) goto L188
            ka4 r3 = (defpackage.ka4) r3
            java.lang.Object[] r6 = r3.b
            long[] r3 = r3.a
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L122
            r8 = 0
        L151:
            r9 = r3[r8]
            long r11 = ~r9
            long r11 = r11 << r22
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L183
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r25 = 8
            int r14 = 8 - r11
            r11 = 0
        L167:
            if (r11 >= r14) goto L17f
            long r12 = r9 & r18
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 >= 0) goto L179
            int r12 = r8 << 3
            int r12 = r12 + r11
            r12 = r6[r12]
            ii1 r12 = (defpackage.ii1) r12
            r0.c(r2, r12)
        L179:
            r12 = 8
            long r9 = r9 >> r12
            int r11 = r11 + 1
            goto L167
        L17f:
            r12 = 8
            if (r14 != r12) goto L122
        L183:
            if (r8 == r7) goto L122
            int r8 = r8 + 1
            goto L151
        L188:
            ii1 r3 = (defpackage.ii1) r3
            r0.c(r2, r3)
            goto L122
        L18e:
            ja4 r1 = r0.Z
            ka4 r3 = r0.d0
            if (r2 == 0) goto L294
            ka4 r2 = r0.e0
            boolean r4 = r2.h()
            if (r4 == 0) goto L294
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L28d
            r6 = 0
        L1a4:
            r7 = r4[r6]
            long r9 = ~r7
            long r9 = r9 << r22
            long r9 = r9 & r7
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L281
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r25 = 8
            int r14 = 8 - r9
            r9 = 0
        L1ba:
            if (r9 >= r14) goto L27a
            long r10 = r7 & r18
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 >= 0) goto L26b
            int r10 = r6 << 3
            int r10 = r10 + r9
            java.lang.Object[] r11 = r1.b
            r11 = r11[r10]
            java.lang.Object[] r11 = r1.c
            r11 = r11[r10]
            boolean r12 = r11 instanceof defpackage.ka4
            if (r12 == 0) goto L24a
            ka4 r11 = (defpackage.ka4) r11
            java.lang.Object[] r12 = r11.b
            long[] r13 = r11.a
            int r15 = r13.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto L241
            r32 = r7
            r0 = 0
        L1df:
            r7 = r13[r0]
            r24 = r12
            r26 = r13
            long r12 = ~r7
            long r12 = r12 << r22
            long r12 = r12 & r7
            long r12 = r12 & r20
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 == 0) goto L234
            int r12 = r0 - r15
            int r12 = ~r12
            int r12 = r12 >>> 31
            r25 = 8
            int r12 = 8 - r12
            r13 = 0
        L1f9:
            if (r13 >= r12) goto L22d
            long r27 = r7 & r18
            int r27 = (r27 > r16 ? 1 : (r27 == r16 ? 0 : -1))
            if (r27 >= 0) goto L221
            int r27 = r0 << 3
            r28 = r4
            int r4 = r27 + r13
            r27 = r24[r4]
            r29 = r7
            r7 = r27
            cf5 r7 = (defpackage.cf5) r7
            boolean r8 = r2.c(r7)
            if (r8 != 0) goto L21b
            boolean r7 = r3.c(r7)
            if (r7 == 0) goto L21e
        L21b:
            r11.m(r4)
        L21e:
            r4 = 8
            goto L226
        L221:
            r28 = r4
            r29 = r7
            goto L21e
        L226:
            long r7 = r29 >> r4
            int r13 = r13 + 1
            r4 = r28
            goto L1f9
        L22d:
            r28 = r4
            r4 = 8
            if (r12 != r4) goto L245
            goto L236
        L234:
            r28 = r4
        L236:
            if (r0 == r15) goto L245
            int r0 = r0 + 1
            r12 = r24
            r13 = r26
            r4 = r28
            goto L1df
        L241:
            r28 = r4
            r32 = r7
        L245:
            boolean r0 = r11.g()
            goto L263
        L24a:
            r28 = r4
            r32 = r7
            r11.getClass()
            cf5 r11 = (defpackage.cf5) r11
            boolean r0 = r2.c(r11)
            if (r0 != 0) goto L262
            boolean r0 = r3.c(r11)
            if (r0 == 0) goto L260
            goto L262
        L260:
            r0 = 0
            goto L263
        L262:
            r0 = 1
        L263:
            if (r0 == 0) goto L268
            r1.l(r10)
        L268:
            r4 = 8
            goto L270
        L26b:
            r28 = r4
            r32 = r7
            goto L268
        L270:
            long r7 = r32 >> r4
            int r9 = r9 + 1
            r0 = r31
            r4 = r28
            goto L1ba
        L27a:
            r28 = r4
            r4 = 8
            if (r14 != r4) goto L28d
            goto L283
        L281:
            r28 = r4
        L283:
            if (r6 == r5) goto L28d
            int r6 = r6 + 1
            r0 = r31
            r4 = r28
            goto L1a4
        L28d:
            r2.b()
            r31.h()
            return
        L294:
            boolean r0 = r3.h()
            if (r0 == 0) goto L37b
            long[] r0 = r1.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L375
            r4 = 0
        L2a2:
            r5 = r0[r4]
            long r7 = ~r5
            long r7 = r7 << r22
            long r7 = r7 & r5
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L369
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r25 = 8
            int r14 = 8 - r7
            r7 = 0
        L2b8:
            if (r7 >= r14) goto L362
            long r8 = r5 & r18
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L355
            int r8 = r4 << 3
            int r8 = r8 + r7
            java.lang.Object[] r9 = r1.b
            r9 = r9[r8]
            java.lang.Object[] r9 = r1.c
            r9 = r9[r8]
            boolean r10 = r9 instanceof defpackage.ka4
            if (r10 == 0) goto L340
            ka4 r9 = (defpackage.ka4) r9
            java.lang.Object[] r10 = r9.b
            long[] r11 = r9.a
            int r12 = r11.length
            int r12 = r12 + (-2)
            if (r12 < 0) goto L337
            r32 = r5
            r13 = 0
        L2dd:
            r5 = r11[r13]
            r15 = r10
            r24 = r11
            long r10 = ~r5
            long r10 = r10 << r22
            long r10 = r10 & r5
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L32b
            int r10 = r13 - r12
            int r10 = ~r10
            int r10 = r10 >>> 31
            r25 = 8
            int r10 = 8 - r10
            r11 = 0
        L2f6:
            if (r11 >= r10) goto L324
            long r26 = r5 & r18
            int r26 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r26 >= 0) goto L318
            int r26 = r13 << 3
            r27 = r0
            int r0 = r26 + r11
            r26 = r15[r0]
            r28 = r5
            r5 = r26
            cf5 r5 = (defpackage.cf5) r5
            boolean r5 = r3.c(r5)
            if (r5 == 0) goto L315
            r9.m(r0)
        L315:
            r0 = 8
            goto L31d
        L318:
            r27 = r0
            r28 = r5
            goto L315
        L31d:
            long r5 = r28 >> r0
            int r11 = r11 + 1
            r0 = r27
            goto L2f6
        L324:
            r27 = r0
            r0 = 8
            if (r10 != r0) goto L33b
            goto L32d
        L32b:
            r27 = r0
        L32d:
            if (r13 == r12) goto L33b
            int r13 = r13 + 1
            r10 = r15
            r11 = r24
            r0 = r27
            goto L2dd
        L337:
            r27 = r0
            r32 = r5
        L33b:
            boolean r0 = r9.g()
            goto L34d
        L340:
            r27 = r0
            r32 = r5
            r9.getClass()
            cf5 r9 = (defpackage.cf5) r9
            boolean r0 = r3.c(r9)
        L34d:
            if (r0 == 0) goto L352
            r1.l(r8)
        L352:
            r0 = 8
            goto L35a
        L355:
            r27 = r0
            r32 = r5
            goto L352
        L35a:
            long r5 = r32 >> r0
            int r7 = r7 + 1
            r0 = r27
            goto L2b8
        L362:
            r27 = r0
            r0 = 8
            if (r14 != r0) goto L375
            goto L36d
        L369:
            r27 = r0
            r0 = 8
        L36d:
            if (r4 == r2) goto L375
            int r4 = r4 + 1
            r0 = r27
            goto L2a2
        L375:
            r31.h()
            r3.b()
        L37b:
            return
    }

    public final void c(boolean r19, java.lang.Object r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            ja4 r2 = r0.Z
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L91
            boolean r3 = r2 instanceof defpackage.ka4
            ka4 r4 = r0.d0
            ka4 r5 = r0.e0
            ja4 r0 = r0.i0
            if (r3 == 0) goto L74
            ka4 r2 = (defpackage.ka4) r2
            java.lang.Object[] r3 = r2.b
            long[] r2 = r2.a
            int r6 = r2.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L91
            r8 = 0
        L22:
            r9 = r2[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3c:
            if (r13 >= r11) goto L6d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L69
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r3[r14]
            cf5 r14 = (defpackage.cf5) r14
            boolean r15 = defpackage.mp2.U(r0, r1, r14)
            if (r15 != 0) goto L69
            yb3 r15 = r14.b(r1)
            yb3 r7 = defpackage.yb3.IGNORED
            if (r15 == r7) goto L69
            ja4 r7 = r14.g
            if (r7 == 0) goto L66
            if (r19 != 0) goto L66
            r5.a(r14)
            goto L69
        L66:
            r4.a(r14)
        L69:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3c
        L6d:
            if (r11 != r12) goto L91
        L6f:
            if (r8 == r6) goto L91
            int r8 = r8 + 1
            goto L22
        L74:
            cf5 r2 = (defpackage.cf5) r2
            boolean r0 = defpackage.mp2.U(r0, r1, r2)
            if (r0 != 0) goto L91
            yb3 r0 = r2.b(r1)
            yb3 r1 = defpackage.yb3.IGNORED
            if (r0 == r1) goto L91
            ja4 r0 = r2.g
            if (r0 == 0) goto L8e
            if (r19 != 0) goto L8e
            r5.a(r2)
            return
        L8e:
            r4.a(r2)
        L91:
            return
    }

    public final void d() {
            r5 = this;
            java.lang.Object r0 = r5.R
            monitor-enter(r0)
            rl0 r1 = r5.g0     // Catch: java.lang.Throwable -> Ld
            r5.e(r1)     // Catch: java.lang.Throwable -> Ld
            r5.o()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r1 = move-exception
            ma4 r2 = r5.X     // Catch: java.lang.Throwable -> L2c
            ka4 r2 = r2.A     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L2c
            if (r2 != 0) goto L33
            jb1 r2 = r5.q0     // Catch: java.lang.Throwable -> L2c
            ma4 r3 = r5.X     // Catch: java.lang.Throwable -> L2c
            xq2 r4 = r5.r0     // Catch: java.lang.Throwable -> L2c
            cy0 r4 = r4.C()     // Catch: java.lang.Throwable -> L2c
            r2.g(r3, r4)     // Catch: java.lang.Throwable -> L2e
            r2.b()     // Catch: java.lang.Throwable -> L2e
            r2.a()     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r1 = move-exception
            goto L34
        L2e:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2c
        L33:
            throw r1     // Catch: java.lang.Throwable -> L2c
        L34:
            r5.a()     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public final void e(defpackage.rl0 r34) {
            r33 = this;
            r1 = r33
            r0 = r34
            rl0 r2 = r1.h0
            xq2 r3 = r1.r0
            cy0 r4 = r3.C()
            jb1 r5 = r1.q0
            ma4 r6 = r1.X
            r5.g(r6, r4)
            co4 r4 = r0.m     // Catch: java.lang.Throwable -> L3e
            boolean r4 = r4.g0()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L35
            co4 r0 = r2.m     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r0.g0()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            tu4 r0 = r1.m0     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L2d
            r5.b()     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r0 = move-exception
            goto L31
        L2d:
            r5.a()
            return
        L31:
            r5.a()
            throw r0
        L35:
            tu4 r4 = r1.m0     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L43
            jf5 r6 = r4.l     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L43
            goto L45
        L3e:
            r0 = move-exception
            r26 = r5
            goto L1cf
        L43:
            cg7 r6 = r1.B     // Catch: java.lang.Throwable -> L3e
        L45:
            if (r4 == 0) goto L4a
            jf5 r4 = r4.l     // Catch: java.lang.Throwable -> L3e
            goto L4b
        L4a:
            r4 = 0
        L4b:
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L54
            java.lang.String r4 = "Compose:recordChanges"
            goto L56
        L54:
            java.lang.String r4 = "Compose:applyChanges"
        L56:
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L3e
            tu4 r4 = r1.m0     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L67
            jb1 r4 = r4.k     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L68
            goto L67
        L62:
            r0 = move-exception
            r26 = r5
            goto L1cb
        L67:
            r4 = r5
        L68:
            mk6 r7 = r1.Y     // Catch: java.lang.Throwable -> L62
            cy0 r3 = r3.C()     // Catch: java.lang.Throwable -> L62
            mk6 r7 = defpackage.ok6.d(r7)     // Catch: java.lang.Throwable -> L62
            pk6 r7 = r7.d()     // Catch: java.lang.Throwable -> L62
            r8 = 0
            r0.Z(r6, r7, r4, r3)     // Catch: java.lang.Throwable -> L1c2
            r0 = 1
            r7.e(r0)     // Catch: java.lang.Throwable -> L62
            r6.l()     // Catch: java.lang.Throwable -> L62
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L3e
            r5.c()     // Catch: java.lang.Throwable -> L3e
            r5.d()     // Catch: java.lang.Throwable -> L3e
            boolean r3 = r1.k0     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L1a6
            java.lang.String r3 = "Compose:unobserve"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L3e
            r1.k0 = r8     // Catch: java.lang.Throwable -> L13f
            ja4 r3 = r1.Z     // Catch: java.lang.Throwable -> L13f
            long[] r4 = r3.a     // Catch: java.lang.Throwable -> L13f
            int r6 = r4.length     // Catch: java.lang.Throwable -> L13f
            int r6 = r6 + (-2)
            if (r6 < 0) goto L197
            r7 = r8
        L9f:
            r9 = r4[r7]     // Catch: java.lang.Throwable -> L13f
            long r11 = ~r9     // Catch: java.lang.Throwable -> L13f
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r14
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L187
            int r11 = r7 - r6
            int r11 = ~r11     // Catch: java.lang.Throwable -> L13f
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r0 = r8
        Lb9:
            if (r0 >= r11) goto L17f
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r9 & r16
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L162
            int r18 = r7 << 3
            r19 = r13
            int r13 = r18 + r0
            r22 = r14
            java.lang.Object[] r14 = r3.b     // Catch: java.lang.Throwable -> L13f
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L13f
            java.lang.Object[] r14 = r3.c     // Catch: java.lang.Throwable -> L13f
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L13f
            boolean r15 = r14 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L13f
            if (r15 == 0) goto L144
            ka4 r14 = (defpackage.ka4) r14     // Catch: java.lang.Throwable -> L13f
            java.lang.Object[] r15 = r14.b     // Catch: java.lang.Throwable -> L13f
            long[] r8 = r14.a     // Catch: java.lang.Throwable -> L13f
            r24 = r12
            int r12 = r8.length     // Catch: java.lang.Throwable -> L13f
            int r12 = r12 + (-2)
            r25 = r0
            r27 = r4
            r26 = r5
            if (r12 < 0) goto L138
            r0 = 0
        Led:
            r4 = r8[r0]     // Catch: java.lang.Throwable -> L120
            r28 = r9
            r10 = r8
            long r8 = ~r4     // Catch: java.lang.Throwable -> L120
            long r8 = r8 << r19
            long r8 = r8 & r4
            long r8 = r8 & r22
            int r8 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r8 == 0) goto L12e
            int r8 = r0 - r12
            int r8 = ~r8     // Catch: java.lang.Throwable -> L120
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = 0
        L104:
            if (r9 >= r8) goto L12a
            long r30 = r4 & r16
            int r30 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r30 >= 0) goto L123
            int r30 = r0 << 3
            r31 = r4
            int r4 = r30 + r9
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L120
            cf5 r5 = (defpackage.cf5) r5     // Catch: java.lang.Throwable -> L120
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> L120
            if (r5 != 0) goto L125
            r14.m(r4)     // Catch: java.lang.Throwable -> L120
            goto L125
        L120:
            r0 = move-exception
            goto L1a2
        L123:
            r31 = r4
        L125:
            long r4 = r31 >> r24
            int r9 = r9 + 1
            goto L104
        L12a:
            r4 = r24
            if (r8 != r4) goto L13a
        L12e:
            if (r0 == r12) goto L13a
            int r0 = r0 + 1
            r8 = r10
            r9 = r28
            r24 = 8
            goto Led
        L138:
            r28 = r9
        L13a:
            boolean r0 = r14.g()     // Catch: java.lang.Throwable -> L120
            goto L15a
        L13f:
            r0 = move-exception
            r26 = r5
            goto L1a2
        L144:
            r25 = r0
            r27 = r4
            r26 = r5
            r28 = r9
            r14.getClass()     // Catch: java.lang.Throwable -> L120
            cf5 r14 = (defpackage.cf5) r14     // Catch: java.lang.Throwable -> L120
            boolean r0 = r14.a()     // Catch: java.lang.Throwable -> L120
            if (r0 != 0) goto L159
            r0 = 1
            goto L15a
        L159:
            r0 = 0
        L15a:
            if (r0 == 0) goto L15f
            r3.l(r13)     // Catch: java.lang.Throwable -> L120
        L15f:
            r4 = 8
            goto L16f
        L162:
            r25 = r0
            r27 = r4
            r26 = r5
            r28 = r9
            r19 = r13
            r22 = r14
            r4 = r12
        L16f:
            long r9 = r28 >> r4
            int r0 = r25 + 1
            r12 = r4
            r13 = r19
            r14 = r22
            r5 = r26
            r4 = r27
            r8 = 0
            goto Lb9
        L17f:
            r27 = r4
            r26 = r5
            r4 = r12
            if (r11 != r4) goto L199
            goto L18b
        L187:
            r27 = r4
            r26 = r5
        L18b:
            if (r7 == r6) goto L199
            int r7 = r7 + 1
            r5 = r26
            r4 = r27
            r0 = 1
            r8 = 0
            goto L9f
        L197:
            r26 = r5
        L199:
            r1.h()     // Catch: java.lang.Throwable -> L120
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1a0
            goto L1a8
        L1a0:
            r0 = move-exception
            goto L1cf
        L1a2:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1a0
            throw r0     // Catch: java.lang.Throwable -> L1a0
        L1a6:
            r26 = r5
        L1a8:
            co4 r0 = r2.m     // Catch: java.lang.Throwable -> L1b8
            boolean r0 = r0.g0()     // Catch: java.lang.Throwable -> L1b8
            if (r0 == 0) goto L1ba
            tu4 r0 = r1.m0     // Catch: java.lang.Throwable -> L1b8
            if (r0 != 0) goto L1ba
            r26.b()     // Catch: java.lang.Throwable -> L1b8
            goto L1ba
        L1b8:
            r0 = move-exception
            goto L1be
        L1ba:
            r26.a()
            return
        L1be:
            r26.a()
            throw r0
        L1c2:
            r0 = move-exception
            r26 = r5
            r3 = 0
            r7.e(r3)     // Catch: java.lang.Throwable -> L1ca
            throw r0     // Catch: java.lang.Throwable -> L1ca
        L1ca:
            r0 = move-exception
        L1cb:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L1a0
            throw r0     // Catch: java.lang.Throwable -> L1a0
        L1cf:
            co4 r2 = r2.m     // Catch: java.lang.Throwable -> L1df
            boolean r2 = r2.g0()     // Catch: java.lang.Throwable -> L1df
            if (r2 == 0) goto L1e1
            tu4 r1 = r1.m0     // Catch: java.lang.Throwable -> L1df
            if (r1 != 0) goto L1e1
            r26.b()     // Catch: java.lang.Throwable -> L1df
            goto L1e1
        L1df:
            r0 = move-exception
            goto L1e5
        L1e1:
            r26.a()
            throw r0
        L1e5:
            r26.a()
            throw r0
    }

    public final void f() {
            r5 = this;
            java.lang.Object r0 = r5.R
            monitor-enter(r0)
            rl0 r1 = r5.h0     // Catch: java.lang.Throwable -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L16
            co4 r1 = r1.m     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.g0()     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            rl0 r1 = r5.h0     // Catch: java.lang.Throwable -> L16
            r5.e(r1)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)
            return
        L1a:
            ma4 r2 = r5.X     // Catch: java.lang.Throwable -> L38
            ka4 r2 = r2.A     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L3f
            jb1 r2 = r5.q0     // Catch: java.lang.Throwable -> L38
            ma4 r3 = r5.X     // Catch: java.lang.Throwable -> L38
            xq2 r4 = r5.r0     // Catch: java.lang.Throwable -> L38
            cy0 r4 = r4.C()     // Catch: java.lang.Throwable -> L38
            r2.g(r3, r4)     // Catch: java.lang.Throwable -> L3a
            r2.b()     // Catch: java.lang.Throwable -> L3a
            r2.a()     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r1 = move-exception
            goto L40
        L3a:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L3f:
            throw r1     // Catch: java.lang.Throwable -> L38
        L40:
            r5.a()     // Catch: java.lang.Throwable -> L44
            throw r1     // Catch: java.lang.Throwable -> L44
        L44:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public final void g() {
            r5 = this;
            java.lang.Object r0 = r5.R
            monitor-enter(r0)
            xq2 r1 = r5.r0     // Catch: java.lang.Throwable -> L26
            r2 = 0
            r1.v = r2     // Catch: java.lang.Throwable -> L26
            ma4 r1 = r5.X     // Catch: java.lang.Throwable -> L26
            ka4 r1 = r1.A     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2d
            jb1 r1 = r5.q0     // Catch: java.lang.Throwable -> L26
            ma4 r2 = r5.X     // Catch: java.lang.Throwable -> L26
            xq2 r3 = r5.r0     // Catch: java.lang.Throwable -> L26
            cy0 r3 = r3.C()     // Catch: java.lang.Throwable -> L26
            r1.g(r2, r3)     // Catch: java.lang.Throwable -> L28
            r1.b()     // Catch: java.lang.Throwable -> L28
            r1.a()     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r1 = move-exception
            goto L2f
        L28:
            r2 = move-exception
            r1.a()     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L2d:
            monitor-exit(r0)
            return
        L2f:
            ma4 r2 = r5.X     // Catch: java.lang.Throwable -> L4d
            ka4 r2 = r2.A     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L54
            jb1 r2 = r5.q0     // Catch: java.lang.Throwable -> L4d
            ma4 r3 = r5.X     // Catch: java.lang.Throwable -> L4d
            xq2 r4 = r5.r0     // Catch: java.lang.Throwable -> L4d
            cy0 r4 = r4.C()     // Catch: java.lang.Throwable -> L4d
            r2.g(r3, r4)     // Catch: java.lang.Throwable -> L4f
            r2.b()     // Catch: java.lang.Throwable -> L4f
            r2.a()     // Catch: java.lang.Throwable -> L4d
            goto L54
        L4d:
            r1 = move-exception
            goto L55
        L4f:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L54:
            throw r1     // Catch: java.lang.Throwable -> L4d
        L55:
            r5.a()     // Catch: java.lang.Throwable -> L59
            throw r1     // Catch: java.lang.Throwable -> L59
        L59:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public final void h() {
            r31 = this;
            r0 = r31
            ja4 r1 = r0.f0
            long[] r2 = r1.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            r6 = 255(0xff, double:1.26E-321)
            r8 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r11 = 8
            if (r3 < 0) goto L126
            r13 = 0
        L16:
            r14 = r2[r13]
            r16 = 128(0x80, double:6.3E-322)
            long r4 = ~r14
            long r4 = r4 << r8
            long r4 = r4 & r14
            long r4 = r4 & r9
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 == 0) goto L10e
            int r4 = r13 - r3
            int r4 = ~r4
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r5 = 0
        L2a:
            if (r5 >= r4) goto Lfe
            long r18 = r14 & r6
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 >= 0) goto Lde
            int r18 = r13 << 3
            r19 = r6
            int r6 = r18 + r5
            java.lang.Object[] r7 = r1.b
            r7 = r7[r6]
            java.lang.Object[] r7 = r1.c
            r7 = r7[r6]
            r18 = r8
            boolean r8 = r7 instanceof defpackage.ka4
            r21 = r9
            ja4 r9 = r0.Z
            if (r8 == 0) goto Lc0
            ka4 r7 = (defpackage.ka4) r7
            java.lang.Object[] r8 = r7.b
            long[] r10 = r7.a
            int r12 = r10.length
            int r12 = r12 + (-2)
            if (r12 < 0) goto Lb3
            r23 = r11
            r24 = r14
            r11 = 0
        L5a:
            r14 = r10[r11]
            r26 = r2
            r27 = r3
            long r2 = ~r14
            long r2 = r2 << r18
            long r2 = r2 & r14
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto La4
            int r2 = r11 - r12
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        L72:
            if (r3 >= r2) goto L9d
            long r28 = r14 & r19
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto L92
            int r28 = r11 << 3
            r29 = r3
            int r3 = r28 + r29
            r28 = r8[r3]
            r30 = r5
            r5 = r28
            ii1 r5 = (defpackage.ii1) r5
            boolean r5 = r9.c(r5)
            if (r5 != 0) goto L96
            r7.m(r3)
            goto L96
        L92:
            r29 = r3
            r30 = r5
        L96:
            long r14 = r14 >> r23
            int r3 = r29 + 1
            r5 = r30
            goto L72
        L9d:
            r30 = r5
            r3 = r23
            if (r2 != r3) goto Lbb
            goto La6
        La4:
            r30 = r5
        La6:
            if (r11 == r12) goto Lbb
            int r11 = r11 + 1
            r2 = r26
            r3 = r27
            r5 = r30
            r23 = 8
            goto L5a
        Lb3:
            r26 = r2
            r27 = r3
            r30 = r5
            r24 = r14
        Lbb:
            boolean r2 = r7.g()
            goto Ld6
        Lc0:
            r26 = r2
            r27 = r3
            r30 = r5
            r24 = r14
            r7.getClass()
            ii1 r7 = (defpackage.ii1) r7
            boolean r2 = r9.c(r7)
            if (r2 != 0) goto Ld5
            r2 = 1
            goto Ld6
        Ld5:
            r2 = 0
        Ld6:
            if (r2 == 0) goto Ldb
            r1.l(r6)
        Ldb:
            r3 = 8
            goto Led
        Lde:
            r26 = r2
            r27 = r3
            r30 = r5
            r19 = r6
            r18 = r8
            r21 = r9
            r24 = r14
            r3 = r11
        Led:
            long r14 = r24 >> r3
            int r5 = r30 + 1
            r11 = r3
            r8 = r18
            r6 = r19
            r9 = r21
            r2 = r26
            r3 = r27
            goto L2a
        Lfe:
            r26 = r2
            r27 = r3
            r19 = r6
            r18 = r8
            r21 = r9
            r3 = r11
            if (r4 != r3) goto L12e
            r3 = r27
            goto L116
        L10e:
            r26 = r2
            r19 = r6
            r18 = r8
            r21 = r9
        L116:
            if (r13 == r3) goto L12e
            int r13 = r13 + 1
            r8 = r18
            r6 = r19
            r9 = r21
            r2 = r26
            r11 = 8
            goto L16
        L126:
            r19 = r6
            r18 = r8
            r21 = r9
            r16 = 128(0x80, double:6.3E-322)
        L12e:
            ka4 r0 = r0.e0
            boolean r1 = r0.h()
            if (r1 == 0) goto L17f
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L17f
            r4 = 0
        L140:
            r5 = r2[r4]
            long r7 = ~r5
            long r7 = r7 << r18
            long r7 = r7 & r5
            long r7 = r7 & r21
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L178
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r23 = 8
            int r11 = 8 - r7
            r7 = 0
        L156:
            if (r7 >= r11) goto L173
            long r8 = r5 & r19
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L16d
            int r8 = r4 << 3
            int r8 = r8 + r7
            r9 = r1[r8]
            cf5 r9 = (defpackage.cf5) r9
            ja4 r9 = r9.g
            if (r9 == 0) goto L16a
            goto L16d
        L16a:
            r0.m(r8)
        L16d:
            r8 = 8
            long r5 = r5 >> r8
            int r7 = r7 + 1
            goto L156
        L173:
            r8 = 8
            if (r11 != r8) goto L17f
            goto L17a
        L178:
            r8 = 8
        L17a:
            if (r4 == r3) goto L17f
            int r4 = r4 + 1
            goto L140
        L17f:
            return
    }

    public final boolean i() {
            r4 = this;
            java.lang.Object r0 = r4.R
            monitor-enter(r0)
            int r1 = r4.s0     // Catch: java.lang.Throwable -> L10
            r2 = 0
            r3 = 1
            if (r1 != r3) goto La
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r3 == 0) goto L12
            r4.s0 = r2     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r4 = move-exception
            goto L14
        L12:
            monitor-exit(r0)
            return r3
        L14:
            monitor-exit(r0)
            throw r4
    }

    public final void j(defpackage.eo2 r6) {
            r5 = this;
            java.lang.Object r0 = r5.R     // Catch: java.lang.Throwable -> L2b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L2b
            r5.n()     // Catch: java.lang.Throwable -> L35
            ja4 r1 = r5.j0     // Catch: java.lang.Throwable -> L35
            ja4 r2 = defpackage.mp2.q()     // Catch: java.lang.Throwable -> L35
            r5.j0 = r2     // Catch: java.lang.Throwable -> L35
            xq2 r2 = r5.r0     // Catch: java.lang.Throwable -> L31
            kh6 r3 = r5.l0     // Catch: java.lang.Throwable -> L31
            rl0 r4 = r2.e     // Catch: java.lang.Throwable -> L31
            co4 r4 = r4.m     // Catch: java.lang.Throwable -> L31
            boolean r4 = r4.g0()     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L21
            java.lang.String r4 = "Expected applyChanges() to have been called"
            defpackage.tx0.a(r4)     // Catch: java.lang.Throwable -> L31
        L21:
            r2.P = r3     // Catch: java.lang.Throwable -> L31
            r3 = 0
            r2.n(r1, r6)     // Catch: java.lang.Throwable -> L2d
            r2.P = r3     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r6 = move-exception
            goto L38
        L2d:
            r6 = move-exception
            r2.P = r3     // Catch: java.lang.Throwable -> L31
            throw r6     // Catch: java.lang.Throwable -> L31
        L31:
            r6 = move-exception
            r5.j0 = r1     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L35:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6     // Catch: java.lang.Throwable -> L2b
        L38:
            ma4 r0 = r5.X     // Catch: java.lang.Throwable -> L56
            ka4 r0 = r0.A     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.g()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L5d
            jb1 r0 = r5.q0     // Catch: java.lang.Throwable -> L56
            ma4 r1 = r5.X     // Catch: java.lang.Throwable -> L56
            xq2 r2 = r5.r0     // Catch: java.lang.Throwable -> L56
            cy0 r2 = r2.C()     // Catch: java.lang.Throwable -> L56
            r0.g(r1, r2)     // Catch: java.lang.Throwable -> L58
            r0.b()     // Catch: java.lang.Throwable -> L58
            r0.a()     // Catch: java.lang.Throwable -> L56
            goto L5d
        L56:
            r6 = move-exception
            goto L5e
        L58:
            r6 = move-exception
            r0.a()     // Catch: java.lang.Throwable -> L56
            throw r6     // Catch: java.lang.Throwable -> L56
        L5d:
            throw r6     // Catch: java.lang.Throwable -> L56
        L5e:
            r5.a()
            throw r6
    }

    public final defpackage.tu4 k(boolean r11, defpackage.eo2 r12) {
            r10 = this;
            tu4 r0 = r10.m0
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "A pausable composition is in progress"
            defpackage.r05.b(r0)
        La:
            tu4 r1 = new tu4
            zx0 r3 = r10.A
            xq2 r4 = r10.r0
            ma4 r5 = r10.X
            cg7 r8 = r10.B
            java.lang.Object r9 = r10.R
            r2 = r10
            r7 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r2.m0 = r1
            return r1
    }

    public final void l() {
            r9 = this;
            java.lang.Object r0 = r9.R
            monitor-enter(r0)
            tu4 r1 = r9.m0     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L8
            goto Ld
        L8:
            java.lang.String r1 = "Deactivate is not supported while pausable composition is in progress"
            defpackage.r05.b(r1)     // Catch: java.lang.Throwable -> L25
        Ld:
            mk6 r1 = r9.Y     // Catch: java.lang.Throwable -> L25
            int r1 = r1.B     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 == 0) goto L28
            ma4 r4 = r9.X     // Catch: java.lang.Throwable -> L25
            ka4 r4 = r4.A     // Catch: java.lang.Throwable -> L25
            boolean r4 = r4.g()     // Catch: java.lang.Throwable -> L25
            if (r4 != 0) goto L6c
            goto L28
        L25:
            r9 = move-exception
            goto Lad
        L28:
            java.lang.String r4 = "Compose:deactivate"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L25
            jb1 r4 = r9.q0     // Catch: java.lang.Throwable -> La3
            ma4 r5 = r9.X     // Catch: java.lang.Throwable -> La3
            xq2 r6 = r9.r0     // Catch: java.lang.Throwable -> La3
            cy0 r6 = r6.C()     // Catch: java.lang.Throwable -> La3
            r4.g(r5, r6)     // Catch: java.lang.Throwable -> L5c
            if (r1 != 0) goto L63
            mk6 r1 = r9.Y     // Catch: java.lang.Throwable -> L5c
            jb1 r5 = r9.q0     // Catch: java.lang.Throwable -> L5c
            pk6 r1 = r1.d()     // Catch: java.lang.Throwable -> L5c
            int r6 = r1.t     // Catch: java.lang.Throwable -> L5e
            ql1 r7 = new ql1     // Catch: java.lang.Throwable -> L5e
            r8 = 16
            r7.<init>(r8, r5, r1)     // Catch: java.lang.Throwable -> L5e
            r1.n(r6, r7)     // Catch: java.lang.Throwable -> L5e
            r1.e(r3)     // Catch: java.lang.Throwable -> L5c
            cg7 r1 = r9.B     // Catch: java.lang.Throwable -> L5c
            r1.l()     // Catch: java.lang.Throwable -> L5c
            r4.c()     // Catch: java.lang.Throwable -> L5c
            goto L63
        L5c:
            r9 = move-exception
            goto La5
        L5e:
            r9 = move-exception
            r1.e(r2)     // Catch: java.lang.Throwable -> L5c
            throw r9     // Catch: java.lang.Throwable -> L5c
        L63:
            r4.b()     // Catch: java.lang.Throwable -> L5c
            r4.a()     // Catch: java.lang.Throwable -> La3
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L25
        L6c:
            ja4 r1 = r9.Z     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            ja4 r1 = r9.f0     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            ja4 r1 = r9.j0     // Catch: java.lang.Throwable -> L25
            r1.a()     // Catch: java.lang.Throwable -> L25
            rl0 r1 = r9.g0     // Catch: java.lang.Throwable -> L25
            co4 r1 = r1.m     // Catch: java.lang.Throwable -> L25
            r1.e0()     // Catch: java.lang.Throwable -> L25
            rl0 r1 = r9.h0     // Catch: java.lang.Throwable -> L25
            co4 r1 = r1.m     // Catch: java.lang.Throwable -> L25
            r1.e0()     // Catch: java.lang.Throwable -> L25
            xq2 r1 = r9.r0     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r2 = r1.E     // Catch: java.lang.Throwable -> L25
            r2.clear()     // Catch: java.lang.Throwable -> L25
            java.util.ArrayList r2 = r1.s     // Catch: java.lang.Throwable -> L25
            r2.clear()     // Catch: java.lang.Throwable -> L25
            rl0 r2 = r1.e     // Catch: java.lang.Throwable -> L25
            co4 r2 = r2.m     // Catch: java.lang.Throwable -> L25
            r2.e0()     // Catch: java.lang.Throwable -> L25
            r2 = 0
            r1.v = r2     // Catch: java.lang.Throwable -> L25
            r9.s0 = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)
            return
        La3:
            r9 = move-exception
            goto La9
        La5:
            r4.a()     // Catch: java.lang.Throwable -> La3
            throw r9     // Catch: java.lang.Throwable -> La3
        La9:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        Lad:
            monitor-exit(r0)
            throw r9
    }

    public final void m() {
            r9 = this;
            java.lang.Object r0 = r9.R
            monitor-enter(r0)
            xq2 r1 = r9.r0     // Catch: java.lang.Throwable -> Lf
            boolean r1 = r1.F     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L12
            java.lang.String r1 = "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."
            defpackage.r05.b(r1)     // Catch: java.lang.Throwable -> Lf
            goto L12
        Lf:
            r9 = move-exception
            goto Lb8
        L12:
            int r1 = r9.s0     // Catch: java.lang.Throwable -> Lf
            r2 = 3
            if (r1 == r2) goto Lb1
            r9.s0 = r2     // Catch: java.lang.Throwable -> Lf
            xq2 r1 = r9.r0     // Catch: java.lang.Throwable -> Lf
            rl0 r1 = r1.L     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L22
            r9.e(r1)     // Catch: java.lang.Throwable -> Lf
        L22:
            mk6 r1 = r9.Y     // Catch: java.lang.Throwable -> Lf
            int r1 = r1.B     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2c
            r1 = r3
            goto L2d
        L2c:
            r1 = r2
        L2d:
            if (r1 == 0) goto L39
            ma4 r4 = r9.X     // Catch: java.lang.Throwable -> Lf
            ka4 r4 = r4.A     // Catch: java.lang.Throwable -> Lf
            boolean r4 = r4.g()     // Catch: java.lang.Throwable -> Lf
            if (r4 != 0) goto L7c
        L39:
            jb1 r4 = r9.q0     // Catch: java.lang.Throwable -> Lf
            ma4 r5 = r9.X     // Catch: java.lang.Throwable -> Lf
            xq2 r6 = r9.r0     // Catch: java.lang.Throwable -> Lf
            cy0 r6 = r6.C()     // Catch: java.lang.Throwable -> Lf
            r4.g(r5, r6)     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L76
            mk6 r1 = r9.Y     // Catch: java.lang.Throwable -> L6f
            jb1 r5 = r9.q0     // Catch: java.lang.Throwable -> L6f
            pk6 r1 = r1.d()     // Catch: java.lang.Throwable -> L6f
            int r6 = r1.t     // Catch: java.lang.Throwable -> L71
            z5 r7 = new z5     // Catch: java.lang.Throwable -> L71
            r8 = 5
            r7.<init>(r5, r8)     // Catch: java.lang.Throwable -> L71
            r1.n(r6, r7)     // Catch: java.lang.Throwable -> L71
            r1.H()     // Catch: java.lang.Throwable -> L71
            r1.e(r3)     // Catch: java.lang.Throwable -> L6f
            cg7 r1 = r9.B     // Catch: java.lang.Throwable -> L6f
            r1.a()     // Catch: java.lang.Throwable -> L6f
            cg7 r1 = r9.B     // Catch: java.lang.Throwable -> L6f
            r1.l()     // Catch: java.lang.Throwable -> L6f
            r4.c()     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r9 = move-exception
            goto Lad
        L71:
            r9 = move-exception
            r1.e(r2)     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L6f
        L76:
            r4.b()     // Catch: java.lang.Throwable -> L6f
            r4.a()     // Catch: java.lang.Throwable -> Lf
        L7c:
            xq2 r1 = r9.r0     // Catch: java.lang.Throwable -> Lf
            r1.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "Compose:Composer.dispose"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> Lf
            zx0 r2 = r1.b     // Catch: java.lang.Throwable -> La8
            r2.u(r1)     // Catch: java.lang.Throwable -> La8
            java.util.ArrayList r2 = r1.E     // Catch: java.lang.Throwable -> La8
            r2.clear()     // Catch: java.lang.Throwable -> La8
            java.util.ArrayList r2 = r1.s     // Catch: java.lang.Throwable -> La8
            r2.clear()     // Catch: java.lang.Throwable -> La8
            rl0 r2 = r1.e     // Catch: java.lang.Throwable -> La8
            co4 r2 = r2.m     // Catch: java.lang.Throwable -> La8
            r2.e0()     // Catch: java.lang.Throwable -> La8
            r2 = 0
            r1.v = r2     // Catch: java.lang.Throwable -> La8
            cg7 r1 = r1.a     // Catch: java.lang.Throwable -> La8
            r1.a()     // Catch: java.lang.Throwable -> La8
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lf
            goto Lb1
        La8:
            r9 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lf
            throw r9     // Catch: java.lang.Throwable -> Lf
        Lad:
            r4.a()     // Catch: java.lang.Throwable -> Lf
            throw r9     // Catch: java.lang.Throwable -> Lf
        Lb1:
            monitor-exit(r0)
            zx0 r0 = r9.A
            r0.v(r9)
            return
        Lb8:
            monitor-exit(r0)
            throw r9
    }

    public final void n() {
            r5 = this;
            java.lang.Object r0 = defpackage.nb3.k
            java.util.concurrent.atomic.AtomicReference r1 = r5.L
            java.lang.Object r2 = r1.getAndSet(r0)
            if (r2 == 0) goto L4a
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L42
            boolean r0 = r2 instanceof java.util.Set
            r3 = 1
            if (r0 == 0) goto L1b
            java.util.Set r2 = (java.util.Set) r2
            r5.b(r2, r3)
            return
        L1b:
            boolean r0 = r2 instanceof java.lang.Object[]
            if (r0 == 0) goto L2d
            java.util.Set[] r2 = (java.util.Set[]) r2
            int r0 = r2.length
            r1 = 0
        L23:
            if (r1 >= r0) goto L4a
            r4 = r2[r1]
            r5.b(r4, r3)
            int r1 = r1 + 1
            goto L23
        L2d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "corrupt pendingModifications drain: "
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            defpackage.tx0.b(r5)
            defpackage.e41.c()
            return
        L42:
            java.lang.String r5 = "pending composition has not been applied"
            defpackage.tx0.b(r5)
            defpackage.e41.c()
        L4a:
            return
    }

    public final void o() {
            r5 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r1 = r5.L
            java.lang.Object r0 = r1.getAndSet(r0)
            java.lang.Object r2 = defpackage.nb3.k
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 != 0) goto L4c
            boolean r2 = r0 instanceof java.util.Set
            r3 = 0
            if (r2 == 0) goto L1a
            java.util.Set r0 = (java.util.Set) r0
            r5.b(r0, r3)
            return
        L1a:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L2c
            java.util.Set[] r0 = (java.util.Set[]) r0
            int r1 = r0.length
            r2 = r3
        L22:
            if (r2 >= r1) goto L4c
            r4 = r0[r2]
            r5.b(r4, r3)
            int r2 = r2 + 1
            goto L22
        L2c:
            if (r0 != 0) goto L38
            tu4 r5 = r5.m0
            if (r5 != 0) goto L4c
            java.lang.String r5 = "calling recordModificationsOf and applyChanges concurrently is not supported"
            defpackage.tx0.a(r5)
            return
        L38:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "corrupt pendingModifications drain: "
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            defpackage.tx0.b(r5)
            defpackage.e41.c()
        L4c:
            return
    }

    public final void p() {
            r5 = this;
            du1 r0 = defpackage.du1.A
            java.util.concurrent.atomic.AtomicReference r1 = r5.L
            java.lang.Object r0 = r1.getAndSet(r0)
            java.lang.Object r2 = defpackage.nb3.k
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 != 0) goto L44
            if (r0 != 0) goto L13
            goto L44
        L13:
            boolean r2 = r0 instanceof java.util.Set
            r3 = 0
            if (r2 == 0) goto L1e
            java.util.Set r0 = (java.util.Set) r0
            r5.b(r0, r3)
            return
        L1e:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L30
            java.util.Set[] r0 = (java.util.Set[]) r0
            int r1 = r0.length
            r2 = r3
        L26:
            if (r2 >= r1) goto L44
            r4 = r0[r2]
            r5.b(r4, r3)
            int r2 = r2 + 1
            goto L26
        L30:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "corrupt pendingModifications drain: "
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            defpackage.tx0.b(r5)
            defpackage.e41.c()
        L44:
            return
    }

    public final void q() {
            r2 = this;
            int r0 = r2.s0
            if (r0 != 0) goto L5
            goto L1c
        L5:
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 3
            if (r0 == r1) goto L11
            java.lang.String r0 = ""
            goto L19
        L11:
            java.lang.String r0 = "The composition is disposed"
            goto L19
        L14:
            java.lang.String r0 = "A previous pausable composition for this composition was cancelled. This composition must be disposed."
            goto L19
        L17:
            java.lang.String r0 = "The composition should be activated before setting content."
        L19:
            defpackage.r05.b(r0)
        L1c:
            tu4 r2 = r2.m0
            if (r2 != 0) goto L21
            return
        L21:
            java.lang.String r2 = "A pausable composition is in progress"
            defpackage.r05.b(r2)
            return
    }

    public final void r(java.util.ArrayList r4) {
            r3 = this;
            ma4 r0 = r3.X
            xq2 r1 = r3.r0
            int r2 = r4.size()
            if (r2 <= 0) goto L1d
            r2 = 0
            java.lang.Object r2 = r4.get(r2)
            vr4 r2 = (defpackage.vr4) r2
            java.lang.Object r2 = r2.A
            o84 r2 = (defpackage.o84) r2
            r2.getClass()
            java.lang.String r2 = "Check failed"
            defpackage.tx0.a(r2)
        L1d:
            r1.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "Compose:insertMovableContent"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L3a
            r1.F(r4)     // Catch: java.lang.Throwable -> L31
            r1.i()     // Catch: java.lang.Throwable -> L2f
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L3a
            return
        L2f:
            r4 = move-exception
            goto L36
        L31:
            r4 = move-exception
            r1.a()     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L36:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L3a
            throw r4     // Catch: java.lang.Throwable -> L3a
        L3a:
            r4 = move-exception
            ka4 r2 = r0.A     // Catch: java.lang.Throwable -> L53
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L53
            if (r2 != 0) goto L5a
            jb1 r2 = r3.q0     // Catch: java.lang.Throwable -> L53
            cy0 r1 = r1.C()     // Catch: java.lang.Throwable -> L53
            r2.g(r0, r1)     // Catch: java.lang.Throwable -> L55
            r2.b()     // Catch: java.lang.Throwable -> L55
            r2.a()     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r4 = move-exception
            goto L5b
        L55:
            r4 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> L53
            throw r4     // Catch: java.lang.Throwable -> L53
        L5a:
            throw r4     // Catch: java.lang.Throwable -> L53
        L5b:
            r3.a()
            throw r4
    }

    public final defpackage.yb3 s(defpackage.cf5 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r4.b
            r1 = r0 & 2
            if (r1 == 0) goto La
            r0 = r0 | 4
            r4.b = r0
        La:
            sq2 r0 = r4.c
            if (r0 == 0) goto L5b
            boolean r1 = r0.a()
            if (r1 != 0) goto L15
            goto L5b
        L15:
            mk6 r1 = r3.Y
            r1.getClass()
            sq2 r2 = r4.c
            if (r2 == 0) goto L3e
            sq2 r2 = defpackage.yh2.k(r2)
            boolean r1 = r1.f(r2)
            r2 = 1
            if (r1 != r2) goto L3e
            eo2 r1 = r4.d
            if (r1 == 0) goto L3b
            yb3 r4 = r3.t(r4, r0, r5)
            yb3 r5 = defpackage.yb3.IGNORED
            if (r4 == r5) goto L3a
            os0 r3 = r3.p0
            r3.S()
        L3a:
            return r4
        L3b:
            yb3 r3 = defpackage.yb3.IGNORED
            return r3
        L3e:
            java.lang.Object r0 = r3.R
            monitor-enter(r0)
            ey0 r3 = r3.n0     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)
            if (r3 == 0) goto L55
            xq2 r3 = r3.r0
            boolean r0 = r3.F
            if (r0 == 0) goto L55
            boolean r3 = r3.h0(r4, r5)
            if (r3 == 0) goto L55
            yb3 r3 = defpackage.yb3.IMMINENT
            return r3
        L55:
            yb3 r3 = defpackage.yb3.IGNORED
            return r3
        L58:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L5b:
            yb3 r3 = defpackage.yb3.IGNORED
            return r3
    }

    public final defpackage.yb3 t(defpackage.cf5 r20, defpackage.sq2 r21, java.lang.Object r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            java.lang.Object r3 = r0.R
            monitor-enter(r3)
            ey0 r4 = r0.n0     // Catch: java.lang.Throwable -> L44
            r5 = 0
            if (r4 == 0) goto L47
            mk6 r6 = r0.Y     // Catch: java.lang.Throwable -> L44
            int r7 = r0.o0     // Catch: java.lang.Throwable -> L44
            boolean r8 = r6.Z     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L1b
            java.lang.String r8 = "Writer is active"
            defpackage.tx0.a(r8)     // Catch: java.lang.Throwable -> L44
        L1b:
            if (r7 < 0) goto L22
            int r8 = r6.B     // Catch: java.lang.Throwable -> L44
            if (r7 >= r8) goto L22
            goto L27
        L22:
            java.lang.String r8 = "Invalid group index"
            defpackage.tx0.a(r8)     // Catch: java.lang.Throwable -> L44
        L27:
            sq2 r8 = defpackage.yh2.k(r21)     // Catch: java.lang.Throwable -> L44
            boolean r9 = r6.f(r8)     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L41
            int[] r6 = r6.A     // Catch: java.lang.Throwable -> L44
            int r9 = r7 * 5
            int r9 = r9 + 3
            r6 = r6[r9]     // Catch: java.lang.Throwable -> L44
            int r6 = r6 + r7
            int r8 = r8.a     // Catch: java.lang.Throwable -> L44
            if (r7 > r8) goto L41
            if (r8 >= r6) goto L41
            goto L42
        L41:
            r4 = r5
        L42:
            r5 = r4
            goto L47
        L44:
            r0 = move-exception
            goto Le9
        L47:
            if (r5 != 0) goto Lce
            xq2 r4 = r0.r0     // Catch: java.lang.Throwable -> L44
            boolean r6 = r4.F     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L57
            boolean r4 = r4.h0(r1, r2)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L5e
            yb3 r0 = defpackage.yb3.IMMINENT     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)
            return r0
        L5e:
            if (r2 != 0) goto L68
            ja4 r4 = r0.j0     // Catch: java.lang.Throwable -> L44
            d90 r6 = defpackage.d90.C0     // Catch: java.lang.Throwable -> L44
            r4.m(r1, r6)     // Catch: java.lang.Throwable -> L44
            goto Lce
        L68:
            boolean r4 = r2 instanceof defpackage.ii1     // Catch: java.lang.Throwable -> L44
            ja4 r6 = r0.j0
            if (r4 != 0) goto L74
            d90 r4 = defpackage.d90.C0     // Catch: java.lang.Throwable -> L44
            r6.m(r1, r4)     // Catch: java.lang.Throwable -> L44
            goto Lce
        L74:
            java.lang.Object r4 = r6.g(r1)     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto Lc9
            boolean r6 = r4 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto Lc4
            ka4 r4 = (defpackage.ka4) r4     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r6 = r4.b     // Catch: java.lang.Throwable -> L44
            long[] r4 = r4.a     // Catch: java.lang.Throwable -> L44
            int r8 = r4.length     // Catch: java.lang.Throwable -> L44
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lc9
            r9 = 0
        L8a:
            r10 = r4[r9]     // Catch: java.lang.Throwable -> L44
            long r12 = ~r10     // Catch: java.lang.Throwable -> L44
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto Lbf
            int r12 = r9 - r8
            int r12 = ~r12     // Catch: java.lang.Throwable -> L44
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        La4:
            if (r14 >= r12) goto Lbd
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto Lb9
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r6[r15]     // Catch: java.lang.Throwable -> L44
            d90 r7 = defpackage.d90.C0     // Catch: java.lang.Throwable -> L44
            if (r15 != r7) goto Lb9
            goto Lce
        Lb9:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto La4
        Lbd:
            if (r12 != r13) goto Lc9
        Lbf:
            if (r9 == r8) goto Lc9
            int r9 = r9 + 1
            goto L8a
        Lc4:
            d90 r6 = defpackage.d90.C0     // Catch: java.lang.Throwable -> L44
            if (r4 != r6) goto Lc9
            goto Lce
        Lc9:
            ja4 r4 = r0.j0     // Catch: java.lang.Throwable -> L44
            defpackage.mp2.g(r4, r1, r2)     // Catch: java.lang.Throwable -> L44
        Lce:
            monitor-exit(r3)
            if (r5 == 0) goto Ld8
            r3 = r21
            yb3 r0 = r5.t(r1, r3, r2)
            return r0
        Ld8:
            zx0 r1 = r0.A
            r1.l(r0)
            xq2 r0 = r0.r0
            boolean r0 = r0.F
            if (r0 == 0) goto Le6
            yb3 r0 = defpackage.yb3.DEFERRED
            return r0
        Le6:
            yb3 r0 = defpackage.yb3.SCHEDULED
            return r0
        Le9:
            monitor-exit(r3)
            throw r0
    }

    public final void u(java.lang.Object r15) {
            r14 = this;
            ja4 r0 = r14.Z
            java.lang.Object r0 = r0.g(r15)
            if (r0 == 0) goto L6a
            boolean r1 = r0 instanceof defpackage.ka4
            ja4 r14 = r14.i0
            if (r1 == 0) goto L5d
            ka4 r0 = (defpackage.ka4) r0
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L6a
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L58
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L56
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L52
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            cf5 r10 = (defpackage.cf5) r10
            yb3 r11 = r10.b(r15)
            yb3 r12 = defpackage.yb3.IMMINENT
            if (r11 != r12) goto L52
            defpackage.mp2.g(r14, r15, r10)
        L52:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L56:
            if (r7 != r8) goto L6a
        L58:
            if (r4 == r2) goto L6a
            int r4 = r4 + 1
            goto L1b
        L5d:
            cf5 r0 = (defpackage.cf5) r0
            yb3 r1 = r0.b(r15)
            yb3 r2 = defpackage.yb3.IMMINENT
            if (r1 != r2) goto L6a
            defpackage.mp2.g(r14, r15, r0)
        L6a:
            return
    }

    public final boolean v(java.util.Set r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof defpackage.d66
            ja4 r3 = r0.f0
            ja4 r0 = r0.Z
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            d66 r1 = (defpackage.d66) r1
            ka4 r1 = r1.A
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
    }

    public final boolean w() {
            r7 = this;
            java.lang.Object r0 = r7.R
            monitor-enter(r0)
            tu4 r1 = r7.m0     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r1 == 0) goto L3e
            java.util.concurrent.atomic.AtomicReference r3 = r1.h     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L3b
            vu4 r4 = defpackage.vu4.Recomposing     // Catch: java.lang.Throwable -> L3b
            if (r3 != r4) goto L1d
            long r3 = r1.i     // Catch: java.lang.Throwable -> L3b
            long r5 = defpackage.kj2.s()     // Catch: java.lang.Throwable -> L3b
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1d
            goto L3e
        L1d:
            java.util.concurrent.atomic.AtomicReference r7 = r1.h     // Catch: java.lang.Throwable -> L3b
            vu4 r3 = defpackage.vu4.ApplyPending     // Catch: java.lang.Throwable -> L3b
            vu4 r4 = defpackage.vu4.RecomposePending     // Catch: java.lang.Throwable -> L3b
        L23:
            boolean r5 = r7.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            java.lang.Object r5 = r7.get()     // Catch: java.lang.Throwable -> L3b
            if (r5 == r3) goto L23
        L30:
            jf5 r7 = r1.l     // Catch: java.lang.Throwable -> L3b
            o94 r7 = r7.A     // Catch: java.lang.Throwable -> L3b
            r1 = 9
            r7.a(r1)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            return r2
        L3b:
            r7 = move-exception
            goto Lb3
        L3e:
            r7.n()     // Catch: java.lang.Throwable -> L3b
            ja4 r1 = r7.j0     // Catch: java.lang.Throwable -> L88
            ja4 r3 = defpackage.mp2.q()     // Catch: java.lang.Throwable -> L88
            r7.j0 = r3     // Catch: java.lang.Throwable -> L88
            xq2 r3 = r7.r0     // Catch: java.lang.Throwable -> L7d
            kh6 r4 = r7.l0     // Catch: java.lang.Throwable -> L7d
            rl0 r5 = r3.e     // Catch: java.lang.Throwable -> L7d
            co4 r5 = r5.m     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r5.g0()     // Catch: java.lang.Throwable -> L7d
            if (r6 != 0) goto L5c
            java.lang.String r6 = "Expected applyChanges() to have been called"
            defpackage.tx0.a(r6)     // Catch: java.lang.Throwable -> L7d
        L5c:
            int r6 = r1.e     // Catch: java.lang.Throwable -> L7d
            if (r6 > 0) goto L69
            java.util.ArrayList r6 = r3.s     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L69
            goto L77
        L69:
            r3.P = r4     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            r3.n(r1, r2)     // Catch: java.lang.Throwable -> L81
            r3.P = r2     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r5.g0()     // Catch: java.lang.Throwable -> L7d
            r2 = r2 ^ 1
        L77:
            if (r2 != 0) goto L7f
            r7.o()     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r2 = move-exception
            goto L85
        L7f:
            monitor-exit(r0)
            return r2
        L81:
            r4 = move-exception
            r3.P = r2     // Catch: java.lang.Throwable -> L7d
            throw r4     // Catch: java.lang.Throwable -> L7d
        L85:
            r7.j0 = r1     // Catch: java.lang.Throwable -> L88
            throw r2     // Catch: java.lang.Throwable -> L88
        L88:
            r1 = move-exception
            ma4 r2 = r7.X     // Catch: java.lang.Throwable -> La7
            ka4 r2 = r2.A     // Catch: java.lang.Throwable -> La7
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> La7
            if (r2 != 0) goto Lae
            jb1 r2 = r7.q0     // Catch: java.lang.Throwable -> La7
            ma4 r3 = r7.X     // Catch: java.lang.Throwable -> La7
            xq2 r4 = r7.r0     // Catch: java.lang.Throwable -> La7
            cy0 r4 = r4.C()     // Catch: java.lang.Throwable -> La7
            r2.g(r3, r4)     // Catch: java.lang.Throwable -> La9
            r2.b()     // Catch: java.lang.Throwable -> La9
            r2.a()     // Catch: java.lang.Throwable -> La7
            goto Lae
        La7:
            r1 = move-exception
            goto Laf
        La9:
            r1 = move-exception
            r2.a()     // Catch: java.lang.Throwable -> La7
            throw r1     // Catch: java.lang.Throwable -> La7
        Lae:
            throw r1     // Catch: java.lang.Throwable -> La7
        Laf:
            r7.a()     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L3b
        Lb3:
            monitor-exit(r0)
            throw r7
    }

    public final void x(defpackage.d66 r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r4.L
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L38
            java.lang.Object r1 = defpackage.nb3.k
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L38
        L11:
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L1f
            r1 = 2
            java.util.Set[] r1 = new java.util.Set[r1]
            r2 = 0
            r1[r2] = r0
            r2 = 1
            r1[r2] = r5
            goto L39
        L1f:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L30
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            int r2 = r1.length
            int r3 = r2 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r1[r2] = r5
            goto L39
        L30:
            java.lang.String r5 = "corrupt pendingModifications: "
            java.util.concurrent.atomic.AtomicReference r4 = r4.L
            defpackage.u34.B(r4, r5)
            return
        L38:
            r1 = r5
        L39:
            java.util.concurrent.atomic.AtomicReference r2 = r4.L
        L3b:
            boolean r3 = r2.compareAndSet(r0, r1)
            if (r3 == 0) goto L4f
            if (r0 != 0) goto L4e
            java.lang.Object r5 = r4.R
            monitor-enter(r5)
            r4.o()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)
            return
        L4b:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L4e:
            return
        L4f:
            java.lang.Object r3 = r2.get()
            if (r3 == r0) goto L3b
            goto L0
    }

    public final void y(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            xq2 r2 = r0.r0
            int r3 = r2.A
            if (r3 <= 0) goto Lc
            goto Ld8
        Lc:
            cf5 r2 = r2.A()
            if (r2 == 0) goto Ld8
            int r3 = r2.b
            r4 = 1
            r3 = r3 | r4
            r2.b = r3
            r3 = r3 & 32
            if (r3 == 0) goto L1e
        L1c:
            r3 = 0
            goto L45
        L1e:
            y94 r3 = r2.f
            if (r3 != 0) goto L29
            y94 r3 = new y94
            r3.<init>()
            r2.f = r3
        L29:
            int r6 = r2.e
            int r7 = r3.c(r1)
            if (r7 >= 0) goto L34
            int r7 = ~r7
            r8 = -1
            goto L38
        L34:
            int[] r8 = r3.c
            r8 = r8[r7]
        L38:
            java.lang.Object[] r9 = r3.b
            r9[r7] = r1
            int[] r3 = r3.c
            r3[r7] = r6
            int r3 = r2.e
            if (r8 != r3) goto L1c
            r3 = r4
        L45:
            os0 r6 = r0.p0
            r6.S()
            if (r3 != 0) goto Ld8
            boolean r3 = r1 instanceof defpackage.fq6
            if (r3 == 0) goto L56
            r3 = r1
            fq6 r3 = (defpackage.fq6) r3
            r3.g(r4)
        L56:
            ja4 r3 = r0.Z
            defpackage.mp2.g(r3, r1, r2)
            boolean r3 = r1 instanceof defpackage.ii1
            if (r3 == 0) goto Ld8
            r3 = r1
            ii1 r3 = (defpackage.ii1) r3
            hi1 r6 = r3.i()
            ja4 r0 = r0.f0
            defpackage.mp2.W(r0, r1)
            y94 r7 = r6.e
            java.lang.Object[] r8 = r7.b
            long[] r7 = r7.a
            int r9 = r7.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lc8
            r10 = 0
        L77:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Lc3
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L91:
            if (r15 >= r13) goto Lc0
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto Lb7
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r8[r16]
            r5 = r16
            eq6 r5 = (defpackage.eq6) r5
            r20 = r14
            boolean r14 = r5 instanceof defpackage.fq6
            if (r14 == 0) goto Lb3
            r14 = r5
            fq6 r14 = (defpackage.fq6) r14
            r14.g(r4)
        Lb3:
            defpackage.mp2.g(r0, r5, r1)
            goto Lb9
        Lb7:
            r20 = r14
        Lb9:
            long r11 = r11 >> r20
            int r15 = r15 + 1
            r14 = r20
            goto L91
        Lc0:
            r5 = r14
            if (r13 != r5) goto Lc8
        Lc3:
            if (r10 == r9) goto Lc8
            int r10 = r10 + 1
            goto L77
        Lc8:
            java.lang.Object r0 = r6.f
            ja4 r1 = r2.g
            if (r1 != 0) goto Ld5
            ja4 r1 = new ja4
            r1.<init>()
            r2.g = r1
        Ld5:
            r1.m(r3, r0)
        Ld8:
            return
    }

    public final void z(java.lang.Object r15) {
            r14 = this;
            java.lang.Object r0 = r14.R
            monitor-enter(r0)
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
            ja4 r1 = r14.f0     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof defpackage.ka4     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            ka4 r15 = (defpackage.ka4) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            ii1 r10 = (defpackage.ii1) r10     // Catch: java.lang.Throwable -> L4f
            r14.u(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            ii1 r15 = (defpackage.ii1) r15     // Catch: java.lang.Throwable -> L4f
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
    }
}
