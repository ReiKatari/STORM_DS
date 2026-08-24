package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz6  reason: default package */
/* loaded from: classes.dex */
public abstract class hz6 {
    public static final defpackage.do1 a = null;

    static {
            do1 r0 = new do1
            r1 = 3
            r2 = 2
            r3 = 0
            r0.<init>(r1, r3, r2)
            defpackage.hz6.a = r0
            return
    }

    public static final java.lang.Object a(defpackage.mw6 r5, boolean r6, defpackage.py4 r7, defpackage.d20 r8) {
            boolean r0 = r8 instanceof defpackage.yy6
            if (r0 == 0) goto L13
            r0 = r8
            yy6 r0 = (defpackage.yy6) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            yy6 r0 = new yy6
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.Y
            py4 r6 = r0.X
            mw6 r7 = r0.R
            defpackage.oi2.Y(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L38:
            defpackage.oi2.Y(r8)
        L3b:
            r0.R = r5
            r0.X = r7
            r0.Y = r6
            r0.d0 = r3
            java.lang.Object r8 = r5.c(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            oy4 r8 = (defpackage.oy4) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
    }

    public static /* synthetic */ java.lang.Object b(defpackage.mw6 r1, defpackage.d20 r2, int r3) {
            r0 = 1
            r3 = r3 & r0
            if (r3 == 0) goto L5
            goto L6
        L5:
            r0 = 0
        L6:
            py4 r3 = defpackage.py4.Main
            java.lang.Object r1 = a(r1, r0, r3, r2)
            return r1
    }

    public static final java.lang.Object c(defpackage.mw6 r8, defpackage.s41 r9) {
            boolean r0 = r9 instanceof defpackage.zy6
            if (r0 == 0) goto L13
            r0 = r9
            zy6 r0 = (defpackage.zy6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            zy6 r0 = new zy6
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            mw6 r8 = r0.R
            defpackage.oi2.Y(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L30:
            defpackage.oi2.Y(r9)
        L33:
            r0.R = r8
            r0.Y = r3
            py4 r9 = defpackage.py4.Main
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            oy4 r9 = (defpackage.oy4) r9
            java.util.List r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4a:
            if (r6 >= r4) goto L58
            java.lang.Object r7 = r2.get(r6)
            vy4 r7 = (defpackage.vy4) r7
            r7.a()
            int r6 = r6 + 1
            goto L4a
        L58:
            java.util.List r9 = r9.a
            int r2 = r9.size()
        L5e:
            if (r5 >= r2) goto L6e
            java.lang.Object r4 = r9.get(r5)
            vy4 r4 = (defpackage.vy4) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L6b
            goto L33
        L6b:
            int r5 = r5 + 1
            goto L5e
        L6e:
            jg7 r8 = defpackage.jg7.a
            return r8
    }

    public static java.lang.Object d(defpackage.zy4 r8, defpackage.hk6 r9, defpackage.qn2 r10, defpackage.r41 r11, int r12) {
            r12 = r12 & 4
            if (r12 == 0) goto L6
            do1 r9 = defpackage.hz6.a
        L6:
            r4 = r9
            hn r0 = new hn
            r6 = 0
            r7 = 11
            r2 = 0
            r3 = 0
            r1 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.g04.C(r0, r11)
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            if (r8 != r9) goto L1c
            return r8
        L1c:
            jg7 r8 = defpackage.jg7.a
            return r8
    }

    public static boolean e(defpackage.oy4 r4, boolean r5) {
            java.util.List r4 = r4.a
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r4.get(r2)
            vy4 r3 = (defpackage.vy4) r3
            if (r5 == 0) goto L17
            boolean r3 = defpackage.ej2.m(r3)
            goto L1b
        L17:
            boolean r3 = defpackage.ej2.n(r3)
        L1b:
            if (r3 != 0) goto L1e
            return r1
        L1e:
            int r2 = r2 + 1
            goto L8
        L21:
            r4 = 1
            return r4
    }

    public static defpackage.ap6 f(defpackage.w61 r4, defpackage.rc3 r5, defpackage.eo2 r6) {
            a71 r0 = defpackage.a71.UNDISPATCHED
            vy5 r1 = new vy5
            r2 = 12
            r3 = 0
            r1.<init>(r5, r6, r3, r2)
            r5 = 1
            ap6 r4 = defpackage.hv.L(r4, r3, r0, r1, r5)
            return r4
    }

    public static final java.lang.Object g(defpackage.mw6 r21, defpackage.w61 r22, defpackage.j25 r23, defpackage.qn2 r24, defpackage.qn2 r25, defpackage.fo2 r26, defpackage.qn2 r27, defpackage.d20 r28) {
            r0 = r21
            r1 = r28
            boolean r2 = r1 instanceof defpackage.dz6
            if (r2 == 0) goto L17
            r2 = r1
            dz6 r2 = (defpackage.dz6) r2
            int r3 = r2.j0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.j0 = r3
            goto L1c
        L17:
            dz6 r2 = new dz6
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.i0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.j0
            az3 r12 = defpackage.az3.a
            do1 r13 = defpackage.hz6.a
            jg7 r14 = defpackage.jg7.a
            r15 = 1
            r28 = 0
            switch(r4) {
                case 0: goto L152;
                case 1: goto L12a;
                case 2: goto L106;
                case 3: goto Ld6;
                case 4: goto Lc4;
                case 5: goto L96;
                case 6: goto L78;
                case 7: goto L48;
                case 8: goto L34;
                default: goto L2e;
            }
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r28
        L34:
            java.lang.Object r0 = r2.Y
            rc3 r0 = (defpackage.rc3) r0
            java.lang.Object r3 = r2.X
            j25 r3 = (defpackage.j25) r3
            java.lang.Object r2 = r2.R
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r1)
            r18 = r14
            r11 = 0
            goto L389
        L48:
            java.lang.Object r0 = r2.h0
            vy4 r0 = (defpackage.vy4) r0
            java.lang.Object r4 = r2.g0
            vy4 r4 = (defpackage.vy4) r4
            java.lang.Object r8 = r2.f0
            rc3 r8 = (defpackage.rc3) r8
            java.lang.Object r9 = r2.e0
            qn2 r9 = (defpackage.qn2) r9
            java.lang.Object r11 = r2.d0
            qn2 r11 = (defpackage.qn2) r11
            qn2 r13 = r2.Z
            java.lang.Object r15 = r2.Y
            j25 r15 = (defpackage.j25) r15
            java.lang.Object r5 = r2.X
            w61 r5 = (defpackage.w61) r5
            java.lang.Object r6 = r2.R
            mw6 r6 = (defpackage.mw6) r6
            defpackage.oi2.Y(r1)
            r7 = r9
            r9 = r5
            r5 = r7
            r7 = r11
            r17 = r12
            r18 = r14
            r11 = 0
            goto L355
        L78:
            java.lang.Object r0 = r2.e0
            vy4 r0 = (defpackage.vy4) r0
            java.lang.Object r3 = r2.d0
            rc3 r3 = (defpackage.rc3) r3
            qn2 r4 = r2.Z
            java.lang.Object r5 = r2.Y
            qn2 r5 = (defpackage.qn2) r5
            java.lang.Object r6 = r2.X
            j25 r6 = (defpackage.j25) r6
            java.lang.Object r2 = r2.R
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r1)
            r18 = r14
            r11 = 0
            goto L32b
        L96:
            java.lang.Object r0 = r2.h0
            rc3 r0 = (defpackage.rc3) r0
            java.lang.Object r4 = r2.g0
            vy4 r4 = (defpackage.vy4) r4
            java.lang.Object r5 = r2.f0
            qn2 r5 = (defpackage.qn2) r5
            java.lang.Object r6 = r2.e0
            fo2 r6 = (defpackage.fo2) r6
            java.lang.Object r8 = r2.d0
            qn2 r8 = (defpackage.qn2) r8
            qn2 r9 = r2.Z
            java.lang.Object r11 = r2.Y
            j25 r11 = (defpackage.j25) r11
            java.lang.Object r7 = r2.X
            w61 r7 = (defpackage.w61) r7
            java.lang.Object r10 = r2.R
            mw6 r10 = (defpackage.mw6) r10
            defpackage.oi2.Y(r1)
            r18 = r14
            r14 = r9
            r9 = r7
            r7 = r8
            r8 = r11
            r11 = 0
            goto L2c3
        Lc4:
            java.lang.Object r0 = r2.Y
            rc3 r0 = (defpackage.rc3) r0
            java.lang.Object r3 = r2.X
            j25 r3 = (defpackage.j25) r3
            java.lang.Object r2 = r2.R
            w61 r2 = (defpackage.w61) r2
            defpackage.oi2.Y(r1)
            r11 = 0
            goto L240
        Ld6:
            java.lang.Object r0 = r2.h0
            rc3 r0 = (defpackage.rc3) r0
            java.lang.Object r4 = r2.g0
            vy4 r4 = (defpackage.vy4) r4
            java.lang.Object r5 = r2.f0
            qn2 r5 = (defpackage.qn2) r5
            java.lang.Object r6 = r2.e0
            fo2 r6 = (defpackage.fo2) r6
            java.lang.Object r7 = r2.d0
            qn2 r7 = (defpackage.qn2) r7
            qn2 r10 = r2.Z
            java.lang.Object r8 = r2.Y
            j25 r8 = (defpackage.j25) r8
            java.lang.Object r9 = r2.X
            w61 r9 = (defpackage.w61) r9
            java.lang.Object r11 = r2.R
            mw6 r11 = (defpackage.mw6) r11
            defpackage.oi2.Y(r1)
            r15 = r5
            r5 = r4
            r4 = r8
            r8 = r9
            r9 = r7
            r7 = r6
            r6 = r15
            r15 = r11
            r11 = 0
            goto L20f
        L106:
            java.lang.Object r0 = r2.g0
            rc3 r0 = (defpackage.rc3) r0
            java.lang.Object r4 = r2.f0
            qn2 r4 = (defpackage.qn2) r4
            java.lang.Object r5 = r2.e0
            fo2 r5 = (defpackage.fo2) r5
            java.lang.Object r6 = r2.d0
            qn2 r6 = (defpackage.qn2) r6
            qn2 r7 = r2.Z
            java.lang.Object r8 = r2.Y
            j25 r8 = (defpackage.j25) r8
            java.lang.Object r9 = r2.X
            w61 r9 = (defpackage.w61) r9
            java.lang.Object r10 = r2.R
            mw6 r10 = (defpackage.mw6) r10
            defpackage.oi2.Y(r1)
            r11 = 0
            goto L1e1
        L12a:
            java.lang.Object r0 = r2.f0
            qn2 r0 = (defpackage.qn2) r0
            java.lang.Object r4 = r2.e0
            fo2 r4 = (defpackage.fo2) r4
            java.lang.Object r5 = r2.d0
            qn2 r5 = (defpackage.qn2) r5
            qn2 r6 = r2.Z
            java.lang.Object r7 = r2.Y
            j25 r7 = (defpackage.j25) r7
            java.lang.Object r8 = r2.X
            w61 r8 = (defpackage.w61) r8
            java.lang.Object r9 = r2.R
            mw6 r9 = (defpackage.mw6) r9
            defpackage.oi2.Y(r1)
            r20 = r7
            r7 = r4
            r4 = r20
            r20 = r6
            r6 = r5
            r5 = r20
            goto L17e
        L152:
            defpackage.oi2.Y(r1)
            r2.R = r0
            r1 = r22
            r2.X = r1
            r4 = r23
            r2.Y = r4
            r5 = r24
            r2.Z = r5
            r6 = r25
            r2.d0 = r6
            r7 = r26
            r2.e0 = r7
            r8 = r27
            r2.f0 = r8
            r2.j0 = r15
            r9 = 3
            java.lang.Object r10 = b(r0, r2, r9)
            if (r10 != r3) goto L17a
            goto L385
        L17a:
            r9 = r0
            r0 = r8
            r8 = r1
            r1 = r10
        L17e:
            vy4 r1 = (defpackage.vy4) r1
            r1.a()
            a71 r10 = defpackage.a71.UNDISPATCHED
            bz6 r11 = new bz6
            r24 = r1
            r1 = 0
            r11.<init>(r4, r1, r15)
            ap6 r10 = defpackage.hv.L(r8, r1, r10, r11, r15)
            if (r7 == r13) goto L1b0
            ez6 r11 = new ez6
            r16 = 0
            r25 = r1
            r23 = r4
            r22 = r7
            r21 = r11
            r26 = r16
            r21.<init>(r22, r23, r24, r25, r26)
            r15 = r21
            r1 = r23
            r4 = r24
            r11 = r25
            f(r8, r10, r15)
            goto L1b4
        L1b0:
            r11 = r1
            r1 = r4
            r4 = r24
        L1b4:
            if (r6 != 0) goto L1e5
            r2.R = r9
            r2.X = r8
            r2.Y = r1
            r2.Z = r5
            r2.d0 = r6
            r2.e0 = r7
            r2.f0 = r0
            r2.g0 = r10
            r4 = 2
            r2.j0 = r4
            py4 r4 = defpackage.py4.Main
            java.lang.Object r4 = i(r9, r4, r2)
            if (r4 != r3) goto L1d3
            goto L385
        L1d3:
            r20 = r4
            r4 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r1
            r1 = r20
            r20 = r7
            r7 = r5
            r5 = r20
        L1e1:
            vy4 r1 = (defpackage.vy4) r1
            goto L260
        L1e5:
            r2.R = r9
            r2.X = r8
            r2.Y = r1
            r2.Z = r5
            r2.d0 = r6
            r2.e0 = r7
            r2.f0 = r0
            r2.g0 = r4
            r2.h0 = r10
            r15 = 3
            r2.j0 = r15
            py4 r15 = defpackage.py4.Main
            java.lang.Object r15 = h(r9, r15, r2)
            if (r15 != r3) goto L204
            goto L385
        L204:
            r20 = r6
            r6 = r0
            r0 = r10
            r10 = r5
            r5 = r4
            r4 = r1
            r1 = r15
            r15 = r9
            r9 = r20
        L20f:
            bz3 r1 = (defpackage.bz3) r1
            boolean r19 = defpackage.nb3.k(r1, r12)
            if (r19 == 0) goto L24a
            long r5 = r5.c
            jk4 r1 = new jk4
            r1.<init>(r5)
            r9.g(r1)
            r2.R = r8
            r2.X = r4
            r2.Y = r0
            r2.Z = r11
            r2.d0 = r11
            r2.e0 = r11
            r2.f0 = r11
            r2.g0 = r11
            r2.h0 = r11
            r1 = 4
            r2.j0 = r1
            java.lang.Object r1 = c(r15, r2)
            if (r1 != r3) goto L23e
            goto L385
        L23e:
            r3 = r4
            r2 = r8
        L240:
            az6 r1 = new az6
            r4 = 2
            r1.<init>(r3, r11, r4)
            f(r2, r0, r1)
            return r14
        L24a:
            boolean r5 = r1 instanceof defpackage.zy3
            if (r5 == 0) goto L253
            zy3 r1 = (defpackage.zy3) r1
            vy4 r1 = r1.a
            goto L258
        L253:
            boolean r1 = r1 instanceof defpackage.yy3
            if (r1 == 0) goto L3e0
            r1 = r11
        L258:
            r5 = r8
            r8 = r4
            r4 = r6
            r6 = r9
            r9 = r5
            r5 = r7
            r7 = r10
            r10 = r15
        L260:
            if (r1 != 0) goto L26f
            az6 r15 = new az6
            r18 = r14
            r14 = 3
            r15.<init>(r8, r11, r14)
            ap6 r0 = f(r9, r0, r15)
            goto L27e
        L26f:
            r18 = r14
            r1.a()
            az6 r14 = new az6
            r15 = 4
            r14.<init>(r8, r11, r15)
            ap6 r0 = f(r9, r0, r14)
        L27e:
            if (r1 == 0) goto L3df
            if (r7 != 0) goto L28f
            if (r4 == 0) goto L3df
            long r0 = r1.c
            jk4 r2 = new jk4
            r2.<init>(r0)
            r4.g(r2)
            return r18
        L28f:
            r2.R = r10
            r2.X = r9
            r2.Y = r8
            r2.Z = r7
            r2.d0 = r6
            r2.e0 = r5
            r2.f0 = r4
            r2.g0 = r1
            r2.h0 = r0
            r14 = 5
            r2.j0 = r14
            fo7 r14 = r10.f()
            long r14 = r14.a()
            r17 = r0
            la6 r0 = new la6
            r0.<init>(r1, r11)
            java.lang.Object r0 = r10.l(r14, r0, r2)
            if (r0 != r3) goto L2bb
            goto L385
        L2bb:
            r14 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r17
        L2c3:
            vy4 r1 = (defpackage.vy4) r1
            if (r1 != 0) goto L2d4
            if (r5 == 0) goto L3df
            long r0 = r4.c
            jk4 r2 = new jk4
            r2.<init>(r0)
            r5.g(r2)
            return r18
        L2d4:
            a71 r15 = defpackage.a71.UNDISPATCHED
            r24 = r1
            bf4 r1 = new bf4
            r17 = r12
            r12 = 22
            r1.<init>(r0, r8, r11, r12)
            r0 = 1
            ap6 r0 = defpackage.hv.L(r9, r11, r15, r1, r0)
            if (r6 == r13) goto L302
            ez6 r1 = new ez6
            r12 = 1
            r21 = r1
            r22 = r6
            r23 = r8
            r25 = r11
            r26 = r12
            r21.<init>(r22, r23, r24, r25, r26)
            r8 = r21
            r6 = r23
            r1 = r24
            f(r9, r0, r8)
            goto L305
        L302:
            r1 = r24
            r6 = r8
        L305:
            if (r7 != 0) goto L330
            r2.R = r9
            r2.X = r6
            r2.Y = r14
            r2.Z = r5
            r2.d0 = r0
            r2.e0 = r4
            r2.f0 = r11
            r2.g0 = r11
            r2.h0 = r11
            r1 = 6
            r2.j0 = r1
            py4 r1 = defpackage.py4.Main
            java.lang.Object r1 = i(r10, r1, r2)
            if (r1 != r3) goto L326
            goto L385
        L326:
            r3 = r0
            r0 = r4
            r4 = r5
            r2 = r9
            r5 = r14
        L32b:
            r10 = r1
            vy4 r10 = (defpackage.vy4) r10
            goto L3ac
        L330:
            r2.R = r10
            r2.X = r9
            r2.Y = r6
            r2.Z = r14
            r2.d0 = r7
            r2.e0 = r5
            r2.f0 = r0
            r2.g0 = r4
            r2.h0 = r1
            r8 = 7
            r2.j0 = r8
            py4 r8 = defpackage.py4.Main
            java.lang.Object r8 = h(r10, r8, r2)
            if (r8 != r3) goto L34e
            goto L385
        L34e:
            r13 = r8
            r8 = r0
            r0 = r1
            r1 = r13
            r15 = r6
            r6 = r10
            r13 = r14
        L355:
            bz3 r1 = (defpackage.bz3) r1
            r10 = r17
            boolean r10 = defpackage.nb3.k(r1, r10)
            if (r10 == 0) goto L393
            long r0 = r0.c
            jk4 r4 = new jk4
            r4.<init>(r0)
            r7.g(r4)
            r2.R = r9
            r2.X = r15
            r2.Y = r8
            r2.Z = r11
            r2.d0 = r11
            r2.e0 = r11
            r2.f0 = r11
            r2.g0 = r11
            r2.h0 = r11
            r0 = 8
            r2.j0 = r0
            java.lang.Object r0 = c(r6, r2)
            if (r0 != r3) goto L386
        L385:
            return r3
        L386:
            r0 = r8
            r2 = r9
            r3 = r15
        L389:
            az6 r1 = new az6
            r8 = 7
            r1.<init>(r3, r11, r8)
            f(r2, r0, r1)
            return r18
        L393:
            boolean r0 = r1 instanceof defpackage.zy3
            if (r0 == 0) goto L3a2
            zy3 r1 = (defpackage.zy3) r1
            vy4 r10 = r1.a
            r0 = r4
            r4 = r5
            r3 = r8
            r2 = r9
        L39f:
            r5 = r13
            r6 = r15
            goto L3ac
        L3a2:
            boolean r0 = r1 instanceof defpackage.yy3
            if (r0 == 0) goto L3db
            r0 = r4
            r4 = r5
            r3 = r8
            r2 = r9
            r10 = r11
            goto L39f
        L3ac:
            if (r10 == 0) goto L3c5
            r10.a()
            az6 r0 = new az6
            r14 = 5
            r0.<init>(r6, r11, r14)
            f(r2, r3, r0)
            long r0 = r10.c
            jk4 r2 = new jk4
            r2.<init>(r0)
            r5.g(r2)
            return r18
        L3c5:
            az6 r1 = new az6
            r5 = 6
            r1.<init>(r6, r11, r5)
            f(r2, r3, r1)
            if (r4 == 0) goto L3df
            long r0 = r0.c
            jk4 r2 = new jk4
            r2.<init>(r0)
            r4.g(r2)
            return r18
        L3db:
            defpackage.i.d()
            return r28
        L3df:
            return r18
        L3e0:
            defpackage.i.d()
            return r28
    }

    public static final java.lang.Object h(defpackage.mw6 r8, defpackage.py4 r9, defpackage.s41 r10) {
            boolean r0 = r10 instanceof defpackage.fz6
            if (r0 == 0) goto L13
            r0 = r10
            fz6 r0 = (defpackage.fz6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fz6 r0 = new fz6
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            dh5 r8 = r0.R
            defpackage.oi2.Y(r10)     // Catch: defpackage.qy4 -> L59
            goto L56
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r3
        L30:
            defpackage.oi2.Y(r10)
            dh5 r10 = new dh5
            r10.<init>()
            yy3 r2 = defpackage.yy3.a
            r10.A = r2
            fo7 r2 = r8.f()     // Catch: defpackage.qy4 -> L59
            long r5 = r2.b()     // Catch: defpackage.qy4 -> L59
            tj2 r2 = new tj2     // Catch: defpackage.qy4 -> L59
            r7 = 3
            r2.<init>(r9, r10, r3, r7)     // Catch: defpackage.qy4 -> L59
            r0.R = r10     // Catch: defpackage.qy4 -> L59
            r0.Y = r4     // Catch: defpackage.qy4 -> L59
            java.lang.Object r8 = r8.k(r5, r2, r0)     // Catch: defpackage.qy4 -> L59
            if (r8 != r1) goto L55
            return r1
        L55:
            r8 = r10
        L56:
            java.lang.Object r8 = r8.A
            return r8
        L59:
            az3 r8 = defpackage.az3.a
            return r8
    }

    public static final java.lang.Object i(defpackage.mw6 r17, defpackage.py4 r18, defpackage.d20 r19) {
            r0 = r19
            boolean r1 = r0 instanceof defpackage.gz6
            if (r1 == 0) goto L15
            r1 = r0
            gz6 r1 = (defpackage.gz6) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            gz6 r1 = new gz6
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.Y
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L46
            if (r3 == r7) goto L3e
            if (r3 != r5) goto L38
            py4 r3 = r1.X
            mw6 r8 = r1.R
            defpackage.oi2.Y(r0)
        L31:
            r16 = r3
            r3 = r1
            r1 = r16
            goto Lb0
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r4
        L3e:
            py4 r3 = r1.X
            mw6 r8 = r1.R
            defpackage.oi2.Y(r0)
            goto L65
        L46:
            defpackage.oi2.Y(r0)
            r0 = r17
            r3 = r1
            r1 = r18
        L4e:
            r3.R = r0
            r3.X = r1
            r3.Z = r7
            java.lang.Object r8 = r0.c(r1, r3)
            if (r8 != r2) goto L5b
            goto Laf
        L5b:
            r16 = r8
            r8 = r0
            r0 = r16
            r16 = r3
            r3 = r1
            r1 = r16
        L65:
            oy4 r0 = (defpackage.oy4) r0
            java.util.List r0 = r0.a
            int r9 = r0.size()
            r10 = r6
        L6e:
            if (r10 >= r9) goto Ld0
            java.lang.Object r11 = r0.get(r10)
            vy4 r11 = (defpackage.vy4) r11
            boolean r11 = defpackage.ej2.o(r11)
            if (r11 != 0) goto Lcd
            int r9 = r0.size()
            r10 = r6
        L81:
            if (r10 >= r9) goto La1
            java.lang.Object r11 = r0.get(r10)
            vy4 r11 = (defpackage.vy4) r11
            boolean r12 = r11.c()
            if (r12 != 0) goto Lc7
            ow6 r12 = r8.Y
            long r12 = r12.u0
            long r14 = r8.d()
            boolean r11 = defpackage.ej2.K(r11, r12, r14)
            if (r11 == 0) goto L9e
            goto Lc7
        L9e:
            int r10 = r10 + 1
            goto L81
        La1:
            py4 r0 = defpackage.py4.Final
            r1.R = r8
            r1.X = r3
            r1.Z = r5
            java.lang.Object r0 = r8.c(r0, r1)
            if (r0 != r2) goto L31
        Laf:
            return r2
        Lb0:
            oy4 r0 = (defpackage.oy4) r0
            java.util.List r0 = r0.a
            int r9 = r0.size()
            r10 = r6
        Lb9:
            if (r10 >= r9) goto Lcb
            java.lang.Object r11 = r0.get(r10)
            vy4 r11 = (defpackage.vy4) r11
            boolean r11 = r11.c()
            if (r11 == 0) goto Lc8
        Lc7:
            return r4
        Lc8:
            int r10 = r10 + 1
            goto Lb9
        Lcb:
            r0 = r8
            goto L4e
        Lcd:
            int r10 = r10 + 1
            goto L6e
        Ld0:
            java.lang.Object r0 = r0.get(r6)
            return r0
    }
}
