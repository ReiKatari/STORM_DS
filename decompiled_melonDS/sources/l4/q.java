package l4;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final a7.v f8875a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8876b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8877c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8878d;

    /* renamed from: e  reason: collision with root package name */
    public final float f8879e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8880f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f8881g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f8882h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public q(a7.v vVar, long j2, int i2, int i10) {
        boolean z10;
        h3.c cVar;
        int i11;
        int g10;
        int i12;
        this.f8875a = vVar;
        this.f8876b = i2;
        if (x4.a.j(j2) != 0 || x4.a.i(j2) != 0) {
            r4.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) vVar.X;
        int size = arrayList2.size();
        float f8 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            t tVar = (t) arrayList2.get(i13);
            t4.c cVar2 = tVar.f8898a;
            int h2 = x4.a.h(j2);
            if (x4.a.c(j2)) {
                i11 = i13;
                g10 = x4.a.g(j2) - ((int) Math.ceil(f8));
                if (g10 < 0) {
                    g10 = 0;
                }
            } else {
                i11 = i13;
                g10 = x4.a.g(j2);
            }
            b bVar = new b(cVar2, this.f8876b - i14, i10, x4.b.b(h2, g10, 5));
            float b10 = bVar.b() + f8;
            m4.k kVar = bVar.f8783d;
            int i15 = i14 + kVar.f9222g;
            arrayList.add(new s(bVar, tVar.f8899b, tVar.f8900c, i14, i15, f8, b10));
            if (!kVar.f9219d) {
                if (i15 == this.f8876b) {
                    i12 = i11;
                    if (i12 != p7.t.l((ArrayList) this.f8875a.X)) {
                    }
                } else {
                    i12 = i11;
                }
                i13 = i12 + 1;
                i14 = i15;
                f8 = b10;
            }
            z10 = true;
            i14 = i15;
            f8 = b10;
            break;
        }
        z10 = false;
        this.f8879e = f8;
        this.f8880f = i14;
        this.f8877c = z10;
        this.f8882h = arrayList;
        this.f8878d = x4.a.h(j2);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            s sVar = (s) arrayList.get(i16);
            ?? r72 = sVar.f8890a.f8785f;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = r72.size();
            for (int i17 = 0; i17 < size3; i17++) {
                h3.c cVar3 = (h3.c) r72.get(i17);
                if (cVar3 != null) {
                    cVar = sVar.a(cVar3);
                } else {
                    cVar = null;
                }
                arrayList4.add(cVar);
            }
            zb.l.L(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f8875a.B).size()) {
            int size4 = ((List) this.f8875a.B).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i18 = 0; i18 < size4; i18++) {
                arrayList5.add(null);
            }
            arrayList3 = zb.l.e0(arrayList3, arrayList5);
        }
        this.f8881g = arrayList3;
    }

    public static void i(q qVar, i3.q qVar2, long j2, i3.m0 m0Var, w4.l lVar, k3.e eVar) {
        qVar2.p();
        ArrayList arrayList = qVar.f8882h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = (s) arrayList.get(i2);
            sVar.f8890a.f(qVar2, j2, m0Var, lVar, eVar);
            qVar2.k(0.0f, sVar.f8890a.b());
        }
        qVar2.m();
    }

    public static void j(q qVar, i3.q qVar2, i3.o oVar, float f8, i3.m0 m0Var, w4.l lVar, k3.e eVar) {
        qVar2.p();
        ArrayList arrayList = qVar.f8882h;
        if (arrayList.size() <= 1) {
            t4.j.b(qVar, qVar2, oVar, f8, m0Var, lVar, eVar);
        } else if (oVar instanceof i3.p0) {
            t4.j.b(qVar, qVar2, oVar, f8, m0Var, lVar, eVar);
        } else if (oVar instanceof i3.l0) {
            int size = arrayList.size();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                s sVar = (s) arrayList.get(i2);
                f11 += sVar.f8890a.b();
                f10 = Math.max(f10, sVar.f8890a.d());
            }
            Shader b10 = ((i3.l0) oVar).b((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                b bVar = ((s) arrayList.get(i10)).f8890a;
                bVar.g(qVar2, new i3.p(b10), f8, m0Var, lVar, eVar);
                qVar2.k(0.0f, bVar.b());
                matrix.setTranslate(0.0f, -bVar.b());
                b10.setLocalMatrix(matrix);
            }
        } else {
            m9.o.o();
            return;
        }
        qVar2.m();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, nc.r] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, nc.q] */
    public final void a(long j2, float[] fArr) {
        k(q0.f(j2));
        l(q0.e(j2));
        ?? obj = new Object();
        obj.A = 0;
        i0.g(this.f8882h, j2, new f1.s(j2, fArr, (nc.r) obj, (nc.q) new Object()));
    }

    public final float b(int i2) {
        m(i2);
        ArrayList arrayList = this.f8882h;
        s sVar = (s) arrayList.get(i0.e(i2, arrayList));
        return sVar.f8890a.f8783d.e(i2 - sVar.f8893d) + sVar.f8895f;
    }

    public final int c(int i2, boolean z10) {
        int f8;
        m(i2);
        ArrayList arrayList = this.f8882h;
        s sVar = (s) arrayList.get(i0.e(i2, arrayList));
        b bVar = sVar.f8890a;
        int i10 = i2 - sVar.f8893d;
        m4.k kVar = bVar.f8783d;
        if (z10) {
            Layout layout = kVar.f9221f;
            ThreadLocal threadLocal = m4.l.f9232a;
            if (layout.getEllipsisCount(i10) > 0 && kVar.f9217b == TextUtils.TruncateAt.END) {
                f8 = layout.getEllipsisStart(i10) + layout.getLineStart(i10);
            } else {
                a7.v c4 = kVar.c();
                Layout layout2 = (Layout) c4.A;
                f8 = c4.t(layout2.getLineEnd(i10), layout2.getLineStart(i10));
            }
        } else {
            f8 = kVar.f(i10);
        }
        return f8 + sVar.f8891b;
    }

    public final int d(int i2) {
        int d4;
        int length = ((h) this.f8875a.A).B.length();
        ArrayList arrayList = this.f8882h;
        if (i2 >= length) {
            d4 = p7.t.l(arrayList);
        } else if (i2 < 0) {
            d4 = 0;
        } else {
            d4 = i0.d(i2, arrayList);
        }
        s sVar = (s) arrayList.get(d4);
        b bVar = sVar.f8890a;
        return bVar.f8783d.f9221f.getLineForOffset(sVar.d(i2)) + sVar.f8893d;
    }

    public final int e(float f8) {
        ArrayList arrayList = this.f8882h;
        s sVar = (s) arrayList.get(i0.f(arrayList, f8));
        int i2 = sVar.f8892c - sVar.f8891b;
        int i10 = sVar.f8893d;
        if (i2 == 0) {
            return i10;
        }
        b bVar = sVar.f8890a;
        float f10 = f8 - sVar.f8895f;
        m4.k kVar = bVar.f8783d;
        return kVar.f9221f.getLineForVertical(((int) f10) - kVar.f9223h) + i10;
    }

    public final float f(int i2) {
        m(i2);
        ArrayList arrayList = this.f8882h;
        s sVar = (s) arrayList.get(i0.e(i2, arrayList));
        return sVar.f8890a.f8783d.g(i2 - sVar.f8893d) + sVar.f8895f;
    }

    public final int g(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        ArrayList arrayList = this.f8882h;
        s sVar = (s) arrayList.get(i0.f(arrayList, intBitsToFloat));
        int i10 = sVar.f8892c;
        int i11 = sVar.f8891b;
        if (i10 - i11 == 0) {
            return i11;
        }
        b bVar = sVar.f8890a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i2) - sVar.f8895f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        m4.k kVar = bVar.f8783d;
        int lineForVertical = kVar.f9221f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - kVar.f9223h);
        return kVar.f9221f.getOffsetForHorizontal(lineForVertical, (kVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i11;
    }

    public final long h(h3.c cVar, int i2, fj.j jVar) {
        long j2;
        long j10;
        float f8 = cVar.f6053b;
        ArrayList arrayList = this.f8882h;
        int f10 = i0.f(arrayList, f8);
        float f11 = ((s) arrayList.get(f10)).f8896g;
        float f12 = cVar.f6055d;
        if (f11 < f12 && f10 != p7.t.l(arrayList)) {
            int f13 = i0.f(arrayList, f12);
            long j11 = q0.f8883b;
            while (true) {
                j2 = q0.f8883b;
                if (!q0.b(j11, j2) || f10 > f13) {
                    break;
                }
                s sVar = (s) arrayList.get(f10);
                j11 = sVar.b(sVar.f8890a.c(sVar.c(cVar), i2, jVar), true);
                f10++;
            }
            if (q0.b(j11, j2)) {
                return j2;
            }
            while (true) {
                j10 = q0.f8883b;
                if (!q0.b(j2, j10) || f10 > f13) {
                    break;
                }
                s sVar2 = (s) arrayList.get(f13);
                j2 = sVar2.b(sVar2.f8890a.c(sVar2.c(cVar), i2, jVar), true);
                f13--;
            }
            if (q0.b(j2, j10)) {
                return j11;
            }
            return i0.b((int) (j11 >> 32), (int) (4294967295L & j2));
        }
        s sVar3 = (s) arrayList.get(f10);
        return sVar3.b(sVar3.f8890a.c(sVar3.c(cVar), i2, jVar), true);
    }

    public final void k(int i2) {
        h hVar = (h) this.f8875a.A;
        if (i2 >= 0 && i2 < hVar.B.length()) {
            return;
        }
        StringBuilder i10 = kc.a.i("offset(", i2, ") is out of bounds [0, ");
        i10.append(hVar.B.length());
        i10.append(')');
        r4.a.a(i10.toString());
    }

    public final void l(int i2) {
        h hVar = (h) this.f8875a.A;
        if (i2 >= 0 && i2 <= hVar.B.length()) {
            return;
        }
        StringBuilder i10 = kc.a.i("offset(", i2, ") is out of bounds [0, ");
        i10.append(hVar.B.length());
        i10.append(']');
        r4.a.a(i10.toString());
    }

    public final void m(int i2) {
        boolean z10 = false;
        int i10 = this.f8880f;
        if (i2 >= 0 && i2 < i10) {
            z10 = true;
        }
        if (!z10) {
            r4.a.a("lineIndex(" + i2 + ") is out of bounds [0, " + i10 + ')');
        }
    }
}
