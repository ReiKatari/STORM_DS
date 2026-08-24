package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk4  reason: default package */
/* loaded from: classes.dex */
public final class yk4 extends nt0 {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] X = nc1.X(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, nc1.G(t9.c.b, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = X;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = nc1.U(X);
        g = nc1.U(fArr);
    }

    @Override // defpackage.nt0
    public final float a(int i) {
        if (i == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // defpackage.nt0
    public final float b(int i) {
        if (i == 0) {
            return RecyclerView.B1;
        }
        return -0.5f;
    }

    @Override // defpackage.nt0
    public final long d(float f2, float f3, float f4) {
        float f5;
        if (f2 < RecyclerView.B1) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f6 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f6 = f4;
        }
        float[] fArr = g;
        float f7 = (fArr[6] * f6) + (fArr[3] * f3) + (fArr[0] * f2);
        float f8 = (fArr[7] * f6) + (fArr[4] * f3) + (fArr[1] * f2);
        float f9 = (fArr[8] * f6) + (fArr[5] * f3) + (fArr[2] * f2);
        float f10 = f7 * f7 * f7;
        float f11 = f9 * f9 * f9;
        float[] fArr2 = f;
        float f12 = (fArr2[3] * f8 * f8 * f8) + (fArr2[0] * f10);
        float f13 = fArr2[1] * f10;
        return (Float.floatToRawIntBits((fArr2[6] * f11) + f12) << 32) | (4294967295L & Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f5) + f13));
    }

    @Override // defpackage.nt0
    public final float e(float f2, float f3, float f4) {
        if (f2 < RecyclerView.B1) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f5 = 0.5f;
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 <= 0.5f) {
            f5 = f4;
        }
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    @Override // defpackage.nt0
    public final long f(float f2, float f3, float f4, float f5, nt0 nt0Var) {
        float[] fArr = d;
        float f6 = fArr[3] * f3;
        float f7 = fArr[6] * f4;
        float f8 = fArr[4] * f3;
        float f9 = fArr[7] * f4;
        float f10 = fArr[5] * f3;
        float f11 = fArr[8] * f4;
        float w = oi2.w(f7 + f6 + (fArr[0] * f2));
        float w2 = oi2.w(f9 + f8 + (fArr[1] * f2));
        float w3 = oi2.w(f11 + f10 + (fArr[2] * f2));
        float[] fArr2 = e;
        float f12 = (fArr2[6] * w3) + (fArr2[3] * w2) + (fArr2[0] * w);
        float f13 = (fArr2[4] * w2) + (fArr2[1] * w);
        float f14 = fArr2[5] * w2;
        return hv.a(f12, (fArr2[7] * w3) + f13, (fArr2[8] * w3) + f14 + (fArr2[2] * w), f5, nt0Var);
    }
}
