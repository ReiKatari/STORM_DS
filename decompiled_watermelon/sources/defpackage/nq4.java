package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nq4  reason: default package */
/* loaded from: classes.dex */
public final class nq4 implements qw6, h45 {
    public final iq0 a;
    public final dx0 b;
    public final boolean c;
    public final xt d;
    public volatile boolean e;

    public nq4(iq0 iq0Var, dx0 dx0Var, boolean z) {
        iq0Var.getClass();
        this.a = iq0Var;
        this.b = dx0Var;
        this.c = z;
        this.d = new xt();
    }

    @Override // defpackage.qw6
    public final Object a(pw6 pw6Var, aj2 aj2Var, nk6 nk6Var) {
        if (!this.e) {
            e31 e31Var = nk6Var.B;
            e31Var.getClass();
            sw0 sw0Var = (sw0) e31Var.I(this.a);
            if (sw0Var != null && sw0Var.B == this) {
                return g(pw6Var, aj2Var, nk6Var);
            }
            yf2.T(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        yf2.T(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // defpackage.fq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, defpackage.mi2 r8, defpackage.k11 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.mq4
            if (r0 == 0) goto L13
            r0 = r9
            mq4 r0 = (defpackage.mq4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            mq4 r0 = new mq4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            dx0 r7 = r0.Y
            mi2 r8 = r0.X
            java.lang.String r0 = r0.R
            defpackage.me2.a0(r9)
            r9 = r7
            r7 = r0
            goto L65
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r4
        L36:
            defpackage.me2.a0(r9)
            boolean r9 = r6.e
            r2 = 21
            if (r9 != 0) goto L8e
            e31 r9 = r0.B
            r9.getClass()
            iq0 r5 = r6.a
            c31 r9 = r9.I(r5)
            sw0 r9 = (defpackage.sw0) r9
            if (r9 == 0) goto L88
            nq4 r9 = r9.B
            if (r9 != r6) goto L88
            dx0 r9 = r6.b
            r0.R = r7
            r0.X = r8
            r0.Y = r9
            r0.d0 = r3
            z24 r2 = r9.B
            java.lang.Object r0 = r2.i(r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            gq4 r0 = new gq4     // Catch: java.lang.Throwable -> L7b
            dx0 r1 = r6.b     // Catch: java.lang.Throwable -> L7b
            ns5 r7 = r1.i0(r7)     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = r8.n(r0)     // Catch: java.lang.Throwable -> L7d
            defpackage.iq2.h(r0, r4)     // Catch: java.lang.Throwable -> L7b
            r9.d(r4)
            return r6
        L7b:
            r6 = move-exception
            goto L84
        L7d:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            defpackage.iq2.h(r0, r6)     // Catch: java.lang.Throwable -> L7b
            throw r7     // Catch: java.lang.Throwable -> L7b
        L84:
            r9.d(r4)
            throw r6
        L88:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            defpackage.yf2.T(r2, r6)
            throw r4
        L8e:
            java.lang.String r6 = "Connection is recycled"
            defpackage.yf2.T(r2, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq4.b(java.lang.String, mi2, k11):java.lang.Object");
    }

    @Override // defpackage.h45
    public final ls5 c() {
        return this.b;
    }

    @Override // defpackage.qw6
    public final Boolean d(j11 j11Var) {
        boolean z;
        if (!this.e) {
            e31 e31Var = ((k11) j11Var).B;
            e31Var.getClass();
            sw0 sw0Var = (sw0) e31Var.I(this.a);
            if (sw0Var != null && sw0Var.B == this) {
                if (this.d.isEmpty() && !this.b.A.G()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            yf2.T(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        yf2.T(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:18:0x004d, B:20:0x0055, B:26:0x0065, B:34:0x0093, B:29:0x006d, B:30:0x0072, B:31:0x0073, B:32:0x0079, B:33:0x007f), top: B:39:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:18:0x004d, B:20:0x0055, B:26:0x0065, B:34:0x0093, B:29:0x006d, B:30:0x0072, B:31:0x0073, B:32:0x0079, B:33:0x007f), top: B:39:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pw6 r8, defpackage.k11 r9) {
        /*
            r7 = this;
            xt r0 = r7.d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof defpackage.jq4
            if (r2 == 0) goto L17
            r2 = r9
            jq4 r2 = (defpackage.jq4) r2
            int r3 = r2.c0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c0 = r3
            goto L1c
        L17:
            jq4 r2 = new jq4
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.Y
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.c0
            r5 = 1
            dx0 r7 = r7.b
            r6 = 0
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L34
            dx0 r8 = r2.X
            pw6 r2 = r2.R
            defpackage.me2.a0(r9)
            r9 = r8
            r8 = r2
            goto L4d
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r6
        L3a:
            defpackage.me2.a0(r9)
            r2.R = r8
            r2.X = r7
            r2.c0 = r5
            z24 r9 = r7.B
            java.lang.Object r9 = r9.i(r2)
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r9 = r7
        L4d:
            int r2 = r0.L     // Catch: java.lang.Throwable -> L6b
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L7f
            int[] r1 = defpackage.iq4.a     // Catch: java.lang.Throwable -> L6b
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6b
            r8 = r1[r8]     // Catch: java.lang.Throwable -> L6b
            if (r8 == r5) goto L79
            r1 = 2
            if (r8 == r1) goto L73
            r1 = 3
            if (r8 != r1) goto L6d
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.yf2.o(r7, r8)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L6b:
            r7 = move-exception
            goto La1
        L6d:
            hg r7 = new hg     // Catch: java.lang.Throwable -> L6b
            r7.<init>()     // Catch: java.lang.Throwable -> L6b
            throw r7     // Catch: java.lang.Throwable -> L6b
        L73:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.yf2.o(r7, r8)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L79:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            defpackage.yf2.o(r7, r8)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L7f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            r8.append(r2)     // Catch: java.lang.Throwable -> L6b
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6b
            defpackage.yf2.o(r7, r8)     // Catch: java.lang.Throwable -> L6b
        L93:
            hq4 r7 = new hq4     // Catch: java.lang.Throwable -> L6b
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            r0.addLast(r7)     // Catch: java.lang.Throwable -> L6b
            o27 r7 = defpackage.o27.a     // Catch: java.lang.Throwable -> L6b
            r9.d(r6)
            return r7
        La1:
            r9.d(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq4.e(pw6, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:18:0x004d, B:20:0x0053, B:22:0x005d, B:24:0x0066, B:32:0x00a3, B:27:0x006e, B:28:0x0083, B:30:0x0089, B:31:0x008f, B:35:0x00a9, B:36:0x00b0), top: B:39:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:18:0x004d, B:20:0x0053, B:22:0x005d, B:24:0x0066, B:32:0x00a3, B:27:0x006e, B:28:0x0083, B:30:0x0089, B:31:0x008f, B:35:0x00a9, B:36:0x00b0), top: B:39:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r9, defpackage.k11 r10) {
        /*
            r8 = this;
            xt r0 = r8.d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r10 instanceof defpackage.kq4
            if (r3 == 0) goto L19
            r3 = r10
            kq4 r3 = (defpackage.kq4) r3
            int r4 = r3.c0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c0 = r4
            goto L1e
        L19:
            kq4 r3 = new kq4
            r3.<init>(r8, r10)
        L1e:
            java.lang.Object r10 = r3.Y
            p31 r4 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r3.c0
            r6 = 1
            dx0 r8 = r8.b
            r7 = 0
            if (r5 == 0) goto L3a
            if (r5 != r6) goto L34
            boolean r9 = r3.R
            dx0 r3 = r3.X
            defpackage.me2.a0(r10)
            goto L4d
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r7
        L3a:
            defpackage.me2.a0(r10)
            r3.X = r8
            r3.R = r9
            r3.c0 = r6
            z24 r10 = r8.B
            java.lang.Object r10 = r10.i(r3)
            if (r10 != r4) goto L4c
            return r4
        L4c:
            r3 = r8
        L4d:
            boolean r10 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r10 != 0) goto La9
            java.lang.Object r10 = defpackage.tq0.b1(r0)     // Catch: java.lang.Throwable -> L6c
            hq4 r10 = (defpackage.hq4) r10     // Catch: java.lang.Throwable -> L6c
            r4 = 39
            if (r9 == 0) goto L83
            r10.getClass()     // Catch: java.lang.Throwable -> L6c
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r9 == 0) goto L6e
            java.lang.String r9 = "END TRANSACTION"
            defpackage.yf2.o(r8, r9)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L6c:
            r8 = move-exception
            goto Lb1
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            int r10 = r10.a     // Catch: java.lang.Throwable -> L6c
            r9.append(r10)     // Catch: java.lang.Throwable -> L6c
            r9.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.yf2.o(r8, r9)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L83:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r9 == 0) goto L8f
            java.lang.String r9 = "ROLLBACK TRANSACTION"
            defpackage.yf2.o(r8, r9)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L8f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            int r10 = r10.a     // Catch: java.lang.Throwable -> L6c
            r9.append(r10)     // Catch: java.lang.Throwable -> L6c
            r9.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.yf2.o(r8, r9)     // Catch: java.lang.Throwable -> L6c
        La3:
            o27 r8 = defpackage.o27.a     // Catch: java.lang.Throwable -> L6c
            r3.d(r7)
            return r8
        La9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = "Not in a transaction"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L6c
            throw r8     // Catch: java.lang.Throwable -> L6c
        Lb1:
            r3.d(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq4.f(boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        if (e(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.pw6 r11, defpackage.aj2 r12, defpackage.k11 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.lq4
            if (r0 == 0) goto L13
            r0 = r13
            lq4 r0 = (defpackage.lq4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            lq4 r0 = new lq4
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 0
            r5 = 5
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 == r8) goto L53
            if (r2 == r7) goto L4b
            if (r2 == r6) goto L45
            r10 = 4
            if (r2 == r10) goto L45
            if (r2 == r5) goto L37
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r3
        L37:
            java.lang.Throwable r10 = r0.X
            java.lang.Object r11 = r0.R
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            defpackage.me2.a0(r13)     // Catch: android.database.SQLException -> L42
            goto Laa
        L42:
            r12 = move-exception
            goto La5
        L45:
            java.lang.Object r10 = r0.R
            defpackage.me2.a0(r13)
            return r10
        L4b:
            int r11 = r0.Y
            defpackage.me2.a0(r13)     // Catch: java.lang.Throwable -> L51
            goto L81
        L51:
            r11 = move-exception
            goto L90
        L53:
            java.lang.Object r11 = r0.R
            r12 = r11
            aj2 r12 = (defpackage.aj2) r12
            defpackage.me2.a0(r13)
            goto L6e
        L5c:
            defpackage.me2.a0(r13)
            if (r11 != 0) goto L63
            pw6 r11 = defpackage.pw6.DEFERRED
        L63:
            r0.R = r12
            r0.d0 = r8
            java.lang.Object r11 = r10.e(r11, r0)
            if (r11 != r1) goto L6e
            goto L9e
        L6e:
            zj4 r11 = new zj4     // Catch: java.lang.Throwable -> L51
            r11.<init>(r8, r10)     // Catch: java.lang.Throwable -> L51
            r0.R = r3     // Catch: java.lang.Throwable -> L51
            r0.Y = r8     // Catch: java.lang.Throwable -> L51
            r0.d0 = r7     // Catch: java.lang.Throwable -> L51
            java.lang.Object r13 = r12.j(r11, r0)     // Catch: java.lang.Throwable -> L51
            if (r13 != r1) goto L80
            goto L9e
        L80:
            r11 = r8
        L81:
            if (r11 == 0) goto L84
            r4 = r8
        L84:
            r0.R = r13
            r0.d0 = r6
            java.lang.Object r10 = r10.f(r4, r0)
            if (r10 != r1) goto L8f
            goto L9e
        L8f:
            return r13
        L90:
            throw r11     // Catch: java.lang.Throwable -> L91
        L91:
            r12 = move-exception
            r0.R = r11     // Catch: android.database.SQLException -> La1
            r0.X = r12     // Catch: android.database.SQLException -> La1
            r0.d0 = r5     // Catch: android.database.SQLException -> La1
            java.lang.Object r10 = r10.f(r4, r0)     // Catch: android.database.SQLException -> La1
            if (r10 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r10 = r12
            goto Laa
        La1:
            r10 = move-exception
            r9 = r12
            r12 = r10
            r10 = r9
        La5:
            if (r11 == 0) goto Lab
            defpackage.pu.k(r11, r12)
        Laa:
            throw r10
        Lab:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq4.g(pw6, aj2, k11):java.lang.Object");
    }
}
