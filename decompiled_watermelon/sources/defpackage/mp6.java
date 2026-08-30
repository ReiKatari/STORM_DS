package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mp6  reason: default package */
/* loaded from: classes.dex */
public final class mp6 implements tv3 {
    public final boolean a;
    public final float b;
    public final ih4 c;

    public mp6(boolean z, float f, ih4 ih4Var) {
        this.a = z;
        this.b = f;
        this.c = ih4Var;
    }

    public static int d(List list, int i, aj2 aj2Var) {
        mv3 mv3Var;
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
            if (b53.x(jk2.A((mv3) obj4), "TextField")) {
                int intValue = ((Number) aj2Var.j(obj4, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    mv3Var = null;
                    if (i7 < size2) {
                        obj = list.get(i7);
                        if (b53.x(jk2.A((mv3) obj), "Label")) {
                            break;
                        }
                        i7++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                mv3 mv3Var2 = (mv3) obj;
                if (mv3Var2 != null) {
                    i2 = ((Number) aj2Var.j(mv3Var2, Integer.valueOf(i))).intValue();
                } else {
                    i2 = 0;
                }
                int size3 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size3) {
                        obj2 = list.get(i8);
                        if (b53.x(jk2.A((mv3) obj2), "Trailing")) {
                            break;
                        }
                        i8++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                mv3 mv3Var3 = (mv3) obj2;
                if (mv3Var3 != null) {
                    i3 = ((Number) aj2Var.j(mv3Var3, Integer.valueOf(i))).intValue();
                } else {
                    i3 = 0;
                }
                int size4 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size4) {
                        obj3 = list.get(i9);
                        if (b53.x(jk2.A((mv3) obj3), "Leading")) {
                            break;
                        }
                        i9++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                mv3 mv3Var4 = (mv3) obj3;
                if (mv3Var4 != null) {
                    i4 = ((Number) aj2Var.j(mv3Var4, Integer.valueOf(i))).intValue();
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
                    if (b53.x(jk2.A((mv3) obj5), "Hint")) {
                        mv3Var = obj5;
                        break;
                    }
                    i10++;
                }
                mv3 mv3Var5 = mv3Var;
                if (mv3Var5 != null) {
                    i5 = ((Number) aj2Var.j(mv3Var5, Integer.valueOf(i))).intValue();
                } else {
                    i5 = 0;
                }
                return nz0.g(Math.max(intValue, Math.max(i2, i5)) + i4 + i3, nz0.b(0, 0, 0, 0, 15));
            }
        }
        dq3.b("Collection contains no element matching the predicate.");
        f81.c();
        return 0;
    }

    @Override // defpackage.tv3
    public final int a(s43 s43Var, List list, int i) {
        return c(s43Var, list, i, new gu5(14));
    }

    @Override // defpackage.tv3
    public final int b(s43 s43Var, List list, int i) {
        return d(list, i, new gu5(12));
    }

    public final int c(s43 s43Var, List list, int i, aj2 aj2Var) {
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
                if (b53.x(jk2.A((mv3) obj2), "Leading")) {
                    break;
                }
                i7++;
            } else {
                obj2 = null;
                break;
            }
        }
        mv3 mv3Var = (mv3) obj2;
        if (mv3Var != null) {
            int e0 = mv3Var.e0(Preference.DEFAULT_ORDER);
            if (i == Integer.MAX_VALUE) {
                i2 = i;
            } else {
                i2 = i - e0;
                if (i2 < 0) {
                    i2 = 0;
                }
            }
            i3 = ((Number) aj2Var.j(mv3Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 < size2) {
                obj3 = list.get(i8);
                if (b53.x(jk2.A((mv3) obj3), "Trailing")) {
                    break;
                }
                i8++;
            } else {
                obj3 = null;
                break;
            }
        }
        mv3 mv3Var2 = (mv3) obj3;
        if (mv3Var2 != null) {
            int e02 = mv3Var2.e0(Preference.DEFAULT_ORDER);
            if (i2 != Integer.MAX_VALUE && (i2 = i2 - e02) < 0) {
                i2 = 0;
            }
            i4 = ((Number) aj2Var.j(mv3Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 < size3) {
                obj4 = list.get(i9);
                if (b53.x(jk2.A((mv3) obj4), "Label")) {
                    break;
                }
                i9++;
            } else {
                obj4 = null;
                break;
            }
        }
        Object obj5 = (mv3) obj4;
        if (obj5 != null) {
            i5 = ((Number) aj2Var.j(obj5, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size4 = list.size();
        for (int i10 = 0; i10 < size4; i10++) {
            Object obj6 = list.get(i10);
            if (b53.x(jk2.A((mv3) obj6), "TextField")) {
                int intValue = ((Number) aj2Var.j(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i11);
                    if (b53.x(jk2.A((mv3) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i11++;
                }
                Object obj8 = (mv3) obj;
                if (obj8 != null) {
                    i6 = ((Number) aj2Var.j(obj8, Integer.valueOf(i2))).intValue();
                } else {
                    i6 = 0;
                }
                if (i5 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                return nk2.n(intValue, z, i5, i3, i4, i6, nz0.b(0, 0, 0, 0, 15), s43Var.b(), this.c);
            }
        }
        dq3.b("Collection contains no element matching the predicate.");
        f81.c();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [yn4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [yn4] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [yn4] */
    @Override // defpackage.tv3
    public final uv3 f(final vv3 vv3Var, List list, long j) {
        Object obj;
        yn4 yn4Var;
        int i;
        uv3 uv3Var;
        Object obj2;
        final yn4 yn4Var2;
        int i2;
        int i3;
        Object obj3;
        final yn4 yn4Var3;
        int i4;
        int i5;
        Object obj4;
        final yn4 yn4Var4;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        final mp6 mp6Var = this;
        List list2 = list;
        ih4 ih4Var = mp6Var.c;
        int Y = vv3Var.Y(ih4Var.d());
        int Y2 = vv3Var.Y(ih4Var.c());
        final int Y3 = vv3Var.Y(2.0f);
        long a = lz0.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                obj = list2.get(i13);
                if (b53.x(iq2.p((mv3) obj), "Leading")) {
                    break;
                }
                i13++;
            } else {
                obj = null;
                break;
            }
        }
        mv3 mv3Var = (mv3) obj;
        if (mv3Var != null) {
            yn4Var = mv3Var.c(a);
        } else {
            yn4Var = null;
        }
        if (yn4Var != null) {
            i = yn4Var.A;
        } else {
            i = 0;
        }
        int size2 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 < size2) {
                obj2 = list2.get(i14);
                uv3Var = null;
                if (b53.x(iq2.p((mv3) obj2), "Trailing")) {
                    break;
                }
                i14++;
            } else {
                uv3Var = null;
                obj2 = null;
                break;
            }
        }
        mv3 mv3Var2 = (mv3) obj2;
        if (mv3Var2 != null) {
            yn4Var2 = mv3Var2.c(nz0.i(a, -i, 0));
        } else {
            yn4Var2 = uv3Var;
        }
        if (yn4Var2 != 0) {
            i2 = yn4Var2.A;
        } else {
            i2 = 0;
        }
        int i15 = i + i2;
        int i16 = -Y2;
        int i17 = -i15;
        long i18 = nz0.i(a, i17, i16);
        int size3 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 < size3) {
                obj3 = list2.get(i19);
                i3 = Y2;
                if (b53.x(iq2.p((mv3) obj3), "Label")) {
                    break;
                }
                i19++;
                Y2 = i3;
            } else {
                i3 = Y2;
                obj3 = uv3Var;
                break;
            }
        }
        mv3 mv3Var3 = (mv3) obj3;
        if (mv3Var3 != null) {
            yn4Var3 = mv3Var3.c(i18);
        } else {
            yn4Var3 = uv3Var;
        }
        if (yn4Var3 != 0) {
            i4 = yn4Var3.j0(xb.b);
            if (i4 == Integer.MIN_VALUE) {
                i4 = yn4Var3.B;
            }
        } else {
            i4 = 0;
        }
        final int max = Math.max(i4, Y);
        if (yn4Var3 != 0) {
            i5 = (i16 - Y3) - max;
        } else {
            i5 = (-Y) - i3;
        }
        long i20 = nz0.i(lz0.a(j, 0, 0, 0, 0, 11), i17, i5);
        int size4 = list2.size();
        int i21 = 0;
        while (i21 < size4) {
            mv3 mv3Var4 = (mv3) list2.get(i21);
            final int i22 = Y;
            if (b53.x(iq2.p(mv3Var4), "TextField")) {
                final yn4 c = mv3Var4.c(i20);
                long a2 = lz0.a(i20, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i23 = 0;
                while (true) {
                    if (i23 < size5) {
                        obj4 = list2.get(i23);
                        if (b53.x(iq2.p((mv3) obj4), "Hint")) {
                            break;
                        }
                        i23++;
                        list2 = list;
                    } else {
                        obj4 = uv3Var;
                        break;
                    }
                }
                mv3 mv3Var5 = (mv3) obj4;
                if (mv3Var5 != null) {
                    yn4Var4 = mv3Var5.c(a2);
                } else {
                    yn4Var4 = uv3Var;
                }
                if (yn4Var != null) {
                    i6 = yn4Var.A;
                } else {
                    i6 = 0;
                }
                if (yn4Var2 != 0) {
                    i7 = yn4Var2.A;
                } else {
                    i7 = 0;
                }
                int i24 = c.A;
                if (yn4Var3 != 0) {
                    i8 = yn4Var3.A;
                } else {
                    i8 = 0;
                }
                if (yn4Var4 != 0) {
                    i9 = yn4Var4.A;
                } else {
                    i9 = 0;
                }
                final int g = nz0.g(Math.max(i24, Math.max(i8, i9)) + i6 + i7, j);
                int i25 = c.B;
                if (yn4Var3 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (yn4Var != null) {
                    i10 = yn4Var.B;
                } else {
                    i10 = 0;
                }
                if (yn4Var2 != 0) {
                    i11 = yn4Var2.B;
                } else {
                    i11 = 0;
                }
                if (yn4Var4 != 0) {
                    i12 = yn4Var4.B;
                } else {
                    i12 = 0;
                }
                final int n = nk2.n(i25, z, max, i10, i11, i12, j, vv3Var.b(), mp6Var.c);
                final yn4 yn4Var5 = yn4Var;
                final int i26 = i4;
                return vv3Var.s0(g, n, qp1.A, new mi2() { // from class: lp6
                    @Override // defpackage.mi2
                    public final Object n(Object obj5) {
                        int i27;
                        int i28;
                        int X;
                        int i29;
                        int i30;
                        mp6 mp6Var2 = mp6Var;
                        boolean z2 = mp6Var2.a;
                        xn4 xn4Var = (xn4) obj5;
                        yn4 yn4Var6 = yn4.this;
                        int i31 = g;
                        int i32 = n;
                        yn4 yn4Var7 = c;
                        yn4 yn4Var8 = yn4Var4;
                        yn4 yn4Var9 = yn4Var5;
                        yn4 yn4Var10 = yn4Var2;
                        vv3 vv3Var2 = vv3Var;
                        int i33 = 0;
                        if (yn4Var6 != null) {
                            int i34 = i22 - i26;
                            if (i34 < 0) {
                                i34 = 0;
                            }
                            int i35 = max + Y3;
                            float f = mp6Var2.b;
                            float b = vv3Var2.b();
                            if (yn4Var9 != null) {
                                xn4.m(xn4Var, yn4Var9, 0, Math.round(((i32 - yn4Var9.B) / 2.0f) * 1.0f));
                            }
                            if (yn4Var10 != null) {
                                xn4.m(xn4Var, yn4Var10, i31 - yn4Var10.A, Math.round(((i32 - yn4Var10.B) / 2.0f) * 1.0f));
                            }
                            if (z2) {
                                X = Math.round(((i32 - yn4Var6.B) / 2.0f) * 1.0f);
                            } else {
                                X = jv3.X(16.0f * b);
                            }
                            int X2 = X - jv3.X((X - i34) * f);
                            if (yn4Var9 != null) {
                                i29 = yn4Var9.A;
                            } else {
                                i29 = 0;
                            }
                            xn4.m(xn4Var, yn4Var6, i29, X2);
                            if (yn4Var9 != null) {
                                i30 = yn4Var9.A;
                            } else {
                                i30 = 0;
                            }
                            xn4.m(xn4Var, yn4Var7, i30, i35);
                            if (yn4Var8 != null) {
                                if (yn4Var9 != null) {
                                    i33 = yn4Var9.A;
                                }
                                xn4.m(xn4Var, yn4Var8, i33, i35);
                            }
                        } else {
                            int X3 = jv3.X(mp6Var2.c.d() * vv3Var2.b());
                            if (yn4Var9 != null) {
                                xn4.m(xn4Var, yn4Var9, 0, Math.round(((i32 - yn4Var9.B) / 2.0f) * 1.0f));
                            }
                            if (yn4Var10 != null) {
                                xn4.m(xn4Var, yn4Var10, i31 - yn4Var10.A, Math.round(((i32 - yn4Var10.B) / 2.0f) * 1.0f));
                            }
                            if (z2) {
                                i27 = Math.round(((i32 - yn4Var7.B) / 2.0f) * 1.0f);
                            } else {
                                i27 = X3;
                            }
                            if (yn4Var9 != null) {
                                i28 = yn4Var9.A;
                            } else {
                                i28 = 0;
                            }
                            xn4.m(xn4Var, yn4Var7, i28, i27);
                            if (yn4Var8 != null) {
                                if (z2) {
                                    X3 = Math.round(((i32 - yn4Var8.B) / 2.0f) * 1.0f);
                                }
                                if (yn4Var9 != null) {
                                    i33 = yn4Var9.A;
                                }
                                xn4.m(xn4Var, yn4Var8, i33, X3);
                            }
                        }
                        return o27.a;
                    }
                });
            }
            Y = i22;
            i21++;
            mp6Var = this;
            list2 = list;
            yn4Var = yn4Var;
        }
        dq3.b("Collection contains no element matching the predicate.");
        f81.c();
        return uv3Var;
    }

    @Override // defpackage.tv3
    public final int g(s43 s43Var, List list, int i) {
        return c(s43Var, list, i, new gu5(13));
    }

    @Override // defpackage.tv3
    public final int i(s43 s43Var, List list, int i) {
        return d(list, i, new gu5(15));
    }
}
