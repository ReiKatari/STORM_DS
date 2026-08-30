package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 extends a3.b {

    /* renamed from: r  reason: collision with root package name */
    public static final l f3692r = new l(0.0f);

    /* renamed from: s  reason: collision with root package name */
    public static final l f3693s = new l(1.0f);

    /* renamed from: b  reason: collision with root package name */
    public final n2.f1 f3694b;

    /* renamed from: c  reason: collision with root package name */
    public final n2.f1 f3695c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3696d;

    /* renamed from: e  reason: collision with root package name */
    public q1 f3697e;

    /* renamed from: f  reason: collision with root package name */
    public long f3698f;

    /* renamed from: g  reason: collision with root package name */
    public final a2.n f3699g;

    /* renamed from: h  reason: collision with root package name */
    public final n2.b1 f3700h;

    /* renamed from: i  reason: collision with root package name */
    public zc.h f3701i;

    /* renamed from: j  reason: collision with root package name */
    public final id.c f3702j;

    /* renamed from: k  reason: collision with root package name */
    public final m0 f3703k;

    /* renamed from: l  reason: collision with root package name */
    public long f3704l;
    public final a1.h0 m;

    /* renamed from: n  reason: collision with root package name */
    public q0 f3705n;

    /* renamed from: o  reason: collision with root package name */
    public final p0 f3706o;

    /* renamed from: p  reason: collision with root package name */
    public float f3707p;

    /* renamed from: q  reason: collision with root package name */
    public final p0 f3708q;

    /* JADX WARN: Type inference failed for: r3v6, types: [d1.p0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [d1.p0] */
    public x0(a7.i iVar) {
        super(1);
        this.f3694b = n2.s.w(iVar);
        this.f3695c = n2.s.w(iVar);
        this.f3696d = iVar;
        this.f3699g = new a2.n(7, this);
        this.f3700h = new n2.b1(0.0f);
        this.f3702j = new id.c();
        this.f3703k = new m0();
        this.f3704l = Long.MIN_VALUE;
        this.m = new a1.h0();
        this.f3706o = new mc.l(this) { // from class: d1.p0
            public final /* synthetic */ x0 B;

            {
                this.B = this;
            }

            @Override // mc.l
            public final Object k(Object obj) {
                Long l10 = (Long) obj;
                switch (r2) {
                    case 0:
                        this.B.f3704l = l10.longValue();
                        return yb.y.f14813a;
                    default:
                        long longValue = l10.longValue();
                        x0 x0Var = this.B;
                        x0Var.f3704l = longValue;
                        long N = pc.a.N((longValue - x0Var.f3704l) / x0Var.f3707p);
                        a1.h0 h0Var = x0Var.m;
                        if (h0Var.i()) {
                            Object[] objArr = h0Var.f44a;
                            int i2 = h0Var.f45b;
                            int i10 = 0;
                            for (int i11 = 0; i11 < i2; i11++) {
                                q0 q0Var = (q0) objArr[i11];
                                x0.p(q0Var, N);
                                q0Var.f3643c = true;
                            }
                            q1 q1Var = x0Var.f3697e;
                            if (q1Var != null) {
                                q1Var.o();
                            }
                            int i12 = h0Var.f45b;
                            Object[] objArr2 = h0Var.f44a;
                            sc.d L = p7.j.L(0, i12);
                            int i13 = L.A;
                            int i14 = L.B;
                            if (i13 <= i14) {
                                while (true) {
                                    objArr2[i13 - i10] = objArr2[i13];
                                    if (((q0) objArr2[i13]).f3643c) {
                                        i10++;
                                    }
                                    if (i13 != i14) {
                                        i13++;
                                    }
                                }
                            }
                            zb.k.s(i12 - i10, i12, null, objArr2);
                            h0Var.f45b -= i10;
                        }
                        q0 q0Var2 = x0Var.f3705n;
                        if (q0Var2 != null) {
                            q0Var2.f3647g = x0Var.f3698f;
                            x0.p(q0Var2, N);
                            x0Var.s(q0Var2.f3644d);
                            if (q0Var2.f3644d == 1.0f) {
                                x0Var.f3705n = null;
                            }
                            x0Var.r();
                        }
                        return yb.y.f14813a;
                }
            }
        };
        this.f3708q = new mc.l(this) { // from class: d1.p0
            public final /* synthetic */ x0 B;

            {
                this.B = this;
            }

            @Override // mc.l
            public final Object k(Object obj) {
                Long l10 = (Long) obj;
                switch (r2) {
                    case 0:
                        this.B.f3704l = l10.longValue();
                        return yb.y.f14813a;
                    default:
                        long longValue = l10.longValue();
                        x0 x0Var = this.B;
                        x0Var.f3704l = longValue;
                        long N = pc.a.N((longValue - x0Var.f3704l) / x0Var.f3707p);
                        a1.h0 h0Var = x0Var.m;
                        if (h0Var.i()) {
                            Object[] objArr = h0Var.f44a;
                            int i2 = h0Var.f45b;
                            int i10 = 0;
                            for (int i11 = 0; i11 < i2; i11++) {
                                q0 q0Var = (q0) objArr[i11];
                                x0.p(q0Var, N);
                                q0Var.f3643c = true;
                            }
                            q1 q1Var = x0Var.f3697e;
                            if (q1Var != null) {
                                q1Var.o();
                            }
                            int i12 = h0Var.f45b;
                            Object[] objArr2 = h0Var.f44a;
                            sc.d L = p7.j.L(0, i12);
                            int i13 = L.A;
                            int i14 = L.B;
                            if (i13 <= i14) {
                                while (true) {
                                    objArr2[i13 - i10] = objArr2[i13];
                                    if (((q0) objArr2[i13]).f3643c) {
                                        i10++;
                                    }
                                    if (i13 != i14) {
                                        i13++;
                                    }
                                }
                            }
                            zb.k.s(i12 - i10, i12, null, objArr2);
                            h0Var.f45b -= i10;
                        }
                        q0 q0Var2 = x0Var.f3705n;
                        if (q0Var2 != null) {
                            q0Var2.f3647g = x0Var.f3698f;
                            x0.p(q0Var2, N);
                            x0Var.s(q0Var2.f3644d);
                            if (q0Var2.f3644d == 1.0f) {
                                x0Var.f3705n = null;
                            }
                            x0Var.r();
                        }
                        return yb.y.f14813a;
                }
            }
        };
    }

    public static final void j(x0 x0Var) {
        n2.b1 b1Var = x0Var.f3700h;
        q1 q1Var = x0Var.f3697e;
        if (q1Var == null) {
            return;
        }
        q0 q0Var = x0Var.f3705n;
        if (q0Var == null) {
            if (x0Var.f3698f > 0 && b1Var.g() != 1.0f && !nc.k.a(x0Var.f3695c.getValue(), x0Var.f3694b.getValue())) {
                q0Var = new q0();
                q0Var.f3644d = b1Var.g();
                long j2 = x0Var.f3698f;
                q0Var.f3647g = j2;
                q0Var.f3648h = pc.a.N((1.0d - b1Var.g()) * j2);
                q0Var.f3645e.e(0, b1Var.g());
            } else {
                q0Var = null;
            }
        }
        if (q0Var != null) {
            q0Var.f3647g = x0Var.f3698f;
            x0Var.m.a(q0Var);
            q1Var.m(q0Var);
        }
        x0Var.f3705n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(d1.x0 r12, ec.c r13) {
        /*
            a1.h0 r0 = r12.m
            boolean r1 = r13 instanceof d1.s0
            if (r1 == 0) goto L15
            r1 = r13
            d1.s0 r1 = (d1.s0) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            d1.s0 r1 = new d1.s0
            r1.<init>(r12, r13)
        L1a:
            cc.g r13 = r1.B
            java.lang.Object r2 = r1.R
            dc.a r3 = dc.a.COROUTINE_SUSPENDED
            int r4 = r1.Y
            r5 = 2
            r6 = 1
            r7 = -9223372036854775808
            yb.y r9 = yb.y.f14813a
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2f
            goto L36
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r12)
            r12 = 0
            return r12
        L36:
            p7.j.I(r2)
            goto L72
        L3a:
            p7.j.I(r2)
            boolean r2 = r0.h()
            if (r2 == 0) goto L48
            d1.q0 r2 = r12.f3705n
            if (r2 != 0) goto L48
            return r9
        L48:
            r13.getClass()
            float r2 = d1.d.n(r13)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5a
            r12.o()
            r12.f3704l = r7
            return r9
        L5a:
            long r10 = r12.f3704l
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L72
            d1.p0 r2 = r12.f3706o
            r1.Y = r6
            r13.getClass()
            b4.a1 r13 = n2.s.t(r13)
            java.lang.Object r13 = r13.a(r2, r1)
            if (r13 != r3) goto L72
            goto L88
        L72:
            boolean r13 = r0.i()
            if (r13 != 0) goto L80
            d1.q0 r13 = r12.f3705n
            if (r13 == 0) goto L7d
            goto L80
        L7d:
            r12.f3704l = r7
            return r9
        L80:
            r1.Y = r5
            java.lang.Object r13 = r12.n(r1)
            if (r13 != r3) goto L72
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.x0.k(d1.x0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.i(r1) == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(d1.x0 r7, ec.c r8) {
        /*
            id.c r0 = r7.f3702j
            boolean r1 = r8 instanceof d1.v0
            if (r1 == 0) goto L15
            r1 = r8
            d1.v0 r1 = (d1.v0) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            d1.v0 r1 = new d1.v0
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.X
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            java.lang.Object r0 = r1.R
            p7.j.I(r8)
            goto L70
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L35:
            java.lang.Object r3 = r1.R
            p7.j.I(r8)
            r8 = r3
            goto L50
        L3c:
            p7.j.I(r8)
            n2.f1 r8 = r7.f3694b
            java.lang.Object r8 = r8.getValue()
            r1.R = r8
            r1.Z = r5
            java.lang.Object r3 = r0.i(r1)
            if (r3 != r2) goto L50
            goto L6c
        L50:
            r1.R = r8
            r1.Z = r4
            zc.h r3 = new zc.h
            cc.c r1 = pc.a.A(r1)
            r3.<init>(r5, r1)
            r3.v()
            r7.f3701i = r3
            r1 = 0
            r0.d(r1)
            java.lang.Object r0 = r3.u()
            if (r0 != r2) goto L6d
        L6c:
            return r2
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            boolean r8 = nc.k.a(r8, r0)
            if (r8 == 0) goto L79
            yb.y r7 = yb.y.f14813a
            return r7
        L79:
            r0 = -9223372036854775808
            r7.f3704l = r0
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "targetState while waiting for composition"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.x0.l(d1.x0, ec.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.i(r1) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(d1.x0 r8, ec.c r9) {
        /*
            id.c r0 = r8.f3702j
            boolean r1 = r9 instanceof d1.w0
            if (r1 == 0) goto L15
            r1 = r9
            d1.w0 r1 = (d1.w0) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            d1.w0 r1 = new d1.w0
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.X
            dc.a r2 = dc.a.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2e
            java.lang.Object r0 = r1.R
            p7.j.I(r9)
            goto L7c
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r8)
            r8 = 0
            return r8
        L35:
            java.lang.Object r3 = r1.R
            p7.j.I(r9)
            r9 = r3
            goto L50
        L3c:
            p7.j.I(r9)
            n2.f1 r9 = r8.f3694b
            java.lang.Object r9 = r9.getValue()
            r1.R = r9
            r1.Z = r5
            java.lang.Object r3 = r0.i(r1)
            if (r3 != r2) goto L50
            goto L78
        L50:
            java.lang.Object r3 = r8.f3696d
            boolean r3 = nc.k.a(r9, r3)
            r6 = 0
            if (r3 == 0) goto L5d
            r0.d(r6)
            goto L82
        L5d:
            r1.R = r9
            r1.Z = r4
            zc.h r3 = new zc.h
            cc.c r1 = pc.a.A(r1)
            r3.<init>(r5, r1)
            r3.v()
            r8.f3701i = r3
            r0.d(r6)
            java.lang.Object r0 = r3.u()
            if (r0 != r2) goto L79
        L78:
            return r2
        L79:
            r7 = r0
            r0 = r9
            r9 = r7
        L7c:
            boolean r1 = nc.k.a(r9, r0)
            if (r1 == 0) goto L85
        L82:
            yb.y r8 = yb.y.f14813a
            return r8
        L85:
            r1 = -9223372036854775808
            r8.f3704l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.x0.m(d1.x0, ec.c):java.lang.Object");
    }

    public static void p(q0 q0Var, long j2) {
        long j10 = q0Var.f3641a + j2;
        q0Var.f3641a = j10;
        long j11 = q0Var.f3648h;
        if (j10 >= j11) {
            q0Var.f3644d = 1.0f;
            return;
        }
        b2 b2Var = q0Var.f3642b;
        l lVar = q0Var.f3645e;
        if (b2Var != null) {
            l lVar2 = q0Var.f3646f;
            if (lVar2 == null) {
                lVar2 = f3692r;
            }
            q0Var.f3644d = p7.j.f(((l) b2Var.F(j10, lVar, f3693s, lVar2)).a(0), 0.0f, 1.0f);
            return;
        }
        float f8 = ((float) j10) / ((float) j11);
        float f10 = 1 - f8;
        q0Var.f3644d = (f8 * 1.0f) + (f10 * lVar.a(0));
    }

    @Override // a3.b
    public final Object c() {
        return this.f3695c.getValue();
    }

    @Override // a3.b
    public final Object e() {
        return this.f3694b.getValue();
    }

    @Override // a3.b
    public final void g(Object obj) {
        this.f3695c.setValue(obj);
    }

    @Override // a3.b
    public final void h(q1 q1Var) {
        q1 q1Var2 = this.f3697e;
        if (q1Var2 != null && !q1Var.equals(q1Var2)) {
            n0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f3697e + ", new instance: " + q1Var);
        }
        this.f3697e = q1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:4:0x0010, B:8:0x001a, B:27:0x0084, B:29:0x008c, B:34:0x009c, B:31:0x0091, B:11:0x002b, B:14:0x0037, B:16:0x004c, B:18:0x0058, B:20:0x0062, B:22:0x0072, B:26:0x007e, B:35:0x00a1), top: B:40:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [yb.f, java.lang.Object] */
    @Override // a3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r22 = this;
            r1 = r22
            r0 = 0
            r1.f3697e = r0
            java.lang.Object r2 = d1.u1.f3683b
            java.lang.Object r2 = r2.getValue()
            z2.u r2 = (z2.u) r2
            java.lang.Object r3 = r2.f14951g
            monitor-enter(r3)
            p2.b r2 = r2.f14950f     // Catch: java.lang.Throwable -> L9a
            int r4 = r2.L     // Catch: java.lang.Throwable -> L9a
            r6 = 0
            r7 = 0
        L16:
            java.lang.Object[] r8 = r2.A
            if (r6 >= r4) goto La1
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L9a
            z2.t r8 = (z2.t) r8     // Catch: java.lang.Throwable -> L9a
            a1.m0 r9 = r8.f14938f     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r9 = r9.k(r1)     // Catch: java.lang.Throwable -> L9a
            a1.d0 r9 = (a1.d0) r9     // Catch: java.lang.Throwable -> L9a
            if (r9 != 0) goto L2b
        L28:
            r16 = r6
            goto L84
        L2b:
            java.lang.Object[] r10 = r9.f33b     // Catch: java.lang.Throwable -> L9a
            int[] r11 = r9.f34c     // Catch: java.lang.Throwable -> L9a
            long[] r9 = r9.f32a     // Catch: java.lang.Throwable -> L9a
            int r12 = r9.length     // Catch: java.lang.Throwable -> L9a
            int r12 = r12 + (-2)
            if (r12 < 0) goto L28
            r13 = 0
        L37:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L9a
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L9a
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L7c
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L9a
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r0 = 0
        L56:
            if (r0 >= r5) goto L79
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L70
            int r18 = r13 << 3
            int r18 = r18 + r0
            r19 = r6
            r6 = r10[r18]     // Catch: java.lang.Throwable -> L9a
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L9a
            r8.c(r1, r6)     // Catch: java.lang.Throwable -> L9a
            goto L72
        L70:
            r19 = r6
        L72:
            long r14 = r14 >> r19
            int r0 = r0 + 1
            r6 = r19
            goto L56
        L79:
            r0 = r6
            if (r5 != r0) goto L84
        L7c:
            if (r13 == r12) goto L84
            int r13 = r13 + 1
            r6 = r16
            r0 = 0
            goto L37
        L84:
            a1.m0 r0 = r8.f14938f     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r0.j()     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L8f
            int r7 = r7 + 1
            goto L9c
        L8f:
            if (r7 <= 0) goto L9c
            java.lang.Object[] r0 = r2.A     // Catch: java.lang.Throwable -> L9a
            int r6 = r16 - r7
            r5 = r0[r16]     // Catch: java.lang.Throwable -> L9a
            r0[r6] = r5     // Catch: java.lang.Throwable -> L9a
            goto L9c
        L9a:
            r0 = move-exception
            goto Lab
        L9c:
            int r6 = r16 + 1
            r0 = 0
            goto L16
        La1:
            int r0 = r4 - r7
            r5 = 0
            java.util.Arrays.fill(r8, r0, r4, r5)     // Catch: java.lang.Throwable -> L9a
            r2.L = r0     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r3)
            return
        Lab:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.x0.i():void");
    }

    public final Object n(ec.c cVar) {
        float n10 = d.n(cVar.g());
        int i2 = (n10 > 0.0f ? 1 : (n10 == 0.0f ? 0 : -1));
        yb.y yVar = yb.y.f14813a;
        if (i2 <= 0) {
            o();
            return yVar;
        }
        this.f3707p = n10;
        Object a10 = n2.s.t(cVar.g()).a(this.f3708q, cVar);
        if (a10 == dc.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return yVar;
    }

    public final void o() {
        q1 q1Var = this.f3697e;
        if (q1Var != null) {
            q1Var.c();
        }
        this.m.d();
        if (this.f3705n != null) {
            this.f3705n = null;
            s(1.0f);
            r();
        }
    }

    public final Object q(float f8, Object obj, ec.j jVar) {
        if (0.0f > f8 || f8 > 1.0f) {
            n0.a("Expecting fraction between 0 and 1. Got " + f8);
        }
        q1 q1Var = this.f3697e;
        if (q1Var != null) {
            Object a10 = m0.a(this.f3703k, new u0(obj, this.f3694b.getValue(), this, q1Var, f8, null), jVar);
            if (a10 == dc.a.COROUTINE_SUSPENDED) {
                return a10;
            }
        }
        return yb.y.f14813a;
    }

    public final void r() {
        q1 q1Var = this.f3697e;
        if (q1Var == null) {
            return;
        }
        q1Var.l(pc.a.N(this.f3700h.g() * ((Number) q1Var.f3660l.getValue()).longValue()));
    }

    public final void s(float f8) {
        this.f3700h.h(f8);
    }
}
