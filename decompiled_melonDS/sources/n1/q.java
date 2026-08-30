package n1;

import java.util.List;
import p1.g0;
import y3.h1;
import y3.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f9816a;

    /* renamed from: b  reason: collision with root package name */
    public final List f9817b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9818c;

    /* renamed from: d  reason: collision with root package name */
    public final b3.f f9819d;

    /* renamed from: e  reason: collision with root package name */
    public final b3.g f9820e;

    /* renamed from: f  reason: collision with root package name */
    public final x4.m f9821f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9822g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9823h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f9824i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f9825j;

    /* renamed from: k  reason: collision with root package name */
    public final p1.w f9826k;

    /* renamed from: l  reason: collision with root package name */
    public int f9827l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9828n;

    /* renamed from: o  reason: collision with root package name */
    public final int f9829o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9830p;

    /* renamed from: q  reason: collision with root package name */
    public int f9831q = Integer.MIN_VALUE;

    /* renamed from: r  reason: collision with root package name */
    public final int[] f9832r;

    public q(int i2, List list, boolean z10, b3.f fVar, b3.g gVar, x4.m mVar, int i10, int i11, int i12, long j2, Object obj, Object obj2, p1.w wVar, long j10) {
        int i13;
        int i14;
        this.f9816a = i2;
        this.f9817b = list;
        this.f9818c = z10;
        this.f9819d = fVar;
        this.f9820e = gVar;
        this.f9821f = mVar;
        this.f9822g = i12;
        this.f9823h = j2;
        this.f9824i = obj;
        this.f9825j = obj2;
        this.f9826k = wVar;
        int size = list.size();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i1 i1Var = (i1) list.get(i17);
            boolean z11 = this.f9818c;
            if (z11) {
                i13 = i1Var.B;
            } else {
                i13 = i1Var.A;
            }
            i15 += i13;
            if (!z11) {
                i14 = i1Var.B;
            } else {
                i14 = i1Var.A;
            }
            i16 = Math.max(i16, i14);
        }
        this.m = i15;
        int i18 = i15 + this.f9822g;
        this.f9828n = i18 >= 0 ? i18 : 0;
        this.f9829o = i16;
        this.f9832r = new int[this.f9817b.size() * 2];
    }

    @Override // p1.g0
    public final int a() {
        return this.f9817b.size();
    }

    @Override // p1.g0
    public final boolean b() {
        return this.f9818c;
    }

    @Override // p1.g0
    public final void c() {
        this.f9830p = true;
    }

    @Override // p1.g0
    public final void d(int i2, int i10, int i11) {
        k(i2, i10, i11);
    }

    @Override // p1.g0
    public final int e() {
        return this.f9828n;
    }

    @Override // p1.g0
    public final long f(int i2) {
        if (i2 == 0 && this.f9817b.size() == 0) {
            int i10 = this.f9827l;
            if (this.f9818c) {
                return (4294967295L & i10) | (0 << 32);
            }
            return (4294967295L & 0) | (i10 << 32);
        }
        int i11 = i2 * 2;
        int[] iArr = this.f9832r;
        int i12 = iArr[i11];
        return (4294967295L & iArr[i11 + 1]) | (i12 << 32);
    }

    @Override // p1.g0
    public final int g() {
        return 1;
    }

    @Override // p1.g0
    public final int getIndex() {
        return this.f9816a;
    }

    @Override // p1.g0
    public final Object getKey() {
        return this.f9824i;
    }

    @Override // p1.g0
    public final Object h(int i2) {
        return ((i1) this.f9817b.get(i2)).n();
    }

    @Override // p1.g0
    public final int i() {
        return 0;
    }

    public final void j(h1 h1Var) {
        if (this.f9831q == Integer.MIN_VALUE) {
            k1.b.a("position() should be called first");
        }
        List list = this.f9817b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            i1 i1Var = (i1) list.get(i2);
            boolean z10 = this.f9818c;
            if (z10) {
                int i10 = i1Var.B;
            } else {
                int i11 = i1Var.A;
            }
            long f8 = f(i2);
            this.f9826k.a(i2, this.f9824i);
            long c4 = x4.j.c(f8, this.f9823h);
            if (z10) {
                h1.w(h1Var, i1Var, c4);
            } else {
                h1.s(h1Var, i1Var, c4);
            }
        }
    }

    public final void k(int i2, int i10, int i11) {
        int i12;
        int i13;
        this.f9827l = i2;
        boolean z10 = this.f9818c;
        if (z10) {
            i12 = i11;
        } else {
            i12 = i10;
        }
        this.f9831q = i12;
        List list = this.f9817b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            i1 i1Var = (i1) list.get(i14);
            int i15 = i14 * 2;
            int[] iArr = this.f9832r;
            if (z10) {
                b3.f fVar = this.f9819d;
                if (fVar != null) {
                    iArr[i15] = fVar.a(i1Var.A, i10, this.f9821f);
                    iArr[i15 + 1] = i2;
                    i13 = i1Var.B;
                } else {
                    k1.b.b("null horizontalAlignment when isVertical == true");
                    wa.b.a();
                    return;
                }
            } else {
                iArr[i15] = i2;
                int i16 = i15 + 1;
                b3.g gVar = this.f9820e;
                if (gVar != null) {
                    iArr[i16] = gVar.a(i1Var.B, i11);
                    i13 = i1Var.A;
                } else {
                    k1.b.b("null verticalAlignment when isVertical == false");
                    wa.b.a();
                    return;
                }
            }
            i2 += i13;
        }
    }
}
