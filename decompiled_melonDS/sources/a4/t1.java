package a4;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 implements y3.u0 {
    public final /* synthetic */ int A;
    public final y3.u0 B;
    public final Enum L;
    public final Enum R;

    public /* synthetic */ t1(y3.u0 u0Var, Enum r22, Enum r32, int i2) {
        this.A = i2;
        this.B = u0Var;
        this.L = r22;
        this.R = r32;
    }

    @Override // y3.u0
    public final int b0(int i2) {
        switch (this.A) {
            case 0:
                return this.B.b0(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B.b0(i2);
            default:
                return this.B.b0(i2);
        }
    }

    @Override // y3.u0
    public final y3.i1 e(long j2) {
        int h02;
        int b02;
        int h03;
        int b03;
        int h04;
        int b04;
        switch (this.A) {
            case 0:
                w1 w1Var = (w1) this.R;
                w1 w1Var2 = w1.Width;
                v1 v1Var = (v1) this.L;
                int i2 = 32767;
                y3.u0 u0Var = this.B;
                if (w1Var == w1Var2) {
                    if (v1Var == v1.Max) {
                        b02 = u0Var.g0(x4.a.g(j2));
                    } else {
                        b02 = u0Var.b0(x4.a.g(j2));
                    }
                    if (x4.a.c(j2)) {
                        i2 = x4.a.g(j2);
                    }
                    return new u1(b02, i2, 0);
                }
                if (v1Var == v1.Max) {
                    h02 = u0Var.g(x4.a.h(j2));
                } else {
                    h02 = u0Var.h0(x4.a.h(j2));
                }
                if (x4.a.d(j2)) {
                    i2 = x4.a.h(j2);
                }
                return new u1(i2, h02, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                y3.x xVar = (y3.x) this.R;
                y3.x xVar2 = y3.x.Width;
                y3.w wVar = (y3.w) this.L;
                int i10 = 32767;
                y3.u0 u0Var2 = this.B;
                if (xVar == xVar2) {
                    if (wVar == y3.w.Max) {
                        b03 = u0Var2.g0(x4.a.g(j2));
                    } else {
                        b03 = u0Var2.b0(x4.a.g(j2));
                    }
                    if (x4.a.c(j2)) {
                        i10 = x4.a.g(j2);
                    }
                    return new u1(b03, i10, 1);
                }
                if (wVar == y3.w.Max) {
                    h03 = u0Var2.g(x4.a.h(j2));
                } else {
                    h03 = u0Var2.h0(x4.a.h(j2));
                }
                if (x4.a.d(j2)) {
                    i10 = x4.a.h(j2);
                }
                return new u1(i10, h03, 1);
            default:
                y3.z0 z0Var = (y3.z0) this.R;
                y3.z0 z0Var2 = y3.z0.Width;
                y3.y0 y0Var = (y3.y0) this.L;
                int i11 = 32767;
                y3.u0 u0Var3 = this.B;
                if (z0Var == z0Var2) {
                    if (y0Var == y3.y0.Max) {
                        b04 = u0Var3.g0(x4.a.g(j2));
                    } else {
                        b04 = u0Var3.b0(x4.a.g(j2));
                    }
                    if (x4.a.c(j2)) {
                        i11 = x4.a.g(j2);
                    }
                    return new u1(b04, i11, 2);
                }
                if (y0Var == y3.y0.Max) {
                    h04 = u0Var3.g(x4.a.h(j2));
                } else {
                    h04 = u0Var3.h0(x4.a.h(j2));
                }
                if (x4.a.d(j2)) {
                    i11 = x4.a.h(j2);
                }
                return new u1(i11, h04, 2);
        }
    }

    @Override // y3.u0
    public final int g(int i2) {
        switch (this.A) {
            case 0:
                return this.B.g(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B.g(i2);
            default:
                return this.B.g(i2);
        }
    }

    @Override // y3.u0
    public final int g0(int i2) {
        switch (this.A) {
            case 0:
                return this.B.g0(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B.g0(i2);
            default:
                return this.B.g0(i2);
        }
    }

    @Override // y3.u0
    public final int h0(int i2) {
        switch (this.A) {
            case 0:
                return this.B.h0(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B.h0(i2);
            default:
                return this.B.h0(i2);
        }
    }

    @Override // y3.u0
    public final Object n() {
        switch (this.A) {
            case 0:
                return this.B.n();
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.B.n();
            default:
                return this.B.n();
        }
    }
}
