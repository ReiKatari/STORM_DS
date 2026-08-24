package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fn0 implements eo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ fn0(int i) {
        this.A = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        x64 x64Var = x64.a;
        jg7 jg7Var = jg7.a;
        int i2 = 2;
        boolean z3 = false;
        switch (i) {
            case 0:
                jn0 jn0Var = (jn0) obj2;
                ((n46) obj).getClass();
                jn0Var.getClass();
                kw3 I = hf.I();
                if (jn0Var.equals(hn0.b)) {
                    i2 = 0;
                } else if (jn0Var.equals(in0.b)) {
                    i2 = 1;
                } else if (!(jn0Var instanceof gn0)) {
                    i.d();
                    return null;
                }
                I.add(Integer.valueOf(i2));
                if (jn0Var instanceof gn0) {
                    Cheat cheat = ((gn0) jn0Var).b;
                    cheat.getClass();
                    I.add(new ho0(cheat.getId(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), cheat.getEnabled()));
                }
                return hf.A(I);
            case 1:
                n46 n46Var = (n46) obj;
                xn0 xn0Var = (xn0) obj2;
                n46Var.getClass();
                xn0Var.getClass();
                Boolean valueOf = Boolean.valueOf(xn0Var.a);
                eo2 eo2Var = (eo2) c37.d.B;
                return hf.c0(valueOf, eo2Var.o(n46Var, (c37) xn0Var.b.getValue()), eo2Var.o(n46Var, (c37) xn0Var.c.getValue()), eo2Var.o(n46Var, (c37) xn0Var.d.getValue()));
            case 2:
                ((Integer) obj).intValue();
                Cheat cheat2 = (Cheat) obj2;
                cheat2.getClass();
                Long id = cheat2.getId();
                if (id == null) {
                    return cheat2.getCode();
                }
                return id;
            case 3:
                String str = (String) obj;
                j61 j61Var = (j61) obj2;
                str.getClass();
                j61Var.getClass();
                if (str.length() == 0) {
                    return j61Var.toString();
                }
                return str + ", " + j61Var;
            case 4:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(1 & intValue, z3)) {
                    i13.a(jw2.q(), yh2.O(xq2Var, R.string.navigate_back), null, 0L, xq2Var, 0, 12);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 5:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(1 & intValue2, z3)) {
                    i13.a(kj2.B(), yh2.O(xq2Var2, R.string.leaderboard_open_on_ra), null, ((ut0) xq2Var2.j(vt0.a)).i(), xq2Var2, 0, 4);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 6:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (!xq2Var3.S(1 & intValue3, z3)) {
                    xq2Var3.V();
                }
                return jg7Var;
            case 7:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(1 & intValue4, z3)) {
                    i13.b(kn2.Z(jw2.q(), xq2Var4), null, null, 0L, xq2Var4, 56, 12);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 8:
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(1 & intValue5, z3)) {
                    i13.b(kn2.Z(n16.y(), xq2Var5), yh2.O(xq2Var5, R.string.cancel), null, 0L, xq2Var5, 8, 12);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 9:
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(1 & intValue6, z3)) {
                    x37.b(yh2.O(xq2Var6, R.string.cheat_name), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var6, 0, 0, 131070);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 10:
                px0 px0Var7 = (px0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(1 & intValue7, z3)) {
                    x37.b(yh2.O(xq2Var7, R.string.error_name_cannot_be_empty), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var7, 0, 0, 131070);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            case 11:
                px0 px0Var8 = (px0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var8 = (xq2) px0Var8;
                if (xq2Var8.S(1 & intValue8, z3)) {
                    x37.b(yh2.O(xq2Var8, R.string.description), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var8, 0, 0, 131070);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 12:
                px0 px0Var9 = (px0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var9 = (xq2) px0Var9;
                if (xq2Var9.S(1 & intValue9, z3)) {
                    x37.b(yh2.O(xq2Var9, R.string.cheat_code), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var9, 0, 0, 131070);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case 13:
                px0 px0Var10 = (px0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var10 = (xq2) px0Var10;
                if (xq2Var10.S(intValue10 & 1, z)) {
                    e33 e33Var = hi2.d;
                    if (e33Var == null) {
                        d33 d33Var = new d33("AutoMirrored.Filled.PlaylistAdd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i3 = el7.a;
                        cn6 cn6Var = new cn6(kt0.b);
                        ww2 ww2Var = new ww2(1, (byte) 0);
                        ww2Var.o(14.0f, 10.0f);
                        ww2Var.k(3.0f);
                        ww2Var.u(2.0f);
                        ww2Var.l(11.0f);
                        ww2Var.t(10.0f);
                        ww2Var.g();
                        ww2Var.o(14.0f, 6.0f);
                        ww2Var.k(3.0f);
                        ww2Var.u(2.0f);
                        ww2Var.l(11.0f);
                        ww2Var.t(6.0f);
                        ww2Var.g();
                        ww2Var.o(18.0f, 14.0f);
                        ww2Var.u(-4.0f);
                        ww2Var.l(-2.0f);
                        ww2Var.u(4.0f);
                        ww2Var.l(-4.0f);
                        ww2Var.u(2.0f);
                        ww2Var.l(4.0f);
                        ww2Var.u(4.0f);
                        ww2Var.l(2.0f);
                        ww2Var.u(-4.0f);
                        ww2Var.l(4.0f);
                        ww2Var.u(-2.0f);
                        ww2Var.k(18.0f);
                        ww2Var.g();
                        ww2Var.o(3.0f, 16.0f);
                        ww2Var.l(7.0f);
                        ww2Var.u(-2.0f);
                        ww2Var.k(3.0f);
                        ww2Var.t(16.0f);
                        ww2Var.g();
                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                        e33Var = d33Var.b();
                        hi2.d = e33Var;
                    }
                    i13.b(kn2.Z(e33Var, xq2Var10), yh2.O(xq2Var10, R.string.add_cheat_folder), null, 0L, xq2Var10, 8, 12);
                } else {
                    xq2Var10.V();
                }
                return jg7Var;
            case 14:
                px0 px0Var11 = (px0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var11 = (xq2) px0Var11;
                if (xq2Var11.S(1 & intValue11, z3)) {
                    is7.a(hf.c0(new rq2(null, yh2.O(xq2Var11, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var11, R.string.pause_hint_accept)), new rq2("B", yh2.O(xq2Var11, R.string.pause_hint_back))), nc1.j0(vy7.L(x64Var, bl2.F(xq2Var11).b, u24.m), nc1.r), false, xq2Var11, 0, 4);
                } else {
                    xq2Var11.V();
                }
                return jg7Var;
            case 15:
                px0 px0Var12 = (px0) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var12 = (xq2) px0Var12;
                if (xq2Var12.S(1 & intValue12, z3)) {
                    i13.a(mp2.J(), null, dj6.i(x64Var, 20.0f), kt0.c(0.5f, kt0.d), xq2Var12, 3504, 0);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            case 16:
                px0 px0Var13 = (px0) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var13 = (xq2) px0Var13;
                if (xq2Var13.S(1 & intValue13, z3)) {
                    i13.a(mp2.J(), null, dj6.i(x64Var, 20.0f), kt0.c(0.5f, kt0.d), xq2Var13, 3504, 0);
                } else {
                    xq2Var13.V();
                }
                return jg7Var;
            case 17:
                px0 px0Var14 = (px0) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var14 = (xq2) px0Var14;
                if (!xq2Var14.S(1 & intValue14, z3)) {
                    xq2Var14.V();
                }
                return jg7Var;
            case 18:
                px0 px0Var15 = (px0) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var15 = (xq2) px0Var15;
                if (xq2Var15.S(1 & intValue15, z3)) {
                    e45.a(null, bl2.F(xq2Var15).j, RecyclerView.B1, 0L, 0, xq2Var15, 0, 29);
                } else {
                    xq2Var15.V();
                }
                return jg7Var;
            case 19:
                px0 px0Var16 = (px0) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var16 = (xq2) px0Var16;
                if (xq2Var16.S(1 & intValue16, z3)) {
                    x37.b(yh2.O(xq2Var16, R.string.select_dsiware_title), null, ((ut0) xq2Var16.j(vt0.a)).d(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var16, 0, 0, 131066);
                } else {
                    xq2Var16.V();
                }
                return jg7Var;
            case 20:
                px0 px0Var17 = (px0) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var17 = (xq2) px0Var17;
                if (xq2Var17.S(1 & intValue17, z3)) {
                    i13.a(n16.y(), yh2.O(xq2Var17, R.string.close), null, ((ut0) xq2Var17.j(vt0.a)).d(), xq2Var17, 0, 4);
                } else {
                    xq2Var17.V();
                }
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                px0 px0Var18 = (px0) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var18 = (xq2) px0Var18;
                if (!xq2Var18.S(1 & intValue18, z3)) {
                    xq2Var18.V();
                }
                return jg7Var;
            case 22:
                px0 px0Var19 = (px0) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var19 = (xq2) px0Var19;
                if (xq2Var19.S(intValue19 & 1, z2)) {
                    e33 e33Var2 = u24.q;
                    if (e33Var2 == null) {
                        d33 d33Var2 = new d33("Filled.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = el7.a;
                        cn6 cn6Var2 = new cn6(kt0.b);
                        ww2 ww2Var2 = new ww2(1, (byte) 0);
                        ww2Var2.o(20.0f, 6.0f);
                        ww2Var2.l(-8.0f);
                        ww2Var2.n(-2.0f, -2.0f);
                        ww2Var2.m(4.0f, 4.0f);
                        ww2Var2.i(-1.11f, RecyclerView.B1, -1.99f, 0.89f, -1.99f, 2.0f);
                        ww2Var2.m(2.0f, 18.0f);
                        ww2Var2.i(RecyclerView.B1, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                        ww2Var2.l(16.0f);
                        ww2Var2.i(1.11f, RecyclerView.B1, 2.0f, -0.89f, 2.0f, -2.0f);
                        ww2Var2.m(22.0f, 8.0f);
                        ww2Var2.i(RecyclerView.B1, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                        ww2Var2.g();
                        ww2Var2.o(19.0f, 14.0f);
                        ww2Var2.l(-3.0f);
                        ww2Var2.u(3.0f);
                        ww2Var2.l(-2.0f);
                        ww2Var2.u(-3.0f);
                        ww2Var2.l(-3.0f);
                        ww2Var2.u(-2.0f);
                        ww2Var2.l(3.0f);
                        ww2Var2.m(14.0f, 9.0f);
                        ww2Var2.l(2.0f);
                        ww2Var2.u(3.0f);
                        ww2Var2.l(3.0f);
                        ww2Var2.u(2.0f);
                        ww2Var2.g();
                        d33.a(d33Var2, ww2Var2.b, 0, cn6Var2);
                        e33Var2 = d33Var2.b();
                        u24.q = e33Var2;
                    }
                    i13.b(kn2.Z(e33Var2, xq2Var19), yh2.O(xq2Var19, R.string.add_cheat_folder), null, 0L, xq2Var19, 8, 12);
                } else {
                    xq2Var19.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                px0 px0Var20 = (px0) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var20 = (xq2) px0Var20;
                if (xq2Var20.S(1 & intValue20, z3)) {
                    i13.a(n16.y(), "Close", null, kt0.d, xq2Var20, 3120, 4);
                } else {
                    xq2Var20.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                px0 px0Var21 = (px0) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var21 = (xq2) px0Var21;
                if (!xq2Var21.S(1 & intValue21, z3)) {
                    xq2Var21.V();
                }
                return jg7Var;
            case 25:
                px0 px0Var22 = (px0) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var22 = (xq2) px0Var22;
                if (xq2Var22.S(1 & intValue22, z3)) {
                    i13.a(oi2.A(), yh2.O(xq2Var22, R.string.options), null, 0L, xq2Var22, 0, 12);
                } else {
                    xq2Var22.V();
                }
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                px0 px0Var23 = (px0) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var23 = (xq2) px0Var23;
                if (xq2Var23.S(1 & intValue23, z3)) {
                    i13.a(jw2.q(), "Назад", dj6.i(x64Var, 18.0f), kt0.d, xq2Var23, 3504, 0);
                } else {
                    xq2Var23.V();
                }
                return jg7Var;
            case 27:
                px0 px0Var24 = (px0) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var24 = (xq2) px0Var24;
                if (xq2Var24.S(1 & intValue24, z3)) {
                    x37.b(yh2.O(xq2Var24, R.string.username), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var24, 0, 0, 131070);
                } else {
                    xq2Var24.V();
                }
                return jg7Var;
            case 28:
                px0 px0Var25 = (px0) obj;
                int intValue25 = ((Integer) obj2).intValue();
                if ((intValue25 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var25 = (xq2) px0Var25;
                if (xq2Var25.S(1 & intValue25, z3)) {
                    x37.b(yh2.O(xq2Var25, R.string.password), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var25, 0, 0, 131070);
                } else {
                    xq2Var25.V();
                }
                return jg7Var;
            default:
                px0 px0Var26 = (px0) obj;
                int intValue26 = ((Integer) obj2).intValue();
                if ((intValue26 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var26 = (xq2) px0Var26;
                if (!xq2Var26.S(1 & intValue26, z3)) {
                    xq2Var26.V();
                }
                return jg7Var;
        }
    }
}
