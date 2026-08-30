package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zl4  reason: default package */
/* loaded from: classes.dex */
public final class zl4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ zl4[] $VALUES;
    public static final zl4 RETRYABLE = new zl4("RETRYABLE", 0);
    public static final zl4 PERMANENT_FAILURE = new zl4("PERMANENT_FAILURE", 1);

    private static final /* synthetic */ zl4[] $values() {
        return new zl4[]{RETRYABLE, PERMANENT_FAILURE};
    }

    static {
        zl4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private zl4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static zl4 valueOf(String str) {
        return (zl4) Enum.valueOf(zl4.class, str);
    }

    public static zl4[] values() {
        return (zl4[]) $VALUES.clone();
    }
}
