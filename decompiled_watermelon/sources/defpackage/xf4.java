package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xf4  reason: default package */
/* loaded from: classes.dex */
public final class xf4 implements tv3 {
    public final mi2 a;
    public final boolean b;
    public final float c;
    public final ih4 d;

    public xf4(mi2 mi2Var, boolean z, float f, ih4 ih4Var) {
        this.a = mi2Var;
        this.b = z;
        this.c = f;
        this.d = ih4Var;
    }

    @Override // defpackage.tv3
    public final int a(s43 s43Var, List list, int i) {
        return c(s43Var, list, i, new qt0(22));
    }

    @Override // defpackage.tv3
    public final int b(s43 s43Var, List list, int i) {
        return d(s43Var, list, i, new qt0(20));
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
            i5 = ((Number) aj2Var.j(obj5, Integer.valueOf(ep2.z(this.c, i2, i)))).intValue();
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
                return vf4.d(i3, i4, intValue, i5, i6, this.c, nz0.b(0, 0, 0, 0, 15), s43Var.b(), this.d);
            }
        }
        dq3.b("Collection contains no element matching the predicate.");
        f81.c();
        return 0;
    }

    public final int d(s43 s43Var, List list, int i, aj2 aj2Var) {
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
                return vf4.e(i4, i3, intValue, i2, i5, this.c, nz0.b(0, 0, 0, 0, 15), s43Var.b(), this.d);
            }
        }
        dq3.b("Collection contains no element matching the predicate.");
        f81.c();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [yn4] */
    @Override // defpackage.tv3
    public final uv3 f(final vv3 vv3Var, List list, long j) {
        Object obj;
        yn4 yn4Var;
        int i;
        Object obj2;
        yn4 yn4Var2;
        int i2;
        Object obj3;
        final yn4 yn4Var3;
        long j2;
        int i3;
        uv3 uv3Var;
        Object obj4;
        yn4 yn4Var4;
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
        final xf4 xf4Var = this;
        ih4 ih4Var = xf4Var.d;
        int Y = vv3Var.Y(ih4Var.c());
        long a = lz0.a(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                obj = list.get(i14);
                if (b53.x(iq2.p((mv3) obj), "Leading")) {
                    break;
                }
                i14++;
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
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 < size2) {
                obj2 = list.get(i15);
                if (b53.x(iq2.p((mv3) obj2), "Trailing")) {
                    break;
                }
                i15++;
            } else {
                obj2 = null;
                break;
            }
        }
        mv3 mv3Var2 = (mv3) obj2;
        if (mv3Var2 != null) {
            yn4Var2 = mv3Var2.c(nz0.i(a, -i, 0));
        } else {
            yn4Var2 = null;
        }
        if (yn4Var2 != null) {
            i2 = yn4Var2.A;
        } else {
            i2 = 0;
        }
        int Y2 = vv3Var.Y(ih4Var.b(vv3Var.getLayoutDirection())) + vv3Var.Y(ih4Var.a(vv3Var.getLayoutDirection()));
        int i16 = -(i + i2);
        int i17 = -Y;
        long i18 = nz0.i(a, ep2.z(xf4Var.c, i16 - Y2, -Y2), i17);
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 < size3) {
                obj3 = list.get(i19);
                if (b53.x(iq2.p((mv3) obj3), "Label")) {
                    break;
                }
                i19++;
            } else {
                obj3 = null;
                break;
            }
        }
        mv3 mv3Var3 = (mv3) obj3;
        if (mv3Var3 != null) {
            yn4Var3 = mv3Var3.c(i18);
        } else {
            yn4Var3 = null;
        }
        if (yn4Var3 != null) {
            j2 = (Float.floatToRawIntBits(yn4Var3.B) & 4294967295L) | (Float.floatToRawIntBits(yn4Var3.A) << 32);
        } else {
            j2 = 0;
        }
        xf4Var.a.n(new i76(j2));
        if (yn4Var3 != null) {
            i3 = yn4Var3.B;
        } else {
            i3 = 0;
        }
        long j3 = j;
        long a2 = lz0.a(nz0.i(j3, i16, i17 - Math.max(i3 / 2, vv3Var.Y(ih4Var.d()))), 0, 0, 0, 0, 11);
        int size4 = list.size();
        int i20 = 0;
        while (i20 < size4) {
            mv3 mv3Var4 = (mv3) list.get(i20);
            if (b53.x(iq2.p(mv3Var4), "TextField")) {
                yn4 c = mv3Var4.c(a2);
                long a3 = lz0.a(a2, 0, 0, 0, 0, 14);
                int size5 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size5) {
                        obj4 = list.get(i21);
                        uv3Var = null;
                        if (b53.x(iq2.p((mv3) obj4), "Hint")) {
                            break;
                        }
                        i21++;
                    } else {
                        uv3Var = null;
                        obj4 = null;
                        break;
                    }
                }
                mv3 mv3Var5 = (mv3) obj4;
                if (mv3Var5 != null) {
                    yn4Var4 = mv3Var5.c(a3);
                } else {
                    yn4Var4 = uv3Var;
                }
                if (yn4Var != null) {
                    i4 = yn4Var.A;
                } else {
                    i4 = 0;
                }
                if (yn4Var2 != null) {
                    i5 = yn4Var2.A;
                } else {
                    i5 = 0;
                }
                int i22 = c.A;
                if (yn4Var3 != null) {
                    i6 = yn4Var3.A;
                } else {
                    i6 = 0;
                }
                if (yn4Var4 != 0) {
                    i7 = yn4Var4.A;
                } else {
                    i7 = 0;
                }
                final yn4 yn4Var5 = yn4Var2;
                final int e = vf4.e(i4, i5, i22, i6, i7, xf4Var.c, j3, vv3Var.b(), xf4Var.d);
                if (yn4Var != null) {
                    i8 = yn4Var.B;
                } else {
                    i8 = 0;
                }
                if (yn4Var5 != null) {
                    i9 = yn4Var5.B;
                } else {
                    i9 = 0;
                }
                int i23 = c.B;
                if (yn4Var3 != null) {
                    i10 = yn4Var3.B;
                } else {
                    i10 = 0;
                }
                if (yn4Var4 != 0) {
                    i11 = yn4Var4.B;
                } else {
                    i11 = 0;
                }
                int d = vf4.d(i8, i9, i23, i10, i11, xf4Var.c, j, vv3Var.b(), xf4Var.d);
                int size6 = list.size();
                int i24 = 0;
                yn4 yn4Var6 = yn4Var4;
                while (i24 < size6) {
                    mv3 mv3Var6 = (mv3) list.get(i24);
                    if (b53.x(iq2.p(mv3Var6), "border")) {
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
                        final yn4 c2 = mv3Var6.c(nz0.a(i12, e, i13, d));
                        final yn4 yn4Var7 = c;
                        final yn4 yn4Var8 = yn4Var6;
                        final int i25 = d;
                        final yn4 yn4Var9 = yn4Var;
                        return vv3Var.s0(e, i25, qp1.A, new mi2() { // from class: wf4
                            @Override // defpackage.mi2
                            public final Object n(Object obj5) {
                                int i26;
                                int i27;
                                int i28;
                                int i29;
                                int i30;
                                float f;
                                xn4 xn4Var = (xn4) obj5;
                                xf4 xf4Var2 = xf4Var;
                                float f2 = xf4Var2.c;
                                boolean z = xf4Var2.b;
                                vv3 vv3Var2 = vv3Var;
                                float b = vv3Var2.b();
                                sd3 layoutDirection = vv3Var2.getLayoutDirection();
                                ih4 ih4Var2 = xf4Var2.d;
                                int i31 = vf4.b;
                                int X = jv3.X(ih4Var2.d() * b);
                                int X2 = jv3.X(b53.B(ih4Var2, layoutDirection) * b);
                                float f3 = 12.0f * b;
                                int i32 = i25;
                                yn4 yn4Var10 = yn4Var9;
                                int i33 = 0;
                                if (yn4Var10 != null) {
                                    xn4.m(xn4Var, yn4Var10, 0, Math.round(((i32 - yn4Var10.B) / 2.0f) * 1.0f));
                                }
                                yn4 yn4Var11 = yn4Var5;
                                if (yn4Var11 != null) {
                                    xn4.m(xn4Var, yn4Var11, e - yn4Var11.A, Math.round(((i32 - yn4Var11.B) / 2.0f) * 1.0f));
                                }
                                yn4 yn4Var12 = yn4Var3;
                                if (yn4Var12 != null) {
                                    if (z) {
                                        i30 = Math.round(((i32 - yn4Var12.B) / 2.0f) * 1.0f);
                                    } else {
                                        i30 = X;
                                    }
                                    int z2 = ep2.z(f2, i30, -(yn4Var12.B / 2));
                                    if (yn4Var10 == null) {
                                        f = RecyclerView.A1;
                                    } else {
                                        f = (1.0f - f2) * (yn4Var10.A - f3);
                                    }
                                    xn4.m(xn4Var, yn4Var12, jv3.X(f) + X2, z2);
                                }
                                yn4 yn4Var13 = yn4Var7;
                                if (z) {
                                    i26 = Math.round(((i32 - yn4Var13.B) / 2.0f) * 1.0f);
                                } else {
                                    i26 = X;
                                }
                                if (yn4Var12 != null) {
                                    i27 = yn4Var12.B;
                                } else {
                                    i27 = 0;
                                }
                                int max = Math.max(i26, i27 / 2);
                                if (yn4Var10 != null) {
                                    i28 = yn4Var10.A;
                                } else {
                                    i28 = 0;
                                }
                                xn4.m(xn4Var, yn4Var13, i28, max);
                                yn4 yn4Var14 = yn4Var8;
                                if (yn4Var14 != null) {
                                    if (z) {
                                        X = Math.round(((i32 - yn4Var14.B) / 2.0f) * 1.0f);
                                    }
                                    if (yn4Var12 != null) {
                                        i29 = yn4Var12.B;
                                    } else {
                                        i29 = 0;
                                    }
                                    int max2 = Math.max(X, i29 / 2);
                                    if (yn4Var10 != null) {
                                        i33 = yn4Var10.A;
                                    }
                                    xn4.m(xn4Var, yn4Var14, i33, max2);
                                }
                                xn4.l(xn4Var, c2, 0L);
                                return o27.a;
                            }
                        });
                    }
                    yn4 yn4Var10 = c;
                    i24++;
                    d = d;
                    yn4Var6 = yn4Var6;
                    c = yn4Var10;
                    yn4Var = yn4Var;
                    xf4Var = this;
                }
                dq3.b("Collection contains no element matching the predicate.");
                f81.c();
                return uv3Var;
            }
            i20++;
            xf4Var = this;
            j3 = j;
        }
        dq3.b("Collection contains no element matching the predicate.");
        f81.c();
        return null;
    }

    @Override // defpackage.tv3
    public final int g(s43 s43Var, List list, int i) {
        return c(s43Var, list, i, new qt0(19));
    }

    @Override // defpackage.tv3
    public final int i(s43 s43Var, List list, int i) {
        return d(s43Var, list, i, new qt0(21));
    }
}
