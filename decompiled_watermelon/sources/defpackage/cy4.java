package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cy4  reason: default package */
/* loaded from: classes.dex */
public final class cy4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ cy4[] $VALUES;
    public static final cy4 CORE = new cy4("CORE", 0);
    public static final cy4 UNOFFICIAL = new cy4("UNOFFICIAL", 1);

    private static final /* synthetic */ cy4[] $values() {
        return new cy4[]{CORE, UNOFFICIAL};
    }

    static {
        cy4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private cy4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static cy4 valueOf(String str) {
        return (cy4) Enum.valueOf(cy4.class, str);
    }

    public static cy4[] values() {
        return (cy4[]) $VALUES.clone();
    }
}
