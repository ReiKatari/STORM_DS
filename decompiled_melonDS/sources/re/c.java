package re;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c SUCCESS = new c("SUCCESS", 0);
    public static final c NAND_ALREADY_OPEN = new c("NAND_ALREADY_OPEN", 1);
    public static final c BIOS7_NOT_FOUND = new c("BIOS7_NOT_FOUND", 2);
    public static final c NAND_OPEN_FAILED = new c("NAND_OPEN_FAILED", 3);
    public static final c INVALID_DSI_SETUP = new c("INVALID_DSI_SETUP", 4);
    public static final c UNKNOWN = new c("UNKNOWN", 5);

    private static final /* synthetic */ c[] $values() {
        return new c[]{SUCCESS, NAND_ALREADY_OPEN, BIOS7_NOT_FOUND, NAND_OPEN_FAILED, INVALID_DSI_SETUP, UNKNOWN};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private c(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean isFailure() {
        if (this != SUCCESS && this != NAND_ALREADY_OPEN) {
            return true;
        }
        return false;
    }

    public final boolean isSuccess() {
        return !isFailure();
    }
}
