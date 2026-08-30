package q1;

import h1.n1;
import java.util.List;
import y3.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f12133a;

    /* renamed from: b  reason: collision with root package name */
    public final List f12134b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12135c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12136d;

    /* renamed from: e  reason: collision with root package name */
    public final b3.g f12137e;

    /* renamed from: f  reason: collision with root package name */
    public final x4.m f12138f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12139g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12140h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f12141i;

    /* renamed from: j  reason: collision with root package name */
    public int f12142j;

    /* renamed from: k  reason: collision with root package name */
    public int f12143k;

    public g(int i2, int i10, List list, long j2, Object obj, n1 n1Var, b3.g gVar, x4.m mVar) {
        boolean z10;
        int i11;
        this.f12133a = i2;
        this.f12134b = list;
        this.f12135c = j2;
        this.f12136d = obj;
        this.f12137e = gVar;
        this.f12138f = mVar;
        if (n1Var == n1.Vertical) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12139g = z10;
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i1 i1Var = (i1) list.get(i13);
            if (!this.f12139g) {
                i11 = i1Var.B;
            } else {
                i11 = i1Var.A;
            }
            i12 = Math.max(i12, i11);
        }
        this.f12140h = i12;
        this.f12141i = new int[this.f12134b.size() * 2];
        this.f12143k = Integer.MIN_VALUE;
    }

    public final void a(int i2) {
        this.f12142j += i2;
        int[] iArr = this.f12141i;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolean z10 = this.f12139g;
            if ((z10 && i10 % 2 == 1) || (!z10 && i10 % 2 == 0)) {
                iArr[i10] = iArr[i10] + i2;
            }
        }
    }

    public final void b(int i2, int i10, int i11) {
        int i12;
        int i13;
        this.f12142j = i2;
        boolean z10 = this.f12139g;
        if (z10) {
            i12 = i11;
        } else {
            i12 = i10;
        }
        this.f12143k = i12;
        List list = this.f12134b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            i1 i1Var = (i1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f12141i;
            if (z10) {
                float f8 = (i10 - i1Var.A) / 2.0f;
                float f10 = 0.0f;
                if (this.f12138f != x4.m.Ltr) {
                    f10 = 0.0f * (-1);
                }
                iArr[i15] = Math.round((1 + f10) * f8);
                iArr[i15 + 1] = i2;
                i13 = i1Var.B;
            } else {
                iArr[i15] = i2;
                int i16 = i15 + 1;
                b3.g gVar = this.f12137e;
                if (gVar != null) {
                    iArr[i16] = gVar.a(i1Var.B, i11);
                    i13 = i1Var.A;
                } else {
                    k1.b.b("null verticalAlignment");
                    wa.b.a();
                    return;
                }
            }
            i2 += i13;
        }
    }
}
