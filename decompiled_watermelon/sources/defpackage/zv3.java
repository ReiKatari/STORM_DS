package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zv3  reason: default package */
/* loaded from: classes.dex */
public final class zv3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ zv3[] $VALUES;
    public static final zv3 Min = new zv3("Min", 0);
    public static final zv3 Max = new zv3("Max", 1);

    private static final /* synthetic */ zv3[] $values() {
        return new zv3[]{Min, Max};
    }

    static {
        zv3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private zv3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static zv3 valueOf(String str) {
        return (zv3) Enum.valueOf(zv3.class, str);
    }

    public static zv3[] values() {
        return (zv3[]) $VALUES.clone();
    }
}
