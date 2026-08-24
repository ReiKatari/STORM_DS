package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: af5  reason: default package */
/* loaded from: classes.dex */
public final class af5 {
    public static final java.util.List x = null;
    public final defpackage.zp3 a;
    public final java.util.Random b;
    public final long c;
    public defpackage.us7 d;
    public final long e;
    public final long f;
    public final java.lang.String g;
    public defpackage.je5 h;
    public defpackage.hk1 i;
    public defpackage.ws7 j;
    public defpackage.xs7 k;
    public final defpackage.pz6 l;
    public java.lang.String m;
    public defpackage.bt n;
    public final java.util.ArrayDeque o;
    public final java.util.ArrayDeque p;
    public long q;
    public boolean r;
    public int s;
    public java.lang.String t;
    public boolean u;
    public int v;
    public boolean w;

    static {
            k55 r0 = defpackage.k55.HTTP_1_1
            java.util.List r0 = defpackage.hf.b0(r0)
            defpackage.af5.x = r0
            return
    }

    public af5(defpackage.qz6 r1, defpackage.pa r2, defpackage.zp3 r3, java.util.Random r4, long r5, long r7, long r9) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r3
            r0.b = r4
            r0.c = r5
            r3 = 0
            r0.d = r3
            r0.e = r7
            r0.f = r9
            pz6 r1 = r1.d()
            r0.l = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.o = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.p = r1
            r1 = -1
            r0.s = r1
            java.lang.Object r1 = r2.L
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "GET"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L4a
            da0 r1 = defpackage.da0.R
            r1 = 16
            byte[] r1 = new byte[r1]
            r4.nextBytes(r1)
            da0 r1 = defpackage.xd5.t(r1)
            java.lang.String r1 = r1.a()
            r0.g = r1
            return
        L4a:
            java.lang.String r0 = "Request must be GET: "
            java.lang.String r0 = defpackage.i61.m(r0, r1)
            defpackage.i.f(r0)
            throw r3
    }

    public static void c(defpackage.af5 r9, java.lang.Exception r10, int r11) {
            r10 = r11 & 4
            r11 = 1
            if (r10 == 0) goto L7
            r10 = 0
            goto L8
        L7:
            r10 = r11
        L8:
            r9.getClass()
            dh5 r1 = new dh5
            r1.<init>()
            monitor-enter(r9)
            boolean r0 = r9.u     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L17
            monitor-exit(r9)
            return
        L17:
            r9.u = r11     // Catch: java.lang.Throwable -> L49
            bt r11 = r9.n     // Catch: java.lang.Throwable -> L49
            xs7 r0 = r9.k     // Catch: java.lang.Throwable -> L49
            r1.A = r0     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r9.k = r2     // Catch: java.lang.Throwable -> L49
            if (r10 != 0) goto L4c
            if (r0 == 0) goto L4c
            pz6 r3 = r9.l     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r9.m     // Catch: java.lang.Throwable -> L49
            r0.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = " writer close"
            r0.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L49
            er2 r7 = new er2     // Catch: java.lang.Throwable -> L49
            r0 = 16
            r7.<init>(r1, r0)     // Catch: java.lang.Throwable -> L49
            r8 = 2
            r5 = 0
            defpackage.pz6.b(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r0 = move-exception
            r10 = r0
            goto L8f
        L4c:
            pz6 r0 = r9.l     // Catch: java.lang.Throwable -> L49
            r0.f()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r9)
            zp3 r9 = r9.a     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r9.h     // Catch: java.lang.Throwable -> L7c
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch: java.lang.Throwable -> L7c
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r9 = r9.i     // Catch: java.lang.Throwable -> L7c
            tu0 r9 = (defpackage.tu0) r9     // Catch: java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.lang.Throwable -> L7c
            int r3 = r0.length     // Catch: java.lang.Throwable -> L7c
            if (r3 != 0) goto L67
            goto L68
        L67:
            r2 = r0
        L68:
            r9.b0(r2)     // Catch: java.lang.Throwable -> L7c
            if (r11 == 0) goto L70
            r11.cancel()
        L70:
            if (r10 == 0) goto L7b
            java.lang.Object r9 = r1.A
            xs7 r9 = (defpackage.xs7) r9
            if (r9 == 0) goto L7b
            defpackage.yy7.b(r9)
        L7b:
            return
        L7c:
            r0 = move-exception
            r9 = r0
            if (r11 == 0) goto L83
            r11.cancel()
        L83:
            if (r10 == 0) goto L8e
            java.lang.Object r10 = r1.A
            xs7 r10 = (defpackage.xs7) r10
            if (r10 == 0) goto L8e
            defpackage.yy7.b(r10)
        L8e:
            throw r9
        L8f:
            monitor-exit(r9)
            throw r10
    }

    public final defpackage.rm6 a(defpackage.wl5 r7) {
            r6 = this;
            yw2 r0 = r7.Y
            int r1 = r7.R
            r2 = 101(0x65, float:1.42E-43)
            r3 = 39
            if (r1 != r2) goto La2
            java.lang.String r1 = "Connection"
            java.lang.String r1 = r0.a(r1)
            r2 = 0
            if (r1 != 0) goto L14
            r1 = r2
        L14:
            java.lang.String r4 = "Upgrade"
            boolean r5 = r4.equalsIgnoreCase(r1)
            if (r5 == 0) goto L96
            java.lang.String r1 = r0.a(r4)
            if (r1 != 0) goto L23
            r1 = r2
        L23:
            java.lang.String r4 = "websocket"
            boolean r4 = r4.equalsIgnoreCase(r1)
            if (r4 == 0) goto L8a
            java.lang.String r1 = "Sec-WebSocket-Accept"
            java.lang.String r0 = r0.a(r1)
            if (r0 != 0) goto L34
            goto L35
        L34:
            r2 = r0
        L35:
            da0 r0 = defpackage.da0.R
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = r6.g
            r0.append(r6)
            java.lang.String r6 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            da0 r6 = defpackage.xd5.o(r6)
            java.lang.String r0 = "SHA-1"
            da0 r6 = r6.c(r0)
            java.lang.String r6 = r6.a()
            boolean r0 = defpackage.nb3.k(r6, r2)
            if (r0 == 0) goto L6b
            rm6 r6 = r7.d0
            if (r6 == 0) goto L63
            return r6
        L63:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Web Socket socket missing: bad interceptor?"
            r6.<init>(r7)
            throw r6
        L6b:
            java.net.ProtocolException r7 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected 'Sec-WebSocket-Accept' header value '"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "' but was '"
            r0.append(r6)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L8a:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Expected 'Upgrade' header value 'websocket' but was '"
            java.lang.String r7 = defpackage.i61.k(r3, r7, r1)
            r6.<init>(r7)
            throw r6
        L96:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Expected 'Connection' header value 'Upgrade' but was '"
            java.lang.String r7 = defpackage.i61.k(r3, r7, r1)
            r6.<init>(r7)
            throw r6
        La2:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected HTTP 101 response but was '"
            r0.<init>(r2)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r7 = r7.L
            java.lang.String r7 = defpackage.lb1.q(r0, r7, r3)
            r6.<init>(r7)
            throw r6
    }

    public final void b(int r10, java.lang.String r11) {
            r9 = this;
            long r0 = r9.f
            java.lang.String r2 = "reason.size() > 123: "
            monitor-enter(r9)
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 0
            if (r10 < r3) goto L36
            r3 = 5000(0x1388, float:7.006E-42)
            if (r10 < r3) goto Lf
            goto L36
        Lf:
            r3 = 1004(0x3ec, float:1.407E-42)
            if (r3 > r10) goto L18
            r3 = 1007(0x3ef, float:1.411E-42)
            if (r10 >= r3) goto L18
            goto L20
        L18:
            r3 = 1015(0x3f7, float:1.422E-42)
            if (r3 > r10) goto L34
            r3 = 3000(0xbb8, float:4.204E-42)
            if (r10 >= r3) goto L34
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "Code "
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L67
            r3.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = " is reserved and may not be used."
            r3.append(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L67
            goto L44
        L34:
            r3 = r4
            goto L44
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "Code must be in range [1000,5000): "
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L67
            r3.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L67
        L44:
            if (r3 != 0) goto L86
            if (r11 == 0) goto L69
            da0 r3 = defpackage.da0.R     // Catch: java.lang.Throwable -> L67
            da0 r4 = defpackage.xd5.o(r11)     // Catch: java.lang.Throwable -> L67
            byte[] r3 = r4.A     // Catch: java.lang.Throwable -> L67
            int r3 = r3.length     // Catch: java.lang.Throwable -> L67
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L67
            r7 = 123(0x7b, double:6.1E-322)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L59
            goto L69
        L59:
            java.lang.String r10 = r2.concat(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L67
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L67
            throw r11     // Catch: java.lang.Throwable -> L67
        L67:
            r10 = move-exception
            goto L90
        L69:
            boolean r11 = r9.u     // Catch: java.lang.Throwable -> L67
            if (r11 != 0) goto L84
            boolean r11 = r9.r     // Catch: java.lang.Throwable -> L67
            if (r11 == 0) goto L72
            goto L84
        L72:
            r11 = 1
            r9.r = r11     // Catch: java.lang.Throwable -> L67
            java.util.ArrayDeque r11 = r9.p     // Catch: java.lang.Throwable -> L67
            ye5 r2 = new ye5     // Catch: java.lang.Throwable -> L67
            r2.<init>(r10, r0, r4)     // Catch: java.lang.Throwable -> L67
            r11.add(r2)     // Catch: java.lang.Throwable -> L67
            r9.e()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r9)
            return
        L84:
            monitor-exit(r9)
            return
        L86:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L67
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L67
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L67
            throw r10     // Catch: java.lang.Throwable -> L67
        L90:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
            throw r10
    }

    public final void d() {
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = r10.t     // Catch: java.lang.Throwable -> L3d
            ws7 r1 = r10.j     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            r10.j = r2     // Catch: java.lang.Throwable -> L3d
            boolean r3 = r10.r     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L44
            java.util.ArrayDeque r3 = r10.p     // Catch: java.lang.Throwable -> L3d
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L44
            xs7 r3 = r10.k     // Catch: java.lang.Throwable -> L3d
            if (r3 == 0) goto L3f
            r10.k = r2     // Catch: java.lang.Throwable -> L3d
            pz6 r4 = r10.l     // Catch: java.lang.Throwable -> L3d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r2.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r10.m     // Catch: java.lang.Throwable -> L3d
            r2.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = " writer close"
            r2.append(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L3d
            er2 r8 = new er2     // Catch: java.lang.Throwable -> L3d
            r2 = 15
            r8.<init>(r3, r2)     // Catch: java.lang.Throwable -> L3d
            r9 = 2
            r6 = 0
            defpackage.pz6.b(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L65
        L3f:
            pz6 r2 = r10.l     // Catch: java.lang.Throwable -> L3d
            r2.f()     // Catch: java.lang.Throwable -> L3d
        L44:
            boolean r2 = r10.u     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L53
            xs7 r2 = r10.k     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L53
            int r2 = r10.s     // Catch: java.lang.Throwable -> L3d
            r3 = -1
            if (r2 == r3) goto L53
            r2 = 1
            goto L54
        L53:
            r2 = 0
        L54:
            monitor-exit(r10)
            if (r2 == 0) goto L5f
            zp3 r2 = r10.a
            r0.getClass()
            r2.d(r10, r0)
        L5f:
            if (r1 == 0) goto L64
            defpackage.yy7.b(r1)
        L64:
            return
        L65:
            monitor-exit(r10)
            throw r0
    }

    public final void e() {
            r3 = this;
            java.util.TimeZone r0 = defpackage.az7.a
            hk1 r0 = r3.i
            if (r0 == 0) goto Ld
            pz6 r3 = r3.l
            r1 = 0
            r3.c(r0, r1)
        Ld:
            return
    }

    public final void f(java.lang.String r8) {
            r7 = this;
            da0 r0 = defpackage.da0.R
            da0 r8 = defpackage.xd5.o(r8)
            monitor-enter(r7)
            boolean r0 = r7.u     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L3c
            boolean r0 = r7.r     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L10
            goto L3c
        L10:
            long r0 = r7.q     // Catch: java.lang.Throwable -> L26
            byte[] r2 = r8.A     // Catch: java.lang.Throwable -> L26
            int r3 = r2.length     // Catch: java.lang.Throwable -> L26
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L26
            long r3 = r3 + r0
            r5 = 16777216(0x1000000, double:8.289046E-317)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L28
            r8 = 1001(0x3e9, float:1.403E-42)
            r0 = 0
            r7.b(r8, r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r7)
            return
        L26:
            r8 = move-exception
            goto L3e
        L28:
            int r2 = r2.length     // Catch: java.lang.Throwable -> L26
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L26
            long r0 = r0 + r2
            r7.q = r0     // Catch: java.lang.Throwable -> L26
            java.util.ArrayDeque r0 = r7.p     // Catch: java.lang.Throwable -> L26
            ze5 r1 = new ze5     // Catch: java.lang.Throwable -> L26
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L26
            r0.add(r1)     // Catch: java.lang.Throwable -> L26
            r7.e()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r7)
            return
        L3c:
            monitor-exit(r7)
            return
        L3e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L26
            throw r8
    }

    public final boolean g() {
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            boolean r0 = r1.u     // Catch: java.lang.Throwable -> L33
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r17)
            return r2
        La:
            xs7 r3 = r1.k     // Catch: java.lang.Throwable -> L33
            java.util.ArrayDeque r0 = r1.o     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L33
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L71
            java.util.ArrayDeque r6 = r1.p     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r6.poll()     // Catch: java.lang.Throwable -> L33
            boolean r7 = r6 instanceof defpackage.ye5     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6a
            int r7 = r1.s     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = r1.t     // Catch: java.lang.Throwable -> L33
            r9 = -1
            if (r7 == r9) goto L3c
            xs7 r7 = r1.k     // Catch: java.lang.Throwable -> L33
            r1.k = r5     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L36
            ws7 r9 = r1.j     // Catch: java.lang.Throwable -> L33
            if (r9 != 0) goto L36
            r2 = r4
            goto L36
        L33:
            r0 = move-exception
            goto L13d
        L36:
            pz6 r9 = r1.l     // Catch: java.lang.Throwable -> L33
            r9.f()     // Catch: java.lang.Throwable -> L33
            goto L74
        L3c:
            r7 = r6
            ye5 r7 = (defpackage.ye5) r7     // Catch: java.lang.Throwable -> L33
            long r9 = r7.c     // Catch: java.lang.Throwable -> L33
            pz6 r11 = r1.l     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r7.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r12 = r1.m     // Catch: java.lang.Throwable -> L33
            r7.append(r12)     // Catch: java.lang.Throwable -> L33
            java.lang.String r12 = " cancel"
            r7.append(r12)     // Catch: java.lang.Throwable -> L33
            java.lang.String r12 = r7.toString()     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L33
            long r13 = r7.toNanos(r9)     // Catch: java.lang.Throwable -> L33
            er2 r15 = new er2     // Catch: java.lang.Throwable -> L33
            r7 = 17
            r15.<init>(r1, r7)     // Catch: java.lang.Throwable -> L33
            r16 = 4
            defpackage.pz6.b(r11, r12, r13, r15, r16)     // Catch: java.lang.Throwable -> L33
            r7 = r5
            goto L74
        L6a:
            if (r6 != 0) goto L6e
            monitor-exit(r17)
            return r2
        L6e:
            r7 = r5
        L6f:
            r8 = r7
            goto L74
        L71:
            r6 = r5
            r7 = r6
            goto L6f
        L74:
            monitor-exit(r17)
            if (r0 == 0) goto L86
            r3.getClass()     // Catch: java.lang.Throwable -> L83
            da0 r0 = (defpackage.da0) r0     // Catch: java.lang.Throwable -> L83
            r1 = 10
            r3.e(r1, r0)     // Catch: java.lang.Throwable -> L83
            goto L11d
        L83:
            r0 = move-exception
            goto L137
        L86:
            boolean r0 = r6 instanceof defpackage.ze5     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto La9
            r3.getClass()     // Catch: java.lang.Throwable -> L83
            r0 = r6
            ze5 r0 = (defpackage.ze5) r0     // Catch: java.lang.Throwable -> L83
            da0 r0 = r0.a     // Catch: java.lang.Throwable -> L83
            r3.h(r0)     // Catch: java.lang.Throwable -> L83
            monitor-enter(r17)     // Catch: java.lang.Throwable -> L83
            long r2 = r1.q     // Catch: java.lang.Throwable -> La6
            ze5 r6 = (defpackage.ze5) r6     // Catch: java.lang.Throwable -> La6
            da0 r0 = r6.a     // Catch: java.lang.Throwable -> La6
            byte[] r0 = r0.A     // Catch: java.lang.Throwable -> La6
            int r0 = r0.length     // Catch: java.lang.Throwable -> La6
            long r5 = (long) r0     // Catch: java.lang.Throwable -> La6
            long r2 = r2 - r5
            r1.q = r2     // Catch: java.lang.Throwable -> La6
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L83
            goto L11d
        La6:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        La9:
            boolean r0 = r6 instanceof defpackage.ye5     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L131
            r3.getClass()     // Catch: java.lang.Throwable -> L83
            r0 = r6
            ye5 r0 = (defpackage.ye5) r0     // Catch: java.lang.Throwable -> L83
            int r0 = r0.a     // Catch: java.lang.Throwable -> L83
            ye5 r6 = (defpackage.ye5) r6     // Catch: java.lang.Throwable -> L83
            da0 r6 = r6.b     // Catch: java.lang.Throwable -> L83
            da0 r9 = defpackage.da0.R     // Catch: java.lang.Throwable -> L83
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r9) goto Le9
            r9 = 5000(0x1388, float:7.006E-42)
            if (r0 < r9) goto Lc4
            goto Le9
        Lc4:
            r9 = 1004(0x3ec, float:1.407E-42)
            if (r9 > r0) goto Lcd
            r9 = 1007(0x3ef, float:1.411E-42)
            if (r0 >= r9) goto Lcd
            goto Ld5
        Lcd:
            r9 = 1015(0x3f7, float:1.422E-42)
            if (r9 > r0) goto Lf7
            r9 = 3000(0xbb8, float:4.204E-42)
            if (r0 >= r9) goto Lf7
        Ld5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            java.lang.String r9 = "Code "
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L83
            r5.append(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r9 = " is reserved and may not be used."
            r5.append(r9)     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L83
            goto Lf7
        Le9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            java.lang.String r9 = "Code must be in range [1000,5000): "
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L83
            r5.append(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L83
        Lf7:
            if (r5 != 0) goto L127
            k80 r5 = new k80     // Catch: java.lang.Throwable -> L83
            r5.<init>()     // Catch: java.lang.Throwable -> L83
            r5.r0(r0)     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L106
            r5.k0(r6)     // Catch: java.lang.Throwable -> L83
        L106:
            long r9 = r5.B     // Catch: java.lang.Throwable -> L83
            da0 r0 = r5.l(r9)     // Catch: java.lang.Throwable -> L83
            r5 = 8
            r3.e(r5, r0)     // Catch: java.lang.Throwable -> L123
            r3.d0 = r4     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L11d
            zp3 r0 = r1.a     // Catch: java.lang.Throwable -> L83
            r8.getClass()     // Catch: java.lang.Throwable -> L83
            r0.d(r1, r8)     // Catch: java.lang.Throwable -> L83
        L11d:
            if (r7 == 0) goto L122
            defpackage.yy7.b(r7)
        L122:
            return r4
        L123:
            r0 = move-exception
            r3.d0 = r4     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L127:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L83
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L131:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L83
            r0.<init>()     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L137:
            if (r7 == 0) goto L13c
            defpackage.yy7.b(r7)
        L13c:
            throw r0
        L13d:
            monitor-exit(r17)
            throw r0
    }
}
