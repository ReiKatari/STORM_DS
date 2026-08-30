package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: a  reason: collision with root package name */
    public static final c6 f5073a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final float f5074b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5075c = 2;

    public final void a(b3.p pVar, float f8, long j2, n2.m mVar, final int i2) {
        boolean z10;
        final b3.p pVar2;
        final float f10;
        final long j10;
        long b10;
        b3.m mVar2;
        float f11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(910934799);
        int i10 = i2 | 150;
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                mVar2 = pVar;
                f11 = f8;
                b10 = j2;
            } else {
                b10 = i3.s.b(((i3.s) rVar.j(q0.f5361a)).f6689a, 0.12f);
                mVar2 = b3.m.f1770a;
                f11 = f5074b;
            }
            rVar.q();
            n0.c(mVar2, b10, f11, 0.0f, rVar, 6, 8);
            pVar2 = mVar2;
            j10 = b10;
            f10 = f11;
        } else {
            rVar.R();
            pVar2 = pVar;
            f10 = f8;
            j10 = j2;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(pVar2, f10, j10, i2) { // from class: g2.a6
                public final /* synthetic */ b3.p B;
                public final /* synthetic */ float L;
                public final /* synthetic */ long R;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(3073);
                    c6.this.a(this.B, this.L, this.R, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public final void b(final b3.p pVar, float f8, long j2, n2.m mVar, final int i2, final int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1499002201);
        if (rVar.f(pVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i14 = i11 | i2 | 16;
        if ((i10 & 4) == 0 && rVar.e(j2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i2 & 3072) == 0) {
            if (rVar.f(this)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i15 |= i13;
        }
        if ((i15 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
            } else {
                int i16 = i10 & 4;
                float f10 = f5075c;
                if (i16 != 0) {
                    j2 = ((i3.s) rVar.j(q0.f5361a)).f6689a;
                }
                f8 = f10;
            }
            rVar.q();
            l1.p.a(f1.n.f(l1.r1.c(l1.r1.b(pVar, 1.0f), f8), j2, i3.z.f6703b), rVar, 0);
        } else {
            rVar.R();
        }
        final float f11 = f8;
        final long j10 = j2;
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.b6
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6.this.b(pVar, f11, j10, (n2.m) obj, n2.s.F(i2 | 1), i10);
                    return yb.y.f14813a;
                }
            };
        }
    }
}
