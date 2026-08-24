package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut  reason: default package */
/* loaded from: classes.dex */
public final class ut implements st, g34, sz3 {
    public final mm3 A;
    public cf6 B;
    public boolean L;

    public ut(mm3 mm3Var, cf6 cf6Var) {
        this.A = mm3Var;
        this.B = cf6Var;
    }

    @Override // defpackage.g34
    public final f34 K(int i, int i2, Map map, qn2 qn2Var) {
        return this.A.o0(i, i2, map, null, qn2Var);
    }

    @Override // defpackage.qh1
    public final long M(float f) {
        return this.A.M(f);
    }

    @Override // defpackage.qh1
    public final float Q(int i) {
        return this.A.Q(i);
    }

    @Override // defpackage.qh1
    public final float T(float f) {
        return f / this.A.a();
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.A.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A.a();
    }

    @Override // defpackage.eb3
    public final boolean a0() {
        return false;
    }

    @Override // defpackage.sz3
    public final jk3 b(jk3 jk3Var) {
        nz3 nz3Var;
        if (jk3Var instanceof nz3) {
            return jk3Var;
        }
        if (jk3Var instanceof eg4) {
            mz3 W0 = ((eg4) jk3Var).W0();
            if (W0 != null && (nz3Var = W0.n0) != null) {
                return nz3Var;
            }
            return jk3Var;
        }
        p53.b("Unsupported LayoutCoordinates");
        e41.c();
        return null;
    }

    @Override // defpackage.qh1
    public final float e0(float f) {
        return this.A.a() * f;
    }

    @Override // defpackage.eb3
    public final kk3 getLayoutDirection() {
        return this.A.k0.v0;
    }

    @Override // defpackage.qh1
    public final int k0(long j) {
        return this.A.k0(j);
    }

    @Override // defpackage.g34
    public final f34 o0(int i, int i2, Map map, qn2 qn2Var, qn2 qn2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            p53.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new tt(i, i2, map, qn2Var, qn2Var2, this, 0);
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return this.A.p(f);
    }

    @Override // defpackage.qh1
    public final long q(long j) {
        return this.A.q(j);
    }

    @Override // defpackage.qh1
    public final int r0(float f) {
        return this.A.r0(f);
    }

    @Override // defpackage.qh1
    public final long v0(long j) {
        return this.A.v0(j);
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        return this.A.x(j);
    }

    @Override // defpackage.qh1
    public final float y0(long j) {
        return this.A.y0(j);
    }
}
