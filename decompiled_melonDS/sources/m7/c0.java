package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements k7.c0, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final k0.g f9312a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9313b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9314c;

    /* renamed from: d  reason: collision with root package name */
    public final zb.j f9315d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f9316e;

    public c0(k0.g gVar, g gVar2, boolean z10) {
        gVar.getClass();
        this.f9312a = gVar;
        this.f9313b = gVar2;
        this.f9314c = z10;
        this.f9315d = new zb.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // k7.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, mc.l r8, ec.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof m7.b0
            if (r0 == 0) goto L13
            r0 = r9
            m7.b0 r0 = (m7.b0) r0
            int r1 = r0.f9311c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9311c0 = r1
            goto L18
        L13:
            m7.b0 r0 = new m7.b0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f9311c0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            m7.g r7 = r0.Y
            mc.l r8 = r0.X
            java.lang.String r0 = r0.R
            p7.j.I(r9)
            r9 = r7
            r7 = r0
            goto L66
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L37:
            p7.j.I(r9)
            boolean r9 = r6.f9316e
            r2 = 21
            if (r9 != 0) goto L8f
            cc.g r9 = r0.B
            r9.getClass()
            k0.g r5 = r6.f9312a
            cc.e r9 = r9.t(r5)
            m7.a r9 = (m7.a) r9
            if (r9 == 0) goto L89
            m7.c0 r9 = r9.B
            if (r9 != r6) goto L89
            m7.g r9 = r6.f9313b
            r0.R = r7
            r0.X = r8
            r0.Y = r9
            r0.f9311c0 = r3
            id.a r2 = r9.B
            java.lang.Object r0 = r2.i(r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            m7.v r0 = new m7.v     // Catch: java.lang.Throwable -> L7c
            m7.g r1 = r6.f9313b     // Catch: java.lang.Throwable -> L7c
            t7.c r7 = r1.T(r7)     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = r8.k(r0)     // Catch: java.lang.Throwable -> L7e
            q8.r.q(r0, r4)     // Catch: java.lang.Throwable -> L7c
            r9.d(r4)
            return r7
        L7c:
            r7 = move-exception
            goto L85
        L7e:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L80
        L80:
            r8 = move-exception
            q8.r.q(r0, r7)     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L7c
        L85:
            r9.d(r4)
            throw r7
        L89:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            zb.k.L(r2, r7)
            throw r4
        L8f:
            java.lang.String r7 = "Connection is recycled"
            zb.k.L(r2, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c0.a(java.lang.String, mc.l, ec.c):java.lang.Object");
    }

    @Override // m7.d0
    public final t7.a b() {
        return this.f9313b;
    }

    @Override // k7.c0
    public final Boolean c(cc.c cVar) {
        boolean z10;
        if (!this.f9316e) {
            cc.g gVar = ((ec.c) cVar).B;
            gVar.getClass();
            a aVar = (a) gVar.t(this.f9312a);
            if (aVar != null && aVar.B == this) {
                if (this.f9315d.isEmpty() && !this.f9313b.A.x()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            zb.k.L(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        zb.k.L(21, "Connection is recycled");
        throw null;
    }

    @Override // k7.c0
    public final Object d(k7.b0 b0Var, mc.p pVar, ec.j jVar) {
        if (!this.f9316e) {
            cc.g gVar = jVar.B;
            gVar.getClass();
            a aVar = (a) gVar.t(this.f9312a);
            if (aVar != null && aVar.B == this) {
                return g(b0Var, pVar, jVar);
            }
            zb.k.L(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        zb.k.L(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x004e, B:21:0x0056, B:27:0x0066, B:35:0x0094, B:30:0x006e, B:31:0x0073, B:32:0x0074, B:33:0x007a, B:34:0x0080), top: B:40:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:19:0x004e, B:21:0x0056, B:27:0x0066, B:35:0x0094, B:30:0x006e, B:31:0x0073, B:32:0x0074, B:33:0x007a, B:34:0x0080), top: B:40:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(k7.b0 r8, ec.c r9) {
        /*
            r7 = this;
            zb.j r0 = r7.f9315d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof m7.y
            if (r2 == 0) goto L17
            r2 = r9
            m7.y r2 = (m7.y) r2
            int r3 = r2.f9343b0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f9343b0 = r3
            goto L1c
        L17:
            m7.y r2 = new m7.y
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.Y
            dc.a r3 = dc.a.COROUTINE_SUSPENDED
            int r4 = r2.f9343b0
            r5 = 1
            m7.g r6 = r7.f9313b
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L33
            m7.g r8 = r2.X
            k7.b0 r2 = r2.R
            p7.j.I(r9)
            r9 = r8
            r8 = r2
            goto L4d
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L3a:
            p7.j.I(r9)
            r2.R = r8
            r2.X = r6
            r2.f9343b0 = r5
            id.a r9 = r6.B
            java.lang.Object r9 = r9.i(r2)
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r9 = r6
        L4d:
            r2 = 0
            int r3 = r0.L     // Catch: java.lang.Throwable -> L6c
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L80
            int[] r1 = m7.x.f9342a     // Catch: java.lang.Throwable -> L6c
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6c
            r8 = r1[r8]     // Catch: java.lang.Throwable -> L6c
            if (r8 == r5) goto L7a
            r1 = 2
            if (r8 == r1) goto L74
            r1 = 3
            if (r8 != r1) goto L6e
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            zb.k.r(r6, r8)     // Catch: java.lang.Throwable -> L6c
            goto L94
        L6c:
            r8 = move-exception
            goto La2
        L6e:
            androidx.fragment.app.g0 r8 = new androidx.fragment.app.g0     // Catch: java.lang.Throwable -> L6c
            r8.<init>()     // Catch: java.lang.Throwable -> L6c
            throw r8     // Catch: java.lang.Throwable -> L6c
        L74:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            zb.k.r(r6, r8)     // Catch: java.lang.Throwable -> L6c
            goto L94
        L7a:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            zb.k.r(r6, r8)     // Catch: java.lang.Throwable -> L6c
            goto L94
        L80:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            r8.append(r3)     // Catch: java.lang.Throwable -> L6c
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            zb.k.r(r6, r8)     // Catch: java.lang.Throwable -> L6c
        L94:
            m7.w r8 = new m7.w     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L6c
            r0.addLast(r8)     // Catch: java.lang.Throwable -> L6c
            yb.y r8 = yb.y.f14813a     // Catch: java.lang.Throwable -> L6c
            r9.d(r2)
            return r8
        La2:
            r9.d(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c0.e(k7.b0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:19:0x004e, B:21:0x0054, B:23:0x005e, B:25:0x0067, B:33:0x00a4, B:28:0x006f, B:29:0x0084, B:31:0x008a, B:32:0x0090, B:36:0x00aa, B:37:0x00b1), top: B:40:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {all -> 0x006d, blocks: (B:19:0x004e, B:21:0x0054, B:23:0x005e, B:25:0x0067, B:33:0x00a4, B:28:0x006f, B:29:0x0084, B:31:0x008a, B:32:0x0090, B:36:0x00aa, B:37:0x00b1), top: B:40:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r9, ec.c r10) {
        /*
            r8 = this;
            zb.j r0 = r8.f9315d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r10 instanceof m7.z
            if (r3 == 0) goto L19
            r3 = r10
            m7.z r3 = (m7.z) r3
            int r4 = r3.f9344b0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f9344b0 = r4
            goto L1e
        L19:
            m7.z r3 = new m7.z
            r3.<init>(r8, r10)
        L1e:
            java.lang.Object r10 = r3.Y
            dc.a r4 = dc.a.COROUTINE_SUSPENDED
            int r5 = r3.f9344b0
            r6 = 1
            m7.g r7 = r8.f9313b
            if (r5 == 0) goto L3a
            if (r5 != r6) goto L33
            boolean r9 = r3.R
            m7.g r3 = r3.X
            p7.j.I(r10)
            goto L4d
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L3a:
            p7.j.I(r10)
            r3.X = r7
            r3.R = r9
            r3.f9344b0 = r6
            id.a r10 = r7.B
            java.lang.Object r10 = r10.i(r3)
            if (r10 != r4) goto L4c
            return r4
        L4c:
            r3 = r7
        L4d:
            r10 = 0
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto Laa
            java.lang.Object r4 = zb.l.h0(r0)     // Catch: java.lang.Throwable -> L6d
            m7.w r4 = (m7.w) r4     // Catch: java.lang.Throwable -> L6d
            r5 = 39
            if (r9 == 0) goto L84
            r4.getClass()     // Catch: java.lang.Throwable -> L6d
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L6f
            java.lang.String r9 = "END TRANSACTION"
            zb.k.r(r7, r9)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L6d:
            r9 = move-exception
            goto Lb2
        L6f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L6d
            int r0 = r4.f9341a     // Catch: java.lang.Throwable -> L6d
            r9.append(r0)     // Catch: java.lang.Throwable -> L6d
            r9.append(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6d
            zb.k.r(r7, r9)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L84:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r9 == 0) goto L90
            java.lang.String r9 = "ROLLBACK TRANSACTION"
            zb.k.r(r7, r9)     // Catch: java.lang.Throwable -> L6d
            goto La4
        L90:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6d
            int r0 = r4.f9341a     // Catch: java.lang.Throwable -> L6d
            r9.append(r0)     // Catch: java.lang.Throwable -> L6d
            r9.append(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6d
            zb.k.r(r7, r9)     // Catch: java.lang.Throwable -> L6d
        La4:
            yb.y r9 = yb.y.f14813a     // Catch: java.lang.Throwable -> L6d
            r3.d(r10)
            return r9
        Laa:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6d
            java.lang.String r0 = "Not in a transaction"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            throw r9     // Catch: java.lang.Throwable -> L6d
        Lb2:
            r3.d(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c0.f(boolean, ec.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(1:(2:12|(1:(2:15|16)(3:18|19|20))(2:21|22))(2:23|24))(5:25|26|(1:28)|29|(1:32)(1:31)))(1:33))(3:37|(1:39)|40)|34|(4:36|(0)|29|(0))|32))|46|6|7|(0)(0)|34|(0)|32) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
        if (e(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:
        if (r10 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a9, code lost:
        p7.t.a(r10, r11);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
        throw r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Throwable, java.lang.Object, mc.p] */
    /* JADX WARN: Type inference failed for: r8v0, types: [m7.c0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(k7.b0 r9, mc.p r10, ec.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof m7.a0
            if (r0 == 0) goto L13
            r0 = r11
            m7.a0 r0 = (m7.a0) r0
            int r1 = r0.f9309c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9309c0 = r1
            goto L18
        L13:
            m7.a0 r0 = new m7.a0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.Z
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.f9309c0
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L62
            if (r2 == r7) goto L59
            if (r2 == r6) goto L50
            if (r2 == r5) goto L4a
            r9 = 4
            if (r2 == r9) goto L44
            if (r2 == r4) goto L37
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r9)
            r9 = 0
            return r9
        L37:
            java.lang.Throwable r9 = r0.X
            java.lang.Object r10 = r0.R
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            p7.j.I(r11)     // Catch: android.database.SQLException -> L42
            goto Lac
        L42:
            r11 = move-exception
            goto La7
        L44:
            java.lang.Object r9 = r0.R
            p7.j.I(r11)
            return r9
        L4a:
            java.lang.Object r9 = r0.R
            p7.j.I(r11)
            return r9
        L50:
            int r9 = r0.Y
            p7.j.I(r11)     // Catch: java.lang.Throwable -> L56
            goto L89
        L56:
            r9 = move-exception
            r10 = r9
            goto L98
        L59:
            java.lang.Object r9 = r0.R
            r10 = r9
            mc.p r10 = (mc.p) r10
            p7.j.I(r11)
            goto L74
        L62:
            p7.j.I(r11)
            if (r9 != 0) goto L69
            k7.b0 r9 = k7.b0.DEFERRED
        L69:
            r0.R = r10
            r0.f9309c0 = r7
            java.lang.Object r9 = r8.e(r9, r0)
            if (r9 != r1) goto L74
            goto La6
        L74:
            m7.k r9 = new m7.k     // Catch: java.lang.Throwable -> L56
            r11 = 1
            r9.<init>(r11, r8)     // Catch: java.lang.Throwable -> L56
            r11 = 0
            r0.R = r11     // Catch: java.lang.Throwable -> L56
            r0.Y = r7     // Catch: java.lang.Throwable -> L56
            r0.f9309c0 = r6     // Catch: java.lang.Throwable -> L56
            java.lang.Object r11 = r10.j(r9, r0)     // Catch: java.lang.Throwable -> L56
            if (r11 != r1) goto L88
            goto La6
        L88:
            r9 = r7
        L89:
            if (r9 == 0) goto L8c
            r3 = r7
        L8c:
            r0.R = r11
            r0.f9309c0 = r5
            java.lang.Object r9 = r8.f(r3, r0)
            if (r9 != r1) goto L97
            goto La6
        L97:
            return r11
        L98:
            throw r10     // Catch: java.lang.Throwable -> L99
        L99:
            r9 = move-exception
            r0.R = r10     // Catch: android.database.SQLException -> L42
            r0.X = r9     // Catch: android.database.SQLException -> L42
            r0.f9309c0 = r4     // Catch: android.database.SQLException -> L42
            java.lang.Object r10 = r8.f(r3, r0)     // Catch: android.database.SQLException -> L42
            if (r10 != r1) goto Lac
        La6:
            return r1
        La7:
            if (r10 == 0) goto Lad
            p7.t.a(r10, r11)
        Lac:
            throw r9
        Lad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.c0.g(k7.b0, mc.p, ec.c):java.lang.Object");
    }
}
