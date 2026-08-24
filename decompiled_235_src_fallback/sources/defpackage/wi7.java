package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi7  reason: default package */
/* loaded from: classes.dex */
public final class wi7 {
    public final defpackage.ej7 a;
    public final defpackage.tz6 b;
    public final java.lang.Object c;
    public defpackage.tu0 d;
    public final defpackage.uw e;
    public final defpackage.pu f;
    public boolean g;
    public final java.util.LinkedHashMap h;
    public final java.util.LinkedHashMap i;
    public final java.util.LinkedHashSet j;
    public final java.util.LinkedHashSet k;
    public defpackage.bl5 l;
    public defpackage.oa m;
    public defpackage.qb n;
    public defpackage.xz o;
    public final defpackage.si7 p;
    public final defpackage.uw q;

    public wi7(defpackage.ej7 r1, defpackage.tz6 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.c = r1
            r1 = 0
            uw r2 = defpackage.g04.t(r1)
            r0.e = r2
            pu r2 = new pu
            r2.<init>()
            r0.f = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.h = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.i = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.j = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.k = r2
            si7 r2 = new si7
            r2.<init>(r0)
            r0.p = r2
            uw r1 = defpackage.g04.t(r1)
            r0.q = r1
            return
    }

    public final java.lang.Object a(defpackage.s41 r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "Update RepeatingRequest: "
            boolean r3 = r0 instanceof defpackage.ui7
            if (r3 == 0) goto L19
            r3 = r0
            ui7 r3 = (defpackage.ui7) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Z = r4
            goto L1e
        L19:
            ui7 r3 = new ui7
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.X
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L3a
            if (r5 != r7) goto L34
            dh5 r3 = r3.R
            defpackage.oi2.Y(r0)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L54
        L31:
            r0 = move-exception
            goto L140
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L3a:
            defpackage.oi2.Y(r0)
            dh5 r5 = new dh5
            r5.<init>()
            ej7 r0 = r1.a     // Catch: java.util.concurrent.CancellationException -> L13e
            sf0 r0 = r0.a()     // Catch: java.util.concurrent.CancellationException -> L13e
            r3.R = r5     // Catch: java.util.concurrent.CancellationException -> L13e
            r3.Z = r7     // Catch: java.util.concurrent.CancellationException -> L13e
            java.lang.Object r0 = r0.h(r3)     // Catch: java.util.concurrent.CancellationException -> L13e
            if (r0 != r4) goto L53
            return r4
        L53:
            r3 = r5
        L54:
            r4 = r0
            java.lang.AutoCloseable r4 = (java.lang.AutoCloseable) r4     // Catch: java.util.concurrent.CancellationException -> L31
            r0 = r4
            vf0 r0 = (defpackage.vf0) r0     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r5 = r1.c     // Catch: java.lang.Throwable -> Lcf
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lcf
            java.util.LinkedHashSet r7 = r1.j     // Catch: java.lang.Throwable -> L135
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L135
            if (r7 == 0) goto L67
            r9 = r8
            goto Lae
        L67:
            bl5 r14 = r1.l     // Catch: java.lang.Throwable -> L135
            java.util.LinkedHashSet r7 = r1.j     // Catch: java.lang.Throwable -> L135
            java.util.List r10 = defpackage.gt0.k1(r7)     // Catch: java.lang.Throwable -> L135
            tz6 r7 = r1.b     // Catch: java.lang.Throwable -> L135
            bl5 r9 = r1.l     // Catch: java.lang.Throwable -> L135
            java.util.Map r7 = r7.b(r9)     // Catch: java.lang.Throwable -> L135
            java.util.LinkedHashMap r9 = r1.h     // Catch: java.lang.Throwable -> L135
            java.util.Map r9 = defpackage.c14.s0(r9)     // Catch: java.lang.Throwable -> L135
            java.util.LinkedHashMap r11 = defpackage.c14.o0(r7, r9)     // Catch: java.lang.Throwable -> L135
            java.util.LinkedHashMap r7 = r1.i     // Catch: java.lang.Throwable -> L135
            java.util.LinkedHashMap r12 = defpackage.c14.t0(r7)     // Catch: java.lang.Throwable -> L135
            k54 r7 = defpackage.uy6.b     // Catch: java.lang.Throwable -> L135
            uw r9 = r1.e     // Catch: java.lang.Throwable -> L135
            r9.getClass()     // Catch: java.lang.Throwable -> L135
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.uw.b     // Catch: java.lang.Throwable -> L135
            int r9 = r13.incrementAndGet(r9)     // Catch: java.lang.Throwable -> L135
            java.lang.Integer r13 = new java.lang.Integer     // Catch: java.lang.Throwable -> L135
            r13.<init>(r9)     // Catch: java.lang.Throwable -> L135
            r12.put(r7, r13)     // Catch: java.lang.Throwable -> L135
            java.util.LinkedHashSet r7 = r1.k     // Catch: java.lang.Throwable -> L135
            java.util.ArrayList r13 = defpackage.gt0.m1(r7)     // Catch: java.lang.Throwable -> L135
            si7 r7 = r1.p     // Catch: java.lang.Throwable -> L135
            r13.add(r7)     // Catch: java.lang.Throwable -> L135
            kk5 r9 = new kk5     // Catch: java.lang.Throwable -> L135
            r15 = 32
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L135
        Lae:
            tu0 r7 = r1.d     // Catch: java.lang.Throwable -> L135
            r1.g = r6     // Catch: java.lang.Throwable -> L135
            r1.d = r8     // Catch: java.lang.Throwable -> L135
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lcf
            if (r9 != 0) goto Ld2
            jb4 r2 = r0.A     // Catch: java.lang.Throwable -> Lcf
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> Lcf
            if (r2 != 0) goto Lc5
            gt2 r0 = r0.B     // Catch: java.lang.Throwable -> Lcf
            r0.d(r8)     // Catch: java.lang.Throwable -> Lcf
            goto Lcc
        Lc5:
            java.lang.String r2 = "Cannot call stopRepeating on "
            java.lang.String r5 = " after close."
            defpackage.e41.g(r0, r5, r2)     // Catch: java.lang.Throwable -> Lcf
        Lcc:
            r3.A = r7     // Catch: java.lang.Throwable -> Lcf
            goto L131
        Lcf:
            r0 = move-exception
            r2 = r0
            goto L138
        Ld2:
            if (r7 == 0) goto Lf8
            java.lang.Object r5 = r1.c     // Catch: java.lang.Throwable -> Lcf
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lcf
            pu r10 = r1.f     // Catch: java.lang.Throwable -> Lf5
            ti7 r11 = new ti7     // Catch: java.lang.Throwable -> Lf5
            uw r12 = r1.e     // Catch: java.lang.Throwable -> Lf5
            int r12 = r12.a     // Catch: java.lang.Throwable -> Lf5
            r11.<init>(r12, r7)     // Catch: java.lang.Throwable -> Lf5
            r10.addLast(r11)     // Catch: java.lang.Throwable -> Lf5
            uw r7 = r1.q     // Catch: java.lang.Throwable -> Lf5
            r7.getClass()     // Catch: java.lang.Throwable -> Lf5
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r10 = defpackage.uw.b     // Catch: java.lang.Throwable -> Lf5
            int r7 = r10.incrementAndGet(r7)     // Catch: java.lang.Throwable -> Lf5
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lcf
            defpackage.vy7.P(r7)     // Catch: java.lang.Throwable -> Lcf
            goto Lf8
        Lf5:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lcf
            throw r0     // Catch: java.lang.Throwable -> Lcf
        Lf8:
            java.lang.String r5 = "CXCP"
            boolean r5 = defpackage.kj2.F(r5)     // Catch: java.lang.Throwable -> Lcf
            if (r5 == 0) goto L111
            java.lang.String r5 = "CXCP"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf
            r7.<init>(r2)     // Catch: java.lang.Throwable -> Lcf
            r7.append(r9)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> Lcf
            android.util.Log.d(r5, r2)     // Catch: java.lang.Throwable -> Lcf
        L111:
            r0.getClass()     // Catch: java.lang.Throwable -> Lcf
            r9.getClass()     // Catch: java.lang.Throwable -> Lcf
            jb4 r2 = r0.A     // Catch: java.lang.Throwable -> Lcf
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> Lcf
            if (r2 != 0) goto L125
            gt2 r2 = r0.B     // Catch: java.lang.Throwable -> Lcf
            r2.d(r9)     // Catch: java.lang.Throwable -> Lcf
            goto L12c
        L125:
            java.lang.String r2 = "Cannot call startRepeating on "
            java.lang.String r5 = " after close."
            defpackage.e41.g(r0, r5, r2)     // Catch: java.lang.Throwable -> Lcf
        L12c:
            java.util.Map r2 = r9.b     // Catch: java.lang.Throwable -> Lcf
            r1.b(r0, r2)     // Catch: java.lang.Throwable -> Lcf
        L131:
            defpackage.lb4.p(r4, r8)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L16e
        L135:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lcf
            throw r0     // Catch: java.lang.Throwable -> Lcf
        L138:
            throw r2     // Catch: java.lang.Throwable -> L139
        L139:
            r0 = move-exception
            defpackage.lb4.p(r4, r2)     // Catch: java.util.concurrent.CancellationException -> L31
            throw r0     // Catch: java.util.concurrent.CancellationException -> L31
        L13e:
            r0 = move-exception
            r3 = r5
        L140:
            java.lang.String r2 = "CXCP"
            boolean r2 = defpackage.kj2.F(r2)
            if (r2 == 0) goto L15b
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot acquire session at "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r2, r4, r0)
        L15b:
            java.lang.Object r2 = r1.c
            monitor-enter(r2)
            boolean r0 = r1.g     // Catch: java.lang.Throwable -> L16b
            if (r0 == 0) goto L16d
            r1.g = r6     // Catch: java.lang.Throwable -> L16b
            tu0 r0 = r1.d     // Catch: java.lang.Throwable -> L16b
            r3.A = r0     // Catch: java.lang.Throwable -> L16b
            r1.d = r8     // Catch: java.lang.Throwable -> L16b
            goto L16d
        L16b:
            r0 = move-exception
            goto L17c
        L16d:
            monitor-exit(r2)
        L16e:
            java.lang.Object r0 = r3.A
            tu0 r0 = (defpackage.tu0) r0
            if (r0 == 0) goto L179
            jg7 r1 = defpackage.jg7.a
            r0.b0(r1)
        L179:
            jg7 r0 = defpackage.jg7.a
            return r0
        L17c:
            monitor-exit(r2)
            throw r0
    }

