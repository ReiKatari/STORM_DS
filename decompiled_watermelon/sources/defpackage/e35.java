package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e35  reason: default package */
/* loaded from: classes.dex */
public final class e35 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ e35[] $VALUES;
    public static final e35 EXIT = new e35("EXIT", 0);
    public static final e35 KEEP_SESSION_OPEN = new e35("KEEP_SESSION_OPEN", 1);

    private static final /* synthetic */ e35[] $values() {
        return new e35[]{EXIT, KEEP_SESSION_OPEN};
    }

    static {
        e35[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private e35(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static e35 valueOf(String str) {
        return (e35) Enum.valueOf(e35.class, str);
    }

    public static e35[] values() {
        return (e35[]) $VALUES.clone();
    }
}
