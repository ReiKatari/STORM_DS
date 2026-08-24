package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp5  reason: default package */
/* loaded from: classes.dex */
public final class mp5 {
    public static final defpackage.w31 i = null;
    public final defpackage.ci0 a;
    public final defpackage.id0 b;
    public final defpackage.eb c;
    public final defpackage.yx6 d;
    public final defpackage.gg e;
    public final defpackage.bx f;
    public final defpackage.og0 g;
    public final defpackage.t57 h;

    static {
            w31 r0 = new w31
            r1 = 23
            r0.<init>(r1)
            defpackage.mp5.i = r0
            return
    }

    public mp5(defpackage.ci0 r1, defpackage.id0 r2, defpackage.eb r3, defpackage.yx6 r4, defpackage.gg r5, defpackage.bx r6, defpackage.og0 r7, defpackage.t57 r8) {
            r0 = this;
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r8.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            return
    }

    public final defpackage.uz a(java.lang.String r8, defpackage.gd0 r9) {
            r7 = this;
            r8.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "#openAndAwaitCameraWithRetry("
            r0.append(r1)
            java.lang.String r1 = defpackage.xf0.b(r8)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            t57 r0 = r7.h
            n61 r0 = r0.d
            kp5 r1 = new kp5
            r5 = 0
            r6 = 0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.hv.V(r0, r1)
            uz r7 = (defpackage.uz) r7
            return r7
    }

