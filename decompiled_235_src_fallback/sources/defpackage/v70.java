package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v70  reason: default package */
/* loaded from: classes.dex */
public final class v70 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;

    public /* synthetic */ v70(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    public v70(java.util.List r2, java.util.List r3, defpackage.tz5 r4, defpackage.gn6 r5, defpackage.hn6 r6, defpackage.r41 r7) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.Y = r2
            r1.Z = r3
            r1.d0 = r4
            r1.e0 = r5
            r1.f0 = r6
            r1.<init>(r0, r7)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L20;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            v70 r2 = (defpackage.v70) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            v70 r2 = (defpackage.v70) r2
            r2.s(r1)
            return r1
        L20:
            r41 r2 = r2.q(r4, r3)
            v70 r2 = (defpackage.v70) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.X
            java.lang.Object r1 = r13.f0
            java.lang.Object r2 = r13.e0
            java.lang.Object r3 = r13.d0
            java.lang.Object r4 = r13.Z
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L25;
                default: goto Ld;
            }
        Ld:
            v70 r5 = new v70
            java.lang.Object r13 = r13.Y
            r6 = r13
            java.util.List r6 = (java.util.List) r6
            r7 = r4
            java.util.List r7 = (java.util.List) r7
            r8 = r3
            tz5 r8 = (defpackage.tz5) r8
            r9 = r2
            gn6 r9 = (defpackage.gn6) r9
            r10 = r1
            hn6 r10 = (defpackage.hn6) r10
            r11 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L25:
            r11 = r14
            v70 r6 = new v70
            r7 = r4
            nv4 r7 = (defpackage.nv4) r7
            r8 = r3
            sz1 r8 = (defpackage.sz1) r8
            r9 = r2
            pq5 r9 = (defpackage.pq5) r9
            r10 = r1
            v80 r10 = (defpackage.v80) r10
            r12 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6.Y = r15
            return r6
        L3b:
            r11 = r14
            v70 r6 = new v70
            r7 = r4
            w70 r7 = (defpackage.w70) r7
            r8 = r3
            eg4 r8 = (defpackage.eg4) r8
            r9 = r2
            le r9 = (defpackage.le) r9
            r10 = r1
            u6 r10 = (defpackage.u6) r10
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6.Y = r15
            return r6
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r30) {
            r29 = this;
            r0 = r29
            int r1 = r0.X
            java.lang.Object r2 = r0.f0
            java.lang.Object r4 = r0.Z
            java.lang.Object r5 = r0.d0
            java.lang.Object r6 = r0.e0
            switch(r1) {
                case 0: goto L407;
                case 1: goto L3d1;
                default: goto Lf;
            }
        Lf:
            gn6 r6 = (defpackage.gn6) r6
            tz5 r5 = (defpackage.tz5) r5
            java.util.List r4 = (java.util.List) r4
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r30)
            java.lang.Object r0 = r0.Y
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r0.iterator()
        L27:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L42
            java.lang.Object r9 = r8.next()
            r10 = r9
            kz5 r10 = (defpackage.kz5) r10
            pq5 r10 = r10.a
            java.lang.String r10 = r10.i
            int r10 = r10.length()
            if (r10 <= 0) goto L27
            r1.add(r9)
            goto L27
        L42:
            r8 = 10
            int r9 = defpackage.ht0.v0(r1, r8)
            int r9 = defpackage.c14.k0(r9)
            r10 = 16
            if (r9 >= r10) goto L51
            r9 = r10
        L51:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r9)
            int r9 = r1.size()
            r12 = 0
        L5b:
            if (r12 >= r9) goto L82
            java.lang.Object r13 = r1.get(r12)
            int r12 = r12 + 1
            kz5 r13 = (defpackage.kz5) r13
            pq5 r14 = r13.a
            java.lang.String r14 = r14.a
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            r14.getClass()
            java.lang.CharSequence r14 = defpackage.qs6.T0(r14)
            java.lang.String r14 = r14.toString()
            pq5 r13 = r13.a
            java.lang.String r13 = r13.i
            r11.put(r14, r13)
            goto L5b
        L82:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r0.iterator()
        L8b:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto La6
            java.lang.Object r12 = r9.next()
            r13 = r12
            kz5 r13 = (defpackage.kz5) r13
            pq5 r13 = r13.a
            java.lang.String r13 = r13.i
            int r13 = r13.length()
            if (r13 <= 0) goto L8b
            r1.add(r12)
            goto L8b
        La6:
            int r9 = defpackage.ht0.v0(r1, r8)
            int r9 = defpackage.c14.k0(r9)
            if (r9 >= r10) goto Lb1
            r9 = r10
        Lb1:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r9)
            int r9 = r1.size()
            r13 = 0
        Lbb:
            r14 = 46
            if (r13 >= r9) goto Le8
            java.lang.Object r15 = r1.get(r13)
            int r13 = r13 + 1
            kz5 r15 = (defpackage.kz5) r15
            pq5 r3 = r15.a
            java.lang.String r3 = r3.c
            java.lang.String r3 = defpackage.qs6.R0(r14, r3, r3)
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r14)
            r3.getClass()
            java.lang.CharSequence r3 = defpackage.qs6.T0(r3)
            java.lang.String r3 = r3.toString()
            pq5 r14 = r15.a
            java.lang.String r14 = r14.i
            r12.put(r3, r14)
            goto Lbb
        Le8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r4.iterator()
        Lf1:
            boolean r9 = r3.hasNext()
            r13 = 8
            if (r9 == 0) goto L12c
            java.lang.Object r9 = r3.next()
            kz5 r9 = (defpackage.kz5) r9
            pq5 r9 = r9.a
            java.lang.Long r9 = r9.l
            if (r9 == 0) goto L123
            long r7 = r9.longValue()
            defpackage.g04.y(r10)
            java.lang.String r7 = java.lang.Long.toString(r7, r10)
            r7.getClass()
            java.lang.String r7 = defpackage.qs6.B0(r13, r7)
            if (r7 == 0) goto L123
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r15 = r7.toLowerCase(r8)
            r15.getClass()
            goto L124
        L123:
            r15 = 0
        L124:
            if (r15 == 0) goto L129
            r1.add(r15)
        L129:
            r8 = 10
            goto Lf1
        L12c:
            java.util.Set r1 = defpackage.gt0.p1(r1)
            java.lang.String r3 = "^[0-9a-fA-F]{8}$"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L142:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L1ac
            java.lang.Object r9 = r8.next()
            r13 = r9
            kz5 r13 = (defpackage.kz5) r13
            pq5 r13 = r13.a
            r16 = r10
            java.lang.String r10 = r13.c
            java.lang.String r10 = defpackage.qs6.R0(r14, r10, r10)
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r14)
            r10.getClass()
            java.lang.CharSequence r10 = defpackage.qs6.T0(r10)
            java.lang.String r10 = r10.toString()
            java.lang.String r13 = r13.a
            java.lang.String r13 = r13.toLowerCase(r14)
            r13.getClass()
            java.lang.CharSequence r13 = defpackage.qs6.T0(r13)
            java.lang.String r13 = r13.toString()
            r10.getClass()
            java.util.regex.Matcher r14 = r3.matcher(r10)
            boolean r14 = r14.matches()
            if (r14 != 0) goto L1a5
            r13.getClass()
            java.util.regex.Matcher r14 = r3.matcher(r13)
            boolean r14 = r14.matches()
            if (r14 == 0) goto L196
            goto L1a5
        L196:
            boolean r10 = r1.contains(r10)
            if (r10 != 0) goto L1a5
            boolean r10 = r1.contains(r13)
            if (r10 != 0) goto L1a5
            r7.add(r9)
        L1a5:
            r10 = r16
            r13 = 8
            r14 = 46
            goto L142
        L1ac:
            r16 = r10
            xh5 r1 = defpackage.tz5.L
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r8 = defpackage.ht0.v0(r0, r3)
            r1.<init>(r8)
            java.util.Iterator r0 = r0.iterator()
        L1bf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1d1
            java.lang.Object r3 = r0.next()
            kz5 r3 = (defpackage.kz5) r3
            pq5 r3 = r3.a
            r1.add(r3)
            goto L1bf
        L1d1:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r1.size()
            r8 = 0
        L1db:
            r9 = 1
            if (r8 >= r3) goto L220
            java.lang.Object r10 = r1.get(r8)
            int r8 = r8 + 1
            r13 = r10
            pq5 r13 = (defpackage.pq5) r13
            boolean r14 = r13.h
            android.net.Uri r15 = r13.d
            if (r14 != 0) goto L206
            java.lang.String r14 = r13.c
            r18 = r1
            java.lang.String r1 = ".dsi"
            boolean r14 = defpackage.xs6.Y(r14, r1, r9)
            if (r14 != 0) goto L208
            java.lang.String r14 = r15.getPath()
            if (r14 == 0) goto L21d
            boolean r1 = defpackage.xs6.Y(r14, r1, r9)
            if (r1 != r9) goto L21d
            goto L208
        L206:
            r18 = r1
        L208:
            boolean r1 = r13.c()
            if (r1 != 0) goto L21d
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r5.K
            java.lang.String r9 = r15.toString()
            boolean r1 = r1.contains(r9)
            if (r1 != 0) goto L21d
            r0.add(r10)
        L21d:
            r1 = r18
            goto L1db
        L220:
            boolean r1 = r0.isEmpty()
            r3 = 2
            if (r1 == 0) goto L229
            r14 = 0
            goto L23b
        L229:
            as0 r1 = defpackage.to7.a(r5)
            xe1 r8 = defpackage.xk1.a
            de1 r8 = defpackage.de1.L
            m7 r10 = new m7
            r13 = 3
            r14 = 0
            r10.<init>(r5, r0, r14, r13)
            defpackage.hv.L(r1, r8, r14, r10, r3)
        L23b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.size()
            r5 = 0
        L245:
            if (r5 >= r1) goto L259
            java.lang.Object r8 = r7.get(r5)
            int r5 = r5 + 1
            kz5 r8 = (defpackage.kz5) r8
            pq5 r8 = r8.a
            java.lang.Long r8 = r8.l
            if (r8 == 0) goto L245
            r0.add(r8)
            goto L245
        L259:
            java.util.Set r0 = defpackage.gt0.p1(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r4, r5)
            r1.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L26c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L344
            java.lang.Object r5 = r4.next()
            kz5 r5 = (defpackage.kz5) r5
            pq5 r8 = r5.a
            java.lang.Long r10 = r8.l
            java.lang.String r13 = r8.i
            if (r10 == 0) goto L2a2
            long r14 = r10.longValue()
            defpackage.g04.y(r16)
            r10 = r16
            java.lang.String r14 = java.lang.Long.toString(r14, r10)
            r14.getClass()
            r15 = 8
            java.lang.String r14 = defpackage.qs6.B0(r15, r14)
            if (r14 == 0) goto L2a4
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r10 = r14.toLowerCase(r10)
            r10.getClass()
            goto L2a5
        L2a2:
            r15 = 8
        L2a4:
            r10 = 0
        L2a5:
            int r14 = r13.length()
            if (r14 <= 0) goto L2ad
            r14 = r13
            goto L2ae
        L2ad:
            r14 = 0
        L2ae:
            if (r14 != 0) goto L2d7
            java.lang.Object r10 = r12.get(r10)
            r14 = r10
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L2d7
            java.lang.String r10 = r8.a
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r14)
            r10.getClass()
            java.lang.CharSequence r10 = defpackage.qs6.T0(r10)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r11.get(r10)
            r14 = r10
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L2d7
            java.lang.String r14 = ""
        L2d7:
            int r10 = r14.length()
            if (r10 <= 0) goto L33b
            boolean r10 = r14.equals(r13)
            if (r10 != 0) goto L33b
            r27 = 0
            r28 = 7935(0x1eff, float:1.112E-41)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r17 = r8
            r23 = r14
            pq5 r8 = defpackage.pq5.a(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
            xh5 r10 = defpackage.tz5.L
            java.lang.String r10 = defpackage.hf.k0(r8)
            java.lang.String r10 = defpackage.ej2.M(r10)
            java.lang.String r13 = r8.a
            java.lang.String r13 = defpackage.ej2.M(r13)
            java.lang.String r14 = r8.c
            java.lang.String r14 = defpackage.ej2.M(r14)
            java.lang.String r15 = r8.b
            java.lang.String r15 = defpackage.ej2.M(r15)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            java.lang.String r10 = "\u0000"
            r3.append(r10)
            r3.append(r13)
            r3.append(r10)
            r3.append(r14)
            java.lang.String r3 = defpackage.i61.n(r3, r10, r15)
            java.lang.String r5 = r5.b
            kz5 r10 = new kz5
            r10.<init>(r8, r5, r3)
            r5 = r10
        L33b:
            r1.add(r5)
            r3 = 2
            r14 = 0
            r16 = 16
            goto L26c
        L344:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.size()
            r5 = 0
        L34e:
            if (r5 >= r4) goto L36a
            java.lang.Object r8 = r1.get(r5)
            int r5 = r5 + 1
            r10 = r8
            kz5 r10 = (defpackage.kz5) r10
            r11 = r0
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            pq5 r10 = r10.a
            java.lang.Long r10 = r10.l
            boolean r10 = defpackage.gt0.C0(r11, r10)
            if (r10 != 0) goto L34e
            r3.add(r8)
            goto L34e
        L36a:
            java.util.ArrayList r1 = defpackage.gt0.V0(r7, r3)
            hn6 r2 = (defpackage.hn6) r2
            int[] r0 = defpackage.mz5.c     // Catch: java.lang.Throwable -> L393
            int r3 = r6.ordinal()     // Catch: java.lang.Throwable -> L393
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L393
            if (r0 == r9) goto L3a4
            r3 = 2
            if (r0 == r3) goto L395
            r13 = 3
            if (r0 != r13) goto L38d
            hn6 r0 = defpackage.hn6.ASCENDING     // Catch: java.lang.Throwable -> L393
            su0 r3 = new su0     // Catch: java.lang.Throwable -> L393
            r3.<init>(r0, r13)     // Catch: java.lang.Throwable -> L393
            az5 r0 = new az5     // Catch: java.lang.Throwable -> L393
            r0.<init>(r2, r3, r9)     // Catch: java.lang.Throwable -> L393
            goto L3aa
        L38d:
            ug r0 = new ug     // Catch: java.lang.Throwable -> L393
            r0.<init>()     // Catch: java.lang.Throwable -> L393
            throw r0     // Catch: java.lang.Throwable -> L393
        L393:
            r0 = move-exception
            goto L3bc
        L395:
            hn6 r0 = defpackage.hn6.ASCENDING     // Catch: java.lang.Throwable -> L393
            su0 r3 = new su0     // Catch: java.lang.Throwable -> L393
            r13 = 3
            r3.<init>(r0, r13)     // Catch: java.lang.Throwable -> L393
            az5 r0 = new az5     // Catch: java.lang.Throwable -> L393
            r4 = 0
            r0.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L393
            goto L3aa
        L3a4:
            su0 r0 = new su0     // Catch: java.lang.Throwable -> L393
            r13 = 3
            r0.<init>(r2, r13)     // Catch: java.lang.Throwable -> L393
        L3aa:
            z5 r2 = new z5     // Catch: java.lang.Throwable -> L393
            r3 = 27
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L393
            su0 r0 = new su0     // Catch: java.lang.Throwable -> L393
            r3 = 2
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L393
            java.util.List r0 = defpackage.gt0.d1(r1, r0)     // Catch: java.lang.Throwable -> L393
            goto L3c2
        L3bc:
            em5 r2 = new em5
            r2.<init>(r0)
            r0 = r2
        L3c2:
            java.lang.Throwable r2 = defpackage.hm5.a(r0)
            if (r2 != 0) goto L3c9
            r1 = r0
        L3c9:
            java.util.List r1 = (java.util.List) r1
            vr4 r0 = new vr4
            r0.<init>(r1, r6)
            return r0
        L3d1:
            java.lang.Object r0 = r0.Y
            w61 r0 = (defpackage.w61) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r30)
            b0 r7 = new b0
            r8 = r4
            nv4 r8 = (defpackage.nv4) r8
            r9 = r5
            sz1 r9 = (defpackage.sz1) r9
            r10 = r6
            pq5 r10 = (defpackage.pq5) r10
            r12 = 29
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r13 = 3
            defpackage.hv.L(r0, r11, r11, r7, r13)
            hz1 r1 = new hz1
            r3 = 13
            r1.<init>(r3, r11, r9)
            defpackage.hv.L(r0, r11, r11, r1, r13)
            u12 r1 = new u12
            v80 r2 = (defpackage.v80) r2
            r4 = 0
            r1.<init>(r2, r9, r11, r4)
            defpackage.hv.L(r0, r11, r11, r1, r13)
            jg7 r0 = defpackage.jg7.a
            return r0
        L407:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r30)
            java.lang.Object r0 = r0.Y
            w61 r0 = (defpackage.w61) r0
            b0 r7 = new b0
            r8 = r4
            w70 r8 = (defpackage.w70) r8
            r9 = r5
            eg4 r9 = (defpackage.eg4) r9
            r10 = r6
            le r10 = (defpackage.le) r10
            r12 = 8
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r13 = 3
            defpackage.hv.L(r0, r11, r11, r7, r13)
            z r1 = new z
            u6 r2 = (defpackage.u6) r2
            r3 = 9
            r1.<init>(r8, r2, r11, r3)
            ap6 r0 = defpackage.hv.L(r0, r11, r11, r1, r13)
            return r0
    }
}
