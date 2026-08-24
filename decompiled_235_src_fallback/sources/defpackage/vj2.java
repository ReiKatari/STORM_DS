package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vj2  reason: default package */
/* loaded from: classes.dex */
public final class vj2 implements java.lang.Runnable {
    public static final java.lang.String X = null;
    public static final long Y = 0;
    public final android.content.Context A;
    public final defpackage.lw7 B;
    public final defpackage.k13 L;
    public int R;

    static {
            java.lang.String r0 = "ForceStopRunnable"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.vj2.X = r0
            r0 = 315360000000(0x496cebb800, double:1.558085420725E-312)
            defpackage.vj2.Y = r0
            return
    }

    public vj2(android.content.Context r1, defpackage.lw7 r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.A = r1
            r0.B = r2
            k13 r1 = r2.g
            r0.L = r1
            r1 = 0
            r0.R = r1
            return
    }

    public static void c(android.content.Context r5) {
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.AlarmManager r0 = (android.app.AlarmManager) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L11
            r1 = 167772160(0xa000000, float:6.162976E-33)
            goto L13
        L11:
            r1 = 134217728(0x8000000, float:3.85186E-34)
        L13:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r4 = androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class
            r3.<init>(r5, r4)
            r2.setComponent(r3)
            java.lang.String r3 = "ACTION_FORCE_STOP_RESCHEDULE"
            r2.setAction(r3)
            r3 = -1
            android.app.PendingIntent r5 = android.app.PendingIntent.getBroadcast(r5, r3, r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = defpackage.vj2.Y
            long r1 = r1 + r3
            if (r0 == 0) goto L39
            r3 = 0
            r0.setExact(r3, r1, r5)
        L39:
            return
    }

    public final void a() {
            r19 = this;
            r0 = r19
            java.lang.String r1 = "last_force_stop_ms"
            k13 r2 = r0.L
            lw7 r3 = r0.B
            androidx.work.impl.WorkDatabase r4 = r3.c
            az0 r5 = r3.b
            k13 r6 = r3.g
            androidx.work.impl.WorkDatabase r7 = r3.c
            java.lang.String r8 = defpackage.ux6.Y
            android.content.Context r0 = r0.A
            android.app.job.JobScheduler r8 = defpackage.vc3.a(r0)
            java.util.ArrayList r9 = defpackage.ux6.b(r0, r8)
            px6 r10 = r4.t()
            m16 r10 = r10.a
            r76 r11 = new r76
            r12 = 20
            r11.<init>(r12)
            r12 = 1
            r13 = 0
            java.lang.Object r10 = defpackage.hv.Q(r10, r12, r13, r11)
            java.util.List r10 = (java.util.List) r10
            if (r9 == 0) goto L38
            int r11 = r9.size()
            goto L39
        L38:
            r11 = r13
        L39:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r11)
            if (r9 == 0) goto L6a
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L6a
            int r11 = r9.size()
            r15 = r13
        L4b:
            if (r15 >= r11) goto L6a
            java.lang.Object r16 = r9.get(r15)
            int r15 = r15 + 1
            android.app.job.JobInfo r16 = (android.app.job.JobInfo) r16
            gw7 r12 = defpackage.ux6.f(r16)
            if (r12 == 0) goto L61
            java.lang.String r12 = r12.a
            r14.add(r12)
            goto L68
        L61:
            int r12 = r16.getId()
            defpackage.ux6.a(r8, r12)
        L68:
            r12 = 1
            goto L4b
        L6a:
            java.util.Iterator r8 = r10.iterator()
        L6e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r14.contains(r9)
            if (r9 != 0) goto L6e
            ga0 r8 = defpackage.ga0.f()
            java.lang.String r9 = defpackage.ux6.Y
            java.lang.String r11 = "Reconciling jobs"
            r8.b(r9, r11)
            r8 = 1
            goto L8e
        L8d:
            r8 = r13
        L8e:
            r11 = -1
            if (r8 == 0) goto Lba
            r4.b()
            dx7 r9 = r4.w()     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Lad
        L9d:
            boolean r14 = r10.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r14 == 0) goto Laf
            java.lang.Object r14 = r10.next()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lad
            r9.e(r11, r14)     // Catch: java.lang.Throwable -> Lad
            goto L9d
        Lad:
            r0 = move-exception
            goto Lb6
        Laf:
            r4.p()     // Catch: java.lang.Throwable -> Lad
            r4.f()
            goto Lba
        Lb6:
            r4.f()
            throw r0
        Lba:
            dx7 r4 = r7.w()
            sw7 r9 = r7.v()
            r7.b()
            m16 r10 = r4.a     // Catch: java.lang.Throwable -> Ldf
            rk7 r14 = new rk7     // Catch: java.lang.Throwable -> Ldf
            r15 = 16
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Ldf
            r15 = 1
            java.lang.Object r10 = defpackage.hv.Q(r10, r15, r13, r14)     // Catch: java.lang.Throwable -> Ldf
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> Ldf
            if (r10 == 0) goto Le2
            boolean r14 = r10.isEmpty()     // Catch: java.lang.Throwable -> Ldf
            if (r14 != 0) goto Le2
            r14 = 1
            goto Le3
        Ldf:
            r0 = move-exception
            goto L23b
        Le2:
            r14 = r13
        Le3:
            if (r14 == 0) goto L106
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Ldf
        Le9:
            boolean r15 = r10.hasNext()     // Catch: java.lang.Throwable -> Ldf
            if (r15 == 0) goto L106
            java.lang.Object r15 = r10.next()     // Catch: java.lang.Throwable -> Ldf
            yw7 r15 = (defpackage.yw7) r15     // Catch: java.lang.Throwable -> Ldf
            iw7 r13 = defpackage.iw7.ENQUEUED     // Catch: java.lang.Throwable -> Ldf
            java.lang.String r15 = r15.a     // Catch: java.lang.Throwable -> Ldf
            r4.h(r13, r15)     // Catch: java.lang.Throwable -> Ldf
            r13 = -512(0xfffffffffffffe00, float:NaN)
            r4.i(r13, r15)     // Catch: java.lang.Throwable -> Ldf
            r4.e(r11, r15)     // Catch: java.lang.Throwable -> Ldf
            r13 = 0
            goto Le9
        L106:
            m16 r4 = r9.a     // Catch: java.lang.Throwable -> Ldf
            rk7 r9 = new rk7     // Catch: java.lang.Throwable -> Ldf
            r10 = 14
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Ldf
            r10 = 0
            r15 = 1
            defpackage.hv.Q(r4, r10, r15, r9)     // Catch: java.lang.Throwable -> Ldf
            r7.p()     // Catch: java.lang.Throwable -> Ldf
            r7.f()
            if (r14 != 0) goto L121
            if (r8 == 0) goto L11f
            goto L121
        L11f:
            r15 = 0
            goto L122
        L121:
            r15 = 1
        L122:
            androidx.work.impl.WorkDatabase r4 = r6.a
            c15 r4 = r4.s()
            java.lang.String r8 = "reschedule_needed"
            java.lang.Long r4 = r4.a(r8)
            r9 = 5
            r10 = 0
            java.lang.String r12 = defpackage.vj2.X
            if (r4 == 0) goto L16a
            long r13 = r4.longValue()
            r17 = 1
            int r4 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r4 != 0) goto L16a
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = "Rescheduling Workers."
            r0.b(r12, r1)
            r3.f()
            r6.getClass()
            b15 r0 = new b15
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0.<init>(r8, r1)
            androidx.work.impl.WorkDatabase r1 = r6.a
            c15 r1 = r1.s()
            m16 r2 = r1.a
            qk4 r3 = new qk4
            r3.<init>(r9, r1, r0)
            r10 = 0
            r15 = 1
            defpackage.hv.Q(r2, r10, r15, r3)
            return
        L16a:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            r6 = 31
            if (r4 < r6) goto L173
            r6 = 570425344(0x22000000, float:1.7347235E-18)
            goto L175
        L173:
            r6 = 536870912(0x20000000, float:1.0842022E-19)
        L175:
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            r8.<init>()     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r14 = androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class
            r13.<init>(r0, r14)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            r8.setComponent(r13)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            java.lang.String r13 = "ACTION_FORCE_STOP_RESCHEDULE"
            r8.setAction(r13)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            r13 = -1
            android.app.PendingIntent r6 = android.app.PendingIntent.getBroadcast(r0, r13, r8, r6)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            r8 = 30
            if (r4 < r8) goto L1e3
            if (r6 == 0) goto L19c
            r6.cancel()     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            goto L19c
        L198:
            r0 = move-exception
            goto L1fa
        L19a:
            r0 = move-exception
            goto L1fa
        L19c:
            java.lang.String r4 = "activity"
            java.lang.Object r0 = r0.getSystemService(r4)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            java.util.List r0 = defpackage.m2.q(r0)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            if (r0 == 0) goto L1e9
            boolean r4 = r0.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            if (r4 != 0) goto L1e9
            androidx.work.impl.WorkDatabase r4 = r2.a     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            c15 r4 = r4.s()     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            java.lang.Long r4 = r4.a(r1)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            if (r4 == 0) goto L1c0
            long r10 = r4.longValue()     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
        L1c0:
            r4 = 0
        L1c1:
            int r6 = r0.size()     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            if (r4 >= r6) goto L1e9
            java.lang.Object r6 = r0.get(r4)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            android.app.ApplicationExitInfo r6 = defpackage.m2.d(r6)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            int r8 = defpackage.m2.b(r6)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            r13 = 10
            if (r8 != r13) goto L1e0
            long r13 = defpackage.m2.c(r6)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 < 0) goto L1e0
            goto L207
        L1e0:
            int r4 = r4 + 1
            goto L1c1
        L1e3:
            if (r6 != 0) goto L1e9
            c(r0)     // Catch: java.lang.IllegalArgumentException -> L198 java.lang.SecurityException -> L19a
            goto L207
        L1e9:
            if (r15 == 0) goto L1f9
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = "Found unfinished work, scheduling it."
            r0.b(r12, r1)
            java.util.List r0 = r3.e
            defpackage.h66.b(r5, r7, r0)
        L1f9:
            return
        L1fa:
            ga0 r4 = defpackage.ga0.f()
            int r4 = r4.b
            if (r4 > r9) goto L207
            java.lang.String r4 = "Ignoring exception"
            android.util.Log.w(r12, r4, r0)
        L207:
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r4 = "Application was force-stopped, rescheduling."
            r0.b(r12, r4)
            r3.f()
            q61 r0 = r5.d
            r0.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r2.getClass()
            b15 r0 = new b15
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.<init>(r1, r3)
            androidx.work.impl.WorkDatabase r1 = r2.a
            c15 r1 = r1.s()
            m16 r2 = r1.a
            qk4 r3 = new qk4
            r3.<init>(r9, r1, r0)
            r10 = 0
            r15 = 1
            defpackage.hv.Q(r2, r10, r15, r3)
            return
        L23b:
            r7.f()
            throw r0
    }

    public final boolean b() {
            r4 = this;
            lw7 r0 = r4.B
            az0 r0 = r0.b
            r0.getClass()
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = defpackage.vj2.X
            if (r1 == 0) goto L1b
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r0 = "The default process name was not specified."
            r4.b(r2, r0)
            r4 = 1
            return r4
        L1b:
            android.content.Context r4 = r4.A
            boolean r4 = defpackage.l35.a(r4, r0)
            ga0 r0 = defpackage.ga0.f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Is default app process = "
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.b(r2, r1)
            return r4
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            android.content.Context r0 = r11.A
            java.lang.String r1 = defpackage.vj2.X
            lw7 r2 = r11.B
            boolean r3 = r11.b()     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto L10
            r2.e()
            return
        L10:
            defpackage.bw7.b(r0)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L87
            ga0 r3 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Performing cleanup operations."
            r3.b(r1, r4)     // Catch: java.lang.Throwable -> L23
            r11.a()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteTableLockedException -> L26 android.database.sqlite.SQLiteFullException -> L28 android.database.sqlite.SQLiteDiskIOException -> L2a android.database.sqlite.SQLiteDatabaseLockedException -> L2c android.database.sqlite.SQLiteDatabaseCorruptException -> L2e android.database.sqlite.SQLiteConstraintException -> L30 android.database.sqlite.SQLiteCantOpenDatabaseException -> L32 android.database.sqlite.SQLiteAccessPermException -> L34
            r2.e()
            return
        L23:
            r11 = move-exception
            goto L9c
        L26:
            r3 = move-exception
            goto L35
        L28:
            r3 = move-exception
            goto L35
        L2a:
            r3 = move-exception
            goto L35
        L2c:
            r3 = move-exception
            goto L35
        L2e:
            r3 = move-exception
            goto L35
        L30:
            r3 = move-exception
            goto L35
        L32:
            r3 = move-exception
            goto L35
        L34:
            r3 = move-exception
        L35:
            int r4 = r11.R     // Catch: java.lang.Throwable -> L23
            int r4 = r4 + 1
            r11.R = r4     // Catch: java.lang.Throwable -> L23
            r5 = 3
            if (r4 < r5) goto L63
            java.lang.Class<android.os.UserManager> r11 = android.os.UserManager.class
            java.lang.Object r11 = r0.getSystemService(r11)     // Catch: java.lang.Throwable -> L23
            android.os.UserManager r11 = (android.os.UserManager) r11     // Catch: java.lang.Throwable -> L23
            boolean r11 = r11.isUserUnlocked()     // Catch: java.lang.Throwable -> L23
            if (r11 == 0) goto L4f
            java.lang.String r11 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            goto L51
        L4f:
            java.lang.String r11 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"
        L51:
            ga0 r0 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L23
            r0.e(r1, r11, r3)     // Catch: java.lang.Throwable -> L23
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            r0.<init>(r11, r3)     // Catch: java.lang.Throwable -> L23
            az0 r11 = r2.b     // Catch: java.lang.Throwable -> L23
            r11.getClass()     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L23
        L63:
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L23
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r6
            ga0 r8 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r9.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r10 = "Retrying after "
            r9.append(r10)     // Catch: java.lang.Throwable -> L23
            r9.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L23
            r8.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L23
            int r3 = r11.R     // Catch: java.lang.Throwable -> L23
            long r3 = (long) r3
            long r3 = r3 * r6
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L10 java.lang.Throwable -> L23
            goto L10
        L87:
            r11 = move-exception
            java.lang.String r0 = "Unexpected SQLite exception during migrations"
            ga0 r3 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L23
            r3.d(r1, r0)     // Catch: java.lang.Throwable -> L23
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0, r11)     // Catch: java.lang.Throwable -> L23
            az0 r11 = r2.b     // Catch: java.lang.Throwable -> L23
            r11.getClass()     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L9c:
            r2.e()
            throw r11
    }
}
