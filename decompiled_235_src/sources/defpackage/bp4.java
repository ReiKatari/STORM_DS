package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bp4  reason: default package */
/* loaded from: classes.dex */
public final class bp4 implements e34 {
    public final qn2 a;
    public final boolean b;
    public final float c;
    public final lq4 d;

    public bp4(qn2 qn2Var, boolean z, float f, lq4 lq4Var) {
        this.a = qn2Var;
        this.b = z;
        this.c = f;
        this.d = lq4Var;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
        return c(eb3Var, list, i, new ep3(5, (byte) 0));
    }

    public final int b(eb3 eb3Var, List list, int i, eo2 eo2Var) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int i5;
        int i6;
        int size = list.size();
        int i7 = 0;
        while (true) {
            obj = null;
            if (i7 < size) {
                obj2 = list.get(i7);
                if (nb3.k(nj2.r((x24) obj2), "Leading")) {
                    break;
                }
                i7++;
            } else {
                obj2 = null;
                break;
            }
        }
        x24 x24Var = (x24) obj2;
        if (x24Var != null) {
            int u = x24Var.u(Integer.MAX_VALUE);
            if (i == Integer.MAX_VALUE) {
                i2 = i;
            } else {
                i2 = i - u;
                if (i2 < 0) {
                    i2 = 0;
                }
            }
            i3 = ((Number) eo2Var.o(x24Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 < size2) {
                obj3 = list.get(i8);
                if (nb3.k(nj2.r((x24) obj3), "Trailing")) {
                    break;
                }
                i8++;
            } else {
                obj3 = null;
                break;
            }
        }
        x24 x24Var2 = (x24) obj3;
        if (x24Var2 != null) {
            int u2 = x24Var2.u(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE && (i2 = i2 - u2) < 0) {
                i2 = 0;
            }
            i4 = ((Number) eo2Var.o(x24Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 < size3) {
                obj4 = list.get(i9);
                if (nb3.k(nj2.r((x24) obj4), "Label")) {
                    break;
                }
                i9++;
            } else {
                obj4 = null;
                break;
            }
        }
        Object obj5 = (x24) obj4;
        if (obj5 != null) {
            i5 = ((Number) eo2Var.o(obj5, Integer.valueOf(oi2.M(this.c, i2, i)))).intValue();
        } else {
            i5 = 0;
        }
        int size4 = list.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj6 = list.get(i10);
            if (nb3.k(nj2.r((x24) obj6), "TextField")) {
                int intValue = ((Number) eo2Var.o(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i11);
                    if (nb3.k(nj2.r((x24) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i11++;
                }
                Object obj8 = (x24) obj;
                if (obj8 != null) {
                    i6 = ((Number) eo2Var.o(obj8, Integer.valueOf(i2))).intValue();
                } else {
                    i6 = 0;
                }
                return zo4.d(i3, i4, intValue, i5, i6, this.c, s21.b(0, 0, 0, 0, 15), eb3Var.a(), this.d);
            }
        }
        ex3.b("Collection contains no element matching the predicate.");
        e41.c();
        return 0;
    }

    public final int c(eb3 eb3Var, List list, int i, eo2 eo2Var) {
        x24 x24Var;
        Object obj;
        int i2;
        Object obj2;
        int i3;
        Object obj3;
        int i4;
        int i5;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Object obj4 = list.get(i6);
            if (nb3.k(nj2.r((x24) obj4), "TextField")) {
                int intValue = ((Number) eo2Var.o(obj4, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    x24Var = null;
                    if (i7 < size2) {
                        obj = list.get(i7);
                        if (nb3.k(nj2.r((x24) obj), "Label")) {
                            break;
                        }
                        i7++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                x24 x24Var2 = (x24) obj;
                if (x24Var2 != null) {
                    i2 = ((Number) eo2Var.o(x24Var2, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                int size3 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size3) {
                        obj2 = list.get(i8);
                        if (nb3.k(nj2.r((x24) obj2), "Trailing")) {
                            break;
                        }
                        i8++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                x24 x24Var3 = (x24) obj2;
                if (x24Var3 != null) {
                    i3 = ((Number) eo2Var.o(x24Var3, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                int size4 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size4) {
                        obj3 = list.get(i9);
                        if (nb3.k(nj2.r((x24) obj3), "Leading")) {
                            break;
                        }
                        i9++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                x24 x24Var4 = (x24) obj3;
                if (x24Var4 != null) {
                    i4 = ((Number) eo2Var.o(x24Var4, Integer.valueOf(i))).intValue();
                } else {
                    i4 = 0;
                }
                int size5 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    if (nb3.k(nj2.r((x24) obj5), "Hint")) {
                        x24Var = obj5;
                        break;
                    }
                    i10++;
                }
                x24 x24Var5 = x24Var;
                if (x24Var5 != null) {
                    i5 = ((Number) eo2Var.o(x24Var5, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                return zo4.e(i4, i3, intValue, i2, i5, this.c, s21.b(0, 0, 0, 0, 15), eb3Var.a(), this.d);
            }
        }
        ex3.b("Collection contains no element matching the predicate.");
        e41.c();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [dx4] */
    @Override // defpackage.e34
    public final f34 d(final g34 g34Var, List list, long j) {
        Object obj;
        dx4 dx4Var;
        int i;
        Object obj2;
        dx4 dx4Var2;
        int i2;
        Object obj3;
        final dx4 dx4Var3;
        long j2;
        int i3;
        f34 f34Var;
        Object obj4;
        dx4 dx4Var4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final bp4 bp4Var = this;
        lq4 lq4Var = bp4Var.d;
        int r0 = g34Var.r0(lq4Var.a());
        long a = q21.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                obj = list.get(i14);
                if (nb3.k(lb4.u((x24) obj), "Leading")) {
                    break;
                }
                i14++;
            } else {
                obj = null;
                break;
            }
        }
        x24 x24Var = (x24) obj;
        if (x24Var != null) {
            dx4Var = x24Var.y(a);
        } else {
            dx4Var = null;
        }
        if (dx4Var != null) {
            i = dx4Var.A;
        } else {
            i = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 < size2) {
                obj2 = list.get(i15);
                if (nb3.k(lb4.u((x24) obj2), "Trailing")) {
                    break;
                }
                i15++;
            } else {
                obj2 = null;
                break;
            }
        }
        x24 x24Var2 = (x24) obj2;
        if (x24Var2 != null) {
            dx4Var2 = x24Var2.y(s21.i(a, -i, 0));
        } else {
            dx4Var2 = null;
        }
        if (dx4Var2 != null) {
            i2 = dx4Var2.A;
        } else {
            i2 = 0;
        }
        int r02 = g34Var.r0(lq4Var.c(g34Var.getLayoutDirection())) + g34Var.r0(lq4Var.b(g34Var.getLayoutDirection()));
        int i16 = -(i + i2);
        int i17 = -r0;
        long i18 = s21.i(a, oi2.M(bp4Var.c, i16 - r02, -r02), i17);
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 < size3) {
                obj3 = list.get(i19);
                if (nb3.k(lb4.u((x24) obj3), "Label")) {
                    break;
                }
                i19++;
            } else {
                obj3 = null;
                break;
            }
        }
        x24 x24Var3 = (x24) obj3;
        if (x24Var3 != null) {
            dx4Var3 = x24Var3.y(i18);
        } else {
            dx4Var3 = null;
        }
        if (dx4Var3 != null) {
            j2 = (Float.floatToRawIntBits(dx4Var3.B) & 4294967295L) | (Float.floatToRawIntBits(dx4Var3.A) << 32);
        } else {
            j2 = 0;
        }
        bp4Var.a.g(new xi6(j2));
        if (dx4Var3 != null) {
            i3 = dx4Var3.B;
        } else {
            i3 = 0;
        }
        long j3 = j;
        long a2 = q21.a(s21.i(j3, i16, i17 - Math.max(i3 / 2, g34Var.r0(lq4Var.d()))), 0, 0, 0, 0, 11);
        int size4 = list.size();
        int i20 = 0;
        while (i20 < size4) {
            x24 x24Var4 = (x24) list.get(i20);
            if (nb3.k(lb4.u(x24Var4), "TextField")) {
                dx4 y = x24Var4.y(a2);
                long a3 = q21.a(a2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size5) {
                        obj4 = list.get(i21);
                        f34Var = null;
                        if (nb3.k(lb4.u((x24) obj4), "Hint")) {
                            break;
                        }
                        i21++;
                    } else {
                        f34Var = null;
                        obj4 = null;
                        break;
                    }
                }
                x24 x24Var5 = (x24) obj4;
                if (x24Var5 != null) {
                    dx4Var4 = x24Var5.y(a3);
                } else {
                    dx4Var4 = f34Var;
                }
                if (dx4Var != null) {
                    i4 = dx4Var.A;
                } else {
                    i4 = 0;
                }
                if (dx4Var2 != null) {
                    i5 = dx4Var2.A;
                } else {
                    i5 = 0;
                }
                int i22 = y.A;
                if (dx4Var3 != null) {
                    i6 = dx4Var3.A;
                } else {
                    i6 = 0;
                }
                if (dx4Var4 != 0) {
                    i7 = dx4Var4.A;
                } else {
                    i7 = 0;
                }
                final dx4 dx4Var5 = dx4Var2;
                final int e = zo4.e(i4, i5, i22, i6, i7, bp4Var.c, j3, g34Var.a(), bp4Var.d);
                if (dx4Var != null) {
                    i8 = dx4Var.B;
                } else {
                    i8 = 0;
                }
                if (dx4Var5 != null) {
                    i9 = dx4Var5.B;
                } else {
                    i9 = 0;
                }
                int i23 = y.B;
                if (dx4Var3 != null) {
                    i10 = dx4Var3.B;
                } else {
                    i10 = 0;
                }
                if (dx4Var4 != 0) {
                    i11 = dx4Var4.B;
                } else {
                    i11 = 0;
                }
                int d = zo4.d(i8, i9, i23, i10, i11, bp4Var.c, j, g34Var.a(), bp4Var.d);
                int size6 = list.size();
                int i24 = 0;
                dx4 dx4Var6 = dx4Var4;
                while (i24 < size6) {
                    x24 x24Var6 = (x24) list.get(i24);
                    if (nb3.k(lb4.u(x24Var6), "border")) {
                        if (e != Integer.MAX_VALUE) {
                            i12 = e;
                        } else {
                            i12 = 0;
                        }
                        if (d != Integer.MAX_VALUE) {
                            i13 = d;
                        } else {
                            i13 = 0;
                        }
                        final dx4 y2 = x24Var6.y(s21.a(i12, e, i13, d));
                        final dx4 dx4Var7 = y;
                        final dx4 dx4Var8 = dx4Var6;
                        final int i25 = d;
                        final dx4 dx4Var9 = dx4Var;
                        return g34Var.K(e, i25, zt1.A, new qn2() { // from class: ap4
                            @Override // defpackage.qn2
                            public final Object g(Object obj5) {
                                int i26;
                                int i27;
                                int i28;
                                int i29;
                                int i30;
                                float f;
                                cx4 cx4Var = (cx4) obj5;
                                bp4 bp4Var2 = bp4Var;
                                float f2 = bp4Var2.c;
                                boolean z = bp4Var2.b;
                                g34 g34Var2 = g34Var;
                                float a4 = g34Var2.a();
                                kk3 layoutDirection = g34Var2.getLayoutDirection();
                                lq4 lq4Var2 = bp4Var2.d;
                                int i31 = zo4.b;
                                int E = u24.E(lq4Var2.d() * a4);
                                int E2 = u24.E(ge7.r(lq4Var2, layoutDirection) * a4);
                                float f3 = 12.0f * a4;
                                int i32 = i25;
                                dx4 dx4Var10 = dx4Var9;
                                int i33 = 0;
                                if (dx4Var10 != null) {
                                    cx4.l(cx4Var, dx4Var10, 0, Math.round(((i32 - dx4Var10.B) / 2.0f) * 1.0f));
                                }
                                dx4 dx4Var11 = dx4Var5;
                                if (dx4Var11 != null) {
                                    cx4.l(cx4Var, dx4Var11, e - dx4Var11.A, Math.round(((i32 - dx4Var11.B) / 2.0f) * 1.0f));
                                }
                                dx4 dx4Var12 = dx4Var3;
                                if (dx4Var12 != null) {
                                    if (z) {
                                        i30 = Math.round(((i32 - dx4Var12.B) / 2.0f) * 1.0f);
                                    } else {
                                        i30 = E;
                                    }
                                    int M = oi2.M(f2, i30, -(dx4Var12.B / 2));
                                    if (dx4Var10 == null) {
                                        f = RecyclerView.B1;
                                    } else {
                                        f = (1.0f - f2) * (dx4Var10.A - f3);
                                    }
                                    cx4.l(cx4Var, dx4Var12, u24.E(f) + E2, M);
                                }
                                dx4 dx4Var13 = dx4Var7;
                                if (z) {
                                    i26 = Math.round(((i32 - dx4Var13.B) / 2.0f) * 1.0f);
                                } else {
                                    i26 = E;
                                }
                                if (dx4Var12 != null) {
                                    i27 = dx4Var12.B;
                                } else {
                                    i27 = 0;
                                }
                                int max = Math.max(i26, i27 / 2);
                                if (dx4Var10 != null) {
                                    i28 = dx4Var10.A;
                                } else {
                                    i28 = 0;
                                }
                                cx4.l(cx4Var, dx4Var13, i28, max);
                                dx4 dx4Var14 = dx4Var8;
                                if (dx4Var14 != null) {
                                    if (z) {
                                        E = Math.round(((i32 - dx4Var14.B) / 2.0f) * 1.0f);
                                    }
                                    if (dx4Var12 != null) {
                                        i29 = dx4Var12.B;
                                    } else {
                                        i29 = 0;
                                    }
                                    int max2 = Math.max(E, i29 / 2);
                                    if (dx4Var10 != null) {
                                        i33 = dx4Var10.A;
                                    }
                                    cx4.l(cx4Var, dx4Var14, i33, max2);
                                }
                                cx4.k(cx4Var, y2, 0L);
                                return jg7.a;
                            }
                        });
                    }
                    dx4 dx4Var10 = y;
                    i24++;
                    d = d;
                    dx4Var6 = dx4Var6;
                    y = dx4Var10;
                    dx4Var = dx4Var;
                    bp4Var = this;
                }
                ex3.b("Collection contains no element matching the predicate.");
                e41.c();
                return f34Var;
            }
            i20++;
            bp4Var = this;
            j3 = j;
        }
        ex3.b("Collection contains no element matching the predicate.");
        e41.c();
        return null;
    }

    @Override // defpackage.e34
    public final int e(eb3 eb3Var, List list, int i) {
        return c(eb3Var, list, i, new ep3(6, (byte) 0));
    }

    @Override // defpackage.e34
    public final int g(eb3 eb3Var, List list, int i) {
        return b(eb3Var, list, i, new ep3(7, (byte) 0));
    }

    @Override // defpackage.e34
    public final int i(eb3 eb3Var, List list, int i) {
        return b(eb3Var, list, i, new ep3(4, (byte) 0));
    }
}
