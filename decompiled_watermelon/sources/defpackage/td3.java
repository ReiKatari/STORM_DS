package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: td3  reason: default package */
/* loaded from: classes.dex */
public final class td3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ td3[] $VALUES;
    public static final td3 BUILT_IN = new td3("BUILT_IN", 0);
    public static final td3 EXTERNAL = new td3("EXTERNAL", 1);

    private static final /* synthetic */ td3[] $values() {
        return new td3[]{BUILT_IN, EXTERNAL};
    }

    static {
        td3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private td3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static td3 valueOf(String str) {
        return (td3) Enum.valueOf(td3.class, str);
    }

    public static td3[] values() {
        return (td3[]) $VALUES.clone();
    }
}
