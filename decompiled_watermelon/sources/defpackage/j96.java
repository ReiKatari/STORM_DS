package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j96  reason: default package */
/* loaded from: classes.dex */
public final class j96 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ j96[] $VALUES;
    public static final j96 MISSING_FROM_CURRENT_SET = new j96("MISSING_FROM_CURRENT_SET", 0);
    public static final j96 DEFINITION_CHANGED = new j96("DEFINITION_CHANGED", 1);
    public static final j96 NOT_IN_PREFETCH_CACHE = new j96("NOT_IN_PREFETCH_CACHE", 2);
    public static final j96 SERVER_REJECTED = new j96("SERVER_REJECTED", 3);

    private static final /* synthetic */ j96[] $values() {
        return new j96[]{MISSING_FROM_CURRENT_SET, DEFINITION_CHANGED, NOT_IN_PREFETCH_CACHE, SERVER_REJECTED};
    }

    static {
        j96[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private j96(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static j96 valueOf(String str) {
        return (j96) Enum.valueOf(j96.class, str);
    }

    public static j96[] values() {
        return (j96[]) $VALUES.clone();
    }
}
