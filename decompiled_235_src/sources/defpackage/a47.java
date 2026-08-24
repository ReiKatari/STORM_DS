package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a47  reason: default package */
/* loaded from: classes.dex */
public final class a47 {
    public final z37 a;
    public final v84 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public a47(z37 z37Var, v84 v84Var, long j) {
        float d;
        y37 y37Var;
        this.a = z37Var;
        this.b = v84Var;
        this.c = j;
        ArrayList arrayList = v84Var.h;
        boolean isEmpty = arrayList.isEmpty();
        float f = RecyclerView.B1;
        if (isEmpty) {
            d = 0.0f;
        } else {
            d = ((yr4) arrayList.get(0)).a.d.d(0);
        }
        this.d = d;
        if (!arrayList.isEmpty()) {
            yr4 yr4Var = (yr4) gt0.Q0(arrayList);
            f = yr4Var.a.d.d(y37Var.g - 1) + yr4Var.f;
        }
        this.e = f;
        this.f = v84Var.g;
    }

    public final jl5 a(int i) {
        int z;
        v84 v84Var = this.b;
        v84Var.l(i);
        int length = ((fp) v84Var.a.a).B.length();
        ArrayList arrayList = v84Var.h;
        if (i == length) {
            z = hf.U(arrayList);
        } else {
            z = uj2.z(i, arrayList);
        }
        yr4 yr4Var = (yr4) arrayList.get(z);
        cj cjVar = yr4Var.a;
        if (cjVar.d.f.isRtlCharAt(yr4Var.d(i))) {
            return jl5.Rtl;
        }
        return jl5.Ltr;
    }

