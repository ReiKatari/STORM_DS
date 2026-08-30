package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ot0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ot0 implements bj2 {
    public final /* synthetic */ int A;

    public /* synthetic */ ot0(int i) {
        this.A = i;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        String o;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4 = this.A;
        int i5 = R.string.retro_achievements_filter_all;
        int i6 = 2;
        wy3 wy3Var = wy3.a;
        o27 o27Var = o27.a;
        boolean z4 = false;
        switch (i4) {
            case 0:
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z4)) {
                    ev2.b(ve2.J(sk2Var, R.drawable.ic_trophy), null, o76.c, ((hr0) sk2Var.j(ir0.a)).i(), sk2Var, 440, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z4)) {
                    ev2.a(yf2.u(), null, o76.c, ((hr0) sk2Var2.j(ir0.a)).i(), sk2Var2, 432, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                tu0 tu0Var3 = (tu0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z4)) {
                    cg2.c(ve2.J(sk2Var3, R.drawable.ic_completed), o76.c, null, null, RecyclerView.A1, sk2Var3, 440, 120);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                tu0 tu0Var4 = (tu0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z4)) {
                    cg2.c(ve2.J(sk2Var4, R.drawable.ic_completed), o76.c, null, null, RecyclerView.A1, sk2Var4, 440, 120);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 4:
                tu0 tu0Var5 = (tu0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z4)) {
                    cg2.c(ve2.J(sk2Var5, R.drawable.ic_points), o76.c, null, null, RecyclerView.A1, sk2Var5, 440, 120);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 5:
                k6 k6Var = (k6) obj;
                ((Integer) obj3).getClass();
                k6Var.getClass();
                sk2 sk2Var6 = (sk2) ((tu0) obj2);
                sk2Var6.X(2044048407);
                int i7 = v5.a[k6Var.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                i = -845922168;
                                i2 = R.string.retro_achievements_filter_unofficial;
                            } else {
                                throw ej6.d(sk2Var6, -845932954, false);
                            }
                        } else {
                            o = b31.o(sk2Var6, -845925437, R.string.retro_achievements_leaderboards, sk2Var6, false);
                        }
                    } else {
                        i = -845928734;
                        i2 = R.string.retro_achievements_filter_core;
                    }
                    o = b31.o(sk2Var6, i, i2, sk2Var6, false);
                } else {
                    o = b31.o(sk2Var6, -845931743, R.string.retro_achievements_filter_all, sk2Var6, false);
                }
                sk2Var6.p(false);
                return o;
            case ig7.b /* 6 */:
                f6 f6Var = (f6) obj;
                ((Integer) obj3).getClass();
                f6Var.getClass();
                sk2 sk2Var7 = (sk2) ((tu0) obj2);
                sk2Var7.X(1364883258);
                switch (v5.b[f6Var.ordinal()]) {
                    case 1:
                        i3 = -1245256509;
                        break;
                    case 2:
                        i3 = -1245253016;
                        i5 = R.string.retro_achievements_pending_unlocks;
                        break;
                    case 3:
                        i3 = -1245249430;
                        i5 = R.string.retro_achievements_active_challenges;
                        break;
                    case 4:
                        i3 = -1245245782;
                        i5 = R.string.retro_achievements_recently_unlokced;
                        break;
                    case 5:
                        i3 = -1245242399;
                        i5 = R.string.retro_achievements_unsynced;
                        break;
                    case ig7.b /* 6 */:
                        i3 = -1245239195;
                        i5 = R.string.retro_achievements_almost_there;
                        break;
                    case 7:
                        i3 = -1245236033;
                        i5 = R.string.retro_achievements_locked;
                        break;
                    case 8:
                        i3 = -1245232892;
                        i5 = R.string.retro_achievements_unsupported;
                        break;
                    case 9:
                        i3 = -1245229629;
                        i5 = R.string.retro_achievements_unofficial;
                        break;
                    case 10:
                        i3 = -1245226463;
                        i5 = R.string.retro_achievements_unlocked;
                        break;
                    default:
                        throw ej6.d(sk2Var7, -1245257120, false);
                }
                String o2 = b31.o(sk2Var7, i3, i5, sk2Var7, false);
                sk2Var7.p(false);
                return o2;
            case 7:
                tu0 tu0Var6 = (tu0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var8 = (sk2) tu0Var6;
                if (sk2Var8.O(intValue6 & 1, z4)) {
                    ir6.b(me2.X(sk2Var8, R.string.retro_achievements_filter_no_results), b53.Z(o76.c(wy3Var, 1.0f), RecyclerView.A1, 24.0f, 1), 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, ((c17) sk2Var8.j(d17.b)).j, sk2Var8, 48, 0, 65020);
                } else {
                    sk2Var8.R();
                }
                return o27Var;
            case 8:
                tu0 tu0Var7 = (tu0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var9 = (sk2) tu0Var7;
                if (sk2Var9.O(1 & intValue7, z)) {
                    n40.e(me2.X(sk2Var9, R.string.retro_achievements_leaderboards), sk2Var9, 0);
                } else {
                    sk2Var9.R();
                }
                return o27Var;
            case 9:
                tu0 tu0Var8 = (tu0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var10 = (sk2) tu0Var8;
                if (sk2Var10.O(intValue8 & 1, z2)) {
                    zy3 X = b53.X(o76.c(wy3Var, 1.0f), 32.0f);
                    tv3 d = d50.d(y60.Z, false);
                    int hashCode = Long.hashCode(sk2Var10.T);
                    sm4 l = sk2Var10.l();
                    zy3 e0 = l07.e0(sk2Var10, X);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var10.b0();
                    if (sk2Var10.S) {
                        sk2Var10.k(mv0Var);
                    } else {
                        sk2Var10.k0();
                    }
                    oo2.S(sk2Var10, mu0.f, d);
                    oo2.S(sk2Var10, mu0.e, l);
                    oo2.S(sk2Var10, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var10, mu0.h);
                    oo2.S(sk2Var10, mu0.d, e0);
                    yu4.a(null, ((hr0) sk2Var10.j(ir0.a)).i(), RecyclerView.A1, 0L, 0, sk2Var10, 0, 29);
                    sk2Var10.p(true);
                } else {
                    sk2Var10.R();
                }
                return o27Var;
            case 10:
                tu0 tu0Var9 = (tu0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var11 = (sk2) tu0Var9;
                if (sk2Var11.O(intValue9 & 1, z4)) {
                    String upperCase = me2.X(sk2Var11, R.string.retry).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    ir6.b(upperCase, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var11, 0, 0, 131070);
                } else {
                    sk2Var11.R();
                }
                return o27Var;
            case 11:
                tu0 tu0Var10 = (tu0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var12 = (sk2) tu0Var10;
                if (sk2Var12.O(intValue10 & 1, z4)) {
                    ir6.b(me2.X(sk2Var12, R.string.leaderboard_ranking_empty), b53.Y(o76.c(wy3Var, 1.0f), 16.0f, 24.0f), 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, ((c17) sk2Var12.j(d17.b)).j, sk2Var12, 48, 0, 65020);
                } else {
                    sk2Var12.R();
                }
                return o27Var;
            case mj2.L /* 12 */:
                tu0 tu0Var11 = (tu0) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var13 = (sk2) tu0Var11;
                if (sk2Var13.O(intValue11 & 1, z4)) {
                    ax2 y = me2.y();
                    zy3 h = o76.h(wy3Var, 18.0f);
                    ye6 ye6Var = ir0.a;
                    ev2.a(y, null, h, ((hr0) sk2Var13.j(ye6Var)).i(), sk2Var13, 432, 0);
                    cg2.k(sk2Var13, o76.k(wy3Var, 8.0f));
                    ir6.b(me2.X(sk2Var13, R.string.leaderboard_open_on_ra), null, ((hr0) sk2Var13.j(ye6Var)).i(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var13, 0, 0, 131066);
                } else {
                    sk2Var13.R();
                }
                return o27Var;
            case 13:
                tu0 tu0Var12 = (tu0) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var14 = (sk2) tu0Var12;
                if (sk2Var14.O(intValue12 & 1, z4)) {
                    String upperCase2 = me2.X(sk2Var14, R.string.retry).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    ir6.b(upperCase2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var14, 0, 0, 131070);
                } else {
                    sk2Var14.R();
                }
                return o27Var;
            case 14:
                tr5 tr5Var = (tr5) obj;
                tu0 tu0Var13 = (tu0) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var15 = (sk2) tu0Var13;
                if (!sk2Var15.O(1 & intValue13, z4)) {
                    sk2Var15.R();
                }
                return o27Var;
            case ig7.e /* 15 */:
                tr5 tr5Var2 = (tr5) obj;
                tu0 tu0Var14 = (tu0) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var16 = (sk2) tu0Var14;
                if (!sk2Var16.O(1 & intValue14, z4)) {
                    sk2Var16.R();
                }
                return o27Var;
            case 16:
                tu0 tu0Var15 = (tu0) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue15 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var17 = (sk2) tu0Var15;
                if (sk2Var17.O(intValue15 & 1, z4)) {
                    ir6.b(me2.X(sk2Var17, R.string.preview), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var17, 0, 0, 131070);
                } else {
                    sk2Var17.R();
                }
                return o27Var;
            case 17:
                tu0 tu0Var16 = (tu0) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var18 = (sk2) tu0Var16;
                if (sk2Var18.O(intValue16 & 1, z4)) {
                    ir6.b(me2.X(sk2Var18, R.string.delete), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var18, 0, 0, 131070);
                } else {
                    sk2Var18.R();
                }
                return o27Var;
            case 18:
                tu0 tu0Var17 = (tu0) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue17 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var19 = (sk2) tu0Var17;
                if (sk2Var19.O(intValue17 & 1, z4)) {
                    String upperCase3 = me2.X(sk2Var19, R.string.save).toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                    ir6.b(upperCase3, null, ((hr0) sk2Var19.j(ir0.a)).i(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var19, 0, 0, 131066);
                } else {
                    sk2Var19.R();
                }
                return o27Var;
            case 19:
                tu0 tu0Var18 = (tu0) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue18 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var20 = (sk2) tu0Var18;
                if (sk2Var20.O(intValue18 & 1, z4)) {
                    ir6.b(me2.X(sk2Var20, R.string.edit), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var20, 0, 0, 131070);
                } else {
                    sk2Var20.R();
                }
                return o27Var;
            case 20:
                tu0 tu0Var19 = (tu0) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue19 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var21 = (sk2) tu0Var19;
                if (sk2Var21.O(intValue19 & 1, z4)) {
                    ir6.b(me2.X(sk2Var21, R.string.delete), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var21, 0, 0, 131070);
                } else {
                    sk2Var21.R();
                }
                return o27Var;
            case 21:
                tu0 tu0Var20 = (tu0) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue20 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var22 = (sk2) tu0Var20;
                if (sk2Var22.O(intValue20 & 1, z4)) {
                    ir6.b(me2.X(sk2Var22, R.string.cheats_footer_note), b53.b0(o76.c(wy3Var, 1.0f), 16.0f, 16.0f, 16.0f, RecyclerView.A1, 8), mj2.C(sk2Var22).i, hi2.L(9.0f, 4294967296L), null, td7.c, hi2.L(0.5f, 4294967296L), new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var22, 1572864, 0, 130352);
                } else {
                    sk2Var22.R();
                }
                return o27Var;
            case 22:
                a11 a11Var = (a11) obj;
                tu0 tu0Var21 = (tu0) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if ((intValue21 & 6) == 0) {
                    if (((sk2) tu0Var21).f(a11Var)) {
                        i6 = 4;
                    }
                    intValue21 |= i6;
                }
                if ((intValue21 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var23 = (sk2) tu0Var21;
                if (sk2Var23.O(intValue21 & 1, z3)) {
                    d50.a(dk7.i(o76.d(o76.c(b53.Z(wy3Var, RecyclerView.A1, d11.g, 1), 1.0f), d11.f), a11Var.c, iq2.g), sk2Var23, 0);
                } else {
                    sk2Var23.R();
                }
                return o27Var;
            case 23:
                tu0 tu0Var22 = (tu0) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue22 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var24 = (sk2) tu0Var22;
                if (sk2Var24.O(intValue22 & 1, z4)) {
                    String upperCase4 = me2.X(sk2Var24, R.string.dsiware_manager_setup).toUpperCase(Locale.ROOT);
                    upperCase4.getClass();
                    ir6.b(upperCase4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var24, 0, 0, 131070);
                } else {
                    sk2Var24.R();
                }
                return o27Var;
            case 24:
                tu0 tu0Var23 = (tu0) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue23 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var25 = (sk2) tu0Var23;
                if (sk2Var25.O(intValue23 & 1, z4)) {
                    String upperCase5 = me2.X(sk2Var25, R.string.dsiware_manager_fix_setup).toUpperCase(Locale.ROOT);
                    upperCase5.getClass();
                    ir6.b(upperCase5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var25, 0, 0, 131070);
                } else {
                    sk2Var25.R();
                }
                return o27Var;
            case 25:
                tu0 tu0Var24 = (tu0) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue24 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var26 = (sk2) tu0Var24;
                if (sk2Var26.O(intValue24 & 1, z4)) {
                    ir6.b("-", null, ((hr0) sk2Var26.j(ir0.a)).f(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var26, 6, 0, 131066);
                } else {
                    sk2Var26.R();
                }
                return o27Var;
            case 26:
                tu0 tu0Var25 = (tu0) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue25 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var27 = (sk2) tu0Var25;
                if (sk2Var27.O(intValue25 & 1, z4)) {
                    ir6.b("+", null, ((hr0) sk2Var27.j(ir0.a)).f(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var27, 6, 0, 131066);
                } else {
                    sk2Var27.R();
                }
                return o27Var;
            case 27:
                tu0 tu0Var26 = (tu0) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue26 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var28 = (sk2) tu0Var26;
                if (sk2Var28.O(intValue26 & 1, z4)) {
                    ir6.b(me2.X(sk2Var28, 17039360), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var28, 0, 0, 131070);
                } else {
                    sk2Var28.R();
                }
                return o27Var;
            case 28:
                tu0 tu0Var27 = (tu0) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue27 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var29 = (sk2) tu0Var27;
                if (sk2Var29.O(intValue27 & 1, z4)) {
                    ir6.b(me2.X(sk2Var29, R.string.edit), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var29, 0, 0, 131070);
                } else {
                    sk2Var29.R();
                }
                return o27Var;
            default:
                tu0 tu0Var28 = (tu0) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue28 & 17) != 16) {
                    z4 = true;
                }
                sk2 sk2Var30 = (sk2) tu0Var28;
                if (sk2Var30.O(intValue28 & 1, z4)) {
                    ir6.b(me2.X(sk2Var30, R.string.delete), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var30, 0, 0, 131070);
                } else {
                    sk2Var30.R();
                }
                return o27Var;
        }
    }
}
