package a4;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class y0 extends x0 implements y3.u0 {

    /* renamed from: i0  reason: collision with root package name */
    public final r1 f371i0;

    /* renamed from: k0  reason: collision with root package name */
    public LinkedHashMap f373k0;

    /* renamed from: m0  reason: collision with root package name */
    public y3.w0 f375m0;

    /* renamed from: n0  reason: collision with root package name */
    public final a1.d0 f376n0;

    /* renamed from: j0  reason: collision with root package name */
    public long f372j0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public final y3.r0 f374l0 = new y3.r0(this);

    public y0(r1 r1Var) {
        this.f371i0 = r1Var;
        a1.d0 d0Var = a1.r0.f92a;
        this.f376n0 = new a1.d0();
    }

    public static final void M0(y0 y0Var, y3.w0 w0Var) {
        LinkedHashMap linkedHashMap;
        if (w0Var != null) {
            y0Var.r0((w0Var.a() & 4294967295L) | (w0Var.c() << 32));
        } else {
            y0Var.r0(0L);
        }
        if (!nc.k.a(y0Var.f375m0, w0Var) && w0Var != null && ((((linkedHashMap = y0Var.f373k0) != null && !linkedHashMap.isEmpty()) || !w0Var.d().isEmpty()) && !nc.k.a(w0Var.d(), y0Var.f373k0))) {
            c1 c1Var = y0Var.f371i0.f315i0.B0.f349q;
            c1Var.getClass();
            c1Var.f171l0.f();
            LinkedHashMap linkedHashMap2 = y0Var.f373k0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                y0Var.f373k0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(w0Var.d());
        }
        y0Var.f375m0 = w0Var;
    }

    @Override // a4.x0
    public final x0 B0() {
        r1 r1Var = this.f371i0.f318l0;
        if (r1Var != null) {
            return r1Var.V0();
        }
        return null;
    }

    @Override // a4.x0
    public final y3.z C0() {
        return this.f374l0;
    }

    @Override // a4.x0
    public final boolean D0() {
        if (this.f375m0 != null) {
            return true;
        }
        return false;
    }

    @Override // a4.x0
    public final o0 E0() {
        return this.f371i0.f315i0;
    }

    @Override // a4.x0
    public final y3.w0 F0() {
        y3.w0 w0Var = this.f375m0;
        if (w0Var != null) {
            return w0Var;
        }
        throw w.d.g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // a4.x0
    public final x0 G0() {
        r1 r1Var = this.f371i0.f319m0;
        if (r1Var != null) {
            return r1Var.V0();
        }
        return null;
    }

    @Override // a4.x0
    public final long H0() {
        return this.f372j0;
    }

    @Override // a4.x0
    public final void L0() {
        q0(this.f372j0, 0.0f, null);
    }

    public final long N0() {
        int i2 = this.A;
        return (this.B & 4294967295L) | (i2 << 32);
    }

    public void O0() {
        F0().b();
    }

    public final void P0(long j2) {
        if (!x4.j.a(this.f372j0, j2)) {
            this.f372j0 = j2;
            r1 r1Var = this.f371i0;
            c1 c1Var = r1Var.f315i0.B0.f349q;
            if (c1Var != null) {
                c1Var.z0();
            }
            x0.J0(r1Var);
        }
        if (!this.f362e0) {
            z0(F0());
        }
    }

    public final long Q0(y0 y0Var, boolean z10) {
        long j2 = 0;
        y0 y0Var2 = this;
        while (!y0Var2.equals(y0Var)) {
            if (!y0Var2.f360c0 || !z10) {
                j2 = x4.j.c(j2, y0Var2.f372j0);
            }
            r1 r1Var = y0Var2.f371i0.f319m0;
            r1Var.getClass();
            y0Var2 = r1Var.V0();
            y0Var2.getClass();
        }
        return j2;
    }

    @Override // x4.c
    public final float b() {
        return this.f371i0.b();
    }

    @Override // y3.v
    public final x4.m getLayoutDirection() {
        return this.f371i0.f315i0.f296u0;
    }

    @Override // x4.c
    public final float j() {
        return this.f371i0.j();
    }

    @Override // y3.i1, y3.u0
    public final Object n() {
        return this.f371i0.n();
    }

    @Override // a4.x0, y3.v
    public final boolean q() {
        return true;
    }

    @Override // y3.i1
    public final void q0(long j2, float f8, mc.l lVar) {
        P0(j2);
        if (this.f361d0) {
            return;
        }
        O0();
    }
}
