package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g03  reason: default package */
/* loaded from: classes.dex */
public final class g03 implements defpackage.la2 {
    public static final defpackage.ma0 f = null;
    public static final defpackage.ma0 g = null;
    public final java.lang.String a;
    public final defpackage.fo4 b;
    public final defpackage.ex6 c;
    public final defpackage.ex6 d;
    public final boolean e;

    static {
            ma0 r0 = new ma0
            r12 = 0
            r13 = 0
            r1 = 1
            r2 = 1
            r3 = -1
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = -1
            r9 = -1
            r10 = 0
            r11 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            defpackage.g03.f = r0
            ma0 r1 = new ma0
            r13 = 0
            r14 = 0
            r3 = 0
            r5 = -1
            r8 = 0
            r10 = -1
            r11 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            defpackage.g03.g = r1
            return
    }

    public g03(java.lang.String r1, defpackage.fo4 r2, defpackage.ex6 r3, defpackage.ex6 r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public static java.lang.String d(java.lang.String r3, defpackage.n34 r4) {
            r0 = 0
            if (r4 == 0) goto L6
            java.lang.String r4 = r4.a
            goto L7
        L6:
            r4 = r0
        L7:
            if (r4 == 0) goto L12
            java.lang.String r1 = "text/plain"
            r2 = 0
            boolean r1 = defpackage.xs6.g0(r4, r1, r2)
            if (r1 == 0) goto L1d
        L12:
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = defpackage.k.b(r1, r3)
            if (r3 == 0) goto L1d
            return r3
        L1d:
            if (r4 == 0) goto L26
            r3 = 59
            java.lang.String r3 = defpackage.qs6.P0(r4, r3)
            return r3
        L26:
            return r0
    }

    @Override // defpackage.la2
    public final java.lang.Object a(defpackage.r41 r14) {
            r13 = this;
            boolean r0 = r14 instanceof defpackage.f03
            if (r0 == 0) goto L13
            r0 = r14
            f03 r0 = (defpackage.f03) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L1a
        L13:
            f03 r0 = new f03
            s41 r14 = (defpackage.s41) r14
            r0.<init>(r13, r14)
        L1a:
            java.lang.Object r14 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            java.lang.String r3 = "response body == null"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L41
            if (r2 != r4) goto L3b
            java.lang.Object r13 = r0.Y
            wl5 r13 = (defpackage.wl5) r13
            le5 r1 = r0.X
            g03 r0 = r0.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Exception -> L38
            goto L1d1
        L38:
            r14 = move-exception
            goto L211
        L3b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r6
        L41:
            java.lang.Object r13 = r0.Y
            va0 r13 = (defpackage.va0) r13
            le5 r2 = r0.X
            g03 r5 = r0.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Exception -> L52
            r12 = r14
            r14 = r13
            r13 = r5
            r5 = r12
            goto L14c
        L52:
            r13 = move-exception
            goto L21e
        L55:
            defpackage.oi2.Y(r14)
            fo4 r14 = r13.b
            ra0 r2 = r14.n
            boolean r2 = r2.getReadEnabled()
            java.lang.String r7 = r13.a
            if (r2 == 0) goto L91
            ex6 r2 = r13.d
            java.lang.Object r2 = r2.getValue()
            me5 r2 = (defpackage.me5) r2
            if (r2 == 0) goto L91
            java.lang.String r14 = r14.i
            if (r14 != 0) goto L73
            r14 = r7
        L73:
            lk1 r2 = r2.b
            da0 r8 = defpackage.da0.R
            da0 r14 = defpackage.xd5.o(r14)
            java.lang.String r8 = "SHA-256"
            da0 r14 = r14.c(r8)
            java.lang.String r14 = r14.e()
            gk1 r14 = r2.k(r14)
            if (r14 == 0) goto L91
            le5 r2 = new le5
            r2.<init>(r14)
            goto L92
        L91:
            r2 = r6
        L92:
            if (r2 == 0) goto L12a
            db2 r14 = r13.c()     // Catch: java.lang.Exception -> L52
            gk1 r8 = r2.A     // Catch: java.lang.Exception -> L52
            boolean r9 = r8.B     // Catch: java.lang.Exception -> L52
            if (r9 != 0) goto L122
            ek1 r8 = r8.A     // Catch: java.lang.Exception -> L52
            java.util.ArrayList r8 = r8.c     // Catch: java.lang.Exception -> L52
            r9 = 0
            java.lang.Object r8 = r8.get(r9)     // Catch: java.lang.Exception -> L52
            lt4 r8 = (defpackage.lt4) r8     // Catch: java.lang.Exception -> L52
            ai1 r14 = r14.A(r8)     // Catch: java.lang.Exception -> L52
            java.lang.Object r14 = r14.e     // Catch: java.lang.Exception -> L52
            java.lang.Long r14 = (java.lang.Long) r14     // Catch: java.lang.Exception -> L52
            if (r14 != 0) goto Lb4
            goto Lce
        Lb4:
            long r8 = r14.longValue()     // Catch: java.lang.Exception -> L52
            r10 = 0
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 != 0) goto Lce
            mn6 r14 = new mn6     // Catch: java.lang.Exception -> L52
            xa2 r13 = r13.g(r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = d(r7, r6)     // Catch: java.lang.Exception -> L52
            zb1 r1 = defpackage.zb1.DISK     // Catch: java.lang.Exception -> L52
            r14.<init>(r13, r0, r1)     // Catch: java.lang.Exception -> L52
            return r14
        Lce:
            boolean r14 = r13.e     // Catch: java.lang.Exception -> L52
            if (r14 == 0) goto L103
            ua0 r14 = new ua0     // Catch: java.lang.Exception -> L52
            pa r8 = r13.e()     // Catch: java.lang.Exception -> L52
            ta0 r9 = r13.f(r2)     // Catch: java.lang.Exception -> L52
            r14.<init>(r8, r9)     // Catch: java.lang.Exception -> L52
            va0 r14 = r14.a()     // Catch: java.lang.Exception -> L52
            ta0 r8 = r14.b     // Catch: java.lang.Exception -> L52
            pa r9 = r14.a     // Catch: java.lang.Exception -> L52
            if (r9 != 0) goto L137
            if (r8 == 0) goto L137
            mn6 r14 = new mn6     // Catch: java.lang.Exception -> L52
            xa2 r13 = r13.g(r2)     // Catch: java.lang.Exception -> L52
            go3 r0 = r8.b     // Catch: java.lang.Exception -> L52
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L52
            n34 r0 = (defpackage.n34) r0     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = d(r7, r0)     // Catch: java.lang.Exception -> L52
            zb1 r1 = defpackage.zb1.DISK     // Catch: java.lang.Exception -> L52
            r14.<init>(r13, r0, r1)     // Catch: java.lang.Exception -> L52
            return r14
        L103:
            mn6 r14 = new mn6     // Catch: java.lang.Exception -> L52
            xa2 r0 = r13.g(r2)     // Catch: java.lang.Exception -> L52
            ta0 r13 = r13.f(r2)     // Catch: java.lang.Exception -> L52
            if (r13 == 0) goto L118
            go3 r13 = r13.b     // Catch: java.lang.Exception -> L52
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Exception -> L52
            r6 = r13
            n34 r6 = (defpackage.n34) r6     // Catch: java.lang.Exception -> L52
        L118:
            java.lang.String r13 = d(r7, r6)     // Catch: java.lang.Exception -> L52
            zb1 r1 = defpackage.zb1.DISK     // Catch: java.lang.Exception -> L52
            r14.<init>(r0, r13, r1)     // Catch: java.lang.Exception -> L52
            return r14
        L122:
            java.lang.String r13 = "snapshot is closed"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L52
            r14.<init>(r13)     // Catch: java.lang.Exception -> L52
            throw r14     // Catch: java.lang.Exception -> L52
        L12a:
            ua0 r14 = new ua0     // Catch: java.lang.Exception -> L52
            pa r7 = r13.e()     // Catch: java.lang.Exception -> L52
            r14.<init>(r7, r6)     // Catch: java.lang.Exception -> L52
            va0 r14 = r14.a()     // Catch: java.lang.Exception -> L52
        L137:
            pa r7 = r14.a     // Catch: java.lang.Exception -> L52
            r7.getClass()     // Catch: java.lang.Exception -> L52
            r0.R = r13     // Catch: java.lang.Exception -> L52
            r0.X = r2     // Catch: java.lang.Exception -> L52
            r0.Y = r14     // Catch: java.lang.Exception -> L52
            r0.e0 = r5     // Catch: java.lang.Exception -> L52
            java.lang.Object r5 = r13.b(r7, r0)     // Catch: java.lang.Exception -> L52
            if (r5 != r1) goto L14c
            goto L1cc
        L14c:
            wl5 r5 = (defpackage.wl5) r5     // Catch: java.lang.Exception -> L52
            android.graphics.Bitmap$Config[] r7 = defpackage.k.a     // Catch: java.lang.Exception -> L52
            yl5 r7 = r5.Z     // Catch: java.lang.Exception -> L52
            if (r7 == 0) goto L218
            pa r8 = r14.a     // Catch: java.lang.Exception -> L20d
            ta0 r14 = r14.b     // Catch: java.lang.Exception -> L20d
            le5 r14 = r13.h(r2, r8, r5, r14)     // Catch: java.lang.Exception -> L20d
            java.lang.String r2 = r13.a
            if (r14 == 0) goto L187
            mn6 r0 = new mn6     // Catch: java.lang.Exception -> L185
            xa2 r1 = r13.g(r14)     // Catch: java.lang.Exception -> L185
            ta0 r13 = r13.f(r14)     // Catch: java.lang.Exception -> L185
            if (r13 == 0) goto L17b
            go3 r13 = r13.b     // Catch: java.lang.Exception -> L185
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Exception -> L185
            r6 = r13
            n34 r6 = (defpackage.n34) r6     // Catch: java.lang.Exception -> L185
            goto L17b
        L176:
            r1 = r14
            r14 = r13
        L178:
            r13 = r5
            goto L211
        L17b:
            java.lang.String r13 = d(r2, r6)     // Catch: java.lang.Exception -> L185
            zb1 r2 = defpackage.zb1.NETWORK     // Catch: java.lang.Exception -> L185
            r0.<init>(r1, r13, r2)     // Catch: java.lang.Exception -> L185
            return r0
        L185:
            r13 = move-exception
            goto L176
        L187:
            z80 r8 = r7.n()     // Catch: java.lang.Exception -> L185
            r9 = 1
            boolean r8 = r8.T(r9)     // Catch: java.lang.Exception -> L185
            if (r8 == 0) goto L1b7
            mn6 r0 = new mn6     // Catch: java.lang.Exception -> L185
            z80 r1 = r7.n()     // Catch: java.lang.Exception -> L185
            fo4 r13 = r13.b     // Catch: java.lang.Exception -> L185
            android.content.Context r13 = r13.a     // Catch: java.lang.Exception -> L185
            jn6 r13 = new jn6     // Catch: java.lang.Exception -> L185
            r13.<init>(r1, r6)     // Catch: java.lang.Exception -> L185
            n34 r1 = r7.k()     // Catch: java.lang.Exception -> L185
            java.lang.String r1 = d(r2, r1)     // Catch: java.lang.Exception -> L185
            wl5 r2 = r5.e0     // Catch: java.lang.Exception -> L185
            if (r2 == 0) goto L1b1
            zb1 r2 = defpackage.zb1.NETWORK     // Catch: java.lang.Exception -> L185
            goto L1b3
        L1b1:
            zb1 r2 = defpackage.zb1.DISK     // Catch: java.lang.Exception -> L185
        L1b3:
            r0.<init>(r13, r1, r2)     // Catch: java.lang.Exception -> L185
            return r0
        L1b7:
            defpackage.k.a(r5)     // Catch: java.lang.Exception -> L185
            pa r2 = r13.e()     // Catch: java.lang.Exception -> L185
            r0.R = r13     // Catch: java.lang.Exception -> L185
            r0.X = r14     // Catch: java.lang.Exception -> L185
            r0.Y = r5     // Catch: java.lang.Exception -> L185
            r0.e0 = r4     // Catch: java.lang.Exception -> L185
            java.lang.Object r0 = r13.b(r2, r0)     // Catch: java.lang.Exception -> L185
            if (r0 != r1) goto L1cd
        L1cc:
            return r1
        L1cd:
            r1 = r14
            r14 = r0
            r0 = r13
            r13 = r5
        L1d1:
            wl5 r14 = (defpackage.wl5) r14     // Catch: java.lang.Exception -> L38
            android.graphics.Bitmap$Config[] r13 = defpackage.k.a     // Catch: java.lang.Exception -> L202
            yl5 r13 = r14.Z     // Catch: java.lang.Exception -> L202
            if (r13 == 0) goto L207
            mn6 r2 = new mn6     // Catch: java.lang.Exception -> L202
            r0.getClass()     // Catch: java.lang.Exception -> L202
            z80 r3 = r13.n()     // Catch: java.lang.Exception -> L202
            fo4 r4 = r0.b     // Catch: java.lang.Exception -> L202
            android.content.Context r4 = r4.a     // Catch: java.lang.Exception -> L202
            jn6 r4 = new jn6     // Catch: java.lang.Exception -> L202
            r4.<init>(r3, r6)     // Catch: java.lang.Exception -> L202
            java.lang.String r0 = r0.a     // Catch: java.lang.Exception -> L202
            n34 r13 = r13.k()     // Catch: java.lang.Exception -> L202
            java.lang.String r13 = d(r0, r13)     // Catch: java.lang.Exception -> L202
            wl5 r0 = r14.e0     // Catch: java.lang.Exception -> L202
            if (r0 == 0) goto L1fc
            zb1 r0 = defpackage.zb1.NETWORK     // Catch: java.lang.Exception -> L202
            goto L1fe
        L1fc:
            zb1 r0 = defpackage.zb1.DISK     // Catch: java.lang.Exception -> L202
        L1fe:
            r2.<init>(r4, r13, r0)     // Catch: java.lang.Exception -> L202
            return r2
        L202:
            r13 = move-exception
            r12 = r14
            r14 = r13
            r13 = r12
            goto L211
        L207:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L202
            r13.<init>(r3)     // Catch: java.lang.Exception -> L202
            throw r13     // Catch: java.lang.Exception -> L202
        L20d:
            r14 = move-exception
            r1 = r2
            goto L178
        L211:
            defpackage.k.a(r13)     // Catch: java.lang.Exception -> L215
            throw r14     // Catch: java.lang.Exception -> L215
        L215:
            r13 = move-exception
            r2 = r1
            goto L21e
        L218:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L52
            r13.<init>(r3)     // Catch: java.lang.Exception -> L52
            throw r13     // Catch: java.lang.Exception -> L52
        L21e:
            if (r2 == 0) goto L223
            defpackage.k.a(r2)
        L223:
            throw r13
    }

    public final java.lang.Object b(defpackage.pa r6, defpackage.s41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.e03
            if (r0 == 0) goto L13
            r0 = r7
            e03 r0 = (defpackage.e03) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            e03 r0 = new e03
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r7)
            goto L9c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.oi2.Y(r7)
            android.graphics.Bitmap$Config[] r7 = defpackage.k.a
            android.os.Looper r7 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r7 = defpackage.nb3.k(r7, r2)
            r2 = 0
            ex6 r4 = r5.c
            if (r7 == 0) goto L6a
            fo4 r5 = r5.b
            ra0 r5 = r5.o
            boolean r5 = r5.getReadEnabled()
            if (r5 != 0) goto L64
            java.lang.Object r5 = r4.getValue()
            xk4 r5 = (defpackage.xk4) r5
            r5.getClass()
            r6.getClass()
            je5 r7 = new je5
            r7.<init>(r5, r6, r2)
            wl5 r5 = r7.e()
            goto L9f
        L64:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L6a:
            java.lang.Object r5 = r4.getValue()
            xk4 r5 = (defpackage.xk4) r5
            r5.getClass()
            r6.getClass()
            je5 r7 = new je5
            r7.<init>(r5, r6, r2)
            r0.Y = r3
            rj0 r5 = new rj0
            r41 r6 = defpackage.np2.V(r0)
            r5.<init>(r3, r6)
            r5.v()
            r5 r6 = new r5
            r0 = 7
            r6.<init>(r0, r7, r5)
            r7.d(r6)
            r5.z(r6)
            java.lang.Object r7 = r5.s()
            if (r7 != r1) goto L9c
            return r1
        L9c:
            r5 = r7
            wl5 r5 = (defpackage.wl5) r5
        L9f:
            boolean r6 = r5.m0
            int r7 = r5.R
            if (r6 != 0) goto Lc7
            r6 = 304(0x130, float:4.26E-43)
            if (r7 == r6) goto Lc7
            yl5 r6 = r5.Z
            if (r6 == 0) goto Lb0
            defpackage.k.a(r6)
        Lb0:
            ug r6 = new ug
            java.lang.String r0 = "HTTP "
            java.lang.String r1 = ": "
            java.lang.StringBuilder r7 = defpackage.xg6.t(r0, r7, r1)
            java.lang.String r5 = r5.L
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        Lc7:
            return r5
    }

