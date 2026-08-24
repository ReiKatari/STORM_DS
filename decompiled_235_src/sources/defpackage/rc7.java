package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc7  reason: default package */
/* loaded from: classes.dex */
public final class rc7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ rc7[] $VALUES;
    public static final rc7 SUCCESSFUL = new rc7("SUCCESSFUL", 0);
    public static final rc7 REREGISTER = new rc7("REREGISTER", 1);
    public static final rc7 CANCELLED = new rc7("CANCELLED", 2);
    public static final rc7 ALREADY_SELECTED = new rc7("ALREADY_SELECTED", 3);

    private static final /* synthetic */ rc7[] $values() {
        return new rc7[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    static {
        rc7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private rc7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static rc7 valueOf(String str) {
        return (rc7) Enum.valueOf(rc7.class, str);
    }

    public static rc7[] values() {
        return (rc7[]) $VALUES.clone();
    }
}
