package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l53  reason: default package */
/* loaded from: classes.dex */
public final class l53 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ l53[] $VALUES;
    public static final l53 IGNORED = new l53("IGNORED", 0);
    public static final l53 SCHEDULED = new l53("SCHEDULED", 1);
    public static final l53 DEFERRED = new l53("DEFERRED", 2);
    public static final l53 IMMINENT = new l53("IMMINENT", 3);

    private static final /* synthetic */ l53[] $values() {
        return new l53[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }

    static {
        l53[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private l53(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static l53 valueOf(String str) {
        return (l53) Enum.valueOf(l53.class, str);
    }

    public static l53[] values() {
        return (l53[]) $VALUES.clone();
    }
}
