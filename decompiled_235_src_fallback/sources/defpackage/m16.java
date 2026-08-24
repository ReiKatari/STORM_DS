package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m16  reason: default package */
/* loaded from: classes.dex */
public abstract class m16 {
    public defpackage.o41 a;
    public defpackage.l61 b;
    public java.util.concurrent.Executor c;
    public defpackage.zb6 d;
    public defpackage.ai1 e;
    public defpackage.zb3 f;
    public final defpackage.u63 g;
    public boolean h;
    public final java.lang.ThreadLocal i;
    public final java.util.LinkedHashMap j;
    public boolean k;

    public m16() {
            r10 = this;
            r10.<init>()
            u63 r0 = new u63
            i4 r1 = new i4
            r8 = 0
            r9 = 9
            r2 = 0
            java.lang.Class<m16> r4 = defpackage.m16.class
            java.lang.String r5 = "onClosed"
            java.lang.String r6 = "onClosed()V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r1)
            r3.g = r0
            java.lang.ThreadLocal r10 = new java.lang.ThreadLocal
            r10.<init>()
            r3.i = r10
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            r3.j = r10
            r10 = 1
            r3.k = r10
            return
    }

    public final void a() {
            r1 = this;
            boolean r1 = r1.h
            if (r1 == 0) goto L5
            goto L18
        L5:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L19
        L18:
            return
        L19:
            java.lang.String r1 = "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."
            defpackage.i.m(r1)
            return
    }

    public final void b() {
            r4 = this;
            r4.a()
            r4.a()
            pu6 r0 = r4.h()
            vm2 r0 = r0.I()
            boolean r1 = r0.Y()
            if (r1 != 0) goto L23
            zb3 r4 = r4.g()
            a6 r1 = new a6
            r2 = 0
            r3 = 25
            r1.<init>(r4, r2, r3)
            defpackage.hi2.L(r1)
        L23:
            android.database.sqlite.SQLiteDatabase r4 = r0.A
            boolean r4 = r4.isWriteAheadLoggingEnabled()
            if (r4 == 0) goto L2f
            r0.h()
            return
        L2f:
            r0.e()
            return
    }

    public java.util.List c(java.util.LinkedHashMap r3) {
            r2 = this;
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r0 = r3.size()
            int r0 = defpackage.c14.k0(r0)
            r2.<init>(r0)
            java.util.Set r3 = r3.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            ar0 r1 = (defpackage.ar0) r1
            r1.getClass()
            java.lang.Class r1 = r1.a()
            r1.getClass()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L17
        L3b:
            yt1 r2 = defpackage.yt1.A
            return r2
    }

    public abstract defpackage.zb3 d();

    public defpackage.ts1 e() {
            r1 = this;
            tg4 r1 = new tg4
            r0 = 0
            r1.<init>(r0)
            throw r1
    }

    public final void f() {
            r2 = this;
            pu6 r0 = r2.h()
            vm2 r0 = r0.I()
            r0.n()
            boolean r0 = r2.l()
            if (r0 != 0) goto L1e
            zb3 r2 = r2.g()
            nc7 r0 = r2.b
            ns1 r1 = r2.e
            ns1 r2 = r2.f
            r0.e(r1, r2)
        L1e:
            return
    }

