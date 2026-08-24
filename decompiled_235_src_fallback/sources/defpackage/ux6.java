package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux6  reason: default package */
/* loaded from: classes.dex */
public final class ux6 implements defpackage.e66 {
    public static final java.lang.String Y = null;
    public final android.content.Context A;
    public final android.app.job.JobScheduler B;
    public final defpackage.tx6 L;
    public final androidx.work.impl.WorkDatabase R;
    public final defpackage.az0 X;

    static {
            java.lang.String r0 = "SystemJobScheduler"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.ux6.Y = r0
            return
    }

    public ux6(android.content.Context r5, androidx.work.impl.WorkDatabase r6, defpackage.az0 r7) {
            r4 = this;
            android.app.job.JobScheduler r0 = defpackage.vc3.a(r5)
            tx6 r1 = new tx6
            q61 r2 = r7.d
            boolean r3 = r7.l
            r1.<init>(r5, r2, r3)
            r4.<init>()
            r4.A = r5
            r4.B = r0
            r4.L = r1
            r4.R = r6
            r4.X = r7
            return
    }

    public static void a(android.app.job.JobScheduler r3, int r4) {
            r3.cancel(r4)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            ga0 r0 = defpackage.ga0.f()
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = "Exception while trying to cancel job (%d)"
            java.lang.String r4 = java.lang.String.format(r1, r2, r4)
            java.lang.String r1 = defpackage.ux6.Y
            r0.e(r1, r4, r3)
            return
    }

    public static java.util.ArrayList b(android.content.Context r4, android.app.job.JobScheduler r5) {
            java.lang.String r0 = defpackage.vc3.a
            r5.getClass()
            r0 = 0
            java.util.List r5 = r5.getAllPendingJobs()     // Catch: java.lang.Throwable -> Le
            r5.getClass()     // Catch: java.lang.Throwable -> Le
            goto L1b
        Le:
            r5 = move-exception
            java.lang.String r1 = defpackage.vc3.a
            ga0 r2 = defpackage.ga0.f()
            java.lang.String r3 = "getAllPendingJobs() is not reliable on this device."
            r2.e(r1, r3, r5)
            r5 = r0
        L1b:
            if (r5 != 0) goto L1e
            return r0
        L1e:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemjob.SystemJobService> r2 = androidx.work.impl.background.systemjob.SystemJobService.class
            r1.<init>(r4, r2)
            java.util.Iterator r4 = r5.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r4.next()
            android.app.job.JobInfo r5 = (android.app.job.JobInfo) r5
            android.content.ComponentName r2 = r5.getService()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L32
            r0.add(r5)
            goto L32
        L4c:
            return r0
    }

    public static defpackage.gw7 f(android.app.job.JobInfo r3) {
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r3.getExtras()
            if (r3 == 0) goto L1f
            boolean r1 = r3.containsKey(r0)     // Catch: java.lang.NullPointerException -> L1f
            if (r1 == 0) goto L1f
            java.lang.String r1 = "EXTRA_WORK_SPEC_GENERATION"
            r2 = 0
            int r1 = r3.getInt(r1, r2)     // Catch: java.lang.NullPointerException -> L1f
            gw7 r2 = new gw7     // Catch: java.lang.NullPointerException -> L1f
            java.lang.String r3 = r3.getString(r0)     // Catch: java.lang.NullPointerException -> L1f
            r2.<init>(r3, r1)     // Catch: java.lang.NullPointerException -> L1f
            return r2
        L1f:
            r3 = 0
            return r3
    }

