package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a27  reason: default package */
/* loaded from: classes.dex */
public final class a27 implements e34 {
    public final boolean a;
    public final float b;
    public final lq4 c;

    public a27(boolean z, float f, lq4 lq4Var) {
        this.a = z;
        this.b = f;
        this.c = lq4Var;
    }

    public static int c(List list, int i, eo2 eo2Var) {
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
                return s21.g(Math.max(intValue, Math.max(i2, i5)) + i4 + i3, s21.b(0, 0, 0, 0, 15));
            }
        }
        ex3.b("Collection contains no element matching the predicate.");
        e41.c();
        return 0;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
        return c(list, i, new l56(27, (byte) 0));
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
        boolean z;
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
            i5 = ((Number) eo2Var.o(obj5, Integer.valueOf(i2))).intValue();
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
                if (i5 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return uj2.j(intValue, z, i5, i3, i4, i6, s21.b(0, 0, 0, 0, 15), eb3Var.a(), this.c);
            }
        }
        ex3.b("Collection contains no element matching the predicate.");
        e41.c();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [dx4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [dx4] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [dx4] */
    @Override // defpackage.e34
    public final f34 d(final g34 g34Var, List list, long j) {
        Object obj;
        dx4 dx4Var;
        int i;
        f34 f34Var;
        Object obj2;
        final dx4 dx4Var2;
        int i2;
        int i3;
        Object obj3;
        final dx4 dx4Var3;
        int i4;
        int i5;
        Object obj4;
        final dx4 dx4Var4;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        final a27 a27Var = this;
        List list2 = list;
        lq4 lq4Var = a27Var.c;
        int r0 = g34Var.r0(lq4Var.d());
        int r02 = g34Var.r0(lq4Var.a());
        final int r03 = g34Var.r0(2.0f);
        long a = q21.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                obj = list2.get(i13);
                if (nb3.k(lb4.u((x24) obj), "Leading")) {
                    break;
                }
                i13++;
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
        int size2 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 < size2) {
                obj2 = list2.get(i14);
                f34Var = null;
                if (nb3.k(lb4.u((x24) obj2), "Trailing")) {
                    break;
                }
                i14++;
            } else {
                f34Var = null;
                obj2 = null;
                break;
            }
        }
        x24 x24Var2 = (x24) obj2;
        if (x24Var2 != null) {
            dx4Var2 = x24Var2.y(s21.i(a, -i, 0));
        } else {
            dx4Var2 = f34Var;
        }
        if (dx4Var2 != 0) {
            i2 = dx4Var2.A;
        } else {
            i2 = 0;
        }
        int i15 = i + i2;
        int i16 = -r02;
        int i17 = -i15;
        long i18 = s21.i(a, i17, i16);
        int size3 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 < size3) {
                obj3 = list2.get(i19);
                i3 = r02;
                if (nb3.k(lb4.u((x24) obj3), "Label")) {
                    break;
                }
                i19++;
                r02 = i3;
            } else {
                i3 = r02;
                obj3 = f34Var;
                break;
            }
        }
        x24 x24Var3 = (x24) obj3;
        if (x24Var3 != null) {
            dx4Var3 = x24Var3.y(i18);
        } else {
            dx4Var3 = f34Var;
        }
        if (dx4Var3 != 0) {
            i4 = dx4Var3.X(lc.b);
            if (i4 == Integer.MIN_VALUE) {
                i4 = dx4Var3.B;
            }
        } else {
            i4 = 0;
        }
        final int max = Math.max(i4, r0);
        if (dx4Var3 != 0) {
            i5 = (i16 - r03) - max;
        } else {
            i5 = (-r0) - i3;
        }
        long i20 = s21.i(q21.a(j, 0, 0, 0, 0, 11), i17, i5);
        int size4 = list2.size();
        int i21 = 0;
        while (i21 < size4) {
            x24 x24Var4 = (x24) list2.get(i21);
            final int i22 = r0;
            if (nb3.k(lb4.u(x24Var4), "TextField")) {
                final dx4 y = x24Var4.y(i20);
                long a2 = q21.a(i20, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i23 = 0;
                while (true) {
                    if (i23 < size5) {
                        obj4 = list2.get(i23);
                        if (nb3.k(lb4.u((x24) obj4), "Hint")) {
                            break;
                        }
                        i23++;
                        list2 = list;
                    } else {
                        obj4 = f34Var;
                        break;
                    }
                }
                x24 x24Var5 = (x24) obj4;
                if (x24Var5 != null) {
                    dx4Var4 = x24Var5.y(a2);
                } else {
                    dx4Var4 = f34Var;
                }
                if (dx4Var != null) {
                    i6 = dx4Var.A;
                } else {
                    i6 = 0;
                }
                if (dx4Var2 != 0) {
                    i7 = dx4Var2.A;
                } else {
                    i7 = 0;
                }
                int i24 = y.A;
                if (dx4Var3 != 0) {
                    i8 = dx4Var3.A;
                } else {
                    i8 = 0;
                }
                if (dx4Var4 != 0) {
                    i9 = dx4Var4.A;
                } else {
                    i9 = 0;
                }
                final int g = s21.g(Math.max(i24, Math.max(i8, i9)) + i6 + i7, j);
                int i25 = y.B;
                if (dx4Var3 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (dx4Var != null) {
                    i10 = dx4Var.B;
                } else {
                    i10 = 0;
                }
                if (dx4Var2 != 0) {
                    i11 = dx4Var2.B;
                } else {
                    i11 = 0;
                }
                if (dx4Var4 != 0) {
                    i12 = dx4Var4.B;
                } else {
                    i12 = 0;
                }
                final int j2 = uj2.j(i25, z, max, i10, i11, i12, j, g34Var.a(), a27Var.c);
                final dx4 dx4Var5 = dx4Var;
                final int i26 = i4;
                return g34Var.K(g, j2, zt1.A, new qn2() { // from class: y17
                    @Override // defpackage.qn2
                    public final Object g(Object obj5) {
                        int i27;
                        int i28;
                        int E;
                        int i29;
                        int i30;
                        a27 a27Var2 = a27Var;
                        boolean z2 = a27Var2.a;
                        cx4 cx4Var = (cx4) obj5;
                        dx4 dx4Var6 = dx4.this;
                        int i31 = g;
                        int i32 = j2;
                        dx4 dx4Var7 = y;
                        dx4 dx4Var8 = dx4Var4;
                        dx4 dx4Var9 = dx4Var5;
                        dx4 dx4Var10 = dx4Var2;
                        g34 g34Var2 = g34Var;
                        int i33 = 0;
                        if (dx4Var6 != null) {
                            int i34 = i22 - i26;
                            if (i34 < 0) {
                                i34 = 0;
                            }
                            int i35 = max + r03;
                            float f = a27Var2.b;
                            float a3 = g34Var2.a();
                            if (dx4Var9 != null) {
                                cx4.l(cx4Var, dx4Var9, 0, Math.round(((i32 - dx4Var9.B) / 2.0f) * 1.0f));
                            }
                            if (dx4Var10 != null) {
                                cx4.l(cx4Var, dx4Var10, i31 - dx4Var10.A, Math.round(((i32 - dx4Var10.B) / 2.0f) * 1.0f));
                            }
                            if (z2) {
                                E = Math.round(((i32 - dx4Var6.B) / 2.0f) * 1.0f);
                            } else {
                                E = u24.E(16.0f * a3);
                            }
                            int E2 = E - u24.E((E - i34) * f);
                            if (dx4Var9 != null) {
                                i29 = dx4Var9.A;
                            } else {
                                i29 = 0;
                            }
                            cx4.l(cx4Var, dx4Var6, i29, E2);
                            if (dx4Var9 != null) {
                                i30 = dx4Var9.A;
                            } else {
                                i30 = 0;
                            }
                            cx4.l(cx4Var, dx4Var7, i30, i35);
                            if (dx4Var8 != null) {
                                if (dx4Var9 != null) {
                                    i33 = dx4Var9.A;
                                }
                                cx4.l(cx4Var, dx4Var8, i33, i35);
                            }
                        } else {
                            int E3 = u24.E(a27Var2.c.d() * g34Var2.a());
                            if (dx4Var9 != null) {
                                cx4.l(cx4Var, dx4Var9, 0, Math.round(((i32 - dx4Var9.B) / 2.0f) * 1.0f));
                            }
                            if (dx4Var10 != null) {
                                cx4.l(cx4Var, dx4Var10, i31 - dx4Var10.A, Math.round(((i32 - dx4Var10.B) / 2.0f) * 1.0f));
                            }
                            if (z2) {
                                i27 = Math.round(((i32 - dx4Var7.B) / 2.0f) * 1.0f);
                            } else {
                                i27 = E3;
                            }
                            if (dx4Var9 != null) {
                                i28 = dx4Var9.A;
                            } else {
                                i28 = 0;
                            }
                            cx4.l(cx4Var, dx4Var7, i28, i27);
                            if (dx4Var8 != null) {
                                if (z2) {
                                    E3 = Math.round(((i32 - dx4Var8.B) / 2.0f) * 1.0f);
                                }
                                if (dx4Var9 != null) {
                                    i33 = dx4Var9.A;
                                }
                                cx4.l(cx4Var, dx4Var8, i33, E3);
                            }
                        }
                        return jg7.a;
                    }
                });
            }
            r0 = i22;
            i21++;
            a27Var = this;
            list2 = list;
            dx4Var = dx4Var;
        }
        ex3.b("Collection contains no element matching the predicate.");
        e41.c();
        return f34Var;
    }

    @Override // defpackage.e34
    public final int e(eb3 eb3Var, List list, int i) {
        return c(list, i, new z17(0));
    }

    @Override // defpackage.e34
    public final int g(eb3 eb3Var, List list, int i) {
        return b(eb3Var, list, i, new l56(29, (byte) 0));
    }

    @Override // defpackage.e34
    public final int i(eb3 eb3Var, List list, int i) {
        return b(eb3Var, list, i, new l56(28, (byte) 0));
    }
}
