package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm4  reason: default package */
/* loaded from: classes.dex */
public final class mm4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ mm4[] $VALUES;
    public static final mm4 SUCCESS = new mm4("SUCCESS", 0);
    public static final mm4 NAND_ALREADY_OPEN = new mm4("NAND_ALREADY_OPEN", 1);
    public static final mm4 BIOS7_NOT_FOUND = new mm4("BIOS7_NOT_FOUND", 2);
    public static final mm4 NAND_OPEN_FAILED = new mm4("NAND_OPEN_FAILED", 3);
    public static final mm4 INVALID_DSI_SETUP = new mm4("INVALID_DSI_SETUP", 4);
    public static final mm4 UNKNOWN = new mm4("UNKNOWN", 5);

    private static final /* synthetic */ mm4[] $values() {
        return new mm4[]{SUCCESS, NAND_ALREADY_OPEN, BIOS7_NOT_FOUND, NAND_OPEN_FAILED, INVALID_DSI_SETUP, UNKNOWN};
    }

    static {
        mm4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private mm4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static mm4 valueOf(String str) {
        return (mm4) Enum.valueOf(mm4.class, str);
    }

    public static mm4[] values() {
        return (mm4[]) $VALUES.clone();
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
