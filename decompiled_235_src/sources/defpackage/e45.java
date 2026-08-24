package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e45  reason: default package */
/* loaded from: classes.dex */
public abstract class e45 {
    public static final v71 a = new v71(0.2f, 0.8f);
    public static final v71 b = new v71(0.4f, 1.0f);
    public static final v71 c = new v71(RecyclerView.B1, 0.65f);
    public static final v71 d = new v71(0.1f, 0.45f);
    public static final v71 e = new v71(0.4f, 0.2f);

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a74 a74Var, long j, float f, long j2, int i, px0 px0Var, final int i2, final int i3) {
        a74 a74Var2;
        int i4;
        int i5;
        long j3;
        float f2;
        int i6;
        int i7;
        boolean z;
        final a74 a74Var3;
        final long j4;
        final float f3;
        final long j5;
        final int i8;
        cf5 t;
        a74 a74Var4;
        int i9;
        float f4;
        long j6;
        int i10;
        boolean z2;
        boolean z3;
        final float f5;
        final long j7;
        final long j8;
        int i11;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1119119072);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            a74Var2 = a74Var;
        } else if ((i2 & 6) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            a74Var2 = a74Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            if ((i3 & 2) == 0 && xq2Var.e(j3)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i4 |= i11;
        } else {
            j3 = j;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            f2 = f;
            if (xq2Var.c(f2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
            i7 = i4 | 11264;
            if ((i7 & 9363) == 9362) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i7 & 1, z)) {
                xq2Var.X();
                if ((i2 & 1) != 0 && !xq2Var.B()) {
                    xq2Var.V();
                    if ((i3 & 2) != 0) {
                        i7 &= -113;
                    }
                    int i14 = i7 & (-57345);
                    j6 = j2;
                    i9 = i14;
                    a74Var4 = a74Var2;
                    f4 = f2;
                    i10 = i;
                } else {
                    if (i12 != 0) {
                        a74Var4 = x64.a;
                    } else {
                        a74Var4 = a74Var2;
                    }
                    if ((i3 & 2) != 0) {
                        j3 = ((ut0) xq2Var.j(vt0.a)).g();
                        i7 &= -113;
                    }
                    if (i13 != 0) {
                        f2 = 4.0f;
                    }
                    i9 = i7 & (-57345);
                    f4 = f2;
                    j6 = kt0.g;
                    i10 = 2;
                }
                xq2Var.q();
                int i15 = i10;
                final ys6 ys6Var = new ys6(((qh1) xq2Var.j(ky0.h)).e0(f4), RecyclerView.B1, i15, 0, null, 26);
                g53 H = yh2.H(null, xq2Var, 1);
                wc7 wc7Var = nw7.f0;
                e41 e41Var = ir1.c;
                int i16 = i9;
                final e53 j9 = yh2.j(H, 0, 5, wc7Var, ge7.G(ge7.Y(6660, 0, e41Var, 2), null, 6), null, xq2Var, 33208, 16);
                final e53 h = yh2.h(H, RecyclerView.B1, 286.0f, ge7.G(ge7.Y(1332, 0, e41Var, 2), null, 6), null, xq2Var, 4536, 8);
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (P == vs0Var) {
                    P = new dv4(6);
                    xq2Var.l0(P);
                }
                final e53 h2 = yh2.h(H, RecyclerView.B1, 290.0f, ge7.G(ge7.K((qn2) P), null, 6), null, xq2Var, 4536, 8);
                Object P2 = xq2Var.P();
                if (P2 == vs0Var) {
                    P2 = new dv4(8);
                    xq2Var.l0(P2);
                }
                final e53 h3 = yh2.h(H, RecyclerView.B1, 290.0f, ge7.G(ge7.K((qn2) P2), null, 6), null, xq2Var, 4536, 8);
                a74 i17 = dj6.i(ua6.a(a74Var4, true, new dv4(13)), 40.0f);
                boolean h4 = xq2Var.h(ys6Var) | xq2Var.f(j9) | xq2Var.f(h2) | xq2Var.f(h3) | xq2Var.f(h);
                a74 a74Var5 = a74Var4;
                if ((i16 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = h4 | z2;
                if ((((i16 & 112) ^ 48) > 32 && xq2Var.e(j3)) || (i16 & 48) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = z4 | z3;
                Object P3 = xq2Var.P();
                if (!z5 && P3 != vs0Var) {
                    f5 = f4;
                    j7 = j6;
                    j8 = j3;
                } else {
                    f5 = f4;
                    j7 = j6;
                    j8 = j3;
                    P3 = new qn2() { // from class: a45
                        @Override // defpackage.qn2
                        public final Object g(Object obj) {
                            float f6;
                            no1 no1Var = (no1) obj;
                            long j10 = j7;
                            ys6 ys6Var2 = ys6Var;
                            e45.d(no1Var, RecyclerView.B1, 360.0f, j10, ys6Var2);
                            float floatValue = ((Number) h2.getValue()).floatValue();
                            pp6 pp6Var = h3;
                            float abs = Math.abs(floatValue - ((Number) pp6Var.getValue()).floatValue());
                            float floatValue2 = ((Number) pp6Var.getValue()).floatValue() + ((Number) h.getValue()).floatValue() + (((((Number) j9.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                            if (ys6Var2.c == 0) {
                                f6 = RecyclerView.B1;
                            } else {
                                f6 = ((f5 / 20.0f) * 57.29578f) / 2.0f;
                            }
                            e45.d(no1Var, floatValue2 + f6, Math.max(abs, 0.1f), j8, ys6Var2);
                            return jg7.a;
                        }
                    };
                    xq2Var.l0(P3);
                }
                ak7.j(i17, (qn2) P3, xq2Var, 0);
                j5 = j7;
                f3 = f5;
                j4 = j8;
                i8 = i15;
                a74Var3 = a74Var5;
            } else {
                xq2Var.V();
                a74Var3 = a74Var2;
                j4 = j3;
                f3 = f2;
                j5 = j2;
                i8 = i;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: b45
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        e45.a(a74.this, j4, f3, j5, i8, (px0) obj, ii2.a0(i2 | 1), i3);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        i7 = i4 | 11264;
        if ((i7 & 9363) == 9362) {
        }
        if (!xq2Var.S(i7 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        if ((r30 & 4) != 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(a74 a74Var, final long j, long j2, px0 px0Var, final int i, final int i2) {
        int i3;
        final long j3;
        int i4;
        int i5;
        boolean z;
        a74 a74Var2;
        cf5 t;
        boolean z2;
        boolean z3;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1501635280);
        if ((i & 48) == 0) {
            if (xq2Var.e(j)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 = i | i6;
        } else {
            i3 = i;
        }
        if ((i2 & 4) == 0) {
            j3 = j2;
            if (xq2Var.e(j3)) {
                i4 = 256;
                i5 = i3 | i4 | 1024;
                if ((i5 & 1171) == 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (!xq2Var.S(i5 & 1, z)) {
                    xq2Var.X();
                    if ((i & 1) != 0 && !xq2Var.B()) {
                        xq2Var.V();
                    } else {
                        if ((i2 & 4) != 0) {
                            j3 = kt0.c(0.24f, j);
                            i5 &= -897;
                        }
                        int i7 = i5 & (-7169);
                        xq2Var.q();
                        final long j4 = j3;
                        g53 H = yh2.H(null, xq2Var, 1);
                        Object P = xq2Var.P();
                        vs0 vs0Var = ox0.a;
                        if (P == vs0Var) {
                            P = new dv4(9);
                            xq2Var.l0(P);
                        }
                        final e53 h = yh2.h(H, RecyclerView.B1, 1.0f, ge7.G(ge7.K((qn2) P), null, 6), null, xq2Var, 4536, 8);
                        Object P2 = xq2Var.P();
                        if (P2 == vs0Var) {
                            P2 = new dv4(10);
                            xq2Var.l0(P2);
                        }
                        final e53 h2 = yh2.h(H, RecyclerView.B1, 1.0f, ge7.G(ge7.K((qn2) P2), null, 6), null, xq2Var, 4536, 8);
                        Object P3 = xq2Var.P();
                        if (P3 == vs0Var) {
                            P3 = new dv4(11);
                            xq2Var.l0(P3);
                        }
                        final e53 h3 = yh2.h(H, RecyclerView.B1, 1.0f, ge7.G(ge7.K((qn2) P3), null, 6), null, xq2Var, 4536, 8);
                        Object P4 = xq2Var.P();
                        if (P4 == vs0Var) {
                            P4 = new dv4(12);
                            xq2Var.l0(P4);
                        }
                        final e53 h4 = yh2.h(H, RecyclerView.B1, 1.0f, ge7.G(ge7.K((qn2) P4), null, 6), null, xq2Var, 4536, 8);
                        a74Var2 = a74Var;
                        a74 j5 = dj6.j(ua6.a(ge7.Q(ua6.a(ge7.L(a74Var2, new nw0(2)), true, new dv4(7)), RecyclerView.B1, 10.0f, 1), true, new dv4(13)), 240.0f, 4.0f);
                        if ((((i7 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && xq2Var.e(j4)) || (i7 & RendererDebugBridge.CAPTURE_HEIGHT) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean d2 = z2 | xq2Var.d(0) | xq2Var.f(h) | xq2Var.f(h2);
                        if ((((i7 & 112) ^ 48) > 32 && xq2Var.e(j)) || (i7 & 48) == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean f = z3 | d2 | xq2Var.f(h3) | xq2Var.f(h4);
                        Object P5 = xq2Var.P();
                        if (f || P5 == vs0Var) {
                            qn2 qn2Var = new qn2() { // from class: c45
                                @Override // defpackage.qn2
                                public final Object g(Object obj) {
                                    no1 no1Var = (no1) obj;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L));
                                    e45.e(no1Var, RecyclerView.B1, 1.0f, j4, intBitsToFloat);
                                    pp6 pp6Var = h;
                                    float floatValue = ((Number) pp6Var.getValue()).floatValue();
                                    pp6 pp6Var2 = h2;
                                    int i8 = ((floatValue - ((Number) pp6Var2.getValue()).floatValue()) > RecyclerView.B1 ? 1 : ((floatValue - ((Number) pp6Var2.getValue()).floatValue()) == RecyclerView.B1 ? 0 : -1));
                                    long j6 = j;
                                    if (i8 > 0) {
                                        e45.e(no1Var, ((Number) pp6Var.getValue()).floatValue(), ((Number) pp6Var2.getValue()).floatValue(), j6, intBitsToFloat);
                                    }
                                    pp6 pp6Var3 = h3;
                                    float floatValue2 = ((Number) pp6Var3.getValue()).floatValue();
                                    pp6 pp6Var4 = h4;
                                    if (floatValue2 - ((Number) pp6Var4.getValue()).floatValue() > RecyclerView.B1) {
                                        e45.e(no1Var, ((Number) pp6Var3.getValue()).floatValue(), ((Number) pp6Var4.getValue()).floatValue(), j6, intBitsToFloat);
                                    }
                                    return jg7.a;
                                }
                            };
                            xq2Var.l0(qn2Var);
                            P5 = qn2Var;
                        }
                        ak7.j(j5, (qn2) P5, xq2Var, 0);
                        j3 = j4;
                    }
                } else {
                    a74Var2 = a74Var;
                    xq2Var.V();
                }
                t = xq2Var.t();
                if (t == null) {
                    final a74 a74Var3 = a74Var2;
                    t.d = new eo2() { // from class: d45
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            e45.b(a74.this, j, j3, (px0) obj, ii2.a0(i | 1), i2);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i4 = 128;
        i5 = i3 | i4 | 1024;
        if ((i5 & 1171) == 1170) {
        }
        if (!xq2Var.S(i5 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        if ((r25 & 8) != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final float f, final a74 a74Var, final long j, long j2, px0 px0Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        final long j3;
        float f2;
        float f3;
        boolean z2;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-531984864);
        if (xq2Var.c(f)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        if ((i & 48) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        if (xq2Var.e(j)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        long j4 = j2;
        if ((i2 & 8) == 0 && xq2Var.e(j4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5 | 8192;
        boolean z3 = true;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i9 & 1, z)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
            } else {
                if ((i2 & 8) != 0) {
                    j4 = kt0.c(0.24f, j);
                    i9 &= -7169;
                }
                int i10 = i9 & (-57345);
                xq2Var.q();
                if (f < RecyclerView.B1) {
                    f2 = 0.0f;
                } else {
                    f2 = f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                a74 Q = ge7.Q(ua6.a(ge7.L(a74Var, new nw0(2)), true, new dv4(7)), RecyclerView.B1, 10.0f, 1);
                Float valueOf = Float.valueOf(f2);
                if (Float.isNaN(f2)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    f3 = valueOf.floatValue();
                } else {
                    f3 = 0.0f;
                }
                a74 j5 = dj6.j(ua6.a(Q, true, new f45(f3, new bs0(RecyclerView.B1, 1.0f), 0)), 240.0f, 4.0f);
                if ((((i10 & 7168) ^ 3072) > 2048 && xq2Var.e(j4)) || (i10 & 3072) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean d2 = z2 | xq2Var.d(0) | xq2Var.c(f2);
                if ((((i10 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) <= 256 || !xq2Var.e(j)) && (i10 & RendererDebugBridge.CAPTURE_HEIGHT) != 256) {
                    z3 = false;
                }
                boolean z4 = d2 | z3;
                Object P = xq2Var.P();
                if (!z4 && P != ox0.a) {
                    j3 = j4;
                } else {
                    j3 = j4;
                    final float f4 = f2;
                    qn2 qn2Var = new qn2() { // from class: y35
                        @Override // defpackage.qn2
                        public final Object g(Object obj) {
                            no1 no1Var = (no1) obj;
                            float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L));
                            e45.e(no1Var, RecyclerView.B1, 1.0f, j3, intBitsToFloat);
                            e45.e(no1Var, RecyclerView.B1, f4, j, intBitsToFloat);
                            return jg7.a;
                        }
                    };
                    xq2Var.l0(qn2Var);
                    P = qn2Var;
                }
                ak7.j(j5, (qn2) P, xq2Var, 0);
            }
        } else {
            xq2Var.V();
            j3 = j4;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: z35
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e45.c(f, a74Var, j, j3, (px0) obj, ii2.a0(i | 1), i2);
                    return jg7.a;
                }
            };
        }
    }

    public static final void d(no1 no1Var, float f, float f2, long j, ys6 ys6Var) {
        float f3 = ys6Var.a / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.e() >> 32)) - (2.0f * f3);
        no1.E(no1Var, j, f, f2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), RecyclerView.B1, ys6Var, 832);
    }

    public static final void e(no1 no1Var, float f, float f2, long j, float f3) {
        boolean z;
        float f4;
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.e() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (no1Var.e() & 4294967295L)) / 2.0f;
        if (no1Var.getLayoutDirection() == kk3.Ltr) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f6 = f4 * intBitsToFloat;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        no1.p0(no1Var, j, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f5 * intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), f3, 0, 496);
    }
}
