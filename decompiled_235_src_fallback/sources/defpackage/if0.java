package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if0  reason: default package */
/* loaded from: classes.dex */
public final class if0 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public java.lang.Object e;
    public final java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;
    public final java.lang.Object j;
    public java.lang.Object k;

    public if0(defpackage.ex6 r8, android.content.Context r9, defpackage.ux r10, defpackage.u63 r11, defpackage.mh0 r12, defpackage.rr6 r13, defpackage.ij0 r14) {
            r7 = this;
            r0 = 0
            r7.a = r0
            r11.getClass()
            r7.<init>()
            r7.b = r8
            r7.d = r12
            r7.e = r13
            r7.f = r14
            ze0 r12 = new ze0
            java.lang.Object r13 = r8.getValue()
            tg0 r13 = (defpackage.tg0) r13
            java.lang.Object r8 = r8.getValue()
            tg0 r8 = (defpackage.tg0) r8
            cf0 r8 = r8.b()
            r12.<init>(r13, r8)
            r7.g = r12
            hf0 r1 = new hf0
            r6 = 0
            r4 = r7
            r2 = r9
            r3 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            ex6 r7 = new ex6
            r7.<init>(r1)
            r4.c = r7
            du1 r8 = defpackage.du1.A
            r4.i = r8
            java.lang.Object r8 = new java.lang.Object
            r8.<init>()
            r4.j = r8
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
            r8.<init>(r0)
            r4.k = r8
            java.lang.Object r7 = r7.getValue()
            eb1 r7 = (defpackage.eb1) r7
            cf0 r7 = r7.a()
            java.util.ArrayList r7 = defpackage.cf0.a(r7)
            if (r7 == 0) goto L7a
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = defpackage.ht0.v0(r7, r9)
            r8.<init>(r9)
            int r9 = r7.size()
        L6a:
            if (r0 >= r9) goto L7c
            java.lang.Object r10 = r7.get(r0)
            int r0 = r0 + 1
            xf0 r10 = (defpackage.xf0) r10
            java.lang.String r10 = r10.a
            r8.add(r10)
            goto L6a
        L7a:
            yt1 r8 = defpackage.yt1.A
        L7c:
            bx4 r7 = new bx4
            java.lang.Object r9 = r4.b
            ex6 r9 = (defpackage.ex6) r9
            java.lang.Object r9 = r9.getValue()
            tg0 r9 = (defpackage.tg0) r9
            cf0 r9 = r9.b()
            xb0 r9 = r9.d()
            ed0 r9 = r9.b
            be5 r9 = r9.k
            java.util.concurrent.Executor r10 = r3.a
            r10.getClass()
            n61 r10 = defpackage.f04.F(r10)
            o41 r10 = defpackage.g04.i(r10)
            r7.<init>(r9, r10, r8, r2)
            r4.h = r7
            r4.h(r8)
            return
    }

    public if0(defpackage.sm3 r3) {
            r2 = this;
            r0 = 1
            r2.a = r0
            r2.<init>()
            r2.b = r3
            ag4 r0 = new ag4
            r0.<init>()
            r1 = -1
            r0.R = r1
            r2.c = r0
            y53 r0 = new y53
            r0.<init>(r3)
            r2.d = r0
            r2.e = r0
            vy6 r3 = r0.P0
            r2.f = r3
            r2.g = r3
            ua4 r3 = new ua4
            r0 = 16
            a74[] r0 = new defpackage.a74[r0]
            r3.<init>(r0)
            r2.j = r3
            return
    }

    public static final void a(defpackage.if0 r1, defpackage.z64 r2, defpackage.eg4 r3) {
            z64 r2 = r2.X
        L2:
            if (r2 == 0) goto L2e
            java.lang.Object r0 = r1.c
            ag4 r0 = (defpackage.ag4) r0
            if (r2 != r0) goto L21
            java.lang.Object r2 = r1.b
            sm3 r2 = (defpackage.sm3) r2
            sm3 r2 = r2.v()
            if (r2 == 0) goto L1b
            if0 r2 = r2.B0
            java.lang.Object r2 = r2.d
            y53 r2 = (defpackage.y53) r2
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r3.o0 = r2
            r1.e = r3
            return
        L21:
            int r0 = r2.L
            r0 = r0 & 2
            if (r0 == 0) goto L28
            goto L2e
        L28:
            r2.Q0(r3)
            z64 r2 = r2.X
            goto L2
        L2e:
            return
    }

    public static defpackage.z64 c(defpackage.y64 r2, defpackage.z64 r3) {
            boolean r0 = r2 instanceof defpackage.e74
            if (r0 == 0) goto L11
            e74 r2 = (defpackage.e74) r2
            z64 r2 = r2.e()
            int r0 = defpackage.fg4.f(r2)
            r2.L = r0
            goto L24
        L11:
            z10 r0 = new z10
            r0.<init>()
            int r1 = defpackage.fg4.d(r2)
            r0.L = r1
            r0.k0 = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r2 = r0
        L24:
            boolean r0 = r2.j0
            if (r0 == 0) goto L2d
            java.lang.String r0 = "A ModifierNodeElement cannot return an already attached node from create() "
            defpackage.p53.c(r0)
        L2d:
            r0 = 1
            r2.e0 = r0
            z64 r0 = r3.Y
            if (r0 == 0) goto L38
            r0.X = r2
            r2.Y = r0
        L38:
            r3.Y = r2
            r2.X = r3
            return r2
    }

    public static defpackage.z64 d(defpackage.z64 r3) {
            boolean r0 = r3.j0
            if (r0 == 0) goto L18
            y94 r1 = defpackage.fg4.a
            if (r0 != 0) goto Ld
            java.lang.String r0 = "autoInvalidateRemovedNode called on unattached node"
            defpackage.p53.c(r0)
        Ld:
            r0 = -1
            r1 = 2
            defpackage.fg4.a(r3, r0, r1)
            r3.O0()
            r3.I0()
        L18:
            z64 r0 = r3.Y
            z64 r1 = r3.X
            r2 = 0
            if (r0 == 0) goto L23
            r0.X = r1
            r3.Y = r2
        L23:
            if (r1 == 0) goto L29
            r1.Y = r0
            r3.X = r2
        L29:
            r1.getClass()
            return r1
    }

    public static void l(defpackage.y64 r2, defpackage.y64 r3, defpackage.z64 r4) {
            boolean r2 = r2 instanceof defpackage.e74
            r0 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r3 instanceof defpackage.e74
            if (r2 == 0) goto L1c
            e74 r3 = (defpackage.e74) r3
            r4.getClass()
            r3.g(r4)
            boolean r2 = r4.j0
            if (r2 == 0) goto L19
            defpackage.fg4.c(r4)
            return
        L19:
            r4.f0 = r0
            return
        L1c:
            boolean r2 = r4 instanceof defpackage.z10
            if (r2 == 0) goto L58
            r2 = r4
            z10 r2 = (defpackage.z10) r2
            boolean r1 = r2.j0
            if (r1 == 0) goto L3d
            if (r1 != 0) goto L2e
            java.lang.String r1 = "unInitializeModifier called on unattached node"
            defpackage.p53.c(r1)
        L2e:
            int r1 = r2.L
            r1 = r1 & 8
            if (r1 == 0) goto L3d
            zp4 r1 = defpackage.nc1.g0(r2)
            te r1 = (defpackage.te) r1
            r1.y()
        L3d:
            r2.k0 = r3
            int r3 = defpackage.fg4.d(r3)
            r2.L = r3
            boolean r3 = r2.j0
            if (r3 == 0) goto L4d
            r3 = 0
            r2.R0(r3)
        L4d:
            boolean r2 = r4.j0
            if (r2 == 0) goto L55
            defpackage.fg4.c(r4)
            return
        L55:
            r4.f0 = r0
            return
        L58:
            java.lang.String r2 = "Unknown Modifier.Node type"
            defpackage.p53.c(r2)
            return
    }

    public java.util.LinkedHashSet b(java.util.List r11) {
            r10 = this;
            java.lang.Object r0 = r10.c
            ex6 r0 = (defpackage.ex6) r0
            java.lang.Object r1 = r0.getValue()
            eb1 r1 = (defpackage.eb1) r1
            java.lang.Object r2 = r10.d
            mh0 r2 = (defpackage.mh0) r2
            java.util.List r11 = defpackage.gt0.k1(r11)
            java.lang.Object r10 = r10.e
            rr6 r10 = (defpackage.rr6) r10
            java.lang.String r3 = "CXCP"
            r1.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.IllegalStateException -> L3e
            r4.<init>()     // Catch: java.lang.IllegalStateException -> L3e
            cf0 r5 = r1.a()     // Catch: java.lang.IllegalStateException -> L3e
            if (r2 != 0) goto L28
            goto La4
        L28:
            java.lang.Integer r6 = r2.b()     // Catch: java.lang.IllegalStateException -> L31
            java.lang.String r5 = defpackage.f04.y(r5, r6)     // Catch: java.lang.IllegalStateException -> L31
            goto L42
        L31:
            r5 = move-exception
            boolean r6 = defpackage.kj2.F(r3)     // Catch: java.lang.IllegalStateException -> L3e
            if (r6 == 0) goto L41
            java.lang.String r6 = "Unable to get Metadata for cameraID 0 and/or 1"
            android.util.Log.d(r3, r6, r5)     // Catch: java.lang.IllegalStateException -> L3e
            goto L41
        L3e:
            r10 = move-exception
            goto L105
        L41:
            r5 = 0
        L42:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.IllegalStateException -> L3e
            r6.<init>()     // Catch: java.lang.IllegalStateException -> L3e
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.IllegalStateException -> L3e
        L4b:
            boolean r7 = r11.hasNext()     // Catch: java.lang.IllegalStateException -> L3e
            if (r7 == 0) goto L80
            java.lang.Object r7 = r11.next()     // Catch: java.lang.IllegalStateException -> L3e
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.IllegalStateException -> L3e
            boolean r8 = defpackage.nb3.k(r7, r5)     // Catch: java.lang.IllegalStateException -> L3e
            if (r8 == 0) goto L5e
            goto L4b
        L5e:
            eb1 r8 = r1.b     // Catch: java.lang.IllegalStateException -> L3e
            gr1 r9 = new gr1     // Catch: java.lang.IllegalStateException -> L3e
            defpackage.xf0.a(r7)     // Catch: java.lang.IllegalStateException -> L3e
            r9.<init>(r7)     // Catch: java.lang.IllegalStateException -> L3e
            gb1 r7 = new gb1     // Catch: java.lang.IllegalStateException -> L3e
            r7.<init>(r8, r9, r10)     // Catch: java.lang.IllegalStateException -> L3e
            yg1 r7 = r7.z     // Catch: java.lang.IllegalStateException -> L3e
            java.lang.Object r7 = r7.get()     // Catch: java.lang.IllegalStateException -> L3e
            eg0 r7 = (defpackage.eg0) r7     // Catch: java.lang.IllegalStateException -> L3e
            cg0 r7 = r7.q()     // Catch: java.lang.IllegalStateException -> L3e
            r7.getClass()     // Catch: java.lang.IllegalStateException -> L3e
            r6.add(r7)     // Catch: java.lang.IllegalStateException -> L3e
            goto L4b
        L80:
            java.util.ArrayList r10 = r2.a(r6)     // Catch: java.lang.IllegalStateException -> L3e
            int r11 = r10.size()     // Catch: java.lang.IllegalStateException -> L3e
            r1 = 0
        L89:
            if (r1 >= r11) goto La3
            java.lang.Object r2 = r10.get(r1)     // Catch: java.lang.IllegalStateException -> L3e
            int r1 = r1 + 1
            zf0 r2 = (defpackage.zf0) r2     // Catch: java.lang.IllegalStateException -> L3e
            r2.getClass()     // Catch: java.lang.IllegalStateException -> L3e
            cg0 r2 = (defpackage.cg0) r2     // Catch: java.lang.IllegalStateException -> L3e
            java.lang.String r2 = r2.d()     // Catch: java.lang.IllegalStateException -> L3e
            r2.getClass()     // Catch: java.lang.IllegalStateException -> L3e
            r4.add(r2)     // Catch: java.lang.IllegalStateException -> L3e
            goto L89
        La3:
            r11 = r4
        La4:
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            java.lang.Object r0 = r0.getValue()
            eb1 r0 = (defpackage.eb1) r0
            cf0 r0 = r0.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        Lb9:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L101
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "0"
            boolean r4 = defpackage.nb3.k(r2, r4)
            if (r4 != 0) goto Lfd
            java.lang.String r4 = "1"
            boolean r4 = defpackage.nb3.k(r2, r4)
            if (r4 == 0) goto Ld6
            goto Lfd
        Ld6:
            boolean r4 = defpackage.l.B(r0, r2)
            if (r4 == 0) goto Le0
            r1.add(r2)
            goto Lb9
        Le0:
            boolean r4 = defpackage.kj2.F(r3)
            if (r4 == 0) goto Lb9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Camera "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.d(r3, r2)
            goto Lb9
        Lfd:
            r1.add(r2)
            goto Lb9
        L101:
            r10.<init>(r1)
            return r10
        L105:
            boolean r11 = defpackage.kj2.G()
            if (r11 == 0) goto L110
            java.lang.String r11 = "Error while accessing info about cameras."
            android.util.Log.e(r3, r11, r10)
        L110:
            i53 r11 = new i53
            r11.<init>(r10)
            throw r11
    }

    public java.util.Set e() {
            r2 = this;
            java.lang.Object r0 = r2.j
            monitor-enter(r0)
            java.lang.Object r1 = r2.k     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            du1 r2 = defpackage.du1.A     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r2
        L11:
            r2 = move-exception
            goto L20
        L13:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r2.i     // Catch: java.lang.Throwable -> L11
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L11
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r2
    }

    public defpackage.eg0 f(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.k
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.get()
            if (r0 != 0) goto L33
            java.lang.Object r0 = r2.c
            ex6 r0 = (defpackage.ex6) r0
            java.lang.Object r0 = r0.getValue()
            eb1 r0 = (defpackage.eb1) r0
            eb1 r0 = r0.b
            gr1 r1 = new gr1
            defpackage.xf0.a(r3)
            r1.<init>(r3)
            java.lang.Object r2 = r2.e
            rr6 r2 = (defpackage.rr6) r2
            gb1 r3 = new gb1
            r3.<init>(r0, r1, r2)
            yg1 r2 = r3.z
            java.lang.Object r2 = r2.get()
            eg0 r2 = (defpackage.eg0) r2
            return r2
        L33:
            qi0 r2 = new qi0
            java.lang.String r3 = "CameraFactory has been shut down."
            r2.<init>(r3)
            throw r2
    }

    public boolean g(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.g
            z64 r0 = (defpackage.z64) r0
            int r0 = r0.R
            r0 = r0 & r1
            if (r0 == 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public void h(java.util.List r5) {
            r4 = this;
            java.lang.String r0 = "Updated available camera list: "
            java.lang.Object r1 = r4.k
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r1 = r1.get()
            if (r1 == 0) goto Ld
            return
        Ld:
            java.util.LinkedHashSet r5 = r4.b(r5)
            java.lang.Object r1 = r4.j
            monitor-enter(r1)
            java.lang.Object r2 = r4.k     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2     // Catch: java.lang.Throwable -> L52
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L20
            monitor-exit(r1)
            return
        L20:
            java.lang.Object r2 = r4.i     // Catch: java.lang.Throwable -> L52
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L52
            boolean r2 = defpackage.nb3.k(r2, r5)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L2c
            monitor-exit(r1)
            return
        L2c:
            java.lang.String r2 = "CXCP"
            boolean r2 = defpackage.kj2.F(r2)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L54
            java.lang.String r2 = "CXCP"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r4.i     // Catch: java.lang.Throwable -> L52
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L52
            r3.append(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = " -> "
            r3.append(r0)     // Catch: java.lang.Throwable -> L52
            r3.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L52
            android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r4 = move-exception
            goto L58
        L54:
            r4.i = r5     // Catch: java.lang.Throwable -> L52
            monitor-exit(r1)
            return
        L58:
            monitor-exit(r1)
            throw r4
    }

    public void i() {
            r2 = this;
            java.lang.Object r2 = r2.g
            z64 r2 = (defpackage.z64) r2
        L4:
            if (r2 == 0) goto L2c
            r2.N0()
            boolean r0 = r2.e0
            if (r0 == 0) goto L1d
            y94 r0 = defpackage.fg4.a
            boolean r0 = r2.j0
            if (r0 != 0) goto L18
            java.lang.String r0 = "autoInvalidateInsertedNode called on unattached node"
            defpackage.p53.c(r0)
        L18:
            r0 = -1
            r1 = 1
            defpackage.fg4.a(r2, r0, r1)
        L1d:
            boolean r0 = r2.f0
            if (r0 == 0) goto L24
            defpackage.fg4.c(r2)
        L24:
            r0 = 0
            r2.e0 = r0
            r2.f0 = r0
            z64 r2 = r2.Y
            goto L4
        L2c:
            return
    }

    public void j(int r32, defpackage.ua4 r33, defpackage.ua4 r34, defpackage.z64 r35, boolean r36) {
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            java.lang.Object r6 = r0.k
            ra4 r6 = (defpackage.ra4) r6
            if (r6 != 0) goto L26
            ra4 r6 = new ra4
            r6.<init>()
            r6.f = r0
            r6.c = r4
            r6.a = r1
            r6.d = r2
            r6.e = r3
            r6.b = r5
            r0.k = r6
            goto L30
        L26:
            r6.c = r4
            r6.a = r1
            r6.d = r2
            r6.e = r3
            r6.b = r5
        L30:
            java.lang.Object r4 = r6.f
            if0 r4 = (defpackage.if0) r4
            int r2 = r2.L
            int r2 = r2 - r1
            int r3 = r3.L
            int r3 = r3 - r1
            int r1 = r2 + r3
            r5 = 1
            int r1 = r1 + r5
            r7 = 2
            int r1 = r1 / r7
            r93 r8 = new r93
            int r9 = r1 * 3
            r8.<init>(r9)
            r93 r9 = new r93
            int r10 = r1 * 4
            r9.<init>(r10)
            r10 = 0
            r9.e(r10, r2, r10, r3)
            int r1 = r1 * r7
            int r1 = r1 + r5
            int[] r11 = new int[r1]
            int[] r12 = new int[r1]
            r13 = 5
            int[] r13 = new int[r13]
        L5b:
            int r14 = r9.b
            if (r14 == 0) goto L281
            r32 = r7
            int[] r7 = r9.a
            r33 = r10
            int r10 = r14 + (-1)
            r9.b = r10
            r10 = r7[r10]
            r34 = 3
            int r15 = r14 + (-2)
            r9.b = r15
            r15 = r7[r15]
            int r5 = r14 + (-3)
            r9.b = r5
            r5 = r7[r5]
            int r14 = r14 + (-4)
            r9.b = r14
            r7 = r7[r14]
            int r14 = r5 - r7
            r36 = r1
            int r1 = r10 - r15
            r16 = r11
            r11 = 1
            if (r14 < r11) goto L27c
            if (r1 >= r11) goto L8e
            goto L27c
        L8e:
            int r17 = r14 + r1
            int r17 = r17 + 1
            r35 = r11
            int r11 = r17 / 2
            int r17 = r36 / 2
            int r18 = r17 + 1
            r16[r18] = r7
            r12[r18] = r5
            r18 = r1
            r1 = r33
        La2:
            if (r1 >= r11) goto L27c
            int r19 = r14 - r18
            int r20 = java.lang.Math.abs(r19)
            r21 = r11
            r11 = r20 & 1
            r20 = r12
            r12 = r35
            if (r11 != r12) goto Lb6
            r11 = 1
            goto Lb8
        Lb6:
            r11 = r33
        Lb8:
            int r12 = -r1
            r22 = r11
            r11 = r12
        Lbc:
            r23 = 4
            if (r11 > r1) goto L14e
            if (r11 == r12) goto Le4
            if (r11 == r1) goto Ld7
            int r24 = r11 + 1
            int r24 = r24 + r17
            r25 = r11
            r11 = r16[r24]
            int r24 = r25 + (-1)
            int r24 = r24 + r17
            r26 = r13
            r13 = r16[r24]
            if (r11 <= r13) goto Ldb
            goto Le8
        Ld7:
            r25 = r11
            r26 = r13
        Ldb:
            int r11 = r25 + (-1)
            int r11 = r11 + r17
            r11 = r16[r11]
            int r13 = r11 + 1
            goto Lef
        Le4:
            r25 = r11
            r26 = r13
        Le8:
            int r11 = r25 + 1
            int r11 = r11 + r17
            r11 = r16[r11]
            r13 = r11
        Lef:
            int r24 = r13 - r7
            int r24 = r24 + r15
            int r24 = r24 - r25
            if (r1 == 0) goto Lfa
            r27 = 1
            goto Lfc
        Lfa:
            r27 = r33
        Lfc:
            if (r13 != r11) goto L101
            r28 = 1
            goto L103
        L101:
            r28 = r33
        L103:
            r27 = r27 & r28
            int r27 = r24 - r27
            r30 = r24
            r24 = r11
            r11 = r30
        L10d:
            if (r13 >= r5) goto L11c
            if (r11 >= r10) goto L11c
            boolean r28 = r6.b(r13, r11)
            if (r28 == 0) goto L11c
            int r13 = r13 + 1
            int r11 = r11 + 1
            goto L10d
        L11c:
            int r28 = r17 + r25
            r16[r28] = r13
            if (r22 == 0) goto L144
            r28 = r11
            int r11 = r19 - r25
            r29 = r14
            int r14 = r12 + 1
            if (r11 < r14) goto L146
            int r14 = r1 + (-1)
            if (r11 > r14) goto L146
            int r11 = r17 + r11
            r11 = r20[r11]
            if (r11 > r13) goto L146
            r26[r33] = r24
            r11 = 1
            r26[r11] = r27
            r26[r32] = r13
            r26[r34] = r28
            r26[r23] = r33
            r11 = 1
            goto L1de
        L144:
            r29 = r14
        L146:
            int r11 = r25 + 2
            r13 = r26
            r14 = r29
            goto Lbc
        L14e:
            r26 = r13
            r29 = r14
            r11 = r19 & 1
            if (r11 != 0) goto L158
            r11 = 1
            goto L15a
        L158:
            r11 = r33
        L15a:
            r13 = r12
        L15b:
            if (r13 > r1) goto L26e
            if (r13 == r12) goto L17d
            if (r13 == r1) goto L172
            int r14 = r13 + 1
            int r14 = r14 + r17
            r14 = r20[r14]
            int r22 = r13 + (-1)
            int r22 = r22 + r17
            r24 = r11
            r11 = r20[r22]
            if (r14 >= r11) goto L174
            goto L17f
        L172:
            r24 = r11
        L174:
            int r11 = r13 + (-1)
            int r11 = r11 + r17
            r11 = r20[r11]
            int r14 = r11 + (-1)
            goto L186
        L17d:
            r24 = r11
        L17f:
            int r11 = r13 + 1
            int r11 = r11 + r17
            r11 = r20[r11]
            r14 = r11
        L186:
            int r22 = r5 - r14
            int r22 = r22 - r13
            int r22 = r10 - r22
            if (r1 == 0) goto L191
            r25 = 1
            goto L193
        L191:
            r25 = r33
        L193:
            if (r14 != r11) goto L198
            r27 = 1
            goto L19a
        L198:
            r27 = r33
        L19a:
            r25 = r25 & r27
            int r25 = r22 + r25
            r30 = r22
            r22 = r11
            r11 = r30
        L1a4:
            if (r14 <= r7) goto L1bd
            if (r11 <= r15) goto L1bd
            r27 = r11
            int r11 = r14 + (-1)
            r28 = r13
            int r13 = r27 + (-1)
            boolean r11 = r6.b(r11, r13)
            if (r11 == 0) goto L1c1
            int r14 = r14 + (-1)
            int r11 = r27 + (-1)
            r13 = r28
            goto L1a4
        L1bd:
            r27 = r11
            r28 = r13
        L1c1:
            int r13 = r17 + r28
            r20[r13] = r14
            if (r24 == 0) goto L268
            int r11 = r19 - r28
            if (r11 < r12) goto L268
            if (r11 > r1) goto L268
            int r11 = r17 + r11
            r11 = r16[r11]
            if (r11 < r14) goto L268
            r26[r33] = r14
            r11 = 1
            r26[r11] = r27
            r26[r32] = r22
            r26[r34] = r25
            r26[r23] = r11
        L1de:
            r1 = r26[r32]
            r12 = r26[r33]
            int r1 = r1 - r12
            r12 = r26[r34]
            r13 = r26[r11]
            int r12 = r12 - r13
            int r1 = java.lang.Math.min(r1, r12)
            if (r1 <= 0) goto L249
            r1 = r26[r33]
            r12 = r26[r11]
            r11 = r26[r34]
            int r11 = r11 - r12
            r13 = r26[r32]
            int r13 = r13 - r1
            if (r11 == r13) goto L241
            int r13 = java.lang.Math.min(r13, r11)
            r11 = r26[r23]
            if (r11 == 0) goto L204
            r14 = 1
            goto L206
        L204:
            r14 = r33
        L206:
            r17 = r26[r34]
            r18 = 1
            r19 = r26[r18]
            r35 = r1
            int r1 = r17 - r19
            r21 = r26[r32]
            r22 = r26[r33]
            r23 = r11
            int r11 = r21 - r22
            if (r1 <= r11) goto L21d
            r1 = r18
            goto L21f
        L21d:
            r1 = r33
        L21f:
            r1 = r1 | r14
            r1 = r1 ^ 1
            int r1 = r35 + r1
            if (r23 == 0) goto L229
            r11 = r18
            goto L22b
        L229:
            r11 = r33
        L22b:
            int r14 = r17 - r19
            r35 = r1
            int r1 = r21 - r22
            if (r14 <= r1) goto L236
            r1 = r18
            goto L238
        L236:
            r1 = r33
        L238:
            r1 = r1 ^ 1
            r1 = r1 | r11
            r1 = r1 ^ 1
            int r12 = r12 + r1
            r1 = r35
            goto L245
        L241:
            r35 = r1
            r18 = 1
        L245:
            r8.d(r1, r12, r13)
            goto L24b
        L249:
            r18 = r11
        L24b:
            r1 = r26[r33]
            r11 = r26[r18]
            r9.e(r7, r1, r15, r11)
            r1 = r26[r32]
            r7 = r26[r34]
            r9.e(r1, r5, r7, r10)
        L259:
            r7 = r32
            r10 = r33
            r1 = r36
            r11 = r16
            r12 = r20
            r13 = r26
            r5 = 1
            goto L5b
        L268:
            int r13 = r28 + 2
            r11 = r24
            goto L15b
        L26e:
            int r1 = r1 + 1
            r12 = r20
            r11 = r21
            r13 = r26
            r14 = r29
            r35 = 1
            goto La2
        L27c:
            r20 = r12
            r26 = r13
            goto L259
        L281:
            r32 = r7
            r33 = r10
            r34 = 3
            int r1 = r8.b
            int r5 = r1 % 3
            if (r5 != 0) goto L290
        L28d:
            r5 = r34
            goto L296
        L290:
            java.lang.String r5 = "Array size not a multiple of 3"
            defpackage.p53.c(r5)
            goto L28d
        L296:
            if (r1 <= r5) goto L29f
            int r1 = r1 - r5
            r5 = r33
            r8.f(r5, r1)
            goto L2a1
        L29f:
            r5 = r33
        L2a1:
            r8.d(r2, r3, r5)
            r1 = r5
            r2 = r1
            r3 = r2
        L2a7:
            int r7 = r8.b
            if (r1 >= r7) goto L3ac
            int[] r7 = r8.a
            r9 = r7[r1]
            int r10 = r1 + 2
            r10 = r7[r10]
            int r9 = r9 - r10
            int r11 = r1 + 1
            r7 = r7[r11]
            int r7 = r7 - r10
            int r1 = r1 + 3
        L2bb:
            if (r2 >= r9) goto L2ee
            java.lang.Object r11 = r6.c
            z64 r11 = (defpackage.z64) r11
            z64 r11 = r11.Y
            r11.getClass()
            int r12 = r11.L
            r12 = r12 & 2
            if (r12 == 0) goto L2e5
            eg4 r12 = r11.d0
            r12.getClass()
            eg4 r13 = r12.o0
            eg4 r12 = r12.n0
            r12.getClass()
            if (r13 == 0) goto L2dc
            r13.n0 = r12
        L2dc:
            r12.o0 = r13
            java.lang.Object r13 = r6.c
            z64 r13 = (defpackage.z64) r13
            a(r4, r13, r12)
        L2e5:
            z64 r11 = d(r11)
            r6.c = r11
            int r2 = r2 + 1
            goto L2bb
        L2ee:
            if (r3 >= r7) goto L370
            int r9 = r6.a
            int r9 = r9 + r3
            java.lang.Object r11 = r6.c
            z64 r11 = (defpackage.z64) r11
            java.lang.Object r12 = r6.e
            ua4 r12 = (defpackage.ua4) r12
            java.lang.Object[] r12 = r12.A
            r9 = r12[r9]
            y64 r9 = (defpackage.y64) r9
            z64 r9 = c(r9, r11)
            r6.c = r9
            boolean r11 = r6.b
            if (r11 == 0) goto L369
            z64 r9 = r9.Y
            r9.getClass()
            eg4 r9 = r9.d0
            r9.getClass()
            java.lang.Object r11 = r6.c
            z64 r11 = (defpackage.z64) r11
            jm3 r11 = defpackage.nc1.D(r11)
            if (r11 == 0) goto L33f
            mm3 r12 = new mm3
            java.lang.Object r13 = r4.b
            sm3 r13 = (defpackage.sm3) r13
            r12.<init>(r13, r11)
            java.lang.Object r11 = r6.c
            z64 r11 = (defpackage.z64) r11
            r11.Q0(r12)
            java.lang.Object r11 = r6.c
            z64 r11 = (defpackage.z64) r11
            a(r4, r11, r12)
            eg4 r11 = r9.o0
            r12.o0 = r11
            r12.n0 = r9
            r9.o0 = r12
            goto L346
        L33f:
            java.lang.Object r11 = r6.c
            z64 r11 = (defpackage.z64) r11
            r11.Q0(r9)
        L346:
            java.lang.Object r9 = r6.c
            z64 r9 = (defpackage.z64) r9
            r9.H0()
            java.lang.Object r9 = r6.c
            z64 r9 = (defpackage.z64) r9
            r9.N0()
            java.lang.Object r9 = r6.c
            z64 r9 = (defpackage.z64) r9
            y94 r11 = defpackage.fg4.a
            boolean r11 = r9.j0
            if (r11 != 0) goto L363
            java.lang.String r11 = "autoInvalidateInsertedNode called on unattached node"
            defpackage.p53.c(r11)
        L363:
            r11 = -1
            r12 = 1
            defpackage.fg4.a(r9, r11, r12)
            goto L36c
        L369:
            r12 = 1
            r9.e0 = r12
        L36c:
            int r3 = r3 + 1
            goto L2ee
        L370:
            r12 = 1
        L371:
            int r7 = r10 + (-1)
            if (r10 <= 0) goto L2a7
            java.lang.Object r9 = r6.c
            z64 r9 = (defpackage.z64) r9
            z64 r9 = r9.Y
            r9.getClass()
            r6.c = r9
            java.lang.Object r9 = r6.d
            ua4 r9 = (defpackage.ua4) r9
            int r10 = r6.a
            int r11 = r10 + r2
            java.lang.Object[] r9 = r9.A
            r9 = r9[r11]
            y64 r9 = (defpackage.y64) r9
            java.lang.Object r11 = r6.e
            ua4 r11 = (defpackage.ua4) r11
            int r10 = r10 + r3
            java.lang.Object[] r11 = r11.A
            r10 = r11[r10]
            y64 r10 = (defpackage.y64) r10
            boolean r11 = defpackage.nb3.k(r9, r10)
            if (r11 != 0) goto L3a6
            java.lang.Object r11 = r6.c
            z64 r11 = (defpackage.z64) r11
            l(r9, r10, r11)
        L3a6:
            int r2 = r2 + 1
            int r3 = r3 + 1
            r10 = r7
            goto L371
        L3ac:
            java.lang.Object r1 = r0.f
            vy6 r1 = (defpackage.vy6) r1
            z64 r1 = r1.X
            r10 = r5
        L3b3:
            if (r1 == 0) goto L3c3
            java.lang.Object r2 = r0.c
            ag4 r2 = (defpackage.ag4) r2
            if (r1 == r2) goto L3c3
            int r2 = r1.L
            r10 = r10 | r2
            r1.R = r10
            z64 r1 = r1.X
            goto L3b3
        L3c3:
            return
    }

    public void k() {
            r6 = this;
            java.lang.Object r0 = r6.b
            sm3 r0 = (defpackage.sm3) r0
            java.lang.Object r1 = r6.d
            y53 r1 = (defpackage.y53) r1
            java.lang.Object r2 = r6.f
            vy6 r2 = (defpackage.vy6) r2
            z64 r2 = r2.X
        Le:
            if (r2 == 0) goto L41
            jm3 r3 = defpackage.nc1.D(r2)
            if (r3 == 0) goto L3b
            eg4 r4 = r2.d0
            if (r4 == 0) goto L2d
            mm3 r4 = (defpackage.mm3) r4
            jm3 r5 = r4.P0
            r4.A1(r3)
            if (r5 == r2) goto L35
            yp4 r3 = r4.J0
            if (r3 == 0) goto L35
            xt2 r3 = (defpackage.xt2) r3
            r3.c()
            goto L35
        L2d:
            mm3 r4 = new mm3
            r4.<init>(r0, r3)
            r2.Q0(r4)
        L35:
            r1.o0 = r4
            r4.n0 = r1
            r1 = r4
            goto L3e
        L3b:
            r2.Q0(r1)
        L3e:
            z64 r2 = r2.X
            goto Le
        L41:
            sm3 r0 = r0.v()
            if (r0 == 0) goto L4e
            if0 r0 = r0.B0
            java.lang.Object r0 = r0.d
            y53 r0 = (defpackage.y53) r0
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r1.o0 = r0
            r6.e = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = super.toString()
            return r4
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.Object r1 = r4.g
            z64 r1 = (defpackage.z64) r1
            java.lang.Object r4 = r4.f
            vy6 r4 = (defpackage.vy6) r4
            java.lang.String r2 = "]"
            if (r1 != r4) goto L21
            r0.append(r2)
            goto L3c
        L21:
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L3c
            java.lang.String r3 = java.lang.String.valueOf(r1)
            r0.append(r3)
            z64 r3 = r1.Y
            if (r3 != r4) goto L34
            r0.append(r2)
            goto L3c
        L34:
            java.lang.String r3 = ","
            r0.append(r3)
            z64 r1 = r1.Y
            goto L21
        L3c:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
