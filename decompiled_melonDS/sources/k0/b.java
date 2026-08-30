package k0;

import android.util.Rational;
import android.util.Size;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Rational f7938a = new Rational(4, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final Rational f7939b = new Rational(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final Rational f7940c = new Rational(16, 9);

    /* renamed from: d  reason: collision with root package name */
    public static final Rational f7941d = new Rational(9, 16);

    public static boolean a(Rational rational, Size size) {
        Size size2 = q0.a.f12088b;
        if (rational != null) {
            if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                if (size.getHeight() * size.getWidth() >= q0.a.a(size2)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                    int i2 = width % 16;
                    if (i2 == 0 && height % 16 == 0) {
                        if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                            return true;
                        }
                    } else if (i2 == 0) {
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

    public static boolean b(int i2, int i10, Rational rational) {
        boolean z10;
        if (i10 % 16 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.h(z10);
        double numerator = (rational.getNumerator() * i2) / rational.getDenominator();
        if (numerator > Math.max(0, i10 - 16) && numerator < i10 + 16) {
            return true;
        }
        return false;
    }
}