    public final defpackage.db2 c() {
            r0 = this;
            ex6 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            me5 r0 = (defpackage.me5) r0
            db2 r0 = r0.a
            return r0
    }

    public final defpackage.pa e() {
            r6 = this;
            s9 r0 = new s9
            r1 = 13
            r0.<init>(r1)
            java.lang.String r1 = r6.a
            r0.I(r1)
            fo4 r6 = r6.b
            yw2 r1 = r6.j
            ra0 r2 = r6.n
            r1.getClass()
            ww2 r1 = r1.c()
            r0.c = r1
            ty6 r1 = r6.k
            java.util.Map r1 = r1.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            r4.getClass()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r3 = r3.getValue()
            ar0 r4 = defpackage.gh5.a(r4)
            java.lang.Object r5 = r0.e
            qo2 r5 = (defpackage.qo2) r5
            qo2 r3 = r5.F(r4, r3)
            r0.e = r3
            goto L27
        L4f:
            boolean r1 = r2.getReadEnabled()
            ra0 r6 = r6.o
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L63
            if (r1 == 0) goto L63
            ma0 r6 = defpackage.ma0.o
            r0.l(r6)
            goto L82
        L63:
            if (r6 == 0) goto L79
            if (r1 != 0) goto L79
            boolean r6 = r2.getWriteEnabled()
            if (r6 == 0) goto L73
            ma0 r6 = defpackage.ma0.n
            r0.l(r6)
            goto L82
        L73:
            ma0 r6 = defpackage.g03.f
            r0.l(r6)
            goto L82
        L79:
            if (r6 != 0) goto L82
            if (r1 != 0) goto L82
            ma0 r6 = defpackage.g03.g
            r0.l(r6)
        L82:
            pa r6 = new pa
            r6.<init>(r0)
            return r6
    }

