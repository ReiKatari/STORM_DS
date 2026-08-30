package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g32  reason: default package */
/* loaded from: classes.dex */
public final class g32 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ g32[] $VALUES;
    public static final g32 REPLACE = new g32("REPLACE", 0);
    public static final g32 KEEP = new g32("KEEP", 1);
    public static final g32 APPEND = new g32("APPEND", 2);
    public static final g32 APPEND_OR_REPLACE = new g32("APPEND_OR_REPLACE", 3);

    private static final /* synthetic */ g32[] $values() {
        return new g32[]{REPLACE, KEEP, APPEND, APPEND_OR_REPLACE};
    }

    static {
        g32[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private g32(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static g32 valueOf(String str) {
        return (g32) Enum.valueOf(g32.class, str);
    }

    public static g32[] values() {
        return (g32[]) $VALUES.clone();
    }
}
