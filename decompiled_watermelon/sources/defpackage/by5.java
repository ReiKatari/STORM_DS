package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: by5  reason: default package */
/* loaded from: classes.dex */
public final class by5 extends ku0 {
    public static final ko s = new ko(RecyclerView.A1);
    public static final ko t = new ko(1.0f);
    public final tj4 b;
    public final tj4 c;
    public Object d;
    public kx6 e;
    public long f;
    public final bz2 g;
    public bb6 h;
    public final pj4 i;
    public ih0 j;
    public final b34 k;
    public final y24 l;
    public long m;
    public final w14 n;
    public ux5 o;
    public final tx5 p;
    public float q;
    public final tx5 r;

    /* JADX WARN: Type inference failed for: r3v6, types: [tx5] */
    /* JADX WARN: Type inference failed for: r3v7, types: [tx5] */
    public by5(l34 l34Var) {
        super(3);
        this.b = me2.G(l34Var);
        this.c = me2.G(l34Var);
        this.d = l34Var;
        this.g = new bz2(27, this);
        this.i = new pj4(RecyclerView.A1);
        this.k = new b34();
        this.l = new y24();
        this.m = Long.MIN_VALUE;
        this.n = new w14();
        this.p = new mi2(this) { // from class: tx5
            public final /* synthetic */ by5 B;

            {
                this.B = this;
            }

            @Override // defpackage.mi2
            public final Object n(Object obj) {
                int i = r2;
                o27 o27Var = o27.a;
                by5 by5Var = this.B;
                long longValue = ((Long) obj).longValue();
                switch (i) {
                    case 0:
                        by5Var.m = longValue;
                        return o27Var;
                    default:
                        by5Var.m = longValue;
                        long Y = jv3.Y((longValue - by5Var.m) / by5Var.q);
                        w14 w14Var = by5Var.n;
                        if (w14Var.i()) {
                            Object[] objArr = w14Var.a;
                            int i2 = w14Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                ux5 ux5Var = (ux5) objArr[i4];
                                by5.u(ux5Var, Y);
                                ux5Var.c = true;
                            }
                            kx6 kx6Var = by5Var.e;
                            if (kx6Var != null) {
                                kx6Var.o();
                            }
                            int i5 = w14Var.b;
                            Object[] objArr2 = w14Var.a;
                            d33 t0 = io2.t0(0, i5);
                            int i6 = t0.A;
                            int i7 = t0.B;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((ux5) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            nu.l0(i5 - i3, i5, null, objArr2);
                            w14Var.b -= i3;
                        }
                        ux5 ux5Var2 = by5Var.o;
                        if (ux5Var2 != null) {
                            ux5Var2.g = by5Var.f;
                            by5.u(ux5Var2, Y);
                            by5Var.x(ux5Var2.d);
                            if (ux5Var2.d == 1.0f) {
                                by5Var.o = null;
                            }
                            by5Var.w();
                        }
                        return o27Var;
                }
            }
        };
        this.r = new mi2(this) { // from class: tx5
            public final /* synthetic */ by5 B;

            {
                this.B = this;
            }

            @Override // defpackage.mi2
            public final Object n(Object obj) {
                int i = r2;
                o27 o27Var = o27.a;
                by5 by5Var = this.B;
                long longValue = ((Long) obj).longValue();
                switch (i) {
                    case 0:
                        by5Var.m = longValue;
                        return o27Var;
                    default:
                        by5Var.m = longValue;
                        long Y = jv3.Y((longValue - by5Var.m) / by5Var.q);
                        w14 w14Var = by5Var.n;
                        if (w14Var.i()) {
                            Object[] objArr = w14Var.a;
                            int i2 = w14Var.b;
                            int i3 = 0;
                            for (int i4 = 0; i4 < i2; i4++) {
                                ux5 ux5Var = (ux5) objArr[i4];
                                by5.u(ux5Var, Y);
                                ux5Var.c = true;
                            }
                            kx6 kx6Var = by5Var.e;
                            if (kx6Var != null) {
                                kx6Var.o();
                            }
                            int i5 = w14Var.b;
                            Object[] objArr2 = w14Var.a;
                            d33 t0 = io2.t0(0, i5);
                            int i6 = t0.A;
                            int i7 = t0.B;
                            if (i6 <= i7) {
                                while (true) {
                                    objArr2[i6 - i3] = objArr2[i6];
                                    if (((ux5) objArr2[i6]).c) {
                                        i3++;
                                    }
                                    if (i6 != i7) {
                                        i6++;
                                    }
                                }
                            }
                            nu.l0(i5 - i3, i5, null, objArr2);
                            w14Var.b -= i3;
                        }
                        ux5 ux5Var2 = by5Var.o;
                        if (ux5Var2 != null) {
                            ux5Var2.g = by5Var.f;
                            by5.u(ux5Var2, Y);
                            by5Var.x(ux5Var2.d);
                            if (ux5Var2.d == 1.0f) {
                                by5Var.o = null;
                            }
                            by5Var.w();
                        }
                        return o27Var;
                }
            }
        };
    }

