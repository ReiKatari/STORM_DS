package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br4  reason: default package */
/* loaded from: classes.dex */
public final class br4 implements eq3 {
    public final /* synthetic */ ue1 a;
    public final /* synthetic */ lo4 b;
    public final /* synthetic */ lq4 c;
    public final /* synthetic */ cs1 d;
    public final /* synthetic */ on2 e;
    public final /* synthetic */ on2 f;
    public final /* synthetic */ d40 g;
    public final /* synthetic */ cs1 h;
    public final /* synthetic */ w61 i;

    public br4(ue1 ue1Var, lo4 lo4Var, lq4 lq4Var, cs1 cs1Var, qo3 qo3Var, on2 on2Var, d40 d40Var, cs1 cs1Var2, w61 w61Var) {
        this.a = ue1Var;
        this.b = lo4Var;
        this.c = lq4Var;
        this.d = cs1Var;
        this.e = qo3Var;
        this.f = on2Var;
        this.g = d40Var;
        this.h = cs1Var2;
        this.i = w61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v37 */
    @Override // defpackage.eq3
    public final f34 a(fq3 fq3Var, long j) {
        boolean z;
        lo4 lo4Var;
        int r0;
        int r02;
        int i;
        int h;
        int i2;
        int i3;
        int i4;
        qn2 qn2Var;
        int i5;
        int i6;
        int i7;
        ar4 ar4Var;
        int i8;
        int i9;
        int i10;
        d40 d40Var;
        ue1 ue1Var;
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
        i34 i34Var;
        pu puVar;
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
        pu puVar2;
        int i38;
        qt6 qt6Var;
        ArrayList arrayList5;
        lo4 lo4Var2;
        int i39;
        int i40;
        int i41;
        ArrayList arrayList6;
        ?? arrayList7;
        ?? arrayList8;
        Object obj;
        int i42;
        boolean z2;
        float p;
        boolean z3;
        cr4 cr4Var;
        qt6 qt6Var2;
        fq3 fq3Var2;
        int[] iArr;
        int i43;
        int i44;
        int i45;
        int i46;
        lo4 lo4Var3;
        d40 d40Var2;
        long j3;
        ArrayList arrayList9;
        List list2;
        int i47;
        ArrayList arrayList10;
        int i48;
        int i49;
        br4 br4Var = this;
        qt6 qt6Var3 = fq3Var.B;
        ue1 ue1Var2 = br4Var.a;
        ue1Var2.A.getValue();
        lo4 lo4Var4 = lo4.Vertical;
        lo4 lo4Var5 = br4Var.b;
        if (lo4Var5 == lo4Var4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lo4Var = lo4Var4;
        } else {
            lo4Var = lo4.Horizontal;
        }
        mb3.s(j, lo4Var);
        lq4 lq4Var = br4Var.c;
        if (z) {
            r0 = qt6Var3.r0(lq4Var.b(qt6Var3.getLayoutDirection()));
        } else {
            r0 = qt6Var3.r0(ge7.r(lq4Var, qt6Var3.getLayoutDirection()));
        }
        if (z) {
            r02 = qt6Var3.r0(lq4Var.c(qt6Var3.getLayoutDirection()));
        } else {
            r02 = qt6Var3.r0(ge7.q(lq4Var, qt6Var3.getLayoutDirection()));
        }
        int r03 = qt6Var3.r0(lq4Var.d());
        int r04 = qt6Var3.r0(lq4Var.a()) + r03;
        int i50 = r0 + r02;
        if (z) {
            i = r04;
        } else {
            i = i50;
        }
        if (z) {
            r02 = r03;
        } else if (!z) {
            r02 = r0;
        }
        int i51 = i - r02;
        long i52 = s21.i(j, -i50, -r04);
        ue1Var2.n = fq3Var;
        int r05 = qt6Var3.r0(RecyclerView.B1);
        if (z) {
            h = q21.g(j) - r04;
        } else {
            h = q21.h(j) - i50;
        }
        long j4 = (r0 << 32) | (r03 & 4294967295L);
        br4Var.d.getClass();
        if (h < 0) {
            i2 = 0;
        } else {
            i2 = h;
        }
        if (lo4Var5 == lo4Var4) {
            i3 = q21.h(i52);
        } else {
            i3 = i2;
        }
        if (lo4Var5 != lo4Var4) {
            i4 = q21.g(i52);
        } else {
            i4 = i2;
        }
        long j5 = j4;
        s21.b(0, i3, 0, i4, 5);
        ar4 ar4Var2 = (ar4) br4Var.e.c();
        cs1 cs1Var = br4Var.h;
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            int k = ue1Var2.k();
            ue1 ue1Var3 = ue1Var2;
            int i53 = h;
            er4 er4Var = ue1Var3.d;
            int y = bl2.y(k, ar4Var2, er4Var.e);
            if (k != y) {
                i5 = i2;
                er4Var.b.i(y);
                er4Var.f.a(k);
            } else {
                i5 = i2;
            }
            ue1Var3.k();
            float l = ue1Var3.l();
            ue1Var3.n();
            cs1Var.getClass();
            int i54 = i5 + r05;
            int E = u24.E(RecyclerView.B1 - (l * i54));
            ln2.V(t, N, qn2Var);
            List g = nj2.g(ar4Var2, ue1Var3.y, ue1Var3.u);
            p94 p94Var = h93.a;
            p94 p94Var2 = new p94();
            int intValue = ((Number) br4Var.f.c()).intValue();
            qa4 qa4Var = ue1Var3.z;
            if (r02 < 0) {
                s53.a("negative beforeContentPadding");
            }
            if (i51 < 0) {
                s53.a("negative afterContentPadding");
            }
            List list3 = g;
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
            lo4 lo4Var6 = br4Var.b;
            if (lo4Var6 == lo4Var4) {
                ar4Var = ar4Var2;
                i8 = q21.h(i52);
            } else {
                ar4Var = ar4Var2;
                i8 = i5;
            }
            if (lo4Var6 != lo4Var4) {
                i9 = q21.g(i52);
            } else {
                i9 = i5;
            }
            int i57 = E;
            long b = s21.b(0, i8, 0, i9, 5);
            zt1 zt1Var = zt1.A;
            cs1 cs1Var2 = br4Var.h;
            w61 w61Var = br4Var.i;
            if (i56 <= 0) {
                cr4Var = new cr4(i5, r05, i51, lo4Var6, -r02, i53 + i51, i7, cs1Var2, qt6Var3.K(s21.g(q21.j(i52) + i50, j), s21.f(q21.i(i52) + r04, j), zt1Var, new bz1(22)), w61Var, fq3Var, b);
                fq3Var2 = fq3Var;
                qt6Var2 = qt6Var3;
                ue1Var = ue1Var3;
            } else {
                zt1 zt1Var2 = zt1Var;
                long j6 = b;
                lo4 lo4Var7 = lo4Var6;
                int i58 = 0;
                int i59 = y;
                while (i59 > 0 && i57 > 0) {
                    i59--;
                    i57 -= i55;
                }
                int i60 = i57 * (-1);
                if (i59 >= i56) {
                    i59 = i56 - 1;
                    i60 = 0;
                }
                pu puVar3 = new pu();
                int i61 = -r02;
                if (r05 < 0) {
                    i10 = r05;
                } else {
                    i10 = 0;
                }
                int i62 = i61 + i10;
                int i63 = i60 + i62;
                int i64 = 0;
                while (true) {
                    d40Var = br4Var.g;
                    if (i63 >= 0 || i59 <= 0) {
                        break;
                    }
                    i59--;
                    zt1 zt1Var3 = zt1Var2;
                    ue1 ue1Var4 = ue1Var3;
                    int i65 = i50;
                    int i66 = i58;
                    long j7 = j5;
                    ar4 ar4Var3 = ar4Var;
                    p94 p94Var3 = p94Var2;
                    int i67 = i5;
                    i34 y2 = hi2.y(fq3Var, i59, j6, ar4Var3, j7, lo4Var7, d40Var, qt6Var3.getLayoutDirection(), i67, p94Var3);
                    p94Var2 = p94Var3;
                    puVar3.add(i66, y2);
                    i64 = Math.max(i64, y2.h);
                    i63 += i55;
                    ar4Var = ar4Var3;
                    j5 = j7;
                    j6 = j6;
                    i5 = i67;
                    i50 = i65;
                    r02 = r02;
                    i7 = i7;
                    zt1Var2 = zt1Var3;
                    ue1Var3 = ue1Var4;
                    lo4Var7 = lo4Var7;
                    i56 = i56;
                    i58 = i66;
                    br4Var = this;
                }
                zt1 zt1Var4 = zt1Var2;
                ue1Var = ue1Var3;
                int i68 = i7;
                int i69 = r02;
                int i70 = i50;
                int i71 = i58;
                long j8 = j5;
                int i72 = i5;
                int i73 = i56;
                lo4 lo4Var8 = lo4Var7;
                long j9 = j6;
                ar4 ar4Var4 = ar4Var;
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
                lo4 lo4Var9 = lo4Var8;
                int i77 = i59;
                int i78 = i77;
                int i79 = 0;
                boolean z4 = false;
                while (i79 < puVar3.L) {
                    if (i76 >= i11) {
                        puVar3.b(i79);
                        z4 = true;
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
                boolean z5 = z4;
                while (true) {
                    if (i84 < i83) {
                        if (i80 < i11 || i80 <= 0 || puVar3.isEmpty()) {
                            int i85 = i11;
                            long j10 = j9;
                            int i86 = i83;
                            d40 d40Var3 = d40Var;
                            kk3 layoutDirection = qt6Var3.getLayoutDirection();
                            lo4 lo4Var10 = lo4Var9;
                            int i87 = i82;
                            int i88 = i53;
                            int i89 = i81;
                            int i90 = i80;
                            i34 y3 = hi2.y(fq3Var, i84, j10, ar4Var4, j8, lo4Var10, d40Var3, layoutDirection, i72, p94Var2);
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
                                z5 = true;
                            } else {
                                int max = Math.max(i89, y3.h);
                                puVar3.addLast(y3);
                                i49 = i87;
                                i89 = max;
                            }
                            i84 = i91 + 1;
                            i81 = i89;
                            i53 = i88;
                            i82 = i49;
                            d40Var = d40Var3;
                            lo4Var9 = lo4Var10;
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
                d40 d40Var4 = d40Var;
                int i94 = i82;
                lo4 lo4Var11 = lo4Var9;
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
                        i34 y4 = hi2.y(fq3Var, i78, j11, ar4Var4, j8, lo4Var11, d40Var4, qt6Var3.getLayoutDirection(), i72, p94Var2);
                        puVar3.add(0, y4);
                        i95 = Math.max(i95, y4.h);
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
                    s53.a("invalid currentFirstPageScrollOffset");
                }
                int i104 = -i16;
                i34 i34Var2 = (i34) puVar3.first();
                int i105 = i95;
                int i106 = r05;
                if (i14 > 0 || i106 < 0) {
                    int i107 = i16;
                    int a = puVar3.a();
                    i34 i34Var3 = i34Var2;
                    int i108 = i107;
                    i17 = i104;
                    int i109 = 0;
                    while (i109 < a && i108 != 0) {
                        i18 = i15;
                        int i110 = i55;
                        if (i110 <= i108) {
                            i19 = i110;
                            i20 = 1;
                            if (i109 == puVar3.a() - 1) {
                                break;
                            }
                            i108 -= i19;
                            i109++;
                            i34Var3 = (i34) puVar3.get(i109);
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
                    i34Var2 = i34Var3;
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
                        i34 i34Var4 = i34Var2;
                        kk3 layoutDirection2 = qt6Var3.getLayoutDirection();
                        i22 = i12;
                        i23 = i21;
                        i24 = i106;
                        i34Var = i34Var4;
                        i26 = i68;
                        arrayList10 = arrayList11;
                        int i113 = i112;
                        i25 = i13;
                        puVar = puVar3;
                        i27 = max2;
                        arrayList10.add(hi2.y(fq3Var, i113, j11, ar4Var4, j8, lo4Var11, d40Var4, layoutDirection2, i72, p94Var2));
                        if (i113 == i27) {
                            break;
                        }
                        i112 = i113 - 1;
                        max2 = i27;
                        puVar3 = puVar;
                        i13 = i25;
                        arrayList11 = arrayList10;
                        i34Var2 = i34Var;
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
                    i34Var = i34Var2;
                    puVar = puVar3;
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
                        arrayList12.add(hi2.y(fq3Var, intValue2, j11, ar4Var4, j8, lo4Var11, d40Var4, qt6Var3.getLayoutDirection(), i72, p94Var2));
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
                List list6 = yt1.A;
                if (arrayList == null) {
                    arrayList2 = list6;
                } else {
                    arrayList2 = arrayList;
                }
                int i116 = i105;
                int i117 = 0;
                for (int size2 = arrayList2.size(); i117 < size2; size2 = size2) {
                    i116 = Math.max(i116, ((i34) arrayList2.get(i117)).h);
                    i117++;
                }
                int i118 = ((i34) puVar.last()).a;
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
                        kk3 layoutDirection3 = qt6Var3.getLayoutDirection();
                        i29 = i26;
                        i30 = min;
                        int i120 = i119;
                        arrayList9.add(hi2.y(fq3Var, i120, j11, ar4Var4, j8, lo4Var11, d40Var4, layoutDirection3, i72, p94Var2));
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
                            kk3 layoutDirection4 = qt6Var3.getLayoutDirection();
                            i43 = i30;
                            i45 = i122;
                            i44 = i123;
                            list5 = list7;
                            i34 y5 = hi2.y(fq3Var, intValue3, j11, ar4Var4, j8, lo4Var11, d40Var4, layoutDirection4, i72, p94Var2);
                            lo4Var3 = lo4Var11;
                            long j12 = j11;
                            d40Var2 = d40Var4;
                            j3 = j12;
                            arrayList15.add(y5);
                            arrayList3 = arrayList15;
                            i121 = i45 + 1;
                            size3 = i46;
                            i93 = i44;
                            i30 = i43;
                            d40Var4 = d40Var2;
                            j11 = j3;
                            lo4Var11 = lo4Var3;
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
                    lo4Var3 = lo4Var11;
                    long j13 = j11;
                    d40Var2 = d40Var4;
                    j3 = j13;
                    arrayList3 = arrayList14;
                    i121 = i45 + 1;
                    size3 = i46;
                    i93 = i44;
                    i30 = i43;
                    d40Var4 = d40Var2;
                    j11 = j3;
                    lo4Var11 = lo4Var3;
                }
                ArrayList arrayList16 = arrayList3;
                lo4 lo4Var12 = lo4Var11;
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
                    i125 = Math.max(i125, ((i34) arrayList4.get(i126)).h);
                }
                if (nb3.k(i34Var, puVar.first()) && arrayList2.isEmpty() && arrayList4.isEmpty()) {
                    i31 = i20;
                } else {
                    i31 = 0;
                }
                lo4 lo4Var13 = lo4.Vertical;
                if (lo4Var12 == lo4Var13) {
                    i32 = i125;
                } else {
                    i32 = i25;
                }
                int g2 = s21.g(i32, i52);
                if (lo4Var12 == lo4Var13) {
                    i125 = i25;
                }
                int f = s21.f(i125, i52);
                if (lo4Var12 != lo4Var13) {
                    f = g2;
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
                    s53.c(sb.toString());
                } else {
                    i34 = i127;
                    i35 = f;
                    i36 = i17;
                }
                int i129 = i36;
                ArrayList arrayList17 = new ArrayList(arrayList4.size() + arrayList2.size() + puVar.a());
                if (i33 != 0) {
                    if (!arrayList2.isEmpty() || !arrayList4.isEmpty()) {
                        s53.a("No extra pages");
                    }
                    int a2 = puVar.a();
                    int[] iArr2 = new int[a2];
                    for (int i130 = 0; i130 < a2; i130++) {
                        iArr2[i130] = i72;
                    }
                    int[] iArr3 = new int[a2];
                    j2 = j14;
                    gu guVar = new gu(qt6Var3.Q(i24), false, null);
                    if (lo4Var12 == lo4.Vertical) {
                        guVar.g(fq3Var, f, iArr2, iArr3);
                        iArr = iArr3;
                        qt6Var = qt6Var3;
                        arrayList5 = arrayList17;
                        i39 = i72;
                        i41 = i128;
                        i37 = i31;
                        i38 = i35;
                        lo4Var2 = lo4Var12;
                        i40 = i34;
                    } else {
                        iArr = iArr3;
                        qt6Var = qt6Var3;
                        arrayList5 = arrayList17;
                        i39 = i72;
                        i41 = i128;
                        i37 = i31;
                        i38 = i35;
                        lo4Var2 = lo4Var12;
                        i40 = i34;
                        guVar.d(fq3Var, f, iArr2, kk3.Ltr, iArr);
                    }
                    l93 F0 = fv.F0(iArr);
                    int i131 = F0.B;
                    int i132 = F0.L;
                    if ((i132 > 0 && i131 >= 0) || (i132 < 0 && i131 <= 0)) {
                        int i133 = 0;
                        while (true) {
                            int i134 = iArr[i133];
                            puVar2 = puVar;
                            int i135 = i132;
                            i34 i34Var5 = (i34) puVar2.get(i133);
                            i34Var5.b(i134, g2, i38);
                            arrayList5.add(i34Var5);
                            if (i133 == i131) {
                                break;
                            }
                            i133 += i135;
                            puVar = puVar2;
                            i132 = i135;
                        }
                    } else {
                        puVar2 = puVar;
                    }
                } else {
                    j2 = j14;
                    i37 = i31;
                    puVar2 = puVar;
                    i38 = i35;
                    qt6Var = qt6Var3;
                    arrayList5 = arrayList17;
                    lo4Var2 = lo4Var12;
                    i39 = i72;
                    i40 = i34;
                    i41 = i128;
                    int size5 = arrayList2.size();
                    int i136 = i129;
                    for (int i137 = 0; i137 < size5; i137++) {
                        i34 i34Var6 = (i34) arrayList2.get(i137);
                        i136 -= i54;
                        i34Var6.b(i136, g2, i38);
                        arrayList5.add(i34Var6);
                    }
                    int a3 = puVar2.a();
                    int i138 = i129;
                    for (int i139 = 0; i139 < a3; i139++) {
                        i34 i34Var7 = (i34) puVar2.get(i139);
                        i34Var7.b(i138, g2, i38);
                        arrayList5.add(i34Var7);
                        i138 += i54;
                    }
                    int size6 = arrayList4.size();
                    for (int i140 = 0; i140 < size6; i140++) {
                        i34 i34Var8 = (i34) arrayList4.get(i140);
                        i34Var8.b(i138, g2, i38);
                        arrayList5.add(i34Var8);
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
                        i34 i34Var9 = (i34) obj2;
                        int i142 = size7;
                        pu puVar4 = puVar2;
                        if (i34Var9.a >= ((i34) puVar2.first()).a && i34Var9.a <= ((i34) puVar4.last()).a) {
                            arrayList6.add(obj2);
                        }
                        i141++;
                        size7 = i142;
                        puVar2 = puVar4;
                    }
                }
                pu puVar5 = puVar2;
                if (arrayList2.isEmpty()) {
                    arrayList7 = list;
                } else {
                    arrayList7 = new ArrayList(arrayList5.size());
                    int size8 = arrayList5.size();
                    for (int i143 = 0; i143 < size8; i143++) {
                        Object obj3 = arrayList5.get(i143);
                        if (((i34) obj3).a < ((i34) puVar5.first()).a) {
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
                        if (((i34) obj4).a > ((i34) puVar5.last()).a) {
                            arrayList8.add(obj4);
                        }
                    }
                }
                if (arrayList6.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList6.get(0);
                    int i145 = ((i34) obj).j;
                    cs1Var2.getClass();
                    float f2 = -Math.abs(i145 - RecyclerView.B1);
                    int size10 = arrayList6.size() - 1;
                    int i146 = i20;
                    if (i146 <= size10) {
                        float f3 = f2;
                        int i147 = i146;
                        while (true) {
                            Object obj5 = arrayList6.get(i147);
                            float f4 = -Math.abs(((i34) obj5).j - RecyclerView.B1);
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
                i34 i34Var10 = (i34) obj;
                cs1Var2.getClass();
                if (i34Var10 != null) {
                    i42 = i34Var10.j;
                } else {
                    i42 = 0;
                }
                if (i19 == 0) {
                    p = 0.0f;
                    z2 = false;
                } else {
                    z2 = false;
                    p = gi2.p((0 - i42) / i19, -0.5f, 0.5f);
                }
                int i148 = g2 + i70;
                List list8 = arrayList7;
                ArrayList arrayList18 = arrayList6;
                f34 K = qt6Var.K(s21.g(i148, j), s21.f(i38 + r04, j), zt1Var4, new qk4(3, qa4Var, arrayList5));
                if (i18 >= i124 && i41 <= i40) {
                    z3 = z2;
                } else {
                    z3 = true;
                }
                int i149 = i24;
                List list9 = arrayList8;
                int i150 = i39;
                qt6Var2 = qt6Var;
                cr4Var = new cr4(arrayList18, i150, i149, i51, lo4Var2, i61, i75, i29, i34Var, i34Var10, p, i23, z3, cs1Var2, K, z5, list8, list9, w61Var, fq3Var, j2);
                fq3Var2 = fq3Var;
            }
            ue1 ue1Var5 = ue1Var;
            ue1Var5.h(cr4Var, qt6Var2.a0(), false);
            uq4 uq4Var = ue1Var5.t;
            List list10 = cr4Var.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (uq4Var.b() && !list10.isEmpty()) {
                    int i151 = ((i34) gt0.H0(list10)).a;
                    int i152 = ((i34) gt0.Q0(list10)).a;
                    for (int i153 = uq4Var.h; i153 < i151; i153++) {
                        fq3Var2.b(i153);
                    }
                    int i154 = i152 + 1;
                    int i155 = uq4Var.i;
                    if (i154 <= i155) {
                        while (true) {
                            fq3Var2.b(i154);
                            if (i154 == i155) {
                                break;
                            }
                            i154++;
                        }
                    }
                }
                return cr4Var;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            ln2.V(t, N, qn2Var);
            throw th;
        }
    }
}
