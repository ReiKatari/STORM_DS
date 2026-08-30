package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f334a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f335b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f336c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f338e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f339f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f340g;

    /* renamed from: h  reason: collision with root package name */
    public int f341h;

    /* renamed from: i  reason: collision with root package name */
    public int f342i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f343j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f344k;

    /* renamed from: l  reason: collision with root package name */
    public int f345l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f346n;

    /* renamed from: o  reason: collision with root package name */
    public int f347o;

    /* renamed from: q  reason: collision with root package name */
    public c1 f349q;

    /* renamed from: d  reason: collision with root package name */
    public i0 f337d = i0.Idle;

    /* renamed from: p  reason: collision with root package name */
    public final i1 f348p = new i1(this);

    public t0(o0 o0Var) {
        this.f334a = o0Var;
    }

    public final r1 a() {
        return this.f334a.A0.f266d;
    }

    public final void b() {
        i0 i0Var = this.f334a.B0.f337d;
        if (i0Var == i0.LayingOut || i0Var == i0.LookaheadLayingOut) {
            if (this.f348p.f239u0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (i0Var == i0.LookaheadLayingOut) {
            c1 c1Var = this.f349q;
            if (c1Var != null && c1Var.f174o0) {
                i(true);
            } else {
                h(true);
            }
        }
    }

    public final void c(long j2) {
        c1 c1Var = this.f349q;
        if (c1Var != null) {
            i0 i0Var = i0.LookaheadMeasuring;
            t0 t0Var = c1Var.Y;
            t0Var.f337d = i0Var;
            o0 o0Var = t0Var.f334a;
            t0Var.f338e = false;
            c1Var.f177s0 = j2;
            e2 snapshotObserver = ((b4.x) s0.a(o0Var)).getSnapshotObserver();
            b1 b1Var = c1Var.f178t0;
            snapshotObserver.f194a.c(o0Var, snapshotObserver.f195b, b1Var);
            t0Var.f339f = true;
            t0Var.f340g = true;
            boolean o5 = l.o(o0Var);
            i1 i1Var = t0Var.f348p;
            if (o5) {
                i1Var.p0 = true;
                i1Var.f235q0 = true;
            } else {
                i1Var.f234o0 = true;
            }
            t0Var.f337d = i0.Idle;
        }
    }

    public final void d(int i2) {
        boolean z10;
        t0 t0Var;
        int i10 = this.f345l;
        this.f345l = i2;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i2 == 0) {
            z11 = true;
        }
        if (z10 != z11) {
            o0 u4 = this.f334a.u();
            if (u4 != null) {
                t0Var = u4.B0;
            } else {
                t0Var = null;
            }
            if (t0Var != null) {
                int i11 = t0Var.f345l;
                if (i2 == 0) {
                    t0Var.d(i11 - 1);
                } else {
                    t0Var.d(i11 + 1);
                }
            }
        }
    }

    public final void e(int i2) {
        boolean z10;
        t0 t0Var;
        int i10 = this.f347o;
        this.f347o = i2;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i2 == 0) {
            z11 = true;
        }
        if (z10 != z11) {
            o0 u4 = this.f334a.u();
            if (u4 != null) {
                t0Var = u4.B0;
            } else {
                t0Var = null;
            }
            if (t0Var != null) {
                int i11 = t0Var.f347o;
                if (i2 == 0) {
                    t0Var.e(i11 - 1);
                } else {
                    t0Var.e(i11 + 1);
                }
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f344k != z10) {
            this.f344k = z10;
            if (z10 && !this.f343j) {
                d(this.f345l + 1);
            } else if (!z10 && !this.f343j) {
                d(this.f345l - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f343j != z10) {
            this.f343j = z10;
            if (z10 && !this.f344k) {
                d(this.f345l + 1);
            } else if (!z10 && !this.f344k) {
                d(this.f345l - 1);
            }
        }
    }

    public final void h(boolean z10) {
        if (this.f346n != z10) {
            this.f346n = z10;
            if (z10 && !this.m) {
                e(this.f347o + 1);
            } else if (!z10 && !this.m) {
                e(this.f347o - 1);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.m != z10) {
            this.m = z10;
            if (z10 && !this.f346n) {
                e(this.f347o + 1);
            } else if (!z10 && !this.f346n) {
                e(this.f347o - 1);
            }
        }
    }

    public final void j() {
        i1 i1Var = this.f348p;
        t0 t0Var = i1Var.Y;
        Object obj = i1Var.f231l0;
        o0 o0Var = this.f334a;
        if ((obj != null || t0Var.a().n() != null) && i1Var.f230k0) {
            i1Var.f230k0 = false;
            i1Var.f231l0 = t0Var.a().n();
            o0 u4 = o0Var.u();
            if (u4 != null) {
                o0.X(u4, false, 7);
            }
        }
        c1 c1Var = this.f349q;
        if (c1Var != null) {
            t0 t0Var2 = c1Var.Y;
            if (c1Var.f176r0 == null) {
                y0 V0 = t0Var2.a().V0();
                V0.getClass();
                if (V0.f371i0.n() == null) {
                    return;
                }
            }
            if (c1Var.f175q0) {
                c1Var.f175q0 = false;
                y0 V02 = t0Var2.a().V0();
                V02.getClass();
                c1Var.f176r0 = V02.f371i0.n();
                if (l.o(o0Var)) {
                    o0 u10 = o0Var.u();
                    if (u10 != null) {
                        o0.X(u10, false, 7);
                        return;
                    }
                    return;
                }
                o0 u11 = o0Var.u();
                if (u11 != null) {
                    o0.V(u11, false, 7);
                }
            }
        }
    }
}
