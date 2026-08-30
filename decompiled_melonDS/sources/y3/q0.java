package y3;

import a4.k2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 extends h1 {
    public final /* synthetic */ int B;
    public final Object L;

    public /* synthetic */ q0(int i2, Object obj) {
        this.B = i2;
        this.L = obj;
    }

    @Override // x4.c
    public final float b() {
        switch (this.B) {
            case 0:
                return ((a4.x0) this.L).b();
            default:
                return ((b4.x) this.L).getDensity().b();
        }
    }

    @Override // y3.h1
    public float d(s sVar) {
        float f8;
        float intBitsToFloat;
        int A;
        switch (this.B) {
            case 0:
                mc.p pVar = sVar.f14734a;
                if (pVar != null) {
                    return ((Number) pVar.j(this, Float.valueOf(Float.NaN))).floatValue();
                }
                a4.x0 x0Var = (a4.x0) this.L;
                if (x0Var.f362e0) {
                    return Float.NaN;
                }
                a4.x0 x0Var2 = x0Var;
                while (true) {
                    k2 k2Var = x0Var2.f364g0;
                    if (k2Var != null && (A = zb.k.A((s[]) k2Var.f249b, sVar)) >= 0) {
                        f8 = ((float[]) k2Var.f250c)[A];
                    } else {
                        f8 = Float.NaN;
                    }
                    if (!Float.isNaN(f8)) {
                        x0Var2.v0(x0Var.E0(), sVar);
                        z C0 = x0Var2.C0();
                        z C02 = x0Var.C0();
                        switch (sVar.f14735b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (C02.C(C0, (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(((int) (C0.Z() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (C02.C(C0, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(((int) (C0.Z() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    a4.x0 G0 = x0Var2.G0();
                    if (G0 == null) {
                        x0Var2.v0(x0Var.E0(), sVar);
                        return Float.NaN;
                    }
                    x0Var2 = G0;
                }
                break;
            default:
                return super.d(sVar);
        }
    }

    @Override // y3.h1
    public final z e() {
        z C0;
        switch (this.B) {
            case 0:
                a4.x0 x0Var = (a4.x0) this.L;
                if (x0Var.f362e0) {
                    C0 = null;
                } else {
                    C0 = x0Var.C0();
                }
                if (C0 == null) {
                    x0Var.E0().B0.b();
                }
                return C0;
            default:
                return ((b4.x) this.L).getRoot().A0.f266d;
        }
    }

    @Override // y3.h1
    public final x4.m g() {
        switch (this.B) {
            case 0:
                return ((a4.x0) this.L).getLayoutDirection();
            default:
                return ((b4.x) this.L).getLayoutDirection();
        }
    }

    @Override // y3.h1
    public final int h() {
        switch (this.B) {
            case 0:
                return ((a4.x0) this.L).n0();
            default:
                return ((b4.x) this.L).getRoot().B0.f348p.A;
        }
    }

    @Override // x4.c
    public final float j() {
        switch (this.B) {
            case 0:
                return ((a4.x0) this.L).j();
            default:
                return ((b4.x) this.L).getDensity().j();
        }
    }
}
