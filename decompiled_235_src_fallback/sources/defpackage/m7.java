package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m7  reason: default package */
/* loaded from: classes.dex */
public final class m7 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public int Z;
    public java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;

    public m7(defpackage.pr3 r2, defpackage.gn r3, int r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r1.Z = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public /* synthetic */ m7(defpackage.qo7 r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.e0 = r1
            r0.f0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public m7(defpackage.le2[] r2, int r3, java.util.concurrent.atomic.AtomicInteger r4, defpackage.v80 r5, defpackage.r41 r6) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r1.e0 = r4
            r1.f0 = r5
            r2 = 2
            r1.<init>(r2, r6)
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
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            m7 r2 = (defpackage.m7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            m7 r2 = (defpackage.m7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            m7 r2 = (defpackage.m7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            m7 r2 = (defpackage.m7) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.X
            java.lang.Object r1 = r9.f0
            java.lang.Object r2 = r9.e0
            switch(r0) {
                case 0: goto L33;
                case 1: goto L1f;
                case 2: goto L14;
                default: goto L9;
            }
        L9:
            m7 r9 = new m7
            tz5 r2 = (defpackage.tz5) r2
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r11 = 3
            r9.<init>(r2, r1, r10, r11)
            return r9
        L14:
            m7 r9 = new m7
            sz1 r2 = (defpackage.sz1) r2
            c46 r1 = (defpackage.c46) r1
            r11 = 2
            r9.<init>(r2, r1, r10, r11)
            return r9
        L1f:
            m7 r3 = new m7
            java.lang.Object r11 = r9.d0
            r4 = r11
            le2[] r4 = (defpackage.le2[]) r4
            int r5 = r9.Z
            r6 = r2
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            r7 = r1
            v80 r7 = (defpackage.v80) r7
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L33:
            r8 = r10
            m7 r10 = new m7
            pr3 r2 = (defpackage.pr3) r2
            gn r1 = (defpackage.gn) r1
            int r9 = r9.Z
            r10.<init>(r2, r1, r9, r8)
            r10.d0 = r11
            return r10
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            r1 = 3
            r2 = 0
            r3 = 2
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.Object r6 = r14.e0
            r7 = 1
            jg7 r8 = defpackage.jg7.a
            java.lang.Object r9 = r14.f0
            r10 = 0
            switch(r0) {
                case 0: goto L153;
                case 1: goto L10e;
                case 2: goto L8e;
                default: goto L12;
            }
        L12:
            tz5 r6 = (defpackage.tz5) r6
            fg r1 = r6.g
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r14.Z
            if (r11 == 0) goto L35
            if (r11 == r7) goto L30
            if (r11 != r3) goto L2b
            int r2 = r14.Y
            java.lang.Object r5 = r14.d0
            java.util.Iterator r5 = (java.util.Iterator) r5
            defpackage.oi2.Y(r15)     // Catch: java.lang.Throwable -> L50
            r9 = r15
            goto L77
        L2b:
            defpackage.i.m(r5)
            r8 = r10
            goto L89
        L30:
            defpackage.oi2.Y(r15)
            r5 = r15
            goto L41
        L35:
            defpackage.oi2.Y(r15)
            r14.Z = r7
            java.lang.Enum r5 = r1.i(r14)
            if (r5 != r0) goto L41
            goto L75
        L41:
            mm4 r5 = (defpackage.mm4) r5
            boolean r5 = r5.isFailure()
            if (r5 == 0) goto L4a
            goto L89
        L4a:
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r5 = r9.iterator()     // Catch: java.lang.Throwable -> L7f
        L50:
            boolean r9 = r5.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r9 == 0) goto L81
            java.lang.Object r9 = r5.next()     // Catch: java.lang.Throwable -> L7f
            pq5 r9 = (defpackage.pq5) r9     // Catch: java.lang.Throwable -> L7f
            java.util.concurrent.ConcurrentHashMap$KeySetView r10 = r6.K     // Catch: java.lang.Throwable -> L7f
            android.net.Uri r11 = r9.d     // Catch: java.lang.Throwable -> L7f
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L7f
            r10.add(r11)     // Catch: java.lang.Throwable -> L7f
            android.net.Uri r9 = r9.d     // Catch: java.lang.Throwable -> L50
            r14.d0 = r5     // Catch: java.lang.Throwable -> L50
            r14.Y = r2     // Catch: java.lang.Throwable -> L50
            r14.Z = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Enum r9 = r1.f(r9, r14)     // Catch: java.lang.Throwable -> L50
            if (r9 != r0) goto L77
        L75:
            r8 = r0
            goto L89
        L77:
            t33 r9 = (defpackage.t33) r9     // Catch: java.lang.Throwable -> L50
            t33 r10 = defpackage.t33.SUCCESS     // Catch: java.lang.Throwable -> L50
            if (r9 != r10) goto L50
            r2 = r7
            goto L50
        L7f:
            r0 = move-exception
            goto L8a
        L81:
            r1.b()
            if (r2 == 0) goto L89
            r6.p()
        L89:
            return r8
        L8a:
            r1.b()
            throw r0
        L8e:
            sz1 r6 = (defpackage.sz1) r6
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r14.Z
            if (r11 == 0) goto Lc2
            if (r11 == r7) goto Lb6
            if (r11 == r3) goto Lac
            if (r11 != r1) goto La7
            java.lang.Object r0 = r14.d0
            sz1 r0 = (defpackage.sz1) r0
            dy1 r0 = (defpackage.dy1) r0
            defpackage.oi2.Y(r15)
            goto L10d
        La7:
            defpackage.i.m(r5)
            r8 = r10
            goto L10d
        Lac:
            int r2 = r14.Y
            java.lang.Object r3 = r14.d0
            sz1 r3 = (defpackage.sz1) r3
            defpackage.oi2.Y(r15)
            goto L100
        Lb6:
            int r2 = r14.Y
            java.lang.Object r5 = r14.d0
            r6 = r5
            sz1 r6 = (defpackage.sz1) r6
            defpackage.oi2.Y(r15)
            r5 = r15
            goto Le6
        Lc2:
            defpackage.oi2.Y(r15)
            tp6 r5 = r6.p0
            java.lang.Object r5 = r5.getValue()
            boolean r11 = r5 instanceof defpackage.dy1
            if (r11 == 0) goto Ld2
            dy1 r5 = (defpackage.dy1) r5
            goto Ld3
        Ld2:
            r5 = r10
        Ld3:
            if (r5 == 0) goto L10d
            c46 r9 = (defpackage.c46) r9
            pq5 r5 = r5.a
            r14.d0 = r6
            r14.Y = r2
            r14.Z = r7
            java.lang.Object r5 = r6.A0(r5, r9, r14)
            if (r5 != r0) goto Le6
            goto L10c
        Le6:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L101
            of6 r5 = r6.J0
            r14.d0 = r6
            r14.Y = r2
            r14.Z = r3
            u77 r3 = defpackage.u77.a
            java.lang.Object r3 = r5.a(r3, r14)
            if (r3 != r0) goto Lff
            goto L10c
        Lff:
            r3 = r6
        L100:
            r6 = r3
        L101:
            r14.d0 = r10
            r14.Y = r2
            r14.Z = r1
            r6.U0()
            if (r8 != r0) goto L10d
        L10c:
            r8 = r0
        L10d:
            return r8
        L10e:
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            v80 r9 = (defpackage.v80) r9
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r14.Y
            if (r1 == 0) goto L125
            if (r1 != r7) goto L120
            defpackage.oi2.Y(r15)     // Catch: java.lang.Throwable -> L11e
            goto L13f
        L11e:
            r0 = move-exception
            goto L149
        L120:
            defpackage.i.m(r5)
            r8 = r10
            goto L148
        L125:
            defpackage.oi2.Y(r15)
            java.lang.Object r1 = r14.d0     // Catch: java.lang.Throwable -> L11e
            le2[] r1 = (defpackage.le2[]) r1     // Catch: java.lang.Throwable -> L11e
            int r2 = r14.Z     // Catch: java.lang.Throwable -> L11e
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L11e
            bu0 r3 = new bu0     // Catch: java.lang.Throwable -> L11e
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L11e
            r14.Y = r7     // Catch: java.lang.Throwable -> L11e
            java.lang.Object r1 = r1.b(r3, r14)     // Catch: java.lang.Throwable -> L11e
            if (r1 != r0) goto L13f
            r8 = r0
            goto L148
        L13f:
            int r0 = r6.decrementAndGet()
            if (r0 != 0) goto L148
            r9.i(r10)
        L148:
            return r8
        L149:
            int r1 = r6.decrementAndGet()
            if (r1 != 0) goto L152
            r9.i(r10)
        L152:
            throw r0
        L153:
            int r0 = r14.Z
            pr3 r6 = (defpackage.pr3) r6
            java.lang.Object r11 = r14.d0
            w61 r11 = (defpackage.w61) r11
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r13 = r14.Y
            if (r13 == 0) goto L177
            if (r13 == r7) goto L173
            if (r13 == r3) goto L16e
            if (r13 != r1) goto L168
            goto L16e
        L168:
            defpackage.i.m(r5)
            r8 = r10
            goto L20e
        L16e:
            defpackage.oi2.Y(r15)
            goto L20e
        L173:
            defpackage.oi2.Y(r15)
            goto L1ae
        L177:
            defpackage.oi2.Y(r15)
            l7 r5 = new l7
            r5.<init>(r6, r0, r10, r2)
            defpackage.hv.L(r11, r10, r10, r5, r1)
            jr3 r2 = r6.j()
            java.util.List r2 = r2.k
            java.util.Iterator r2 = r2.iterator()
        L18c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L19e
            java.lang.Object r5 = r2.next()
            r11 = r5
            kr3 r11 = (defpackage.kr3) r11
            int r11 = r11.a
            if (r11 != r0) goto L18c
            goto L19f
        L19e:
            r5 = r10
        L19f:
            kr3 r5 = (defpackage.kr3) r5
        L1a1:
            if (r5 != 0) goto L1ce
            r14.d0 = r10
            r14.Y = r7
            java.lang.Object r2 = defpackage.lv2.c(r14)
            if (r2 != r12) goto L1ae
            goto L20d
        L1ae:
            jr3 r2 = r6.j()
            java.util.List r2 = r2.k
            java.util.Iterator r2 = r2.iterator()
        L1b8:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L1ca
            java.lang.Object r5 = r2.next()
            r11 = r5
            kr3 r11 = (defpackage.kr3) r11
            int r11 = r11.a
            if (r11 != r0) goto L1b8
            goto L1cb
        L1ca:
            r5 = r10
        L1cb:
            kr3 r5 = (defpackage.kr3) r5
            goto L1a1
        L1ce:
            int r0 = r5.m
            r2 = r9
            gn r2 = (defpackage.gn) r2
            java.lang.Object r2 = r2.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            gn r9 = (defpackage.gn) r9
            if (r2 != 0) goto L1f6
            float r0 = (float) r0
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            r14.d0 = r10
            r14.Y = r3
            java.lang.Object r0 = r9.e(r14, r1)
            if (r0 != r12) goto L20e
            goto L20d
        L1f6:
            float r0 = (float) r0
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r0)
            r14.d0 = r10
            r14.Y = r1
            r1 = r2
            r2 = 0
            r3 = 0
            r5 = 14
            r4 = r14
            r0 = r9
            java.lang.Object r0 = defpackage.gn.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto L20e
        L20d:
            r8 = r12
        L20e:
            return r8
    }
}
