package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c35  reason: default package */
/* loaded from: classes.dex */
public final class c35 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ c35[] $VALUES;
    public static final c35 RESUMABLE_SESSION = new c35("RESUMABLE_SESSION", 0);
    public static final c35 TERMINAL_STOP = new c35("TERMINAL_STOP", 1);

    private static final /* synthetic */ c35[] $values() {
        return new c35[]{RESUMABLE_SESSION, TERMINAL_STOP};
    }

    static {
        c35[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private c35(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static c35 valueOf(String str) {
        return (c35) Enum.valueOf(c35.class, str);
    }

    public static c35[] values() {
        return (c35[]) $VALUES.clone();
    }
}
