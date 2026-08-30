package a4;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 extends y3.i1 implements y3.u0, b, k1 {
    public final t0 Y;
    public boolean Z;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f164e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f165f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f166g0;

    /* renamed from: h0  reason: collision with root package name */
    public x4.a f167h0;

    /* renamed from: j0  reason: collision with root package name */
    public mc.l f169j0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f174o0;

    /* renamed from: r0  reason: collision with root package name */
    public Object f176r0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f180v0;

    /* renamed from: b0  reason: collision with root package name */
    public int f161b0 = Preference.DEFAULT_ORDER;

    /* renamed from: c0  reason: collision with root package name */
    public int f162c0 = Preference.DEFAULT_ORDER;

    /* renamed from: d0  reason: collision with root package name */
    public k0 f163d0 = k0.NotUsed;

    /* renamed from: i0  reason: collision with root package name */
    public long f168i0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public z0 f170k0 = z0.IsNotPlaced;

    /* renamed from: l0  reason: collision with root package name */
    public final p0 f171l0 = new p0(this, 1);

    /* renamed from: m0  reason: collision with root package name */
    public final p2.b f172m0 = new p2.b(new c1[16]);

    /* renamed from: n0  reason: collision with root package name */
    public boolean f173n0 = true;
    public final b1 p0 = new b1(this, 0);

    /* renamed from: q0  reason: collision with root package name */
    public boolean f175q0 = true;

    /* renamed from: s0  reason: collision with root package name */
    public long f177s0 = x4.b.b(0, 0, 15);

    /* renamed from: t0  reason: collision with root package name */
    public final b1 f178t0 = new b1(this, 2);

    /* renamed from: u0  reason: collision with root package name */
    public final b1 f179u0 = new b1(this, 1);

    public c1(t0 t0Var) {
        this.Y = t0Var;
        this.f176r0 = t0Var.f348p.f231l0;
    }

    @Override // a4.b
    public final void B(a aVar) {
        p2.b z10 = this.Y.f334a.z();
        Object[] objArr = z10.A;
        int i2 = z10.L;
        for (int i10 = 0; i10 < i2; i10++) {
            c1 c1Var = ((o0) objArr[i10]).B0.f349q;
            c1Var.getClass();
            aVar.k(c1Var);
        }
    }

    public final void B0() {
        k0 k0Var;
        t0 t0Var = this.Y;
        o0.V(t0Var.f334a, false, 7);
        o0 o0Var = t0Var.f334a;
        o0 u4 = o0Var.u();
        if (u4 != null && o0Var.f299x0 == k0.NotUsed) {
            int i2 = a1.f154a[u4.B0.f337d.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
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
        i0 i0Var;
        this.f180v0 = true;
        t0 t0Var = this.Y;
        o0 u4 = t0Var.f334a.u();
        z0 z0Var = this.f170k0;
        if ((z0Var != z0.IsPlacedInLookahead && !t0Var.f336c) || (z0Var != z0.IsPlacedInApproach && t0Var.f336c)) {
            y0();
            if (this.Z && u4 != null) {
                u4.U(false);
            }
        }
        if (u4 != null) {
            t0 t0Var2 = u4.B0;
            if (!this.Z && ((i0Var = t0Var2.f337d) == i0.LayingOut || i0Var == i0.LookaheadLayingOut)) {
                if (this.f162c0 != Integer.MAX_VALUE) {
                    x3.a.c("Place was called on a node which was placed already");
                }
                int i2 = t0Var2.f341h;
                this.f162c0 = i2;
                t0Var2.f341h = i2 + 1;
            }
        } else {
            this.f162c0 = 0;
        }
        M();
    }

    public final void D0(long j2, mc.l lVar) {
        i0 i0Var;
        t0 t0Var = this.Y;
        o0 o0Var = t0Var.f334a;
        o0 o0Var2 = t0Var.f334a;
        try {
            o0 u4 = o0Var.u();
            if (u4 != null) {
                i0Var = u4.B0.f337d;
            } else {
                i0Var = null;
            }
            i0 i0Var2 = i0.LookaheadLayingOut;
            if (i0Var == i0Var2) {
                t0Var.f336c = false;
            }
            if (o0Var2.J0) {
                x3.a.a("place is called on a deactivated node");
            }
            t0Var.f337d = i0Var2;
            boolean z10 = true;
            this.f165f0 = true;
            this.f180v0 = false;
            if (!x4.j.a(j2, this.f168i0)) {
                if (t0Var.f346n || t0Var.m) {
                    t0Var.f339f = true;
                }
                z0();
            }
            c2 a10 = s0.a(o0Var2);
            this.f168i0 = j2;
            if (!t0Var.f339f) {
                if (this.f170k0 == z0.IsNotPlaced) {
                    z10 = false;
                }
                if (z10) {
                    y0 V0 = t0Var.a().V0();
                    V0.getClass();
                    V0.P0(x4.j.c(j2, V0.X));
                    C0();
                    this.f169j0 = lVar;
                    t0Var.f337d = i0.Idle;
                }
            }
            t0Var.h(false);
            this.f171l0.f311g = false;
            e2 snapshotObserver = ((b4.x) a10).getSnapshotObserver();
            snapshotObserver.f194a.c(o0Var2, snapshotObserver.f200g, this.f179u0);
            this.f169j0 = lVar;
            t0Var.f337d = i0.Idle;
        } catch (Throwable th2) {
            o0Var.a0(th2);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x0081, B:36:0x008b, B:41:0x009c, B:42:0x00a1, B:44:0x00b7, B:35:0x0084), top: B:51:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:30:0x0062->B:31:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x0081, B:36:0x008b, B:41:0x009c, B:42:0x00a1, B:44:0x00b7, B:35:0x0084), top: B:51:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x0081, B:36:0x008b, B:41:0x009c, B:42:0x00a1, B:44:0x00b7, B:35:0x0084), top: B:51:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x0081, B:36:0x008b, B:41:0x009c, B:42:0x00a1, B:44:0x00b7, B:35:0x0084), top: B:51:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:8:0x0013, B:11:0x001f, B:16:0x0027, B:18:0x002f, B:24:0x003e, B:26:0x0042, B:27:0x0047, B:21:0x0035, B:29:0x004b, B:31:0x0064, B:32:0x0076, B:34:0x0081, B:36:0x008b, B:41:0x009c, B:42:0x00a1, B:44:0x00b7, B:35:0x0084), top: B:51:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E0(long r13) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.c1.E0(long):boolean");
    }

    @Override // a4.b
    public final b K() {
        t0 t0Var;
        o0 u4 = this.Y.f334a.u();
        if (u4 != null && (t0Var = u4.B0) != null) {
            return t0Var.f349q;
        }
        return null;
    }

    @Override // a4.b
    public final void M() {
        x4.a aVar;
        this.f174o0 = true;
        p0 p0Var = this.f171l0;
        p0Var.h();
        t0 t0Var = this.Y;
        boolean z10 = t0Var.f339f;
        o0 o0Var = t0Var.f334a;
        if (z10) {
            p2.b z11 = o0Var.z();
            Object[] objArr = z11.A;
            int i2 = z11.L;
            for (int i10 = 0; i10 < i2; i10++) {
                o0 o0Var2 = (o0) objArr[i10];
                t0 t0Var2 = o0Var2.B0;
                if (t0Var2.f338e && o0Var2.s() == k0.InMeasureBlock) {
                    c1 c1Var = t0Var2.f349q;
                    c1Var.getClass();
                    c1 c1Var2 = t0Var2.f349q;
                    if (c1Var2 != null) {
                        aVar = c1Var2.f167h0;
                    } else {
                        aVar = null;
                    }
                    aVar.getClass();
                    if (c1Var.E0(aVar.f14337a)) {
                        o0.V(o0Var, false, 7);
                    }
                }
            }
        }
        u uVar = z().O0;
        uVar.getClass();
        if (t0Var.f340g || (!this.f164e0 && !uVar.f362e0 && t0Var.f339f)) {
            t0Var.f339f = false;
            i0 i0Var = t0Var.f337d;
            t0Var.f337d = i0.LookaheadLayingOut;
            t0Var.i(false);
            e2 snapshotObserver = ((b4.x) s0.a(o0Var)).getSnapshotObserver();
            snapshotObserver.f194a.c(o0Var, snapshotObserver.f201h, this.p0);
            t0Var.f337d = i0Var;
            if (t0Var.m && uVar.f362e0) {
                requestLayout();
            }
            t0Var.f340g = false;
        }
        if (p0Var.f308d) {
            p0Var.f309e = true;
        }
        if (p0Var.f306b && p0Var.e()) {
            p0Var.g();
        }
        this.f174o0 = false;
    }

    @Override // y3.u0
    public final int b0(int i2) {
        B0();
        y0 V0 = this.Y.a().V0();
        V0.getClass();
        return V0.b0(i2);
    }

    @Override // a4.b
    public final p0 d() {
        return this.f171l0;
    }

    @Override // a4.b
    public final int d0() {
        return this.f162c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r3 == a4.i0.LookaheadLayingOut) goto L38;
     */
    @Override // y3.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y3.i1 e(long r6) {
        /*
            r5 = this;
            a4.t0 r0 = r5.Y
            a4.o0 r1 = r0.f334a
            a4.o0 r2 = r0.f334a
            a4.o0 r1 = r1.u()
            r3 = 0
            if (r1 == 0) goto L12
            a4.t0 r1 = r1.B0
            a4.i0 r1 = r1.f337d
            goto L13
        L12:
            r1 = r3
        L13:
            a4.i0 r4 = a4.i0.LookaheadMeasuring
            if (r1 == r4) goto L25
            a4.o0 r1 = r2.u()
            if (r1 == 0) goto L21
            a4.t0 r1 = r1.B0
            a4.i0 r3 = r1.f337d
        L21:
            a4.i0 r1 = a4.i0.LookaheadLayingOut
            if (r3 != r1) goto L28
        L25:
            r1 = 0
            r0.f335b = r1
        L28:
            a4.o0 r0 = r2.u()
            if (r0 == 0) goto L68
            a4.t0 r0 = r0.B0
            a4.k0 r1 = r5.f163d0
            a4.k0 r3 = a4.k0.NotUsed
            if (r1 == r3) goto L40
            boolean r1 = r2.f301z0
            if (r1 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            x3.a.c(r1)
        L40:
            a4.i0 r1 = r0.f337d
            int[] r3 = a4.a1.f154a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L63
            r3 = 2
            if (r1 == r3) goto L63
            r3 = 3
            if (r1 == r3) goto L60
            r3 = 4
            if (r1 != r3) goto L57
            goto L60
        L57:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            a4.i0 r7 = r0.f337d
            a0.j.g(r7, r6)
            r6 = 0
            return r6
        L60:
            a4.k0 r0 = a4.k0.InLayoutBlock
            goto L65
        L63:
            a4.k0 r0 = a4.k0.InMeasureBlock
        L65:
            r5.f163d0 = r0
            goto L6c
        L68:
            a4.k0 r0 = a4.k0.NotUsed
            r5.f163d0 = r0
        L6c:
            a4.k0 r0 = r2.f299x0
            a4.k0 r1 = a4.k0.NotUsed
            if (r0 != r1) goto L75
            r2.e()
        L75:
            r5.E0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.c1.e(long):y3.i1");
    }

    @Override // a4.b
    public final void f0() {
        o0.V(this.Y.f334a, false, 7);
    }

    @Override // y3.u0
    public final int g(int i2) {
        B0();
        y0 V0 = this.Y.a().V0();
        V0.getClass();
        return V0.g(i2);
    }

    @Override // y3.u0
    public final int g0(int i2) {
        B0();
        y0 V0 = this.Y.a().V0();
        V0.getClass();
        return V0.g0(i2);
    }

    @Override // y3.u0
    public final int h0(int i2) {
        B0();
        y0 V0 = this.Y.a().V0();
        V0.getClass();
        return V0.h0(i2);
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
        i0 i0Var3 = i0.LookaheadMeasuring;
        p0 p0Var = this.f171l0;
        if (i0Var == i0Var3) {
            p0Var.f307c = true;
        } else {
            o0 u10 = t0Var.f334a.u();
            if (u10 != null) {
                i0Var2 = u10.B0.f337d;
            }
            if (i0Var2 == i0.LookaheadLayingOut) {
                p0Var.f308d = true;
            }
        }
        this.f164e0 = true;
        y0 V0 = t0Var.a().V0();
        V0.getClass();
        int i02 = V0.i0(qVar);
        this.f164e0 = false;
        return i02;
    }

    @Override // y3.i1, y3.u0
    public final Object n() {
        return this.f176r0;
    }

    @Override // y3.i1
    public final void q0(long j2, float f8, mc.l lVar) {
        D0(j2, lVar);
    }

    @Override // a4.b
    public final void requestLayout() {
        this.Y.f334a.U(false);
    }

    @Override // a4.k1
    public final void s(boolean z10) {
        Boolean bool;
        y0 V0;
        t0 t0Var = this.Y;
        y0 V02 = t0Var.a().V0();
        if (V02 != null) {
            bool = Boolean.valueOf(V02.f360c0);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z10).equals(bool) && (V0 = t0Var.a().V0()) != null) {
            V0.f360c0 = z10;
        }
    }

    public final boolean v0() {
        t0 t0Var = this.Y;
        if (!l.o(t0Var.f334a) && !t0Var.f336c) {
            return false;
        }
        return true;
    }

    public final void w0(boolean z10) {
        if (!z10 || !v0()) {
            if (z10 || v0()) {
                this.f170k0 = z0.IsNotPlaced;
                p2.b z11 = this.Y.f334a.z();
                Object[] objArr = z11.A;
                int i2 = z11.L;
                for (int i10 = 0; i10 < i2; i10++) {
                    c1 c1Var = ((o0) objArr[i10]).B0.f349q;
                    c1Var.getClass();
                    c1Var.w0(true);
                }
            }
        }
    }

    public final void y0() {
        z0 z0Var = this.f170k0;
        t0 t0Var = this.Y;
        boolean z10 = t0Var.f336c;
        o0 o0Var = t0Var.f334a;
        if (z10) {
            this.f170k0 = z0.IsPlacedInApproach;
        } else {
            this.f170k0 = z0.IsPlacedInLookahead;
        }
        if (z0Var != z0.IsPlacedInLookahead && t0Var.f338e) {
            o0.V(o0Var, true, 6);
        }
        p2.b z11 = o0Var.z();
        Object[] objArr = z11.A;
        int i2 = z11.L;
        for (int i10 = 0; i10 < i2; i10++) {
            o0 o0Var2 = (o0) objArr[i10];
            c1 c1Var = o0Var2.B0.f349q;
            if (c1Var != null) {
                if (c1Var.f162c0 != Integer.MAX_VALUE) {
                    c1Var.y0();
                    o0.Y(o0Var2);
                }
            } else {
                a0.j.h("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    @Override // a4.b
    public final v z() {
        return this.Y.f334a.A0.f265c;
    }

    public final void z0() {
        t0 t0Var = this.Y;
        if (t0Var.f347o > 0) {
            p2.b z10 = t0Var.f334a.z();
            Object[] objArr = z10.A;
            int i2 = z10.L;
            for (int i10 = 0; i10 < i2; i10++) {
                o0 o0Var = (o0) objArr[i10];
                t0 t0Var2 = o0Var.B0;
                if ((t0Var2.m || t0Var2.f346n) && !t0Var2.f339f) {
                    o0Var.U(false);
                }
                c1 c1Var = t0Var2.f349q;
                if (c1Var != null) {
                    c1Var.z0();
                }
            }
        }
    }
}
