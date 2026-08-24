package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir3  reason: default package */
/* loaded from: classes.dex */
public final class ir3 implements eq3 {
    public final /* synthetic */ pr3 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lq4 c;
    public final /* synthetic */ on2 d;
    public final /* synthetic */ iu e;
    public final /* synthetic */ fu f;
    public final /* synthetic */ w61 g;
    public final /* synthetic */ q61 h;
    public final /* synthetic */ c40 i;
    public final /* synthetic */ d40 j;

    public ir3(pr3 pr3Var, boolean z, lq4 lq4Var, qo3 qo3Var, iu iuVar, fu fuVar, w61 w61Var, tt2 tt2Var, q61 q61Var, c40 c40Var, d40 d40Var) {
        this.a = pr3Var;
        this.b = z;
        this.c = lq4Var;
        this.d = qo3Var;
        this.e = iuVar;
        this.f = fuVar;
        this.g = w61Var;
        this.h = q61Var;
        this.i = c40Var;
        this.j = d40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0741 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
    @Override // defpackage.eq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f34 a(fq3 fq3Var, long j) {
        boolean z;
        lo4 lo4Var;
        int r0;
        int r02;
        int i;
        int i2;
        float a;
        int h;
        qn2 qn2Var;
        int i3;
        float f;
        pr3 pr3Var;
        int i4;
        long j2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        float f3;
        List list;
        int i13;
        int i14;
        ArrayList arrayList;
        boolean z2;
        int i15;
        boolean z3;
        int i16;
        zt1 zt1Var;
        hr3 hr3Var;
        int i17;
        boolean z4;
        int i18;
        int i19;
        ArrayList arrayList2;
        int i20;
        int i21;
        hr3 hr3Var2;
        zp3 zp3Var;
        int i22;
        int i23;
        kr3 kr3Var;
        int i24;
        kr3 kr3Var2;
        int i25;
        Integer valueOf;
        Integer valueOf2;
        int i26;
        int i27;
        int i28;
        lo4 lo4Var2;
        jr3 jr3Var;
        qt6 qt6Var;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z5;
        lo4 lo4Var3;
        boolean b = q93.b(0L, 0L);
        qt6 qt6Var2 = fq3Var.B;
        pr3 pr3Var2 = this.a;
        pr3Var2.t.getValue();
        if (!pr3Var2.b && !qt6Var2.a0()) {
            z = false;
        } else {
            z = true;
        }
        boolean z6 = this.b;
        if (z6) {
            lo4Var = lo4.Vertical;
        } else {
            lo4Var = lo4.Horizontal;
        }
        mb3.s(j, lo4Var);
        lq4 lq4Var = this.c;
        if (z6) {
            r0 = qt6Var2.r0(lq4Var.b(qt6Var2.getLayoutDirection()));
        } else {
            r0 = qt6Var2.r0(ge7.r(lq4Var, qt6Var2.getLayoutDirection()));
        }
        if (z6) {
            r02 = qt6Var2.r0(lq4Var.c(qt6Var2.getLayoutDirection()));
        } else {
            r02 = qt6Var2.r0(ge7.q(lq4Var, qt6Var2.getLayoutDirection()));
        }
        int r03 = qt6Var2.r0(lq4Var.d());
        int r04 = qt6Var2.r0(lq4Var.a()) + r03;
        int i34 = r0 + r02;
        if (z6) {
            i = r04;
        } else {
            i = i34;
        }
        if (z6) {
            i2 = r03;
        } else if (!z6) {
            i2 = r0;
        } else {
            i2 = r02;
        }
        int i35 = i - i2;
        long i36 = s21.i(j, -i34, -r04);
        fr3 fr3Var = (fr3) this.d.c();
        lp3 lp3Var = fr3Var.c;
        int h2 = q21.h(i36);
        int g = q21.g(i36);
        lp3Var.a.i(h2);
        lp3Var.b.i(g);
        fu fuVar = this.f;
        iu iuVar = this.e;
        if (z6) {
            if (iuVar != null) {
                a = iuVar.a();
            } else {
                throw lb1.c("null verticalArrangement when isVertical == true");
            }
        } else if (fuVar != null) {
            a = fuVar.a();
        } else {
            throw lb1.c("null horizontalAlignment when isVertical == false");
        }
        int r05 = qt6Var2.r0(a);
        int a2 = fr3Var.a();
        if (z6) {
            h = q21.g(j) - r04;
        } else {
            h = q21.h(j) - i34;
        }
        int i37 = h;
        int i38 = i2;
        hr3 hr3Var3 = new hr3(i36, this.b, fr3Var, fq3Var, a2, r05, this.i, this.j, i38, i35, (r0 << 32) | (r03 & 4294967295L), this.a);
        int i39 = a2;
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            int h3 = pr3Var2.h();
            zo3 zo3Var = pr3Var2.e;
            int y = bl2.y(h3, fr3Var, zo3Var.e);
            if (h3 != y) {
                i3 = r05;
                zo3Var.b.i(y);
                zo3Var.f.a(h3);
            } else {
                i3 = r05;
            }
            int i40 = pr3Var2.i();
            ln2.V(t, N, qn2Var);
            List g2 = nj2.g(fr3Var, pr3Var2.s, pr3Var2.p);
            if (!qt6Var2.a0() && z) {
                f = ((Number) ((uo) pr3Var2.x.L).B.getValue()).floatValue();
            } else {
                f = pr3Var2.h;
            }
            zp3 zp3Var2 = pr3Var2.o;
            boolean a0 = qt6Var2.a0();
            qa4 qa4Var = pr3Var2.w;
            boolean z7 = pr3Var2.i;
            if (i38 < 0) {
                s53.a("invalid beforeContentPadding");
            }
            if (i35 < 0) {
                s53.a("invalid afterContentPadding");
            }
            zt1 zt1Var2 = zt1.A;
            fr3 fr3Var2 = hr3Var3.b;
            int i41 = i40;
            w61 w61Var = this.g;
            int i42 = 1;
            yt1 yt1Var = yt1.A;
            if (i39 <= 0) {
                int j3 = q21.j(i36);
                int i43 = q21.i(i36);
                zp3Var2.e(j3, i43, new ArrayList(), fr3Var2.d, hr3Var3, a0, 1, z, 0, 0);
                if (!a0) {
                    zp3Var2.c();
                    if (!b) {
                        z5 = false;
                        j3 = s21.g(0, i36);
                        i43 = s21.f(0, i36);
                        f34 K = qt6Var2.K(s21.g(j3 + i34, j), s21.f(i43 + r04, j), zt1Var2, new bz1(22));
                        int i44 = -i38;
                        int i45 = i37 + i35;
                        if (!z6) {
                            lo4Var3 = lo4.Vertical;
                        } else {
                            lo4Var3 = lo4.Horizontal;
                        }
                        qt6Var = qt6Var2;
                        pr3Var = pr3Var2;
                        jr3Var = new jr3(null, 0, false, RecyclerView.B1, K, RecyclerView.B1, false, w61Var, fq3Var, hr3Var3.d, yt1Var, i44, i45, 0, lo4Var3, i35, i3);
                    }
                }
                z5 = false;
                f34 K2 = qt6Var2.K(s21.g(j3 + i34, j), s21.f(i43 + r04, j), zt1Var2, new bz1(22));
                int i442 = -i38;
                int i452 = i37 + i35;
                if (!z6) {
                }
                qt6Var = qt6Var2;
                pr3Var = pr3Var2;
                jr3Var = new jr3(null, 0, false, RecyclerView.B1, K2, RecyclerView.B1, false, w61Var, fq3Var, hr3Var3.d, yt1Var, i442, i452, 0, lo4Var3, i35, i3);
            } else {
                pr3Var = pr3Var2;
                int i46 = i3;
                if (y >= i39) {
                    y = i39 - 1;
                    i41 = 0;
                }
                int round = Math.round(f);
                int i47 = i41 - round;
                if (y == 0 && i47 < 0) {
                    round += i47;
                    i47 = 0;
                }
                int i48 = y;
                pu puVar = new pu();
                int i49 = -i38;
                if (i46 < 0) {
                    i4 = i46;
                } else {
                    i4 = 0;
                }
                int i50 = i4 + i49;
                int i51 = i47 + i50;
                float f4 = f;
                int i52 = i51;
                int i53 = 0;
                while (true) {
                    j2 = hr3Var3.d;
                    if (i52 >= 0 || i48 <= 0) {
                        break;
                    }
                    int i54 = i49;
                    int i55 = i48 - 1;
                    kr3 o = hr3Var3.o(i55, j2);
                    puVar.add(0, o);
                    i53 = Math.max(i53, o.o);
                    i52 += o.n;
                    i48 = i55;
                    i49 = i54;
                }
                int i56 = i49;
                int i57 = 0;
                if (i52 < i50) {
                    round -= i50 - i52;
                    i52 = i50;
                }
                int i58 = round;
                int i59 = i52 - i50;
                int i60 = i37 + i35;
                if (i60 >= 0) {
                    i57 = i60;
                }
                int i61 = i53;
                int i62 = -i59;
                int i63 = i59;
                int i64 = i48;
                int i65 = 0;
                boolean z8 = false;
                while (i65 < puVar.L) {
                    if (i62 >= i57) {
                        puVar.b(i65);
                        z8 = true;
                    } else {
                        i64++;
                        i62 += ((kr3) puVar.get(i65)).n;
                        i65++;
                    }
                }
                int i66 = i61;
                boolean z9 = z8;
                int i67 = i64;
                while (i67 < i39 && (i62 < i57 || i62 <= 0 || puVar.isEmpty())) {
                    int i68 = i57;
                    kr3 o2 = hr3Var3.o(i67, j2);
                    int i69 = i39;
                    int i70 = o2.n;
                    int i71 = i62 + i70;
                    if (i71 <= i50) {
                        i33 = i71;
                        if (i67 != i69 - 1) {
                            i63 -= i70;
                            i48 = i67 + 1;
                            z9 = true;
                            i67++;
                            i57 = i68;
                            i62 = i33;
                            i39 = i69;
                        }
                    } else {
                        i33 = i71;
                    }
                    i66 = Math.max(i66, o2.o);
                    puVar.addLast(o2);
                    i67++;
                    i57 = i68;
                    i62 = i33;
                    i39 = i69;
                }
                int i72 = i39;
                if (i62 < i37) {
                    int i73 = i37 - i62;
                    int i74 = i62 + i73;
                    i10 = i63 - i73;
                    while (i10 < i38 && i48 > 0) {
                        int i75 = i48 - 1;
                        int i76 = i74;
                        kr3 o3 = hr3Var3.o(i75, j2);
                        puVar.add(0, o3);
                        i66 = Math.max(i66, o3.o);
                        i10 += o3.n;
                        i48 = i75;
                        i74 = i76;
                        i67 = i67;
                    }
                    int i77 = i74;
                    i5 = i67;
                    i6 = i58;
                    int i78 = i6 + i73;
                    if (i10 < 0) {
                        i7 = i77 + i10;
                        i9 = i48;
                        i8 = i78 + i10;
                        i10 = 0;
                    } else {
                        i7 = i77;
                        i9 = i48;
                        i8 = i78;
                    }
                } else {
                    i5 = i67;
                    i6 = i58;
                    i7 = i62;
                    i8 = i6;
                    i9 = i48;
                    i10 = i63;
                }
                int i79 = i66;
                float f5 = (Integer.signum(Math.round(f4)) == Integer.signum(i8) && Math.abs(Math.round(f4)) >= Math.abs(i8)) ? i8 : f4;
                float f6 = f4 - f5;
                float f7 = RecyclerView.B1;
                if (a0 && i8 > i6 && f6 <= RecyclerView.B1) {
                    f7 = (i8 - i6) + f6;
                }
                float f8 = f7;
                if (i10 < 0) {
                    s53.a("negative currentFirstItemScrollOffset");
                }
                int i80 = -i10;
                kr3 kr3Var3 = (kr3) puVar.first();
                if (i38 > 0 || i46 < 0) {
                    f2 = f5;
                    int a3 = puVar.a();
                    kr3 kr3Var4 = kr3Var3;
                    int i81 = i10;
                    int i82 = 0;
                    while (i82 < a3) {
                        int i83 = a3;
                        int i84 = ((kr3) puVar.get(i82)).n;
                        if (i81 == 0 || i84 > i81 || i82 == puVar.a() - 1) {
                            break;
                        }
                        i81 -= i84;
                        i82++;
                        kr3Var4 = (kr3) puVar.get(i82);
                        a3 = i83;
                    }
                    i10 = i81;
                    kr3Var3 = kr3Var4;
                    i11 = 0;
                    i12 = i80;
                } else {
                    f2 = f5;
                    i12 = i80;
                    i11 = 0;
                }
                int max = Math.max(i11, i9);
                int i85 = i9 - 1;
                if (max <= i85) {
                    list = null;
                    while (true) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        f3 = f8;
                        list.add(hr3Var3.o(i85, j2));
                        if (i85 == max) {
                            break;
                        }
                        i85--;
                        f8 = f3;
                    }
                } else {
                    f3 = f8;
                    list = null;
                }
                int size = g2.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i86 = size - 1;
                        int intValue = ((Number) g2.get(size)).intValue();
                        if (intValue < max) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            list.add(hr3Var3.o(intValue, j2));
                        }
                        if (i86 < 0) {
                            break;
                        }
                        size = i86;
                    }
                }
                if (list == null) {
                    list = yt1Var;
                }
                int i87 = i79;
                int i88 = 0;
                for (int size2 = list.size(); i88 < size2; size2 = size2) {
                    i87 = Math.max(i87, ((kr3) list.get(i88)).o);
                    i88++;
                }
                int min = Math.min(((kr3) gt0.Q0(puVar)).a, i72 - 1);
                int i89 = ((kr3) gt0.Q0(puVar)).a + 1;
                if (i89 <= min) {
                    ArrayList arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        i13 = i87;
                        arrayList = arrayList3;
                        i14 = i10;
                        arrayList.add(hr3Var3.o(i89, j2));
                        if (i89 == min) {
                            break;
                        }
                        i89++;
                        i10 = i14;
                        arrayList3 = arrayList;
                        i87 = i13;
                    }
                } else {
                    i13 = i87;
                    i14 = i10;
                    arrayList = null;
                }
                if (arrayList != null && ((kr3) gt0.Q0(arrayList)).a > min) {
                    min = ((kr3) gt0.Q0(arrayList)).a;
                }
                int size3 = g2.size();
                ArrayList arrayList4 = arrayList;
                int i90 = 0;
                while (i90 < size3) {
                    List list2 = g2;
                    int intValue2 = ((Number) g2.get(i90)).intValue();
                    if (intValue2 > min) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(hr3Var3.o(intValue2, j2));
                    }
                    i90++;
                    g2 = list2;
                }
                if (arrayList4 == null) {
                    arrayList4 = yt1Var;
                }
                int size4 = arrayList4.size();
                int i91 = i13;
                for (int i92 = 0; i92 < size4; i92++) {
                    i91 = Math.max(i91, ((kr3) arrayList4.get(i92)).o);
                }
                if (nb3.k(kr3Var3, puVar.first()) && list.isEmpty() && arrayList4.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z6) {
                    i15 = i91;
                } else {
                    i15 = i7;
                }
                int g3 = s21.g(i15, i36);
                if (z6) {
                    i91 = i7;
                }
                int f9 = s21.f(i91, i36);
                if (!z6) {
                    f9 = g3;
                }
                if (i7 < Math.min(f9, i37)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && i12 != 0) {
                    s53.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList5 = new ArrayList(arrayList4.size() + list.size() + puVar.a());
                if (z3) {
                    if (!list.isEmpty() || !arrayList4.isEmpty()) {
                        s53.a("no extra items");
                    }
                    int a4 = puVar.a();
                    int[] iArr = new int[a4];
                    for (int i93 = 0; i93 < a4; i93++) {
                        iArr[i93] = ((kr3) puVar.get(i93)).m;
                    }
                    int[] iArr2 = new int[a4];
                    if (z6) {
                        if (iuVar != null) {
                            iuVar.g(fq3Var, f9, iArr, iArr2);
                            i16 = i7;
                            zt1Var = zt1Var2;
                            i31 = f9;
                            hr3Var = hr3Var3;
                            z4 = z2;
                            i32 = g3;
                            arrayList2 = arrayList5;
                        } else {
                            throw lb1.c("null verticalArrangement when isVertical == true");
                        }
                    } else if (fuVar != null) {
                        i16 = i7;
                        zt1Var = zt1Var2;
                        hr3Var = hr3Var3;
                        z4 = z2;
                        arrayList2 = arrayList5;
                        i31 = f9;
                        i32 = g3;
                        fuVar.d(fq3Var, f9, iArr, kk3.Ltr, iArr2);
                    } else {
                        throw lb1.c("null horizontalArrangement when isVertical == false");
                    }
                    l93 F0 = fv.F0(iArr2);
                    int i94 = F0.B;
                    int i95 = F0.L;
                    if ((i95 > 0 && i94 >= 0) || (i95 < 0 && i94 <= 0)) {
                        int i96 = 0;
                        while (true) {
                            int i97 = iArr2[i96];
                            kr3 kr3Var5 = (kr3) puVar.get(i96);
                            kr3Var5.k(i97, i32, i31);
                            arrayList2.add(kr3Var5);
                            if (i96 == i94) {
                                break;
                            }
                            i96 += i95;
                        }
                    }
                    i18 = i32;
                    i17 = i31;
                    i19 = i5;
                } else {
                    i16 = i7;
                    zt1Var = zt1Var2;
                    hr3Var = hr3Var3;
                    i17 = f9;
                    z4 = z2;
                    i18 = g3;
                    i19 = i5;
                    arrayList2 = arrayList5;
                    int size5 = list.size();
                    int i98 = i12;
                    int i99 = 0;
                    while (i99 < size5) {
                        List list3 = list;
                        kr3 kr3Var6 = (kr3) list.get(i99);
                        i98 -= kr3Var6.n;
                        kr3Var6.k(i98, i18, i17);
                        arrayList2.add(kr3Var6);
                        i99++;
                        size5 = size5;
                        list = list3;
                    }
                    int a5 = puVar.a();
                    int i100 = i12;
                    for (int i101 = 0; i101 < a5; i101++) {
                        kr3 kr3Var7 = (kr3) puVar.get(i101);
                        kr3Var7.k(i100, i18, i17);
                        arrayList2.add(kr3Var7);
                        i100 += kr3Var7.n;
                    }
                    int size6 = arrayList4.size();
                    for (int i102 = 0; i102 < size6; i102++) {
                        kr3 kr3Var8 = (kr3) arrayList4.get(i102);
                        kr3Var8.k(i100, i18, i17);
                        arrayList2.add(kr3Var8);
                        i100 += kr3Var8.n;
                    }
                }
                if (!z7) {
                    int i103 = i18;
                    zp3Var = zp3Var2;
                    int i104 = i14;
                    hr3 hr3Var4 = hr3Var;
                    int i105 = i17;
                    zp3Var.e(i103, i105, arrayList2, fr3Var2.d, hr3Var4, a0, 1, z, i104, i16);
                    i20 = i103;
                    i21 = i105;
                    hr3Var2 = hr3Var4;
                    i14 = i104;
                } else {
                    i20 = i18;
                    i21 = i17;
                    hr3Var2 = hr3Var;
                    zp3Var = zp3Var2;
                }
                int i106 = i16;
                if (!a0) {
                    zp3Var.c();
                    if (!b) {
                        if (z6) {
                            i29 = i21;
                        } else {
                            i29 = i20;
                        }
                        i22 = 0;
                        i20 = s21.g(Math.max(i20, 0), i36);
                        int f10 = s21.f(Math.max(i21, 0), i36);
                        if (z6) {
                            i30 = f10;
                        } else {
                            i30 = i20;
                        }
                        if (i30 != i29) {
                            int size7 = arrayList2.size();
                            for (int i107 = 0; i107 < size7; i107++) {
                                ((kr3) arrayList2.get(i107)).q = i30;
                            }
                        }
                        i23 = f10;
                        int i108 = i20;
                        kr3Var = (kr3) puVar.f();
                        if (kr3Var == null) {
                            i24 = kr3Var.a;
                        } else {
                            i24 = i22;
                        }
                        kr3Var2 = (kr3) puVar.h();
                        if (kr3Var2 == null) {
                            i25 = kr3Var2.a;
                        } else {
                            i25 = i22;
                        }
                        fr3Var2.b.getClass();
                        List m = np2.m(this.h, i24, i25, arrayList2, f93.a, i38, i108, i23, new bg2(hr3Var2, 7));
                        int i109 = i23;
                        if (!z4) {
                            kr3 kr3Var9 = (kr3) gt0.J0(arrayList2);
                            if (kr3Var9 != null) {
                                valueOf = Integer.valueOf(kr3Var9.a);
                                if (!z4) {
                                    kr3 kr3Var10 = (kr3) gt0.R0(arrayList2);
                                    if (kr3Var10 != null) {
                                        valueOf2 = Integer.valueOf(kr3Var10.a);
                                        i26 = i72;
                                    }
                                    i26 = i72;
                                    valueOf2 = null;
                                } else {
                                    kr3 kr3Var11 = (kr3) puVar.h();
                                    if (kr3Var11 != null) {
                                        valueOf2 = Integer.valueOf(kr3Var11.a);
                                        i26 = i72;
                                    }
                                    i26 = i72;
                                    valueOf2 = null;
                                }
                                if (i19 >= i26 && i106 <= i37) {
                                    i42 = i22;
                                }
                                int i110 = i26;
                                f34 K3 = qt6Var2.K(s21.g(i108 + i34, j), s21.f(i109 + r04, j), zt1Var, new vo3(qa4Var, arrayList2, m, a0, 1));
                                if (valueOf == null) {
                                    i27 = valueOf.intValue();
                                } else {
                                    i27 = 0;
                                }
                                if (valueOf2 == null) {
                                    i28 = valueOf2.intValue();
                                } else {
                                    i28 = 0;
                                }
                                List u0 = nw7.u0(i27, i28, arrayList2, m);
                                if (!z6) {
                                    lo4Var2 = lo4.Vertical;
                                } else {
                                    lo4Var2 = lo4.Horizontal;
                                }
                                qt6Var = qt6Var2;
                                jr3Var = new jr3(kr3Var3, i14, i42, f2, K3, f3, z9, w61Var, fq3Var, hr3Var2.d, u0, i56, i60, i110, lo4Var2, i35, i46);
                            }
                            valueOf = null;
                            if (!z4) {
                            }
                            if (i19 >= i26) {
                                i42 = i22;
                            }
                            int i1102 = i26;
                            f34 K32 = qt6Var2.K(s21.g(i108 + i34, j), s21.f(i109 + r04, j), zt1Var, new vo3(qa4Var, arrayList2, m, a0, 1));
                            if (valueOf == null) {
                            }
                            if (valueOf2 == null) {
                            }
                            List u02 = nw7.u0(i27, i28, arrayList2, m);
                            if (!z6) {
                            }
                            qt6Var = qt6Var2;
                            jr3Var = new jr3(kr3Var3, i14, i42, f2, K32, f3, z9, w61Var, fq3Var, hr3Var2.d, u02, i56, i60, i1102, lo4Var2, i35, i46);
                        } else {
                            kr3 kr3Var12 = (kr3) puVar.f();
                            if (kr3Var12 != null) {
                                valueOf = Integer.valueOf(kr3Var12.a);
                                if (!z4) {
                                }
                                if (i19 >= i26) {
                                }
                                int i11022 = i26;
                                f34 K322 = qt6Var2.K(s21.g(i108 + i34, j), s21.f(i109 + r04, j), zt1Var, new vo3(qa4Var, arrayList2, m, a0, 1));
                                if (valueOf == null) {
                                }
                                if (valueOf2 == null) {
                                }
                                List u022 = nw7.u0(i27, i28, arrayList2, m);
                                if (!z6) {
                                }
                                qt6Var = qt6Var2;
                                jr3Var = new jr3(kr3Var3, i14, i42, f2, K322, f3, z9, w61Var, fq3Var, hr3Var2.d, u022, i56, i60, i11022, lo4Var2, i35, i46);
                            }
                            valueOf = null;
                            if (!z4) {
                            }
                            if (i19 >= i26) {
                            }
                            int i110222 = i26;
                            f34 K3222 = qt6Var2.K(s21.g(i108 + i34, j), s21.f(i109 + r04, j), zt1Var, new vo3(qa4Var, arrayList2, m, a0, 1));
                            if (valueOf == null) {
                            }
                            if (valueOf2 == null) {
                            }
                            List u0222 = nw7.u0(i27, i28, arrayList2, m);
                            if (!z6) {
                            }
                            qt6Var = qt6Var2;
                            jr3Var = new jr3(kr3Var3, i14, i42, f2, K3222, f3, z9, w61Var, fq3Var, hr3Var2.d, u0222, i56, i60, i110222, lo4Var2, i35, i46);
                        }
                    }
                }
                i22 = 0;
                i23 = i21;
                int i1082 = i20;
                kr3Var = (kr3) puVar.f();
                if (kr3Var == null) {
                }
                kr3Var2 = (kr3) puVar.h();
                if (kr3Var2 == null) {
                }
                fr3Var2.b.getClass();
                List m2 = np2.m(this.h, i24, i25, arrayList2, f93.a, i38, i1082, i23, new bg2(hr3Var2, 7));
                int i1092 = i23;
                if (!z4) {
                }
            }
            pr3 pr3Var3 = pr3Var;
            pr3Var3.g(jr3Var, qt6Var.a0(), false);
            oe1 oe1Var = pr3Var3.a;
            return jr3Var;
        } catch (Throwable th) {
            ln2.V(t, N, qn2Var);
            throw th;
        }
    }
}
