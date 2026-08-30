package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yh4  reason: default package */
/* loaded from: classes.dex */
public final class yh4 implements fj3 {
    public final /* synthetic */ ya1 a;
    public final /* synthetic */ jf4 b;
    public final /* synthetic */ ih4 c;
    public final /* synthetic */ k45 d;
    public final /* synthetic */ ki2 e;
    public final /* synthetic */ ki2 f;
    public final /* synthetic */ i20 g;
    public final /* synthetic */ sn1 h;
    public final /* synthetic */ o31 i;

    public yh4(ya1 ya1Var, jf4 jf4Var, ih4 ih4Var, k45 k45Var, sh3 sh3Var, ki2 ki2Var, i20 i20Var, sn1 sn1Var, o31 o31Var) {
        this.a = ya1Var;
        this.b = jf4Var;
        this.c = ih4Var;
        this.d = k45Var;
        this.e = sh3Var;
        this.f = ki2Var;
        this.g = i20Var;
        this.h = sn1Var;
        this.i = o31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v37 */
    @Override // defpackage.fj3
    public final uv3 a(gj3 gj3Var, long j) {
        boolean z;
        jf4 jf4Var;
        int Y;
        int Y2;
        int i;
        int h;
        int i2;
        int i3;
        int i4;
        mi2 mi2Var;
        int i5;
        int i6;
        int i7;
        xh4 xh4Var;
        int i8;
        int i9;
        int i10;
        i20 i20Var;
        ya1 ya1Var;
        int i11;
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
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        xv3 xv3Var;
        xt xtVar;
        int i27;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i28;
        List list;
        int i29;
        int i30;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        long j2;
        int i37;
        xt xtVar2;
        int i38;
        zh6 zh6Var;
        ArrayList arrayList5;
        jf4 jf4Var2;
        int i39;
        int i40;
        int i41;
        ArrayList arrayList6;
        ?? arrayList7;
        ?? arrayList8;
        Object obj;
        int i42;
        boolean z2;
        float l;
        boolean z3;
        zh4 zh4Var;
        zh6 zh6Var2;
        gj3 gj3Var2;
        int[] iArr;
        int i43;
        int i44;
        int i45;
        int i46;
        jf4 jf4Var3;
        i20 i20Var2;
        long j3;
        ArrayList arrayList9;
        List list2;
        int i47;
        ArrayList arrayList10;
        int i48;
        int i49;
        yh4 yh4Var = this;
        zh6 zh6Var3 = gj3Var.B;
        ya1 ya1Var2 = yh4Var.a;
        ya1Var2.A.getValue();
        jf4 jf4Var4 = jf4.Vertical;
        jf4 jf4Var5 = yh4Var.b;
        if (jf4Var5 == jf4Var4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jf4Var = jf4Var4;
        } else {
            jf4Var = jf4.Horizontal;
        }
        n40.D(j, jf4Var);
        ih4 ih4Var = yh4Var.c;
        if (z) {
            Y = zh6Var3.Y(ih4Var.a(zh6Var3.getLayoutDirection()));
        } else {
            Y = zh6Var3.Y(b53.B(ih4Var, zh6Var3.getLayoutDirection()));
        }
        if (z) {
            Y2 = zh6Var3.Y(ih4Var.b(zh6Var3.getLayoutDirection()));
        } else {
            Y2 = zh6Var3.Y(b53.A(ih4Var, zh6Var3.getLayoutDirection()));
        }
        int Y3 = zh6Var3.Y(ih4Var.d());
        int Y4 = zh6Var3.Y(ih4Var.c()) + Y3;
        int i50 = Y + Y2;
        if (z) {
            i = Y4;
        } else {
            i = i50;
        }
        if (z) {
            Y2 = Y3;
        } else if (!z) {
            Y2 = Y;
        }
        int i51 = i - Y2;
        long i52 = nz0.i(j, -i50, -Y4);
        ya1Var2.n = gj3Var;
        int Y5 = zh6Var3.Y(RecyclerView.A1);
        if (z) {
            h = lz0.g(j) - Y4;
        } else {
            h = lz0.h(j) - i50;
        }
        long j4 = (Y << 32) | (Y3 & 4294967295L);
        yh4Var.d.getClass();
        if (h < 0) {
            i2 = 0;
        } else {
            i2 = h;
        }
        if (jf4Var5 == jf4Var4) {
            i3 = lz0.h(i52);
        } else {
            i3 = i2;
        }
        if (jf4Var5 != jf4Var4) {
            i4 = lz0.g(i52);
        } else {
            i4 = i2;
        }
        long j5 = j4;
        nz0.b(0, i3, 0, i4, 5);
        xh4 xh4Var2 = (xh4) yh4Var.e.c();
        sn1 sn1Var = yh4Var.h;
        ga6 z4 = io2.z();
        if (z4 != null) {
            mi2Var = z4.e();
        } else {
            mi2Var = null;
        }
        ga6 Y6 = io2.Y(z4);
        try {
            int k = ya1Var2.k();
            ya1 ya1Var3 = ya1Var2;
            int i53 = h;
            bi4 bi4Var = ya1Var3.d;
            int J = gk2.J(k, xh4Var2, bi4Var.e);
            if (k != J) {
                i5 = i2;
                bi4Var.b.i(J);
                bi4Var.f.b(k);
            } else {
                i5 = i2;
            }
            ya1Var3.k();
            float l2 = ya1Var3.l();
            ya1Var3.n();
            sn1Var.getClass();
            int i54 = i5 + Y5;
            int X = jv3.X(RecyclerView.A1 - (l2 * i54));
            io2.l0(z4, Y6, mi2Var);
            List u = cg2.u(xh4Var2, ya1Var3.y, ya1Var3.u);
            j14 j14Var = z23.a;
            j14 j14Var2 = new j14();
            int intValue = ((Number) yh4Var.f.c()).intValue();
            k24 k24Var = ya1Var3.z;
            if (Y2 < 0) {
                pz2.a("negative beforeContentPadding");
            }
            if (i51 < 0) {
                pz2.a("negative afterContentPadding");
            }
            List list3 = u;
            if (i54 < 0) {
                i6 = 0;
            } else {
                i6 = i54;
            }
            int i55 = i6;
            int i56 = intValue;
            if (intValue < 0) {
                i7 = i56;
            } else {
                i7 = 0;
            }
            jf4 jf4Var6 = yh4Var.b;
            if (jf4Var6 == jf4Var4) {
                xh4Var = xh4Var2;
                i8 = lz0.h(i52);
            } else {
                xh4Var = xh4Var2;
                i8 = i5;
            }
            if (jf4Var6 != jf4Var4) {
                i9 = lz0.g(i52);
            } else {
                i9 = i5;
            }
            int i57 = X;
            long b = nz0.b(0, i8, 0, i9, 5);
            qp1 qp1Var = qp1.A;
            sn1 sn1Var2 = yh4Var.h;
            o31 o31Var = yh4Var.i;
            if (i56 <= 0) {
                zh4Var = new zh4(i5, Y5, i51, jf4Var6, -Y2, i53 + i51, i7, sn1Var2, zh6Var3.s0(nz0.g(lz0.j(i52) + i50, j), nz0.f(lz0.i(i52) + Y4, j), qp1Var, new qu1(11)), o31Var, gj3Var, b);
                gj3Var2 = gj3Var;
                zh6Var2 = zh6Var3;
                ya1Var = ya1Var3;
            } else {
                qp1 qp1Var2 = qp1Var;
                long j6 = b;
                jf4 jf4Var7 = jf4Var6;
                int i58 = 0;
                int i59 = J;
                while (i59 > 0 && i57 > 0) {
                    i59--;
                    i57 -= i55;
                }
                int i60 = i57 * (-1);
                if (i59 >= i56) {
                    i59 = i56 - 1;
                    i60 = 0;
                }
                xt xtVar3 = new xt();
                int i61 = -Y2;
                if (Y5 < 0) {
                    i10 = Y5;
                } else {
                    i10 = 0;
                }
                int i62 = i61 + i10;
                int i63 = i60 + i62;
                int i64 = 0;
                while (true) {
                    i20Var = yh4Var.g;
                    if (i63 >= 0 || i59 <= 0) {
                        break;
                    }
                    i59--;
                    qp1 qp1Var3 = qp1Var2;
                    ya1 ya1Var4 = ya1Var3;
                    int i65 = i50;
                    int i66 = i58;
                    long j7 = j5;
                    xh4 xh4Var3 = xh4Var;
                    j14 j14Var3 = j14Var2;
                    int i67 = i5;
                    xv3 y = io2.y(gj3Var, i59, j6, xh4Var3, j7, jf4Var7, i20Var, zh6Var3.getLayoutDirection(), i67, j14Var3);
                    j14Var2 = j14Var3;
                    xtVar3.add(i66, y);
                    i64 = Math.max(i64, y.h);
                    i63 += i55;
                    xh4Var = xh4Var3;
                    j5 = j7;
                    j6 = j6;
                    i5 = i67;
                    i50 = i65;
                    Y2 = Y2;
                    i7 = i7;
                    qp1Var2 = qp1Var3;
                    ya1Var3 = ya1Var4;
                    jf4Var7 = jf4Var7;
                    i56 = i56;
                    i58 = i66;
                    yh4Var = this;
                }
                qp1 qp1Var4 = qp1Var2;
                ya1Var = ya1Var3;
                int i68 = i7;
                int i69 = Y2;
                int i70 = i50;
                int i71 = i58;
                long j8 = j5;
                int i72 = i5;
                int i73 = i56;
                jf4 jf4Var8 = jf4Var7;
                long j9 = j6;
                xh4 xh4Var4 = xh4Var;
                if (i63 < i62) {
                    i63 = i62;
                }
                int i74 = i63 - i62;
                int i75 = i53 + i51;
                if (i75 < 0) {
                    i11 = i71;
                } else {
                    i11 = i75;
                }
                int i76 = -i74;
                jf4 jf4Var9 = jf4Var8;
                int i77 = i59;
                int i78 = i77;
                int i79 = 0;
                boolean z5 = false;
                while (i79 < xtVar3.L) {
                    if (i76 >= i11) {
                        xtVar3.c(i79);
                        z5 = true;
                    } else {
                        i77++;
                        i76 += i55;
                        i79++;
                    }
                }
                int i80 = i76;
                int i81 = i64;
                int i82 = i74;
                int i83 = i73;
                int i84 = i77;
                boolean z6 = z5;
                while (true) {
                    if (i84 < i83) {
                        if (i80 < i11 || i80 <= 0 || xtVar3.isEmpty()) {
                            int i85 = i11;
                            long j10 = j9;
                            int i86 = i83;
                            i20 i20Var3 = i20Var;
                            sd3 layoutDirection = zh6Var3.getLayoutDirection();
                            jf4 jf4Var10 = jf4Var9;
                            int i87 = i82;
                            int i88 = i53;
                            int i89 = i81;
                            int i90 = i80;
                            xv3 y2 = io2.y(gj3Var, i84, j10, xh4Var4, j8, jf4Var10, i20Var3, layoutDirection, i72, j14Var2);
                            int i91 = i84;
                            int i92 = i86 - 1;
                            if (i91 == i92) {
                                i48 = i72;
                            } else {
                                i48 = i55;
                            }
                            i80 = i90 + i48;
                            if (i80 <= i62 && i91 != i92) {
                                i49 = i87 - i55;
                                i78 = i91 + 1;
                                z6 = true;
                            } else {
                                int max = Math.max(i89, y2.h);
                                xtVar3.addLast(y2);
                                i49 = i87;
                                i89 = max;
                            }
                            i84 = i91 + 1;
                            i81 = i89;
                            i53 = i88;
                            i82 = i49;
                            i20Var = i20Var3;
                            jf4Var9 = jf4Var10;
                            j9 = j10;
                            i83 = i86;
                            i11 = i85;
                        } else {
                            i12 = i53;
                            break;
                        }
                    } else {
                        i12 = i53;
                        break;
                    }
                }
                int i93 = i83;
                long j11 = j9;
                i20 i20Var4 = i20Var;
                int i94 = i82;
                jf4 jf4Var11 = jf4Var9;
                int i95 = i81;
                int i96 = i84;
                if (i80 < i12) {
                    int i97 = i12 - i80;
                    int i98 = i80 + i97;
                    int i99 = i94 - i97;
                    int i100 = i69;
                    while (i99 < i100 && i78 > 0) {
                        i78--;
                        int i101 = i100;
                        xv3 y3 = io2.y(gj3Var, i78, j11, xh4Var4, j8, jf4Var11, i20Var4, zh6Var3.getLayoutDirection(), i72, j14Var2);
                        xtVar3.add(0, y3);
                        i95 = Math.max(i95, y3.h);
                        i100 = i101;
                        i99 += i55;
                        i96 = i96;
                        i98 = i98;
                    }
                    int i102 = i99;
                    i14 = i100;
                    int i103 = i98;
                    i15 = i96;
                    if (i102 < 0) {
                        i13 = i103 + i102;
                        i16 = 0;
                    } else {
                        i16 = i102;
                        i13 = i103;
                    }
                } else {
                    i13 = i80;
                    i14 = i69;
                    i15 = i96;
                    i16 = i94;
                }
                if (i16 < 0) {
                    pz2.a("invalid currentFirstPageScrollOffset");
                }
                int i104 = -i16;
                xv3 xv3Var2 = (xv3) xtVar3.first();
                int i105 = i95;
                int i106 = Y5;
                if (i14 > 0 || i106 < 0) {
                    int i107 = i16;
                    int b2 = xtVar3.b();
                    xv3 xv3Var3 = xv3Var2;
                    int i108 = i107;
                    i17 = i104;
                    int i109 = 0;
                    while (i109 < b2 && i108 != 0) {
                        i18 = i15;
                        int i110 = i55;
                        if (i110 <= i108) {
                            i19 = i110;
                            i20 = 1;
                            if (i109 == xtVar3.b() - 1) {
                                break;
                            }
                            i108 -= i19;
                            i109++;
                            xv3Var3 = (xv3) xtVar3.get(i109);
                            i15 = i18;
                            i55 = i19;
                        } else {
                            i19 = i110;
                            break;
                        }
                    }
                    i18 = i15;
                    i19 = i55;
                    i20 = 1;
                    i21 = i108;
                    xv3Var2 = xv3Var3;
                } else {
                    i17 = i104;
                    i18 = i15;
                    i19 = i55;
                    i20 = 1;
                    i21 = i16;
                }
                int max2 = Math.max(0, i78 - i68);
                int i111 = i78 - 1;
                if (max2 <= i111) {
                    int i112 = i111;
                    ArrayList arrayList11 = null;
                    while (true) {
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                        }
                        xv3 xv3Var4 = xv3Var2;
                        sd3 layoutDirection2 = zh6Var3.getLayoutDirection();
                        i22 = i12;
                        i23 = i21;
                        i24 = i106;
                        xv3Var = xv3Var4;
                        i26 = i68;
                        arrayList10 = arrayList11;
                        int i113 = i112;
                        i25 = i13;
                        xtVar = xtVar3;
                        i27 = max2;
                        arrayList10.add(io2.y(gj3Var, i113, j11, xh4Var4, j8, jf4Var11, i20Var4, layoutDirection2, i72, j14Var2));
                        if (i113 == i27) {
                            break;
                        }
                        i112 = i113 - 1;
                        max2 = i27;
                        xtVar3 = xtVar;
                        i13 = i25;
                        arrayList11 = arrayList10;
                        xv3Var2 = xv3Var;
                        i68 = i26;
                        i21 = i23;
                        i106 = i24;
                        i12 = i22;
                    }
                    arrayList = arrayList10;
                } else {
                    i22 = i12;
                    i23 = i21;
                    i24 = i106;
                    i25 = i13;
                    i26 = i68;
                    xv3Var = xv3Var2;
                    xtVar = xtVar3;
                    i27 = max2;
                    arrayList = null;
                }
                int size = list3.size();
                int i114 = 0;
                while (i114 < size) {
                    List list4 = list3;
                    int i115 = i114;
                    int intValue2 = ((Number) list4.get(i114)).intValue();
                    if (intValue2 < i27) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        list2 = list4;
                        i47 = size;
                        ArrayList arrayList12 = arrayList;
                        arrayList12.add(io2.y(gj3Var, intValue2, j11, xh4Var4, j8, jf4Var11, i20Var4, zh6Var3.getLayoutDirection(), i72, j14Var2));
                        arrayList = arrayList12;
                    } else {
                        list2 = list4;
                        i47 = size;
                    }
                    i114 = i115 + 1;
                    size = i47;
                    list3 = list2;
                }
                List list5 = list3;
                List list6 = pp1.A;
                if (arrayList == null) {
                    arrayList2 = list6;
                } else {
                    arrayList2 = arrayList;
                }
                int i116 = i105;
                int i117 = 0;
                for (int size2 = arrayList2.size(); i117 < size2; size2 = size2) {
                    i116 = Math.max(i116, ((xv3) arrayList2.get(i117)).h);
                    i117++;
                }
                int i118 = ((xv3) xtVar.last()).a;
                int min = Math.min(i26, (i93 - i118) - 1) + i118;
                int i119 = i118 + 1;
                if (i119 <= min) {
                    ArrayList arrayList13 = null;
                    while (true) {
                        if (arrayList13 == null) {
                            arrayList13 = new ArrayList();
                        }
                        list = list6;
                        arrayList9 = arrayList13;
                        i28 = i116;
                        sd3 layoutDirection3 = zh6Var3.getLayoutDirection();
                        i29 = i26;
                        i30 = min;
                        int i120 = i119;
                        arrayList9.add(io2.y(gj3Var, i120, j11, xh4Var4, j8, jf4Var11, i20Var4, layoutDirection3, i72, j14Var2));
                        if (i120 == i30) {
                            break;
                        }
                        i119 = i120 + 1;
                        min = i30;
                        i116 = i28;
                        i26 = i29;
                        arrayList13 = arrayList9;
                        list6 = list;
                    }
                    arrayList3 = arrayList9;
                } else {
                    i28 = i116;
                    list = list6;
                    i29 = i26;
                    i30 = min;
                    arrayList3 = null;
                }
                int size3 = list5.size();
                int i121 = 0;
                while (i121 < size3) {
                    List list7 = list5;
                    int i122 = i121;
                    int intValue3 = ((Number) list7.get(i121)).intValue();
                    ArrayList arrayList14 = arrayList3;
                    if (i30 + 1 <= intValue3) {
                        int i123 = i93;
                        if (intValue3 < i123) {
                            if (arrayList14 == null) {
                                arrayList14 = new ArrayList();
                            }
                            i46 = size3;
                            ArrayList arrayList15 = arrayList14;
                            sd3 layoutDirection4 = zh6Var3.getLayoutDirection();
                            i43 = i30;
                            i45 = i122;
                            i44 = i123;
                            list5 = list7;
                            xv3 y4 = io2.y(gj3Var, intValue3, j11, xh4Var4, j8, jf4Var11, i20Var4, layoutDirection4, i72, j14Var2);
                            jf4Var3 = jf4Var11;
                            long j12 = j11;
                            i20Var2 = i20Var4;
                            j3 = j12;
                            arrayList15.add(y4);
                            arrayList3 = arrayList15;
                            i121 = i45 + 1;
                            size3 = i46;
                            i93 = i44;
                            i30 = i43;
                            i20Var4 = i20Var2;
                            j11 = j3;
                            jf4Var11 = jf4Var3;
                        } else {
                            i43 = i30;
                            i44 = i123;
                            i46 = size3;
                            i45 = i122;
                            list5 = list7;
                        }
                    } else {
                        i43 = i30;
                        i44 = i93;
                        i45 = i122;
                        list5 = list7;
                        i46 = size3;
                    }
                    jf4Var3 = jf4Var11;
                    long j13 = j11;
                    i20Var2 = i20Var4;
                    j3 = j13;
                    arrayList3 = arrayList14;
                    i121 = i45 + 1;
                    size3 = i46;
                    i93 = i44;
                    i30 = i43;
                    i20Var4 = i20Var2;
                    j11 = j3;
                    jf4Var11 = jf4Var3;
                }
                ArrayList arrayList16 = arrayList3;
                jf4 jf4Var12 = jf4Var11;
                int i124 = i93;
                long j14 = j11;
                if (arrayList16 == null) {
                    arrayList4 = list;
                } else {
                    arrayList4 = arrayList16;
                }
                int size4 = arrayList4.size();
                int i125 = i28;
                for (int i126 = 0; i126 < size4; i126++) {
                    i125 = Math.max(i125, ((xv3) arrayList4.get(i126)).h);
                }
                if (b53.x(xv3Var, xtVar.first()) && arrayList2.isEmpty() && arrayList4.isEmpty()) {
                    i31 = i20;
                } else {
                    i31 = 0;
                }
                jf4 jf4Var13 = jf4.Vertical;
                if (jf4Var12 == jf4Var13) {
                    i32 = i125;
                } else {
                    i32 = i25;
                }
                int g = nz0.g(i32, i52);
                if (jf4Var12 == jf4Var13) {
                    i125 = i25;
                }
                int f = nz0.f(i125, i52);
                if (jf4Var12 != jf4Var13) {
                    f = g;
                }
                int i127 = i22;
                int i128 = i25;
                if (i128 < Math.min(f, i127)) {
                    i33 = i20;
                } else {
                    i33 = 0;
                }
                if (i33 != 0 && i17 != 0) {
                    i34 = i127;
                    i35 = f;
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i36 = i17;
                    sb.append(i36);
                    pz2.c(sb.toString());
                } else {
                    i34 = i127;
                    i35 = f;
                    i36 = i17;
                }
                int i129 = i36;
                ArrayList arrayList17 = new ArrayList(arrayList4.size() + arrayList2.size() + xtVar.b());
                if (i33 != 0) {
                    if (!arrayList2.isEmpty() || !arrayList4.isEmpty()) {
                        pz2.a("No extra pages");
                    }
                    int b3 = xtVar.b();
                    int[] iArr2 = new int[b3];
                    for (int i130 = 0; i130 < b3; i130++) {
                        iArr2[i130] = i72;
                    }
                    int[] iArr3 = new int[b3];
                    j2 = j14;
                    ot otVar = new ot(zh6Var3.A0(i24), false, null);
                    if (jf4Var12 == jf4.Vertical) {
                        otVar.i(gj3Var, f, iArr2, iArr3);
                        iArr = iArr3;
                        zh6Var = zh6Var3;
                        arrayList5 = arrayList17;
                        i39 = i72;
                        i41 = i128;
                        i37 = i31;
                        i38 = i35;
                        jf4Var2 = jf4Var12;
                        i40 = i34;
                    } else {
                        iArr = iArr3;
                        zh6Var = zh6Var3;
                        arrayList5 = arrayList17;
                        i39 = i72;
                        i41 = i128;
                        i37 = i31;
                        i38 = i35;
                        jf4Var2 = jf4Var12;
                        i40 = i34;
                        otVar.g(gj3Var, f, iArr2, sd3.Ltr, iArr);
                    }
                    d33 r0 = nu.r0(iArr);
                    int i131 = r0.B;
                    int i132 = r0.L;
                    if ((i132 > 0 && i131 >= 0) || (i132 < 0 && i131 <= 0)) {
                        int i133 = 0;
                        while (true) {
                            int i134 = iArr[i133];
                            xtVar2 = xtVar;
                            int i135 = i132;
                            xv3 xv3Var5 = (xv3) xtVar2.get(i133);
                            xv3Var5.b(i134, g, i38);
                            arrayList5.add(xv3Var5);
                            if (i133 == i131) {
                                break;
                            }
                            i133 += i135;
                            xtVar = xtVar2;
                            i132 = i135;
                        }
                    } else {
                        xtVar2 = xtVar;
                    }
                } else {
                    j2 = j14;
                    i37 = i31;
                    xtVar2 = xtVar;
                    i38 = i35;
                    zh6Var = zh6Var3;
                    arrayList5 = arrayList17;
                    jf4Var2 = jf4Var12;
                    i39 = i72;
                    i40 = i34;
                    i41 = i128;
                    int size5 = arrayList2.size();
                    int i136 = i129;
                    for (int i137 = 0; i137 < size5; i137++) {
                        xv3 xv3Var6 = (xv3) arrayList2.get(i137);
                        i136 -= i54;
                        xv3Var6.b(i136, g, i38);
                        arrayList5.add(xv3Var6);
                    }
                    int b4 = xtVar2.b();
                    int i138 = i129;
                    for (int i139 = 0; i139 < b4; i139++) {
                        xv3 xv3Var7 = (xv3) xtVar2.get(i139);
                        xv3Var7.b(i138, g, i38);
                        arrayList5.add(xv3Var7);
                        i138 += i54;
                    }
                    int size6 = arrayList4.size();
                    for (int i140 = 0; i140 < size6; i140++) {
                        xv3 xv3Var8 = (xv3) arrayList4.get(i140);
                        xv3Var8.b(i138, g, i38);
                        arrayList5.add(xv3Var8);
                        i138 += i54;
                    }
                }
                if (i37 != 0) {
                    arrayList6 = arrayList5;
                } else {
                    arrayList6 = new ArrayList(arrayList5.size());
                    int size7 = arrayList5.size();
                    int i141 = 0;
                    while (i141 < size7) {
                        Object obj2 = arrayList5.get(i141);
                        xv3 xv3Var9 = (xv3) obj2;
                        int i142 = size7;
                        xt xtVar4 = xtVar2;
                        if (xv3Var9.a >= ((xv3) xtVar2.first()).a && xv3Var9.a <= ((xv3) xtVar4.last()).a) {
                            arrayList6.add(obj2);
                        }
                        i141++;
                        size7 = i142;
                        xtVar2 = xtVar4;
                    }
                }
                xt xtVar5 = xtVar2;
                if (arrayList2.isEmpty()) {
                    arrayList7 = list;
                } else {
                    arrayList7 = new ArrayList(arrayList5.size());
                    int size8 = arrayList5.size();
                    for (int i143 = 0; i143 < size8; i143++) {
                        Object obj3 = arrayList5.get(i143);
                        if (((xv3) obj3).a < ((xv3) xtVar5.first()).a) {
                            arrayList7.add(obj3);
                        }
                    }
                }
                if (arrayList4.isEmpty()) {
                    arrayList8 = list;
                } else {
                    arrayList8 = new ArrayList(arrayList5.size());
                    int size9 = arrayList5.size();
                    for (int i144 = 0; i144 < size9; i144++) {
                        Object obj4 = arrayList5.get(i144);
                        if (((xv3) obj4).a > ((xv3) xtVar5.last()).a) {
                            arrayList8.add(obj4);
                        }
                    }
                }
                if (arrayList6.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList6.get(0);
                    int i145 = ((xv3) obj).j;
                    sn1Var2.getClass();
                    float f2 = -Math.abs(i145 - RecyclerView.A1);
                    int size10 = arrayList6.size() - 1;
                    int i146 = i20;
                    if (i146 <= size10) {
                        float f3 = f2;
                        int i147 = i146;
                        while (true) {
                            Object obj5 = arrayList6.get(i147);
                            float f4 = -Math.abs(((xv3) obj5).j - RecyclerView.A1);
                            if (Float.compare(f3, f4) < 0) {
                                f3 = f4;
                                obj = obj5;
                            }
                            if (i147 == size10) {
                                break;
                            }
                            i147++;
                        }
                    }
                }
                xv3 xv3Var10 = (xv3) obj;
                sn1Var2.getClass();
                if (xv3Var10 != null) {
                    i42 = xv3Var10.j;
                } else {
                    i42 = 0;
                }
                if (i19 == 0) {
                    l = 0.0f;
                    z2 = false;
                } else {
                    z2 = false;
                    l = io2.l((0 - i42) / i19, -0.5f, 0.5f);
                }
                int i148 = g + i70;
                List list8 = arrayList7;
                ArrayList arrayList18 = arrayList6;
                uv3 s0 = zh6Var.s0(nz0.g(i148, j), nz0.f(i38 + Y4, j), qp1Var4, new gi2(k24Var, arrayList5));
                if (i18 >= i124 && i41 <= i40) {
                    z3 = z2;
                } else {
                    z3 = true;
                }
                int i149 = i24;
                List list9 = arrayList8;
                int i150 = i39;
                zh6Var2 = zh6Var;
                zh4Var = new zh4(arrayList18, i150, i149, i51, jf4Var2, i61, i75, i29, xv3Var, xv3Var10, l, i23, z3, sn1Var2, s0, z6, list8, list9, o31Var, gj3Var, j2);
                gj3Var2 = gj3Var;
            }
            ya1 ya1Var5 = ya1Var;
            ya1Var5.h(zh4Var, zh6Var2.w(), false);
            rh4 rh4Var = ya1Var5.t;
            List list10 = zh4Var.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (rh4Var.b() && !list10.isEmpty()) {
                    int i151 = ((xv3) tq0.K0(list10)).a;
                    int i152 = ((xv3) tq0.T0(list10)).a;
                    for (int i153 = rh4Var.h; i153 < i151; i153++) {
                        gj3Var2.a(i153);
                    }
                    int i154 = i152 + 1;
                    int i155 = rh4Var.i;
                    if (i154 <= i155) {
                        while (true) {
                            gj3Var2.a(i154);
                            if (i154 == i155) {
                                break;
                            }
                            i154++;
                        }
                    }
                }
                return zh4Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            io2.l0(z4, Y6, mi2Var);
            throw th;
        }
    }
}
