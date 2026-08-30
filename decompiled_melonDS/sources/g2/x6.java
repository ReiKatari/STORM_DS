package g2;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x6 implements y3.v0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5480a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5481b;

    /* renamed from: c  reason: collision with root package name */
    public final l1.d1 f5482c;

    public x6(boolean z10, float f8, l1.d1 d1Var) {
        this.f5480a = z10;
        this.f5481b = f8;
        this.f5482c = d1Var;
    }

    public static int e(List list, int i2, mc.p pVar) {
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
                long b10 = x4.b.b(0, 0, 15);
                float f8 = u6.f5424a;
                return x4.b.g(Math.max(intValue, Math.max(i10, i13)) + i12 + i11, b10);
            }
        }
        z4.a.b("Collection contains no element matching the predicate.");
        wa.b.a();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [y3.i1] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [y3.i1] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [y3.i1] */
    @Override // y3.v0
    public final y3.w0 a(final y3.x0 x0Var, List list, long j2) {
        Object obj;
        y3.i1 i1Var;
        int i2;
        y3.w0 w0Var;
        Object obj2;
        final y3.i1 i1Var2;
        int i10;
        int i11;
        Object obj3;
        final y3.i1 i1Var3;
        int i12;
        int i13;
        Object obj4;
        final y3.i1 i1Var4;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18;
        int i19;
        int i20;
        final x6 x6Var = this;
        List list2 = list;
        l1.d1 d1Var = x6Var.f5482c;
        int O = x0Var.O(d1Var.b());
        int O2 = x0Var.O(d1Var.a());
        final int O3 = x0Var.O(u6.f5424a);
        long a10 = x4.a.a(j2, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 < size) {
                obj = list2.get(i21);
                if (nc.k.a(y3.c0.j((y3.u0) obj), "Leading")) {
                    break;
                }
                i21++;
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
        int size2 = list2.size();
        int i22 = 0;
        while (true) {
            if (i22 < size2) {
                obj2 = list2.get(i22);
                w0Var = null;
                if (nc.k.a(y3.c0.j((y3.u0) obj2), "Trailing")) {
                    break;
                }
                i22++;
            } else {
                w0Var = null;
                obj2 = null;
                break;
            }
        }
        y3.u0 u0Var2 = (y3.u0) obj2;
        if (u0Var2 != null) {
            i1Var2 = u0Var2.e(x4.b.i(a10, -i2, 0));
        } else {
            i1Var2 = w0Var;
        }
        if (i1Var2 != 0) {
            i10 = i1Var2.A;
        } else {
            i10 = 0;
        }
        int i23 = i2 + i10;
        int i24 = -O2;
        int i25 = -i23;
        long i26 = x4.b.i(a10, i25, i24);
        int size3 = list2.size();
        int i27 = 0;
        while (true) {
            if (i27 < size3) {
                obj3 = list2.get(i27);
                i11 = O2;
                if (nc.k.a(y3.c0.j((y3.u0) obj3), "Label")) {
                    break;
                }
                i27++;
                O2 = i11;
            } else {
                i11 = O2;
                obj3 = w0Var;
                break;
            }
        }
        y3.u0 u0Var3 = (y3.u0) obj3;
        if (u0Var3 != null) {
            i1Var3 = u0Var3.e(i26);
        } else {
            i1Var3 = w0Var;
        }
        if (i1Var3 != 0) {
            i12 = i1Var3.i0(y3.c.f14666b);
            if (i12 == Integer.MIN_VALUE) {
                i12 = i1Var3.B;
            }
        } else {
            i12 = 0;
        }
        final int max = Math.max(i12, O);
        if (i1Var3 != 0) {
            i13 = (i24 - O3) - max;
        } else {
            i13 = (-O) - i11;
        }
        long i28 = x4.b.i(x4.a.a(j2, 0, 0, 0, 0, 11), i25, i13);
        int size4 = list2.size();
        int i29 = 0;
        while (i29 < size4) {
            y3.u0 u0Var4 = (y3.u0) list2.get(i29);
            final int i30 = O;
            if (nc.k.a(y3.c0.j(u0Var4), "TextField")) {
                final y3.i1 e6 = u0Var4.e(i28);
                long a11 = x4.a.a(i28, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i31 = 0;
                while (true) {
                    if (i31 < size5) {
                        obj4 = list2.get(i31);
                        if (nc.k.a(y3.c0.j((y3.u0) obj4), "Hint")) {
                            break;
                        }
                        i31++;
                        list2 = list;
                    } else {
                        obj4 = w0Var;
                        break;
                    }
                }
                y3.u0 u0Var5 = (y3.u0) obj4;
                if (u0Var5 != null) {
                    i1Var4 = u0Var5.e(a11);
                } else {
                    i1Var4 = w0Var;
                }
                if (i1Var != null) {
                    i14 = i1Var.A;
                } else {
                    i14 = 0;
                }
                if (i1Var2 != 0) {
                    i15 = i1Var2.A;
                } else {
                    i15 = 0;
                }
                int i32 = e6.A;
                if (i1Var3 != 0) {
                    i16 = i1Var3.A;
                } else {
                    i16 = 0;
                }
                if (i1Var4 != 0) {
                    i17 = i1Var4.A;
                } else {
                    i17 = 0;
                }
                final int g10 = x4.b.g(Math.max(i32, Math.max(i16, i17)) + i14 + i15, j2);
                int i33 = e6.B;
                if (i1Var3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i1Var != null) {
                    i18 = i1Var.B;
                } else {
                    i18 = 0;
                }
                if (i1Var2 != 0) {
                    i19 = i1Var2.B;
                } else {
                    i19 = 0;
                }
                if (i1Var4 != 0) {
                    i20 = i1Var4.B;
                } else {
                    i20 = 0;
                }
                final int b10 = u6.b(i33, z10, max, i18, i19, i20, j2, x0Var.b(), x6Var.f5482c);
                final y3.i1 i1Var5 = i1Var;
                final int i34 = i12;
                return x0Var.u0(g10, b10, zb.r.A, new mc.l() { // from class: g2.v6
                    @Override // mc.l
                    public final Object k(Object obj5) {
                        int i35;
                        int i36;
                        int i37;
                        int M;
                        int i38;
                        int i39;
                        int i40;
                        x6 x6Var2 = x6Var;
                        boolean z11 = x6Var2.f5480a;
                        y3.h1 h1Var = (y3.h1) obj5;
                        y3.i1 i1Var6 = y3.i1.this;
                        int i41 = g10;
                        int i42 = b10;
                        y3.i1 i1Var7 = e6;
                        y3.i1 i1Var8 = i1Var4;
                        y3.i1 i1Var9 = i1Var5;
                        y3.i1 i1Var10 = i1Var2;
                        y3.x0 x0Var2 = x0Var;
                        if (i1Var6 != null) {
                            int i43 = i30 - i34;
                            if (i43 < 0) {
                                i43 = 0;
                            }
                            int i44 = max + O3;
                            float f10 = x6Var2.f5481b;
                            float b11 = x0Var2.b();
                            float f11 = u6.f5424a;
                            if (i1Var9 != null) {
                                y3.h1.n(h1Var, i1Var9, 0, Math.round((1 + 0.0f) * ((i42 - i1Var9.B) / 2.0f)));
                            }
                            if (i1Var10 != null) {
                                y3.h1.n(h1Var, i1Var10, i41 - i1Var10.A, Math.round((1 + 0.0f) * ((i42 - i1Var10.B) / 2.0f)));
                            }
                            if (z11) {
                                M = Math.round((1 + 0.0f) * ((i42 - i1Var6.B) / 2.0f));
                            } else {
                                M = pc.a.M(s6.f5397a * b11);
                            }
                            int M2 = M - pc.a.M((M - i43) * f10);
                            float f12 = s6.f5397a;
                            if (i1Var9 != null) {
                                i38 = i1Var9.A;
                            } else {
                                i38 = 0;
                            }
                            y3.h1.n(h1Var, i1Var6, i38, M2);
                            if (i1Var9 != null) {
                                i39 = i1Var9.A;
                            } else {
                                i39 = 0;
                            }
                            y3.h1.n(h1Var, i1Var7, i39, i44);
                            if (i1Var8 != null) {
                                if (i1Var9 != null) {
                                    i40 = i1Var9.A;
                                } else {
                                    i40 = 0;
                                }
                                y3.h1.n(h1Var, i1Var8, i40, i44);
                            }
                        } else {
                            float b12 = x0Var2.b();
                            l1.d1 d1Var2 = x6Var2.f5482c;
                            float f13 = u6.f5424a;
                            int M3 = pc.a.M(d1Var2.b() * b12);
                            if (i1Var9 != null) {
                                i35 = 0;
                                y3.h1.n(h1Var, i1Var9, 0, Math.round((1 + 0.0f) * ((i42 - i1Var9.B) / 2.0f)));
                            } else {
                                i35 = 0;
                            }
                            if (i1Var10 != null) {
                                y3.h1.n(h1Var, i1Var10, i41 - i1Var10.A, Math.round((1 + 0.0f) * ((i42 - i1Var10.B) / 2.0f)));
                            }
                            if (z11) {
                                i36 = Math.round((1 + 0.0f) * ((i42 - i1Var7.B) / 2.0f));
                            } else {
                                i36 = M3;
                            }
                            float f14 = s6.f5397a;
                            if (i1Var9 != null) {
                                i37 = i1Var9.A;
                            } else {
                                i37 = i35;
                            }
                            y3.h1.n(h1Var, i1Var7, i37, i36);
                            if (i1Var8 != null) {
                                if (z11) {
                                    M3 = Math.round((1 + 0.0f) * ((i42 - i1Var8.B) / 2.0f));
                                }
                                if (i1Var9 != null) {
                                    i35 = i1Var9.A;
                                }
                                y3.h1.n(h1Var, i1Var8, i35, M3);
                            }
                        }
                        return yb.y.f14813a;
                    }
                });
            }
            O = i30;
            i29++;
            x6Var = this;
            list2 = list;
            i1Var = i1Var;
        }
        z4.a.b("Collection contains no element matching the predicate.");
        wa.b.a();
        return w0Var;
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
        boolean z10;
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
            i13 = ((Number) pVar.j(obj5, Integer.valueOf(i10))).intValue();
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
                if (i13 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return u6.b(intValue, z10, i13, i11, i12, i14, x4.b.b(0, 0, 15), vVar.b(), this.f5482c);
            }
        }
        z4.a.b("Collection contains no element matching the predicate.");
        wa.b.a();
        return 0;
    }

    @Override // y3.v0
    public final int c(y3.v vVar, List list, int i2) {
        return b(vVar, list, i2, new ai.l(28));
    }

    @Override // y3.v0
    public final int d(y3.v vVar, List list, int i2) {
        return e(list, i2, new ai.l(27));
    }

    @Override // y3.v0
    public final int g(y3.v vVar, List list, int i2) {
        return e(list, i2, new w6(0));
    }

    @Override // y3.v0
    public final int j(y3.v vVar, List list, int i2) {
        return b(vVar, list, i2, new zg.b(1));
    }
}
