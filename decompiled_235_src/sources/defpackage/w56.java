package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w56  reason: default package */
/* loaded from: classes.dex */
public final class w56 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ w56[] $VALUES;
    public static final w56 TopBar = new w56("TopBar", 0);
    public static final w56 MainContent = new w56("MainContent", 1);
    public static final w56 Snackbar = new w56("Snackbar", 2);
    public static final w56 Fab = new w56("Fab", 3);
    public static final w56 BottomBar = new w56("BottomBar", 4);

    private static final /* synthetic */ w56[] $values() {
        return new w56[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    static {
        w56[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private w56(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static w56 valueOf(String str) {
        return (w56) Enum.valueOf(w56.class, str);
    }

    public static w56[] values() {
        return (w56[]) $VALUES.clone();
    }
}
