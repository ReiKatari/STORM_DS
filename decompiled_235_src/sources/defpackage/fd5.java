package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd5  reason: default package */
/* loaded from: classes.dex */
public final class fd5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ fd5[] $VALUES;
    public static final fd5 RUNTIME_RECONNECTED = new fd5("RUNTIME_RECONNECTED", 0);
    public static final fd5 PAUSE_MENU = new fd5("PAUSE_MENU", 1);
    public static final fd5 EXIT_DIALOG = new fd5("EXIT_DIALOG", 2);
    public static final fd5 BEFORE_ONLINE_SUBMISSION = new fd5("BEFORE_ONLINE_SUBMISSION", 3);

    private static final /* synthetic */ fd5[] $values() {
        return new fd5[]{RUNTIME_RECONNECTED, PAUSE_MENU, EXIT_DIALOG, BEFORE_ONLINE_SUBMISSION};
    }

    static {
        fd5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private fd5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static fd5 valueOf(String str) {
        return (fd5) Enum.valueOf(fd5.class, str);
    }

    public static fd5[] values() {
        return (fd5[]) $VALUES.clone();
    }
}
