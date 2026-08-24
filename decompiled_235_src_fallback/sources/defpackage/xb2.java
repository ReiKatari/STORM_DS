package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb2  reason: default package */
/* loaded from: classes.dex */
public final class xb2 implements defpackage.p06 {
    public final android.content.Context a;
    public final defpackage.su2 b;
    public final defpackage.kd6 c;
    public final defpackage.mp d;
    public final defpackage.uh7 e;
    public final defpackage.jd6 f;
    public final android.os.Handler g;
    public final defpackage.o41 h;
    public final java.lang.reflect.Type i;
    public final java.lang.reflect.Type j;
    public final defpackage.of6 k;
    public final defpackage.tp6 l;
    public final java.util.concurrent.CopyOnWriteArrayList m;
    public final java.util.concurrent.atomic.AtomicBoolean n;
    public final java.lang.Object o;
    public final java.util.LinkedHashMap p;
    public final java.util.LinkedHashMap q;
    public final defpackage.tp6 r;
    public final java.util.LinkedHashSet s;
    public volatile java.util.Map t;
    public volatile boolean u;
    public final java.util.concurrent.atomic.AtomicBoolean v;

    public xb2(android.content.Context r9, defpackage.su2 r10, defpackage.kd6 r11, defpackage.mp r12, defpackage.uh7 r13, defpackage.jd6 r14) {
            r8 = this;
            r8.<init>()
            r8.a = r9
            r8.b = r10
            r8.c = r11
            r8.d = r12
            r8.e = r13
            r8.f = r14
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            r11.<init>(r12)
            r8.g = r11
            xe1 r11 = defpackage.xk1.a
            de1 r11 = defpackage.de1.L
            o41 r11 = defpackage.g04.i(r11)
            r8.h = r11
            ub2 r11 = new ub2
            r11.<init>()
            java.lang.reflect.Type r11 = r11.b
            r11.getClass()
            r8.i = r11
            vb2 r11 = new vb2
            r11.<init>()
            java.lang.reflect.Type r11 = r11.b
            r11.getClass()
            r8.j = r11
            pb2 r11 = new pb2
            r11.<init>()
            java.lang.reflect.Type r11 = r11.b
            r11.getClass()
            m80 r12 = defpackage.m80.DROP_OLDEST
            r13 = 2
            r14 = 1
            r0 = 0
            of6 r12 = defpackage.pf6.b(r14, r0, r12, r13)
            r8.k = r12
            m06 r12 = defpackage.m06.NOT_SCANNING
            tp6 r12 = defpackage.up6.a(r12)
            r8.l = r12
            java.util.concurrent.CopyOnWriteArrayList r12 = new java.util.concurrent.CopyOnWriteArrayList
            r12.<init>()
            r8.m = r12
            java.util.concurrent.atomic.AtomicBoolean r12 = new java.util.concurrent.atomic.AtomicBoolean
            r12.<init>(r0)
            r8.n = r12
            java.lang.Object r12 = new java.lang.Object
            r12.<init>()
            r8.o = r12
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r8.p = r12
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r8.q = r12
            yt1 r12 = defpackage.yt1.A
            tp6 r12 = defpackage.up6.a(r12)
            r8.r = r12
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r8.s = r12
            zt1 r12 = defpackage.zt1.A
            r8.t = r12
            java.util.concurrent.atomic.AtomicBoolean r12 = new java.util.concurrent.atomic.AtomicBoolean
            r12.<init>(r0)
            r8.v = r12
            java.io.File r12 = new java.io.File
            java.io.File r9 = r9.getFilesDir()
            java.lang.String r13 = "rom_directory_state.json"
            r12.<init>(r9, r13)
            boolean r9 = r12.isFile()
            r13 = 0
            if (r9 != 0) goto Laa
            goto L13a
        Laa:
            java.io.FileReader r9 = new java.io.FileReader     // Catch: java.lang.Throwable -> Lbe
            r9.<init>(r12)     // Catch: java.lang.Throwable -> Lbe
            ie7 r12 = new ie7     // Catch: java.lang.Throwable -> Lc0
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r10 = r10.c(r9, r12)     // Catch: java.lang.Throwable -> Lc0
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> Lc0
            r9.close()     // Catch: java.lang.Throwable -> Lbe
            goto Lcc
        Lbe:
            r9 = move-exception
            goto Lc7
        Lc0:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r11 = move-exception
            defpackage.ge7.t(r9, r10)     // Catch: java.lang.Throwable -> Lbe
            throw r11     // Catch: java.lang.Throwable -> Lbe
        Lc7:
            em5 r10 = new em5
            r10.<init>(r9)
        Lcc:
            boolean r9 = r10 instanceof defpackage.em5
            if (r9 != 0) goto L12d
            r9 = r10
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L12d
            java.lang.Object r11 = r8.o
            monitor-enter(r11)
            java.util.LinkedHashMap r12 = r8.p     // Catch: java.lang.Throwable -> L124
            r12.clear()     // Catch: java.lang.Throwable -> L124
            java.util.LinkedHashMap r12 = r8.q     // Catch: java.lang.Throwable -> L124
            r12.clear()     // Catch: java.lang.Throwable -> L124
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L124
        Le6:
            boolean r12 = r9.hasNext()     // Catch: java.lang.Throwable -> L124
            if (r12 == 0) goto L126
            java.lang.Object r12 = r9.next()     // Catch: java.lang.Throwable -> L124
            lw5 r12 = (defpackage.lw5) r12     // Catch: java.lang.Throwable -> L124
            kb2 r12 = z(r12)     // Catch: java.lang.Throwable -> L124
            java.util.LinkedHashMap r1 = r8.p     // Catch: java.lang.Throwable -> L124
            android.net.Uri r2 = r12.a     // Catch: java.lang.Throwable -> L124
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L124
            r1.put(r2, r12)     // Catch: java.lang.Throwable -> L124
            java.util.LinkedHashMap r1 = r8.q     // Catch: java.lang.Throwable -> L124
            android.net.Uri r2 = r12.a     // Catch: java.lang.Throwable -> L124
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L124
            android.net.Uri r3 = r12.a     // Catch: java.lang.Throwable -> L124
            long r4 = r12.c     // Catch: java.lang.Throwable -> L124
            java.lang.Long r12 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L124
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L118
            goto L119
        L118:
            r12 = r13
        L119:
            jw5 r4 = defpackage.jw5.UNCHANGED     // Catch: java.lang.Throwable -> L124
            kw5 r5 = new kw5     // Catch: java.lang.Throwable -> L124
            r5.<init>(r3, r12, r4)     // Catch: java.lang.Throwable -> L124
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L124
            goto Le6
        L124:
            r8 = move-exception
            goto L12b
        L126:
            r8.h()     // Catch: java.lang.Throwable -> L124
            monitor-exit(r11)
            goto L12d
        L12b:
            monitor-exit(r11)
            throw r8
        L12d:
            java.lang.Throwable r9 = defpackage.hm5.a(r10)
            if (r9 == 0) goto L13a
            java.lang.String r10 = "FSRomsRepository"
            java.lang.String r11 = "Failed to load ROM directory cache"
            android.util.Log.w(r10, r11, r9)
        L13a:
            o41 r9 = r8.h
            ib2 r10 = new ib2
            r10.<init>(r8, r13, r0)
            r11 = 3
            defpackage.hv.L(r9, r13, r13, r10, r11)
            o41 r9 = r8.h
            ib2 r10 = new ib2
            r10.<init>(r8, r13, r14)
            defpackage.hv.L(r9, r13, r13, r10, r11)
            return
    }

    public static void E(java.io.File r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getParentFile()
            java.lang.String r2 = r4.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ".tmp"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r1, r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L70
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r2.write(r5)     // Catch: java.lang.Throwable -> L70
            r2.flush()     // Catch: java.lang.Throwable -> L70
            java.io.FileDescriptor r5 = r1.getFD()     // Catch: java.lang.Throwable -> L35
            r5.sync()     // Catch: java.lang.Throwable -> L35
        L35:
            r1.close()
            boolean r5 = r0.renameTo(r4)
            if (r5 != 0) goto L6f
            boolean r5 = r4.exists()
            if (r5 == 0) goto L59
            boolean r5 = r4.delete()
            if (r5 == 0) goto L4b
            goto L59
        L4b:
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r5 = "Could not replace "
            java.lang.String r4 = defpackage.i61.m(r5, r4)
            defpackage.i.m(r4)
            return
        L59:
            boolean r5 = r0.renameTo(r4)
            if (r5 == 0) goto L60
            goto L6f
        L60:
            java.lang.String r5 = r0.getAbsolutePath()
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r0 = "Could not move "
            java.lang.String r1 = " to "
            defpackage.e41.r(r0, r5, r1, r4)
        L6f:
            return
        L70:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L72
        L72:
            r5 = move-exception
            defpackage.ge7.t(r1, r4)
            throw r5
    }

