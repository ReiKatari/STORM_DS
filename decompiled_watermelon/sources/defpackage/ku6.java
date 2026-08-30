package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ku6  reason: default package */
/* loaded from: classes.dex */
public final class ku6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ku6[] $VALUES;
    public static final ku6 MISSING_FROM_CURRENT_SET = new ku6("MISSING_FROM_CURRENT_SET", 0);
    public static final ku6 DEFINITION_CHANGED = new ku6("DEFINITION_CHANGED", 1);
    public static final ku6 NOT_IN_PREFETCH_CACHE = new ku6("NOT_IN_PREFETCH_CACHE", 2);
    public static final ku6 SERVER_REJECTED = new ku6("SERVER_REJECTED", 3);

    private static final /* synthetic */ ku6[] $values() {
        return new ku6[]{MISSING_FROM_CURRENT_SET, DEFINITION_CHANGED, NOT_IN_PREFETCH_CACHE, SERVER_REJECTED};
    }

    static {
        ku6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ku6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ku6 valueOf(String str) {
        return (ku6) Enum.valueOf(ku6.class, str);
    }

    public static ku6[] values() {
        return (ku6[]) $VALUES.clone();
    }
}
