package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: su5  reason: default package */
/* loaded from: classes.dex */
public final class su5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ su5[] $VALUES;
    public static final su5 TopBar = new su5("TopBar", 0);
    public static final su5 MainContent = new su5("MainContent", 1);
    public static final su5 Snackbar = new su5("Snackbar", 2);
    public static final su5 Fab = new su5("Fab", 3);
    public static final su5 BottomBar = new su5("BottomBar", 4);

    private static final /* synthetic */ su5[] $values() {
        return new su5[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    static {
        su5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private su5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static su5 valueOf(String str) {
        return (su5) Enum.valueOf(su5.class, str);
    }

    public static su5[] values() {
        return (su5[]) $VALUES.clone();
    }
}
