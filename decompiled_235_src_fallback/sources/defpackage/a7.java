package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a7  reason: default package */
/* loaded from: classes.dex */
public final class a7 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ne2 B;

    public /* synthetic */ a7(defpackage.ne2 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    private final java.lang.Object b(defpackage.r41 r13, java.lang.Object r14) {
            r12 = this;
            boolean r0 = r13 instanceof defpackage.c16
            if (r0 == 0) goto L13
            r0 = r13
            c16 r0 = (defpackage.c16) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            c16 r0 = new c16
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r13)
            goto L6e
        L27:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L2e:
            defpackage.oi2.Y(r13)
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r14, r2)
            r13.<init>(r2)
            java.util.Iterator r14 = r14.iterator()
        L42:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r14.next()
            zm0 r2 = (defpackage.zm0) r2
            me.magnum.melonds.domain.model.Cheat r4 = new me.magnum.melonds.domain.model.Cheat
            java.lang.Long r5 = r2.a
            long r6 = r2.c
            java.lang.String r8 = r2.d
            java.lang.String r9 = r2.e
            java.lang.String r10 = r2.f
            boolean r11 = r2.g
            r4.<init>(r5, r6, r8, r9, r10, r11)
            r13.add(r4)
            goto L42
        L63:
            r0.X = r3
            ne2 r12 = r12.B
            java.lang.Object r12 = r12.a(r13, r0)
            if (r12 != r1) goto L6e
            return r1
        L6e:
            jg7 r12 = defpackage.jg7.a
            return r12
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r26, defpackage.r41 r27) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            int r3 = r0.A
            r4 = 0
            r5 = 10
            jg7 r6 = defpackage.jg7.a
            ne2 r7 = r0.B
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1
            r11 = 0
            switch(r3) {
                case 0: goto Lada;
                case 1: goto La7f;
                case 2: goto La15;
                case 3: goto L9ba;
                case 4: goto L90f;
                case 5: goto L8cd;
                case 6: goto L888;
                case 7: goto L843;
                case 8: goto L805;
                case 9: goto L75e;
                case 10: goto L6e7;
                case 11: goto L6a9;
                case 12: goto L666;
                case 13: goto L624;
                case 14: goto L5e1;
                case 15: goto L59f;
                case 16: goto L561;
                case 17: goto L51e;
                case 18: goto L4db;
                case 19: goto L48e;
                case 20: goto L441;
                case 21: goto L3c3;
                case 22: goto L346;
                case 23: goto L2a4;
                case 24: goto L25c;
                case 25: goto L216;
                case 26: goto L13b;
                case 27: goto L77;
                case 28: goto L72;
                default: goto L18;
            }
        L18:
            boolean r3 = r2 instanceof defpackage.zw7
            if (r3 == 0) goto L29
            r3 = r2
            zw7 r3 = (defpackage.zw7) r3
            int r4 = r3.X
            r12 = r4 & r9
            if (r12 == 0) goto L29
            int r4 = r4 - r9
            r3.X = r4
            goto L2e
        L29:
            zw7 r3 = new zw7
            r3.<init>(r0, r2)
        L2e:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L41
            if (r4 != r10) goto L3c
            defpackage.oi2.Y(r0)
            goto L71
        L3c:
            defpackage.i.m(r8)
            r6 = r11
            goto L71
        L41:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r0, r5)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r0.next()
            xw7 r4 = (defpackage.xw7) r4
            jw7 r4 = r4.a()
            r1.add(r4)
            goto L54
        L68:
            r3.X = r10
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L71
            r6 = r2
        L71:
            return r6
        L72:
            java.lang.Object r0 = r0.b(r2, r1)
            return r0
        L77:
            boolean r3 = r2 instanceof defpackage.b16
            if (r3 == 0) goto L88
            r3 = r2
            b16 r3 = (defpackage.b16) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L88
            int r4 = r4 - r9
            r3.X = r4
            goto L8d
        L88:
            b16 r3 = new b16
            r3.<init>(r0, r2)
        L8d:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto La2
            if (r4 != r10) goto L9c
            defpackage.oi2.Y(r0)
            goto L13a
        L9c:
            defpackage.i.m(r8)
        L9f:
            r6 = r11
            goto L13a
        La2:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto Lb3
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto Lb3
            goto L127
        Lb3:
            java.util.Iterator r4 = r0.iterator()
        Lb7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L127
            java.lang.Object r5 = r4.next()
            jw7 r5 = (defpackage.jw7) r5
            iw7 r5 = r5.b
            boolean r5 = r5.isFinished()
            if (r5 != 0) goto Lb7
            java.lang.Object r0 = defpackage.gt0.H0(r0)
            jw7 r0 = (defpackage.jw7) r0
            iw7 r4 = r0.b
            xb1 r0 = r0.e
            int[] r5 = defpackage.q06.a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            switch(r4) {
                case 1: goto L11f;
                case 2: goto Lf7;
                case 3: goto Led;
                case 4: goto Le4;
                case 5: goto Le4;
                case 6: goto L12f;
                default: goto Le0;
            }
        Le0:
            defpackage.i.d()
            goto L9f
        Le4:
            zn0 r0 = new zn0
            yn0 r4 = defpackage.yn0.FAILED
            r0.<init>(r4, r1, r11)
        Leb:
            r11 = r0
            goto L12f
        Led:
            zn0 r0 = new zn0
            yn0 r1 = defpackage.yn0.FINISHED
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r4, r11)
            goto Leb
        Lf7:
            r0.getClass()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.util.HashMap r4 = r0.a
            java.lang.String r5 = "progress_relative"
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof java.lang.Float
            if (r5 == 0) goto L10b
            r1 = r4
        L10b:
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.String r4 = "progress_item"
            java.lang.String r0 = r0.b(r4)
            zn0 r11 = new zn0
            yn0 r4 = defpackage.yn0.ONGOING
            r11.<init>(r4, r1, r0)
            goto L12f
        L11f:
            zn0 r0 = new zn0
            yn0 r4 = defpackage.yn0.STARTING
            r0.<init>(r4, r1, r11)
            goto Leb
        L127:
            zn0 r0 = new zn0
            yn0 r4 = defpackage.yn0.NOT_IMPORTING
            r0.<init>(r4, r1, r11)
            goto Leb
        L12f:
            if (r11 == 0) goto L13a
            r3.X = r10
            java.lang.Object r0 = r7.a(r11, r3)
            if (r0 != r2) goto L13a
            r6 = r2
        L13a:
            return r6
        L13b:
            boolean r3 = r2 instanceof defpackage.z06
            if (r3 == 0) goto L14c
            r3 = r2
            z06 r3 = (defpackage.z06) r3
            int r4 = r3.X
            r12 = r4 & r9
            if (r12 == 0) goto L14c
            int r4 = r4 - r9
            r3.X = r4
            goto L151
        L14c:
            z06 r3 = new z06
            r3.<init>(r0, r2)
        L151:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L168
            if (r4 != r10) goto L162
            defpackage.oi2.Y(r0)
            r22 = r6
            goto L213
        L162:
            defpackage.i.m(r8)
            r6 = r11
            goto L215
        L168:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r0, r5)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L17b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L206
            java.lang.Object r4 = r0.next()
            en0 r4 = (defpackage.en0) r4
            cn0 r8 = r4.a
            java.lang.String r9 = "cheatFolder"
            if (r8 == 0) goto L200
            java.lang.Long r12 = r8.a
            if (r8 == 0) goto L1fa
            java.lang.String r8 = r8.c
            java.util.List r4 = r4.b
            if (r4 == 0) goto L1f2
            java.util.ArrayList r9 = new java.util.ArrayList
            int r13 = defpackage.ht0.v0(r4, r5)
            r9.<init>(r13)
            java.util.Iterator r4 = r4.iterator()
        L1a4:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L1de
            java.lang.Object r13 = r4.next()
            zm0 r13 = (defpackage.zm0) r13
            me.magnum.melonds.domain.model.Cheat r14 = new me.magnum.melonds.domain.model.Cheat
            java.lang.Long r15 = r13.a
            r22 = r6
            long r5 = r13.c
            r23 = r11
            java.lang.String r11 = r13.d
            java.lang.String r10 = r13.e
            r25 = r0
            java.lang.String r0 = r13.f
            boolean r13 = r13.g
            r20 = r0
            r16 = r5
            r19 = r10
            r18 = r11
            r21 = r13
            r14.<init>(r15, r16, r18, r19, r20, r21)
            r9.add(r14)
            r0 = r25
            r6 = r22
            r11 = r23
            r5 = 10
            r10 = 1
            goto L1a4
        L1de:
            r25 = r0
            r22 = r6
            r23 = r11
            an0 r0 = new an0
            r0.<init>(r12, r8, r9)
            r1.add(r0)
            r0 = r25
            r5 = 10
            r10 = 1
            goto L17b
        L1f2:
            r23 = r11
            java.lang.String r0 = "cheats"
            defpackage.nb3.a0(r0)
            throw r23
        L1fa:
            r23 = r11
            defpackage.nb3.a0(r9)
            throw r23
        L200:
            r23 = r11
            defpackage.nb3.a0(r9)
            throw r23
        L206:
            r22 = r6
            r4 = r10
            r3.X = r4
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L213
            r6 = r2
            goto L215
        L213:
            r6 = r22
        L215:
            return r6
        L216:
            r22 = r6
            r23 = r11
            boolean r3 = r2 instanceof defpackage.sz5
            if (r3 == 0) goto L22b
            r3 = r2
            sz5 r3 = (defpackage.sz5) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L22b
            int r4 = r4 - r9
            r3.X = r4
            goto L230
        L22b:
            sz5 r3 = new sz5
            r3.<init>(r0, r2)
        L230:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r5 = 1
            if (r4 == 0) goto L245
            if (r4 != r5) goto L23f
            defpackage.oi2.Y(r0)
            goto L259
        L23f:
            defpackage.i.m(r8)
            r6 = r23
            goto L25b
        L245:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.Set r0 = defpackage.gt0.p1(r0)
            r3.X = r5
            java.lang.Object r0 = r7.a(r0, r3)
            if (r0 != r2) goto L259
            r6 = r2
            goto L25b
        L259:
            r6 = r22
        L25b:
            return r6
        L25c:
            r22 = r6
            r23 = r11
            boolean r3 = r2 instanceof defpackage.ls5
            if (r3 == 0) goto L271
            r3 = r2
            ls5 r3 = (defpackage.ls5) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L271
            int r4 = r4 - r9
            r3.X = r4
            goto L276
        L271:
            ls5 r3 = new ls5
            r3.<init>(r0, r2)
        L276:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r5 = 1
            if (r4 == 0) goto L28b
            if (r4 != r5) goto L285
            defpackage.oi2.Y(r0)
            goto L2a1
        L285:
            defpackage.i.m(r8)
            r6 = r23
            goto L2a3
        L28b:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2a1
            r3.X = r5
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L2a1
            r6 = r2
            goto L2a3
        L2a1:
            r6 = r22
        L2a3:
            return r6
        L2a4:
            r22 = r6
            r23 = r11
            boolean r3 = r2 instanceof defpackage.do5
            if (r3 == 0) goto L2b9
            r3 = r2
            do5 r3 = (defpackage.do5) r3
            int r5 = r3.X
            r6 = r5 & r9
            if (r6 == 0) goto L2b9
            int r5 = r5 - r9
            r3.X = r5
            goto L2be
        L2b9:
            do5 r3 = new do5
            r3.<init>(r0, r2)
        L2be:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.X
            if (r5 == 0) goto L2d5
            r6 = 1
            if (r5 != r6) goto L2ce
            defpackage.oi2.Y(r0)
            goto L343
        L2ce:
            defpackage.i.m(r8)
            r6 = r23
            goto L345
        L2d5:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2e4:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L30d
            java.lang.Object r5 = r0.next()
            r6 = r5
            vn5 r6 = (defpackage.vn5) r6
            java.lang.Class r6 = r6.getClass()
            ar0 r6 = defpackage.gh5.a(r6)
            java.lang.Object r8 = r1.get(r6)
            if (r8 != 0) goto L307
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.put(r6, r8)
        L307:
            java.util.List r8 = (java.util.List) r8
            r8.add(r5)
            goto L2e4
        L30d:
            zn5 r0 = new zn5
            java.lang.Class<tn5> r5 = defpackage.tn5.class
            ar0 r5 = defpackage.gh5.a(r5)
            java.lang.Object r5 = r1.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L322
            int r5 = r5.size()
            goto L323
        L322:
            r5 = r4
        L323:
            java.lang.Class<un5> r6 = defpackage.un5.class
            ar0 r6 = defpackage.gh5.a(r6)
            java.lang.Object r1 = r1.get(r6)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L335
            int r4 = r1.size()
        L335:
            r0.<init>(r5, r4)
            r5 = 1
            r3.X = r5
            java.lang.Object r0 = r7.a(r0, r3)
            if (r0 != r2) goto L343
            r6 = r2
            goto L345
        L343:
            r6 = r22
        L345:
            return r6
        L346:
            r22 = r6
            r23 = r11
            boolean r3 = r2 instanceof defpackage.co5
            if (r3 == 0) goto L35b
            r3 = r2
            co5 r3 = (defpackage.co5) r3
            int r5 = r3.X
            r6 = r5 & r9
            if (r6 == 0) goto L35b
            int r5 = r5 - r9
            r3.X = r5
            goto L360
        L35b:
            co5 r3 = new co5
            r3.<init>(r0, r2)
        L360:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.X
            if (r5 == 0) goto L375
            r6 = 1
            if (r5 != r6) goto L36f
            defpackage.oi2.Y(r0)
            goto L3c0
        L36f:
            defpackage.i.m(r8)
            r6 = r23
            goto L3c2
        L375:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L384:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L396
            java.lang.Object r5 = r0.next()
            boolean r6 = r5 instanceof defpackage.tn5
            if (r6 == 0) goto L384
            r1.add(r5)
            goto L384
        L396:
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r1, r5)
            r0.<init>(r5)
            int r5 = r1.size()
        L3a5:
            if (r4 >= r5) goto L3b5
            java.lang.Object r6 = r1.get(r4)
            int r4 = r4 + 1
            tn5 r6 = (defpackage.tn5) r6
            o75 r6 = r6.a
            r0.add(r6)
            goto L3a5
        L3b5:
            r6 = 1
            r3.X = r6
            java.lang.Object r0 = r7.a(r0, r3)
            if (r0 != r2) goto L3c0
            r6 = r2
            goto L3c2
        L3c0:
            r6 = r22
        L3c2:
            return r6
        L3c3:
            r22 = r6
            r23 = r11
            boolean r3 = r2 instanceof defpackage.ax4
            if (r3 == 0) goto L3d8
            r3 = r2
            ax4 r3 = (defpackage.ax4) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L3d8
            int r4 = r4 - r9
            r3.X = r4
            goto L3dd
        L3d8:
            ax4 r3 = new ax4
            r3.<init>(r0, r2)
        L3dd:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L3f2
            r5 = 1
            if (r4 != r5) goto L3ec
            defpackage.oi2.Y(r0)
            goto L43e
        L3ec:
            defpackage.i.m(r8)
            r6 = r23
            goto L440
        L3f2:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r0.iterator()
        L401:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L433
            java.lang.Object r0 = r4.next()
            xf0 r0 = (defpackage.xf0) r0
            java.lang.String r5 = r0.a
            r6 = r23
            yf0 r0 = defpackage.nc1.J(r5, r6, r6)     // Catch: java.lang.Exception -> L416
            goto L42b
        L416:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to create CameraIdentifier for pipeId: "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r8 = "PipePresenceSrc"
            android.util.Log.w(r8, r5, r0)
            r0 = r6
        L42b:
            if (r0 == 0) goto L430
            r1.add(r0)
        L430:
            r23 = r6
            goto L401
        L433:
            r5 = 1
            r3.X = r5
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L43e
            r6 = r2
            goto L440
        L43e:
            r6 = r22
        L440:
            return r6
        L441:
            r22 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.xl3
            if (r3 == 0) goto L455
            r3 = r2
            xl3 r3 = (defpackage.xl3) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L455
            int r4 = r4 - r9
            r3.X = r4
            goto L45a
        L455:
            xl3 r3 = new xl3
            r3.<init>(r0, r2)
        L45a:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L46d
            r5 = 1
            if (r4 != r5) goto L469
            defpackage.oi2.Y(r0)
            goto L48b
        L469:
            defpackage.i.m(r8)
            goto L48d
        L46d:
            defpackage.oi2.Y(r0)
            r0 = r1
            w71 r0 = (defpackage.w71) r0
            lj3 r1 = new lj3
            ff7 r0 = r0.a
            z66 r0 = r0.b
            java.util.UUID r4 = r0.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = r0.b
            r1.<init>(r4, r0)
            r5 = 1
            r3.X = r5
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L48b
            r6 = r2
            goto L48d
        L48b:
            r6 = r22
        L48d:
            return r6
        L48e:
            r22 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.vl3
            if (r3 == 0) goto L4a2
            r3 = r2
            vl3 r3 = (defpackage.vl3) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L4a2
            int r4 = r4 - r9
            r3.X = r4
            goto L4a7
        L4a2:
            vl3 r3 = new vl3
            r3.<init>(r0, r2)
        L4a7:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L4ba
            r5 = 1
            if (r4 != r5) goto L4b6
            defpackage.oi2.Y(r0)
            goto L4d8
        L4b6:
            defpackage.i.m(r8)
            goto L4da
        L4ba:
            defpackage.oi2.Y(r0)
            r0 = r1
            w71 r0 = (defpackage.w71) r0
            lj3 r1 = new lj3
            ff7 r0 = r0.a
            z66 r0 = r0.a
            java.util.UUID r4 = r0.a
            me.magnum.melonds.domain.model.layout.BackgroundMode r0 = r0.b
            r1.<init>(r4, r0)
            r5 = 1
            r3.X = r5
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L4d8
            r6 = r2
            goto L4da
        L4d8:
            r6 = r22
        L4da:
            return r6
        L4db:
            r22 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.qa3
            if (r3 == 0) goto L4ef
            r3 = r2
            qa3 r3 = (defpackage.qa3) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L4ef
            int r4 = r4 - r9
            r3.X = r4
            goto L4f4
        L4ef:
            qa3 r3 = new qa3
            r3.<init>(r0, r2)
        L4f4:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r5 = 1
            if (r4 == 0) goto L507
            if (r4 != r5) goto L503
            defpackage.oi2.Y(r0)
            goto L51b
        L503:
            defpackage.i.m(r8)
            goto L51d
        L507:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = defpackage.mb3.z(r0)
            r3.X = r5
            java.lang.Object r0 = r7.a(r0, r3)
            if (r0 != r2) goto L51b
            r6 = r2
            goto L51d
        L51b:
            r6 = r22
        L51d:
            return r6
        L51e:
            r22 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.ga3
            if (r3 == 0) goto L532
            r3 = r2
            ga3 r3 = (defpackage.ga3) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L532
            int r4 = r4 - r9
            r3.X = r4
            goto L537
        L532:
            ga3 r3 = new ga3
            r3.<init>(r0, r2)
        L537:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r5 = 1
            if (r4 == 0) goto L54a
            if (r4 != r5) goto L546
            defpackage.oi2.Y(r0)
            goto L55e
        L546:
            defpackage.i.m(r8)
            goto L560
        L54a:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = defpackage.mb3.z(r0)
            r3.X = r5
            java.lang.Object r0 = r7.a(r0, r3)
            if (r0 != r2) goto L55e
            r6 = r2
            goto L560
        L55e:
            r6 = r22
        L560:
            return r6
        L561:
            r22 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.vf2
            if (r3 == 0) goto L575
            r3 = r2
            vf2 r3 = (defpackage.vf2) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L575
            int r4 = r4 - r9
            r3.X = r4
            goto L57a
        L575:
            vf2 r3 = new vf2
            r3.<init>(r0, r2)
        L57a:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r5 = 1
            if (r4 == 0) goto L58d
            if (r4 != r5) goto L589
            defpackage.oi2.Y(r0)
            goto L59c
        L589:
            defpackage.i.m(r8)
            goto L59e
        L58d:
            defpackage.oi2.Y(r0)
            if (r1 == 0) goto L59c
            r3.X = r5
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L59c
            r6 = r2
            goto L59e
        L59c:
            r6 = r22
        L59e:
            return r6
        L59f:
            r22 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.w02
            if (r3 == 0) goto L5b3
            r3 = r2
            w02 r3 = (defpackage.w02) r3
            int r4 = r3.X
            r5 = r4 & r9
            if (r5 == 0) goto L5b3
            int r4 = r4 - r9
            r3.X = r4
            goto L5b8
        L5b3:
            w02 r3 = new w02
            r3.<init>(r0, r2)
        L5b8:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r5 = 1
            if (r4 == 0) goto L5cd
            if (r4 != r5) goto L5c9
            defpackage.oi2.Y(r0)
            r6 = r22
            goto L5e0
        L5c9:
            defpackage.i.m(r8)
            goto L5e0
        L5cd:
            defpackage.oi2.Y(r0)
            r0 = r1
            hy1 r0 = (defpackage.hy1) r0
            r3.X = r5
            r5 = r22
            java.lang.Object r0 = r7.a(r5, r3)
            if (r0 != r2) goto L5df
            r6 = r2
            goto L5e0
        L5df:
            r6 = r5
        L5e0:
            return r6
        L5e1:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.v02
            if (r3 == 0) goto L5f4
            r3 = r2
            v02 r3 = (defpackage.v02) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L5f4
            int r4 = r4 - r9
            r3.X = r4
            goto L5f9
        L5f4:
            v02 r3 = new v02
            r3.<init>(r0, r2)
        L5f9:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L60c
            if (r4 != r9) goto L608
            defpackage.oi2.Y(r0)
            goto L622
        L608:
            defpackage.i.m(r8)
            goto L623
        L60c:
            defpackage.oi2.Y(r0)
            r0 = r1
            hy1 r0 = (defpackage.hy1) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L622
            r3.X = r9
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L622
            r6 = r2
            goto L623
        L622:
            r6 = r5
        L623:
            return r6
        L624:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.px1
            if (r3 == 0) goto L637
            r3 = r2
            px1 r3 = (defpackage.px1) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L637
            int r4 = r4 - r9
            r3.X = r4
            goto L63c
        L637:
            px1 r3 = new px1
            r3.<init>(r0, r2)
        L63c:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L64f
            if (r4 != r9) goto L64b
            defpackage.oi2.Y(r0)
            goto L664
        L64b:
            defpackage.i.m(r8)
            goto L665
        L64f:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.X = r9
            java.lang.Object r0 = r7.a(r0, r3)
            if (r0 != r2) goto L664
            r6 = r2
            goto L665
        L664:
            r6 = r5
        L665:
            return r6
        L666:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.ox1
            if (r3 == 0) goto L679
            r3 = r2
            ox1 r3 = (defpackage.ox1) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L679
            int r4 = r4 - r9
            r3.X = r4
            goto L67e
        L679:
            ox1 r3 = new ox1
            r3.<init>(r0, r2)
        L67e:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L691
            if (r4 != r9) goto L68d
            defpackage.oi2.Y(r0)
            goto L6a7
        L68d:
            defpackage.i.m(r8)
            goto L6a8
        L691:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6a7
            r3.X = r9
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L6a7
            r6 = r2
            goto L6a8
        L6a7:
            r6 = r5
        L6a8:
            return r6
        L6a9:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.yv1
            if (r3 == 0) goto L6bc
            r3 = r2
            yv1 r3 = (defpackage.yv1) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L6bc
            int r4 = r4 - r9
            r3.X = r4
            goto L6c1
        L6bc:
            yv1 r3 = new yv1
            r3.<init>(r0, r2)
        L6c1:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L6d4
            if (r4 != r9) goto L6d0
            defpackage.oi2.Y(r0)
            goto L6e5
        L6d0:
            defpackage.i.m(r8)
            goto L6e6
        L6d4:
            defpackage.oi2.Y(r0)
            boolean r0 = r1 instanceof defpackage.ba5
            if (r0 == 0) goto L6e5
            r3.X = r9
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L6e5
            r6 = r2
            goto L6e6
        L6e5:
            r6 = r5
        L6e6:
            return r6
        L6e7:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.wa1
            if (r3 == 0) goto L6fa
            r3 = r2
            wa1 r3 = (defpackage.wa1) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L6fa
            int r4 = r4 - r9
            r3.X = r4
            goto L6ff
        L6fa:
            wa1 r3 = new wa1
            r3.<init>(r0, r2)
        L6ff:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L712
            r9 = 1
            if (r4 != r9) goto L70e
            defpackage.oi2.Y(r0)
            goto L75c
        L70e:
            defpackage.i.m(r8)
            goto L75d
        L712:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L721:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L751
            java.lang.Object r4 = r0.next()
            r6 = r4
            pq5 r6 = (defpackage.pq5) r6
            boolean r8 = r6.h
            if (r8 != 0) goto L74c
            java.lang.String r8 = r6.c
            java.lang.String r9 = ".dsi"
            r10 = 1
            boolean r8 = defpackage.xs6.Y(r8, r9, r10)
            if (r8 != 0) goto L74d
            android.net.Uri r6 = r6.d
            java.lang.String r6 = r6.getPath()
            if (r6 == 0) goto L721
            boolean r6 = defpackage.xs6.Y(r6, r9, r10)
            if (r6 != r10) goto L721
            goto L74d
        L74c:
            r10 = 1
        L74d:
            r1.add(r4)
            goto L721
        L751:
            r10 = 1
            r3.X = r10
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L75c
            r6 = r2
            goto L75d
        L75c:
            r6 = r5
        L75d:
            return r6
        L75e:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.t21
            if (r3 == 0) goto L771
            r3 = r2
            t21 r3 = (defpackage.t21) r3
            int r10 = r3.X
            r11 = r10 & r9
            if (r11 == 0) goto L771
            int r10 = r10 - r9
            r3.X = r10
            goto L776
        L771:
            t21 r3 = new t21
            r3.<init>(r0, r2)
        L776:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r3.X
            if (r9 == 0) goto L78b
            r10 = 1
            if (r9 != r10) goto L786
            defpackage.oi2.Y(r0)
            goto L803
        L786:
            defpackage.i.m(r8)
            goto L804
        L78b:
            defpackage.oi2.Y(r0)
            r0 = r1
            q21 r0 = (defpackage.q21) r0
            long r0 = r0.a
            ve5 r8 = defpackage.dk7.b
            qj1 r8 = defpackage.qj1.m
            r9 = 3
            long r9 = r9 & r0
            int r9 = (int) r9
            r10 = r9 & 1
            r24 = 1
            int r10 = r10 << 1
            r9 = r9 & 2
            int r9 = r9 >> 1
            int r9 = r9 * 3
            int r9 = r9 + r10
            r10 = 33
            long r10 = r0 >> r10
            int r10 = (int) r10
            int r11 = r9 + 13
            int r11 = r24 << r11
            int r11 = r11 + (-1)
            r10 = r10 & r11
            int r10 = r10 + (-1)
            int r11 = r9 + 46
            long r11 = r0 >> r11
            int r11 = (int) r11
            int r9 = 18 - r9
            int r9 = r24 << r9
            int r9 = r9 + (-1)
            r9 = r9 & r11
            int r9 = r9 + (-1)
            if (r10 != 0) goto L7c8
            r10 = 1
            goto L7c9
        L7c8:
            r10 = r4
        L7c9:
            if (r9 != 0) goto L7cc
            r4 = 1
        L7cc:
            r4 = r4 | r10
            if (r4 == 0) goto L7d1
            r11 = r6
            goto L7f6
        L7d1:
            boolean r4 = defpackage.q21.d(r0)
            if (r4 == 0) goto L7e1
            int r4 = defpackage.q21.h(r0)
            pj1 r6 = new pj1
            r6.<init>(r4)
            goto L7e2
        L7e1:
            r6 = r8
        L7e2:
            boolean r4 = defpackage.q21.c(r0)
            if (r4 == 0) goto L7f1
            int r0 = defpackage.q21.g(r0)
            pj1 r8 = new pj1
            r8.<init>(r0)
        L7f1:
            wi6 r11 = new wi6
            r11.<init>(r6, r8)
        L7f6:
            if (r11 == 0) goto L803
            r9 = 1
            r3.X = r9
            java.lang.Object r0 = r7.a(r11, r3)
            if (r0 != r2) goto L803
            r6 = r2
            goto L804
        L803:
            r6 = r5
        L804:
            return r6
        L805:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.f21
            if (r3 == 0) goto L818
            r3 = r2
            f21 r3 = (defpackage.f21) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L818
            int r4 = r4 - r9
            r3.X = r4
            goto L81d
        L818:
            f21 r3 = new f21
            r3.<init>(r0, r2)
        L81d:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L830
            if (r4 != r9) goto L82c
            defpackage.oi2.Y(r0)
            goto L841
        L82c:
            defpackage.i.m(r8)
            goto L842
        L830:
            defpackage.oi2.Y(r0)
            boolean r0 = r1 instanceof defpackage.w21
            if (r0 == 0) goto L841
            r3.X = r9
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L841
            r6 = r2
            goto L842
        L841:
            r6 = r5
        L842:
            return r6
        L843:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.zp0
            if (r3 == 0) goto L856
            r3 = r2
            zp0 r3 = (defpackage.zp0) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L856
            int r4 = r4 - r9
            r3.X = r4
            goto L85b
        L856:
            zp0 r3 = new zp0
            r3.<init>(r0, r2)
        L85b:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L86e
            if (r4 != r9) goto L86a
            defpackage.oi2.Y(r0)
            goto L886
        L86a:
            defpackage.i.m(r8)
            goto L887
        L86e:
            defpackage.oi2.Y(r0)
            r0 = r1
            dn0 r0 = (defpackage.dn0) r0
            if (r0 == 0) goto L87b
            an0 r11 = r0.a()
            goto L87c
        L87b:
            r11 = r6
        L87c:
            r3.X = r9
            java.lang.Object r0 = r7.a(r11, r3)
            if (r0 != r2) goto L886
            r6 = r2
            goto L887
        L886:
            r6 = r5
        L887:
            return r6
        L888:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.xp0
            if (r3 == 0) goto L89b
            r3 = r2
            xp0 r3 = (defpackage.xp0) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L89b
            int r4 = r4 - r9
            r3.X = r4
            goto L8a0
        L89b:
            xp0 r3 = new xp0
            r3.<init>(r0, r2)
        L8a0:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L8b3
            if (r4 != r9) goto L8af
            defpackage.oi2.Y(r0)
            goto L8cb
        L8af:
            defpackage.i.m(r8)
            goto L8cc
        L8b3:
            defpackage.oi2.Y(r0)
            r0 = r1
            pp2 r0 = (defpackage.pp2) r0
            if (r0 == 0) goto L8c0
            cp2 r11 = r0.a()
            goto L8c1
        L8c0:
            r11 = r6
        L8c1:
            r3.X = r9
            java.lang.Object r0 = r7.a(r11, r3)
            if (r0 != r2) goto L8cb
            r6 = r2
            goto L8cc
        L8cb:
            r6 = r5
        L8cc:
            return r6
        L8cd:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.up0
            if (r3 == 0) goto L8e0
            r3 = r2
            up0 r3 = (defpackage.up0) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L8e0
            int r4 = r4 - r9
            r3.X = r4
            goto L8e5
        L8e0:
            up0 r3 = new up0
            r3.<init>(r0, r2)
        L8e5:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto L8f8
            if (r4 != r9) goto L8f4
            defpackage.oi2.Y(r0)
            goto L90d
        L8f4:
            defpackage.i.m(r8)
            goto L90e
        L8f8:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            qp0 r1 = new qp0
            r1.<init>(r0)
            r3.X = r9
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto L90d
            r6 = r2
            goto L90e
        L90d:
            r6 = r5
        L90e:
            return r6
        L90f:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.kw
            if (r3 == 0) goto L922
            r3 = r2
            kw r3 = (defpackage.kw) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L922
            int r4 = r4 - r9
            r3.X = r4
            goto L927
        L922:
            kw r3 = new kw
            r3.<init>(r0, r2)
        L927:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L93c
            r9 = 1
            if (r4 != r9) goto L937
            defpackage.oi2.Y(r0)
            goto L9b8
        L937:
            defpackage.i.m(r8)
            goto L9b9
        L93c:
            defpackage.oi2.Y(r0)
            r0 = r1
            xi6 r0 = (defpackage.xi6) r0
            long r0 = r0.a
            qj1 r4 = defpackage.qj1.m
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 != 0) goto L952
            wi6 r11 = defpackage.wi6.c
            goto L9ab
        L952:
            ve5 r8 = defpackage.dk7.b
            float r8 = defpackage.xi6.e(r0)
            double r8 = (double) r8
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L9aa
            float r8 = defpackage.xi6.c(r0)
            double r8 = (double) r8
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L9aa
            wi6 r11 = new wi6
            float r6 = defpackage.xi6.e(r0)
            boolean r8 = java.lang.Float.isInfinite(r6)
            if (r8 != 0) goto L988
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L988
            float r6 = defpackage.xi6.e(r0)
            int r6 = defpackage.u24.E(r6)
            pj1 r8 = new pj1
            r8.<init>(r6)
            goto L989
        L988:
            r8 = r4
        L989:
            float r6 = defpackage.xi6.c(r0)
            boolean r9 = java.lang.Float.isInfinite(r6)
            if (r9 != 0) goto L9a6
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L9a6
            float r0 = defpackage.xi6.c(r0)
            int r0 = defpackage.u24.E(r0)
            pj1 r4 = new pj1
            r4.<init>(r0)
        L9a6:
            r11.<init>(r8, r4)
            goto L9ab
        L9aa:
            r11 = r6
        L9ab:
            if (r11 == 0) goto L9b8
            r9 = 1
            r3.X = r9
            java.lang.Object r0 = r7.a(r11, r3)
            if (r0 != r2) goto L9b8
            r6 = r2
            goto L9b9
        L9b8:
            r6 = r5
        L9b9:
            return r6
        L9ba:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.an
            if (r3 == 0) goto L9cd
            r3 = r2
            an r3 = (defpackage.an) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto L9cd
            int r4 = r4 - r9
            r3.X = r4
            goto L9d2
        L9cd:
            an r3 = new an
            r3.<init>(r0, r2)
        L9d2:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto L9e5
            r9 = 1
            if (r4 != r9) goto L9e1
            defpackage.oi2.Y(r0)
            goto La13
        L9e1:
            defpackage.i.m(r8)
            goto La14
        L9e5:
            defpackage.oi2.Y(r0)
            r0 = r1
            kv7 r0 = (defpackage.kv7) r0
            java.util.List r0 = r0.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L9f6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La08
            java.lang.Object r4 = r0.next()
            boolean r6 = r4 instanceof defpackage.lw2
            if (r6 == 0) goto L9f6
            r1.add(r4)
            goto L9f6
        La08:
            r9 = 1
            r3.X = r9
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto La13
            r6 = r2
            goto La14
        La13:
            r6 = r5
        La14:
            return r6
        La15:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.gl
            if (r3 == 0) goto La28
            r3 = r2
            gl r3 = (defpackage.gl) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto La28
            int r4 = r4 - r9
            r3.X = r4
            goto La2d
        La28:
            gl r3 = new gl
            r3.<init>(r0, r2)
        La2d:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto La40
            r9 = 1
            if (r4 != r9) goto La3c
            defpackage.oi2.Y(r0)
            goto La7d
        La3c:
            defpackage.i.m(r8)
            goto La7e
        La40:
            defpackage.oi2.Y(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            int r1 = defpackage.c14.k0(r1)
            r4 = 16
            if (r1 >= r4) goto La55
            r1 = r4
        La55:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        La5e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La72
            java.lang.Object r1 = r0.next()
            nw2 r1 = (defpackage.nw2) r1
            java.lang.String r6 = r1.a
            java.lang.String r1 = r1.b
            r4.put(r6, r1)
            goto La5e
        La72:
            r9 = 1
            r3.X = r9
            java.lang.Object r0 = r7.a(r4, r3)
            if (r0 != r2) goto La7d
            r6 = r2
            goto La7e
        La7d:
            r6 = r5
        La7e:
            return r6
        La7f:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.c7
            if (r3 == 0) goto La92
            r3 = r2
            c7 r3 = (defpackage.c7) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto La92
            int r4 = r4 - r9
            r3.X = r4
            goto La97
        La92:
            c7 r3 = new c7
            r3.<init>(r0, r2)
        La97:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            if (r4 == 0) goto Laaa
            r9 = 1
            if (r4 != r9) goto Laa6
            defpackage.oi2.Y(r0)
            goto Lad8
        Laa6:
            defpackage.i.m(r8)
            goto Lad9
        Laaa:
            defpackage.oi2.Y(r0)
            r0 = r1
            ca5 r0 = (defpackage.ca5) r0
            boolean r1 = r0 instanceof defpackage.q95
            if (r1 == 0) goto Labe
            wz4 r11 = new wz4
            q95 r0 = (defpackage.q95) r0
            o75 r0 = r0.a
            r11.<init>(r0)
            goto Lacb
        Labe:
            boolean r1 = r0 instanceof defpackage.s95
            if (r1 == 0) goto Laca
            xz4 r11 = new xz4
            s95 r0 = (defpackage.s95) r0
            r11.<init>(r0)
            goto Lacb
        Laca:
            r11 = r6
        Lacb:
            if (r11 == 0) goto Lad8
            r9 = 1
            r3.X = r9
            java.lang.Object r0 = r7.a(r11, r3)
            if (r0 != r2) goto Lad8
            r6 = r2
            goto Lad9
        Lad8:
            r6 = r5
        Lad9:
            return r6
        Lada:
            r5 = r6
            r6 = r11
            boolean r3 = r2 instanceof defpackage.z6
            if (r3 == 0) goto Laed
            r3 = r2
            z6 r3 = (defpackage.z6) r3
            int r4 = r3.X
            r10 = r4 & r9
            if (r10 == 0) goto Laed
            int r4 = r4 - r9
            r3.X = r4
            goto Laf2
        Laed:
            z6 r3 = new z6
            r3.<init>(r0, r2)
        Laf2:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.X
            r9 = 1
            if (r4 == 0) goto Lb05
            if (r4 != r9) goto Lb01
            defpackage.oi2.Y(r0)
            goto Lb1a
        Lb01:
            defpackage.i.m(r8)
            goto Lb1b
        Lb05:
            defpackage.oi2.Y(r0)
            r0 = r1
            ra5 r0 = (defpackage.ra5) r0
            yz4 r1 = new yz4
            r1.<init>(r0)
            r3.X = r9
            java.lang.Object r0 = r7.a(r1, r3)
            if (r0 != r2) goto Lb1a
            r6 = r2
            goto Lb1b
        Lb1a:
            r6 = r5
        Lb1b:
            return r6
    }
}
