package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kw0 implements fo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ kw0(int i) {
        this.A = i;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        String l;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4 = this.A;
        int i5 = R.string.retro_achievements_filter_all;
        int i6 = 2;
        x64 x64Var = x64.a;
        jg7 jg7Var = jg7.a;
        boolean z5 = false;
        switch (i4) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z5)) {
                    i13.b(kj2.R(xq2Var, R.drawable.ic_trophy), null, dj6.c, ((ut0) xq2Var.j(vt0.a)).i(), xq2Var, 440, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z5)) {
                    i13.a(ej2.C(), null, dj6.c, ((ut0) xq2Var2.j(vt0.a)).i(), xq2Var2, 432, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z5)) {
                    bl2.b(kj2.R(xq2Var3, R.drawable.ic_completed), dj6.c, null, null, RecyclerView.B1, xq2Var3, 440, 120);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var4 = (px0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z5)) {
                    bl2.b(kj2.R(xq2Var4, R.drawable.ic_completed), dj6.c, null, null, RecyclerView.B1, xq2Var4, 440, 120);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 4:
                px0 px0Var5 = (px0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z5)) {
                    bl2.b(kj2.R(xq2Var5, R.drawable.ic_points), dj6.c, null, null, RecyclerView.B1, xq2Var5, 440, 120);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 5:
                l6 l6Var = (l6) obj;
                ((Integer) obj3).getClass();
                l6Var.getClass();
                xq2 xq2Var6 = (xq2) ((px0) obj2);
                xq2Var6.b0(2044048407);
                int i7 = v5.a[l6Var.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                i = -845922168;
                                i2 = R.string.retro_achievements_filter_unofficial;
                            } else {
                                throw xg6.f(xq2Var6, -845932954, false);
                            }
                        } else {
                            l = i61.l(xq2Var6, -845925437, R.string.retro_achievements_leaderboards, xq2Var6, false);
                        }
                    } else {
                        i = -845928734;
                        i2 = R.string.retro_achievements_filter_core;
                    }
                    l = i61.l(xq2Var6, i, i2, xq2Var6, false);
                } else {
                    l = i61.l(xq2Var6, -845931743, R.string.retro_achievements_filter_all, xq2Var6, false);
                }
                xq2Var6.p(false);
                return l;
            case 6:
                g6 g6Var = (g6) obj;
                ((Integer) obj3).getClass();
                g6Var.getClass();
                xq2 xq2Var7 = (xq2) ((px0) obj2);
                xq2Var7.b0(1364883258);
                switch (v5.b[g6Var.ordinal()]) {
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
                    case 6:
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
                        throw xg6.f(xq2Var7, -1245257120, false);
                }
                String l2 = i61.l(xq2Var7, i3, i5, xq2Var7, false);
                xq2Var7.p(false);
                return l2;
            case 7:
                px0 px0Var6 = (px0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var8 = (xq2) px0Var6;
                if (xq2Var8.S(intValue6 & 1, z5)) {
                    x37.b(yh2.O(xq2Var8, R.string.retro_achievements_filter_no_results), ge7.Q(dj6.c(x64Var, 1.0f), RecyclerView.B1, 24.0f, 1), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, ((xe7) xq2Var8.j(ye7.b)).j, xq2Var8, 48, 0, 65020);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 8:
                px0 px0Var7 = (px0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var9 = (xq2) px0Var7;
                if (xq2Var9.S(1 & intValue7, z)) {
                    nc1.c(yh2.O(xq2Var9, R.string.retro_achievements_leaderboards), xq2Var9, 0);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case 9:
                px0 px0Var8 = (px0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var10 = (xq2) px0Var8;
                if (xq2Var10.S(intValue8 & 1, z2)) {
                    a74 O = ge7.O(dj6.c(x64Var, 1.0f), 32.0f);
                    e34 d = h70.d(d90.Z, false);
                    int hashCode = Long.hashCode(xq2Var10.T);
                    xv4 l3 = xq2Var10.l();
                    a74 E = l.E(xq2Var10, O);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var10.f0();
                    if (xq2Var10.S) {
                        xq2Var10.k(iy0Var);
                    } else {
                        xq2Var10.o0();
                    }
                    yh2.K(xq2Var10, ix0.f, d);
                    yh2.K(xq2Var10, ix0.e, l3);
                    yh2.K(xq2Var10, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var10, ix0.h);
                    yh2.K(xq2Var10, ix0.d, E);
                    e45.a(null, ((ut0) xq2Var10.j(vt0.a)).i(), RecyclerView.B1, 0L, 0, xq2Var10, 0, 29);
                    xq2Var10.p(true);
                } else {
                    xq2Var10.V();
                }
                return jg7Var;
            case 10:
                px0 px0Var9 = (px0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var11 = (xq2) px0Var9;
                if (xq2Var11.S(intValue9 & 1, z5)) {
                    String upperCase = yh2.O(xq2Var11, R.string.retry).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    x37.b(upperCase, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var11, 0, 0, 131070);
                } else {
                    xq2Var11.V();
                }
                return jg7Var;
            case 11:
                px0 px0Var10 = (px0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var12 = (xq2) px0Var10;
                if (xq2Var12.S(intValue10 & 1, z5)) {
                    x37.b(yh2.O(xq2Var12, R.string.leaderboard_ranking_empty), ge7.P(dj6.c(x64Var, 1.0f), 16.0f, 24.0f), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, ((xe7) xq2Var12.j(ye7.b)).j, xq2Var12, 48, 0, 65020);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            case 12:
                px0 px0Var11 = (px0) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var13 = (xq2) px0Var11;
                if (xq2Var13.S(intValue11 & 1, z5)) {
                    e33 B = kj2.B();
                    a74 i8 = dj6.i(x64Var, 18.0f);
                    nq6 nq6Var = vt0.a;
                    i13.a(B, null, i8, ((ut0) xq2Var13.j(nq6Var)).i(), xq2Var13, 432, 0);
                    gi2.h(xq2Var13, dj6.l(x64Var, 8.0f));
                    x37.b(yh2.O(xq2Var13, R.string.leaderboard_open_on_ra), null, ((ut0) xq2Var13.j(nq6Var)).i(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var13, 0, 0, 131066);
                } else {
                    xq2Var13.V();
                }
                return jg7Var;
            case 13:
                px0 px0Var12 = (px0) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var14 = (xq2) px0Var12;
                if (xq2Var14.S(intValue12 & 1, z5)) {
                    String upperCase2 = yh2.O(xq2Var14, R.string.retry).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    x37.b(upperCase2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var14, 0, 0, 131070);
                } else {
                    xq2Var14.V();
                }
                return jg7Var;
            case 14:
                m26 m26Var = (m26) obj;
                px0 px0Var13 = (px0) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var15 = (xq2) px0Var13;
                if (!xq2Var15.S(1 & intValue13, z5)) {
                    xq2Var15.V();
                }
                return jg7Var;
            case 15:
                m26 m26Var2 = (m26) obj;
                px0 px0Var14 = (px0) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var16 = (xq2) px0Var14;
                if (!xq2Var16.S(1 & intValue14, z5)) {
                    xq2Var16.V();
                }
                return jg7Var;
            case 16:
                px0 px0Var15 = (px0) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue15 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var17 = (xq2) px0Var15;
                if (xq2Var17.S(intValue15 & 1, z5)) {
                    x37.b(yh2.O(xq2Var17, R.string.preview), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var17, 0, 0, 131070);
                } else {
                    xq2Var17.V();
                }
                return jg7Var;
            case 17:
                px0 px0Var16 = (px0) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var18 = (xq2) px0Var16;
                if (xq2Var18.S(intValue16 & 1, z5)) {
                    x37.b(yh2.O(xq2Var18, R.string.delete), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var18, 0, 0, 131070);
                } else {
                    xq2Var18.V();
                }
                return jg7Var;
            case 18:
                px0 px0Var17 = (px0) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue17 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var19 = (xq2) px0Var17;
                if (xq2Var19.S(intValue17 & 1, z5)) {
                    String upperCase3 = yh2.O(xq2Var19, R.string.save).toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                    x37.b(upperCase3, null, ((ut0) xq2Var19.j(vt0.a)).i(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var19, 0, 0, 131066);
                } else {
                    xq2Var19.V();
                }
                return jg7Var;
            case 19:
                px0 px0Var18 = (px0) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue18 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var20 = (xq2) px0Var18;
                if (xq2Var20.S(intValue18 & 1, z5)) {
                    x37.b(yh2.O(xq2Var20, R.string.edit), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var20, 0, 0, 131070);
                } else {
                    xq2Var20.V();
                }
                return jg7Var;
            case 20:
                px0 px0Var19 = (px0) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue19 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var21 = (xq2) px0Var19;
                if (xq2Var21.S(intValue19 & 1, z5)) {
                    x37.b(yh2.O(xq2Var21, R.string.delete), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var21, 0, 0, 131070);
                } else {
                    xq2Var21.V();
                }
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                px0 px0Var20 = (px0) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue20 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var22 = (xq2) px0Var20;
                if (xq2Var22.S(intValue20 & 1, z5)) {
                    x37.b(yh2.O(xq2Var22, R.string.cheats_footer_note), ge7.S(dj6.c(x64Var, 1.0f), 16.0f, 16.0f, 16.0f, RecyclerView.B1, 8), bl2.F(xq2Var22).i, hi2.J(9.0f, 4294967296L), null, qs7.c, hi2.J(0.5f, 4294967296L), new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var22, 1572864, 0, 130352);
                } else {
                    xq2Var22.V();
                }
                return jg7Var;
            case 22:
                i41 i41Var = (i41) obj;
                px0 px0Var21 = (px0) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if ((intValue21 & 6) == 0) {
                    if (((xq2) px0Var21).f(i41Var)) {
                        i6 = 4;
                    }
                    intValue21 |= i6;
                }
                if ((intValue21 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var23 = (xq2) px0Var21;
                if (xq2Var23.S(intValue21 & 1, z3)) {
                    h70.a(vy7.L(dj6.e(dj6.c(ge7.Q(x64Var, RecyclerView.B1, l41.g, 1), 1.0f), l41.f), i41Var.c, u24.m), xq2Var23, 0);
                } else {
                    xq2Var23.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                px0 px0Var22 = (px0) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue22 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var24 = (xq2) px0Var22;
                if (xq2Var24.S(intValue22 & 1, z5)) {
                    String upperCase4 = yh2.O(xq2Var24, R.string.dsiware_manager_setup).toUpperCase(Locale.ROOT);
                    upperCase4.getClass();
                    x37.b(upperCase4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var24, 0, 0, 131070);
                } else {
                    xq2Var24.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                px0 px0Var23 = (px0) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue23 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var25 = (xq2) px0Var23;
                if (xq2Var25.S(intValue23 & 1, z5)) {
                    String upperCase5 = yh2.O(xq2Var25, R.string.dsiware_manager_fix_setup).toUpperCase(Locale.ROOT);
                    upperCase5.getClass();
                    x37.b(upperCase5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var25, 0, 0, 131070);
                } else {
                    xq2Var25.V();
                }
                return jg7Var;
            case 25:
                px0 px0Var24 = (px0) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue24 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var26 = (xq2) px0Var24;
                if (xq2Var26.S(intValue24 & 1, z5)) {
                    x37.b(yh2.O(xq2Var26, R.string.cancel), null, bl2.F(xq2Var26).h, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var26, 0, 0, 131066);
                } else {
                    xq2Var26.V();
                }
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                px0 px0Var25 = (px0) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue25 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var27 = (xq2) px0Var25;
                if (xq2Var27.S(intValue25 & 1, z5)) {
                    x37.b(yh2.O(xq2Var27, R.string.decrypt_rom_button), null, bl2.F(xq2Var27).l, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var27, 0, 0, 131066);
                } else {
                    xq2Var27.V();
                }
                return jg7Var;
            case 27:
                px0 px0Var26 = (px0) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue26 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var28 = (xq2) px0Var26;
                if (xq2Var28.S(intValue26 & 1, z5)) {
                    x37.b(yh2.O(xq2Var28, R.string.ok), null, bl2.F(xq2Var28).l, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var28, 0, 0, 131066);
                } else {
                    xq2Var28.V();
                }
                return jg7Var;
            case 28:
                px0 px0Var27 = (px0) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue27 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var29 = (xq2) px0Var27;
                if (xq2Var29.S(intValue27 & 1, z5)) {
                    x37.b(yh2.O(xq2Var29, R.string.ok), null, bl2.F(xq2Var29).h, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var29, 0, 0, 131066);
                } else {
                    xq2Var29.V();
                }
                return jg7Var;
            default:
                px0 px0Var28 = (px0) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue28 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var30 = (xq2) px0Var28;
                if (xq2Var30.S(1 & intValue28, z4)) {
                    x73.d(yh2.O(xq2Var30, R.string.input_group_console), xq2Var30, 0);
                } else {
                    xq2Var30.V();
                }
                return jg7Var;
        }
    }
}
