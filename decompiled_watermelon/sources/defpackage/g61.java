package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g61 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ g61(aj2 aj2Var, c11 c11Var, bj2 bj2Var, ki2 ki2Var) {
        this.A = 3;
        this.B = aj2Var;
        this.L = c11Var;
        this.R = bj2Var;
        this.X = ki2Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        qj3 qj3Var;
        zy3 f;
        boolean z2;
        boolean z3;
        boolean z4;
        String o;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i = this.A;
        int i2 = 4;
        zy3 zy3Var = wy3.a;
        Object obj4 = su0.a;
        o27 o27Var = o27.a;
        Object obj5 = this.X;
        Object obj6 = this.R;
        Object obj7 = this.L;
        Object obj8 = this.B;
        switch (i) {
            case 0:
                r61 r61Var = (r61) obj8;
                w61 w61Var = (w61) obj7;
                k71 k71Var = (k71) obj6;
                n71 n71Var = (n71) obj5;
                ih4 ih4Var = (ih4) obj;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ih4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (!((sk2) tu0Var).f(ih4Var)) {
                        i2 = 2;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    if (r61Var instanceof n61) {
                        sk2Var.X(1349130694);
                        zy3 f2 = l07.B(b53.W(zy3Var, ih4Var), ih4Var).f(o76.c);
                        gw0 gw0Var = ((n61) r61Var).a;
                        boolean h = sk2Var.h(w61Var);
                        Object L = sk2Var.L();
                        if (h || L == obj4) {
                            L = new i4(0, w61Var, w61.class, "revalidateBiosConfiguration", "revalidateBiosConfiguration()V", 0, 0, 2);
                            sk2Var.h0(L);
                        }
                        b53.n(f2, gw0Var, (ki2) ((lj2) L), sk2Var, 0);
                        sk2Var.p(false);
                    } else if (r61Var instanceof p61) {
                        sk2Var.X(-926299508);
                        b53.o(l07.B(b53.W(zy3Var, ih4Var), ih4Var).f(o76.c), sk2Var, 0);
                        sk2Var.p(false);
                    } else if (r61Var instanceof q61) {
                        sk2Var.X(1349622013);
                        s72 s72Var = o76.c;
                        List list = ((q61) r61Var).a;
                        boolean h2 = sk2Var.h(w61Var);
                        Object L2 = sk2Var.L();
                        if (h2 || L2 == obj4) {
                            L2 = new z(1, w61Var, w61.class, "deleteTitle", "deleteTitle(Lme/magnum/melonds/domain/model/DSiWareTitle;)V", 0, 0, 4);
                            sk2Var.h0(L2);
                        }
                        mi2 mi2Var = (mi2) ((lj2) L2);
                        boolean h3 = sk2Var.h(k71Var);
                        Object L3 = sk2Var.L();
                        if (h3 || L3 == obj4) {
                            L3 = new h4(2, k71Var, k71.class, "launch", "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V", 0, 0, 2);
                            sk2Var.h0(L3);
                        }
                        aj2 aj2Var = (aj2) ((lj2) L3);
                        boolean h4 = sk2Var.h(n71Var);
                        Object L4 = sk2Var.L();
                        if (h4 || L4 == obj4) {
                            L4 = new h4(2, n71Var, n71.class, "launch", "launch(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;)V", 0, 0, 3);
                            sk2Var.h0(L4);
                        }
                        aj2 aj2Var2 = (aj2) ((lj2) L4);
                        boolean h5 = sk2Var.h(w61Var);
                        Object L5 = sk2Var.L();
                        if (h5 || L5 == obj4) {
                            L5 = new z(1, w61Var, w61.class, "getTitleIcon", "getTitleIcon(Lme/magnum/melonds/domain/model/DSiWareTitle;)Lme/magnum/melonds/ui/romlist/RomIcon;", 0, 0, 5);
                            sk2Var.h0(L5);
                        }
                        b53.t(s72Var, ih4Var, list, mi2Var, aj2Var, aj2Var2, (mi2) ((lj2) L5), sk2Var, ((intValue << 3) & 112) | 6);
                        sk2Var.p(false);
                    } else if (r61Var instanceof o61) {
                        sk2Var.X(-926278486);
                        b53.m(l07.B(b53.W(zy3Var, ih4Var), ih4Var).f(o76.c), sk2Var, 0);
                        sk2Var.p(false);
                    } else {
                        throw ej6.d(sk2Var, -926312607, false);
                    }
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                Object obj9 = null;
                Object obj10 = (qj3) obj8;
                zy3 zy3Var2 = (zy3) obj7;
                Object obj11 = (fj3) obj6;
                k24 k24Var = (k24) obj5;
                jt5 jt5Var = (jt5) obj;
                ((Integer) obj3).getClass();
                sk2 sk2Var2 = (sk2) ((tu0) obj2);
                Object L6 = sk2Var2.L();
                if (L6 == obj4) {
                    L6 = new dj3(jt5Var, new f4(k24Var, 26));
                    sk2Var2.h0(L6);
                }
                dj3 dj3Var = (dj3) L6;
                Object L7 = sk2Var2.L();
                if (L7 == obj4) {
                    L7 = new yh6(new ci3(dj3Var));
                    sk2Var2.h0(L7);
                }
                yh6 yh6Var = (yh6) L7;
                if (obj10 != null) {
                    sk2Var2.X(1743490539);
                    sk2Var2.X(887527095);
                    Object obj12 = bt4.a;
                    if (obj12 != null) {
                        sk2Var2.X(1345554384);
                    } else {
                        sk2Var2.X(1345603457);
                        View view = (View) sk2Var2.j(ue.f);
                        boolean f3 = sk2Var2.f(view);
                        Object L8 = sk2Var2.L();
                        if (f3 || L8 == obj4) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            if (tag instanceof zs4) {
                                obj9 = (zs4) tag;
                            }
                            if (obj9 == null) {
                                Object rjVar = new rj(view);
                                view.setTag(R.id.compose_prefetch_scheduler, rjVar);
                                L8 = rjVar;
                            } else {
                                L8 = obj9;
                            }
                            sk2Var2.h0(L8);
                        }
                        obj12 = (zs4) L8;
                    }
                    sk2Var2.p(false);
                    Object obj13 = obj12;
                    sk2Var2.p(false);
                    Object[] objArr = {obj10, dj3Var, yh6Var, obj13};
                    boolean f4 = sk2Var2.f(obj10) | sk2Var2.h(dj3Var) | sk2Var2.h(yh6Var) | sk2Var2.h(obj13);
                    Object L9 = sk2Var2.L();
                    if (!f4 && L9 != obj4) {
                        qj3Var = obj10;
                    } else {
                        qj3Var = obj10;
                        Object qmVar = new qm(qj3Var, dj3Var, yh6Var, obj13, 7);
                        sk2Var2.h0(qmVar);
                        L9 = qmVar;
                    }
                    l.f(objArr, (mi2) L9, sk2Var2);
                    sk2Var2.p(false);
                } else {
                    qj3Var = obj10;
                    sk2Var2.X(1744076749);
                    sk2Var2.p(false);
                }
                int i3 = rj3.a;
                if (qj3Var != null && (f = zy3Var2.f(new ay6(qj3Var))) != null) {
                    zy3Var2 = f;
                }
                boolean f5 = sk2Var2.f(dj3Var) | sk2Var2.f(obj11);
                Object L10 = sk2Var2.L();
                if (f5 || L10 == obj4) {
                    L10 = new s4(22, dj3Var, obj11);
                    sk2Var2.h0(L10);
                }
                vh6.b(yh6Var, zy3Var2, (aj2) L10, sk2Var2, 8);
                return o27Var;
            case 2:
                j15 j15Var = (j15) obj8;
                ql3 ql3Var = (ql3) obj7;
                ki2 ki2Var = (ki2) obj6;
                mi2 mi2Var2 = (mi2) obj5;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var2;
                if (sk2Var3.O(intValue2 & 1, z2)) {
                    n40.t(b53.Z(o76.c(zy3Var, 1.0f), 16.0f, RecyclerView.A1, 2), j15Var, ql3Var, ki2Var, mi2Var2, sk2Var3, 6);
                    tq5.a(b53.a0(zy3Var, 16.0f, 12.0f, 16.0f, 8.0f), ((hr0) sk2Var3.j(ir0.a)).f(), RecyclerView.A1, sk2Var3, 6, 12);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                aj2 aj2Var3 = (aj2) obj8;
                c11 c11Var = (c11) obj7;
                bj2 bj2Var = (bj2) obj6;
                ki2 ki2Var2 = (ki2) obj5;
                a11 a11Var = (a11) obj;
                tu0 tu0Var3 = (tu0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    if (!((sk2) tu0Var3).f(a11Var)) {
                        i2 = 2;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var3;
                if (sk2Var4.O(intValue3 & 1, z3)) {
                    String str = (String) aj2Var3.j(sk2Var4, 0);
                    if (zg6.B0(str)) {
                        pz2.c("Label must not be blank");
                    }
                    c11Var.getClass();
                    se.c.e(str, Boolean.TRUE, a11Var, bj2Var, ki2Var2, sk2Var4, Integer.valueOf((intValue3 << 9) & 7168));
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 4:
                ri5 ri5Var = (ri5) obj8;
                ArrayList arrayList = (ArrayList) obj7;
                ki2 ki2Var3 = (ki2) obj6;
                mi2 mi2Var3 = (mi2) obj5;
                tu0 tu0Var4 = (tu0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((th3) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var4;
                if (sk2Var5.O(intValue4 & 1, z4)) {
                    if (ri5Var.c) {
                        sk2Var5.X(1966623138);
                        o = (String) tq0.U0(ri5Var.b);
                        if (o == null) {
                            z5 = false;
                            o = b31.o(sk2Var5, 63440510, R.string.rom_all_games, sk2Var5, false);
                        } else {
                            z5 = false;
                            sk2Var5.X(63439456);
                            sk2Var5.p(false);
                        }
                        sk2Var5.p(z5);
                    } else {
                        o = b31.o(sk2Var5, 63441918, R.string.rom_all_games, sk2Var5, false);
                    }
                    nk2.h(o, ri5Var.c, ri5Var.h, ri5Var.i, arrayList.size(), ki2Var3, mi2Var3, b53.Z(zy3Var, RecyclerView.A1, RecyclerView.A1, 2), sk2Var5, 12582912, 0);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 5:
                jj5 jj5Var = (jj5) obj8;
                rg5 rg5Var = (rg5) obj7;
                uq6 uq6Var = (uq6) obj6;
                mi2 mi2Var4 = (mi2) obj5;
                tu0 tu0Var5 = (tu0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((mr0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i4 = intValue5 & 1;
                sk2 sk2Var6 = (sk2) tu0Var5;
                if (sk2Var6.O(i4, z6)) {
                    String X = me2.X(sk2Var6, R.string.label_rom_config_custom_name);
                    String str2 = jj5Var.i;
                    if (str2 == null) {
                        str2 = rg5Var.a;
                    }
                    String str3 = str2;
                    boolean f6 = sk2Var6.f(uq6Var) | sk2Var6.h(jj5Var) | sk2Var6.h(rg5Var) | sk2Var6.f(mi2Var4);
                    Object L11 = sk2Var6.L();
                    if (f6 || L11 == obj4) {
                        Object yc0Var = new yc0(uq6Var, jj5Var, rg5Var, mi2Var4, 5);
                        sk2Var6.h0(yc0Var);
                        L11 = yc0Var;
                    }
                    wi5.a(X, str3, false, false, (ki2) L11, sk2Var6, 0, 12);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                Context context = (Context) obj8;
                jj5 jj5Var2 = (jj5) obj7;
                x66 x66Var = (x66) obj6;
                mi2 mi2Var5 = (mi2) obj5;
                tu0 tu0Var6 = (tu0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((mr0) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                sk2 sk2Var7 = (sk2) tu0Var6;
                if (sk2Var7.O(intValue6 & 1, z7)) {
                    String X2 = me2.X(sk2Var7, R.string.label_rom_config_retroachievements_for_rom);
                    String T = nl2.T(context, jj5Var2.y, jj5Var2.z);
                    boolean f7 = sk2Var7.f(x66Var) | sk2Var7.h(context) | sk2Var7.h(jj5Var2) | sk2Var7.f(mi2Var5);
                    Object L12 = sk2Var7.L();
                    if (f7 || L12 == obj4) {
                        L12 = new yc0(x66Var, context, jj5Var2, mi2Var5);
                        sk2Var7.h0(L12);
                    }
                    wi5.a(X2, T, false, false, (ki2) L12, sk2Var7, 0, 12);
                } else {
                    sk2Var7.R();
                }
                return o27Var;
            case 7:
                jj5 jj5Var3 = (jj5) obj8;
                String str4 = (String) obj7;
                Context context2 = (Context) obj6;
                gt3 gt3Var = (gt3) obj5;
                tu0 tu0Var7 = (tu0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((mr0) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                sk2 sk2Var8 = (sk2) tu0Var7;
                if (sk2Var8.O(intValue7 & 1, z8)) {
                    String X3 = me2.X(sk2Var8, R.string.controller_layout);
                    String str5 = jj5Var3.f;
                    if (str5 == null) {
                        str5 = nl2.c(context2, str4);
                    }
                    String str6 = str5;
                    boolean h6 = sk2Var8.h(context2) | sk2Var8.h(jj5Var3) | sk2Var8.h(gt3Var);
                    Object L13 = sk2Var8.L();
                    if (h6 || L13 == obj4) {
                        L13 = new t6(context2, gt3Var, jj5Var3, 18);
                        sk2Var8.h0(L13);
                    }
                    wi5.a(X3, str6, false, false, (ki2) L13, sk2Var8, 0, 12);
                } else {
                    sk2Var8.R();
                }
                return o27Var;
            default:
                mb6 mb6Var = (mb6) obj8;
                hm3 hm3Var = (hm3) obj7;
                oq6 oq6Var = (oq6) obj6;
                pb4 pb4Var = (pb4) obj5;
                zy3 zy3Var3 = (zy3) obj;
                ((Integer) obj3).getClass();
                sk2 sk2Var9 = (sk2) ((tu0) obj2);
                sk2Var9.X(-84507373);
                boolean booleanValue = ((Boolean) sk2Var9.j(ov0.x)).booleanValue();
                boolean g = sk2Var9.g(booleanValue);
                Object L14 = sk2Var9.L();
                if (g || L14 == obj4) {
                    L14 = new s41(booleanValue);
                    sk2Var9.h0(L14);
                }
                s41 s41Var = (s41) L14;
                if (mb6Var.a == 16) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (((Boolean) ((yk3) ((me7) sk2Var9.j(ov0.u))).c.getValue()).booleanValue() && hm3Var.b() && vr6.c(oq6Var.b) && z9) {
                    sk2Var9.X(-707487962);
                    to toVar = oq6Var.a;
                    vr6 vr6Var = new vr6(oq6Var.b);
                    boolean h7 = sk2Var9.h(s41Var);
                    Object L15 = sk2Var9.L();
                    if (h7 || L15 == obj4) {
                        L15 = new ys3(s41Var, null, 12);
                        sk2Var9.h0(L15);
                    }
                    l.h(toVar, vr6Var, (aj2) L15, sk2Var9);
                    boolean h8 = sk2Var9.h(s41Var) | sk2Var9.h(pb4Var) | sk2Var9.f(oq6Var) | sk2Var9.h(hm3Var) | sk2Var9.f(mb6Var);
                    Object L16 = sk2Var9.L();
                    if (h8 || L16 == obj4) {
                        L16 = new e5(s41Var, pb4Var, oq6Var, hm3Var, mb6Var, 9);
                        sk2Var9.h0(L16);
                    }
                    zy3Var = l07.G(zy3Var3, (mi2) L16);
                    z10 = false;
                    sk2Var9.p(false);
                } else {
                    z10 = false;
                    sk2Var9.X(-705473241);
                    sk2Var9.p(false);
                }
                sk2Var9.p(z10);
                return zy3Var;
        }
    }

    public /* synthetic */ g61(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }
}
