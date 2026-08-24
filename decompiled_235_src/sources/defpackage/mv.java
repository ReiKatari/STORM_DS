package defpackage;

import android.util.Rational;
import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv  reason: default package */
/* loaded from: classes.dex */
public abstract class mv {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);

    public static boolean a(Rational rational, Size size) {
        Size size2 = mj6.b;
        if (rational != null) {
            if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                if (size.getHeight() * size.getWidth() >= mj6.a(size2)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                    int i = width % 16;
                    if (i == 0 && height % 16 == 0) {
                        if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                            return true;
                        }
                    } else if (i == 0) {
                        return b(height, width, rational);
                    } else {
                        if (height % 16 == 0) {
                            return b(width, height, rational2);
                        }
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean b(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        np2.t(z);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        if (numerator > Math.max(0, i2 - 16) && numerator < i2 + 16) {
            return true;
        }
        return false;
    }
}
