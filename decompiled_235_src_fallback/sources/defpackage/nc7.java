package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc7  reason: default package */
/* loaded from: classes.dex */
public final class nc7 {
    public static final java.lang.String[] l = null;
    public final defpackage.m16 a;
    public final java.util.LinkedHashMap b;
    public final java.util.LinkedHashMap c;
    public final boolean d;
    public final defpackage.a0 e;
    public final java.util.LinkedHashMap f;
    public final java.lang.String[] g;
    public final defpackage.di4 h;
    public final defpackage.s63 i;
    public final java.util.concurrent.atomic.AtomicBoolean j;
    public defpackage.on2 k;

    static {
            java.lang.String r0 = "UPDATE"
            java.lang.String r1 = "DELETE"
            java.lang.String r2 = "INSERT"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            defpackage.nc7.l = r0
            return
    }

    public nc7(defpackage.m16 r3, java.util.LinkedHashMap r4, java.util.LinkedHashMap r5, java.lang.String[] r6, boolean r7, defpackage.a0 r8) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r7
            r2.e = r8
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 0
            r3.<init>(r4)
            r2.j = r3
            kt5 r3 = new kt5
            r5 = 16
            r3.<init>(r5)
            r2.k = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.f = r3
            int r3 = r6.length
            java.lang.String[] r5 = new java.lang.String[r3]
        L28:
            if (r4 >= r3) goto L5c
            r7 = r6[r4]
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            r7.getClass()
            java.util.LinkedHashMap r0 = r2.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r1)
            java.util.LinkedHashMap r0 = r2.b
            r1 = r6[r4]
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L52
            java.lang.String r8 = r0.toLowerCase(r8)
            r8.getClass()
            goto L53
        L52:
            r8 = 0
        L53:
            if (r8 != 0) goto L56
            goto L57
        L56:
            r7 = r8
        L57:
            r5[r4] = r7
            int r4 = r4 + 1
            goto L28
        L5c:
            r2.g = r5
            java.util.LinkedHashMap r3 = r2.b
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L68:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            r5.getClass()
            java.util.LinkedHashMap r7 = r2.f
            boolean r7 = r7.containsKey(r5)
            if (r7 == 0) goto L68
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.toLowerCase(r6)
            r4.getClass()
            java.util.LinkedHashMap r6 = r2.f
            java.lang.Object r5 = defpackage.c14.j0(r6, r5)
            r6.put(r4, r5)
            goto L68
        La2:
            di4 r3 = new di4
            java.lang.String[] r4 = r2.g
            int r4 = r4.length
            r3.<init>(r4)
            r2.h = r3
            s63 r3 = new s63
            java.lang.String[] r4 = r2.g
            int r4 = r4.length
            r3.<init>(r4)
            r2.i = r3
            return
    }

    public static final java.lang.Object a(defpackage.nc7 r4, defpackage.jz4 r5, defpackage.s41 r6) {
            boolean r0 = r6 instanceof defpackage.ec7
            if (r0 == 0) goto L13
            r0 = r6
            ec7 r0 = (defpackage.ec7) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ec7 r0 = new ec7
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.X
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.R
            java.util.Set r5 = (java.util.Set) r5
            defpackage.oi2.Y(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.R
            jz4 r5 = (defpackage.jz4) r5
            defpackage.oi2.Y(r4)
            goto L54
        L3d:
            defpackage.oi2.Y(r4)
            h37 r4 = new h37
            r1 = 10
            r4.<init>(r1)
            r0.R = r5
            r0.Z = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r1, r4, r0)
            if (r4 != r6) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6c
            r0.R = r4
            r0.Z = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.qo2.v(r5, r1, r0)
            if (r5 != r6) goto L6c
        L6b:
            return r6
        L6c:
            return r4
    }

    public static final java.lang.Object b(defpackage.nc7 r11, defpackage.s41 r12) {
            m16 r0 = r11.a
            boolean r1 = r12 instanceof defpackage.gc7
            if (r1 == 0) goto L15
            r1 = r12
            gc7 r1 = (defpackage.gc7) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            gc7 r1 = new gc7
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L36
            if (r3 != r6) goto L30
            u63 r0 = r1.R
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L2d
            goto L74
        L2d:
            r11 = move-exception
            goto Lc5
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r4
        L36:
            defpackage.oi2.Y(r12)
            u63 r12 = r0.g
            boolean r3 = r12.g()
            du1 r7 = defpackage.du1.A
            if (r3 == 0) goto Lc9
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.j     // Catch: java.lang.Throwable -> Lc3
            boolean r3 = r3.compareAndSet(r6, r5)     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto L4f
            r12.I()
            return r7
        L4f:
            on2 r3 = r11.k     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r3 = r3.c()     // Catch: java.lang.Throwable -> Lc3
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lc3
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto L61
            r12.I()
            return r7
        L61:
            hc7 r3 = new hc7     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r11, r4, r6)     // Catch: java.lang.Throwable -> Lc3
            r1.R = r12     // Catch: java.lang.Throwable -> Lc3
            r1.Z = r6     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r0 = r0.q(r5, r3, r1)     // Catch: java.lang.Throwable -> Lc3
            if (r0 != r2) goto L71
            return r2
        L71:
            r10 = r0
            r0 = r12
            r12 = r10
        L74:
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L2d
            r1 = r12
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto Lbf
            s63 r1 = r11.i     // Catch: java.lang.Throwable -> L2d
            r1.getClass()     // Catch: java.lang.Throwable -> L2d
            r12.getClass()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r12.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L8e
            goto Lba
        L8e:
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L2d
            tp6 r1 = (defpackage.tp6) r1     // Catch: java.lang.Throwable -> L2d
        L92:
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L2d
            r3 = r2
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L2d
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2d
            int[] r7 = new int[r4]     // Catch: java.lang.Throwable -> L2d
            r8 = r5
        L9d:
            if (r8 >= r4) goto Lb4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2d
            boolean r9 = r12.contains(r9)     // Catch: java.lang.Throwable -> L2d
            if (r9 == 0) goto Lad
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L2d
            int r9 = r9 + r6
            goto Laf
        Lad:
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L2d
        Laf:
            r7[r8] = r9     // Catch: java.lang.Throwable -> L2d
            int r8 = r8 + 1
            goto L9d
        Lb4:
            boolean r2 = r1.j(r2, r7)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L92
        Lba:
            a0 r11 = r11.e     // Catch: java.lang.Throwable -> L2d
            r11.g(r12)     // Catch: java.lang.Throwable -> L2d
        Lbf:
            r0.I()
            return r12
        Lc3:
            r11 = move-exception
            r0 = r12
        Lc5:
            r0.I()
            throw r11
        Lc9:
            return r7
    }

    public static final java.lang.Object c(defpackage.nc7 r17, defpackage.d97 r18, int r19, defpackage.s41 r20) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r0.getClass()
            boolean r4 = r3 instanceof defpackage.ic7
            if (r4 == 0) goto L1e
            r4 = r3
            ic7 r4 = (defpackage.ic7) r4
            int r5 = r4.h0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1e
            int r5 = r5 - r6
            r4.h0 = r5
            goto L23
        L1e:
            ic7 r4 = new ic7
            r4.<init>(r0, r3)
        L23:
            java.lang.Object r3 = r4.f0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.h0
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L58
            if (r6 == r8) goto L4b
            if (r6 != r7) goto L44
            int r1 = r4.e0
            int r2 = r4.d0
            int r6 = r4.Z
            java.lang.String[] r9 = r4.Y
            java.lang.String r10 = r4.X
            jz4 r11 = r4.R
            defpackage.oi2.Y(r3)
            r20 = r8
            goto Ldb
        L44:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L4b:
            int r1 = r4.Z
            jz4 r2 = r4.R
            defpackage.oi2.Y(r3)
            r16 = r2
            r2 = r1
            r1 = r16
            goto L7b
        L58:
            defpackage.oi2.Y(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            r3.<init>(r6)
            r3.append(r2)
            java.lang.String r6 = ", 0)"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4.R = r1
            r4.Z = r2
            r4.h0 = r8
            java.lang.Object r3 = defpackage.qo2.v(r1, r3, r4)
            if (r3 != r5) goto L7b
            goto Lda
        L7b:
            java.lang.String[] r3 = r0.g
            r3 = r3[r2]
            java.lang.String[] r6 = defpackage.nc7.l
            r9 = 0
            r10 = 3
            r11 = r6
            r6 = r2
            r2 = r9
            r9 = r11
            r11 = r1
            r1 = r10
            r10 = r3
        L8a:
            if (r2 >= r1) goto Le0
            r3 = r9[r2]
            boolean r12 = r0.d
            if (r12 == 0) goto L95
            java.lang.String r12 = "TEMP"
            goto L97
        L95:
            java.lang.String r12 = ""
        L97:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "room_table_modification_trigger_"
            r13.<init>(r14)
            r13.append(r10)
            r14 = 95
            r13.append(r14)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = " TRIGGER IF NOT EXISTS `"
            java.lang.String r15 = "` AFTER "
            r20 = r8
            java.lang.String r8 = "CREATE "
            java.lang.StringBuilder r8 = defpackage.i61.u(r8, r12, r14, r13, r15)
            java.lang.String r12 = " ON `"
            java.lang.String r13 = "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "
            defpackage.i61.B(r8, r3, r12, r10, r13)
            java.lang.String r3 = " AND invalidated = 0; END"
            java.lang.String r3 = defpackage.lb1.o(r8, r6, r3)
            r4.R = r11
            r4.X = r10
            r4.Y = r9
            r4.Z = r6
            r4.d0 = r2
            r4.e0 = r1
            r4.h0 = r7
            java.lang.Object r3 = defpackage.qo2.v(r11, r3, r4)
            if (r3 != r5) goto Ldb
        Lda:
            return r5
        Ldb:
            int r2 = r2 + 1
            r8 = r20
            goto L8a
        Le0:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public static final java.lang.Object d(defpackage.nc7 r8, defpackage.d97 r9, int r10, defpackage.s41 r11) {
            r8.getClass()
            boolean r0 = r11 instanceof defpackage.jc7
            if (r0 == 0) goto L16
            r0 = r11
            jc7 r0 = (defpackage.jc7) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.g0 = r1
            goto L1b
        L16:
            jc7 r0 = new jc7
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.e0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.g0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            int r8 = r0.d0
            int r9 = r0.Z
            java.lang.String[] r10 = r0.Y
            java.lang.String r2 = r0.X
            jz4 r4 = r0.R
            defpackage.oi2.Y(r11)
            r11 = r10
            r10 = r4
            goto L84
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L3d:
            defpackage.oi2.Y(r11)
            java.lang.String[] r8 = r8.g
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.nc7.l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4f:
            if (r9 >= r8) goto L86
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = defpackage.i61.k(r6, r5, r4)
            r0.R = r10
            r0.X = r2
            r0.Y = r11
            r0.Z = r9
            r0.d0 = r8
            r0.g0 = r3
            java.lang.Object r4 = defpackage.qo2.v(r10, r4, r0)
            if (r4 != r1) goto L84
            return r1
        L84:
            int r9 = r9 + r3
            goto L4f
        L86:
            jg7 r8 = defpackage.jg7.a
            return r8
    }

    public final void e(defpackage.on2 r5, defpackage.on2 r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.j
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L33
            r5.c()
            m16 r5 = r4.a
            o41 r5 = r5.a
            r0 = 0
            if (r5 == 0) goto L2d
            r61 r1 = new r61
            java.lang.String r2 = "Room Invalidation Tracker Refresh"
            r1.<init>(r2)
            bf4 r2 = new bf4
            r3 = 23
            r2.<init>(r4, r6, r0, r3)
            r4 = 2
            defpackage.hv.L(r5, r1, r0, r2, r4)
            return
        L2d:
            java.lang.String r4 = "coroutineScope"
            defpackage.nb3.a0(r4)
            throw r0
        L33:
            return
    }

    public final java.lang.Object f(defpackage.s41 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.kc7
            if (r0 == 0) goto L13
            r0 = r8
            kc7 r0 = (defpackage.kc7) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kc7 r0 = new kc7
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            u63 r7 = r0.R
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r8 = move-exception
            goto L59
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r3
        L32:
            defpackage.oi2.Y(r8)
            m16 r8 = r7.a
            u63 r2 = r8.g
            boolean r5 = r2.g()
            if (r5 == 0) goto L5d
            vy5 r5 = new vy5     // Catch: java.lang.Throwable -> L57
            r6 = 16
            r5.<init>(r7, r3, r6)     // Catch: java.lang.Throwable -> L57
            r0.R = r2     // Catch: java.lang.Throwable -> L57
            r0.Z = r4     // Catch: java.lang.Throwable -> L57
            r7 = 0
            java.lang.Object r7 = r8.q(r7, r5, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 != r1) goto L52
            return r1
        L52:
            r7 = r2
        L53:
            r7.I()
            goto L5d
        L57:
            r8 = move-exception
            r7 = r2
        L59:
            r7.I()
            throw r8
        L5d:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
