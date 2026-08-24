package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw7  reason: default package */
/* loaded from: classes.dex */
public final class lw7 {
    public static defpackage.lw7 k;
    public static defpackage.lw7 l;
    public static final java.lang.Object m = null;
    public final android.content.Context a;
    public final defpackage.az0 b;
    public final androidx.work.impl.WorkDatabase c;
    public final defpackage.ow7 d;
    public final java.util.List e;
    public final defpackage.o35 f;
    public final defpackage.k13 g;
    public boolean h;
    public android.content.BroadcastReceiver.PendingResult i;
    public final defpackage.w87 j;

    static {
            java.lang.String r0 = "WorkManagerImpl"
            defpackage.ga0.h(r0)
            r0 = 0
            defpackage.lw7.k = r0
            defpackage.lw7.l = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.lw7.m = r0
            return
    }

    public lw7(android.content.Context r7, defpackage.az0 r8, defpackage.ow7 r9, androidx.work.impl.WorkDatabase r10, java.util.List r11, defpackage.o35 r12, defpackage.w87 r13) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.h = r0
            android.content.Context r7 = r7.getApplicationContext()
            boolean r1 = r7.isDeviceProtectedStorage()
            r2 = 0
            if (r1 != 0) goto La7
            ga0 r1 = new ga0
            int r3 = r8.h
            r4 = 2
            r1.<init>(r3, r4)
            java.lang.Object r3 = defpackage.ga0.e
            monitor-enter(r3)
            ga0 r5 = defpackage.ga0.f     // Catch: java.lang.Throwable -> L23
            if (r5 != 0) goto L26
            defpackage.ga0.f = r1     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r6 = move-exception
            goto La5
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            r6.a = r7
            r6.d = r9
            r6.c = r10
            r6.f = r12
            r6.j = r13
            r6.b = r8
            r6.e = r11
            n61 r13 = r9.b
            r13.getClass()
            o41 r13 = defpackage.g04.i(r13)
            k13 r1 = new k13
            r3 = 1
            r1.<init>(r10, r3)
            r6.g = r1
            zb6 r1 = r9.a
            java.lang.String r3 = defpackage.h66.a
            g66 r3 = new g66
            r3.<init>(r1, r11, r8, r10)
            r12.a(r3)
            vj2 r11 = new vj2
            r11.<init>(r7, r6)
            zb6 r6 = r9.a
            r6.execute(r11)
            java.lang.String r6 = defpackage.hg7.a
            boolean r6 = defpackage.l35.a(r7, r8)
            if (r6 == 0) goto La4
            dx7 r6 = r10.w()
            m16 r6 = r6.a
            java.lang.String r8 = "workspec"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            rk7 r9 = new rk7
            r10 = 19
            r9.<init>(r10)
            ng2 r6 = defpackage.yv7.a(r6, r0, r8, r9)
            gg7 r8 = new gg7
            r9 = 4
            r8.<init>(r9, r2)
            wp0 r9 = new wp0
            r9.<init>(r4, r6, r8)
            r6 = -1
            le2 r6 = defpackage.f04.o(r9, r6)
            le2 r6 = defpackage.f04.z(r6)
            lo0 r8 = new lo0
            r9 = 3
            r8.<init>(r7, r2, r9)
            cf2 r7 = new cf2
            r7.<init>(r6, r8, r4)
            a6 r6 = new a6
            r8 = 20
            r6.<init>(r7, r2, r8)
            defpackage.hv.L(r13, r2, r2, r6, r9)
        La4:
            return
        La5:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r6
        La7:
            java.lang.String r6 = "Cannot initialize WorkManager in direct boot mode"
            defpackage.i.m(r6)
            throw r2
    }

    public static defpackage.lw7 b(android.content.Context r5) {
            java.lang.Object r0 = defpackage.lw7.m
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L37
            lw7 r1 = defpackage.lw7.k     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            goto Lf
        La:
            r5 = move-exception
            goto L4a
        Lc:
            lw7 r1 = defpackage.lw7.l     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
        Lf:
            if (r1 != 0) goto L48
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L37
            boolean r1 = r5 instanceof me.magnum.melonds.MelonDSApplication     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L40
            r1 = r5
            me.magnum.melonds.MelonDSApplication r1 = (me.magnum.melonds.MelonDSApplication) r1     // Catch: java.lang.Throwable -> L37
            os0 r2 = new os0     // Catch: java.lang.Throwable -> L37
            r3 = 26
            r4 = 0
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L37
            rx2 r1 = r1.L     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            r2.B = r1     // Catch: java.lang.Throwable -> L37
            az0 r1 = new az0     // Catch: java.lang.Throwable -> L37
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L37
            d(r5, r1)     // Catch: java.lang.Throwable -> L37
            lw7 r1 = b(r5)     // Catch: java.lang.Throwable -> L37
            goto L48
        L37:
            r5 = move-exception
            goto L4c
        L39:
            java.lang.String r5 = "workerFactory"
            defpackage.nb3.a0(r5)     // Catch: java.lang.Throwable -> L37
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L37
        L40:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L37
            throw r5     // Catch: java.lang.Throwable -> L37
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r1
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r5     // Catch: java.lang.Throwable -> L37
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r5
    }

    public static void d(android.content.Context r3, defpackage.az0 r4) {
            java.lang.Object r0 = defpackage.lw7.m
            monitor-enter(r0)
            lw7 r1 = defpackage.lw7.k     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            lw7 r2 = defpackage.lw7.l     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            goto L2c
        L16:
            if (r1 != 0) goto L2a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            lw7 r1 = defpackage.lw7.l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            lw7 r3 = defpackage.nw7.U(r3, r4)     // Catch: java.lang.Throwable -> L14
            defpackage.lw7.l = r3     // Catch: java.lang.Throwable -> L14
        L26:
            lw7 r3 = defpackage.lw7.l     // Catch: java.lang.Throwable -> L14
            defpackage.lw7.k = r3     // Catch: java.lang.Throwable -> L14
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
    }

    public final void a(java.lang.String r2, defpackage.y72 r3, defpackage.gm4 r4) {
            r1 = this;
            r3.getClass()
            java.util.List r4 = defpackage.hf.b0(r4)
            aw7 r0 = new aw7
            r0.<init>(r1, r2, r3, r4)
            r0.a()
            return
    }

    public final defpackage.le2 c(java.lang.String r7) {
            r6 = this;
            androidx.work.impl.WorkDatabase r0 = r6.c
            dx7 r0 = r0.w()
            ow7 r6 = r6.d
            n61 r6 = r6.b
            r0.getClass()
            r6.getClass()
            m16 r1 = r0.a
            java.lang.String r2 = "workspec"
            java.lang.String r3 = "workname"
            java.lang.String r4 = "WorkTag"
            java.lang.String r5 = "WorkProgress"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r2, r3}
            ja7 r3 = new ja7
            r4 = 11
            r3.<init>(r4, r7, r0)
            r7 = 1
            ng2 r0 = defpackage.yv7.a(r1, r7, r2, r3)
            a16 r1 = new a16
            r1.<init>(r0, r7)
            le2 r7 = defpackage.f04.z(r1)
            le2 r6 = defpackage.f04.E(r7, r6)
            return r6
    }

    public final void e() {
            r2 = this;
            java.lang.Object r0 = defpackage.lw7.m
            monitor-enter(r0)
            r1 = 1
            r2.h = r1     // Catch: java.lang.Throwable -> L11
            android.content.BroadcastReceiver$PendingResult r1 = r2.i     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            r1.finish()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            r2.i = r1     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r2 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public final void f() {
            r4 = this;
            az0 r0 = r4.b
            xd5 r0 = r0.m
            java.lang.String r1 = "ReschedulingWork"
            oj0 r2 = new oj0
            r3 = 1
            r2.<init>(r4, r3)
            r0.getClass()
            boolean r4 = defpackage.ln2.H()
            if (r4 == 0) goto L1c
            java.lang.String r0 = defpackage.ln2.f0(r1)     // Catch: java.lang.Throwable -> L25
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L25
        L1c:
            r2.c()     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L24
            android.os.Trace.endSection()
        L24:
            return
        L25:
            r0 = move-exception
            if (r4 == 0) goto L2b
            android.os.Trace.endSection()
        L2b:
            throw r0
    }
}
