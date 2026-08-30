package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lr6  reason: default package */
/* loaded from: classes.dex */
public final class lr6 {
    public final kr6 a;
    public final q04 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public lr6(kr6 kr6Var, q04 q04Var, long j) {
        float d;
        jr6 jr6Var;
        this.a = kr6Var;
        this.b = q04Var;
        this.c = j;
        ArrayList arrayList = q04Var.h;
        boolean isEmpty = arrayList.isEmpty();
        float f = RecyclerView.A1;
        if (isEmpty) {
            d = 0.0f;
        } else {
            d = ((wi4) arrayList.get(0)).a.d.d(0);
        }
        this.d = d;
        if (!arrayList.isEmpty()) {
            wi4 wi4Var = (wi4) tq0.T0(arrayList);
            f = wi4Var.a.d.d(jr6Var.g - 1) + wi4Var.f;
        }
        this.e = f;
        this.f = q04Var.g;
    }

    public final rb5 a(int i) {
        int q;
        q04 q04Var = this.b;
        q04Var.l(i);
        int length = ((to) q04Var.a.a).B.length();
        ArrayList arrayList = q04Var.h;
        if (i == length) {
            q = l07.P(arrayList);
        } else {
            q = yf2.q(i, arrayList);
        }
        wi4 wi4Var = (wi4) arrayList.get(q);
        qi qiVar = wi4Var.a;
        if (qiVar.d.f.isRtlCharAt(wi4Var.d(i))) {
            return rb5.Rtl;
        }
        return rb5.Ltr;
    }

