package re;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SUCCESS = new b("SUCCESS", 0);
    public static final b NAND_NOT_OPEN = new b("NAND_NOT_OPEN", 1);
    public static final b ERROR_OPENING_FILE = new b("ERROR_OPENING_FILE", 2);
    public static final b NOT_DSIWARE_TITLE = new b("NOT_DSIWARE_TITLE", 3);
    public static final b TITLE_ALREADY_IMPORTED = new b("TITLE_ALREADY_IMPORTED", 4);
    public static final b INSATLL_FAILED = new b("INSATLL_FAILED", 5);
    public static final b METADATA_FETCH_FAILED = new b("METADATA_FETCH_FAILED", 6);
    public static final b UNKNOWN = new b("UNKNOWN", 7);

    private static final /* synthetic */ b[] $values() {
        return new b[]{SUCCESS, NAND_NOT_OPEN, ERROR_OPENING_FILE, NOT_DSIWARE_TITLE, TITLE_ALREADY_IMPORTED, INSATLL_FAILED, METADATA_FETCH_FAILED, UNKNOWN};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private b(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
