package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq2  reason: default package */
/* loaded from: classes.dex */
public final class kq2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ kq2[] $VALUES;
    public static final jq2 Companion;
    public static final kq2 PROTAGONIST_MALE = new kq2("PROTAGONIST_MALE", 0);
    public static final kq2 PROTAGONIST_FEMALE = new kq2("PROTAGONIST_FEMALE", 1);
    public static final kq2 HERO_DARK_VIGILANTE = new kq2("HERO_DARK_VIGILANTE", 2);
    public static final kq2 VILLAIN_BOSS = new kq2("VILLAIN_BOSS", 3);
    public static final kq2 VILLAIN_MANIC = new kq2("VILLAIN_MANIC", 4);
    public static final kq2 WISE_ELDER = new kq2("WISE_ELDER", 5);
    public static final kq2 YOUNG_BOY = new kq2("YOUNG_BOY", 6);
    public static final kq2 YOUNG_GIRL = new kq2("YOUNG_GIRL", 7);
    public static final kq2 ROYAL_QUEEN = new kq2("ROYAL_QUEEN", 8);
    public static final kq2 MERCHANT = new kq2("MERCHANT", 9);
    public static final kq2 SOLDIER = new kq2("SOLDIER", 10);
    public static final kq2 CYBORG_ROBOT = new kq2("CYBORG_ROBOT", 11);
    public static final kq2 NARRATOR = new kq2("NARRATOR", 12);
    public static final kq2 TSUNDERE = new kq2("TSUNDERE", 13);
    public static final kq2 WHISPER_MYSTERIOUS = new kq2("WHISPER_MYSTERIOUS", 14);
    public static final kq2 DEEP_DEMON = new kq2("DEEP_DEMON", 15);
    public static final kq2 CHEERFUL_FAIRY = new kq2("CHEERFUL_FAIRY", 16);
    public static final kq2 PIRATE = new kq2("PIRATE", 17);
    public static final kq2 MAD_SCIENTIST = new kq2("MAD_SCIENTIST", 18);
    public static final kq2 GENTLEMAN_SCHOLAR = new kq2("GENTLEMAN_SCHOLAR", 19);
    public static final kq2 GHOST_ETHEREAL = new kq2("GHOST_ETHEREAL", 20);
    public static final kq2 KNIGHT_WARRIOR = new kq2("KNIGHT_WARRIOR", 21);
    public static final kq2 COMEDY_GOOFY = new kq2("COMEDY_GOOFY", 22);
    public static final kq2 ANGELIC_DIVINE = new kq2("ANGELIC_DIVINE", 23);

    private static final /* synthetic */ kq2[] $values() {
        return new kq2[]{PROTAGONIST_MALE, PROTAGONIST_FEMALE, HERO_DARK_VIGILANTE, VILLAIN_BOSS, VILLAIN_MANIC, WISE_ELDER, YOUNG_BOY, YOUNG_GIRL, ROYAL_QUEEN, MERCHANT, SOLDIER, CYBORG_ROBOT, NARRATOR, TSUNDERE, WHISPER_MYSTERIOUS, DEEP_DEMON, CHEERFUL_FAIRY, PIRATE, MAD_SCIENTIST, GENTLEMAN_SCHOLAR, GHOST_ETHEREAL, KNIGHT_WARRIOR, COMEDY_GOOFY, ANGELIC_DIVINE};
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, jq2] */
    static {
        kq2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private kq2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static kq2 valueOf(String str) {
        return (kq2) Enum.valueOf(kq2.class, str);
    }

    public static kq2[] values() {
        return (kq2[]) $VALUES.clone();
    }
}