    public static final void o(by5 by5Var) {
        pj4 pj4Var = by5Var.i;
        kx6 kx6Var = by5Var.e;
        if (kx6Var == null) {
            return;
        }
        ux5 ux5Var = by5Var.o;
        if (ux5Var == null) {
            if (by5Var.f > 0 && pj4Var.h() != 1.0f && !b53.x(by5Var.c.getValue(), by5Var.b.getValue())) {
                ux5Var = new ux5();
                ux5Var.d = pj4Var.h();
                long j = by5Var.f;
                ux5Var.g = j;
                ux5Var.h = jv3.Y((1.0d - pj4Var.h()) * j);
                ux5Var.e.e(0, pj4Var.h());
            } else {
                ux5Var = null;
            }
        }
        if (ux5Var != null) {
            ux5Var.g = by5Var.f;
            by5Var.n.a(ux5Var);
            kx6Var.m(ux5Var);
        }
        by5Var.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.by5 r12, defpackage.k11 r13) {
        /*
            w14 r0 = r12.n
            boolean r1 = r13 instanceof defpackage.wx5
            if (r1 == 0) goto L15
            r1 = r13
            wx5 r1 = (defpackage.wx5) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            wx5 r1 = new wx5
            r1.<init>(r12, r13)
        L1a:
            e31 r13 = r1.B
            java.lang.Object r2 = r1.R
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r1.Y
            r5 = 2
            r6 = 1
            r7 = -9223372036854775808
            o27 r9 = defpackage.o27.a
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2f
            goto L36
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            r12 = 0
            return r12
        L36:
            defpackage.me2.a0(r2)
            goto L72
        L3a:
            defpackage.me2.a0(r2)
            boolean r2 = r0.h()
            if (r2 == 0) goto L48
            ux5 r2 = r12.o
            if (r2 != 0) goto L48
            return r9
        L48:
            r13.getClass()
            float r2 = defpackage.gk2.O(r13)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5a
            r12.t()
            r12.m = r7
            return r9
        L5a:
            long r10 = r12.m
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L72
            tx5 r2 = r12.p
            r1.Y = r6
            r13.getClass()
            im r13 = defpackage.io2.F(r13)
            java.lang.Object r13 = r13.a(r2, r1)
            if (r13 != r3) goto L72
            goto L88
        L72:
            boolean r13 = r0.i()
            if (r13 != 0) goto L80
            ux5 r13 = r12.o
            if (r13 == 0) goto L7d
            goto L80
        L7d:
            r12.m = r7
            return r9
        L80:
            r1.Y = r5
            java.lang.Object r13 = r12.s(r1)
            if (r13 != r3) goto L72
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by5.p(by5, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.i(r1) == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.by5 r8, defpackage.k11 r9) {
        /*
            b34 r0 = r8.k
            boolean r1 = r9 instanceof defpackage.zx5
            if (r1 == 0) goto L15
            r1 = r9
            zx5 r1 = (defpackage.zx5) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            zx5 r1 = new zx5
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.X
            p31 r2 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            java.lang.Object r0 = r1.R
            defpackage.me2.a0(r9)
            goto L6f
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r4
        L35:
            java.lang.Object r3 = r1.R
            defpackage.me2.a0(r9)
            r9 = r3
            goto L50
        L3c:
            defpackage.me2.a0(r9)
            tj4 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.R = r9
            r1.Z = r6
            java.lang.Object r3 = r0.i(r1)
            if (r3 != r2) goto L50
            goto L6b
        L50:
            r1.R = r9
            r1.Z = r5
            ih0 r3 = new ih0
            j11 r1 = defpackage.nk2.J(r1)
            r3.<init>(r6, r1)
            r3.x()
            r8.j = r3
            r0.d(r4)
            java.lang.Object r0 = r3.v()
            if (r0 != r2) goto L6c
        L6b:
            return r2
        L6c:
            r7 = r0
            r0 = r9
            r9 = r7
        L6f:
            boolean r9 = defpackage.b53.x(r9, r0)
            if (r9 == 0) goto L78
            o27 r8 = defpackage.o27.a
            return r8
        L78:
            r0 = -9223372036854775808
            r8.m = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by5.q(by5, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r0.i(r1) == r2) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.by5 r8, defpackage.k11 r9) {
        /*
            b34 r0 = r8.k
            boolean r1 = r9 instanceof defpackage.ay5
            if (r1 == 0) goto L15
            r1 = r9
            ay5 r1 = (defpackage.ay5) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Z = r2
            goto L1a
        L15:
            ay5 r1 = new ay5
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.X
            p31 r2 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3c
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            java.lang.Object r0 = r1.R
            defpackage.me2.a0(r9)
            goto L7b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r4
        L35:
            java.lang.Object r3 = r1.R
            defpackage.me2.a0(r9)
            r9 = r3
            goto L50
        L3c:
            defpackage.me2.a0(r9)
            tj4 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.R = r9
            r1.Z = r6
            java.lang.Object r3 = r0.i(r1)
            if (r3 != r2) goto L50
            goto L77
        L50:
            java.lang.Object r3 = r8.d
            boolean r3 = defpackage.b53.x(r9, r3)
            if (r3 == 0) goto L5c
            r0.d(r4)
            goto L81
        L5c:
            r1.R = r9
            r1.Z = r5
            ih0 r3 = new ih0
            j11 r1 = defpackage.nk2.J(r1)
            r3.<init>(r6, r1)
            r3.x()
            r8.j = r3
            r0.d(r4)
            java.lang.Object r0 = r3.v()
            if (r0 != r2) goto L78
        L77:
            return r2
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            boolean r1 = defpackage.b53.x(r9, r0)
            if (r1 == 0) goto L84
        L81:
            o27 r8 = defpackage.o27.a
            return r8
        L84:
            r1 = -9223372036854775808
            r8.m = r1
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by5.r(by5, k11):java.lang.Object");
    }

    public static void u(ux5 ux5Var, long j) {
        long j2 = ux5Var.a + j;
        ux5Var.a = j2;
        long j3 = ux5Var.h;
        if (j2 >= j3) {
            ux5Var.d = 1.0f;
            return;
        }
        m77 m77Var = ux5Var.b;
        ko koVar = ux5Var.e;
        if (m77Var != null) {
            ko koVar2 = ux5Var.f;
            if (koVar2 == null) {
                koVar2 = s;
            }
            ux5Var.d = io2.l(((ko) m77Var.p(j2, koVar, t, koVar2)).a(0), RecyclerView.A1, 1.0f);
            return;
        }
        float f = ((float) j2) / ((float) j3);
        float f2 = 1.0f - f;
        ux5Var.d = (f * 1.0f) + (f2 * koVar.a(0));
    }

    @Override // defpackage.ku0
    public final Object f() {
        return this.c.getValue();
    }

    @Override // defpackage.ku0
    public final Object h() {
        return this.b.getValue();
    }

    @Override // defpackage.ku0
    public final void l(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.ku0
    public final void m(kx6 kx6Var) {
        kx6 kx6Var2 = this.e;
        if (kx6Var2 != null && kx6Var != kx6Var2) {
            qr4.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + kx6Var);
        }
        this.e = kx6Var;
    }

    @Override // defpackage.ku0
    public final void n() {
        this.e = null;
        bb6 bb6Var = this.h;
        if (bb6Var != null) {
            bb6Var.b(this);
        }
    }

    public final Object s(k11 k11Var) {
        float O = gk2.O(k11Var.a());
        int i = (O > RecyclerView.A1 ? 1 : (O == RecyclerView.A1 ? 0 : -1));
        o27 o27Var = o27.a;
        if (i <= 0) {
            t();
            return o27Var;
        }
        this.q = O;
        Object a = io2.F(k11Var.a()).a(this.r, k11Var);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return o27Var;
    }

    public final void t() {
        kx6 kx6Var = this.e;
        if (kx6Var != null) {
            kx6Var.c();
        }
        this.n.d();
        if (this.o != null) {
            this.o = null;
            x(1.0f);
            w();
        }
    }

    public final Object v(float f, Object obj, nk6 nk6Var) {
        if (RecyclerView.A1 > f || f > 1.0f) {
            qr4.a("Expecting fraction between 0 and 1. Got " + f);
        }
        kx6 kx6Var = this.e;
        if (kx6Var != null) {
            Object a = y24.a(this.l, new yx5(obj, this.b.getValue(), this, kx6Var, f, null), nk6Var);
            if (a == p31.COROUTINE_SUSPENDED) {
                return a;
            }
        }
        return o27.a;
    }

    public final void w() {
        kx6 kx6Var = this.e;
        if (kx6Var == null) {
            return;
        }
        kx6Var.l(jv3.Y(this.i.h() * ((Number) kx6Var.l.getValue()).longValue()));
    }

    public final void x(float f) {
        this.i.i(f);
    }

    public final void y(bb6 bb6Var) {
        a31 a31Var;
        if (!b53.x(this.h, bb6Var)) {
            bb6 bb6Var2 = this.h;
            if (bb6Var2 != null) {
                bb6Var2.b(this);
            }
            bb6 bb6Var3 = this.h;
            if (bb6Var3 != null && (a31Var = bb6Var3.h) != null) {
                a31Var.g();
            }
            this.h = bb6Var;
            if (bb6Var != null) {
                bb6Var.e();
            }
            bb6 bb6Var4 = this.h;
            if (bb6Var4 != null) {
                bb6Var4.d(this, a53.p, this.g);
            }
        }
    }
}
