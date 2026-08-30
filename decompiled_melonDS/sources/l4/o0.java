package l4;

import android.graphics.RectF;
import android.text.Layout;
import g2.k2;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f8865a;

    /* renamed from: b  reason: collision with root package name */
    public final q f8866b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8867c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8868d;

    /* renamed from: e  reason: collision with root package name */
    public final float f8869e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f8870f;

    public o0(n0 n0Var, q qVar, long j2) {
        float d4;
        m4.k kVar;
        this.f8865a = n0Var;
        this.f8866b = qVar;
        this.f8867c = j2;
        ArrayList arrayList = qVar.f8882h;
        float f8 = 0.0f;
        if (arrayList.isEmpty()) {
            d4 = 0.0f;
        } else {
            d4 = ((s) arrayList.get(0)).f8890a.f8783d.d(0);
        }
        this.f8868d = d4;
        if (!arrayList.isEmpty()) {
            s sVar = (s) zb.l.Z(arrayList);
            f8 = sVar.f8890a.f8783d.d(kVar.f9222g - 1) + sVar.f8895f;
        }
        this.f8869e = f8;
        this.f8870f = qVar.f8881g;
    }

    public final w4.j a(int i2) {
        int d4;
        q qVar = this.f8866b;
        qVar.l(i2);
        int length = ((h) qVar.f8875a.A).B.length();
        ArrayList arrayList = qVar.f8882h;
        if (i2 == length) {
            d4 = p7.t.l(arrayList);
        } else {
            d4 = i0.d(i2, arrayList);
        }
        s sVar = (s) arrayList.get(d4);
        b bVar = sVar.f8890a;
        if (bVar.f8783d.f9221f.isRtlCharAt(sVar.d(i2))) {
            return w4.j.Rtl;
        }
        return w4.j.Ltr;
    }

    public final h3.c b(int i2) {
        boolean z10;
        float i10;
        float i11;
        float h2;
        float h10;
        q qVar = this.f8866b;
        qVar.k(i2);
        ArrayList arrayList = qVar.f8882h;
        s sVar = (s) arrayList.get(i0.d(i2, arrayList));
        b bVar = sVar.f8890a;
        int d4 = sVar.d(i2);
        CharSequence charSequence = bVar.f8784e;
        if (d4 < 0 || d4 >= charSequence.length()) {
            StringBuilder i12 = kc.a.i("offset(", d4, ") is out of bounds [0,");
            i12.append(charSequence.length());
            i12.append(')');
            r4.a.a(i12.toString());
        }
        m4.k kVar = bVar.f8783d;
        Layout layout = kVar.f9221f;
        int lineForOffset = layout.getLineForOffset(d4);
        float g10 = kVar.g(lineForOffset);
        float e6 = kVar.e(lineForOffset);
        if (layout.getParagraphDirection(lineForOffset) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d4);
        if (z10 && !isRtlCharAt) {
            i10 = kVar.h(d4, false);
            i11 = kVar.h(d4 + 1, true);
        } else {
            if (z10 && isRtlCharAt) {
                h2 = kVar.i(d4, false);
                h10 = kVar.i(d4 + 1, true);
            } else if (isRtlCharAt) {
                h2 = kVar.h(d4, false);
                h10 = kVar.h(d4 + 1, true);
            } else {
                i10 = kVar.i(d4, false);
                i11 = kVar.i(d4 + 1, true);
            }
            float f8 = h2;
            i10 = h10;
            i11 = f8;
        }
        RectF rectF = new RectF(i10, g10, i11, e6);
        return sVar.a(new h3.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final h3.c c(int i2) {
        int d4;
        q qVar = this.f8866b;
        qVar.l(i2);
        int length = ((h) qVar.f8875a.A).B.length();
        ArrayList arrayList = qVar.f8882h;
        if (i2 == length) {
            d4 = p7.t.l(arrayList);
        } else {
            d4 = i0.d(i2, arrayList);
        }
        s sVar = (s) arrayList.get(d4);
        b bVar = sVar.f8890a;
        int d10 = sVar.d(i2);
        CharSequence charSequence = bVar.f8784e;
        m4.k kVar = bVar.f8783d;
        if (d10 < 0 || d10 > charSequence.length()) {
            StringBuilder i10 = kc.a.i("offset(", d10, ") is out of bounds [0,");
            i10.append(charSequence.length());
            i10.append(']');
            r4.a.a(i10.toString());
        }
        float h2 = kVar.h(d10, false);
        int lineForOffset = kVar.f9221f.getLineForOffset(d10);
        return sVar.a(new h3.c(h2, kVar.g(lineForOffset), h2, kVar.e(lineForOffset)));
    }

    public final float d(int i2) {
        float f8;
        q qVar = this.f8866b;
        qVar.m(i2);
        ArrayList arrayList = qVar.f8882h;
        s sVar = (s) arrayList.get(i0.e(i2, arrayList));
        b bVar = sVar.f8890a;
        int i10 = i2 - sVar.f8893d;
        m4.k kVar = bVar.f8783d;
        float lineLeft = kVar.f9221f.getLineLeft(i10);
        if (i10 == kVar.f9222g - 1) {
            f8 = kVar.f9225j;
        } else {
            f8 = 0.0f;
        }
        return lineLeft + f8;
    }

    public final float e(int i2) {
        float f8;
        q qVar = this.f8866b;
        qVar.m(i2);
        ArrayList arrayList = qVar.f8882h;
        s sVar = (s) arrayList.get(i0.e(i2, arrayList));
        b bVar = sVar.f8890a;
        int i10 = i2 - sVar.f8893d;
        m4.k kVar = bVar.f8783d;
        float lineRight = kVar.f9221f.getLineRight(i10);
        if (i10 == kVar.f9222g - 1) {
            f8 = kVar.f9226k;
        } else {
            f8 = 0.0f;
        }
        return lineRight + f8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (nc.k.a(this.f8865a, o0Var.f8865a) && this.f8866b.equals(o0Var.f8866b) && x4.l.b(this.f8867c, o0Var.f8867c) && this.f8868d == o0Var.f8868d && this.f8869e == o0Var.f8869e && nc.k.a(this.f8870f, o0Var.f8870f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int f(int i2) {
        q qVar = this.f8866b;
        qVar.m(i2);
        ArrayList arrayList = qVar.f8882h;
        s sVar = (s) arrayList.get(i0.e(i2, arrayList));
        return sVar.f8890a.f8783d.f9221f.getLineStart(i2 - sVar.f8893d) + sVar.f8891b;
    }

    public final w4.j g(int i2) {
        int d4;
        q qVar = this.f8866b;
        qVar.l(i2);
        int length = ((h) qVar.f8875a.A).B.length();
        ArrayList arrayList = qVar.f8882h;
        if (i2 == length) {
            d4 = p7.t.l(arrayList);
        } else {
            d4 = i0.d(i2, arrayList);
        }
        s sVar = (s) arrayList.get(d4);
        b bVar = sVar.f8890a;
        int d10 = sVar.d(i2);
        m4.k kVar = bVar.f8783d;
        if (kVar.f9221f.getParagraphDirection(kVar.f9221f.getLineForOffset(d10)) == 1) {
            return w4.j.Ltr;
        }
        return w4.j.Rtl;
    }

    public final i3.h h(int i2, int i10) {
        q qVar = this.f8866b;
        h hVar = (h) qVar.f8875a.A;
        if (i2 < 0 || i2 > i10 || i10 > hVar.B.length()) {
            StringBuilder j2 = kc.a.j("Start(", i2, ") or End(", i10, ") is out of range [0..");
            j2.append(hVar.B.length());
            j2.append("), or start > end!");
            r4.a.a(j2.toString());
        }
        if (i2 == i10) {
            return i3.k.a();
        }
        i3.h a10 = i3.k.a();
        i0.g(qVar.f8882h, i0.b(i2, i10), new k2(a10, i2, i10, 3));
        return a10;
    }

    public final int hashCode() {
        int hashCode = this.f8866b.hashCode();
        return this.f8870f.hashCode() + w.d.b(this.f8869e, w.d.b(this.f8868d, w.d.f(this.f8867c, (hashCode + (this.f8865a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final long i(int i2) {
        int d4;
        int i10;
        int i11;
        int i12;
        q qVar = this.f8866b;
        qVar.l(i2);
        int length = ((h) qVar.f8875a.A).B.length();
        ArrayList arrayList = qVar.f8882h;
        if (i2 == length) {
            d4 = p7.t.l(arrayList);
        } else {
            d4 = i0.d(i2, arrayList);
        }
        s sVar = (s) arrayList.get(d4);
        b bVar = sVar.f8890a;
        int d10 = sVar.d(i2);
        dk.a j2 = bVar.f8783d.j();
        if (j2.h(j2.j(d10))) {
            j2.a(d10);
            i10 = d10;
            while (i10 != -1 && (!j2.h(i10) || j2.d(i10))) {
                i10 = j2.j(i10);
            }
        } else {
            j2.a(d10);
            if (j2.g(d10)) {
                if (j2.e(d10) && !j2.c(d10)) {
                    i10 = d10;
                } else {
                    i10 = j2.j(d10);
                }
            } else if (j2.c(d10)) {
                i10 = j2.j(d10);
            } else {
                i10 = -1;
            }
        }
        if (i10 == -1) {
            i10 = d10;
        }
        if (j2.d(j2.i(d10))) {
            j2.a(d10);
            i11 = d10;
            while (i11 != -1 && (j2.h(i11) || !j2.d(i11))) {
                i11 = j2.i(i11);
            }
        } else {
            j2.a(d10);
            if (j2.c(d10)) {
                if (j2.e(d10) && !j2.g(d10)) {
                    i11 = d10;
                } else {
                    i12 = j2.i(d10);
                    i11 = i12;
                }
            } else if (j2.g(d10)) {
                i12 = j2.i(d10);
                i11 = i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            d10 = i11;
        }
        return sVar.b(i0.b(i10, d10), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f8865a + ", multiParagraph=" + this.f8866b + ", size=" + ((Object) x4.l.c(this.f8867c)) + ", firstBaseline=" + this.f8868d + ", lastBaseline=" + this.f8869e + ", placeholderRects=" + this.f8870f + ')';
    }
}
