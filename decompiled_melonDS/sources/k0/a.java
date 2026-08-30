package k0;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f7936a;

    /* renamed from: b  reason: collision with root package name */
    public final Rational f7937b;

    public a(Rational rational, Rational rational2) {
        this.f7937b = rational2 == null ? new Rational(4, 3) : rational2;
        this.f7936a = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        float width;
        float height;
        if (rectF.width() < rectF2.width()) {
            width = rectF.width();
        } else {
            width = rectF2.width();
        }
        if (rectF.height() < rectF2.height()) {
            height = rectF.height();
        } else {
            height = rectF2.height();
        }
        return width * height;
    }

    public final RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = this.f7937b;
        if (floatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        if (rational.floatValue() > rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator());
        }
        return new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z10;
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z11 = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF b10 = b(rational);
        RectF b11 = b(rational2);
        float width = b10.width();
        RectF rectF = this.f7936a;
        if (width >= rectF.width() && b10.height() >= rectF.height()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b11.width() >= rectF.width() && b11.height() >= rectF.height()) {
            z11 = true;
        }
        if (z10 && z11) {
            return (int) Math.signum((b10.height() * b10.width()) - (b11.height() * b11.width()));
        } else if (z10) {
            return -1;
        } else {
            if (z11) {
                return 1;
            }
            return -((int) Math.signum(a(b10, rectF) - a(b11, rectF)));
        }
    }
}
