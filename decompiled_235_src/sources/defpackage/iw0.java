package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iw0 implements fo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ iw0(int i) {
        this.A = i;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean h;
        int i = this.A;
        int i2 = 2;
        x64 x64Var = x64.a;
        jg7 jg7Var = jg7.a;
        boolean z4 = true;
        boolean z5 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    gi2.h(xq2Var, dj6.e(x64Var, 8.0f));
                    x73.d(yh2.O(xq2Var, R.string.input_group_hotkeys), xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
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
                    gi2.h(xq2Var2, dj6.e(x64Var, 8.0f));
                    x73.d(yh2.O(xq2Var2, R.string.slot2_analog_mapping_title), xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z5)) {
                    x37.b(yh2.O(xq2Var3, 17039360), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 0, 0, 131070);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var4 = (px0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z5)) {
                    x37.b(yh2.O(xq2Var4, R.string.action_layout_export), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var4, 0, 0, 131070);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 4:
                px0 px0Var5 = (px0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z5)) {
                    x37.b(yh2.O(xq2Var5, R.string.delete), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var5, 0, 0, 131070);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 5:
                px0 px0Var6 = (px0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z5)) {
                    String upperCase = yh2.O(xq2Var6, R.string.cancel).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    x37.b(upperCase, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var6.j(ye7.b)).k, xq2Var6, 0, 0, 65534);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 6:
                px0 px0Var7 = (px0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(intValue7 & 1, z5)) {
                    String upperCase2 = yh2.O(xq2Var7, R.string.login).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    x37.b(upperCase2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var7.j(ye7.b)).k, xq2Var7, 0, 0, 65534);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            case 7:
                px0 px0Var8 = (px0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var8 = (xq2) px0Var8;
                if (xq2Var8.S(intValue8 & 1, z5)) {
                    x37.b(yh2.O(xq2Var8, R.string.action_boot_firmware_ds), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var8, 0, 0, 131070);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 8:
                px0 px0Var9 = (px0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var9 = (xq2) px0Var9;
                if (xq2Var9.S(intValue9 & 1, z5)) {
                    x37.b(yh2.O(xq2Var9, R.string.action_boot_firmware_dsi), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var9, 0, 0, 131070);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case 9:
                px0 px0Var10 = (px0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var10 = (xq2) px0Var10;
                if (xq2Var10.S(intValue10 & 1, z5)) {
                    x37.b(yh2.O(xq2Var10, R.string.dsiware_manager), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var10, 0, 0, 131070);
                } else {
                    xq2Var10.V();
                }
                return jg7Var;
            case 10:
                px0 px0Var11 = (px0) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var11 = (xq2) px0Var11;
                if (xq2Var11.S(intValue11 & 1, z5)) {
                    x37.b(yh2.O(xq2Var11, R.string.action_refresh_rom_list), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var11, 0, 0, 131070);
                } else {
                    xq2Var11.V();
                }
                return jg7Var;
            case 11:
                px0 px0Var12 = (px0) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var12 = (xq2) px0Var12;
                if (xq2Var12.S(intValue12 & 1, z3)) {
                    a74 O = ge7.O(dj6.c(x64Var, 1.0f), 32.0f);
                    e34 d = h70.d(d90.Z, false);
                    int hashCode = Long.hashCode(xq2Var12.T);
                    xv4 l = xq2Var12.l();
                    a74 E = l.E(xq2Var12, O);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var12.f0();
                    if (xq2Var12.S) {
                        xq2Var12.k(iy0Var);
                    } else {
                        xq2Var12.o0();
                    }
                    yh2.K(xq2Var12, ix0.f, d);
                    yh2.K(xq2Var12, ix0.e, l);
                    yh2.K(xq2Var12, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var12, ix0.h);
                    yh2.K(xq2Var12, ix0.d, E);
                    e45.a(null, hv.c(4294901845L), RecyclerView.B1, 0L, 0, xq2Var12, 48, 29);
                    xq2Var12.p(true);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            case 12:
                px0 px0Var13 = (px0) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue13 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var13 = (xq2) px0Var13;
                if (xq2Var13.S(intValue13 & 1, z5)) {
                    gi2.h(xq2Var13, dj6.e(x64Var, 32.0f));
                } else {
                    xq2Var13.V();
                }
                return jg7Var;
            case 13:
                px0 px0Var14 = (px0) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue14 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var14 = (xq2) px0Var14;
                if (xq2Var14.S(intValue14 & 1, z5)) {
                    x37.b(yh2.O(xq2Var14, R.string.rom_action_send_save_file), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var14, 0, 0, 131070);
                } else {
                    xq2Var14.V();
                }
                return jg7Var;
            case 14:
                px0 px0Var15 = (px0) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue15 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var15 = (xq2) px0Var15;
                if (xq2Var15.S(intValue15 & 1, z5)) {
                    x37.b(yh2.O(xq2Var15, R.string.rom_action_import_save_file), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var15, 0, 0, 131070);
                } else {
                    xq2Var15.V();
                }
                return jg7Var;
            case 15:
                px0 px0Var16 = (px0) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var16 = (xq2) px0Var16;
                if (xq2Var16.S(intValue16 & 1, z5)) {
                    String upperCase3 = yh2.O(xq2Var16, R.string.login_with_retro_achievements).toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                    x37.b(upperCase3, null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var16, 0, 0, 130558);
                } else {
                    xq2Var16.V();
                }
                return jg7Var;
            case 16:
                px0 px0Var17 = (px0) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue17 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var17 = (xq2) px0Var17;
                if (xq2Var17.S(intValue17 & 1, z5)) {
                    x37.b(yh2.O(xq2Var17, R.string.retro_achievements_filter_no_results), ge7.P(dj6.c(x64Var, 1.0f), 16.0f, 24.0f), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, ((xe7) xq2Var17.j(ye7.b)).j, xq2Var17, 48, 0, 65020);
                } else {
                    xq2Var17.V();
                }
                return jg7Var;
            case 17:
                px0 px0Var18 = (px0) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue18 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var18 = (xq2) px0Var18;
                if (xq2Var18.S(intValue18 & 1, z5)) {
                    String upperCase4 = yh2.O(xq2Var18, R.string.login_with_retro_achievements).toUpperCase(Locale.ROOT);
                    upperCase4.getClass();
                    x37.b(upperCase4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var18, 0, 0, 131070);
                } else {
                    xq2Var18.V();
                }
                return jg7Var;
            case 18:
                px0 px0Var19 = (px0) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue19 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var19 = (xq2) px0Var19;
                if (xq2Var19.S(intValue19 & 1, z5)) {
                    String upperCase5 = yh2.O(xq2Var19, R.string.retry).toUpperCase(Locale.ROOT);
                    upperCase5.getClass();
                    x37.b(upperCase5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var19, 0, 0, 131070);
                } else {
                    xq2Var19.V();
                }
                return jg7Var;
            case 19:
                px0 px0Var20 = (px0) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue20 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var20 = (xq2) px0Var20;
                if (xq2Var20.S(intValue20 & 1, z5)) {
                    x37.b("Сохранить", null, kt0.d, 0L, oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var20, 196998, 0, 131034);
                } else {
                    xq2Var20.V();
                }
                return jg7Var;
            case 20:
                gl6 gl6Var = (gl6) obj;
                px0 px0Var21 = (px0) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                if ((intValue21 & 6) == 0) {
                    if (((xq2) px0Var21).f(gl6Var)) {
                        i2 = 4;
                    }
                    intValue21 |= i2;
                }
                if ((intValue21 & 19) == 18) {
                    z4 = false;
                }
                xq2 xq2Var21 = (xq2) px0Var21;
                if (xq2Var21.S(intValue21 & 1, z4)) {
                    xk2.e(gl6Var, null, null, xq2Var21, intValue21 & 14);
                } else {
                    xq2Var21.V();
                }
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                gl6 gl6Var2 = (gl6) obj;
                px0 px0Var22 = (px0) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                if ((intValue22 & 6) == 0) {
                    if (((xq2) px0Var22).f(gl6Var2)) {
                        i2 = 4;
                    }
                    intValue22 |= i2;
                }
                if ((intValue22 & 19) == 18) {
                    z4 = false;
                }
                xq2 xq2Var22 = (xq2) px0Var22;
                if (xq2Var22.S(intValue22 & 1, z4)) {
                    xk2.e(gl6Var2, null, null, xq2Var22, intValue22 & 14);
                } else {
                    xq2Var22.V();
                }
                return jg7Var;
            case 22:
                px0 px0Var23 = (px0) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue23 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var23 = (xq2) px0Var23;
                if (xq2Var23.S(intValue23 & 1, z5)) {
                    String upperCase6 = yh2.O(xq2Var23, R.string.cancel).toUpperCase(Locale.ROOT);
                    upperCase6.getClass();
                    x37.b(upperCase6, null, ((ut0) xq2Var23.j(vt0.a)).i(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var23.j(ye7.b)).k, xq2Var23, 0, 0, 65530);
                } else {
                    xq2Var23.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                el6 el6Var = (el6) obj;
                px0 px0Var24 = (px0) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                if ((intValue24 & 6) == 0) {
                    if ((intValue24 & 8) == 0) {
                        h = ((xq2) px0Var24).f(el6Var);
                    } else {
                        h = ((xq2) px0Var24).h(el6Var);
                    }
                    if (h) {
                        i2 = 4;
                    }
                    intValue24 |= i2;
                }
                if ((intValue24 & 19) == 18) {
                    z4 = false;
                }
                xq2 xq2Var24 = (xq2) px0Var24;
                if (xq2Var24.S(intValue24 & 1, z4)) {
                    bl2.j(el6Var, null, null, 0L, 0L, 0L, RecyclerView.B1, xq2Var24, intValue24 & 14);
                } else {
                    xq2Var24.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                px0 px0Var25 = (px0) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue25 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var25 = (xq2) px0Var25;
                if (xq2Var25.S(intValue25 & 1, z5)) {
                    x37.b("Закрыть", null, bl2.F(xq2Var25).l, 0L, oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var25, 196614, 0, 131034);
                } else {
                    xq2Var25.V();
                }
                return jg7Var;
            case 25:
                px0 px0Var26 = (px0) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue26 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var26 = (xq2) px0Var26;
                if (xq2Var26.S(intValue26 & 1, z5)) {
                    x37.b("Закрыть", null, bl2.F(xq2Var26).l, 0L, oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var26, 196614, 0, 131034);
                } else {
                    xq2Var26.V();
                }
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                px0 px0Var27 = (px0) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue27 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var27 = (xq2) px0Var27;
                if (xq2Var27.S(intValue27 & 1, z5)) {
                    x37.b("Закрыть", null, bl2.F(xq2Var27).l, 0L, oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var27, 196614, 0, 131034);
                } else {
                    xq2Var27.V();
                }
                return jg7Var;
            case 27:
                px0 px0Var28 = (px0) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue28 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var28 = (xq2) px0Var28;
                if (xq2Var28.S(intValue28 & 1, z5)) {
                    x37.b("Зоны OCR", null, 0L, 0L, oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var28, 196614, 0, 131038);
                } else {
                    xq2Var28.V();
                }
                return jg7Var;
            case 28:
                px0 px0Var29 = (px0) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue29 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var29 = (xq2) px0Var29;
                if (xq2Var29.S(intValue29 & 1, z5)) {
                    x37.b("Все настройки ⚙️", null, 0L, 0L, oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var29, 196614, 0, 131038);
                } else {
                    xq2Var29.V();
                }
                return jg7Var;
            default:
                px0 px0Var30 = (px0) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue30 & 17) != 16) {
                    z5 = true;
                }
                xq2 xq2Var30 = (xq2) px0Var30;
                if (xq2Var30.S(intValue30 & 1, z5)) {
                    x37.b("Включить", null, ((ut0) xq2Var30.j(vt0.a)).d(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var30, 6, 0, 131066);
                } else {
                    xq2Var30.V();
                }
                return jg7Var;
        }
    }
}
