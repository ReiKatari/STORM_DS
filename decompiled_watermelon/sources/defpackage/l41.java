package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l41  reason: default package */
/* loaded from: classes.dex */
public final class l41 implements bn1 {
    public final float A;
    public final float B;
    public final float L;
    public final float R;

    public l41(float f, float f2) {
        this.A = f;
        this.B = f2;
        if (Float.isNaN(f) || Float.isNaN(RecyclerView.A1) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            qr4.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", 0.0, " + f2 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d = -Math.sqrt(9.0d);
        int g0 = n40.g0((float) ((-(d + 3.0d)) / (-6.0d)), fArr, 0);
        int g02 = n40.g0((float) ((d - 3.0d) / (-6.0d)), fArr, g0) + g0;
        if (g02 > 1) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            if (f3 > f4) {
                fArr[0] = f4;
                fArr[1] = f3;
            } else if (f3 == f4) {
                g02--;
            }
        }
        int g03 = n40.g0(0.5f, fArr, g02) + g02;
        float min = Math.min((float) RecyclerView.A1, 1.0f);
        float max = Math.max((float) RecyclerView.A1, 1.0f);
        for (int i = 0; i < g03; i++) {
            float f5 = fArr[i];
            float f6 = ((((((-2.0f) * f5) + 3.0f) * f5) + RecyclerView.A1) * f5) + RecyclerView.A1;
            min = Math.min(min, f6);
            max = Math.max(max, f6);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.L = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.R = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fd, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x022b, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024f  */
    @Override // defpackage.bn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b(float r27) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l41.b(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l41) {
            l41 l41Var = (l41) obj;
            if (this.A == l41Var.A && this.B == l41Var.B) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + ej6.a(this.B, ej6.a(RecyclerView.A1, Float.hashCode(this.A) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.A + ", b=0.0, c=" + this.B + ", d=1.0)";
    }
}
