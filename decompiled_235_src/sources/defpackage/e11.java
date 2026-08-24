package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e11  reason: default package */
/* loaded from: classes.dex */
public abstract class e11 {
    public static final long a = hv.c(4060612362L);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r8 == defpackage.ox0.a) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, ArrayList arrayList, qn2 qn2Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String str2;
        int i6;
        boolean z2;
        vr4 vr4Var;
        vr4 vr4Var2;
        ArrayList arrayList2;
        qn2Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(186119708);
        int i7 = 2;
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (xq2Var.h(arrayList)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        ?? r9 = 0;
        int i12 = 1;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i11 & 1, z)) {
            boolean f = xq2Var.f(arrayList);
            Object P = xq2Var.P();
            if (!f) {
                arrayList2 = P;
            }
            ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList, 10));
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                List K0 = qs6.K0((String) obj, new String[]{": "}, i7);
                String str3 = (String) K0.get(r9);
                if (K0.size() == i7) {
                    str2 = (String) K0.get(i12);
                } else {
                    str2 = null;
                }
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (qs6.j0(lowerCase, "mapping", r9) || qs6.j0(lowerCase, "назнач", r9) || qs6.j0(lowerCase, "кноп", r9) || qs6.j0(lowerCase, "клавиш", r9)) {
                    i6 = i12;
                    z2 = r9;
                    vr4Var = new vr4(ej2.G(), "Настройка назначения физических кнопок геймпада или клавиатуры");
                } else if (!qs6.j0(lowerCase, "layout", r9) && !qs6.j0(lowerCase, "расклад", r9) && !qs6.j0(lowerCase, "управлен", r9) && !qs6.j0(lowerCase, "экранн", r9)) {
                    if (!qs6.j0(lowerCase, "dual", r9) && !qs6.j0(lowerCase, "двух", r9) && !qs6.j0(lowerCase, "экран", r9)) {
                        if (!qs6.j0(lowerCase, "filter", r9) && !qs6.j0(lowerCase, "фильтр", r9)) {
                            if (!qs6.j0(lowerCase, "preset", r9) && !qs6.j0(lowerCase, "пресет", r9)) {
                                if (!qs6.j0(lowerCase, "parameter", r9) && !qs6.j0(lowerCase, "параметр", r9)) {
                                    if (!qs6.j0(lowerCase, "mic", r9) && !qs6.j0(lowerCase, "микрофон", r9)) {
                                        vr4Var = new vr4(ej2.H(), "Параметры и конфигурация для текущей игры");
                                        i6 = i12;
                                        z2 = r9;
                                    } else {
                                        e33 e33Var = np2.b;
                                        if (e33Var == null) {
                                            d33 d33Var = new d33("Filled.Mic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                            int i14 = el7.a;
                                            cn6 cn6Var = new cn6(kt0.b);
                                            ww2 ww2Var = new ww2(i12, r9);
                                            ww2Var.o(12.0f, 14.0f);
                                            ww2Var.i(1.66f, RecyclerView.B1, 2.99f, -1.34f, 2.99f, -3.0f);
                                            ww2Var.m(15.0f, 5.0f);
                                            ww2Var.i(RecyclerView.B1, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                                            ww2Var.p(9.0f, 3.34f, 9.0f, 5.0f);
                                            ww2Var.u(6.0f);
                                            ww2Var.i(RecyclerView.B1, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                                            ww2Var.g();
                                            ww2Var.o(17.3f, 11.0f);
                                            ww2Var.i(RecyclerView.B1, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f);
                                            ww2Var.p(6.7f, 14.0f, 6.7f, 11.0f);
                                            ww2Var.m(5.0f, 11.0f);
                                            ww2Var.i(RecyclerView.B1, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
                                            ww2Var.m(11.0f, 21.0f);
                                            ww2Var.l(2.0f);
                                            ww2Var.u(-3.28f);
                                            ww2Var.i(3.28f, -0.48f, 6.0f, -3.3f, 6.0f, -6.72f);
                                            ww2Var.l(-1.7f);
                                            ww2Var.g();
                                            d33.a(d33Var, ww2Var.b, 0, cn6Var);
                                            e33Var = d33Var.b();
                                            np2.b = e33Var;
                                        }
                                        vr4Var = new vr4(e33Var, "Выбор источника звука микрофона DS (микрофон устройства или шум)");
                                        z2 = false;
                                        i6 = 1;
                                    }
                                } else {
                                    vr4Var2 = new vr4(ej2.H(), "Пользовательские параметры и переменные активного шейдера");
                                }
                            } else {
                                e33 e33Var2 = u24.p;
                                if (e33Var2 == null) {
                                    d33 d33Var2 = new d33("Filled.AutoAwesome", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i15 = el7.a;
                                    cn6 cn6Var2 = new cn6(kt0.b);
                                    ww2 ww2Var2 = new ww2(1, (byte) 0);
                                    ww2Var2.o(19.0f, 9.0f);
                                    ww2Var2.n(1.25f, -2.75f);
                                    ww2Var2.m(23.0f, 5.0f);
                                    ww2Var2.n(-2.75f, -1.25f);
                                    ww2Var2.m(19.0f, 1.0f);
                                    ww2Var2.n(-1.25f, 2.75f);
                                    ww2Var2.m(15.0f, 5.0f);
                                    ww2Var2.n(2.75f, 1.25f);
                                    ww2Var2.m(19.0f, 9.0f);
                                    ww2Var2.g();
                                    ww2Var2.o(11.5f, 9.5f);
                                    ww2Var2.m(9.0f, 4.0f);
                                    ww2Var2.m(6.5f, 9.5f);
                                    ww2Var2.m(1.0f, 12.0f);
                                    ww2Var2.n(5.5f, 2.5f);
                                    ww2Var2.m(9.0f, 20.0f);
                                    ww2Var2.n(2.5f, -5.5f);
                                    ww2Var2.m(17.0f, 12.0f);
                                    ww2Var2.n(-5.5f, -2.5f);
                                    ww2Var2.g();
                                    ww2Var2.o(19.0f, 15.0f);
                                    ww2Var2.n(-1.25f, 2.75f);
                                    ww2Var2.m(15.0f, 19.0f);
                                    ww2Var2.n(2.75f, 1.25f);
                                    ww2Var2.m(19.0f, 23.0f);
                                    ww2Var2.n(1.25f, -2.75f);
                                    ww2Var2.m(23.0f, 19.0f);
                                    ww2Var2.n(-2.75f, -1.25f);
                                    ww2Var2.m(19.0f, 15.0f);
                                    ww2Var2.g();
                                    d33.a(d33Var2, ww2Var2.b, 0, cn6Var2);
                                    e33Var2 = d33Var2.b();
                                    u24.p = e33Var2;
                                }
                                vr4Var2 = new vr4(e33Var2, "Выбор файла шейдера RetroArch (.slangp / .glslp)");
                            }
                        } else {
                            e33 e33Var3 = hv.o;
                            if (e33Var3 == null) {
                                d33 d33Var3 = new d33("Filled.Filter", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                int i16 = el7.a;
                                cn6 cn6Var3 = new cn6(kt0.b);
                                ww2 ww2Var3 = new ww2(1, (byte) 0);
                                ww2Var3.o(15.96f, 10.29f);
                                ww2Var3.n(-2.75f, 3.54f);
                                ww2Var3.n(-1.96f, -2.36f);
                                ww2Var3.m(8.5f, 15.0f);
                                ww2Var3.l(11.0f);
                                ww2Var3.n(-3.54f, -4.71f);
                                ww2Var3.g();
                                ww2Var3.o(3.0f, 5.0f);
                                ww2Var3.m(1.0f, 5.0f);
                                ww2Var3.u(16.0f);
                                ww2Var3.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                ww2Var3.l(16.0f);
                                ww2Var3.u(-2.0f);
                                ww2Var3.m(3.0f, 21.0f);
                                ww2Var3.m(3.0f, 5.0f);
                                ww2Var3.g();
                                ww2Var3.o(21.0f, 1.0f);
                                ww2Var3.m(7.0f, 1.0f);
                                ww2Var3.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                                ww2Var3.u(14.0f);
                                ww2Var3.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                ww2Var3.l(14.0f);
                                ww2Var3.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                                ww2Var3.m(23.0f, 3.0f);
                                ww2Var3.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                ww2Var3.g();
                                ww2Var3.o(21.0f, 17.0f);
                                ww2Var3.m(7.0f, 17.0f);
                                ww2Var3.m(7.0f, 3.0f);
                                ww2Var3.l(14.0f);
                                ww2Var3.u(14.0f);
                                ww2Var3.g();
                                d33.a(d33Var3, ww2Var3.b, 0, cn6Var3);
                                e33Var3 = d33Var3.b();
                                hv.o = e33Var3;
                            }
                            vr4Var2 = new vr4(e33Var3, "Графический фильтр или шейдерная постобработка изображения");
                        }
                    } else {
                        vr4Var2 = new vr4(nj2.v(), "Распределение экранов DS на внешнем мониторе/ТВ с автосохранением для игры");
                    }
                    vr4Var = vr4Var2;
                    z2 = false;
                    i6 = 1;
                } else {
                    e33 e33Var4 = kn2.b;
                    if (e33Var4 != null) {
                        z2 = false;
                        i6 = 1;
                    } else {
                        d33 d33Var4 = new d33("Filled.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i17 = el7.a;
                        cn6 cn6Var4 = new cn6(kt0.b);
                        i6 = 1;
                        ww2 ww2Var4 = new ww2(1, (byte) 0);
                        ww2Var4.o(9.0f, 11.24f);
                        ww2Var4.t(7.5f);
                        ww2Var4.h(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
                        ww2Var4.p(14.0f, 6.12f, 14.0f, 7.5f);
                        ww2Var4.u(3.74f);
                        ww2Var4.i(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                        ww2Var4.h(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
                        ww2Var4.p(7.0f, 5.01f, 7.0f, 7.5f);
                        ww2Var4.h(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f);
                        ww2Var4.g();
                        ww2Var4.o(18.84f, 15.87f);
                        ww2Var4.n(-4.54f, -2.26f);
                        ww2Var4.i(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
                        ww2Var4.k(13.0f);
                        ww2Var4.u(-6.0f);
                        ww2Var4.h(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f);
                        ww2Var4.p(10.0f, 6.67f, 10.0f, 7.5f);
                        ww2Var4.u(10.74f);
                        ww2Var4.i(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f);
                        ww2Var4.i(-0.31f, RecyclerView.B1, -0.59f, 0.13f, -0.79f, 0.33f);
                        ww2Var4.n(-0.79f, 0.8f);
                        ww2Var4.n(4.94f, 4.94f);
                        ww2Var4.h(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f);
                        ww2Var4.l(6.79f);
                        ww2Var4.i(0.75f, RecyclerView.B1, 1.33f, -0.55f, 1.44f, -1.28f);
                        ww2Var4.n(0.75f, -5.27f);
                        ww2Var4.i(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
                        ww2Var4.h(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f);
                        ww2Var4.g();
                        z2 = false;
                        d33.a(d33Var4, ww2Var4.b, 0, cn6Var4);
                        e33Var4 = d33Var4.b();
                        kn2.b = e33Var4;
                    }
                    vr4Var = new vr4(e33Var4, "Выбор и редактирование расположения сенсорных кнопок на экране");
                }
                arrayList3.add(new d11(str3, str2, (String) vr4Var.B, (e33) vr4Var.A));
                r9 = z2;
                i12 = i6;
                i7 = 2;
            }
            xq2Var.l0(arrayList3);
            arrayList2 = arrayList3;
            b(str, (List) arrayList2, qn2Var, on2Var, xq2Var, i11 & 8078);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new p4((Object) str, (Object) arrayList, qn2Var, on2Var, i, 4);
        }
    }

    public static final void b(String str, List list, qn2 qn2Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        a74 a74Var;
        long j;
        float f;
        float f2;
        r94 r94Var;
        long c;
        boolean z5;
        jy2 jy2Var;
        Iterator it;
        nh2 nh2Var;
        d11 d11Var;
        pn pnVar;
        c40 c40Var;
        pn pnVar2;
        vs0 vs0Var;
        d40 d40Var;
        float f3;
        float f4;
        long j2;
        int i6;
        boolean z6;
        e33 e33Var;
        d11 d11Var2;
        long c2;
        jy2 jy2Var2 = u24.m;
        d40 d40Var2 = d90.i0;
        c40 c40Var2 = d90.k0;
        e40 e40Var = d90.L;
        list.getClass();
        qn2Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-950762260);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (xq2Var.h(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            vs0 vs0Var2 = ox0.a;
            if (P == vs0Var2) {
                P = new nh2();
                xq2Var.l0(P);
            }
            nh2 nh2Var2 = (nh2) P;
            int i11 = i10 & 7168;
            if (i11 == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = xq2Var.P();
            if (z2 || P2 == vs0Var2) {
                P2 = new x7(6, on2Var);
                xq2Var.l0(P2);
            }
            ge7.b(false, (on2) P2, xq2Var, 0, 1);
            lc2 lc2Var = dj6.c;
            a74 L = vy7.L(lc2Var, a, jy2Var2);
            Object P3 = xq2Var.P();
            if (P3 == vs0Var2) {
                P3 = new vn0(14);
                xq2Var.l0(P3);
            }
            a74 y = ge7.y(L, (qn2) P3);
            Object P4 = xq2Var.P();
            if (P4 == vs0Var2) {
                P4 = i61.f(xq2Var);
            }
            r94 r94Var2 = (r94) P4;
            if (i11 == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P5 = xq2Var.P();
            if (z3 || P5 == vs0Var2) {
                P5 = new x7(7, on2Var);
                xq2Var.l0(P5);
            }
            a74 t = mb3.t(y, r94Var2, null, false, null, (on2) P5, 28);
            if (i11 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P6 = xq2Var.P();
            if (z4 || P6 == vs0Var2) {
                P6 = new m01(2, on2Var);
                xq2Var.l0(P6);
            }
            a74 B = u24.B(t, (qn2) P6);
            e34 d = h70.d(e40Var, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, B);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar3 = ix0.f;
            yh2.K(xq2Var, pnVar3, d);
            pn pnVar4 = ix0.e;
            yh2.K(xq2Var, pnVar4, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar5 = ix0.g;
            yh2.K(xq2Var, pnVar5, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar6 = ix0.d;
            yh2.K(xq2Var, pnVar6, E);
            a74 j0 = nc1.j0(lc2Var, nc1.o);
            Object P7 = xq2Var.P();
            e40 e40Var2 = e40Var;
            if (P7 == vs0Var2) {
                P7 = new vn0(15);
                xq2Var.l0(P7);
            }
            a74 y2 = ge7.y(j0, (qn2) P7);
            Object P8 = xq2Var.P();
            if (P8 == vs0Var2) {
                P8 = i61.f(xq2Var);
            }
            r94 r94Var3 = (r94) P8;
            Object P9 = xq2Var.P();
            if (P9 == vs0Var2) {
                P9 = new c5(22);
                xq2Var.l0(P9);
            }
            a74 t2 = mb3.t(y2, r94Var3, null, false, null, (on2) P9, 28);
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var2, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, t2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, a2);
            yh2.K(xq2Var, pnVar4, l2);
            i61.w(hashCode2, xq2Var, pnVar5, xq2Var, neVar);
            yh2.K(xq2Var, pnVar6, E2);
            x64 x64Var = x64.a;
            a74 R = ge7.R(dj6.c(x64Var, 1.0f), 12.0f, 8.0f, 22.0f, 8.0f);
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var2, xq2Var, 48);
            d40 d40Var3 = d40Var2;
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, R);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, a3);
            yh2.K(xq2Var, pnVar4, l3);
            i61.w(hashCode3, xq2Var, pnVar5, xq2Var, neVar);
            yh2.K(xq2Var, pnVar6, E3);
            a74 g = u24.g(dj6.i(x64Var, 38.0f), z16.a);
            Object P10 = xq2Var.P();
            if (P10 == vs0Var2) {
                P10 = new vn0(16);
                xq2Var.l0(P10);
            }
            a74 u = mb3.u(ge7.y(g, (qn2) P10), false, null, on2Var, 15);
            e34 d2 = h70.d(d90.Z, false);
            du duVar2 = duVar;
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, u);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, d2);
            yh2.K(xq2Var, pnVar4, l4);
            i61.w(hashCode4, xq2Var, pnVar5, xq2Var, neVar);
            yh2.K(xq2Var, pnVar6, E4);
            e33 q = jw2.q();
            int i12 = kt0.i;
            long j3 = kt0.d;
            vs0 vs0Var3 = vs0Var2;
            nh2 nh2Var3 = nh2Var2;
            i13.a(q, null, dj6.i(x64Var, 20.0f), j3, xq2Var, 3504, 0);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 10.0f));
            e33 H = ej2.H();
            long j4 = F.j;
            long j5 = F.j;
            boolean z7 = true;
            i13.a(H, null, dj6.i(x64Var, 20.0f), j4, xq2Var, 432, 0);
            gi2.h(xq2Var, dj6.l(x64Var, 10.0f));
            int i13 = i10;
            eu euVar2 = euVar;
            int i14 = 2;
            float f5 = 12.0f;
            x37.b(str, null, j3, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, (i10 & 14) | 1772928, 3120, 120722);
            xq2 xq2Var2 = xq2Var;
            xq2Var2.p(true);
            int i15 = 6;
            h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), kt0.c(0.09f, j3), jy2Var2), xq2Var2, 6);
            gu guVar = new gu(8.0f, true, new i(1));
            a74 P11 = ge7.P(nb3.W(dj6.c(dj6.m(680.0f, 1, zt0.a(x64Var)).d(new cy2(d90.l0)), 1.0f), nb3.U(xq2Var2), true), 18.0f, 14.0f);
            c40 c40Var3 = c40Var2;
            yt0 a4 = wt0.a(guVar, c40Var3, xq2Var2, 6);
            int hashCode5 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E5 = l.E(xq2Var2, P11);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar3, a4);
            yh2.K(xq2Var2, pnVar4, l5);
            i61.w(hashCode5, xq2Var2, pnVar5, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar6, E5);
            xq2Var2.b0(-145403326);
            Iterator it2 = list.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i17 = i16 + 1;
                if (i16 >= 0) {
                    d11 d11Var3 = (d11) next;
                    Object P12 = xq2Var2.P();
                    vs0 vs0Var4 = vs0Var3;
                    if (P12 == vs0Var4) {
                        P12 = i61.f(xq2Var2);
                    }
                    r94 r94Var4 = (r94) P12;
                    qa4 a5 = bw7.a(r94Var4, xq2Var2, i15);
                    y16 b2 = z16.b(f5);
                    a74 g2 = u24.g(dj6.f(dj6.c(x64Var, 1.0f), 52.0f, RecyclerView.B1, i14), b2);
                    if (((Boolean) a5.getValue()).booleanValue()) {
                        int i18 = kt0.i;
                        a74Var = g2;
                        j = kt0.d;
                        f = 0.16f;
                    } else {
                        a74Var = g2;
                        int i19 = kt0.i;
                        j = kt0.d;
                        f = 0.05f;
                    }
                    a74 L2 = vy7.L(a74Var, kt0.c(f, j), jy2Var2);
                    if (((Boolean) a5.getValue()).booleanValue()) {
                        f2 = 2.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (((Boolean) a5.getValue()).booleanValue()) {
                        r94Var = r94Var4;
                        c = j5;
                    } else {
                        int i20 = kt0.i;
                        r94Var = r94Var4;
                        c = kt0.c(0.1f, kt0.d);
                    }
                    a74 I = ak7.I(L2, f2, c, b2);
                    if (i16 == 0) {
                        I = ak7.S(I, nh2Var3);
                    }
                    a74 a74Var2 = I;
                    int i21 = i13;
                    if ((i21 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean d3 = z5 | xq2Var2.d(i16);
                    Object P13 = xq2Var2.P();
                    if (d3 || P13 == vs0Var4) {
                        P13 = new k01(qn2Var, i16, 1);
                        xq2Var2.l0(P13);
                    }
                    a74 P14 = ge7.P(mb3.t(a74Var2, r94Var, null, false, null, (on2) P13, 28), 14.0f, f5);
                    d40 d40Var4 = d40Var3;
                    l26 a6 = k26.a(duVar2, d40Var4, xq2Var2, 48);
                    i13 = i21;
                    int hashCode6 = Long.hashCode(xq2Var2.T);
                    xv4 l6 = xq2Var2.l();
                    a74 E6 = l.E(xq2Var2, P14);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar7 = ix0.f;
                    yh2.K(xq2Var2, pnVar7, a6);
                    pn pnVar8 = ix0.e;
                    yh2.K(xq2Var2, pnVar8, l6);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    pn pnVar9 = ix0.g;
                    yh2.K(xq2Var2, pnVar9, valueOf2);
                    ne neVar2 = ix0.h;
                    yh2.F(xq2Var2, neVar2);
                    pn pnVar10 = ix0.d;
                    yh2.K(xq2Var2, pnVar10, E6);
                    if (d11Var3.d != null) {
                        xq2Var2.b0(-1254435045);
                        e33 e33Var2 = d11Var3.d;
                        if (((Boolean) a5.getValue()).booleanValue()) {
                            it = it2;
                            e33Var = e33Var2;
                            d11Var2 = d11Var3;
                            c2 = j5;
                        } else {
                            int i22 = kt0.i;
                            e33Var = e33Var2;
                            d11Var2 = d11Var3;
                            it = it2;
                            c2 = kt0.c(0.8f, kt0.d);
                        }
                        jy2Var = jy2Var2;
                        nh2Var = nh2Var3;
                        pnVar = pnVar8;
                        pnVar2 = pnVar10;
                        d11Var = d11Var2;
                        c40Var = c40Var3;
                        vs0Var = vs0Var4;
                        d40Var = d40Var4;
                        i13.a(e33Var, null, dj6.i(x64Var, 24.0f), c2, xq2Var2, 432, 0);
                        gi2.h(xq2Var2, dj6.l(x64Var, 14.0f));
                        xq2Var2.p(false);
                    } else {
                        jy2Var = jy2Var2;
                        it = it2;
                        nh2Var = nh2Var3;
                        d11Var = d11Var3;
                        pnVar = pnVar8;
                        c40Var = c40Var3;
                        pnVar2 = pnVar10;
                        vs0Var = vs0Var4;
                        d40Var = d40Var4;
                        xq2Var2.b0(-1254019893);
                        xq2Var2.p(false);
                    }
                    if (1.0f <= 0.0d) {
                        n53.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f3 = Float.MAX_VALUE;
                    } else {
                        f3 = 1.0f;
                    }
                    vn3 vn3Var = new vn3(f3, true);
                    eu euVar3 = euVar2;
                    yt0 a7 = wt0.a(euVar3, c40Var, xq2Var2, 0);
                    int hashCode7 = Long.hashCode(xq2Var2.T);
                    xv4 l7 = xq2Var2.l();
                    a74 E7 = l.E(xq2Var2, vn3Var);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar7, a7);
                    yh2.K(xq2Var2, pnVar, l7);
                    i61.w(hashCode7, xq2Var2, pnVar9, xq2Var2, neVar2);
                    pn pnVar11 = pnVar2;
                    yh2.K(xq2Var2, pnVar11, E7);
                    gu guVar2 = new gu(8.0f, true, new i(1));
                    a74 c3 = dj6.c(x64Var, 1.0f);
                    c40 c40Var4 = c40Var;
                    d40 d40Var5 = d40Var;
                    l26 a8 = k26.a(guVar2, d40Var5, xq2Var2, 54);
                    int hashCode8 = Long.hashCode(xq2Var2.T);
                    xv4 l8 = xq2Var2.l();
                    a74 E8 = l.E(xq2Var2, c3);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar7, a8);
                    yh2.K(xq2Var2, pnVar, l8);
                    i61.w(hashCode8, xq2Var2, pnVar9, xq2Var2, neVar2);
                    yh2.K(xq2Var2, pnVar11, E8);
                    euVar2 = euVar3;
                    d11 d11Var4 = d11Var;
                    String str2 = d11Var4.a;
                    int i23 = kt0.i;
                    long j6 = kt0.d;
                    long D = hi2.D(13.5d);
                    long D2 = hi2.D(17.5d);
                    xq2 xq2Var3 = xq2Var2;
                    oj2 oj2Var = oj2.e0;
                    if (1.0f <= 0.0d) {
                        n53.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f4 = Float.MAX_VALUE;
                    } else {
                        f4 = 1.0f;
                    }
                    du duVar3 = duVar2;
                    x37.b(str2, new vn3(f4, true), j6, D, oj2Var, null, 0L, null, D2, 0, false, 0, 0, null, null, xq2Var3, 200064, 6, 130000);
                    xq2Var2 = xq2Var3;
                    if (d11Var4.b != null) {
                        xq2Var2.b0(1125110463);
                        jy2 jy2Var3 = jy2Var;
                        a74 P15 = ge7.P(vy7.L(u24.g(x64Var, z16.b(6.0f)), kt0.c(0.12f, j6), jy2Var3), 8.0f, 3.0f);
                        e40 e40Var3 = e40Var2;
                        e34 d4 = h70.d(e40Var3, false);
                        int hashCode9 = Long.hashCode(xq2Var2.T);
                        xv4 l9 = xq2Var2.l();
                        a74 E9 = l.E(xq2Var2, P15);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var2);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar7, d4);
                        yh2.K(xq2Var2, pnVar, l9);
                        i61.w(hashCode9, xq2Var2, pnVar9, xq2Var2, neVar2);
                        yh2.K(xq2Var2, pnVar11, E9);
                        j2 = j6;
                        e40Var2 = e40Var3;
                        jy2Var = jy2Var3;
                        i6 = 6;
                        x37.b(d11Var4.b, null, es7.p, hi2.D(11.5d), oj2.d0, null, 0L, new wz6(6), hi2.E(14), 0, false, 0, 0, null, null, xq2Var2, 200064, 6, 129490);
                        xq2Var2 = xq2Var2;
                        z6 = true;
                        xq2Var2.p(true);
                        xq2Var2.p(false);
                    } else {
                        j2 = j6;
                        i6 = 6;
                        z6 = true;
                        xq2Var2.b0(1126100293);
                        xq2Var2.p(false);
                    }
                    xq2Var2.p(z6);
                    if (d11Var4.c != null) {
                        xq2Var2.b0(-1834553436);
                        gi2.h(xq2Var2, dj6.e(x64Var, 4.0f));
                        xq2 xq2Var4 = xq2Var2;
                        x37.b(d11Var4.c, null, kt0.c(0.65f, j2), hi2.E(11), null, null, 0L, null, hi2.E(15), 0, false, 0, 0, null, null, xq2Var4, 3456, 6, 130034);
                        xq2Var2 = xq2Var4;
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-1834156543);
                        xq2Var2.p(false);
                    }
                    xq2Var2.p(true);
                    gi2.h(xq2Var2, dj6.l(x64Var, 10.0f));
                    i13.a(mp2.J(), null, dj6.i(x64Var, 18.0f), kt0.c(0.45f, j2), xq2Var2, 3504, 0);
                    xq2Var2.p(true);
                    i15 = i6;
                    z7 = true;
                    it2 = it;
                    i16 = i17;
                    nh2Var3 = nh2Var;
                    jy2Var2 = jy2Var;
                    d40Var3 = d40Var5;
                    duVar2 = duVar3;
                    vs0Var3 = vs0Var;
                    c40Var3 = c40Var4;
                    f5 = 12.0f;
                    i14 = 2;
                } else {
                    hf.q0();
                    throw null;
                }
            }
            xq2Var2.p(false);
            xq2Var2.p(z7);
            xq2 xq2Var5 = xq2Var2;
            is7.a(hf.c0(new rq2(null, yh2.O(xq2Var2, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var2, R.string.pause_hint_accept)), new rq2("B", yh2.O(xq2Var2, R.string.pause_hint_back))), null, false, xq2Var5, 0, 6);
            xq2Var = xq2Var5;
            xq2Var.p(true);
            is7.b(nh2Var3, xq2Var, i15);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new p4(str, list, qn2Var, on2Var, i);
        }
    }
}
