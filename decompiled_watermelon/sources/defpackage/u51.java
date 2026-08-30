package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u51  reason: default package */
/* loaded from: classes.dex */
public final class u51 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ u51[] $VALUES;
    public static final u51 NONE = new u51("NONE", 0);
    public static final u51 MAIN = new u51("MAIN", 1);
    public static final u51 IMPORT = new u51("IMPORT", 2);
    public static final u51 EXPORT = new u51("EXPORT", 3);

    private static final /* synthetic */ u51[] $values() {
        return new u51[]{NONE, MAIN, IMPORT, EXPORT};
    }

    static {
        u51[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private u51(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static u51 valueOf(String str) {
        return (u51) Enum.valueOf(u51.class, str);
    }

    public static u51[] values() {
        return (u51[]) $VALUES.clone();
    }
}
