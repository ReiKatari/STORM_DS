package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: il5  reason: default package */
/* loaded from: classes.dex */
public final class il5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ il5[] $VALUES;
    public static final il5 MISSING_FROM_CURRENT_SET = new il5("MISSING_FROM_CURRENT_SET", 0);
    public static final il5 DEFINITION_CHANGED = new il5("DEFINITION_CHANGED", 1);
    public static final il5 NOT_IN_PREFETCH_CACHE = new il5("NOT_IN_PREFETCH_CACHE", 2);
    public static final il5 SERVER_REJECTED = new il5("SERVER_REJECTED", 3);

    private static final /* synthetic */ il5[] $values() {
        return new il5[]{MISSING_FROM_CURRENT_SET, DEFINITION_CHANGED, NOT_IN_PREFETCH_CACHE, SERVER_REJECTED};
    }

    static {
        il5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private il5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static il5 valueOf(String str) {
        return (il5) Enum.valueOf(il5.class, str);
    }

    public static il5[] values() {
        return (il5[]) $VALUES.clone();
    }
}
