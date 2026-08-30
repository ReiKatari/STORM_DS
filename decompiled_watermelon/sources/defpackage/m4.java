package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m4 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ m4(uq6 uq6Var, mi2 mi2Var, k24 k24Var) {
        this.A = 9;
        this.B = uq6Var;
        this.R = mi2Var;
        this.L = k24Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        lt ltVar;
        double d;
        float f;
        boolean z4;
        float f2;
        int i;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str;
        int i2;
        boolean z9;
        int i3;
        int i4;
        int i5 = this.A;
        mt mtVar = rt.c;
        lt ltVar2 = rt.a;
        float f3 = 1.0f;
        wy3 wy3Var = wy3.a;
        sn1 sn1Var = su0.a;
        int i6 = 2;
        o27 o27Var = o27.a;
        boolean z10 = false;
        Object obj4 = this.L;
        Object obj5 = this.R;
        Object obj6 = this.B;
        boolean z11 = true;
        switch (i5) {
            case 0:
                List list = (List) obj6;
                k24 k24Var = (k24) obj4;
                k24 k24Var2 = (k24) obj5;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    i20 i20Var = y60.h0;
                    zy3 b0 = b53.b0(o76.c(wy3Var, 1.0f), RecyclerView.A1, 8.0f, RecyclerView.A1, RecyclerView.A1, 13);
                    sr5 a = rr5.a(ltVar2, i20Var, sk2Var, 48);
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e0 = l07.e0(sk2Var, b0);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, mu0.f, a);
                    oo2.S(sk2Var, mu0.e, l);
                    oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var, mu0.h);
                    oo2.S(sk2Var, mu0.d, e0);
                    f6 f6Var = (f6) k24Var.getValue();
                    boolean f4 = sk2Var.f(k24Var);
                    Object L = sk2Var.L();
                    if (f4 || L == sn1Var) {
                        L = new j4(k24Var, 1);
                        sk2Var.h0(L);
                    }
                    n40.i(list, f6Var, (mi2) L, new ot0(6), new xg3(1.0f, false), sk2Var, 0);
                    cg2.k(sk2Var, o76.k(wy3Var, 5.0f));
                    boolean booleanValue = ((Boolean) k24Var2.getValue()).booleanValue();
                    boolean f5 = sk2Var.f(k24Var2);
                    Object L2 = sk2Var.L();
                    if (!f5 && L2 != sn1Var) {
                        z2 = true;
                    } else {
                        z2 = true;
                        L2 = new f4(k24Var2, 1);
                        sk2Var.h0(L2);
                    }
                    n40.x(booleanValue, (ki2) L2, sk2Var, 0);
                    sk2Var.p(z2);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                aj2 aj2Var = (aj2) obj6;
                et0 et0Var = (et0) obj4;
                bj2 bj2Var = (bj2) obj5;
                tr5 tr5Var = (tr5) obj;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                i20 i20Var2 = y60.h0;
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var2).f(tr5Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z3)) {
                    if (aj2Var == null) {
                        sk2Var2.X(-1394361313);
                        cg2.k(sk2Var2, up.a);
                        sk2Var2.p(false);
                        ltVar = ltVar2;
                        d = 0.5d;
                        z4 = true;
                    } else {
                        sk2Var2.X(-1394295686);
                        zy3 zy3Var = up.b;
                        ltVar = ltVar2;
                        sr5 a2 = rr5.a(ltVar, i20Var2, sk2Var2, 48);
                        int j0 = dt3.j0(sk2Var2);
                        sm4 l2 = sk2Var2.l();
                        zy3 e02 = l07.e0(sk2Var2, zy3Var);
                        nu0.i.getClass();
                        mv0 mv0Var2 = mu0.b;
                        sk2Var2.b0();
                        d = 0.5d;
                        if (sk2Var2.S) {
                            sk2Var2.k(mv0Var2);
                        } else {
                            sk2Var2.k0();
                        }
                        oo2.S(sk2Var2, mu0.f, a2);
                        oo2.S(sk2Var2, mu0.e, l2);
                        dn dnVar = mu0.g;
                        if (sk2Var2.S || !b53.x(sk2Var2.L(), Integer.valueOf(j0))) {
                            b31.w(j0, sk2Var2, j0, dnVar);
                        }
                        oo2.S(sk2Var2, mu0.d, e02);
                        tv0 tv0Var = b01.a;
                        long j = ((xq0) sk2Var2.j(e01.a)).a;
                        if (!((hr0) sk2Var2.j(ir0.a)).k() ? mh7.V(j) < 0.5d : mh7.V(j) > 0.5d) {
                            f = 1.0f;
                        } else {
                            f = 0.87f;
                        }
                        dk7.a(tv0Var.a(Float.valueOf(f)), aj2Var, sk2Var2, 8);
                        z4 = true;
                        sk2Var2.p(true);
                        sk2Var2.p(false);
                    }
                    zy3 a3 = tr5Var.a(o76.b(wy3Var, 1.0f), 1.0f, z4);
                    sr5 a4 = rr5.a(ltVar, i20Var2, sk2Var2, 48);
                    int j02 = dt3.j0(sk2Var2);
                    sm4 l3 = sk2Var2.l();
                    zy3 e03 = l07.e0(sk2Var2, a3);
                    nu0.i.getClass();
                    mv0 mv0Var3 = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var3);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, mu0.f, a4);
                    oo2.S(sk2Var2, mu0.e, l3);
                    dn dnVar2 = mu0.g;
                    if (sk2Var2.S || !b53.x(sk2Var2.L(), Integer.valueOf(j02))) {
                        b31.w(j02, sk2Var2, j02, dnVar2);
                    }
                    oo2.S(sk2Var2, mu0.d, e03);
                    ir6.a(((c17) sk2Var2.j(d17.b)).f, ct3.H0(1206983395, new sp(et0Var, 0), sk2Var2), sk2Var2, 48);
                    sk2Var2.p(true);
                    tv0 tv0Var2 = b01.a;
                    long j2 = ((xq0) sk2Var2.j(e01.a)).a;
                    if (!((hr0) sk2Var2.j(ir0.a)).k() ? mh7.V(j2) < d : mh7.V(j2) > d) {
                        f2 = 0.74f;
                    } else {
                        f2 = 0.6f;
                    }
                    dk7.a(tv0Var2.a(Float.valueOf(f2)), ct3.H0(-1033635954, new tp(bj2Var, 0), sk2Var2), sk2Var2, 56);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                q60 q60Var = (q60) obj4;
                jy5 jy5Var = (jy5) obj5;
                Throwable th = (Throwable) obj;
                e31 e31Var = (e31) obj3;
                if (obj6 != s60.l) {
                    oo2.v(q60Var.B, obj6, jy5Var.A);
                }
                return o27Var;
            case 3:
                gt3 gt3Var = (gt3) obj6;
                k24 k24Var3 = (k24) obj4;
                k24 k24Var4 = (k24) obj5;
                tu0 tu0Var3 = (tu0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((mr0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z5)) {
                    String X = me2.X(sk2Var3, R.string.dsiware_import_from_file);
                    boolean h = sk2Var3.h(gt3Var);
                    Object L3 = sk2Var3.L();
                    if (h || L3 == sn1Var) {
                        L3 = new p6(21, gt3Var, k24Var4);
                        sk2Var3.h0(L3);
                    }
                    n40.h(X, false, false, (ki2) L3, sk2Var3, 0, 6);
                    String X2 = me2.X(sk2Var3, R.string.dsiware_import_from_rom_list);
                    boolean f6 = sk2Var3.f(k24Var3);
                    Object L4 = sk2Var3.L();
                    if (f6 || L4 == sn1Var) {
                        L4 = new p6(22, k24Var3, k24Var4);
                        sk2Var3.h0(L4);
                    }
                    n40.h(X2, false, false, (ki2) L4, sk2Var3, 0, 6);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 4:
                k24 k24Var5 = (k24) obj4;
                k24 k24Var6 = (k24) obj5;
                String[] strArr = (String[]) obj6;
                ih4 ih4Var = (ih4) obj;
                tu0 tu0Var4 = (tu0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ih4Var.getClass();
                if ((intValue4 & 6) == 0) {
                    if (((sk2) tu0Var4).f(ih4Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue4 |= i2;
                }
                if ((intValue4 & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z6)) {
                    wy3 wy3Var2 = wy3.a;
                    zy3 W = b53.W(wy3Var2, ih4Var);
                    lr0 a5 = jr0.a(mtVar, y60.j0, sk2Var4, 0);
                    int hashCode2 = Long.hashCode(sk2Var4.T);
                    sm4 l4 = sk2Var4.l();
                    zy3 e04 = l07.e0(sk2Var4, W);
                    nu0.i.getClass();
                    mv0 mv0Var4 = mu0.b;
                    sk2Var4.b0();
                    if (sk2Var4.S) {
                        sk2Var4.k(mv0Var4);
                    } else {
                        sk2Var4.k0();
                    }
                    oo2.S(sk2Var4, mu0.f, a5);
                    oo2.S(sk2Var4, mu0.e, l4);
                    oo2.S(sk2Var4, mu0.g, Integer.valueOf(hashCode2));
                    oo2.P(sk2Var4, mu0.h);
                    oo2.S(sk2Var4, mu0.d, e04);
                    sk2Var4.X(-1173027909);
                    Iterator it = kd3.getEntries().iterator();
                    int i7 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            kd3 kd3Var = (kd3) next;
                            zy3 c = o76.c(wy3Var2, f3);
                            if (kd3Var == ((kd3) k24Var5.getValue())) {
                                z7 = z11;
                            } else {
                                z7 = z10;
                            }
                            og5 og5Var = new og5(3);
                            boolean d2 = sk2Var4.d(kd3Var.ordinal()) | sk2Var4.f(k24Var5) | sk2Var4.f(k24Var6);
                            Object L5 = sk2Var4.L();
                            if (d2 || L5 == sn1Var) {
                                L5 = new t6(kd3Var, k24Var5, k24Var6, 11);
                                sk2Var4.h0(L5);
                            }
                            zy3 Z = b53.Z(n40.d0(c, z7, og5Var, (ki2) L5, 10), RecyclerView.A1, 12.0f, 1);
                            sr5 a6 = rr5.a(ltVar2, y60.h0, sk2Var4, 48);
                            int hashCode3 = Long.hashCode(sk2Var4.T);
                            sm4 l5 = sk2Var4.l();
                            zy3 e05 = l07.e0(sk2Var4, Z);
                            nu0.i.getClass();
                            mv0 mv0Var5 = mu0.b;
                            sk2Var4.b0();
                            Iterator it2 = it;
                            if (sk2Var4.S) {
                                sk2Var4.k(mv0Var5);
                            } else {
                                sk2Var4.k0();
                            }
                            oo2.S(sk2Var4, mu0.f, a6);
                            oo2.S(sk2Var4, mu0.e, l5);
                            oo2.S(sk2Var4, mu0.g, Integer.valueOf(hashCode3));
                            oo2.P(sk2Var4, mu0.h);
                            oo2.S(sk2Var4, mu0.d, e05);
                            if (kd3Var == ((kd3) k24Var5.getValue())) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            a45.a(z8, null, false, ln2.v(0, 6, ((hr0) sk2Var4.j(ir0.a)).i(), sk2Var4), sk2Var4, 48, 28);
                            if (i7 >= 0 && i7 < strArr.length) {
                                str = strArr[i7];
                            } else {
                                str = "";
                            }
                            wy3 wy3Var3 = wy3Var2;
                            ir6.b(str, b53.b0(wy3Var3, 16.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var4.j(d17.b)).i, sk2Var4, 48, 0, 65532);
                            z11 = true;
                            sk2Var4.p(true);
                            it = it2;
                            wy3Var2 = wy3Var3;
                            i7 = i8;
                            f3 = 1.0f;
                            z10 = false;
                        } else {
                            l07.v0();
                            throw null;
                        }
                    }
                    sk2Var4.p(z10);
                    sk2Var4.p(z11);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 5:
                ee5 ee5Var = (ee5) obj6;
                k24 k24Var7 = (k24) obj4;
                k24 k24Var8 = (k24) obj5;
                ih4 ih4Var2 = (ih4) obj;
                tu0 tu0Var5 = (tu0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ih4Var2.getClass();
                if ((intValue5 & 6) == 0) {
                    if (((sk2) tu0Var5).f(ih4Var2)) {
                        i6 = 4;
                    }
                    intValue5 |= i6;
                }
                if ((intValue5 & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z9)) {
                    zy3 U = dt3.U(b53.W(wy3Var, ih4Var2));
                    tv3 d3 = d50.d(y60.L, false);
                    int hashCode4 = Long.hashCode(sk2Var5.T);
                    sm4 l6 = sk2Var5.l();
                    zy3 e06 = l07.e0(sk2Var5, U);
                    nu0.i.getClass();
                    mv0 mv0Var6 = mu0.b;
                    sk2Var5.b0();
                    if (sk2Var5.S) {
                        sk2Var5.k(mv0Var6);
                    } else {
                        sk2Var5.k0();
                    }
                    oo2.S(sk2Var5, mu0.f, d3);
                    oo2.S(sk2Var5, mu0.e, l6);
                    oo2.S(sk2Var5, mu0.g, Integer.valueOf(hashCode4));
                    oo2.P(sk2Var5, mu0.h);
                    oo2.S(sk2Var5, mu0.d, e06);
                    if (((Boolean) k24Var7.getValue()).booleanValue()) {
                        sk2Var5.X(590915709);
                        jk2.d(sk2Var5, 0);
                        sk2Var5.p(false);
                    } else {
                        sk2Var5.X(590986823);
                        jk2.b(ee5Var, (ee5) k24Var8.getValue(), sk2Var5, 0);
                        sk2Var5.p(false);
                    }
                    sk2Var5.p(true);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                jj5 jj5Var = (jj5) obj6;
                gt3 gt3Var2 = (gt3) obj4;
                gt3 gt3Var3 = (gt3) obj5;
                tu0 tu0Var6 = (tu0) obj2;
                ((Integer) obj3).getClass();
                ((wn) obj).getClass();
                lr0 a7 = jr0.a(mtVar, y60.j0, tu0Var6, 0);
                sk2 sk2Var6 = (sk2) tu0Var6;
                int hashCode5 = Long.hashCode(sk2Var6.T);
                sm4 l7 = sk2Var6.l();
                zy3 e07 = l07.e0(tu0Var6, wy3Var);
                nu0.i.getClass();
                mv0 mv0Var7 = mu0.b;
                sk2 sk2Var7 = (sk2) tu0Var6;
                sk2Var7.b0();
                if (sk2Var7.S) {
                    sk2Var7.k(mv0Var7);
                } else {
                    sk2Var7.k0();
                }
                oo2.S(tu0Var6, mu0.f, a7);
                oo2.S(tu0Var6, mu0.e, l7);
                oo2.S(tu0Var6, mu0.g, Integer.valueOf(hashCode5));
                oo2.P(tu0Var6, mu0.h);
                oo2.S(tu0Var6, mu0.d, e07);
                String X3 = me2.X(tu0Var6, R.string.label_rom_config_gba_rom_path);
                String str2 = jj5Var.h.b;
                if (str2 == null) {
                    sk2Var7.X(68978160);
                    str2 = me2.X(tu0Var6, R.string.not_set);
                } else {
                    sk2Var7.X(68976982);
                }
                sk2Var7.p(false);
                String str3 = str2;
                boolean h2 = sk2Var7.h(gt3Var2);
                Object L6 = sk2Var7.L();
                if (h2 || L6 == sn1Var) {
                    L6 = new gz(gt3Var2, 1);
                    sk2Var7.h0(L6);
                }
                wi5.a(X3, str3, false, true, (ki2) L6, tu0Var6, 3072, 4);
                String X4 = me2.X(tu0Var6, R.string.label_rom_config_gba_save_path);
                String str4 = jj5Var.h.c;
                if (str4 == null) {
                    sk2Var7.X(68990256);
                    str4 = me2.X(tu0Var6, R.string.not_set);
                } else {
                    sk2Var7.X(68989047);
                }
                sk2Var7.p(false);
                String str5 = str4;
                boolean h3 = sk2Var7.h(gt3Var3);
                Object L7 = sk2Var7.L();
                if (h3 || L7 == sn1Var) {
                    L7 = new gz(gt3Var3, 2);
                    sk2Var7.h0(L7);
                }
                wi5.a(X4, str5, false, false, (ki2) L7, tu0Var6, 0, 12);
                sk2Var7.p(true);
                return o27Var;
            case 7:
                gt3 gt3Var4 = (gt3) obj6;
                Context context = (Context) obj4;
                rg5 rg5Var = (rg5) obj5;
                tu0 tu0Var7 = (tu0) obj2;
                ((Integer) obj3).getClass();
                ((wn) obj).getClass();
                String X5 = me2.X(tu0Var7, R.string.label_rom_config_custom_input_mapping);
                String X6 = me2.X(tu0Var7, R.string.edit);
                sk2 sk2Var8 = (sk2) tu0Var7;
                boolean h4 = sk2Var8.h(gt3Var4) | sk2Var8.h(context) | sk2Var8.h(rg5Var);
                Object L8 = sk2Var8.L();
                if (h4 || L8 == sn1Var) {
                    L8 = new t6(gt3Var4, context, rg5Var, 19);
                    sk2Var8.h0(L8);
                }
                wi5.a(X5, X6, false, false, (ki2) L8, sk2Var8, 0, 12);
                return o27Var;
            case 8:
                s3 s3Var = (s3) obj6;
                k24 k24Var9 = (k24) obj4;
                um umVar = (um) obj5;
                tr5 tr5Var2 = (tr5) obj;
                tu0 tu0Var8 = (tu0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                tr5Var2.getClass();
                if ((intValue6 & 6) == 0) {
                    if (((sk2) tu0Var8).f(tr5Var2)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue6 |= i3;
                }
                if ((intValue6 & 19) != 18) {
                    z10 = true;
                }
                sk2 sk2Var9 = (sk2) tu0Var8;
                if (sk2Var9.O(intValue6 & 1, z10)) {
                    se seVar = s3Var.a;
                    Boolean valueOf = Boolean.valueOf(s3Var.b);
                    boolean f7 = sk2Var9.f(k24Var9) | sk2Var9.h(s3Var) | sk2Var9.h(umVar);
                    Object L9 = sk2Var9.L();
                    if (f7 || L9 == sn1Var) {
                        zw5 zw5Var = new zw5(s3Var, umVar, k24Var9, null, 2);
                        sk2Var9.h0(zw5Var);
                        L9 = zw5Var;
                    }
                    l.h(seVar, valueOf, (aj2) L9, sk2Var9);
                    ct3.l(tr5Var2, ((Boolean) k24Var9.getValue()).booleanValue(), null, null, null, null, ct3.H0(471749562, new km4(13, s3Var), sk2Var9), sk2Var9, (intValue6 & 14) | 1572864);
                } else {
                    sk2Var9.R();
                }
                return o27Var;
            default:
                uq6 uq6Var = (uq6) obj6;
                mi2 mi2Var = (mi2) obj5;
                k24 k24Var10 = (k24) obj4;
                ih4 ih4Var3 = (ih4) obj;
                tu0 tu0Var9 = (tu0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ih4Var3.getClass();
                if ((intValue7 & 6) == 0) {
                    if (((sk2) tu0Var9).f(ih4Var3)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue7 |= i4;
                }
                if ((intValue7 & 19) != 18) {
                    z10 = true;
                }
                sk2 sk2Var10 = (sk2) tu0Var9;
                if (sk2Var10.O(intValue7 & 1, z10)) {
                    tv0 tv0Var3 = yr6.a;
                    dk7.a(tv0Var3.a(new xr6(((hr0) sk2Var10.j(ir0.a)).i(), ((xr6) sk2Var10.j(tv0Var3)).b)), ct3.H0(-1145339137, new p4((Object) ih4Var3, (Object) uq6Var, mi2Var, (Object) k24Var10, 10), sk2Var10), sk2Var10, 56);
                } else {
                    sk2Var10.R();
                }
                return o27Var;
        }
    }

    public /* synthetic */ m4(k24 k24Var, k24 k24Var2, String[] strArr) {
        this.A = 4;
        this.L = k24Var;
        this.R = k24Var2;
        this.B = strArr;
    }

    public /* synthetic */ m4(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
