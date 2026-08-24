package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad5  reason: default package */
/* loaded from: classes.dex */
public final class ad5 {
    public final defpackage.nv4 a;
    public final defpackage.w61 b;
    public final defpackage.yc1 c;
    public final java.lang.Object d;
    public defpackage.tu0 e;
    public defpackage.ap6 f;
    public boolean g;

    public ad5(defpackage.nv4 r1, defpackage.w61 r2, defpackage.yc1 r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.d = r1
            return
    }

    public static final java.lang.Object a(defpackage.ad5 r28, defpackage.fd5 r29, defpackage.s41 r30) {
            r0 = r28
            r1 = r30
            nv4 r2 = r0.a
            de5 r6 = r2.i
            boolean r3 = r1 instanceof defpackage.zc5
            if (r3 == 0) goto L1c
            r3 = r1
            zc5 r3 = (defpackage.zc5) r3
            int r4 = r3.k0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r4 & r5
            if (r7 == 0) goto L1c
            int r4 = r4 - r5
            r3.k0 = r4
        L1a:
            r5 = r3
            goto L22
        L1c:
            zc5 r3 = new zc5
            r3.<init>(r0, r1)
            goto L1a
        L22:
            java.lang.Object r1 = r5.i0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r5.k0
            r8 = 10
            r4 = 2
            r9 = 0
            r10 = 1
            if (r3 == 0) goto L75
            if (r3 == r10) goto L5e
            if (r3 != r4) goto L58
            java.util.Set r0 = r5.h0
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set r2 = r5.g0
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r3 = r5.f0
            java.util.Set r3 = (java.util.Set) r3
            java.util.LinkedHashSet r4 = r5.e0
            pb4 r7 = r5.d0
            java.util.LinkedHashSet r12 = r5.Z
            java.util.List r13 = r5.Y
            bv4 r14 = r5.X
            fd5 r5 = r5.R
            defpackage.oi2.Y(r1)
            r19 = r5
            r30 = r9
            r17 = r10
            r16 = 0
            goto L23a
        L58:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L5e:
            java.util.List r0 = r5.Y
            bv4 r3 = r5.X
            fd5 r12 = r5.R
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L6e java.util.concurrent.CancellationException -> L3f4
            r30 = r9
            r14 = r12
            r16 = 0
            goto L119
        L6e:
            r30 = r9
            r14 = r12
            r16 = 0
            goto L125
        L75:
            defpackage.oi2.Y(r1)
            rp6 r1 = r6.A
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            bv4 r3 = (defpackage.bv4) r3
            java.util.List r1 = r3.b
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r1 = r1.iterator()
        L8c:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto La3
            java.lang.Object r13 = r1.next()
            r14 = r13
            av4 r14 = (defpackage.av4) r14
            cv4 r14 = r14.b
            cv4 r15 = defpackage.cv4.RETRYABLE
            if (r14 != r15) goto L8c
            r12.add(r13)
            goto L8c
        La3:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto Lc1
            dd5 r13 = new dd5
            lc5 r15 = r3.c
            r20 = 0
            r22 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = r15
            r14 = r29
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r13
        Lc1:
            yc1 r0 = r0.c     // Catch: java.lang.Throwable -> L11e java.util.concurrent.CancellationException -> L3f4
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11e java.util.concurrent.CancellationException -> L3f4
            int r13 = defpackage.ht0.v0(r12, r8)     // Catch: java.lang.Throwable -> L11e java.util.concurrent.CancellationException -> L3f4
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L11e java.util.concurrent.CancellationException -> L3f4
            int r13 = r12.size()     // Catch: java.lang.Throwable -> L11e java.util.concurrent.CancellationException -> L3f4
            r14 = 0
        Ld1:
            if (r14 >= r13) goto L101
            java.lang.Object r15 = r12.get(r14)     // Catch: java.lang.Throwable -> Lfe java.util.concurrent.CancellationException -> L3f4
            int r14 = r14 + 1
            av4 r15 = (defpackage.av4) r15     // Catch: java.lang.Throwable -> Lfe java.util.concurrent.CancellationException -> L3f4
            r30 = r9
            b82 r9 = new b82     // Catch: java.lang.Throwable -> Lfb java.util.concurrent.CancellationException -> L3f4
            r16 = 0
            zu4 r11 = r15.a     // Catch: java.lang.Throwable -> Lf7 java.util.concurrent.CancellationException -> L3f4
            long r10 = r11.e()     // Catch: java.lang.Throwable -> Lf7 java.util.concurrent.CancellationException -> L3f4
            zu4 r15 = r15.a     // Catch: java.lang.Throwable -> Lf7 java.util.concurrent.CancellationException -> L3f4
            bd5 r15 = r15.a()     // Catch: java.lang.Throwable -> Lf7 java.util.concurrent.CancellationException -> L3f4
            r9.<init>(r10, r15)     // Catch: java.lang.Throwable -> Lf7 java.util.concurrent.CancellationException -> L3f4
            r1.add(r9)     // Catch: java.lang.Throwable -> Lf7 java.util.concurrent.CancellationException -> L3f4
            r9 = r30
            r10 = 1
            goto Ld1
        Lf7:
            r14 = r29
        Lf9:
            r0 = r12
            goto L125
        Lfb:
            r16 = 0
            goto Lf7
        Lfe:
            r30 = r9
            goto Lfb
        L101:
            r14 = r29
            r30 = r9
            r16 = 0
            r5.R = r14     // Catch: java.lang.Throwable -> Lf9 java.util.concurrent.CancellationException -> L3f4
            r5.X = r3     // Catch: java.lang.Throwable -> Lf9 java.util.concurrent.CancellationException -> L3f4
            r5.Y = r12     // Catch: java.lang.Throwable -> Lf9 java.util.concurrent.CancellationException -> L3f4
            r9 = 1
            r5.k0 = r9     // Catch: java.lang.Throwable -> Lf9 java.util.concurrent.CancellationException -> L3f4
            java.lang.Object r1 = r0.K(r1, r5)     // Catch: java.lang.Throwable -> Lf9 java.util.concurrent.CancellationException -> L3f4
            if (r1 != r7) goto L118
            goto L3f3
        L118:
            r0 = r12
        L119:
            pb4 r1 = (defpackage.pb4) r1     // Catch: java.lang.Throwable -> L125 java.util.concurrent.CancellationException -> L3f4
        L11b:
            r13 = r0
            r9 = r3
            goto L12b
        L11e:
            r14 = r29
            r30 = r9
            r16 = 0
            goto Lf9
        L125:
            pb4 r1 = new pb4
            r1.<init>()
            goto L11b
        L12b:
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.Iterator r0 = r13.iterator()
        L134:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L14f
            java.lang.Object r3 = r0.next()
            av4 r3 = (defpackage.av4) r3
            zu4 r3 = r3.a
            long r10 = r3.e()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r10)
            r12.add(r3)
            goto L134
        L14f:
            java.util.Set r0 = r1.a
            java.util.Set r3 = r1.b
            java.util.Set r10 = r1.c
            java.util.Set r11 = r1.d
            r15 = 4
            java.util.Set[] r15 = new java.util.Set[r15]
            r15[r16] = r0
            r17 = 1
            r15[r17] = r3
            r15[r4] = r10
            r0 = 3
            r15[r0] = r11
            java.util.List r0 = defpackage.hf.c0(r15)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L172:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L182
            java.lang.Object r10 = r0.next()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            defpackage.gt0.A0(r3, r10)
            goto L172
        L182:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L18b
        L188:
            r18 = r9
            goto L1b2
        L18b:
            int r0 = r3.size()
            r10 = r16
        L191:
            if (r10 >= r0) goto L188
            java.lang.Object r11 = r3.get(r10)
            int r10 = r10 + 1
            java.lang.Number r11 = (java.lang.Number) r11
            r18 = r9
            long r8 = r11.longValue()
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r8)
            boolean r8 = r12.contains(r11)
            if (r8 != 0) goto L1ad
            goto L1c0
        L1ad:
            r9 = r18
            r8 = 10
            goto L191
        L1b2:
            int r0 = r3.size()
            java.util.Set r3 = defpackage.gt0.p1(r3)
            int r3 = r3.size()
            if (r0 == r3) goto L1c7
        L1c0:
            pb4 r0 = new pb4
            r0.<init>()
            r8 = r0
            goto L1c8
        L1c7:
            r8 = r1
        L1c8:
            java.util.Set r0 = r8.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r1 = defpackage.gt0.M0(r0, r12)
            java.util.Set r0 = r8.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r0 = defpackage.gt0.M0(r0, r12)
            java.util.Set r0 = defpackage.ii2.F(r0, r1)
            java.util.Set r3 = r8.d
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.LinkedHashSet r3 = defpackage.gt0.M0(r3, r12)
            java.util.Set r3 = defpackage.ii2.F(r3, r1)
            r9 = r0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r3 = defpackage.ii2.F(r3, r9)
            java.util.Set r10 = r8.c
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.LinkedHashSet r10 = defpackage.gt0.M0(r10, r12)
            java.util.Set r10 = defpackage.ii2.F(r10, r1)
            java.util.Set r9 = defpackage.ii2.F(r10, r9)
            r10 = r3
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Set r9 = defpackage.ii2.F(r9, r10)
            r5.R = r14
            r10 = r18
            r5.X = r10
            r5.Y = r13
            r5.Z = r12
            r5.d0 = r8
            r5.e0 = r1
            r11 = r0
            java.util.Set r11 = (java.util.Set) r11
            r5.f0 = r11
            r11 = r3
            java.util.Set r11 = (java.util.Set) r11
            r5.g0 = r11
            r11 = r9
            java.util.Set r11 = (java.util.Set) r11
            r5.h0 = r11
            r5.k0 = r4
            r4 = r2
            r2 = r0
            r0 = r4
            r4 = r3
            r3 = r9
            java.lang.Object r0 = r0.c(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L232
            goto L3f3
        L232:
            r0 = r3
            r7 = r8
            r19 = r14
            r3 = r2
            r2 = r4
            r14 = r10
            r4 = r1
        L23a:
            r1 = r3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.LinkedHashSet r5 = defpackage.ii2.K(r4, r1)
            r8 = r0
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.LinkedHashSet r5 = defpackage.ii2.K(r5, r8)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashSet r5 = defpackage.ii2.K(r5, r2)
            if (r12 == 0) goto L259
            boolean r8 = r12.isEmpty()
            if (r8 == 0) goto L259
        L256:
            r9 = r16
            goto L27a
        L259:
            java.util.Iterator r8 = r12.iterator()
        L25d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L256
            java.lang.Object r9 = r8.next()
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            boolean r9 = r5.contains(r11)
            if (r9 != 0) goto L25d
            r9 = r17
        L27a:
            boolean r5 = r7.e
            if (r5 != 0) goto L284
            if (r9 == 0) goto L281
            goto L284
        L281:
            r27 = r16
            goto L286
        L284:
            r27 = r17
        L286:
            if (r27 == 0) goto L293
            java.util.Set r0 = defpackage.ii2.F(r12, r4)
            java.util.Set r0 = defpackage.ii2.F(r0, r1)
        L290:
            r15 = 10
            goto L298
        L293:
            java.util.LinkedHashSet r0 = defpackage.ii2.K(r0, r2)
            goto L290
        L298:
            int r1 = defpackage.ht0.v0(r13, r15)
            int r1 = defpackage.c14.k0(r1)
            r2 = 16
            if (r1 >= r2) goto L2a5
            r1 = r2
        L2a5:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r1 = r13.iterator()
        L2ae:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L2ca
            java.lang.Object r5 = r1.next()
            r7 = r5
            av4 r7 = (defpackage.av4) r7
            zu4 r7 = r7.a
            long r7 = r7.e()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            r2.put(r9, r5)
            goto L2ae
        L2ca:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L2d3
            r21 = r16
            goto L30a
        L2d3:
            java.util.Iterator r1 = r4.iterator()
            r5 = r16
        L2d9:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L308
            java.lang.Object r7 = r1.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            java.lang.Object r7 = r2.get(r9)
            av4 r7 = (defpackage.av4) r7
            if (r7 == 0) goto L2f9
            zu4 r7 = r7.a
            goto L2fb
        L2f9:
            r7 = r30
        L2fb:
            boolean r7 = r7 instanceof defpackage.xu4
            if (r7 == 0) goto L2d9
            int r5 = r5 + 1
            if (r5 < 0) goto L304
            goto L2d9
        L304:
            defpackage.hf.p0()
            throw r30
        L308:
            r21 = r5
        L30a:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L313
            r22 = r16
            goto L34a
        L313:
            java.util.Iterator r1 = r4.iterator()
            r4 = r16
        L319:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L348
            java.lang.Object r5 = r1.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r7 = r5.longValue()
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
            java.lang.Object r5 = r2.get(r5)
            av4 r5 = (defpackage.av4) r5
            if (r5 == 0) goto L339
            zu4 r5 = r5.a
            goto L33b
        L339:
            r5 = r30
        L33b:
            boolean r5 = r5 instanceof defpackage.yu4
            if (r5 == 0) goto L319
            int r4 = r4 + 1
            if (r4 < 0) goto L344
            goto L319
        L344:
            defpackage.hf.p0()
            throw r30
        L348:
            r22 = r4
        L34a:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L35c
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L35c
            r24 = r16
            goto L393
        L35c:
            java.util.Iterator r4 = r0.iterator()
            r5 = r16
        L362:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L391
            java.lang.Object r7 = r4.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            java.lang.Object r7 = r2.get(r9)
            av4 r7 = (defpackage.av4) r7
            if (r7 == 0) goto L382
            zu4 r7 = r7.a
            goto L384
        L382:
            r7 = r30
        L384:
            boolean r7 = r7 instanceof defpackage.xu4
            if (r7 == 0) goto L362
            int r5 = r5 + 1
            if (r5 < 0) goto L38d
            goto L362
        L38d:
            defpackage.hf.p0()
            throw r30
        L391:
            r24 = r5
        L393:
            if (r1 == 0) goto L3a1
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3a1
            r25 = r16
            goto L3d8
        L3a1:
            java.util.Iterator r0 = r0.iterator()
            r11 = r16
        L3a7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d6
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            java.lang.Object r1 = r2.get(r1)
            av4 r1 = (defpackage.av4) r1
            if (r1 == 0) goto L3c7
            zu4 r1 = r1.a
            goto L3c9
        L3c7:
            r1 = r30
        L3c9:
            boolean r1 = r1 instanceof defpackage.yu4
            if (r1 == 0) goto L3a7
            int r11 = r11 + 1
            if (r11 < 0) goto L3d2
            goto L3a7
        L3d2:
            defpackage.hf.p0()
            throw r30
        L3d6:
            r25 = r11
        L3d8:
            dd5 r18 = new dd5
            lc5 r0 = r14.c
            int r23 = r3.size()
            rp6 r1 = r6.A
            java.lang.Object r1 = r1.getValue()
            bv4 r1 = (defpackage.bv4) r1
            lc5 r1 = r1.c
            r20 = r0
            r26 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7 = r18
        L3f3:
            return r7
        L3f4:
            r0 = move-exception
            throw r0
    }

    public final java.lang.Object b(defpackage.fd5 r10, defpackage.r32 r11) {
            r9 = this;
            java.lang.Object r1 = r9.d
            monitor-enter(r1)
            boolean r0 = r9.g     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L42
            tu0 r0 = r9.e     // Catch: java.lang.Throwable -> L32
            r6 = 0
            if (r0 != 0) goto L35
            tu0 r3 = new tu0     // Catch: java.lang.Throwable -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> L32
            r9.e = r3     // Catch: java.lang.Throwable -> L32
            w61 r0 = r9.b     // Catch: java.lang.Throwable -> L32
            a71 r8 = defpackage.a71.LAZY     // Catch: java.lang.Throwable -> L32
            l5 r2 = new l5     // Catch: java.lang.Throwable -> L32
            r7 = 26
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32
            r9 = 1
            ap6 r6 = defpackage.hv.L(r0, r6, r8, r2, r9)     // Catch: java.lang.Throwable -> L32
            r4.f = r6     // Catch: java.lang.Throwable -> L32
            qk4 r9 = new qk4     // Catch: java.lang.Throwable -> L32
            r10 = 6
            r9.<init>(r10, r3, r4)     // Catch: java.lang.Throwable -> L32
            r6.a0(r9)     // Catch: java.lang.Throwable -> L32
            r0 = r3
            goto L35
        L32:
            r0 = move-exception
            r9 = r0
            goto L4a
        L35:
            monitor-exit(r1)
            if (r6 == 0) goto L3b
            r6.start()
        L3b:
            java.lang.Object r9 = r0.q(r11)
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            return r9
        L42:
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L32
            java.lang.String r10 = "Pending submission coordinator is closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L32
            throw r9     // Catch: java.lang.Throwable -> L32
        L4a:
            monitor-exit(r1)
            throw r9
    }
}