    @Override // defpackage.e66
    public final boolean c() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.e66
    public final void d(java.lang.String r9) {
            r8 = this;
            android.content.Context r0 = r8.A
            android.app.job.JobScheduler r1 = r8.B
            java.util.ArrayList r0 = b(r0, r1)
            r2 = 0
            if (r0 != 0) goto Ld
            r0 = 0
            goto L3d
        Ld:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            int r4 = r0.size()
            r5 = r2
        L18:
            if (r5 >= r4) goto L3c
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            android.app.job.JobInfo r6 = (android.app.job.JobInfo) r6
            gw7 r7 = f(r6)
            if (r7 == 0) goto L18
            java.lang.String r7 = r7.a
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L18
            int r6 = r6.getId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.add(r6)
            goto L18
        L3c:
            r0 = r3
        L3d:
            if (r0 == 0) goto L75
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L75
            int r3 = r0.size()
            r4 = r2
        L4a:
            if (r4 >= r3) goto L5c
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            a(r1, r5)
            goto L4a
        L5c:
            androidx.work.impl.WorkDatabase r8 = r8.R
            px6 r8 = r8.t()
            r8.getClass()
            r9.getClass()
            m16 r8 = r8.a
            c70 r0 = new c70
            r1 = 16
            r0.<init>(r9, r1)
            r9 = 1
            defpackage.hv.Q(r8, r2, r9, r0)
        L75:
            return
    }