    public static final void a(defpackage.xb2 r19, defpackage.pq5 r20) {
            r0 = r19
            r1 = r20
            jt5 r2 = r19.u(r20)
            pq5 r3 = r0.d(r1, r2)
            java.util.concurrent.CopyOnWriteArrayList r4 = r0.m
            java.util.Iterator r5 = r4.iterator()
        L12:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L26
            java.lang.Object r6 = r5.next()
            r7 = r6
            pq5 r7 = (defpackage.pq5) r7
            boolean r7 = r7.b(r1)
            if (r7 == 0) goto L12
            goto L27
        L26:
            r6 = 0
        L27:
            r7 = r6
            pq5 r7 = (defpackage.pq5) r7
            boolean r1 = defpackage.nb3.k(r7, r3)
            if (r1 == 0) goto L31
            return
        L31:
            if (r7 == 0) goto L54
            java.lang.String r8 = r3.a
            java.lang.String r9 = r3.b
            boolean r12 = r3.h
            java.lang.String r13 = r3.i
            if (r2 != 0) goto L3f
            jt5 r2 = r7.f
        L3f:
            r10 = r2
            r17 = 0
            r18 = 7772(0x1e5c, float:1.0891E-41)
            r11 = 0
            r14 = 0
            r16 = 0
            pq5 r1 = defpackage.pq5.a(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)
            r4.remove(r7)
            r4.add(r1)
            goto L57
        L54:
            r4.add(r3)
        L57:
            r1 = 1
            r0.t(r1)
            return
    }

