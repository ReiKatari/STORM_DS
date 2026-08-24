package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui4  reason: default package */
/* loaded from: classes.dex */
public final class ui4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ui4[] $VALUES;
    public static final ui4 OK = new ui4("OK", 0);
    public static final ui4 EMPTY = new ui4("EMPTY", 1);
    public static final ui4 TAMPERED = new ui4("TAMPERED", 2);
    public static final ui4 SIGNING_KEY_INVALID = new ui4("SIGNING_KEY_INVALID", 3);
    public static final ui4 IO_ERROR = new ui4("IO_ERROR", 4);

    private static final /* synthetic */ ui4[] $values() {
        return new ui4[]{OK, EMPTY, TAMPERED, SIGNING_KEY_INVALID, IO_ERROR};
    }

    static {
        ui4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ui4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ui4 valueOf(String str) {
        return (ui4) Enum.valueOf(ui4.class, str);
    }

    public static ui4[] values() {
        return (ui4[]) $VALUES.clone();
    }
}
