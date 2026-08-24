package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc  reason: default package */
/* loaded from: classes.dex */
public final class fc implements e34 {
    public static final fc b = new fc(0);
    public static final fc c = new fc(1);
    public static final fc d = new fc(2);
    public static final fc e = new fc(3);
    public static final fc f = new fc(4);
    public static final fc g = new fc(5);
    public static final fc h = new fc(6);
    public static final bz1 i = new bz1(22);
    public static final fc j = new fc(7);
    public static final fc k = new fc(8);
    public static final fc l = new fc(9);
    public static final fc m = new fc(10);
    public final /* synthetic */ int a;

    public /* synthetic */ fc(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0414  */
    @Override // defpackage.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f34 d(g34 g34Var, List list, long j2) {
        Object obj;
        final dx4 dx4Var;
        Object obj2;
        final dx4 dx4Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int k0;
        int i7;
        int i8;
        final int i9;
        int i10;
        int i11;
        int i12;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        boolean z;
        float f2;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        int r0;
        int max;
        int i15;
        int i16 = this.a;
        zt1 zt1Var = zt1.A;
        switch (i16) {
            case 0:
                int size = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size) {
                        obj = list.get(i17);
                        if (!nb3.k(lb4.u((x24) obj), "title")) {
                            i17++;
                        }
                    } else {
                        obj = null;
                    }
                }
                x24 x24Var = (x24) obj;
                if (x24Var != null) {
                    dx4Var = x24Var.y(q21.a(j2, 0, 0, 0, 0, 11));
                } else {
                    dx4Var = null;
                }
                int size2 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size2) {
                        obj2 = list.get(i18);
                        if (!nb3.k(lb4.u((x24) obj2), "text")) {
                            i18++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                x24 x24Var2 = (x24) obj2;
                if (x24Var2 != null) {
                    dx4Var2 = x24Var2.y(q21.a(j2, 0, 0, 0, 0, 11));
                } else {
                    dx4Var2 = null;
                }
                if (dx4Var != null) {
                    i2 = dx4Var.A;
                } else {
                    i2 = 0;
                }
                if (dx4Var2 != null) {
                    i3 = dx4Var2.A;
                } else {
                    i3 = 0;
                }
                int max2 = Math.max(i2, i3);
                if (dx4Var != null) {
                    int X = dx4Var.X(lc.a);
                    if (X == Integer.MIN_VALUE) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(X);
                    }
                    if (valueOf3 != null) {
                        i4 = valueOf3.intValue();
                        if (dx4Var != null) {
                            int X2 = dx4Var.X(lc.b);
                            if (X2 == Integer.MIN_VALUE) {
                                valueOf2 = null;
                            } else {
                                valueOf2 = Integer.valueOf(X2);
                            }
                            if (valueOf2 != null) {
                                i5 = valueOf2.intValue();
                                final int k02 = g34Var.k0(hc.c) - i4;
                                if (dx4Var2 != null) {
                                    int X3 = dx4Var2.X(lc.a);
                                    if (X3 == Integer.MIN_VALUE) {
                                        valueOf = null;
                                    } else {
                                        valueOf = Integer.valueOf(X3);
                                    }
                                    if (valueOf != null) {
                                        i6 = valueOf.intValue();
                                        if (dx4Var != null) {
                                            k0 = g34Var.k0(hc.e);
                                        } else {
                                            k0 = g34Var.k0(hc.d);
                                        }
                                        if (dx4Var == null) {
                                            i7 = dx4Var.B + k02;
                                        } else {
                                            i7 = 0;
                                        }
                                        if (dx4Var != null) {
                                            i9 = k0 - i6;
                                        } else {
                                            if (i5 == 0) {
                                                i8 = i7 - i6;
                                            } else {
                                                i8 = (k02 + i5) - i6;
                                            }
                                            i9 = i8 + k0;
                                        }
                                        if (dx4Var2 == null) {
                                            int i19 = dx4Var2.B;
                                            if (i5 == 0) {
                                                i12 = (i19 + k0) - i6;
                                            } else {
                                                int i20 = (i19 + k0) - i6;
                                                if (dx4Var != null) {
                                                    i11 = dx4Var.B;
                                                } else {
                                                    i11 = 0;
                                                }
                                                i12 = i20 - (i11 - i5);
                                            }
                                            i10 = i12;
                                        } else {
                                            i10 = 0;
                                        }
                                        return g34Var.K(max2, i7 + i10, zt1Var, new qn2() { // from class: ec
                                            @Override // defpackage.qn2
                                            public final Object g(Object obj3) {
                                                cx4 cx4Var = (cx4) obj3;
                                                dx4 dx4Var3 = dx4.this;
                                                if (dx4Var3 != null) {
                                                    cx4.j(cx4Var, dx4Var3, 0, k02);
                                                }
                                                dx4 dx4Var4 = dx4Var2;
                                                if (dx4Var4 != null) {
                                                    cx4.j(cx4Var, dx4Var4, 0, i9);
                                                }
                                                return jg7.a;
                                            }
                                        });
                                    }
                                }
                                i6 = 0;
                                if (dx4Var != null) {
                                }
                                if (dx4Var == null) {
                                }
                                if (dx4Var != null) {
                                }
                                if (dx4Var2 == null) {
                                }
                                return g34Var.K(max2, i7 + i10, zt1Var, new qn2() { // from class: ec
                                    @Override // defpackage.qn2
                                    public final Object g(Object obj3) {
                                        cx4 cx4Var = (cx4) obj3;
                                        dx4 dx4Var3 = dx4.this;
                                        if (dx4Var3 != null) {
                                            cx4.j(cx4Var, dx4Var3, 0, k02);
                                        }
                                        dx4 dx4Var4 = dx4Var2;
                                        if (dx4Var4 != null) {
                                            cx4.j(cx4Var, dx4Var4, 0, i9);
                                        }
                                        return jg7.a;
                                    }
                                });
                            }
                        }
                        i5 = 0;
                        final int k022 = g34Var.k0(hc.c) - i4;
                        if (dx4Var2 != null) {
                        }
                        i6 = 0;
                        if (dx4Var != null) {
                        }
                        if (dx4Var == null) {
                        }
                        if (dx4Var != null) {
                        }
                        if (dx4Var2 == null) {
                        }
                        return g34Var.K(max2, i7 + i10, zt1Var, new qn2() { // from class: ec
                            @Override // defpackage.qn2
                            public final Object g(Object obj3) {
                                cx4 cx4Var = (cx4) obj3;
                                dx4 dx4Var3 = dx4.this;
                                if (dx4Var3 != null) {
                                    cx4.j(cx4Var, dx4Var3, 0, k022);
                                }
                                dx4 dx4Var4 = dx4Var2;
                                if (dx4Var4 != null) {
                                    cx4.j(cx4Var, dx4Var4, 0, i9);
                                }
                                return jg7.a;
                            }
                        });
                    }
                }
                i4 = 0;
                if (dx4Var != null) {
                }
                i5 = 0;
                final int k0222 = g34Var.k0(hc.c) - i4;
                if (dx4Var2 != null) {
                }
                i6 = 0;
                if (dx4Var != null) {
                }
                if (dx4Var == null) {
                }
                if (dx4Var != null) {
                }
                if (dx4Var2 == null) {
                }
                return g34Var.K(max2, i7 + i10, zt1Var, new qn2() { // from class: ec
                    @Override // defpackage.qn2
                    public final Object g(Object obj3) {
                        cx4 cx4Var = (cx4) obj3;
                        dx4 dx4Var3 = dx4.this;
                        if (dx4Var3 != null) {
                            cx4.j(cx4Var, dx4Var3, 0, k0222);
                        }
                        dx4 dx4Var4 = dx4Var2;
                        if (dx4Var4 != null) {
                            cx4.j(cx4Var, dx4Var4, 0, i9);
                        }
                        return jg7.a;
                    }
                });
            case 1:
                ArrayList arrayList = new ArrayList(list.size());
                int size3 = list.size();
                int i21 = 0;
                int i22 = 0;
                for (int i23 = 0; i23 < size3; i23++) {
                    dx4 y = ((x24) list.get(i23)).y(j2);
                    i21 = Math.max(i21, y.A);
                    i22 = Math.max(i22, y.B);
                    arrayList.add(y);
                }
                if (list.isEmpty()) {
                    i21 = q21.j(j2);
                    i22 = q21.i(j2);
                }
                return g34Var.K(i21, i22, zt1Var, new kg(0, arrayList));
            case 2:
                int size4 = list.size();
                if (size4 != 0) {
                    if (size4 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size5 = list.size();
                        int i24 = 0;
                        int i25 = 0;
                        for (int i26 = 0; i26 < size5; i26++) {
                            dx4 y2 = ((x24) list.get(i26)).y(j2);
                            i24 = Math.max(i24, y2.A);
                            i25 = Math.max(i25, y2.B);
                            arrayList2.add(y2);
                        }
                        return g34Var.K(i24, i25, zt1Var, new kg(1, arrayList2));
                    }
                    dx4 y3 = ((x24) list.get(0)).y(j2);
                    return g34Var.K(y3.A, y3.B, zt1Var, new he(y3, 1));
                }
                return g34Var.K(0, 0, zt1Var, ne.g0);
            case 3:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size6 = list.size();
                for (int i27 = 0; i27 < size6; i27++) {
                    arrayList3.add(((x24) list.get(i27)).y(j2));
                }
                return g34Var.K(q21.h(j2), q21.g(j2), zt1Var, new ip(0, arrayList3));
            case 4:
                return g34Var.K(q21.j(j2), q21.i(j2), zt1Var, new bz1(22));
            case 5:
                return g34Var.K(q21.j(j2), q21.i(j2), zt1Var, new bz1(22));
            case 6:
                return g34Var.K(q21.h(j2), q21.g(j2), zt1Var, i);
            case 7:
                return g34Var.K(q21.j(j2), q21.i(j2), zt1Var, new bz1(22));
            case 8:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size7 = list.size();
                int i28 = 0;
                int i29 = 0;
                for (int i30 = 0; i30 < size7; i30++) {
                    dx4 y4 = ((x24) list.get(i30)).y(j2);
                    i28 = Math.max(i28, y4.A);
                    i29 = Math.max(i29, y4.B);
                    arrayList4.add(y4);
                }
                return g34Var.K(i28, i29, zt1Var, new ip(3, arrayList4));
            case 9:
                ArrayList arrayList5 = new ArrayList(list.size());
                int size8 = list.size();
                int i31 = Integer.MIN_VALUE;
                int i32 = Integer.MIN_VALUE;
                int i33 = 0;
                for (int i34 = 0; i34 < size8; i34++) {
                    dx4 y5 = ((x24) list.get(i34)).y(j2);
                    arrayList5.add(y5);
                    ey2 ey2Var = lc.a;
                    if (y5.X(ey2Var) != Integer.MIN_VALUE && (i31 == Integer.MIN_VALUE || y5.X(ey2Var) < i31)) {
                        i31 = y5.X(ey2Var);
                    }
                    ey2 ey2Var2 = lc.b;
                    if (y5.X(ey2Var2) != Integer.MIN_VALUE && (i32 == Integer.MIN_VALUE || y5.X(ey2Var2) > i32)) {
                        i32 = y5.X(ey2Var2);
                    }
                    i33 = Math.max(i33, y5.B);
                }
                if (i31 != Integer.MIN_VALUE && i32 != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (i31 != i32 && z) {
                    f2 = 68.0f;
                } else {
                    f2 = 48.0f;
                }
                int max3 = Math.max(g34Var.r0(f2), i33);
                return g34Var.K(q21.h(j2), max3, zt1Var, new fp3(arrayList5, max3, 2));
            case 10:
                if (q21.f(j2)) {
                    i13 = q21.h(j2);
                } else {
                    i13 = 0;
                }
                if (q21.e(j2)) {
                    i14 = q21.g(j2);
                } else {
                    i14 = 0;
                }
                return g34Var.K(i13, i14, zt1Var, new bz1(22));
            default:
                int size9 = list.size();
                int i35 = 0;
                while (true) {
                    if (i35 < size9) {
                        x24 x24Var3 = (x24) list.get(i35);
                        if (nb3.k(lb4.u(x24Var3), "action")) {
                            final dx4 y6 = x24Var3.y(j2);
                            int h2 = (q21.h(j2) - y6.A) - g34Var.r0(8.0f);
                            int j3 = q21.j(j2);
                            if (h2 < j3) {
                                h2 = j3;
                            }
                            int size10 = list.size();
                            for (int i36 = 0; i36 < size10; i36++) {
                                x24 x24Var4 = (x24) list.get(i36);
                                if (nb3.k(lb4.u(x24Var4), "text")) {
                                    final dx4 y7 = x24Var4.y(q21.a(j2, 0, h2, 0, 0, 9));
                                    ey2 ey2Var3 = lc.a;
                                    int X4 = y7.X(ey2Var3);
                                    int X5 = y7.X(lc.b);
                                    if (X4 != Integer.MIN_VALUE && X5 != Integer.MIN_VALUE) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (X4 != X5 && z2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    final int h3 = q21.h(j2) - y6.A;
                                    if (z3) {
                                        max = Math.max(g34Var.r0(48.0f), y6.B);
                                        r0 = (max - y7.B) / 2;
                                        int X6 = y6.X(ey2Var3);
                                        if (X6 != Integer.MIN_VALUE) {
                                            i15 = (X4 + r0) - X6;
                                        } else {
                                            i15 = 0;
                                        }
                                    } else {
                                        r0 = g34Var.r0(30.0f) - X4;
                                        max = Math.max(g34Var.r0(68.0f), y7.B + r0);
                                        i15 = (max - y6.B) / 2;
                                    }
                                    final int i37 = r0;
                                    final int i38 = i15;
                                    return g34Var.K(q21.h(j2), max, zt1Var, new qn2() { // from class: jl6
                                        @Override // defpackage.qn2
                                        public final Object g(Object obj3) {
                                            cx4 cx4Var = (cx4) obj3;
                                            cx4.l(cx4Var, dx4.this, 0, i37);
                                            cx4.l(cx4Var, y6, h3, i38);
                                            return jg7.a;
                                        }
                                    });
                                }
                            }
                            ex3.b("Collection contains no element matching the predicate.");
                            e41.c();
                        } else {
                            i35++;
                        }
                    } else {
                        ex3.b("Collection contains no element matching the predicate.");
                        e41.c();
                    }
                }
                return null;
        }
    }
}
