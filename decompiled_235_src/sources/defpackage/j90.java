package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j90  reason: default package */
/* loaded from: classes.dex */
public final class j90 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ j90[] $VALUES;
    public static final j90 CYBER_CYAN = new j90("CYBER_CYAN", 0);
    public static final j90 CLASSIC_WHITE = new j90("CLASSIC_WHITE", 1);
    public static final j90 CLASSIC_GREY = new j90("CLASSIC_GREY", 2);
    public static final j90 SNES_SUPER = new j90("SNES_SUPER", 3);
    public static final j90 CRIMSON_RUBY = new j90("CRIMSON_RUBY", 4);
    public static final j90 MIDNIGHT_PURPLE = new j90("MIDNIGHT_PURPLE", 5);
    public static final j90 GOLD_LUXURY = new j90("GOLD_LUXURY", 6);
    public static final j90 EMERALD_MATRIX = new j90("EMERALD_MATRIX", 7);
    public static final j90 WII_CRYSTAL = new j90("WII_CRYSTAL", 8);
    public static final j90 WII_U_DARK = new j90("WII_U_DARK", 9);
    public static final j90 SWITCH_NEON = new j90("SWITCH_NEON", 10);
    public static final j90 SWITCH_OLED = new j90("SWITCH_OLED", 11);
    public static final j90 VIRTUAL_BOY = new j90("VIRTUAL_BOY", 12);
    public static final j90 GAMECUBE_INDIGO = new j90("GAMECUBE_INDIGO", 13);
    public static final j90 GAMEBOY_DMG = new j90("GAMEBOY_DMG", 14);
    public static final j90 GBA_GLACIER = new j90("GBA_GLACIER", 15);
    public static final j90 FAMICOM_RETRO = new j90("FAMICOM_RETRO", 16);
    public static final j90 NINTENDO_3DS_AQUA = new j90("NINTENDO_3DS_AQUA", 17);
    public static final j90 STORM_ARCADE_RETRO = new j90("STORM_ARCADE_RETRO", 18);
    public static final j90 STORM_AURORA_SPECTRUM = new j90("STORM_AURORA_SPECTRUM", 19);
    public static final j90 STORM_CYBERPUNK_NEON = new j90("STORM_CYBERPUNK_NEON", 20);
    public static final j90 STORM_FROST_GLACIER = new j90("STORM_FROST_GLACIER", 21);
    public static final j90 STORM_SAKURA_BLOSSOM = new j90("STORM_SAKURA_BLOSSOM", 22);
    public static final j90 STORM_SOLAR_FUSION = new j90("STORM_SOLAR_FUSION", 23);

    private static final /* synthetic */ j90[] $values() {
        return new j90[]{CYBER_CYAN, CLASSIC_WHITE, CLASSIC_GREY, SNES_SUPER, CRIMSON_RUBY, MIDNIGHT_PURPLE, GOLD_LUXURY, EMERALD_MATRIX, WII_CRYSTAL, WII_U_DARK, SWITCH_NEON, SWITCH_OLED, VIRTUAL_BOY, GAMECUBE_INDIGO, GAMEBOY_DMG, GBA_GLACIER, FAMICOM_RETRO, NINTENDO_3DS_AQUA, STORM_ARCADE_RETRO, STORM_AURORA_SPECTRUM, STORM_CYBERPUNK_NEON, STORM_FROST_GLACIER, STORM_SAKURA_BLOSSOM, STORM_SOLAR_FUSION};
    }

    static {
        j90[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private j90(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static j90 valueOf(String str) {
        return (j90) Enum.valueOf(j90.class, str);
    }

    public static j90[] values() {
        return (j90[]) $VALUES.clone();
    }
}
