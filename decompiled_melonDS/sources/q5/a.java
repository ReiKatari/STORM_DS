package q5;

import android.graphics.Color;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f12281a = new ThreadLocal();

    public static int a(double d4, double d10, double d11) {
        double d12;
        double d13;
        double d14;
        int min;
        int min2;
        double d15 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d4))) / 100.0d;
        double d16 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d4))) / 100.0d;
        double d17 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d4))) / 100.0d;
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        int round = (int) Math.round(d12 * 255.0d);
        int i2 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d13 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d14 * 255.0d);
        if (round3 >= 0) {
            i2 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i2);
    }

    public static int b(int i2, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i2);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, c(Color.red(i2), alpha2, Color.red(i10), alpha, i11), c(Color.green(i2), alpha2, Color.green(i10), alpha, i11), c(Color.blue(i2), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int c(int i2, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i2 * 255) * i10)) / (i13 * 255);
    }

    public static int d(int i2, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i2 & 16777215) | (i10 << 24);
        }
        a0.j.h("alpha must be between 0 and 255.");
        return 0;
    }
}
