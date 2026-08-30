package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p74  reason: default package */
/* loaded from: classes.dex */
public final class p74 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ p74[] $VALUES;
    public static final p74 Min = new p74("Min", 0);
    public static final p74 Max = new p74("Max", 1);

    private static final /* synthetic */ p74[] $values() {
        return new p74[]{Min, Max};
    }

    static {
        p74[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private p74(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static p74 valueOf(String str) {
        return (p74) Enum.valueOf(p74.class, str);
    }

    public static p74[] values() {
        return (p74[]) $VALUES.clone();
    }
}
