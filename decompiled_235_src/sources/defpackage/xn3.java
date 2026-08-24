package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xn3 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    public /* synthetic */ xn3(nh2 nh2Var, List list, UUID uuid, qn2 qn2Var, qn2 qn2Var2, qn2 qn2Var3, na4 na4Var, qn2 qn2Var4) {
        this.A = 0;
        this.Y = nh2Var;
        this.Z = list;
        this.d0 = uuid;
        this.B = qn2Var;
        this.L = qn2Var2;
        this.R = qn2Var3;
        this.e0 = na4Var;
        this.X = qn2Var4;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0308  */
    @Override // defpackage.fo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        nx5 nx5Var;
        on2 tt5Var;
        nx5 nx5Var2;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        String str2;
        String str3;
        Object P;
        boolean z8;
        Object obj4;
        int i3 = this.A;
        vs0 vs0Var = ox0.a;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.e0;
        Object obj6 = this.X;
        Object obj7 = this.R;
        Object obj8 = this.L;
        Object obj9 = this.B;
        Object obj10 = this.d0;
        Object obj11 = this.Z;
        Object obj12 = this.Y;
        switch (i3) {
            case 0:
                nh2 nh2Var = (nh2) obj12;
                List list = (List) obj11;
                UUID uuid = (UUID) obj10;
                qn2 qn2Var = (qn2) obj9;
                qn2 qn2Var2 = (qn2) obj8;
                qn2 qn2Var3 = (qn2) obj7;
                na4 na4Var = (na4) obj5;
                qn2 qn2Var4 = (qn2) obj6;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    WeakHashMap weakHashMap = dv7.w;
                    ig7 ig7Var = th7.d(xq2Var).l;
                    qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
                    a74 s = q60.s(ak7.S(dj6.c, nh2Var), lq4Var);
                    kk3 kk3Var = kk3.Ltr;
                    pq4 pq4Var = new pq4(qh1Var.Q(ig7Var.d(qh1Var, kk3Var)) + 16.0f, lq4Var.d() + 12.0f, qh1Var.Q(ig7Var.b(qh1Var, kk3Var)) + 16.0f, lq4Var.a() + 12.0f);
                    gu guVar = new gu(8.0f, true, new i(1));
                    boolean h = xq2Var.h(list) | xq2Var.h(uuid) | xq2Var.f(qn2Var) | xq2Var.f(qn2Var2) | xq2Var.f(qn2Var3) | xq2Var.h(na4Var) | xq2Var.f(qn2Var4);
                    Object P2 = xq2Var.P();
                    if (h || P2 == vs0Var) {
                        P2 = new z00(list, uuid, qn2Var, qn2Var2, qn2Var3, na4Var, qn2Var4, 1);
                        xq2Var.l0(P2);
                    }
                    gi2.e(s, null, pq4Var, guVar, null, null, false, null, (qn2) P2, xq2Var, 24576, 490);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                kk6 kk6Var = (kk6) obj12;
                b.a aVar = (b.a) obj11;
                on2 on2Var = (on2) obj10;
                on2 on2Var2 = (on2) obj5;
                qn2 qn2Var5 = (qn2) obj9;
                qn2 qn2Var6 = (qn2) obj8;
                qn2 qn2Var7 = (qn2) obj7;
                qn2 qn2Var8 = (qn2) obj6;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    x73.e(kk6Var, aVar, on2Var, on2Var2, qn2Var5, qn2Var6, qn2Var7, qn2Var8, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                zt5 zt5Var = (zt5) obj12;
                String str4 = (String) obj11;
                String[] strArr = (String[]) obj10;
                mi6 mi6Var = (mi6) obj8;
                Context context = (Context) obj7;
                qn2 qn2Var9 = (qn2) obj9;
                j04 j04Var = (j04) obj6;
                pq5 pq5Var = (pq5) obj5;
                zt0 zt0Var = (zt0) obj;
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                zt0Var.getClass();
                if ((intValue3 & 6) == 0) {
                    if (((xq2) px0Var3).f(zt0Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue3 |= i2;
                }
                int i4 = intValue3;
                if ((i4 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(i4 & 1, z3)) {
                    String O = yh2.O(xq2Var3, R.string.label_rom_config_input_mode);
                    nx5 nx5Var3 = zt5Var.k;
                    if (nx5Var3 == nx5.GLOBAL) {
                        str = qo2.c(context, str4);
                    } else {
                        str = strArr[nx5Var3.ordinal()];
                    }
                    String str5 = str;
                    nx5 nx5Var4 = nx5.CUSTOM;
                    if (nx5Var3 == nx5Var4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean f = xq2Var3.f(mi6Var) | xq2Var3.h(context) | xq2Var3.f(str4) | xq2Var3.h(strArr) | xq2Var3.h(zt5Var) | xq2Var3.f(qn2Var9);
                    Object P3 = xq2Var3.P();
                    if (f || P3 == vs0Var) {
                        nx5Var = nx5Var3;
                        nx5Var2 = nx5Var4;
                        tt5Var = new tt5(mi6Var, context, zt5Var, str4, strArr, qn2Var9, 1);
                        xq2Var3.l0(tt5Var);
                    } else {
                        tt5Var = P3;
                        nx5Var = nx5Var3;
                        nx5Var2 = nx5Var4;
                    }
                    lt5.a(O, str5, false, z4, tt5Var, xq2Var3, 0, 4);
                    if (nx5Var == nx5Var2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    g04.c(zt0Var, z5, null, null, null, null, n16.I(-262935005, new m4(j04Var, context, pq5Var, 9), xq2Var3), xq2Var3, (i4 & 14) | 1572864);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                eo2 eo2Var = (eo2) obj12;
                on2 on2Var3 = (on2) obj11;
                qa4 qa4Var = (qa4) obj10;
                qa4 qa4Var2 = (qa4) obj9;
                qa4 qa4Var3 = (qa4) obj8;
                qa4 qa4Var4 = (qa4) obj7;
                qa4 qa4Var5 = (qa4) obj6;
                qa4 qa4Var6 = (qa4) obj5;
                px0 px0Var4 = (px0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z6)) {
                    if (!((Boolean) qa4Var.getValue()).booleanValue() && !((Boolean) qa4Var2.getValue()).booleanValue()) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    boolean f2 = xq2Var4.f(eo2Var);
                    Object P4 = xq2Var4.P();
                    if (f2 || P4 == vs0Var) {
                        P4 = new s27(eo2Var, qa4Var, qa4Var2, 2);
                        xq2Var4.l0(P4);
                    }
                    hi2.o("Включить озвучку диалогов", z7, (qn2) P4, xq2Var4, 6);
                    if (!((Boolean) qa4Var.getValue()).booleanValue() && !((Boolean) qa4Var2.getValue()).booleanValue()) {
                        xq2Var4.b0(1478989045);
                        xq2Var4.p(false);
                    } else {
                        xq2Var4.b0(1477350540);
                        l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                        String str6 = (String) qa4Var3.getValue();
                        if (nb3.k(str6, "neural_edge")) {
                            str2 = "⚡ Нейро-голоса Edge Cloud";
                        } else if (nb3.k(str6, "local_multi")) {
                            str2 = "🎙️ Локальный AI Studio (Piper INT8)";
                        } else {
                            str2 = "🤖 Системный Android TTS";
                        }
                        Object P5 = xq2Var4.P();
                        if (P5 == vs0Var) {
                            P5 = new fb7(qa4Var4, 0);
                            xq2Var4.l0(P5);
                        }
                        hi2.l("Голос / Движок озвучки", str2, (on2) P5, xq2Var4, 390);
                        l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                        String str7 = (String) qa4Var5.getValue();
                        int hashCode = str7.hashCode();
                        if (hashCode != 3201) {
                            if (hashCode != 3241) {
                                if (hashCode != 3246) {
                                    if (hashCode != 3276) {
                                        if (hashCode != 3383) {
                                            if (hashCode != 3651) {
                                                if (hashCode != 3886) {
                                                    if (hashCode == 3005871 && str7.equals("auto")) {
                                                        str3 = "🌐 Автовыбор (по языку)";
                                                        P = xq2Var4.P();
                                                        if (P == vs0Var) {
                                                            P = new fb7(qa4Var6, 1);
                                                            xq2Var4.l0(P);
                                                        }
                                                        hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                                        l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                                        hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                                        xq2Var4.p(false);
                                                    }
                                                    str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                                                    str3.getClass();
                                                    P = xq2Var4.P();
                                                    if (P == vs0Var) {
                                                    }
                                                    hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                                    l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                                    hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                                    xq2Var4.p(false);
                                                } else {
                                                    if (str7.equals("zh")) {
                                                        str3 = "🇨🇳 Китайский";
                                                        P = xq2Var4.P();
                                                        if (P == vs0Var) {
                                                        }
                                                        hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                                        l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                                        hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                                        xq2Var4.p(false);
                                                    }
                                                    str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                                                    str3.getClass();
                                                    P = xq2Var4.P();
                                                    if (P == vs0Var) {
                                                    }
                                                    hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                                    l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                                    hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                                    xq2Var4.p(false);
                                                }
                                            } else {
                                                if (str7.equals("ru")) {
                                                    str3 = "🇷🇺 Русский";
                                                    P = xq2Var4.P();
                                                    if (P == vs0Var) {
                                                    }
                                                    hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                                    l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                                    hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                                    xq2Var4.p(false);
                                                }
                                                str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                                                str3.getClass();
                                                P = xq2Var4.P();
                                                if (P == vs0Var) {
                                                }
                                                hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                                l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                                hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                                xq2Var4.p(false);
                                            }
                                        } else {
                                            if (str7.equals("ja")) {
                                                str3 = "🇯🇵 Японский";
                                                P = xq2Var4.P();
                                                if (P == vs0Var) {
                                                }
                                                hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                                l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                                hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                                xq2Var4.p(false);
                                            }
                                            str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                                            str3.getClass();
                                            P = xq2Var4.P();
                                            if (P == vs0Var) {
                                            }
                                            hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                            l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                            hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                            xq2Var4.p(false);
                                        }
                                    } else {
                                        if (str7.equals("fr")) {
                                            str3 = "🇫🇷 Французский";
                                            P = xq2Var4.P();
                                            if (P == vs0Var) {
                                            }
                                            hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                            l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                            hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                            xq2Var4.p(false);
                                        }
                                        str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                                        str3.getClass();
                                        P = xq2Var4.P();
                                        if (P == vs0Var) {
                                        }
                                        hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                        l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                        hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                        xq2Var4.p(false);
                                    }
                                } else {
                                    if (str7.equals("es")) {
                                        str3 = "🇪🇸 Испанский";
                                        P = xq2Var4.P();
                                        if (P == vs0Var) {
                                        }
                                        hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                        l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                        hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                        xq2Var4.p(false);
                                    }
                                    str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                                    str3.getClass();
                                    P = xq2Var4.P();
                                    if (P == vs0Var) {
                                    }
                                    hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                    l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                    hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                    xq2Var4.p(false);
                                }
                            } else {
                                if (str7.equals("en")) {
                                    str3 = "🇬🇧 Английский";
                                    P = xq2Var4.P();
                                    if (P == vs0Var) {
                                    }
                                    hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                    l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                    hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                    xq2Var4.p(false);
                                }
                                str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                                str3.getClass();
                                P = xq2Var4.P();
                                if (P == vs0Var) {
                                }
                                hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                xq2Var4.p(false);
                            }
                        } else {
                            if (str7.equals("de")) {
                                str3 = "🇩🇪 Немецкий";
                                P = xq2Var4.P();
                                if (P == vs0Var) {
                                }
                                hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                                l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                                hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                                xq2Var4.p(false);
                            }
                            str3 = ((String) qa4Var5.getValue()).toUpperCase(Locale.ROOT);
                            str3.getClass();
                            P = xq2Var4.P();
                            if (P == vs0Var) {
                            }
                            hi2.l("Язык озвучки", str3, (on2) P, xq2Var4, 390);
                            l.c(null, bl2.F(xq2Var4).f, RecyclerView.B1, xq2Var4, 0, 13);
                            hi2.l("Проверить голос ▶️", "", on2Var3, xq2Var4, 54);
                            xq2Var4.p(false);
                        }
                    }
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            default:
                eo2 eo2Var2 = (eo2) obj12;
                Context context2 = (Context) obj11;
                qa4 qa4Var7 = (qa4) obj10;
                qa4 qa4Var8 = (qa4) obj9;
                qa4 qa4Var9 = (qa4) obj8;
                qa4 qa4Var10 = (qa4) obj7;
                qa4 qa4Var11 = (qa4) obj6;
                qa4 qa4Var12 = (qa4) obj5;
                px0 px0Var5 = (px0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z8)) {
                    boolean booleanValue = ((Boolean) qa4Var7.getValue()).booleanValue();
                    boolean f3 = xq2Var5.f(eo2Var2);
                    Object P6 = xq2Var5.P();
                    if (f3 || P6 == vs0Var) {
                        P6 = new cn(eo2Var2, qa4Var7, qa4Var8, qa4Var9, 11);
                        xq2Var5.l0(P6);
                    }
                    hi2.o("AI Voice Actor Studio", booleanValue, (qn2) P6, xq2Var5, 6);
                    if (((Boolean) qa4Var7.getValue()).booleanValue()) {
                        xq2Var5.b0(-464485715);
                        l.c(null, bl2.F(xq2Var5).f, RecyclerView.B1, xq2Var5, 0, 13);
                        List u = ii2.u(context2);
                        Iterator it = u.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = it.next();
                                if (((xx3) obj4).a.equals((String) qa4Var10.getValue())) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        xx3 xx3Var = (xx3) obj4;
                        if (xx3Var == null) {
                            xx3Var = (xx3) gt0.H0(u);
                        }
                        String str8 = xx3Var.b;
                        Object P7 = xq2Var5.P();
                        if (P7 == vs0Var) {
                            P7 = new oe4(qa4Var11, 29);
                            xq2Var5.l0(P7);
                        }
                        hi2.l("Пакет нейромоделей", str8, (on2) P7, xq2Var5, 390);
                        l.c(null, bl2.F(xq2Var5).f, RecyclerView.B1, xq2Var5, 0, 13);
                        float floatValue = ((Number) qa4Var12.getValue()).floatValue();
                        bs0 bs0Var = new bs0(RecyclerView.B1, 100.0f);
                        String str9 = ((int) ((Number) qa4Var12.getValue()).floatValue()) + "%";
                        boolean f4 = xq2Var5.f(eo2Var2);
                        Object P8 = xq2Var5.P();
                        if (f4 || P8 == vs0Var) {
                            P8 = new cb7(eo2Var2, qa4Var12, 1);
                            xq2Var5.l0(P8);
                        }
                        hi2.n("Вариативность тембра", floatValue, bs0Var, 19, str9, (qn2) P8, xq2Var5, 3078);
                        xq2Var5.p(false);
                    } else {
                        xq2Var5.b0(-463339242);
                        xq2Var5.p(false);
                    }
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ xn3(eo2 eo2Var, Object obj, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, qa4 qa4Var5, qa4 qa4Var6, int i) {
        this.A = i;
        this.Y = eo2Var;
        this.Z = obj;
        this.d0 = qa4Var;
        this.B = qa4Var2;
        this.L = qa4Var3;
        this.R = qa4Var4;
        this.X = qa4Var5;
        this.e0 = qa4Var6;
    }

    public /* synthetic */ xn3(zt5 zt5Var, String str, String[] strArr, mi6 mi6Var, Context context, qn2 qn2Var, j04 j04Var, pq5 pq5Var) {
        this.A = 2;
        this.Y = zt5Var;
        this.Z = str;
        this.d0 = strArr;
        this.L = mi6Var;
        this.R = context;
        this.B = qn2Var;
        this.X = j04Var;
        this.e0 = pq5Var;
    }

    public /* synthetic */ xn3(kk6 kk6Var, b.a aVar, on2 on2Var, on2 on2Var2, qn2 qn2Var, qn2 qn2Var2, qn2 qn2Var3, qn2 qn2Var4) {
        this.A = 1;
        this.Y = kk6Var;
        this.Z = aVar;
        this.d0 = on2Var;
        this.e0 = on2Var2;
        this.B = qn2Var;
        this.L = qn2Var2;
        this.R = qn2Var3;
        this.X = qn2Var4;
    }
}