    @Override // defpackage.e66
    public final void e(defpackage.yw7... r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            az0 r2 = r0.X
            k13 r3 = new k13
            androidx.work.impl.WorkDatabase r4 = r0.R
            r5 = 0
            r3.<init>(r4, r5)
            int r6 = r1.length
            r7 = r5
        L10:
            if (r7 >= r6) goto Le7
            r8 = r1[r7]
            r4.b()
            dx7 r9 = r4.w()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = r8.a     // Catch: java.lang.Throwable -> L4a
            yw7 r9 = r9.d(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r11 = "Skipping scheduling "
            java.lang.String r12 = defpackage.ux6.Y
            if (r9 != 0) goto L4d
            ga0 r8 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r9.<init>()     // Catch: java.lang.Throwable -> L4a
            r9.append(r11)     // Catch: java.lang.Throwable -> L4a
            r9.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = " because it's no longer in the DB"
            r9.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L4a
            r8.j(r12, r9)     // Catch: java.lang.Throwable -> L4a
            r4.p()     // Catch: java.lang.Throwable -> L4a
        L45:
            r4.f()
            goto Ldf
        L4a:
            r0 = move-exception
            goto Le3
        L4d:
            iw7 r9 = r9.b     // Catch: java.lang.Throwable -> L4a
            iw7 r13 = defpackage.iw7.ENQUEUED     // Catch: java.lang.Throwable -> L4a
            if (r9 == r13) goto L72
            ga0 r8 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r9.<init>()     // Catch: java.lang.Throwable -> L4a
            r9.append(r11)     // Catch: java.lang.Throwable -> L4a
            r9.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = " because it is no longer enqueued"
            r9.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L4a
            r8.j(r12, r9)     // Catch: java.lang.Throwable -> L4a
            r4.p()     // Catch: java.lang.Throwable -> L4a
            goto L45
        L72:
            gw7 r9 = defpackage.rr7.a(r8)     // Catch: java.lang.Throwable -> L4a
            int r10 = r9.b     // Catch: java.lang.Throwable -> L4a
            java.lang.String r9 = r9.a     // Catch: java.lang.Throwable -> L4a
            px6 r11 = r4.t()     // Catch: java.lang.Throwable -> L4a
            r11.getClass()     // Catch: java.lang.Throwable -> L4a
            r9.getClass()     // Catch: java.lang.Throwable -> L4a
            m16 r11 = r11.a     // Catch: java.lang.Throwable -> L4a
            ox6 r12 = new ox6     // Catch: java.lang.Throwable -> L4a
            r12.<init>(r9, r10, r5)     // Catch: java.lang.Throwable -> L4a
            r13 = 1
            java.lang.Object r11 = defpackage.hv.Q(r11, r13, r5, r12)     // Catch: java.lang.Throwable -> L4a
            nx6 r11 = (defpackage.nx6) r11     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L97
            int r12 = r11.c     // Catch: java.lang.Throwable -> L4a
            goto Lba
        L97:
            r2.getClass()     // Catch: java.lang.Throwable -> L4a
            int r12 = r2.i     // Catch: java.lang.Throwable -> L4a
            androidx.work.impl.WorkDatabase r14 = r3.a     // Catch: java.lang.Throwable -> L4a
            j13 r15 = new j13     // Catch: java.lang.Throwable -> L4a
            r15.<init>(r3, r12)     // Catch: java.lang.Throwable -> L4a
            r14.getClass()     // Catch: java.lang.Throwable -> L4a
            er2 r12 = new er2     // Catch: java.lang.Throwable -> L4a
            r5 = 25
            r12.<init>(r15, r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r14.o(r12)     // Catch: java.lang.Throwable -> L4a
            r5.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L4a
            int r12 = r5.intValue()     // Catch: java.lang.Throwable -> L4a
        Lba:
            if (r11 != 0) goto Ld6
            nx6 r5 = new nx6     // Catch: java.lang.Throwable -> L4a
            r5.<init>(r9, r10, r12)     // Catch: java.lang.Throwable -> L4a
            px6 r9 = r4.t()     // Catch: java.lang.Throwable -> L4a
            r9.getClass()     // Catch: java.lang.Throwable -> L4a
            m16 r10 = r9.a     // Catch: java.lang.Throwable -> L4a
            qk4 r11 = new qk4     // Catch: java.lang.Throwable -> L4a
            r14 = 21
            r11.<init>(r14, r9, r5)     // Catch: java.lang.Throwable -> L4a
            r5 = 0
            defpackage.hv.Q(r10, r5, r13, r11)     // Catch: java.lang.Throwable -> L4a
            goto Ld7
        Ld6:
            r5 = 0
        Ld7:
            r0.g(r8, r12)     // Catch: java.lang.Throwable -> L4a
            r4.p()     // Catch: java.lang.Throwable -> L4a
            goto L45
        Ldf:
            int r7 = r7 + 1
            goto L10
        Le3:
            r4.f()
            throw r0
        Le7:
            return
    }

    public final void g(defpackage.yw7 r18, int r19) {
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            tx6 r3 = r1.L
            r3.getClass()
            p21 r4 = r2.j
            android.os.PersistableBundle r5 = new android.os.PersistableBundle
            r5.<init>()
            java.lang.String r6 = r2.a
            java.lang.String r7 = "EXTRA_WORK_SPEC_ID"
            r5.putString(r7, r6)
            java.lang.String r7 = "EXTRA_WORK_SPEC_GENERATION"
            int r8 = r2.t
            r5.putInt(r7, r8)
            java.lang.String r7 = "EXTRA_IS_PERIODIC"
            boolean r8 = r2.c()
            r5.putBoolean(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r8 = r3.a
            r7.<init>(r0, r8)
            boolean r8 = r4.c
            java.util.Set r9 = r4.i
            android.app.job.JobInfo$Builder r7 = r7.setRequiresCharging(r8)
            boolean r8 = r4.d
            android.app.job.JobInfo$Builder r7 = r7.setRequiresDeviceIdle(r8)
            android.app.job.JobInfo$Builder r5 = r7.setExtras(r5)
            android.net.NetworkRequest r7 = r4.a()
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r13 = 1
            r14 = 28
            if (r10 < r14) goto L58
            if (r7 == 0) goto L58
            r5.getClass()
            defpackage.o05.s(r5, r7)
            goto Lb1
        L58:
            kf4 r7 = r4.a
            r15 = 30
            if (r10 < r15) goto L75
            kf4 r15 = defpackage.kf4.TEMPORARILY_UNMETERED
            if (r7 != r15) goto L75
            android.net.NetworkRequest$Builder r7 = new android.net.NetworkRequest$Builder
            r7.<init>()
            r15 = 25
            android.net.NetworkRequest$Builder r7 = r7.addCapability(r15)
            android.net.NetworkRequest r7 = r7.build()
            defpackage.o05.l(r5, r7)
            goto Lb1
        L75:
            int[] r15 = defpackage.sx6.a
            int r16 = r7.ordinal()
            r15 = r15[r16]
            if (r15 == r13) goto Lad
            r13 = 2
            if (r15 == r13) goto La7
            r13 = 3
            if (r15 == r13) goto Lab
            r13 = 4
            if (r15 == r13) goto La9
            r13 = 5
            if (r15 == r13) goto L8c
            goto L90
        L8c:
            if (r10 < r11) goto L90
            r13 = 4
            goto Lae
        L90:
            ga0 r13 = defpackage.ga0.f()
            java.lang.String r15 = defpackage.tx6.d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "API version too low. Cannot convert network type value "
            r11.<init>(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r13.b(r15, r7)
        La7:
            r13 = 1
            goto Lae
        La9:
            r13 = 3
            goto Lae
        Lab:
            r13 = 2
            goto Lae
        Lad:
            r13 = 0
        Lae:
            r5.setRequiredNetworkType(r13)
        Lb1:
            if (r8 != 0) goto Lc1
            w10 r7 = r2.l
            w10 r8 = defpackage.w10.LINEAR
            if (r7 != r8) goto Lbb
            r7 = 0
            goto Lbc
        Lbb:
            r7 = 1
        Lbc:
            long r11 = r2.m
            r5.setBackoffCriteria(r11, r7)
        Lc1:
            long r7 = r2.a()
            q61 r11 = r3.b
            r11.getClass()
            long r11 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r11
            r11 = 0
            long r7 = java.lang.Math.max(r7, r11)
            if (r10 > r14) goto Ldb
            r5.setMinimumLatency(r7)
            goto Lee
        Ldb:
            int r10 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r10 <= 0) goto Le3
            r5.setMinimumLatency(r7)
            goto Lee
        Le3:
            boolean r10 = r2.q
            if (r10 != 0) goto Lee
            boolean r3 = r3.c
            if (r3 == 0) goto Lee
            defpackage.o05.k(r5)
        Lee:
            r3 = r9
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L11e
            java.util.Iterator r3 = r9.iterator()
        Lfb:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L114
            java.lang.Object r9 = r3.next()
            n21 r9 = (defpackage.n21) r9
            boolean r10 = r9.b
            android.app.job.JobInfo$TriggerContentUri r13 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r9 = r9.a
            r13.<init>(r9, r10)
            r5.addTriggerContentUri(r13)
            goto Lfb
        L114:
            long r9 = r4.g
            r5.setTriggerContentUpdateDelay(r9)
            long r9 = r4.h
            r5.setTriggerContentMaxDelay(r9)
        L11e:
            r3 = 0
            r5.setPersisted(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r3 < r9) goto L132
            boolean r9 = r4.e
            defpackage.q66.r(r5, r9)
            boolean r4 = r4.f
            defpackage.q66.C(r5, r4)
        L132:
            int r4 = r2.k
            if (r4 <= 0) goto L138
            r4 = 1
            goto L139
        L138:
            r4 = 0
        L139:
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L13f
            r7 = 1
            goto L140
        L13f:
            r7 = 0
        L140:
            r8 = 31
            if (r3 < r8) goto L14f
            boolean r9 = r2.q
            if (r9 == 0) goto L14f
            if (r4 != 0) goto L14f
            if (r7 != 0) goto L14f
            defpackage.ij5.m(r5)
        L14f:
            r4 = 35
            if (r3 < r4) goto L15a
            java.lang.String r3 = r2.x
            if (r3 == 0) goto L15a
            defpackage.xp.k(r5, r3)
        L15a:
            android.app.job.JobInfo r3 = r5.build()
            ga0 r4 = defpackage.ga0.f()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Scheduling work ID "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r7 = "Job ID "
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = defpackage.ux6.Y
            r4.b(r7, r5)
            android.app.job.JobScheduler r4 = r1.B     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            int r3 = r4.schedule(r3)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            if (r3 != 0) goto L1d0
            ga0 r3 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            r4.<init>()     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            java.lang.String r5 = "Unable to schedule work ID "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            r4.append(r6)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            r3.j(r7, r4)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            boolean r3 = r2.q     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            if (r3 == 0) goto L1d0
            oo4 r3 = r2.r     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            oo4 r4 = defpackage.oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            if (r3 != r4) goto L1d0
            r3 = 0
            r2.q = r3     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            r3.<init>()     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            java.lang.String r4 = "Scheduling a non-expedited job (work ID "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            r3.append(r6)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            java.lang.String r4 = ")"
            r3.append(r4)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            ga0 r4 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            r4.b(r7, r3)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            r17.g(r18, r19)     // Catch: java.lang.Throwable -> L1cb java.lang.IllegalStateException -> L1cd
            return
        L1cb:
            r0 = move-exception
            goto L1d1
        L1cd:
            r0 = move-exception
            r2 = r0
            goto L1e7
        L1d0:
            return
        L1d1:
            ga0 r1 = defpackage.ga0.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to schedule "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.e(r7, r2, r0)
            return
        L1e7:
            java.lang.String r0 = defpackage.vc3.a
            android.content.Context r3 = r1.A
            r3.getClass()
            androidx.work.impl.WorkDatabase r0 = r1.R
            r0.getClass()
            az0 r1 = r1.X
            r1.getClass()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r8) goto L1ff
            r5 = 150(0x96, float:2.1E-43)
            goto L201
        L1ff:
            r5 = 100
        L201:
            dx7 r0 = r0.w()
            m16 r0 = r0.a
            rk7 r6 = new rk7
            r8 = 15
            r6.<init>(r8)
            r8 = 0
            r9 = 1
            java.lang.Object r0 = defpackage.hv.Q(r0, r9, r8, r6)
            java.util.List r0 = (java.util.List) r0
            int r6 = r0.size()
            r0 = 34
            java.lang.String r9 = "<faulty JobScheduler failed to getPendingJobs>"
            if (r4 < r0) goto L2b7
            android.app.job.JobScheduler r4 = defpackage.vc3.a(r3)
            r10 = 0
            java.util.List r0 = r4.getAllPendingJobs()     // Catch: java.lang.Throwable -> L22d
            r0.getClass()     // Catch: java.lang.Throwable -> L22d
            goto L23a
        L22d:
            r0 = move-exception
            java.lang.String r11 = defpackage.vc3.a
            ga0 r12 = defpackage.ga0.f()
            java.lang.String r13 = "getAllPendingJobs() is not reliable on this device."
            r12.e(r11, r13, r0)
            r0 = r10
        L23a:
            if (r0 == 0) goto L2d7
            java.util.ArrayList r4 = b(r3, r4)
            if (r4 == 0) goto L24d
            int r9 = r0.size()
            int r4 = r4.size()
            int r4 = r9 - r4
            goto L24e
        L24d:
            r4 = r8
        L24e:
            if (r4 != 0) goto L252
            r4 = r10
            goto L263
        L252:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r4 = " of which are not owned by WorkManager"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
        L263:
            java.lang.String r9 = "jobscheduler"
            java.lang.Object r9 = r3.getSystemService(r9)
            r9.getClass()
            android.app.job.JobScheduler r9 = (android.app.job.JobScheduler) r9
            java.util.ArrayList r3 = b(r3, r9)
            if (r3 == 0) goto L279
            int r12 = r3.size()
            goto L27a
        L279:
            r12 = r8
        L27a:
            if (r12 != 0) goto L27d
            goto L28e
        L27d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r8 = " from WorkManager in the default namespace"
            r3.append(r8)
            java.lang.String r10 = r3.toString()
        L28e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = r0.size()
            r3.append(r0)
            java.lang.String r0 = " jobs in \"androidx.work.systemjobscheduler\" namespace"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0, r4, r10}
            java.util.ArrayList r8 = defpackage.fv.C0(r0)
            r12 = 0
            r13 = 62
            java.lang.String r9 = ",\n"
            r10 = 0
            r11 = 0
            java.lang.String r9 = defpackage.gt0.P0(r8, r9, r10, r11, r12, r13)
            goto L2d7
        L2b7:
            android.app.job.JobScheduler r0 = defpackage.vc3.a(r3)
            java.util.ArrayList r0 = b(r3, r0)
            if (r0 != 0) goto L2c2
            goto L2d7
        L2c2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = r0.size()
            r3.append(r0)
            java.lang.String r0 = " jobs from WorkManager"
            r3.append(r0)
            java.lang.String r9 = r3.toString()
        L2d7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "JobScheduler "
            r0.<init>(r3)
            r0.append(r5)
            java.lang.String r3 = " job limit exceeded.\nIn JobScheduler there are "
            r0.append(r3)
            r0.append(r9)
            java.lang.String r3 = ".\nThere are "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = " jobs tracked by WorkManager's database;\nthe Configuration limit is "
            r0.append(r3)
            int r1 = r1.k
            r3 = 46
            java.lang.String r0 = defpackage.xg6.q(r0, r1, r3)
            ga0 r1 = defpackage.ga0.f()
            r1.d(r7, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0, r2)
            throw r1
    }
}
