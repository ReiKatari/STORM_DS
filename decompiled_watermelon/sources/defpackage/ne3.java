package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ne3  reason: default package */
/* loaded from: classes.dex */
public final class ne3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ne3[] $VALUES;
    public static final ne3 WIDTH = new ne3("WIDTH", 0);
    public static final ne3 HEIGHT = new ne3("HEIGHT", 1);

    private static final /* synthetic */ ne3[] $values() {
        return new ne3[]{WIDTH, HEIGHT};
    }

    static {
        ne3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ne3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ne3 valueOf(String str) {
        return (ne3) Enum.valueOf(ne3.class, str);
    }

    public static ne3[] values() {
        return (ne3[]) $VALUES.clone();
    }
}