    public final y55 b(int i) {
        boolean z;
        float i2;
        float i3;
        float h;
        float h2;
        q04 q04Var = this.b;
        q04Var.k(i);
        ArrayList arrayList = q04Var.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.q(i, arrayList));
        qi qiVar = wi4Var.a;
        int d = wi4Var.d(i);
        CharSequence charSequence = qiVar.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder s = wh1.s("offset(", d, ") is out of bounds [0,");
            s.append(charSequence.length());
            s.append(')');
            nz2.a(s.toString());
        }
        jr6 jr6Var = qiVar.d;
        Layout layout = jr6Var.f;
        int lineForOffset = layout.getLineForOffset(d);
        float g = jr6Var.g(lineForOffset);
        float e = jr6Var.e(lineForOffset);
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (z && !isRtlCharAt) {
            i2 = jr6Var.h(d, false);
            i3 = jr6Var.h(d + 1, true);
        } else {
            if (z && isRtlCharAt) {
                h = jr6Var.i(d, false);
                h2 = jr6Var.i(d + 1, true);
            } else if (isRtlCharAt) {
                h = jr6Var.h(d, false);
                h2 = jr6Var.h(d + 1, true);
            } else {
                i2 = jr6Var.i(d, false);
                i3 = jr6Var.i(d + 1, true);
            }
            float f = h;
            i2 = h2;
            i3 = f;
        }
        RectF rectF = new RectF(i2, g, i3, e);
        return wi4Var.a(new y55(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final y55 c(int i) {
        int q;
        q04 q04Var = this.b;
        q04Var.l(i);
        int length = ((to) q04Var.a.a).B.length();
        ArrayList arrayList = q04Var.h;
        if (i == length) {
            q = l07.P(arrayList);
        } else {
            q = yf2.q(i, arrayList);
        }
        wi4 wi4Var = (wi4) arrayList.get(q);
        qi qiVar = wi4Var.a;
        int d = wi4Var.d(i);
        CharSequence charSequence = qiVar.e;
        jr6 jr6Var = qiVar.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder s = wh1.s("offset(", d, ") is out of bounds [0,");
            s.append(charSequence.length());
            s.append(']');
            nz2.a(s.toString());
        }
        float h = jr6Var.h(d, false);
        int lineForOffset = jr6Var.f.getLineForOffset(d);
        return wi4Var.a(new y55(h, jr6Var.g(lineForOffset), h, jr6Var.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.c;
        q04 q04Var = this.b;
        if (((int) (j >> 32)) >= q04Var.d && !q04Var.c && ((int) (j & 4294967295L)) >= q04Var.e) {
            return false;
        }
        return true;
    }

    public final float e(int i) {
        float f;
        q04 q04Var = this.b;
        q04Var.m(i);
        ArrayList arrayList = q04Var.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.r(i, arrayList));
        qi qiVar = wi4Var.a;
        int i2 = i - wi4Var.d;
        jr6 jr6Var = qiVar.d;
        float lineLeft = jr6Var.f.getLineLeft(i2);
        if (i2 == jr6Var.g - 1) {
            f = jr6Var.j;
        } else {
            f = RecyclerView.A1;
        }
        return lineLeft + f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lr6) {
                lr6 lr6Var = (lr6) obj;
                if (b53.x(this.a, lr6Var.a) && this.b == lr6Var.b && i33.b(this.c, lr6Var.c) && this.d == lr6Var.d && this.e == lr6Var.e && b53.x(this.f, lr6Var.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final float f(int i) {
        float f;
        q04 q04Var = this.b;
        q04Var.m(i);
        ArrayList arrayList = q04Var.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.r(i, arrayList));
        qi qiVar = wi4Var.a;
        int i2 = i - wi4Var.d;
        jr6 jr6Var = qiVar.d;
        float lineRight = jr6Var.f.getLineRight(i2);
        if (i2 == jr6Var.g - 1) {
            f = jr6Var.k;
        } else {
            f = RecyclerView.A1;
        }
        return lineRight + f;
    }

    public final int g(int i) {
        q04 q04Var = this.b;
        q04Var.m(i);
        ArrayList arrayList = q04Var.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.r(i, arrayList));
        return wi4Var.a.d.f.getLineStart(i - wi4Var.d) + wi4Var.b;
    }

    public final rb5 h(int i) {
        int q;
        q04 q04Var = this.b;
        q04Var.l(i);
        int length = ((to) q04Var.a.a).B.length();
        ArrayList arrayList = q04Var.h;
        if (i == length) {
            q = l07.P(arrayList);
        } else {
            q = yf2.q(i, arrayList);
        }
        wi4 wi4Var = (wi4) arrayList.get(q);
        qi qiVar = wi4Var.a;
        int d = wi4Var.d(i);
        jr6 jr6Var = qiVar.d;
        if (jr6Var.f.getParagraphDirection(jr6Var.f.getLineForOffset(d)) == 1) {
            return rb5.Ltr;
        }
        return rb5.Rtl;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.f.hashCode() + ej6.a(this.e, ej6.a(this.d, b31.c(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final vi i(int i, int i2) {
        q04 q04Var = this.b;
        to toVar = (to) q04Var.a.a;
        if (i < 0 || i > i2 || i2 > toVar.B.length()) {
            StringBuilder s = b31.s(i, i2, "Start(", ") or End(", ") is out of range [0..");
            s.append(toVar.B.length());
            s.append("), or start > end!");
            nz2.a(s.toString());
        }
        if (i == i2) {
            return zi.a();
        }
        vi a = zi.a();
        yf2.t(q04Var.h, ve2.g(i, i2), new p04(a, i, i2, 0));
        return a;
    }

    public final long j(int i) {
        int q;
        int i2;
        int i3;
        int i4;
        q04 q04Var = this.b;
        q04Var.l(i);
        int length = ((to) q04Var.a.a).B.length();
        ArrayList arrayList = q04Var.h;
        if (i == length) {
            q = l07.P(arrayList);
        } else {
            q = yf2.q(i, arrayList);
        }
        wi4 wi4Var = (wi4) arrayList.get(q);
        qi qiVar = wi4Var.a;
        int d = wi4Var.d(i);
        xz1 j = qiVar.d.j();
        if (j.h(j.j(d))) {
            j.a(d);
            i2 = d;
            while (i2 != -1 && (!j.h(i2) || j.d(i2))) {
                i2 = j.j(i2);
            }
        } else {
            j.a(d);
            if (j.g(d)) {
                if (j.e(d) && !j.c(d)) {
                    i2 = d;
                } else {
                    i2 = j.j(d);
                }
            } else if (j.c(d)) {
                i2 = j.j(d);
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = d;
        }
        if (j.d(j.i(d))) {
            j.a(d);
            i3 = d;
            while (i3 != -1 && (j.h(i3) || !j.d(i3))) {
                i3 = j.i(i3);
            }
        } else {
            j.a(d);
            if (j.c(d)) {
                if (j.e(d) && !j.g(d)) {
                    i3 = d;
                } else {
                    i4 = j.i(d);
                    i3 = i4;
                }
            } else if (j.g(d)) {
                i4 = j.i(d);
                i3 = i4;
            } else {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            d = i3;
        }
        return wi4Var.b(ve2.g(i2, d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) i33.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