    public final void b(defpackage.vf0 r11, java.util.Map r12) {
            r10 = this;
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            r0.getClass()
            r1 = 0
            if (r12 == 0) goto Ld
            java.lang.Object r0 = r12.get(r0)
            goto Le
        Ld:
            r0 = r1
        Le:
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L15
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            java.util.List r2 = defpackage.oa.b
            oa r0 = defpackage.nc1.N(r0)
            r3 = r0
            goto L25
        L24:
            r3 = r1
        L25:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r0.getClass()
            if (r12 == 0) goto L31
            java.lang.Object r0 = r12.get(r0)
            goto L32
        L31:
            r0 = r1
        L32:
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L39
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r0 == 0) goto L5c
            int r0 = r0.intValue()
            java.util.List r2 = defpackage.qb.b
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r2.next()
            r5 = r4
            qb r5 = (defpackage.qb) r5
            int r5 = r5.a
            if (r5 != r0) goto L46
            goto L59
        L58:
            r4 = r1
        L59:
            qb r4 = (defpackage.qb) r4
            goto L5d
        L5c:
            r4 = r1
        L5d:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            r0.getClass()
            if (r12 == 0) goto L69
            java.lang.Object r12 = r12.get(r0)
            goto L6a
        L69:
            r12 = r1
        L6a:
            boolean r0 = r12 instanceof java.lang.Integer
            if (r0 == 0) goto L71
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L72
        L71:
            r12 = r1
        L72:
            if (r12 == 0) goto L92
            int r12 = r12.intValue()
            java.util.List r0 = defpackage.xz.b
            java.util.Iterator r0 = r0.iterator()
        L7e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r0.next()
            r5 = r2
            xz r5 = (defpackage.xz) r5
            int r5 = r5.a
            if (r5 != r12) goto L7e
            r1 = r2
        L90:
            xz r1 = (defpackage.xz) r1
        L92:
            r5 = r1
            r12 = 0
            r0 = 1
            if (r3 == 0) goto La1
            oa r1 = r10.m
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto La1
            r1 = r0
            goto La2
        La1:
            r1 = r12
        La2:
            if (r4 == 0) goto Lae
            qb r2 = r10.n
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lae
            r2 = r0
            goto Laf
        Lae:
            r2 = r12
        Laf:
            if (r5 == 0) goto Lba
            xz r6 = r10.o
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto Lba
            r12 = r0
        Lba:
            if (r1 != 0) goto Lc0
            if (r2 != 0) goto Lc0
            if (r12 == 0) goto L117
        Lc0:
            java.lang.String r0 = "CXCP"
            boolean r6 = defpackage.kj2.F(r0)
            if (r6 == 0) goto L102
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "UseCaseCameraState: Updating 3A modes: AE("
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r7 = ", changed="
            r6.append(r7)
            r6.append(r1)
            java.lang.String r1 = "), AF("
            r6.append(r1)
            r6.append(r4)
            r6.append(r7)
            r6.append(r2)
            java.lang.String r1 = "), AWB("
            r6.append(r1)
            r6.append(r5)
            r6.append(r7)
            r6.append(r12)
            r12 = 41
            r6.append(r12)
            java.lang.String r12 = r6.toString()
            android.util.Log.d(r0, r12)
        L102:
            r8 = 0
            r9 = 56
            r6 = 0
            r7 = 0
            r2 = r11
            defpackage.ye0.e(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L10f
            r10.m = r3
        L10f:
            if (r4 == 0) goto L113
            r10.n = r4
        L113:
            if (r5 == 0) goto L117
            r10.o = r5
        L117:
            return
    }

