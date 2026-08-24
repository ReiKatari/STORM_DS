package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo5  reason: default package */
/* loaded from: classes.dex */
public final class lo5 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.pq5 X;
    public java.util.Map Y;
    public java.util.Map Z;
    public defpackage.no5 d0;
    public java.util.List e0;
    public java.util.Collection f0;
    public java.util.Iterator g0;
    public defpackage.gb5 h0;
    public java.util.Collection i0;
    public defpackage.qq5 j0;
    public java.net.URL k0;
    public defpackage.r75 l0;
    public java.lang.String m0;
    public boolean n0;
    public int o0;
    public int p0;
    public int q0;
    public long r0;
    public int s0;
    public /* synthetic */ java.lang.Object t0;
    public final /* synthetic */ defpackage.no5 u0;

    public lo5(defpackage.no5 r1, defpackage.r41 r2) {
            r0 = this;
            r0.u0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            lo5 r0 = (defpackage.lo5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            lo5 r0 = new lo5
            no5 r1 = r1.u0
            r0.<init>(r1, r2)
            r0.t0 = r3
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r30) {
            r29 = this;
            r1 = r29
            no5 r2 = r1.u0
            pn5 r3 = r2.b
            tp6 r4 = r2.d
            java.lang.Object r0 = r1.t0
            r5 = r0
            w61 r5 = (defpackage.w61) r5
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.s0
            jg7 r8 = defpackage.jg7.a
            e06 r9 = defpackage.e06.a
            r10 = 1
            r12 = 0
            switch(r0) {
                case 0: goto Lc3;
                case 1: goto Lbd;
                case 2: goto Lb2;
                case 3: goto La4;
                case 4: goto L91;
                case 5: goto L39;
                case 6: goto L2b;
                case 7: goto L20;
                default: goto L1a;
            }
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r12
        L20:
            no5 r2 = r1.d0
            defpackage.oi2.Y(r30)
            r0 = r30
            r17 = r8
            goto L30e
        L2b:
            java.util.List r0 = r1.e0
            no5 r1 = r1.d0
            defpackage.oi2.Y(r30)
            r3 = r1
            r17 = r8
            r1 = r30
            goto L2d1
        L39:
            long r2 = r1.r0
            int r0 = r1.q0
            int r4 = r1.p0
            int r5 = r1.o0
            boolean r9 = r1.n0
            java.lang.String r10 = r1.m0
            r75 r13 = r1.l0
            java.net.URL r14 = r1.k0
            qq5 r15 = r1.j0
            java.util.Collection r7 = r1.i0
            java.util.Collection r7 = (java.util.Collection) r7
            gb5 r12 = r1.h0
            java.util.Iterator r11 = r1.g0
            r17 = r0
            java.util.Collection r0 = r1.f0
            java.util.Collection r0 = (java.util.Collection) r0
            r18 = r0
            no5 r0 = r1.d0
            r19 = r0
            java.util.Map r0 = r1.Z
            r20 = r0
            java.util.Map r0 = r1.Y
            r21 = r0
            pq5 r0 = r1.X
            defpackage.oi2.Y(r30)
            r22 = r7
            r7 = r6
            r6 = r22
            r22 = r21
            r21 = r10
            r10 = r22
            r22 = r13
            r24 = r15
            r15 = r17
            r17 = r8
            r13 = r11
            r8 = r18
            r11 = r0
            r0 = r20
            r27 = r2
            r2 = r30
            r3 = r19
            r19 = r27
        L8d:
            r23 = r14
            goto L261
        L91:
            boolean r0 = r1.n0
            java.util.Map r7 = r1.Z
            java.util.Map r10 = r1.Y
            pq5 r11 = r1.X
            defpackage.oi2.Y(r30)
            r12 = r30
            hm5 r12 = (defpackage.hm5) r12
            java.lang.Object r12 = r12.A
            goto L154
        La4:
            boolean r0 = r1.n0
            java.util.Map r7 = r1.Y
            pq5 r10 = r1.X
            defpackage.oi2.Y(r30)
            r11 = r10
            r10 = r30
            goto L139
        Lb2:
            boolean r0 = r1.n0
            pq5 r7 = r1.X
            defpackage.oi2.Y(r30)
            r11 = r30
            r10 = 2
            goto L118
        Lbd:
            defpackage.oi2.Y(r30)
            r0 = r30
            goto Ld8
        Lc3:
            defpackage.oi2.Y(r30)
            r1.t0 = r5
            r1.s0 = r10
            r0 = r3
            pl r0 = (defpackage.pl) r0
            hk r0 = r0.c
            java.lang.Object r0 = r0.b(r1)
            if (r0 != r6) goto Ld8
        Ld5:
            r7 = r6
            goto L30d
        Ld8:
            jb5 r0 = (defpackage.jb5) r0
            boolean r7 = r0 instanceof defpackage.hb5
            if (r7 == 0) goto L33f
            pq5 r0 = r2.h()     // Catch: java.lang.Throwable -> Le3
            goto Lea
        Le3:
            r0 = move-exception
            em5 r7 = new em5
            r7.<init>(r0)
            r0 = r7
        Lea:
            java.lang.Throwable r7 = defpackage.hm5.a(r0)
            if (r7 != 0) goto L335
            r7 = r0
            pq5 r7 = (defpackage.pq5) r7
            kd6 r0 = r2.c
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            java.lang.String r11 = "ra_hardcore_enabled"
            r12 = 0
            boolean r0 = r0.getBoolean(r11, r12)
            xe1 r11 = defpackage.xk1.a
            jo5 r12 = new jo5
            r13 = 0
            r12.<init>(r2, r7, r13, r10)
            r1.t0 = r5
            r1.X = r7
            r1.n0 = r0
            r10 = 2
            r1.s0 = r10
            java.lang.Object r11 = defpackage.hv.d0(r11, r12, r1)
            if (r11 != r6) goto L118
            goto Ld5
        L118:
            java.util.Map r11 = (java.util.Map) r11
            xe1 r12 = defpackage.xk1.a
            jo5 r13 = new jo5
            r14 = 0
            r13.<init>(r2, r7, r14, r10)
            r1.t0 = r5
            r1.X = r7
            r1.Y = r11
            r1.n0 = r0
            r10 = 3
            r1.s0 = r10
            java.lang.Object r10 = defpackage.hv.d0(r12, r13, r1)
            if (r10 != r6) goto L134
            goto Ld5
        L134:
            r27 = r11
            r11 = r7
            r7 = r27
        L139:
            java.util.Map r10 = (java.util.Map) r10
            r1.t0 = r5
            r1.X = r11
            r1.Y = r7
            r1.Z = r10
            r1.n0 = r0
            r12 = 4
            r1.s0 = r12
            java.lang.Object r12 = r2.k(r11, r0, r1)
            if (r12 != r6) goto L14f
            goto Ld5
        L14f:
            r27 = r10
            r10 = r7
            r7 = r27
        L154:
            java.lang.Throwable r13 = defpackage.hm5.a(r12)
            if (r13 != 0) goto L2e2
            kb5 r12 = (defpackage.kb5) r12
            if (r12 == 0) goto L161
            java.util.ArrayList r3 = r12.e
            goto L162
        L161:
            r3 = 0
        L162:
            if (r3 != 0) goto L166
            yt1 r3 = defpackage.yt1.A
        L166:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
            r9 = r0
            r12 = r3
            r0 = r7
            r5 = 0
            r3 = r2
            r7 = r4
            r2 = 0
            r4 = 0
        L17d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L27b
            java.lang.Object r13 = r12.next()
            gb5 r13 = (defpackage.gb5) r13
            long r14 = r13.a
            r30 = r7
            java.util.ArrayList r7 = r13.f
            r17 = r8
            java.lang.String r8 = r13.b
            r18 = r6
            r75 r6 = r13.c
            r19 = r14
            java.net.URL r14 = r13.e
            r3.getClass()
            int r15 = r7.size()
            boolean r21 = r7.isEmpty()
            if (r21 == 0) goto L1ae
            r21 = r2
            r23 = r4
            r2 = 0
            goto L1da
        L1ae:
            r21 = r2
            int r2 = r7.size()
            r23 = r4
            r4 = 0
            r22 = 0
        L1b9:
            if (r4 >= r2) goto L1d8
            java.lang.Object r24 = r7.get(r4)
            int r4 = r4 + 1
            r25 = r2
            r2 = r24
            eb5 r2 = (defpackage.eb5) r2
            boolean r2 = r2.b
            if (r2 == 0) goto L1cf
            int r22 = r22 + 1
            if (r22 < 0) goto L1d2
        L1cf:
            r2 = r25
            goto L1b9
        L1d2:
            defpackage.hf.p0()
            r16 = 0
            throw r16
        L1d8:
            r2 = r22
        L1da:
            int r4 = r7.size()
            r22 = r5
            r24 = r8
            r5 = 0
            r8 = 0
        L1e4:
            if (r8 >= r4) goto L204
            java.lang.Object r25 = r7.get(r8)
            int r8 = r8 + 1
            r26 = r4
            r4 = r25
            eb5 r4 = (defpackage.eb5) r4
            r25 = r8
            boolean r8 = r4.b
            if (r8 == 0) goto L1fd
            o75 r4 = r4.a
            int r4 = r4.h
            goto L1fe
        L1fd:
            r4 = 0
        L1fe:
            int r5 = r5 + r4
            r8 = r25
            r4 = r26
            goto L1e4
        L204:
            qq5 r4 = new qq5
            r4.<init>(r15, r2, r5, r9)
            r2 = 0
            r1.t0 = r2
            r1.X = r11
            r1.Y = r10
            r1.Z = r0
            r1.d0 = r3
            r1.e0 = r2
            r2 = r30
            java.util.Collection r2 = (java.util.Collection) r2
            r1.f0 = r2
            r1.g0 = r12
            r1.h0 = r13
            r1.i0 = r2
            r1.j0 = r4
            r1.k0 = r14
            r1.l0 = r6
            r2 = r24
            r1.m0 = r2
            r1.n0 = r9
            r5 = r22
            r1.o0 = r5
            r8 = r23
            r1.p0 = r8
            r15 = r21
            r1.q0 = r15
            r21 = r12
            r22 = r13
            r12 = r19
            r1.r0 = r12
            r2 = 5
            r1.s0 = r2
            java.lang.Object r2 = r3.e(r7, r10, r1)
            r7 = r18
            if (r2 != r7) goto L24f
            goto L30d
        L24f:
            r19 = r12
            r13 = r21
            r12 = r22
            r21 = r24
            r24 = r4
            r22 = r6
            r4 = r8
            r6 = r30
            r8 = r6
            goto L8d
        L261:
            r25 = r2
            java.util.List r25 = (java.util.List) r25
            java.util.ArrayList r2 = r12.g
            c6 r18 = new c6
            r26 = r2
            r18.<init>(r19, r21, r22, r23, r24, r25, r26)
            r2 = r18
            r6.add(r2)
            r6 = r7
            r7 = r8
            r12 = r13
            r2 = r15
            r8 = r17
            goto L17d
        L27b:
            r30 = r7
            r17 = r8
            r7 = r6
            r2 = r30
            java.util.List r2 = (java.util.List) r2
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L29b
            ko5 r4 = new ko5
            r12 = 0
            r4.<init>(r12, r0)
            ix1 r0 = new ix1
            r10 = 2
            r0.<init>(r4, r10)
            java.util.List r0 = defpackage.gt0.d1(r2, r0)
            goto L29d
        L29b:
            r12 = 0
            r0 = r2
        L29d:
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            jo5 r4 = new jo5
            r14 = 0
            r4.<init>(r3, r11, r14, r12)
            r1.t0 = r14
            r1.X = r14
            r1.Y = r14
            r1.Z = r14
            r1.d0 = r3
            r1.e0 = r0
            r1.f0 = r14
            r1.g0 = r14
            r1.h0 = r14
            r1.i0 = r14
            r1.j0 = r14
            r1.k0 = r14
            r1.l0 = r14
            r1.m0 = r14
            r1.n0 = r9
            r1.o0 = r5
            r5 = 6
            r1.s0 = r5
            java.lang.Object r1 = defpackage.hv.d0(r2, r4, r1)
            if (r1 != r7) goto L2d1
            goto L30d
        L2d1:
            java.util.Set r1 = (java.util.Set) r1
            tp6 r2 = r3.d
            i06 r3 = new i06
            r3.<init>(r0, r1)
            r2.getClass()
            r14 = 0
            r2.m(r14, r3)
            goto L334
        L2e2:
            r7 = r6
            r17 = r8
            r14 = 0
            l61 r5 = r5.A()
            defpackage.yh2.o(r5)
            boolean r5 = r13 instanceof defpackage.sj7
            if (r5 == 0) goto L32e
            r1.t0 = r14
            r1.X = r14
            r1.Y = r14
            r1.Z = r14
            r1.d0 = r2
            r1.n0 = r0
            r12 = 0
            r1.o0 = r12
            r0 = 7
            r1.s0 = r0
            pl r3 = (defpackage.pl) r3
            hk r0 = r3.c
            java.lang.Object r0 = r0.b(r1)
            if (r0 != r7) goto L30e
        L30d:
            return r7
        L30e:
            jb5 r0 = (defpackage.jb5) r0
            boolean r1 = r0 instanceof defpackage.ib5
            if (r1 == 0) goto L318
            r13 = r0
            ib5 r13 = (defpackage.ib5) r13
            goto L319
        L318:
            r13 = 0
        L319:
            if (r13 == 0) goto L31e
            java.lang.String r13 = r13.a
            goto L31f
        L31e:
            r13 = 0
        L31f:
            tp6 r0 = r2.d
            g06 r1 = new g06
            r1.<init>(r13)
            r0.getClass()
            r14 = 0
            r0.m(r14, r1)
            goto L334
        L32e:
            r4.getClass()
            r4.m(r14, r9)
        L334:
            return r17
        L335:
            r17 = r8
            r14 = 0
            r4.getClass()
            r4.m(r14, r9)
            return r17
        L33f:
            r17 = r8
            r14 = 0
            boolean r1 = r0 instanceof defpackage.ib5
            if (r1 == 0) goto L356
            g06 r1 = new g06
            ib5 r0 = (defpackage.ib5) r0
            java.lang.String r0 = r0.a
            r1.<init>(r0)
            r4.getClass()
            r4.m(r14, r1)
            return r17
        L356:
            if (r0 != 0) goto L364
            g06 r0 = new g06
            r0.<init>(r14)
            r4.getClass()
            r4.m(r14, r0)
            return r17
        L364:
            defpackage.i.d()
            return r14
    }
}
