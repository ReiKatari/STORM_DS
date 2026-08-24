package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n90  reason: default package */
/* loaded from: classes.dex */
public abstract class n90 {
    public static j90 a = j90.CYBER_CYAN;

    public static void a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(v15.b(context), 0);
        String str = "cyber_cyan";
        String string = sharedPreferences.getString("button_color_theme", "cyber_cyan");
        if (string != null) {
            str = string;
        }
        a = b(str);
        sharedPreferences.registerOnSharedPreferenceChangeListener(new gt(1));
    }

    public static j90 b(String str) {
        switch (str.hashCode()) {
            case -2089010380:
                if (str.equals("frost_glacier")) {
                    return j90.STORM_FROST_GLACIER;
                }
                break;
            case -1724634151:
                if (str.equals("gameboy_dmg")) {
                    return j90.GAMEBOY_DMG;
                }
                break;
            case -1677772981:
                if (str.equals("sakura_blossom")) {
                    return j90.STORM_SAKURA_BLOSSOM;
                }
                break;
            case -1508496662:
                if (str.equals("gamecube_indigo")) {
                    return j90.GAMECUBE_INDIGO;
                }
                break;
            case -991342952:
                if (str.equals("virtual_boy")) {
                    return j90.VIRTUAL_BOY;
                }
                break;
            case -649365438:
                if (str.equals("solar_fusion")) {
                    return j90.STORM_SOLAR_FUSION;
                }
                break;
            case -632248315:
                if (str.equals("snes_super")) {
                    return j90.SNES_SUPER;
                }
                break;
            case -168987846:
                if (str.equals("crimson_ruby")) {
                    return j90.CRIMSON_RUBY;
                }
                break;
            case -146853316:
                if (str.equals("classic_white")) {
                    return j90.CLASSIC_WHITE;
                }
                break;
            case -103186769:
                if (str.equals("arcade_retro")) {
                    return j90.STORM_ARCADE_RETRO;
                }
                break;
            case -5204372:
                if (str.equals("classic_grey")) {
                    return j90.CLASSIC_GREY;
                }
                break;
            case 58732238:
                if (str.equals("wii_crystal")) {
                    return j90.WII_CRYSTAL;
                }
                break;
            case 316536380:
                if (str.equals("emerald_matrix")) {
                    return j90.EMERALD_MATRIX;
                }
                break;
            case 431416489:
                if (str.equals("famicom_retro")) {
                    return j90.FAMICOM_RETRO;
                }
                break;
            case 628157657:
                if (str.equals("3ds_aqua")) {
                    return j90.NINTENDO_3DS_AQUA;
                }
                break;
            case 756132182:
                if (str.equals("gba_glacier")) {
                    return j90.GBA_GLACIER;
                }
                break;
            case 919912912:
                if (str.equals("aurora_spectrum")) {
                    return j90.STORM_AURORA_SPECTRUM;
                }
                break;
            case 1427424204:
                if (str.equals("gold_luxury")) {
                    return j90.GOLD_LUXURY;
                }
                break;
            case 1550816570:
                if (str.equals("cyberpunk_neon")) {
                    return j90.STORM_CYBERPUNK_NEON;
                }
                break;
            case 1745955432:
                if (str.equals("wii_u_dark")) {
                    return j90.WII_U_DARK;
                }
                break;
            case 1884016651:
                if (str.equals("midnight_purple")) {
                    return j90.MIDNIGHT_PURPLE;
                }
                break;
            case 2129193985:
                if (str.equals("switch_neon")) {
                    return j90.SWITCH_NEON;
                }
                break;
            case 2129230183:
                if (str.equals("switch_oled")) {
                    return j90.SWITCH_OLED;
                }
                break;
        }
        return j90.CYBER_CYAN;
    }
}
