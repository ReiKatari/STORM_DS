package a4;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 extends y3.i1 implements y3.u0, b, k1 {
    public mc.l A0;
    public float C0;
    public boolean E0;
    public final t0 Y;
    public boolean Z;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f223d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f224e0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f226g0;

    /* renamed from: i0  reason: collision with root package name */
    public mc.l f228i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f229j0;

    /* renamed from: l0  reason: collision with root package name */
    public Object f231l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f232m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f233n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f234o0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f235q0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f239u0;

    /* renamed from: y0  reason: collision with root package name */
    public float f243y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f244z0;

    /* renamed from: b0  reason: collision with root package name */
    public int f221b0 = Preference.DEFAULT_ORDER;

    /* renamed from: c0  reason: collision with root package name */
    public int f222c0 = Preference.DEFAULT_ORDER;

    /* renamed from: f0  reason: collision with root package name */
    public k0 f225f0 = k0.NotUsed;

    /* renamed from: h0  reason: collision with root package name */
    public long f227h0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f230k0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public final p0 f236r0 = new p0(this, 0);

    /* renamed from: s0  reason: collision with root package name */
    public final p2.b f237s0 = new p2.b(new i1[16]);

    /* renamed from: t0  reason: collision with root package name */
    public boolean f238t0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public long f240v0 = x4.b.b(0, 0, 15);

    /* renamed from: w0  reason: collision with root package name */
    public final h1 f241w0 = new h1(this, 1);

    /* renamed from: x0  reason: collision with root package name */
    public final h1 f242x0 = new h1(this, 0);
    public long B0 = 0;
    public final h1 D0 = new h1(this, 2);

    public i1(t0 t0Var) {
        this.Y = t0Var;
    }

    @Override // a4.b
    public final void B(a aVar) {
        p2.b z10 = this.Y.f334a.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            aVar.k(((o0) objArr[i10]).B0.f348p);
        }
    }

    public final void B0() {
        k0 k0Var;
        t0 t0Var = this.Y;
        o0.X(t0Var.f334a, false, 7);
        o0 o0Var = t0Var.f334a;
        o0 u4 = o0Var.u();
        if (u4 != null && o0Var.f299x0 == k0.NotUsed) {
            int i2 = g1.f218a[u4.B0.f337d.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    k0Var = u4.f299x0;
                } else {
                    k0Var = k0.InLayoutBlock;
                }
            } else {
                k0Var = k0.InMeasureBlock;
            }
            o0Var.f299x0 = k0Var;
        }
    }

    public final void C0() {
        this.f244z0 = true;
        t0 t0Var = this.Y;
        o0 u4 = t0Var.f334a.u();
        float f8 = z().f328w0;
        o0 o0Var = t0Var.f334a;
        n1 n1Var = o0Var.A0;
        r1 r1Var = n1Var.f266d;
        v vVar = n1Var.f265c;
        while (r1Var != vVar) {
            r1Var.getClass();
            d0 d0Var = (d0) r1Var;
            f8 += d0Var.f328w0;
            r1Var = d0Var.f318l0;
        }
        if (f8 != this.f243y0) {
            this.f243y0 = f8;
            if (u4 != null) {
                u4.O();
            }
            if (u4 != null) {
                u4.C();
            }
        }
        if (!z().f362e0) {
            boolean z10 = this.f232m0;
            if (!z10 || this.f236r0.d()) {
                w0();
            }
            if (!z10) {
                if (u4 != null) {
                    u4.C();
                }
                if (this.Z && u4 != null) {
                    u4.W(false);
                }
            } else {
                o0Var.A0.f265c.i1();
            }
        }
        if (u4 != null) {
            t0 t0Var2 = u4.B0;
            if (!this.Z && t0Var2.f337d == i0.LayingOut) {
                if (this.f222c0 != Integer.MAX_VALUE) {
                    x3.a.c("Place was called on a node which was placed already");
                }
                int i2 = t0Var2.f342i;
                this.f222c0 = i2;
                t0Var2.f342i = i2 + 1;
            }
        } else {
            this.f222c0 = 0;
        }
        M();
    }

    public final void D0(long j2, float f8, mc.l lVar) {
        t0 t0Var = this.Y;
        o0 o0Var = t0Var.f334a;
        o0 o0Var2 = t0Var.f334a;
        if (o0Var.J0) {
            x3.a.a("place is called on a deactivated node");
        }
        t0Var.f337d = i0.LayingOut;
        this.f227h0 = j2;
        this.f229j0 = f8;
        this.f228i0 = lVar;
        this.f244z0 = false;
        c2 a10 = s0.a(o0Var2);
        if (!this.p0 && this.f232m0) {
            r1 a11 = t0Var.a();
            a11.n1(x4.j.c(j2, a11.X), f8, lVar);
            C0();
        } else {
            this.f236r0.f311g = false;
            t0Var.f(false);
            this.A0 = lVar;
            this.B0 = j2;
            this.C0 = f8;
            e2 snapshotObserver = ((b4.x) a10).getSnapshotObserver();
            snapshotObserver.f194a.c(o0Var2, snapshotObserver.f199f, this.D0);
        }
        t0Var.f337d = i0.Idle;
        if (t0Var.a().f362e0 && (t0Var.f344k || t0Var.f343j)) {
            requestLayout();
        }
        this.f224e0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:24:0x0052->B:25:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x0023, B:16:0x002b, B:18:0x0033, B:21:0x003c, B:23:0x0045, B:25:0x0054, B:26:0x0063, B:30:0x007a, B:32:0x0099, B:33:0x009f, B:35:0x00ab, B:37:0x00b5, B:41:0x00c1, B:29:0x0075), top: B:45:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E0(long r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.i1.E0(long):boolean");
    }

    @Override // a4.b
    public final b K() {
        t0 t0Var;
        o0 u4 = this.Y.f334a.u();
        if (u4 != null && (t0Var = u4.B0) != null) {
            return t0Var.f348p;
        }
        return null;
    }

    @Override // a4.b
    public final void M() {
        this.f239u0 = true;
        p0 p0Var = this.f236r0;
        p0Var.h();
        boolean z10 = this.p0;
        t0 t0Var = this.Y;
        if (z10) {
            p2.b z11 = t0Var.f334a.z();
            Object[] objArr = z11.A;
            int i2 = z11.L;
            for (int i10 = 0; i10 < i2; i10++) {
                o0 o0Var = (o0) objArr[i10];
                if (o0Var.q() && o0Var.r() == k0.InMeasureBlock && o0.Q(o0Var)) {
                    o0.X(t0Var.f334a, false, 7);
                }
            }
        }
        if (this.f235q0 || (!this.f226g0 && !z().f362e0 && this.p0)) {
            this.p0 = false;
            i0 i0Var = t0Var.f337d;
            t0Var.f337d = i0.LayingOut;
            t0Var.g(false);
            o0 o0Var2 = t0Var.f334a;
            e2 snapshotObserver = ((b4.x) s0.a(o0Var2)).getSnapshotObserver();
            snapshotObserver.f194a.c(o0Var2, snapshotObserver.f198e, this.f242x0);
            t0Var.f337d = i0Var;
            this.f235q0 = false;
        }
        if (p0Var.f308d) {
            p0Var.f309e = true;
        }
        if (p0Var.f306b && p0Var.e()) {
            p0Var.g();
        }
        this.f239u0 = false;
    }

    @Override // y3.u0
    public final int b0(int i2) {
        t0 t0Var = this.Y;
        if (l.o(t0Var.f334a)) {
            c1 c1Var = t0Var.f349q;
            c1Var.getClass();
            return c1Var.b0(i2);
        }
        B0();
        return t0Var.a().b0(i2);
    }

    @Override // a4.b
    public final p0 d() {
        return this.f236r0;
    }

    @Override // a4.b
    public final int d0() {
        return this.f222c0;
    }

    @Override // y3.u0
    public final y3.i1 e(long j2) {
        k0 k0Var;
        t0 t0Var = this.Y;
        o0 o0Var = t0Var.f334a;
        o0 o0Var2 = t0Var.f334a;
        k0 k0Var2 = o0Var.f299x0;
        k0 k0Var3 = k0.NotUsed;
        if (k0Var2 == k0Var3) {
            o0Var.e();
        }
        if (l.o(o0Var2)) {
            c1 c1Var = t0Var.f349q;
            c1Var.getClass();
            c1Var.f163d0 = k0Var3;
            c1Var.e(j2);
        }
        o0 u4 = o0Var2.u();
        if (u4 != null) {
            t0 t0Var2 = u4.B0;
            if (this.f225f0 != k0Var3 && !o0Var2.f301z0) {
                x3.a.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i2 = g1.f218a[t0Var2.f337d.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    k0Var = k0.InLayoutBlock;
                } else {
                    a0.j.g(t0Var2.f337d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
            } else {
                k0Var = k0.InMeasureBlock;
            }
            this.f225f0 = k0Var;
        } else {
            this.f225f0 = k0Var3;
        }
        E0(j2);
        return this;
    }

    @Override // a4.b
    public final void f0() {
        o0.X(this.Y.f334a, false, 7);
    }

    @Override // y3.u0
    public final int g(int i2) {
        t0 t0Var = this.Y;
        if (l.o(t0Var.f334a)) {
            c1 c1Var = t0Var.f349q;
            c1Var.getClass();
            return c1Var.g(i2);
        }
        B0();
        return t0Var.a().g(i2);
    }

    @Override // y3.u0
    public final int g0(int i2) {
        t0 t0Var = this.Y;
        if (l.o(t0Var.f334a)) {
            c1 c1Var = t0Var.f349q;
            c1Var.getClass();
            return c1Var.g0(i2);
        }
        B0();
        return t0Var.a().g0(i2);
    }

    @Override // y3.u0
    public final int h0(int i2) {
        t0 t0Var = this.Y;
        if (l.o(t0Var.f334a)) {
            c1 c1Var = t0Var.f349q;
            c1Var.getClass();
            return c1Var.h0(i2);
        }
        B0();
        return t0Var.a().h0(i2);
    }

    @Override // y3.i1
    public final int i0(y3.q qVar) {
        i0 i0Var;
        t0 t0Var = this.Y;
        o0 u4 = t0Var.f334a.u();
        i0 i0Var2 = null;
        if (u4 != null) {
            i0Var = u4.B0.f337d;
        } else {
            i0Var = null;
        }
        i0 i0Var3 = i0.Measuring;
        p0 p0Var = this.f236r0;
        if (i0Var == i0Var3) {
            p0Var.f307c = true;
        } else {
            o0 u10 = t0Var.f334a.u();
            if (u10 != null) {
                i0Var2 = u10.B0.f337d;
            }
            if (i0Var2 == i0.LayingOut) {
                p0Var.f308d = true;
            }
        }
        this.f226g0 = true;
        int i02 = t0Var.a().i0(qVar);
        this.f226g0 = false;
        return i02;
    }

    @Override // y3.i1
    public final int j0() {
        return this.Y.a().j0();
    }

    @Override // y3.i1, y3.u0
    public final Object n() {
        return this.f231l0;
    }

    @Override // y3.i1
    public final int n0() {
        return this.Y.a().n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:18:0x002d, B:20:0x0031, B:22:0x0039, B:25:0x0042, B:26:0x0044, B:28:0x0048, B:30:0x004e, B:32:0x0056, B:35:0x0064, B:37:0x006f, B:38:0x0073, B:34:0x005a, B:39:0x0087, B:41:0x008b, B:43:0x008f, B:44:0x0094, B:10:0x001a, B:12:0x001e, B:14:0x0022, B:17:0x002a, B:16:0x0026), top: B:48:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:18:0x002d, B:20:0x0031, B:22:0x0039, B:25:0x0042, B:26:0x0044, B:28:0x0048, B:30:0x004e, B:32:0x0056, B:35:0x0064, B:37:0x006f, B:38:0x0073, B:34:0x005a, B:39:0x0087, B:41:0x008b, B:43:0x008f, B:44:0x0094, B:10:0x001a, B:12:0x001e, B:14:0x0022, B:17:0x002a, B:16:0x0026), top: B:48:0x0007 }] */
    @Override // y3.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0(long r9, float r11, mc.l r12) {
        /*
            r8 = this;
            a4.t0 r0 = r8.Y
            a4.o0 r1 = r0.f334a
            a4.o0 r2 = r0.f334a
            r3 = 1
            r8.f233n0 = r3     // Catch: java.lang.Throwable -> L17
            long r4 = r8.f227h0     // Catch: java.lang.Throwable -> L17
            boolean r4 = x4.j.a(r9, r4)     // Catch: java.lang.Throwable -> L17
            r5 = 0
            if (r4 == 0) goto L1a
            boolean r4 = r8.E0     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2d
            goto L1a
        L17:
            r9 = move-exception
            goto L98
        L1a:
            boolean r4 = r0.f344k     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L26
            boolean r4 = r0.f343j     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L26
            boolean r4 = r8.E0     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2a
        L26:
            r8.p0 = r3     // Catch: java.lang.Throwable -> L17
            r8.E0 = r5     // Catch: java.lang.Throwable -> L17
        L2a:
            r8.z0()     // Catch: java.lang.Throwable -> L17
        L2d:
            a4.c1 r4 = r0.f349q     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L44
            a4.t0 r6 = r4.Y     // Catch: java.lang.Throwable -> L17
            a4.z0 r4 = r4.f170k0     // Catch: java.lang.Throwable -> L17
            a4.z0 r7 = a4.z0.IsNotPlaced     // Catch: java.lang.Throwable -> L17
            if (r4 != r7) goto L44
            a4.o0 r4 = r6.f334a     // Catch: java.lang.Throwable -> L17
            boolean r4 = a4.l.o(r4)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L42
            goto L44
        L42:
            r6.f336c = r3     // Catch: java.lang.Throwable -> L17
        L44:
            a4.c1 r4 = r0.f349q     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L87
            boolean r4 = r4.v0()     // Catch: java.lang.Throwable -> L17
            if (r4 != r3) goto L87
            a4.r1 r3 = r0.a()     // Catch: java.lang.Throwable -> L17
            a4.r1 r3 = r3.f319m0     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L5a
            y3.q0 r3 = r3.f363f0     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L64
        L5a:
            a4.c2 r3 = a4.s0.a(r2)     // Catch: java.lang.Throwable -> L17
            b4.x r3 = (b4.x) r3     // Catch: java.lang.Throwable -> L17
            y3.h1 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L17
        L64:
            a4.c1 r4 = r0.f349q     // Catch: java.lang.Throwable -> L17
            r4.getClass()     // Catch: java.lang.Throwable -> L17
            a4.o0 r2 = r2.u()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L73
            a4.t0 r2 = r2.B0     // Catch: java.lang.Throwable -> L17
            r2.f341h = r5     // Catch: java.lang.Throwable -> L17
        L73:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.f162c0 = r2     // Catch: java.lang.Throwable -> L17
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L17
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L17
            y3.h1.k(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L17
        L87:
            a4.c1 r0 = r0.f349q     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L94
            boolean r0 = r0.f165f0     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L94
            java.lang.String r0 = "Error: Placement happened before lookahead."
            x3.a.c(r0)     // Catch: java.lang.Throwable -> L17
        L94:
            r8.D0(r9, r11, r12)     // Catch: java.lang.Throwable -> L17
            return
        L98:
            r1.a0(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.i1.q0(long, float, mc.l):void");
    }

    @Override // a4.b
    public final void requestLayout() {
        this.Y.f334a.W(false);
    }

    @Override // a4.k1
    public final void s(boolean z10) {
        t0 t0Var = this.Y;
        if (z10 != t0Var.a().f360c0) {
            t0Var.a().f360c0 = z10;
            this.E0 = true;
        }
    }

    public final List v0() {
        t0 t0Var = this.Y;
        t0Var.f334a.h0();
        boolean z10 = this.f238t0;
        p2.b bVar = this.f237s0;
        if (!z10) {
            return bVar.f();
        }
        o0 o0Var = t0Var.f334a;
        p2.b z11 = o0Var.z();
        Object[] objArr = z11.A;
        int i2 = z11.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if (bVar.L <= i10) {
                bVar.b(o0Var2.B0.f348p);
            } else {
                i1 i1Var = o0Var2.B0.f348p;
                Object[] objArr2 = bVar.A;
                Object obj = objArr2[i10];
                objArr2[i10] = i1Var;
            }
        }
        bVar.l(((p2.b) ((a1.f0) o0Var.n()).B).L, bVar.L);
        this.f238t0 = false;
        return bVar.f();
    }

    public final void w0() {
        boolean z10 = this.f232m0;
        this.f232m0 = true;
        t0 t0Var = this.Y;
        o0 o0Var = t0Var.f334a;
        n1 n1Var = o0Var.A0;
        if (!z10) {
            n1Var.f265c.i1();
            ((b4.x) s0.a(o0Var)).getRectManager().f(t0Var.f334a, true);
            if (o0Var.q()) {
                o0.X(o0Var, true, 6);
            } else if (o0Var.B0.f338e) {
                o0.V(o0Var, true, 6);
            }
        }
        r1 r1Var = n1Var.f265c.f318l0;
        for (r1 r1Var2 = n1Var.f266d; !nc.k.a(r1Var2, r1Var) && r1Var2 != null; r1Var2 = r1Var2.f318l0) {
            if (r1Var2.G0) {
                r1Var2.e1();
            }
        }
        p2.b z11 = o0Var.z();
        Object[] objArr = z11.A;
        int i2 = z11.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            if (o0Var2.v() != Integer.MAX_VALUE) {
                o0Var2.B0.f348p.w0();
                o0.Y(o0Var2);
            }
        }
    }

    public final void y0() {
        if (this.f232m0) {
            this.f232m0 = false;
            t0 t0Var = this.Y;
            o0 o0Var = t0Var.f334a;
            o0 o0Var2 = t0Var.f334a;
            ((b4.x) s0.a(o0Var)).getRectManager().h(o0Var2);
            n1 n1Var = o0Var2.A0;
            r1 r1Var = n1Var.f265c.f318l0;
            for (r1 r1Var2 = n1Var.f266d; !nc.k.a(r1Var2, r1Var) && r1Var2 != null; r1Var2 = r1Var2.f318l0) {
                r1Var2.k1();
                r1Var2.p1();
            }
            p2.b z10 = o0Var2.z();
            Object[] objArr = z10.A;
            int i2 = z10.L;
            for (int i10 = 0; i10 < i2; i10++) {
                ((o0) objArr[i10]).B0.f348p.y0();
            }
        }
    }

    @Override // a4.b
    public final v z() {
        return this.Y.f334a.A0.f265c;
    }

    public final void z0() {
        t0 t0Var = this.Y;
        if (t0Var.f345l > 0) {
            p2.b z10 = t0Var.f334a.z();
            Object[] objArr = z10.A;
            int i2 = z10.L;
            for (int i10 = 0; i10 < i2; i10++) {
                o0 o0Var = (o0) objArr[i10];
                t0 t0Var2 = o0Var.B0;
                boolean z11 = t0Var2.f343j;
                i1 i1Var = t0Var2.f348p;
                if ((z11 || t0Var2.f344k) && !i1Var.p0) {
                    o0Var.W(false);
                }
                i1Var.z0();
            }
        }
    }
}
