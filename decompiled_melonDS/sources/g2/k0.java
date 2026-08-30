package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final float f5211b;

    /* renamed from: d  reason: collision with root package name */
    public static final float f5213d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f5214e;

    /* renamed from: a  reason: collision with root package name */
    public static final float f5210a = 24;

    /* renamed from: c  reason: collision with root package name */
    public static final float f5212c = 20;

    static {
        float f8 = 2;
        f5211b = f8;
        f5213d = f8;
        f5214e = f8;
    }

    public static final void a(boolean z10, b3.p pVar, boolean z11, x0 x0Var, n2.m mVar, int i2) {
        int i10;
        boolean z12;
        boolean z13;
        x0 x0Var2;
        int i11;
        x0 q10;
        boolean z14;
        k4.a aVar;
        int i12;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-2118660998);
        if (rVar.g(z10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i2;
        if ((i2 & 384) == 0) {
            if (rVar.f(pVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i13 |= i12;
        }
        int i14 = i13 | 93184;
        if ((74899 & i14) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i14 & 1, z12)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i11 = i14 & (-458753);
                z14 = z11;
                q10 = x0Var;
            } else {
                i11 = i14 & (-458753);
                q10 = n0.q(rVar);
                z14 = true;
            }
            rVar.q();
            if (z10) {
                aVar = k4.a.On;
            } else {
                aVar = k4.a.Off;
            }
            k4.a aVar2 = aVar;
            rVar.X(1810037123);
            rVar.p(false);
            c(aVar2, null, pVar, z14, q10, rVar, i11 & 524160);
            z13 = z14;
            x0Var2 = q10;
        } else {
            rVar.R();
            z13 = z11;
            x0Var2 = x0Var;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new f0(z10, pVar, z13, x0Var2, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r34, final k4.a r35, final b3.p r36, final g2.x0 r37, n2.m r38, final int r39) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k0.b(boolean, k4.a, b3.p, g2.x0, n2.m, int):void");
    }

    public static final void c(k4.a aVar, mc.a aVar2, b3.p pVar, boolean z10, x0 x0Var, n2.m mVar, int i2) {
        int i10;
        boolean z11;
        k4.a aVar3;
        x0 x0Var2;
        boolean z12;
        b3.p pVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(2031255194);
        if ((i2 & 6) == 0) {
            if (rVar.d(aVar.ordinal())) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rVar.f(pVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.g(z10)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i2 & 24576) == 0) {
            if (rVar.f(null)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((196608 & i2) == 0) {
            if (rVar.f(x0Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        }
        if ((74899 & i10) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i10 & 1, z11)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
            }
            rVar.q();
            b3.p pVar3 = b3.m.f1770a;
            if (aVar2 != null) {
                pVar2 = s1.c.c(aVar, j3.a(f5210a, 4, 0L, false), z10, new i4.i(1), aVar2);
            } else {
                pVar2 = pVar3;
            }
            if (aVar2 != null) {
                n2.t2 t2Var = d2.f5111a;
                pVar3 = j2.f5197a;
            }
            aVar3 = aVar;
            b(z10, aVar3, l1.c.t(pVar.f(pVar3).f(pVar2), f5211b), x0Var, rVar, ((i10 >> 9) & 14) | ((i10 << 3) & 112) | ((i10 >> 6) & 7168));
            z12 = z10;
            x0Var2 = x0Var;
        } else {
            aVar3 = aVar;
            x0Var2 = x0Var;
            z12 = z10;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new g0(aVar3, aVar2, pVar, z12, x0Var2, i2);
        }
    }
}
