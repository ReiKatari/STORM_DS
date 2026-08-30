package g2;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x2 implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f5468a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5469b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5470c;

    /* renamed from: d  reason: collision with root package name */
    public final l1.d1 f5471d;

    public x2(mc.l lVar, boolean z10, float f8, l1.d1 d1Var) {
        this.f5468a = lVar;
        this.f5469b = z10;
        this.f5470c = f8;
        this.f5471d = d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [y3.i1] */
    @Override // y3.v0
    public final y3.w0 a(final y3.x0 x0Var, List list, long j2) {
        Object obj;
        y3.i1 i1Var;
        int i2;
        Object obj2;
        y3.i1 i1Var2;
        int i10;
        Object obj3;
        final y3.i1 i1Var3;
        long j10;
        int i11;
        y3.w0 w0Var;
        Object obj4;
        y3.i1 i1Var4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        final x2 x2Var = this;
        l1.d1 d1Var = x2Var.f5471d;
        int O = x0Var.O(d1Var.a());
        long a10 = x4.a.a(j2, 0, 0, 0, 0, 10);
        int size = list.size();
        int i22 = 0;
        while (true) {
            if (i22 < size) {
                obj = list.get(i22);
                if (nc.k.a(y3.c0.j((y3.u0) obj), "Leading")) {
                    break;
                }
                i22++;
            } else {
                obj = null;
                break;
            }
        }
        y3.u0 u0Var = (y3.u0) obj;
        if (u0Var != null) {
            i1Var = u0Var.e(a10);
        } else {
            i1Var = null;
        }
        float f8 = s6.f5397a;
        if (i1Var != null) {
            i2 = i1Var.A;
        } else {
            i2 = 0;
        }
        int size2 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 < size2) {
                obj2 = list.get(i23);
                if (nc.k.a(y3.c0.j((y3.u0) obj2), "Trailing")) {
                    break;
                }
                i23++;
            } else {
                obj2 = null;
                break;
            }
        }
        y3.u0 u0Var2 = (y3.u0) obj2;
        if (u0Var2 != null) {
            i1Var2 = u0Var2.e(x4.b.i(a10, -i2, 0));
        } else {
            i1Var2 = null;
        }
        if (i1Var2 != null) {
            i10 = i1Var2.A;
        } else {
            i10 = 0;
        }
        int O2 = x0Var.O(d1Var.d(x0Var.getLayoutDirection())) + x0Var.O(d1Var.c(x0Var.getLayoutDirection()));
        int i24 = -(i2 + i10);
        int i25 = -O;
        long i26 = x4.b.i(a10, p7.l.x(x2Var.f5470c, i24 - O2, -O2), i25);
        int size3 = list.size();
        int i27 = 0;
        while (true) {
            if (i27 < size3) {
                obj3 = list.get(i27);
                if (nc.k.a(y3.c0.j((y3.u0) obj3), "Label")) {
                    break;
                }
                i27++;
            } else {
                obj3 = null;
                break;
            }
        }
        y3.u0 u0Var3 = (y3.u0) obj3;
        if (u0Var3 != null) {
            i1Var3 = u0Var3.e(i26);
        } else {
            i1Var3 = null;
        }
        if (i1Var3 != null) {
            j10 = (Float.floatToRawIntBits(i1Var3.B) & 4294967295L) | (Float.floatToRawIntBits(i1Var3.A) << 32);
        } else {
            j10 = 0;
        }
        x2Var.f5468a.k(new h3.e(j10));
        if (i1Var3 != null) {
            i11 = i1Var3.B;
        } else {
            i11 = 0;
        }
        long j11 = j2;
        long a11 = x4.a.a(x4.b.i(j11, i24, i25 - Math.max(i11 / 2, x0Var.O(d1Var.b()))), 0, 0, 0, 0, 11);
        int size4 = list.size();
        int i28 = 0;
        while (i28 < size4) {
            y3.u0 u0Var4 = (y3.u0) list.get(i28);
            if (nc.k.a(y3.c0.j(u0Var4), "TextField")) {
                y3.i1 e6 = u0Var4.e(a11);
                long a12 = x4.a.a(a11, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i29 = 0;
                while (true) {
                    if (i29 < size5) {
                        obj4 = list.get(i29);
                        w0Var = null;
                        if (nc.k.a(y3.c0.j((y3.u0) obj4), "Hint")) {
                            break;
                        }
                        i29++;
                    } else {
                        w0Var = null;
                        obj4 = null;
                        break;
                    }
                }
                y3.u0 u0Var5 = (y3.u0) obj4;
                if (u0Var5 != null) {
                    i1Var4 = u0Var5.e(a12);
                } else {
                    i1Var4 = w0Var;
                }
                if (i1Var != null) {
                    i12 = i1Var.A;
                } else {
                    i12 = 0;
                }
                if (i1Var2 != null) {
                    i13 = i1Var2.A;
                } else {
                    i13 = 0;
                }
                int i30 = e6.A;
                if (i1Var3 != null) {
                    i14 = i1Var3.A;
                } else {
                    i14 = 0;
                }
                if (i1Var4 != 0) {
                    i15 = i1Var4.A;
                } else {
                    i15 = 0;
                }
                final y3.i1 i1Var5 = i1Var2;
                final int e10 = v2.e(i12, i13, i30, i14, i15, x2Var.f5470c, j11, x0Var.b(), x2Var.f5471d);
                if (i1Var != null) {
                    i16 = i1Var.B;
                } else {
                    i16 = 0;
                }
                if (i1Var5 != null) {
                    i17 = i1Var5.B;
                } else {
                    i17 = 0;
                }
                int i31 = e6.B;
                if (i1Var3 != null) {
                    i18 = i1Var3.B;
                } else {
                    i18 = 0;
                }
                if (i1Var4 != 0) {
                    i19 = i1Var4.B;
                } else {
                    i19 = 0;
                }
                int d4 = v2.d(i16, i17, i31, i18, i19, x2Var.f5470c, j2, x0Var.b(), x2Var.f5471d);
                int size6 = list.size();
                int i32 = 0;
                y3.i1 i1Var6 = i1Var4;
                while (i32 < size6) {
                    y3.u0 u0Var6 = (y3.u0) list.get(i32);
                    if (nc.k.a(y3.c0.j(u0Var6), "border")) {
                        if (e10 != Integer.MAX_VALUE) {
                            i20 = e10;
                        } else {
                            i20 = 0;
                        }
                        if (d4 != Integer.MAX_VALUE) {
                            i21 = d4;
                        } else {
                            i21 = 0;
                        }
                        final y3.i1 e11 = u0Var6.e(x4.b.a(i20, e10, i21, d4));
                        final y3.i1 i1Var7 = e6;
                        final y3.i1 i1Var8 = i1Var6;
                        final int i33 = d4;
                        final y3.i1 i1Var9 = i1Var;
                        return x0Var.u0(e10, i33, zb.r.A, new mc.l() { // from class: g2.w2
                            @Override // mc.l
                            public final Object k(Object obj5) {
                                int i34;
                                int i35;
                                int i36;
                                int i37;
                                int i38;
                                int i39;
                                float f10;
                                y3.h1 h1Var = (y3.h1) obj5;
                                x2 x2Var2 = x2Var;
                                float f11 = x2Var2.f5470c;
                                boolean z10 = x2Var2.f5469b;
                                y3.x0 x0Var2 = x0Var;
                                float b10 = x0Var2.b();
                                x4.m layoutDirection = x0Var2.getLayoutDirection();
                                l1.d1 d1Var2 = x2Var2.f5471d;
                                float f12 = v2.f5434a;
                                int M = pc.a.M(d1Var2.b() * b10);
                                int M2 = pc.a.M(l1.c.j(d1Var2, layoutDirection) * b10);
                                float f13 = s6.f5398b * b10;
                                int i40 = i33;
                                y3.i1 i1Var10 = i1Var9;
                                if (i1Var10 != null) {
                                    y3.h1.n(h1Var, i1Var10, 0, Math.round((1 + 0.0f) * ((i40 - i1Var10.B) / 2.0f)));
                                }
                                y3.i1 i1Var11 = i1Var5;
                                if (i1Var11 != null) {
                                    y3.h1.n(h1Var, i1Var11, e10 - i1Var11.A, Math.round((1 + 0.0f) * ((i40 - i1Var11.B) / 2.0f)));
                                }
                                y3.i1 i1Var12 = i1Var3;
                                if (i1Var12 != null) {
                                    if (z10) {
                                        i39 = Math.round((1 + 0.0f) * ((i40 - i1Var12.B) / 2.0f));
                                    } else {
                                        i39 = M;
                                    }
                                    int x9 = p7.l.x(f11, i39, -(i1Var12.B / 2));
                                    if (i1Var10 == null) {
                                        f10 = 0.0f;
                                    } else {
                                        f10 = (1 - f11) * (i1Var10.A - f13);
                                    }
                                    y3.h1.n(h1Var, i1Var12, pc.a.M(f10) + M2, x9);
                                }
                                y3.i1 i1Var13 = i1Var7;
                                if (z10) {
                                    i34 = Math.round((1 + 0.0f) * ((i40 - i1Var13.B) / 2.0f));
                                } else {
                                    i34 = M;
                                }
                                if (i1Var12 != null) {
                                    i35 = i1Var12.B;
                                } else {
                                    i35 = 0;
                                }
                                int max = Math.max(i34, i35 / 2);
                                if (i1Var10 != null) {
                                    i36 = i1Var10.A;
                                } else {
                                    i36 = 0;
                                }
                                y3.h1.n(h1Var, i1Var13, i36, max);
                                y3.i1 i1Var14 = i1Var8;
                                if (i1Var14 != null) {
                                    if (z10) {
                                        M = Math.round((1 + 0.0f) * ((i40 - i1Var14.B) / 2.0f));
                                    }
                                    if (i1Var12 != null) {
                                        i37 = i1Var12.B;
                                    } else {
                                        i37 = 0;
                                    }
                                    int max2 = Math.max(M, i37 / 2);
                                    if (i1Var10 != null) {
                                        i38 = i1Var10.A;
                                    } else {
                                        i38 = 0;
                                    }
                                    y3.h1.n(h1Var, i1Var14, i38, max2);
                                }
                                y3.h1.l(h1Var, e11, 0L);
                                return yb.y.f14813a;
                            }
                        });
                    }
                    y3.i1 i1Var10 = e6;
                    i32++;
                    d4 = d4;
                    i1Var6 = i1Var6;
                    e6 = i1Var10;
                    i1Var = i1Var;
                    x2Var = this;
                }
                z4.a.b("Collection contains no element matching the predicate.");
                wa.b.a();
                return w0Var;
            }
            i28++;
            x2Var = this;
            j11 = j2;
        }
        z4.a.b("Collection contains no element matching the predicate.");
        wa.b.a();
        return null;
    }

    public final int b(y3.v vVar, List list, int i2, mc.p pVar) {
        Object obj;
        Object obj2;
        int i10;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        int i13;
        int i14;
        int size = list.size();
        int i15 = 0;
        while (true) {
            obj = null;
            if (i15 < size) {
                obj2 = list.get(i15);
                if (nc.k.a(s6.c((y3.u0) obj2), "Leading")) {
                    break;
                }
                i15++;
            } else {
                obj2 = null;
                break;
            }
        }
        y3.u0 u0Var = (y3.u0) obj2;
        if (u0Var != null) {
            int g02 = u0Var.g0(Preference.DEFAULT_ORDER);
            if (i2 == Integer.MAX_VALUE) {
                i10 = i2;
            } else {
                i10 = i2 - g02;
                if (i10 < 0) {
                    i10 = 0;
                }
            }
            i11 = ((Number) pVar.j(u0Var, Integer.valueOf(i2))).intValue();
        } else {
            i10 = i2;
            i11 = 0;
        }
        int size2 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size2) {
                obj3 = list.get(i16);
                if (nc.k.a(s6.c((y3.u0) obj3), "Trailing")) {
                    break;
                }
                i16++;
            } else {
                obj3 = null;
                break;
            }
        }
        y3.u0 u0Var2 = (y3.u0) obj3;
        if (u0Var2 != null) {
            int g03 = u0Var2.g0(Preference.DEFAULT_ORDER);
            if (i10 != Integer.MAX_VALUE && (i10 = i10 - g03) < 0) {
                i10 = 0;
            }
            i12 = ((Number) pVar.j(u0Var2, Integer.valueOf(i2))).intValue();
        } else {
            i12 = 0;
        }
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 < size3) {
                obj4 = list.get(i17);
                if (nc.k.a(s6.c((y3.u0) obj4), "Label")) {
                    break;
                }
                i17++;
            } else {
                obj4 = null;
                break;
            }
        }
        Object obj5 = (y3.u0) obj4;
        if (obj5 != null) {
            i13 = ((Number) pVar.j(obj5, Integer.valueOf(p7.l.x(this.f5470c, i10, i2)))).intValue();
        } else {
            i13 = 0;
        }
        int size4 = list.size();
        for (int i18 = 0; i18 < size4; i18++) {
            Object obj6 = list.get(i18);
            if (nc.k.a(s6.c((y3.u0) obj6), "TextField")) {
                int intValue = ((Number) pVar.j(obj6, Integer.valueOf(i10))).intValue();
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i19);
                    if (nc.k.a(s6.c((y3.u0) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i19++;
                }
                Object obj8 = (y3.u0) obj;
                if (obj8 != null) {
                    i14 = ((Number) pVar.j(obj8, Integer.valueOf(i10))).intValue();
                } else {
                    i14 = 0;
                }
                return v2.d(i11, i12, intValue, i13, i14, this.f5470c, x4.b.b(0, 0, 15), vVar.b(), this.f5471d);
            }
        }
        z4.a.b("Collection contains no element matching the predicate.");
        wa.b.a();
        return 0;
    }

    @Override // y3.v0
    public final int c(y3.v vVar, List list, int i2) {
        return b(vVar, list, i2, new ai.l(23));
    }

    @Override // y3.v0
    public final int d(y3.v vVar, List list, int i2) {
        return e(vVar, list, i2, new ai.l(24));
    }

    public final int e(y3.v vVar, List list, int i2, mc.p pVar) {
        y3.u0 u0Var;
        Object obj;
        int i10;
        Object obj2;
        int i11;
        Object obj3;
        int i12;
        int i13;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            Object obj4 = list.get(i14);
            if (nc.k.a(s6.c((y3.u0) obj4), "TextField")) {
                int intValue = ((Number) pVar.j(obj4, Integer.valueOf(i2))).intValue();
                int size2 = list.size();
                int i15 = 0;
                while (true) {
                    u0Var = null;
                    if (i15 < size2) {
                        obj = list.get(i15);
                        if (nc.k.a(s6.c((y3.u0) obj), "Label")) {
                            break;
                        }
                        i15++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                y3.u0 u0Var2 = (y3.u0) obj;
                if (u0Var2 != null) {
                    i10 = ((Number) pVar.j(u0Var2, Integer.valueOf(i2))).intValue();
                } else {
                    i10 = 0;
                }
                int size3 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size3) {
                        obj2 = list.get(i16);
                        if (nc.k.a(s6.c((y3.u0) obj2), "Trailing")) {
                            break;
                        }
                        i16++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                y3.u0 u0Var3 = (y3.u0) obj2;
                if (u0Var3 != null) {
                    i11 = ((Number) pVar.j(u0Var3, Integer.valueOf(i2))).intValue();
                } else {
                    i11 = 0;
                }
                int size4 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size4) {
                        obj3 = list.get(i17);
                        if (nc.k.a(s6.c((y3.u0) obj3), "Leading")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                y3.u0 u0Var4 = (y3.u0) obj3;
                if (u0Var4 != null) {
                    i12 = ((Number) pVar.j(u0Var4, Integer.valueOf(i2))).intValue();
                } else {
                    i12 = 0;
                }
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        break;
                    }
                    Object obj5 = list.get(i18);
                    if (nc.k.a(s6.c((y3.u0) obj5), "Hint")) {
                        u0Var = obj5;
                        break;
                    }
                    i18++;
                }
                y3.u0 u0Var5 = u0Var;
                if (u0Var5 != null) {
                    i13 = ((Number) pVar.j(u0Var5, Integer.valueOf(i2))).intValue();
                } else {
                    i13 = 0;
                }
                return v2.e(i12, i11, intValue, i10, i13, this.f5470c, x4.b.b(0, 0, 15), vVar.b(), this.f5471d);
            }
        }
        z4.a.b("Collection contains no element matching the predicate.");
        wa.b.a();
        return 0;
    }

    @Override // y3.v0
    public final int g(y3.v vVar, List list, int i2) {
        return e(vVar, list, i2, new ai.l(25));
    }

    @Override // y3.v0
    public final int j(y3.v vVar, List list, int i2) {
        return b(vVar, list, i2, new ai.l(26));
    }
}
