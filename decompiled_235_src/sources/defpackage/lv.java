package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv  reason: default package */
/* loaded from: classes.dex */
public final class lv implements Comparator {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public lv(Rational rational, Rational rational2) {
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
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

    public RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        if (floatValue == rational2.floatValue()) {
            return new RectF(RecyclerView.B1, RecyclerView.B1, rational2.getNumerator(), rational2.getDenominator());
        }
        if (rational.floatValue() > rational2.floatValue()) {
            return new RectF(RecyclerView.B1, RecyclerView.B1, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator());
        }
        return new RectF(RecyclerView.B1, RecyclerView.B1, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        Long l;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                RectF rectF = (RectF) obj3;
                boolean z2 = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF b = b(rational);
                RectF b2 = b(rational2);
                if (b.width() >= rectF.width() && b.height() >= rectF.height()) {
                    z = true;
                } else {
                    z = false;
                }
                if (b2.width() >= rectF.width() && b2.height() >= rectF.height()) {
                    z2 = true;
                }
                if (z && z2) {
                    return (int) Math.signum((b.height() * b.width()) - (b2.height() * b2.width()));
                } else if (z) {
                    return -1;
                } else {
                    if (z2) {
                        return 1;
                    }
                    return -((int) Math.signum(a(b, rectF) - a(b2, rectF)));
                }
            default:
                long j = Long.MAX_VALUE;
                Map map = (Map) this.c;
                int compare = ((ko5) obj3).compare(obj, obj2);
                if (compare == 0) {
                    dk4 dk4Var = (dk4) map.get((String) obj);
                    if (dk4Var != null) {
                        l = Long.valueOf(dk4Var.a);
                    } else {
                        l = Long.MAX_VALUE;
                    }
                    dk4 dk4Var2 = (dk4) map.get((String) obj2);
                    if (dk4Var2 != null) {
                        j = Long.valueOf(dk4Var2.a);
                    }
                    return g04.z(l, j);
                }
                return compare;
        }
    }

    public lv(ko5 ko5Var, Map map) {
        this.b = ko5Var;
        this.c = map;
    }
}
