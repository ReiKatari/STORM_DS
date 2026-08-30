package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final a5.r0 f5385a = new a5.r0(14);

    public static final void a(final boolean z10, final mc.a aVar, b3.p pVar, long j2, f1.w1 w1Var, a5.r0 r0Var, final v2.c cVar, n2.m mVar, final int i2) {
        int i10;
        mc.a aVar2;
        boolean z11;
        final b3.p pVar2;
        final long j10;
        final f1.w1 w1Var2;
        final a5.r0 r0Var2;
        long floatToRawIntBits;
        int i11;
        a5.r0 r0Var3;
        b3.m mVar2;
        f1.w1 w1Var3;
        a5.r0 r0Var4;
        long j11;
        a5.r0 r0Var5;
        int i12;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1275450738);
        if ((i2 & 6) == 0) {
            if (rVar.g(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i2 | i13;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            aVar2 = aVar;
            if (rVar.h(aVar2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        } else {
            aVar2 = aVar;
        }
        int i14 = i10 | 208256;
        if ((599187 & i14) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i14 & 1, z11)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i11 = i14 & (-57345);
                mVar2 = pVar;
                floatToRawIntBits = j2;
                w1Var3 = w1Var;
                r0Var3 = r0Var;
            } else {
                float f8 = 0;
                floatToRawIntBits = (Float.floatToRawIntBits(f8) << 32) | (4294967295L & Float.floatToRawIntBits(f8));
                f1.w1 o5 = f1.n.o(rVar);
                i11 = i14 & (-57345);
                b3.m mVar3 = b3.m.f1770a;
                r0Var3 = f5385a;
                mVar2 = mVar3;
                w1Var3 = o5;
            }
            rVar.q();
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new d1.i0(Boolean.FALSE);
                rVar.h0(L);
            }
            d1.i0 i0Var = (d1.i0) L;
            i0Var.f3596c.setValue(Boolean.valueOf(z10));
            if (!((Boolean) i0Var.f3595b.getValue()).booleanValue() && !((Boolean) i0Var.f3596c.getValue()).booleanValue()) {
                rVar.X(-625181200);
                rVar.p(false);
                long j12 = floatToRawIntBits;
                r0Var5 = r0Var3;
                j11 = j12;
            } else {
                rVar.X(-622294666);
                Object L2 = rVar.L();
                if (L2 == eVar) {
                    r0Var4 = r0Var3;
                    L2 = n2.s.w(new i3.q0(i3.q0.f6677b));
                    rVar.h0(L2);
                } else {
                    r0Var4 = r0Var3;
                }
                n2.w0 w0Var = (n2.w0) L2;
                x4.c cVar2 = (x4.c) rVar.j(b4.q1.f1919h);
                Object L3 = rVar.L();
                if (L3 == eVar) {
                    L3 = new o(w0Var, 0);
                    rVar.h0(L3);
                }
                j11 = floatToRawIntBits;
                r0Var5 = r0Var4;
                a5.u.a(new m1(floatToRawIntBits, cVar2, (mc.p) L3), aVar2, r0Var5, v2.h.c(1788768427, new p(i0Var, w0Var, w1Var3, mVar2, cVar), rVar), rVar, (i11 & 112) | 3456, 0);
                rVar.p(false);
            }
            r0Var2 = r0Var5;
            j10 = j11;
            w1Var2 = w1Var3;
            pVar2 = mVar2;
        } else {
            rVar.R();
            pVar2 = pVar;
            j10 = j2;
            w1Var2 = w1Var;
            r0Var2 = r0Var;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.q
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s.a(z10, aVar, pVar2, j10, w1Var2, r0Var2, cVar, (n2.m) obj, n2.s.F(i2 | 1));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void b(mc.a aVar, b3.p pVar, boolean z10, l1.d1 d1Var, mc.q qVar, n2.m mVar, int i2, int i10) {
        int i11;
        int i12;
        boolean z11;
        mc.a aVar2;
        mc.q qVar2;
        l1.h1 h1Var;
        boolean z12;
        b3.m mVar2;
        boolean z13;
        int i13;
        int i14;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(670540513);
        if ((i2 & 6) == 0) {
            if (rVar.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i2;
        } else {
            i11 = i2;
        }
        int i15 = i11 | 48;
        int i16 = i10 & 4;
        if (i16 != 0) {
            i15 = i11 | 432;
        } else if ((i2 & 384) == 0) {
            if (rVar.g(z10)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i15 |= i12;
        }
        int i17 = i15 | 27648;
        if ((196608 & i2) == 0) {
            if (rVar.h(qVar)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i17 |= i13;
        }
        if ((74899 & i17) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i17 & 1, z11)) {
            if (i16 != 0) {
                z13 = true;
            } else {
                z13 = z10;
            }
            l1.h1 h1Var2 = h2.f5162a;
            b3.m mVar3 = b3.m.f1770a;
            aVar2 = aVar;
            i2.b(aVar2, mVar3, z13, h1Var2, qVar, rVar, i17 & 524286);
            qVar2 = qVar;
            mVar2 = mVar3;
            z12 = z13;
            h1Var = h1Var2;
        } else {
            aVar2 = aVar;
            qVar2 = qVar;
            rVar.R();
            h1Var = d1Var;
            z12 = z10;
            mVar2 = pVar;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r(aVar2, mVar2, z12, h1Var, qVar2, i2, i10);
        }
    }
}