    public final defpackage.zb3 g() {
            r0 = this;
            zb3 r0 = r0.f
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "internalTracker"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final defpackage.pu6 h() {
            r1 = this;
            ai1 r1 = r1.e
            r0 = 0
            if (r1 == 0) goto L12
            java.lang.Object r1 = r1.h
            pu6 r1 = (defpackage.pu6) r1
            if (r1 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r1 = "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."
            defpackage.i.m(r1)
            return r0
        L12:
            java.lang.String r1 = "connectionManager"
            defpackage.nb3.a0(r1)
            throw r0
    }

    public java.util.Set i() {
            r2 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            du1 r1 = defpackage.du1.A
            int r0 = defpackage.ht0.v0(r1, r0)
            r2.<init>(r0)
            java.util.Set r2 = defpackage.gt0.p1(r2)
            return r2
    }

    public java.util.LinkedHashMap j() {
            r1 = this;
            du1 r1 = defpackage.du1.A
            r0 = 10
            int r1 = defpackage.ht0.v0(r1, r0)
            int r1 = defpackage.c14.k0(r1)
            r0 = 16
            if (r1 >= r0) goto L11
            r1 = r0
        L11:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }

    public final boolean k() {
            r0 = this;
            ai1 r0 = r0.e
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.h
            pu6 r0 = (defpackage.pu6) r0
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
        Le:
            java.lang.String r0 = "connectionManager"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final boolean l() {
            r1 = this;
            boolean r0 = r1.n()
            if (r0 == 0) goto L16
            pu6 r1 = r1.h()
            vm2 r1 = r1.I()
            boolean r1 = r1.Y()
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public final void m(defpackage.e36 r5) {
            r4 = this;
            r5.getClass()
            zb3 r4 = r4.g()
            nc7 r0 = r4.b
            r0.getClass()
            java.lang.String r1 = "PRAGMA query_only"
            j36 r1 = r5.i0(r1)
            r1.f0()     // Catch: java.lang.Throwable -> L5d
            boolean r2 = r1.z()     // Catch: java.lang.Throwable -> L5d
            r3 = 0
            defpackage.lb4.p(r1, r3)
            if (r2 != 0) goto L58
            java.lang.String r1 = "PRAGMA temp_store = MEMORY"
            defpackage.ii2.s(r5, r1)
            java.lang.String r1 = "PRAGMA recursive_triggers = 1"
            defpackage.ii2.s(r5, r1)
            java.lang.String r1 = "DROP TABLE IF EXISTS room_table_modification_log"
            defpackage.ii2.s(r5, r1)
            boolean r1 = r0.d
            if (r1 == 0) goto L38
            java.lang.String r1 = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            defpackage.ii2.s(r5, r1)
            goto L45
        L38:
            java.lang.String r1 = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            java.lang.String r2 = "TEMP"
            java.lang.String r3 = ""
            java.lang.String r1 = defpackage.xs6.e0(r1, r2, r3)
            defpackage.ii2.s(r5, r1)
        L45:
            di4 r5 = r0.h
            java.util.concurrent.locks.ReentrantLock r0 = r5.a
            r0.lock()
            r1 = 1
            r5.d = r1     // Catch: java.lang.Throwable -> L53
            r0.unlock()
            goto L58
        L53:
            r4 = move-exception
            r0.unlock()
            throw r4
        L58:
            java.lang.Object r4 = r4.g
            monitor-enter(r4)
            monitor-exit(r4)
            return
        L5d:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L5f
        L5f:
            r5 = move-exception
            defpackage.lb4.p(r1, r4)
            throw r5
    }

    public final boolean n() {
            r0 = this;
            ai1 r0 = r0.e
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.i
            vm2 r0 = (defpackage.vm2) r0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isOpen()
            return r0
        Lf:
            r0 = 0
            return r0
        L11:
            java.lang.String r0 = "connectionManager"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }

    public final java.lang.Object o(defpackage.on2 r3) {
            r2 = this;
            boolean r0 = r2.k()
            if (r0 == 0) goto L19
            r2.b()
            java.lang.Object r3 = r3.c()     // Catch: java.lang.Throwable -> L14
            r2.p()     // Catch: java.lang.Throwable -> L14
            r2.f()
            return r3
        L14:
            r3 = move-exception
            r2.f()
            throw r3
        L19:
            mn0 r0 = new mn0
            r1 = 6
            r0.<init>(r1, r3)
            r3 = 0
            r1 = 1
            java.lang.Object r2 = defpackage.hv.Q(r2, r3, r1, r0)
            return r2
    }

    public final void p() {
            r0 = this;
            pu6 r0 = r0.h()
            vm2 r0 = r0.I()
            r0.D()
            return
    }

    public final java.lang.Object q(boolean r1, defpackage.eo2 r2, defpackage.s41 r3) {
            r0 = this;
            ai1 r0 = r0.e
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.g
            qz0 r0 = (defpackage.qz0) r0
            java.lang.Object r0 = r0.s(r1, r2, r3)
            return r0
        Ld:
            java.lang.String r0 = "connectionManager"
            defpackage.nb3.a0(r0)
            r0 = 0
            throw r0
    }
}
