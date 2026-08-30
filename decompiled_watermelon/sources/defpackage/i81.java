package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i81  reason: default package */
/* loaded from: classes.dex */
public final class i81 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ i81[] $VALUES;
    public static final i81 MEMORY_CACHE = new i81("MEMORY_CACHE", 0);
    public static final i81 MEMORY = new i81("MEMORY", 1);
    public static final i81 DISK = new i81("DISK", 2);
    public static final i81 NETWORK = new i81("NETWORK", 3);

    private static final /* synthetic */ i81[] $values() {
        return new i81[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }

    static {
        i81[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private i81(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static i81 valueOf(String str) {
        return (i81) Enum.valueOf(i81.class, str);
    }

    public static i81[] values() {
        return (i81[]) $VALUES.clone();
    }
}
