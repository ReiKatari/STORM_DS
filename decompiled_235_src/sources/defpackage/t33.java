package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t33  reason: default package */
/* loaded from: classes.dex */
public final class t33 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ t33[] $VALUES;
    public static final t33 SUCCESS = new t33("SUCCESS", 0);
    public static final t33 NAND_NOT_OPEN = new t33("NAND_NOT_OPEN", 1);
    public static final t33 ERROR_OPENING_FILE = new t33("ERROR_OPENING_FILE", 2);
    public static final t33 NOT_DSIWARE_TITLE = new t33("NOT_DSIWARE_TITLE", 3);
    public static final t33 TITLE_ALREADY_IMPORTED = new t33("TITLE_ALREADY_IMPORTED", 4);
    public static final t33 TITLE_LIMIT_REACHED = new t33("TITLE_LIMIT_REACHED", 5);
    public static final t33 DSI_MEMORY_FULL = new t33("DSI_MEMORY_FULL", 6);
    public static final t33 INSATLL_FAILED = new t33("INSATLL_FAILED", 7);
    public static final t33 METADATA_FETCH_FAILED = new t33("METADATA_FETCH_FAILED", 8);
    public static final t33 UNKNOWN = new t33("UNKNOWN", 9);

    private static final /* synthetic */ t33[] $values() {
        return new t33[]{SUCCESS, NAND_NOT_OPEN, ERROR_OPENING_FILE, NOT_DSIWARE_TITLE, TITLE_ALREADY_IMPORTED, TITLE_LIMIT_REACHED, DSI_MEMORY_FULL, INSATLL_FAILED, METADATA_FETCH_FAILED, UNKNOWN};
    }

    static {
        t33[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private t33(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static t33 valueOf(String str) {
        return (t33) Enum.valueOf(t33.class, str);
    }

    public static t33[] values() {
        return (t33[]) $VALUES.clone();
    }
}
