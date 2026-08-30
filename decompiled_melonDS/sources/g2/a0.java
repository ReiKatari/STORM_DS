package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final float f5037b;

    /* renamed from: c  reason: collision with root package name */
    public static final b3.p f5038c;

    /* renamed from: d  reason: collision with root package name */
    public static final b3.p f5039d;

    /* renamed from: a  reason: collision with root package name */
    public static final float f5036a = 56;

    /* renamed from: e  reason: collision with root package name */
    public static final l1.g0 f5040e = l1.c.f(0);

    static {
        float f8 = 4;
        f5037b = f8;
        f5038c = l1.r1.l(b3.m.f1770a, 16 - f8);
        f5039d = l1.r1.l(l1.r1.f8614b, 72 - f8);
    }

    public static final void a(long j2, long j10, float f8, l1.d1 d1Var, l1.b2 b2Var, b3.p pVar, v2.c cVar, n2.m mVar, int i2) {
        int i10;
        b3.p pVar2;
        boolean z10;
        n2.r rVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        n2.r rVar2 = (n2.r) mVar;
        rVar2.Z(1222317265);
        if ((i2 & 6) == 0) {
            if (rVar2.e(j2)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar2.e(j10)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        if ((i2 & 384) == 0) {
            if (rVar2.c(f8)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i10 |= i16;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.f(d1Var)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i10 |= i15;
        }
        int i19 = i2 & 24576;
        i3.j0 j0Var = i3.z.f6703b;
        if (i19 == 0) {
            if (rVar2.f(j0Var)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i10 |= i14;
        }
        if ((196608 & i2) == 0) {
            if (rVar2.f(b2Var)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i10 |= i13;
        }
        if ((i2 & 1572864) == 0) {
            pVar2 = pVar;
            if (rVar2.f(pVar2)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i10 |= i12;
        } else {
            pVar2 = pVar;
        }
        if ((12582912 & i2) == 0) {
            if (rVar2.h(cVar)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i10 |= i11;
        }
        if ((4793491 & i10) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i10 & 1, z10)) {
            int i20 = i10 << 6;
            rVar = rVar2;
            b3.p pVar3 = pVar2;
            n0.h(pVar3, j0Var, j2, j10, f8, v2.h.c(-1628734195, new w(b2Var, d1Var, cVar, 0), rVar2), rVar, 1572864 | ((i10 >> 18) & 14) | ((i10 >> 9) & 112) | (i20 & 896) | (i20 & 7168) | ((i10 << 9) & 458752), 16);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new x(j2, j10, f8, d1Var, b2Var, pVar, cVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final v2.c r19, final l1.b2 r20, b3.p r21, final mc.p r22, mc.q r23, final long r24, long r26, float r28, n2.m r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a0.b(v2.c, l1.b2, b3.p, mc.p, mc.q, long, long, float, n2.m, int, int):void");
    }

    public static final void c(final v2.c cVar, b3.p pVar, final mc.p pVar2, mc.q qVar, final long j2, long j10, final float f8, n2.m mVar, final int i2, final int i10) {
        int i11;
        int i12;
        long j11;
        boolean z10;
        final v2.c cVar2;
        final long j12;
        final b3.p pVar3;
        int i13;
        int i14;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-350082398);
        int i15 = i10 & 2;
        if (i15 != 0) {
            i11 = i2 | 48;
        } else if ((i2 & 48) == 0) {
            if (rVar.f(pVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 = i12 | i2;
        } else {
            i11 = i2;
        }
        int i16 = i11 | 3072;
        if ((i2 & 24576) == 0) {
            if (rVar.e(j2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i16 |= i14;
        }
        if ((196608 & i2) == 0) {
            if ((i10 & 32) == 0) {
                j11 = j10;
                if (rVar.e(j11)) {
                    i13 = 131072;
                    i16 |= i13;
                }
            } else {
                j11 = j10;
            }
            i13 = 65536;
            i16 |= i13;
        } else {
            j11 = j10;
        }
        if ((599187 & i16) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i16 & 1, z10)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                if ((i10 & 32) != 0) {
                    i16 &= -458753;
                }
                cVar2 = qVar;
            } else {
                if (i15 != 0) {
                    pVar = b3.m.f1770a;
                }
                v2.c cVar3 = n0.f5277b;
                if ((i10 & 32) != 0) {
                    j11 = m0.b(j2, rVar);
                    i16 &= -458753;
                }
                cVar2 = cVar3;
            }
            j12 = j11;
            pVar3 = pVar;
            rVar.q();
            int i17 = i16 << 3;
            l1.g0 g0Var = f5040e;
            b(cVar, g0Var, pVar3, pVar2, cVar2, j2, j12, f8, rVar, (i17 & 3670016) | (i17 & 896) | 27702 | (458752 & i17) | 12582912, 0);
        } else {
            rVar.R();
            cVar2 = qVar;
            j12 = j11;
            pVar3 = pVar;
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p() { // from class: g2.u
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a0.c(v2.c.this, pVar3, pVar2, cVar2, j2, j12, f8, (n2.m) obj, n2.s.F(i2 | 1), i10);
                    return yb.y.f14813a;
                }
            };
        }
    }
}
