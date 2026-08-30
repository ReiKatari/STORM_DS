package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.UUID;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zg3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zg3 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;

    public /* synthetic */ zg3(wc2 wc2Var, List list, UUID uuid, mi2 mi2Var, mi2 mi2Var2, h24 h24Var, mi2 mi2Var3) {
        this.A = 0;
        this.B = wc2Var;
        this.L = list;
        this.R = uuid;
        this.X = mi2Var;
        this.Y = mi2Var2;
        this.c0 = h24Var;
        this.Z = mi2Var3;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        String str;
        int i2;
        boolean z2;
        boolean z3;
        jj5 jj5Var;
        sk2 sk2Var;
        int i3;
        int i4 = this.A;
        o27 o27Var = o27.a;
        sn1 sn1Var = su0.a;
        Object obj4 = this.c0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        Object obj7 = this.X;
        Object obj8 = this.R;
        Object obj9 = this.L;
        Object obj10 = this.B;
        boolean z4 = false;
        switch (i4) {
            case 0:
                wc2 wc2Var = (wc2) obj10;
                List list = (List) obj9;
                UUID uuid = (UUID) obj8;
                mi2 mi2Var = (mi2) obj7;
                mi2 mi2Var2 = (mi2) obj6;
                h24 h24Var = (h24) obj4;
                mi2 mi2Var3 = (mi2) obj5;
                ih4 ih4Var = (ih4) obj;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ih4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((sk2) tu0Var).f(ih4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z4 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(intValue & 1, z4)) {
                    zy3 B = l07.B(b53.I(o76.c, wc2Var), ih4Var);
                    mh4 mh4Var = new mh4(16.0f, ih4Var.d() + 12.0f, 16.0f, ih4Var.c() + 12.0f);
                    ot otVar = new ot(8.0f, true, new i(1));
                    boolean h = sk2Var2.h(list) | sk2Var2.h(uuid) | sk2Var2.f(mi2Var) | sk2Var2.f(mi2Var2) | sk2Var2.h(h24Var) | sk2Var2.f(mi2Var3);
                    Object L = sk2Var2.L();
                    if (h || L == sn1Var) {
                        L = new f50(list, uuid, mi2Var, mi2Var2, h24Var, mi2Var3);
                        sk2Var2.h0(L);
                    }
                    io2.b(B, null, mh4Var, otVar, null, null, false, null, (mi2) L, sk2Var2, 24576, 490);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 1:
                uq6 uq6Var = (uq6) obj10;
                k24 k24Var = (k24) obj9;
                String str2 = (String) obj8;
                String[] strArr = (String[]) obj7;
                k24 k24Var2 = (k24) obj6;
                k24 k24Var3 = (k24) obj5;
                pj4 pj4Var = (pj4) obj4;
                ih4 ih4Var2 = (ih4) obj;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ih4Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ih4Var2)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var2;
                if (sk2Var3.O(intValue2 & 1, z)) {
                    String X = me2.X(sk2Var3, R.string.layout_name);
                    String str3 = (String) k24Var.getValue();
                    if (str3 == null) {
                        str3 = b31.o(sk2Var3, 1779153475, R.string.not_set, sk2Var3, false);
                    } else {
                        sk2Var3.X(1779153227);
                        sk2Var3.p(false);
                    }
                    String str4 = str3;
                    boolean f = sk2Var3.f(uq6Var) | sk2Var3.f(k24Var) | sk2Var3.f(str2);
                    Object L2 = sk2Var3.L();
                    if (f || L2 == sn1Var) {
                        L2 = new t6(uq6Var, str2, k24Var, 12);
                        sk2Var3.h0(L2);
                    }
                    ye6 ye6Var = ov0.n;
                    dt3.e(X, str4, false, (ki2) L2, b53.B(ih4Var2, (sd3) sk2Var3.j(ye6Var)), sk2Var3, 0);
                    String X2 = me2.X(sk2Var3, R.string.layout_orientation);
                    int ordinal = ((kd3) k24Var2.getValue()).ordinal();
                    if (ordinal >= 0 && ordinal < strArr.length) {
                        str = strArr[ordinal];
                    } else {
                        str = "";
                    }
                    String str5 = str;
                    List F0 = nu.F0(strArr);
                    int ordinal2 = ((kd3) k24Var2.getValue()).ordinal();
                    boolean f2 = sk2Var3.f(k24Var2);
                    Object L3 = sk2Var3.L();
                    if (f2 || L3 == sn1Var) {
                        L3 = new j4(k24Var2, 12);
                        sk2Var3.h0(L3);
                    }
                    yf2.e(X2, str5, F0, ordinal2, (mi2) L3, false, b53.B(ih4Var2, (sd3) sk2Var3.j(ye6Var)), sk2Var3, 0);
                    String X3 = me2.X(sk2Var3, R.string.layout_use_default_opacity);
                    boolean z5 = !((Boolean) k24Var3.getValue()).booleanValue();
                    boolean f3 = sk2Var3.f(k24Var3);
                    Object L4 = sk2Var3.L();
                    if (f3 || L4 == sn1Var) {
                        L4 = new j4(k24Var3, 13);
                        sk2Var3.h0(L4);
                    }
                    jk2.j(X3, z5, (mi2) L4, b53.B(ih4Var2, (sd3) sk2Var3.j(ye6Var)), sk2Var3, 0);
                    String X4 = me2.X(sk2Var3, R.string.layout_opacity);
                    float h2 = pj4Var.h();
                    op0 op0Var = new op0(RecyclerView.A1, 100.0f);
                    boolean booleanValue = ((Boolean) k24Var3.getValue()).booleanValue();
                    boolean f4 = sk2Var3.f(pj4Var);
                    Object L5 = sk2Var3.L();
                    if (f4 || L5 == sn1Var) {
                        L5 = new ng3(pj4Var, 0);
                        sk2Var3.h0(L5);
                    }
                    cg2.i(X4, h2, op0Var, booleanValue, (mi2) L5, b53.B(ih4Var2, (sd3) sk2Var3.j(ye6Var)), sk2Var3, 0);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 2:
                jj5 jj5Var2 = (jj5) obj10;
                String[] strArr2 = (String[]) obj9;
                x66 x66Var = (x66) obj8;
                Context context = (Context) obj6;
                mi2 mi2Var4 = (mi2) obj7;
                gt3 gt3Var = (gt3) obj5;
                gt3 gt3Var2 = (gt3) obj4;
                mr0 mr0Var = (mr0) obj;
                tu0 tu0Var3 = (tu0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                mr0Var.getClass();
                if ((intValue3 & 6) == 0) {
                    if (((sk2) tu0Var3).f(mr0Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue3 |= i3;
                }
                int i5 = intValue3;
                if ((i5 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var3;
                if (sk2Var4.O(i5 & 1, z2)) {
                    if (jj5Var2.h.a == lm5.GbaRom) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String X5 = me2.X(sk2Var4, R.string.label_rom_config_gba_slot);
                    String str6 = strArr2[jj5Var2.h.a.ordinal()];
                    boolean f5 = sk2Var4.f(x66Var) | sk2Var4.h(context) | sk2Var4.h(strArr2) | sk2Var4.h(jj5Var2) | sk2Var4.f(mi2Var4);
                    Object L6 = sk2Var4.L();
                    if (!f5 && L6 != sn1Var) {
                        jj5Var = jj5Var2;
                        sk2Var = sk2Var4;
                    } else {
                        jj5Var = jj5Var2;
                        sk2Var = sk2Var4;
                        mg3 mg3Var = new mg3(x66Var, context, jj5Var, strArr2, mi2Var4, 3);
                        sk2Var.h0(mg3Var);
                        L6 = mg3Var;
                    }
                    boolean z6 = z3;
                    wi5.a(X5, str6, false, z6, (ki2) L6, sk2Var, 0, 4);
                    ct3.g(mr0Var, z6, null, null, null, null, ct3.H0(911156774, new m4(jj5Var, gt3Var, gt3Var2, 6), sk2Var), sk2Var, (i5 & 14) | 1572864);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            default:
                final jj5 jj5Var3 = (jj5) obj10;
                String str7 = (String) obj9;
                final uq6 uq6Var2 = (uq6) obj8;
                final mi2 mi2Var5 = (mi2) obj7;
                final Context context2 = (Context) obj6;
                String str8 = (String) obj5;
                final uq6 uq6Var3 = (uq6) obj4;
                tu0 tu0Var4 = (tu0) obj2;
                ((Integer) obj3).getClass();
                ((wn) obj).getClass();
                lr0 a = jr0.a(rt.c, y60.j0, tu0Var4, 0);
                sk2 sk2Var5 = (sk2) tu0Var4;
                int hashCode = Long.hashCode(sk2Var5.T);
                sm4 l = sk2Var5.l();
                zy3 e0 = l07.e0(tu0Var4, wy3.a);
                nu0.i.getClass();
                mv0 mv0Var = mu0.b;
                sk2 sk2Var6 = (sk2) tu0Var4;
                sk2Var6.b0();
                if (sk2Var6.S) {
                    sk2Var6.k(mv0Var);
                } else {
                    sk2Var6.k0();
                }
                oo2.S(tu0Var4, mu0.f, a);
                oo2.S(tu0Var4, mu0.e, l);
                oo2.S(tu0Var4, mu0.g, Integer.valueOf(hashCode));
                oo2.P(tu0Var4, mu0.h);
                oo2.S(tu0Var4, mu0.d, e0);
                String X6 = me2.X(tu0Var4, R.string.video_retroarch_shader_preset_title);
                String str9 = jj5Var3.t;
                if (str9 == null) {
                    str9 = nl2.c(context2, str7);
                }
                boolean h3 = sk2Var6.h(jj5Var3) | sk2Var6.f(uq6Var2) | sk2Var6.f(mi2Var5) | sk2Var6.h(context2);
                Object L7 = sk2Var6.L();
                if (h3 || L7 == sn1Var) {
                    ki2 ki2Var = new ki2() { // from class: cj5
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i6 = r5;
                            o27 o27Var2 = o27.a;
                            String str10 = "";
                            mi2 mi2Var6 = mi2Var5;
                            Context context3 = context2;
                            uq6 uq6Var4 = uq6Var2;
                            jj5 jj5Var4 = jj5Var3;
                            switch (i6) {
                                case 0:
                                    if (jj5Var4.x) {
                                        String str11 = jj5Var4.t;
                                        if (str11 != null) {
                                            str10 = str11;
                                        }
                                        uq6.c(uq6Var4, str10, new hz(11, mi2Var6));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return o27Var2;
                                default:
                                    if (jj5Var4.x) {
                                        String str12 = jj5Var4.v;
                                        if (str12 != null) {
                                            str10 = str12;
                                        }
                                        uq6.c(uq6Var4, str10, new hz(13, mi2Var6));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return o27Var2;
                            }
                        }
                    };
                    sk2Var6.h0(ki2Var);
                    L7 = ki2Var;
                }
                wi5.a(X6, str9, false, true, (ki2) L7, tu0Var4, 3072, 4);
                String X7 = me2.X(tu0Var4, R.string.video_retroarch_shader_parameters_title);
                String str10 = jj5Var3.v;
                if (str10 == null) {
                    str10 = nl2.c(context2, str8);
                }
                boolean h4 = sk2Var6.h(jj5Var3) | sk2Var6.f(uq6Var3) | sk2Var6.f(mi2Var5) | sk2Var6.h(context2);
                Object L8 = sk2Var6.L();
                if (h4 || L8 == sn1Var) {
                    ki2 ki2Var2 = new ki2() { // from class: cj5
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i6 = r5;
                            o27 o27Var2 = o27.a;
                            String str102 = "";
                            mi2 mi2Var6 = mi2Var5;
                            Context context3 = context2;
                            uq6 uq6Var4 = uq6Var3;
                            jj5 jj5Var4 = jj5Var3;
                            switch (i6) {
                                case 0:
                                    if (jj5Var4.x) {
                                        String str11 = jj5Var4.t;
                                        if (str11 != null) {
                                            str102 = str11;
                                        }
                                        uq6.c(uq6Var4, str102, new hz(11, mi2Var6));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return o27Var2;
                                default:
                                    if (jj5Var4.x) {
                                        String str12 = jj5Var4.v;
                                        if (str12 != null) {
                                            str102 = str12;
                                        }
                                        uq6.c(uq6Var4, str102, new hz(13, mi2Var6));
                                    } else {
                                        Toast.makeText(context3, (int) R.string.retroarch_shader_root_not_valid, 1).show();
                                    }
                                    return o27Var2;
                            }
                        }
                    };
                    sk2Var6.h0(ki2Var2);
                    L8 = ki2Var2;
                }
                wi5.a(X7, str10, false, false, (ki2) L8, tu0Var4, 0, 12);
                sk2Var6.p(true);
                return o27Var;
        }
    }

    public /* synthetic */ zg3(jj5 jj5Var, String[] strArr, x66 x66Var, Context context, mi2 mi2Var, gt3 gt3Var, gt3 gt3Var2) {
        this.A = 2;
        this.B = jj5Var;
        this.L = strArr;
        this.R = x66Var;
        this.Y = context;
        this.X = mi2Var;
        this.Z = gt3Var;
        this.c0 = gt3Var2;
    }

    public /* synthetic */ zg3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
        this.c0 = obj7;
    }
}
