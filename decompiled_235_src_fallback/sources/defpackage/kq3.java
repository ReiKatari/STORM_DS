package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq3  reason: default package */
/* loaded from: classes.dex */
public final class kq3 extends defpackage.dm5 implements defpackage.eo2 {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ java.lang.Object X;
    public java.lang.Object Y;
    public java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;

    public /* synthetic */ kq3(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.L = r5
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public /* synthetic */ kq3(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.L = r3
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.L
            jg7 r1 = defpackage.jg7.a
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            kq3 r2 = (defpackage.kq3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            kq3 r2 = (defpackage.kq3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            kq3 r2 = (defpackage.kq3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            kq3 r2 = (defpackage.kq3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.L
            java.lang.Object r1 = r9.d0
            switch(r0) {
                case 0: goto L42;
                case 1: goto L2a;
                case 2: goto L1e;
                default: goto L7;
            }
        L7:
            kq3 r2 = new kq3
            java.lang.Object r0 = r9.Y
            r3 = r0
            l61 r3 = (defpackage.l61) r3
            java.lang.Object r9 = r9.Z
            r4 = r9
            os0 r4 = (defpackage.os0) r4
            r5 = r1
            ul0 r5 = (defpackage.ul0) r5
            r7 = 3
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r2.X = r11
            return r2
        L1e:
            r6 = r10
            kq3 r9 = new kq3
            dt6 r1 = (defpackage.dt6) r1
            r10 = 2
            r9.<init>(r1, r6, r10)
            r9.X = r11
            return r9
        L2a:
            r6 = r10
            kq3 r3 = new kq3
            java.lang.Object r10 = r9.Y
            r4 = r10
            ei r4 = (defpackage.ei) r4
            java.lang.Object r9 = r9.Z
            r5 = r9
            ci r5 = (defpackage.ci) r5
            g17 r1 = (defpackage.g17) r1
            r8 = 1
            r7 = r6
            r6 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r3.X = r11
            return r3
        L42:
            r6 = r10
            kq3 r9 = new kq3
            ue1 r1 = (defpackage.ue1) r1
            r10 = 0
            r9.<init>(r1, r6, r10)
            r9.X = r11
            return r9
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r30) {
            r29 = this;
            r0 = r29
            int r1 = r0.L
            r6 = 3
            r7 = 4
            jg7 r8 = defpackage.jg7.a
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r10 = 1
            java.lang.Object r11 = r0.d0
            r12 = 2
            switch(r1) {
                case 0: goto L537;
                case 1: goto L454;
                case 2: goto L1ee;
                default: goto L11;
            }
        L11:
            java.lang.Object r1 = r0.Z
            os0 r1 = (defpackage.os0) r1
            ul0 r11 = (defpackage.ul0) r11
            x61 r15 = defpackage.x61.COROUTINE_SUSPENDED
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = r0.R
            r18 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            h97 r3 = defpackage.h97.f
            if (r2 == 0) goto L6b
            if (r2 == r10) goto L61
            if (r2 == r12) goto L54
            if (r2 == r6) goto L47
            if (r2 != r7) goto L41
            java.lang.Object r2 = r0.X
            mw6 r2 = (defpackage.mw6) r2
            defpackage.oi2.Y(r30)     // Catch: java.lang.Throwable -> L3e
            r4 = r30
            r27 = r8
            goto L1c7
        L3e:
            r0 = move-exception
            goto L1e7
        L41:
            defpackage.i.m(r9)
            r8 = 0
            goto L1ed
        L47:
            java.lang.Object r2 = r0.X
            mw6 r2 = (defpackage.mw6) r2
            defpackage.oi2.Y(r30)     // Catch: java.lang.Throwable -> L3e
            r4 = r30
            r27 = r8
            goto L16a
        L54:
            java.lang.Object r2 = r0.X
            mw6 r2 = (defpackage.mw6) r2
            defpackage.oi2.Y(r30)     // Catch: java.lang.Throwable -> L3e
            r4 = r30
            r27 = r8
            goto L10a
        L61:
            java.lang.Object r2 = r0.X
            mw6 r2 = (defpackage.mw6) r2
            defpackage.oi2.Y(r30)     // Catch: java.lang.Throwable -> L3e
            r9 = r30
            goto L8a
        L6b:
            defpackage.oi2.Y(r30)
            java.lang.Object r2 = r0.X
            mw6 r2 = (defpackage.mw6) r2
        L72:
            java.lang.Object r9 = r0.Y
            l61 r9 = (defpackage.l61) r9
            boolean r9 = defpackage.yh2.z(r9)
            if (r9 == 0) goto L1eb
        L7c:
            r0.X = r2     // Catch: java.lang.Throwable -> L3e
            r0.R = r10     // Catch: java.lang.Throwable -> L3e
            py4 r9 = defpackage.py4.Main     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r9 = r2.c(r9, r0)     // Catch: java.lang.Throwable -> L3e
            if (r9 != r15) goto L8a
            goto L1c5
        L8a:
            oy4 r9 = (defpackage.oy4) r9     // Catch: java.lang.Throwable -> L3e
            jk4 r14 = defpackage.lb4.g(r2, r9, r1)     // Catch: java.lang.Throwable -> L3e
            jk4 r4 = defpackage.lb4.h(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.Float r5 = defpackage.lb4.i(r9)     // Catch: java.lang.Throwable -> L3e
            if (r14 != 0) goto L9e
            if (r4 != 0) goto L9e
            if (r5 == 0) goto L7c
        L9e:
            g97 r13 = defpackage.g97.f
            if (r14 == 0) goto L11b
            long r4 = r14.a     // Catch: java.lang.Throwable -> L3e
            r11.c(r13)     // Catch: java.lang.Throwable -> L3e
        La7:
            long r4 = r4 & r16
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L3e
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L3e
            r5 = 1141391360(0x44084000, float:545.0)
            float r4 = r4 / r5
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L3e
            double r4 = java.lang.Math.pow(r13, r4)     // Catch: java.lang.Throwable -> L3e
            float r4 = (float) r4     // Catch: java.lang.Throwable -> L3e
            f97 r20 = new f97     // Catch: java.lang.Throwable -> L3e
            java.util.List r5 = r9.a     // Catch: java.lang.Throwable -> L3e
            int r9 = r5.size()     // Catch: java.lang.Throwable -> L3e
            r27 = r8
            r7 = 0
            r13 = 0
            r14 = 0
        Lc8:
            if (r13 >= r9) goto Le1
            java.lang.Object r21 = r5.get(r13)     // Catch: java.lang.Throwable -> L3e
            r10 = r21
            vy4 r10 = (defpackage.vy4) r10     // Catch: java.lang.Throwable -> L3e
            r21 = r13
            long r12 = r10.c     // Catch: java.lang.Throwable -> L3e
            long r7 = defpackage.jk4.f(r7, r12)     // Catch: java.lang.Throwable -> L3e
            int r14 = r14 + 1
            int r13 = r21 + 1
            r10 = 1
            r12 = 2
            goto Lc8
        Le1:
            if (r14 != 0) goto Le6
            r21 = r18
            goto Led
        Le6:
            float r5 = (float) r14     // Catch: java.lang.Throwable -> L3e
            long r7 = defpackage.jk4.b(r5, r7)     // Catch: java.lang.Throwable -> L3e
            r21 = r7
        Led:
            r24 = 0
            r26 = 0
            r23 = r4
            r20.<init>(r21, r23, r24, r26)     // Catch: java.lang.Throwable -> L3e
            r4 = r20
            r11.c(r4)     // Catch: java.lang.Throwable -> L3e
            r0.X = r2     // Catch: java.lang.Throwable -> L3e
            r4 = 2
            r0.R = r4     // Catch: java.lang.Throwable -> L3e
            py4 r4 = defpackage.py4.Main     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r2.c(r4, r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 != r15) goto L10a
            goto L1c5
        L10a:
            r9 = r4
            oy4 r9 = (defpackage.oy4) r9     // Catch: java.lang.Throwable -> L3e
            jk4 r4 = defpackage.lb4.g(r2, r9, r1)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L1d5
            long r4 = r4.a     // Catch: java.lang.Throwable -> L3e
            r8 = r27
            r7 = 4
            r10 = 1
            r12 = 2
            goto La7
        L11b:
            r27 = r8
            if (r4 == 0) goto L176
            long r4 = r4.a     // Catch: java.lang.Throwable -> L3e
            r11.c(r13)     // Catch: java.lang.Throwable -> L3e
        L124:
            r24 = r4
            f97 r20 = new f97     // Catch: java.lang.Throwable -> L3e
            java.util.List r4 = r9.a     // Catch: java.lang.Throwable -> L3e
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L3e
            r7 = 0
            r8 = 0
            r9 = 0
        L132:
            if (r7 >= r5) goto L145
            java.lang.Object r12 = r4.get(r7)     // Catch: java.lang.Throwable -> L3e
            vy4 r12 = (defpackage.vy4) r12     // Catch: java.lang.Throwable -> L3e
            long r12 = r12.c     // Catch: java.lang.Throwable -> L3e
            long r9 = defpackage.jk4.f(r9, r12)     // Catch: java.lang.Throwable -> L3e
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L132
        L145:
            if (r8 != 0) goto L14a
            r21 = r18
            goto L151
        L14a:
            float r4 = (float) r8     // Catch: java.lang.Throwable -> L3e
            long r4 = defpackage.jk4.b(r4, r9)     // Catch: java.lang.Throwable -> L3e
            r21 = r4
        L151:
            r23 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r20.<init>(r21, r23, r24, r26)     // Catch: java.lang.Throwable -> L3e
            r4 = r20
            r11.c(r4)     // Catch: java.lang.Throwable -> L3e
            r0.X = r2     // Catch: java.lang.Throwable -> L3e
            r0.R = r6     // Catch: java.lang.Throwable -> L3e
            py4 r4 = defpackage.py4.Main     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r2.c(r4, r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 != r15) goto L16a
            goto L1c5
        L16a:
            r9 = r4
            oy4 r9 = (defpackage.oy4) r9     // Catch: java.lang.Throwable -> L3e
            jk4 r4 = defpackage.lb4.h(r9)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L1d5
            long r4 = r4.a     // Catch: java.lang.Throwable -> L3e
            goto L124
        L176:
            if (r5 == 0) goto L1df
            float r4 = r5.floatValue()     // Catch: java.lang.Throwable -> L3e
            r11.c(r13)     // Catch: java.lang.Throwable -> L3e
            r23 = r4
        L181:
            f97 r20 = new f97     // Catch: java.lang.Throwable -> L3e
            java.util.List r4 = r9.a     // Catch: java.lang.Throwable -> L3e
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L3e
            r7 = 0
            r8 = 0
            r9 = 0
        L18d:
            if (r7 >= r5) goto L1a0
            java.lang.Object r12 = r4.get(r7)     // Catch: java.lang.Throwable -> L3e
            vy4 r12 = (defpackage.vy4) r12     // Catch: java.lang.Throwable -> L3e
            long r12 = r12.c     // Catch: java.lang.Throwable -> L3e
            long r9 = defpackage.jk4.f(r9, r12)     // Catch: java.lang.Throwable -> L3e
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L18d
        L1a0:
            if (r8 != 0) goto L1a5
            r21 = r18
            goto L1ac
        L1a5:
            float r4 = (float) r8     // Catch: java.lang.Throwable -> L3e
            long r4 = defpackage.jk4.b(r4, r9)     // Catch: java.lang.Throwable -> L3e
            r21 = r4
        L1ac:
            r24 = 0
            r26 = 0
            r20.<init>(r21, r23, r24, r26)     // Catch: java.lang.Throwable -> L3e
            r4 = r20
            r11.c(r4)     // Catch: java.lang.Throwable -> L3e
            r0.X = r2     // Catch: java.lang.Throwable -> L3e
            r4 = 4
            r0.R = r4     // Catch: java.lang.Throwable -> L3e
            py4 r4 = defpackage.py4.Main     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r2.c(r4, r0)     // Catch: java.lang.Throwable -> L3e
            if (r4 != r15) goto L1c7
        L1c5:
            r8 = r15
            goto L1ed
        L1c7:
            r9 = r4
            oy4 r9 = (defpackage.oy4) r9     // Catch: java.lang.Throwable -> L3e
            java.lang.Float r4 = defpackage.lb4.i(r9)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L1d5
            float r23 = r4.floatValue()     // Catch: java.lang.Throwable -> L3e
            goto L181
        L1d5:
            r11.c(r3)
            r8 = r27
            r7 = 4
            r10 = 1
            r12 = 2
            goto L72
        L1df:
            java.lang.String r0 = "One of zoomOffset, panOffset and scaleDelta must be non-null"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        L1e7:
            r11.c(r3)
            throw r0
        L1eb:
            r27 = r8
        L1ed:
            return r8
        L1ee:
            r27 = r8
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            dt6 r11 = (defpackage.dt6) r11
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.R
            if (r2 == 0) goto L237
            r3 = 1
            if (r2 == r3) goto L22d
            r4 = 2
            if (r2 == r4) goto L21a
            if (r2 != r6) goto L214
            java.lang.Object r2 = r0.Y
            vy4 r2 = (defpackage.vy4) r2
            java.lang.Object r3 = r0.X
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r30)
            r4 = r30
            goto L41a
        L214:
            defpackage.i.m(r9)
            r8 = 0
            goto L453
        L21a:
            java.lang.Object r2 = r0.Z
            py4 r2 = (defpackage.py4) r2
            java.lang.Object r3 = r0.Y
            vy4 r3 = (defpackage.vy4) r3
            java.lang.Object r4 = r0.X
            mw6 r4 = (defpackage.mw6) r4
            defpackage.oi2.Y(r30)
            r5 = r30
            goto L2b6
        L22d:
            java.lang.Object r2 = r0.X
            mw6 r2 = (defpackage.mw6) r2
            defpackage.oi2.Y(r30)
            r3 = r30
            goto L24d
        L237:
            defpackage.oi2.Y(r30)
            java.lang.Object r2 = r0.X
            mw6 r2 = (defpackage.mw6) r2
            py4 r3 = defpackage.py4.Initial
            r0.X = r2
            r4 = 1
            r0.R = r4
            java.lang.Object r3 = defpackage.hz6.a(r2, r4, r3, r0)
            if (r3 != r1) goto L24d
            goto L418
        L24d:
            vy4 r3 = (defpackage.vy4) r3
            int r4 = r3.i
            long r7 = r3.c
            if (r4 != r6) goto L256
            goto L259
        L256:
            r5 = 4
            if (r4 != r5) goto L451
        L259:
            r4 = 32
            long r9 = r7 >> r4
            int r5 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r5)
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 < 0) goto L293
            float r5 = java.lang.Float.intBitsToFloat(r5)
            ow6 r9 = r2.Y
            long r12 = r9.u0
            long r12 = r12 >> r4
            int r4 = (int) r12
            float r4 = (float) r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 >= 0) goto L293
            long r4 = r7 & r16
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 < 0) goto L293
            float r4 = java.lang.Float.intBitsToFloat(r4)
            ow6 r5 = r2.Y
            long r7 = r5.u0
            long r7 = r7 & r16
            int r5 = (int) r7
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L293
            r4 = 1
            goto L294
        L293:
            r4 = 0
        L294:
            boolean r5 = r11.n0
            if (r5 != 0) goto L29e
            if (r4 == 0) goto L29b
            goto L29e
        L29b:
            py4 r4 = defpackage.py4.Main
            goto L2a0
        L29e:
            py4 r4 = defpackage.py4.Initial
        L2a0:
            r28 = r4
            r4 = r2
            r2 = r28
        L2a5:
            r0.X = r4
            r0.Y = r3
            r0.Z = r2
            r5 = 2
            r0.R = r5
            java.lang.Object r5 = r4.c(r2, r0)
            if (r5 != r1) goto L2b6
            goto L418
        L2b6:
            oy4 r5 = (defpackage.oy4) r5
            java.util.List r7 = r5.a
            int r8 = r7.size()
            r9 = 0
        L2bf:
            if (r9 >= r8) goto L2e3
            java.lang.Object r10 = r7.get(r9)
            r12 = r10
            vy4 r12 = (defpackage.vy4) r12
            boolean r13 = r12.c()
            r15 = r7
            if (r13 != 0) goto L2de
            long r6 = r12.a
            long r13 = r3.a
            boolean r6 = defpackage.nj2.o(r6, r13)
            if (r6 == 0) goto L2de
            boolean r6 = r12.d
            if (r6 == 0) goto L2de
            goto L2e4
        L2de:
            int r9 = r9 + 1
            r7 = r15
            r6 = 3
            goto L2bf
        L2e3:
            r10 = 0
        L2e4:
            r6 = r10
            vy4 r6 = (defpackage.vy4) r6
            if (r6 != 0) goto L2ea
            goto L301
        L2ea:
            long r7 = r6.b
            long r9 = r3.b
            long r7 = r7 - r9
            fo7 r9 = r4.f()
            long r9 = r9.b()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L2fc
            goto L301
        L2fc:
            int r5 = r5.c
            r7 = 2
            if (r5 != r7) goto L303
        L301:
            r6 = 0
            goto L31b
        L303:
            long r7 = r6.c
            long r9 = r3.c
            long r7 = defpackage.jk4.e(r7, r9)
            float r5 = defpackage.jk4.d(r7)
            fo7 r7 = r4.f()
            float r7 = r7.c()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L44e
        L31b:
            if (r6 != 0) goto L31f
            goto L451
        L31f:
            boolean r2 = r11.n0
            if (r2 != 0) goto L3fc
            z64 r2 = r11.A
            r5 = 0
        L326:
            r7 = 16
            if (r2 == 0) goto L372
            boolean r8 = r2 instanceof defpackage.vh2
            if (r8 == 0) goto L335
            vh2 r2 = (defpackage.vh2) r2
            defpackage.vh2.Z0(r2)
            goto L3fc
        L335:
            int r8 = r2.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L36d
            boolean r8 = r2 instanceof defpackage.zg1
            if (r8 == 0) goto L36d
            r8 = r2
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = 0
        L345:
            if (r8 == 0) goto L369
            int r10 = r8.L
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L366
            int r9 = r9 + 1
            r10 = 1
            if (r9 != r10) goto L354
            r2 = r8
            goto L366
        L354:
            if (r5 != 0) goto L35d
            ua4 r5 = new ua4
            z64[] r10 = new defpackage.z64[r7]
            r5.<init>(r10)
        L35d:
            if (r2 == 0) goto L363
            r5.b(r2)
            r2 = 0
        L363:
            r5.b(r8)
        L366:
            z64 r8 = r8.Y
            goto L345
        L369:
            r10 = 1
            if (r9 != r10) goto L36d
            goto L326
        L36d:
            z64 r2 = defpackage.nc1.A(r5)
            goto L326
        L372:
            z64 r2 = r11.A
            boolean r2 = r2.j0
            if (r2 != 0) goto L37d
            java.lang.String r2 = "visitChildren called on an unattached node"
            defpackage.p53.c(r2)
        L37d:
            ua4 r2 = new ua4
            z64[] r5 = new defpackage.z64[r7]
            r2.<init>(r5)
            z64 r5 = r11.A
            z64 r8 = r5.Y
            if (r8 != 0) goto L38e
            defpackage.nc1.z(r2, r5)
            goto L391
        L38e:
            r2.b(r8)
        L391:
            int r5 = r2.L
            if (r5 == 0) goto L3fc
            int r5 = r5 + (-1)
            java.lang.Object r5 = r2.l(r5)
            z64 r5 = (defpackage.z64) r5
            int r8 = r5.R
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L3a7
            defpackage.nc1.z(r2, r5)
            goto L391
        L3a7:
            if (r5 == 0) goto L391
            int r8 = r5.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L3f9
            r8 = 0
        L3b0:
            if (r5 == 0) goto L391
            boolean r9 = r5 instanceof defpackage.vh2
            if (r9 == 0) goto L3bc
            vh2 r5 = (defpackage.vh2) r5
            defpackage.vh2.Z0(r5)
            goto L3fc
        L3bc:
            int r9 = r5.L
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L3f4
            boolean r9 = r5 instanceof defpackage.zg1
            if (r9 == 0) goto L3f4
            r9 = r5
            zg1 r9 = (defpackage.zg1) r9
            z64 r9 = r9.l0
            r10 = 0
        L3cc:
            if (r9 == 0) goto L3f0
            int r12 = r9.L
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L3ed
            int r10 = r10 + 1
            r12 = 1
            if (r10 != r12) goto L3db
            r5 = r9
            goto L3ed
        L3db:
            if (r8 != 0) goto L3e4
            ua4 r8 = new ua4
            z64[] r12 = new defpackage.z64[r7]
            r8.<init>(r12)
        L3e4:
            if (r5 == 0) goto L3ea
            r8.b(r5)
            r5 = 0
        L3ea:
            r8.b(r9)
        L3ed:
            z64 r9 = r9.Y
            goto L3cc
        L3f0:
            r12 = 1
            if (r10 != r12) goto L3f4
            goto L3b0
        L3f4:
            z64 r5 = defpackage.nc1.A(r8)
            goto L3b0
        L3f9:
            z64 r5 = r5.Y
            goto L3a7
        L3fc:
            on2 r2 = r11.m0
            r2.c()
            r6.a()
            r2 = r3
            r3 = r4
        L406:
            py4 r4 = defpackage.py4.Initial
            r0.X = r3
            r0.Y = r2
            r5 = 0
            r0.Z = r5
            r13 = 3
            r0.R = r13
            java.lang.Object r4 = r3.c(r4, r0)
            if (r4 != r1) goto L41a
        L418:
            r8 = r1
            goto L453
        L41a:
            oy4 r4 = (defpackage.oy4) r4
            java.util.List r4 = r4.a
            int r5 = r4.size()
            r6 = 0
        L423:
            if (r6 >= r5) goto L444
            java.lang.Object r7 = r4.get(r6)
            r8 = r7
            vy4 r8 = (defpackage.vy4) r8
            boolean r9 = r8.c()
            if (r9 != 0) goto L441
            long r9 = r8.a
            long r11 = r2.a
            boolean r9 = defpackage.nj2.o(r9, r11)
            if (r9 == 0) goto L441
            boolean r8 = r8.d
            if (r8 == 0) goto L441
            goto L445
        L441:
            int r6 = r6 + 1
            goto L423
        L444:
            r7 = 0
        L445:
            vy4 r7 = (defpackage.vy4) r7
            if (r7 != 0) goto L44a
            goto L451
        L44a:
            r7.a()
            goto L406
        L44e:
            r6 = 3
            goto L2a5
        L451:
            r8 = r27
        L453:
            return r8
        L454:
            r27 = r8
            java.lang.Object r1 = r0.Y
            ei r1 = (defpackage.ei) r1
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.R
            if (r3 == 0) goto L482
            r10 = 1
            if (r3 == r10) goto L478
            r4 = 2
            if (r3 == r4) goto L473
            r13 = 3
            if (r3 == r13) goto L473
            r4 = 4
            if (r3 != r4) goto L46d
            goto L473
        L46d:
            defpackage.i.m(r9)
            r8 = 0
            goto L536
        L473:
            defpackage.oi2.Y(r30)
            goto L534
        L478:
            java.lang.Object r3 = r0.X
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r30)
            r4 = r30
            goto L496
        L482:
            defpackage.oi2.Y(r30)
            java.lang.Object r3 = r0.X
            mw6 r3 = (defpackage.mw6) r3
            r0.X = r3
            r10 = 1
            r0.R = r10
            java.lang.Object r4 = defpackage.kj2.g(r3, r0)
            if (r4 != r2) goto L496
            goto L532
        L496:
            oy4 r4 = (defpackage.oy4) r4
            java.lang.Object r5 = r1.L
            fo7 r5 = (defpackage.fo7) r5
            java.lang.Object r6 = r1.R
            vy4 r6 = (defpackage.vy4) r6
            java.util.List r7 = r4.a
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            vy4 r7 = (defpackage.vy4) r7
            if (r6 == 0) goto L4d5
            long r8 = r7.b
            long r14 = r6.b
            long r8 = r8 - r14
            long r14 = r5.a()
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 >= 0) goto L4d5
            int r8 = r6.i
            float r5 = defpackage.sn1.g(r5, r8)
            long r8 = r6.c
            long r14 = r7.c
            long r8 = defpackage.jk4.e(r8, r14)
            float r6 = defpackage.jk4.d(r8)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4d5
            int r5 = r1.B
            r10 = 1
            int r5 = r5 + r10
            r1.B = r5
            goto L4d8
        L4d5:
            r10 = 1
            r1.B = r10
        L4d8:
            r1.R = r7
            boolean r5 = defpackage.ma6.a(r4)
            if (r5 == 0) goto L510
            int r6 = r4.d
            r6 = r6 & 33
            if (r6 == 0) goto L510
            java.util.List r6 = r4.a
            int r7 = r6.size()
            r8 = 0
        L4ed:
            if (r8 >= r7) goto L4ff
            java.lang.Object r9 = r6.get(r8)
            vy4 r9 = (defpackage.vy4) r9
            boolean r9 = r9.c()
            if (r9 == 0) goto L4fc
            goto L510
        L4fc:
            int r8 = r8 + 1
            goto L4ed
        L4ff:
            java.lang.Object r5 = r0.Z
            ci r5 = (defpackage.ci) r5
            r6 = 0
            r0.X = r6
            r7 = 2
            r0.R = r7
            java.lang.Object r0 = defpackage.kj2.P(r3, r5, r1, r4, r0)
            if (r0 != r2) goto L534
            goto L532
        L510:
            if (r5 != 0) goto L534
            int r1 = r1.B
            g17 r11 = (defpackage.g17) r11
            r10 = 1
            if (r1 != r10) goto L526
            r5 = 0
            r0.X = r5
            r13 = 3
            r0.R = r13
            java.lang.Object r0 = defpackage.kj2.b0(r3, r11, r4, r0)
            if (r0 != r2) goto L534
            goto L532
        L526:
            r5 = 0
            r0.X = r5
            r5 = 4
            r0.R = r5
            java.lang.Object r0 = defpackage.kj2.i(r3, r11, r4, r1, r0)
            if (r0 != r2) goto L534
        L532:
            r8 = r2
            goto L536
        L534:
            r8 = r27
        L536:
            return r8
        L537:
            r27 = r8
            r5 = 0
            ue1 r11 = (defpackage.ue1) r11
            vs4 r1 = r11.c
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.R
            if (r3 == 0) goto L56e
            r10 = 1
            if (r3 == r10) goto L564
            r4 = 2
            if (r3 != r4) goto L55e
            java.lang.Object r3 = r0.Z
            vy4 r3 = (defpackage.vy4) r3
            java.lang.Object r4 = r0.Y
            vy4 r4 = (defpackage.vy4) r4
            java.lang.Object r5 = r0.X
            mw6 r5 = (defpackage.mw6) r5
            defpackage.oi2.Y(r30)
            r14 = r3
            r7 = 2
            r3 = r30
            goto L5a7
        L55e:
            defpackage.i.m(r9)
            r8 = r5
            goto L5df
        L564:
            java.lang.Object r3 = r0.X
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r30)
            r4 = r30
            goto L584
        L56e:
            defpackage.oi2.Y(r30)
            java.lang.Object r3 = r0.X
            mw6 r3 = (defpackage.mw6) r3
            py4 r4 = defpackage.py4.Initial
            r0.X = r3
            r10 = 1
            r0.R = r10
            r8 = 0
            java.lang.Object r4 = defpackage.hz6.a(r3, r8, r4, r0)
            if (r4 != r2) goto L584
            goto L5a5
        L584:
            vy4 r4 = (defpackage.vy4) r4
            jk4 r6 = new jk4
            r7 = 0
            r6.<init>(r7)
            r1.setValue(r6)
            r14 = r5
            r5 = r3
        L592:
            if (r14 != 0) goto L5cd
            py4 r3 = defpackage.py4.Initial
            r0.X = r5
            r0.Y = r4
            r0.Z = r14
            r7 = 2
            r0.R = r7
            java.lang.Object r3 = r5.c(r3, r0)
            if (r3 != r2) goto L5a7
        L5a5:
            r8 = r2
            goto L5df
        L5a7:
            oy4 r3 = (defpackage.oy4) r3
            java.util.List r6 = r3.a
            int r8 = r6.size()
            r9 = 0
        L5b0:
            if (r9 >= r8) goto L5c2
            java.lang.Object r10 = r6.get(r9)
            vy4 r10 = (defpackage.vy4) r10
            boolean r10 = defpackage.ej2.o(r10)
            if (r10 != 0) goto L5bf
            goto L592
        L5bf:
            int r9 = r9 + 1
            goto L5b0
        L5c2:
            java.util.List r3 = r3.a
            r8 = 0
            java.lang.Object r3 = r3.get(r8)
            r14 = r3
            vy4 r14 = (defpackage.vy4) r14
            goto L592
        L5cd:
            long r2 = r14.c
            long r4 = r4.c
            long r2 = defpackage.jk4.e(r2, r4)
            jk4 r0 = new jk4
            r0.<init>(r2)
            r1.setValue(r0)
            r8 = r27
        L5df:
            return r8
    }
}
