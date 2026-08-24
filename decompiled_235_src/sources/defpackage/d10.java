package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d10  reason: default package */
/* loaded from: classes.dex */
public final class d10 extends z64 implements mo1, gi4, va6 {
    public long k0;
    public f80 l0;
    public float m0;
    public ke6 n0;
    public long o0;
    public kk3 p0;
    public mp2 q0;
    public ke6 r0;
    public mp2 s0;

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
        eb6.e(gb6Var, this.n0);
    }

    @Override // defpackage.va6
    public final boolean j() {
        return false;
    }

    @Override // defpackage.gi4
    public final void l0() {
        this.o0 = 9205357640488583168L;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        f04.I(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    @Override // defpackage.mo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(um3 um3Var) {
        mp2 mp2Var;
        kc2 kc2Var;
        long j;
        char c;
        f80 f80Var;
        f80 f80Var2;
        kc2 kc2Var2;
        hj hjVar;
        um3 um3Var2;
        float intBitsToFloat;
        zj0 zj0Var = um3Var.A;
        if (this.n0 == u24.m) {
            if (!kt0.d(this.k0, kt0.h)) {
                no1.F(um3Var, this.k0, 0L, 0L, RecyclerView.B1, null, 126);
            }
            f80 f80Var3 = this.l0;
            if (f80Var3 != null) {
                no1.D0(um3Var, f80Var3, 0L, 0L, this.m0, null, 118);
            }
        } else {
            if (xi6.b(zj0Var.e(), this.o0) && um3Var.getLayoutDirection() == this.p0 && nb3.k(this.r0, this.n0)) {
                mp2Var = this.q0;
                mp2Var.getClass();
            } else {
                jx2.B(this, new q6(9, this, um3Var));
                mp2Var = this.s0;
                this.s0 = null;
            }
            mp2 mp2Var2 = mp2Var;
            this.q0 = mp2Var2;
            this.o0 = zj0Var.e();
            this.p0 = um3Var.getLayoutDirection();
            this.r0 = this.n0;
            mp2Var2.getClass();
            boolean d = kt0.d(this.k0, kt0.h);
            kc2 kc2Var3 = kc2.a;
            if (!d) {
                long j2 = this.k0;
                if (mp2Var2 instanceof qo4) {
                    of5 of5Var = ((qo4) mp2Var2).f;
                    float f = of5Var.a;
                    float f2 = of5Var.b;
                    kc2Var = kc2Var3;
                    um3Var.s(j2, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), np2.e0(of5Var), 1.0f, kc2Var, 3);
                } else {
                    kc2Var = kc2Var3;
                    if (mp2Var2 instanceof ro4) {
                        ro4 ro4Var = (ro4) mp2Var2;
                        hj hjVar2 = ro4Var.g;
                        if (hjVar2 != null) {
                            um3Var.h(hjVar2, j2, 1.0f, kc2Var);
                        } else {
                            u16 u16Var = ro4Var.f;
                            float f3 = u16Var.b;
                            float f4 = u16Var.a;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (u16Var.h >> 32));
                            c = ' ';
                            j = 4294967295L;
                            um3Var.d(j2, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(u16Var.c - f4) << 32) | (Float.floatToRawIntBits(u16Var.d - f3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32), kc2Var, 1.0f);
                            kc2Var = kc2Var;
                        }
                    } else {
                        c = ' ';
                        j = 4294967295L;
                        if (mp2Var2 instanceof po4) {
                            um3Var.h(((po4) mp2Var2).f, j2, 1.0f, kc2Var);
                        } else {
                            i.d();
                            return;
                        }
                    }
                    f80Var = this.l0;
                    if (f80Var != null) {
                        float f5 = this.m0;
                        if (mp2Var2 instanceof qo4) {
                            of5 of5Var2 = ((qo4) mp2Var2).f;
                            float f6 = of5Var2.a;
                            float f7 = of5Var2.b;
                            um3Var.W(f80Var, (Float.floatToRawIntBits(f6) << c) | (Float.floatToRawIntBits(f7) & j), np2.e0(of5Var2), f5, kc2Var, 3);
                        } else {
                            if (mp2Var2 instanceof ro4) {
                                ro4 ro4Var2 = (ro4) mp2Var2;
                                f80Var2 = f80Var;
                                hjVar = ro4Var2.g;
                                if (hjVar != null) {
                                    um3Var2 = um3Var;
                                    kc2Var2 = kc2Var;
                                } else {
                                    u16 u16Var2 = ro4Var2.f;
                                    float f8 = u16Var2.b;
                                    float f9 = u16Var2.a;
                                    um3Var.c0(f80Var2, (Float.floatToRawIntBits(f9) << c) | (Float.floatToRawIntBits(f8) & j), (Float.floatToRawIntBits(u16Var2.c - f9) << c) | (Float.floatToRawIntBits(u16Var2.d - f8) & j), (Float.floatToRawIntBits(intBitsToFloat) & j) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (u16Var2.h >> c))) << c), f5, kc2Var);
                                }
                            } else if (mp2Var2 instanceof po4) {
                                f80Var2 = f80Var;
                                kc2Var2 = kc2Var;
                                hjVar = ((po4) mp2Var2).f;
                                um3Var2 = um3Var;
                            } else {
                                i.d();
                                return;
                            }
                            um3Var2.g(hjVar, f80Var2, f5, kc2Var2, 3);
                        }
                    }
                }
            } else {
                kc2Var = kc2Var3;
            }
            c = ' ';
            j = 4294967295L;
            f80Var = this.l0;
            if (f80Var != null) {
            }
        }
        um3Var.b();
    }
}
