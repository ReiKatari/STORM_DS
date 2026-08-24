package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n90  reason: default package */
/* loaded from: classes.dex */
public abstract class n90 {
    public static defpackage.j90 a;

    static {
            j90 r0 = defpackage.j90.CYBER_CYAN
            defpackage.n90.a = r0
            return
    }

    public static void a(android.content.Context r2) {
            java.lang.String r0 = defpackage.v15.b(r2)
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            java.lang.String r0 = "button_color_theme"
            java.lang.String r1 = "cyber_cyan"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            j90 r0 = b(r1)
            defpackage.n90.a = r0
            gt r0 = new gt
            r1 = 1
            r0.<init>(r1)
            r2.registerOnSharedPreferenceChangeListener(r0)
            return
    }

    public static defpackage.j90 b(java.lang.String r1) {
            int r0 = r1.hashCode()
            switch(r0) {
                case -2089010380: goto L11f;
                case -1724634151: goto L113;
                case -1677772981: goto L107;
                case -1508496662: goto Lfb;
                case -991342952: goto Lef;
                case -649365438: goto Le3;
                case -632248315: goto Ld7;
                case -168987846: goto Lcb;
                case -146853316: goto Lbf;
                case -103186769: goto Lb2;
                case -5204372: goto La5;
                case 58732238: goto L98;
                case 316536380: goto L8b;
                case 431416489: goto L7e;
                case 628157657: goto L71;
                case 756132182: goto L64;
                case 919912912: goto L57;
                case 1427424204: goto L4a;
                case 1550816570: goto L3d;
                case 1745955432: goto L30;
                case 1884016651: goto L23;
                case 2129193985: goto L16;
                case 2129230183: goto L9;
                default: goto L7;
            }
        L7:
            goto L127
        L9:
            java.lang.String r0 = "switch_oled"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L13
            goto L127
        L13:
            j90 r1 = defpackage.j90.SWITCH_OLED
            return r1
        L16:
            java.lang.String r0 = "switch_neon"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L20
            goto L127
        L20:
            j90 r1 = defpackage.j90.SWITCH_NEON
            return r1
        L23:
            java.lang.String r0 = "midnight_purple"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L2d
            goto L127
        L2d:
            j90 r1 = defpackage.j90.MIDNIGHT_PURPLE
            return r1
        L30:
            java.lang.String r0 = "wii_u_dark"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3a
            goto L127
        L3a:
            j90 r1 = defpackage.j90.WII_U_DARK
            return r1
        L3d:
            java.lang.String r0 = "cyberpunk_neon"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L47
            goto L127
        L47:
            j90 r1 = defpackage.j90.STORM_CYBERPUNK_NEON
            return r1
        L4a:
            java.lang.String r0 = "gold_luxury"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L54
            goto L127
        L54:
            j90 r1 = defpackage.j90.GOLD_LUXURY
            return r1
        L57:
            java.lang.String r0 = "aurora_spectrum"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L61
            goto L127
        L61:
            j90 r1 = defpackage.j90.STORM_AURORA_SPECTRUM
            return r1
        L64:
            java.lang.String r0 = "gba_glacier"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            goto L127
        L6e:
            j90 r1 = defpackage.j90.GBA_GLACIER
            return r1
        L71:
            java.lang.String r0 = "3ds_aqua"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7b
            goto L127
        L7b:
            j90 r1 = defpackage.j90.NINTENDO_3DS_AQUA
            return r1
        L7e:
            java.lang.String r0 = "famicom_retro"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L88
            goto L127
        L88:
            j90 r1 = defpackage.j90.FAMICOM_RETRO
            return r1
        L8b:
            java.lang.String r0 = "emerald_matrix"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L95
            goto L127
        L95:
            j90 r1 = defpackage.j90.EMERALD_MATRIX
            return r1
        L98:
            java.lang.String r0 = "wii_crystal"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto La2
            goto L127
        La2:
            j90 r1 = defpackage.j90.WII_CRYSTAL
            return r1
        La5:
            java.lang.String r0 = "classic_grey"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Laf
            goto L127
        Laf:
            j90 r1 = defpackage.j90.CLASSIC_GREY
            return r1
        Lb2:
            java.lang.String r0 = "arcade_retro"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lbc
            goto L127
        Lbc:
            j90 r1 = defpackage.j90.STORM_ARCADE_RETRO
            return r1
        Lbf:
            java.lang.String r0 = "classic_white"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lc8
            goto L127
        Lc8:
            j90 r1 = defpackage.j90.CLASSIC_WHITE
            return r1
        Lcb:
            java.lang.String r0 = "crimson_ruby"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Ld4
            goto L127
        Ld4:
            j90 r1 = defpackage.j90.CRIMSON_RUBY
            return r1
        Ld7:
            java.lang.String r0 = "snes_super"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Le0
            goto L127
        Le0:
            j90 r1 = defpackage.j90.SNES_SUPER
            return r1
        Le3:
            java.lang.String r0 = "solar_fusion"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lec
            goto L127
        Lec:
            j90 r1 = defpackage.j90.STORM_SOLAR_FUSION
            return r1
        Lef:
            java.lang.String r0 = "virtual_boy"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lf8
            goto L127
        Lf8:
            j90 r1 = defpackage.j90.VIRTUAL_BOY
            return r1
        Lfb:
            java.lang.String r0 = "gamecube_indigo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L104
            goto L127
        L104:
            j90 r1 = defpackage.j90.GAMECUBE_INDIGO
            return r1
        L107:
            java.lang.String r0 = "sakura_blossom"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L110
            goto L127
        L110:
            j90 r1 = defpackage.j90.STORM_SAKURA_BLOSSOM
            return r1
        L113:
            java.lang.String r0 = "gameboy_dmg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L11c
            goto L127
        L11c:
            j90 r1 = defpackage.j90.GAMEBOY_DMG
            return r1
        L11f:
            java.lang.String r0 = "frost_glacier"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L12a
        L127:
            j90 r1 = defpackage.j90.CYBER_CYAN
            return r1
        L12a:
            j90 r1 = defpackage.j90.STORM_FROST_GLACIER
            return r1
    }
}
