package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n70  reason: default package */
/* loaded from: classes.dex */
public final class n70 implements defpackage.v93 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public n70(defpackage.la0 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public n70(defpackage.vs0 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r2.getClass()
            r1.<init>()
            r1.b = r2
            return
    }

    public n70(defpackage.xk4 r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r2.getClass()
            r1.<init>()
            r1.b = r2
            return
    }

    public static int d(defpackage.wl5 r1, int r2) {
            yw2 r1 = r1.Y
            java.lang.String r0 = "Retry-After"
            java.lang.String r1 = r1.a(r0)
            if (r1 != 0) goto Lb
            r1 = 0
        Lb:
            if (r1 != 0) goto Le
            return r2
        Le:
            java.lang.String r2 = "\\d+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r2.getClass()
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r1.getClass()
            int r1 = r1.intValue()
            return r1
        L2d:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    @Override // defpackage.v93
    public final defpackage.wl5 a(defpackage.dp3 r44) {
            r43 = this;
            r1 = r43
            r2 = r44
            int r0 = r1.a
            switch(r0) {
                case 0: goto L7ce;
                case 1: goto L19c;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = r2.i
            pa r0 = (defpackage.pa) r0
            java.lang.Object r3 = r2.g
            je5 r3 = (defpackage.je5) r3
            yt1 r4 = defpackage.yt1.A
            r9 = r4
            r22 = 0
            r23 = 0
            r4 = r0
            r0 = 1
        L1a:
            r4.getClass()
            bk1 r10 = r3.g0
            if (r10 != 0) goto L194
            monitor-enter(r3)
            boolean r10 = r3.i0     // Catch: java.lang.Throwable -> L17c
            if (r10 != 0) goto L189
            boolean r10 = r3.h0     // Catch: java.lang.Throwable -> L17c
            if (r10 != 0) goto L17a
            boolean r10 = r3.k0     // Catch: java.lang.Throwable -> L17c
            if (r10 != 0) goto L17a
            boolean r10 = r3.j0     // Catch: java.lang.Throwable -> L17c
            if (r10 != 0) goto L17a
            monitor-exit(r3)
            if (r0 == 0) goto Ld3
            r10 = r9
            ue5 r9 = new ue5
            xk4 r0 = r3.A
            r11 = r10
            qz6 r10 = r0.C
            r12 = r11
            ls1 r11 = r3.R
            r13 = r12
            int r12 = r0.x
            r14 = r13
            int r13 = r0.y
            r15 = r14
            int r14 = r2.c
            r16 = r15
            int r15 = r2.d
            boolean r8 = r0.e
            boolean r7 = r0.f
            java.lang.Object r5 = r4.B
            i03 r5 = (defpackage.i03) r5
            r5.getClass()
            boolean r17 = r5.f()
            if (r17 == 0) goto L79
            javax.net.ssl.SSLSocketFactory r6 = r0.p
            if (r6 == 0) goto L71
            r21 = r4
            sk4 r4 = r0.t
            r17 = r4
            il0 r4 = r0.u
            r32 = r4
            r30 = r6
            r31 = r17
            goto L81
        L71:
            java.lang.String r0 = "CLEARTEXT-only client"
            defpackage.i.m(r0)
        L76:
            r8 = 0
            goto L19b
        L79:
            r21 = r4
            r30 = 0
            r31 = 0
            r32 = 0
        L81:
            ea r18 = new ea
            java.lang.String r4 = r5.d
            int r5 = r5.e
            d90 r6 = r0.l
            r26 = r4
            javax.net.SocketFactory r4 = r0.o
            r29 = r4
            xd5 r4 = r0.n
            r33 = r4
            java.util.List r4 = r0.s
            r34 = r4
            java.util.List r4 = r0.r
            java.net.ProxySelector r0 = r0.m
            r36 = r0
            r35 = r4
            r27 = r5
            r28 = r6
            r25 = r18
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            xk4 r0 = r3.A
            il5 r0 = r0.B
            r19 = r0
            r20 = r3
            r17 = r7
            r4 = r16
            r16 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5 = r20
            r3 = r21
            xk4 r0 = r5.A
            boolean r6 = r0.f
            if (r6 == 0) goto Lcb
            fb r6 = new fb
            qz6 r0 = r0.C
            r6.<init>(r9, r0)
            goto Ld0
        Lcb:
            s35 r6 = new s35
            r6.<init>(r9)
        Ld0:
            r5.d0 = r6
            goto Ld6
        Ld3:
            r5 = r3
            r3 = r4
            r4 = r9
        Ld6:
            boolean r0 = r5.m0     // Catch: java.lang.Throwable -> Leb
            if (r0 != 0) goto L16e
            wl5 r0 = r2.f(r3)     // Catch: java.lang.Throwable -> Leb java.io.IOException -> L143
            ul5 r0 = r0.h()     // Catch: java.lang.Throwable -> Leb
            r0.a = r3     // Catch: java.lang.Throwable -> Leb
            if (r22 == 0) goto Lef
            wl5 r3 = defpackage.np2.g0(r22)     // Catch: java.lang.Throwable -> Leb
            goto Lf0
        Leb:
            r0 = move-exception
            r7 = 1
            goto L176
        Lef:
            r3 = 0
        Lf0:
            r0.k = r3     // Catch: java.lang.Throwable -> Leb
            wl5 r0 = r0.a()     // Catch: java.lang.Throwable -> Leb
            bk1 r3 = r5.g0     // Catch: java.lang.Throwable -> Leb
            pa r3 = r1.b(r0, r3)     // Catch: java.lang.Throwable -> Leb
            if (r3 != 0) goto L105
            r6 = 0
        Lff:
            r5.f(r6)
            r8 = r0
            goto L19b
        L105:
            r6 = 0
            java.lang.Object r7 = r3.X     // Catch: java.lang.Throwable -> Leb
            mk5 r7 = (defpackage.mk5) r7     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto L113
            boolean r7 = r7.c()     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto L113
            goto Lff
        L113:
            yl5 r6 = r0.Z     // Catch: java.lang.Throwable -> Leb
            defpackage.yy7.b(r6)     // Catch: java.lang.Throwable -> Leb
            int r6 = r23 + 1
            r7 = 20
            if (r6 > r7) goto L12c
            r7 = 1
            r5.f(r7)
            r22 = r0
            r9 = r4
            r23 = r6
            r0 = 1
            r4 = r3
            r3 = r5
            goto L1a
        L12c:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r1.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = "Too many follow-up requests: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Leb
            r1.append(r6)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Leb
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Leb
            throw r0     // Catch: java.lang.Throwable -> Leb
        L143:
            r0 = move-exception
            boolean r6 = r1.c(r0, r5, r3)     // Catch: java.lang.Throwable -> Leb
            if (r6 != 0) goto L161
            byte[] r1 = defpackage.yy7.a     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> Leb
        L150:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r2 == 0) goto L160
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Leb
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch: java.lang.Throwable -> Leb
            defpackage.mb3.q(r0, r2)     // Catch: java.lang.Throwable -> Leb
            goto L150
        L160:
            throw r0     // Catch: java.lang.Throwable -> Leb
        L161:
            java.util.ArrayList r9 = defpackage.gt0.U0(r0, r4)     // Catch: java.lang.Throwable -> Leb
            r7 = 1
            r5.f(r7)
            r4 = r3
            r3 = r5
            r0 = 0
            goto L1a
        L16e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Leb
            throw r0     // Catch: java.lang.Throwable -> Leb
        L176:
            r5.f(r7)
            throw r0
        L17a:
            r5 = r3
            goto L17f
        L17c:
            r0 = move-exception
            r5 = r3
            goto L192
        L17f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L187
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L187
            throw r0     // Catch: java.lang.Throwable -> L187
        L187:
            r0 = move-exception
            goto L192
        L189:
            r5 = r3
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L187
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L187
            throw r1     // Catch: java.lang.Throwable -> L187
        L192:
            monitor-exit(r5)
            throw r0
        L194:
            java.lang.String r0 = "Check failed."
            defpackage.i.m(r0)
            goto L76
        L19b:
            return r8
        L19c:
            java.lang.Object r0 = r1.b
            la0 r0 = (defpackage.la0) r0
            if (r0 == 0) goto L2bb
            java.lang.Object r5 = r2.i
            pa r5 = (defpackage.pa) r5
            r5.getClass()
            java.lang.Object r6 = r5.B
            i03 r6 = (defpackage.i03) r6
            java.lang.String r7 = defpackage.g04.K(r6)
            kk1 r0 = r0.A     // Catch: java.io.IOException -> L1b9
            fk1 r0 = r0.n(r7)     // Catch: java.io.IOException -> L1b9
            if (r0 != 0) goto L1bc
        L1b9:
            r0 = 0
            goto L2b9
        L1bc:
            ia0 r7 = new ia0     // Catch: java.io.IOException -> L2b4
            java.util.ArrayList r8 = r0.L     // Catch: java.io.IOException -> L2b4
            r9 = 0
            java.lang.Object r8 = r8.get(r9)     // Catch: java.io.IOException -> L2b4
            in6 r8 = (defpackage.in6) r8     // Catch: java.io.IOException -> L2b4
            r7.<init>(r8)     // Catch: java.io.IOException -> L2b4
            java.lang.String r8 = r7.c     // Catch: java.io.IOException -> L2b4
            yw2 r9 = r7.b     // Catch: java.io.IOException -> L2b4
            i03 r10 = r7.a     // Catch: java.io.IOException -> L2b4
            yw2 r11 = r7.g
            java.lang.String r12 = "Content-Type"
            java.lang.String r12 = r11.a(r12)
            java.lang.String r13 = "Content-Length"
            java.lang.String r13 = r11.a(r13)
            pa r14 = new pa
            java.lang.String r15 = "\u0000"
            r10.getClass()
            r9.getClass()
            r8.getClass()
            s9 r3 = new s9
            r4 = 13
            r3.<init>(r4)
            r3.a = r10
            ww2 r4 = r9.c()
            r3.c = r4
            boolean r4 = r8.equals(r15)
            if (r4 != 0) goto L203
            r4 = r8
        L201:
            r15 = 0
            goto L206
        L203:
            java.lang.String r4 = "GET"
            goto L201
        L206:
            r3.D(r4, r15)
            r14.<init>(r3)
            xl5 r3 = defpackage.yl5.A
            jd1 r42 = defpackage.a97.F
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 20
            r3.<init>(r4)
            k55 r3 = r7.d
            r3.getClass()
            int r4 = r7.e
            java.lang.String r15 = r7.f
            r15.getClass()
            ww2 r11 = r11.c()
            r27 = r3
            ha0 r3 = new ha0
            r3.<init>(r0, r12, r13)
            pv2 r0 = r7.h
            long r12 = r7.i
            r32 = r3
            r29 = r4
            long r3 = r7.j
            if (r29 < 0) goto L2a6
            yw2 r31 = r11.f()
            wl5 r25 = new wl5
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r41 = 0
            r30 = r0
            r39 = r3
            r37 = r12
            r26 = r14
            r28 = r15
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r42)
            r0 = r25
            boolean r3 = r10.equals(r6)
            if (r3 == 0) goto L29f
            java.lang.Object r3 = r5.L
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L29f
            java.util.Set r3 = defpackage.g04.X(r31)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L27d
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L27d
            goto L2b9
        L27d:
            java.util.Iterator r3 = r3.iterator()
        L281:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b9
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r6 = r9.f(r4)
            java.lang.Object r7 = r5.R
            yw2 r7 = (defpackage.yw2) r7
            java.util.List r4 = r7.f(r4)
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L281
        L29f:
            yl5 r0 = r0.Z
            defpackage.yy7.b(r0)
            goto L1b9
        L2a6:
            r0 = r29
            java.lang.String r1 = "code < 0: "
            java.lang.String r0 = defpackage.lb1.g(r0, r1)
            defpackage.u34.f(r0)
            r8 = 0
            goto L7c4
        L2b4:
            defpackage.yy7.b(r0)
            goto L1b9
        L2b9:
            r15 = r0
            goto L2bc
        L2bb:
            r15 = 0
        L2bc:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r2.i
            pa r0 = (defpackage.pa) r0
            r0.getClass()
            if (r15 == 0) goto L33c
            long r8 = r15.h0
            long r10 = r15.i0
            yw2 r12 = r15.Y
            int r13 = r12.size()
            r6 = 0
            r7 = -1
            r14 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L2e0:
            if (r6 >= r13) goto L339
            java.lang.String r5 = r12.b(r6)
            r27 = r3
            java.lang.String r3 = r12.d(r6)
            java.lang.String r4 = "Date"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L2fd
            java.util.Date r4 = defpackage.cc1.a(r3)
            r22 = r3
            r19 = r4
            goto L334
        L2fd:
            java.lang.String r4 = "Expires"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L30b
            java.util.Date r3 = defpackage.cc1.a(r3)
            r14 = r3
            goto L334
        L30b:
            java.lang.String r4 = "Last-Modified"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L31c
            java.util.Date r4 = defpackage.cc1.a(r3)
            r21 = r3
            r18 = r4
            goto L334
        L31c:
            java.lang.String r4 = "ETag"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L327
            r20 = r3
            goto L334
        L327:
            java.lang.String r4 = "Age"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L334
            r4 = -1
            int r7 = defpackage.yy7.p(r4, r3)
        L334:
            int r6 = r6 + 1
            r3 = r27
            goto L2e0
        L339:
            r27 = r3
            goto L34d
        L33c:
            r7 = -1
            r8 = 0
            r10 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            goto L339
        L34d:
            java.lang.String r3 = "If-None-Match"
            java.lang.String r4 = "If-Modified-Since"
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 12
            if (r15 != 0) goto L360
            u63 r3 = new u63
            r12 = 0
            r3.<init>(r6, r0, r12)
            r13 = r6
            goto L50a
        L360:
            r12 = 0
            java.lang.Object r13 = r0.B
            i03 r13 = (defpackage.i03) r13
            java.lang.Object r6 = r0.R
            yw2 r6 = (defpackage.yw2) r6
            boolean r13 = r13.f()
            if (r13 == 0) goto L37c
            pv2 r13 = r15.X
            if (r13 != 0) goto L37c
            u63 r3 = new u63
            r13 = 12
            r3.<init>(r13, r0, r12)
            goto L50a
        L37c:
            r13 = 12
            boolean r24 = defpackage.n16.D(r15, r0)
            if (r24 != 0) goto L38b
            u63 r3 = new u63
            r3.<init>(r13, r0, r12)
            goto L50a
        L38b:
            ma0 r12 = r0.h()
            boolean r13 = r12.a
            if (r13 != 0) goto L502
            java.lang.String r13 = r6.a(r4)
            if (r13 != 0) goto L502
            java.lang.String r13 = r6.a(r3)
            if (r13 == 0) goto L3a1
            goto L502
        L3a1:
            ma0 r13 = r15.e()
            if (r19 == 0) goto L3bd
            long r30 = r19.getTime()
            r32 = r3
            r33 = r4
            long r3 = r10 - r30
            r30 = r8
            r8 = 0
            long r25 = java.lang.Math.max(r8, r3)
            r3 = r25
        L3bb:
            r8 = -1
            goto L3c7
        L3bd:
            r32 = r3
            r33 = r4
            r30 = r8
            r8 = 0
            r3 = r8
            goto L3bb
        L3c7:
            if (r7 == r8) goto L3d2
            long r7 = (long) r7
            long r7 = r5.toMillis(r7)
            long r3 = java.lang.Math.max(r3, r7)
        L3d2:
            long r7 = r10 - r30
            r34 = r3
            r3 = 0
            long r7 = java.lang.Math.max(r3, r7)
            r9 = r6
            r36 = r7
            long r6 = r27 - r10
            long r6 = java.lang.Math.max(r3, r6)
            long r3 = r34 + r36
            long r3 = r3 + r6
            ma0 r6 = r15.e()
            int r6 = r6.c
            r8 = -1
            if (r6 == r8) goto L3f9
            long r6 = (long) r6
            long r6 = r5.toMillis(r6)
        L3f6:
            r25 = 0
            goto L44b
        L3f9:
            if (r14 == 0) goto L410
            if (r19 == 0) goto L401
            long r10 = r19.getTime()
        L401:
            long r6 = r14.getTime()
            long r6 = r6 - r10
            r25 = 0
            int r8 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r8 <= 0) goto L40d
            goto L3f6
        L40d:
            r6 = 0
            goto L3f6
        L410:
            if (r18 == 0) goto L448
            pa r6 = r15.A
            java.lang.Object r6 = r6.B
            i03 r6 = (defpackage.i03) r6
            java.util.List r6 = r6.g
            if (r6 != 0) goto L41e
            r6 = 0
            goto L42a
        L41e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            defpackage.x31.o(r6, r7)
            java.lang.String r6 = r7.toString()
        L42a:
            if (r6 != 0) goto L448
            if (r19 == 0) goto L434
            long r6 = r19.getTime()
            r30 = r6
        L434:
            long r6 = r18.getTime()
            long r30 = r30 - r6
            r25 = 0
            int r6 = (r30 > r25 ? 1 : (r30 == r25 ? 0 : -1))
            if (r6 <= 0) goto L445
            r6 = 10
            long r6 = r30 / r6
            goto L44b
        L445:
            r6 = r25
            goto L44b
        L448:
            r25 = 0
            goto L445
        L44b:
            int r8 = r12.c
            r10 = -1
            if (r8 == r10) goto L459
            long r10 = (long) r8
            long r10 = r5.toMillis(r10)
            long r6 = java.lang.Math.min(r6, r10)
        L459:
            int r8 = r12.i
            r10 = -1
            if (r8 == r10) goto L464
            long r10 = (long) r8
            long r10 = r5.toMillis(r10)
            goto L466
        L464:
            r10 = r25
        L466:
            boolean r8 = r13.g
            if (r8 != 0) goto L477
            int r8 = r12.h
            r12 = -1
            if (r8 == r12) goto L477
            r27 = r3
            long r3 = (long) r8
            long r3 = r5.toMillis(r3)
            goto L47b
        L477:
            r27 = r3
            r3 = r25
        L47b:
            boolean r5 = r13.a
            if (r5 != 0) goto L4c0
            long r10 = r27 + r10
            long r3 = r3 + r6
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4c0
            ul5 r3 = r15.h()
            int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r4 < 0) goto L497
            java.lang.String r4 = "110 HttpURLConnection \"Response is stale\""
            java.lang.String r5 = "Warning"
            ww2 r6 = r3.f
            r6.b(r5, r4)
        L497:
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r27 > r4 ? 1 : (r27 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4b2
            ma0 r4 = r15.e()
            int r4 = r4.c
            r8 = -1
            if (r4 != r8) goto L4b2
            if (r14 != 0) goto L4b2
            java.lang.String r4 = "113 HttpURLConnection \"Heuristic expiration\""
            java.lang.String r5 = "Warning"
            ww2 r6 = r3.f
            r6.b(r5, r4)
        L4b2:
            u63 r4 = new u63
            wl5 r3 = r3.a()
            r12 = 0
            r13 = 12
            r4.<init>(r13, r12, r3)
            r3 = r4
            goto L50a
        L4c0:
            if (r20 == 0) goto L4c7
            r4 = r20
            r3 = r32
            goto L4d3
        L4c7:
            if (r18 == 0) goto L4ce
            r4 = r21
        L4cb:
            r3 = r33
            goto L4d3
        L4ce:
            if (r19 == 0) goto L4f9
            r4 = r22
            goto L4cb
        L4d3:
            ww2 r5 = r9.c()
            r4.getClass()
            defpackage.ft7.a(r5, r3, r4)
            s9 r3 = r0.o()
            yw2 r4 = r5.f()
            ww2 r4 = r4.c()
            r3.c = r4
            pa r4 = new pa
            r4.<init>(r3)
            u63 r3 = new u63
            r13 = 12
            r3.<init>(r13, r4, r15)
            r12 = 0
            goto L50a
        L4f9:
            r13 = 12
            u63 r3 = new u63
            r12 = 0
            r3.<init>(r13, r0, r12)
            goto L50a
        L502:
            r12 = 0
            r13 = 12
            u63 r3 = new u63
            r3.<init>(r13, r0, r12)
        L50a:
            java.lang.Object r4 = r3.B
            pa r4 = (defpackage.pa) r4
            if (r4 == 0) goto L51d
            ma0 r0 = r0.h()
            boolean r0 = r0.j
            if (r0 == 0) goto L51d
            u63 r3 = new u63
            r3.<init>(r13, r12, r12)
        L51d:
            java.lang.Object r0 = r3.B
            pa r0 = (defpackage.pa) r0
            java.lang.Object r3 = r3.L
            wl5 r3 = (defpackage.wl5) r3
            java.lang.Object r4 = r1.b
            la0 r4 = (defpackage.la0) r4
            if (r4 == 0) goto L52d
            monitor-enter(r4)
            monitor-exit(r4)
        L52d:
            if (r15 == 0) goto L536
            if (r3 != 0) goto L536
            yl5 r4 = r15.Z
            defpackage.yy7.b(r4)
        L536:
            if (r0 != 0) goto L582
            if (r3 != 0) goto L582
            xl5 r32 = defpackage.yl5.A
            jd1 r42 = defpackage.a97.F
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 20
            r0.<init>(r4)
            java.lang.Object r1 = r2.i
            r26 = r1
            pa r26 = (defpackage.pa) r26
            r26.getClass()
            k55 r27 = defpackage.k55.HTTP_1_1
            r27.getClass()
            java.lang.String r28 = "Unsatisfiable Request (only-if-cached)"
            long r39 = java.lang.System.currentTimeMillis()
            yw2 r1 = new yw2
            r6 = 0
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.<init>(r0)
            wl5 r25 = new wl5
            r29 = 504(0x1f8, float:7.06E-43)
            r30 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = -1
            r41 = 0
            r31 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r42)
            r8 = r25
            goto L7c4
        L582:
            if (r0 != 0) goto L59c
            r3.getClass()
            ul5 r0 = r3.h()
            wl5 r1 = defpackage.np2.g0(r3)
            java.lang.String r2 = "cacheResponse"
            defpackage.ul5.b(r2, r1)
            r0.j = r1
            wl5 r8 = r0.a()
            goto L7c4
        L59c:
            wl5 r2 = r2.f(r0)     // Catch: java.lang.Throwable -> L7c5
            if (r3 == 0) goto L6c8
            int r4 = r2.R
            r5 = 304(0x130, float:4.26E-43)
            if (r4 != r5) goto L6c3
            ul5 r0 = r3.h()
            yw2 r4 = r3.Y
            yw2 r5 = r2.Y
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 20
            r6.<init>(r7)
            int r7 = r4.size()
            r8 = 0
        L5bc:
            if (r8 >= r7) goto L60e
            java.lang.String r9 = r4.b(r8)
            java.lang.String r10 = r4.d(r8)
            java.lang.String r11 = "Warning"
            boolean r11 = r11.equalsIgnoreCase(r9)
            if (r11 == 0) goto L5d8
            java.lang.String r11 = "1"
            r13 = 0
            boolean r11 = defpackage.xs6.g0(r10, r11, r13)
            if (r11 == 0) goto L5d8
            goto L60b
        L5d8:
            java.lang.String r11 = "Content-Length"
            boolean r11 = r11.equalsIgnoreCase(r9)
            if (r11 != 0) goto L5fd
            java.lang.String r11 = "Content-Encoding"
            boolean r11 = r11.equalsIgnoreCase(r9)
            if (r11 != 0) goto L5fd
            java.lang.String r11 = "Content-Type"
            boolean r11 = r11.equalsIgnoreCase(r9)
            if (r11 == 0) goto L5f1
            goto L5fd
        L5f1:
            boolean r11 = defpackage.lb4.B(r9)
            if (r11 == 0) goto L5fd
            java.lang.String r11 = r5.a(r9)
            if (r11 != 0) goto L60b
        L5fd:
            r6.add(r9)
            java.lang.CharSequence r9 = defpackage.qs6.T0(r10)
            java.lang.String r9 = r9.toString()
            r6.add(r9)
        L60b:
            int r8 = r8 + 1
            goto L5bc
        L60e:
            int r4 = r5.size()
            r7 = 0
        L613:
            if (r7 >= r4) goto L64d
            java.lang.String r8 = r5.b(r7)
            java.lang.String r9 = "Content-Length"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 != 0) goto L64a
            java.lang.String r9 = "Content-Encoding"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 != 0) goto L64a
            java.lang.String r9 = "Content-Type"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 == 0) goto L632
            goto L64a
        L632:
            boolean r9 = defpackage.lb4.B(r8)
            if (r9 == 0) goto L64a
            java.lang.String r9 = r5.d(r7)
            r6.add(r8)
            java.lang.CharSequence r8 = defpackage.qs6.T0(r9)
            java.lang.String r8 = r8.toString()
            r6.add(r8)
        L64a:
            int r7 = r7 + 1
            goto L613
        L64d:
            yw2 r4 = new yw2
            r9 = 0
            java.lang.String[] r5 = new java.lang.String[r9]
            java.lang.Object[] r5 = r6.toArray(r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r4.<init>(r5)
            ww2 r4 = r4.c()
            r0.f = r4
            long r4 = r2.h0
            r0.l = r4
            long r4 = r2.i0
            r0.m = r4
            wl5 r4 = defpackage.np2.g0(r3)
            java.lang.String r5 = "cacheResponse"
            defpackage.ul5.b(r5, r4)
            r0.j = r4
            wl5 r4 = defpackage.np2.g0(r2)
            java.lang.String r5 = "networkResponse"
            defpackage.ul5.b(r5, r4)
            r0.i = r4
            wl5 r0 = r0.a()
            yl5 r2 = r2.Z
            r2.close()
            java.lang.Object r2 = r1.b
            la0 r2 = (defpackage.la0) r2
            r2.getClass()
            monitor-enter(r2)
            monitor-exit(r2)
            java.lang.Object r1 = r1.b
            la0 r1 = (defpackage.la0) r1
            r1.getClass()
            ia0 r1 = new ia0
            r1.<init>(r0)
            yl5 r2 = r3.Z
            r2.getClass()
            ha0 r2 = (defpackage.ha0) r2
            fk1 r2 = r2.B
            kk1 r3 = r2.R     // Catch: java.io.IOException -> L6ba
            java.lang.String r4 = r2.A     // Catch: java.io.IOException -> L6ba
            long r5 = r2.B     // Catch: java.io.IOException -> L6ba
            bk1 r8 = r3.k(r5, r4)     // Catch: java.io.IOException -> L6ba
            if (r8 != 0) goto L6b3
            goto L6c0
        L6b3:
            r1.c(r8)     // Catch: java.io.IOException -> L6bb
            r8.d()     // Catch: java.io.IOException -> L6bb
            goto L6c0
        L6ba:
            r8 = r12
        L6bb:
            if (r8 == 0) goto L6c0
            r8.a()     // Catch: java.io.IOException -> L6c0
        L6c0:
            r8 = r0
            goto L7c4
        L6c3:
            yl5 r4 = r3.Z
            defpackage.yy7.b(r4)
        L6c8:
            ul5 r4 = r2.h()
            if (r3 == 0) goto L6d3
            wl5 r15 = defpackage.np2.g0(r3)
            goto L6d4
        L6d3:
            r15 = r12
        L6d4:
            java.lang.String r3 = "cacheResponse"
            defpackage.ul5.b(r3, r15)
            r4.j = r15
            wl5 r2 = defpackage.np2.g0(r2)
            java.lang.String r3 = "networkResponse"
            defpackage.ul5.b(r3, r2)
            r4.i = r2
            wl5 r2 = r4.a()
            java.lang.Object r3 = r1.b
            la0 r3 = (defpackage.la0) r3
            if (r3 == 0) goto L7c3
            boolean r3 = defpackage.zz2.a(r2)
            if (r3 == 0) goto L7b2
            boolean r3 = defpackage.n16.D(r2, r0)
            if (r3 == 0) goto L7b2
            java.lang.Object r1 = r1.b
            la0 r1 = (defpackage.la0) r1
            ul5 r3 = r2.h()
            r3.a = r0
            wl5 r0 = r3.a()
            r1.getClass()
            pa r3 = r0.A
            java.lang.Object r4 = r3.L
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = defpackage.ii2.C(r4)
            if (r5 == 0) goto L71e
            r1.e(r3)     // Catch: java.io.IOException -> L71c
        L71c:
            r15 = r12
            goto L773
        L71e:
            java.lang.String r5 = "GET"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L727
            goto L71c
        L727:
            yw2 r4 = r0.Y
            java.util.Set r4 = defpackage.g04.X(r4)
            java.lang.String r5 = "*"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L736
            goto L71c
        L736:
            ia0 r4 = new ia0
            r4.<init>(r0)
            kk1 r0 = r1.A     // Catch: java.io.IOException -> L76c
            java.lang.Object r3 = r3.B     // Catch: java.io.IOException -> L76c
            i03 r3 = (defpackage.i03) r3     // Catch: java.io.IOException -> L76c
            java.lang.String r3 = defpackage.g04.K(r3)     // Catch: java.io.IOException -> L76c
            xh5 r5 = defpackage.kk1.p0     // Catch: java.io.IOException -> L76c
            r5 = -1
            bk1 r15 = r0.k(r5, r3)     // Catch: java.io.IOException -> L76c
            if (r15 != 0) goto L750
            goto L71c
        L750:
            r4.c(r15)     // Catch: java.io.IOException -> L76d
            ka0 r0 = new ka0     // Catch: java.io.IOException -> L76d
            r0.<init>()     // Catch: java.io.IOException -> L76d
            r0.e = r1     // Catch: java.io.IOException -> L76d
            r0.b = r15     // Catch: java.io.IOException -> L76d
            r7 = 1
            ui6 r3 = r15.l(r7)     // Catch: java.io.IOException -> L76d
            r0.c = r3     // Catch: java.io.IOException -> L76d
            ja0 r4 = new ja0     // Catch: java.io.IOException -> L76d
            r4.<init>(r1, r0, r3)     // Catch: java.io.IOException -> L76d
            r0.d = r4     // Catch: java.io.IOException -> L76d
            r15 = r0
            goto L773
        L76c:
            r15 = r12
        L76d:
            if (r15 == 0) goto L71c
            r15.a()     // Catch: java.io.IOException -> L71c
            goto L71c
        L773:
            if (r15 != 0) goto L776
            goto L7c3
        L776:
            java.lang.Object r0 = r15.d
            ja0 r0 = (defpackage.ja0) r0
            yl5 r1 = r2.Z
            z80 r1 = r1.n()
            ee5 r0 = defpackage.hi2.t(r0)
            qa0 r3 = new qa0
            r3.<init>(r1, r15, r0)
            java.lang.String r0 = "Content-Type"
            yw2 r1 = r2.Y
            java.lang.String r0 = r1.a(r0)
            if (r0 != 0) goto L795
            r8 = r12
            goto L796
        L795:
            r8 = r0
        L796:
            yl5 r0 = r2.Z
            long r0 = r0.h()
            ul5 r2 = r2.h()
            te5 r4 = new te5
            fe5 r5 = new fe5
            r5.<init>(r3)
            r4.<init>(r8, r0, r5)
            r2.g = r4
            wl5 r0 = r2.a()
            goto L6c0
        L7b2:
            java.lang.Object r3 = r0.L
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = defpackage.ii2.C(r3)
            if (r3 == 0) goto L7c3
            java.lang.Object r1 = r1.b     // Catch: java.io.IOException -> L7c3
            la0 r1 = (defpackage.la0) r1     // Catch: java.io.IOException -> L7c3
            r1.e(r0)     // Catch: java.io.IOException -> L7c3
        L7c3:
            r8 = r2
        L7c4:
            return r8
        L7c5:
            r0 = move-exception
            if (r15 == 0) goto L7cd
            yl5 r1 = r15.Z
            defpackage.yy7.b(r1)
        L7cd:
            throw r0
        L7ce:
            r7 = 1
            r12 = 0
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r3 = "User-Agent"
            java.lang.Object r1 = r1.b
            vs0 r1 = (defpackage.vs0) r1
            java.lang.String r4 = "gzip"
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r6 = "Connection"
            java.lang.String r8 = "Host"
            java.lang.String r9 = "Transfer-Encoding"
            java.lang.String r10 = "Content-Type"
            java.lang.String r11 = "Content-Length"
            java.lang.Object r13 = r2.i
            pa r13 = (defpackage.pa) r13
            s9 r14 = r13.o()
            java.lang.Object r15 = r13.B
            i03 r15 = (defpackage.i03) r15
            java.lang.Object r7 = r13.R
            yw2 r7 = (defpackage.yw2) r7
            java.lang.Object r13 = r13.X
            mk5 r13 = (defpackage.mk5) r13
            if (r13 == 0) goto L82c
            n34 r12 = r13.b()
            if (r12 == 0) goto L807
            java.lang.String r12 = r12.a
            r14.B(r10, r12)
        L807:
            long r12 = r13.a()
            r16 = -1
            int r18 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r18 == 0) goto L820
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r14.B(r11, r12)
            java.lang.Object r12 = r14.c
            ww2 r12 = (defpackage.ww2) r12
            r12.r(r9)
            goto L82c
        L820:
            java.lang.String r12 = "chunked"
            r14.B(r9, r12)
            java.lang.Object r9 = r14.c
            ww2 r9 = (defpackage.ww2) r9
            r9.r(r11)
        L82c:
            java.lang.String r9 = r7.a(r8)
            if (r9 != 0) goto L83b
            r9 = 0
            java.lang.String r12 = defpackage.az7.i(r15, r9)
            r14.B(r8, r12)
            goto L83c
        L83b:
            r9 = 0
        L83c:
            java.lang.String r8 = r7.a(r6)
            if (r8 != 0) goto L847
            java.lang.String r8 = "Keep-Alive"
            r14.B(r6, r8)
        L847:
            java.lang.String r6 = r7.a(r5)
            if (r6 != 0) goto L85a
            java.lang.String r6 = "Range"
            java.lang.String r6 = r7.a(r6)
            if (r6 != 0) goto L85a
            r14.B(r5, r4)
            r6 = 1
            goto L85b
        L85a:
            r6 = r9
        L85b:
            r1.getClass()
            r15.getClass()
            java.lang.String r5 = r7.a(r3)
            if (r5 != 0) goto L86c
            java.lang.String r5 = "okhttp/5.3.2"
            r14.B(r3, r5)
        L86c:
            pa r3 = new pa
            r3.<init>(r14)
            wl5 r2 = r2.f(r3)
            yw2 r5 = r2.Y
            java.lang.Object r7 = r3.B
            i03 r7 = (defpackage.i03) r7
            defpackage.zz2.b(r1, r7, r5)
            ul5 r1 = r2.h()
            r1.a = r3
            if (r6 == 0) goto L8d1
            java.lang.String r15 = r5.a(r0)
            if (r15 != 0) goto L88d
            r15 = 0
        L88d:
            boolean r3 = r4.equalsIgnoreCase(r15)
            if (r3 == 0) goto L8d1
            boolean r3 = defpackage.zz2.a(r2)
            if (r3 == 0) goto L8d1
            yl5 r2 = r2.Z
            if (r2 == 0) goto L8d1
            cv2 r3 = new cv2
            z80 r2 = r2.n()
            r3.<init>(r2)
            ww2 r2 = r5.c()
            r2.r(r0)
            r2.r(r11)
            yw2 r0 = r2.f()
            ww2 r0 = r0.c()
            r1.f = r0
            java.lang.String r0 = r5.a(r10)
            if (r0 != 0) goto L8c2
            r8 = 0
            goto L8c3
        L8c2:
            r8 = r0
        L8c3:
            te5 r0 = new te5
            fe5 r2 = new fe5
            r2.<init>(r3)
            r5 = -1
            r0.<init>(r8, r5, r2)
            r1.g = r0
        L8d1:
            wl5 r0 = r1.a()
            return r0
    }

    public defpackage.pa b(defpackage.wl5 r11, defpackage.bk1 r12) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto La
            ke5 r1 = r12.j()
            b26 r1 = r1.c
            goto Lb
        La:
            r1 = r0
        Lb:
            int r2 = r11.R
            pa r3 = r11.A
            java.lang.Object r4 = r3.L
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r6 = 1
            r7 = 308(0x134, float:4.32E-43)
            r8 = 307(0x133, float:4.3E-43)
            if (r2 == r8) goto Le7
            if (r2 == r7) goto Le7
            r9 = 401(0x191, float:5.62E-43)
            if (r2 == r9) goto Ldd
            r9 = 421(0x1a5, float:5.9E-43)
            if (r2 == r9) goto L98
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L82
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L63
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L36
            switch(r2) {
                case 300: goto Le7;
                case 301: goto Le7;
                case 302: goto Le7;
                case 303: goto Le7;
                default: goto L34;
            }
        L34:
            goto L130
        L36:
            java.lang.Object r10 = r10.b
            xk4 r10 = (defpackage.xk4) r10
            boolean r10 = r10.e
            if (r10 != 0) goto L40
            goto L130
        L40:
            java.lang.Object r10 = r3.X
            mk5 r10 = (defpackage.mk5) r10
            if (r10 == 0) goto L4e
            boolean r10 = r10.c()
            if (r10 == 0) goto L4e
            goto L130
        L4e:
            wl5 r10 = r11.g0
            if (r10 == 0) goto L58
            int r10 = r10.R
            if (r10 != r12) goto L58
            goto L130
        L58:
            int r10 = d(r11, r5)
            if (r10 <= 0) goto L60
            goto L130
        L60:
            pa r10 = r11.A
            return r10
        L63:
            r1.getClass()
            java.net.Proxy r11 = r1.b
            java.net.Proxy$Type r11 = r11.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.HTTP
            if (r11 != r12) goto L7a
            java.lang.Object r10 = r10.b
            xk4 r10 = (defpackage.xk4) r10
            xd5 r10 = r10.n
            r10.getClass()
            return r0
        L7a:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r10.<init>(r11)
            throw r10
        L82:
            wl5 r10 = r11.g0
            if (r10 == 0) goto L8c
            int r10 = r10.R
            if (r10 != r12) goto L8c
            goto L130
        L8c:
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r10 = d(r11, r10)
            if (r10 != 0) goto L130
            pa r10 = r11.A
            return r10
        L98:
            java.lang.Object r10 = r3.X
            mk5 r10 = (defpackage.mk5) r10
            if (r10 == 0) goto La6
            boolean r10 = r10.c()
            if (r10 == 0) goto La6
            goto L130
        La6:
            if (r12 == 0) goto L130
            java.lang.Object r10 = r12.B
            w62 r10 = (defpackage.w62) r10
            ue5 r10 = r10.b()
            ea r10 = r10.i
            i03 r10 = r10.h
            java.lang.String r10 = r10.d
            java.lang.Object r1 = r12.R
            v62 r1 = (defpackage.v62) r1
            u62 r1 = r1.i()
            b26 r1 = r1.h()
            ea r1 = r1.a
            i03 r1 = r1.h
            java.lang.String r1 = r1.d
            boolean r10 = defpackage.nb3.k(r10, r1)
            if (r10 == 0) goto Lcf
            goto L130
        Lcf:
            ke5 r10 = r12.j()
            monitor-enter(r10)
            r10.k = r6     // Catch: java.lang.Throwable -> Lda
            monitor-exit(r10)
            pa r10 = r11.A
            return r10
        Lda:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        Ldd:
            java.lang.Object r10 = r10.b
            xk4 r10 = (defpackage.xk4) r10
            xd5 r10 = r10.g
            r10.getClass()
            return r0
        Le7:
            java.lang.String r12 = "PROPFIND"
            java.lang.Object r10 = r10.b
            xk4 r10 = (defpackage.xk4) r10
            boolean r1 = r10.h
            if (r1 != 0) goto Lf2
            goto L130
        Lf2:
            java.lang.String r1 = "Location"
            yw2 r2 = r11.Y
            java.lang.String r1 = r2.a(r1)
            if (r1 != 0) goto Lfd
            r1 = r0
        Lfd:
            pa r2 = r11.A
            if (r1 != 0) goto L102
            goto L130
        L102:
            java.lang.Object r3 = r2.B
            i03 r3 = (defpackage.i03) r3
            r3.getClass()
            h03 r9 = new h03     // Catch: java.lang.IllegalArgumentException -> L112
            r9.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L112
            r9.e(r3, r1)     // Catch: java.lang.IllegalArgumentException -> L112
            goto L113
        L112:
            r9 = r0
        L113:
            if (r9 == 0) goto L11a
            i03 r1 = r9.b()
            goto L11b
        L11a:
            r1 = r0
        L11b:
            if (r1 != 0) goto L11e
            goto L130
        L11e:
            java.lang.String r3 = r1.a
            java.lang.Object r9 = r2.B
            i03 r9 = (defpackage.i03) r9
            java.lang.String r9 = r9.a
            boolean r3 = defpackage.nb3.k(r3, r9)
            if (r3 != 0) goto L131
            boolean r10 = r10.i
            if (r10 != 0) goto L131
        L130:
            return r0
        L131:
            s9 r10 = r2.o()
            boolean r3 = defpackage.ii2.J(r4)
            if (r3 == 0) goto L17f
            int r11 = r11.R
            boolean r3 = r4.equals(r12)
            if (r3 != 0) goto L147
            if (r11 == r7) goto L147
            if (r11 != r8) goto L148
        L147:
            r5 = r6
        L148:
            boolean r12 = r4.equals(r12)
            if (r12 != 0) goto L158
            if (r11 == r7) goto L158
            if (r11 == r8) goto L158
            java.lang.String r11 = "GET"
            r10.D(r11, r0)
            goto L162
        L158:
            if (r5 == 0) goto L15f
            java.lang.Object r11 = r2.X
            r0 = r11
            mk5 r0 = (defpackage.mk5) r0
        L15f:
            r10.D(r4, r0)
        L162:
            if (r5 != 0) goto L17f
            java.lang.String r11 = "Transfer-Encoding"
            java.lang.Object r12 = r10.c
            ww2 r12 = (defpackage.ww2) r12
            r12.r(r11)
            java.lang.String r11 = "Content-Length"
            java.lang.Object r12 = r10.c
            ww2 r12 = (defpackage.ww2) r12
            r12.r(r11)
            java.lang.String r11 = "Content-Type"
            java.lang.Object r12 = r10.c
            ww2 r12 = (defpackage.ww2) r12
            r12.r(r11)
        L17f:
            java.lang.Object r11 = r2.B
            i03 r11 = (defpackage.i03) r11
            boolean r11 = defpackage.az7.a(r11, r1)
            if (r11 != 0) goto L192
            java.lang.String r11 = "Authorization"
            java.lang.Object r12 = r10.c
            ww2 r12 = (defpackage.ww2) r12
            r12.r(r11)
        L192:
            r10.a = r1
            pa r11 = new pa
            r11.<init>(r10)
            return r11
    }

    public boolean c(java.io.IOException r2, defpackage.je5 r3, defpackage.pa r4) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.vz0
            java.lang.Object r1 = r1.b
            xk4 r1 = (defpackage.xk4) r1
            boolean r1 = r1.e
            if (r1 != 0) goto Lb
            goto L63
        Lb:
            if (r0 != 0) goto L1e
            java.lang.Object r1 = r4.X
            mk5 r1 = (defpackage.mk5) r1
            if (r1 == 0) goto L19
            boolean r1 = r1.c()
            if (r1 != 0) goto L63
        L19:
            boolean r1 = r2 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L1e
            goto L63
        L1e:
            boolean r1 = r2 instanceof java.net.ProtocolException
            if (r1 == 0) goto L23
            goto L63
        L23:
            boolean r1 = r2 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L2e
            boolean r1 = r2 instanceof java.net.SocketTimeoutException
            if (r1 == 0) goto L63
            if (r0 == 0) goto L63
            goto L40
        L2e:
            boolean r1 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 == 0) goto L3b
            java.lang.Throwable r1 = r2.getCause()
            boolean r1 = r1 instanceof java.security.cert.CertificateException
            if (r1 == 0) goto L3b
            goto L63
        L3b:
            boolean r1 = r2 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r1 == 0) goto L40
            goto L63
        L40:
            bk1 r1 = r3.n0
            if (r1 == 0) goto L63
            boolean r1 = r1.A
            r2 = 1
            if (r1 != r2) goto L63
            w62 r1 = r3.d0
            r1.getClass()
            ue5 r1 = r1.b()
            bk1 r3 = r3.n0
            if (r3 == 0) goto L5b
            ke5 r3 = r3.j()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto L63
            return r2
        L63:
            r1 = 0
            return r1
    }
}
