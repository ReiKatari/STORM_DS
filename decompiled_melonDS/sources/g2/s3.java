package g2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s3 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ s3[] $VALUES;
    public static final s3 TopBar = new s3("TopBar", 0);
    public static final s3 MainContent = new s3("MainContent", 1);
    public static final s3 Snackbar = new s3("Snackbar", 2);
    public static final s3 Fab = new s3("Fab", 3);
    public static final s3 BottomBar = new s3("BottomBar", 4);

    private static final /* synthetic */ s3[] $values() {
        return new s3[]{TopBar, MainContent, Snackbar, Fab, BottomBar};
    }

    static {
        s3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private s3(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static s3 valueOf(String str) {
        return (s3) Enum.valueOf(s3.class, str);
    }

    public static s3[] values() {
        return (s3[]) $VALUES.clone();
    }
}
