package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: px2  reason: default package */
/* loaded from: classes.dex */
public final class px2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ px2[] $VALUES;
    public static final px2 SUCCESS = new px2("SUCCESS", 0);
    public static final px2 NAND_NOT_OPEN = new px2("NAND_NOT_OPEN", 1);
    public static final px2 ERROR_OPENING_FILE = new px2("ERROR_OPENING_FILE", 2);
    public static final px2 NOT_DSIWARE_TITLE = new px2("NOT_DSIWARE_TITLE", 3);
    public static final px2 TITLE_ALREADY_IMPORTED = new px2("TITLE_ALREADY_IMPORTED", 4);
    public static final px2 TITLE_LIMIT_REACHED = new px2("TITLE_LIMIT_REACHED", 5);
    public static final px2 DSI_MEMORY_FULL = new px2("DSI_MEMORY_FULL", 6);
    public static final px2 INSATLL_FAILED = new px2("INSATLL_FAILED", 7);
    public static final px2 METADATA_FETCH_FAILED = new px2("METADATA_FETCH_FAILED", 8);
    public static final px2 UNKNOWN = new px2("UNKNOWN", 9);

    private static final /* synthetic */ px2[] $values() {
        return new px2[]{SUCCESS, NAND_NOT_OPEN, ERROR_OPENING_FILE, NOT_DSIWARE_TITLE, TITLE_ALREADY_IMPORTED, TITLE_LIMIT_REACHED, DSI_MEMORY_FULL, INSATLL_FAILED, METADATA_FETCH_FAILED, UNKNOWN};
    }

    static {
        px2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private px2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static px2 valueOf(String str) {
        return (px2) Enum.valueOf(px2.class, str);
    }

    public static px2[] values() {
        return (px2[]) $VALUES.clone();
    }
}