    public final java.lang.Object c(java.util.LinkedHashMap r8, java.util.Map r9, java.util.Set r10, defpackage.bl5 r11, java.util.Set r12, defpackage.s41 r13) {
            r7 = this;
            java.lang.String r0 = "UseCaseCameraState#updateState: parameters = "
            boolean r1 = r13 instanceof defpackage.vi7
            if (r1 == 0) goto L15
            r1 = r13
            vi7 r1 = (defpackage.vi7) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            vi7 r1 = new vi7
            r1.<init>(r7, r13)
        L1a:
            java.lang.Object r13 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2c
            dh5 r7 = r1.R
            defpackage.oi2.Y(r13)
            goto Ld6
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L33:
            defpackage.oi2.Y(r13)
            dh5 r13 = new dh5
            r13.<init>()
            java.lang.Object r3 = r7.c
            monitor-enter(r3)
            java.lang.String r5 = "CXCP"
            boolean r5 = defpackage.kj2.F(r5)     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L72
            java.lang.String r5 = "CXCP"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L70
            r6.append(r8)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = ", internalParameters = "
            r6.append(r0)     // Catch: java.lang.Throwable -> L70
            r6.append(r9)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = ", streams = "
            r6.append(r0)     // Catch: java.lang.Throwable -> L70
            r6.append(r10)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = ", template = "
            r6.append(r0)     // Catch: java.lang.Throwable -> L70
            r6.append(r11)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L70
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r7 = move-exception
            goto Ld9
        L72:
            if (r8 == 0) goto L7e
            java.util.LinkedHashMap r0 = r7.h     // Catch: java.lang.Throwable -> L70
            r0.clear()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashMap r0 = r7.h     // Catch: java.lang.Throwable -> L70
            r0.putAll(r8)     // Catch: java.lang.Throwable -> L70
        L7e:
            if (r9 == 0) goto L8a
            java.util.LinkedHashMap r8 = r7.i     // Catch: java.lang.Throwable -> L70
            r8.clear()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashMap r8 = r7.i     // Catch: java.lang.Throwable -> L70
            r8.putAll(r9)     // Catch: java.lang.Throwable -> L70
        L8a:
            if (r10 == 0) goto L98
            java.util.LinkedHashSet r8 = r7.j     // Catch: java.lang.Throwable -> L70
            r8.clear()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashSet r8 = r7.j     // Catch: java.lang.Throwable -> L70
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Throwable -> L70
            r8.addAll(r10)     // Catch: java.lang.Throwable -> L70
        L98:
            if (r11 == 0) goto L9c
            r7.l = r11     // Catch: java.lang.Throwable -> L70
        L9c:
            if (r12 == 0) goto Laa
            java.util.LinkedHashSet r8 = r7.k     // Catch: java.lang.Throwable -> L70
            r8.clear()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashSet r8 = r7.k     // Catch: java.lang.Throwable -> L70
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L70
            r8.addAll(r12)     // Catch: java.lang.Throwable -> L70
        Laa:
            tu0 r8 = r7.d     // Catch: java.lang.Throwable -> L70
            if (r8 != 0) goto Lb5
            tu0 r8 = new tu0     // Catch: java.lang.Throwable -> L70
            r8.<init>()     // Catch: java.lang.Throwable -> L70
            r7.d = r8     // Catch: java.lang.Throwable -> L70
        Lb5:
            boolean r8 = r7.g     // Catch: java.lang.Throwable -> L70
            if (r8 == 0) goto Lc0
            tu0 r7 = r7.d     // Catch: java.lang.Throwable -> L70
            r7.getClass()     // Catch: java.lang.Throwable -> L70
            monitor-exit(r3)
            return r7
        Lc0:
            r7.g = r4     // Catch: java.lang.Throwable -> L70
            tu0 r8 = r7.d     // Catch: java.lang.Throwable -> L70
            r8.getClass()     // Catch: java.lang.Throwable -> L70
            r13.A = r8     // Catch: java.lang.Throwable -> L70
            monitor-exit(r3)
            r1.R = r13
            r1.Z = r4
            java.lang.Object r7 = r7.a(r1)
            if (r7 != r2) goto Ld5
            return r2
        Ld5:
            r7 = r13
        Ld6:
            java.lang.Object r7 = r7.A
            return r7
        Ld9:
            monitor-exit(r3)
            throw r7
    }
}