    public final defpackage.ta0 f(defpackage.le5 r3) {
            r2 = this;
            r0 = 0
            db2 r2 = r2.c()     // Catch: java.io.IOException -> L41
            gk1 r3 = r3.A     // Catch: java.io.IOException -> L41
            boolean r1 = r3.B     // Catch: java.io.IOException -> L41
            if (r1 != 0) goto L39
            ek1 r3 = r3.A     // Catch: java.io.IOException -> L41
            java.util.ArrayList r3 = r3.c     // Catch: java.io.IOException -> L41
            r1 = 0
            java.lang.Object r3 = r3.get(r1)     // Catch: java.io.IOException -> L41
            lt4 r3 = (defpackage.lt4) r3     // Catch: java.io.IOException -> L41
            in6 r2 = r2.N(r3)     // Catch: java.io.IOException -> L41
            fe5 r2 = defpackage.hi2.u(r2)     // Catch: java.io.IOException -> L41
            ta0 r3 = new ta0     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            r2.close()     // Catch: java.lang.Throwable -> L28
            r2 = r0
            goto L35
        L28:
            r2 = move-exception
            goto L35
        L2a:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r2 = move-exception
            defpackage.mb3.q(r3, r2)     // Catch: java.io.IOException -> L41
        L33:
            r2 = r3
            r3 = r0
        L35:
            if (r2 != 0) goto L38
            return r3
        L38:
            throw r2     // Catch: java.io.IOException -> L41
        L39:
            java.lang.String r2 = "snapshot is closed"
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.io.IOException -> L41
            r3.<init>(r2)     // Catch: java.io.IOException -> L41
            throw r3     // Catch: java.io.IOException -> L41
        L41:
            return r0
    }

