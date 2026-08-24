package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr6  reason: default package */
/* loaded from: classes.dex */
public final class pr6 extends defpackage.di7 {
    public defpackage.lc6 A;
    public defpackage.lc6 B;
    public defpackage.mc6 C;
    public final defpackage.qr6 q;
    public final defpackage.mq7 r;
    public final defpackage.u63 s;
    public final defpackage.u63 t;
    public defpackage.m44 u;
    public defpackage.s9 v;
    public defpackage.qv6 w;
    public defpackage.qv6 x;
    public defpackage.qv6 y;
    public defpackage.qv6 z;

    public pr6(defpackage.eg0 r2, defpackage.eg0 r3, defpackage.u63 r4, defpackage.u63 r5, java.util.HashSet r6, defpackage.cj7 r7) {
            r1 = this;
            qr6 r0 = K(r6)
            r1.<init>(r0)
            qr6 r0 = K(r6)
            r1.q = r0
            r1.s = r4
            r1.t = r5
            r4 = r3
            r3 = r2
            mq7 r2 = new mq7
            r5 = r6
            r6 = r7
            fa6 r7 = new fa6
            r0 = 3
            r7.<init>(r0)
            r2.<init>(r3, r4, r5, r6, r7)
            r1.r = r2
            java.util.Iterator r2 = r5.iterator()
            java.lang.Object r2 = r2.next()
            di7 r2 = (defpackage.di7) r2
            java.util.HashSet r2 = r2.g
            if (r2 == 0) goto L36
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r2)
            goto L37
        L36:
            r3 = 0
        L37:
            r1.g = r3
            return
    }

    public static defpackage.qr6 K(java.util.HashSet r5) {
            jd0 r0 = new jd0
            da4 r1 = defpackage.da4.d()
            r2 = 6
            r0.<init>(r1, r2)
            xx r0 = defpackage.j23.l
            r2 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r5.next()
            di7 r2 = (defpackage.di7) r2
            zi7 r3 = r2.h
            xx r4 = defpackage.zi7.T
            boolean r3 = r3.i(r4)
            if (r3 == 0) goto L3e
            zi7 r2 = r2.h
            bj7 r2 = r2.x()
            r0.add(r2)
            goto L1e
        L3e:
            java.lang.String r2 = "StreamSharing"
            java.lang.String r3 = "A child does not have capture type."
            android.util.Log.e(r2, r3)
            goto L1e
        L46:
            xx r5 = defpackage.qr6.B
            r1.m(r5, r0)
            xx r5 = defpackage.n23.r
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.m(r5, r0)
            xx r5 = defpackage.zi7.b0
            tr6 r0 = defpackage.tr6.PREVIEW_VIDEO_STILL
            r1.m(r5, r0)
            qr6 r5 = new qr6
            go4 r0 = defpackage.go4.a(r1)
            r5.<init>(r0)
            return r5
    }

    @Override // defpackage.di7
    public final void A() {
            r3 = this;
            r3.G()
            mq7 r3 = r3.r
            java.util.HashSet r0 = r3.A
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            di7 r1 = (defpackage.di7) r1
            java.util.HashMap r2 = r3.L
            java.lang.Object r2 = r2.get(r1)
            lq7 r2 = (defpackage.lq7) r2
            java.util.Objects.requireNonNull(r2)
            r1.D(r2)
            goto Lb
        L26:
            return
    }

    public final void G() {
            r4 = this;
            mc6 r0 = r4.C
            r1 = 0
            if (r0 == 0) goto La
            r0.b()
            r4.C = r1
        La:
            qv6 r0 = r4.w
            if (r0 == 0) goto L13
            r0.b()
            r4.w = r1
        L13:
            qv6 r0 = r4.x
            if (r0 == 0) goto L1c
            r0.b()
            r4.x = r1
        L1c:
            qv6 r0 = r4.y
            if (r0 == 0) goto L25
            r0.b()
            r4.y = r1
        L25:
            qv6 r0 = r4.z
            if (r0 == 0) goto L2e
            r0.b()
            r4.z = r1
        L2e:
            m44 r0 = r4.u
            if (r0 == 0) goto L45
            java.lang.Object r2 = r0.B
            qf1 r2 = (defpackage.qf1) r2
            r2.release()
            rk3 r2 = new rk3
            r3 = 12
            r2.<init>(r0, r3)
            defpackage.nj2.D(r2)
            r4.u = r1
        L45:
            s9 r0 = r4.v
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r0.a
            xv6 r2 = (defpackage.xv6) r2
            r2.release()
            n0 r2 = new n0
            r3 = 21
            r2.<init>(r0, r3)
            defpackage.nj2.D(r2)
            r4.v = r1
        L5c:
            return
    }

    public final java.util.List H(java.lang.String r39, java.lang.String r40, defpackage.zi7 r41, defpackage.yy r42, defpackage.yy r43) {
            r38 = this;
            r0 = r38
            r4 = r42
            r3 = r43
            yq1 r10 = r4.c
            defpackage.nj2.h()
            java.lang.String r12 = "   outputConfig = "
            java.lang.String r13 = "SurfaceProcessorNode"
            mq7 r6 = r0.r
            r15 = 0
            if (r3 != 0) goto L22c
            r5 = 0
            r1 = r39
            r2 = r40
            r3 = r41
            qv6 r4 = r0.I(r1, r2, r3, r4, r5)
            r7 = r0
            eg0 r0 = r7.d()
            java.util.Objects.requireNonNull(r0)
            m44 r8 = new m44
            qf1 r1 = new qf1
            r1.<init>(r10)
            r8.<init>(r0, r1)
            r7.u = r8
            android.graphics.Rect r0 = r7.k
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = r15
        L3a:
            zi7 r1 = r7.h
            n23 r1 = (defpackage.n23) r1
            int r5 = r1.K(r15)
            r6.getClass()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashSet r1 = r6.A
            java.util.Iterator r10 = r1.iterator()
        L50:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r10.next()
            di7 r1 = (defpackage.di7) r1
            gl5 r2 = r6.g0
            eg0 r3 = r6.Y
            r37 = r6
            r6 = r0
            r0 = r37
            ry r2 = r0.r(r1, r2, r3, r4, r5, r6)
            eg0 r3 = r0.Y
            zi7 r11 = r1.h
            n23 r11 = (defpackage.n23) r11
            int r11 = r11.K(r15)
            zf0 r3 = r3.a()
            int r3 = r3.p(r11)
            java.util.HashMap r11 = r0.L
            java.lang.Object r11 = r11.get(r1)
            lq7 r11 = (defpackage.lq7) r11
            java.util.Objects.requireNonNull(r11)
            nq7 r11 = r11.B
            r11.L = r3
            r9.put(r1, r2)
            r37 = r6
            r6 = r0
            r0 = r37
            goto L50
        L93:
            r37 = r6
            r6 = r0
            r0 = r37
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r9.values()
            r1.<init>(r2)
            if (r4 == 0) goto L225
            java.lang.Object r2 = r8.B
            qf1 r2 = (defpackage.qf1) r2
            defpackage.nj2.h()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "[StreamSharing] SurfaceProcessorNode Transform (Processor="
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r5 = "\n   inputEdge = "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.kj2.t(r13, r3)
            int r3 = r1.size()
            r5 = r15
        Lc8:
            if (r5 >= r3) goto Le2
            java.lang.Object r10 = r1.get(r5)
            int r5 = r5 + 1
            ry r10 = (defpackage.ry) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            defpackage.kj2.t(r13, r10)
            goto Lc8
        Le2:
            qs0 r3 = new qs0
            r3.<init>()
            r8.R = r3
            int r3 = r1.size()
            r5 = r15
        Lee:
            if (r5 >= r3) goto L17e
            java.lang.Object r10 = r1.get(r5)
            int r5 = r5 + 1
            ry r10 = (defpackage.ry) r10
            java.lang.Object r11 = r8.R
            qs0 r11 = (defpackage.qs0) r11
            android.graphics.Rect r12 = r10.d
            int r13 = r10.f
            boolean r14 = r10.g
            android.graphics.Matrix r15 = new android.graphics.Matrix
            r39 = r1
            android.graphics.Matrix r1 = r4.b
            r15.<init>(r1)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r12)
            r40 = r3
            android.util.Size r3 = r10.e
            r41 = r5
            android.graphics.RectF r5 = defpackage.k97.h(r3)
            android.graphics.Matrix r1 = defpackage.k97.a(r1, r5, r13, r14)
            r15.postConcat(r1)
            android.util.Size r1 = defpackage.k97.f(r12)
            android.util.Size r1 = defpackage.k97.g(r13, r1)
            boolean r1 = defpackage.k97.d(r1, r3)
            defpackage.np2.t(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            int r5 = r3.getWidth()
            int r12 = r3.getHeight()
            r42 = r9
            r9 = 0
            r1.<init>(r9, r9, r5, r12)
            yy r5 = r4.g
            p87 r5 = r5.b()
            r5.a = r3
            yy r19 = r5.a()
            qv6 r16 = new qv6
            int r3 = r10.b
            int r5 = r10.c
            int r9 = r4.i
            int r23 = r9 - r13
            boolean r9 = r4.e
            if (r9 == r14) goto L15d
            r25 = 1
            goto L15f
        L15d:
            r25 = 0
        L15f:
            r21 = 0
            r24 = -1
            r22 = r1
            r17 = r3
            r18 = r5
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r16
            r11.put(r10, r1)
            r1 = r39
            r3 = r40
            r5 = r41
            r9 = r42
            r15 = 0
            goto Lee
        L17e:
            r42 = r9
            r1 = 1
            bw6 r3 = r4.c(r1)
            r2.a(r3)
            java.lang.Object r1 = r8.R
            qs0 r1 = (defpackage.qs0) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L194:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1bf
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r8.d(r4, r2)
            java.lang.Object r3 = r2.getValue()
            qv6 r3 = (defpackage.qv6) r3
            v r5 = new v
            r9 = 19
            r5.<init>(r8, r4, r2, r9)
            r3.getClass()
            defpackage.nj2.h()
            r3.a()
            java.util.HashSet r2 = r3.m
            r2.add(r5)
            goto L194
        L1bf:
            java.lang.Object r1 = r8.R
            qs0 r1 = (defpackage.qs0) r1
            uk2 r2 = new uk2
            r3 = 2
            r2.<init>(r1, r3)
            java.util.ArrayList r1 = r4.o
            r1.add(r2)
            java.lang.Object r1 = r8.R
            qs0 r1 = (defpackage.qs0) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r42.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1df:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1ff
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r8 = r5.getKey()
            di7 r8 = (defpackage.di7) r8
            java.lang.Object r5 = r5.getValue()
            java.lang.Object r5 = r1.get(r5)
            qv6 r5 = (defpackage.qv6) r5
            r2.put(r8, r5)
            goto L1df
        L1ff:
            java.util.HashMap r1 = r0.u(r4, r6)
            r0.x(r2, r1)
            lc6 r0 = r7.A
            rc6 r0 = r0.c()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r26 = 0
            r0 = r0[r26]
            java.util.Objects.requireNonNull(r0)
            r1.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            return r0
        L225:
            java.lang.String r0 = "Null surfaceEdge"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
        L22c:
            r7 = r0
            r0 = r6
            qv6 r11 = r38.I(r39, r40, r41, r42, r43)
            r1 = r0
            qv6 r0 = new qv6
            android.graphics.Matrix r4 = r7.l
            eg0 r2 = r7.j()
            java.util.Objects.requireNonNull(r2)
            boolean r5 = r2.o()
            android.util.Size r2 = r3.a
            android.graphics.Rect r6 = r7.k
            if (r6 == 0) goto L24a
            r9 = 0
            goto L258
        L24a:
            android.graphics.Rect r6 = new android.graphics.Rect
            int r8 = r2.getWidth()
            int r2 = r2.getHeight()
            r9 = 0
            r6.<init>(r9, r9, r8, r2)
        L258:
            eg0 r2 = r7.j()
            java.util.Objects.requireNonNull(r2)
            int r2 = r7.i(r2, r9)
            eg0 r8 = r7.j()
            java.util.Objects.requireNonNull(r8)
            boolean r9 = r7.o(r8)
            r8 = r1
            r1 = 3
            r7 = r2
            r2 = 34
            r14 = r8
            r8 = -1
            r15 = r14
            r14 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r14.x = r0
            eg0 r1 = r14.j()
            java.util.Objects.requireNonNull(r1)
            r14.z = r0
            qv6 r0 = r14.x
            r4 = r41
            lc6 r7 = r14.J(r0, r4, r3)
            r14.B = r7
            mc6 r0 = r14.C
            if (r0 == 0) goto L297
            r0.b()
        L297:
            mc6 r8 = new mc6
            or6 r0 = new or6
            r2 = r39
            r5 = r42
            r6 = r3
            r1 = r14
            r3 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.<init>(r0)
            r14.C = r8
            r7.f = r8
            qv6 r7 = r14.z
            eg0 r0 = r14.d()
            eg0 r1 = r14.j()
            s9 r2 = new s9
            mq1 r3 = new mq1
            u63 r4 = r14.s
            u63 r5 = r14.t
            r3.<init>(r10, r4, r5)
            r2.<init>()
            r2.b = r0
            r2.c = r1
            r2.a = r3
            r14.v = r2
            android.graphics.Rect r0 = r14.k
            if (r0 == 0) goto L2d3
            r6 = 1
            goto L2d4
        L2d3:
            r6 = 0
        L2d4:
            zi7 r0 = r14.h
            n23 r0 = (defpackage.n23) r0
            r9 = 0
            int r5 = r0.K(r9)
            r15.getClass()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashSet r0 = r15.A
            java.util.Iterator r9 = r0.iterator()
        L2eb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L33e
            java.lang.Object r0 = r9.next()
            r1 = r0
            di7 r1 = (defpackage.di7) r1
            gl5 r2 = r15.g0
            eg0 r3 = r15.Y
            r4 = r11
            r0 = r15
            ry r10 = r0.r(r1, r2, r3, r4, r5, r6)
            gl5 r2 = r0.h0
            java.util.Objects.requireNonNull(r2)
            eg0 r3 = r0.Z
            java.util.Objects.requireNonNull(r3)
            r4 = r7
            ry r2 = r0.r(r1, r2, r3, r4, r5, r6)
            eg0 r3 = r0.Y
            zi7 r7 = r1.h
            n23 r7 = (defpackage.n23) r7
            r15 = 0
            int r7 = r7.K(r15)
            zf0 r3 = r3.a()
            int r3 = r3.p(r7)
            java.util.HashMap r7 = r0.L
            java.lang.Object r7 = r7.get(r1)
            lq7 r7 = (defpackage.lq7) r7
            java.util.Objects.requireNonNull(r7)
            nq7 r7 = r7.B
            r7.L = r3
            ay r3 = new ay
            r3.<init>(r10, r2)
            r8.put(r1, r3)
            r15 = r0
            r7 = r4
            goto L2eb
        L33e:
            r4 = r7
            r0 = r15
            s9 r1 = r14.v
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Collection r3 = r8.values()
            r2.<init>(r3)
            cy r3 = new cy
            r3.<init>(r11, r4, r2)
            r1.getClass()
            defpackage.nj2.h()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "[StreamSharing] DualSurfaceProcessorNode Transform Processor = "
            r5.<init>(r7)
            java.lang.Object r7 = r1.a
            xv6 r7 = (defpackage.xv6) r7
            r5.append(r7)
            java.lang.String r9 = "\n   primary input = "
            r5.append(r9)
            r5.append(r11)
            java.lang.String r9 = "\n   secondary input = "
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DualSurfaceProcessorNode"
            defpackage.kj2.t(r5, r4)
            int r4 = r2.size()
            r5 = 0
        L382:
            if (r5 >= r4) goto L39c
            java.lang.Object r9 = r2.get(r5)
            int r5 = r5 + 1
            ay r9 = (defpackage.ay) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            defpackage.kj2.t(r13, r9)
            goto L382
        L39c:
            r1.e = r3
            qs0 r2 = new qs0
            r2.<init>()
            r1.d = r2
            java.lang.Object r2 = r1.e
            cy r2 = (defpackage.cy) r2
            qv6 r3 = r2.a
            qv6 r4 = r2.b
            java.util.ArrayList r2 = r2.c
            int r5 = r2.size()
            r9 = 0
        L3b4:
            if (r9 >= r5) goto L44b
            java.lang.Object r10 = r2.get(r9)
            int r9 = r9 + 1
            ay r10 = (defpackage.ay) r10
            java.lang.Object r12 = r1.d
            qs0 r12 = (defpackage.qs0) r12
            ry r13 = r10.a
            android.graphics.Rect r15 = r13.d
            r16 = r2
            int r2 = r13.f
            r39 = r5
            boolean r5 = r13.g
            r40 = r8
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r41 = r9
            android.graphics.Matrix r9 = r3.b
            r8.<init>(r9)
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r15)
            r17 = r15
            android.util.Size r15 = r13.e
            android.graphics.RectF r14 = defpackage.k97.h(r15)
            android.graphics.Matrix r9 = defpackage.k97.a(r9, r14, r2, r5)
            r8.postConcat(r9)
            android.util.Size r9 = defpackage.k97.f(r17)
            android.util.Size r9 = defpackage.k97.g(r2, r9)
            boolean r9 = defpackage.k97.d(r9, r15)
            defpackage.np2.t(r9)
            android.graphics.Rect r9 = new android.graphics.Rect
            int r14 = r15.getWidth()
            r17 = r2
            int r2 = r15.getHeight()
            r31 = r8
            r8 = 0
            r9.<init>(r8, r8, r14, r2)
            yy r2 = r3.g
            p87 r2 = r2.b()
            r2.a = r15
            yy r30 = r2.a()
            qv6 r27 = new qv6
            int r2 = r13.b
            int r8 = r13.c
            int r13 = r3.i
            int r34 = r13 - r17
            boolean r13 = r3.e
            if (r13 == r5) goto L42b
            r36 = 1
            goto L42d
        L42b:
            r36 = 0
        L42d:
            r32 = 0
            r35 = -1
            r28 = r2
            r29 = r8
            r33 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r2 = r27
            r12.put(r10, r2)
            r14 = r38
            r5 = r39
            r8 = r40
            r9 = r41
            r2 = r16
            goto L3b4
        L44b:
            r40 = r8
            r2 = 1
            bw6 r2 = r3.c(r2)
            r7.a(r2)
            r9 = 0
            bw6 r2 = r4.c(r9)
            r7.a(r2)
            java.lang.Object r2 = r1.b
            r17 = r2
            eg0 r17 = (defpackage.eg0) r17
            java.lang.Object r2 = r1.c
            r18 = r2
            eg0 r18 = (defpackage.eg0) r18
            java.lang.Object r2 = r1.d
            qs0 r2 = (defpackage.qs0) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L475:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L4c5
            java.lang.Object r5 = r2.next()
            r21 = r5
            java.util.Map$Entry r21 = (java.util.Map.Entry) r21
            r16 = r1
            r19 = r3
            r20 = r4
            r16.r(r17, r18, r19, r20, r21)
            java.lang.Object r1 = r21.getValue()
            qv6 r1 = (defpackage.qv6) r1
            r22 = r21
            r21 = r20
            r20 = r19
            r19 = r18
            r18 = r17
            r17 = r16
            r30 r16 = new r30
            r23 = 1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r4 = r16
            r3 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r1.getClass()
            defpackage.nj2.h()
            r1.a()
            java.util.HashSet r1 = r1.m
            r1.add(r4)
            r1 = r3
            r3 = r19
            r4 = r20
            goto L475
        L4c5:
            r3 = r1
            java.lang.Object r1 = r3.d
            qs0 r1 = (defpackage.qs0) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r40.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L4d7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4f7
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            di7 r5 = (defpackage.di7) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.Object r4 = r1.get(r4)
            qv6 r4 = (defpackage.qv6) r4
            r2.put(r5, r4)
            goto L4d7
        L4f7:
            java.util.HashMap r1 = r0.u(r11, r6)
            r0.x(r2, r1)
            r14 = r38
            lc6 r0 = r14.A
            rc6 r0 = r0.c()
            lc6 r1 = r14.B
            rc6 r1 = r1.c()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 2
            r1.<init>(r3)
            r15 = r9
        L517:
            if (r15 >= r3) goto L524
            r2 = r0[r15]
            java.util.Objects.requireNonNull(r2)
            r1.add(r2)
            int r15 = r15 + 1
            goto L517
        L524:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            return r0
    }

    public final defpackage.qv6 I(java.lang.String r11, java.lang.String r12, defpackage.zi7 r13, defpackage.yy r14, defpackage.yy r15) {
            r10 = this;
            qv6 r0 = new qv6
            android.graphics.Matrix r4 = r10.l
            eg0 r1 = r10.d()
            java.util.Objects.requireNonNull(r1)
            boolean r5 = r1.o()
            android.util.Size r1 = r14.a
            android.graphics.Rect r2 = r10.k
            r6 = 0
            if (r2 == 0) goto L17
            goto L24
        L17:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r7 = r1.getWidth()
            int r1 = r1.getHeight()
            r2.<init>(r6, r6, r7, r1)
        L24:
            eg0 r1 = r10.d()
            java.util.Objects.requireNonNull(r1)
            int r7 = r10.i(r1, r6)
            eg0 r1 = r10.d()
            java.util.Objects.requireNonNull(r1)
            boolean r9 = r10.o(r1)
            r1 = 3
            r6 = r2
            r2 = 34
            r8 = -1
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.w = r0
            eg0 r1 = r10.d()
            java.util.Objects.requireNonNull(r1)
            r10.y = r0
            qv6 r0 = r10.w
            lc6 r7 = r10.J(r0, r13, r14)
            r10.A = r7
            mc6 r0 = r10.C
            if (r0 == 0) goto L5d
            r0.b()
        L5d:
            mc6 r8 = new mc6
            or6 r0 = new or6
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.<init>(r0)
            r10.C = r8
            r7.f = r8
            qv6 r10 = r10.y
            return r10
    }

    public final defpackage.lc6 J(defpackage.qv6 r12, defpackage.zi7 r13, defpackage.yy r14) {
            r11 = this;
            android.util.Size r0 = r14.a
            lc6 r13 = defpackage.lc6.d(r13, r0)
            dk0 r0 = r13.b
            mq7 r1 = r11.r
            java.util.HashSet r2 = r1.A
            java.util.Iterator r2 = r2.iterator()
            r3 = -1
            r4 = r3
        L12:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r2.next()
            di7 r5 = (defpackage.di7) r5
            zi7 r5 = r5.h
            xx r6 = defpackage.zi7.G
            java.lang.Object r5 = r5.e(r6)
            rc6 r5 = (defpackage.rc6) r5
            ek0 r5 = r5.g
            int r5 = r5.c
            java.util.List r6 = defpackage.rc6.j
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            int r7 = r6.indexOf(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            int r6 = r6.indexOf(r8)
            if (r7 < r6) goto L41
            goto L12
        L41:
            r4 = r5
            goto L12
        L43:
            if (r4 == r3) goto L47
            r0.L = r4
        L47:
            android.util.Size r2 = r14.a
            java.util.HashSet r4 = r1.A
            java.util.Iterator r4 = r4.iterator()
        L4f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld2
            java.lang.Object r5 = r4.next()
            di7 r5 = (defpackage.di7) r5
            zi7 r5 = r5.h
            lc6 r5 = defpackage.lc6.d(r5, r2)
            rc6 r5 = r5.c()
            ek0 r6 = r5.g
            java.util.List r7 = r6.d
            r0.c(r7)
            java.util.List r7 = r5.e
            java.util.ArrayList r8 = r13.e
            java.util.Iterator r7 = r7.iterator()
        L74:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r7.next()
            be0 r9 = (defpackage.be0) r9
            r0.d(r9)
            boolean r10 = r8.contains(r9)
            if (r10 != 0) goto L74
            r8.add(r9)
            goto L74
        L8d:
            java.util.List r7 = r5.d
            java.util.Iterator r7 = r7.iterator()
        L93:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lac
            java.lang.Object r8 = r7.next()
            android.hardware.camera2.CameraCaptureSession$StateCallback r8 = (android.hardware.camera2.CameraCaptureSession.StateCallback) r8
            java.util.ArrayList r9 = r13.d
            boolean r10 = r9.contains(r8)
            if (r10 == 0) goto La8
            goto L93
        La8:
            r9.add(r8)
            goto L93
        Lac:
            java.util.List r5 = r5.c
            java.util.Iterator r5 = r5.iterator()
        Lb2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lcb
            java.lang.Object r7 = r5.next()
            android.hardware.camera2.CameraDevice$StateCallback r7 = (android.hardware.camera2.CameraDevice.StateCallback) r7
            java.util.ArrayList r8 = r13.c
            boolean r9 = r8.contains(r7)
            if (r9 == 0) goto Lc7
            goto Lb2
        Lc7:
            r8.add(r7)
            goto Lb2
        Lcb:
            go4 r5 = r6.b
            r0.e(r5)
            goto L4f
        Ld2:
            r12.getClass()
            defpackage.nj2.h()
            r12.a()
            boolean r2 = r12.j
            r4 = 1
            r2 = r2 ^ r4
            java.lang.String r5 = "Consumer can only be linked once."
            defpackage.np2.A(r5, r2)
            r12.j = r4
            pv6 r12 = r12.l
            yq1 r2 = r14.c
            r13.b(r12, r2, r3)
            ce0 r12 = r1.d0
            r0.d(r12)
            yy0 r12 = r14.f
            if (r12 == 0) goto Lf9
            r0.e(r12)
        Lf9:
            int r12 = r14.d
            r13.h = r12
            r11.a(r13, r14)
            return r13
    }

    @Override // defpackage.di7
    public final defpackage.zi7 g(boolean r4, defpackage.cj7 r5) {
            r3 = this;
            qr6 r0 = r3.q
            bj7 r1 = r0.x()
            r2 = 1
            yy0 r5 = r5.a(r1, r2)
            if (r4 == 0) goto L13
            go4 r4 = r0.A
            go4 r5 = defpackage.yy0.t(r5, r4)
        L13:
            if (r5 != 0) goto L17
            r3 = 0
            return r3
        L17:
            yi7 r3 = r3.m(r5)
            jd0 r3 = (defpackage.jd0) r3
            zi7 r3 = r3.h()
            return r3
    }

    @Override // defpackage.di7
    public final java.util.Set k(defpackage.cg0 r3) {
            r2 = this;
            mq7 r2 = r2.r
            java.util.HashSet r2 = r2.A
            boolean r0 = r2.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            di7 r0 = (defpackage.di7) r0
            java.util.Set r0 = r0.k(r3)
            if (r0 != 0) goto L23
            goto L10
        L23:
            if (r1 != 0) goto L2b
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            goto L10
        L2b:
            r1.retainAll(r0)
            goto L10
        L2f:
            return r1
    }

    @Override // defpackage.di7
    public final java.util.Set l() {
            r1 = this;
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            return r1
    }

    @Override // defpackage.di7
    public final defpackage.yi7 m(defpackage.yy0 r2) {
            r1 = this;
            jd0 r1 = new jd0
            da4 r2 = defpackage.da4.k(r2)
            r0 = 6
            r1.<init>(r2, r0)
            return r1
    }

    @Override // defpackage.di7
    public final void t() {
            r5 = this;
            mq7 r5 = r5.r
            java.util.HashSet r0 = r5.A
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            di7 r1 = (defpackage.di7) r1
            java.util.HashMap r2 = r5.L
            java.lang.Object r2 = r2.get(r1)
            lq7 r2 = (defpackage.lq7) r2
            java.util.Objects.requireNonNull(r2)
            r3 = 1
            cj7 r4 = r5.X
            zi7 r3 = r1.g(r3, r4)
            r4 = 0
            r1.b(r2, r4, r4, r3)
            goto L8
        L2b:
            return
    }

    @Override // defpackage.di7
    public final void u() {
            r1 = this;
            mq7 r1 = r1.r
            java.util.HashSet r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            di7 r0 = (defpackage.di7) r0
            r0.u()
            goto L8
        L18:
            return
    }

    @Override // defpackage.di7
    public final defpackage.zi7 v(defpackage.cg0 r18, defpackage.yi7 r19) {
            r17 = this;
            da4 r0 = r19.f()
            r1 = r17
            mq7 r1 = r1.r
            java.util.HashSet r2 = r1.e0
            gl5 r3 = r1.g0
            cg0 r4 = r3.f
            r5 = 34
            java.util.List r4 = r4.t(r5)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.util.HashSet r8 = r3.d
            java.util.Iterator r9 = r8.iterator()
        L1f:
            boolean r10 = r9.hasNext()
            r11 = 0
            if (r10 == 0) goto L4c
            java.lang.Object r10 = r9.next()
            zi7 r10 = (defpackage.zi7) r10
            xx r12 = defpackage.zi7.S
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Object r12 = r10.b(r12, r13)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L3d
            goto L1f
        L3d:
            boolean r12 = r10 instanceof defpackage.n23
            if (r12 == 0) goto L1f
            n23 r10 = (defpackage.n23) r10
            xx r12 = defpackage.n23.w
            java.lang.Object r10 = r10.b(r12, r11)
            el5 r10 = (defpackage.el5) r10
            goto L1f
        L4c:
            xx r9 = defpackage.n23.v
            java.lang.Object r9 = r0.b(r9, r11)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L82
            java.util.Iterator r4 = r9.iterator()
        L5a:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L7d
            java.lang.Object r9 = r4.next()
            android.util.Pair r9 = (android.util.Pair) r9
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L5a
            java.lang.Object r4 = r9.second
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.util.List r4 = java.util.Arrays.asList(r4)
            goto L82
        L7d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L82:
            android.util.Rational r5 = r3.c
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.Iterator r12 = r8.iterator()
        L92:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto La6
            java.lang.Object r13 = r12.next()
            zi7 r13 = (defpackage.zi7) r13
            java.util.List r13 = r3.c(r13)
            r10.addAll(r13)
            goto L92
        La6:
            java.util.Iterator r10 = r10.iterator()
        Laa:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lc5
            java.lang.Object r12 = r10.next()
            android.util.Size r12 = (android.util.Size) r12
            boolean r12 = defpackage.mv.a(r5, r12)
            if (r12 != 0) goto Laa
            android.util.Rational r10 = r3.b
            java.util.ArrayList r10 = r3.g(r10, r4, r6)
            r9.addAll(r10)
        Lc5:
            int r10 = r9.size()
            boolean r12 = r8.isEmpty()
            r13 = 1
            if (r12 == 0) goto Ld3
            r17 = r11
            goto L11a
        Ld3:
            java.util.Iterator r8 = r8.iterator()
        Ld7:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L117
            java.lang.Object r12 = r8.next()
            zi7 r12 = (defpackage.zi7) r12
            java.util.List r12 = r3.c(r12)
            java.util.Iterator r12 = r12.iterator()
            r14 = r6
            r15 = r14
        Led:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L10f
            java.lang.Object r16 = r12.next()
            r17 = r11
            r11 = r16
            android.util.Size r11 = (android.util.Size) r11
            boolean r11 = defpackage.mv.a(r5, r11)
            if (r11 == 0) goto L104
            r14 = r13
        L104:
            if (r15 == 0) goto L109
            if (r11 == 0) goto L109
            goto L11a
        L109:
            if (r11 != 0) goto L10c
            r15 = r13
        L10c:
            r11 = r17
            goto Led
        L10f:
            r17 = r11
            if (r14 != 0) goto L114
            goto L11a
        L114:
            r11 = r17
            goto Ld7
        L117:
            r17 = r11
            r10 = r6
        L11a:
            java.util.ArrayList r5 = r3.g(r5, r4, r6)
            r9.addAll(r10, r5)
            java.util.ArrayList r5 = r3.f(r4, r6)
            r9.addAll(r5)
            boolean r5 = r9.isEmpty()
            java.lang.String r8 = "ResolutionsMerger"
            if (r5 == 0) goto L13c
            java.lang.String r5 = "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV."
            defpackage.kj2.f0(r8, r5)
            java.util.ArrayList r3 = r3.f(r4, r13)
            r9.addAll(r3)
        L13c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Parent resolutions: "
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            defpackage.kj2.t(r8, r3)
            xx r3 = defpackage.n23.x
            r0.m(r3, r9)
            xx r3 = defpackage.zi7.K
            java.util.Iterator r4 = r2.iterator()
            r5 = r6
        L159:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L176
            java.lang.Object r8 = r4.next()
            zi7 r8 = (defpackage.zi7) r8
            xx r9 = defpackage.zi7.K
            java.lang.Object r8 = r8.b(r9, r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r5 = java.lang.Math.max(r5, r8)
            goto L159
        L176:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.m(r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L186:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1a3
            java.lang.Object r5 = r4.next()
            zi7 r5 = (defpackage.zi7) r5
            xx r8 = defpackage.j23.n
            yq1 r9 = defpackage.yq1.c
            java.lang.Object r5 = r5.b(r8, r9)
            yq1 r5 = (defpackage.yq1) r5
            r5.getClass()
            r3.add(r5)
            goto L186
        L1a3:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L1ab
            goto L231
        L1ab:
            java.lang.Object r4 = r3.get(r6)
            yq1 r4 = (defpackage.yq1) r4
            int r5 = r4.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r4 = r4.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = r13
        L1be:
            int r8 = r3.size()
            if (r6 >= r8) goto L234
            java.lang.Object r8 = r3.get(r6)
            yq1 r8 = (defpackage.yq1) r8
            int r9 = r8.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r11 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r12 = r5.equals(r7)
            if (r12 == 0) goto L1e1
        L1df:
            r5 = r9
            goto L20b
        L1e1:
            boolean r12 = r9.equals(r7)
            if (r12 == 0) goto L1e8
            goto L20b
        L1e8:
            boolean r12 = r5.equals(r11)
            if (r12 == 0) goto L1f5
            boolean r12 = r9.equals(r10)
            if (r12 != 0) goto L1f5
            goto L1df
        L1f5:
            boolean r11 = r9.equals(r11)
            if (r11 == 0) goto L202
            boolean r10 = r5.equals(r10)
            if (r10 != 0) goto L202
            goto L20b
        L202:
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L209
            goto L20b
        L209:
            r5 = r17
        L20b:
            int r8 = r8.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r9 = r4.equals(r7)
            if (r9 == 0) goto L219
            r4 = r8
            goto L229
        L219:
            boolean r9 = r8.equals(r7)
            if (r9 == 0) goto L220
            goto L229
        L220:
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L227
            goto L229
        L227:
            r4 = r17
        L229:
            if (r5 == 0) goto L231
            if (r4 != 0) goto L22e
            goto L231
        L22e:
            int r6 = r6 + 1
            goto L1be
        L231:
            r3 = r17
            goto L241
        L234:
            yq1 r3 = new yq1
            int r5 = r5.intValue()
            int r4 = r4.intValue()
            r3.<init>(r5, r4)
        L241:
            if (r3 == 0) goto L2e1
            xx r4 = defpackage.j23.n
            r0.m(r4, r3)
            xx r3 = defpackage.zi7.N
            android.util.Range r4 = defpackage.yy.h
            java.util.Iterator r2 = r2.iterator()
        L250:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L295
            java.lang.Object r5 = r2.next()
            zi7 r5 = (defpackage.zi7) r5
            xx r6 = defpackage.zi7.N
            java.lang.Object r5 = r5.b(r6, r4)
            android.util.Range r5 = (android.util.Range) r5
            java.util.Objects.requireNonNull(r5)
            android.util.Range r6 = defpackage.yy.h
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L271
            r4 = r5
            goto L250
        L271:
            android.util.Range r4 = r4.intersect(r5)     // Catch: java.lang.IllegalArgumentException -> L276
            goto L250
        L276:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: "
            r2.<init>(r6)
            r2.append(r4)
            java.lang.String r6 = " <<>> "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "VirtualCameraAdapter"
            defpackage.kj2.t(r6, r2)
            android.util.Range r4 = r4.extend(r5)
        L295:
            r0.m(r3, r4)
            java.util.HashSet r2 = r1.A
            java.util.Iterator r2 = r2.iterator()
        L29e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2dc
            java.lang.Object r3 = r2.next()
            di7 r3 = (defpackage.di7) r3
            java.util.HashMap r4 = r1.f0
            java.lang.Object r3 = r4.get(r3)
            zi7 r3 = (defpackage.zi7) r3
            java.util.Objects.requireNonNull(r3)
            int r4 = r3.y()
            if (r4 == 0) goto L2c8
            xx r4 = defpackage.zi7.V
            int r5 = r3.y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.m(r4, r5)
        L2c8:
            int r4 = r3.E()
            if (r4 == 0) goto L29e
            xx r4 = defpackage.zi7.U
            int r3 = r3.E()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.m(r4, r3)
            goto L29e
        L2dc:
            zi7 r0 = r19.h()
            return r0
        L2e1:
            java.lang.String r0 = "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."
            defpackage.i.h(r0)
            return r17
    }

    @Override // defpackage.di7
    public final void w() {
            r1 = this;
            mq7 r1 = r1.r
            java.util.HashSet r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            di7 r0 = (defpackage.di7) r0
            r0.w()
            goto L8
        L18:
            return
    }

    @Override // defpackage.di7
    public final void x() {
            r1 = this;
            mq7 r1 = r1.r
            java.util.HashSet r1 = r1.A
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            di7 r0 = (defpackage.di7) r0
            r0.x()
            goto L8
        L18:
            return
    }

    @Override // defpackage.di7
    public final defpackage.yy y(defpackage.yy0 r4) {
            r3 = this;
            lc6 r0 = r3.A
            r0.a(r4)
            lc6 r0 = r3.A
            rc6 r0 = r0.c()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r2 = 0
            r0 = r0[r2]
            java.util.Objects.requireNonNull(r0)
            r1.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            r3.E(r0)
            yy r3 = r3.i
            p87 r3 = r3.b()
            r3.f = r4
            yy r3 = r3.a()
            return r3
    }

    @Override // defpackage.di7
    public final defpackage.yy z(defpackage.yy r9, defpackage.yy r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSuggestedStreamSpecUpdated: primaryStreamSpec = "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", secondaryStreamSpec "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StreamSharing"
            defpackage.kj2.t(r1, r0)
            java.lang.String r3 = r8.f()
            eg0 r0 = r8.j()
            if (r0 != 0) goto L28
            r0 = 0
        L26:
            r4 = r0
            goto L35
        L28:
            eg0 r0 = r8.j()
            cg0 r0 = r0.q()
            java.lang.String r0 = r0.d()
            goto L26
        L35:
            zi7 r5 = r8.h
            r2 = r8
            r6 = r9
            r7 = r10
            java.util.List r8 = r2.H(r3, r4, r5, r6, r7)
            r2.E(r8)
            r2.q()
            return r6
    }
}
