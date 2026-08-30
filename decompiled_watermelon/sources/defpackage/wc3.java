package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wc3  reason: default package */
/* loaded from: classes.dex */
public final class wc3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ wc3[] $VALUES;
    public static final wc3 SIZE = new wc3("SIZE", 0);
    public static final wc3 WIDTH = new wc3("WIDTH", 1);
    public static final wc3 HEIGHT = new wc3("HEIGHT", 2);

    private static final /* synthetic */ wc3[] $values() {
        return new wc3[]{SIZE, WIDTH, HEIGHT};
    }

    static {
        wc3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private wc3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static wc3 valueOf(String str) {
        return (wc3) Enum.valueOf(wc3.class, str);
    }

    public static wc3[] values() {
        return (wc3[]) $VALUES.clone();
    }
}
