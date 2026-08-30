package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f5163a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f5164b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5165c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5166d = 12;

    /* renamed from: e  reason: collision with root package name */
    public static final float f5167e;

    static {
        float f8 = 2;
        f5163a = f8;
        float f10 = 20;
        f5164b = f10;
        f5165c = f10 / f8;
        f5167e = f8;
    }

    public static final void a(final boolean z10, b3.p pVar, boolean z11, a1 a1Var, n2.m mVar, final int i2, final int i10) {
        int i11;
        a1 a1Var2;
        boolean z12;
        final boolean z13;
        final a1 a1Var3;
        final b3.p pVar2;
        a1 a1Var4;
        boolean z14;
        b3.m mVar2;
        float f8;
        long j2;
        Object A;
        int i12;
        int i13;
        int i14;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1314435585);
        if ((i2 & 6) == 0) {
            if (rVar.g(z10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i2 | i14;
        } else {
            i11 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(null)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        int i15 = i11 | 28032;
        if ((i2 & 196608) == 0) {
            if ((i10 & 32) == 0) {
                a1Var2 = a1Var;
                if (rVar.f(a1Var2)) {
                    i12 = 131072;
                    i15 |= i12;
                }
            } else {
                a1Var2 = a1Var;
            }
            i12 = 65536;
            i15 |= i12;
        } else {
            a1Var2 = a1Var;
        }
        if ((74899 & i15) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i15 & 1, z12)) {
            rVar.T();
            int i16 = i2 & 1;
            b3.m mVar3 = b3.m.f1770a;
            if (i16 != 0 && !rVar.y()) {
                rVar.R();
                mVar2 = pVar;
                z14 = z11;
                a1Var4 = a1Var2;
            } else {
                if ((i10 & 32) != 0) {
                    a1Var4 = n0.n(3072, 7, 0L, rVar);
                } else {
                    a1Var4 = a1Var2;
                }
                z14 = true;
                mVar2 = mVar3;
            }
            rVar.q();
            if (z10) {
                f8 = f5166d / 2;
            } else {
                f8 = 0;
            }
            n2.s2 a10 = d1.e.a(f8, d1.d.r(100, 0, null, 6), rVar, 48);
            a1Var4.getClass();
            rVar.X(1243421834);
            if (!z14) {
                j2 = a1Var4.f5043c;
            } else if (!z10) {
                j2 = a1Var4.f5042b;
            } else {
                j2 = a1Var4.f5041a;
            }
            if (z14) {
                rVar.X(-1312667467);
                A = c1.i2.a(j2, d1.d.r(100, 0, null, 6), rVar, 48, 12);
                rVar.p(false);
            } else {
                rVar.X(-1312564764);
                A = n2.s.A(new i3.s(j2), rVar);
                rVar.p(false);
            }
            rVar.p(false);
            b3.p f10 = l1.r1.f(l1.c.t(l1.r1.n(mVar2.f(mVar3).f(mVar3), b3.c.X, 2), f5163a), f5164b);
            boolean f11 = rVar.f(A) | rVar.f(a10);
            Object L = rVar.L();
            if (f11 || L == n2.l.f9953a) {
                L = new a7.l(20, A, a10);
                rVar.h0(L);
            }
            f1.n.a(f10, (mc.l) L, rVar, 0);
            pVar2 = mVar2;
            z13 = z14;
            a1Var3 = a1Var4;
        } else {
            rVar.R();
            z13 = z11;
            a1Var3 = a1Var2;
            pVar2 = pVar;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.g3
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h3.a(z10, pVar2, z13, a1Var3, (n2.m) obj, n2.s.F(i2 | 1), i10);
                    return yb.y.f14813a;
                }
            };
        }
    }
}
