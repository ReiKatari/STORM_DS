package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi3  reason: default package */
/* loaded from: classes.dex */
public final class zi3 extends nt0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi3(int i, int i2, long j, String str) {
        super(str, i, j);
        this.d = i2;
    }

    @Override // defpackage.nt0
    public final float a(int i) {
        switch (this.d) {
            case 0:
                if (i == 0) {
                    return 100.0f;
                }
                return 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // defpackage.nt0
    public final float b(int i) {
        switch (this.d) {
            case 0:
                if (i == 0) {
                    return RecyclerView.B1;
                }
                return -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // defpackage.nt0
    public final long d(float f, float f2, float f3) {
        float f4;
        float f5;
        float[] fArr;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        switch (this.d) {
            case 0:
                if (f < RecyclerView.B1) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f2 < -128.0f) {
                    f2 = -128.0f;
                }
                if (f2 > 128.0f) {
                    f2 = 128.0f;
                }
                float f6 = (f + 16.0f) / 116.0f;
                float f7 = (f2 * 0.002f) + f6;
                if (f7 > 0.20689656f) {
                    f4 = f7 * f7 * f7;
                } else {
                    f4 = (f7 - 0.13793103f) * 0.12841855f;
                }
                if (f6 > 0.20689656f) {
                    f5 = f6 * f6 * f6;
                } else {
                    f5 = (f6 - 0.13793103f) * 0.12841855f;
                }
                floatToRawIntBits = Float.floatToRawIntBits(f5 * jw2.u[1]);
                floatToRawIntBits2 = Float.floatToRawIntBits(f4 * fArr[0]) << 32;
                break;
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                float f8 = 2.0f;
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 <= 2.0f) {
                    f8 = f2;
                }
                floatToRawIntBits = Float.floatToRawIntBits(f8);
                floatToRawIntBits2 = Float.floatToRawIntBits(f) << 32;
                break;
        }
        return floatToRawIntBits2 | (floatToRawIntBits & 4294967295L);
    }

    @Override // defpackage.nt0
    public final float e(float f, float f2, float f3) {
        float f4;
        switch (this.d) {
            case 0:
                if (f < RecyclerView.B1) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f3 < -128.0f) {
                    f3 = -128.0f;
                }
                if (f3 > 128.0f) {
                    f3 = 128.0f;
                }
                float f5 = ((f + 16.0f) / 116.0f) - (f3 * 0.005f);
                if (f5 > 0.20689656f) {
                    f4 = f5 * f5 * f5;
                } else {
                    f4 = 0.12841855f * (f5 - 0.13793103f);
                }
                return f4 * jw2.u[2];
            default:
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 > 2.0f) {
                    return 2.0f;
                }
                return f3;
        }
    }

    @Override // defpackage.nt0
    public final long f(float f, float f2, float f3, float f4, nt0 nt0Var) {
        float f5;
        float f6;
        float f7;
        switch (this.d) {
            case 0:
                float[] fArr = jw2.u;
                float f8 = f / fArr[0];
                float f9 = f2 / fArr[1];
                float f10 = f3 / fArr[2];
                if (f8 > 0.008856452f) {
                    f5 = (float) Math.cbrt(f8);
                } else {
                    f5 = (f8 * 7.787037f) + 0.13793103f;
                }
                if (f9 > 0.008856452f) {
                    f6 = (float) Math.cbrt(f9);
                } else {
                    f6 = (f9 * 7.787037f) + 0.13793103f;
                }
                if (f10 > 0.008856452f) {
                    f7 = (float) Math.cbrt(f10);
                } else {
                    f7 = (f10 * 7.787037f) + 0.13793103f;
                }
                float f11 = (116.0f * f6) - 16.0f;
                float f12 = (f5 - f6) * 500.0f;
                float f13 = (f6 - f7) * 200.0f;
                if (f11 < RecyclerView.B1) {
                    f11 = 0.0f;
                }
                if (f11 > 100.0f) {
                    f11 = 100.0f;
                }
                if (f12 < -128.0f) {
                    f12 = -128.0f;
                }
                float f14 = 128.0f;
                if (f12 > 128.0f) {
                    f12 = 128.0f;
                }
                if (f13 < -128.0f) {
                    f13 = -128.0f;
                }
                if (f13 <= 128.0f) {
                    f14 = f13;
                }
                return hv.a(f11, f12, f14, f4, nt0Var);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                float f15 = 2.0f;
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f2 < -2.0f) {
                    f2 = -2.0f;
                }
                if (f2 > 2.0f) {
                    f2 = 2.0f;
                }
                if (f3 < -2.0f) {
                    f3 = -2.0f;
                }
                if (f3 <= 2.0f) {
                    f15 = f3;
                }
                return hv.a(f, f2, f15, f4, nt0Var);
        }
    }
}
