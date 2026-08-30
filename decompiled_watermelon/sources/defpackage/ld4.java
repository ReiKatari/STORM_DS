package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ld4  reason: default package */
/* loaded from: classes.dex */
public final class ld4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ld4[] $VALUES;
    public static final ld4 SUCCESS = new ld4("SUCCESS", 0);
    public static final ld4 NAND_ALREADY_OPEN = new ld4("NAND_ALREADY_OPEN", 1);
    public static final ld4 BIOS7_NOT_FOUND = new ld4("BIOS7_NOT_FOUND", 2);
    public static final ld4 NAND_OPEN_FAILED = new ld4("NAND_OPEN_FAILED", 3);
    public static final ld4 INVALID_DSI_SETUP = new ld4("INVALID_DSI_SETUP", 4);
    public static final ld4 UNKNOWN = new ld4("UNKNOWN", 5);

    private static final /* synthetic */ ld4[] $values() {
        return new ld4[]{SUCCESS, NAND_ALREADY_OPEN, BIOS7_NOT_FOUND, NAND_OPEN_FAILED, INVALID_DSI_SETUP, UNKNOWN};
    }

    static {
        ld4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ld4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ld4 valueOf(String str) {
        return (ld4) Enum.valueOf(ld4.class, str);
    }

    public static ld4[] values() {
        return (ld4[]) $VALUES.clone();
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
