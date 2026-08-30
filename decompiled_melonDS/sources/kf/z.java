package kf;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements cf.b {

    /* renamed from: a  reason: collision with root package name */
    public final ki.m f8285a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.a f8286b;

    /* renamed from: c  reason: collision with root package name */
    public final yd.b f8287c;

    /* renamed from: d  reason: collision with root package name */
    public final SharedPreferences f8288d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f8289e;

    public z(ki.m mVar, wf.a aVar, yd.b bVar, SharedPreferences sharedPreferences, Context context) {
        this.f8285a = mVar;
        this.f8286b = aVar;
        this.f8287c = bVar;
        this.f8288d = sharedPreferences;
        this.f8289e = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(oi.b r23, boolean r24, ec.c r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            boolean r3 = r2 instanceof kf.h
            if (r3 == 0) goto L1a
            r3 = r2
            kf.h r3 = (kf.h) r3
            int r4 = r3.Y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.Y = r4
        L18:
            r6 = r3
            goto L20
        L1a:
            kf.h r3 = new kf.h
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r6.R
            dc.a r7 = dc.a.COROUTINE_SUSPENDED
            int r3 = r6.Y
            r8 = 0
            r9 = 1
            if (r3 == 0) goto L3a
            if (r3 != r9) goto L34
            p7.j.I(r2)
            yb.l r2 = (yb.l) r2
            java.lang.Object r1 = r2.A
            goto L4e
        L34:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            return r8
        L3a:
            p7.j.I(r2)
            long r2 = r1.f11012a
            long r4 = r1.f11013b
            r6.Y = r9
            r1 = r2
            r3 = r4
            r5 = r24
            java.lang.Object r1 = r0.p(r1, r3, r5, r6)
            if (r1 != r7) goto L4e
            return r7
        L4e:
            java.lang.Throwable r2 = yb.l.a(r1)
            if (r2 == 0) goto Ld5
            y8.f r2 = new y8.f
            p8.w r2 = p8.w.NOT_REQUIRED
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            p8.w r12 = p8.w.CONNECTED
            r12.getClass()
            y8.f r11 = new y8.f
            r11.<init>(r8)
            java.util.Set r21 = zb.l.s0(r2)
            p8.e r10 = new p8.e
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r19 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19, r21)
            e9.a r2 = new e9.a
            java.lang.Class<me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker> r3 = me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker.class
            r2.<init>(r3)
            java.lang.Object r3 = r2.f4416c
            x8.p r3 = (x8.p) r3
            r3.f14429j = r10
            p8.a r3 = p8.a.EXPONENTIAL
            r3.getClass()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r4.getClass()
            r2.f4414a = r9
            java.lang.Object r4 = r2.f4416c
            x8.p r4 = (x8.p) r4
            r4.f14431l = r3
            wa.b r3 = x8.p.f14419z
            r12 = 10000(0x2710, double:4.9407E-320)
            r14 = 18000000(0x112a880, double:8.8931816E-317)
            r10 = 60000(0xea60, double:2.9644E-319)
            long r5 = p7.j.h(r10, r12, r14)
            r4.m = r5
            p8.c0 r3 = p8.c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r3.getClass()
            java.lang.Object r4 = r2.f4416c
            x8.p r4 = (x8.p) r4
            r4.f14435q = r9
            r4.f14436r = r3
            p8.y r2 = r2.c()
            android.content.Context r3 = r0.f8289e
            q8.p r3 = q8.p.a(r3)
            r3.getClass()
            p8.l r4 = p8.l.APPEND_OR_REPLACE
            r4.getClass()
            java.util.List r2 = p7.t.x(r2)
            q8.m r5 = new q8.m
            java.lang.String r6 = "ra_pending_achievement_submission_worker"
            r5.<init>(r3, r6, r4, r2)
            r5.a()
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.a(oi.b, boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(7:5|6|7|8|(1:(1:(1:(1:(2:14|(3:16|17|(2:19|20)(1:23))(2:24|25))(6:26|27|28|(1:30)(1:33)|31|32))(4:34|35|36|37))(5:52|53|54|55|56))(4:62|63|64|(15:67|68|(2:71|69)|72|73|(5:76|(1:78)|79|80|74)|81|82|(5:85|(1:87)|88|89|83)|90|91|(1:93)(1:98)|94|(2:96|56)|47)(1:66)))(4:101|(1:103)(1:112)|(2:105|(2:107|108))|110)|38|(1:50)(3:40|(1:42)(1:49)|(6:44|(2:46|47)|28|(0)(0)|31|32)(1:48))))|8|(0)(0)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ee, code lost:
        if (r4 == r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
        if (r4 == r10) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0275, code lost:
        if (yb.y.f14813a != r10) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c7 A[Catch: all -> 0x0057, TryCatch #3 {all -> 0x0057, blocks: (B:24:0x0052, B:98:0x02c3, B:100:0x02c7, B:90:0x029d, B:92:0x02a3, B:95:0x02a9, B:103:0x02cf), top: B:121:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029d A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #3 {all -> 0x0057, blocks: (B:24:0x0052, B:98:0x02c3, B:100:0x02c7, B:90:0x029d, B:92:0x02a3, B:95:0x02a9, B:103:0x02cf), top: B:121:0x0033 }] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [wf.a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r31, java.lang.String r33, h1.c3 r34, ec.c r35) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.b(long, java.lang.String, h1.c3, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r9 != r10) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
        if (yb.y.f14813a != r10) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c6, code lost:
        if (r4 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0227, code lost:
        if (r9 == r10) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6 A[Catch: all -> 0x0207, LOOP:1: B:87:0x01f0->B:89:0x01f6, LOOP_END, TryCatch #2 {all -> 0x0207, blocks: (B:86:0x01df, B:87:0x01f0, B:89:0x01f6, B:72:0x01b1, B:75:0x01b9, B:83:0x01c8, B:93:0x020a, B:80:0x01c2), top: B:113:0x01b1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r26, boolean r28, h1.c3 r29, ec.c r30) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.c(long, boolean, h1.c3, ec.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|12|(4:14|(1:16)(1:20)|17|18)(1:21)))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        r6 = r0.B;
        r6.getClass();
        zc.x.j(r6);
        r7 = new yb.k(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r5, ec.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kf.k
            if (r0 == 0) goto L13
            r0 = r7
            kf.k r0 = (kf.k) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.k r0 = new kf.k
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p7.j.I(r7)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r5 = move-exception
            goto L43
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L30:
            p7.j.I(r7)
            wf.a r7 = r4.f8286b     // Catch: java.lang.Throwable -> L27
            r0.Y = r3     // Catch: java.lang.Throwable -> L27
            he.n r7 = r7.f14214a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r7.l(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L40
            return r1
        L40:
            je.a r7 = (je.a) r7     // Catch: java.lang.Throwable -> L27
            goto L50
        L43:
            cc.g r6 = r0.B
            r6.getClass()
            zc.x.j(r6)
            yb.k r7 = new yb.k
            r7.<init>(r5)
        L50:
            boolean r5 = r7 instanceof yb.k
            if (r5 != 0) goto L60
            je.a r7 = (je.a) r7
            if (r7 == 0) goto L5e
            oi.b r5 = p7.n.o(r7)
        L5c:
            r7 = r5
            goto L60
        L5e:
            r5 = 0
            goto L5c
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.d(long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r9, ec.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof kf.l
            if (r0 == 0) goto L13
            r0 = r11
            kf.l r0 = (kf.l) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.l r0 = new kf.l
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r11)
            goto L3e
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L2e:
            p7.j.I(r11)
            r0.Y = r3
            wf.a r11 = r8.f8286b
            he.n r11 = r11.f14214a
            java.lang.Object r11 = r11.m(r9, r0)
            if (r11 != r1) goto L3e
            return r1
        L3e:
            je.b r11 = (je.b) r11
            if (r11 == 0) goto L62
            xe.c r0 = new xe.c
            long r1 = r11.f7830a
            long r3 = r11.f7831b
            java.lang.String r5 = r11.f7832c
            java.lang.String r9 = r11.f7833d
            oi.c[] r10 = oi.c.values()
            java.lang.Enum r9 = pc.a.t(r9, r10)
            r6 = r9
            oi.c r6 = (oi.c) r6
            java.net.URL r7 = new java.net.URL
            java.lang.String r9 = r11.f7834e
            r7.<init>(r9)
            r0.<init>(r1, r3, r5, r6, r7)
            return r0
        L62:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.e(long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (r6 == r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0166, code lost:
        if (r6 == r7) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:53:0x013b, B:55:0x013f, B:50:0x012d), top: B:81:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r19, ec.c r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.f(java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, ec.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kf.n
            if (r0 == 0) goto L13
            r0 = r7
            kf.n r0 = (kf.n) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.n r0 = new kf.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            p7.j.I(r7)
            return r7
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L31:
            p7.j.I(r7)
            yb.l r7 = (yb.l) r7
            java.lang.Object r6 = r7.A
            goto L45
        L39:
            p7.j.I(r7)
            r0.Y = r4
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L45
            goto L59
        L45:
            boolean r7 = r6 instanceof yb.k
            r2 = 0
            if (r7 == 0) goto L4b
            r6 = r2
        L4b:
            oi.g r6 = (oi.g) r6
            if (r6 == 0) goto L5b
            long r6 = r6.f11038a
            r0.Y = r3
            java.lang.Object r6 = r5.h(r6, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r6
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.g(java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r5, ec.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kf.o
            if (r0 == 0) goto L13
            r0 = r7
            kf.o r0 = (kf.o) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.o r0 = new kf.o
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r7)
            goto L3e
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r7)
            r0.Y = r3
            wf.a r7 = r4.f8286b
            he.n r7 = r7.f14214a
            java.lang.Object r7 = r7.n(r5, r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            je.d r7 = (je.d) r7
            if (r7 == 0) goto L53
            xe.m r5 = new xe.m
            java.lang.String r6 = r7.f7840c
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r7.f7841d
            r0.<init>(r1)
            java.lang.String r7 = r7.f7839b
            r5.<init>(r6, r0, r7)
            return r5
        L53:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.h(long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r15, ec.c r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof kf.p
            if (r1 == 0) goto L15
            r1 = r0
            kf.p r1 = (kf.p) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            kf.p r1 = new kf.p
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.R
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Y
            r4 = 1
            if (r3 == 0) goto L30
            if (r3 != r4) goto L29
            p7.j.I(r0)
            goto L41
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r0)
            r0 = 0
            return r0
        L30:
            p7.j.I(r0)
            r1.Y = r4
            wf.a r0 = r14.f8286b
            he.n r0 = r0.f14214a
            r3 = r15
            java.lang.Object r0 = r0.r(r3, r1)
            if (r0 != r2) goto L41
            return r2
        L41:
            je.h r0 = (je.h) r0
            if (r0 == 0) goto L5d
            oi.h r1 = new oi.h
            long r2 = r0.f7850a
            long r4 = r0.f7851b
            long r6 = r0.f7852c
            java.lang.String r8 = r0.f7853d
            java.lang.String r9 = r0.f7854e
            boolean r10 = r0.f7855f
            java.lang.String r11 = r0.f7856g
            java.lang.String r12 = r0.f7857h
            boolean r13 = r0.f7858i
            r1.<init>(r2, r4, r6, r8, r9, r10, r11, r12, r13)
            return r1
        L5d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.i(long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        if (r3 == r6) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r23, boolean r24, ec.c r25) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.j(java.lang.String, boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(ec.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kf.r
            if (r0 == 0) goto L13
            r0 = r5
            kf.r r0 = (kf.r) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.r r0 = new kf.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L2e:
            p7.j.I(r5)
            r0.Y = r3
            yd.b r5 = r4.f8287c
            oi.j r5 = r5.a()
            if (r5 != r1) goto L3c
            return r1
        L3c:
            if (r5 == 0) goto L3f
            goto L40
        L3f:
            r3 = 0
        L40:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.k(ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, java.lang.String r6, ec.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kf.s
            if (r0 == 0) goto L13
            r0 = r7
            kf.s r0 = (kf.s) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.s r0 = new kf.s
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            p7.j.I(r7)
            yb.l r7 = (yb.l) r7
            java.lang.Object r5 = r7.A
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L32:
            p7.j.I(r7)
            r0.Y = r3
            ki.m r7 = r4.f8285a
            java.lang.Object r5 = r7.h(r5, r6, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.l(java.lang.String, java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r6.f8286b.c(r0) == r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(ec.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kf.t
            if (r0 == 0) goto L13
            r0 = r7
            kf.t r0 = (kf.t) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.t r0 = new kf.t
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            yb.y r3 = yb.y.f14813a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2c
            p7.j.I(r7)
            return r3
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L33:
            p7.j.I(r7)
            goto L45
        L37:
            p7.j.I(r7)
            r0.Y = r5
            wf.a r7 = r6.f8286b
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L45
            goto L5e
        L45:
            r0.Y = r4
            yd.b r7 = r6.f8287c
            android.content.SharedPreferences r7 = r7.f14814a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r0 = "ra_username"
            r7.remove(r0)
            java.lang.String r0 = "ra_token"
            r7.remove(r0)
            r7.apply()
            if (r3 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.m(ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r13 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.String r10, boolean r11, java.lang.String r12, ec.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof kf.u
            if (r0 == 0) goto L14
            r0 = r13
            kf.u r0 = (kf.u) r0
            int r1 = r0.f8269c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8269c0 = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            kf.u r0 = new kf.u
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.Z
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r7.f8269c0
            yb.y r8 = yb.y.f14813a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L33
            p7.j.I(r13)
            yb.l r13 = (yb.l) r13
            r13.getClass()
            return r8
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L3a:
            boolean r11 = r7.Y
            java.lang.String r12 = r7.X
            java.lang.String r10 = r7.R
            p7.j.I(r13)
            yb.l r13 = (yb.l) r13
            java.lang.Object r13 = r13.A
        L47:
            r4 = r10
            r5 = r11
            r6 = r12
            goto L5d
        L4b:
            p7.j.I(r13)
            r7.R = r10
            r7.X = r12
            r7.Y = r11
            r7.f8269c0 = r3
            java.lang.Object r13 = r9.f(r10, r7)
            if (r13 != r0) goto L47
            goto L7a
        L5d:
            boolean r10 = r13 instanceof yb.k
            r11 = 0
            if (r10 == 0) goto L63
            r13 = r11
        L63:
            oi.g r13 = (oi.g) r13
            if (r13 == 0) goto L7b
            long r12 = r13.f11038a
            r7.R = r11
            r7.X = r11
            r7.Y = r5
            r7.f8269c0 = r2
            ki.m r1 = r9.f8285a
            r2 = r12
            java.lang.Object r10 = r1.i(r2, r4, r5, r6, r7)
            if (r10 != r0) goto L7b
        L7a:
            return r0
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.n(java.lang.String, boolean, java.lang.String, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r10, boolean r11, ec.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof kf.v
            if (r0 == 0) goto L14
            r0 = r12
            kf.v r0 = (kf.v) r0
            int r1 = r0.f8272b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8272b0 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kf.v r0 = new kf.v
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.Y
            dc.a r0 = dc.a.COROUTINE_SUSPENDED
            int r1 = r6.f8272b0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            p7.j.I(r12)
            yb.l r12 = (yb.l) r12
            java.lang.Object r10 = r12.A
            return r10
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            r10 = 0
            return r10
        L37:
            boolean r11 = r6.X
            java.lang.String r10 = r6.R
            p7.j.I(r12)
            yb.l r12 = (yb.l) r12
            java.lang.Object r12 = r12.A
        L42:
            r4 = r10
            r5 = r11
            goto L55
        L45:
            p7.j.I(r12)
            r6.R = r10
            r6.X = r11
            r6.f8272b0 = r3
            java.lang.Object r12 = r9.f(r10, r6)
            if (r12 != r0) goto L42
            goto L70
        L55:
            boolean r10 = r12 instanceof yb.k
            r11 = 0
            if (r10 == 0) goto L5b
            r12 = r11
        L5b:
            oi.g r12 = (oi.g) r12
            if (r12 == 0) goto L72
            long r7 = r12.f11038a
            r6.R = r11
            r6.X = r5
            r6.f8272b0 = r2
            ki.m r1 = r9.f8285a
            r2 = r7
            java.lang.Object r10 = r1.j(r2, r4, r5, r6)
            if (r10 != r0) goto L71
        L70:
            return r0
        L71:
            return r10
        L72:
            ch.a r10 = new ch.a
            r4.getClass()
            java.lang.String r11 = "There is no game for hash "
            java.lang.String r11 = r11.concat(r4)
            r10.<init>(r11)
            yb.k r11 = new yb.k
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.o(java.lang.String, boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(long r19, long r21, boolean r23, ec.c r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r24
            boolean r2 = r1 instanceof kf.w
            if (r2 == 0) goto L17
            r2 = r1
            kf.w r2 = (kf.w) r2
            int r3 = r2.f8277d0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8277d0 = r3
            goto L1c
        L17:
            kf.w r2 = new kf.w
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f8275b0
            dc.a r3 = dc.a.COROUTINE_SUSPENDED
            int r4 = r2.f8277d0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L54
            if (r4 == r7) goto L48
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.Z
            p7.j.I(r1)
            return r2
        L33:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            r1 = 0
            return r1
        L3a:
            boolean r4 = r2.Y
            long r6 = r2.X
            long r8 = r2.R
            p7.j.I(r1)
            yb.l r1 = (yb.l) r1
            java.lang.Object r1 = r1.A
            goto L8e
        L48:
            boolean r4 = r2.Y
            long r7 = r2.X
            long r9 = r2.R
            p7.j.I(r1)
            r1 = r4
            r12 = r7
            goto L78
        L54:
            p7.j.I(r1)
            je.j r11 = new je.j
            r16 = 1
            r14 = r19
            r12 = r21
            r17 = r23
            r11.<init>(r12, r14, r16, r17)
            r2.R = r14
            r2.X = r12
            r1 = r23
            r2.Y = r1
            r2.f8277d0 = r7
            wf.a r4 = r0.f8286b
            java.lang.Object r4 = r4.a(r11, r2)
            if (r4 != r3) goto L77
            goto La2
        L77:
            r9 = r14
        L78:
            r2.R = r9
            r2.X = r12
            r2.Y = r1
            r2.f8277d0 = r6
            ki.m r4 = r0.f8285a
            java.lang.Object r4 = r4.d(r9, r1, r2)
            if (r4 != r3) goto L89
            goto La2
        L89:
            r6 = r4
            r4 = r1
            r1 = r6
            r8 = r9
            r6 = r12
        L8e:
            java.lang.Throwable r10 = yb.l.a(r1)
            if (r10 == 0) goto La3
            r2.Z = r1
            r2.R = r8
            r2.X = r6
            r2.Y = r4
            r2.f8277d0 = r5
            yb.y r2 = yb.y.f14813a
            if (r2 != r3) goto La3
        La2:
            return r3
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.p(long, long, boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r5, int r7, ec.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof kf.x
            if (r0 == 0) goto L13
            r0 = r8
            kf.x r0 = (kf.x) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kf.x r0 = new kf.x
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            p7.j.I(r8)
            yb.l r8 = (yb.l) r8
            java.lang.Object r5 = r8.A
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L32:
            p7.j.I(r8)
            r0.Y = r3
            ki.m r8 = r4.f8285a
            java.lang.Object r5 = r8.k(r5, r7, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.q(long, int, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r0 == r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
        if (r10 == r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a0 -> B:14:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(ec.c r15) {
        /*
            r14 = this;
            boolean r1 = r15 instanceof kf.y
            if (r1 == 0) goto L13
            r1 = r15
            kf.y r1 = (kf.y) r1
            int r2 = r1.f8284c0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.f8284c0 = r2
            goto L18
        L13:
            kf.y r1 = new kf.y
            r1.<init>(r14, r15)
        L18:
            java.lang.Object r0 = r1.Z
            dc.a r9 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.f8284c0
            yb.y r10 = yb.y.f14813a
            r11 = 0
            r12 = 3
            r13 = 2
            r4 = 1
            if (r3 == 0) goto L53
            if (r3 == r4) goto L4f
            if (r3 == r13) goto L3e
            if (r3 != r12) goto L37
            int r3 = r1.X
            java.util.Iterator r4 = r1.R
            p7.j.I(r0)
        L33:
            r8 = r1
            r1 = r3
            r0 = r4
            goto L65
        L37:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r0)
            r0 = 0
            return r0
        L3e:
            int r3 = r1.Y
            int r4 = r1.X
            java.util.Iterator r5 = r1.R
            p7.j.I(r0)
            yb.l r0 = (yb.l) r0
            java.lang.Object r0 = r0.A
            r2 = r3
            r3 = r4
            r4 = r5
            goto L8e
        L4f:
            p7.j.I(r0)
            goto L5d
        L53:
            p7.j.I(r0)
            r1.f8284c0 = r4
            zb.q r0 = zb.q.A
            if (r0 != r9) goto L5d
            goto La2
        L5d:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r8 = r1
            r1 = r11
        L65:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La3
            java.lang.Object r3 = r0.next()
            je.i r3 = (je.i) r3
            r3.getClass()
            r8.R = r0
            r8.X = r1
            r8.Y = r11
            r8.f8284c0 = r13
            r3 = 0
            r5 = 0
            r7 = 0
            r2 = r14
            java.lang.Object r3 = r2.p(r3, r5, r7, r8)
            if (r3 != r9) goto L89
            goto La2
        L89:
            r4 = r0
            r0 = r3
            r2 = r11
            r3 = r1
            r1 = r8
        L8e:
            boolean r5 = r0 instanceof yb.k
            if (r5 == 0) goto L98
            if (r5 != 0) goto L97
            oi.e r0 = (oi.e) r0
            return r10
        L97:
            return r0
        L98:
            r1.R = r4
            r1.X = r3
            r1.Y = r2
            r1.f8284c0 = r12
            if (r10 != r9) goto L33
        La2:
            return r9
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.r(ec.c):java.lang.Object");
    }
}
