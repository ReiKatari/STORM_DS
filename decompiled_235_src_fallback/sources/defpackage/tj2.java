package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj2  reason: default package */
/* loaded from: classes.dex */
public final class tj2 extends defpackage.dm5 implements defpackage.eo2 {
    public final /* synthetic */ int L;
    public int R;
    public java.lang.Object X;
    public java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;

    public /* synthetic */ tj2(java.lang.Object r1, java.lang.Object r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.L = r4
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    public /* synthetic */ tj2(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.L = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.L
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L34;
                case 2: goto L25;
                case 3: goto L16;
                default: goto L7;
            }
        L7:
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            tj2 r2 = (defpackage.tj2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            tj2 r2 = (defpackage.tj2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            rb6 r3 = (defpackage.rb6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            tj2 r2 = (defpackage.tj2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            tj2 r2 = (defpackage.tj2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L43:
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            tj2 r2 = (defpackage.tj2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.L
            java.lang.Object r1 = r3.Z
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L30;
                case 2: goto L25;
                case 3: goto L16;
                default: goto L7;
            }
        L7:
            tj2 r0 = new tj2
            java.lang.Object r3 = r3.Y
            o97 r3 = (defpackage.o97) r3
            w61 r1 = (defpackage.w61) r1
            r2 = 4
            r0.<init>(r3, r1, r4, r2)
            r0.X = r5
            return r0
        L16:
            tj2 r0 = new tj2
            java.lang.Object r3 = r3.Y
            py4 r3 = (defpackage.py4) r3
            dh5 r1 = (defpackage.dh5) r1
            r2 = 3
            r0.<init>(r3, r1, r4, r2)
            r0.X = r5
            return r0
        L25:
            tj2 r3 = new tj2
            on2 r1 = (defpackage.on2) r1
            r0 = 2
            r3.<init>(r1, r4, r0)
            r3.Y = r5
            return r3
        L30:
            tj2 r3 = new tj2
            g17 r1 = (defpackage.g17) r1
            r0 = 1
            r3.<init>(r1, r4, r0)
            r3.X = r5
            return r3
        L3b:
            tj2 r0 = new tj2
            java.lang.Object r3 = r3.Y
            l61 r3 = (defpackage.l61) r3
            eo2 r1 = (defpackage.eo2) r1
            r2 = 0
            r0.<init>(r3, r1, r4, r2)
            r0.X = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r18) {
            r17 = this;
            r1 = r17
            int r0 = r1.L
            r2 = 0
            r3 = 2
            jg7 r4 = defpackage.jg7.a
            java.lang.Object r5 = r1.Z
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L1dd;
                case 1: goto L15d;
                case 2: goto L121;
                case 3: goto L54;
                default: goto L11;
            }
        L11:
            java.lang.Object r0 = r1.Y
            o97 r0 = (defpackage.o97) r0
            v80 r2 = r0.q0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r1.R
            h97 r10 = defpackage.h97.f
            if (r9 == 0) goto L2e
            if (r9 != r7) goto L29
            defpackage.oi2.Y(r18)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            goto L41
        L25:
            r0 = move-exception
            goto L50
        L27:
            r0 = move-exception
            goto L45
        L29:
            defpackage.i.m(r6)
            r4 = r8
            goto L4e
        L2e:
            defpackage.oi2.Y(r18)
            java.lang.Object r6 = r1.X
            mw6 r6 = (defpackage.mw6) r6
            ro5 r0 = r0.p0     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            r1.R = r7     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r0 = defpackage.lb4.j(r6, r2, r0, r1)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            if (r0 != r3) goto L41
            r4 = r3
            goto L4e
        L41:
            r2.c(r10)
            goto L4e
        L45:
            w61 r5 = (defpackage.w61) r5     // Catch: java.lang.Throwable -> L25
            boolean r1 = defpackage.g04.H(r5)     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L4f
            goto L41
        L4e:
            return r4
        L4f:
            throw r0     // Catch: java.lang.Throwable -> L25
        L50:
            r2.c(r10)
            throw r0
        L54:
            dh5 r5 = (defpackage.dh5) r5
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r1.R
            yy3 r10 = defpackage.yy3.a
            if (r9 == 0) goto L7d
            if (r9 == r7) goto L73
            if (r9 != r3) goto L6d
            java.lang.Object r6 = r1.X
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r18)
            r7 = r18
            goto Lef
        L6d:
            defpackage.i.m(r6)
            r4 = r8
            goto L120
        L73:
            java.lang.Object r6 = r1.X
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r18)
            r8 = r18
            goto L93
        L7d:
            defpackage.oi2.Y(r18)
            java.lang.Object r6 = r1.X
            mw6 r6 = (defpackage.mw6) r6
        L84:
            java.lang.Object r8 = r1.Y
            py4 r8 = (defpackage.py4) r8
            r1.X = r6
            r1.R = r7
            java.lang.Object r8 = r6.c(r8, r1)
            if (r8 != r0) goto L93
            goto Led
        L93:
            oy4 r8 = (defpackage.oy4) r8
            java.util.List r9 = r8.a
            int r11 = r9.size()
            r12 = r2
        L9c:
            if (r12 >= r11) goto L113
            java.lang.Object r13 = r9.get(r12)
            vy4 r13 = (defpackage.vy4) r13
            boolean r13 = defpackage.ej2.o(r13)
            if (r13 != 0) goto L10f
            int r8 = r8.c
            if (r8 != r3) goto Lb4
            az3 r0 = defpackage.az3.a
            r5.A = r0
            goto L120
        Lb4:
            int r8 = r9.size()
            r11 = r2
        Lb9:
            if (r11 >= r8) goto Le1
            java.lang.Object r12 = r9.get(r11)
            vy4 r12 = (defpackage.vy4) r12
            boolean r13 = r12.c()
            if (r13 != 0) goto Lde
            ow6 r13 = r6.Y
            long r13 = r13.u0
            r18 = r8
            long r7 = r6.d()
            boolean r7 = defpackage.ej2.K(r12, r13, r7)
            if (r7 == 0) goto Ld8
            goto Lde
        Ld8:
            int r11 = r11 + 1
            r8 = r18
            r7 = 1
            goto Lb9
        Lde:
            r5.A = r10
            goto L120
        Le1:
            py4 r7 = defpackage.py4.Final
            r1.X = r6
            r1.R = r3
            java.lang.Object r7 = r6.c(r7, r1)
            if (r7 != r0) goto Lef
        Led:
            r4 = r0
            goto L120
        Lef:
            oy4 r7 = (defpackage.oy4) r7
            java.util.List r7 = r7.a
            int r8 = r7.size()
            r9 = r2
        Lf8:
            if (r9 >= r8) goto L10c
            java.lang.Object r11 = r7.get(r9)
            vy4 r11 = (defpackage.vy4) r11
            boolean r11 = r11.c()
            if (r11 == 0) goto L109
            r5.A = r10
            goto L120
        L109:
            int r9 = r9 + 1
            goto Lf8
        L10c:
            r7 = 1
            goto L84
        L10f:
            int r12 = r12 + 1
            r7 = 1
            goto L9c
        L113:
            zy3 r0 = new zy3
            java.lang.Object r1 = r9.get(r2)
            vy4 r1 = (defpackage.vy4) r1
            r0.<init>(r1)
            r5.A = r0
        L120:
            return r4
        L121:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.R
            if (r2 == 0) goto L139
            r15 = 1
            if (r2 != r15) goto L134
            java.lang.Object r2 = r1.X
            java.lang.Object r3 = r1.Y
            rb6 r3 = (defpackage.rb6) r3
            defpackage.oi2.Y(r18)
            goto L15a
        L134:
            defpackage.i.m(r6)
            r4 = r8
            goto L15c
        L139:
            defpackage.oi2.Y(r18)
            java.lang.Object r2 = r1.Y
            rb6 r2 = (defpackage.rb6) r2
            r3 = r2
        L141:
            r2 = r5
            on2 r2 = (defpackage.on2) r2
            java.lang.Object r2 = r2.c()
            if (r2 == 0) goto L159
            r1.Y = r3
            r1.X = r2
            r15 = 1
            r1.R = r15
            x61 r6 = r3.c(r1, r2)
            if (r6 != r0) goto L15a
            r4 = r0
            goto L15c
        L159:
            r2 = r8
        L15a:
            if (r2 != 0) goto L141
        L15c:
            return r4
        L15d:
            g17 r5 = (defpackage.g17) r5
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r1.R
            if (r7 == 0) goto L187
            r15 = 1
            if (r7 == r15) goto L17d
            if (r7 != r3) goto L178
            java.lang.Object r6 = r1.Y
            vy4 r6 = (defpackage.vy4) r6
            java.lang.Object r7 = r1.X
            mw6 r7 = (defpackage.mw6) r7
            defpackage.oi2.Y(r18)
            r8 = r18
            goto L1b6
        L178:
            defpackage.i.m(r6)
            r4 = r8
            goto L1dc
        L17d:
            java.lang.Object r6 = r1.X
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r18)
            r7 = r18
            goto L19a
        L187:
            defpackage.oi2.Y(r18)
            java.lang.Object r6 = r1.X
            mw6 r6 = (defpackage.mw6) r6
            r1.X = r6
            r15 = 1
            r1.R = r15
            java.lang.Object r7 = defpackage.hz6.b(r6, r1, r3)
            if (r7 != r0) goto L19a
            goto L1b4
        L19a:
            vy4 r7 = (defpackage.vy4) r7
            long r8 = r7.c
            r5.d()
            r16 = r7
            r7 = r6
            r6 = r16
        L1a6:
            r1.X = r7
            r1.Y = r6
            r1.R = r3
            py4 r8 = defpackage.py4.Main
            java.lang.Object r8 = r7.c(r8, r1)
            if (r8 != r0) goto L1b6
        L1b4:
            r4 = r0
            goto L1dc
        L1b6:
            oy4 r8 = (defpackage.oy4) r8
            java.util.List r8 = r8.a
            int r9 = r8.size()
            r10 = r2
        L1bf:
            if (r10 >= r9) goto L1d9
            java.lang.Object r11 = r8.get(r10)
            vy4 r11 = (defpackage.vy4) r11
            long r12 = r11.a
            long r14 = r6.a
            boolean r12 = defpackage.nj2.o(r12, r14)
            if (r12 == 0) goto L1d6
            boolean r11 = r11.d
            if (r11 == 0) goto L1d6
            goto L1a6
        L1d6:
            int r10 = r10 + 1
            goto L1bf
        L1d9:
            r5.c()
        L1dc:
            return r4
        L1dd:
            java.lang.Object r0 = r1.Y
            r2 = r0
            l61 r2 = (defpackage.l61) r2
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r1.R
            r9 = 3
            if (r0 == 0) goto L215
            r15 = 1
            if (r0 == r15) goto L20b
            if (r0 == r3) goto L1fe
            if (r0 != r9) goto L1f9
            java.lang.Object r0 = r1.X
            mw6 r0 = (defpackage.mw6) r0
            defpackage.oi2.Y(r18)
            r6 = r0
            goto L206
        L1f9:
            defpackage.i.m(r6)
            r4 = r8
            goto L255
        L1fe:
            java.lang.Object r0 = r1.X
            r6 = r0
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r18)     // Catch: java.util.concurrent.CancellationException -> L208
        L206:
            r15 = 1
            goto L21d
        L208:
            r0 = move-exception
            r15 = 1
            goto L240
        L20b:
            java.lang.Object r0 = r1.X
            r6 = r0
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r18)     // Catch: java.util.concurrent.CancellationException -> L208
            r15 = 1
            goto L232
        L215:
            defpackage.oi2.Y(r18)
            java.lang.Object r0 = r1.X
            mw6 r0 = (defpackage.mw6) r0
            r6 = r0
        L21d:
            boolean r0 = defpackage.yh2.z(r2)
            if (r0 == 0) goto L255
            r0 = r5
            eo2 r0 = (defpackage.eo2) r0     // Catch: java.util.concurrent.CancellationException -> L208
            r1.X = r6     // Catch: java.util.concurrent.CancellationException -> L208
            r15 = 1
            r1.R = r15     // Catch: java.util.concurrent.CancellationException -> L23f
            java.lang.Object r0 = r0.o(r6, r1)     // Catch: java.util.concurrent.CancellationException -> L23f
            if (r0 != r7) goto L232
            goto L252
        L232:
            r1.X = r6     // Catch: java.util.concurrent.CancellationException -> L23f
            r1.R = r3     // Catch: java.util.concurrent.CancellationException -> L23f
            py4 r0 = defpackage.py4.Final     // Catch: java.util.concurrent.CancellationException -> L23f
            java.lang.Object r0 = defpackage.uj2.n(r6, r0, r1)     // Catch: java.util.concurrent.CancellationException -> L23f
            if (r0 != r7) goto L21d
            goto L252
        L23f:
            r0 = move-exception
        L240:
            boolean r8 = defpackage.yh2.z(r2)
            if (r8 == 0) goto L254
            r1.X = r6
            r1.R = r9
            py4 r0 = defpackage.py4.Final
            java.lang.Object r0 = defpackage.uj2.n(r6, r0, r1)
            if (r0 != r7) goto L21d
        L252:
            r4 = r7
            goto L255
        L254:
            throw r0
        L255:
            return r4
    }
}
