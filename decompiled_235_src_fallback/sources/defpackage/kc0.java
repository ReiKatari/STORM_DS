package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kc0  reason: default package */
/* loaded from: classes.dex */
public final class kc0 {
    public java.util.Map A;
    public defpackage.ap6 B;
    public defpackage.ap6 C;
    public defpackage.ap6 D;
    public final defpackage.w61 a;
    public final defpackage.t57 b;
    public final defpackage.ks6 c;
    public final defpackage.kf0 d;
    public final defpackage.gt2 e;
    public final defpackage.rv6 f;
    public final defpackage.sc0 g;
    public final defpackage.sk0 h;
    public final defpackage.s9 i;
    public final defpackage.e65 j;
    public final defpackage.oi0 k;
    public final defpackage.nd0 l;
    public final defpackage.yx6 m;
    public final defpackage.qf0 n;
    public final defpackage.xb0 o;
    public final defpackage.jr6 p;
    public final java.lang.Object q;
    public boolean r;
    public defpackage.hf s;
    public defpackage.ii0 t;
    public defpackage.df0 u;
    public defpackage.g67 v;
    public defpackage.ap6 w;
    public final defpackage.tu0 x;
    public defpackage.pq7 y;
    public defpackage.yk0 z;

    public kc0(defpackage.w61 r1, defpackage.t57 r2, defpackage.ks6 r3, defpackage.kf0 r4, defpackage.gt2 r5, defpackage.rv6 r6, defpackage.sc0 r7, defpackage.sk0 r8, defpackage.s9 r9, defpackage.e65 r10, defpackage.oi0 r11, defpackage.nd0 r12, defpackage.yx6 r13, defpackage.qf0 r14, defpackage.xb0 r15, defpackage.jr6 r16, defpackage.wy0 r17) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r7.getClass()
            r8.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r17.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            r0.n = r14
            r0.o = r15
            r2 = r16
            r0.p = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.q = r2
            r2 = 1
            r0.r = r2
            xe0 r3 = defpackage.xe0.z
            r0.s = r3
            gi0 r3 = new gi0
            java.lang.String r4 = r4.a
            r3.<init>(r4)
            r0.t = r3
            tu0 r3 = new tu0
            r3.<init>()
            r0.x = r3
            hc0 r3 = new hc0
            r4 = 0
            r5 = 0
            r3.<init>(r0, r5, r4)
            r4 = 3
            ap6 r3 = defpackage.hv.L(r1, r5, r5, r3, r4)
            r0.C = r3
            hc0 r3 = new hc0
            r3.<init>(r0, r5, r2)
            ap6 r1 = defpackage.hv.L(r1, r5, r5, r3, r4)
            r0.D = r1
            return
    }

    public static final void a(defpackage.kc0 r3, defpackage.ii0 r4) {
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = " ("
            r1.append(r2)
            kf0 r2 = r3.d
            java.lang.String r2 = r2.a
            java.lang.String r2 = defpackage.xf0.b(r2)
            r1.append(r2)
            java.lang.String r2 = ") camera status changed: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.Object r0 = r3.q
            monitor-enter(r0)
            boolean r1 = r3.e()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L34
            monitor-exit(r0)
            return
        L34:
            boolean r1 = r4 instanceof defpackage.ei0     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3d
            r3.t = r4     // Catch: java.lang.Throwable -> L3b
            goto L58
        L3b:
            r3 = move-exception
            goto L5d
        L3d:
            boolean r1 = r4 instanceof defpackage.gi0     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L44
            r3.t = r4     // Catch: java.lang.Throwable -> L3b
            goto L58
        L44:
            boolean r4 = r4 instanceof defpackage.fi0     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L58
            yx6 r4 = r3.m     // Catch: java.lang.Throwable -> L3b
            r4.getClass()     // Catch: java.lang.Throwable -> L3b
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L3b
            g67 r4 = new g67     // Catch: java.lang.Throwable -> L3b
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            r3.v = r4     // Catch: java.lang.Throwable -> L3b
        L58:
            r3.g()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            return
        L5d:
            monitor-exit(r0)
            throw r3
    }

    public static final void b(defpackage.kc0 r5) {
            boolean r0 = r5.e()
            java.lang.String r1 = "Ignoring stop(): "
            java.lang.String r2 = "CXCP"
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " is already closed"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.w(r2, r5)
            return
        L1f:
            hf r0 = r5.s
            xe0 r3 = defpackage.xe0.A
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L54
            hf r0 = r5.s
            xe0 r4 = defpackage.xe0.z
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L34
            goto L54
        L34:
            pq7 r0 = r5.y
            yk0 r1 = r5.z
            r4 = 0
            r5.y = r4
            r5.z = r4
            r5.s = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Stopping "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
            r5.d(r1, r0)
            return
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " already stopping or stopped"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.w(r2, r5)
            return
    }

    public final java.lang.Object c(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ic0
            if (r0 == 0) goto L13
            r0 = r6
            ic0 r0 = (defpackage.ic0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ic0 r0 = new ic0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L28
            defpackage.oi2.Y(r6)
            goto La1
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.oi2.Y(r6)
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r4 = "#awaitClosed"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r6, r2)
            java.lang.Object r6 = r5.q
            monitor-enter(r6)
            hf r2 = r5.s     // Catch: java.lang.Throwable -> L6f
            xe0 r4 = defpackage.xe0.u     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "#awaitClosed: Controller is already closed."
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.d(r0, r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return r5
        L6f:
            r5 = move-exception
            goto La4
        L71:
            hf r2 = r5.s     // Catch: java.lang.Throwable -> L6f
            xe0 r4 = defpackage.xe0.v     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L95
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = "#awaitClosed: Controller isn't closing!"
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return r5
        L95:
            monitor-exit(r6)
            tu0 r5 = r5.x
            r0.Y = r3
            java.lang.Object r5 = r5.q(r0)
            if (r5 != r1) goto La1
            return r1
        La1:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        La4:
            monitor-exit(r6)
            throw r5
    }

    public final void d(defpackage.yk0 r4, defpackage.pq7 r5) {
            r3 = this;
            m5 r0 = new m5
            r1 = 6
            r2 = 0
            r0.<init>(r4, r5, r2, r1)
            r4 = 3
            w61 r5 = r3.a
            ap6 r4 = defpackage.hv.L(r5, r2, r2, r0, r4)
            hf r5 = r3.s
            xe0 r0 = defpackage.xe0.v
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L21
            fc0 r5 = new fc0
            r0 = 0
            r5.<init>(r3, r0)
            r4.a0(r5)
        L21:
            return
    }

    public final boolean e() {
            r2 = this;
            hf r0 = r2.s
            xe0 r1 = defpackage.xe0.v
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            hf r2 = r2.s
            xe0 r0 = defpackage.xe0.u
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public final void f() {
            r23 = this;
            r0 = r23
            boolean r1 = r0.e()
            java.lang.String r2 = "Ignoring start(): "
            java.lang.String r3 = "CXCP"
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " is already closed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.i(r3, r0)
            return
        L21:
            hf r1 = r0.s
            xe0 r4 = defpackage.xe0.y
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " is already started"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            return
        L40:
            r1 = 0
            r0.u = r1
            kf0 r2 = r0.d
            java.lang.String r5 = r2.a
            xf0 r6 = new xf0
            r6.<init>(r5)
            java.util.Set r6 = defpackage.ii2.R(r6)
            xf0 r7 = new xf0
            r7.<init>(r5)
            java.util.LinkedHashSet r6 = defpackage.ii2.E(r6, r7)
            java.util.List r6 = defpackage.gt0.k1(r6)
            fc0 r7 = new fc0
            r8 = 1
            r7.<init>(r0, r8)
            e65 r8 = r0.j
            r8.getClass()
            r5.getClass()
            pq7 r9 = new pq7
            w61 r10 = r8.d
            gt2 r12 = r0.e
            r9.<init>(r5, r12, r10)
            pa r8 = r8.e
            al5 r10 = new al5
            r10.<init>(r9, r6, r12, r7)
            java.lang.Object r6 = r8.Y
            v80 r6 = (defpackage.v80) r6
            java.lang.Object r6 = r6.c(r10)
            boolean r6 = r6 instanceof defpackage.fm0
            if (r6 == 0) goto Lad
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Camera open request failed for "
            r6.<init>(r7)
            java.lang.String r5 = defpackage.xf0.b(r5)
            r6.append(r5)
            r5 = 33
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.e(r3, r5)
            kt2 r5 = new kt2
            r6 = 12
            r7 = 0
            r5.<init>(r6, r7)
            r12.a(r5)
            r9 = r1
        Lad:
            if (r9 != 0) goto Lc6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to start "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ": Open request submission failed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r3, r0)
            return
        Lc6:
            pq7 r5 = r0.y
            java.lang.String r6 = "Check failed."
            if (r5 != 0) goto L12e
            yk0 r5 = r0.z
            if (r5 != 0) goto L12a
            r0.y = r9
            yk0 r11 = new yk0
            mf0 r2 = r2.o
            t57 r5 = r0.b
            w61 r6 = r0.a
            sk0 r13 = r0.h
            s9 r14 = r0.i
            oi0 r15 = r0.k
            yx6 r7 = r0.m
            r18 = 0
            jr6 r8 = r0.p
            ks6 r9 = r0.c
            r17 = r2
            r21 = r5
            r22 = r6
            r16 = r7
            r19 = r8
            r20 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.z = r11
            java.util.Map r2 = r0.A
            if (r2 == 0) goto L100
            r11.k(r2)
        L100:
            r0.s = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Started "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
            ap6 r2 = r0.B
            if (r2 == 0) goto L11a
            r2.h(r1)
        L11a:
            hc0 r2 = new hc0
            r3 = 2
            r2.<init>(r0, r1, r3)
            r3 = 3
            w61 r4 = r0.a
            ap6 r1 = defpackage.hv.L(r4, r1, r1, r2, r3)
            r0.B = r1
            return
        L12a:
            defpackage.i.m(r6)
            return
        L12e:
            defpackage.i.m(r6)
            return
    }

    public final void g() {
            r13 = this;
            yx6 r0 = r13.m
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            hf r2 = r13.s
            df0 r3 = r13.u
            ii0 r4 = r13.t
            g67 r5 = r13.v
            r4.getClass()
            boolean r4 = r4 instanceof defpackage.ei0
            r6 = 3
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L25
            if (r3 != 0) goto L1e
            goto L23
        L1e:
            int r4 = r3.a
            if (r4 != r6) goto L23
            goto L25
        L23:
            r4 = r8
            goto L26
        L25:
            r4 = r7
        L26:
            if (r5 != 0) goto L29
            goto L37
        L29:
            long r9 = r5.a
            long r9 = r0 - r9
            r11 = 200000000(0xbebc200, double:9.8813129E-316)
            int r5 = defpackage.sq1.a(r9, r11)
            if (r5 > 0) goto L37
            r7 = r8
        L37:
            xe0 r5 = defpackage.xe0.w
            boolean r5 = r2.equals(r5)
            java.lang.String r8 = "CXCP"
            if (r5 == 0) goto L58
            if (r4 != 0) goto L76
            if (r7 == 0) goto L46
            goto L76
        L46:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r3 > r2) goto L56
            r3 = 33
            if (r2 >= r3) goto L56
            java.lang.String r0 = "Quirk for multi-resume activated: Kicking off restart."
            android.util.Log.d(r8, r0)
            goto L76
        L56:
            r10 = r13
            goto L9d
        L58:
            xe0 r5 = defpackage.xe0.x
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L56
            if (r4 == 0) goto L56
            if (r3 != 0) goto L65
            goto L6c
        L65:
            int r2 = r3.a
            r4 = 9
            if (r2 != r4) goto L6c
            goto L56
        L6c:
            if (r3 != 0) goto L6f
            goto L76
        L6f:
            int r2 = r3.a
            r3 = 8
            if (r2 != r3) goto L76
            goto L56
        L76:
            kf0 r0 = r13.d
            mf0 r0 = r0.o
            boolean r0 = r0.f
            if (r0 == 0) goto L82
            r0 = 700(0x2bc, double:3.46E-321)
        L80:
            r8 = r0
            goto L85
        L82:
            r0 = 0
            goto L80
        L85:
            ap6 r0 = r13.w
            r11 = 0
            if (r0 == 0) goto L8d
            r0.h(r11)
        L8d:
            jc0 r7 = new jc0
            r12 = 0
            r10 = r13
            r7.<init>(r8, r10, r11, r12)
            w61 r13 = r10.a
            ap6 r13 = defpackage.hv.L(r13, r11, r11, r7, r6)
            r10.w = r13
            return
        L9d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            java.lang.String r2 = ": Not restarting. Controller state = "
            r13.append(r2)
            hf r2 = r10.s
            r13.append(r2)
            java.lang.String r2 = ", last camera error = "
            r13.append(r2)
            df0 r2 = r10.u
            r13.append(r2)
            java.lang.String r2 = ", camera availability = "
            r13.append(r2)
            ii0 r2 = r10.t
            r13.append(r2)
            java.lang.String r2 = ", last camera priorities changed = "
            r13.append(r2)
            g67 r2 = r10.v
            r13.append(r2)
            java.lang.String r2 = ", current timestamp = "
            r13.append(r2)
            java.lang.String r0 = defpackage.g67.a(r0)
            r13.append(r0)
            r0 = 46
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.d(r8, r13)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Camera2CameraController("
            r0.<init>(r1)
            qf0 r2 = r2.n
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
