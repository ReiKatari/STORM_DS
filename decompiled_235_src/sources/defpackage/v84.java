package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v84  reason: default package */
/* loaded from: classes.dex */
public final class v84 {
    public final s9 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public v84(s9 s9Var, long j, int i, int i2) {
        int i3;
        boolean z;
        of5 of5Var;
        int i4;
        int g;
        int i5;
        this.a = s9Var;
        this.b = i;
        if (q21.j(j) != 0 || q21.i(j) != 0) {
            q53.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) s9Var.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            zr4 zr4Var = (zr4) arrayList2.get(i6);
            gj gjVar = zr4Var.a;
            int h = q21.h(j);
            if (q21.c(j)) {
                i4 = i6;
                g = q21.g(j) - ((int) Math.ceil(f));
                if (g < 0) {
                    g = 0;
                }
            } else {
                i4 = i6;
                g = q21.g(j);
            }
            i3 = 0;
            cj cjVar = new cj(gjVar, this.b - i7, i2, s21.b(0, h, 0, g, 5));
            float b = cjVar.b() + f;
            y37 y37Var = cjVar.d;
            int i8 = i7 + y37Var.g;
            arrayList.add(new yr4(cjVar, zr4Var.b, zr4Var.c, i7, i8, f, b));
            if (!y37Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != hf.U((ArrayList) this.a.e)) {
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
        this.d = q21.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            yr4 yr4Var = (yr4) arrayList.get(i9);
            List list = yr4Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                of5 of5Var2 = (of5) list.get(i10);
                if (of5Var2 != null) {
                    of5Var = yr4Var.a(of5Var2);
                } else {
                    of5Var = null;
                }
                arrayList4.add(of5Var);
            }
            gt0.A0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = gt0.V0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, bh5] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, ah5] */
    public final void a(long j, float[] fArr) {
        k(k47.f(j));
        l(k47.e(j));
        ?? obj = new Object();
        obj.A = 0;
        uj2.C(this.h, j, new z50(j, fArr, obj, new Object()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.A(i, arrayList));
        return yr4Var.a.d.e(i - yr4Var.d) + yr4Var.f;
    }

    public final int c(int i, boolean z) {
        int f;
        m(i);
        ArrayList arrayList = this.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.A(i, arrayList));
        cj cjVar = yr4Var.a;
        int i2 = i - yr4Var.d;
        y37 y37Var = cjVar.d;
        if (z) {
            Layout layout = y37Var.f;
            ThreadLocal threadLocal = d47.a;
            if (layout.getEllipsisCount(i2) > 0 && y37Var.b == TextUtils.TruncateAt.END) {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            } else {
                s9 c = y37Var.c();
                Layout layout2 = (Layout) c.a;
                f = c.C(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            }
        } else {
            f = y37Var.f(i2);
        }
        return f + yr4Var.b;
    }

    public final int d(int i) {
        int z;
        int length = ((fp) this.a.a).B.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            z = hf.U(arrayList);
        } else if (i < 0) {
            z = 0;
        } else {
            z = uj2.z(i, arrayList);
        }
        yr4 yr4Var = (yr4) arrayList.get(z);
        cj cjVar = yr4Var.a;
        return cjVar.d.f.getLineForOffset(yr4Var.d(i)) + yr4Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.B(arrayList, f));
        int i = yr4Var.c - yr4Var.b;
        int i2 = yr4Var.d;
        if (i == 0) {
            return i2;
        }
        cj cjVar = yr4Var.a;
        float f2 = f - yr4Var.f;
        y37 y37Var = cjVar.d;
        return y37Var.f.getLineForVertical(((int) f2) - y37Var.h) + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.A(i, arrayList));
        return yr4Var.a.d.g(i - yr4Var.d) + yr4Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        yr4 yr4Var = (yr4) arrayList.get(uj2.B(arrayList, intBitsToFloat));
        int i2 = yr4Var.c;
        int i3 = yr4Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        cj cjVar = yr4Var.a;
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i) - yr4Var.f) & 4294967295L);
        y37 y37Var = cjVar.d;
        int lineForVertical = y37Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - y37Var.h);
        return y37Var.f.getOffsetForHorizontal(lineForVertical, (y37Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final long h(of5 of5Var, int i, fa6 fa6Var) {
        long j;
        long j2;
        float f = of5Var.b;
        ArrayList arrayList = this.h;
        int B = uj2.B(arrayList, f);
        float f2 = ((yr4) arrayList.get(B)).g;
        float f3 = of5Var.d;
        if (f2 < f3 && B != hf.U(arrayList)) {
            int B2 = uj2.B(arrayList, f3);
            long j3 = k47.b;
            while (true) {
                j = k47.b;
                if (!k47.b(j3, j) || B > B2) {
                    break;
                }
                yr4 yr4Var = (yr4) arrayList.get(B);
                j3 = yr4Var.b(yr4Var.a.c(yr4Var.c(of5Var), i, fa6Var), true);
                B++;
            }
            if (k47.b(j3, j)) {
                return j;
            }
            while (true) {
                j2 = k47.b;
                if (!k47.b(j, j2) || B > B2) {
                    break;
                }
                yr4 yr4Var2 = (yr4) arrayList.get(B2);
                j = yr4Var2.b(yr4Var2.a.c(yr4Var2.c(of5Var), i, fa6Var), true);
                B2--;
            }
            if (k47.b(j, j2)) {
                return j3;
            }
            return jx2.f((int) (j3 >> 32), (int) (4294967295L & j));
        }
        yr4 yr4Var3 = (yr4) arrayList.get(B);
        return yr4Var3.b(yr4Var3.a.c(yr4Var3.c(of5Var), i, fa6Var), true);
    }

    public final void i(xj0 xj0Var, long j, ge6 ge6Var, b17 b17Var, oo1 oo1Var) {
        xj0Var.h();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yr4 yr4Var = (yr4) arrayList.get(i);
            yr4Var.a.f(xj0Var, j, ge6Var, b17Var, oo1Var);
            xj0Var.o(RecyclerView.B1, yr4Var.a.b());
        }
        xj0Var.p();
    }

    public final void j(xj0 xj0Var, f80 f80Var, float f, ge6 ge6Var, b17 b17Var, oo1 oo1Var) {
        xj0Var.h();
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 1) {
            q60.w(this, xj0Var, f80Var, f, ge6Var, b17Var, oo1Var);
        } else if (f80Var instanceof cn6) {
            q60.w(this, xj0Var, f80Var, f, ge6Var, b17Var, oo1Var);
        } else if (f80Var instanceof xd6) {
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                yr4 yr4Var = (yr4) arrayList.get(i);
                f3 += yr4Var.a.b();
                f2 = Math.max(f2, yr4Var.a.d());
            }
            Shader b = ((xd6) f80Var).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cj cjVar = ((yr4) arrayList.get(i2)).a;
                cjVar.g(xj0Var, new g80(b), f, ge6Var, b17Var, oo1Var);
                xj0Var.o(RecyclerView.B1, cjVar.b());
                matrix.setTranslate(RecyclerView.B1, -cjVar.b());
                b.setLocalMatrix(matrix);
            }
        } else {
            i.d();
            return;
        }
        xj0Var.p();
    }

    public final void k(int i) {
        fp fpVar = (fp) this.a.a;
        if (i >= 0 && i < fpVar.B.length()) {
            return;
        }
        StringBuilder t = xg6.t("offset(", i, ") is out of bounds [0, ");
        t.append(fpVar.B.length());
        t.append(')');
        q53.a(t.toString());
    }

    public final void l(int i) {
        fp fpVar = (fp) this.a.a;
        if (i >= 0 && i <= fpVar.B.length()) {
            return;
        }
        StringBuilder t = xg6.t("offset(", i, ") is out of bounds [0, ");
        t.append(fpVar.B.length());
        t.append(']');
        q53.a(t.toString());
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            q53.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
        }
    }
}
