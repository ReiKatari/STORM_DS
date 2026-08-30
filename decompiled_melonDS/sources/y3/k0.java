package y3;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14697a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w0 f14698b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p0 f14699c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f14700d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ w0 f14701e;

    public /* synthetic */ k0(w0 w0Var, p0 p0Var, int i2, w0 w0Var2, int i10) {
        this.f14697a = i10;
        this.f14699c = p0Var;
        this.f14700d = i2;
        this.f14701e = w0Var2;
        this.f14698b = w0Var;
    }

    @Override // y3.w0
    public final int a() {
        switch (this.f14697a) {
            case 0:
                return this.f14698b.a();
            default:
                return this.f14698b.a();
        }
    }

    @Override // y3.w0
    public final void b() {
        int i2;
        switch (this.f14697a) {
            case 0:
                int i10 = this.f14700d;
                p0 p0Var = this.f14699c;
                p0Var.X = i10;
                this.f14701e.b();
                p2.b bVar = p0Var.f14724g0;
                a1.m0 m0Var = p0Var.f14723f0;
                long[] jArr = m0Var.f67a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j2 = jArr[i11];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((255 & j2) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    Object obj = m0Var.f68b[i15];
                                    o1 o1Var = (o1) m0Var.f69c[i15];
                                    int i16 = bVar.i(obj);
                                    i2 = i12;
                                    if (i16 < 0 || i16 >= p0Var.X) {
                                        if (i16 >= 0) {
                                            Object[] objArr = bVar.A;
                                            Object obj2 = objArr[i16];
                                            objArr[i16] = c0.f14668b;
                                        }
                                        if (p0Var.f14721d0.b(obj)) {
                                            o1Var.dispose();
                                        }
                                        m0Var.l(i15);
                                    }
                                } else {
                                    i2 = i12;
                                }
                                j2 >>= i2;
                                i14++;
                                i12 = i2;
                            }
                            if (i13 != i12) {
                            }
                        }
                        if (i11 != length) {
                            i11++;
                        }
                    }
                }
                p0Var.g(p0Var.R);
                return;
            default:
                int i17 = this.f14700d;
                p0 p0Var2 = this.f14699c;
                p0Var2.R = i17;
                this.f14701e.b();
                if (p0Var2.A.f280d0 == null) {
                    p0Var2.g(p0Var2.R);
                    return;
                }
                return;
        }
    }

    @Override // y3.w0
    public final int c() {
        switch (this.f14697a) {
            case 0:
                return this.f14698b.c();
            default:
                return this.f14698b.c();
        }
    }

    @Override // y3.w0
    public final Map d() {
        switch (this.f14697a) {
            case 0:
                return this.f14698b.d();
            default:
                return this.f14698b.d();
        }
    }

    @Override // y3.w0
    public final mc.l e() {
        switch (this.f14697a) {
            case 0:
                return this.f14698b.e();
            default:
                return this.f14698b.e();
        }
    }
}