    public final of5 b(int i) {
        boolean z;
        float i2;
        float i3;
        float h;
        float h2;
        v84 v84Var = this.b;
        v84Var.k(i);
        ArrayList arrayList = v84Var.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.z(i, arrayList));
        cj cjVar = yr4Var.a;
        int d = yr4Var.d(i);
        CharSequence charSequence = cjVar.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder t = xg6.t("offset(", d, ") is out of bounds [0,");
            t.append(charSequence.length());
            t.append(')');
            q53.a(t.toString());
        }
        y37 y37Var = cjVar.d;
        Layout layout = y37Var.f;
        int lineForOffset = layout.getLineForOffset(d);
        float g = y37Var.g(lineForOffset);
        float e = y37Var.e(lineForOffset);
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (z && !isRtlCharAt) {
            i2 = y37Var.h(d, false);
            i3 = y37Var.h(d + 1, true);
        } else {
            if (z && isRtlCharAt) {
                h = y37Var.i(d, false);
                h2 = y37Var.i(d + 1, true);
            } else if (isRtlCharAt) {
                h = y37Var.h(d, false);
                h2 = y37Var.h(d + 1, true);
            } else {
                i2 = y37Var.i(d, false);
                i3 = y37Var.i(d + 1, true);
            }
            float f = h;
            i2 = h2;
            i3 = f;
        }
        RectF rectF = new RectF(i2, g, i3, e);
        return yr4Var.a(new of5(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final of5 c(int i) {
        int z;
        v84 v84Var = this.b;
        v84Var.l(i);
        int length = ((fp) v84Var.a.a).B.length();
        ArrayList arrayList = v84Var.h;
        if (i == length) {
            z = hf.U(arrayList);
        } else {
            z = uj2.z(i, arrayList);
        }
        yr4 yr4Var = (yr4) arrayList.get(z);
        cj cjVar = yr4Var.a;
        int d = yr4Var.d(i);
        CharSequence charSequence = cjVar.e;
        y37 y37Var = cjVar.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder t = xg6.t("offset(", d, ") is out of bounds [0,");
            t.append(charSequence.length());
            t.append(']');
            q53.a(t.toString());
        }
        float h = y37Var.h(d, false);
        int lineForOffset = y37Var.f.getLineForOffset(d);
        return yr4Var.a(new of5(h, y37Var.g(lineForOffset), h, y37Var.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.c;
        v84 v84Var = this.b;
        if (((int) (j >> 32)) >= v84Var.d && !v84Var.c && ((int) (j & 4294967295L)) >= v84Var.e) {
            return false;
        }
        return true;
    }

    public final float e(int i) {
        float f;
        v84 v84Var = this.b;
        v84Var.m(i);
        ArrayList arrayList = v84Var.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.A(i, arrayList));
        cj cjVar = yr4Var.a;
        int i2 = i - yr4Var.d;
        y37 y37Var = cjVar.d;
        float lineLeft = y37Var.f.getLineLeft(i2);
        if (i2 == y37Var.g - 1) {
            f = y37Var.j;
        } else {
            f = RecyclerView.B1;
        }
        return lineLeft + f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a47) {
                a47 a47Var = (a47) obj;
                if (nb3.k(this.a, a47Var.a) && this.b == a47Var.b && q93.b(this.c, a47Var.c) && this.d == a47Var.d && this.e == a47Var.e && nb3.k(this.f, a47Var.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final float f(int i) {
        float f;
        v84 v84Var = this.b;
        v84Var.m(i);
        ArrayList arrayList = v84Var.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.A(i, arrayList));
        cj cjVar = yr4Var.a;
        int i2 = i - yr4Var.d;
        y37 y37Var = cjVar.d;
        float lineRight = y37Var.f.getLineRight(i2);
        if (i2 == y37Var.g - 1) {
            f = y37Var.k;
        } else {
            f = RecyclerView.B1;
        }
        return lineRight + f;
    }

    public final int g(int i) {
        v84 v84Var = this.b;
        v84Var.m(i);
        ArrayList arrayList = v84Var.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.A(i, arrayList));
        return yr4Var.a.d.f.getLineStart(i - yr4Var.d) + yr4Var.b;
    }

    public final jl5 h(int i) {
        int z;
        v84 v84Var = this.b;
        v84Var.l(i);
        int length = ((fp) v84Var.a.a).B.length();
        ArrayList arrayList = v84Var.h;
        if (i == length) {
            z = hf.U(arrayList);
        } else {
            z = uj2.z(i, arrayList);
        }
        yr4 yr4Var = (yr4) arrayList.get(z);
        cj cjVar = yr4Var.a;
        int d = yr4Var.d(i);
        y37 y37Var = cjVar.d;
        if (y37Var.f.getParagraphDirection(y37Var.f.getLineForOffset(d)) == 1) {
            return jl5.Ltr;
        }
        return jl5.Rtl;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.f.hashCode() + xg6.a(this.e, xg6.a(this.d, i61.c(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final hj i(int i, int i2) {
        v84 v84Var = this.b;
        fp fpVar = (fp) v84Var.a.a;
        if (i < 0 || i > i2 || i2 > fpVar.B.length()) {
            StringBuilder q = i61.q(i, i2, "Start(", ") or End(", ") is out of range [0..");
            q.append(fpVar.B.length());
            q.append("), or start > end!");
            q53.a(q.toString());
        }
        if (i == i2) {
            return lj.a();
        }
        hj a = lj.a();
        uj2.C(v84Var.h, jx2.f(i, i2), new u84(a, i, i2, 0));
        return a;
    }

    public final long j(int i) {
        int z;
        int i2;
        int i3;
        int i4;
        v84 v84Var = this.b;
        v84Var.l(i);
        int length = ((fp) v84Var.a.a).B.length();
        ArrayList arrayList = v84Var.h;
        if (i == length) {
            z = hf.U(arrayList);
        } else {
            z = uj2.z(i, arrayList);
        }
        yr4 yr4Var = (yr4) arrayList.get(z);
        cj cjVar = yr4Var.a;
        int d = yr4Var.d(i);
        m42 j = cjVar.d.j();
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
        return yr4Var.b(jx2.f(i2, d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) q93.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
