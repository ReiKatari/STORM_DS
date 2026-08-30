package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g35  reason: default package */
/* loaded from: classes.dex */
public final class g35 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ g35[] $VALUES;
    public static final g35 START_SYNC = new g35("START_SYNC", 0);
    public static final g35 REOPEN_PAUSE_MENU = new g35("REOPEN_PAUSE_MENU", 1);

    private static final /* synthetic */ g35[] $values() {
        return new g35[]{START_SYNC, REOPEN_PAUSE_MENU};
    }

    static {
        g35[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private g35(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static g35 valueOf(String str) {
        return (g35) Enum.valueOf(g35.class, str);
    }

    public static g35[] values() {
        return (g35[]) $VALUES.clone();
    }
}
