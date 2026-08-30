package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c32  reason: default package */
/* loaded from: classes.dex */
public final class c32 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ c32[] $VALUES;
    public static final c32 IGNORE = new c32("IGNORE", 0);
    public static final c32 RESPECT_PERFORMANCE = new c32("RESPECT_PERFORMANCE", 1);
    public static final c32 RESPECT_ALL = new c32("RESPECT_ALL", 2);

    private static final /* synthetic */ c32[] $values() {
        return new c32[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    static {
        c32[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private c32(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static c32 valueOf(String str) {
        return (c32) Enum.valueOf(c32.class, str);
    }

    public static c32[] values() {
        return (c32[]) $VALUES.clone();
    }
}
