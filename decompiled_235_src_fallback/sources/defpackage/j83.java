package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j83  reason: default package */
/* loaded from: classes.dex */
public final class j83 extends defpackage.f55 implements java.lang.Runnable, defpackage.zk4, android.view.View.OnAttachStateChangeListener {
    public boolean L;
    public int R;
    public defpackage.vu7 X;
    public final defpackage.ja4 Y;
    public final defpackage.ss4 Z;
    public final defpackage.ca4 d0;
    public final defpackage.mm6 e0;

    public j83() {
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            ja4 r0 = new ja4
            r1 = 9
            r0.<init>(r1)
            ev7 r1 = defpackage.fv7.a
            r1.getClass()
            gv7 r1 = defpackage.ev7.b
            xv7 r2 = new xv7
            java.lang.String r3 = "caption bar"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.c
            xv7 r2 = new xv7
            java.lang.String r3 = "display cutout"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.d
            xv7 r2 = new xv7
            java.lang.String r3 = "ime"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.e
            xv7 r2 = new xv7
            java.lang.String r3 = "mandatory system gestures"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.f
            xv7 r2 = new xv7
            java.lang.String r3 = "navigation bars"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.g
            xv7 r2 = new xv7
            java.lang.String r3 = "status bars"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.h
            xv7 r2 = new xv7
            java.lang.String r3 = "system gestures"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.i
            xv7 r2 = new xv7
            java.lang.String r3 = "tappable element"
            r2.<init>(r3)
            r0.m(r1, r2)
            gv7 r1 = defpackage.ev7.j
            xv7 r2 = new xv7
            java.lang.String r3 = "waterfall"
            r2.<init>(r3)
            r0.m(r1, r2)
            r4.Y = r0
            ss4 r0 = new ss4
            r1 = 0
            r0.<init>(r1)
            r4.Z = r0
            ca4 r0 = new ca4
            r1 = 4
            r0.<init>(r1)
            r4.d0 = r0
            mm6 r0 = new mm6
            r0.<init>()
            r4.e0 = r0
            return
    }

    @Override // defpackage.zk4
    public final defpackage.vu7 U(android.view.View r3, defpackage.vu7 r4) {
            r2 = this;
            boolean r0 = r2.L
            if (r0 == 0) goto L10
            r2.X = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L17
            r3.post(r2)
            return r4
        L10:
            int r3 = r2.R
            if (r3 != 0) goto L17
            r2.o0(r4)
        L17:
            return r4
    }

