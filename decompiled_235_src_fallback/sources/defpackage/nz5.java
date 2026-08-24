package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nz5  reason: default package */
/* loaded from: classes.dex */
public final class nz5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ java.util.List X;
    public final /* synthetic */ java.util.List Y;
    public final /* synthetic */ java.lang.String Z;
    public final /* synthetic */ defpackage.n06 d0;
    public final /* synthetic */ defpackage.qw5 e0;
    public final /* synthetic */ defpackage.gn6 f0;
    public final /* synthetic */ defpackage.hn6 g0;
    public final /* synthetic */ defpackage.tz5 h0;
    public final /* synthetic */ java.util.List i0;

    public nz5(java.util.List r1, java.util.List r2, java.lang.String r3, defpackage.n06 r4, defpackage.qw5 r5, defpackage.gn6 r6, defpackage.hn6 r7, defpackage.tz5 r8, java.util.List r9, defpackage.r41 r10) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            r0.f0 = r6
            r0.g0 = r7
            r0.h0 = r8
            r0.i0 = r9
            r1 = 2
            r0.<init>(r1, r10)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            nz5 r0 = (defpackage.nz5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r12, java.lang.Object r13) {
            r11 = this;
            nz5 r0 = new nz5
            tz5 r8 = r11.h0
            java.util.List r9 = r11.i0
            java.util.List r1 = r11.X
            java.util.List r2 = r11.Y
            java.lang.String r3 = r11.Z
            n06 r4 = r11.d0
            qw5 r5 = r11.e0
            gn6 r6 = r11.f0
            hn6 r7 = r11.g0
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r32)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r0.X
            java.util.Iterator r3 = r2.iterator()
        L12:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r3.next()
            kz5 r4 = (defpackage.kz5) r4
            pq5 r4 = r4.a
            java.util.Date r6 = r4.g
            if (r6 == 0) goto L26
            r5 = r4
            goto L27
        L26:
            r5 = 0
        L27:
            if (r5 == 0) goto L12
            r1.add(r5)
            goto L12
        L2d:
            tp5 r3 = new tp5
            r4 = 4
            r3.<init>(r4)
            java.util.List r1 = defpackage.gt0.d1(r1, r3)
            r3 = 10
            java.util.List r16 = defpackage.gt0.e1(r1, r3)
            java.util.List r1 = r0.Y
            boolean r4 = r1.isEmpty()
            n06 r12 = r0.d0
            java.lang.String r6 = r0.Z
            yt1 r7 = defpackage.yt1.A
            qw5 r13 = r0.e0
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L68
            r4 = r6
            ss5 r6 = new ss5
            int r1 = r4.length()
            if (r1 <= 0) goto L5a
            r10 = r9
            goto L5b
        L5a:
            r10 = r8
        L5b:
            hn6 r15 = r0.g0
            zt1 r17 = defpackage.zt1.A
            r9 = 0
            r11 = 1
            gn6 r14 = r0.f0
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
        L68:
            r4 = r6
            int r6 = r4.length()
            tz5 r10 = r0.h0
            if (r6 <= 0) goto Lf8
            xh5 r1 = defpackage.tz5.L
            java.lang.String r1 = defpackage.ej2.M(r4)
            int r4 = r1.length()
            if (r4 != 0) goto L7e
            goto La1
        L7e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L87:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r2.next()
            r6 = r5
            kz5 r6 = (defpackage.kz5) r6
            java.lang.String r6 = r6.c
            boolean r6 = defpackage.qs6.j0(r6, r1, r8)
            if (r6 == 0) goto L87
            r4.add(r5)
            goto L87
        La0:
            r2 = r4
        La1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        Laa:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lc3
            java.lang.Object r4 = r2.next()
            r5 = r4
            kz5 r5 = (defpackage.kz5) r5
            pq5 r5 = r5.a
            boolean r5 = defpackage.tz5.g(r10, r5, r13)
            if (r5 == 0) goto Laa
            r1.add(r4)
            goto Laa
        Lc3:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = defpackage.ht0.v0(r1, r3)
            r2.<init>(r3)
            int r3 = r1.size()
        Ld0:
            if (r8 >= r3) goto Le5
            java.lang.Object r4 = r1.get(r8)
            int r8 = r8 + 1
            kz5 r4 = (defpackage.kz5) r4
            mr5 r5 = new mr5
            pq5 r4 = r4.a
            r5.<init>(r4)
            r2.add(r5)
            goto Ld0
        Le5:
            ss5 r6 = new ss5
            hn6 r15 = r0.g0
            gn6 r14 = r0.f0
            java.util.Map r17 = defpackage.tz5.f(r10, r2, r14)
            r9 = 0
            r10 = 1
            r11 = 0
            r8 = r7
            r7 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
        Lf8:
            xh5 r4 = defpackage.tz5.L
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r6 = r1.iterator()
        L103:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L131
            java.lang.Object r11 = r6.next()
            lz5 r11 = (defpackage.lz5) r11
            java.lang.String r14 = r11.b
            jz5 r17 = new jz5
            java.lang.String r15 = r11.c
            java.lang.String r5 = r11.d
            java.util.LinkedHashSet r23 = new java.util.LinkedHashSet
            r23.<init>()
            r20 = 0
            r22 = r5
            r18 = r11
            r19 = r14
            r21 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r11 = r17
            r5 = r19
            r4.put(r5, r11)
            goto L103
        L131:
            java.util.Iterator r5 = r2.iterator()
        L135:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1d1
            java.lang.Object r6 = r5.next()
            kz5 r6 = (defpackage.kz5) r6
            java.lang.String r6 = r6.b
            if (r6 != 0) goto L155
            java.lang.Object r6 = defpackage.gt0.J0(r1)
            lz5 r6 = (defpackage.lz5) r6
            if (r6 == 0) goto L150
            java.lang.String r6 = r6.b
            goto L151
        L150:
            r6 = 0
        L151:
            if (r6 != 0) goto L155
            goto L1ce
        L155:
            lz5 r11 = defpackage.tz5.l(r6, r1)
            if (r11 != 0) goto L165
            java.lang.Object r11 = defpackage.gt0.J0(r1)
            lz5 r11 = (defpackage.lz5) r11
            if (r11 != 0) goto L165
            goto L1ce
        L165:
            java.lang.String r14 = r11.b
        L167:
            if (r6 == 0) goto L1ce
            java.lang.String r19 = defpackage.tz5.m(r6, r14)
            java.lang.Object r15 = r4.get(r6)
            if (r15 != 0) goto L193
            jz5 r17 = new jz5
            java.lang.String r21 = defpackage.tz5.k(r6)
            java.lang.String r22 = defpackage.tz5.i(r11, r6)
            java.util.LinkedHashSet r23 = new java.util.LinkedHashSet
            r23.<init>()
            r18 = r11
            r20 = r19
            r19 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r8 = r17
            r15 = r20
            r4.put(r6, r8)
            goto L195
        L193:
            r15 = r19
        L195:
            if (r15 == 0) goto L1c7
            java.lang.Object r8 = r4.get(r15)
            if (r8 != 0) goto L1bd
            jz5 r17 = new jz5
            java.lang.String r20 = defpackage.tz5.m(r15, r14)
            java.lang.String r21 = defpackage.tz5.k(r15)
            java.lang.String r22 = defpackage.tz5.i(r11, r15)
            java.util.LinkedHashSet r23 = new java.util.LinkedHashSet
            r23.<init>()
            r18 = r11
            r19 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r8 = r17
            r4.put(r15, r8)
            goto L1bf
        L1bd:
            r18 = r11
        L1bf:
            jz5 r8 = (defpackage.jz5) r8
            java.util.LinkedHashSet r8 = r8.f
            r8.add(r6)
            goto L1c9
        L1c7:
            r18 = r11
        L1c9:
            r6 = r15
            r11 = r18
            r8 = 0
            goto L167
        L1ce:
            r8 = 0
            goto L135
        L1d1:
            int r5 = r1.size()
            if (r5 != r9) goto L1e5
            fz5 r5 = new fz5
            java.lang.Object r6 = defpackage.gt0.H0(r1)
            lz5 r6 = (defpackage.lz5) r6
            java.lang.String r6 = r6.b
            r5.<init>(r6)
            goto L1e7
        L1e5:
            gz5 r5 = defpackage.gz5.a
        L1e7:
            java.util.List r6 = r0.i0
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L1f3
            java.util.List r6 = defpackage.hf.b0(r5)
        L1f3:
            java.lang.Object r8 = defpackage.gt0.R0(r6)
            hz5 r8 = (defpackage.hz5) r8
            if (r8 != 0) goto L1fc
            goto L1fd
        L1fc:
            r5 = r8
        L1fd:
            boolean r8 = r5 instanceof defpackage.gz5
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r14 = r1.iterator()
        L209:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L26a
            java.lang.Object r15 = r14.next()
            r3 = r15
            lz5 r3 = (defpackage.lz5) r3
            boolean r18 = r2.isEmpty()
            if (r18 == 0) goto L221
        L21c:
            r19 = r2
            r21 = r5
            goto L25c
        L221:
            java.util.Iterator r18 = r2.iterator()
        L225:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L21c
            java.lang.Object r19 = r18.next()
            r9 = r19
            kz5 r9 = (defpackage.kz5) r9
            r19 = r2
            java.lang.String r2 = r9.b
            if (r2 != 0) goto L23c
            r21 = r5
            goto L264
        L23c:
            lz5 r2 = defpackage.tz5.l(r2, r1)
            if (r2 == 0) goto L247
            java.lang.String r2 = r2.b
        L244:
            r21 = r5
            goto L249
        L247:
            r2 = 0
            goto L244
        L249:
            java.lang.String r5 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r5)
            if (r2 == 0) goto L264
            pq5 r2 = r9.a
            boolean r2 = defpackage.tz5.g(r10, r2, r13)
            if (r2 == 0) goto L264
            r11.add(r15)
        L25c:
            r2 = r19
            r5 = r21
            r3 = 10
            r9 = 1
            goto L209
        L264:
            r2 = r19
            r5 = r21
            r9 = 1
            goto L225
        L26a:
            r19 = r2
            r21 = r5
            int r2 = r11.size()
            r3 = 1
            if (r2 > r3) goto L277
            r3 = 1
            goto L278
        L277:
            r3 = 0
        L278:
            qw5 r2 = defpackage.qw5.ALL
            if (r13 != r2) goto L280
            if (r3 != 0) goto L280
            r2 = 1
            goto L281
        L280:
            r2 = 0
        L281:
            if (r3 == 0) goto L2d6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r19.iterator()
        L28c:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L2a5
            java.lang.Object r9 = r5.next()
            r11 = r9
            kz5 r11 = (defpackage.kz5) r11
            pq5 r11 = r11.a
            boolean r11 = defpackage.tz5.g(r10, r11, r13)
            if (r11 == 0) goto L28c
            r2.add(r9)
            goto L28c
        L2a5:
            java.util.ArrayList r5 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.ht0.v0(r2, r9)
            r5.<init>(r9)
            int r9 = r2.size()
            r11 = 0
        L2b5:
            if (r11 >= r9) goto L2ca
            java.lang.Object r14 = r2.get(r11)
            int r11 = r11 + 1
            kz5 r14 = (defpackage.kz5) r14
            mr5 r15 = new mr5
            pq5 r14 = r14.a
            r15.<init>(r14)
            r5.add(r15)
            goto L2b5
        L2ca:
            r18 = r3
            r22 = r6
            r25 = r7
            r24 = r8
            r15 = 0
        L2d3:
            r7 = r5
            goto L591
        L2d6:
            if (r8 == 0) goto L3b8
            if (r2 == 0) goto L313
            tp5 r2 = new tp5
            r5 = 2
            r2.<init>(r5)
            java.util.List r2 = defpackage.gt0.d1(r11, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r9 = 10
            int r11 = defpackage.ht0.v0(r2, r9)
            r5.<init>(r11)
            java.util.Iterator r2 = r2.iterator()
        L2f3:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L314
            java.lang.Object r9 = r2.next()
            lz5 r9 = (defpackage.lz5) r9
            lr5 r11 = new lr5
            java.lang.String r14 = r9.b
            java.lang.String r15 = r9.c
            java.lang.String r9 = r9.d
            r18 = r2
            r2 = 1
            r11.<init>(r14, r15, r9, r2)
            r5.add(r11)
            r2 = r18
            goto L2f3
        L313:
            r5 = r7
        L314:
            qw5 r2 = defpackage.qw5.ALL
            if (r13 == r2) goto L35f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r19.iterator()
        L321:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L33a
            java.lang.Object r9 = r5.next()
            r11 = r9
            kz5 r11 = (defpackage.kz5) r11
            pq5 r11 = r11.a
            boolean r11 = defpackage.tz5.g(r10, r11, r13)
            if (r11 == 0) goto L321
            r2.add(r9)
            goto L321
        L33a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.ht0.v0(r2, r9)
            r5.<init>(r9)
            int r9 = r2.size()
            r11 = 0
        L34a:
            if (r11 >= r9) goto L2ca
            java.lang.Object r14 = r2.get(r11)
            int r11 = r11 + 1
            kz5 r14 = (defpackage.kz5) r14
            mr5 r15 = new mr5
            pq5 r14 = r14.a
            r15.<init>(r14)
            r5.add(r15)
            goto L34a
        L35f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r19.iterator()
        L368:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L389
            java.lang.Object r11 = r9.next()
            r14 = r11
            kz5 r14 = (defpackage.kz5) r14
            pq5 r15 = r14.a
            boolean r15 = r15.c()
            if (r15 == 0) goto L368
            pq5 r14 = r14.a
            boolean r14 = defpackage.tz5.g(r10, r14, r13)
            if (r14 == 0) goto L368
            r2.add(r11)
            goto L368
        L389:
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 10
            int r11 = defpackage.ht0.v0(r2, r11)
            r9.<init>(r11)
            int r11 = r2.size()
            r14 = 0
        L399:
            if (r14 >= r11) goto L3b2
            java.lang.Object r15 = r2.get(r14)
            int r14 = r14 + 1
            kz5 r15 = (defpackage.kz5) r15
            r17 = r2
            mr5 r2 = new mr5
            pq5 r15 = r15.a
            r2.<init>(r15)
            r9.add(r2)
            r2 = r17
            goto L399
        L3b2:
            java.util.ArrayList r5 = defpackage.gt0.V0(r5, r9)
            goto L2ca
        L3b8:
            r5 = r21
            fz5 r5 = (defpackage.fz5) r5
            java.lang.String r5 = r5.a
            java.lang.Object r9 = r4.get(r5)
            jz5 r9 = (defpackage.jz5) r9
            if (r9 != 0) goto L3f0
            lz5 r9 = defpackage.tz5.l(r5, r1)
            if (r9 != 0) goto L3d2
            java.lang.Object r9 = defpackage.gt0.H0(r1)
            lz5 r9 = (defpackage.lz5) r9
        L3d2:
            jz5 r24 = new jz5
            java.lang.String r11 = r9.b
            java.lang.String r27 = defpackage.tz5.m(r5, r11)
            java.lang.String r28 = defpackage.tz5.k(r5)
            java.lang.String r29 = defpackage.tz5.i(r9, r5)
            java.util.LinkedHashSet r30 = new java.util.LinkedHashSet
            r30.<init>()
            r26 = r5
            r25 = r9
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r9 = r24
        L3f0:
            if (r2 == 0) goto L4be
            java.util.LinkedHashSet r2 = r9.f
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3fd:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L415
            java.lang.Object r14 = r2.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r14 = r4.get(r14)
            jz5 r14 = (defpackage.jz5) r14
            if (r14 == 0) goto L3fd
            r11.add(r14)
            goto L3fd
        L415:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r14 = r11.size()
            r15 = 0
        L41f:
            if (r15 >= r14) goto L47a
            r18 = r3
            java.lang.Object r3 = r11.get(r15)
            int r15 = r15 + 1
            r22 = r6
            r6 = r3
            jz5 r6 = (defpackage.jz5) r6
            boolean r23 = r19.isEmpty()
            if (r23 == 0) goto L43b
        L434:
            r25 = r7
            r24 = r8
            r26 = r11
            goto L468
        L43b:
            java.util.Iterator r23 = r19.iterator()
        L43f:
            boolean r24 = r23.hasNext()
            if (r24 == 0) goto L434
            java.lang.Object r24 = r23.next()
            r25 = r7
            r7 = r24
            kz5 r7 = (defpackage.kz5) r7
            r24 = r8
            java.lang.String r8 = r7.b
            r26 = r11
            java.lang.String r11 = r6.b
            boolean r8 = defpackage.nb3.k(r8, r11)
            if (r8 == 0) goto L473
            pq5 r7 = r7.a
            boolean r7 = defpackage.tz5.g(r10, r7, r13)
            if (r7 == 0) goto L473
            r2.add(r3)
        L468:
            r3 = r18
            r6 = r22
            r8 = r24
            r7 = r25
            r11 = r26
            goto L41f
        L473:
            r8 = r24
            r7 = r25
            r11 = r26
            goto L43f
        L47a:
            r18 = r3
            r22 = r6
            r25 = r7
            r24 = r8
            tp5 r3 = new tp5
            r6 = 3
            r3.<init>(r6)
            java.util.List r2 = defpackage.gt0.d1(r2, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r11 = 10
            int r3 = defpackage.ht0.v0(r2, r11)
            r7.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L49b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c6
            java.lang.Object r3 = r2.next()
            jz5 r3 = (defpackage.jz5) r3
            lr5 r6 = new lr5
            java.lang.String r8 = r3.b
            java.lang.String r11 = r3.d
            java.lang.String r14 = r3.e
            lz5 r3 = r3.a
            java.lang.String r3 = r3.b
            boolean r3 = defpackage.nb3.k(r8, r3)
            r6.<init>(r8, r11, r14, r3)
            r7.add(r6)
            goto L49b
        L4be:
            r18 = r3
            r22 = r6
            r25 = r7
            r24 = r8
        L4c6:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r19.iterator()
        L4cf:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L4e8
            java.lang.Object r6 = r3.next()
            r8 = r6
            kz5 r8 = (defpackage.kz5) r8
            pq5 r8 = r8.a
            boolean r8 = defpackage.tz5.g(r10, r8, r13)
            if (r8 == 0) goto L4cf
            r2.add(r6)
            goto L4cf
        L4e8:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r2.size()
            r8 = 0
        L4f2:
            if (r8 >= r6) goto L565
            java.lang.Object r11 = r2.get(r8)
            int r8 = r8 + 1
            r14 = r11
            kz5 r14 = (defpackage.kz5) r14
            qw5 r15 = defpackage.qw5.ALL
            if (r13 != r15) goto L53d
            pq5 r15 = r14.a
            java.lang.String r14 = r14.b
            boolean r15 = r15.c()
            if (r15 != 0) goto L539
            boolean r15 = defpackage.nb3.k(r14, r5)
            if (r15 != 0) goto L539
            if (r14 != 0) goto L516
            java.lang.String r15 = ""
            goto L517
        L516:
            r15 = r14
        L517:
            boolean r15 = defpackage.tz5.o(r15, r5)
            if (r15 != 0) goto L539
            int r15 = r1.size()
            r19 = r2
            r2 = 1
            if (r15 != r2) goto L537
            if (r14 == 0) goto L53b
            java.lang.Object r2 = defpackage.gt0.H0(r1)
            lz5 r2 = (defpackage.lz5) r2
            java.lang.String r2 = r2.b
            boolean r2 = defpackage.tz5.o(r14, r2)
            if (r2 == 0) goto L537
            goto L53b
        L537:
            r15 = 0
            goto L55e
        L539:
            r19 = r2
        L53b:
            r15 = 0
            goto L561
        L53d:
            r19 = r2
            pq5 r2 = r14.a
            boolean r2 = r2.c()
            if (r2 != 0) goto L53b
            java.lang.String r2 = r14.b
            if (r2 == 0) goto L53b
            lz5 r14 = r9.a
            java.lang.String r14 = r14.b
            r15 = 0
            boolean r2 = defpackage.xs6.g0(r2, r14, r15)
            if (r2 != 0) goto L561
            int r2 = r1.size()
            r14 = 1
            if (r2 != r14) goto L55e
            goto L561
        L55e:
            r2 = r19
            goto L4f2
        L561:
            r3.add(r11)
            goto L55e
        L565:
            r15 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r9 = 10
            int r5 = defpackage.ht0.v0(r3, r9)
            r2.<init>(r5)
            int r5 = r3.size()
            r6 = r15
        L576:
            if (r6 >= r5) goto L58b
            java.lang.Object r8 = r3.get(r6)
            int r6 = r6 + 1
            kz5 r8 = (defpackage.kz5) r8
            mr5 r9 = new mr5
            pq5 r8 = r8.a
            r9.<init>(r8)
            r2.add(r9)
            goto L576
        L58b:
            java.util.ArrayList r5 = defpackage.gt0.V0(r7, r2)
            goto L2d3
        L591:
            if (r18 != 0) goto L5cf
            if (r24 == 0) goto L596
            goto L5cf
        L596:
            r5 = r21
            fz5 r5 = (defpackage.fz5) r5
            java.lang.String r2 = r5.a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            lz5 r1 = defpackage.tz5.l(r2, r1)
        L5a5:
            if (r2 == 0) goto L5c9
            java.lang.Object r5 = r4.get(r2)
            jz5 r5 = (defpackage.jz5) r5
            if (r5 == 0) goto L5b7
            java.lang.String r2 = r5.d
            r3.add(r2)
            java.lang.String r2 = r5.c
            goto L5a5
        L5b7:
            java.lang.String r5 = defpackage.tz5.k(r2)
            r3.add(r5)
            if (r1 == 0) goto L5c7
            java.lang.String r5 = r1.b
            java.lang.String r2 = defpackage.tz5.m(r2, r5)
            goto L5a5
        L5c7:
            r2 = 0
            goto L5a5
        L5c9:
            java.util.List r1 = defpackage.gt0.a1(r3)
            r8 = r1
            goto L5d1
        L5cf:
            r8 = r25
        L5d1:
            ss5 r6 = new ss5
            if (r18 != 0) goto L5de
            int r1 = r22.size()
            r2 = 1
            if (r1 <= r2) goto L5df
            r9 = r2
            goto L5e0
        L5de:
            r2 = 1
        L5df:
            r9 = r15
        L5e0:
            if (r18 != 0) goto L5e7
            if (r24 == 0) goto L5e5
            goto L5e7
        L5e5:
            r11 = r15
            goto L5e8
        L5e7:
            r11 = r2
        L5e8:
            hn6 r15 = r0.g0
            gn6 r14 = r0.f0
            java.util.Map r17 = defpackage.tz5.f(r10, r7, r14)
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r6
    }
}
