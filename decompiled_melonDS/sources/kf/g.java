package kf;

import android.content.Context;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8217a;

    /* renamed from: b  reason: collision with root package name */
    public final cf.d f8218b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f8219c;

    /* renamed from: d  reason: collision with root package name */
    public final id.c f8220d = new id.c();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f8221e = new AtomicInteger(0);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f8222f = new AtomicBoolean(false);

    public g(Context context, cf.d dVar, f1 f1Var, c0 c0Var) {
        this.f8217a = context;
        this.f8218b = dVar;
        this.f8219c = c0Var;
    }

    public static final int a(g gVar, InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: all -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0069, blocks: (B:18:0x0047, B:23:0x0055), top: B:29:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(me.magnum.melonds.domain.model.DSiWareTitle r8, ec.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kf.a
            if (r0 == 0) goto L13
            r0 = r9
            kf.a r0 = (kf.a) r0
            int r1 = r0.f8135b0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8135b0 = r1
            goto L18
        L13:
            kf.a r0 = new kf.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8135b0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            id.c r8 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            p7.j.I(r9)
            r9 = r8
            r8 = r0
            goto L46
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L34:
            p7.j.I(r9)
            r0.R = r8
            id.c r9 = r7.f8220d
            r0.X = r9
            r0.f8135b0 = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f8222f     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L69
            yb.y r2 = yb.y.f14813a
            if (r1 != 0) goto L55
            r9.d(r0)
            return r2
        L55:
            me.magnum.melonds.MelonDSiNand r1 = me.magnum.melonds.MelonDSiNand.f9465a     // Catch: java.lang.Throwable -> L69
            long r3 = r8.getTitleId()     // Catch: java.lang.Throwable -> L69
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r8 = (int) r3     // Catch: java.lang.Throwable -> L69
            r1.deleteTitle(r8)     // Catch: java.lang.Throwable -> L69
            r9.d(r0)
            return r2
        L69:
            r8 = move-exception
            r9.d(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.b(me.magnum.melonds.domain.model.DSiWareTitle, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x004f, B:20:0x0057, B:25:0x005f), top: B:30:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x004f, B:20:0x0057, B:25:0x005f), top: B:30:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(me.magnum.melonds.domain.model.DSiWareTitle r7, re.a r8, android.net.Uri r9, ec.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof kf.b
            if (r0 == 0) goto L13
            r0 = r10
            kf.b r0 = (kf.b) r0
            int r1 = r0.f8140d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8140d0 = r1
            goto L18
        L13:
            kf.b r0 = new kf.b
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f8138b0
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8140d0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            id.c r7 = r0.Z
            android.net.Uri r9 = r0.Y
            re.a r8 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            p7.j.I(r10)
            r10 = r7
            r7 = r0
            goto L4e
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L38:
            p7.j.I(r10)
            r0.R = r7
            r0.X = r8
            r0.Y = r9
            id.c r10 = r6.f8220d
            r0.Z = r10
            r0.f8140d0 = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f8222f     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5d
            r10.d(r0)
            return r7
        L5d:
            r7 = move-exception
            goto L83
        L5f:
            me.magnum.melonds.MelonDSiNand r1 = me.magnum.melonds.MelonDSiNand.f9465a     // Catch: java.lang.Throwable -> L5d
            long r2 = r7.getTitleId()     // Catch: java.lang.Throwable -> L5d
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L5d
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L5d
            r9.getClass()     // Catch: java.lang.Throwable -> L5d
            boolean r7 = r1.exportTitleFile(r7, r8, r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L5d
            r10.d(r0)
            return r7
        L83:
            r10.d(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.c(me.magnum.melonds.domain.model.DSiWareTitle, re.a, android.net.Uri, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r11.i(r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Type inference failed for: r10v12, types: [id.a] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v6, types: [id.a] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [id.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [id.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum d(android.net.Uri r10, ec.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof kf.c
            if (r0 == 0) goto L13
            r0 = r11
            kf.c r0 = (kf.c) r0
            int r1 = r0.f8171c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8171c0 = r1
            goto L18
        L13:
            kf.c r0 = new kf.c
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8171c0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            id.a r10 = r0.X
            p7.j.I(r11)     // Catch: java.lang.Throwable -> L2d
            goto L74
        L2d:
            r11 = move-exception
            goto L7e
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r10)
            return r5
        L35:
            int r10 = r0.Y
            id.a r2 = r0.X
            android.net.Uri r4 = r0.R
            p7.j.I(r11)
            r11 = r2
            r2 = r10
            r10 = r4
            goto L57
        L42:
            p7.j.I(r11)
            r0.R = r10
            id.c r11 = r9.f8220d
            r0.X = r11
            r2 = 0
            r0.Y = r2
            r0.f8171c0 = r4
            java.lang.Object r4 = r11.i(r0)
            if (r4 != r1) goto L57
            goto L70
        L57:
            gd.f r4 = zc.g0.f15015a     // Catch: java.lang.Throwable -> L7a
            gd.e r4 = gd.e.L     // Catch: java.lang.Throwable -> L7a
            di.b r6 = new di.b     // Catch: java.lang.Throwable -> L7a
            r7 = 22
            r6.<init>(r9, r10, r5, r7)     // Catch: java.lang.Throwable -> L7a
            r0.R = r5     // Catch: java.lang.Throwable -> L7a
            r0.X = r11     // Catch: java.lang.Throwable -> L7a
            r0.Y = r2     // Catch: java.lang.Throwable -> L7a
            r0.f8171c0 = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r10 = zc.x.F(r4, r6, r0)     // Catch: java.lang.Throwable -> L7a
            if (r10 != r1) goto L71
        L70:
            return r1
        L71:
            r8 = r11
            r11 = r10
            r10 = r8
        L74:
            re.b r11 = (re.b) r11     // Catch: java.lang.Throwable -> L2d
            r10.d(r5)
            return r11
        L7a:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L7e:
            r10.d(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.d(android.net.Uri, ec.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x004f, B:20:0x0057, B:25:0x005f), top: B:30:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x004f, B:20:0x0057, B:25:0x005f), top: B:30:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(me.magnum.melonds.domain.model.DSiWareTitle r7, re.a r8, android.net.Uri r9, ec.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof kf.d
            if (r0 == 0) goto L13
            r0 = r10
            kf.d r0 = (kf.d) r0
            int r1 = r0.f8176d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8176d0 = r1
            goto L18
        L13:
            kf.d r0 = new kf.d
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f8174b0
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f8176d0
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            id.c r7 = r0.Z
            android.net.Uri r9 = r0.Y
            re.a r8 = r0.X
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r0.R
            p7.j.I(r10)
            r10 = r7
            r7 = r0
            goto L4e
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L38:
            p7.j.I(r10)
            r0.R = r7
            r0.X = r8
            r0.Y = r9
            id.c r10 = r6.f8220d
            r0.Z = r10
            r0.f8176d0 = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f8222f     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5d
            r10.d(r0)
            return r7
        L5d:
            r7 = move-exception
            goto L83
        L5f:
            me.magnum.melonds.MelonDSiNand r1 = me.magnum.melonds.MelonDSiNand.f9465a     // Catch: java.lang.Throwable -> L5d
            long r2 = r7.getTitleId()     // Catch: java.lang.Throwable -> L5d
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L5d
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L5d
            r9.getClass()     // Catch: java.lang.Throwable -> L5d
            boolean r7 = r1.importTitleFile(r7, r8, r9)     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L5d
            r10.d(r0)
            return r7
        L83:
            r10.d(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.e(me.magnum.melonds.domain.model.DSiWareTitle, re.a, android.net.Uri, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x0042, B:21:0x004a, B:26:0x0052), top: B:31:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x0042, B:21:0x004a, B:26:0x0052), top: B:31:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(ec.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kf.e
            if (r0 == 0) goto L13
            r0 = r5
            kf.e r0 = (kf.e) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kf.e r0 = new kf.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            id.c r0 = r0.R
            p7.j.I(r5)
            goto L41
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L30:
            p7.j.I(r5)
            id.c r5 = r4.f8220d
            r0.R = r5
            r0.Z = r3
            java.lang.Object r0 = r5.i(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            r5 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f8222f     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L52
            zb.q r1 = zb.q.A     // Catch: java.lang.Throwable -> L50
            r0.d(r5)
            return r1
        L50:
            r1 = move-exception
            goto L5c
        L52:
            me.magnum.melonds.MelonDSiNand r1 = me.magnum.melonds.MelonDSiNand.f9465a     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r1 = r1.listTitles()     // Catch: java.lang.Throwable -> L50
            r0.d(r5)
            return r1
        L5c:
            r0.d(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.f(ec.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r12.i(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #1 {all -> 0x0069, blocks: (B:23:0x005a, B:25:0x0060, B:30:0x006e, B:32:0x007a, B:35:0x0080), top: B:61:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x0069, TRY_ENTER, TryCatch #1 {all -> 0x0069, blocks: (B:23:0x005a, B:25:0x0060, B:30:0x006e, B:32:0x007a, B:35:0x0080), top: B:61:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:39:0x0099, B:45:0x00a8, B:50:0x00b6, B:52:0x00bc, B:54:0x00c2, B:46:0x00ab, B:47:0x00ae, B:48:0x00b1, B:49:0x00b4), top: B:59:0x002f }] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [id.a] */
    /* JADX WARN: Type inference failed for: r0v12, types: [id.a] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9, types: [id.a] */
    /* JADX WARN: Type inference failed for: r8v6, types: [id.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum g(ec.c r12) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g.g(ec.c):java.lang.Enum");
    }
}
