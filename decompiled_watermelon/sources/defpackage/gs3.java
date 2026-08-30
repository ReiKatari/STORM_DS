package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gs3  reason: default package */
/* loaded from: classes.dex */
public final class gs3 extends xn4 {
    public final /* synthetic */ int B;
    public final Object L;

    public /* synthetic */ gs3(int i, Object obj) {
        this.B = i;
        this.L = obj;
    }

    @Override // defpackage.od1
    public final float b() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((fs3) obj).b();
            default:
                return ((ee) obj).getDensity().b();
        }
    }

    @Override // defpackage.xn4
    public float c(gs2 gs2Var) {
        float f;
        float intBitsToFloat;
        int w0;
        switch (this.B) {
            case 0:
                aj2 aj2Var = gs2Var.a;
                if (aj2Var != null) {
                    return ((Number) aj2Var.j(this, Float.valueOf(Float.NaN))).floatValue();
                }
                fs3 fs3Var = (fs3) this.L;
                if (fs3Var.f0) {
                    return Float.NaN;
                }
                fs3 fs3Var2 = fs3Var;
                while (true) {
                    y9 y9Var = fs3Var2.h0;
                    if (y9Var != null && (w0 = nu.w0((gs2[]) y9Var.b, gs2Var)) >= 0) {
                        f = ((float[]) y9Var.c)[w0];
                    } else {
                        f = Float.NaN;
                    }
                    if (!Float.isNaN(f)) {
                        fs3Var2.r0(fs3Var.F0(), gs2Var);
                        rd3 B0 = fs3Var2.B0();
                        rd3 B02 = fs3Var.B0();
                        switch (gs2Var.b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (B02.y(B0, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (B0.O() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (B02.y(B0, (Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (B0.O() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    fs3 H0 = fs3Var2.H0();
                    if (H0 == null) {
                        fs3Var2.r0(fs3Var.F0(), gs2Var);
                        return Float.NaN;
                    }
                    fs3Var2 = H0;
                }
                break;
            default:
                return super.c(gs2Var);
        }
    }

    @Override // defpackage.xn4
    public final rd3 e() {
        rd3 B0;
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                fs3 fs3Var = (fs3) obj;
                if (fs3Var.f0) {
                    B0 = null;
                } else {
                    B0 = fs3Var.B0();
                }
                if (B0 == null) {
                    fs3Var.F0().B0.b();
                }
                return B0;
            default:
                return (m74) ((ee) obj).getRoot().A0.e;
        }
    }

    @Override // defpackage.xn4
    public final sd3 f() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((fs3) obj).getLayoutDirection();
            default:
                return ((ee) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.xn4
    public final int h() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((fs3) obj).l0();
            default:
                return ((ee) obj).getRoot().B0.p.A;
        }
    }

    @Override // defpackage.od1
    public final float o() {
        int i = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((fs3) obj).o();
            default:
                return ((ee) obj).getDensity().o();
        }
    }
}