    public static final java.lang.Object b(defpackage.xb2 r18, defpackage.s41 r19) {
            r1 = r18
            r0 = r19
            boolean r2 = r0 instanceof defpackage.sb2
            if (r2 == 0) goto L17
            r2 = r0
            sb2 r2 = (defpackage.sb2) r2
            int r3 = r2.e0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e0 = r3
            goto L1c
        L17:
            sb2 r2 = new sb2
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.Z
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.e0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L5d
            if (r4 == r10) goto L59
            if (r4 == r8) goto L46
            if (r4 == r7) goto L41
            if (r4 == r6) goto L41
            if (r4 == r5) goto L3a
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r11
        L3a:
            java.lang.Throwable r1 = r2.R
            defpackage.oi2.Y(r0)
            goto L1bf
        L41:
            defpackage.oi2.Y(r0)
            goto L1a7
        L46:
            zg5 r4 = r2.Y
            mb2 r8 = r2.X
            java.lang.Throwable r10 = r2.R
            android.net.Uri[] r10 = (android.net.Uri[]) r10
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            goto L16a
        L53:
            r0 = move-exception
            goto L1aa
        L56:
            r0 = move-exception
            goto L163
        L59:
            defpackage.oi2.Y(r0)
            goto L6f
        L5d:
            defpackage.oi2.Y(r0)
            tp6 r0 = r1.l
            m06 r4 = defpackage.m06.SCANNING
            r2.e0 = r10
            r0.a(r4, r2)
            jg7 r0 = defpackage.jg7.a
            if (r0 != r3) goto L6f
            goto L1bd
        L6f:
            kd6 r0 = r1.c     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            ng6 r0 = (defpackage.ng6) r0     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            android.net.Uri[] r0 = r0.r()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            java.util.ArrayList r4 = r1.C(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            mb2 r10 = r1.i()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            boolean r12 = r4.isEmpty()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            java.util.List r13 = r10.a
            if (r12 == 0) goto L88
            goto Lc7
        L88:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r12.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
        L91:
            boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r14 == 0) goto Lc6
            java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r15 = r14
            pq5 r15 = (defpackage.pq5) r15     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            boolean r16 = r4.isEmpty()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r16 == 0) goto La5
            goto Lc2
        La5:
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r7 = 0
        Laa:
            if (r7 >= r6) goto Lc2
            java.lang.Object r17 = r4.get(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            int r7 = r7 + 1
            r9 = r17
            android.net.Uri r9 = (android.net.Uri) r9     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            boolean r9 = r(r15, r9)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r9 == 0) goto Laa
        Lbc:
            r6 = 4
            r7 = 3
            goto L91
        Lbf:
            r0 = move-exception
            goto L18b
        Lc2:
            r12.add(r14)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            goto Lbc
        Lc6:
            r13 = r12
        Lc7:
            int r6 = r0.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r6 != 0) goto Lcd
            yt1 r6 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            goto Lf6
        Lcd:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r6.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            java.util.Iterator r7 = r13.iterator()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
        Ld6:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r9 == 0) goto Lf6
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r12 = r9
            pq5 r12 = (defpackage.pq5) r12     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            int r13 = r0.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r14 = 0
        Le5:
            if (r14 >= r13) goto Ld6
            r15 = r0[r14]     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            boolean r15 = r(r12, r15)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r15 == 0) goto Lf3
            r6.add(r9)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            goto Ld6
        Lf3:
            int r14 = r14 + 1
            goto Le5
        Lf6:
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r7 == 0) goto L125
            int r0 = r0.length     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r0 != 0) goto L100
            goto L125
        L100:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r0 == 0) goto L125
            java.lang.String r0 = "FSRomsRepository"
            java.lang.String r7 = "ROM cache is empty but search directories exist; forcing full rescan"
            android.util.Log.w(r0, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            java.lang.Object r7 = r1.o     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            java.util.LinkedHashMap r0 = r1.p     // Catch: java.lang.Throwable -> L122
            r0.clear()     // Catch: java.lang.Throwable -> L122
            java.util.LinkedHashMap r0 = r1.q     // Catch: java.lang.Throwable -> L122
            r0.clear()     // Catch: java.lang.Throwable -> L122
            r1.h()     // Catch: java.lang.Throwable -> L122
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r1.w()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            goto L125
        L122:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            throw r0     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
        L125:
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.m     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r0.addAll(r6)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r0 == 0) goto L134
            boolean r0 = r10.b     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r0 == 0) goto L13b
        L134:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r1.t(r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
        L13b:
            zg5 r4 = new zg5     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            r4.<init>()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            wb2 r0 = new wb2     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            r0.<init>(r1, r11, r11)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            g21 r6 = new g21     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            r7 = 7
            r6.<init>(r0, r7)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            zb0 r0 = new zb0     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            r0.<init>(r5, r4, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            r2.R = r11     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            r2.X = r10     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            r2.Y = r4     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            r2.e0 = r8     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            java.lang.Object r0 = r6.b(r0, r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L161
            if (r0 != r3) goto L15f
            goto L1bd
        L15f:
            r8 = r10
            goto L16a
        L161:
            r0 = move-exception
            r8 = r10
        L163:
            java.lang.String r6 = "FSRomsRepository"
            java.lang.String r7 = "Error during scanForNewRoms"
            android.util.Log.e(r6, r7, r0)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
        L16a:
            boolean r0 = r8.b     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r0 != 0) goto L176
            boolean r0 = r4.A     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
            if (r0 != 0) goto L176
            r4 = 0
            r1.t(r4)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> Lbf
        L176:
            tp6 r0 = r1.l
            m06 r1 = defpackage.m06.NOT_SCANNING
            r2.R = r11
            r2.X = r11
            r2.Y = r11
            r4 = 3
            r2.e0 = r4
            r0.a(r1, r2)
            jg7 r0 = defpackage.jg7.a
            if (r0 != r3) goto L1a7
            goto L1bd
        L18b:
            java.lang.String r4 = "FSRomsRepository"
            java.lang.String r6 = "Error in loadCachedRoms"
            android.util.Log.e(r4, r6, r0)     // Catch: java.lang.Throwable -> L53
            tp6 r0 = r1.l
            m06 r1 = defpackage.m06.NOT_SCANNING
            r2.R = r11
            r2.X = r11
            r2.Y = r11
            r4 = 4
            r2.e0 = r4
            r0.a(r1, r2)
            jg7 r0 = defpackage.jg7.a
            if (r0 != r3) goto L1a7
            goto L1bd
        L1a7:
            jg7 r3 = defpackage.jg7.a
            goto L1bd
        L1aa:
            tp6 r1 = r1.l
            m06 r4 = defpackage.m06.NOT_SCANNING
            r2.R = r0
            r2.X = r11
            r2.Y = r11
            r2.e0 = r5
            r1.a(r4, r2)
            jg7 r1 = defpackage.jg7.a
            if (r1 != r3) goto L1be
        L1bd:
            return r3
        L1be:
            r1 = r0
        L1bf:
            throw r1
    }

    public static final java.lang.Object c(defpackage.xb2 r30, android.net.Uri r31, defpackage.qi6 r32, defpackage.ne2 r33, defpackage.s41 r34) {
            r1 = r30
            r2 = r31
            r3 = r32
            r0 = r34
            java.util.concurrent.CopyOnWriteArrayList r4 = r1.m
            mp r5 = r1.d
            boolean r6 = r0 instanceof defpackage.tb2
            if (r6 == 0) goto L1f
            r6 = r0
            tb2 r6 = (defpackage.tb2) r6
            int r7 = r6.m0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L1f
            int r7 = r7 - r8
            r6.m0 = r7
            goto L24
        L1f:
            tb2 r6 = new tb2
            r6.<init>(r1, r0)
        L24:
            java.lang.Object r0 = r6.k0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r6.m0
            java.lang.String r9 = "FSRomsRepository"
            jg7 r10 = defpackage.jg7.a
            r11 = 1
            if (r8 == 0) goto L83
            if (r8 != r11) goto L7b
            int r2 = r6.j0
            long r3 = r6.i0
            lb2 r8 = r6.h0
            java.util.Iterator r13 = r6.g0
            java.util.Set r14 = r6.f0
            java.util.Set r14 = (java.util.Set) r14
            java.util.Set r15 = r6.e0
            java.util.Set r15 = (java.util.Set) r15
            r34 = 0
            java.util.Set r12 = r6.d0
            java.util.Set r12 = (java.util.Set) r12
            java.util.List r11 = r6.Z
            r31 = r2
            java.util.Map r2 = r6.Y
            r32 = r2
            ne2 r2 = r6.X
            r33 = r2
            android.net.Uri r2 = r6.R
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L6a
            r17 = r5
            r22 = r10
            r0 = r11
            r1 = r15
            r5 = 1
            r15 = r32
            r10 = r3
            r4 = r31
            r3 = r33
            goto L363
        L6a:
            r0 = move-exception
            r17 = r5
            r22 = r10
            r1 = r11
            r16 = r15
            r15 = r32
            r10 = r3
            r4 = r31
            r3 = r33
            goto L386
        L7b:
            r34 = 0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r34
        L83:
            r34 = 0
            defpackage.oi2.Y(r0)
            kb2 r8 = r30.j(r31)
            boolean r0 = r3.e()
            if (r0 == 0) goto L98
            boolean r0 = r3.a()
            if (r0 != 0) goto L9d
        L98:
            r3 = r1
            r22 = r10
            goto L46c
        L9d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.net.Uri r0 = r3.c
            r0.getClass()
            java.lang.String r13 = android.provider.DocumentsContract.getTreeDocumentId(r0)     // Catch: java.lang.Exception -> Lb8
            android.content.Context r14 = r1.a     // Catch: java.lang.Exception -> Lb8
            boolean r14 = android.provider.DocumentsContract.isDocumentUri(r14, r0)     // Catch: java.lang.Exception -> Lb8
            if (r14 == 0) goto Lba
            java.lang.String r13 = android.provider.DocumentsContract.getDocumentId(r0)     // Catch: java.lang.Exception -> Lb8
            goto Lba
        Lb8:
            r0 = move-exception
            goto Lc2
        Lba:
            r13.getClass()     // Catch: java.lang.Exception -> Lb8
            boolean r0 = r1.e(r0, r13, r11)     // Catch: java.lang.Exception -> Lb8
            goto Lc8
        Lc2:
            java.lang.String r13 = "Fast SAF scan failed, falling back to DocumentFile"
            android.util.Log.w(r9, r13, r0)
            r0 = 0
        Lc8:
            if (r0 == 0) goto Ld1
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Ld1
            goto Ldc
        Ld1:
            r11.clear()
            boolean r0 = r1.f(r3, r11)
            if (r0 != 0) goto Ldc
            r11 = r34
        Ldc:
            if (r11 != 0) goto L101
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "ROM directory scan failed; preserving cached ROM data for "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r9, r0)
            if (r8 == 0) goto Lf9
            long r3 = r8.c
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r3)
            goto Lfb
        Lf9:
            r12 = r34
        Lfb:
            r1.s(r2, r12)
        Lfe:
            r7 = r10
            goto L46b
        L101:
            java.lang.String r0 = g(r11)
            long r20 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto L130
            java.lang.String r3 = r8.b
            boolean r13 = defpackage.nb3.k(r3, r0)
            if (r13 == 0) goto L130
            android.net.Uri r0 = r8.a
            java.util.Map r2 = r8.d
            r0.getClass()
            r3.getClass()
            kb2 r17 = new kb2
            r18 = r0
            r22 = r2
            r19 = r3
            r17.<init>(r18, r19, r20, r22)
            r0 = r17
            jw5 r2 = defpackage.jw5.UNCHANGED
            r1.A(r0, r2)
            goto Lfe
        L130:
            if (r8 == 0) goto L135
            java.util.Map r3 = r8.d
            goto L137
        L135:
            zt1 r3 = defpackage.zt1.A
        L137:
            r13 = 10
            int r14 = defpackage.ht0.v0(r11, r13)
            int r14 = defpackage.c14.k0(r14)
            r15 = 16
            if (r14 >= r15) goto L146
            r14 = r15
        L146:
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>(r14)
            int r14 = r11.size()
            r12 = 0
        L150:
            if (r12 >= r14) goto L16b
            java.lang.Object r13 = r11.get(r12)
            int r12 = r12 + 1
            r18 = r6
            r6 = r13
            lb2 r6 = (defpackage.lb2) r6
            android.net.Uri r6 = r6.a
            java.lang.String r6 = r6.toString()
            r15.put(r6, r13)
            r6 = r18
            r13 = 10
            goto L150
        L16b:
            r18 = r6
            if (r8 == 0) goto L1ce
            java.lang.String r6 = r8.b
            boolean r0 = defpackage.nb3.k(r6, r0)
            if (r0 != 0) goto L1ce
            java.util.Set r0 = r3.keySet()
            java.util.Set r6 = r15.keySet()
            boolean r0 = defpackage.nb3.k(r0, r6)
            if (r0 == 0) goto L1ce
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L18c
            goto L1cc
        L18c:
            java.util.Set r0 = r15.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L194:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L1cc
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getKey()
            r8.getClass()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r6.getValue()
            lb2 r6 = (defpackage.lb2) r6
            java.lang.Object r8 = r3.get(r8)
            jb2 r8 = (defpackage.jb2) r8
            if (r8 == 0) goto L1ce
            long r12 = r8.b
            r22 = r12
            long r12 = r6.c
            int r12 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r12 != 0) goto L1ce
            long r12 = r8.c
            r22 = r12
            long r12 = r6.d
            int r6 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r6 != 0) goto L1ce
            goto L194
        L1cc:
            r0 = 1
            goto L1cf
        L1ce:
            r0 = 0
        L1cf:
            if (r0 == 0) goto L1d6
        L1d1:
            r19 = r0
            r22 = r10
            goto L221
        L1d6:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r8 = r11.size()
            r12 = 0
        L1e0:
            if (r12 >= r8) goto L21f
            java.lang.Object r13 = r11.get(r12)
            int r12 = r12 + 1
            r14 = r13
            lb2 r14 = (defpackage.lb2) r14
            r19 = r0
            android.net.Uri r0 = r14.a
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r3.get(r0)
            jb2 r0 = (defpackage.jb2) r0
            r22 = r10
            r23 = r11
            if (r0 == 0) goto L21b
            long r10 = r0.b
            r24 = r10
            long r10 = r14.c
            int r10 = (r24 > r10 ? 1 : (r24 == r10 ? 0 : -1))
            if (r10 != 0) goto L21b
            long r10 = r0.c
            r24 = r10
            long r10 = r14.d
            int r0 = (r24 > r10 ? 1 : (r24 == r10 ? 0 : -1))
            if (r0 == 0) goto L214
            goto L21b
        L214:
            r0 = r19
            r10 = r22
            r11 = r23
            goto L1e0
        L21b:
            r6.add(r13)
            goto L214
        L21f:
            r11 = r6
            goto L1d1
        L221:
            java.util.Set r0 = r3.keySet()
            java.util.Set r6 = r15.keySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r0 = defpackage.ii2.F(r0, r6)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L236
            goto L245
        L236:
            ez1 r6 = new ez1
            r8 = 1
            r6.<init>(r0, r8)
            boolean r6 = defpackage.gt0.W0(r4, r6)
            if (r6 == 0) goto L245
            r1.t(r8)
        L245:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r8 = r11.size()
            r10 = 0
        L24f:
            if (r10 >= r8) goto L26e
            java.lang.Object r12 = r11.get(r10)
            int r10 = r10 + 1
            lb2 r12 = (defpackage.lb2) r12
            android.net.Uri r12 = r12.a
            java.lang.String r12 = r12.toString()
            boolean r13 = r3.containsKey(r12)
            if (r13 == 0) goto L266
            goto L268
        L266:
            r12 = r34
        L268:
            if (r12 == 0) goto L24f
            r6.add(r12)
            goto L24f
        L26e:
            java.util.Set r3 = defpackage.gt0.p1(r6)
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L279
            goto L288
        L279:
            ez1 r6 = new ez1
            r8 = 1
            r6.<init>(r3, r8)
            boolean r3 = defpackage.gt0.W0(r4, r6)
            if (r3 == 0) goto L288
            r1.t(r8)
        L288:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r11, r4)
            r3.<init>(r4)
            int r4 = r11.size()
            r12 = 0
        L298:
            if (r12 >= r4) goto L2ac
            java.lang.Object r6 = r11.get(r12)
            int r12 = r12 + 1
            lb2 r6 = (defpackage.lb2) r6
            android.net.Uri r6 = r6.a
            java.lang.String r6 = r6.toString()
            r3.add(r6)
            goto L298
        L2ac:
            java.util.Set r3 = defpackage.gt0.p1(r3)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r6 = r11.iterator()
            r31 = r0
            r12 = r3
            r14 = r4
            r13 = r6
            r8 = r11
            r6 = r18
            r4 = r19
            r10 = r20
            r3 = r33
        L2c7:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L3ba
            java.lang.Object r0 = r13.next()
            r1 = r0
            lb2 r1 = (defpackage.lb2) r1
            zl1 r0 = r1.e     // Catch: java.lang.Throwable -> L382
            pw5 r0 = r5.a(r0)     // Catch: java.lang.Throwable -> L382
            if (r0 != 0) goto L311
            zl1 r0 = r1.e     // Catch: java.lang.Throwable -> L2e9
            java.lang.String r0 = r0.i()     // Catch: java.lang.Throwable -> L2e9
            if (r0 == 0) goto L2f7
            pw5 r0 = r5.c(r0)     // Catch: java.lang.Throwable -> L2e9
            goto L2f9
        L2e9:
            r0 = move-exception
            r16 = r8
            r8 = r1
            r1 = r16
            r17 = r5
            r16 = r12
            r12 = r31
            goto L386
        L2f7:
            r0 = r34
        L2f9:
            if (r0 != 0) goto L311
            android.net.Uri r0 = r1.a     // Catch: java.lang.Throwable -> L2e9
            java.lang.String r0 = r0.getLastPathSegment()     // Catch: java.lang.Throwable -> L2e9
            if (r0 == 0) goto L308
            pw5 r0 = r5.c(r0)     // Catch: java.lang.Throwable -> L2e9
            goto L30a
        L308:
            r0 = r34
        L30a:
            if (r0 != 0) goto L311
            r17 = r5
            r32 = r12
            goto L31f
        L311:
            r17 = r5
            android.net.Uri r5 = r1.a     // Catch: java.lang.Throwable -> L37e
            r32 = r12
            android.net.Uri r12 = r1.b     // Catch: java.lang.Throwable -> L379
            pq5 r0 = r0.d(r5, r12)     // Catch: java.lang.Throwable -> L379
            if (r0 != 0) goto L325
        L31f:
            r0 = r31
            r12 = r32
            r5 = 1
            goto L36a
        L325:
            android.net.Uri r5 = r1.a     // Catch: java.lang.Throwable -> L379
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L379
            r5.getClass()     // Catch: java.lang.Throwable -> L379
            r14.add(r5)     // Catch: java.lang.Throwable -> L379
            r6.R = r2     // Catch: java.lang.Throwable -> L379
            r6.X = r3     // Catch: java.lang.Throwable -> L379
            r6.Y = r15     // Catch: java.lang.Throwable -> L379
            r6.Z = r8     // Catch: java.lang.Throwable -> L379
            r5 = r31
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L37c
            r6.d0 = r5     // Catch: java.lang.Throwable -> L37c
            r12 = r32
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L37c
            r6.e0 = r12     // Catch: java.lang.Throwable -> L37c
            r5 = r14
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L37c
            r6.f0 = r5     // Catch: java.lang.Throwable -> L37c
            r6.g0 = r13     // Catch: java.lang.Throwable -> L379
            r6.h0 = r1     // Catch: java.lang.Throwable -> L379
            r6.i0 = r10     // Catch: java.lang.Throwable -> L379
            r6.j0 = r4     // Catch: java.lang.Throwable -> L379
            r5 = 1
            r6.m0 = r5     // Catch: java.lang.Throwable -> L370
            java.lang.Object r0 = r3.a(r0, r6)     // Catch: java.lang.Throwable -> L370
            if (r0 != r7) goto L35d
            goto L46b
        L35d:
            r12 = r31
            r0 = r8
            r8 = r1
            r1 = r32
        L363:
            r29 = r8
            r8 = r0
            r0 = r12
            r12 = r1
            r1 = r29
        L36a:
            r16 = r12
            r5 = r22
            r12 = r0
            goto L390
        L370:
            r0 = move-exception
        L371:
            r12 = r8
            r8 = r1
            r1 = r12
            r12 = r31
            r16 = r32
            goto L386
        L379:
            r0 = move-exception
        L37a:
            r5 = 1
            goto L371
        L37c:
            r0 = move-exception
            goto L37a
        L37e:
            r0 = move-exception
        L37f:
            r32 = r12
            goto L37a
        L382:
            r0 = move-exception
            r17 = r5
            goto L37f
        L386:
            em5 r5 = new em5
            r5.<init>(r0)
            r29 = r8
            r8 = r1
            r1 = r29
        L390:
            java.lang.Throwable r0 = defpackage.hm5.a(r5)
            if (r0 == 0) goto L3ac
            android.net.Uri r1 = r1.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r31 = r2
            java.lang.String r2 = "Failed to process file at "
            r5.<init>(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.e(r9, r1, r0)
            goto L3ae
        L3ac:
            r31 = r2
        L3ae:
            r1 = r30
            r2 = r31
            r31 = r12
            r12 = r16
            r5 = r17
            goto L2c7
        L3ba:
            r32 = r12
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r15.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L3c9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3f9
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r32
            boolean r6 = r5.contains(r4)
            if (r6 == 0) goto L3ed
            boolean r4 = r14.contains(r4)
            if (r4 == 0) goto L3ea
            goto L3ed
        L3ea:
            r32 = r5
            goto L3c9
        L3ed:
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r0.put(r4, r3)
            goto L3ea
        L3f9:
            java.util.Collection r1 = r0.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r1 = defpackage.gt0.k1(r1)
            java.lang.String r25 = g(r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r3 = r0.size()
            int r3 = defpackage.c14.k0(r3)
            r1.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L41e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L445
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            lb2 r3 = (defpackage.lb2) r3
            jb2 r12 = new jb2
            android.net.Uri r13 = r3.a
            long r14 = r3.c
            long r5 = r3.d
            r16 = r5
            r12.<init>(r13, r14, r16)
            r1.put(r4, r12)
            goto L41e
        L445:
            kb2 r23 = new kb2
            r28 = r1
            r24 = r2
            r26 = r10
            r23.<init>(r24, r25, r26, r28)
            r0 = r23
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L463
            boolean r1 = r31.isEmpty()
            if (r1 == 0) goto L463
            jw5 r1 = defpackage.jw5.UNCHANGED
        L460:
            r3 = r30
            goto L466
        L463:
            jw5 r1 = defpackage.jw5.UPDATED
            goto L460
        L466:
            r3.A(r0, r1)
            r7 = r22
        L46b:
            return r7
        L46c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ROM directory is not readable; preserving cached ROM data for "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r9, r0)
            if (r8 == 0) goto L487
            long r0 = r8.c
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r0)
            goto L489
        L487:
            r12 = r34
        L489:
            r3.s(r2, r12)
            return r22
    }

    public static java.lang.String g(java.util.List r7) {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.lang.String r1 = "rom-directory-cache-v3"
            java.nio.charset.Charset r2 = defpackage.qm0.a
            byte[] r1 = r1.getBytes(r2)
            r1.getClass()
            r0.update(r1)
            zh2 r1 = new zh2
            r2 = 14
            r1.<init>(r2)
            java.util.List r7 = defpackage.gt0.d1(r7, r1)
            java.util.Iterator r7 = r7.iterator()
        L23:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r7.next()
            lb2 r1 = (defpackage.lb2) r1
            android.net.Uri r2 = r1.a
            long r3 = r1.c
            long r5 = r1.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "|"
            r1.append(r2)
            r1.append(r3)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = defpackage.qm0.a
            byte[] r1 = r1.getBytes(r2)
            r1.getClass()
            r0.update(r1)
            goto L23
        L5c:
            byte[] r7 = r0.digest()
            r7.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        L70:
            if (r3 >= r2) goto L93
            r5 = r7[r3]
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L7b
            r0.append(r1)
        L7b:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String r6 = "%02x"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r0.append(r5)
            int r3 = r3 + 1
            goto L70
        L93:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
    }

    public static boolean r(defpackage.pq5 r4, android.net.Uri r5) {
            android.net.Uri r4 = r4.e
            r0 = 0
            if (r4 != 0) goto L6
            goto L52
        L6:
            java.lang.String r5 = android.provider.DocumentsContract.getTreeDocumentId(r5)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r5 = move-exception
            em5 r1 = new em5
            r1.<init>(r5)
            r5 = r1
        L12:
            boolean r1 = r5 instanceof defpackage.em5
            r2 = 0
            if (r1 == 0) goto L19
            r5 = r2
        L19:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L1e
            goto L52
        L1e:
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r4)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            em5 r3 = new em5
            r3.<init>(r1)
            r1 = r3
        L2a:
            boolean r3 = r1 instanceof defpackage.em5
            if (r3 == 0) goto L30
            r1 = r2
        L30:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L53
            java.lang.String r1 = android.provider.DocumentsContract.getTreeDocumentId(r4)     // Catch: java.lang.Throwable -> L39
            goto L40
        L39:
            r1 = move-exception
            em5 r3 = new em5
            r3.<init>(r1)
            r1 = r3
        L40:
            boolean r3 = r1 instanceof defpackage.em5
            if (r3 == 0) goto L46
            goto L47
        L46:
            r2 = r1
        L47:
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L53
            java.lang.String r1 = r4.getLastPathSegment()
            if (r1 != 0) goto L53
        L52:
            return r0
        L53:
            boolean r4 = defpackage.xs6.g0(r1, r5, r0)
            return r4
    }

    public static boolean y(defpackage.pq5 r21) {
            r0 = r21
            boolean r1 = r0.h
            if (r1 == 0) goto L27
            jt5 r2 = new jt5
            u26 r3 = defpackage.u26.DSi
            a36 r4 = defpackage.a36.DEFAULT
            nx5 r9 = defpackage.nx5.GLOBAL
            r19 = 0
            r20 = 0
            r5 = 0
            uw5 r6 = defpackage.uw5.o
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L40
        L27:
            jt5 r3 = new jt5
            r17 = 0
            r18 = 262143(0x3ffff, float:3.6734E-40)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r3
        L40:
            jt5 r0 = r0.f
            boolean r0 = defpackage.nb3.k(r0, r2)
            r0 = r0 ^ 1
            return r0
    }

    public static defpackage.kb2 z(defpackage.lw5 r14) {
            java.util.List r0 = r14.b()
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            int r1 = defpackage.c14.k0(r1)
            r2 = 16
            if (r1 >= r2) goto L13
            r1 = r2
        L13:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            iw5 r1 = (defpackage.iw5) r1
            java.lang.String r2 = r1.c()
            jb2 r8 = new jb2
            java.lang.String r3 = r1.c()
            android.net.Uri r9 = android.net.Uri.parse(r3)
            long r10 = r1.a()
            long r12 = r1.b()
            r8.<init>(r9, r10, r12)
            r7.put(r2, r8)
            goto L1c
        L45:
            kb2 r2 = new kb2
            java.lang.String r0 = r14.a()
            android.net.Uri r3 = android.net.Uri.parse(r0)
            java.lang.String r4 = r14.c()
            long r5 = r14.d()
            r2.<init>(r3, r4, r5, r7)
            return r2
    }

    public final void A(defpackage.kb2 r8, defpackage.jw5 r9) {
            r7 = this;
            java.lang.Object r0 = r7.o
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r7.p     // Catch: java.lang.Throwable -> L2e
            android.net.Uri r2 = r8.a     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            r1.put(r2, r8)     // Catch: java.lang.Throwable -> L2e
            java.util.LinkedHashMap r1 = r7.q     // Catch: java.lang.Throwable -> L2e
            android.net.Uri r2 = r8.a     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            kw5 r3 = new kw5     // Catch: java.lang.Throwable -> L2e
            android.net.Uri r4 = r8.a     // Catch: java.lang.Throwable -> L2e
            long r5 = r8.c     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r8 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r4, r8, r9)     // Catch: java.lang.Throwable -> L2e
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r7.h()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            r7.w()
            return
        L2e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    public final void B(defpackage.pq5 r5, defpackage.jt5 r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.m
            java.util.Iterator r1 = r0.iterator()
            r2 = 0
        Ld:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r3 = r1.next()
            pq5 r3 = (defpackage.pq5) r3
            boolean r3 = r3.b(r5)
            if (r3 == 0) goto L20
            goto L24
        L20:
            int r2 = r2 + 1
            goto Ld
        L23:
            r2 = -1
        L24:
            if (r2 >= 0) goto L27
            return
        L27:
            java.lang.Object r5 = r0.get(r2)
            pq5 r5 = (defpackage.pq5) r5
            r5.getClass()
            r5.f = r6
            java.lang.Object r5 = r0.get(r2)
            r5.getClass()
            pq5 r5 = (defpackage.pq5) r5
            boolean r6 = y(r5)
            if (r6 == 0) goto L45
            r4.D(r5)
            goto L82
        L45:
            zl1 r6 = r4.n(r5)
            if (r6 == 0) goto L54
            java.lang.String r0 = r4.m(r5)
            zl1 r6 = r6.f(r0)
            goto L55
        L54:
            r6 = 0
        L55:
            if (r6 == 0) goto L82
            boolean r6 = r6.d()     // Catch: java.lang.Throwable -> L60
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L60
            goto L67
        L60:
            r6 = move-exception
            em5 r0 = new em5
            r0.<init>(r6)
            r6 = r0
        L67:
            java.lang.Throwable r6 = defpackage.hm5.a(r6)
            if (r6 == 0) goto L82
            java.lang.String r5 = r5.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to delete ROM options for "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "FSRomsRepository"
            android.util.Log.w(r0, r5, r6)
        L82:
            r5 = 1
            r4.t(r5)
            return
    }

    public final java.util.ArrayList C(android.net.Uri[] r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            r4 = r7[r3]
            boolean r5 = r6.p(r4)
            if (r5 != 0) goto L15
            r0.add(r4)
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ 1
            r6.u = r7
            int r7 = r0.size()
        L24:
            if (r2 >= r7) goto L53
            java.lang.Object r1 = r0.get(r2)
            int r2 = r2 + 1
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ROM search directory has no persisted read permission; cache will not be trusted for "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FSRomsRepository"
            android.util.Log.w(r4, r3)
            kb2 r3 = r6.j(r1)
            if (r3 == 0) goto L4e
            long r3 = r3.c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L4f
        L4e:
            r3 = 0
        L4f:
            r6.s(r1, r3)
            goto L24
        L53:
            return r0
    }

    public final void D(defpackage.pq5 r6) {
            r5 = this;
            java.lang.String r0 = "Could not open "
            zl1 r1 = r5.n(r6)
            if (r1 != 0) goto La
            goto L94
        La:
            java.lang.String r2 = r5.m(r6)
            zl1 r3 = r1.f(r2)
            if (r3 != 0) goto L23
            java.lang.String r3 = "application/octet-stream"
            zl1 r3 = r1.c(r3, r2)
            if (r3 != 0) goto L23
            zl1 r3 = r1.f(r2)
            if (r3 != 0) goto L23
            goto L94
        L23:
            android.content.Context r1 = r5.a     // Catch: java.lang.Throwable -> L54
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L54
            android.net.Uri r2 = r3.j()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "wt"
            java.io.OutputStream r1 = r1.openOutputStream(r2, r4)     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L5d
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L54
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L54
            su2 r5 = r5.b     // Catch: java.lang.Throwable -> L56
            ob2 r1 = new ob2     // Catch: java.lang.Throwable -> L56
            jt5 r2 = r6.f     // Catch: java.lang.Throwable -> L56
            mt5 r2 = defpackage.mt5.a.a(r2)     // Catch: java.lang.Throwable -> L56
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r5.f(r1)     // Catch: java.lang.Throwable -> L56
            r0.write(r5)     // Catch: java.lang.Throwable -> L56
            r0.close()     // Catch: java.lang.Throwable -> L54
            jg7 r5 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L54
            goto L79
        L54:
            r5 = move-exception
            goto L73
        L56:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L58
        L58:
            r1 = move-exception
            defpackage.ge7.t(r0, r5)     // Catch: java.lang.Throwable -> L54
            throw r1     // Catch: java.lang.Throwable -> L54
        L5d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54
            android.net.Uri r1 = r3.j()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L54
            r2.append(r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L54
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L54
            throw r5     // Catch: java.lang.Throwable -> L54
        L73:
            em5 r0 = new em5
            r0.<init>(r5)
            r5 = r0
        L79:
            java.lang.Throwable r5 = defpackage.hm5.a(r5)
            if (r5 == 0) goto L94
            java.lang.String r6 = r6.c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to write ROM options for "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "FSRomsRepository"
            android.util.Log.w(r0, r6, r5)
        L94:
            return
    }

    public final defpackage.pq5 d(defpackage.pq5 r14, defpackage.jt5 r15) {
            r13 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r13.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "rom_metadata_mirror.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            yt1 r2 = defpackage.yt1.A
            if (r1 != 0) goto L16
            goto L47
        L16:
            su2 r1 = r13.b     // Catch: java.lang.Throwable -> L29
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L29
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Type r13 = r13.j     // Catch: java.lang.Throwable -> L29
            java.lang.Object r13 = r1.b(r3, r13)     // Catch: java.lang.Throwable -> L29
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L29
            if (r13 != 0) goto L31
            r13 = r2
            goto L31
        L29:
            r0 = move-exception
            r13 = r0
            em5 r0 = new em5
            r0.<init>(r13)
            r13 = r0
        L31:
            java.lang.Throwable r0 = defpackage.hm5.a(r13)
            if (r0 == 0) goto L3e
            java.lang.String r1 = "FSRomsRepository"
            java.lang.String r3 = "Failed to parse restored ROM metadata"
            android.util.Log.w(r1, r3, r0)
        L3e:
            java.lang.Throwable r0 = defpackage.hm5.a(r13)
            if (r0 != 0) goto L45
            r2 = r13
        L45:
            java.util.List r2 = (java.util.List) r2
        L47:
            java.util.Iterator r13 = r2.iterator()
        L4b:
            boolean r0 = r13.hasNext()
            r1 = 0
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r13.next()
            r3 = r0
            nb2 r3 = (defpackage.nb2) r3
            java.lang.String r4 = r14.i
            boolean r4 = defpackage.qs6.v0(r4)
            if (r4 != 0) goto L4b
            java.lang.String r3 = r3.g
            java.lang.String r4 = r14.i
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L4b
            goto L6d
        L6c:
            r0 = r1
        L6d:
            nb2 r0 = (defpackage.nb2) r0
            if (r0 != 0) goto L96
            java.util.Iterator r13 = r2.iterator()
        L75:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r13.next()
            r2 = r0
            nb2 r2 = (defpackage.nb2) r2
            java.lang.String r3 = r2.c
            java.lang.String r4 = r14.c
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L75
            boolean r2 = r2.f
            boolean r3 = r14.h
            if (r2 != r3) goto L75
            r1 = r0
        L93:
            r0 = r1
            nb2 r0 = (defpackage.nb2) r0
        L96:
            if (r0 == 0) goto Lbc
            if (r15 != 0) goto La0
            mt5 r13 = r0.d
            jt5 r15 = r13.b()
        La0:
            r4 = r15
            java.util.Date r5 = r0.e
            jd1 r13 = defpackage.oq1.B
            long r1 = r0.h
            uq1 r13 = defpackage.uq1.MILLISECONDS
            long r8 = defpackage.n16.M(r1, r13)
            boolean r10 = r0.i
            r11 = 0
            r12 = 6559(0x199f, float:9.191E-42)
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = 0
            r1 = r14
            pq5 r14 = defpackage.pq5.a(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            goto Ld1
        Lbc:
            r1 = r14
            if (r15 == 0) goto Ld0
            r11 = 0
            r12 = 8159(0x1fdf, float:1.1433E-41)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r4 = r15
            pq5 r14 = defpackage.pq5.a(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            goto Ld1
        Ld0:
            r14 = r1
        Ld1:
            return r14
    }

    public final boolean e(android.net.Uri r26, java.lang.String r27, java.util.ArrayList r28) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r28
            mp r3 = r0.d
            android.net.Uri r5 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r26, r27)
            java.lang.String r10 = "document_id"
            java.lang.String r11 = "_display_name"
            java.lang.String r12 = "mime_type"
            java.lang.String r13 = "last_modified"
            java.lang.String r14 = "_size"
            java.lang.String[] r6 = new java.lang.String[]{r10, r11, r12, r13, r14}
            android.content.Context r15 = r0.a
            android.content.ContentResolver r4 = r15.getContentResolver()
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)
            r5 = 0
            if (r4 == 0) goto Ldd
            int r6 = r4.getColumnIndex(r10)     // Catch: java.lang.Throwable -> L5e
            int r7 = r4.getColumnIndex(r11)     // Catch: java.lang.Throwable -> L5e
            int r8 = r4.getColumnIndex(r12)     // Catch: java.lang.Throwable -> L5e
            int r9 = r4.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L5e
            int r10 = r4.getColumnIndex(r14)     // Catch: java.lang.Throwable -> L5e
            if (r6 >= 0) goto L44
            r4.close()
            return r5
        L44:
            boolean r11 = r4.moveToNext()     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto Ld2
            java.lang.String r11 = r4.getString(r6)     // Catch: java.lang.Throwable -> L5e
            if (r11 != 0) goto L51
            goto L44
        L51:
            java.lang.String r12 = ""
            if (r7 < 0) goto L62
            java.lang.String r13 = r4.getString(r7)     // Catch: java.lang.Throwable -> L5e
            if (r13 != 0) goto L5c
            goto L62
        L5c:
            r12 = r13
            goto L62
        L5e:
            r0 = move-exception
            r1 = r0
            goto Ld7
        L62:
            if (r8 < 0) goto L69
            java.lang.String r13 = r4.getString(r8)     // Catch: java.lang.Throwable -> L5e
            goto L6a
        L69:
            r13 = 0
        L6a:
            r16 = 0
            if (r9 < 0) goto L7b
            long r18 = r4.getLong(r9)     // Catch: java.lang.Throwable -> L5e
            int r14 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r14 >= 0) goto L78
            r18 = r16
        L78:
            r19 = r18
            goto L7d
        L7b:
            r19 = r16
        L7d:
            if (r10 < 0) goto L8a
            long r21 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L5e
            int r14 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r14 >= 0) goto L88
            goto L8a
        L88:
            r16 = r21
        L8a:
            r21 = r16
            android.net.Uri r14 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r11)     // Catch: java.lang.Throwable -> L5e
            android.net.Uri r18 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r26, r27)     // Catch: java.lang.Throwable -> L5e
            r24 = r5
            java.lang.String r5 = "vnd.android.document/directory"
            boolean r5 = r5.equals(r13)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto Lab
            boolean r5 = r0.e(r1, r11, r2)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto La8
            r4.close()
            return r24
        La8:
            r5 = r24
            goto L44
        Lab:
            pw5 r5 = r3.c(r12)     // Catch: java.lang.Throwable -> L5e
            if (r5 != 0) goto Lb9
            qi6 r5 = defpackage.zl1.g(r15, r14)     // Catch: java.lang.Throwable -> L5e
            pw5 r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L5e
        Lb9:
            if (r5 == 0) goto La8
            qi6 r23 = defpackage.zl1.g(r15, r14)     // Catch: java.lang.Throwable -> L5e
            lb2 r16 = new lb2     // Catch: java.lang.Throwable -> L5e
            r14.getClass()     // Catch: java.lang.Throwable -> L5e
            r18.getClass()     // Catch: java.lang.Throwable -> L5e
            r17 = r14
            r16.<init>(r17, r18, r19, r21, r23)     // Catch: java.lang.Throwable -> L5e
            r5 = r16
            r2.add(r5)     // Catch: java.lang.Throwable -> L5e
            goto La8
        Ld2:
            r4.close()
            r0 = 1
            return r0
        Ld7:
            throw r1     // Catch: java.lang.Throwable -> Ld8
        Ld8:
            r0 = move-exception
            defpackage.ge7.t(r4, r1)
            throw r0
        Ldd:
            r24 = r5
            return r24
    }

    public final boolean f(defpackage.zl1 r18, java.util.ArrayList r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r18.e()
            java.lang.String r3 = "FSRomsRepository"
            r4 = 0
            if (r2 == 0) goto L8c
            boolean r2 = r18.a()
            if (r2 != 0) goto L15
            goto L8c
        L15:
            zl1[] r2 = r18.o()     // Catch: java.lang.Exception -> L75
            r2.getClass()
            int r3 = r2.length
            r5 = r4
        L1e:
            if (r5 >= r3) goto L73
            r13 = r2[r5]
            boolean r6 = r13.k()
            if (r6 == 0) goto L2f
            boolean r6 = r0.f(r13, r1)
            if (r6 != 0) goto L70
            return r4
        L2f:
            mp r6 = r0.d
            pw5 r7 = r6.a(r13)
            if (r7 != 0) goto L43
            java.lang.String r7 = r13.i()
            if (r7 == 0) goto L42
            pw5 r7 = r6.c(r7)
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 == 0) goto L70
            lb2 r6 = new lb2
            android.net.Uri r7 = r13.j()
            r7.getClass()
            android.net.Uri r8 = r18.j()
            r8.getClass()
            long r9 = r13.m()
            r11 = 0
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 >= 0) goto L60
            r9 = r11
        L60:
            long r14 = r13.n()
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 >= 0) goto L69
            goto L6a
        L69:
            r11 = r14
        L6a:
            r6.<init>(r7, r8, r9, r11, r13)
            r1.add(r6)
        L70:
            int r5 = r5 + 1
            goto L1e
        L73:
            r0 = 1
            return r0
        L75:
            r0 = move-exception
            android.net.Uri r1 = r18.j()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to list files for directory "
            r2.<init>(r5)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r3, r1, r0)
            return r4
        L8c:
            android.net.Uri r0 = r18.j()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot read ROM directory "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            return r4
    }

    public final void h() {
            r3 = this;
            java.util.LinkedHashMap r0 = r3.q
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            zh2 r1 = new zh2
            r2 = 15
            r1.<init>(r2)
            java.util.List r0 = defpackage.gt0.d1(r0, r1)
            tp6 r3 = r3.r
            r3.getClass()
            r1 = 0
            r3.m(r1, r0)
            return
    }

    public final defpackage.mb2 i() {
            r5 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r5.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "rom_data.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            r2 = 1
            yt1 r3 = defpackage.yt1.A
            if (r1 != 0) goto L1c
            mb2 r5 = new mb2
            r5.<init>(r3, r2)
            return r5
        L1c:
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L57
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L57
            su2 r0 = r5.b     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Type r5 = r5.i     // Catch: java.lang.Throwable -> L51
            java.lang.Object r5 = r0.b(r1, r5)     // Catch: java.lang.Throwable -> L51
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L2e
            r5 = r3
        L2e:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r4 = 10
            int r4 = defpackage.ht0.v0(r5, r4)     // Catch: java.lang.Throwable -> L51
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L51
        L3d:
            boolean r4 = r5.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L53
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Throwable -> L51
            mw5 r4 = (defpackage.mw5) r4     // Catch: java.lang.Throwable -> L51
            pq5 r4 = r4.d()     // Catch: java.lang.Throwable -> L51
            r0.add(r4)     // Catch: java.lang.Throwable -> L51
            goto L3d
        L51:
            r5 = move-exception
            goto L59
        L53:
            r1.close()     // Catch: java.lang.Throwable -> L57
            goto L64
        L57:
            r5 = move-exception
            goto L5f
        L59:
            throw r5     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            defpackage.ge7.t(r1, r5)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L5f:
            em5 r0 = new em5
            r0.<init>(r5)
        L64:
            boolean r5 = r0 instanceof defpackage.em5
            if (r5 != 0) goto L70
            java.util.List r0 = (java.util.List) r0
            mb2 r5 = new mb2
            r5.<init>(r0, r2)
            r0 = r5
        L70:
            java.lang.Throwable r5 = defpackage.hm5.a(r0)
            if (r5 == 0) goto L7d
            java.lang.String r1 = "FSRomsRepository"
            java.lang.String r2 = "Failed to parse cached ROM data; cache will be rebuilt"
            android.util.Log.w(r1, r2, r5)
        L7d:
            java.lang.Throwable r5 = defpackage.hm5.a(r0)
            if (r5 != 0) goto L84
            goto L8a
        L84:
            mb2 r0 = new mb2
            r5 = 0
            r0.<init>(r3, r5)
        L8a:
            mb2 r0 = (defpackage.mb2) r0
            return r0
    }

    public final defpackage.kb2 j(android.net.Uri r2) {
            r1 = this;
            java.lang.Object r0 = r1.o
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r1.p     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            kb2 r1 = (defpackage.kb2) r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final java.lang.Object k(java.lang.String r6, defpackage.s41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qb2
            if (r0 == 0) goto L13
            r0 = r7
            qb2 r0 = (defpackage.qb2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qb2 r0 = new qb2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.lang.String r6 = r0.R
            defpackage.oi2.Y(r7)
            goto L42
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L30:
            defpackage.oi2.Y(r7)
            g21 r7 = r5.o()
            r0.R = r6
            r0.Z = r4
            java.lang.Object r7 = defpackage.f04.B(r7, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L48:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r7.next()
            r1 = r0
            pq5 r1 = (defpackage.pq5) r1
            android.content.Context r2 = r5.a
            android.net.Uri r1 = r1.d
            java.lang.String r1 = defpackage.l.s(r2, r1)
            boolean r1 = defpackage.nb3.k(r1, r6)
            if (r1 == 0) goto L48
            goto L65
        L64:
            r0 = r3
        L65:
            pq5 r0 = (defpackage.pq5) r0
            if (r0 == 0) goto L6e
            pq5 r5 = r5.v(r0)
            return r5
        L6e:
            return r3
    }

    public final java.lang.Object l(android.net.Uri r8, defpackage.s41 r9) {
            r7 = this;
            boolean r0 = r9 instanceof defpackage.rb2
            if (r0 == 0) goto L13
            r0 = r9
            rb2 r0 = (defpackage.rb2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            rb2 r0 = new rb2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            android.net.Uri r8 = r0.R
            defpackage.oi2.Y(r9)
            goto L42
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r4
        L30:
            defpackage.oi2.Y(r9)
            g21 r9 = r7.o()
            r0.R = r8
            r0.Z = r3
            java.lang.Object r9 = defpackage.f04.B(r9, r0)
            if (r9 != r1) goto L42
            return r1
        L42:
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r0 = r9.iterator()
        L48:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            r2 = r1
            pq5 r2 = (defpackage.pq5) r2
            android.net.Uri r2 = r2.d
            boolean r2 = defpackage.nb3.k(r2, r8)
            if (r2 == 0) goto L48
            goto L5f
        L5e:
            r1 = r4
        L5f:
            pq5 r1 = (defpackage.pq5) r1
            if (r1 == 0) goto L68
            pq5 r7 = r7.v(r1)
            return r7
        L68:
            android.content.Context r0 = r7.a
            qi6 r1 = defpackage.zl1.g(r0, r8)
            java.lang.String r1 = r1.i()
            if (r1 == 0) goto L97
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L7d:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r3 = r9.next()
            r5 = r3
            pq5 r5 = (defpackage.pq5) r5
            java.lang.String r5 = r5.c
            boolean r5 = defpackage.nb3.k(r5, r1)
            if (r5 == 0) goto L7d
            r2.add(r3)
            goto L7d
        L96:
            r9 = r2
        L97:
            java.lang.String r1 = defpackage.l.t(r0, r8)
            if (r1 != 0) goto L9f
            r3 = r4
            goto Lc0
        L9f:
            java.util.Iterator r2 = r9.iterator()
        La3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lbd
            java.lang.Object r3 = r2.next()
            r5 = r3
            pq5 r5 = (defpackage.pq5) r5
            android.net.Uri r5 = r5.d
            java.lang.String r5 = defpackage.l.t(r0, r5)
            boolean r5 = defpackage.nb3.k(r5, r1)
            if (r5 == 0) goto La3
            goto Lbe
        Lbd:
            r3 = r4
        Lbe:
            pq5 r3 = (defpackage.pq5) r3
        Lc0:
            if (r3 != 0) goto Lf9
            qi6 r1 = defpackage.zl1.g(r0, r8)
            boolean r2 = r1.e()
            if (r2 == 0) goto Lcd
            goto Lce
        Lcd:
            r1 = r4
        Lce:
            if (r1 != 0) goto Ld2
            r3 = r4
            goto Lf9
        Ld2:
            long r1 = r1.n()
            java.util.Iterator r9 = r9.iterator()
        Lda:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lf6
            java.lang.Object r3 = r9.next()
            r5 = r3
            pq5 r5 = (defpackage.pq5) r5
            android.net.Uri r5 = r5.d
            qi6 r5 = defpackage.zl1.g(r0, r5)
            long r5 = r5.n()
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto Lda
            goto Lf7
        Lf6:
            r3 = r4
        Lf7:
            pq5 r3 = (defpackage.pq5) r3
        Lf9:
            if (r3 == 0) goto L100
            pq5 r7 = r7.v(r3)
            return r7
        L100:
            mp r9 = r7.d
            pw5 r9 = r9.b(r8)
            if (r9 == 0) goto L117
            pq5 r8 = r9.d(r8, r4)
            if (r8 == 0) goto L117
            jt5 r9 = r7.u(r8)
            pq5 r7 = r7.d(r8, r9)
            return r7
        L117:
            return r4
    }

    public final java.lang.String m(defpackage.pq5 r3) {
            r2 = this;
            java.lang.String r0 = r3.c
            boolean r1 = defpackage.qs6.v0(r0)
            if (r1 == 0) goto L1e
            uh7 r2 = r2.e
            android.net.Uri r0 = r3.d
            zl1 r2 = r2.a(r0)
            if (r2 == 0) goto L1b
            java.lang.String r2 = r2.i()
            if (r2 != 0) goto L19
            goto L1b
        L19:
            r0 = r2
            goto L1e
        L1b:
            java.lang.String r2 = r3.a
            goto L19
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = ".opts"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "opts"
            java.lang.String r2 = defpackage.qs6.F0(r0, r3, r2)
            return r2
    }

    public final defpackage.zl1 n(defpackage.pq5 r4) {
            r3 = this;
            uh7 r0 = r3.e     // Catch: java.lang.Throwable -> Lf
            kd6 r3 = r3.c     // Catch: java.lang.Throwable -> Lf
            ng6 r3 = (defpackage.ng6) r3     // Catch: java.lang.Throwable -> Lf
            android.net.Uri r3 = r3.u(r4)     // Catch: java.lang.Throwable -> Lf
            zl1 r3 = r0.b(r3)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r3 = move-exception
            em5 r0 = new em5
            r0.<init>(r3)
            r3 = r0
        L16:
            java.lang.Throwable r0 = defpackage.hm5.a(r3)
            if (r0 == 0) goto L31
            java.lang.String r4 = r4.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to resolve ROM options directory for "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "FSRomsRepository"
            android.util.Log.w(r1, r4, r0)
        L31:
            boolean r4 = r3 instanceof defpackage.em5
            if (r4 == 0) goto L36
            r3 = 0
        L36:
            zl1 r3 = (defpackage.zl1) r3
            return r3
    }

    public final defpackage.g21 o() {
            r3 = this;
            xd1 r0 = new xd1
            r1 = 0
            r2 = 15
            r0.<init>(r3, r1, r2)
            g21 r3 = new g21
            r1 = 7
            r3.<init>(r0, r1)
            return r3
    }

    public final boolean p(android.net.Uri r4) {
            r3 = this;
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = defpackage.nb3.k(r0, r1)
            r1 = 1
            if (r0 != 0) goto Le
            goto L5f
        Le:
            android.content.Context r3 = r3.a
            qi6 r0 = defpackage.zl1.h(r3, r4)
            boolean r0 = r0.a()
            if (r0 != r1) goto L1b
            goto L5f
        L1b:
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.util.List r3 = r3.getPersistedUriPermissions()
            r3.getClass()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L2d
            goto L60
        L2d:
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r3.next()
            android.content.UriPermission r0 = (android.content.UriPermission) r0
            boolean r2 = r0.isReadPermission()
            if (r2 == 0) goto L31
            android.net.Uri r2 = r0.getUri()
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 != 0) goto L5f
            android.net.Uri r0 = r0.getUri()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r4.toString()
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L31
        L5f:
            return r1
        L60:
            r3 = 0
            return r3
    }

    public final void q() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.n
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lf
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.m
            r0.clear()
        Lf:
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "rom_data.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L25
            r0.delete()
        L25:
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "rom_directory_state.json"
            r0.<init>(r1, r2)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L3b
            r0.delete()
        L3b:
            java.lang.Object r0 = r3.o
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r3.p     // Catch: java.lang.Throwable -> L55
            r1.clear()     // Catch: java.lang.Throwable -> L55
            java.util.LinkedHashMap r1 = r3.q     // Catch: java.lang.Throwable -> L55
            r1.clear()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r0)
            tp6 r3 = r3.r
            yt1 r0 = defpackage.yt1.A
            r3.getClass()
            r1 = 0
            r3.m(r1, r0)
            return
        L55:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void s(android.net.Uri r6, java.lang.Long r7) {
            r5 = this;
            java.lang.Object r0 = r5.o
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r5.q     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L18
            kw5 r3 = new kw5     // Catch: java.lang.Throwable -> L18
            jw5 r4 = defpackage.jw5.NOT_SCANNED     // Catch: java.lang.Throwable -> L18
            r3.<init>(r6, r7, r4)     // Catch: java.lang.Throwable -> L18
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L18
            r5.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return
        L18:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public final void t(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            boolean r2 = r1.u
            if (r2 == 0) goto Lc
        L6:
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.v
            r0 = 1
            r2.set(r0)
        Lc:
            of6 r2 = r1.k
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.m
            java.util.List r1 = defpackage.gt0.k1(r1)
            r2.k(r1)
            return
    }

    public final defpackage.jt5 u(defpackage.pq5 r9) {
            r8 = this;
            java.lang.String r0 = "Could not open "
            zl1 r1 = r8.n(r9)
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.String r3 = r8.m(r9)
            zl1 r1 = r1.f(r3)
            goto L13
        L12:
            r1 = r2
        L13:
            if (r1 != 0) goto L16
            return r2
        L16:
            android.content.Context r3 = r8.a     // Catch: java.lang.Throwable -> L4f
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L4f
            android.net.Uri r4 = r1.j()     // Catch: java.lang.Throwable -> L4f
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L61
            java.nio.charset.Charset r0 = defpackage.qm0.a     // Catch: java.lang.Throwable -> L4f
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r3, r0)     // Catch: java.lang.Throwable -> L4f
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4f
            r3 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L4f
            su2 r3 = r8.b     // Catch: java.lang.Throwable -> L51
            java.lang.Class<ob2> r4 = defpackage.ob2.class
            ie7 r5 = new ie7     // Catch: java.lang.Throwable -> L51
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = r3.c(r0, r5)     // Catch: java.lang.Throwable -> L51
            ob2 r3 = (defpackage.ob2) r3     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L53
            mt5 r3 = r3.a     // Catch: java.lang.Throwable -> L51
            jt5 r3 = r3.b()     // Catch: java.lang.Throwable -> L51
            r0.close()     // Catch: java.lang.Throwable -> L4f
            goto L7c
        L4f:
            r0 = move-exception
            goto L77
        L51:
            r3 = move-exception
            goto L5b
        L53:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "Empty ROM options"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L51
            throw r3     // Catch: java.lang.Throwable -> L51
        L5b:
            throw r3     // Catch: java.lang.Throwable -> L5c
        L5c:
            r4 = move-exception
            defpackage.ge7.t(r0, r3)     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.Throwable -> L4f
        L61:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4f
            android.net.Uri r4 = r1.j()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            throw r3     // Catch: java.lang.Throwable -> L4f
        L77:
            em5 r3 = new em5
            r3.<init>(r0)
        L7c:
            java.lang.Throwable r0 = defpackage.hm5.a(r3)
            if (r0 == 0) goto Lde
            java.lang.String r4 = "FSRomsRepository"
            java.lang.String r5 = r9.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to read ROM options for "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r4, r5, r0)
            android.net.Uri r0 = r1.j()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.util.LinkedHashSet r1 = r8.s
            monitor-enter(r1)
            java.util.LinkedHashSet r4 = r8.s     // Catch: java.lang.Throwable -> Ldb
            boolean r0 = r4.add(r0)     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r1)
            if (r0 != 0) goto Laf
            goto Lbb
        Laf:
            android.os.Handler r0 = r8.g
            n0 r1 = new n0
            r4 = 25
            r1.<init>(r8, r4)
            r0.post(r1)
        Lbb:
            boolean r0 = y(r9)
            if (r0 != 0) goto Lc2
            goto Lde
        Lc2:
            java.lang.String r0 = "FSRomsRepository"
            java.lang.String r1 = r9.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Rewriting unreadable ROM options from cached config for "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.i(r0, r1)
            r8.D(r9)
            goto Lde
        Ldb:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        Lde:
            boolean r8 = r3 instanceof defpackage.em5
            if (r8 == 0) goto Le3
            goto Le4
        Le3:
            r2 = r3
        Le4:
            jt5 r2 = (defpackage.jt5) r2
            return r2
    }

    public final defpackage.pq5 v(defpackage.pq5 r6) {
            r5 = this;
            jt5 r0 = r5.u(r6)
            if (r0 != 0) goto L7
            goto L11
        L7:
            pq5 r0 = r5.d(r6, r0)
            boolean r1 = defpackage.nb3.k(r0, r6)
            if (r1 == 0) goto L12
        L11:
            return r6
        L12:
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.m
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L19:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()
            pq5 r4 = (defpackage.pq5) r4
            boolean r4 = r4.b(r6)
            if (r4 == 0) goto L2c
            goto L30
        L2c:
            int r3 = r3 + 1
            goto L19
        L2f:
            r3 = -1
        L30:
            if (r3 < 0) goto L39
            r1.set(r3, r0)
            r6 = 1
            r5.t(r6)
        L39:
            return r0
    }

    public final void w() {
            r4 = this;
            java.lang.Object r0 = r4.o
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r4.p     // Catch: java.lang.Throwable -> L2e
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L2e
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r3 = 10
            int r3 = defpackage.ht0.v0(r1, r3)     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2e
        L1a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L2e
            kb2 r3 = (defpackage.kb2) r3     // Catch: java.lang.Throwable -> L2e
            lw5 r3 = r3.a()     // Catch: java.lang.Throwable -> L2e
            r2.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L1a
        L2e:
            r4 = move-exception
            goto L51
        L30:
            monitor-exit(r0)
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r4.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r3 = "rom_directory_state.json"
            r0.<init>(r1, r3)
            su2 r4 = r4.b     // Catch: java.lang.Exception -> L48
            java.lang.String r4 = r4.f(r2)     // Catch: java.lang.Exception -> L48
            E(r0, r4)     // Catch: java.lang.Exception -> L48
            return
        L48:
            r4 = move-exception
            java.lang.String r0 = "FSRomsRepository"
            java.lang.String r1 = "Failed to save ROM directory cache"
            android.util.Log.e(r0, r1, r4)
            return
        L51:
            monitor-exit(r0)
            throw r4
    }

    public final void x(java.util.List r15) {
            r14 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r14.a
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "rom_metadata_mirror.json"
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r15, r2)
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
        L1c:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r15.next()
            pq5 r2 = (defpackage.pq5) r2
            nb2 r3 = new nb2
            java.lang.String r4 = r2.a
            java.lang.String r5 = r2.b
            java.lang.String r6 = r2.c
            jt5 r7 = r2.f
            mt5 r7 = defpackage.mt5.a.a(r7)
            java.util.Date r8 = r2.g
            boolean r9 = r2.h
            java.lang.String r10 = r2.i
            long r11 = r2.j
            long r11 = defpackage.oq1.e(r11)
            boolean r13 = r2.k
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13)
            r1.add(r3)
            goto L1c
        L4b:
            su2 r14 = r14.b
            java.lang.String r14 = r14.f(r1)
            E(r0, r14)
            return
    }
}
