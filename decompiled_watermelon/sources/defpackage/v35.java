package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v35  reason: default package */
/* loaded from: classes.dex */
public final class v35 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ v35[] $VALUES;
    public static final v35 RUNTIME_RECONNECTED = new v35("RUNTIME_RECONNECTED", 0);
    public static final v35 PAUSE_MENU = new v35("PAUSE_MENU", 1);
    public static final v35 EXIT_DIALOG = new v35("EXIT_DIALOG", 2);
    public static final v35 BEFORE_ONLINE_SUBMISSION = new v35("BEFORE_ONLINE_SUBMISSION", 3);

    private static final /* synthetic */ v35[] $values() {
        return new v35[]{RUNTIME_RECONNECTED, PAUSE_MENU, EXIT_DIALOG, BEFORE_ONLINE_SUBMISSION};
    }

    static {
        v35[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private v35(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static v35 valueOf(String str) {
        return (v35) Enum.valueOf(v35.class, str);
    }

    public static v35[] values() {
        return (v35[]) $VALUES.clone();
    }
}
