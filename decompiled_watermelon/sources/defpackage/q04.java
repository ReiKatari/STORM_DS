package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q04  reason: default package */
/* loaded from: classes.dex */
public final class q04 {
    public final r9 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public q04(r9 r9Var, long j, int i, int i2) {
        int i3;
        boolean z;
        y55 y55Var;
        int i4;
        int g;
        int i5;
        this.a = r9Var;
        this.b = i;
        if (lz0.j(j) != 0 || lz0.i(j) != 0) {
            nz2.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) r9Var.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            xi4 xi4Var = (xi4) arrayList2.get(i6);
            ui uiVar = xi4Var.a;
            int h = lz0.h(j);
            if (lz0.c(j)) {
                i4 = i6;
                g = lz0.g(j) - ((int) Math.ceil(f));
                if (g < 0) {
                    g = 0;
                }
            } else {
                i4 = i6;
                g = lz0.g(j);
            }
            i3 = 0;
            qi qiVar = new qi(uiVar, this.b - i7, i2, nz0.b(0, h, 0, g, 5));
            float b = qiVar.b() + f;
            jr6 jr6Var = qiVar.d;
            int i8 = i7 + jr6Var.g;
            arrayList.add(new wi4(qiVar, xi4Var.b, xi4Var.c, i7, i8, f, b));
            if (!jr6Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != l07.P((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = b;
            }
            z = true;
            i7 = i8;
            f = b;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = lz0.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            wi4 wi4Var = (wi4) arrayList.get(i9);
            List list = wi4Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                y55 y55Var2 = (y55) list.get(i10);
                if (y55Var2 != null) {
                    y55Var = wi4Var.a(y55Var2);
                } else {
                    y55Var = null;
                }
                arrayList4.add(y55Var);
            }
            tq0.D0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = tq0.X0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, l75] */
    /* JADX WARN: Type inference failed for: r6v0, types: [k75, java.lang.Object] */
    public final void a(long j, float[] fArr) {
        k(vr6.f(j));
        l(vr6.e(j));
        ?? obj = new Object();
        obj.A = 0;
        yf2.t(this.h, j, new b40(j, fArr, obj, new Object()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.r(i, arrayList));
        return wi4Var.a.d.e(i - wi4Var.d) + wi4Var.f;
    }

    public final int c(int i, boolean z) {
        int f;
        m(i);
        ArrayList arrayList = this.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.r(i, arrayList));
        qi qiVar = wi4Var.a;
        int i2 = i - wi4Var.d;
        jr6 jr6Var = qiVar.d;
        if (z) {
            Layout layout = jr6Var.f;
            ThreadLocal threadLocal = or6.a;
            if (layout.getEllipsisCount(i2) > 0 && jr6Var.b == TextUtils.TruncateAt.END) {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            } else {
                r9 c = jr6Var.c();
                Layout layout2 = (Layout) c.a;
                f = c.C(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            }
        } else {
            f = jr6Var.f(i2);
        }
        return f + wi4Var.b;
    }

    public final int d(int i) {
        int q;
        int length = ((to) this.a.a).B.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            q = l07.P(arrayList);
        } else if (i < 0) {
            q = 0;
        } else {
            q = yf2.q(i, arrayList);
        }
        wi4 wi4Var = (wi4) arrayList.get(q);
        qi qiVar = wi4Var.a;
        return qiVar.d.f.getLineForOffset(wi4Var.d(i)) + wi4Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.s(arrayList, f));
        int i = wi4Var.c - wi4Var.b;
        int i2 = wi4Var.d;
        if (i == 0) {
            return i2;
        }
        qi qiVar = wi4Var.a;
        float f2 = f - wi4Var.f;
        jr6 jr6Var = qiVar.d;
        return jr6Var.f.getLineForVertical(((int) f2) - jr6Var.h) + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.r(i, arrayList));
        return wi4Var.a.d.g(i - wi4Var.d) + wi4Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        wi4 wi4Var = (wi4) arrayList.get(yf2.s(arrayList, intBitsToFloat));
        int i2 = wi4Var.c;
        int i3 = wi4Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        qi qiVar = wi4Var.a;
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i) - wi4Var.f) & 4294967295L);
        jr6 jr6Var = qiVar.d;
        int lineForVertical = jr6Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - jr6Var.h);
        return jr6Var.f.getOffsetForHorizontal(lineForVertical, (jr6Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final long h(y55 y55Var, int i, vd6 vd6Var) {
        long j;
        long j2;
        float f = y55Var.b;
        ArrayList arrayList = this.h;
        int s = yf2.s(arrayList, f);
        float f2 = ((wi4) arrayList.get(s)).g;
        float f3 = y55Var.d;
        if (f2 < f3 && s != l07.P(arrayList)) {
            int s2 = yf2.s(arrayList, f3);
            long j3 = vr6.b;
            while (true) {
                j = vr6.b;
                if (!vr6.b(j3, j) || s > s2) {
                    break;
                }
                wi4 wi4Var = (wi4) arrayList.get(s);
                j3 = wi4Var.b(wi4Var.a.c(wi4Var.c(y55Var), i, vd6Var), true);
                s++;
            }
            if (vr6.b(j3, j)) {
                return j;
            }
            while (true) {
                j2 = vr6.b;
                if (!vr6.b(j, j2) || s > s2) {
                    break;
                }
                wi4 wi4Var2 = (wi4) arrayList.get(s2);
                j = wi4Var2.b(wi4Var2.a.c(wi4Var2.c(y55Var), i, vd6Var), true);
                s2--;
            }
            if (vr6.b(j, j2)) {
                return j3;
            }
            return ve2.g((int) (j3 >> 32), (int) (4294967295L & j));
        }
        wi4 wi4Var3 = (wi4) arrayList.get(s);
        return wi4Var3.b(wi4Var3.a.c(wi4Var3.c(y55Var), i, vd6Var), true);
    }

    public final void i(oh0 oh0Var, long j, u26 u26Var, qo6 qo6Var, ik1 ik1Var) {
        oh0Var.m();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wi4 wi4Var = (wi4) arrayList.get(i);
            wi4Var.a.f(oh0Var, j, u26Var, qo6Var, ik1Var);
            oh0Var.g(RecyclerView.A1, wi4Var.a.b());
        }
        oh0Var.j();
    }

    public final void j(oh0 oh0Var, b60 b60Var, float f, u26 u26Var, qo6 qo6Var, ik1 ik1Var) {
        oh0Var.m();
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 1) {
            mh7.H(this, oh0Var, b60Var, f, u26Var, qo6Var, ik1Var);
        } else if (b60Var instanceof mb6) {
            mh7.H(this, oh0Var, b60Var, f, u26Var, qo6Var, ik1Var);
        } else if (b60Var instanceof l26) {
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                wi4 wi4Var = (wi4) arrayList.get(i);
                f3 += wi4Var.a.b();
                f2 = Math.max(f2, wi4Var.a.d());
            }
            Shader b = ((l26) b60Var).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                qi qiVar = ((wi4) arrayList.get(i2)).a;
                qiVar.g(oh0Var, new c60(b), f, u26Var, qo6Var, ik1Var);
                oh0Var.g(RecyclerView.A1, qiVar.b());
                matrix.setTranslate(RecyclerView.A1, -qiVar.b());
                b.setLocalMatrix(matrix);
            }
        } else {
            i.c();
            return;
        }
        oh0Var.j();
    }

    public final void k(int i) {
        to toVar = (to) this.a.a;
        if (i >= 0 && i < toVar.B.length()) {
            return;
        }
        StringBuilder s = wh1.s("offset(", i, ") is out of bounds [0, ");
        s.append(toVar.B.length());
        s.append(')');
        nz2.a(s.toString());
    }

    public final void l(int i) {
        to toVar = (to) this.a.a;
        if (i >= 0 && i <= toVar.B.length()) {
            return;
        }
        StringBuilder s = wh1.s("offset(", i, ") is out of bounds [0, ");
        s.append(toVar.B.length());
        s.append(']');
        nz2.a(s.toString());
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            nz2.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
        }
    }
}
