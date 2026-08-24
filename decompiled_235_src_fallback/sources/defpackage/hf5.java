package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hf5  reason: default package */
/* loaded from: classes.dex */
public final class hf5 extends defpackage.hw6 implements defpackage.fo2 {
    public java.util.List X;
    public java.util.List Y;
    public java.util.List Z;
    public defpackage.ka4 d0;
    public defpackage.ka4 e0;
    public defpackage.ka4 f0;
    public java.util.Set g0;
    public defpackage.ka4 h0;
    public int i0;
    public /* synthetic */ defpackage.um j0;
    public final /* synthetic */ defpackage.if5 k0;

    public hf5(defpackage.if5 r1, defpackage.r41 r2) {
            r0 = this;
            r0.k0 = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    public static final void v(defpackage.if5 r22, java.util.List r23, java.util.List r24, java.util.List r25, defpackage.ka4 r26, defpackage.ka4 r27, defpackage.ka4 r28, defpackage.ka4 r29) {
            r0 = r22
            r1 = r26
            r2 = r27
            r3 = r29
            java.lang.Object r4 = r0.c
            monitor-enter(r4)
            r23.clear()     // Catch: java.lang.Throwable -> L29
            r24.clear()     // Catch: java.lang.Throwable -> L29
            int r5 = r25.size()     // Catch: java.lang.Throwable -> L29
            r7 = 0
        L16:
            if (r7 >= r5) goto L2c
            r8 = r25
            java.lang.Object r9 = r8.get(r7)     // Catch: java.lang.Throwable -> L29
            ey0 r9 = (defpackage.ey0) r9     // Catch: java.lang.Throwable -> L29
            r9.a()     // Catch: java.lang.Throwable -> L29
            r0.L(r9)     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + 1
            goto L16
        L29:
            r0 = move-exception
            goto L107
        L2c:
            r8 = r25
            r8.clear()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r5 = r1.b     // Catch: java.lang.Throwable -> L29
            long[] r7 = r1.a     // Catch: java.lang.Throwable -> L29
            int r8 = r7.length     // Catch: java.lang.Throwable -> L29
            int r8 = r8 + (-2)
            r6 = 8
            r24 = 128(0x80, double:6.3E-322)
            if (r8 < 0) goto L7a
            r9 = 0
            r16 = 255(0xff, double:1.26E-321)
        L41:
            r11 = r7[r9]     // Catch: java.lang.Throwable -> L29
            r10 = 7
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = ~r11     // Catch: java.lang.Throwable -> L29
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 == 0) goto L75
            int r13 = r9 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> L29
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        L5a:
            if (r14 >= r13) goto L73
            long r20 = r11 & r16
            int r15 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r15 >= 0) goto L6f
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]     // Catch: java.lang.Throwable -> L29
            ey0 r15 = (defpackage.ey0) r15     // Catch: java.lang.Throwable -> L29
            r15.a()     // Catch: java.lang.Throwable -> L29
            r0.L(r15)     // Catch: java.lang.Throwable -> L29
        L6f:
            long r11 = r11 >> r6
            int r14 = r14 + 1
            goto L5a
        L73:
            if (r13 != r6) goto L82
        L75:
            if (r9 == r8) goto L82
            int r9 = r9 + 1
            goto L41
        L7a:
            r10 = 7
            r16 = 255(0xff, double:1.26E-321)
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L82:
            r1.b()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r1 = r2.b     // Catch: java.lang.Throwable -> L29
            long[] r5 = r2.a     // Catch: java.lang.Throwable -> L29
            int r7 = r5.length     // Catch: java.lang.Throwable -> L29
            int r7 = r7 + (-2)
            if (r7 < 0) goto Lbf
            r8 = 0
        L8f:
            r11 = r5[r8]     // Catch: java.lang.Throwable -> L29
            long r13 = ~r11     // Catch: java.lang.Throwable -> L29
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r9 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r9 == 0) goto Lba
            int r9 = r8 - r7
            int r9 = ~r9     // Catch: java.lang.Throwable -> L29
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r13 = 0
        La2:
            if (r13 >= r9) goto Lb8
            long r14 = r11 & r16
            int r14 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r14 >= 0) goto Lb4
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r1[r14]     // Catch: java.lang.Throwable -> L29
            ey0 r14 = (defpackage.ey0) r14     // Catch: java.lang.Throwable -> L29
            r14.g()     // Catch: java.lang.Throwable -> L29
        Lb4:
            long r11 = r11 >> r6
            int r13 = r13 + 1
            goto La2
        Lb8:
            if (r9 != r6) goto Lbf
        Lba:
            if (r8 == r7) goto Lbf
            int r8 = r8 + 1
            goto L8f
        Lbf:
            r2.b()     // Catch: java.lang.Throwable -> L29
            r28.b()     // Catch: java.lang.Throwable -> L29
            java.lang.Object[] r1 = r3.b     // Catch: java.lang.Throwable -> L29
            long[] r2 = r3.a     // Catch: java.lang.Throwable -> L29
            int r5 = r2.length     // Catch: java.lang.Throwable -> L29
            int r5 = r5 + (-2)
            if (r5 < 0) goto L102
            r7 = 0
        Lcf:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L29
            long r11 = ~r8     // Catch: java.lang.Throwable -> L29
            long r11 = r11 << r10
            long r11 = r11 & r8
            long r11 = r11 & r18
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 == 0) goto Lfd
            int r11 = r7 - r5
            int r11 = ~r11     // Catch: java.lang.Throwable -> L29
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        Le2:
            if (r12 >= r11) goto Lfb
            long r13 = r8 & r16
            int r13 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r13 >= 0) goto Lf7
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r1[r13]     // Catch: java.lang.Throwable -> L29
            ey0 r13 = (defpackage.ey0) r13     // Catch: java.lang.Throwable -> L29
            r13.a()     // Catch: java.lang.Throwable -> L29
            r0.L(r13)     // Catch: java.lang.Throwable -> L29
        Lf7:
            long r8 = r8 >> r6
            int r12 = r12 + 1
            goto Le2
        Lfb:
            if (r11 != r6) goto L102
        Lfd:
            if (r7 == r5) goto L102
            int r7 = r7 + 1
            goto Lcf
        L102:
            r3.b()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r4)
            return
        L107:
            monitor-exit(r4)
            throw r0
    }

    public static final void x(java.util.List r5, defpackage.if5 r6) {
            r5.clear()
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            java.util.ArrayList r1 = r6.k     // Catch: java.lang.Throwable -> L1b
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
        Ld:
            if (r3 >= r2) goto L1d
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L1b
            o84 r4 = (defpackage.o84) r4     // Catch: java.lang.Throwable -> L1b
            r5.add(r4)     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + 1
            goto Ld
        L1b:
            r5 = move-exception
            goto L24
        L1d:
            java.util.ArrayList r5 = r6.k     // Catch: java.lang.Throwable -> L1b
            r5.clear()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)
            return
        L24:
            monitor-exit(r0)
            throw r5
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            um r2 = (defpackage.um) r2
            r41 r3 = (defpackage.r41) r3
            hf5 r1 = new hf5
            if5 r0 = r0.k0
            r1.<init>(r0, r3)
            r1.j0 = r2
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r0 = r1.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.i0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            ka4 r2 = r0.h0
            java.util.Set r6 = r0.g0
            java.util.Set r6 = (java.util.Set) r6
            ka4 r7 = r0.f0
            ka4 r8 = r0.e0
            ka4 r9 = r0.d0
            java.util.List r10 = r0.Z
            java.util.List r11 = r0.Y
            java.util.List r12 = r0.X
            um r13 = r0.j0
            defpackage.oi2.Y(r23)
            r21 = r13
            r13 = r2
            r2 = r21
            goto L12c
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r3
        L33:
            ka4 r2 = r0.h0
            java.util.Set r6 = r0.g0
            java.util.Set r6 = (java.util.Set) r6
            ka4 r7 = r0.f0
            ka4 r8 = r0.e0
            ka4 r9 = r0.d0
            java.util.List r10 = r0.Z
            java.util.List r11 = r0.Y
            java.util.List r12 = r0.X
            um r13 = r0.j0
            defpackage.oi2.Y(r23)
            r14 = r9
            r9 = r2
            r2 = r13
            r13 = r10
            r10 = r12
            r12 = r14
        L50:
            r15 = r6
            r14 = r8
            r8 = r7
            goto Lf5
        L55:
            defpackage.oi2.Y(r23)
            um r2 = r0.j0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            ka4 r9 = defpackage.c66.a
            ka4 r9 = new ka4
            r9.<init>()
            ka4 r10 = new ka4
            r10.<init>()
            ka4 r11 = new ka4
            r11.<init>()
            d66 r12 = new d66
            r12.<init>(r11)
            ka4 r13 = new ka4
            r13.<init>()
            r21 = r12
            r12 = r6
            r6 = r21
            r21 = r11
            r11 = r7
            r7 = r21
            r21 = r10
            r10 = r8
            r8 = r21
        L93:
            if5 r14 = r0.k0
            java.lang.Object r14 = r14.c
            monitor-enter(r14)
            monitor-exit(r14)
            if5 r14 = r0.k0
            r0.j0 = r2
            r0.X = r12
            r0.Y = r11
            r0.Z = r10
            r0.d0 = r9
            r0.e0 = r8
            r0.f0 = r7
            r15 = r6
            java.util.Set r15 = (java.util.Set) r15
            r0.g0 = r15
            r0.h0 = r13
            r0.i0 = r5
            boolean r15 = r14.C()
            if (r15 != 0) goto Le9
            rj0 r15 = new rj0
            r41 r3 = defpackage.np2.V(r0)
            r15.<init>(r5, r3)
            r15.v()
            java.lang.Object r3 = r14.c
            monitor-enter(r3)
            boolean r16 = r14.C()     // Catch: java.lang.Throwable -> Le6
            if (r16 == 0) goto Lcf
            r14 = r15
            goto Ld2
        Lcf:
            r14.r = r15     // Catch: java.lang.Throwable -> Le6
            r14 = 0
        Ld2:
            monitor-exit(r3)
            if (r14 == 0) goto Lda
            jg7 r3 = defpackage.jg7.a
            r14.i(r3)
        Lda:
            java.lang.Object r3 = r15.s()
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r14) goto Le3
            goto Leb
        Le3:
            jg7 r3 = defpackage.jg7.a
            goto Leb
        Le6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Le9:
            jg7 r3 = defpackage.jg7.a
        Leb:
            if (r3 != r1) goto Lee
            goto L123
        Lee:
            r14 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r14
            goto L50
        Lf5:
            if5 r3 = r0.k0
            tp6 r6 = defpackage.if5.z
            boolean r3 = r3.K()
            if (r3 == 0) goto L1d9
            if5 r7 = r0.k0
            gf5 r6 = new gf5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.j0 = r2
            r0.X = r10
            r0.Y = r11
            r0.Z = r13
            r0.d0 = r12
            r0.e0 = r14
            r0.f0 = r8
            r3 = r15
            java.util.Set r3 = (java.util.Set) r3
            r0.g0 = r3
            r0.h0 = r9
            r0.i0 = r4
            java.lang.Object r3 = r2.a(r6, r0)
            if (r3 != r1) goto L124
        L123:
            return r1
        L124:
            r6 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r6
            r7 = r8
            r8 = r14
            r6 = r15
        L12c:
            if5 r3 = r0.k0
            java.lang.Object r14 = r3.c
            monitor-enter(r14)
            ja4 r15 = r3.l     // Catch: java.lang.Throwable -> L18a
            boolean r15 = r15.j()     // Catch: java.lang.Throwable -> L18a
            if (r15 == 0) goto L194
            ja4 r15 = r3.l     // Catch: java.lang.Throwable -> L18a
            ca4 r15 = defpackage.g94.b(r15)     // Catch: java.lang.Throwable -> L18a
            ja4 r5 = r3.l     // Catch: java.lang.Throwable -> L18a
            r5.a()     // Catch: java.lang.Throwable -> L18a
            ap3 r5 = r3.m     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r4 = r5.B     // Catch: java.lang.Throwable -> L18a
            ja4 r4 = (defpackage.ja4) r4     // Catch: java.lang.Throwable -> L18a
            r4.a()     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r4 = r5.L     // Catch: java.lang.Throwable -> L18a
            ja4 r4 = (defpackage.ja4) r4     // Catch: java.lang.Throwable -> L18a
            r4.a()     // Catch: java.lang.Throwable -> L18a
            ja4 r4 = r3.o     // Catch: java.lang.Throwable -> L18a
            r4.a()     // Catch: java.lang.Throwable -> L18a
            ca4 r4 = new ca4     // Catch: java.lang.Throwable -> L18a
            int r5 = r15.b     // Catch: java.lang.Throwable -> L18a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L18a
            java.lang.Object[] r5 = r15.a     // Catch: java.lang.Throwable -> L18a
            int r15 = r15.b     // Catch: java.lang.Throwable -> L18a
            r17 = r1
            r1 = 0
        L167:
            if (r1 >= r15) goto L18c
            r18 = r5[r1]     // Catch: java.lang.Throwable -> L18a
            r19 = r1
            r1 = r18
            o84 r1 = (defpackage.o84) r1     // Catch: java.lang.Throwable -> L18a
            r18 = r2
            ja4 r2 = r3.n     // Catch: java.lang.Throwable -> L18a
            java.lang.Object r2 = r2.g(r1)     // Catch: java.lang.Throwable -> L18a
            r20 = r5
            vr4 r5 = new vr4     // Catch: java.lang.Throwable -> L18a
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L18a
            r4.a(r5)     // Catch: java.lang.Throwable -> L18a
            int r1 = r19 + 1
            r2 = r18
            r5 = r20
            goto L167
        L18a:
            r0 = move-exception
            goto L1d7
        L18c:
            r18 = r2
            ja4 r1 = r3.n     // Catch: java.lang.Throwable -> L18a
            r1.a()     // Catch: java.lang.Throwable -> L18a
            goto L19d
        L194:
            r17 = r1
            r18 = r2
            ca4 r4 = defpackage.uh4.b     // Catch: java.lang.Throwable -> L18a
            r4.getClass()     // Catch: java.lang.Throwable -> L18a
        L19d:
            monitor-exit(r14)
            java.lang.Object[] r1 = r4.a
            int r2 = r4.b
            r3 = 0
        L1a3:
            if (r3 >= r2) goto L1b4
            r4 = r1[r3]
            vr4 r4 = (defpackage.vr4) r4
            java.lang.Object r5 = r4.A
            o84 r5 = (defpackage.o84) r5
            java.lang.Object r4 = r4.B
            n84 r4 = (defpackage.n84) r4
            int r3 = r3 + 1
            goto L1a3
        L1b4:
            if5 r1 = r0.k0
            m44 r1 = r1.b
            java.lang.Object r2 = r1.B
            vw r2 = (defpackage.vw) r2
            r3 = 0
            r2.set(r3)
            java.lang.Object r1 = r1.L
            s9 r1 = (defpackage.s9) r1
            x84 r2 = new x84
            r3 = 15
            r2.<init>(r3)
            r1.v(r2)
            r1 = r17
            r2 = r18
            r3 = 0
            r4 = 2
            r5 = 1
            goto L93
        L1d7:
            monitor-exit(r14)
            throw r0
        L1d9:
            r3 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r3
            r7 = r8
            r8 = r14
            r6 = r15
            r3 = 0
            goto L93
    }
}
