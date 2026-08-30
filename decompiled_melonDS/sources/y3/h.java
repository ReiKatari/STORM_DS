package y3;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements g, x0, s0 {
    public final a4.d0 A;
    public c1.l1 B;
    public boolean L;

    public h(a4.d0 d0Var, c1.l1 l1Var) {
        this.A = d0Var;
        this.B = l1Var;
    }

    @Override // x4.c
    public final int G(long j2) {
        return this.A.G(j2);
    }

    @Override // x4.c
    public final float I(long j2) {
        return this.A.I(j2);
    }

    @Override // x4.c
    public final int O(float f8) {
        return this.A.O(f8);
    }

    @Override // x4.c
    public final long W(long j2) {
        return this.A.W(j2);
    }

    @Override // y3.s0
    public final z a(z zVar) {
        r0 r0Var;
        if (zVar instanceof r0) {
            return zVar;
        }
        if (zVar instanceof a4.r1) {
            a4.y0 V0 = ((a4.r1) zVar).V0();
            if (V0 != null && (r0Var = V0.f374l0) != null) {
                return r0Var;
            }
            return zVar;
        }
        x3.a.b("Unsupported LayoutCoordinates");
        wa.b.a();
        return null;
    }

    @Override // x4.c
    public final float b() {
        return this.A.b();
    }

    @Override // x4.c
    public final float c0(long j2) {
        return this.A.c0(j2);
    }

    @Override // y3.v
    public final x4.m getLayoutDirection() {
        return this.A.f315i0.f296u0;
    }

    @Override // x4.c
    public final float j() {
        return this.A.j();
    }

    @Override // y3.x0
    public final w0 k0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2) {
        if ((i2 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            x3.a.c("Size(" + i2 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a4.w0(i2, i10, map, lVar, lVar2, this, 1);
    }

    @Override // x4.c
    public final long m0(float f8) {
        return this.A.m0(f8);
    }

    @Override // y3.v
    public final boolean q() {
        return false;
    }

    @Override // x4.c
    public final long r(float f8) {
        return this.A.r(f8);
    }

    @Override // x4.c
    public final long t(long j2) {
        return this.A.t(j2);
    }

    @Override // x4.c
    public final float t0(int i2) {
        return this.A.t0(i2);
    }

    @Override // y3.x0
    public final w0 u0(int i2, int i10, Map map, mc.l lVar) {
        return this.A.k0(i2, i10, map, null, lVar);
    }

    @Override // x4.c
    public final float v(float f8) {
        return this.A.b() * f8;
    }

    @Override // x4.c
    public final float x0(float f8) {
        return f8 / this.A.b();
    }
}