    public final java.lang.Object b(java.lang.String r36, defpackage.gd0 r37, defpackage.qn2 r38, defpackage.s41 r39) {
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r39
            boolean r3 = r2 instanceof defpackage.lp5
            if (r3 == 0) goto L19
            r3 = r2
            lp5 r3 = (defpackage.lp5) r3
            int r4 = r3.i0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.i0 = r4
            goto L1e
        L19:
            lp5 r3 = new lp5
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.g0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.i0
            r6 = 2
            java.lang.String r7 = "CXCP"
            yx6 r8 = r0.d
            r9 = 3
            r10 = 1
            if (r5 == 0) goto L97
            if (r5 == r10) goto L82
            if (r5 == r6) goto L60
            if (r5 != r9) goto L58
            long r12 = r3.f0
            cc0 r1 = r3.e0
            java.lang.AutoCloseable r5 = r3.d0
            bh5 r14 = r3.Z
            qn2 r15 = r3.Y
            gd0 r9 = r3.X
            r16 = 0
            java.lang.String r11 = r3.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L54
            r6 = r1
            r1 = r4
            r18 = r8
            r25 = r10
            r4 = 3
        L4d:
            r33 = r12
            r13 = r11
            r11 = r33
            goto L250
        L54:
            r0 = move-exception
            r1 = r0
            goto L287
        L58:
            r16 = 0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r16
        L60:
            r16 = 0
            long r11 = r3.f0
            cc0 r1 = r3.e0
            java.lang.AutoCloseable r5 = r3.d0
            bh5 r9 = r3.Z
            qn2 r13 = r3.Y
            gd0 r14 = r3.X
            java.lang.String r15 = r3.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L54
            r33 = r14
            r14 = r1
            r1 = r6
            r6 = r9
            r9 = r33
            r33 = r15
            r15 = r13
            r12 = r11
            r11 = r33
            goto L10d
        L82:
            r16 = 0
            long r11 = r3.f0
            bh5 r1 = r3.Z
            qn2 r5 = r3.Y
            gd0 r9 = r3.X
            java.lang.String r13 = r3.R
            defpackage.oi2.Y(r2)
            r33 = r9
            r9 = r5
            r5 = r33
            goto Lca
        L97:
            r16 = 0
            defpackage.oi2.Y(r2)
            r8.getClass()
            long r11 = android.os.SystemClock.elapsedRealtimeNanos()
            bh5 r2 = new bh5
            r2.<init>()
            r3.R = r1
            r5 = r37
            r3.X = r5
            r9 = r38
            r3.Y = r9
            r3.Z = r2
            r3.f0 = r11
            r3.i0 = r10
            cc0 r13 = new cc0
            eb r14 = r0.c
            r13.<init>(r14, r1)
            if (r13 != r4) goto Lc4
        Lc1:
            r1 = r4
            goto L248
        Lc4:
            r33 = r13
            r13 = r1
            r1 = r2
            r2 = r33
        Lca:
            java.lang.AutoCloseable r2 = (java.lang.AutoCloseable) r2
            r14 = r2
            cc0 r14 = (defpackage.cc0) r14     // Catch: java.lang.Throwable -> L284
        Lcf:
            int r15 = r1.A     // Catch: java.lang.Throwable -> L284
            int r15 = r15 + r10
            r1.A = r15     // Catch: java.lang.Throwable -> L284
            ci0 r10 = r0.a     // Catch: java.lang.Throwable -> L284
            bx r6 = r0.f     // Catch: java.lang.Throwable -> L284
            r3.R = r13     // Catch: java.lang.Throwable -> L284
            r3.X = r5     // Catch: java.lang.Throwable -> L284
            r3.Y = r9     // Catch: java.lang.Throwable -> L284
            r3.Z = r1     // Catch: java.lang.Throwable -> L284
            r3.d0 = r2     // Catch: java.lang.Throwable -> L284
            r3.e0 = r14     // Catch: java.lang.Throwable -> L284
            r3.f0 = r11     // Catch: java.lang.Throwable -> L284
            r36 = r1
            r1 = 2
            r3.i0 = r1     // Catch: java.lang.Throwable -> L284
            r24 = r3
            r22 = r5
            r23 = r6
            r17 = r10
            r20 = r11
            r18 = r13
            r19 = r15
            java.lang.Object r3 = r17.l(r18, r19, r20, r22, r23, r24)     // Catch: java.lang.Throwable -> L284
            if (r3 != r4) goto L100
            goto Lc1
        L100:
            r6 = r36
            r5 = r2
            r2 = r3
            r15 = r9
            r11 = r18
            r12 = r20
            r9 = r22
            r3 = r24
        L10d:
            lm4 r2 = (defpackage.lm4) r2     // Catch: java.lang.Throwable -> L54
            r8.getClass()     // Catch: java.lang.Throwable -> L54
            long r17 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L54
            long r28 = r17 - r12
            vd r10 = r2.a     // Catch: java.lang.Throwable -> L54
            df0 r1 = r2.b
            if (r10 == 0) goto L124
            r10 = r16
            defpackage.lb4.p(r5, r10)
            return r2
        L124:
            r10 = r16
            if (r1 != 0) goto L131
            java.lang.String r0 = "Camera open failed without an error. The CameraGraph may have been stopped or closed. Abandoning the camera open attempt."
            android.util.Log.w(r7, r0)     // Catch: java.lang.Throwable -> L54
            defpackage.lb4.p(r5, r10)
            return r2
        L131:
            int r10 = r1.a     // Catch: java.lang.Throwable -> L54
            r36 = r2
            jg7 r2 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r15.g(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L54
            boolean r31 = r2.booleanValue()     // Catch: java.lang.Throwable -> L54
            int r1 = r1.a     // Catch: java.lang.Throwable -> L54
            int r2 = r6.A     // Catch: java.lang.Throwable -> L54
            r26 = r1
            gg r1 = r0.e     // Catch: java.lang.Throwable -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L54
            java.lang.String r18 = "DevicePolicyManager#getCameraDisabled"
            android.os.Trace.beginSection(r18)     // Catch: java.lang.Throwable -> L27f
            android.app.admin.DevicePolicyManager r1 = r1.a     // Catch: java.lang.Throwable -> L27f
            r27 = r2
            r2 = 0
            boolean r30 = r1.getCameraDisabled(r2)     // Catch: java.lang.Throwable -> L27f
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L54
            og0 r1 = r0.g     // Catch: java.lang.Throwable -> L54
            sq1 r1 = r1.c     // Catch: java.lang.Throwable -> L54
            r32 = r1
            boolean r1 = defpackage.w31.t(r26, r27, r28, r30, r31, r32)     // Catch: java.lang.Throwable -> L54
            r37 = r12
            r12 = r28
            r2 = r31
            if (r1 == 0) goto L179
            r18 = r8
            int r8 = r6.A     // Catch: java.lang.Throwable -> L54
            r19 = r4
            r4 = 1
            if (r8 <= r4) goto L182
            goto L17d
        L179:
            r19 = r4
            r18 = r8
        L17d:
            id0 r4 = r0.b     // Catch: java.lang.Throwable -> L54
            r4.a(r11, r10, r1)     // Catch: java.lang.Throwable -> L54
        L182:
            if (r1 != 0) goto L1fb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "Failed to open camera "
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = defpackage.xf0.b(r11)     // Catch: java.lang.Throwable -> L54
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = " after "
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            int r1 = r6.A     // Catch: java.lang.Throwable -> L54
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = " attempts and "
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L54
            long r1 = r1 - r37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r3.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "%."
            r3.append(r4)     // Catch: java.lang.Throwable -> L54
            r4 = 3
            r3.append(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "f ms"
            r3.append(r4)     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L54
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L54
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r1 = r1 / r8
            java.lang.Double r4 = new java.lang.Double     // Catch: java.lang.Throwable -> L54
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L54
            r4 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch: java.lang.Throwable -> L54
            r2 = 0
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)     // Catch: java.lang.Throwable -> L54
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = ". Last error was "
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = defpackage.df0.a(r10)     // Catch: java.lang.Throwable -> L54
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            r1 = 46
            r0.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L54
            android.util.Log.e(r7, r0)     // Catch: java.lang.Throwable -> L54
            r1 = 0
            defpackage.lb4.p(r5, r1)
            return r36
        L1fb:
            r1 = 0
            boolean r2 = defpackage.w31.s(r10, r2)     // Catch: java.lang.Throwable -> L54
            r20 = 500(0x1f4, double:2.47E-321)
            if (r2 != 0) goto L209
        L204:
            r1 = r20
            r25 = 1
            goto L22d
        L209:
            sq1[] r2 = defpackage.n16.o     // Catch: java.lang.Throwable -> L54
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L54
            r36 = r2
            long r1 = r4.a     // Catch: java.lang.Throwable -> L54
            int r1 = defpackage.sq1.a(r12, r1)     // Catch: java.lang.Throwable -> L54
            if (r1 >= 0) goto L219
            goto L204
        L219:
            r25 = 1
            r1 = r36[r25]     // Catch: java.lang.Throwable -> L54
            long r1 = r1.a     // Catch: java.lang.Throwable -> L54
            int r1 = defpackage.sq1.a(r12, r1)     // Catch: java.lang.Throwable -> L54
            if (r1 >= 0) goto L22a
            r20 = 2000(0x7d0, double:9.88E-321)
        L227:
            r1 = r20
            goto L22d
        L22a:
            r20 = 4000(0xfa0, double:1.9763E-320)
            goto L227
        L22d:
            r3.R = r11     // Catch: java.lang.Throwable -> L54
            r3.X = r9     // Catch: java.lang.Throwable -> L54
            r3.Y = r15     // Catch: java.lang.Throwable -> L54
            r3.Z = r6     // Catch: java.lang.Throwable -> L54
            r3.d0 = r5     // Catch: java.lang.Throwable -> L54
            r3.e0 = r14     // Catch: java.lang.Throwable -> L54
            r12 = r37
            r3.f0 = r12     // Catch: java.lang.Throwable -> L54
            r4 = 3
            r3.i0 = r4     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r14.e(r1, r3)     // Catch: java.lang.Throwable -> L54
            r1 = r19
            if (r2 != r1) goto L249
        L248:
            return r1
        L249:
            r33 = r14
            r14 = r6
            r6 = r33
            goto L4d
        L250:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L54
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L270
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "Timeout expired, retrying camera open for camera "
            r2.append(r8)     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = defpackage.xf0.b(r13)     // Catch: java.lang.Throwable -> L54
            r2.append(r8)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L54
            android.util.Log.d(r7, r2)     // Catch: java.lang.Throwable -> L54
        L270:
            r4 = r1
            r2 = r5
            r5 = r9
            r1 = r14
            r9 = r15
            r8 = r18
            r10 = r25
            r16 = 0
            r14 = r6
            r6 = 2
            goto Lcf
        L27f:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L54
        L284:
            r0 = move-exception
            r1 = r0
            r5 = r2
        L287:
            throw r1     // Catch: java.lang.Throwable -> L288
        L288:
            r0 = move-exception
            defpackage.lb4.p(r5, r1)
            throw r0
    }
}