    @Override // defpackage.f55
    public final void i0(defpackage.au7 r6) {
            r5 = this;
            r0 = 0
            r5.L = r0
            zt7 r6 = r6.a
            int r6 = r6.d()
            int r1 = r5.R
            int r2 = ~r6
            r1 = r1 & r2
            r5.R = r1
            r1 = 0
            r5.X = r1
            p94 r1 = defpackage.hv7.a
            java.lang.Object r6 = r1.b(r6)
            fv7 r6 = (defpackage.fv7) r6
            if (r6 == 0) goto L72
            ja4 r1 = r5.Y
            java.lang.Object r6 = r1.g(r6)
            r6.getClass()
            xv7 r6 = (defpackage.xv7) r6
            rs4 r1 = r6.c
            r2 = 0
            r1.i(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            rs4 r3 = r6.e
            r3.i(r1)
            r3 = 0
            ts4 r1 = r6.d
            r1.i(r3)
            rs4 r1 = r6.c
            r1.i(r2)
            vs4 r1 = r6.b
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            r1 = -1
            r6.j = r1
            r6.k = r1
            ss4 r5 = r5.Z
            int r6 = r5.h()
            r1 = 1
            int r6 = r6 + r1
            r5.i(r6)
            java.lang.Object r5 = defpackage.bm6.c
            monitor-enter(r5)
            os2 r6 = defpackage.bm6.j     // Catch: java.lang.Throwable -> L6f
            ka4 r6 = r6.h     // Catch: java.lang.Throwable -> L6f
            if (r6 == 0) goto L68
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L68
            r0 = r1
        L68:
            monitor-exit(r5)
            if (r0 == 0) goto L72
            defpackage.bm6.a()
            return
        L6f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L72:
            return
    }

    @Override // defpackage.f55
    public final void j0(defpackage.au7 r1) {
            r0 = this;
            r1 = 1
            r0.L = r1
            return
    }

    @Override // defpackage.f55
    public final defpackage.vu7 k0(defpackage.vu7 r7, java.util.List r8) {
            r6 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L56
            java.lang.Object r2 = r8.get(r1)
            au7 r2 = (defpackage.au7) r2
            zt7 r3 = r2.a
            int r3 = r3.d()
            p94 r4 = defpackage.hv7.a
            java.lang.Object r3 = r4.b(r3)
            fv7 r3 = (defpackage.fv7) r3
            if (r3 == 0) goto L53
            ja4 r4 = r6.Y
            java.lang.Object r3 = r4.g(r3)
            r3.getClass()
            xv7 r3 = (defpackage.xv7) r3
            vs4 r4 = r3.b
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L53
            zt7 r2 = r2.a
            float r4 = r2.c()
            rs4 r5 = r3.c
            r5.i(r4)
            float r4 = r2.a()
            rs4 r5 = r3.e
            r5.i(r4)
            long r4 = r2.b()
            ts4 r2 = r3.d
            r2.i(r4)
        L53:
            int r1 = r1 + 1
            goto L5
        L56:
            r6.o0(r7)
            return r7
    }

    @Override // defpackage.f55
    public final defpackage.rr6 l0(defpackage.au7 r9, defpackage.rr6 r10) {
            r8 = this;
            vu7 r0 = r8.X
            r1 = 0
            r8.L = r1
            r2 = 0
            r8.X = r2
            zt7 r2 = r9.a
            long r2 = r2.b()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto La9
            if (r0 == 0) goto La9
            zt7 r2 = r9.a
            int r2 = r2.d()
            int r3 = r8.R
            r3 = r3 | r2
            r8.R = r3
            p94 r3 = defpackage.hv7.a
            java.lang.Object r3 = r3.b(r2)
            fv7 r3 = (defpackage.fv7) r3
            if (r3 == 0) goto La9
            ja4 r4 = r8.Y
            java.lang.Object r3 = r4.g(r3)
            r3.getClass()
            xv7 r3 = (defpackage.xv7) r3
            ru7 r0 = r0.a
            e83 r0 = r0.h(r2)
            int r2 = r0.a
            long r4 = (long) r2
            r2 = 48
            long r4 = r4 << r2
            int r2 = r0.b
            long r6 = (long) r2
            r2 = 32
            long r6 = r6 << r2
            long r4 = r4 | r6
            int r2 = r0.c
            long r6 = (long) r2
            r2 = 16
            long r6 = r6 << r2
            long r4 = r4 | r6
            int r0 = r0.d
            long r6 = (long) r0
            long r4 = r4 | r6
            long r6 = r3.h
            boolean r0 = defpackage.bl2.u(r4, r6)
            if (r0 != 0) goto La9
            r3.j = r6
            r3.k = r4
            vs4 r0 = r3.b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            zt7 r9 = r9.a
            float r0 = r9.c()
            rs4 r2 = r3.c
            r2.i(r0)
            float r0 = r9.a()
            rs4 r2 = r3.e
            r2.i(r0)
            long r4 = r9.b()
            ts4 r9 = r3.d
            r9.i(r4)
            ss4 r8 = r8.Z
            int r9 = r8.h()
            r0 = 1
            int r9 = r9 + r0
            r8.i(r9)
            java.lang.Object r8 = defpackage.bm6.c
            monitor-enter(r8)
            os2 r9 = defpackage.bm6.j     // Catch: java.lang.Throwable -> La6
            ka4 r9 = r9.h     // Catch: java.lang.Throwable -> La6
            if (r9 == 0) goto L9f
            boolean r9 = r9.h()     // Catch: java.lang.Throwable -> La6
            if (r9 != r0) goto L9f
            r1 = r0
        L9f:
            monitor-exit(r8)
            if (r1 == 0) goto La9
            defpackage.bm6.a()
            return r10
        La6:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        La9:
            return r10
    }

    public final void o0(defpackage.vu7 r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            p94 r2 = defpackage.hv7.a
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L114
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 16
            r17 = 32
        L18:
            r6 = r2[r13]
            r18 = 1
            long r11 = ~r6
            r19 = 7
            long r11 = r11 << r19
            long r11 = r11 & r6
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r19
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 == 0) goto L102
            int r11 = r13 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r8 = 0
            r19 = 48
        L39:
            if (r8 >= r11) goto Lf9
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r6 & r20
            r22 = 128(0x80, double:6.3E-322)
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 >= 0) goto Le5
            int r20 = r13 << 3
            int r20 = r20 + r8
            r12 = r3[r20]
            r20 = r4[r20]
            r9 = r20
            fv7 r9 = (defpackage.fv7) r9
            ru7 r10 = r1.a
            e83 r10 = r10.h(r12)
            r20 = r2
            int r2 = r10.a
            r24 = r3
            long r2 = (long) r2
            long r2 = r2 << r19
            r25 = r2
            int r2 = r10.b
            long r2 = (long) r2
            long r2 = r2 << r17
            long r2 = r25 | r2
            r25 = r2
            int r2 = r10.c
            long r2 = (long) r2
            long r2 = r2 << r16
            long r2 = r25 | r2
            int r10 = r10.d
            r25 = r2
            long r2 = (long) r10
            long r2 = r25 | r2
            ja4 r10 = r0.Y
            java.lang.Object r9 = r10.g(r9)
            r9.getClass()
            xv7 r9 = (defpackage.xv7) r9
            r25 = r6
            long r6 = r9.h
            boolean r6 = defpackage.bl2.u(r2, r6)
            if (r6 != 0) goto L9b
            r9.h = r2
            r6 = 0
            boolean r2 = defpackage.bl2.u(r2, r6)
            r14 = r18
            if (r2 != 0) goto L9b
            r15 = r14
        L9b:
            r2 = 8
            if (r12 == r2) goto Ld2
            ru7 r2 = r1.a
            e83 r2 = r2.i(r12)
            int r3 = r2.a
            long r6 = (long) r3
            long r6 = r6 << r19
            int r3 = r2.b
            r10 = r4
            long r3 = (long) r3
            long r3 = r3 << r17
            long r3 = r3 | r6
            int r6 = r2.c
            long r6 = (long) r6
            long r6 = r6 << r16
            long r3 = r3 | r6
            int r2 = r2.d
            long r6 = (long) r2
            long r2 = r3 | r6
            long r6 = r9.i
            boolean r4 = defpackage.bl2.u(r6, r2)
            if (r4 != 0) goto Ld3
            r9.i = r2
            r6 = 0
            boolean r2 = defpackage.bl2.u(r2, r6)
            r14 = r18
            if (r2 != 0) goto Ld3
            r15 = r14
            goto Ld3
        Ld2:
            r10 = r4
        Ld3:
            ru7 r2 = r1.a
            boolean r2 = r2.t(r12)
            vs4 r3 = r9.a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.setValue(r2)
            r2 = 8
            goto Led
        Le5:
            r20 = r2
            r24 = r3
            r10 = r4
            r25 = r6
            r2 = r12
        Led:
            long r6 = r25 >> r2
            int r8 = r8 + 1
            r12 = r2
            r4 = r10
            r2 = r20
            r3 = r24
            goto L39
        Lf9:
            r20 = r2
            r24 = r3
            r10 = r4
            r2 = r12
            if (r11 != r2) goto L11e
            goto L109
        L102:
            r20 = r2
            r24 = r3
            r10 = r4
            r19 = 48
        L109:
            if (r13 == r5) goto L11e
            int r13 = r13 + 1
            r4 = r10
            r2 = r20
            r3 = r24
            goto L18
        L114:
            r16 = 16
            r17 = 32
            r18 = 1
            r19 = 48
            r14 = 0
            r15 = 0
        L11e:
            ru7 r1 = r1.a
            yk1 r1 = r1.g()
            if (r1 != 0) goto L129
            r6 = 0
            goto L143
        L129:
            e83 r2 = r1.a()
            int r3 = r2.a
            long r3 = (long) r3
            long r3 = r3 << r19
            int r5 = r2.b
            long r5 = (long) r5
            long r5 = r5 << r17
            long r3 = r3 | r5
            int r5 = r2.c
            long r5 = (long) r5
            long r5 = r5 << r16
            long r3 = r3 | r5
            int r2 = r2.d
            long r5 = (long) r2
            long r6 = r3 | r5
        L143:
            ja4 r2 = r0.Y
            ev7 r3 = defpackage.fv7.a
            r3.getClass()
            gv7 r3 = defpackage.ev7.j
            java.lang.Object r2 = r2.g(r3)
            r2.getClass()
            xv7 r2 = (defpackage.xv7) r2
            r3 = 0
            boolean r5 = defpackage.bl2.u(r6, r3)
            r5 = r5 ^ 1
            vs4 r8 = r2.a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8.setValue(r5)
            long r8 = r2.h
            boolean r5 = defpackage.bl2.u(r8, r6)
            if (r5 != 0) goto L17b
            r2.h = r6
            r2.i = r6
            boolean r2 = defpackage.bl2.u(r6, r3)
            r14 = r18
            if (r2 != 0) goto L17b
            r15 = r14
        L17b:
            if (r1 != 0) goto L18f
            ca4 r1 = r0.d0
            int r2 = r1.b
            if (r2 <= 0) goto L230
            r1.d()
            mm6 r1 = r0.e0
            r1.clear()
            r14 = r18
            goto L230
        L18f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L19c
            android.view.DisplayCutout r1 = r1.a
            java.util.List r1 = defpackage.pp.d(r1)
            goto L19e
        L19c:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L19e:
            int r2 = r1.size()
            ca4 r3 = r0.d0
            int r4 = r3.b
            if (r2 >= r4) goto L1c5
            int r2 = r1.size()
            ca4 r4 = r0.d0
            int r4 = r4.b
            r3.l(r2, r4)
            mm6 r2 = r0.e0
            int r3 = r1.size()
            mm6 r4 = r0.e0
            int r4 = r4.size()
            r2.c(r3, r4)
            r14 = r18
            goto L201
        L1c5:
            int r2 = r1.size()
            ca4 r3 = r0.d0
            int r3 = r3.b
            int r2 = r2 - r3
            r3 = 0
        L1cf:
            if (r3 >= r2) goto L201
            ca4 r4 = r0.d0
            int r5 = r4.b
            java.lang.Object r5 = r1.get(r5)
            vs4 r5 = defpackage.np2.Y(r5)
            r4.a(r5)
            mm6 r4 = r0.e0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "display cutout rect "
            r5.<init>(r6)
            ca4 r6 = r0.d0
            int r6 = r6.b
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            z53 r6 = new z53
            r6.<init>(r5)
            r4.add(r6)
            int r3 = r3 + 1
            r14 = r18
            goto L1cf
        L201:
            int r2 = r1.size()
            r3 = 0
        L206:
            if (r3 >= r2) goto L228
            java.lang.Object r4 = r1.get(r3)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            ca4 r5 = r0.d0
            java.lang.Object r5 = r5.f(r3)
            qa4 r5 = (defpackage.qa4) r5
            java.lang.Object r6 = r5.getValue()
            boolean r6 = defpackage.nb3.k(r6, r4)
            if (r6 != 0) goto L225
            r5.setValue(r4)
            r14 = r18
        L225:
            int r3 = r3 + 1
            goto L206
        L228:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L230
            r15 = r18
        L230:
            if (r15 != 0) goto L23a
            ss4 r1 = r0.Z
            int r1 = r1.h()
            if (r1 == 0) goto L265
        L23a:
            if (r14 == 0) goto L265
            ss4 r0 = r0.Z
            int r1 = r0.h()
            int r1 = r1 + 1
            r0.i(r1)
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            os2 r0 = defpackage.bm6.j     // Catch: java.lang.Throwable -> L262
            ka4 r0 = r0.h     // Catch: java.lang.Throwable -> L262
            if (r0 == 0) goto L25a
            boolean r0 = r0.h()     // Catch: java.lang.Throwable -> L262
            r2 = r18
            if (r0 != r2) goto L25a
            r11 = r2
            goto L25b
        L25a:
            r11 = 0
        L25b:
            monitor-exit(r1)
            if (r11 == 0) goto L265
            defpackage.bm6.a()
            return
        L262:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L265:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lb
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r3 = r0
        L10:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            defpackage.sn7.c(r3, r2)
            defpackage.ao7.p(r3, r2)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r2 = r3.getParent()
            boolean r0 = r2 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r2 = (android.view.View) r2
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 != 0) goto L10
            goto L11
        L10:
            r3 = r2
        L11:
            java.util.WeakHashMap r2 = defpackage.ao7.a
            defpackage.sn7.c(r3, r1)
            defpackage.ao7.p(r3, r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto L13
            r0 = 0
            r1.R = r0
            r1.L = r0
            vu7 r0 = r1.X
            if (r0 == 0) goto L13
            r1.o0(r0)
            r0 = 0
            r1.X = r0
        L13:
            return
    }
}
