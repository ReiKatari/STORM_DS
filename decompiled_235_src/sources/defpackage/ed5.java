package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed5  reason: default package */
/* loaded from: classes.dex */
public final class ed5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ed5[] $VALUES;
    public static final ed5 REOPEN_PAUSE_MENU = new ed5("REOPEN_PAUSE_MENU", 0);
    public static final ed5 RESUME_SESSION = new ed5("RESUME_SESSION", 1);
    public static final ed5 REOPEN_TERMINAL_EXIT = new ed5("REOPEN_TERMINAL_EXIT", 2);

    private static final /* synthetic */ ed5[] $values() {
        return new ed5[]{REOPEN_PAUSE_MENU, RESUME_SESSION, REOPEN_TERMINAL_EXIT};
    }

    static {
        ed5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ed5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ed5 valueOf(String str) {
        return (ed5) Enum.valueOf(ed5.class, str);
    }

    public static ed5[] values() {
        return (ed5[]) $VALUES.clone();
    }
}
