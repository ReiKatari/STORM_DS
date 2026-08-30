package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g6 {
    static {
        d1.d.r(250, 0, d1.w.f3687a, 2);
    }

    public static final void a(final int i2, final b3.p pVar, final long j2, final long j10, final v2.c cVar, mc.p pVar2, final v2.c cVar2, n2.m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        final mc.p pVar3;
        mc.p pVar4;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(113221600);
        if (rVar.d(i2)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i14 = i10 | i11;
        if (rVar.e(j2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if (rVar.e(j10)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i16 = i15 | i13 | 196608;
        if ((599187 & i16) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i16 & 1, z10)) {
            rVar.T();
            if ((i10 & 1) != 0 && !rVar.y()) {
                rVar.R();
                pVar4 = pVar2;
            } else {
                pVar4 = n0.f5286k;
            }
            rVar.q();
            n0.h(i4.n.a(pVar, false, new od.x(16)), null, j2, j10, 0.0f, v2.h.c(-638448612, new d6(cVar2, pVar4, cVar, 1), rVar), rVar, (i16 & 896) | 1572864 | (i16 & 7168), 50);
            pVar3 = pVar4;
        } else {
            rVar.R();
            pVar3 = pVar2;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(i2, pVar, j2, j10, cVar, pVar3, cVar2, i10) { // from class: g2.f6
                public final /* synthetic */ int A;
                public final /* synthetic */ b3.p B;
                public final /* synthetic */ long L;
                public final /* synthetic */ long R;
                public final /* synthetic */ v2.c X;
                public final /* synthetic */ mc.p Y;
                public final /* synthetic */ v2.c Z;

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(1597489);
                    g6.a(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (n2.m) obj, F);
                    return yb.y.f14813a;
                }
            };
        }
    }
}