    public final defpackage.xa2 g(defpackage.le5 r4) {
            r3 = this;
            gk1 r0 = r4.A
            boolean r1 = r0.B
            if (r1 != 0) goto L23
            ek1 r0 = r0.A
            java.util.ArrayList r0 = r0.c
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            lt4 r0 = (defpackage.lt4) r0
            db2 r1 = r3.c()
            fo4 r2 = r3.b
            java.lang.String r2 = r2.i
            if (r2 != 0) goto L1d
            java.lang.String r2 = r3.a
        L1d:
            xa2 r3 = new xa2
            r3.<init>(r0, r1, r2, r4)
            return r3
        L23:
            java.lang.String r3 = "snapshot is closed"
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }

    public final defpackage.le5 h(defpackage.le5 r4, defpackage.pa r5, defpackage.wl5 r6, defpackage.ta0 r7) {
            r3 = this;
            fo4 r0 = r3.b
            ra0 r0 = r0.n
            boolean r0 = r0.getWriteEnabled()
            r1 = 0
            if (r0 == 0) goto L152
            boolean r0 = r3.e
            if (r0 == 0) goto L2f
            ma0 r5 = r5.h()
            boolean r5 = r5.b
            if (r5 != 0) goto L152
            ma0 r5 = r6.e()
            boolean r5 = r5.b
            if (r5 != 0) goto L152
            yw2 r5 = r6.Y
            java.lang.String r0 = "Vary"
            java.lang.String r5 = r5.a(r0)
            java.lang.String r0 = "*"
            boolean r5 = defpackage.nb3.k(r5, r0)
            if (r5 != 0) goto L152
        L2f:
            if (r4 == 0) goto L4d
            gk1 r4 = r4.A
            lk1 r5 = r4.L
            monitor-enter(r5)
            r4.close()     // Catch: java.lang.Throwable -> L4a
            ek1 r4 = r4.A     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> L4a
            bk1 r4 = r5.h(r4)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r5)
            if (r4 == 0) goto L7d
            s35 r5 = new s35
            r5.<init>(r4)
            goto L7e
        L4a:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L4d:
            ex6 r4 = r3.d
            java.lang.Object r4 = r4.getValue()
            me5 r4 = (defpackage.me5) r4
            if (r4 == 0) goto L7d
            fo4 r5 = r3.b
            java.lang.String r5 = r5.i
            if (r5 != 0) goto L5f
            java.lang.String r5 = r3.a
        L5f:
            lk1 r4 = r4.b
            da0 r0 = defpackage.da0.R
            da0 r5 = defpackage.xd5.o(r5)
            java.lang.String r0 = "SHA-256"
            da0 r5 = r5.c(r0)
            java.lang.String r5 = r5.e()
            bk1 r4 = r4.h(r5)
            if (r4 == 0) goto L7d
            s35 r5 = new s35
            r5.<init>(r4)
            goto L7e
        L7d:
            r5 = r1
        L7e:
            if (r5 != 0) goto L82
            goto L157
        L82:
            r4 = 0
            int r0 = r6.R     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r2 = 304(0x130, float:4.26E-43)
            if (r0 != r2) goto Ld8
            if (r7 == 0) goto Ld8
            ul5 r0 = r6.h()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            yw2 r7 = r7.f     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            yw2 r2 = r6.Y     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            yw2 r7 = defpackage.ge7.u(r7, r2)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ww2 r7 = r7.c()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r0.f = r7     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            wl5 r7 = r0.a()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            db2 r3 = r3.c()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.lang.Object r0 = r5.A     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            bk1 r0 = (defpackage.bk1) r0     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            lt4 r0 = r0.i(r4)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ui6 r3 = r3.J(r0)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ee5 r3 = defpackage.hi2.t(r3)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ta0 r0 = new ta0     // Catch: java.lang.Throwable -> Lc3
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lc3
            r0.a(r3)     // Catch: java.lang.Throwable -> Lc3
            r3.close()     // Catch: java.lang.Throwable -> Lc1
            goto Lcd
        Lc1:
            r1 = move-exception
            goto Lcd
        Lc3:
            r7 = move-exception
            r1 = r7
            r3.close()     // Catch: java.lang.Throwable -> Lc9
            goto Lcd
        Lc9:
            r3 = move-exception
            defpackage.mb3.q(r1, r3)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
        Lcd:
            if (r1 != 0) goto Ld1
            goto L13a
        Ld1:
            throw r1     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
        Ld2:
            r3 = move-exception
            goto L14e
        Ld5:
            r3 = move-exception
            goto L144
        Ld8:
            db2 r7 = r3.c()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.lang.Object r0 = r5.A     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            bk1 r0 = (defpackage.bk1) r0     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            lt4 r0 = r0.i(r4)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ui6 r7 = r7.J(r0)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ee5 r7 = defpackage.hi2.t(r7)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ta0 r0 = new ta0     // Catch: java.lang.Throwable -> Lfb
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Lfb
            r0.a(r7)     // Catch: java.lang.Throwable -> Lfb
            r7.close()     // Catch: java.lang.Throwable -> Lf9
            r7 = r1
            goto L105
        Lf9:
            r7 = move-exception
            goto L105
        Lfb:
            r0 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L100
            goto L104
        L100:
            r7 = move-exception
            defpackage.mb3.q(r0, r7)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
        L104:
            r7 = r0
        L105:
            if (r7 != 0) goto L143
            db2 r3 = r3.c()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            java.lang.Object r7 = r5.A     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            bk1 r7 = (defpackage.bk1) r7     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            r0 = 1
            lt4 r7 = r7.i(r0)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ui6 r3 = r3.J(r7)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            ee5 r3 = defpackage.hi2.t(r3)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            yl5 r7 = r6.Z     // Catch: java.lang.Throwable -> L12e
            r7.getClass()     // Catch: java.lang.Throwable -> L12e
            z80 r7 = r7.n()     // Catch: java.lang.Throwable -> L12e
            r7.C(r3)     // Catch: java.lang.Throwable -> L12e
            r3.close()     // Catch: java.lang.Throwable -> L12c
            goto L138
        L12c:
            r1 = move-exception
            goto L138
        L12e:
            r7 = move-exception
            r1 = r7
            r3.close()     // Catch: java.lang.Throwable -> L134
            goto L138
        L134:
            r3 = move-exception
            defpackage.mb3.q(r1, r3)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
        L138:
            if (r1 != 0) goto L142
        L13a:
            le5 r3 = r5.q()     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
            defpackage.k.a(r6)
            return r3
        L142:
            throw r1     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
        L143:
            throw r7     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> Ld5
        L144:
            android.graphics.Bitmap$Config[] r7 = defpackage.k.a     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r5 = r5.A     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> L14d
            bk1 r5 = (defpackage.bk1) r5     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> L14d
            r5.e(r4)     // Catch: java.lang.Throwable -> Ld2 java.lang.Exception -> L14d
        L14d:
            throw r3     // Catch: java.lang.Throwable -> Ld2
        L14e:
            defpackage.k.a(r6)
            throw r3
        L152:
            if (r4 == 0) goto L157
            defpackage.k.a(r4)
        L157:
            return r1
    }
}
