package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a64  reason: default package */
/* loaded from: classes.dex */
public final class a64 extends yy3 implements zx6, u54 {
    public u54 j0;
    public q9 k0;
    public a64 l0;
    public final String m0;

    public a64(u54 u54Var, q9 q9Var) {
        this.j0 = u54Var;
        this.k0 = q9Var == null ? new q9(14) : q9Var;
        this.m0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.yy3
    public final void J0() {
        q9 q9Var = this.k0;
        q9Var.B = this;
        q9Var.L = null;
        this.l0 = null;
        q9Var.R = new dj(14, this);
        q9Var.X = F0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, n75] */
    @Override // defpackage.yy3
    public final void K0() {
        ?? obj = new Object();
        ve2.X(this, new xd(2, obj));
        a64 a64Var = (a64) ((zx6) obj.A);
        this.l0 = a64Var;
        q9 q9Var = this.k0;
        q9Var.L = a64Var;
        if (((a64) q9Var.B) == this) {
            q9Var.B = null;
        }
    }

    public final o31 R0() {
        o31 o31Var;
        a64 S0 = S0();
        if (S0 != null) {
            o31Var = S0.R0();
        } else {
            o31Var = null;
        }
        if (o31Var != null && iq2.t(o31Var)) {
            return o31Var;
        }
        o31 o31Var2 = (o31) this.k0.X;
        if (o31Var2 != null) {
            return o31Var2;
        }
        i.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final a64 S0() {
        zc0 zc0Var;
        zx6 zx6Var = null;
        if (!this.i0) {
            return null;
        }
        if (!this.A.i0) {
            mz2.c("visitAncestors called on an unattached node");
        }
        yy3 yy3Var = this.A.X;
        vf3 P = l.P(this);
        loop0: while (true) {
            if (P == null) {
                break;
            }
            if ((((yy3) P.A0.g).R & 262144) != 0) {
                while (yy3Var != null) {
                    if ((yy3Var.L & 262144) != 0) {
                        yy3 yy3Var2 = yy3Var;
                        o24 o24Var = null;
                        while (yy3Var2 != null) {
                            if (yy3Var2 instanceof zx6) {
                                zx6 zx6Var2 = (zx6) yy3Var2;
                                if (b53.x(this.m0, zx6Var2.t()) && a64.class == zx6Var2.getClass()) {
                                    zx6Var = zx6Var2;
                                    break loop0;
                                }
                            }
                            if ((yy3Var2.L & 262144) != 0 && (yy3Var2 instanceof xc1)) {
                                int i = 0;
                                for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                    if ((yy3Var3.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            yy3Var2 = yy3Var3;
                                        } else {
                                            if (o24Var == null) {
                                                o24Var = new o24(new yy3[16]);
                                            }
                                            if (yy3Var2 != null) {
                                                o24Var.b(yy3Var2);
                                                yy3Var2 = null;
                                            }
                                            o24Var.b(yy3Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            yy3Var2 = l.p(o24Var);
                        }
                        continue;
                    }
                    yy3Var = yy3Var.X;
                }
            }
            P = P.u();
            if (P != null && (zc0Var = P.A0) != null) {
                yy3Var = (lm6) zc0Var.f;
            } else {
                yy3Var = null;
            }
        }
        return (a64) zx6Var;
    }

    @Override // defpackage.u54
    public final long j0(long j, long j2, int i) {
        a64 a64Var;
        long j3;
        long j0 = this.j0.j0(j, j2, i);
        if (this.i0) {
            a64Var = S0();
        } else {
            a64Var = null;
        }
        a64 a64Var2 = a64Var;
        if (a64Var2 != null) {
            j3 = a64Var2.j0(mb4.e(j, j0), mb4.d(j2, j0), i);
        } else {
            j3 = 0;
        }
        return mb4.e(j0, j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r9 == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    @Override // defpackage.u54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m0(long r7, defpackage.j11 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.z54
            if (r0 == 0) goto L13
            r0 = r9
            z54 r0 = (defpackage.z54) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L1a
        L13:
            z54 r0 = new z54
            k11 r9 = (defpackage.k11) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            long r6 = r0.R
            defpackage.me2.a0(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L35:
            long r7 = r0.R
            defpackage.me2.a0(r9)
            goto L53
        L3b:
            defpackage.me2.a0(r9)
            boolean r9 = r6.i0
            if (r9 == 0) goto L46
            a64 r3 = r6.S0()
        L46:
            if (r3 == 0) goto L58
            r0.R = r7
            r0.Z = r5
            java.lang.Object r9 = r3.m0(r7, r0)
            if (r9 != r1) goto L53
            goto L6a
        L53:
            p77 r9 = (defpackage.p77) r9
            long r2 = r9.a
            goto L5a
        L58:
            r2 = 0
        L5a:
            u54 r6 = r6.j0
            long r7 = defpackage.p77.d(r7, r2)
            r0.R = r2
            r0.Z = r4
            java.lang.Object r9 = r6.m0(r7, r0)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r2
        L6c:
            p77 r9 = (defpackage.p77) r9
            long r8 = r9.a
            long r6 = defpackage.p77.e(r6, r8)
            p77 r8 = new p77
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a64.m0(long, j11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    @Override // defpackage.u54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(long r13, long r15, defpackage.j11 r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.y54
            if (r1 == 0) goto L16
            r1 = r0
            y54 r1 = (defpackage.y54) r1
            int r2 = r1.c0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.c0 = r2
        L14:
            r7 = r1
            goto L1e
        L16:
            y54 r1 = new y54
            k11 r0 = (defpackage.k11) r0
            r1.<init>(r12, r0)
            goto L14
        L1e:
            java.lang.Object r0 = r7.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r7.c0
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 == r3) goto L39
            if (r2 != r9) goto L33
            long r12 = r7.R
            defpackage.me2.a0(r0)
            goto L85
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r8
        L39:
            long r13 = r7.X
            long r2 = r7.R
            defpackage.me2.a0(r0)
            r10 = r2
            r2 = r13
            r13 = r10
            goto L59
        L44:
            defpackage.me2.a0(r0)
            u54 r2 = r12.j0
            r7.R = r13
            r5 = r15
            r7.X = r5
            r7.c0 = r3
            r3 = r13
            java.lang.Object r0 = r2.o0(r3, r5, r7)
            if (r0 != r1) goto L58
            goto L83
        L58:
            r2 = r15
        L59:
            p77 r0 = (defpackage.p77) r0
            long r4 = r0.a
            boolean r0 = r12.i0
            if (r0 == 0) goto L69
            if (r0 == 0) goto L67
            a64 r8 = r12.S0()
        L67:
            r12 = r8
            goto L6c
        L69:
            a64 r8 = r12.l0
            goto L67
        L6c:
            if (r12 == 0) goto L8b
            long r13 = defpackage.p77.e(r13, r4)
            long r2 = defpackage.p77.d(r2, r4)
            r7.R = r4
            r7.c0 = r9
            r15 = r2
            r17 = r7
            java.lang.Object r0 = r12.o0(r13, r15, r17)
            if (r0 != r1) goto L84
        L83:
            return r1
        L84:
            r12 = r4
        L85:
            p77 r0 = (defpackage.p77) r0
            long r0 = r0.a
            r4 = r12
            goto L8d
        L8b:
            r0 = 0
        L8d:
            long r12 = defpackage.p77.e(r4, r0)
            p77 r14 = new p77
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a64.o0(long, long, j11):java.lang.Object");
    }

    @Override // defpackage.zx6
    public final Object t() {
        return this.m0;
    }

    @Override // defpackage.u54
    public final long w0(int i, long j) {
        a64 a64Var;
        long j2;
        if (this.i0) {
            a64Var = S0();
        } else {
            a64Var = null;
        }
        if (a64Var != null) {
            j2 = a64Var.w0(i, j);
        } else {
            j2 = 0;
        }
        return mb4.e(j2, this.j0.w0(i, mb4.d(j, j2)));
    }
}
