package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz3  reason: default package */
/* loaded from: classes.dex */
public final class lz3 extends cx4 {
    public final /* synthetic */ int B;
    public final Object L;

    public /* synthetic */ lz3(Object obj, int i) {
        this.B = i;
        this.L = obj;
    }

    @Override // defpackage.qh1
    public final float Y() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((kz3) obj).Y();
            default:
                return ((te) obj).getDensity().Y();
        }
    }

    @Override // defpackage.qh1
    public final float a() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((kz3) obj).a();
            default:
                return ((te) obj).getDensity().a();
        }
    }

    @Override // defpackage.cx4
    public float c(hy2 hy2Var) {
        float f;
        float intBitsToFloat;
        int K0;
        switch (this.B) {
            case 0:
                eo2 eo2Var = hy2Var.a;
                if (eo2Var != null) {
                    return ((Number) eo2Var.o(this, Float.valueOf(Float.NaN))).floatValue();
                }
                kz3 kz3Var = (kz3) this.L;
                if (kz3Var.g0) {
                    return Float.NaN;
                }
                kz3 kz3Var2 = kz3Var;
                while (true) {
                    z9 z9Var = kz3Var2.i0;
                    if (z9Var != null && (K0 = fv.K0((hy2[]) z9Var.b, hy2Var)) >= 0) {
                        f = ((float[]) z9Var.c)[K0];
                    } else {
                        f = Float.NaN;
                    }
                    if (!Float.isNaN(f)) {
                        kz3Var2.s0(kz3Var.F0(), hy2Var);
                        jk3 A0 = kz3Var2.A0();
                        jk3 A02 = kz3Var.A0();
                        switch (hy2Var.b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (A02.J(A0, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (A0.m() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (A02.J(A0, (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (A0.m() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    kz3 H0 = kz3Var2.H0();
                    if (H0 == null) {
                        kz3Var2.s0(kz3Var.F0(), hy2Var);
                        return Float.NaN;
                    }
                    kz3Var2 = H0;
                }
                break;
            default:
                return super.c(hy2Var);
        }
    }

    @Override // defpackage.cx4
    public final jk3 d() {
        jk3 A0;
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                kz3 kz3Var = (kz3) obj;
                if (kz3Var.g0) {
                    A0 = null;
                } else {
                    A0 = kz3Var.A0();
                }
                if (A0 == null) {
                    kz3Var.F0().C0.b();
                }
                return A0;
            default:
                return (eg4) ((te) obj).getRoot().B0.e;
        }
    }

    @Override // defpackage.cx4
    public final kk3 f() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((kz3) obj).getLayoutDirection();
            default:
                return ((te) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.cx4
    public final int i() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((kz3) obj).d0();
            default:
                return ((te) obj).getRoot().C0.p.A;
        }
    }
}
