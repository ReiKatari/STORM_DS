package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements v {
    public final float A;
    public final float B;
    public final float L;
    public final float R;

    public r(float f8, float f10) {
        int E;
        this.A = f8;
        this.B = f10;
        if (Float.isNaN(f8) || Float.isNaN(0.0f) || Float.isNaN(f10) || Float.isNaN(1.0f)) {
            n0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f8 + ", 0.0, " + f10 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d4 = 0.0f;
        double d10 = 3.0f;
        double d11 = 0.0f;
        double d12 = d10 * 2.0d;
        double d13 = (d4 - d12) + d11;
        if (d13 == 0.0d) {
            E = d10 == d11 ? 0 : i3.z.E((float) ((d12 - d11) / (d12 - (d11 * 2.0d))), fArr, 0);
        } else {
            double d14 = -Math.sqrt((d10 * d10) - (d11 * d4));
            double d15 = (-d4) + d10;
            int E2 = i3.z.E((float) ((-(d14 + d15)) / d13), fArr, 0);
            E = i3.z.E((float) ((d14 - d15) / d13), fArr, E2) + E2;
            if (E > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    E--;
                }
            }
        }
        int E3 = i3.z.E(0.5f, fArr, E) + E;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < E3; i2++) {
            float f13 = fArr[i2];
            float f14 = ((((((-2.0f) * f13) + 3.0f) * f13) + 0.0f) * f13) + 0.0f;
            min = Math.min(min, f14);
            max = Math.max(max, f14);
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
    @Override // d1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.r.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.A == rVar.A && this.B == rVar.B) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + w.d.b(this.B, w.d.b(0.0f, Float.hashCode(this.A) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.A + ", b=0.0, c=" + this.B + ", d=1.0)";
    }
}
